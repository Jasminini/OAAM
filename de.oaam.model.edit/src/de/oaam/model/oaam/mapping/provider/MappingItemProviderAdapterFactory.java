/**
 */
package de.oaam.model.oaam.mapping.provider;

import de.oaam.model.oaam.mapping.util.MappingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingItemProviderAdapterFactory extends MappingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.TaskAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskAssignmentItemProvider taskAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.TaskAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAssignmentAdapter() {
		if (taskAssignmentItemProvider == null) {
			taskAssignmentItemProvider = new TaskAssignmentItemProvider(this);
		}

		return taskAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.SignalAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalAssignmentItemProvider signalAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.SignalAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAssignmentAdapter() {
		if (signalAssignmentItemProvider == null) {
			signalAssignmentItemProvider = new SignalAssignmentItemProvider(this);
		}

		return signalAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.ConnectionAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionAssignmentItemProvider connectionAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.ConnectionAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAssignmentAdapter() {
		if (connectionAssignmentItemProvider == null) {
			connectionAssignmentItemProvider = new ConnectionAssignmentItemProvider(this);
		}

		return connectionAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.SignalAssignmentSegment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalAssignmentSegmentItemProvider signalAssignmentSegmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.SignalAssignmentSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAssignmentSegmentAdapter() {
		if (signalAssignmentSegmentItemProvider == null) {
			signalAssignmentSegmentItemProvider = new SignalAssignmentSegmentItemProvider(this);
		}

		return signalAssignmentSegmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.DeviceAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceAssignmentItemProvider deviceAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.DeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceAssignmentAdapter() {
		if (deviceAssignmentItemProvider == null) {
			deviceAssignmentItemProvider = new DeviceAssignmentItemProvider(this);
		}

		return deviceAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionAssignmentSegmentItemProvider connectionAssignmentSegmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.ConnectionAssignmentSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAssignmentSegmentAdapter() {
		if (connectionAssignmentSegmentItemProvider == null) {
			connectionAssignmentSegmentItemProvider = new ConnectionAssignmentSegmentItemProvider(this);
		}

		return connectionAssignmentSegmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.SubDeviceAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubDeviceAssignmentItemProvider subDeviceAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.SubDeviceAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubDeviceAssignmentAdapter() {
		if (subDeviceAssignmentItemProvider == null) {
			subDeviceAssignmentItemProvider = new SubDeviceAssignmentItemProvider(this);
		}

		return subDeviceAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.Mapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingItemProvider mappingItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingAdapter() {
		if (mappingItemProvider == null) {
			mappingItemProvider = new MappingItemProvider(this);
		}

		return mappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.mapping.Supmapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupmappingItemProvider supmappingItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.mapping.Supmapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupmappingAdapter() {
		if (supmappingItemProvider == null) {
			supmappingItemProvider = new SupmappingItemProvider(this);
		}

		return supmappingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (taskAssignmentItemProvider != null) taskAssignmentItemProvider.dispose();
		if (signalAssignmentItemProvider != null) signalAssignmentItemProvider.dispose();
		if (connectionAssignmentItemProvider != null) connectionAssignmentItemProvider.dispose();
		if (signalAssignmentSegmentItemProvider != null) signalAssignmentSegmentItemProvider.dispose();
		if (deviceAssignmentItemProvider != null) deviceAssignmentItemProvider.dispose();
		if (connectionAssignmentSegmentItemProvider != null) connectionAssignmentSegmentItemProvider.dispose();
		if (subDeviceAssignmentItemProvider != null) subDeviceAssignmentItemProvider.dispose();
		if (mappingItemProvider != null) mappingItemProvider.dispose();
		if (supmappingItemProvider != null) supmappingItemProvider.dispose();
	}

}
