/**
 */
package org.nasdanika.architecture.cloud.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.compute.ComputePackage;
import org.nasdanika.architecture.cloud.azure.compute.WebApp;

import org.nasdanika.architecture.cloud.azure.core.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WebAppImpl extends ResourceImpl implements WebApp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.WEB_APP;
	}

} //WebAppImpl
