/**
 */
package org.nasdanika.architecture.servicemesh.istio;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.servicemesh.istio.IstioFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md'"
 * @generated
 */
public interface IstioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "istio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/architecture/service-mesh/istio";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.service-mesh.istio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstioPackage eINSTANCE = org.nasdanika.architecture.servicemesh.istio.impl.IstioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.servicemesh.istio.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.servicemesh.istio.impl.ProxyImpl
	 * @see org.nasdanika.architecture.servicemesh.istio.impl.IstioPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 0;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.servicemesh.istio.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see org.nasdanika.architecture.servicemesh.istio.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IstioFactory getIstioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.architecture.servicemesh.istio.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.servicemesh.istio.impl.ProxyImpl
		 * @see org.nasdanika.architecture.servicemesh.istio.impl.IstioPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

	}

} //IstioPackage
