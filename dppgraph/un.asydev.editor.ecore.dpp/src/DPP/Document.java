/**
 */
package DPP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DPP.Document#getDppContainer <em>Dpp Container</em>}</li>
 * </ul>
 *
 * @see DPP.DPPPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends DomNamedElement {
	/**
	 * Returns the value of the '<em><b>Dpp Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dpp Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dpp Container</em>' containment reference.
	 * @see #setDppContainer(DppContainer)
	 * @see DPP.DPPPackage#getDocument_DppContainer()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	DppContainer getDppContainer();

	/**
	 * Sets the value of the '{@link DPP.Document#getDppContainer <em>Dpp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dpp Container</em>' containment reference.
	 * @see #getDppContainer()
	 * @generated
	 */
	void setDppContainer(DppContainer value);

} // Document
