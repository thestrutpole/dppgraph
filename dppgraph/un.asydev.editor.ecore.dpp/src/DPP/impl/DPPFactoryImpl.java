/**
 */
package DPP.impl;

import DPP.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DPPFactoryImpl extends EFactoryImpl implements DPPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DPPFactory init() {
		try {
			DPPFactory theDPPFactory = (DPPFactory)EPackage.Registry.INSTANCE.getEFactory(DPPPackage.eNS_URI);
			if (theDPPFactory != null) {
				return theDPPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DPPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPPFactoryImpl() {
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
			case DPPPackage.DOCUMENT: return createDocument();
			case DPPPackage.DPP_CONTAINER: return createDppContainer();
			case DPPPackage.BUSINESS_UNIT: return createBusinessUnit();
			case DPPPackage.ACCESS: return createAccess();
			case DPPPackage.AGGREGABLE_OPERATION: return createAggregableOperation();
			case DPPPackage.STATUS: return createStatus();
			case DPPPackage.DPP_TRANSITION: return createDPPTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DppContainer createDppContainer() {
		DppContainerImpl dppContainer = new DppContainerImpl();
		return dppContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessUnit createBusinessUnit() {
		BusinessUnitImpl businessUnit = new BusinessUnitImpl();
		return businessUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregableOperation createAggregableOperation() {
		AggregableOperationImpl aggregableOperation = new AggregableOperationImpl();
		return aggregableOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPPTransition createDPPTransition() {
		DPPTransitionImpl dppTransition = new DPPTransitionImpl();
		return dppTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPPPackage getDPPPackage() {
		return (DPPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DPPPackage getPackage() {
		return DPPPackage.eINSTANCE;
	}

} //DPPFactoryImpl
