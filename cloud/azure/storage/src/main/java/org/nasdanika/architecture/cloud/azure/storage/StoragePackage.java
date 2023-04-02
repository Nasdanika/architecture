/**
 */
package org.nasdanika.architecture.cloud.azure.storage;

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
 * @see org.nasdanika.architecture.cloud.azure.storage.StorageFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md' load-key='azure-storage' exports='StorageAccount: azure-storage-account'"
 * @generated
 */
public interface StoragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/architecture/cloud/azure/storage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.cloud.azure.storage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoragePackage eINSTANCE = org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.StorageAccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StorageAccountImpl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getStorageAccount()
	 * @generated
	 */
	int STORAGE_ACCOUNT = 0;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.StorageAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.StorageAccount
	 * @generated
	 */
	EClass getStorageAccount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorageFactory getStorageFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.StorageAccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StorageAccountImpl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getStorageAccount()
		 * @generated
		 */
		EClass STORAGE_ACCOUNT = eINSTANCE.getStorageAccount();

	}

} //StoragePackage
