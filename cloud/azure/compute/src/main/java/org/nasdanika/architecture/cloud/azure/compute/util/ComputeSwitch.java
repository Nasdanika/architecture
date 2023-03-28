/**
 */
package org.nasdanika.architecture.cloud.azure.compute.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.architecture.cloud.azure.compute.*;
import org.nasdanika.architecture.cloud.azure.core.AzureElement;
import org.nasdanika.architecture.cloud.azure.core.Resource;
import org.nasdanika.architecture.cloud.azure.networking.SubnetResource;
import org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource;
import org.nasdanika.architecture.containers.docker.Container;
import org.nasdanika.architecture.containers.kubernetes.Cluster;
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
 * @see org.nasdanika.architecture.cloud.azure.compute.ComputePackage
 * @generated
 */
public class ComputeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComputePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeSwitch() {
		if (modelPackage == null) {
			modelPackage = ComputePackage.eINSTANCE;
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
			case ComputePackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				T result = caseVirtualMachine(virtualMachine);
				if (result == null) result = caseResource(virtualMachine);
				if (result == null) result = caseAzureElement(virtualMachine);
				if (result == null) result = caseArchitectureElement(virtualMachine);
				if (result == null) result = casePeriod(virtualMachine);
				if (result == null) result = caseCore_ModelElement(virtualMachine);
				if (result == null) result = caseNamedElement(virtualMachine);
				if (result == null) result = caseDocumented(virtualMachine);
				if (result == null) result = caseModelElement(virtualMachine);
				if (result == null) result = caseMarked(virtualMachine);
				if (result == null) result = caseAdaptable(virtualMachine);
				if (result == null) result = caseIMarked(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.DISK: {
				Disk disk = (Disk)theEObject;
				T result = caseDisk(disk);
				if (result == null) result = caseResource(disk);
				if (result == null) result = caseAzureElement(disk);
				if (result == null) result = caseArchitectureElement(disk);
				if (result == null) result = casePeriod(disk);
				if (result == null) result = caseCore_ModelElement(disk);
				if (result == null) result = caseNamedElement(disk);
				if (result == null) result = caseDocumented(disk);
				if (result == null) result = caseModelElement(disk);
				if (result == null) result = caseMarked(disk);
				if (result == null) result = caseAdaptable(disk);
				if (result == null) result = caseIMarked(disk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.DISK_TYPE: {
				DiskType diskType = (DiskType)theEObject;
				T result = caseDiskType(diskType);
				if (result == null) result = caseAzureElement(diskType);
				if (result == null) result = caseArchitectureElement(diskType);
				if (result == null) result = casePeriod(diskType);
				if (result == null) result = caseCore_ModelElement(diskType);
				if (result == null) result = caseNamedElement(diskType);
				if (result == null) result = caseDocumented(diskType);
				if (result == null) result = caseModelElement(diskType);
				if (result == null) result = caseMarked(diskType);
				if (result == null) result = caseAdaptable(diskType);
				if (result == null) result = caseIMarked(diskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.VIRTUAL_MACHINE_SIZE: {
				VirtualMachineSize virtualMachineSize = (VirtualMachineSize)theEObject;
				T result = caseVirtualMachineSize(virtualMachineSize);
				if (result == null) result = caseAzureElement(virtualMachineSize);
				if (result == null) result = caseArchitectureElement(virtualMachineSize);
				if (result == null) result = casePeriod(virtualMachineSize);
				if (result == null) result = caseCore_ModelElement(virtualMachineSize);
				if (result == null) result = caseNamedElement(virtualMachineSize);
				if (result == null) result = caseDocumented(virtualMachineSize);
				if (result == null) result = caseModelElement(virtualMachineSize);
				if (result == null) result = caseMarked(virtualMachineSize);
				if (result == null) result = caseAdaptable(virtualMachineSize);
				if (result == null) result = caseIMarked(virtualMachineSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.VIRTUAL_MACHINE_IMAGE: {
				VirtualMachineImage virtualMachineImage = (VirtualMachineImage)theEObject;
				T result = caseVirtualMachineImage(virtualMachineImage);
				if (result == null) result = caseAzureElement(virtualMachineImage);
				if (result == null) result = caseArchitectureElement(virtualMachineImage);
				if (result == null) result = casePeriod(virtualMachineImage);
				if (result == null) result = caseCore_ModelElement(virtualMachineImage);
				if (result == null) result = caseNamedElement(virtualMachineImage);
				if (result == null) result = caseDocumented(virtualMachineImage);
				if (result == null) result = caseModelElement(virtualMachineImage);
				if (result == null) result = caseMarked(virtualMachineImage);
				if (result == null) result = caseAdaptable(virtualMachineImage);
				if (result == null) result = caseIMarked(virtualMachineImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.VIRTUAL_MACHINE_SCALE_SET: {
				VirtualMachineScaleSet virtualMachineScaleSet = (VirtualMachineScaleSet)theEObject;
				T result = caseVirtualMachineScaleSet(virtualMachineScaleSet);
				if (result == null) result = caseVirtualMachine(virtualMachineScaleSet);
				if (result == null) result = caseResource(virtualMachineScaleSet);
				if (result == null) result = caseAzureElement(virtualMachineScaleSet);
				if (result == null) result = caseArchitectureElement(virtualMachineScaleSet);
				if (result == null) result = casePeriod(virtualMachineScaleSet);
				if (result == null) result = caseCore_ModelElement(virtualMachineScaleSet);
				if (result == null) result = caseNamedElement(virtualMachineScaleSet);
				if (result == null) result = caseDocumented(virtualMachineScaleSet);
				if (result == null) result = caseModelElement(virtualMachineScaleSet);
				if (result == null) result = caseMarked(virtualMachineScaleSet);
				if (result == null) result = caseAdaptable(virtualMachineScaleSet);
				if (result == null) result = caseIMarked(virtualMachineScaleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.WEB_APP: {
				WebApp webApp = (WebApp)theEObject;
				T result = caseWebApp(webApp);
				if (result == null) result = caseResource(webApp);
				if (result == null) result = caseAzureElement(webApp);
				if (result == null) result = caseArchitectureElement(webApp);
				if (result == null) result = casePeriod(webApp);
				if (result == null) result = caseCore_ModelElement(webApp);
				if (result == null) result = caseNamedElement(webApp);
				if (result == null) result = caseDocumented(webApp);
				if (result == null) result = caseModelElement(webApp);
				if (result == null) result = caseMarked(webApp);
				if (result == null) result = caseAdaptable(webApp);
				if (result == null) result = caseIMarked(webApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.CONTAINER_INSTANCE: {
				ContainerInstance containerInstance = (ContainerInstance)theEObject;
				T result = caseContainerInstance(containerInstance);
				if (result == null) result = caseSubnetResource(containerInstance);
				if (result == null) result = caseContainer(containerInstance);
				if (result == null) result = caseResource(containerInstance);
				if (result == null) result = caseAzureElement(containerInstance);
				if (result == null) result = caseArchitectureElement(containerInstance);
				if (result == null) result = casePeriod(containerInstance);
				if (result == null) result = caseCore_ModelElement(containerInstance);
				if (result == null) result = caseNamedElement(containerInstance);
				if (result == null) result = caseDocumented(containerInstance);
				if (result == null) result = caseModelElement(containerInstance);
				if (result == null) result = caseMarked(containerInstance);
				if (result == null) result = caseAdaptable(containerInstance);
				if (result == null) result = caseIMarked(containerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.KUBERNETES_SERVICE: {
				KubernetesService kubernetesService = (KubernetesService)theEObject;
				T result = caseKubernetesService(kubernetesService);
				if (result == null) result = caseVirtualNetworkResource(kubernetesService);
				if (result == null) result = caseCluster(kubernetesService);
				if (result == null) result = caseResource(kubernetesService);
				if (result == null) result = caseAzureElement(kubernetesService);
				if (result == null) result = caseArchitectureElement(kubernetesService);
				if (result == null) result = casePeriod(kubernetesService);
				if (result == null) result = caseCore_ModelElement(kubernetesService);
				if (result == null) result = caseNamedElement(kubernetesService);
				if (result == null) result = caseDocumented(kubernetesService);
				if (result == null) result = caseModelElement(kubernetesService);
				if (result == null) result = caseMarked(kubernetesService);
				if (result == null) result = caseAdaptable(kubernetesService);
				if (result == null) result = caseIMarked(kubernetesService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisk(Disk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiskType(DiskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineSize(VirtualMachineSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineImage(VirtualMachineImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Scale Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Scale Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineScaleSet(VirtualMachineScaleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebApp(WebApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerInstance(ContainerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kubernetes Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kubernetes Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKubernetesService(KubernetesService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
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

} //ComputeSwitch
