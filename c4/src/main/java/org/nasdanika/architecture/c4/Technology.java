/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.architecture.core.ArchitectureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class representing some technology. E.g. a software product or its version.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Technology#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.TechnologyConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uses of this technology - computed opposite to TechnologyConsumer.technology
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getTechnology_Uses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TechnologyConsumer> getUses();

} // Technology
