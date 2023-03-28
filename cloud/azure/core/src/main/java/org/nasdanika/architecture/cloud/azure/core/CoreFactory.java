/**
 */
package org.nasdanika.architecture.cloud.azure.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.cloud.azure.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = org.nasdanika.architecture.cloud.azure.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Azure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azure Element</em>'.
	 * @generated
	 */
	AzureElement createAzureElement();

	/**
	 * Returns a new object of class '<em>Management Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Group</em>'.
	 * @generated
	 */
	ManagementGroup createManagementGroup();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Group</em>'.
	 * @generated
	 */
	ResourceGroup createResourceGroup();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Availability Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability Zone</em>'.
	 * @generated
	 */
	AvailabilityZone createAvailabilityZone();

	/**
	 * Returns a new object of class '<em>Region Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Pair</em>'.
	 * @generated
	 */
	RegionPair createRegionPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
