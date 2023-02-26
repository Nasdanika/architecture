/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of view - a specification of the conventions for a particular kind of view, a meta-view.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.Viewpoint#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.Viewpoint#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concerns framed by this viewpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getViewpoint_Concerns()
	 * @model keys="id"
	 * @generated
	 */
	EList<Concern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Views of this type. A computed opposite to View.viewpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getViewpoint_Instances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<View> getInstances();

} // Viewpoint
