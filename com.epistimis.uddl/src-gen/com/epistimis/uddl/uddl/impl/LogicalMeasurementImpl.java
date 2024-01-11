/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.ConceptualObservable;
import com.epistimis.uddl.uddl.LogicalAbstractMeasurementSystem;
import com.epistimis.uddl.uddl.LogicalMeasurement;
import com.epistimis.uddl.uddl.LogicalMeasurementAttribute;
import com.epistimis.uddl.uddl.LogicalMeasurementAxis;
import com.epistimis.uddl.uddl.LogicalMeasurementConstraint;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementImpl#getMeasurementAxis <em>Measurement Axis</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementImpl#getMeasurementSystem <em>Measurement System</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalMeasurementImpl extends LogicalComposableElementImpl implements LogicalMeasurement
{
  /**
   * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizes()
   * @generated
   * @ordered
   */
  protected ConceptualObservable realizes;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<LogicalMeasurementAttribute> attribute;

  /**
   * The cached value of the '{@link #getMeasurementAxis() <em>Measurement Axis</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementAxis()
   * @generated
   * @ordered
   */
  protected EList<LogicalMeasurementAxis> measurementAxis;

  /**
   * The cached value of the '{@link #getMeasurementSystem() <em>Measurement System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementSystem()
   * @generated
   * @ordered
   */
  protected LogicalAbstractMeasurementSystem measurementSystem;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected EList<LogicalMeasurementConstraint> constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalMeasurementImpl()
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
    return UddlPackage.Literals.LOGICAL_MEASUREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConceptualObservable getRealizes()
  {
    if (realizes != null && realizes.eIsProxy())
    {
      InternalEObject oldRealizes = (InternalEObject)realizes;
      realizes = (ConceptualObservable)eResolveProxy(oldRealizes);
      if (realizes != oldRealizes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_MEASUREMENT__REALIZES, oldRealizes, realizes));
      }
    }
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptualObservable basicGetRealizes()
  {
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRealizes(ConceptualObservable newRealizes)
  {
    ConceptualObservable oldRealizes = realizes;
    realizes = newRealizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT__REALIZES, oldRealizes, realizes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalMeasurementAttribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<LogicalMeasurementAttribute>(LogicalMeasurementAttribute.class, this, UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalMeasurementAxis> getMeasurementAxis()
  {
    if (measurementAxis == null)
    {
      measurementAxis = new EObjectResolvingEList<LogicalMeasurementAxis>(LogicalMeasurementAxis.class, this, UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_AXIS);
    }
    return measurementAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalAbstractMeasurementSystem getMeasurementSystem()
  {
    if (measurementSystem != null && measurementSystem.eIsProxy())
    {
      InternalEObject oldMeasurementSystem = (InternalEObject)measurementSystem;
      measurementSystem = (LogicalAbstractMeasurementSystem)eResolveProxy(oldMeasurementSystem);
      if (measurementSystem != oldMeasurementSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM, oldMeasurementSystem, measurementSystem));
      }
    }
    return measurementSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAbstractMeasurementSystem basicGetMeasurementSystem()
  {
    return measurementSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMeasurementSystem(LogicalAbstractMeasurementSystem newMeasurementSystem)
  {
    LogicalAbstractMeasurementSystem oldMeasurementSystem = measurementSystem;
    measurementSystem = newMeasurementSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM, oldMeasurementSystem, measurementSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalMeasurementConstraint> getConstraint()
  {
    if (constraint == null)
    {
      constraint = new EObjectContainmentEList<LogicalMeasurementConstraint>(LogicalMeasurementConstraint.class, this, UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT);
    }
    return constraint;
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
      case UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT:
        return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.LOGICAL_MEASUREMENT__REALIZES:
        if (resolve) return getRealizes();
        return basicGetRealizes();
      case UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE:
        return getAttribute();
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_AXIS:
        return getMeasurementAxis();
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM:
        if (resolve) return getMeasurementSystem();
        return basicGetMeasurementSystem();
      case UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT:
        return getConstraint();
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
      case UddlPackage.LOGICAL_MEASUREMENT__REALIZES:
        setRealizes((ConceptualObservable)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends LogicalMeasurementAttribute>)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_AXIS:
        getMeasurementAxis().clear();
        getMeasurementAxis().addAll((Collection<? extends LogicalMeasurementAxis>)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM:
        setMeasurementSystem((LogicalAbstractMeasurementSystem)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT:
        getConstraint().clear();
        getConstraint().addAll((Collection<? extends LogicalMeasurementConstraint>)newValue);
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
      case UddlPackage.LOGICAL_MEASUREMENT__REALIZES:
        setRealizes((ConceptualObservable)null);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE:
        getAttribute().clear();
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_AXIS:
        getMeasurementAxis().clear();
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM:
        setMeasurementSystem((LogicalAbstractMeasurementSystem)null);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT:
        getConstraint().clear();
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
      case UddlPackage.LOGICAL_MEASUREMENT__REALIZES:
        return realizes != null;
      case UddlPackage.LOGICAL_MEASUREMENT__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_AXIS:
        return measurementAxis != null && !measurementAxis.isEmpty();
      case UddlPackage.LOGICAL_MEASUREMENT__MEASUREMENT_SYSTEM:
        return measurementSystem != null;
      case UddlPackage.LOGICAL_MEASUREMENT__CONSTRAINT:
        return constraint != null && !constraint.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalMeasurementImpl