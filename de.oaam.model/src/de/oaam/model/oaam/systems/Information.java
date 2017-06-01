/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common._ElementA;

import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information is an abstract definition of any kind of data flow between systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.Information#getRate <em>Rate</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.Information#getLatency <em>Latency</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.Information#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.Information#getResolution <em>Resolution</em>}</li>
 *   <li>{@link de.oaam.model.oaam.systems.Information#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends ProvidedOutputA, RequiredInputA, _ElementA, _ModeDependentElementA, _VariantDependentElementA {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum update rate of the information in [1/s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation_Rate()
	 * @model required="true"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.Information#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal delay between measurement and reception of the information in [s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation_Latency()
	 * @model required="true"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.Information#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The accuracy of the measured information in %.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation_Accuracy()
	 * @model required="true"
	 * @generated
	 */
	double getAccuracy();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.Information#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(double value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information resolution in the measured 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation_Resolution()
	 * @model required="true"
	 * @generated
	 */
	double getResolution();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.Information#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of the expected information, e.g. A, m/s, deg, C or E for events
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformation_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.Information#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Information
