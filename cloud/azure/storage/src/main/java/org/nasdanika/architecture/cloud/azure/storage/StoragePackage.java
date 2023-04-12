/**
 */
package org.nasdanika.architecture.cloud.azure.storage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.architecture.cloud.azure.core.CorePackage;

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
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.BlobStorageImpl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getBlobStorage()
	 * @generated
	 */
	int BLOB_STORAGE = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Blob Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blob Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.DataLakeStorageGen2Impl <em>Data Lake Storage Gen2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.DataLakeStorageGen2Impl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getDataLakeStorageGen2()
	 * @generated
	 */
	int DATA_LAKE_STORAGE_GEN2 = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Data Lake Storage Gen2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Lake Storage Gen2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.AzureFilesImpl <em>Azure Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.AzureFilesImpl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getAzureFiles()
	 * @generated
	 */
	int AZURE_FILES = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Azure Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Azure Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.QueueStorageImpl <em>Queue Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.QueueStorageImpl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getQueueStorage()
	 * @generated
	 */
	int QUEUE_STORAGE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Queue Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Queue Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.TableStorageImpl <em>Table Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.TableStorageImpl
	 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getTableStorage()
	 * @generated
	 */
	int TABLE_STORAGE = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Table Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.BlobStorage <em>Blob Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob Storage</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.BlobStorage
	 * @generated
	 */
	EClass getBlobStorage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.DataLakeStorageGen2 <em>Data Lake Storage Gen2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Lake Storage Gen2</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.DataLakeStorageGen2
	 * @generated
	 */
	EClass getDataLakeStorageGen2();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.AzureFiles <em>Azure Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azure Files</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.AzureFiles
	 * @generated
	 */
	EClass getAzureFiles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.QueueStorage <em>Queue Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Storage</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.QueueStorage
	 * @generated
	 */
	EClass getQueueStorage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.storage.TableStorage <em>Table Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Storage</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.storage.TableStorage
	 * @generated
	 */
	EClass getTableStorage();

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
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.BlobStorageImpl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getBlobStorage()
		 * @generated
		 */
		EClass BLOB_STORAGE = eINSTANCE.getBlobStorage();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.DataLakeStorageGen2Impl <em>Data Lake Storage Gen2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.DataLakeStorageGen2Impl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getDataLakeStorageGen2()
		 * @generated
		 */
		EClass DATA_LAKE_STORAGE_GEN2 = eINSTANCE.getDataLakeStorageGen2();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.AzureFilesImpl <em>Azure Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.AzureFilesImpl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getAzureFiles()
		 * @generated
		 */
		EClass AZURE_FILES = eINSTANCE.getAzureFiles();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.QueueStorageImpl <em>Queue Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.QueueStorageImpl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getQueueStorage()
		 * @generated
		 */
		EClass QUEUE_STORAGE = eINSTANCE.getQueueStorage();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.storage.impl.TableStorageImpl <em>Table Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.TableStorageImpl
		 * @see org.nasdanika.architecture.cloud.azure.storage.impl.StoragePackageImpl#getTableStorage()
		 * @generated
		 */
		EClass TABLE_STORAGE = eINSTANCE.getTableStorage();

	}

} //StoragePackage
