/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.scoping;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.dslproject.Agent;
import org.xtext.example.dslproject.DslprojectPackage;
import org.xtext.example.dslproject.DslprojectPackage.Literals;
import org.xtext.example.dslproject.Intent;
import org.xtext.example.dslproject.Model;
import org.xtext.example.dslproject.Question;
import org.xtext.example.dslproject.QuestionRef;
import org.xtext.example.dslproject.SuperQuestion;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 * TODO Understanding scope and maybe change so it fits.     
 */
public class DslprojectScopeProvider extends AbstractDslprojectScopeProvider {
	
	 @Override
	    public IScope getScope(EObject context, EReference reference) {
	        
		 	//Adds all intents to the candidates list
		 	if (context instanceof Intent
	                && reference == DslprojectPackage.Literals.INTENT__ZUPER) {
	            Model model = (Model) context.eContainer();
	            ArrayList<Intent> candidates = new ArrayList<Intent>();
	            for(Agent agent : model.getAgent()) {
	            	if(agent instanceof Intent) {
	            		if(((Intent) agent) != ((Intent)context) ) {
	            			candidates.add(((Intent)agent));
	            		}
	            	}
	            }

	            return Scopes.scopeFor(candidates);
	        }
	        
	       else if (context instanceof SuperQuestion
	                && reference == DslprojectPackage.Literals.SUPER_QUESTION__SUPER_QUESTION) {
	        	QuestionRef q = (QuestionRef) context.eContainer();
	        	Intent intent = (Intent) q.eContainer();
	        	intent = intent.getZuper();
	        	ArrayList<Question> candidates = new ArrayList<Question>();
	        	if(intent!=null) {
	        		for(QuestionRef question: intent.getQuestion()) { 
	        				candidates.add(question.getQuestion());
	        		}
	        	}
	        	return Scopes.scopeFor(candidates);
	        	}
	        return super.getScope(context, reference);
	    }


}
