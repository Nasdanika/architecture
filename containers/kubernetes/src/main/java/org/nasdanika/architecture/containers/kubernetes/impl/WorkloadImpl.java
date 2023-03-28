/**
 */
package org.nasdanika.architecture.containers.kubernetes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.architecture.containers.kubernetes.KubernetesPackage;
import org.nasdanika.architecture.containers.kubernetes.Workload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WorkloadImpl extends MinimalEObjectImpl.Container implements Workload {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

} //WorkloadImpl
