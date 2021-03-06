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
import org.xtext.example.dslproject.Question;
import org.xtext.example.dslproject.QuestionEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dslproject.impl.QuestionImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.QuestionImpl#getQuestionEntity <em>Question Entity</em>}</li>
 *   <li>{@link org.xtext.example.dslproject.impl.QuestionImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
{
  /**
   * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected static final String REQUIRED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected String required = REQUIRED_EDEFAULT;

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
   * The cached value of the '{@link #getQuestionEntity() <em>Question Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionEntity()
   * @generated
   * @ordered
   */
  protected QuestionEntity questionEntity;

  /**
   * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected static final String PROMPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected String prompt = PROMPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return DslprojectPackage.Literals.QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequired(String newRequired)
  {
    String oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION__REQUIRED, oldRequired, required));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuestionEntity getQuestionEntity()
  {
    return questionEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestionEntity(QuestionEntity newQuestionEntity, NotificationChain msgs)
  {
    QuestionEntity oldQuestionEntity = questionEntity;
    questionEntity = newQuestionEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION__QUESTION_ENTITY, oldQuestionEntity, newQuestionEntity);
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
  public void setQuestionEntity(QuestionEntity newQuestionEntity)
  {
    if (newQuestionEntity != questionEntity)
    {
      NotificationChain msgs = null;
      if (questionEntity != null)
        msgs = ((InternalEObject)questionEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.QUESTION__QUESTION_ENTITY, null, msgs);
      if (newQuestionEntity != null)
        msgs = ((InternalEObject)newQuestionEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslprojectPackage.QUESTION__QUESTION_ENTITY, null, msgs);
      msgs = basicSetQuestionEntity(newQuestionEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION__QUESTION_ENTITY, newQuestionEntity, newQuestionEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrompt()
  {
    return prompt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrompt(String newPrompt)
  {
    String oldPrompt = prompt;
    prompt = newPrompt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslprojectPackage.QUESTION__PROMPT, oldPrompt, prompt));
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
      case DslprojectPackage.QUESTION__QUESTION_ENTITY:
        return basicSetQuestionEntity(null, msgs);
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
      case DslprojectPackage.QUESTION__REQUIRED:
        return getRequired();
      case DslprojectPackage.QUESTION__NAME:
        return getName();
      case DslprojectPackage.QUESTION__QUESTION_ENTITY:
        return getQuestionEntity();
      case DslprojectPackage.QUESTION__PROMPT:
        return getPrompt();
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
      case DslprojectPackage.QUESTION__REQUIRED:
        setRequired((String)newValue);
        return;
      case DslprojectPackage.QUESTION__NAME:
        setName((String)newValue);
        return;
      case DslprojectPackage.QUESTION__QUESTION_ENTITY:
        setQuestionEntity((QuestionEntity)newValue);
        return;
      case DslprojectPackage.QUESTION__PROMPT:
        setPrompt((String)newValue);
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
      case DslprojectPackage.QUESTION__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case DslprojectPackage.QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslprojectPackage.QUESTION__QUESTION_ENTITY:
        setQuestionEntity((QuestionEntity)null);
        return;
      case DslprojectPackage.QUESTION__PROMPT:
        setPrompt(PROMPT_EDEFAULT);
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
      case DslprojectPackage.QUESTION__REQUIRED:
        return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
      case DslprojectPackage.QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslprojectPackage.QUESTION__QUESTION_ENTITY:
        return questionEntity != null;
      case DslprojectPackage.QUESTION__PROMPT:
        return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
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
    result.append(" (required: ");
    result.append(required);
    result.append(", name: ");
    result.append(name);
    result.append(", prompt: ");
    result.append(prompt);
    result.append(')');
    return result.toString();
  }

} //QuestionImpl
