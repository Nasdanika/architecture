/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Impacts of the containing increment on architecture elements. E.g. creation of a new element, modification or retirement (deletion) of an existing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Impact#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.Impact#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impact type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ImpactType)
	 * @see org.nasdanika.architecture.core.CorePackage#getImpact_Type()
	 * @model
	 * @generated
	 */
	ImpactType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.Impact#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ImpactType value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impacted element(s)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getImpact_Elements()
	 * @model annotation="urn:org.nasdanika opposite='impactedBy'"
	 * @generated
	 */
	EList<ArchitectureElement> getElements();

} // Impact
