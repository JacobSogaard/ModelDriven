/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.dslproject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.FollowRelation#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.FollowRelation#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dslproject.DslprojectPackage#getFollowRelation()
 * @model
 * @generated
 */
public interface FollowRelation extends Agent
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Intent)
   * @see org.xtext.example.dslproject.DslprojectPackage#getFollowRelation_Parent()
   * @model
   * @generated
   */
  Intent getParent();

  /**
   * Sets the value of the '{@link org.xtext.example.dslproject.FollowRelation#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Intent value);

  /**
   * Returns the value of the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' reference.
   * @see #setChild(Intent)
   * @see org.xtext.example.dslproject.DslprojectPackage#getFollowRelation_Child()
   * @model
   * @generated
   */
  Intent getChild();

  /**
   * Sets the value of the '{@link org.xtext.example.dslproject.FollowRelation#getChild <em>Child</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' reference.
   * @see #getChild()
   * @generated
   */
  void setChild(Intent value);

} // FollowRelation
