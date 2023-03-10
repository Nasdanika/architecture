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
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getStages <em>Stages</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getImpactedBy <em>Impacted By</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.architecture.core.ArchitectureElement#getViewElements <em>View Elements</em>}</li>
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
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Architecture element lifecycle stages. E.g. releases/versions for a technology product or lifecycle for a technology product release. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Stages()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Stage> getStages();

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
	 * Stages which impact this element. A computed opposite to Impact.elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacted By</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_ImpactedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Impact> getImpactedBy();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element's tags
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_Tags()
	 * @model annotation="urn:org.nasdanika opposite='tagged'"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>View Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.core.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * View elements representing this architecture element. A computed opposite to ViewElement.architectureElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Elements</em>' reference list.
	 * @see org.nasdanika.architecture.core.CorePackage#getArchitectureElement_ViewElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ViewElement> getViewElements();

} // ArchitectureElement
