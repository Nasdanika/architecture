/**
 */
package org.nasdanika.architecture.cloud.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.compute.AppService;
import org.nasdanika.architecture.cloud.azure.compute.ComputePackage;

import org.nasdanika.architecture.cloud.azure.core.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AppServiceImpl extends ResourceImpl implements AppService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.APP_SERVICE;
	}

} //AppServiceImpl
