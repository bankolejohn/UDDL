/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformParticipantPathNode;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Participant Path Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformParticipantPathNodeImpl#getProjectedParticipant <em>Projected Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformParticipantPathNodeImpl extends PlatformPathNodeImpl implements PlatformParticipantPathNode
{
  /**
   * The cached value of the '{@link #getProjectedParticipant() <em>Projected Participant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectedParticipant()
   * @generated
   * @ordered
   */
  protected PlatformParticipant projectedParticipant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformParticipantPathNodeImpl()
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
    return UddlPackage.Literals.PLATFORM_PARTICIPANT_PATH_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlatformParticipant getProjectedParticipant()
  {
    if (projectedParticipant != null && projectedParticipant.eIsProxy())
    {
      InternalEObject oldProjectedParticipant = (InternalEObject)projectedParticipant;
      projectedParticipant = (PlatformParticipant)eResolveProxy(oldProjectedParticipant);
      if (projectedParticipant != oldProjectedParticipant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT, oldProjectedParticipant, projectedParticipant));
      }
    }
    return projectedParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformParticipant basicGetProjectedParticipant()
  {
    return projectedParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProjectedParticipant(PlatformParticipant newProjectedParticipant)
  {
    PlatformParticipant oldProjectedParticipant = projectedParticipant;
    projectedParticipant = newProjectedParticipant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT, oldProjectedParticipant, projectedParticipant));
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
      case UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT:
        if (resolve) return getProjectedParticipant();
        return basicGetProjectedParticipant();
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
      case UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT:
        setProjectedParticipant((PlatformParticipant)newValue);
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
      case UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT:
        setProjectedParticipant((PlatformParticipant)null);
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
      case UddlPackage.PLATFORM_PARTICIPANT_PATH_NODE__PROJECTED_PARTICIPANT:
        return projectedParticipant != null;
    }
    return super.eIsSet(featureID);
  }

} //PlatformParticipantPathNodeImpl
