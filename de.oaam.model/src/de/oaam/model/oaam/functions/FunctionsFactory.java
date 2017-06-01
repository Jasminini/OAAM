/**
 */
package de.oaam.model.oaam.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsFactory eINSTANCE = de.oaam.model.oaam.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functions</em>'.
	 * @generated
	 */
	Functions createFunctions();

	/**
	 * Returns a new object of class '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container A</em>'.
	 * @generated
	 */
	FunctionsContainerA createFunctionsContainerA();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Task Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Link</em>'.
	 * @generated
	 */
	TaskLink createTaskLink();

	/**
	 * Returns a new object of class '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Group</em>'.
	 * @generated
	 */
	TaskGroup createTaskGroup();

	/**
	 * Returns a new object of class '<em>Task Symmetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Symmetry</em>'.
	 * @generated
	 */
	TaskSymmetry createTaskSymmetry();

	/**
	 * Returns a new object of class '<em>Task Redundancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Redundancy</em>'.
	 * @generated
	 */
	TaskRedundancy createTaskRedundancy();

	/**
	 * Returns a new object of class '<em>Failure Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Condition</em>'.
	 * @generated
	 */
	FailureCondition createFailureCondition();

	/**
	 * Returns a new object of class '<em>System Input State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Input State</em>'.
	 * @generated
	 */
	SystemInputState createSystemInputState();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Group</em>'.
	 * @generated
	 */
	SignalGroup createSignalGroup();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Output Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Link</em>'.
	 * @generated
	 */
	OutputLink createOutputLink();

	/**
	 * Returns a new object of class '<em>Subfunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subfunction</em>'.
	 * @generated
	 */
	Subfunction createSubfunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
