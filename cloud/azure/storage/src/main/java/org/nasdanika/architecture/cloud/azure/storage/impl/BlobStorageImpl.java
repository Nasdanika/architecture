/**
 */
package org.nasdanika.architecture.cloud.azure.storage.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.core.impl.AzureElementImpl;

import org.nasdanika.architecture.cloud.azure.storage.BlobStorage;
import org.nasdanika.architecture.cloud.azure.storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blob Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlobStorageImpl extends AzureElementImpl implements BlobStorage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlobStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.BLOB_STORAGE;
	}

} //BlobStorageImpl
