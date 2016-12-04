/**
 */
package DPP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dpp Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DPP.DppContainer#getBusinessUnits <em>Business Units</em>}</li>
 *   <li>{@link DPP.DppContainer#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link DPP.DppContainer#getOperations <em>Operations</em>}</li>
 *   <li>{@link DPP.DppContainer#getStatuses <em>Statuses</em>}</li>
 *   <li>{@link DPP.DppContainer#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see DPP.DPPPackage#getDppContainer()
 * @model
 * @generated
 */
public interface DppContainer extends DomNamedElement {
	/**
	 * Returns the value of the '<em><b>Business Units</b></em>' containment reference list.
	 * The list contents are of type {@link DPP.BusinessUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Units</em>' containment reference list.
	 * @see DPP.DPPPackage#getDppContainer_BusinessUnits()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<BusinessUnit> getBusinessUnits();

	/**
	 * Returns the value of the '<em><b>Accesses</b></em>' containment reference list.
	 * The list contents are of type {@link DPP.Access}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses</em>' containment reference list.
	 * @see DPP.DPPPackage#getDppContainer_Accesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Access> getAccesses();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link DPP.AggregableOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see DPP.DPPPackage#getDppContainer_Operations()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<AggregableOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link DPP.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statuses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses</em>' containment reference list.
	 * @see DPP.DPPPackage#getDppContainer_Statuses()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Status> getStatuses();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link DPP.DPPTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see DPP.DPPPackage#getDppContainer_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DPPTransition> getTransitions();

} // DppContainer
