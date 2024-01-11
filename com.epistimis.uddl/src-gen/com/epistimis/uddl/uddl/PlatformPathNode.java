/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformPathNode#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformPathNode()
 * @model
 * @generated
 */
public interface PlatformPathNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(PlatformPathNode)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformPathNode_Node()
   * @model containment="true"
   * @generated
   */
  PlatformPathNode getNode();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformPathNode#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(PlatformPathNode value);

} // PlatformPathNode