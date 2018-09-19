/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.impl.AllocationsPackageImpl;
import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.Capabilities;
import de.oaam.model.oaam.capabilities.CapabilitiesContainerA;
import de.oaam.model.oaam.capabilities.CapabilitiesFactory;
import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.CapabilityA;
import de.oaam.model.oaam.capabilities.ConnectionInDuctOrLocationCapability;
import de.oaam.model.oaam.capabilities.DeviceInLocationCapability;
import de.oaam.model.oaam.capabilities.ResourceConsumption;
import de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability;
import de.oaam.model.oaam.capabilities.Subcapabilities;
import de.oaam.model.oaam.capabilities.SubdeviceInDeviceCapability;
import de.oaam.model.oaam.capabilities.TaskOnDeviceCapability;
import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.library.impl.LibraryPackageImpl;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

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
public class CapabilitiesPackageImpl extends EPackageImpl implements CapabilitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOnDeviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInLocationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionInDuctOrLocationCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalOnConnectionOrDeviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceInDeviceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcapabilitiesEClass = null;

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
	 * @see de.oaam.model.oaam.capabilities.CapabilitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapabilitiesPackageImpl() {
		super(eNS_URI, CapabilitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapabilitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapabilitiesPackage init() {
		if (isInited) return (CapabilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);

		// Obtain or create and register package
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapabilitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);

		// Create package meta-data objects
		theCapabilitiesPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();

		// Initialize created meta-data
		theCapabilitiesPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapabilitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapabilitiesPackage.eNS_URI, theCapabilitiesPackage);
		return theCapabilitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityA() {
		return capabilityAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityA_ResourceConsumptions() {
		return (EReference)capabilityAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitiesContainerA() {
		return capabilitiesContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_TaskOnDeviceCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_SignalOnConnectionOrDeviceCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_DeviceInLocationCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_SubdeviceInDeviceCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_ConnectionInDuctOrLocationCapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesContainerA_Subcapabilities() {
		return (EReference)capabilitiesContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskOnDeviceCapability() {
		return taskOnDeviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOnDeviceCapability_TaskType() {
		return (EReference)taskOnDeviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOnDeviceCapability_DeviceType() {
		return (EReference)taskOnDeviceCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskOnDeviceCapability_WorstCaseExecutionTime() {
		return (EAttribute)taskOnDeviceCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskOnDeviceCapability_FailureProbability() {
		return (EAttribute)taskOnDeviceCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceInLocationCapability() {
		return deviceInLocationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInLocationCapability_DeviceType() {
		return (EReference)deviceInLocationCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInLocationCapability_LocationType() {
		return (EReference)deviceInLocationCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionInDuctOrLocationCapability() {
		return connectionInDuctOrLocationCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionInDuctOrLocationCapability_ConnectionType() {
		return (EReference)connectionInDuctOrLocationCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionInDuctOrLocationCapability_LocationType() {
		return (EReference)connectionInDuctOrLocationCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionInDuctOrLocationCapability_DuctType() {
		return (EReference)connectionInDuctOrLocationCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalOnConnectionOrDeviceCapability() {
		return signalOnConnectionOrDeviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalOnConnectionOrDeviceCapability_SignalType() {
		return (EReference)signalOnConnectionOrDeviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalOnConnectionOrDeviceCapability_DeviceType() {
		return (EReference)signalOnConnectionOrDeviceCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalOnConnectionOrDeviceCapability_ConnectionType() {
		return (EReference)signalOnConnectionOrDeviceCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubdeviceInDeviceCapability() {
		return subdeviceInDeviceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceInDeviceCapability_SubdeviceType() {
		return (EReference)subdeviceInDeviceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceInDeviceCapability_TargetDeviceType() {
		return (EReference)subdeviceInDeviceCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConsumption() {
		return resourceConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceConsumption_Count() {
		return (EAttribute)resourceConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumption_OriginalResource() {
		return (EReference)resourceConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConsumption_Type() {
		return (EReference)resourceConsumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilities() {
		return capabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubcapabilities() {
		return subcapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesFactory getCapabilitiesFactory() {
		return (CapabilitiesFactory)getEFactoryInstance();
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
		capabilityAEClass = createEClass(CAPABILITY_A);
		createEReference(capabilityAEClass, CAPABILITY_A__RESOURCE_CONSUMPTIONS);

		capabilitiesContainerAEClass = createEClass(CAPABILITIES_CONTAINER_A);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__TASK_ON_DEVICE_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__DEVICE_IN_LOCATION_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SUBDEVICE_IN_DEVICE_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITIES);
		createEReference(capabilitiesContainerAEClass, CAPABILITIES_CONTAINER_A__SUBCAPABILITIES);

		taskOnDeviceCapabilityEClass = createEClass(TASK_ON_DEVICE_CAPABILITY);
		createEReference(taskOnDeviceCapabilityEClass, TASK_ON_DEVICE_CAPABILITY__TASK_TYPE);
		createEReference(taskOnDeviceCapabilityEClass, TASK_ON_DEVICE_CAPABILITY__DEVICE_TYPE);
		createEAttribute(taskOnDeviceCapabilityEClass, TASK_ON_DEVICE_CAPABILITY__WORST_CASE_EXECUTION_TIME);
		createEAttribute(taskOnDeviceCapabilityEClass, TASK_ON_DEVICE_CAPABILITY__FAILURE_PROBABILITY);

		deviceInLocationCapabilityEClass = createEClass(DEVICE_IN_LOCATION_CAPABILITY);
		createEReference(deviceInLocationCapabilityEClass, DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE);
		createEReference(deviceInLocationCapabilityEClass, DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE);

		connectionInDuctOrLocationCapabilityEClass = createEClass(CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY);
		createEReference(connectionInDuctOrLocationCapabilityEClass, CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__CONNECTION_TYPE);
		createEReference(connectionInDuctOrLocationCapabilityEClass, CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__LOCATION_TYPE);
		createEReference(connectionInDuctOrLocationCapabilityEClass, CONNECTION_IN_DUCT_OR_LOCATION_CAPABILITY__DUCT_TYPE);

		signalOnConnectionOrDeviceCapabilityEClass = createEClass(SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY);
		createEReference(signalOnConnectionOrDeviceCapabilityEClass, SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__SIGNAL_TYPE);
		createEReference(signalOnConnectionOrDeviceCapabilityEClass, SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__DEVICE_TYPE);
		createEReference(signalOnConnectionOrDeviceCapabilityEClass, SIGNAL_ON_CONNECTION_OR_DEVICE_CAPABILITY__CONNECTION_TYPE);

		subdeviceInDeviceCapabilityEClass = createEClass(SUBDEVICE_IN_DEVICE_CAPABILITY);
		createEReference(subdeviceInDeviceCapabilityEClass, SUBDEVICE_IN_DEVICE_CAPABILITY__SUBDEVICE_TYPE);
		createEReference(subdeviceInDeviceCapabilityEClass, SUBDEVICE_IN_DEVICE_CAPABILITY__TARGET_DEVICE_TYPE);

		resourceConsumptionEClass = createEClass(RESOURCE_CONSUMPTION);
		createEAttribute(resourceConsumptionEClass, RESOURCE_CONSUMPTION__COUNT);
		createEReference(resourceConsumptionEClass, RESOURCE_CONSUMPTION__ORIGINAL_RESOURCE);
		createEReference(resourceConsumptionEClass, RESOURCE_CONSUMPTION__TYPE);

		capabilitiesEClass = createEClass(CAPABILITIES);

		subcapabilitiesEClass = createEClass(SUBCAPABILITIES);
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
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capabilitiesContainerAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		taskOnDeviceCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		taskOnDeviceCapabilityEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		taskOnDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskOnDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		deviceInLocationCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		deviceInLocationCapabilityEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		deviceInLocationCapabilityEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		deviceInLocationCapabilityEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionInDuctOrLocationCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		connectionInDuctOrLocationCapabilityEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		connectionInDuctOrLocationCapabilityEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionInDuctOrLocationCapabilityEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalOnConnectionOrDeviceCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		signalOnConnectionOrDeviceCapabilityEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		signalOnConnectionOrDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalOnConnectionOrDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subdeviceInDeviceCapabilityEClass.getESuperTypes().add(this.getCapabilityA());
		subdeviceInDeviceCapabilityEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		subdeviceInDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subdeviceInDeviceCapabilityEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		resourceConsumptionEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		capabilitiesEClass.getESuperTypes().add(this.getCapabilitiesContainerA());
		subcapabilitiesEClass.getESuperTypes().add(this.getCapabilitiesContainerA());
		subcapabilitiesEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subcapabilitiesEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(capabilityAEClass, CapabilityA.class, "CapabilityA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityA_ResourceConsumptions(), this.getResourceConsumption(), null, "resourceConsumptions", null, 0, -1, CapabilityA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesContainerAEClass, CapabilitiesContainerA.class, "CapabilitiesContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilitiesContainerA_TaskOnDeviceCapabilities(), this.getTaskOnDeviceCapability(), null, "taskOnDeviceCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_SignalOnConnectionOrDeviceCapabilities(), this.getSignalOnConnectionOrDeviceCapability(), null, "signalOnConnectionOrDeviceCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_DeviceInLocationCapabilities(), this.getDeviceInLocationCapability(), null, "deviceInLocationCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_SubdeviceInDeviceCapabilities(), this.getSubdeviceInDeviceCapability(), null, "subdeviceInDeviceCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_ConnectionInDuctOrLocationCapabilities(), this.getConnectionInDuctOrLocationCapability(), null, "connectionInDuctOrLocationCapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilitiesContainerA_Subcapabilities(), this.getSubcapabilities(), null, "subcapabilities", null, 0, -1, CapabilitiesContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskOnDeviceCapabilityEClass, TaskOnDeviceCapability.class, "TaskOnDeviceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskOnDeviceCapability_TaskType(), theLibraryPackage.getTaskType(), null, "taskType", null, 1, 1, TaskOnDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskOnDeviceCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 1, 1, TaskOnDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskOnDeviceCapability_WorstCaseExecutionTime(), ecorePackage.getEFloat(), "worstCaseExecutionTime", "0.0", 1, 1, TaskOnDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskOnDeviceCapability_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", null, 1, 1, TaskOnDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInLocationCapabilityEClass, DeviceInLocationCapability.class, "DeviceInLocationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceInLocationCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 1, 1, DeviceInLocationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInLocationCapability_LocationType(), theLibraryPackage.getLocationType(), null, "locationType", null, 1, 1, DeviceInLocationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionInDuctOrLocationCapabilityEClass, ConnectionInDuctOrLocationCapability.class, "ConnectionInDuctOrLocationCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionInDuctOrLocationCapability_ConnectionType(), theLibraryPackage.getConnectionType(), null, "connectionType", null, 1, 1, ConnectionInDuctOrLocationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionInDuctOrLocationCapability_LocationType(), theLibraryPackage.getLocationType(), null, "locationType", null, 0, 1, ConnectionInDuctOrLocationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionInDuctOrLocationCapability_DuctType(), theLibraryPackage.getDuctType(), null, "ductType", null, 0, 1, ConnectionInDuctOrLocationCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalOnConnectionOrDeviceCapabilityEClass, SignalOnConnectionOrDeviceCapability.class, "SignalOnConnectionOrDeviceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalOnConnectionOrDeviceCapability_SignalType(), theLibraryPackage.getSignalType(), null, "signalType", null, 1, 1, SignalOnConnectionOrDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalOnConnectionOrDeviceCapability_DeviceType(), theLibraryPackage.getDeviceType(), null, "deviceType", null, 0, 1, SignalOnConnectionOrDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalOnConnectionOrDeviceCapability_ConnectionType(), theLibraryPackage.getConnectionType(), null, "connectionType", null, 0, 1, SignalOnConnectionOrDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceInDeviceCapabilityEClass, SubdeviceInDeviceCapability.class, "SubdeviceInDeviceCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceInDeviceCapability_SubdeviceType(), theLibraryPackage.getDeviceType(), null, "subdeviceType", null, 1, 1, SubdeviceInDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceInDeviceCapability_TargetDeviceType(), theLibraryPackage.getDeviceType(), null, "targetDeviceType", null, 1, 1, SubdeviceInDeviceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConsumptionEClass, ResourceConsumption.class, "ResourceConsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConsumption_Count(), ecorePackage.getEDouble(), "count", null, 1, 1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConsumption_OriginalResource(), theLibraryPackage.getResource(), null, "originalResource", null, 0, -1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConsumption_Type(), theLibraryPackage.getResourceType(), null, "type", null, 1, 1, ResourceConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesEClass, Capabilities.class, "Capabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subcapabilitiesEClass, Subcapabilities.class, "Subcapabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //CapabilitiesPackageImpl
