/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.architecture.cloud.azure.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getVirtualNetwork()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/10061-icon-service-Virtual-Networks.svg' label='Virtual Network'"
 * @generated
 */
public interface VirtualNetwork extends Resource {

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.cloud.azure.networking.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getVirtualNetwork_Subnets()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources connected to this Virtual Network. Computed opposite to VirtualNetworkResource.virtualNetwork
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getVirtualNetwork_Resources()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VirtualNetworkResource> getResources();
} // VirtualNetwork
