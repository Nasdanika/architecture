/**
 */
package org.nasdanika.architecture.core;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element of an architecture model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getImpactedBy <em>Impacted By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement()
 * @model
 * @generated
 */
public interface ArchitectureElement extends Period, ModelElement {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Events associated with this architecture element. Events can be used as bases for temporals and periods, e.g. other architecture elements or increments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Events()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Increments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Increment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture element increments. E.g. releases/versions for a technology product or lifecycle for a technology product release. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increments</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Increments()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Increment> getIncrements();

	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Facet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facets allow to enrich an architecture element. For example, an increment might have a cost model facet describing different types of cost associated with the increment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Facets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Facet> getFacets();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.ncore.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture element properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Properties()
	 * @model containment="true" keys="name"
	 *        annotation="urn:org.nasdanika reference-type='map: \n  ns-uri: urn:org.nasdanika.ncore\n  name: MapProperty\nlist: \n  ns-uri: urn:org.nasdanika.ncore\n  name: ListProperty\nstring: \n  ns-uri: urn:org.nasdanika.ncore\n  name: StringProperty\ninteger: \n  ns-uri: urn:org.nasdanika.ncore\n  name: IntegerProperty' value-feature='value'"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Impacted By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Impact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increments which impact this element. A computed opposite to Impact.elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacted By</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_ImpactedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Impact> getImpactedBy();

} // ArchitectureElement
