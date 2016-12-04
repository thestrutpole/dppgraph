/**
 */
package DPP;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DPP.Access#getOperations <em>Operations</em>}</li>
 *   <li>{@link DPP.Access#getBusinessUnits <em>Business Units</em>}</li>
 * </ul>
 *
 * @see DPP.DPPPackage#getAccess()
 * @model
 * @generated
 */
public interface Access extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link DPP.AggregableOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see DPP.DPPPackage#getAccess_Operations()
	 * @model keys="name" required="true"
	 * @generated
	 */
	EList<AggregableOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Business Units</b></em>' reference list.
	 * The list contents are of type {@link DPP.BusinessUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Units</em>' reference list.
	 * @see DPP.DPPPackage#getAccess_BusinessUnits()
	 * @model keys="name" required="true"
	 * @generated
	 */
	EList<BusinessUnit> getBusinessUnits();

} // Access
