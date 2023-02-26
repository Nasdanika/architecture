/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tags allow to categorize architecture elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Tag#getTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Tagged</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture elements tagged with this tag. A computed opposite to ArchitectureElement.tags
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagged</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getTag_Tagged()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ArchitectureElement> getTagged();

} // Tag
