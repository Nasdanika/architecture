/**
 */
package org.nasdanika.architecture.cloud.azure.networking.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.architecture.cloud.azure.core.impl.ResourceImpl;
import org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage;
import org.nasdanika.architecture.cloud.azure.networking.Subnet;
import org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork;
import org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNetworkImpl extends ResourceImpl implements VirtualNetwork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.VIRTUAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subnet> getSubnets() {
		return (EList<Subnet>)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK__SUBNETS, NetworkingPackage.Literals.VIRTUAL_NETWORK__SUBNETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualNetworkResource> getResources() {
		// TODO: implement this method to return the 'Resources' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return ((InternalEList<?>)getSubnets()).basicRemove(otherEnd, msgs);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return getSubnets();
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				return getResources();
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				getSubnets().clear();
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return !getSubnets().isEmpty();
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualNetworkImpl
