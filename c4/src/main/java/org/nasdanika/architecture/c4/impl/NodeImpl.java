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
import org.nasdanika.architecture.c4.Node;
import org.nasdanika.architecture.c4.Relationship;

import org.nasdanika.architecture.core.impl.ArchitectureElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.impl.NodeImpl#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.impl.NodeImpl#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ArchitectureElementImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4Package.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getOutgoingRelationships() {
		return (EList<Relationship>)eDynamicGet(C4Package.NODE__OUTGOING_RELATIONSHIPS, C4Package.Literals.NODE__OUTGOING_RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getIncomingRelationships() {
		// TODO: implement this method to return the 'Incoming Relationships' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4Package.NODE__OUTGOING_RELATIONSHIPS:
				return ((InternalEList<?>)getOutgoingRelationships()).basicRemove(otherEnd, msgs);
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
			case C4Package.NODE__OUTGOING_RELATIONSHIPS:
				return getOutgoingRelationships();
			case C4Package.NODE__INCOMING_RELATIONSHIPS:
				return getIncomingRelationships();
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
			case C4Package.NODE__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				getOutgoingRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case C4Package.NODE__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
				getIncomingRelationships().addAll((Collection<? extends Relationship>)newValue);
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
			case C4Package.NODE__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				return;
			case C4Package.NODE__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
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
			case C4Package.NODE__OUTGOING_RELATIONSHIPS:
				return !getOutgoingRelationships().isEmpty();
			case C4Package.NODE__INCOMING_RELATIONSHIPS:
				return !getIncomingRelationships().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
