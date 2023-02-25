/**
 */
package org.nasdanika.architecture.c4;

import org.nasdanika.architecture.core.Node;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person represents one of the human users of your software system (e.g. actors, roles, personas, etc).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Person#isExternal <em>External</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getPerson()
 * @model
 * @generated
 */
public interface Person extends Node {
	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the person is external to the system described by the architecture. In other words it is not part of the system, but belongs to the system context/surroundings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.nasdanika.architecture.c4.C4Package#getPerson_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.c4.Person#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

} // Person
