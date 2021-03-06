/**
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.mdsdassignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Exp#getLeft <em>Left</em>}</li>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Exp#getOperator <em>Operator</em>}</li>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Exp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getExp()
 * @model
 * @generated
 */
public interface Exp extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ExpOp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getExp_Left()
   * @model containment="true"
   * @generated
   */
  ExpOp getLeft();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ExpOp value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(ExpOp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getExp_Operator()
   * @model containment="true"
   * @generated
   */
  ExpOp getOperator();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Exp#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(ExpOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getExp_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Exp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // Exp
