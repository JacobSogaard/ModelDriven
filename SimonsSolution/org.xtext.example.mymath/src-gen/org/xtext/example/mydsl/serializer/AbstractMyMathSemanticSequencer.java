/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myMath.Add;
import org.xtext.example.mydsl.myMath.Div;
import org.xtext.example.mydsl.myMath.MathExp;
import org.xtext.example.mydsl.myMath.Mult;
import org.xtext.example.mydsl.myMath.MyMathPackage;
import org.xtext.example.mydsl.myMath.Num;
import org.xtext.example.mydsl.myMath.Sub;
import org.xtext.example.mydsl.services.MyMathGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyMathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyMathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyMathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyMathPackage.ADD:
				sequence_Exp(context, (Add) semanticObject); 
				return; 
			case MyMathPackage.DIV:
				sequence_Factor(context, (Div) semanticObject); 
				return; 
			case MyMathPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MyMathPackage.MULT:
				sequence_Factor(context, (Mult) semanticObject); 
				return; 
			case MyMathPackage.NUM:
				sequence_Number(context, (Num) semanticObject); 
				return; 
			case MyMathPackage.SUB:
				sequence_Exp(context, (Sub) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Exp returns Add
	 *     Exp.Add_1_0_0_1 returns Add
	 *     Exp.Sub_1_0_1_1 returns Add
	 *     Factor returns Add
	 *     Factor.Mult_1_0_0_1 returns Add
	 *     Factor.Div_1_0_1_1 returns Add
	 *     Primary returns Add
	 *     Parenthesis returns Add
	 *
	 * Constraint:
	 *     (left=Exp_Add_1_0_0_1 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.ADD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.ADD__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.ADD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.ADD__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Sub
	 *     Exp.Add_1_0_0_1 returns Sub
	 *     Exp.Sub_1_0_1_1 returns Sub
	 *     Factor returns Sub
	 *     Factor.Mult_1_0_0_1 returns Sub
	 *     Factor.Div_1_0_1_1 returns Sub
	 *     Primary returns Sub
	 *     Parenthesis returns Sub
	 *
	 * Constraint:
	 *     (left=Exp_Sub_1_0_1_1 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Sub semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.SUB__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.SUB__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Add_1_0_0_1 returns Div
	 *     Exp.Sub_1_0_1_1 returns Div
	 *     Factor returns Div
	 *     Factor.Mult_1_0_0_1 returns Div
	 *     Factor.Div_1_0_1_1 returns Div
	 *     Primary returns Div
	 *     Parenthesis returns Div
	 *
	 * Constraint:
	 *     (left=Factor_Div_1_0_1_1 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Add_1_0_0_1 returns Mult
	 *     Exp.Sub_1_0_1_1 returns Mult
	 *     Factor returns Mult
	 *     Factor.Mult_1_0_0_1 returns Mult
	 *     Factor.Div_1_0_1_1 returns Mult
	 *     Primary returns Mult
	 *     Parenthesis returns Mult
	 *
	 * Constraint:
	 *     (left=Factor_Mult_1_0_0_1 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Num
	 *     Exp.Add_1_0_0_1 returns Num
	 *     Exp.Sub_1_0_1_1 returns Num
	 *     Factor returns Num
	 *     Factor.Mult_1_0_0_1 returns Num
	 *     Factor.Div_1_0_1_1 returns Num
	 *     Primary returns Num
	 *     Parenthesis returns Num
	 *     Number returns Num
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, Num semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyMathPackage.Literals.NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyMathPackage.Literals.NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}