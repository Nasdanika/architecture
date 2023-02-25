/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transition of the containing architecture element from the baseline state identified by the stage start to the target state identified by the stage end. For example, "Development" stage or "End of Life/Deprecated" stage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Stage#getImpacts <em>Impacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impacts of this increment on architecture elements. E.g. creation of a new element, modification or retirement (deletion) of an existing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacts</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getStage_Impacts()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<Impact> getImpacts();

} // Stage
