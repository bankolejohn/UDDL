/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Integer Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalIntegerRangeConstraint#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalIntegerRangeConstraint#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalIntegerRangeConstraint()
 * @model
 * @generated
 */
public interface LogicalIntegerRangeConstraint extends LogicalConstraint
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalIntegerRangeConstraint_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalIntegerRangeConstraint#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalIntegerRangeConstraint_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalIntegerRangeConstraint#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

} // LogicalIntegerRangeConstraint
