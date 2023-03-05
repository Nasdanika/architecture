/**
 */
package org.nasdanika.architecture.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.architecture.core.ActionRole;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.View;
import org.nasdanika.architecture.core.ViewElement;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getActionRole <em>Action Role</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ViewElementImpl#getArchitectureElement <em>Architecture Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewElementImpl extends NamedElementImpl implements ViewElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActionRole() <em>Action Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionRole()
	 * @generated
	 * @ordered
	 */
	protected static final ActionRole ACTION_ROLE_EDEFAULT = ActionRole.CHILD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CorePackage.VIEW_ELEMENT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CorePackage.VIEW_ELEMENT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CorePackage.VIEW_ELEMENT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRole getActionRole() {
		return (ActionRole)eDynamicGet(CorePackage.VIEW_ELEMENT__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionRole(ActionRole newActionRole) {
		eDynamicSet(CorePackage.VIEW_ELEMENT__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, newActionRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<View> getViews() {
		return (EList<View>)eDynamicGet(CorePackage.VIEW_ELEMENT__VIEWS, CorePackage.Literals.MODEL_ELEMENT__VIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewElement> getChildren() {
		return (EList<ViewElement>)eDynamicGet(CorePackage.VIEW_ELEMENT__CHILDREN, CorePackage.Literals.VIEW_ELEMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureElement getArchitectureElement() {
		return (ArchitectureElement)eDynamicGet(CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, CorePackage.Literals.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElement basicGetArchitectureElement() {
		return (ArchitectureElement)eDynamicGet(CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, CorePackage.Literals.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitectureElement(ArchitectureElement newArchitectureElement) {
		eDynamicSet(CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, CorePackage.Literals.VIEW_ELEMENT__ARCHITECTURE_ELEMENT, newArchitectureElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.VIEW_ELEMENT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case CorePackage.VIEW_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.VIEW_ELEMENT__ID:
				return getId();
			case CorePackage.VIEW_ELEMENT__ACTION_ROLE:
				return getActionRole();
			case CorePackage.VIEW_ELEMENT__VIEWS:
				return getViews();
			case CorePackage.VIEW_ELEMENT__CHILDREN:
				return getChildren();
			case CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT:
				if (resolve) return getArchitectureElement();
				return basicGetArchitectureElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.VIEW_ELEMENT__ID:
				setId((String)newValue);
				return;
			case CorePackage.VIEW_ELEMENT__ACTION_ROLE:
				setActionRole((ActionRole)newValue);
				return;
			case CorePackage.VIEW_ELEMENT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case CorePackage.VIEW_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ViewElement>)newValue);
				return;
			case CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT:
				setArchitectureElement((ArchitectureElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.VIEW_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.VIEW_ELEMENT__ACTION_ROLE:
				setActionRole(ACTION_ROLE_EDEFAULT);
				return;
			case CorePackage.VIEW_ELEMENT__VIEWS:
				getViews().clear();
				return;
			case CorePackage.VIEW_ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT:
				setArchitectureElement((ArchitectureElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.VIEW_ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CorePackage.VIEW_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CorePackage.VIEW_ELEMENT__ACTION_ROLE:
				return getActionRole() != ACTION_ROLE_EDEFAULT;
			case CorePackage.VIEW_ELEMENT__VIEWS:
				return !getViews().isEmpty();
			case CorePackage.VIEW_ELEMENT__CHILDREN:
				return !getChildren().isEmpty();
			case CorePackage.VIEW_ELEMENT__ARCHITECTURE_ELEMENT:
				return basicGetArchitectureElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CorePackage.VIEW_ELEMENT__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CorePackage.VIEW_ELEMENT__DOCUMENTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ViewElementImpl
