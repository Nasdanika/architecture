/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Domain is a grouping construct for architecture elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Domain#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getDomain_Elements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ArchitectureElement> getElements();

} // Domain
