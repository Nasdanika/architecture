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
import org.nasdanika.architecture.core.Tag;

import org.nasdanika.architecture.core.View;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.ncore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.TagImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.TagImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.TagImpl#getActionRole <em>Action Role</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.TagImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.TagImpl#getTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends NamedElementImpl implements Tag {
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
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CorePackage.TAG__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CorePackage.TAG__ID, CorePackage.Literals.MODEL_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CorePackage.TAG__ID, CorePackage.Literals.MODEL_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRole getActionRole() {
		return (ActionRole)eDynamicGet(CorePackage.TAG__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionRole(ActionRole newActionRole) {
		eDynamicSet(CorePackage.TAG__ACTION_ROLE, CorePackage.Literals.MODEL_ELEMENT__ACTION_ROLE, newActionRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<View> getViews() {
		return (EList<View>)eDynamicGet(CorePackage.TAG__VIEWS, CorePackage.Literals.MODEL_ELEMENT__VIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ArchitectureElement> getTagged() {
		return getOppositeReferrers(CorePackage.Literals.TAG__TAGGED);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TAG__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.TAG__VIEWS:
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
			case CorePackage.TAG__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.TAG__ID:
				return getId();
			case CorePackage.TAG__ACTION_ROLE:
				return getActionRole();
			case CorePackage.TAG__VIEWS:
				return getViews();
			case CorePackage.TAG__TAGGED:
				return getTagged();
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
			case CorePackage.TAG__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.TAG__ID:
				setId((String)newValue);
				return;
			case CorePackage.TAG__ACTION_ROLE:
				setActionRole((ActionRole)newValue);
				return;
			case CorePackage.TAG__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
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
			case CorePackage.TAG__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.TAG__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.TAG__ACTION_ROLE:
				setActionRole(ACTION_ROLE_EDEFAULT);
				return;
			case CorePackage.TAG__VIEWS:
				getViews().clear();
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
			case CorePackage.TAG__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CorePackage.TAG__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CorePackage.TAG__ACTION_ROLE:
				return getActionRole() != ACTION_ROLE_EDEFAULT;
			case CorePackage.TAG__VIEWS:
				return !getViews().isEmpty();
			case CorePackage.TAG__TAGGED:
				return !getTagged().isEmpty();
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
				case CorePackage.TAG__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
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
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CorePackage.TAG__DOCUMENTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TagImpl
