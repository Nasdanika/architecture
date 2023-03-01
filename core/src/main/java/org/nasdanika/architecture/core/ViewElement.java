/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.ViewElement#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ViewElement#getArchitectureElement <em>Architecture Element</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getViewElement()
 * @model
 * @generated
 */
public interface ViewElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element children
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getViewElement_Children()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ViewElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Architecture Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture element represented by this view element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Architecture Element</em>' reference.
	 * @see #setArchitectureElement(ArchitectureElement)
	 * @see org.nasdanika.architecture.core.CorePackage#getViewElement_ArchitectureElement()
	 * @model annotation="urn:org.nasdanika opposite='viewElements' default-feature='true'"
	 * @generated
	 */
	ArchitectureElement getArchitectureElement();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.ViewElement#getArchitectureElement <em>Architecture Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Element</em>' reference.
	 * @see #getArchitectureElement()
	 * @generated
	 */
	void setArchitectureElement(ArchitectureElement value);

} // ViewElement
