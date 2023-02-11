/**
 */
package org.nasdanika.architecture.c4;

import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship between two nodes. Relationships are contained by their source nodes and reference their targets using the target reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ArchitectureElement, TechnologyConsumer {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.nasdanika.architecture.c4.C4Package#getRelationship_Target()
	 * @model annotation="urn:org.nasdanika opposite='incomingRelationships' default-feature='true'"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.c4.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Relationship
