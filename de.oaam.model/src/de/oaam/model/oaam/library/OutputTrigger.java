/**
 */
package de.oaam.model.oaam.library;

import de.oaam.model.oaam.common.BoolA;
import de.oaam.model.oaam.common._ElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The trigger condition for the output. If the trigger condition is true, the output is calculated. A trigger is either a Boolean combination of available inputs or a fixed rate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.library.OutputTrigger#getLogic <em>Logic</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputTrigger#getFixedRate <em>Fixed Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.library.OutputTrigger#isIdFixedRate <em>Id Fixed Rate</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputTrigger()
 * @model
 * @generated
 */
public interface OutputTrigger extends _ElementA {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean logic of inputs that cause the output to be calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(BoolA)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputTrigger_Logic()
	 * @model containment="true"
	 * @generated
	 */
	BoolA getLogic();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputTrigger#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(BoolA value);

	/**
	 * Returns the value of the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed rate, in which the output shall be calculated, given in Hz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Rate</em>' attribute.
	 * @see #setFixedRate(float)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputTrigger_FixedRate()
	 * @model required="true"
	 * @generated
	 */
	float getFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputTrigger#getFixedRate <em>Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Rate</em>' attribute.
	 * @see #getFixedRate()
	 * @generated
	 */
	void setFixedRate(float value);

	/**
	 * Returns the value of the '<em><b>Id Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true the output is calculated at a fixed rate and the fixedRate attribute must be set. If false, the output is calculated if a certain combinations of inputs is available. In the latter case logics must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Fixed Rate</em>' attribute.
	 * @see #setIdFixedRate(boolean)
	 * @see de.oaam.model.oaam.library.LibraryPackage#getOutputTrigger_IdFixedRate()
	 * @model required="true"
	 * @generated
	 */
	boolean isIdFixedRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.library.OutputTrigger#isIdFixedRate <em>Id Fixed Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Fixed Rate</em>' attribute.
	 * @see #isIdFixedRate()
	 * @generated
	 */
	void setIdFixedRate(boolean value);

} // OutputTrigger
