/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for classes which leverage technologies, e.g. a container or a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.TechnologyConsumer#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getTechnologyConsumer()
 * @model
 * @generated
 */
public interface TechnologyConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technologies used by this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technology</em>' reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getTechnologyConsumer_Technology()
	 * @model annotation="urn:org.nasdanika opposite='uses'"
	 * @generated
	 */
	EList<Technology> getTechnology();

} // TechnologyConsumer
