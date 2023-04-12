/**
 */
package org.nasdanika.architecture.cloud.azure.storage.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.architecture.cloud.azure.core.impl.AzureElementImpl;

import org.nasdanika.architecture.cloud.azure.storage.QueueStorage;
import org.nasdanika.architecture.cloud.azure.storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueueStorageImpl extends AzureElementImpl implements QueueStorage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.QUEUE_STORAGE;
	}

} //QueueStorageImpl
