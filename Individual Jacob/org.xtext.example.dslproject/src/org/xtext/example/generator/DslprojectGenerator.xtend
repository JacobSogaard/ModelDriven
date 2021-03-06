/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.generator

import java.util.HashSet
import java.util.Iterator
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.dslproject.Decl
import org.xtext.example.dslproject.Entity
import org.xtext.example.dslproject.FollowRelation
import org.xtext.example.dslproject.Intent
import org.xtext.example.dslproject.Reference
import org.xtext.example.dslproject.Sin
import org.xtext.example.dslproject.Training
import org.xtext.example.dslproject.TrainingInput
import org.eclipse.xtend.lib.annotations.Data
import org.xtext.example.dslproject.QuestionRef

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslprojectGenerator extends AbstractGenerator {

	var Set<IntentInformation> intentInformation
	var Set<IntentRelationInformation> intentRelationInformation

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		intentInformation = resource.allContents.filter(Intent).collectIntentInformation
		intentRelationInformation = resource.allContents.filter(FollowRelation).collectIntentRelationInformation
		resource.allContents.filter(Entity).forEach[generateEntityFile(fsa)]			
		intentInformation.forEach[generateIntentFile(fsa)]	
	}
	
	def generateEntityFile(Entity entity, IFileSystemAccess2 fsa) {
		fsa.generateFile(entity.name + "_entries_en.json",entity.generateEntityEntries)
		fsa.generateFile(entity.name + ".json", entity.generateEntity)
	}
	
	def generateIntentFile(IntentInformation intent, IFileSystemAccess2 fsa) {
		fsa.generateFile(intent.name + ".json", intent.generateIntent)
		fsa.generateFile(intent.name + "_usersays_en.json", intent.training.generateTrainingPhrases)
	}
	
	
	
	def generateRelationQuestions(IntentInformation ri)'''
	"parameters": [
	«ri.intent.question.generateQuestions»
	«IF ri.superintent !== null»
		«ri.superintent.question.generateQuestions»
	«ENDIF»
	],
	'''
	
	def generateRelationTraining(IntentInformation ri)'''
	'''
		
	def generateQuestions(EList<QuestionRef> questions)'''
			«FOR parameter: questions»
				«var question = parameter.question ?: parameter.superQuestion.superQuestion»
				{ 
				          "required": «if( question.required === null ) '''false,''' else '''true,'''»
				          "dataType": "@«if (question.questionEntity.withEntity.sysvar !== null) '''sys.'''»«question.questionEntity.withEntity.getEntityType»",
				          "name": "«question.questionEntity.withEntity.getEntityType»",
				          "value": "$«question.questionEntity.withEntity.getEntityType»",
				          "prompts": [
				              "«question.prompt»"
				          ],
				          "promptMessages": [],
				          "noMatchPromptMessages": [],
				          "noInputPromptMessages": [],
				          "outputDialogContexts": [],
				          "isList": false,
				          "defaultValue": ""
				          
				        «IF (questions.indexOf(parameter) !== questions.length - 1)» 
				        },
				        «ELSE»
				        }
				        «ENDIF»
			«ENDFOR»
			
			
	'''
	
	def CharSequence generateIntent(IntentInformation ri)
		'''
		{
		"id": "«36.generateId»",
		"name": "«ri.name»",
		"auto": true,
		«FOR relation: intentRelationInformation»
			«if (relation.childIntent == ri.intent) {
				'''"contexts": [
			    "«relation.parentIntent.name»-followup"
			  ],
			  "responses": [
			  					{
			  					"resetContexts": false,
			  					"action": "",
			  					"affectedContexts":[],'''
			}»
			
		«ENDFOR»
		«ri.generateRelationQuestions»
		
		      "messages": [
		        {
		          "type": 0,
		          "lang": "en",
		          "condition": "",
		          "speech": []
		        }
		      ],
		      "defaultResponsePlatforms": {},
		      "speech": []
		    }
		  ],
		  "priority": 500000,
		  "webhookUsed": true,
		  "webhookForSlotFilling": false,
		  "fallbackIntent": false,
		  "events": [],
		  "conditionalResponses": [],
		  "condition": "",
		  "conditionalFollowupEvents": []
		}
		'''
		
	def CharSequence generateTrainingPhrases(Training training) '''
	[
		«FOR train: training.trainingref»
		{
			"id": "«36.generateId»",
			    "data": [
			«FOR in: train.input»
				«in.generateTrainingInput»
			«ENDFOR»
		
		],
		"isTemplate": false,
		    "count": 0,
		    "updated": 0
		    },
		  «ENDFOR»
	]
	'''
	
	def CharSequence generateTrainingInput(TrainingInput input){
		switch input {
			Sin: '''{
				"text": " «input.s» ",
				"userDefined": false
			},'''
			Decl: '''{
				"text": "«input.declarations.trainingstring»",
				"alias": "«input.declarations.reference.getEntityType»",
				"meta": "@«input.declarations.reference.getEntityType»",
				"userDefined": false
			},'''
			default: ''''''
		}
	}
		
	
	def String getEntityType(Reference ref) {
		if (ref.entity !== null)
			ref.entity.name
		else if (ref.sysvar !== null)
			ref.sysvar.value
	}
	
	def CharSequence generateEntityEntries(Entity entity) '''
	[
	«FOR example: entity.example»
	  {
	    "value": "«example.name»",
	    "synonyms": [
	      ""
	    ]
	  },
	«ENDFOR»
	]
	'''
	
	
	def CharSequence generateEntity(Entity entity) '''
	{
	  "id": "«36.generateId»",
	  "name": "«entity.name»",
	  "isOverridable": true,
	  "isEnum": false,
	  "isRegexp": false,
	  "automatedExpansion": false,
	  "allowFuzzyExtraction": true
	}
	'''
	
	
	//All the stuff we use!
	@Data
	static class IntentInformation {
		String name
		Intent intent
		Intent superintent
		EList<QuestionRef> question 
		Training training
	}
	
	@Data
	static class IntentRelationInformation {
		Intent parentIntent
		Intent childIntent
	}
	
	
	def Set<IntentInformation> collectIntentInformation(Iterator<Intent> intents) {
		val result = new HashSet<IntentInformation>
		intents.forEach[intent | result.add(new IntentInformation(intent.name, intent, intent.zuper, intent.question, intent.training)
			)]
		result
	}
	
	def Set<IntentRelationInformation> collectIntentRelationInformation(Iterator<FollowRelation> relations) {
		val result = new HashSet<IntentRelationInformation>
		relations.forEach[relation | result.add(new IntentRelationInformation(relation.parent, relation.child))]
		result	
	}
	
	val ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvxyz0123456789-"
	def String generateId(int count) {
		var c = count
    	var id = ""
    	while (c-- != 0) {
        	val character = (Math.random() * ALPHA_NUMERIC_STRING.length).intValue
        	id += (ALPHA_NUMERIC_STRING.charAt(character))
    }
   		id
	}	
}