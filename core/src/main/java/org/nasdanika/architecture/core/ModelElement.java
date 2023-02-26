/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Named and documented element with an ID.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.ModelElement#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ModelElement#getActionRole <em>Action Role</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ModelElement#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelElement extends NamedElement, Documented {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element ID to use as EKey - a unique identifier of this element among its siblings in the parent's containment reference. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.architecture.core.CorePackage#getModelElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.ModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Action Role</b></em>' attribute.
	 * The default value is <code>"CHILD"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.architecture.core.ActionRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Role</em>' attribute.
	 * @see org.nasdanika.architecture.core.ActionRole
	 * @see #setActionRole(ActionRole)
	 * @see org.nasdanika.architecture.core.CorePackage#getModelElement_ActionRole()
	 * @model default="CHILD"
	 * @generated
	 */
	ActionRole getActionRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.architecture.core.ModelElement#getActionRole <em>Action Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Role</em>' attribute.
	 * @see org.nasdanika.architecture.core.ActionRole
	 * @see #getActionRole()
	 * @generated
	 */
	void setActionRole(ActionRole value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getModelElement_Views()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<View> getViews();

} // ModelElement
