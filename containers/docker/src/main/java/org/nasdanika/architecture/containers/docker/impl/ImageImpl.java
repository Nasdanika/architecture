/**
 */
package org.nasdanika.architecture.containers.docker.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.architecture.containers.docker.DockerPackage;
import org.nasdanika.architecture.containers.docker.Image;
import org.nasdanika.architecture.containers.docker.Registry;
import org.nasdanika.architecture.core.impl.ArchitectureElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.containers.docker.impl.ImageImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.impl.ImageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.impl.ImageImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.architecture.containers.docker.impl.ImageImpl#getRegistries <em>Registries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ArchitectureElementImpl implements Image {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getFrom() {
		return (Image)eDynamicGet(DockerPackage.IMAGE__FROM, DockerPackage.Literals.IMAGE__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetFrom() {
		return (Image)eDynamicGet(DockerPackage.IMAGE__FROM, DockerPackage.Literals.IMAGE__FROM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Image newFrom) {
		eDynamicSet(DockerPackage.IMAGE__FROM, DockerPackage.Literals.IMAGE__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Image> getChildren() {
		// TODO: implement this method to return the 'Children' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.nasdanika.architecture.containers.docker.Container> getContainers() {
		// TODO: implement this method to return the 'Containers' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Registry> getRegistries() {
		// TODO: implement this method to return the 'Registries' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.IMAGE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case DockerPackage.IMAGE__CHILDREN:
				return getChildren();
			case DockerPackage.IMAGE__CONTAINERS:
				return getContainers();
			case DockerPackage.IMAGE__REGISTRIES:
				return getRegistries();
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
			case DockerPackage.IMAGE__FROM:
				setFrom((Image)newValue);
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
			case DockerPackage.IMAGE__FROM:
				setFrom((Image)null);
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
			case DockerPackage.IMAGE__FROM:
				return basicGetFrom() != null;
			case DockerPackage.IMAGE__CHILDREN:
				return !getChildren().isEmpty();
			case DockerPackage.IMAGE__CONTAINERS:
				return !getContainers().isEmpty();
			case DockerPackage.IMAGE__REGISTRIES:
				return !getRegistries().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImageImpl
