/**
 */
package org.nasdanika.architecture.containers.helm;

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
 * @see org.nasdanika.architecture.containers.helm.HelmFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md'"
 * @generated
 */
public interface HelmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.architecture.containers.helm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.containers.helm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelmPackage eINSTANCE = org.nasdanika.architecture.containers.helm.impl.HelmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.containers.helm.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.containers.helm.impl.ChartImpl
	 * @see org.nasdanika.architecture.containers.helm.impl.HelmPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 0;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.containers.helm.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see org.nasdanika.architecture.containers.helm.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelmFactory getHelmFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.architecture.containers.helm.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.containers.helm.impl.ChartImpl
		 * @see org.nasdanika.architecture.containers.helm.impl.HelmPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

	}

} //HelmPackage
