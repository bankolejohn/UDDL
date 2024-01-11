/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.PlatformDataModel;
import com.epistimis.uddl.uddl.PlatformElement;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformDataModelImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformDataModelImpl#getPdm <em>Pdm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformDataModelImpl extends UddlElementImpl implements PlatformDataModel
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected EList<PlatformElement> element;

  /**
   * The cached value of the '{@link #getPdm() <em>Pdm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPdm()
   * @generated
   * @ordered
   */
  protected EList<PlatformDataModel> pdm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformDataModelImpl()
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
    return UddlPackage.Literals.PLATFORM_DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformElement> getElement()
  {
    if (element == null)
    {
      element = new EObjectContainmentEList<PlatformElement>(PlatformElement.class, this, UddlPackage.PLATFORM_DATA_MODEL__ELEMENT);
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformDataModel> getPdm()
  {
    if (pdm == null)
    {
      pdm = new EObjectContainmentEList<PlatformDataModel>(PlatformDataModel.class, this, UddlPackage.PLATFORM_DATA_MODEL__PDM);
    }
    return pdm;
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
      case UddlPackage.PLATFORM_DATA_MODEL__ELEMENT:
        return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
      case UddlPackage.PLATFORM_DATA_MODEL__PDM:
        return ((InternalEList<?>)getPdm()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.PLATFORM_DATA_MODEL__ELEMENT:
        return getElement();
      case UddlPackage.PLATFORM_DATA_MODEL__PDM:
        return getPdm();
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
      case UddlPackage.PLATFORM_DATA_MODEL__ELEMENT:
        getElement().clear();
        getElement().addAll((Collection<? extends PlatformElement>)newValue);
        return;
      case UddlPackage.PLATFORM_DATA_MODEL__PDM:
        getPdm().clear();
        getPdm().addAll((Collection<? extends PlatformDataModel>)newValue);
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
      case UddlPackage.PLATFORM_DATA_MODEL__ELEMENT:
        getElement().clear();
        return;
      case UddlPackage.PLATFORM_DATA_MODEL__PDM:
        getPdm().clear();
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
      case UddlPackage.PLATFORM_DATA_MODEL__ELEMENT:
        return element != null && !element.isEmpty();
      case UddlPackage.PLATFORM_DATA_MODEL__PDM:
        return pdm != null && !pdm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlatformDataModelImpl
