/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.dslproject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.dslproject.DslprojectPackage;
import org.xtext.example.dslproject.QuestionEntity;
import org.xtext.example.dslproject.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.impl.QuestionEntityImpl#getWithEntity <em>With Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionEntityImpl extends MinimalEObjectImpl.Container implements QuestionEntity
{
  /**
   * The cached value of the '{@link #getWithEntity() <em>With Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithEntity()
   * @generated
   * @ordered
   */
  protected Reference withEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionEntityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslprojectPackage.Literals.QUESTION_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference getWithEntity()
  {
    return withEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithEntity(Reference newWithEntity, NotificationChain msgs)
  {
    Reference oldWithEntity = withEntity;
    withEntity = newWithEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY, oldWithEntity, newWithEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWithEntity(Reference newWithEntity)
  {
    if (newWithEntity != withEntity)
    {
      NotificationChain msgs = null;
      if (withEntity != null)
        msgs = ((InternalEObject)withEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY, null, msgs);
      if (newWithEntity != null)
        msgs = ((InternalEObject)newWithEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY, null, msgs);
      msgs = basicSetWithEntity(newWithEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY, newWithEntity, newWithEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY:
        return basicSetWithEntity(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY:
        return getWithEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY:
        setWithEntity((Reference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY:
        setWithEntity((Reference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslprojectPackage.QUESTION_ENTITY__WITH_ENTITY:
        return withEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //QuestionEntityImpl
