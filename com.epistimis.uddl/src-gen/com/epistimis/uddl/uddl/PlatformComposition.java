/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformComposition#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformComposition#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformComposition#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformComposition()
 * @model
 * @generated
 */
public interface PlatformComposition extends PlatformCharacteristic
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(PlatformComposableElement)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformComposition_Type()
   * @model
   * @generated
   */
  PlatformComposableElement getType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformComposition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(PlatformComposableElement value);

  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(LogicalComposition)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformComposition_Realizes()
   * @model
   * @generated
   */
  LogicalComposition getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformComposition#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(LogicalComposition value);

  /**
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see #setPrecision(float)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformComposition_Precision()
   * @model
   * @generated
   */
  float getPrecision();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformComposition#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see #getPrecision()
   * @generated
   */
  void setPrecision(float value);

} // PlatformComposition
