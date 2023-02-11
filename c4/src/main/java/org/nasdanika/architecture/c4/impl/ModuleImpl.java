/**
 */
package org.nasdanika.architecture.c4.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.architecture.c4.C4Package;
import org.nasdanika.architecture.c4.CodeElement;
import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.c4.TechnologyConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ModuleImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ModuleImpl#getCodeElements <em>Code Elements</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ModuleImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends NodeImpl implements org.nasdanika.architecture.c4.Module {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Technology> getTechnology() {
		return (EList<Technology>)eDynamicGet(C4Package.MODULE__TECHNOLOGY, C4Package.Literals.TECHNOLOGY_CONSUMER__TECHNOLOGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CodeElement> getCodeElements() {
		return (EList<CodeElement>)eDynamicGet(C4Package.MODULE__CODE_ELEMENTS, C4Package.Literals.MODULE__CODE_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.architecture.c4.Module> getModules() {
		return (EList<org.nasdanika.architecture.c4.Module>)eDynamicGet(C4Package.MODULE__MODULES, C4Package.Literals.MODULE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4Package.MODULE__CODE_ELEMENTS:
				return ((InternalEList<?>)getCodeElements()).basicRemove(otherEnd, msgs);
			case C4Package.MODULE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
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
			case C4Package.MODULE__TECHNOLOGY:
				return getTechnology();
			case C4Package.MODULE__CODE_ELEMENTS:
				return getCodeElements();
			case C4Package.MODULE__MODULES:
				return getModules();
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
			case C4Package.MODULE__TECHNOLOGY:
				getTechnology().clear();
				getTechnology().addAll((Collection<? extends Technology>)newValue);
				return;
			case C4Package.MODULE__CODE_ELEMENTS:
				getCodeElements().clear();
				getCodeElements().addAll((Collection<? extends CodeElement>)newValue);
				return;
			case C4Package.MODULE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.architecture.c4.Module>)newValue);
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
			case C4Package.MODULE__TECHNOLOGY:
				getTechnology().clear();
				return;
			case C4Package.MODULE__CODE_ELEMENTS:
				getCodeElements().clear();
				return;
			case C4Package.MODULE__MODULES:
				getModules().clear();
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
			case C4Package.MODULE__TECHNOLOGY:
				return !getTechnology().isEmpty();
			case C4Package.MODULE__CODE_ELEMENTS:
				return !getCodeElements().isEmpty();
			case C4Package.MODULE__MODULES:
				return !getModules().isEmpty();
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
		if (baseClass == TechnologyConsumer.class) {
			switch (derivedFeatureID) {
				case C4Package.MODULE__TECHNOLOGY: return C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY;
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
		if (baseClass == TechnologyConsumer.class) {
			switch (baseFeatureID) {
				case C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY: return C4Package.MODULE__TECHNOLOGY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModuleImpl
