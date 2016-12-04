/**
 */
package DPP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DPP.DPPFactory
 * @model kind="package"
 * @generated
 */
public interface DPPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DPP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///un/asydev/editor/dom/dpp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "un.asydev.editor.dpp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DPPPackage eINSTANCE = DPP.impl.DPPPackageImpl.init();

	/**
	 * The meta object id for the '{@link DPP.impl.DomNamedElementImpl <em>Dom Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.DomNamedElementImpl
	 * @see DPP.impl.DPPPackageImpl#getDomNamedElement()
	 * @generated
	 */
	int DOM_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dom Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dom Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DPP.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.DocumentImpl
	 * @see DPP.impl.DPPPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = DOM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dpp Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DPP_CONTAINER = DOM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = DOM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = DOM_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DPP.impl.DppContainerImpl <em>Dpp Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.DppContainerImpl
	 * @see DPP.impl.DPPPackageImpl#getDppContainer()
	 * @generated
	 */
	int DPP_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__NAME = DOM_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__BUSINESS_UNITS = DOM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__ACCESSES = DOM_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__OPERATIONS = DOM_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__STATUSES = DOM_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER__TRANSITIONS = DOM_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dpp Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER_FEATURE_COUNT = DOM_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dpp Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_CONTAINER_OPERATION_COUNT = DOM_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DPP.impl.BusinessUnitImpl <em>Business Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.BusinessUnitImpl
	 * @see DPP.impl.DPPPackageImpl#getBusinessUnit()
	 * @generated
	 */
	int BUSINESS_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNIT__NAME = DOM_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Business Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNIT_FEATURE_COUNT = DOM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_UNIT_OPERATION_COUNT = DOM_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DPP.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.AccessImpl
	 * @see DPP.impl.DPPPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Business Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__BUSINESS_UNITS = 1;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DPP.impl.AggregableOperationImpl <em>Aggregable Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.AggregableOperationImpl
	 * @see DPP.impl.DPPPackageImpl#getAggregableOperation()
	 * @generated
	 */
	int AGGREGABLE_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGABLE_OPERATION__NAME = DOM_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Aggregable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGABLE_OPERATION_FEATURE_COUNT = DOM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGABLE_OPERATION_OPERATION_COUNT = DOM_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DPP.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.StatusImpl
	 * @see DPP.impl.DPPPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = DOM_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = DOM_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = DOM_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DPP.impl.DPPTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DPP.impl.DPPTransitionImpl
	 * @see DPP.impl.DPPPackageImpl#getDPPTransition()
	 * @generated
	 */
	int DPP_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Final Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_TRANSITION__FINAL_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_TRANSITION__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Initial Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_TRANSITION__INITIAL_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPP_TRANSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link DPP.DomNamedElement <em>Dom Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dom Named Element</em>'.
	 * @see DPP.DomNamedElement
	 * @generated
	 */
	EClass getDomNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link DPP.DomNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DPP.DomNamedElement#getName()
	 * @see #getDomNamedElement()
	 * @generated
	 */
	EAttribute getDomNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link DPP.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see DPP.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference '{@link DPP.Document#getDppContainer <em>Dpp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dpp Container</em>'.
	 * @see DPP.Document#getDppContainer()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_DppContainer();

	/**
	 * Returns the meta object for class '{@link DPP.DppContainer <em>Dpp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpp Container</em>'.
	 * @see DPP.DppContainer
	 * @generated
	 */
	EClass getDppContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link DPP.DppContainer#getBusinessUnits <em>Business Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Units</em>'.
	 * @see DPP.DppContainer#getBusinessUnits()
	 * @see #getDppContainer()
	 * @generated
	 */
	EReference getDppContainer_BusinessUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link DPP.DppContainer#getAccesses <em>Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accesses</em>'.
	 * @see DPP.DppContainer#getAccesses()
	 * @see #getDppContainer()
	 * @generated
	 */
	EReference getDppContainer_Accesses();

	/**
	 * Returns the meta object for the containment reference list '{@link DPP.DppContainer#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see DPP.DppContainer#getOperations()
	 * @see #getDppContainer()
	 * @generated
	 */
	EReference getDppContainer_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link DPP.DppContainer#getStatuses <em>Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statuses</em>'.
	 * @see DPP.DppContainer#getStatuses()
	 * @see #getDppContainer()
	 * @generated
	 */
	EReference getDppContainer_Statuses();

	/**
	 * Returns the meta object for the containment reference list '{@link DPP.DppContainer#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see DPP.DppContainer#getTransitions()
	 * @see #getDppContainer()
	 * @generated
	 */
	EReference getDppContainer_Transitions();

	/**
	 * Returns the meta object for class '{@link DPP.BusinessUnit <em>Business Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Unit</em>'.
	 * @see DPP.BusinessUnit
	 * @generated
	 */
	EClass getBusinessUnit();

	/**
	 * Returns the meta object for class '{@link DPP.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see DPP.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the reference list '{@link DPP.Access#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see DPP.Access#getOperations()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_Operations();

	/**
	 * Returns the meta object for the reference list '{@link DPP.Access#getBusinessUnits <em>Business Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Units</em>'.
	 * @see DPP.Access#getBusinessUnits()
	 * @see #getAccess()
	 * @generated
	 */
	EReference getAccess_BusinessUnits();

	/**
	 * Returns the meta object for class '{@link DPP.AggregableOperation <em>Aggregable Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregable Operation</em>'.
	 * @see DPP.AggregableOperation
	 * @generated
	 */
	EClass getAggregableOperation();

	/**
	 * Returns the meta object for class '{@link DPP.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see DPP.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for class '{@link DPP.DPPTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see DPP.DPPTransition
	 * @generated
	 */
	EClass getDPPTransition();

	/**
	 * Returns the meta object for the reference '{@link DPP.DPPTransition#getInitialStatus <em>Initial Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Status</em>'.
	 * @see DPP.DPPTransition#getInitialStatus()
	 * @see #getDPPTransition()
	 * @generated
	 */
	EReference getDPPTransition_InitialStatus();

	/**
	 * Returns the meta object for the reference '{@link DPP.DPPTransition#getFinalStatus <em>Final Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Status</em>'.
	 * @see DPP.DPPTransition#getFinalStatus()
	 * @see #getDPPTransition()
	 * @generated
	 */
	EReference getDPPTransition_FinalStatus();

	/**
	 * Returns the meta object for the reference '{@link DPP.DPPTransition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see DPP.DPPTransition#getOperation()
	 * @see #getDPPTransition()
	 * @generated
	 */
	EReference getDPPTransition_Operation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DPPFactory getDPPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DPP.impl.DomNamedElementImpl <em>Dom Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.DomNamedElementImpl
		 * @see DPP.impl.DPPPackageImpl#getDomNamedElement()
		 * @generated
		 */
		EClass DOM_NAMED_ELEMENT = eINSTANCE.getDomNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOM_NAMED_ELEMENT__NAME = eINSTANCE.getDomNamedElement_Name();

		/**
		 * The meta object literal for the '{@link DPP.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.DocumentImpl
		 * @see DPP.impl.DPPPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Dpp Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__DPP_CONTAINER = eINSTANCE.getDocument_DppContainer();

		/**
		 * The meta object literal for the '{@link DPP.impl.DppContainerImpl <em>Dpp Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.DppContainerImpl
		 * @see DPP.impl.DPPPackageImpl#getDppContainer()
		 * @generated
		 */
		EClass DPP_CONTAINER = eINSTANCE.getDppContainer();

		/**
		 * The meta object literal for the '<em><b>Business Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_CONTAINER__BUSINESS_UNITS = eINSTANCE.getDppContainer_BusinessUnits();

		/**
		 * The meta object literal for the '<em><b>Accesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_CONTAINER__ACCESSES = eINSTANCE.getDppContainer_Accesses();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_CONTAINER__OPERATIONS = eINSTANCE.getDppContainer_Operations();

		/**
		 * The meta object literal for the '<em><b>Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_CONTAINER__STATUSES = eINSTANCE.getDppContainer_Statuses();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_CONTAINER__TRANSITIONS = eINSTANCE.getDppContainer_Transitions();

		/**
		 * The meta object literal for the '{@link DPP.impl.BusinessUnitImpl <em>Business Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.BusinessUnitImpl
		 * @see DPP.impl.DPPPackageImpl#getBusinessUnit()
		 * @generated
		 */
		EClass BUSINESS_UNIT = eINSTANCE.getBusinessUnit();

		/**
		 * The meta object literal for the '{@link DPP.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.AccessImpl
		 * @see DPP.impl.DPPPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__OPERATIONS = eINSTANCE.getAccess_Operations();

		/**
		 * The meta object literal for the '<em><b>Business Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS__BUSINESS_UNITS = eINSTANCE.getAccess_BusinessUnits();

		/**
		 * The meta object literal for the '{@link DPP.impl.AggregableOperationImpl <em>Aggregable Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.AggregableOperationImpl
		 * @see DPP.impl.DPPPackageImpl#getAggregableOperation()
		 * @generated
		 */
		EClass AGGREGABLE_OPERATION = eINSTANCE.getAggregableOperation();

		/**
		 * The meta object literal for the '{@link DPP.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.StatusImpl
		 * @see DPP.impl.DPPPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link DPP.impl.DPPTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DPP.impl.DPPTransitionImpl
		 * @see DPP.impl.DPPPackageImpl#getDPPTransition()
		 * @generated
		 */
		EClass DPP_TRANSITION = eINSTANCE.getDPPTransition();

		/**
		 * The meta object literal for the '<em><b>Initial Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_TRANSITION__INITIAL_STATUS = eINSTANCE.getDPPTransition_InitialStatus();

		/**
		 * The meta object literal for the '<em><b>Final Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_TRANSITION__FINAL_STATUS = eINSTANCE.getDPPTransition_FinalStatus();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPP_TRANSITION__OPERATION = eINSTANCE.getDPPTransition_Operation();

	}

} //DPPPackage
