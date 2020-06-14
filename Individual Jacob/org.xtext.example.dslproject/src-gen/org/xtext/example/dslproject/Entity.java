/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.dslproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.Entity#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dslproject.DslprojectPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Agent
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.dslproject.DslprojectPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.dslproject.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Example</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.dslproject.EntityExample}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Example</em>' containment reference list.
   * @see org.xtext.example.dslproject.DslprojectPackage#getEntity_Example()
   * @model containment="true"
   * @generated
   */
  EList<EntityExample> getExample();

} // Entity
