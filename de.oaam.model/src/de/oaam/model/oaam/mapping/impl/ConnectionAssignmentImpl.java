/**
 */
package de.oaam.model.oaam.mapping.impl;

import de.oaam.model.oaam.common.impl._ElementAImpl;

import de.oaam.model.oaam.hardware.Connection;

import de.oaam.model.oaam.mapping.ConnectionAssignment;
import de.oaam.model.oaam.mapping.ConnectionAssignmentSegment;
import de.oaam.model.oaam.mapping.MappingPackage;

import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario._ModeDependentElementA;
import de.oaam.model.oaam.scenario._VariantDependentElementA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.oaam.model.oaam.mapping.impl.ConnectionAssignmentImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionAssignmentImpl extends _ElementAImpl implements ConnectionAssignment {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionAssignmentSegment> segments;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.CONNECTION_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionAssignmentSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<ConnectionAssignmentSegment>(ConnectionAssignmentSegment.class, this, MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
			case MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS:
				return getVariants();
			case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES:
				return getOperationModes();
			case MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS:
				return getSegments();
			case MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends ConnectionAssignmentSegment>)newValue);
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION:
				setConnection((Connection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS:
				getVariants().clear();
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS:
				getSegments().clear();
				return;
			case MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION:
				setConnection((Connection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS:
				return variants != null && !variants.isEmpty();
			case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case MappingPackage.CONNECTION_ASSIGNMENT__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case MappingPackage.CONNECTION_ASSIGNMENT__CONNECTION:
				return connection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == _VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS: return ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES: return ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == _VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return MappingPackage.CONNECTION_ASSIGNMENT__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == _ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage._MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return MappingPackage.CONNECTION_ASSIGNMENT__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionAssignmentImpl
