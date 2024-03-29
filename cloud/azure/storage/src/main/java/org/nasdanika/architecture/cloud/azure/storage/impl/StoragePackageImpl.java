/**
 */
package org.nasdanika.architecture.cloud.azure.storage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.architecture.cloud.azure.core.CorePackage;
import org.nasdanika.architecture.cloud.azure.storage.AzureFiles;
import org.nasdanika.architecture.cloud.azure.storage.BlobStorage;
import org.nasdanika.architecture.cloud.azure.storage.DataLakeStorageGen2;
import org.nasdanika.architecture.cloud.azure.storage.QueueStorage;
import org.nasdanika.architecture.cloud.azure.storage.StorageAccount;
import org.nasdanika.architecture.cloud.azure.storage.StorageFactory;
import org.nasdanika.architecture.cloud.azure.storage.StoragePackage;
import org.nasdanika.architecture.cloud.azure.storage.TableStorage;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoragePackageImpl extends EPackageImpl implements StoragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobStorageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLakeStorageGen2EClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azureFilesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueStorageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableStorageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.architecture.cloud.azure.storage.StoragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StoragePackageImpl() {
		super(eNS_URI, StorageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StoragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StoragePackage init() {
		if (isInited) return (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStoragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StoragePackageImpl theStoragePackage = registeredStoragePackage instanceof StoragePackageImpl ? (StoragePackageImpl)registeredStoragePackage : new StoragePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		org.nasdanika.architecture.core.CorePackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStoragePackage.createPackageContents();

		// Initialize created meta-data
		theStoragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStoragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StoragePackage.eNS_URI, theStoragePackage);
		return theStoragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageAccount() {
		return storageAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlobStorage() {
		return blobStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLakeStorageGen2() {
		return dataLakeStorageGen2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAzureFiles() {
		return azureFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueueStorage() {
		return queueStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableStorage() {
		return tableStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFactory getStorageFactory() {
		return (StorageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		storageAccountEClass = createEClass(STORAGE_ACCOUNT);

		blobStorageEClass = createEClass(BLOB_STORAGE);

		dataLakeStorageGen2EClass = createEClass(DATA_LAKE_STORAGE_GEN2);

		azureFilesEClass = createEClass(AZURE_FILES);

		queueStorageEClass = createEClass(QUEUE_STORAGE);

		tableStorageEClass = createEClass(TABLE_STORAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		storageAccountEClass.getESuperTypes().add(theCorePackage.getResource());
		blobStorageEClass.getESuperTypes().add(theCorePackage.getAzureElement());
		dataLakeStorageGen2EClass.getESuperTypes().add(theCorePackage.getAzureElement());
		azureFilesEClass.getESuperTypes().add(theCorePackage.getAzureElement());
		queueStorageEClass.getESuperTypes().add(theCorePackage.getAzureElement());
		tableStorageEClass.getESuperTypes().add(theCorePackage.getAzureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(storageAccountEClass, StorageAccount.class, "StorageAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobStorageEClass, BlobStorage.class, "BlobStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLakeStorageGen2EClass, DataLakeStorageGen2.class, "DataLakeStorageGen2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(azureFilesEClass, AzureFiles.class, "AzureFiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queueStorageEClass, QueueStorage.class, "QueueStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableStorageEClass, TableStorage.class, "TableStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation-reference", "doc/package-summary.md",
			   "load-key", "azure-storage",
			   "exports", "StorageAccount: azure-storage-account"
		   });
		addAnnotation
		  (storageAccountEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/storage/10086-icon-service-Storage-Accounts.svg",
			   "label", "Storage Account"
		   });
	}

} //StoragePackageImpl
