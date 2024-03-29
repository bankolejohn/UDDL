/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.ConceptualParticipant;
import com.epistimis.uddl.uddl.LogicalEntity;
import com.epistimis.uddl.uddl.LogicalParticipant;
import com.epistimis.uddl.uddl.LogicalPathNode;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalParticipantImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalParticipantImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalParticipantImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalParticipantImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalParticipantImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalParticipantImpl extends LogicalCharacteristicImpl implements LogicalParticipant
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LogicalEntity type;

  /**
   * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizes()
   * @generated
   * @ordered
   */
  protected ConceptualParticipant realizes;

  /**
   * The default value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLowerBound()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLowerBound()
   * @generated
   * @ordered
   */
  protected int sourceLowerBound = SOURCE_LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUpperBound()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUpperBound()
   * @generated
   * @ordered
   */
  protected int sourceUpperBound = SOURCE_UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected LogicalPathNode path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalParticipantImpl()
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
    return UddlPackage.Literals.LOGICAL_PARTICIPANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalEntity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LogicalEntity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_PARTICIPANT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalEntity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(LogicalEntity newType)
  {
    LogicalEntity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConceptualParticipant getRealizes()
  {
    if (realizes != null && realizes.eIsProxy())
    {
      InternalEObject oldRealizes = (InternalEObject)realizes;
      realizes = (ConceptualParticipant)eResolveProxy(oldRealizes);
      if (realizes != oldRealizes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_PARTICIPANT__REALIZES, oldRealizes, realizes));
      }
    }
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptualParticipant basicGetRealizes()
  {
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRealizes(ConceptualParticipant newRealizes)
  {
    ConceptualParticipant oldRealizes = realizes;
    realizes = newRealizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__REALIZES, oldRealizes, realizes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSourceLowerBound()
  {
    return sourceLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceLowerBound(int newSourceLowerBound)
  {
    int oldSourceLowerBound = sourceLowerBound;
    sourceLowerBound = newSourceLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__SOURCE_LOWER_BOUND, oldSourceLowerBound, sourceLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSourceUpperBound()
  {
    return sourceUpperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceUpperBound(int newSourceUpperBound)
  {
    int oldSourceUpperBound = sourceUpperBound;
    sourceUpperBound = newSourceUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__SOURCE_UPPER_BOUND, oldSourceUpperBound, sourceUpperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalPathNode getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(LogicalPathNode newPath, NotificationChain msgs)
  {
    LogicalPathNode oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__PATH, oldPath, newPath);
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
  public void setPath(LogicalPathNode newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UddlPackage.LOGICAL_PARTICIPANT__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UddlPackage.LOGICAL_PARTICIPANT__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_PARTICIPANT__PATH, newPath, newPath));
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
      case UddlPackage.LOGICAL_PARTICIPANT__PATH:
        return basicSetPath(null, msgs);
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
      case UddlPackage.LOGICAL_PARTICIPANT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UddlPackage.LOGICAL_PARTICIPANT__REALIZES:
        if (resolve) return getRealizes();
        return basicGetRealizes();
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_LOWER_BOUND:
        return getSourceLowerBound();
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_UPPER_BOUND:
        return getSourceUpperBound();
      case UddlPackage.LOGICAL_PARTICIPANT__PATH:
        return getPath();
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
      case UddlPackage.LOGICAL_PARTICIPANT__TYPE:
        setType((LogicalEntity)newValue);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__REALIZES:
        setRealizes((ConceptualParticipant)newValue);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_LOWER_BOUND:
        setSourceLowerBound((Integer)newValue);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_UPPER_BOUND:
        setSourceUpperBound((Integer)newValue);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__PATH:
        setPath((LogicalPathNode)newValue);
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
      case UddlPackage.LOGICAL_PARTICIPANT__TYPE:
        setType((LogicalEntity)null);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__REALIZES:
        setRealizes((ConceptualParticipant)null);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_LOWER_BOUND:
        setSourceLowerBound(SOURCE_LOWER_BOUND_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_UPPER_BOUND:
        setSourceUpperBound(SOURCE_UPPER_BOUND_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_PARTICIPANT__PATH:
        setPath((LogicalPathNode)null);
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
      case UddlPackage.LOGICAL_PARTICIPANT__TYPE:
        return type != null;
      case UddlPackage.LOGICAL_PARTICIPANT__REALIZES:
        return realizes != null;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_LOWER_BOUND:
        return sourceLowerBound != SOURCE_LOWER_BOUND_EDEFAULT;
      case UddlPackage.LOGICAL_PARTICIPANT__SOURCE_UPPER_BOUND:
        return sourceUpperBound != SOURCE_UPPER_BOUND_EDEFAULT;
      case UddlPackage.LOGICAL_PARTICIPANT__PATH:
        return path != null;
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
    result.append(" (sourceLowerBound: ");
    result.append(sourceLowerBound);
    result.append(", sourceUpperBound: ");
    result.append(sourceUpperBound);
    result.append(')');
    return result.toString();
  }

} //LogicalParticipantImpl
