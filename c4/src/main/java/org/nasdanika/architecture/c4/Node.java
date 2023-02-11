/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source and target of relationships
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Node#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.Node#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getNode()
 * @model
 * @generated
 */
public interface Node extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing relationships
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Relationships</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getNode_OutgoingRelationships()
	 * @model containment="true" keys="id"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<Relationship> getOutgoingRelationships();

	/**
	 * Returns the value of the '<em><b>Incoming Relationships</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming relationships - a computed opposite to Relationship.target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Relationships</em>' reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getNode_IncomingRelationships()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Relationship> getIncomingRelationships();

} // Node
