/**
 */
package org.nasdanika.architecture.cloud.azure.networking.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.architecture.cloud.azure.core.AzureElement;
import org.nasdanika.architecture.cloud.azure.core.Resource;
import org.nasdanika.architecture.cloud.azure.networking.*;
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
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage
 * @generated
 */
public class NetworkingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingSwitch() {
		if (modelPackage == null) {
			modelPackage = NetworkingPackage.eINSTANCE;
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
			case NetworkingPackage.VIRTUAL_NETWORK: {
				VirtualNetwork virtualNetwork = (VirtualNetwork)theEObject;
				T result = caseVirtualNetwork(virtualNetwork);
				if (result == null) result = caseResource(virtualNetwork);
				if (result == null) result = caseAzureElement(virtualNetwork);
				if (result == null) result = caseArchitectureElement(virtualNetwork);
				if (result == null) result = casePeriod(virtualNetwork);
				if (result == null) result = caseCore_ModelElement(virtualNetwork);
				if (result == null) result = caseNamedElement(virtualNetwork);
				if (result == null) result = caseDocumented(virtualNetwork);
				if (result == null) result = caseModelElement(virtualNetwork);
				if (result == null) result = caseMarked(virtualNetwork);
				if (result == null) result = caseAdaptable(virtualNetwork);
				if (result == null) result = caseIMarked(virtualNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE: {
				VirtualNetworkResource virtualNetworkResource = (VirtualNetworkResource)theEObject;
				T result = caseVirtualNetworkResource(virtualNetworkResource);
				if (result == null) result = caseResource(virtualNetworkResource);
				if (result == null) result = caseAzureElement(virtualNetworkResource);
				if (result == null) result = caseArchitectureElement(virtualNetworkResource);
				if (result == null) result = casePeriod(virtualNetworkResource);
				if (result == null) result = caseCore_ModelElement(virtualNetworkResource);
				if (result == null) result = caseNamedElement(virtualNetworkResource);
				if (result == null) result = caseDocumented(virtualNetworkResource);
				if (result == null) result = caseModelElement(virtualNetworkResource);
				if (result == null) result = caseMarked(virtualNetworkResource);
				if (result == null) result = caseAdaptable(virtualNetworkResource);
				if (result == null) result = caseIMarked(virtualNetworkResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.SUBNET: {
				Subnet subnet = (Subnet)theEObject;
				T result = caseSubnet(subnet);
				if (result == null) result = caseResource(subnet);
				if (result == null) result = caseAzureElement(subnet);
				if (result == null) result = caseArchitectureElement(subnet);
				if (result == null) result = casePeriod(subnet);
				if (result == null) result = caseCore_ModelElement(subnet);
				if (result == null) result = caseNamedElement(subnet);
				if (result == null) result = caseDocumented(subnet);
				if (result == null) result = caseModelElement(subnet);
				if (result == null) result = caseMarked(subnet);
				if (result == null) result = caseAdaptable(subnet);
				if (result == null) result = caseIMarked(subnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.SUBNET_RESOURCE: {
				SubnetResource subnetResource = (SubnetResource)theEObject;
				T result = caseSubnetResource(subnetResource);
				if (result == null) result = caseResource(subnetResource);
				if (result == null) result = caseAzureElement(subnetResource);
				if (result == null) result = caseArchitectureElement(subnetResource);
				if (result == null) result = casePeriod(subnetResource);
				if (result == null) result = caseCore_ModelElement(subnetResource);
				if (result == null) result = caseNamedElement(subnetResource);
				if (result == null) result = caseDocumented(subnetResource);
				if (result == null) result = caseModelElement(subnetResource);
				if (result == null) result = caseMarked(subnetResource);
				if (result == null) result = caseAdaptable(subnetResource);
				if (result == null) result = caseIMarked(subnetResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.NETWORK_INTERFACE: {
				NetworkInterface networkInterface = (NetworkInterface)theEObject;
				T result = caseNetworkInterface(networkInterface);
				if (result == null) result = caseSubnetResource(networkInterface);
				if (result == null) result = caseResource(networkInterface);
				if (result == null) result = caseAzureElement(networkInterface);
				if (result == null) result = caseArchitectureElement(networkInterface);
				if (result == null) result = casePeriod(networkInterface);
				if (result == null) result = caseCore_ModelElement(networkInterface);
				if (result == null) result = caseNamedElement(networkInterface);
				if (result == null) result = caseDocumented(networkInterface);
				if (result == null) result = caseModelElement(networkInterface);
				if (result == null) result = caseMarked(networkInterface);
				if (result == null) result = caseAdaptable(networkInterface);
				if (result == null) result = caseIMarked(networkInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseResource(service);
				if (result == null) result = caseAzureElement(service);
				if (result == null) result = caseArchitectureElement(service);
				if (result == null) result = casePeriod(service);
				if (result == null) result = caseCore_ModelElement(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseDocumented(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseMarked(service);
				if (result == null) result = caseAdaptable(service);
				if (result == null) result = caseIMarked(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.SERVICE_ENDPOINT: {
				ServiceEndpoint serviceEndpoint = (ServiceEndpoint)theEObject;
				T result = caseServiceEndpoint(serviceEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.PRIVATE_ENPOINT: {
				PrivateEnpoint privateEnpoint = (PrivateEnpoint)theEObject;
				T result = casePrivateEnpoint(privateEnpoint);
				if (result == null) result = caseSubnetResource(privateEnpoint);
				if (result == null) result = caseServiceEndpoint(privateEnpoint);
				if (result == null) result = caseResource(privateEnpoint);
				if (result == null) result = caseAzureElement(privateEnpoint);
				if (result == null) result = caseArchitectureElement(privateEnpoint);
				if (result == null) result = casePeriod(privateEnpoint);
				if (result == null) result = caseCore_ModelElement(privateEnpoint);
				if (result == null) result = caseNamedElement(privateEnpoint);
				if (result == null) result = caseDocumented(privateEnpoint);
				if (result == null) result = caseModelElement(privateEnpoint);
				if (result == null) result = caseMarked(privateEnpoint);
				if (result == null) result = caseAdaptable(privateEnpoint);
				if (result == null) result = caseIMarked(privateEnpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkingPackage.PUBLIC_ENDPOINT: {
				PublicEndpoint publicEndpoint = (PublicEndpoint)theEObject;
				T result = casePublicEndpoint(publicEndpoint);
				if (result == null) result = caseAzureElement(publicEndpoint);
				if (result == null) result = caseServiceEndpoint(publicEndpoint);
				if (result == null) result = caseArchitectureElement(publicEndpoint);
				if (result == null) result = casePeriod(publicEndpoint);
				if (result == null) result = caseCore_ModelElement(publicEndpoint);
				if (result == null) result = caseNamedElement(publicEndpoint);
				if (result == null) result = caseDocumented(publicEndpoint);
				if (result == null) result = caseModelElement(publicEndpoint);
				if (result == null) result = caseMarked(publicEndpoint);
				if (result == null) result = caseAdaptable(publicEndpoint);
				if (result == null) result = caseIMarked(publicEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNetwork(VirtualNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Network Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Network Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNetworkResource(VirtualNetworkResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnet(Subnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetResource(SubnetResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEndpoint(ServiceEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Enpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Enpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateEnpoint(PrivateEnpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicEndpoint(PublicEndpoint object) {
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

} //NetworkingSwitch
