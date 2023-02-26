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
import org.nasdanika.architecture.core.Impact;
import org.nasdanika.architecture.core.ImpactType;

import org.nasdanika.architecture.core.View;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getActionRole <em>Action Role</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ImpactImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends NamedElementImpl implements Impact {
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
	protected ImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CorePackage.IMPACT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CorePackage.IMPACT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CorePackage.IMPACT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRole getActionRole() {
		return (ActionRole)eDynamicGet(CorePackage.IMPACT__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionRole(ActionRole newActionRole) {
		eDynamicSet(CorePackage.IMPACT__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, newActionRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<View> getViews() {
		return (EList<View>)eDynamicGet(CorePackage.IMPACT__VIEWS, CorePackage.Literals.MODEL_ELEMENT__VIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactType getType() {
		return (ImpactType)eDynamicGet(CorePackage.IMPACT__TYPE, CorePackage.Literals.IMPACT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactType basicGetType() {
		return (ImpactType)eDynamicGet(CorePackage.IMPACT__TYPE, CorePackage.Literals.IMPACT__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ImpactType newType) {
		eDynamicSet(CorePackage.IMPACT__TYPE, CorePackage.Literals.IMPACT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArchitectureElement> getElements() {
		return (EList<ArchitectureElement>)eDynamicGet(CorePackage.IMPACT__ELEMENTS, CorePackage.Literals.IMPACT__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMPACT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.IMPACT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IMPACT__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.IMPACT__ID:
				return getId();
			case CorePackage.IMPACT__ACTION_ROLE:
				return getActionRole();
			case CorePackage.IMPACT__VIEWS:
				return getViews();
			case CorePackage.IMPACT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CorePackage.IMPACT__ELEMENTS:
				return getElements();
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
			case CorePackage.IMPACT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.IMPACT__ID:
				setId((String)newValue);
				return;
			case CorePackage.IMPACT__ACTION_ROLE:
				setActionRole((ActionRole)newValue);
				return;
			case CorePackage.IMPACT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case CorePackage.IMPACT__TYPE:
				setType((ImpactType)newValue);
				return;
			case CorePackage.IMPACT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ArchitectureElement>)newValue);
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
			case CorePackage.IMPACT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.IMPACT__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.IMPACT__ACTION_ROLE:
				setActionRole(ACTION_ROLE_EDEFAULT);
				return;
			case CorePackage.IMPACT__VIEWS:
				getViews().clear();
				return;
			case CorePackage.IMPACT__TYPE:
				setType((ImpactType)null);
				return;
			case CorePackage.IMPACT__ELEMENTS:
				getElements().clear();
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
			case CorePackage.IMPACT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CorePackage.IMPACT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CorePackage.IMPACT__ACTION_ROLE:
				return getActionRole() != ACTION_ROLE_EDEFAULT;
			case CorePackage.IMPACT__VIEWS:
				return !getViews().isEmpty();
			case CorePackage.IMPACT__TYPE:
				return basicGetType() != null;
			case CorePackage.IMPACT__ELEMENTS:
				return !getElements().isEmpty();
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
				case CorePackage.IMPACT__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CorePackage.IMPACT__DOCUMENTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ImpactImpl
