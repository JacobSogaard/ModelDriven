/**
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.mdsdassignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Parenthesis#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends ExpOp
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getParenthesis_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Parenthesis#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // Parenthesis
