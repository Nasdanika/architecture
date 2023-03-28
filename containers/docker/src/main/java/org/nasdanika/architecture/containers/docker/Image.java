/**
 */
package org.nasdanika.architecture.containers.docker;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Image#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Image#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Image#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Image#getRegistries <em>Registries</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends ArchitectureElement {

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Image)
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getImage_From()
	 * @model annotation="urn:org.nasdanika opposite='children'"
	 * @generated
	 */
	Image getFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.containers.docker.Image#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Image value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.containers.docker.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to from - images for which this image is the parent, i.e. it is referenced in the FROM clause.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getImage_Children()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Image> getChildren();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.containers.docker.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to Container.image
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getImage_Containers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Registries</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.containers.docker.Registry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to Registry.images - registries to which this image is published
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registries</em>' reference list.
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getImage_Registries()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Registry> getRegistries();
} // Image
