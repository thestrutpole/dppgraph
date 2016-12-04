/**
 */
package DPP.impl;

import DPP.Access;
import DPP.AggregableOperation;
import DPP.BusinessUnit;
import DPP.DPPPackage;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DPP.impl.AccessImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link DPP.impl.AccessImpl#getBusinessUnits <em>Business Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessImpl extends MinimalEObjectImpl.Container implements Access {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregableOperation> operations;

	/**
	 * The cached value of the '{@link #getBusinessUnits() <em>Business Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessUnit> businessUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPPPackage.Literals.ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregableOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectResolvingEList<AggregableOperation>(AggregableOperation.class, this, DPPPackage.ACCESS__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessUnit> getBusinessUnits() {
		if (businessUnits == null) {
			businessUnits = new EObjectResolvingEList<BusinessUnit>(BusinessUnit.class, this, DPPPackage.ACCESS__BUSINESS_UNITS);
		}
		return businessUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DPPPackage.ACCESS__OPERATIONS:
				return getOperations();
			case DPPPackage.ACCESS__BUSINESS_UNITS:
				return getBusinessUnits();
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
			case DPPPackage.ACCESS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends AggregableOperation>)newValue);
				return;
			case DPPPackage.ACCESS__BUSINESS_UNITS:
				getBusinessUnits().clear();
				getBusinessUnits().addAll((Collection<? extends BusinessUnit>)newValue);
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
			case DPPPackage.ACCESS__OPERATIONS:
				getOperations().clear();
				return;
			case DPPPackage.ACCESS__BUSINESS_UNITS:
				getBusinessUnits().clear();
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
			case DPPPackage.ACCESS__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case DPPPackage.ACCESS__BUSINESS_UNITS:
				return businessUnits != null && !businessUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessImpl
