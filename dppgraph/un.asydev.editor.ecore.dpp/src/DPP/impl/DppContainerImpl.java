/**
 */
package DPP.impl;

import DPP.Access;
import DPP.AggregableOperation;
import DPP.BusinessUnit;
import DPP.DPPPackage;
import DPP.DPPTransition;
import DPP.DppContainer;
import DPP.Status;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dpp Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DPP.impl.DppContainerImpl#getBusinessUnits <em>Business Units</em>}</li>
 *   <li>{@link DPP.impl.DppContainerImpl#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link DPP.impl.DppContainerImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link DPP.impl.DppContainerImpl#getStatuses <em>Statuses</em>}</li>
 *   <li>{@link DPP.impl.DppContainerImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DppContainerImpl extends DomNamedElementImpl implements DppContainer {
	/**
	 * The cached value of the '{@link #getBusinessUnits() <em>Business Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessUnit> businessUnits;

	/**
	 * The cached value of the '{@link #getAccesses() <em>Accesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Access> accesses;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregableOperation> operations;

	/**
	 * The cached value of the '{@link #getStatuses() <em>Statuses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> statuses;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DPPTransition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DppContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPPPackage.Literals.DPP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessUnit> getBusinessUnits() {
		if (businessUnits == null) {
			businessUnits = new EObjectContainmentEList<BusinessUnit>(BusinessUnit.class, this, DPPPackage.DPP_CONTAINER__BUSINESS_UNITS);
		}
		return businessUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Access> getAccesses() {
		if (accesses == null) {
			accesses = new EObjectContainmentEList<Access>(Access.class, this, DPPPackage.DPP_CONTAINER__ACCESSES);
		}
		return accesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregableOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<AggregableOperation>(AggregableOperation.class, this, DPPPackage.DPP_CONTAINER__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Status> getStatuses() {
		if (statuses == null) {
			statuses = new EObjectContainmentEList<Status>(Status.class, this, DPPPackage.DPP_CONTAINER__STATUSES);
		}
		return statuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPPTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<DPPTransition>(DPPTransition.class, this, DPPPackage.DPP_CONTAINER__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DPPPackage.DPP_CONTAINER__BUSINESS_UNITS:
				return ((InternalEList<?>)getBusinessUnits()).basicRemove(otherEnd, msgs);
			case DPPPackage.DPP_CONTAINER__ACCESSES:
				return ((InternalEList<?>)getAccesses()).basicRemove(otherEnd, msgs);
			case DPPPackage.DPP_CONTAINER__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case DPPPackage.DPP_CONTAINER__STATUSES:
				return ((InternalEList<?>)getStatuses()).basicRemove(otherEnd, msgs);
			case DPPPackage.DPP_CONTAINER__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DPPPackage.DPP_CONTAINER__BUSINESS_UNITS:
				return getBusinessUnits();
			case DPPPackage.DPP_CONTAINER__ACCESSES:
				return getAccesses();
			case DPPPackage.DPP_CONTAINER__OPERATIONS:
				return getOperations();
			case DPPPackage.DPP_CONTAINER__STATUSES:
				return getStatuses();
			case DPPPackage.DPP_CONTAINER__TRANSITIONS:
				return getTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DPPPackage.DPP_CONTAINER__BUSINESS_UNITS:
				getBusinessUnits().clear();
				getBusinessUnits().addAll((Collection<? extends BusinessUnit>)newValue);
				return;
			case DPPPackage.DPP_CONTAINER__ACCESSES:
				getAccesses().clear();
				getAccesses().addAll((Collection<? extends Access>)newValue);
				return;
			case DPPPackage.DPP_CONTAINER__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends AggregableOperation>)newValue);
				return;
			case DPPPackage.DPP_CONTAINER__STATUSES:
				getStatuses().clear();
				getStatuses().addAll((Collection<? extends Status>)newValue);
				return;
			case DPPPackage.DPP_CONTAINER__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends DPPTransition>)newValue);
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
			case DPPPackage.DPP_CONTAINER__BUSINESS_UNITS:
				getBusinessUnits().clear();
				return;
			case DPPPackage.DPP_CONTAINER__ACCESSES:
				getAccesses().clear();
				return;
			case DPPPackage.DPP_CONTAINER__OPERATIONS:
				getOperations().clear();
				return;
			case DPPPackage.DPP_CONTAINER__STATUSES:
				getStatuses().clear();
				return;
			case DPPPackage.DPP_CONTAINER__TRANSITIONS:
				getTransitions().clear();
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
			case DPPPackage.DPP_CONTAINER__BUSINESS_UNITS:
				return businessUnits != null && !businessUnits.isEmpty();
			case DPPPackage.DPP_CONTAINER__ACCESSES:
				return accesses != null && !accesses.isEmpty();
			case DPPPackage.DPP_CONTAINER__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case DPPPackage.DPP_CONTAINER__STATUSES:
				return statuses != null && !statuses.isEmpty();
			case DPPPackage.DPP_CONTAINER__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DppContainerImpl
