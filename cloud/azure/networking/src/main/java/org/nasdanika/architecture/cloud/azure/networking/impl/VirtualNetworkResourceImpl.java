/**
 */
package org.nasdanika.architecture.cloud.azure.networking.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.core.impl.ResourceImpl;

import org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage;
import org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Network Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkResourceImpl#getVirtualNetwork <em>Virtual Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VirtualNetworkResourceImpl extends ResourceImpl implements VirtualNetworkResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNetworkResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualNetworkResource getVirtualNetwork() {
		return (VirtualNetworkResource)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkResource basicGetVirtualNetwork() {
		return (VirtualNetworkResource)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualNetwork(VirtualNetworkResource newVirtualNetwork) {
		eDynamicSet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, newVirtualNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				if (resolve) return getVirtualNetwork();
				return basicGetVirtualNetwork();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				setVirtualNetwork((VirtualNetworkResource)newValue);
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				setVirtualNetwork((VirtualNetworkResource)null);
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				return basicGetVirtualNetwork() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNetworkResourceImpl
