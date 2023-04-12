/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	String eNS_URI = "ecore://nasdanika.org/architecture/cloud/azure/networking";

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
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__SUBNETS = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__RESOURCES = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkResourceImpl <em>Virtual Network Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkResourceImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getVirtualNetworkResource()
	 * @generated
	 */
	int VIRTUAL_NETWORK_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Virtual Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.SubnetImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__RESOURCES = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl <em>Subnet Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getSubnetResource()
	 * @generated
	 */
	int SUBNET_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__SUBNET = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnet Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subnet Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkInterfaceImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__MARKERS = SUBNET_RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__URIS = SUBNET_RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__DESCRIPTION = SUBNET_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__UUID = SUBNET_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__LABEL_PROTOTYPE = SUBNET_RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__REPRESENTATIONS = SUBNET_RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ANNOTATIONS = SUBNET_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__START = SUBNET_RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__END = SUBNET_RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__DURATION = SUBNET_RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = SUBNET_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__DOCUMENTATION = SUBNET_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ID = SUBNET_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ACTION_ROLE = SUBNET_RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__VIEWS = SUBNET_RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__EVENTS = SUBNET_RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__STAGES = SUBNET_RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__FACETS = SUBNET_RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__PROPERTIES = SUBNET_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__IMPACTED_BY = SUBNET_RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__TAGS = SUBNET_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__VIEW_ELEMENTS = SUBNET_RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__LOCATIONS = SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__RESOURCE_TAGS = SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__SUBNET = SUBNET_RESOURCE__SUBNET;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.ServiceImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MARKERS = CorePackage.RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__URIS = CorePackage.RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = CorePackage.RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__UUID = CorePackage.RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LABEL_PROTOTYPE = CorePackage.RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REPRESENTATIONS = CorePackage.RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANNOTATIONS = CorePackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__START = CorePackage.RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__END = CorePackage.RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DURATION = CorePackage.RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = CorePackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION = CorePackage.RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = CorePackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACTION_ROLE = CorePackage.RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VIEWS = CorePackage.RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EVENTS = CorePackage.RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STAGES = CorePackage.RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FACETS = CorePackage.RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROPERTIES = CorePackage.RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMPACTED_BY = CorePackage.RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TAGS = CorePackage.RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VIEW_ELEMENTS = CorePackage.RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOCATIONS = CorePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOURCE_TAGS = CorePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENDPOINTS = CorePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CorePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = CorePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.ServiceEndpointImpl <em>Service Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.ServiceEndpointImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getServiceEndpoint()
	 * @generated
	 */
	int SERVICE_ENDPOINT = 6;

	/**
	 * The number of structural features of the '<em>Service Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.PrivateEnpointImpl <em>Private Enpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.PrivateEnpointImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getPrivateEnpoint()
	 * @generated
	 */
	int PRIVATE_ENPOINT = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__MARKERS = SUBNET_RESOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__URIS = SUBNET_RESOURCE__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__DESCRIPTION = SUBNET_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__UUID = SUBNET_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__LABEL_PROTOTYPE = SUBNET_RESOURCE__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__REPRESENTATIONS = SUBNET_RESOURCE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__ANNOTATIONS = SUBNET_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__START = SUBNET_RESOURCE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__END = SUBNET_RESOURCE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__DURATION = SUBNET_RESOURCE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__NAME = SUBNET_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__DOCUMENTATION = SUBNET_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__ID = SUBNET_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__ACTION_ROLE = SUBNET_RESOURCE__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__VIEWS = SUBNET_RESOURCE__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__EVENTS = SUBNET_RESOURCE__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__STAGES = SUBNET_RESOURCE__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__FACETS = SUBNET_RESOURCE__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__PROPERTIES = SUBNET_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__IMPACTED_BY = SUBNET_RESOURCE__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__TAGS = SUBNET_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__VIEW_ELEMENTS = SUBNET_RESOURCE__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__LOCATIONS = SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__RESOURCE_TAGS = SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__SUBNET = SUBNET_RESOURCE__SUBNET;

	/**
	 * The number of structural features of the '<em>Private Enpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT_FEATURE_COUNT = SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Enpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT_OPERATION_COUNT = SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.PublicEndpointImpl <em>Public Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.PublicEndpointImpl
	 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getPublicEndpoint()
	 * @generated
	 */
	int PUBLIC_ENDPOINT = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__MARKERS = CorePackage.AZURE_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__URIS = CorePackage.AZURE_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__DESCRIPTION = CorePackage.AZURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__UUID = CorePackage.AZURE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__LABEL_PROTOTYPE = CorePackage.AZURE_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__REPRESENTATIONS = CorePackage.AZURE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__ANNOTATIONS = CorePackage.AZURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__START = CorePackage.AZURE_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__END = CorePackage.AZURE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__DURATION = CorePackage.AZURE_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__NAME = CorePackage.AZURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__DOCUMENTATION = CorePackage.AZURE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__ID = CorePackage.AZURE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Action Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__ACTION_ROLE = CorePackage.AZURE_ELEMENT__ACTION_ROLE;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__VIEWS = CorePackage.AZURE_ELEMENT__VIEWS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__EVENTS = CorePackage.AZURE_ELEMENT__EVENTS;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__STAGES = CorePackage.AZURE_ELEMENT__STAGES;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__FACETS = CorePackage.AZURE_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__PROPERTIES = CorePackage.AZURE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Impacted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__IMPACTED_BY = CorePackage.AZURE_ELEMENT__IMPACTED_BY;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__TAGS = CorePackage.AZURE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT__VIEW_ELEMENTS = CorePackage.AZURE_ELEMENT__VIEW_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Public Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT_FEATURE_COUNT = CorePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT_OPERATION_COUNT = CorePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getSubnets()
	 * @see #getVirtualNetwork()
	 * @generated
	 */
	EReference getVirtualNetwork_Subnets();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getResources()
	 * @see #getVirtualNetwork()
	 * @generated
	 */
	EReference getVirtualNetwork_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource <em>Virtual Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network Resource</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource
	 * @generated
	 */
	EClass getVirtualNetworkResource();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource#getVirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Network</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource#getVirtualNetwork()
	 * @see #getVirtualNetworkResource()
	 * @generated
	 */
	EReference getVirtualNetworkResource_VirtualNetwork();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.architecture.cloud.azure.networking.Subnet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Subnet#getResources()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource <em>Subnet Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Resource</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.SubnetResource
	 * @generated
	 */
	EClass getSubnetResource();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnet</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.SubnetResource#getSubnet()
	 * @see #getSubnetResource()
	 * @generated
	 */
	EReference getSubnetResource_Subnet();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.architecture.cloud.azure.networking.Service#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Service#getEndpoints()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Endpoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.ServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Endpoint</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.ServiceEndpoint
	 * @generated
	 */
	EClass getServiceEndpoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.PrivateEnpoint <em>Private Enpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Enpoint</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.PrivateEnpoint
	 * @generated
	 */
	EClass getPrivateEnpoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.networking.PublicEndpoint <em>Public Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Endpoint</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.networking.PublicEndpoint
	 * @generated
	 */
	EClass getPublicEndpoint();

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
		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK__SUBNETS = eINSTANCE.getVirtualNetwork_Subnets();
		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK__RESOURCES = eINSTANCE.getVirtualNetwork_Resources();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkResourceImpl <em>Virtual Network Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.VirtualNetworkResourceImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getVirtualNetworkResource()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK_RESOURCE = eINSTANCE.getVirtualNetworkResource();
		/**
		 * The meta object literal for the '<em><b>Virtual Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK = eINSTANCE.getVirtualNetworkResource_VirtualNetwork();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.SubnetImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();
		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__RESOURCES = eINSTANCE.getSubnet_Resources();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl <em>Subnet Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getSubnetResource()
		 * @generated
		 */
		EClass SUBNET_RESOURCE = eINSTANCE.getSubnetResource();
		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET_RESOURCE__SUBNET = eINSTANCE.getSubnetResource_Subnet();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkInterfaceImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.ServiceImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();
		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENDPOINTS = eINSTANCE.getService_Endpoints();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.ServiceEndpointImpl <em>Service Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.ServiceEndpointImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getServiceEndpoint()
		 * @generated
		 */
		EClass SERVICE_ENDPOINT = eINSTANCE.getServiceEndpoint();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.PrivateEnpointImpl <em>Private Enpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.PrivateEnpointImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getPrivateEnpoint()
		 * @generated
		 */
		EClass PRIVATE_ENPOINT = eINSTANCE.getPrivateEnpoint();
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.networking.impl.PublicEndpointImpl <em>Public Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.PublicEndpointImpl
		 * @see org.nasdanika.architecture.cloud.azure.networking.impl.NetworkingPackageImpl#getPublicEndpoint()
		 * @generated
		 */
		EClass PUBLIC_ENDPOINT = eINSTANCE.getPublicEndpoint();

	}

} //NetworkingPackage
