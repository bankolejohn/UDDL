/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.PlatformCharacteristic;
import com.epistimis.uddl.uddl.PlatformCharacteristicPathNode;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Characteristic Path Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformCharacteristicPathNodeImpl#getProjectedCharacteristic <em>Projected Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformCharacteristicPathNodeImpl extends PlatformPathNodeImpl implements PlatformCharacteristicPathNode
{
  /**
   * The cached value of the '{@link #getProjectedCharacteristic() <em>Projected Characteristic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectedCharacteristic()
   * @generated
   * @ordered
   */
  protected PlatformCharacteristic projectedCharacteristic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformCharacteristicPathNodeImpl()
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
    return UddlPackage.Literals.PLATFORM_CHARACTERISTIC_PATH_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlatformCharacteristic getProjectedCharacteristic()
  {
    if (projectedCharacteristic != null && projectedCharacteristic.eIsProxy())
    {
      InternalEObject oldProjectedCharacteristic = (InternalEObject)projectedCharacteristic;
      projectedCharacteristic = (PlatformCharacteristic)eResolveProxy(oldProjectedCharacteristic);
      if (projectedCharacteristic != oldProjectedCharacteristic)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC, oldProjectedCharacteristic, projectedCharacteristic));
      }
    }
    return projectedCharacteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformCharacteristic basicGetProjectedCharacteristic()
  {
    return projectedCharacteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProjectedCharacteristic(PlatformCharacteristic newProjectedCharacteristic)
  {
    PlatformCharacteristic oldProjectedCharacteristic = projectedCharacteristic;
    projectedCharacteristic = newProjectedCharacteristic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC, oldProjectedCharacteristic, projectedCharacteristic));
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
      case UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
        if (resolve) return getProjectedCharacteristic();
        return basicGetProjectedCharacteristic();
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
      case UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
        setProjectedCharacteristic((PlatformCharacteristic)newValue);
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
      case UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
        setProjectedCharacteristic((PlatformCharacteristic)null);
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
      case UddlPackage.PLATFORM_CHARACTERISTIC_PATH_NODE__PROJECTED_CHARACTERISTIC:
        return projectedCharacteristic != null;
    }
    return super.eIsSet(featureID);
  }

} //PlatformCharacteristicPathNodeImpl
