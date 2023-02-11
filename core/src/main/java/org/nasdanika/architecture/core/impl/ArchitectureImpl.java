/**
 */
package org.nasdanika.architecture.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.architecture.core.Architecture;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.ImpactType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureImpl#getImpactTypes <em>Impact Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends DomainImpl implements Architecture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactType getImpactTypes() {
		return (ImpactType)eDynamicGet(CorePackage.ARCHITECTURE__IMPACT_TYPES, CorePackage.Literals.ARCHITECTURE__IMPACT_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpactTypes(ImpactType newImpactTypes, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImpactTypes, CorePackage.ARCHITECTURE__IMPACT_TYPES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactTypes(ImpactType newImpactTypes) {
		eDynamicSet(CorePackage.ARCHITECTURE__IMPACT_TYPES, CorePackage.Literals.ARCHITECTURE__IMPACT_TYPES, newImpactTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE__IMPACT_TYPES:
				return basicSetImpactTypes(null, msgs);
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
			case CorePackage.ARCHITECTURE__IMPACT_TYPES:
				return getImpactTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE__IMPACT_TYPES:
				setImpactTypes((ImpactType)newValue);
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
			case CorePackage.ARCHITECTURE__IMPACT_TYPES:
				setImpactTypes((ImpactType)null);
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
			case CorePackage.ARCHITECTURE__IMPACT_TYPES:
				return getImpactTypes() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureImpl
