/**
 */
package org.nasdanika.architecture.cloud.azure.compute;

import org.nasdanika.architecture.cloud.azure.networking.VirtualNetworkResource;
import org.nasdanika.architecture.containers.kubernetes.Cluster;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.architecture.cloud.azure.compute.ComputePackage#getKubernetesService()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10023-icon-service-Kubernetes-Services.svg' label='Kubernetes Service' documentation-reference='doc/kubernetes-service.md' description='Azure Kubernetes Service (AKS) offers the quickest way to start developing and deploying cloud-native apps in Azure, datacenters, or at the edge with built-in code-to-cloud pipelines and guardrails'"
 * @generated
 */
public interface KubernetesService extends VirtualNetworkResource, Cluster {
} // KubernetesService
