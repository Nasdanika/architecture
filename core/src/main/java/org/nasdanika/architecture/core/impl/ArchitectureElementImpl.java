/**
 */
package org.nasdanika.architecture.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.Event;
import org.nasdanika.architecture.core.Facet;
import org.nasdanika.architecture.core.Impact;
import org.nasdanika.architecture.core.Increment;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Property;
import org.nasdanika.ncore.impl.PeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.impl.ArchitectureElementImpl#getImpactedBy <em>Impacted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureElementImpl extends PeriodImpl implements ArchitectureElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARCHITECTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CorePackage.ARCHITECTURE_ELEMENT__NAME, NcorePackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CorePackage.ARCHITECTURE_ELEMENT__ID, CorePackage.Literals.MODEL_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Event> getEvents() {
		return (EList<Event>)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__EVENTS, CorePackage.Literals.ARCHITECTURE_ELEMENT__EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Increment> getIncrements() {
		return (EList<Increment>)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS, CorePackage.Literals.ARCHITECTURE_ELEMENT__INCREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Facet> getFacets() {
		return (EList<Facet>)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__FACETS, CorePackage.Literals.ARCHITECTURE_ELEMENT__FACETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getProperties() {
		return (EList<Property>)eDynamicGet(CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES, CorePackage.Literals.ARCHITECTURE_ELEMENT__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Impact> getImpactedBy() {
		// TODO: implement this method to return the 'Impacted By' reference list
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CorePackage.ARCHITECTURE_ELEMENT__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS:
				return ((InternalEList<?>)getIncrements()).basicRemove(otherEnd, msgs);
			case CorePackage.ARCHITECTURE_ELEMENT__FACETS:
				return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
			case CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_ELEMENT__NAME:
				return getName();
			case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.ARCHITECTURE_ELEMENT__ID:
				return getId();
			case CorePackage.ARCHITECTURE_ELEMENT__EVENTS:
				return getEvents();
			case CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS:
				return getIncrements();
			case CorePackage.ARCHITECTURE_ELEMENT__FACETS:
				return getFacets();
			case CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES:
				return getProperties();
			case CorePackage.ARCHITECTURE_ELEMENT__IMPACTED_BY:
				return getImpactedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ARCHITECTURE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__ID:
				setId((String)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS:
				getIncrements().clear();
				getIncrements().addAll((Collection<? extends Increment>)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends Facet>)newValue);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case CorePackage.ARCHITECTURE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__EVENTS:
				getEvents().clear();
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS:
				getIncrements().clear();
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__FACETS:
				getFacets().clear();
				return;
			case CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES:
				getProperties().clear();
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
			case CorePackage.ARCHITECTURE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CorePackage.ARCHITECTURE_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CorePackage.ARCHITECTURE_ELEMENT__EVENTS:
				return !getEvents().isEmpty();
			case CorePackage.ARCHITECTURE_ELEMENT__INCREMENTS:
				return !getIncrements().isEmpty();
			case CorePackage.ARCHITECTURE_ELEMENT__FACETS:
				return !getFacets().isEmpty();
			case CorePackage.ARCHITECTURE_ELEMENT__PROPERTIES:
				return !getProperties().isEmpty();
			case CorePackage.ARCHITECTURE_ELEMENT__IMPACTED_BY:
				return !getImpactedBy().isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ARCHITECTURE_ELEMENT__NAME: return NcorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION: return NcorePackage.DOCUMENTED__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ARCHITECTURE_ELEMENT__ID: return CorePackage.MODEL_ELEMENT__ID;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.NAMED_ELEMENT__NAME: return CorePackage.ARCHITECTURE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED__DOCUMENTATION: return CorePackage.ARCHITECTURE_ELEMENT__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case CorePackage.MODEL_ELEMENT__ID: return CorePackage.ARCHITECTURE_ELEMENT__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArchitectureElementImpl
