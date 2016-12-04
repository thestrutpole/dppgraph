/**
 */
package DPP.impl;

import DPP.AggregableOperation;
import DPP.DPPPackage;
import DPP.DPPTransition;
import DPP.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DPP.impl.DPPTransitionImpl#getFinalStatus <em>Final Status</em>}</li>
 *   <li>{@link DPP.impl.DPPTransitionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link DPP.impl.DPPTransitionImpl#getInitialStatus <em>Initial Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DPPTransitionImpl extends MinimalEObjectImpl.Container implements DPPTransition {
	/**
	 * The cached value of the '{@link #getFinalStatus() <em>Final Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalStatus()
	 * @generated
	 * @ordered
	 */
	protected Status finalStatus;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected AggregableOperation operation;

	/**
	 * The cached value of the '{@link #getInitialStatus() <em>Initial Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStatus()
	 * @generated
	 * @ordered
	 */
	protected Status initialStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPPTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPPPackage.Literals.DPP_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getInitialStatus() {
		if (initialStatus != null && initialStatus.eIsProxy()) {
			InternalEObject oldInitialStatus = (InternalEObject)initialStatus;
			initialStatus = (Status)eResolveProxy(oldInitialStatus);
			if (initialStatus != oldInitialStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DPPPackage.DPP_TRANSITION__INITIAL_STATUS, oldInitialStatus, initialStatus));
			}
		}
		return initialStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetInitialStatus() {
		return initialStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStatus(Status newInitialStatus) {
		Status oldInitialStatus = initialStatus;
		initialStatus = newInitialStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPPPackage.DPP_TRANSITION__INITIAL_STATUS, oldInitialStatus, initialStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getFinalStatus() {
		if (finalStatus != null && finalStatus.eIsProxy()) {
			InternalEObject oldFinalStatus = (InternalEObject)finalStatus;
			finalStatus = (Status)eResolveProxy(oldFinalStatus);
			if (finalStatus != oldFinalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DPPPackage.DPP_TRANSITION__FINAL_STATUS, oldFinalStatus, finalStatus));
			}
		}
		return finalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetFinalStatus() {
		return finalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalStatus(Status newFinalStatus) {
		Status oldFinalStatus = finalStatus;
		finalStatus = newFinalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPPPackage.DPP_TRANSITION__FINAL_STATUS, oldFinalStatus, finalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregableOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (AggregableOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DPPPackage.DPP_TRANSITION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregableOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(AggregableOperation newOperation) {
		AggregableOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPPPackage.DPP_TRANSITION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DPPPackage.DPP_TRANSITION__FINAL_STATUS:
				if (resolve) return getFinalStatus();
				return basicGetFinalStatus();
			case DPPPackage.DPP_TRANSITION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case DPPPackage.DPP_TRANSITION__INITIAL_STATUS:
				if (resolve) return getInitialStatus();
				return basicGetInitialStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DPPPackage.DPP_TRANSITION__FINAL_STATUS:
				setFinalStatus((Status)newValue);
				return;
			case DPPPackage.DPP_TRANSITION__OPERATION:
				setOperation((AggregableOperation)newValue);
				return;
			case DPPPackage.DPP_TRANSITION__INITIAL_STATUS:
				setInitialStatus((Status)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DPPPackage.DPP_TRANSITION__FINAL_STATUS:
				setFinalStatus((Status)null);
				return;
			case DPPPackage.DPP_TRANSITION__OPERATION:
				setOperation((AggregableOperation)null);
				return;
			case DPPPackage.DPP_TRANSITION__INITIAL_STATUS:
				setInitialStatus((Status)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DPPPackage.DPP_TRANSITION__FINAL_STATUS:
				return finalStatus != null;
			case DPPPackage.DPP_TRANSITION__OPERATION:
				return operation != null;
			case DPPPackage.DPP_TRANSITION__INITIAL_STATUS:
				return initialStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //DPPTransitionImpl
