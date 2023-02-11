/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transition of the containing architecture element from the baseline state identified by the increment start to the target state identified by the increment end.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Increment#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getIncrement()
 * @model
 * @generated
 */
public interface Increment extends ArchitectureElement {

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impacts of this increment on architecture elements. E.g. creation of a new element, modification or retirement (deletion) of an existing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacts</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getIncrement_Impacts()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Impact> getImpacts();
} // Increment
