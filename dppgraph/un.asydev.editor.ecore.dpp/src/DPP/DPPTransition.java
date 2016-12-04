/**
 */
package DPP;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DPP.DPPTransition#getFinalStatus <em>Final Status</em>}</li>
 *   <li>{@link DPP.DPPTransition#getOperation <em>Operation</em>}</li>
 *   <li>{@link DPP.DPPTransition#getInitialStatus <em>Initial Status</em>}</li>
 * </ul>
 *
 * @see DPP.DPPPackage#getDPPTransition()
 * @model
 * @generated
 */
public interface DPPTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Status</em>' reference.
	 * @see #setInitialStatus(Status)
	 * @see DPP.DPPPackage#getDPPTransition_InitialStatus()
	 * @model keys="name"
	 * @generated
	 */
	Status getInitialStatus();

	/**
	 * Sets the value of the '{@link DPP.DPPTransition#getInitialStatus <em>Initial Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Status</em>' reference.
	 * @see #getInitialStatus()
	 * @generated
	 */
	void setInitialStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Final Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Status</em>' reference.
	 * @see #setFinalStatus(Status)
	 * @see DPP.DPPPackage#getDPPTransition_FinalStatus()
	 * @model keys="name"
	 * @generated
	 */
	Status getFinalStatus();

	/**
	 * Sets the value of the '{@link DPP.DPPTransition#getFinalStatus <em>Final Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Status</em>' reference.
	 * @see #getFinalStatus()
	 * @generated
	 */
	void setFinalStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(AggregableOperation)
	 * @see DPP.DPPPackage#getDPPTransition_Operation()
	 * @model keys="name" required="true"
	 * @generated
	 */
	AggregableOperation getOperation();

	/**
	 * Sets the value of the '{@link DPP.DPPTransition#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(AggregableOperation value);

} // DPPTransition
