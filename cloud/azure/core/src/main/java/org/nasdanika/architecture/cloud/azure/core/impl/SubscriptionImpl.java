/**
 */
package org.nasdanika.architecture.cloud.azure.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.architecture.cloud.azure.core.CorePackage;
import org.nasdanika.architecture.cloud.azure.core.ResourceGroup;
import org.nasdanika.architecture.cloud.azure.core.Subscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.core.impl.SubscriptionImpl#getResourceGroups <em>Resource Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends ManagementGroupElementImpl implements Subscription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ResourceGroup> getResourceGroups() {
		return (EList<ResourceGroup>)eDynamicGet(CorePackage.SUBSCRIPTION__RESOURCE_GROUPS, CorePackage.Literals.SUBSCRIPTION__RESOURCE_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBSCRIPTION__RESOURCE_GROUPS:
				return ((InternalEList<?>)getResourceGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SUBSCRIPTION__RESOURCE_GROUPS:
				return getResourceGroups();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.SUBSCRIPTION__RESOURCE_GROUPS:
				getResourceGroups().clear();
				getResourceGroups().addAll((Collection<? extends ResourceGroup>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.SUBSCRIPTION__RESOURCE_GROUPS:
				getResourceGroups().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.SUBSCRIPTION__RESOURCE_GROUPS:
				return !getResourceGroups().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionImpl
