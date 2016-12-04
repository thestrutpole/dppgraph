/**
 */
package DPP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DPP.DPPPackage
 * @generated
 */
public interface DPPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DPPFactory eINSTANCE = DPP.impl.DPPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Dpp Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dpp Container</em>'.
	 * @generated
	 */
	DppContainer createDppContainer();

	/**
	 * Returns a new object of class '<em>Business Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Unit</em>'.
	 * @generated
	 */
	BusinessUnit createBusinessUnit();

	/**
	 * Returns a new object of class '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access</em>'.
	 * @generated
	 */
	Access createAccess();

	/**
	 * Returns a new object of class '<em>Aggregable Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregable Operation</em>'.
	 * @generated
	 */
	AggregableOperation createAggregableOperation();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	DPPTransition createDPPTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DPPPackage getDPPPackage();

} //DPPFactory
