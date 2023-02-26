/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A party (individual, team, organization, or class thereof) having an interest in a system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Stakeholder#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stakeholder's concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getStakeholder_Concerns()
	 * @model keys="id"
	 *        annotation="urn:org.nasdanika opposite='stakeholders'"
	 * @generated
	 */
	EList<Concern> getConcerns();

} // Stakeholder
