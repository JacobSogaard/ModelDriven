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
import org.xtext.example.dslproject.Entity;
import org.xtext.example.dslproject.Reference;
import org.xtext.example.dslproject.Sysvariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.impl.ReferenceImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.ReferenceImpl#getSysvar <em>Sysvar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The cached value of the '{@link #getSysvar() <em>Sysvar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSysvar()
   * @generated
   * @ordered
   */
  protected Sysvariable sysvar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
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
    return DslprojectPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslprojectPackage.REFERENCE__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.REFERENCE__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sysvariable getSysvar()
  {
    return sysvar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSysvar(Sysvariable newSysvar, NotificationChain msgs)
  {
    Sysvariable oldSysvar = sysvar;
    sysvar = newSysvar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslprojectPackage.REFERENCE__SYSVAR, oldSysvar, newSysvar);
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
  public void setSysvar(Sysvariable newSysvar)
  {
    if (newSysvar != sysvar)
    {
      NotificationChain msgs = null;
      if (sysvar != null)
        msgs = ((InternalEObject)sysvar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.REFERENCE__SYSVAR, null, msgs);
      if (newSysvar != null)
        msgs = ((InternalEObject)newSysvar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.REFERENCE__SYSVAR, null, msgs);
      msgs = basicSetSysvar(newSysvar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.REFERENCE__SYSVAR, newSysvar, newSysvar));
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
      case DslprojectPackage.REFERENCE__SYSVAR:
        return basicSetSysvar(null, msgs);
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
      case DslprojectPackage.REFERENCE__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case DslprojectPackage.REFERENCE__SYSVAR:
        return getSysvar();
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
      case DslprojectPackage.REFERENCE__ENTITY:
        setEntity((Entity)newValue);
        return;
      case DslprojectPackage.REFERENCE__SYSVAR:
        setSysvar((Sysvariable)newValue);
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
      case DslprojectPackage.REFERENCE__ENTITY:
        setEntity((Entity)null);
        return;
      case DslprojectPackage.REFERENCE__SYSVAR:
        setSysvar((Sysvariable)null);
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
      case DslprojectPackage.REFERENCE__ENTITY:
        return entity != null;
      case DslprojectPackage.REFERENCE__SYSVAR:
        return sysvar != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceImpl
