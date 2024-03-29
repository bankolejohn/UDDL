/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Struct Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformStructMember#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformStructMember#getRolename <em>Rolename</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformStructMember#getPrecision <em>Precision</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformStructMember#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStructMember()
 * @model
 * @generated
 */
public interface PlatformStructMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(PlatformDataType)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStructMember_Type()
   * @model
   * @generated
   */
  PlatformDataType getType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformStructMember#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(PlatformDataType value);

  /**
   * Returns the value of the '<em><b>Rolename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolename</em>' attribute.
   * @see #setRolename(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStructMember_Rolename()
   * @model
   * @generated
   */
  String getRolename();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformStructMember#getRolename <em>Rolename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolename</em>' attribute.
   * @see #getRolename()
   * @generated
   */
  void setRolename(String value);

  /**
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see #setPrecision(float)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStructMember_Precision()
   * @model
   * @generated
   */
  float getPrecision();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformStructMember#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see #getPrecision()
   * @generated
   */
  void setPrecision(float value);

  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(LogicalMeasurementAttribute)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStructMember_Realizes()
   * @model
   * @generated
   */
  LogicalMeasurementAttribute getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformStructMember#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(LogicalMeasurementAttribute value);

} // PlatformStructMember
