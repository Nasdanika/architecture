/**
 */
package org.nasdanika.architecture.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.architecture.core.*;
import org.nasdanika.common.Adaptable;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;
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
 * @see org.nasdanika.architecture.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseNamedElement(modelElement);
				if (result == null) result = caseDocumented(modelElement);
				if (result == null) result = caseNcore_ModelElement(modelElement);
				if (result == null) result = caseMarked(modelElement);
				if (result == null) result = caseAdaptable(modelElement);
				if (result == null) result = caseIMarked(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseTemporal(event);
				if (result == null) result = caseModelElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = caseDocumented(event);
				if (result == null) result = caseNcore_ModelElement(event);
				if (result == null) result = caseMarked(event);
				if (result == null) result = caseAdaptable(event);
				if (result == null) result = caseIMarked(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACET: {
				Facet facet = (Facet)theEObject;
				T result = caseFacet(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARCHITECTURE_ELEMENT: {
				ArchitectureElement architectureElement = (ArchitectureElement)theEObject;
				T result = caseArchitectureElement(architectureElement);
				if (result == null) result = casePeriod(architectureElement);
				if (result == null) result = caseModelElement(architectureElement);
				if (result == null) result = caseNamedElement(architectureElement);
				if (result == null) result = caseDocumented(architectureElement);
				if (result == null) result = caseNcore_ModelElement(architectureElement);
				if (result == null) result = caseMarked(architectureElement);
				if (result == null) result = caseAdaptable(architectureElement);
				if (result == null) result = caseIMarked(architectureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseArchitectureElement(domain);
				if (result == null) result = casePeriod(domain);
				if (result == null) result = caseModelElement(domain);
				if (result == null) result = caseNamedElement(domain);
				if (result == null) result = caseDocumented(domain);
				if (result == null) result = caseNcore_ModelElement(domain);
				if (result == null) result = caseMarked(domain);
				if (result == null) result = caseAdaptable(domain);
				if (result == null) result = caseIMarked(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STAGE: {
				Stage stage = (Stage)theEObject;
				T result = caseStage(stage);
				if (result == null) result = caseArchitectureElement(stage);
				if (result == null) result = casePeriod(stage);
				if (result == null) result = caseModelElement(stage);
				if (result == null) result = caseNamedElement(stage);
				if (result == null) result = caseDocumented(stage);
				if (result == null) result = caseNcore_ModelElement(stage);
				if (result == null) result = caseMarked(stage);
				if (result == null) result = caseAdaptable(stage);
				if (result == null) result = caseIMarked(stage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPACT_TYPE: {
				ImpactType impactType = (ImpactType)theEObject;
				T result = caseImpactType(impactType);
				if (result == null) result = caseModelElement(impactType);
				if (result == null) result = caseNamedElement(impactType);
				if (result == null) result = caseDocumented(impactType);
				if (result == null) result = caseNcore_ModelElement(impactType);
				if (result == null) result = caseMarked(impactType);
				if (result == null) result = caseAdaptable(impactType);
				if (result == null) result = caseIMarked(impactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPACT: {
				Impact impact = (Impact)theEObject;
				T result = caseImpact(impact);
				if (result == null) result = caseModelElement(impact);
				if (result == null) result = caseNamedElement(impact);
				if (result == null) result = caseDocumented(impact);
				if (result == null) result = caseNcore_ModelElement(impact);
				if (result == null) result = caseMarked(impact);
				if (result == null) result = caseAdaptable(impact);
				if (result == null) result = caseIMarked(impact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseArchitectureElement(node);
				if (result == null) result = casePeriod(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseDocumented(node);
				if (result == null) result = caseNcore_ModelElement(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = caseAdaptable(node);
				if (result == null) result = caseIMarked(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseArchitectureElement(relationship);
				if (result == null) result = casePeriod(relationship);
				if (result == null) result = caseModelElement(relationship);
				if (result == null) result = caseNamedElement(relationship);
				if (result == null) result = caseDocumented(relationship);
				if (result == null) result = caseNcore_ModelElement(relationship);
				if (result == null) result = caseMarked(relationship);
				if (result == null) result = caseAdaptable(relationship);
				if (result == null) result = caseIMarked(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPOSITE_NODE: {
				CompositeNode compositeNode = (CompositeNode)theEObject;
				T result = caseCompositeNode(compositeNode);
				if (result == null) result = caseNode(compositeNode);
				if (result == null) result = caseArchitectureElement(compositeNode);
				if (result == null) result = casePeriod(compositeNode);
				if (result == null) result = caseModelElement(compositeNode);
				if (result == null) result = caseNamedElement(compositeNode);
				if (result == null) result = caseDocumented(compositeNode);
				if (result == null) result = caseNcore_ModelElement(compositeNode);
				if (result == null) result = caseMarked(compositeNode);
				if (result == null) result = caseAdaptable(compositeNode);
				if (result == null) result = caseIMarked(compositeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseModelElement(tag);
				if (result == null) result = caseNamedElement(tag);
				if (result == null) result = caseDocumented(tag);
				if (result == null) result = caseNcore_ModelElement(tag);
				if (result == null) result = caseMarked(tag);
				if (result == null) result = caseAdaptable(tag);
				if (result == null) result = caseIMarked(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseModelElement(stakeholder);
				if (result == null) result = caseNamedElement(stakeholder);
				if (result == null) result = caseDocumented(stakeholder);
				if (result == null) result = caseNcore_ModelElement(stakeholder);
				if (result == null) result = caseMarked(stakeholder);
				if (result == null) result = caseAdaptable(stakeholder);
				if (result == null) result = caseIMarked(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONCERN: {
				Concern concern = (Concern)theEObject;
				T result = caseConcern(concern);
				if (result == null) result = caseModelElement(concern);
				if (result == null) result = caseNamedElement(concern);
				if (result == null) result = caseDocumented(concern);
				if (result == null) result = caseNcore_ModelElement(concern);
				if (result == null) result = caseMarked(concern);
				if (result == null) result = caseAdaptable(concern);
				if (result == null) result = caseIMarked(concern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEWPOINT: {
				Viewpoint viewpoint = (Viewpoint)theEObject;
				T result = caseViewpoint(viewpoint);
				if (result == null) result = caseModelElement(viewpoint);
				if (result == null) result = caseNamedElement(viewpoint);
				if (result == null) result = caseDocumented(viewpoint);
				if (result == null) result = caseNcore_ModelElement(viewpoint);
				if (result == null) result = caseMarked(viewpoint);
				if (result == null) result = caseAdaptable(viewpoint);
				if (result == null) result = caseIMarked(viewpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseModelElement(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = caseDocumented(view);
				if (result == null) result = caseNcore_ModelElement(view);
				if (result == null) result = caseMarked(view);
				if (result == null) result = caseAdaptable(view);
				if (result == null) result = caseIMarked(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T result = caseViewElement(viewElement);
				if (result == null) result = caseModelElement(viewElement);
				if (result == null) result = caseNamedElement(viewElement);
				if (result == null) result = caseDocumented(viewElement);
				if (result == null) result = caseNcore_ModelElement(viewElement);
				if (result == null) result = caseMarked(viewElement);
				if (result == null) result = caseAdaptable(viewElement);
				if (result == null) result = caseIMarked(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacet(Facet object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpactType(ImpactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpact(Impact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeNode(CompositeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcern(Concern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
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
	public T caseNcore_ModelElement(org.nasdanika.ncore.ModelElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporal(Temporal object) {
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

} //CoreSwitch
