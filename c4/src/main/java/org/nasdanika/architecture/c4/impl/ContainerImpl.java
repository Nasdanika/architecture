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
import org.nasdanika.architecture.c4.Component;
import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.c4.TechnologyConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ContainerImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ContainerImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.ContainerImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NodeImpl implements org.nasdanika.architecture.c4.Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Technology> getTechnology() {
		return (EList<Technology>)eDynamicGet(C4Package.CONTAINER__TECHNOLOGY, C4Package.Literals.TECHNOLOGY_CONSUMER__TECHNOLOGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Component> getComponents() {
		return (EList<Component>)eDynamicGet(C4Package.CONTAINER__COMPONENTS, C4Package.Literals.CONTAINER__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.architecture.c4.Container> getChildren() {
		return (EList<org.nasdanika.architecture.c4.Container>)eDynamicGet(C4Package.CONTAINER__CHILDREN, C4Package.Literals.CONTAINER__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4Package.CONTAINER__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case C4Package.CONTAINER__CHILDREN:
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
			case C4Package.CONTAINER__TECHNOLOGY:
				return getTechnology();
			case C4Package.CONTAINER__COMPONENTS:
				return getComponents();
			case C4Package.CONTAINER__CHILDREN:
				return getChildren();
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
			case C4Package.CONTAINER__TECHNOLOGY:
				getTechnology().clear();
				getTechnology().addAll((Collection<? extends Technology>)newValue);
				return;
			case C4Package.CONTAINER__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case C4Package.CONTAINER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends org.nasdanika.architecture.c4.Container>)newValue);
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
			case C4Package.CONTAINER__TECHNOLOGY:
				getTechnology().clear();
				return;
			case C4Package.CONTAINER__COMPONENTS:
				getComponents().clear();
				return;
			case C4Package.CONTAINER__CHILDREN:
				getChildren().clear();
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
			case C4Package.CONTAINER__TECHNOLOGY:
				return !getTechnology().isEmpty();
			case C4Package.CONTAINER__COMPONENTS:
				return !getComponents().isEmpty();
			case C4Package.CONTAINER__CHILDREN:
				return !getChildren().isEmpty();
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
				case C4Package.CONTAINER__TECHNOLOGY: return C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY;
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
				case C4Package.TECHNOLOGY_CONSUMER__TECHNOLOGY: return C4Package.CONTAINER__TECHNOLOGY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContainerImpl
