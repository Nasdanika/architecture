/**
 */
package org.nasdanika.architecture.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.architecture.core.ActionRole;
import org.nasdanika.architecture.core.Architecture;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.architecture.core.CompositeNode;
import org.nasdanika.architecture.core.Concern;
import org.nasdanika.architecture.core.CoreFactory;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.Domain;
import org.nasdanika.architecture.core.Event;
import org.nasdanika.architecture.core.Facet;
import org.nasdanika.architecture.core.Impact;
import org.nasdanika.architecture.core.ImpactType;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.architecture.core.Node;
import org.nasdanika.architecture.core.Relationship;
import org.nasdanika.architecture.core.Stage;
import org.nasdanika.architecture.core.Stakeholder;
import org.nasdanika.architecture.core.Tag;
import org.nasdanika.architecture.core.View;
import org.nasdanika.architecture.core.ViewElement;
import org.nasdanika.architecture.core.Viewpoint;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

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
	private EClass compositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionRoleEEnum = null;

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
	 * @see org.nasdanika.architecture.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Id() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_ActionRole() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Views() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureElement() {
		return architectureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_Events() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_Stages() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_Facets() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_Properties() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_ImpactedBy() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_Tags() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureElement_ViewElements() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomain_Elements() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Impacts() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpactType() {
		return impactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpact() {
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpact_Type() {
		return (EReference)impactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpact_Elements() {
		return (EReference)impactEClass.getEStructuralFeatures().get(1);
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
	public EClass getCompositeNode() {
		return compositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeNode_Children() {
		return (EReference)compositeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_Tagged() {
		return (EReference)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholder_Concerns() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_Stakeholders() {
		return (EReference)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_Viewpoints() {
		return (EReference)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewpoint() {
		return viewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewpoint_Concerns() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewpoint_Instances() {
		return (EReference)viewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Viewpoint() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Elements() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewElement_Children() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewElement_ArchitectureElement() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionRole() {
		return actionRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ID);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ACTION_ROLE);
		createEReference(modelElementEClass, MODEL_ELEMENT__VIEWS);

		eventEClass = createEClass(EVENT);

		facetEClass = createEClass(FACET);

		architectureElementEClass = createEClass(ARCHITECTURE_ELEMENT);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__EVENTS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__STAGES);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__FACETS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__PROPERTIES);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__IMPACTED_BY);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__TAGS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__VIEW_ELEMENTS);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__ELEMENTS);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__IMPACTS);

		impactTypeEClass = createEClass(IMPACT_TYPE);

		architectureEClass = createEClass(ARCHITECTURE);

		impactEClass = createEClass(IMPACT);
		createEReference(impactEClass, IMPACT__TYPE);
		createEReference(impactEClass, IMPACT__ELEMENTS);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTGOING_RELATIONSHIPS);
		createEReference(nodeEClass, NODE__INCOMING_RELATIONSHIPS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		compositeNodeEClass = createEClass(COMPOSITE_NODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__CHILDREN);

		tagEClass = createEClass(TAG);
		createEReference(tagEClass, TAG__TAGGED);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__CONCERNS);

		concernEClass = createEClass(CONCERN);
		createEReference(concernEClass, CONCERN__STAKEHOLDERS);
		createEReference(concernEClass, CONCERN__VIEWPOINTS);

		viewpointEClass = createEClass(VIEWPOINT);
		createEReference(viewpointEClass, VIEWPOINT__CONCERNS);
		createEReference(viewpointEClass, VIEWPOINT__INSTANCES);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__VIEWPOINT);
		createEReference(viewEClass, VIEW__ELEMENTS);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEReference(viewElementEClass, VIEW_ELEMENT__CHILDREN);
		createEReference(viewElementEClass, VIEW_ELEMENT__ARCHITECTURE_ELEMENT);

		// Create enums
		actionRoleEEnum = createEEnum(ACTION_ROLE);
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
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(theNcorePackage.getNamedElement());
		modelElementEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		eventEClass.getESuperTypes().add(theNcorePackage.getTemporal());
		eventEClass.getESuperTypes().add(this.getModelElement());
		architectureElementEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		architectureElementEClass.getESuperTypes().add(this.getModelElement());
		domainEClass.getESuperTypes().add(this.getArchitectureElement());
		stageEClass.getESuperTypes().add(this.getArchitectureElement());
		impactTypeEClass.getESuperTypes().add(this.getModelElement());
		architectureEClass.getESuperTypes().add(this.getDomain());
		impactEClass.getESuperTypes().add(this.getModelElement());
		nodeEClass.getESuperTypes().add(this.getArchitectureElement());
		relationshipEClass.getESuperTypes().add(this.getArchitectureElement());
		compositeNodeEClass.getESuperTypes().add(this.getNode());
		tagEClass.getESuperTypes().add(this.getModelElement());
		stakeholderEClass.getESuperTypes().add(this.getModelElement());
		concernEClass.getESuperTypes().add(this.getModelElement());
		viewpointEClass.getESuperTypes().add(this.getModelElement());
		viewEClass.getESuperTypes().add(this.getModelElement());
		viewElementEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_ActionRole(), this.getActionRole(), "actionRole", "CHILD", 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Views(), this.getView(), null, "views", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModelElement_Views().getEKeys().add(this.getModelElement_Id());

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facetEClass, Facet.class, "Facet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureElementEClass, ArchitectureElement.class, "ArchitectureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureElement_Events(), this.getEvent(), null, "events", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getArchitectureElement_Events().getEKeys().add(this.getModelElement_Id());
		initEReference(getArchitectureElement_Stages(), this.getStage(), null, "stages", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getArchitectureElement_Stages().getEKeys().add(this.getModelElement_Id());
		initEReference(getArchitectureElement_Facets(), this.getFacet(), null, "facets", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_Properties(), theNcorePackage.getProperty(), null, "properties", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getArchitectureElement_Properties().getEKeys().add(theNcorePackage.getProperty_Name());
		initEReference(getArchitectureElement_ImpactedBy(), this.getImpact(), null, "impactedBy", null, 0, -1, ArchitectureElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_Tags(), this.getTag(), null, "tags", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_ViewElements(), this.getView(), null, "viewElements", null, 0, -1, ArchitectureElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomain_Elements().getEKeys().add(this.getModelElement_Id());

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Impacts(), this.getImpact(), null, "impacts", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactTypeEClass, ImpactType.class, "ImpactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impactEClass, Impact.class, "Impact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpact_Type(), this.getImpactType(), null, "type", null, 0, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpact_Elements(), this.getArchitectureElement(), null, "elements", null, 0, -1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_OutgoingRelationships(), this.getRelationship(), null, "outgoingRelationships", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_OutgoingRelationships().getEKeys().add(this.getModelElement_Id());
		initEReference(getNode_IncomingRelationships(), this.getRelationship(), null, "incomingRelationships", null, 0, -1, Node.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Target(), this.getNode(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeNodeEClass, CompositeNode.class, "CompositeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNode_Children(), this.getArchitectureElement(), null, "children", null, 0, -1, CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCompositeNode_Children().getEKeys().add(this.getModelElement_Id());

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTag_Tagged(), this.getArchitectureElement(), null, "tagged", null, 0, -1, Tag.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholder_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStakeholder_Concerns().getEKeys().add(this.getModelElement_Id());

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcern_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Viewpoints(), this.getViewpoint(), null, "viewpoints", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpoint_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getViewpoint_Concerns().getEKeys().add(this.getModelElement_Id());
		initEReference(getViewpoint_Instances(), this.getView(), null, "instances", null, 0, -1, Viewpoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Viewpoint(), this.getViewpoint(), null, "viewpoint", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Elements(), this.getViewElement(), null, "elements", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getView_Elements().getEKeys().add(this.getModelElement_Id());

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewElement_Children(), this.getViewElement(), null, "children", null, 0, -1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getViewElement_Children().getEKeys().add(this.getModelElement_Id());
		initEReference(getViewElement_ArchitectureElement(), this.getArchitectureElement(), null, "architectureElement", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionRoleEEnum, ActionRole.class, "ActionRole");
		addEEnumLiteral(actionRoleEEnum, ActionRole.CHILD);
		addEEnumLiteral(actionRoleEEnum, ActionRole.NAVIGATION);
		addEEnumLiteral(actionRoleEEnum, ActionRole.SECTION);
		addEEnumLiteral(actionRoleEEnum, ActionRole.ANONYMOUS);

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
		  (getArchitectureElement_Properties(),
		   source,
		   new String[] {
			   "reference-type", "map: \n  ns-uri: urn:org.nasdanika.ncore\n  name: MapProperty\nlist: \n  ns-uri: urn:org.nasdanika.ncore\n  name: ListProperty\nstring: \n  ns-uri: urn:org.nasdanika.ncore\n  name: StringProperty\ninteger: \n  ns-uri: urn:org.nasdanika.ncore\n  name: IntegerProperty",
			   "value-feature", "value"
		   });
		addAnnotation
		  (getArchitectureElement_Tags(),
		   source,
		   new String[] {
			   "opposite", "tagged"
		   });
		addAnnotation
		  (getStage_Impacts(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (impactTypeEClass,
		   source,
		   new String[] {
			   "default-feature", "name"
		   });
		addAnnotation
		  (getImpact_Elements(),
		   source,
		   new String[] {
			   "opposite", "impactedBy"
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
		  (getStakeholder_Concerns(),
		   source,
		   new String[] {
			   "opposite", "stakeholders"
		   });
		addAnnotation
		  (getView_Viewpoint(),
		   source,
		   new String[] {
			   "opposite", "instances"
		   });
		addAnnotation
		  (getViewElement_ArchitectureElement(),
		   source,
		   new String[] {
			   "opposite", "viewElements"
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
		  (actionRoleEEnum,
		   source,
		   new String[] {
			   "documentation", "Action role defines parent\'s action reference to which to put element\'s action. In other words, it defines where this element action will be displayed in the generated HTML UI."
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Named and documented element with an ID."
		   });
		addAnnotation
		  (getModelElement_Id(),
		   source,
		   new String[] {
			   "documentation", "Element ID to use as EKey - a unique identifier of this element among its siblings in the parent\'s containment reference. "
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "documentation", "A named document temporal with ID. "
		   });
		addAnnotation
		  (facetEClass,
		   source,
		   new String[] {
			   "documentation", "A marker interface for classes which can be used as architecture element facets"
		   });
		addAnnotation
		  (architectureElementEClass,
		   source,
		   new String[] {
			   "documentation", "An element of an architecture model."
		   });
		addAnnotation
		  (getArchitectureElement_Events(),
		   source,
		   new String[] {
			   "documentation", "Events associated with this architecture element. Events can be used as bases for temporals and periods, e.g. other architecture elements or increments."
		   });
		addAnnotation
		  (getArchitectureElement_Stages(),
		   source,
		   new String[] {
			   "documentation", "Architecture element lifecycle stages. E.g. releases/versions for a technology product or lifecycle for a technology product release. "
		   });
		addAnnotation
		  (getArchitectureElement_Facets(),
		   source,
		   new String[] {
			   "documentation", "Facets allow to enrich an architecture element. For example, an increment might have a cost model facet describing different types of cost associated with the increment."
		   });
		addAnnotation
		  (getArchitectureElement_Properties(),
		   source,
		   new String[] {
			   "documentation", "Architecture element properties"
		   });
		addAnnotation
		  (getArchitectureElement_ImpactedBy(),
		   source,
		   new String[] {
			   "documentation", "Stages which impact this element. A computed opposite to Impact.elements"
		   });
		addAnnotation
		  (getArchitectureElement_Tags(),
		   source,
		   new String[] {
			   "documentation", "This element\'s tags"
		   });
		addAnnotation
		  (getArchitectureElement_ViewElements(),
		   source,
		   new String[] {
			   "documentation", "View elements representing this architecture element. A computed opposite to ViewElement.architectureElement."
		   });
		addAnnotation
		  (domainEClass,
		   source,
		   new String[] {
			   "documentation", "Domain is a grouping construct for architecture elements."
		   });
		addAnnotation
		  (getDomain_Elements(),
		   source,
		   new String[] {
			   "documentation", "Domain elements"
		   });
		addAnnotation
		  (stageEClass,
		   source,
		   new String[] {
			   "documentation", "A transition of the containing architecture element from the baseline state identified by the stage start to the target state identified by the stage end. For example, \"Development\" stage or \"End of Life/Deprecated\" stage."
		   });
		addAnnotation
		  (getStage_Impacts(),
		   source,
		   new String[] {
			   "documentation", "Impacts of this increment on architecture elements. E.g. creation of a new element, modification or retirement (deletion) of an existing."
		   });
		addAnnotation
		  (impactTypeEClass,
		   source,
		   new String[] {
			   "documentation", "Impact type. E.g. add, modify, delete. Impacts may also be quantitative. E.g. an impact might be increase or decrease in capacity - load, storage, ..."
		   });
		addAnnotation
		  (architectureEClass,
		   source,
		   new String[] {
			   "documentation", "Architecture (description) contains architecture elements and reference data such as impact types."
		   });
		addAnnotation
		  (impactEClass,
		   source,
		   new String[] {
			   "documentation", "Impacts of the containing increment on architecture elements. E.g. creation of a new element, modification or retirement (deletion) of an existing."
		   });
		addAnnotation
		  (getImpact_Type(),
		   source,
		   new String[] {
			   "documentation", "Impact type"
		   });
		addAnnotation
		  (getImpact_Elements(),
		   source,
		   new String[] {
			   "documentation", "Impacted element(s)"
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
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation", "Tags allow to categorize architecture elements."
		   });
		addAnnotation
		  (getTag_Tagged(),
		   source,
		   new String[] {
			   "documentation", "Architecture elements tagged with this tag. A computed opposite to ArchitectureElement.tags"
		   });
		addAnnotation
		  (stakeholderEClass,
		   source,
		   new String[] {
			   "documentation", "A party (individual, team, organization, or class thereof) having an interest in a system"
		   });
		addAnnotation
		  (getStakeholder_Concerns(),
		   source,
		   new String[] {
			   "documentation", "Stakeholder\'s concerns"
		   });
		addAnnotation
		  (concernEClass,
		   source,
		   new String[] {
			   "documentation", "An interest in a system relevant to one or more of its stakeholders."
		   });
		addAnnotation
		  (getConcern_Stakeholders(),
		   source,
		   new String[] {
			   "documentation", "Stakeholders to whom this concerns is relevant. A computed opposite to Stakeholder.concerns"
		   });
		addAnnotation
		  (getConcern_Viewpoints(),
		   source,
		   new String[] {
			   "documentation", "Viewpoints framing this concern. A computed opposite to Viewpoint.concerns"
		   });
		addAnnotation
		  (viewpointEClass,
		   source,
		   new String[] {
			   "documentation", "A type of view - a specification of the conventions for a particular kind of view, a meta-view."
		   });
		addAnnotation
		  (getViewpoint_Concerns(),
		   source,
		   new String[] {
			   "documentation", "Concerns framed by this viewpoint"
		   });
		addAnnotation
		  (getViewpoint_Instances(),
		   source,
		   new String[] {
			   "documentation", "Views of this type. A computed opposite to View.viewpoint"
		   });
		addAnnotation
		  (getView_Viewpoint(),
		   source,
		   new String[] {
			   "documentation", "View type"
		   });
		addAnnotation
		  (getView_Elements(),
		   source,
		   new String[] {
			   "documentation", "View elements"
		   });
		addAnnotation
		  (getViewElement_Children(),
		   source,
		   new String[] {
			   "documentation", "Element children"
		   });
		addAnnotation
		  (getViewElement_ArchitectureElement(),
		   source,
		   new String[] {
			   "documentation", "Architecture element represented by this view element"
		   });
	}

} //CorePackageImpl
