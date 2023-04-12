/**
 */
package org.nasdanika.architecture.cloud.azure.storage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.architecture.cloud.azure.core.AzureElement;
import org.nasdanika.architecture.cloud.azure.core.Resource;
import org.nasdanika.architecture.cloud.azure.storage.*;
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
 * @see org.nasdanika.architecture.cloud.azure.storage.StoragePackage
 * @generated
 */
public class StorageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StoragePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageSwitch() {
		if (modelPackage == null) {
			modelPackage = StoragePackage.eINSTANCE;
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
			case StoragePackage.STORAGE_ACCOUNT: {
				StorageAccount storageAccount = (StorageAccount)theEObject;
				T result = caseStorageAccount(storageAccount);
				if (result == null) result = caseResource(storageAccount);
				if (result == null) result = caseAzureElement(storageAccount);
				if (result == null) result = caseArchitectureElement(storageAccount);
				if (result == null) result = casePeriod(storageAccount);
				if (result == null) result = caseCore_ModelElement(storageAccount);
				if (result == null) result = caseNamedElement(storageAccount);
				if (result == null) result = caseDocumented(storageAccount);
				if (result == null) result = caseModelElement(storageAccount);
				if (result == null) result = caseMarked(storageAccount);
				if (result == null) result = caseAdaptable(storageAccount);
				if (result == null) result = caseIMarked(storageAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StoragePackage.BLOB_STORAGE: {
				BlobStorage blobStorage = (BlobStorage)theEObject;
				T result = caseBlobStorage(blobStorage);
				if (result == null) result = caseAzureElement(blobStorage);
				if (result == null) result = caseArchitectureElement(blobStorage);
				if (result == null) result = casePeriod(blobStorage);
				if (result == null) result = caseCore_ModelElement(blobStorage);
				if (result == null) result = caseNamedElement(blobStorage);
				if (result == null) result = caseDocumented(blobStorage);
				if (result == null) result = caseModelElement(blobStorage);
				if (result == null) result = caseMarked(blobStorage);
				if (result == null) result = caseAdaptable(blobStorage);
				if (result == null) result = caseIMarked(blobStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StoragePackage.DATA_LAKE_STORAGE_GEN2: {
				DataLakeStorageGen2 dataLakeStorageGen2 = (DataLakeStorageGen2)theEObject;
				T result = caseDataLakeStorageGen2(dataLakeStorageGen2);
				if (result == null) result = caseAzureElement(dataLakeStorageGen2);
				if (result == null) result = caseArchitectureElement(dataLakeStorageGen2);
				if (result == null) result = casePeriod(dataLakeStorageGen2);
				if (result == null) result = caseCore_ModelElement(dataLakeStorageGen2);
				if (result == null) result = caseNamedElement(dataLakeStorageGen2);
				if (result == null) result = caseDocumented(dataLakeStorageGen2);
				if (result == null) result = caseModelElement(dataLakeStorageGen2);
				if (result == null) result = caseMarked(dataLakeStorageGen2);
				if (result == null) result = caseAdaptable(dataLakeStorageGen2);
				if (result == null) result = caseIMarked(dataLakeStorageGen2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StoragePackage.AZURE_FILES: {
				AzureFiles azureFiles = (AzureFiles)theEObject;
				T result = caseAzureFiles(azureFiles);
				if (result == null) result = caseAzureElement(azureFiles);
				if (result == null) result = caseArchitectureElement(azureFiles);
				if (result == null) result = casePeriod(azureFiles);
				if (result == null) result = caseCore_ModelElement(azureFiles);
				if (result == null) result = caseNamedElement(azureFiles);
				if (result == null) result = caseDocumented(azureFiles);
				if (result == null) result = caseModelElement(azureFiles);
				if (result == null) result = caseMarked(azureFiles);
				if (result == null) result = caseAdaptable(azureFiles);
				if (result == null) result = caseIMarked(azureFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StoragePackage.QUEUE_STORAGE: {
				QueueStorage queueStorage = (QueueStorage)theEObject;
				T result = caseQueueStorage(queueStorage);
				if (result == null) result = caseAzureElement(queueStorage);
				if (result == null) result = caseArchitectureElement(queueStorage);
				if (result == null) result = casePeriod(queueStorage);
				if (result == null) result = caseCore_ModelElement(queueStorage);
				if (result == null) result = caseNamedElement(queueStorage);
				if (result == null) result = caseDocumented(queueStorage);
				if (result == null) result = caseModelElement(queueStorage);
				if (result == null) result = caseMarked(queueStorage);
				if (result == null) result = caseAdaptable(queueStorage);
				if (result == null) result = caseIMarked(queueStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StoragePackage.TABLE_STORAGE: {
				TableStorage tableStorage = (TableStorage)theEObject;
				T result = caseTableStorage(tableStorage);
				if (result == null) result = caseAzureElement(tableStorage);
				if (result == null) result = caseArchitectureElement(tableStorage);
				if (result == null) result = casePeriod(tableStorage);
				if (result == null) result = caseCore_ModelElement(tableStorage);
				if (result == null) result = caseNamedElement(tableStorage);
				if (result == null) result = caseDocumented(tableStorage);
				if (result == null) result = caseModelElement(tableStorage);
				if (result == null) result = caseMarked(tableStorage);
				if (result == null) result = caseAdaptable(tableStorage);
				if (result == null) result = caseIMarked(tableStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageAccount(StorageAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlobStorage(BlobStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Lake Storage Gen2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Lake Storage Gen2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLakeStorageGen2(DataLakeStorageGen2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Azure Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Azure Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAzureFiles(AzureFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueStorage(QueueStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableStorage(TableStorage object) {
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

} //StorageSwitch
