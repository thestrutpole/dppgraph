/**
 */
package DPP.impl;

import DPP.Access;
import DPP.AggregableOperation;
import DPP.BusinessUnit;
import DPP.DPPFactory;
import DPP.DPPPackage;
import DPP.DPPTransition;
import DPP.Document;
import DPP.DomNamedElement;
import DPP.DppContainer;
import DPP.Status;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DPPPackageImpl extends EPackageImpl implements DPPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dppContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregableOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dppTransitionEClass = null;

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
	 * @see DPP.DPPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DPPPackageImpl() {
		super(eNS_URI, DPPFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DPPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DPPPackage init() {
		if (isInited) return (DPPPackage)EPackage.Registry.INSTANCE.getEPackage(DPPPackage.eNS_URI);

		// Obtain or create and register package
		DPPPackageImpl theDPPPackage = (DPPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DPPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DPPPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDPPPackage.createPackageContents();

		// Initialize created meta-data
		theDPPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDPPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DPPPackage.eNS_URI, theDPPPackage);
		return theDPPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomNamedElement() {
		return domNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomNamedElement_Name() {
		return (EAttribute)domNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_DppContainer() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDppContainer() {
		return dppContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDppContainer_BusinessUnits() {
		return (EReference)dppContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDppContainer_Accesses() {
		return (EReference)dppContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDppContainer_Operations() {
		return (EReference)dppContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDppContainer_Statuses() {
		return (EReference)dppContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDppContainer_Transitions() {
		return (EReference)dppContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessUnit() {
		return businessUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_Operations() {
		return (EReference)accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccess_BusinessUnits() {
		return (EReference)accessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregableOperation() {
		return aggregableOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPPTransition() {
		return dppTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPPTransition_InitialStatus() {
		return (EReference)dppTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPPTransition_FinalStatus() {
		return (EReference)dppTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPPTransition_Operation() {
		return (EReference)dppTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPPFactory getDPPFactory() {
		return (DPPFactory)getEFactoryInstance();
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
		domNamedElementEClass = createEClass(DOM_NAMED_ELEMENT);
		createEAttribute(domNamedElementEClass, DOM_NAMED_ELEMENT__NAME);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__DPP_CONTAINER);

		dppContainerEClass = createEClass(DPP_CONTAINER);
		createEReference(dppContainerEClass, DPP_CONTAINER__BUSINESS_UNITS);
		createEReference(dppContainerEClass, DPP_CONTAINER__ACCESSES);
		createEReference(dppContainerEClass, DPP_CONTAINER__OPERATIONS);
		createEReference(dppContainerEClass, DPP_CONTAINER__STATUSES);
		createEReference(dppContainerEClass, DPP_CONTAINER__TRANSITIONS);

		businessUnitEClass = createEClass(BUSINESS_UNIT);

		accessEClass = createEClass(ACCESS);
		createEReference(accessEClass, ACCESS__OPERATIONS);
		createEReference(accessEClass, ACCESS__BUSINESS_UNITS);

		aggregableOperationEClass = createEClass(AGGREGABLE_OPERATION);

		statusEClass = createEClass(STATUS);

		dppTransitionEClass = createEClass(DPP_TRANSITION);
		createEReference(dppTransitionEClass, DPP_TRANSITION__FINAL_STATUS);
		createEReference(dppTransitionEClass, DPP_TRANSITION__OPERATION);
		createEReference(dppTransitionEClass, DPP_TRANSITION__INITIAL_STATUS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentEClass.getESuperTypes().add(this.getDomNamedElement());
		dppContainerEClass.getESuperTypes().add(this.getDomNamedElement());
		businessUnitEClass.getESuperTypes().add(this.getDomNamedElement());
		aggregableOperationEClass.getESuperTypes().add(this.getDomNamedElement());
		statusEClass.getESuperTypes().add(this.getDomNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(domNamedElementEClass, DomNamedElement.class, "DomNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_DppContainer(), this.getDppContainer(), null, "dppContainer", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDocument_DppContainer().getEKeys().add(this.getDomNamedElement_Name());

		initEClass(dppContainerEClass, DppContainer.class, "DppContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDppContainer_BusinessUnits(), this.getBusinessUnit(), null, "businessUnits", null, 0, -1, DppContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDppContainer_BusinessUnits().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getDppContainer_Accesses(), this.getAccess(), null, "accesses", null, 0, -1, DppContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDppContainer_Operations(), this.getAggregableOperation(), null, "operations", null, 0, -1, DppContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDppContainer_Operations().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getDppContainer_Statuses(), this.getStatus(), null, "statuses", null, 1, -1, DppContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDppContainer_Statuses().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getDppContainer_Transitions(), this.getDPPTransition(), null, "transitions", null, 1, -1, DppContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessUnitEClass, BusinessUnit.class, "BusinessUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccess_Operations(), this.getAggregableOperation(), null, "operations", null, 1, -1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAccess_Operations().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getAccess_BusinessUnits(), this.getBusinessUnit(), null, "businessUnits", null, 1, -1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAccess_BusinessUnits().getEKeys().add(this.getDomNamedElement_Name());

		initEClass(aggregableOperationEClass, AggregableOperation.class, "AggregableOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dppTransitionEClass, DPPTransition.class, "DPPTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPPTransition_FinalStatus(), this.getStatus(), null, "finalStatus", null, 0, 1, DPPTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDPPTransition_FinalStatus().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getDPPTransition_Operation(), this.getAggregableOperation(), null, "operation", null, 1, 1, DPPTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDPPTransition_Operation().getEKeys().add(this.getDomNamedElement_Name());
		initEReference(getDPPTransition_InitialStatus(), this.getStatus(), null, "initialStatus", null, 0, 1, DPPTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDPPTransition_InitialStatus().getEKeys().add(this.getDomNamedElement_Name());

		// Create resource
		createResource(eNS_URI);
	}

} //DPPPackageImpl
