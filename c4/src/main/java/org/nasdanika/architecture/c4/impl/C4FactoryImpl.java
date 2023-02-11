/**
 */
package org.nasdanika.architecture.c4.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.architecture.c4.C4Factory;
import org.nasdanika.architecture.c4.C4Package;
import org.nasdanika.architecture.c4.CodeElement;
import org.nasdanika.architecture.c4.Component;
import org.nasdanika.architecture.c4.Node;
import org.nasdanika.architecture.c4.Person;
import org.nasdanika.architecture.c4.Relationship;
import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.c4.TechnologyConsumer;
import org.nasdanika.architecture.c4.TechnologyProduct;
import org.nasdanika.architecture.c4.TechnologyVersion;
import org.nasdanika.architecture.c4.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4FactoryImpl extends EFactoryImpl implements C4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static C4Factory init() {
		try {
			C4Factory theC4Factory = (C4Factory)EPackage.Registry.INSTANCE.getEFactory(C4Package.eNS_URI);
			if (theC4Factory != null) {
				return theC4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new C4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case C4Package.TECHNOLOGY: return createTechnology();
			case C4Package.TECHNOLOGY_PRODUCT: return createTechnologyProduct();
			case C4Package.TECHNOLOGY_VERSION: return createTechnologyVersion();
			case C4Package.TECHNOLOGY_CONSUMER: return createTechnologyConsumer();
			case C4Package.NODE: return createNode();
			case C4Package.RELATIONSHIP: return createRelationship();
			case C4Package.PERSON: return createPerson();
			case C4Package.SYSTEM: return createSystem();
			case C4Package.CONTAINER: return createContainer();
			case C4Package.COMPONENT: return createComponent();
			case C4Package.MODULE: return createModule();
			case C4Package.CODE_ELEMENT: return createCodeElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnologyProduct createTechnologyProduct() {
		TechnologyProductImpl technologyProduct = new TechnologyProductImpl();
		return technologyProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnologyVersion createTechnologyVersion() {
		TechnologyVersionImpl technologyVersion = new TechnologyVersionImpl();
		return technologyVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnologyConsumer createTechnologyConsumer() {
		TechnologyConsumerImpl technologyConsumer = new TechnologyConsumerImpl();
		return technologyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.architecture.c4.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.architecture.c4.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.architecture.c4.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeElement createCodeElement() {
		CodeElementImpl codeElement = new CodeElementImpl();
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C4Package getC4Package() {
		return (C4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static C4Package getPackage() {
		return C4Package.eINSTANCE;
	}

} //C4FactoryImpl
