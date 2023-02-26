/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interest in a system relevant to one or more of its stakeholders.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Concern#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.Concern#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stakeholders to whom this concerns is relevant. A computed opposite to Stakeholder.concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stakeholders</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getConcern_Stakeholders()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Stakeholder> getStakeholders();

	/**
	 * Returns the value of the '<em><b>Viewpoints</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Viewpoints framing this concern. A computed opposite to Viewpoint.concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoints</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getConcern_Viewpoints()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Viewpoint> getViewpoints();

} // Concern
