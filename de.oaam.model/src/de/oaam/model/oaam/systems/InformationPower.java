/**
 */
package de.oaam.model.oaam.systems;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract base class to represent the flow of power
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.systems.InformationPower#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationPower()
 * @model
 * @generated
 */
public interface InformationPower extends ProvidedInformationA, RequiredInformationA, OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provided or required power in [W]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(double)
	 * @see de.oaam.model.oaam.systems.SystemsPackage#getInformationPower_Power()
	 * @model required="true"
	 * @generated
	 */
	double getPower();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.systems.InformationPower#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(double value);

} // InformationPower
