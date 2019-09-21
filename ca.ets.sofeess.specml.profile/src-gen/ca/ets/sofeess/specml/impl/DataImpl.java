/**
 * Copyright (c) 2016-2019 ÉTS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.ets.sofeess.specml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ets.sofeess.specml.Data;
import ca.ets.sofeess.specml.DataAttribute;
import ca.ets.sofeess.specml.Source;
import ca.ets.sofeess.specml.SpecMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getCreationNotes <em>Creation Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getMaintenanceNotes <em>Maintenance Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getUsageNotes <em>Usage Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.DataImpl#getOtherMetadata <em>Other Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> source;

	/**
	 * The default value of the '{@link #getCreationNotes() <em>Creation Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationNotes() <em>Creation Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationNotes()
	 * @generated
	 * @ordered
	 */
	protected String creationNotes = CREATION_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintenanceNotes() <em>Maintenance Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTENANCE_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintenanceNotes() <em>Maintenance Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceNotes()
	 * @generated
	 * @ordered
	 */
	protected String maintenanceNotes = MAINTENANCE_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageNotes() <em>Usage Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageNotes() <em>Usage Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageNotes()
	 * @generated
	 * @ordered
	 */
	protected String usageNotes = USAGE_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected String modificationDate = MODIFICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected int revision = REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherMetadata() <em>Other Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAttribute> otherMetadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecMLPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSource() {
		if (source == null) {
			source = new EDataTypeUniqueEList<Source>(Source.class, this, SpecMLPackage.DATA__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationNotes() {
		return creationNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationNotes(String newCreationNotes) {
		String oldCreationNotes = creationNotes;
		creationNotes = newCreationNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__CREATION_NOTES, oldCreationNotes, creationNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintenanceNotes() {
		return maintenanceNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceNotes(String newMaintenanceNotes) {
		String oldMaintenanceNotes = maintenanceNotes;
		maintenanceNotes = newMaintenanceNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__MAINTENANCE_NOTES, oldMaintenanceNotes, maintenanceNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageNotes() {
		return usageNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageNotes(String newUsageNotes) {
		String oldUsageNotes = usageNotes;
		usageNotes = newUsageNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__USAGE_NOTES, oldUsageNotes, usageNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificationDate() {
		return modificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(String newModificationDate) {
		String oldModificationDate = modificationDate;
		modificationDate = newModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__MODIFICATION_DATE, oldModificationDate, modificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(int newRevision) {
		int oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.DATA__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAttribute> getOtherMetadata() {
		if (otherMetadata == null) {
			otherMetadata = new EObjectContainmentEList<DataAttribute>(DataAttribute.class, this, SpecMLPackage.DATA__OTHER_METADATA);
		}
		return otherMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecMLPackage.DATA__OTHER_METADATA:
				return ((InternalEList<?>)getOtherMetadata()).basicRemove(otherEnd, msgs);
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
			case SpecMLPackage.DATA__DESCRIPTION:
				return getDescription();
			case SpecMLPackage.DATA__RATIONALE:
				return getRationale();
			case SpecMLPackage.DATA__DISPLAY_NAME:
				return getDisplayName();
			case SpecMLPackage.DATA__SOURCE:
				return getSource();
			case SpecMLPackage.DATA__CREATION_NOTES:
				return getCreationNotes();
			case SpecMLPackage.DATA__MAINTENANCE_NOTES:
				return getMaintenanceNotes();
			case SpecMLPackage.DATA__USAGE_NOTES:
				return getUsageNotes();
			case SpecMLPackage.DATA__CREATION_DATE:
				return getCreationDate();
			case SpecMLPackage.DATA__MODIFICATION_DATE:
				return getModificationDate();
			case SpecMLPackage.DATA__REVISION:
				return getRevision();
			case SpecMLPackage.DATA__OTHER_METADATA:
				return getOtherMetadata();
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
			case SpecMLPackage.DATA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SpecMLPackage.DATA__RATIONALE:
				setRationale((String)newValue);
				return;
			case SpecMLPackage.DATA__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case SpecMLPackage.DATA__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Source>)newValue);
				return;
			case SpecMLPackage.DATA__CREATION_NOTES:
				setCreationNotes((String)newValue);
				return;
			case SpecMLPackage.DATA__MAINTENANCE_NOTES:
				setMaintenanceNotes((String)newValue);
				return;
			case SpecMLPackage.DATA__USAGE_NOTES:
				setUsageNotes((String)newValue);
				return;
			case SpecMLPackage.DATA__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case SpecMLPackage.DATA__MODIFICATION_DATE:
				setModificationDate((String)newValue);
				return;
			case SpecMLPackage.DATA__REVISION:
				setRevision((Integer)newValue);
				return;
			case SpecMLPackage.DATA__OTHER_METADATA:
				getOtherMetadata().clear();
				getOtherMetadata().addAll((Collection<? extends DataAttribute>)newValue);
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
			case SpecMLPackage.DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SpecMLPackage.DATA__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case SpecMLPackage.DATA__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case SpecMLPackage.DATA__SOURCE:
				getSource().clear();
				return;
			case SpecMLPackage.DATA__CREATION_NOTES:
				setCreationNotes(CREATION_NOTES_EDEFAULT);
				return;
			case SpecMLPackage.DATA__MAINTENANCE_NOTES:
				setMaintenanceNotes(MAINTENANCE_NOTES_EDEFAULT);
				return;
			case SpecMLPackage.DATA__USAGE_NOTES:
				setUsageNotes(USAGE_NOTES_EDEFAULT);
				return;
			case SpecMLPackage.DATA__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case SpecMLPackage.DATA__MODIFICATION_DATE:
				setModificationDate(MODIFICATION_DATE_EDEFAULT);
				return;
			case SpecMLPackage.DATA__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case SpecMLPackage.DATA__OTHER_METADATA:
				getOtherMetadata().clear();
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
			case SpecMLPackage.DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SpecMLPackage.DATA__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case SpecMLPackage.DATA__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case SpecMLPackage.DATA__SOURCE:
				return source != null && !source.isEmpty();
			case SpecMLPackage.DATA__CREATION_NOTES:
				return CREATION_NOTES_EDEFAULT == null ? creationNotes != null : !CREATION_NOTES_EDEFAULT.equals(creationNotes);
			case SpecMLPackage.DATA__MAINTENANCE_NOTES:
				return MAINTENANCE_NOTES_EDEFAULT == null ? maintenanceNotes != null : !MAINTENANCE_NOTES_EDEFAULT.equals(maintenanceNotes);
			case SpecMLPackage.DATA__USAGE_NOTES:
				return USAGE_NOTES_EDEFAULT == null ? usageNotes != null : !USAGE_NOTES_EDEFAULT.equals(usageNotes);
			case SpecMLPackage.DATA__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case SpecMLPackage.DATA__MODIFICATION_DATE:
				return MODIFICATION_DATE_EDEFAULT == null ? modificationDate != null : !MODIFICATION_DATE_EDEFAULT.equals(modificationDate);
			case SpecMLPackage.DATA__REVISION:
				return revision != REVISION_EDEFAULT;
			case SpecMLPackage.DATA__OTHER_METADATA:
				return otherMetadata != null && !otherMetadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", source: ");
		result.append(source);
		result.append(", creationNotes: ");
		result.append(creationNotes);
		result.append(", maintenanceNotes: ");
		result.append(maintenanceNotes);
		result.append(", usageNotes: ");
		result.append(usageNotes);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", modificationDate: ");
		result.append(modificationDate);
		result.append(", revision: ");
		result.append(revision);
		result.append(')');
		return result.toString();
	}

} //DataImpl
