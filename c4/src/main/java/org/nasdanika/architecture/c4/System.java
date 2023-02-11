/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A software system is the highest level of abstraction and describes something that delivers value to its users, whether they are human or not. This includes the software system you are modelling, and the other software systems upon which your software system depends (or vice versa). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.System#isExternal <em>External</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.System#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.System#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getSystem()
 * @model
 * @generated
 */
public interface System extends Node {
	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the system is external to the system (landscape) described by the architecture. In other words it is not part of the system (landscape), but belongs to the system context/surroundings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.nasdanika.architecture.c4.C4Package#getSystem_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.c4.System#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Containers consituting the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getSystem_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsystem is a logical grouping of related containers and subsystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getSystem_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<System> getSubsystems();

} // System
