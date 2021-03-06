/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.generator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.dslproject.Entity
import org.xtext.example.dslproject.Intent
import org.xtext.example.dslproject.Reference
import org.xtext.example.dslproject.Training
import org.xtext.example.dslproject.TrainingInput
import org.xtext.example.dslproject.Sin
import org.xtext.example.dslproject.Decl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslprojectGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(Entity).forEach[generateEntityFile(fsa)]			
		resource.allContents.filter(Intent).forEach[generateIntentFile(fsa)]	
	}
	
	def generateEntityFile(Entity entity, IFileSystemAccess2 fsa) {
		fsa.generateFile(entity.name + "_entries_en.json",entity.generateEntityEntries)
		fsa.generateFile(entity.name + ".json", entity.generateEntity)
	}
	
	def generateIntentFile(Intent intent, IFileSystemAccess2 fsa) {
		fsa.generateFile(intent.name + ".json", intent.generateIntent)
		
		fsa.generateFile(intent.name + "_usersays_en.json", intent.training.generateTrainingPhrases)
	}
	
	def CharSequence generateIntent(Intent intent)
		'''
		{
		"id": "«36.generateId»",
		"name": "«intent.name»",
		"auto": true,
		«if (intent.isFollowup !== null) {
			'''"contexts": [
			    "«intent.isFollowup.intent.name»-followup"
			  ],
			  "responses": [
			  					{
			  					"resetContexts": false,
			  					"action": "",
			  					"affectedContexts":[],'''
		} else if (intent.hasFollowup !== null) {
			'''
			"contexts": [],
			"responses": [
					{
					"resetContexts": false,
					"affectedContexts": [
			        {
			          "name": "«intent.name»-followup",
			          "parameters": {},
			          "lifespan": 2
			        }
			        ],
			        '''     
		}»
			"parameters": [
		«FOR parameter: intent.question»
		{ 
		          "required": «if( parameter.required === null ) '''false,''' else '''true,'''»
		          "dataType": "@«if (parameter.questionEntity.withEntity.sysvar !== null) '''sys.'''»«parameter.questionEntity.withEntity.getEntityType»",
		          "name": "«parameter.questionEntity.withEntity.getEntityType»",
		          "value": "$«parameter.questionEntity.withEntity.getEntityType»",
		          "prompts": [
		              "«parameter.prompt»"
		          ],
		          "promptMessages": [],
		          "noMatchPromptMessages": [],
		          "noInputPromptMessages": [],
		          "outputDialogContexts": [],
		          "isList": false,
		          "defaultValue": ""
		          
		        «IF (intent.question.indexOf(parameter) !== intent.question.length - 1)» 
		        },
		        «ELSE»
		        }
		        «ENDIF»
		«ENDFOR»
		],
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
		
	def CharSequence generateFollowupIntent(Intent intent) '''
	'''
	
	def CharSequence generateRegularIntent(Intent intent) '''
	'''
		
	
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
