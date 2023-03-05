/**
 */
package org.nasdanika.architecture.c4.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.architecture.c4.C4Package;
import org.nasdanika.architecture.c4.Relationship;
import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.c4.TechnologyConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.impl.RelationshipImpl#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends org.nasdanika.architecture.core.impl.RelationshipImpl implements Relationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Technology> getTechnology() {
		return (EList<Technology>)eDynamicGet(C4Package.RELATIONSHIP__TECHNOLOGY, C4Package.Literals.TECHNOLOGY_CONSUMER__TECHNOLOGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case C4Package.RELATIONSHIP__TECHNOLOGY:
				return getTechnology();
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
			case C4Package.RELATIONSHIP__TECHNOLOGY:
				getTechnology().clear();
				getTechnology().addAll((Collection<? extends Technology>)newValue);
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
			case C4Package.RELATIONSHIP__TECHNOLOGY:
				getTechnology().clear();
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
			case C4Package.RELATIONSHIP__TECHNOLOGY:
				return !getTechnology().isEmpty();
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
				case C4Package.RELATIONSHIP__TECHNOLOGY: return C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY;
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
				case C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY: return C4Package.RELATIONSHIP__TECHNOLOGY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RelationshipImpl
