/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Measurement Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getValueTypeUnit <em>Value Type Unit</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalMeasurementAxis()
 * @model
 * @generated
 */
public interface LogicalMeasurementAxis extends LogicalElement
{
  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(ConceptualObservable)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalMeasurementAxis_Realizes()
   * @model
   * @generated
   */
  ConceptualObservable getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(ConceptualObservable value);

  /**
   * Returns the value of the '<em><b>Value Type Unit</b></em>' reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalValueTypeUnit}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type Unit</em>' reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalMeasurementAxis_ValueTypeUnit()
   * @model
   * @generated
   */
  EList<LogicalValueTypeUnit> getValueTypeUnit();

  /**
   * Returns the value of the '<em><b>Measurement System Axis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement System Axis</em>' reference.
   * @see #setMeasurementSystemAxis(LogicalMeasurementSystemAxis)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalMeasurementAxis_MeasurementSystemAxis()
   * @model
   * @generated
   */
  LogicalMeasurementSystemAxis getMeasurementSystemAxis();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalMeasurementAxis#getMeasurementSystemAxis <em>Measurement System Axis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement System Axis</em>' reference.
   * @see #getMeasurementSystemAxis()
   * @generated
   */
  void setMeasurementSystemAxis(LogicalMeasurementSystemAxis value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalMeasurementConstraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalMeasurementAxis_Constraint()
   * @model containment="true"
   * @generated
   */
  EList<LogicalMeasurementConstraint> getConstraint();

} // LogicalMeasurementAxis
