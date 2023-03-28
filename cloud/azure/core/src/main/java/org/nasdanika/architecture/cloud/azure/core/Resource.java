/**
 */
package org.nasdanika.architecture.cloud.azure.core;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.StringProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource is an entity managed by Azure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.core.Resource#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.core.Resource#getResourceTags <em>Resource Tags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.cloud.azure.core.CorePackage#getResource()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika description='An entity managed by Azure'"
 * @generated
 */
public interface Resource extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.cloud.azure.core.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource can be associated with zero or more locations. E.g. a VM can be deployed to a region or a specific availability zone in a region. A kubernetes cluster can be deployed to several availability zones.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see org.nasdanika.architecture.cloud.azure.core.CorePackage#getResource_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Resource Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ncore.StringProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Tags</em>' containment reference list.
	 * @see org.nasdanika.architecture.cloud.azure.core.CorePackage#getResource_ResourceTags()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<StringProperty> getResourceTags();

} // Resource
