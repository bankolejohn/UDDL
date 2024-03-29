/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalMeasurementAttribute;
import com.epistimis.uddl.uddl.PlatformDataType;
import com.epistimis.uddl.uddl.PlatformStructMember;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Struct Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformStructMemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformStructMemberImpl#getRolename <em>Rolename</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformStructMemberImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformStructMemberImpl#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformStructMemberImpl extends MinimalEObjectImpl.Container implements PlatformStructMember
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PlatformDataType type;

  /**
   * The default value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolename()
   * @generated
   * @ordered
   */
  protected static final String ROLENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolename()
   * @generated
   * @ordered
   */
  protected String rolename = ROLENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected static final float PRECISION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected float precision = PRECISION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizes()
   * @generated
   * @ordered
   */
  protected LogicalMeasurementAttribute realizes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformStructMemberImpl()
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
    return UddlPackage.Literals.PLATFORM_STRUCT_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlatformDataType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (PlatformDataType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformDataType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(PlatformDataType newType)
  {
    PlatformDataType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRolename()
  {
    return rolename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRolename(String newRolename)
  {
    String oldRolename = rolename;
    rolename = newRolename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_STRUCT_MEMBER__ROLENAME, oldRolename, rolename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrecision(float newPrecision)
  {
    float oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_STRUCT_MEMBER__PRECISION, oldPrecision, precision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalMeasurementAttribute getRealizes()
  {
    if (realizes != null && realizes.eIsProxy())
    {
      InternalEObject oldRealizes = (InternalEObject)realizes;
      realizes = (LogicalMeasurementAttribute)eResolveProxy(oldRealizes);
      if (realizes != oldRealizes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES, oldRealizes, realizes));
      }
    }
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalMeasurementAttribute basicGetRealizes()
  {
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRealizes(LogicalMeasurementAttribute newRealizes)
  {
    LogicalMeasurementAttribute oldRealizes = realizes;
    realizes = newRealizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES, oldRealizes, realizes));
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
      case UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case UddlPackage.PLATFORM_STRUCT_MEMBER__ROLENAME:
        return getRolename();
      case UddlPackage.PLATFORM_STRUCT_MEMBER__PRECISION:
        return getPrecision();
      case UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES:
        if (resolve) return getRealizes();
        return basicGetRealizes();
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
      case UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE:
        setType((PlatformDataType)newValue);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__ROLENAME:
        setRolename((String)newValue);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__PRECISION:
        setPrecision((Float)newValue);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES:
        setRealizes((LogicalMeasurementAttribute)newValue);
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
      case UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE:
        setType((PlatformDataType)null);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__ROLENAME:
        setRolename(ROLENAME_EDEFAULT);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
        return;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES:
        setRealizes((LogicalMeasurementAttribute)null);
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
      case UddlPackage.PLATFORM_STRUCT_MEMBER__TYPE:
        return type != null;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__ROLENAME:
        return ROLENAME_EDEFAULT == null ? rolename != null : !ROLENAME_EDEFAULT.equals(rolename);
      case UddlPackage.PLATFORM_STRUCT_MEMBER__PRECISION:
        return precision != PRECISION_EDEFAULT;
      case UddlPackage.PLATFORM_STRUCT_MEMBER__REALIZES:
        return realizes != null;
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
    result.append(" (rolename: ");
    result.append(rolename);
    result.append(", precision: ");
    result.append(precision);
    result.append(')');
    return result.toString();
  }

} //PlatformStructMemberImpl
