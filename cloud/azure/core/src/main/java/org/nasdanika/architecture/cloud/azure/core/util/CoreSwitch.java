/**
 */
package org.nasdanika.architecture.cloud.azure.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.architecture.cloud.azure.core.*;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.common.Adaptable;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.Period;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.cloud.azure.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.AZURE_ELEMENT: {
				AzureElement azureElement = (AzureElement)theEObject;
				T result = caseAzureElement(azureElement);
				if (result == null) result = caseArchitectureElement(azureElement);
				if (result == null) result = casePeriod(azureElement);
				if (result == null) result = caseCore_ModelElement(azureElement);
				if (result == null) result = caseNamedElement(azureElement);
				if (result == null) result = caseDocumented(azureElement);
				if (result == null) result = caseModelElement(azureElement);
				if (result == null) result = caseMarked(azureElement);
				if (result == null) result = caseAdaptable(azureElement);
				if (result == null) result = caseIMarked(azureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MANAGEMENT_GROUP_ELEMENT: {
				ManagementGroupElement managementGroupElement = (ManagementGroupElement)theEObject;
				T result = caseManagementGroupElement(managementGroupElement);
				if (result == null) result = caseAzureElement(managementGroupElement);
				if (result == null) result = caseArchitectureElement(managementGroupElement);
				if (result == null) result = casePeriod(managementGroupElement);
				if (result == null) result = caseCore_ModelElement(managementGroupElement);
				if (result == null) result = caseNamedElement(managementGroupElement);
				if (result == null) result = caseDocumented(managementGroupElement);
				if (result == null) result = caseModelElement(managementGroupElement);
				if (result == null) result = caseMarked(managementGroupElement);
				if (result == null) result = caseAdaptable(managementGroupElement);
				if (result == null) result = caseIMarked(managementGroupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MANAGEMENT_GROUP: {
				ManagementGroup managementGroup = (ManagementGroup)theEObject;
				T result = caseManagementGroup(managementGroup);
				if (result == null) result = caseManagementGroupElement(managementGroup);
				if (result == null) result = caseAzureElement(managementGroup);
				if (result == null) result = caseArchitectureElement(managementGroup);
				if (result == null) result = casePeriod(managementGroup);
				if (result == null) result = caseCore_ModelElement(managementGroup);
				if (result == null) result = caseNamedElement(managementGroup);
				if (result == null) result = caseDocumented(managementGroup);
				if (result == null) result = caseModelElement(managementGroup);
				if (result == null) result = caseMarked(managementGroup);
				if (result == null) result = caseAdaptable(managementGroup);
				if (result == null) result = caseIMarked(managementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseManagementGroupElement(subscription);
				if (result == null) result = caseAzureElement(subscription);
				if (result == null) result = caseArchitectureElement(subscription);
				if (result == null) result = casePeriod(subscription);
				if (result == null) result = caseCore_ModelElement(subscription);
				if (result == null) result = caseNamedElement(subscription);
				if (result == null) result = caseDocumented(subscription);
				if (result == null) result = caseModelElement(subscription);
				if (result == null) result = caseMarked(subscription);
				if (result == null) result = caseAdaptable(subscription);
				if (result == null) result = caseIMarked(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESOURCE_GROUP: {
				ResourceGroup resourceGroup = (ResourceGroup)theEObject;
				T result = caseResourceGroup(resourceGroup);
				if (result == null) result = caseAzureElement(resourceGroup);
				if (result == null) result = caseArchitectureElement(resourceGroup);
				if (result == null) result = casePeriod(resourceGroup);
				if (result == null) result = caseCore_ModelElement(resourceGroup);
				if (result == null) result = caseNamedElement(resourceGroup);
				if (result == null) result = caseDocumented(resourceGroup);
				if (result == null) result = caseModelElement(resourceGroup);
				if (result == null) result = caseMarked(resourceGroup);
				if (result == null) result = caseAdaptable(resourceGroup);
				if (result == null) result = caseIMarked(resourceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseAzureElement(resource);
				if (result == null) result = caseArchitectureElement(resource);
				if (result == null) result = casePeriod(resource);
				if (result == null) result = caseCore_ModelElement(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = caseDocumented(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseMarked(resource);
				if (result == null) result = caseAdaptable(resource);
				if (result == null) result = caseIMarked(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERIC_RESOURCE: {
				GenericResource genericResource = (GenericResource)theEObject;
				T result = caseGenericResource(genericResource);
				if (result == null) result = caseResource(genericResource);
				if (result == null) result = caseAzureElement(genericResource);
				if (result == null) result = caseArchitectureElement(genericResource);
				if (result == null) result = casePeriod(genericResource);
				if (result == null) result = caseCore_ModelElement(genericResource);
				if (result == null) result = caseNamedElement(genericResource);
				if (result == null) result = caseDocumented(genericResource);
				if (result == null) result = caseModelElement(genericResource);
				if (result == null) result = caseMarked(genericResource);
				if (result == null) result = caseAdaptable(genericResource);
				if (result == null) result = caseIMarked(genericResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseAzureElement(location);
				if (result == null) result = caseArchitectureElement(location);
				if (result == null) result = casePeriod(location);
				if (result == null) result = caseCore_ModelElement(location);
				if (result == null) result = caseNamedElement(location);
				if (result == null) result = caseDocumented(location);
				if (result == null) result = caseModelElement(location);
				if (result == null) result = caseMarked(location);
				if (result == null) result = caseAdaptable(location);
				if (result == null) result = caseIMarked(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseLocation(region);
				if (result == null) result = caseAzureElement(region);
				if (result == null) result = caseArchitectureElement(region);
				if (result == null) result = casePeriod(region);
				if (result == null) result = caseCore_ModelElement(region);
				if (result == null) result = caseNamedElement(region);
				if (result == null) result = caseDocumented(region);
				if (result == null) result = caseModelElement(region);
				if (result == null) result = caseMarked(region);
				if (result == null) result = caseAdaptable(region);
				if (result == null) result = caseIMarked(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AVAILABILITY_ZONE: {
				AvailabilityZone availabilityZone = (AvailabilityZone)theEObject;
				T result = caseAvailabilityZone(availabilityZone);
				if (result == null) result = caseLocation(availabilityZone);
				if (result == null) result = caseAzureElement(availabilityZone);
				if (result == null) result = caseArchitectureElement(availabilityZone);
				if (result == null) result = casePeriod(availabilityZone);
				if (result == null) result = caseCore_ModelElement(availabilityZone);
				if (result == null) result = caseNamedElement(availabilityZone);
				if (result == null) result = caseDocumented(availabilityZone);
				if (result == null) result = caseModelElement(availabilityZone);
				if (result == null) result = caseMarked(availabilityZone);
				if (result == null) result = caseAdaptable(availabilityZone);
				if (result == null) result = caseIMarked(availabilityZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGION_PAIR: {
				RegionPair regionPair = (RegionPair)theEObject;
				T result = caseRegionPair(regionPair);
				if (result == null) result = caseAzureElement(regionPair);
				if (result == null) result = caseArchitectureElement(regionPair);
				if (result == null) result = casePeriod(regionPair);
				if (result == null) result = caseCore_ModelElement(regionPair);
				if (result == null) result = caseNamedElement(regionPair);
				if (result == null) result = caseDocumented(regionPair);
				if (result == null) result = caseModelElement(regionPair);
				if (result == null) result = caseMarked(regionPair);
				if (result == null) result = caseAdaptable(regionPair);
				if (result == null) result = caseIMarked(regionPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Azure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAzureElement(AzureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Group Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Group Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementGroupElement(ManagementGroupElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementGroup(ManagementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceGroup(ResourceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericResource(GenericResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityZone(AvailabilityZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionPair(RegionPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore_ModelElement(org.nasdanika.architecture.core.ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureElement(ArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
