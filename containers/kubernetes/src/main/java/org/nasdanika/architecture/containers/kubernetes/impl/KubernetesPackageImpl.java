/**
 */
package org.nasdanika.architecture.containers.kubernetes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.architecture.containers.kubernetes.Cluster;
import org.nasdanika.architecture.containers.kubernetes.KubernetesFactory;
import org.nasdanika.architecture.containers.kubernetes.KubernetesPackage;
import org.nasdanika.architecture.containers.kubernetes.Workload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KubernetesPackageImpl extends EPackageImpl implements KubernetesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

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
	 * @see org.nasdanika.architecture.containers.kubernetes.KubernetesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KubernetesPackageImpl() {
		super(eNS_URI, KubernetesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KubernetesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KubernetesPackage init() {
		if (isInited) return (KubernetesPackage)EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKubernetesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = registeredKubernetesPackage instanceof KubernetesPackageImpl ? (KubernetesPackageImpl)registeredKubernetesPackage : new KubernetesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		org.nasdanika.architecture.core.CorePackage.eINSTANCE.eClass();
		org.nasdanika.ncore.NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKubernetesPackage.createPackageContents();

		// Initialize created meta-data
		theKubernetesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKubernetesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KubernetesPackage.eNS_URI, theKubernetesPackage);
		return theKubernetesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesFactory getKubernetesFactory() {
		return (KubernetesFactory)getEFactoryInstance();
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
		workloadEClass = createEClass(WORKLOAD);

		clusterEClass = createEClass(CLUSTER);
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
		org.nasdanika.architecture.core.CorePackage theCorePackage = (org.nasdanika.architecture.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.nasdanika.architecture.core.CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clusterEClass.getESuperTypes().add(theCorePackage.getArchitectureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
	}

} //KubernetesPackageImpl
