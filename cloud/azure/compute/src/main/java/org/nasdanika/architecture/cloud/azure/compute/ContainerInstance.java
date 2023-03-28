/**
 */
package org.nasdanika.architecture.cloud.azure.compute;

import org.nasdanika.architecture.cloud.azure.networking.SubnetResource;
import org.nasdanika.architecture.containers.docker.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.architecture.cloud.azure.compute.ComputePackage#getContainerInstance()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10104-icon-service-Container-Instances.svg' label='Container Instance' documentation-reference='doc/container-instance.md' description='Azure Container Instances (ACI) allows you to quickly and easily run containers on Azure without managing servers or having to learn new tools'"
 * @generated
 */
public interface ContainerInstance extends SubnetResource, Container {
} // ContainerInstance
