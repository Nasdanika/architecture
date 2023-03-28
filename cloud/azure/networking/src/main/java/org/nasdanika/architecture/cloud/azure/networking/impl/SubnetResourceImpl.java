/**
 */
package org.nasdanika.architecture.cloud.azure.networking.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.core.impl.ResourceImpl;

import org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage;
import org.nasdanika.architecture.cloud.azure.networking.Subnet;
import org.nasdanika.architecture.cloud.azure.networking.SubnetResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubnetResourceImpl extends ResourceImpl implements SubnetResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.SUBNET_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet getSubnet() {
		return (Subnet)eDynamicGet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet basicGetSubnet() {
		return (Subnet)eDynamicGet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnet(Subnet newSubnet) {
		eDynamicSet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, newSubnet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				if (resolve) return getSubnet();
				return basicGetSubnet();
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				setSubnet((Subnet)newValue);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				setSubnet((Subnet)null);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				return basicGetSubnet() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubnetResourceImpl
