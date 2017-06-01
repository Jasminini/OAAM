/**
 */
package de.oaam.model.oaam.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An array of other data types with a fixed length
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.common.Array#getNElements <em>NElements</em>}</li>
 *   <li>{@link de.oaam.model.oaam.common.Array#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.common.CommonPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends DataTypeA {
	/**
	 * Returns the value of the '<em><b>NElements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of elements the array holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NElements</em>' attribute.
	 * @see #setNElements(int)
	 * @see de.oaam.model.oaam.common.CommonPackage#getArray_NElements()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNElements();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Array#getNElements <em>NElements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NElements</em>' attribute.
	 * @see #getNElements()
	 * @generated
	 */
	void setNElements(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the array
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataTypeA)
	 * @see de.oaam.model.oaam.common.CommonPackage#getArray_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypeA getType();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.common.Array#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypeA value);

} // Array
