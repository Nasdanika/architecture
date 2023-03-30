/**
 */
package org.nasdanika.architecture.cloud.azure.compute;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.architecture.cloud.azure.core.CorePackage;
import org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage;

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
 * @see org.nasdanika.architecture.cloud.azure.compute.ComputeFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md' load-key='azure-compute' exports='VirtualMachine:\n  - azure-vm\n  - azure-virtual-machine'"
 * @generated
 */
public interface ComputePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.architecture.cloud.azure.compute";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.cloud.azure.compute";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputePackage eINSTANCE = org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ACTION_PROTOTYPE = CorePackage.RESOURCE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DISKS = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NETWORK_INTERFACES = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__IMAGE = CorePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SIZE = CorePackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.DiskImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ACTION_PROTOTYPE = CorePackage.RESOURCE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TYPE = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SIZE = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.DiskTypeImpl <em>Disk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.DiskTypeImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getDiskType()
	 * @generated
	 */
	int DISK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__ACTION_PROTOTYPE = CorePackage.AZURE_ELEMENT__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__DISKS = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineSizeImpl <em>Virtual Machine Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineSizeImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineSize()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__ACTION_PROTOTYPE = CorePackage.AZURE_ELEMENT__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Virtual Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__VIRTUAL_MACHINES = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Machine Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImageImpl <em>Virtual Machine Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImageImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineImage()
	 * @generated
	 */
	int VIRTUAL_MACHINE_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__ACTION_PROTOTYPE = CorePackage.AZURE_ELEMENT__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Virtual Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineScaleSetImpl <em>Virtual Machine Scale Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineScaleSetImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineScaleSet()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SCALE_SET = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__MARKERS = VIRTUAL_MACHINE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__URIS = VIRTUAL_MACHINE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__DESCRIPTION = VIRTUAL_MACHINE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__UUID = VIRTUAL_MACHINE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__ACTION_PROTOTYPE = VIRTUAL_MACHINE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__REPRESENTATIONS = VIRTUAL_MACHINE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__ANNOTATIONS = VIRTUAL_MACHINE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__START = VIRTUAL_MACHINE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__END = VIRTUAL_MACHINE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__DURATION = VIRTUAL_MACHINE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__NAME = VIRTUAL_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__DOCUMENTATION = VIRTUAL_MACHINE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__ID = VIRTUAL_MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__ACTION_ROLE = VIRTUAL_MACHINE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__VIEWS = VIRTUAL_MACHINE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__EVENTS = VIRTUAL_MACHINE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__STAGES = VIRTUAL_MACHINE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__FACETS = VIRTUAL_MACHINE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__PROPERTIES = VIRTUAL_MACHINE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__IMPACTED_BY = VIRTUAL_MACHINE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__TAGS = VIRTUAL_MACHINE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__VIEW_ELEMENTS = VIRTUAL_MACHINE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__LOCATIONS = VIRTUAL_MACHINE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__RESOURCE_TAGS = VIRTUAL_MACHINE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__DISKS = VIRTUAL_MACHINE__DISKS;

	/**
	 * The feature id for the '<em><b>Network Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__NETWORK_INTERFACES = VIRTUAL_MACHINE__NETWORK_INTERFACES;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__IMAGE = VIRTUAL_MACHINE__IMAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__SIZE = VIRTUAL_MACHINE__SIZE;

	/**
	 * The number of structural features of the '<em>Virtual Machine Scale Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET_FEATURE_COUNT = VIRTUAL_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Machine Scale Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET_OPERATION_COUNT = VIRTUAL_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.AppServiceImpl <em>App Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.AppServiceImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getAppService()
	 * @generated
	 */
	int APP_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__ACTION_PROTOTYPE = CorePackage.RESOURCE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The number of structural features of the '<em>App Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>App Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ContainerInstanceImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getContainerInstance()
	 * @generated
	 */
	int CONTAINER_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__MARKERS = NetworkingPackage.SUBNET_RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__URIS = NetworkingPackage.SUBNET_RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__DESCRIPTION = NetworkingPackage.SUBNET_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__UUID = NetworkingPackage.SUBNET_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__ACTION_PROTOTYPE = NetworkingPackage.SUBNET_RESOURCE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__REPRESENTATIONS = NetworkingPackage.SUBNET_RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__ANNOTATIONS = NetworkingPackage.SUBNET_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__START = NetworkingPackage.SUBNET_RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__END = NetworkingPackage.SUBNET_RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__DURATION = NetworkingPackage.SUBNET_RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__NAME = NetworkingPackage.SUBNET_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__DOCUMENTATION = NetworkingPackage.SUBNET_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__ID = NetworkingPackage.SUBNET_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__ACTION_ROLE = NetworkingPackage.SUBNET_RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__VIEWS = NetworkingPackage.SUBNET_RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__EVENTS = NetworkingPackage.SUBNET_RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__STAGES = NetworkingPackage.SUBNET_RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__FACETS = NetworkingPackage.SUBNET_RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__PROPERTIES = NetworkingPackage.SUBNET_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__IMPACTED_BY = NetworkingPackage.SUBNET_RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__TAGS = NetworkingPackage.SUBNET_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__VIEW_ELEMENTS = NetworkingPackage.SUBNET_RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__LOCATIONS = NetworkingPackage.SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__RESOURCE_TAGS = NetworkingPackage.SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__SUBNET = NetworkingPackage.SUBNET_RESOURCE__SUBNET;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__IMAGE = NetworkingPackage.SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_FEATURE_COUNT = NetworkingPackage.SUBNET_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_OPERATION_COUNT = NetworkingPackage.SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.KubernetesServiceImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getKubernetesService()
	 * @generated
	 */
	int KUBERNETES_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__MARKERS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__URIS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__DESCRIPTION = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__UUID = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Action Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ACTION_PROTOTYPE = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__ACTION_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__REPRESENTATIONS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ANNOTATIONS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__START = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__END = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__DURATION = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__NAME = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__DOCUMENTATION = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ID = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ACTION_ROLE = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__VIEWS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__EVENTS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__STAGES = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__FACETS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__PROPERTIES = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__IMPACTED_BY = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__TAGS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__VIEW_ELEMENTS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__LOCATIONS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__RESOURCE_TAGS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Virtual Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__VIRTUAL_NETWORK = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK;

	/**
	 * The number of structural features of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_FEATURE_COUNT = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_OPERATION_COUNT = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disks</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getDisks()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Disks();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getNetworkInterfaces <em>Network Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Interfaces</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getNetworkInterfaces()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_NetworkInterfaces();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getImage()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Image();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine#getSize()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.architecture.cloud.azure.compute.Disk#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.Disk#getType()
	 * @see #getDisk()
	 * @generated
	 */
	EReference getDisk_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.architecture.cloud.azure.compute.Disk#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.Disk#getSize()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.DiskType <em>Disk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk Type</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.DiskType
	 * @generated
	 */
	EClass getDiskType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.architecture.cloud.azure.compute.DiskType#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disks</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.DiskType#getDisks()
	 * @see #getDiskType()
	 * @generated
	 */
	EReference getDiskType_Disks();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachineSize <em>Virtual Machine Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Size</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachineSize
	 * @generated
	 */
	EClass getVirtualMachineSize();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachineSize#getVirtualMachines <em>Virtual Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machines</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachineSize#getVirtualMachines()
	 * @see #getVirtualMachineSize()
	 * @generated
	 */
	EReference getVirtualMachineSize_VirtualMachines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachineImage <em>Virtual Machine Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Image</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachineImage
	 * @generated
	 */
	EClass getVirtualMachineImage();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachineImage#getVirtualMachines <em>Virtual Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machines</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachineImage#getVirtualMachines()
	 * @see #getVirtualMachineImage()
	 * @generated
	 */
	EReference getVirtualMachineImage_VirtualMachines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachineScaleSet <em>Virtual Machine Scale Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Scale Set</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachineScaleSet
	 * @generated
	 */
	EClass getVirtualMachineScaleSet();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.AppService <em>App Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Service</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.AppService
	 * @generated
	 */
	EClass getAppService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Instance</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.ContainerInstance
	 * @generated
	 */
	EClass getContainerInstance();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.KubernetesService <em>Kubernetes Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Service</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.KubernetesService
	 * @generated
	 */
	EClass getKubernetesService();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputeFactory getComputeFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();
		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__DISKS = eINSTANCE.getVirtualMachine_Disks();
		/**
		 * The meta object literal for the '<em><b>Network Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__NETWORK_INTERFACES = eINSTANCE.getVirtualMachine_NetworkInterfaces();
		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__IMAGE = eINSTANCE.getVirtualMachine_Image();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__SIZE = eINSTANCE.getVirtualMachine_Size();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.DiskImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISK__TYPE = eINSTANCE.getDisk_Type();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__SIZE = eINSTANCE.getDisk_Size();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.DiskTypeImpl <em>Disk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.DiskTypeImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getDiskType()
		 * @generated
		 */
		EClass DISK_TYPE = eINSTANCE.getDiskType();
		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISK_TYPE__DISKS = eINSTANCE.getDiskType_Disks();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineSizeImpl <em>Virtual Machine Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineSizeImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineSize()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SIZE = eINSTANCE.getVirtualMachineSize();
		/**
		 * The meta object literal for the '<em><b>Virtual Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SIZE__VIRTUAL_MACHINES = eINSTANCE.getVirtualMachineSize_VirtualMachines();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImageImpl <em>Virtual Machine Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImageImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineImage()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_IMAGE = eINSTANCE.getVirtualMachineImage();
		/**
		 * The meta object literal for the '<em><b>Virtual Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES = eINSTANCE.getVirtualMachineImage_VirtualMachines();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineScaleSetImpl <em>Virtual Machine Scale Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineScaleSetImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachineScaleSet()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SCALE_SET = eINSTANCE.getVirtualMachineScaleSet();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.AppServiceImpl <em>App Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.AppServiceImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getAppService()
		 * @generated
		 */
		EClass APP_SERVICE = eINSTANCE.getAppService();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ContainerInstanceImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getContainerInstance()
		 * @generated
		 */
		EClass CONTAINER_INSTANCE = eINSTANCE.getContainerInstance();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.KubernetesServiceImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getKubernetesService()
		 * @generated
		 */
		EClass KUBERNETES_SERVICE = eINSTANCE.getKubernetesService();

	}

} //ComputePackage
