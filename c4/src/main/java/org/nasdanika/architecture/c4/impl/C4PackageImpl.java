/**
 */
package org.nasdanika.architecture.c4.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4PackageImpl extends EPackageImpl implements C4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyProductEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyVersionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyConsumerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.architecture.c4.C4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private C4PackageImpl() {
		super(eNS_URI, C4Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link C4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static C4Package init() {
		if (isInited) return (C4Package)EPackage.Registry.INSTANCE.getEPackage(C4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredC4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		C4PackageImpl theC4Package = registeredC4Package instanceof C4PackageImpl ? (C4PackageImpl)registeredC4Package : new C4PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theC4Package.createPackageContents();

		// Initialize created meta-data
		theC4Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theC4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(C4Package.eNS_URI, theC4Package);
		return theC4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnology_Uses() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnologyProduct() {
		return technologyProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnologyProduct_Versions() {
		return (EReference)technologyProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnologyVersion() {
		return technologyVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnologyConsumer() {
		return technologyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnologyConsumer_Technology() {
		return (EReference)technologyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingRelationships() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingRelationships() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_External() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystem_External() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Containers() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Subsystems() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Components() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Children() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_CodeElements() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Modules() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeElement() {
		return codeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C4Factory getC4Factory() {
		return (C4Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		technologyEClass = createEClass(TECHNOLOGY);
		createEReference(technologyEClass, TECHNOLOGY__USES);

		technologyProductEClass = createEClass(TECHNOLOGY_PRODUCT);
		createEReference(technologyProductEClass, TECHNOLOGY_PRODUCT__VERSIONS);

		technologyVersionEClass = createEClass(TECHNOLOGY_VERSION);

		technologyConsumerEClass = createEClass(TECHNOLOGY_CONSUMER);
		createEReference(technologyConsumerEClass, TECHNOLOGY_CONSUMER__TECHNOLOGY);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTGOING_RELATIONSHIPS);
		createEReference(nodeEClass, NODE__INCOMING_RELATIONSHIPS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__EXTERNAL);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__EXTERNAL);
		createEReference(systemEClass, SYSTEM__CONTAINERS);
		createEReference(systemEClass, SYSTEM__SUBSYSTEMS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__COMPONENTS);
		createEReference(containerEClass, CONTAINER__CHILDREN);

		componentEClass = createEClass(COMPONENT);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CODE_ELEMENTS);
		createEReference(moduleEClass, MODULE__MODULES);

		codeElementEClass = createEClass(CODE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		technologyEClass.getESuperTypes().add(theCorePackage.getArchitectureElement());
		technologyProductEClass.getESuperTypes().add(this.getTechnology());
		technologyVersionEClass.getESuperTypes().add(this.getTechnology());
		nodeEClass.getESuperTypes().add(theCorePackage.getArchitectureElement());
		relationshipEClass.getESuperTypes().add(theCorePackage.getArchitectureElement());
		relationshipEClass.getESuperTypes().add(this.getTechnologyConsumer());
		personEClass.getESuperTypes().add(this.getNode());
		systemEClass.getESuperTypes().add(this.getNode());
		containerEClass.getESuperTypes().add(this.getNode());
		containerEClass.getESuperTypes().add(this.getTechnologyConsumer());
		componentEClass.getESuperTypes().add(this.getModule());
		moduleEClass.getESuperTypes().add(this.getNode());
		moduleEClass.getESuperTypes().add(this.getTechnologyConsumer());
		codeElementEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnology_Uses(), this.getTechnologyConsumer(), null, "uses", null, 0, -1, Technology.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(technologyProductEClass, TechnologyProduct.class, "TechnologyProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologyProduct_Versions(), this.getTechnologyVersion(), null, "versions", null, 0, -1, TechnologyProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyVersionEClass, TechnologyVersion.class, "TechnologyVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technologyConsumerEClass, TechnologyConsumer.class, "TechnologyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologyConsumer_Technology(), this.getTechnology(), null, "technology", null, 0, -1, TechnologyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_OutgoingRelationships(), this.getRelationship(), null, "outgoingRelationships", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_OutgoingRelationships().getEKeys().add(theCorePackage.getModelElement_Id());
		initEReference(getNode_IncomingRelationships(), this.getRelationship(), null, "incomingRelationships", null, 0, -1, Node.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Target(), this.getNode(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, org.nasdanika.architecture.c4.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, org.nasdanika.architecture.c4.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Containers(), this.getContainer(), null, "containers", null, 0, -1, org.nasdanika.architecture.c4.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Subsystems(), this.getSystem(), null, "subsystems", null, 0, -1, org.nasdanika.architecture.c4.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.architecture.c4.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Components(), this.getComponent(), null, "components", null, 0, -1, org.nasdanika.architecture.c4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Children(), this.getContainer(), null, "children", null, 0, -1, org.nasdanika.architecture.c4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, org.nasdanika.architecture.c4.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_CodeElements(), this.getCodeElement(), null, "codeElements", null, 0, -1, org.nasdanika.architecture.c4.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Modules(), this.getModule(), null, "modules", null, 0, -1, org.nasdanika.architecture.c4.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation-reference", "doc/package-summary.md"
		   });
		addAnnotation
		  (getTechnologyProduct_Versions(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getTechnologyConsumer_Technology(),
		   source,
		   new String[] {
			   "opposite", "uses"
		   });
		addAnnotation
		  (getNode_OutgoingRelationships(),
		   source,
		   new String[] {
			   "homogenous", "true",
			   "strict-containment", "true"
		   });
		addAnnotation
		  (getRelationship_Target(),
		   source,
		   new String[] {
			   "opposite", "incomingRelationships",
			   "default-feature", "true"
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/container.md"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/component.md"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (technologyEClass,
		   source,
		   new String[] {
			   "documentation", "A class representing some technology. E.g. a software product or its version."
		   });
		addAnnotation
		  (getTechnology_Uses(),
		   source,
		   new String[] {
			   "documentation", "Uses of this technology - computed opposite to TechnologyConsumer.technology"
		   });
		addAnnotation
		  (technologyProductEClass,
		   source,
		   new String[] {
			   "documentation", "Technology product. For example, a software product like Java, or a standard like TOGAF or HTML."
		   });
		addAnnotation
		  (technologyVersionEClass,
		   source,
		   new String[] {
			   "documentation", "Version of a technology product. E.g. Java 17, TOGAF 10, or HTML 5."
		   });
		addAnnotation
		  (technologyConsumerEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for classes which leverage technologies, e.g. a container or a component."
		   });
		addAnnotation
		  (getTechnologyConsumer_Technology(),
		   source,
		   new String[] {
			   "documentation", "Technologies used by this element"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "documentation", "Source and target of relationships"
		   });
		addAnnotation
		  (getNode_OutgoingRelationships(),
		   source,
		   new String[] {
			   "documentation", "Outgoing relationships"
		   });
		addAnnotation
		  (getNode_IncomingRelationships(),
		   source,
		   new String[] {
			   "documentation", "Incoming relationships - a computed opposite to Relationship.target"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "documentation", "A relationship between two nodes. Relationships are contained by their source nodes and reference their targets using the target reference."
		   });
		addAnnotation
		  (getRelationship_Target(),
		   source,
		   new String[] {
			   "documentation", "Relationship target."
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "documentation", "A person represents one of the human users of your software system (e.g. actors, roles, personas, etc)."
		   });
		addAnnotation
		  (getPerson_External(),
		   source,
		   new String[] {
			   "documentation", "If true, the person is external to the system described by the architecture. In other words it is not part of the system, but belongs to the system context/surroundings."
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "documentation", "A software system is the highest level of abstraction and describes something that delivers value to its users, whether they are human or not. This includes the software system you are modelling, and the other software systems upon which your software system depends (or vice versa). "
		   });
		addAnnotation
		  (getSystem_External(),
		   source,
		   new String[] {
			   "documentation", "If true, the system is external to the system (landscape) described by the architecture. In other words it is not part of the system (landscape), but belongs to the system context/surroundings."
		   });
		addAnnotation
		  (getSystem_Containers(),
		   source,
		   new String[] {
			   "documentation", "Containers consituting the system."
		   });
		addAnnotation
		  (getSystem_Subsystems(),
		   source,
		   new String[] {
			   "documentation", "Subsystem is a logical grouping of related containers and subsystems."
		   });
		addAnnotation
		  (getContainer_Components(),
		   source,
		   new String[] {
			   "documentation", "Components consituting the container."
		   });
		addAnnotation
		  (getContainer_Children(),
		   source,
		   new String[] {
			   "documentation", "Containers can be nested. E.g. Tomcat may be running in a Docker container and serve multiple applications."
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation", "Module is an implementation unit. E.g. a Java jar file/module. "
		   });
		addAnnotation
		  (getModule_CodeElements(),
		   source,
		   new String[] {
			   "documentation", "A component/module contains code elements."
		   });
		addAnnotation
		  (getModule_Modules(),
		   source,
		   new String[] {
			   "documentation", "Modules can be nested. E.g. a Maven module may contain sub-modules. A Java package may be considered a module."
		   });
		addAnnotation
		  (codeElementEClass,
		   source,
		   new String[] {
			   "documentation", "Classes, interfaces, objects, functions, database tables, etc"
		   });
	}

} //C4PackageImpl
