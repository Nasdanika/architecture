/**
 */
package org.nasdanika.architecture.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Architecture (description) contains architecture elements and reference data such as impact types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Architecture#getImpactTypes <em>Impact Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends Domain {
	/**
	 * Returns the value of the '<em><b>Impact Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Types</em>' containment reference.
	 * @see #setImpactTypes(ImpactType)
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitecture_ImpactTypes()
	 * @model containment="true" keys="id"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	ImpactType getImpactTypes();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.Architecture#getImpactTypes <em>Impact Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Types</em>' containment reference.
	 * @see #getImpactTypes()
	 * @generated
	 */
	void setImpactTypes(ImpactType value);

} // Architecture
