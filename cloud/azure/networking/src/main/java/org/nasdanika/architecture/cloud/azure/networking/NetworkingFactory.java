/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage
 * @generated
 */
public interface NetworkingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingFactory eINSTANCE = org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Network</em>'.
	 * @generated
	 */
	VirtualNetwork createVirtualNetwork();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkingPackage getNetworkingPackage();

} //NetworkingFactory
