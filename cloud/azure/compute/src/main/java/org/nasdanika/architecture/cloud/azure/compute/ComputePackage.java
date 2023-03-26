/**
 */
package org.nasdanika.architecture.cloud.azure.compute;

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
 * @see org.nasdanika.architecture.cloud.azure.compute.ComputeFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika documentation-reference='doc/package-summary.md' load-key='azure-compute' exports='VirtualMachine:\n  - azure-vm\n  - azure-virtual-machine'"
 * @generated
 */
public interface ComputePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.architecture.cloud.azure.compute";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.architecture.cloud.azure.compute";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputePackage eINSTANCE = org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl
	 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.architecture.cloud.azure.compute.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.nasdanika.architecture.cloud.azure.compute.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputeFactory getComputeFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.VirtualMachineImpl
		 * @see org.nasdanika.architecture.cloud.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

	}

} //ComputePackage
