/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.dslproject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.dslproject.DslprojectPackage;
import org.xtext.example.dslproject.Intent;
import org.xtext.example.dslproject.QuestionRef;
import org.xtext.example.dslproject.Training;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.impl.IntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.IntentImpl#getZuper <em>Zuper</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.IntentImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.IntentImpl#getTraining <em>Training</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentImpl extends AgentImpl implements Intent
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getZuper() <em>Zuper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZuper()
   * @generated
   * @ordered
   */
  protected Intent zuper;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected EList<QuestionRef> question;

  /**
   * The cached value of the '{@link #getTraining() <em>Training</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraining()
   * @generated
   * @ordered
   */
  protected Training training;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentImpl()
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
    return DslprojectPackage.Literals.INTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.INTENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Intent getZuper()
  {
    if (zuper != null && zuper.eIsProxy())
    {
      InternalEObject oldZuper = (InternalEObject)zuper;
      zuper = (Intent)eResolveProxy(oldZuper);
      if (zuper != oldZuper)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslprojectPackage.INTENT__ZUPER, oldZuper, zuper));
      }
    }
    return zuper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent basicGetZuper()
  {
    return zuper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setZuper(Intent newZuper)
  {
    Intent oldZuper = zuper;
    zuper = newZuper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.INTENT__ZUPER, oldZuper, zuper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<QuestionRef> getQuestion()
  {
    if (question == null)
    {
      question = new EObjectContainmentEList<QuestionRef>(QuestionRef.class, this, DslprojectPackage.INTENT__QUESTION);
    }
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Training getTraining()
  {
    return training;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraining(Training newTraining, NotificationChain msgs)
  {
    Training oldTraining = training;
    training = newTraining;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslprojectPackage.INTENT__TRAINING, oldTraining, newTraining);
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
  public void setTraining(Training newTraining)
  {
    if (newTraining != training)
    {
      NotificationChain msgs = null;
      if (training != null)
        msgs = ((InternalEObject)training).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.INTENT__TRAINING, null, msgs);
      if (newTraining != null)
        msgs = ((InternalEObject)newTraining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.INTENT__TRAINING, null, msgs);
      msgs = basicSetTraining(newTraining, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.INTENT__TRAINING, newTraining, newTraining));
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
      case DslprojectPackage.INTENT__QUESTION:
        return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
      case DslprojectPackage.INTENT__TRAINING:
        return basicSetTraining(null, msgs);
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
      case DslprojectPackage.INTENT__NAME:
        return getName();
      case DslprojectPackage.INTENT__ZUPER:
        if (resolve) return getZuper();
        return basicGetZuper();
      case DslprojectPackage.INTENT__QUESTION:
        return getQuestion();
      case DslprojectPackage.INTENT__TRAINING:
        return getTraining();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslprojectPackage.INTENT__NAME:
        setName((String)newValue);
        return;
      case DslprojectPackage.INTENT__ZUPER:
        setZuper((Intent)newValue);
        return;
      case DslprojectPackage.INTENT__QUESTION:
        getQuestion().clear();
        getQuestion().addAll((Collection<? extends QuestionRef>)newValue);
        return;
      case DslprojectPackage.INTENT__TRAINING:
        setTraining((Training)newValue);
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
      case DslprojectPackage.INTENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslprojectPackage.INTENT__ZUPER:
        setZuper((Intent)null);
        return;
      case DslprojectPackage.INTENT__QUESTION:
        getQuestion().clear();
        return;
      case DslprojectPackage.INTENT__TRAINING:
        setTraining((Training)null);
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
      case DslprojectPackage.INTENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslprojectPackage.INTENT__ZUPER:
        return zuper != null;
      case DslprojectPackage.INTENT__QUESTION:
        return question != null && !question.isEmpty();
      case DslprojectPackage.INTENT__TRAINING:
        return training != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IntentImpl