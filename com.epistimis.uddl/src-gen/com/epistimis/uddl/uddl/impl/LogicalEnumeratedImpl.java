/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalEnumerated;
import com.epistimis.uddl.uddl.LogicalEnumeratedBase;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Enumerated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalEnumeratedImpl#getStandardReference <em>Standard Reference</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalEnumeratedImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalEnumeratedImpl extends LogicalEnumeratedBaseImpl implements LogicalEnumerated
{
  /**
   * The default value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandardReference()
   * @generated
   * @ordered
   */
  protected static final String STANDARD_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandardReference()
   * @generated
   * @ordered
   */
  protected String standardReference = STANDARD_REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EList<LogicalEnumeratedBase> label;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalEnumeratedImpl()
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
    return UddlPackage.Literals.LOGICAL_ENUMERATED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStandardReference()
  {
    return standardReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStandardReference(String newStandardReference)
  {
    String oldStandardReference = standardReference;
    standardReference = newStandardReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_ENUMERATED__STANDARD_REFERENCE, oldStandardReference, standardReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalEnumeratedBase> getLabel()
  {
    if (label == null)
    {
      label = new EObjectContainmentEList<LogicalEnumeratedBase>(LogicalEnumeratedBase.class, this, UddlPackage.LOGICAL_ENUMERATED__LABEL);
    }
    return label;
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
      case UddlPackage.LOGICAL_ENUMERATED__LABEL:
        return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.LOGICAL_ENUMERATED__STANDARD_REFERENCE:
        return getStandardReference();
      case UddlPackage.LOGICAL_ENUMERATED__LABEL:
        return getLabel();
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
      case UddlPackage.LOGICAL_ENUMERATED__STANDARD_REFERENCE:
        setStandardReference((String)newValue);
        return;
      case UddlPackage.LOGICAL_ENUMERATED__LABEL:
        getLabel().clear();
        getLabel().addAll((Collection<? extends LogicalEnumeratedBase>)newValue);
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
      case UddlPackage.LOGICAL_ENUMERATED__STANDARD_REFERENCE:
        setStandardReference(STANDARD_REFERENCE_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_ENUMERATED__LABEL:
        getLabel().clear();
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
      case UddlPackage.LOGICAL_ENUMERATED__STANDARD_REFERENCE:
        return STANDARD_REFERENCE_EDEFAULT == null ? standardReference != null : !STANDARD_REFERENCE_EDEFAULT.equals(standardReference);
      case UddlPackage.LOGICAL_ENUMERATED__LABEL:
        return label != null && !label.isEmpty();
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
    result.append(" (standardReference: ");
    result.append(standardReference);
    result.append(')');
    return result.toString();
  }

} //LogicalEnumeratedImpl
