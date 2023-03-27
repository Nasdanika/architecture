/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md' load-key='azure-networking'"
 * @generated
 */
public interface NetworkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.architecture.cloud.azure.networking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.cloud.azure.networking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingPackage eINSTANCE = org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl <em>Virtual Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getVirtualNetwork()
	 * @generated
	 */
	int VIRTUAL_NETWORK = 0;

	/**
	 * The number of structural features of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork
	 * @generated
	 */
	EClass getVirtualNetwork();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkingFactory getNetworkingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl <em>Virtual Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getVirtualNetwork()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK = eINSTANCE.getVirtualNetwork();

	}

} //NetworkingPackage
