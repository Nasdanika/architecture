/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.View#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.View#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getView()
 * @model
 * @generated
 */
public interface View extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * View type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint</em>' reference.
	 * @see #setViewpoint(Viewpoint)
	 * @see org.nasdanika.architecture.core.CorePackage#getView_Viewpoint()
	 * @model annotation="urn:org.nasdanika opposite='instances'"
	 * @generated
	 */
	Viewpoint getViewpoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.View#getViewpoint <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' reference.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(Viewpoint value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * View elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getView_Elements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ViewElement> getElements();

} // View
