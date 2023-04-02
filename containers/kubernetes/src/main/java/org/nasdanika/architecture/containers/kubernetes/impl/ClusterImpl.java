/**
 */
package org.nasdanika.architecture.containers.kubernetes.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.containers.kubernetes.Cluster;
import org.nasdanika.architecture.containers.kubernetes.KubernetesPackage;
import org.nasdanika.architecture.core.impl.ArchitectureElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClusterImpl extends ArchitectureElementImpl implements Cluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.CLUSTER;
	}

} //ClusterImpl
