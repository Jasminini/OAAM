/**
 */
package de.oaam.model.oaam.scenario.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.library.impl.LibraryPackageImpl;

import de.oaam.model.oaam.mapping.MappingPackage;

import de.oaam.model.oaam.mapping.impl.MappingPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.OperationMode;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ParameterA;
import de.oaam.model.oaam.scenario.ParameterBool;
import de.oaam.model.oaam.scenario.ParameterNumeric;
import de.oaam.model.oaam.scenario.Scenario;
import de.oaam.model.oaam.scenario.ScenarioContainerA;
import de.oaam.model.oaam.scenario.ScenarioFactory;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Subscenario;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioPackageImpl extends EPackageImpl implements ScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _ModeDependentElementAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _VariantDependentElementAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterNumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationModeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscenarioEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScenarioPackageImpl() {
		super(eNS_URI, ScenarioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScenarioPackage init() {
		if (isInited) return (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);

		// Obtain or create and register package
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScenarioPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theScenarioPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theScenarioPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScenarioPackage.eNS_URI, theScenarioPackage);
		return theScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterA() {
		return parameterAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_ModeDependentElementA() {
		return _ModeDependentElementAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_ModeDependentElementA_OperationModes() {
		return (EReference)_ModeDependentElementAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_VariantDependentElementA() {
		return _VariantDependentElementAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_VariantDependentElementA_Variants() {
		return (EReference)_VariantDependentElementAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioContainerA() {
		return scenarioContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioContainerA_Parameters() {
		return (EReference)scenarioContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioContainerA_Variants() {
		return (EReference)scenarioContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioContainerA_OperationModes() {
		return (EReference)scenarioContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioContainerA_Subscenarios() {
		return (EReference)scenarioContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationMode() {
		return operationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterNumeric() {
		return parameterNumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterNumeric_Value() {
		return (EAttribute)parameterNumericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBool() {
		return parameterBoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterBool_Value() {
		return (EAttribute)parameterBoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationModeReference() {
		return operationModeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationModeReference_OperationMode() {
		return (EReference)operationModeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationModeReference_ActiveProbability() {
		return (EAttribute)operationModeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscenario() {
		return subscenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioFactory getScenarioFactory() {
		return (ScenarioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		parameterAEClass = createEClass(PARAMETER_A);

		_ModeDependentElementAEClass = createEClass(_MODE_DEPENDENT_ELEMENT_A);
		createEReference(_ModeDependentElementAEClass, _MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES);

		_VariantDependentElementAEClass = createEClass(_VARIANT_DEPENDENT_ELEMENT_A);
		createEReference(_VariantDependentElementAEClass, _VARIANT_DEPENDENT_ELEMENT_A__VARIANTS);

		scenarioContainerAEClass = createEClass(SCENARIO_CONTAINER_A);
		createEReference(scenarioContainerAEClass, SCENARIO_CONTAINER_A__PARAMETERS);
		createEReference(scenarioContainerAEClass, SCENARIO_CONTAINER_A__VARIANTS);
		createEReference(scenarioContainerAEClass, SCENARIO_CONTAINER_A__OPERATION_MODES);
		createEReference(scenarioContainerAEClass, SCENARIO_CONTAINER_A__SUBSCENARIOS);

		operationModeEClass = createEClass(OPERATION_MODE);

		parameterNumericEClass = createEClass(PARAMETER_NUMERIC);
		createEAttribute(parameterNumericEClass, PARAMETER_NUMERIC__VALUE);

		parameterBoolEClass = createEClass(PARAMETER_BOOL);
		createEAttribute(parameterBoolEClass, PARAMETER_BOOL__VALUE);

		variantEClass = createEClass(VARIANT);

		operationModeReferenceEClass = createEClass(OPERATION_MODE_REFERENCE);
		createEReference(operationModeReferenceEClass, OPERATION_MODE_REFERENCE__OPERATION_MODE);
		createEAttribute(operationModeReferenceEClass, OPERATION_MODE_REFERENCE__ACTIVE_PROBABILITY);

		scenarioEClass = createEClass(SCENARIO);

		subscenarioEClass = createEClass(SUBSCENARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterAEClass.getESuperTypes().add(this.get_ModeDependentElementA());
		parameterAEClass.getESuperTypes().add(this.get_VariantDependentElementA());
		scenarioContainerAEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		operationModeEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		operationModeEClass.getESuperTypes().add(this.get_VariantDependentElementA());
		parameterNumericEClass.getESuperTypes().add(this.getParameterA());
		parameterNumericEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		parameterBoolEClass.getESuperTypes().add(this.getParameterA());
		parameterBoolEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		variantEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		variantEClass.getESuperTypes().add(this.get_ModeDependentElementA());
		operationModeReferenceEClass.getESuperTypes().add(theCommonPackage.get_ElementA());
		scenarioEClass.getESuperTypes().add(this.getScenarioContainerA());
		subscenarioEClass.getESuperTypes().add(this.getScenarioContainerA());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterAEClass, ParameterA.class, "ParameterA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(_ModeDependentElementAEClass, _ModeDependentElementA.class, "_ModeDependentElementA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(get_ModeDependentElementA_OperationModes(), this.getOperationModeReference(), null, "operationModes", null, 0, -1, _ModeDependentElementA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_VariantDependentElementAEClass, _VariantDependentElementA.class, "_VariantDependentElementA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(get_VariantDependentElementA_Variants(), this.getVariant(), null, "variants", null, 0, -1, _VariantDependentElementA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioContainerAEClass, ScenarioContainerA.class, "ScenarioContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioContainerA_Parameters(), this.getParameterA(), null, "parameters", null, 0, -1, ScenarioContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioContainerA_Variants(), this.getVariant(), null, "variants", null, 0, -1, ScenarioContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioContainerA_OperationModes(), this.getOperationMode(), null, "operationModes", null, 1, -1, ScenarioContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioContainerA_Subscenarios(), this.getSubscenario(), null, "subscenarios", null, 0, -1, ScenarioContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationModeEClass, OperationMode.class, "OperationMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterNumericEClass, ParameterNumeric.class, "ParameterNumeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterNumeric_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, ParameterNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBoolEClass, ParameterBool.class, "ParameterBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterBool_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, ParameterBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationModeReferenceEClass, OperationModeReference.class, "OperationModeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationModeReference_OperationMode(), this.getOperationMode(), null, "operationMode", null, 1, 1, OperationModeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationModeReference_ActiveProbability(), ecorePackage.getEDouble(), "activeProbability", "1.0", 1, 1, OperationModeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subscenarioEClass, Subscenario.class, "Subscenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ScenarioPackageImpl
