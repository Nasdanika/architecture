/**
 */
package org.nasdanika.architecture.cloud.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.compute.ComputePackage;
import org.nasdanika.architecture.cloud.azure.compute.ContainerInstance;
import org.nasdanika.architecture.cloud.azure.networking.impl.SubnetResourceImpl;
import org.nasdanika.architecture.containers.docker.DockerPackage;
import org.nasdanika.architecture.containers.docker.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.cloud.azure.compute.impl.ContainerInstanceImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerInstanceImpl extends SubnetResourceImpl implements ContainerInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.CONTAINER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getImage() {
		return (Image)eDynamicGet(ComputePackage.CONTAINER_INSTANCE__IMAGE, DockerPackage.Literals.CONTAINER__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetImage() {
		return (Image)eDynamicGet(ComputePackage.CONTAINER_INSTANCE__IMAGE, DockerPackage.Literals.CONTAINER__IMAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(Image newImage) {
		eDynamicSet(ComputePackage.CONTAINER_INSTANCE__IMAGE, DockerPackage.Literals.CONTAINER__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.CONTAINER_INSTANCE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComputePackage.CONTAINER_INSTANCE__IMAGE:
				setImage((Image)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComputePackage.CONTAINER_INSTANCE__IMAGE:
				setImage((Image)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComputePackage.CONTAINER_INSTANCE__IMAGE:
				return basicGetImage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.nasdanika.architecture.containers.docker.Container.class) {
			switch (derivedFeatureID) {
				case ComputePackage.CONTAINER_INSTANCE__IMAGE: return DockerPackage.CONTAINER__IMAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.nasdanika.architecture.containers.docker.Container.class) {
			switch (baseFeatureID) {
				case DockerPackage.CONTAINER__IMAGE: return ComputePackage.CONTAINER_INSTANCE__IMAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContainerInstanceImpl
