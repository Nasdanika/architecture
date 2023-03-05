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
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.Domain;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.architecture.core.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.impl.SystemImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.SystemImpl#isExternal <em>External</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.SystemImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.SystemImpl#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NodeImpl implements org.nasdanika.architecture.c4.System {
	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ModelElement> getElements() {
		return (EList<ModelElement>)eDynamicGet(C4Package.SYSTEM__ELEMENTS, CorePackage.Literals.DOMAIN__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return (Boolean)eDynamicGet(C4Package.SYSTEM__EXTERNAL, C4Package.Literals.SYSTEM__EXTERNAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		eDynamicSet(C4Package.SYSTEM__EXTERNAL, C4Package.Literals.SYSTEM__EXTERNAL, newExternal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.architecture.c4.Container> getContainers() {
		return (EList<org.nasdanika.architecture.c4.Container>)eDynamicGet(C4Package.SYSTEM__CONTAINERS, C4Package.Literals.SYSTEM__CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.architecture.c4.System> getSubsystems() {
		return (EList<org.nasdanika.architecture.c4.System>)eDynamicGet(C4Package.SYSTEM__SUBSYSTEMS, C4Package.Literals.SYSTEM__SUBSYSTEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4Package.SYSTEM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case C4Package.SYSTEM__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case C4Package.SYSTEM__SUBSYSTEMS:
				return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
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
			case C4Package.SYSTEM__ELEMENTS:
				return getElements();
			case C4Package.SYSTEM__EXTERNAL:
				return isExternal();
			case C4Package.SYSTEM__CONTAINERS:
				return getContainers();
			case C4Package.SYSTEM__SUBSYSTEMS:
				return getSubsystems();
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
			case C4Package.SYSTEM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case C4Package.SYSTEM__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case C4Package.SYSTEM__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends org.nasdanika.architecture.c4.Container>)newValue);
				return;
			case C4Package.SYSTEM__SUBSYSTEMS:
				getSubsystems().clear();
				getSubsystems().addAll((Collection<? extends org.nasdanika.architecture.c4.System>)newValue);
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
			case C4Package.SYSTEM__ELEMENTS:
				getElements().clear();
				return;
			case C4Package.SYSTEM__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case C4Package.SYSTEM__CONTAINERS:
				getContainers().clear();
				return;
			case C4Package.SYSTEM__SUBSYSTEMS:
				getSubsystems().clear();
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
			case C4Package.SYSTEM__ELEMENTS:
				return !getElements().isEmpty();
			case C4Package.SYSTEM__EXTERNAL:
				return isExternal() != EXTERNAL_EDEFAULT;
			case C4Package.SYSTEM__CONTAINERS:
				return !getContainers().isEmpty();
			case C4Package.SYSTEM__SUBSYSTEMS:
				return !getSubsystems().isEmpty();
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
		if (baseClass == Domain.class) {
			switch (derivedFeatureID) {
				case C4Package.SYSTEM__ELEMENTS: return CorePackage.DOMAIN__ELEMENTS;
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
		if (baseClass == Domain.class) {
			switch (baseFeatureID) {
				case CorePackage.DOMAIN__ELEMENTS: return C4Package.SYSTEM__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemImpl
