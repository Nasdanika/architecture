/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.architecture.core.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Container#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.Container#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getContainer()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/container.md'"
 * @generated
 */
public interface Container extends Node, TechnologyConsumer {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Components consituting the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getContainer_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Containers can be nested. E.g. Tomcat may be running in a Docker container and serve multiple applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getContainer_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getChildren();

} // Container
