/**
 */
package org.nasdanika.architecture.c4.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.architecture.c4.C4Package;
import org.nasdanika.architecture.c4.CodeElement;
import org.nasdanika.architecture.c4.Component;
import org.nasdanika.architecture.c4.Container;
import org.nasdanika.architecture.c4.Person;
import org.nasdanika.architecture.c4.Relationship;
import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.c4.TechnologyConsumer;
import org.nasdanika.architecture.c4.TechnologyProduct;
import org.nasdanika.architecture.c4.TechnologyVersion;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.architecture.core.Domain;
import org.nasdanika.architecture.core.Node;
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
 * @see org.nasdanika.architecture.c4.C4Package
 * @generated
 */
public class C4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4Switch() {
		if (modelPackage == null) {
			modelPackage = C4Package.eINSTANCE;
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
			case C4Package.TECHNOLOGY: {
				Technology technology = (Technology)theEObject;
				T result = caseTechnology(technology);
				if (result == null) result = caseArchitectureElement(technology);
				if (result == null) result = casePeriod(technology);
				if (result == null) result = caseCore_ModelElement(technology);
				if (result == null) result = caseNamedElement(technology);
				if (result == null) result = caseDocumented(technology);
				if (result == null) result = caseModelElement(technology);
				if (result == null) result = caseMarked(technology);
				if (result == null) result = caseAdaptable(technology);
				if (result == null) result = caseIMarked(technology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.TECHNOLOGY_PRODUCT: {
				TechnologyProduct technologyProduct = (TechnologyProduct)theEObject;
				T result = caseTechnologyProduct(technologyProduct);
				if (result == null) result = caseTechnology(technologyProduct);
				if (result == null) result = caseArchitectureElement(technologyProduct);
				if (result == null) result = casePeriod(technologyProduct);
				if (result == null) result = caseCore_ModelElement(technologyProduct);
				if (result == null) result = caseNamedElement(technologyProduct);
				if (result == null) result = caseDocumented(technologyProduct);
				if (result == null) result = caseModelElement(technologyProduct);
				if (result == null) result = caseMarked(technologyProduct);
				if (result == null) result = caseAdaptable(technologyProduct);
				if (result == null) result = caseIMarked(technologyProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.TECHNOLOGY_VERSION: {
				TechnologyVersion technologyVersion = (TechnologyVersion)theEObject;
				T result = caseTechnologyVersion(technologyVersion);
				if (result == null) result = caseTechnology(technologyVersion);
				if (result == null) result = caseArchitectureElement(technologyVersion);
				if (result == null) result = casePeriod(technologyVersion);
				if (result == null) result = caseCore_ModelElement(technologyVersion);
				if (result == null) result = caseNamedElement(technologyVersion);
				if (result == null) result = caseDocumented(technologyVersion);
				if (result == null) result = caseModelElement(technologyVersion);
				if (result == null) result = caseMarked(technologyVersion);
				if (result == null) result = caseAdaptable(technologyVersion);
				if (result == null) result = caseIMarked(technologyVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.TECHNOLOGY_CONSUMER: {
				TechnologyConsumer technologyConsumer = (TechnologyConsumer)theEObject;
				T result = caseTechnologyConsumer(technologyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseCore_Relationship(relationship);
				if (result == null) result = caseTechnologyConsumer(relationship);
				if (result == null) result = caseArchitectureElement(relationship);
				if (result == null) result = casePeriod(relationship);
				if (result == null) result = caseCore_ModelElement(relationship);
				if (result == null) result = caseNamedElement(relationship);
				if (result == null) result = caseDocumented(relationship);
				if (result == null) result = caseModelElement(relationship);
				if (result == null) result = caseMarked(relationship);
				if (result == null) result = caseAdaptable(relationship);
				if (result == null) result = caseIMarked(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseNode(person);
				if (result == null) result = caseArchitectureElement(person);
				if (result == null) result = casePeriod(person);
				if (result == null) result = caseCore_ModelElement(person);
				if (result == null) result = caseNamedElement(person);
				if (result == null) result = caseDocumented(person);
				if (result == null) result = caseModelElement(person);
				if (result == null) result = caseMarked(person);
				if (result == null) result = caseAdaptable(person);
				if (result == null) result = caseIMarked(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.SYSTEM: {
				org.nasdanika.architecture.c4.System system = (org.nasdanika.architecture.c4.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseNode(system);
				if (result == null) result = caseDomain(system);
				if (result == null) result = caseArchitectureElement(system);
				if (result == null) result = casePeriod(system);
				if (result == null) result = caseCore_ModelElement(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = caseDocumented(system);
				if (result == null) result = caseModelElement(system);
				if (result == null) result = caseMarked(system);
				if (result == null) result = caseAdaptable(system);
				if (result == null) result = caseIMarked(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseNode(container);
				if (result == null) result = caseTechnologyConsumer(container);
				if (result == null) result = caseArchitectureElement(container);
				if (result == null) result = casePeriod(container);
				if (result == null) result = caseCore_ModelElement(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseDocumented(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = caseMarked(container);
				if (result == null) result = caseAdaptable(container);
				if (result == null) result = caseIMarked(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseModule(component);
				if (result == null) result = caseNode(component);
				if (result == null) result = caseTechnologyConsumer(component);
				if (result == null) result = caseArchitectureElement(component);
				if (result == null) result = casePeriod(component);
				if (result == null) result = caseCore_ModelElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseDocumented(component);
				if (result == null) result = caseModelElement(component);
				if (result == null) result = caseMarked(component);
				if (result == null) result = caseAdaptable(component);
				if (result == null) result = caseIMarked(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.MODULE: {
				org.nasdanika.architecture.c4.Module module = (org.nasdanika.architecture.c4.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNode(module);
				if (result == null) result = caseTechnologyConsumer(module);
				if (result == null) result = caseArchitectureElement(module);
				if (result == null) result = casePeriod(module);
				if (result == null) result = caseCore_ModelElement(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseDocumented(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseMarked(module);
				if (result == null) result = caseAdaptable(module);
				if (result == null) result = caseIMarked(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.CODE_ELEMENT: {
				CodeElement codeElement = (CodeElement)theEObject;
				T result = caseCodeElement(codeElement);
				if (result == null) result = caseNode(codeElement);
				if (result == null) result = caseArchitectureElement(codeElement);
				if (result == null) result = casePeriod(codeElement);
				if (result == null) result = caseCore_ModelElement(codeElement);
				if (result == null) result = caseNamedElement(codeElement);
				if (result == null) result = caseDocumented(codeElement);
				if (result == null) result = caseModelElement(codeElement);
				if (result == null) result = caseMarked(codeElement);
				if (result == null) result = caseAdaptable(codeElement);
				if (result == null) result = caseIMarked(codeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnology(Technology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyProduct(TechnologyProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyVersion(TechnologyVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyConsumer(TechnologyConsumer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.nasdanika.architecture.c4.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.nasdanika.architecture.c4.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeElement(CodeElement object) {
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
	public T caseCore_Relationship(org.nasdanika.architecture.core.Relationship object) {
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

} //C4Switch
