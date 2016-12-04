/**
 */
package DPP.util;

import DPP.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DPP.DPPPackage
 * @generated
 */
public class DPPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DPPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DPPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPPSwitch<Adapter> modelSwitch =
		new DPPSwitch<Adapter>() {
			@Override
			public Adapter caseDomNamedElement(DomNamedElement object) {
				return createDomNamedElementAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseDppContainer(DppContainer object) {
				return createDppContainerAdapter();
			}
			@Override
			public Adapter caseBusinessUnit(BusinessUnit object) {
				return createBusinessUnitAdapter();
			}
			@Override
			public Adapter caseAccess(Access object) {
				return createAccessAdapter();
			}
			@Override
			public Adapter caseAggregableOperation(AggregableOperation object) {
				return createAggregableOperationAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseDPPTransition(DPPTransition object) {
				return createDPPTransitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DPP.DomNamedElement <em>Dom Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.DomNamedElement
	 * @generated
	 */
	public Adapter createDomNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.DppContainer <em>Dpp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.DppContainer
	 * @generated
	 */
	public Adapter createDppContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.BusinessUnit <em>Business Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.BusinessUnit
	 * @generated
	 */
	public Adapter createBusinessUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.AggregableOperation <em>Aggregable Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.AggregableOperation
	 * @generated
	 */
	public Adapter createAggregableOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DPP.DPPTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DPP.DPPTransition
	 * @generated
	 */
	public Adapter createDPPTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DPPAdapterFactory
