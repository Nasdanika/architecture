/**
 */
package org.nasdanika.architecture.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.Node;
import org.nasdanika.architecture.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends ArchitectureElementImpl implements Relationship {
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
		return CorePackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		return (Node)eDynamicGet(CorePackage.RELATIONSHIP__TARGET, CorePackage.Literals.RELATIONSHIP__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node)eDynamicGet(CorePackage.RELATIONSHIP__TARGET, CorePackage.Literals.RELATIONSHIP__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		eDynamicSet(CorePackage.RELATIONSHIP__TARGET, CorePackage.Literals.RELATIONSHIP__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CorePackage.RELATIONSHIP__TARGET:
				setTarget((Node)newValue);
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
			case CorePackage.RELATIONSHIP__TARGET:
				setTarget((Node)null);
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
			case CorePackage.RELATIONSHIP__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipImpl
