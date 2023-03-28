/**
 */
package org.nasdanika.architecture.containers.docker;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Registry#getImages <em>Images</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getRegistry()
 * @model
 * @generated
 */
public interface Registry extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Images</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.containers.docker.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' reference list.
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getRegistry_Images()
	 * @model annotation="urn:org.nasdanika opposite='registries'"
	 * @generated
	 */
	EList<Image> getImages();

} // Registry
