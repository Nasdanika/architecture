/**
 */
package org.nasdanika.architecture.cloud.azure.networking.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkingPackage
 * @generated
 */
public class NetworkingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NetworkingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkingSwitch<Adapter> modelSwitch =
		new NetworkingSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualNetwork(VirtualNetwork object) {
				return createVirtualNetworkAdapter();
			}
			@Override
			public Adapter caseVirtualNetworkResource(VirtualNetworkResource object) {
				return createVirtualNetworkResourceAdapter();
			}
			@Override
			public Adapter caseSubnet(Subnet object) {
				return createSubnetAdapter();
			}
			@Override
			public Adapter caseSubnetResource(SubnetResource object) {
				return createSubnetResourceAdapter();
			}
			@Override
			public Adapter caseNetworkInterface(NetworkInterface object) {
				return createNetworkInterfaceAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceEndpoint(ServiceEndpoint object) {
				return createServiceEndpointAdapter();
			}
			@Override
			public Adapter casePrivateEnpoint(PrivateEnpoint object) {
				return createPrivateEnpointAdapter();
			}
			@Override
			public Adapter casePublicEndpoint(PublicEndpoint object) {
				return createPublicEndpointAdapter();
			}
			@Override
			public Adapter caseIMarked(Marked object) {
				return createIMarkedAdapter();
			}
			@Override
			public Adapter caseMarked(org.nasdanika.ncore.Marked object) {
				return createMarkedAdapter();
			}
			@Override
			public Adapter caseAdaptable(Adaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter casePeriod(Period object) {
				return createPeriodAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDocumented(Documented object) {
				return createDocumentedAdapter();
			}
			@Override
			public Adapter caseCore_ModelElement(org.nasdanika.architecture.core.ModelElement object) {
				return createCore_ModelElementAdapter();
			}
			@Override
			public Adapter caseArchitectureElement(ArchitectureElement object) {
				return createArchitectureElementAdapter();
			}
			@Override
			public Adapter caseAzureElement(AzureElement object) {
				return createAzureElementAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetwork
	 * @generated
	 */
	public Adapter createVirtualNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource <em>Virtual Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource
	 * @generated
	 */
	public Adapter createVirtualNetworkResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Subnet
	 * @generated
	 */
	public Adapter createSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.SubnetResource <em>Subnet Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.SubnetResource
	 * @generated
	 */
	public Adapter createSubnetResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.NetworkInterface
	 * @generated
	 */
	public Adapter createNetworkInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.ServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.ServiceEndpoint
	 * @generated
	 */
	public Adapter createServiceEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.PrivateEnpoint <em>Private Enpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.PrivateEnpoint
	 * @generated
	 */
	public Adapter createPrivateEnpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.networking.PublicEndpoint <em>Public Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.networking.PublicEndpoint
	 * @generated
	 */
	public Adapter createPublicEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.persistence.Marked <em>IMarked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.persistence.Marked
	 * @generated
	 */
	public Adapter createIMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Marked
	 * @generated
	 */
	public Adapter createMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.common.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.common.Adaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Period
	 * @generated
	 */
	public Adapter createPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Documented
	 * @generated
	 */
	public Adapter createDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.core.ModelElement
	 * @generated
	 */
	public Adapter createCore_ModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.core.ArchitectureElement <em>Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.core.ArchitectureElement
	 * @generated
	 */
	public Adapter createArchitectureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.core.AzureElement <em>Azure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.core.AzureElement
	 * @generated
	 */
	public Adapter createAzureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.architecture.cloud.azure.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.architecture.cloud.azure.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NetworkingAdapterFactory
