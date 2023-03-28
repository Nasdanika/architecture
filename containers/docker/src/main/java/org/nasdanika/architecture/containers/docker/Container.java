/**
 */
package org.nasdanika.architecture.containers.docker;

import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.containers.docker.Container#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Image)
	 * @see org.nasdanika.architecture.containers.docker.DockerPackage#getContainer_Image()
	 * @model annotation="urn:org.nasdanika opposite='containers'"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.containers.docker.Container#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

} // Container
