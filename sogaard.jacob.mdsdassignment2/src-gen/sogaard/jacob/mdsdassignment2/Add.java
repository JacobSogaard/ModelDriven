/**
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.mdsdassignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Add#getLeft <em>Left</em>}</li>
 *   <li>{@link sogaard.jacob.mdsdassignment2.Add#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getAdd()
 * @model
 * @generated
 */
public interface Add extends ExpOp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ExpOp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getAdd_Left()
   * @model containment="true"
   * @generated
   */
  ExpOp getLeft();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Add#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ExpOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ExpOp)
   * @see sogaard.jacob.mdsdassignment2.Mdsdassignment2Package#getAdd_Right()
   * @model containment="true"
   * @generated
   */
  ExpOp getRight();

  /**
   * Sets the value of the '{@link sogaard.jacob.mdsdassignment2.Add#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ExpOp value);

} // Add
