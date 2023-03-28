/**
 */
package org.nasdanika.architecture.cloud.azure.networking;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.architecture.cloud.azure.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.networking.Subnet#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends Resource {

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources connected to this subnet. Computed opposite to SubnetResource.subnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage#getSubnet_Resources()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SubnetResource> getResources();
} // Subnet
