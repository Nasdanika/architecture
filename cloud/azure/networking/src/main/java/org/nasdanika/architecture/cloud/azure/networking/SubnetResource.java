/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.nasdanika.architecture.cloud.azure.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for resources connected to a Subnet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getSubnetResource()
 * @model abstract="true"
 * @generated
 */
public interface SubnetResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' reference.
	 * @see #setSubnet(Subnet)
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getSubnetResource_Subnet()
	 * @model annotation="urn:org.nasdanika opposite='resources'"
	 * @generated
	 */
	Subnet getSubnet();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource#getSubnet <em>Subnet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' reference.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(Subnet value);

} // SubnetResource
