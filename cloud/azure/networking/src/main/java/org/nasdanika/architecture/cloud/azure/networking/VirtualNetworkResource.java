/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.nasdanika.architecture.cloud.azure.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Network Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for resources connected to a Virtual Network
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource#getVirtualNetwork <em>Virtual Network</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getVirtualNetworkResource()
 * @model abstract="true"
 * @generated
 */
public interface VirtualNetworkResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Virtual Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Network</em>' reference.
	 * @see #setVirtualNetwork(VirtualNetworkResource)
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getVirtualNetworkResource_VirtualNetwork()
	 * @model annotation="urn:org.nasdanika opposite='resources'"
	 * @generated
	 */
	VirtualNetworkResource getVirtualNetwork();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource#getVirtualNetwork <em>Virtual Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Network</em>' reference.
	 * @see #getVirtualNetwork()
	 * @generated
	 */
	void setVirtualNetwork(VirtualNetworkResource value);

} // VirtualNetworkResource
