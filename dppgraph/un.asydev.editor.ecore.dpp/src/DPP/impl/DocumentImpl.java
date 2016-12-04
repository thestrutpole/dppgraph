/**
 */
package DPP.impl;

import DPP.DPPPackage;
import DPP.Document;
import DPP.DppContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DPP.impl.DocumentImpl#getDppContainer <em>Dpp Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends DomNamedElementImpl implements Document {
	/**
	 * The cached value of the '{@link #getDppContainer() <em>Dpp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDppContainer()
	 * @generated
	 * @ordered
	 */
	protected DppContainer dppContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPPPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DppContainer getDppContainer() {
		return dppContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDppContainer(DppContainer newDppContainer, NotificationChain msgs) {
		DppContainer oldDppContainer = dppContainer;
		dppContainer = newDppContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DPPPackage.DOCUMENT__DPP_CONTAINER, oldDppContainer, newDppContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDppContainer(DppContainer newDppContainer) {
		if (newDppContainer != dppContainer) {
			NotificationChain msgs = null;
			if (dppContainer != null)
				msgs = ((InternalEObject)dppContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DPPPackage.DOCUMENT__DPP_CONTAINER, null, msgs);
			if (newDppContainer != null)
				msgs = ((InternalEObject)newDppContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DPPPackage.DOCUMENT__DPP_CONTAINER, null, msgs);
			msgs = basicSetDppContainer(newDppContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPPPackage.DOCUMENT__DPP_CONTAINER, newDppContainer, newDppContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DPPPackage.DOCUMENT__DPP_CONTAINER:
				return basicSetDppContainer(null, msgs);
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
			case DPPPackage.DOCUMENT__DPP_CONTAINER:
				return getDppContainer();
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
			case DPPPackage.DOCUMENT__DPP_CONTAINER:
				setDppContainer((DppContainer)newValue);
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
			case DPPPackage.DOCUMENT__DPP_CONTAINER:
				setDppContainer((DppContainer)null);
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
			case DPPPackage.DOCUMENT__DPP_CONTAINER:
				return dppContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
