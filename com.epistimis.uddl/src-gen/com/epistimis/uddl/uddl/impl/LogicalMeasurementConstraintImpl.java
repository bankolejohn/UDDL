/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalMeasurementConstraint;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Measurement Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementConstraintImpl#getConstraintText <em>Constraint Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalMeasurementConstraintImpl extends MinimalEObjectImpl.Container implements LogicalMeasurementConstraint
{
  /**
   * The default value of the '{@link #getConstraintText() <em>Constraint Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintText()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintText() <em>Constraint Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintText()
   * @generated
   * @ordered
   */
  protected String constraintText = CONSTRAINT_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalMeasurementConstraintImpl()
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
    return UddlPackage.Literals.LOGICAL_MEASUREMENT_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstraintText()
  {
    return constraintText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstraintText(String newConstraintText)
  {
    String oldConstraintText = constraintText;
    constraintText = newConstraintText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT, oldConstraintText, constraintText));
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
      case UddlPackage.LOGICAL_MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT:
        return getConstraintText();
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
      case UddlPackage.LOGICAL_MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT:
        setConstraintText((String)newValue);
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
      case UddlPackage.LOGICAL_MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT:
        setConstraintText(CONSTRAINT_TEXT_EDEFAULT);
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
      case UddlPackage.LOGICAL_MEASUREMENT_CONSTRAINT__CONSTRAINT_TEXT:
        return CONSTRAINT_TEXT_EDEFAULT == null ? constraintText != null : !CONSTRAINT_TEXT_EDEFAULT.equals(constraintText);
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
    result.append(" (constraintText: ");
    result.append(constraintText);
    result.append(')');
    return result.toString();
  }

} //LogicalMeasurementConstraintImpl
