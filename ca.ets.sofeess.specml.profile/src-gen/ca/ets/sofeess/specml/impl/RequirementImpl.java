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

import ca.ets.sofeess.specml.Copy;
import ca.ets.sofeess.specml.Coupled;
import ca.ets.sofeess.specml.Derive;
import ca.ets.sofeess.specml.Formalization;
import ca.ets.sofeess.specml.PropertyBasedStatement;
import ca.ets.sofeess.specml.RefineReqt;
import ca.ets.sofeess.specml.Requirement;
import ca.ets.sofeess.specml.RequirementStatus;
import ca.ets.sofeess.specml.RequirementType;
import ca.ets.sofeess.specml.Source;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.util.SpecValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#isStable <em>Is Stable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#isVerifiable <em>Is Verifiable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#isConsistent <em>Is Consistent</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#isFormalizable <em>Is Formalizable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getRefinedFrom <em>Refined From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getCoupledTo <em>Coupled To</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getCopiedFrom <em>Copied From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.RequirementImpl#getFormalizedAs <em>Formalized As</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementType TYPE_EDEFAULT = RequirementType.STRUCTURAL_REQUIREMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RequirementType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isStable() <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStable() <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStable()
	 * @generated
	 * @ordered
	 */
	protected boolean isStable = IS_STABLE_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementStatus STATUS_EDEFAULT = RequirementStatus.PENDING_REVIEW;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RequirementStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerifiable() <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERIFIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerifiable() <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean isVerifiable = IS_VERIFIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConsistent() <em>Is Consistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConsistent() <em>Is Consistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsistent()
	 * @generated
	 * @ordered
	 */
	protected boolean isConsistent = IS_CONSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFormalizable() <em>Is Formalizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormalizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORMALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFormalizable() <em>Is Formalizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormalizable()
	 * @generated
	 * @ordered
	 */
	protected boolean isFormalizable = IS_FORMALIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecMLPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecMLPackage.REQUIREMENT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RequirementType newType) {
		RequirementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSource() {
		if (source == null) {
			source = new EDataTypeUniqueEList<Source>(Source.class, this, SpecMLPackage.REQUIREMENT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStable() {
		return isStable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStable(boolean newIsStable) {
		boolean oldIsStable = isStable;
		isStable = newIsStable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__IS_STABLE, oldIsStable, isStable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__MODIFICATION_DATE, oldModificationDate, modificationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RequirementStatus newStatus) {
		RequirementStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerifiable() {
		return isVerifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVerifiable(boolean newIsVerifiable) {
		boolean oldIsVerifiable = isVerifiable;
		isVerifiable = newIsVerifiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__IS_VERIFIABLE, oldIsVerifiable, isVerifiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistent() {
		return isConsistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConsistent(boolean newIsConsistent) {
		boolean oldIsConsistent = isConsistent;
		isConsistent = newIsConsistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__IS_CONSISTENT, oldIsConsistent, isConsistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormalizable() {
		return isFormalizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFormalizable(boolean newIsFormalizable) {
		boolean oldIsFormalizable = isFormalizable;
		isFormalizable = newIsFormalizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.REQUIREMENT__IS_FORMALIZABLE, oldIsFormalizable, isFormalizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getRefinedBy() {
		EList<Requirement> refinedBy = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getTargetDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				RefineReqt refineReqt = UMLUtil.getStereotypeApplication(directedRelationship, RefineReqt.class);
				
				if (refineReqt != null) {
					EList<NamedElement> clients = refineReqt.getBase_Dependency().getClients();
					Iterator<NamedElement> clientsIterator = clients.iterator();
					
					while (clientsIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(clientsIterator.next(), Requirement.class);
						
						if (requirement != null) {
							refinedBy.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_RefinedBy(), refinedBy.size(), refinedBy.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getRefinedFrom() {
		EList<Requirement> refinedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				RefineReqt refineReqt = UMLUtil.getStereotypeApplication(directedRelationship, RefineReqt.class);
				
				if (refineReqt != null) {
					EList<NamedElement> suppliers = refineReqt.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							refinedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_RefinedFrom(), refinedFrom.size(), refinedFrom.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getCoupledTo() {
		EList<Requirement> coupledTo = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getTargetDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Coupled coupled = UMLUtil.getStereotypeApplication(directedRelationship, Coupled.class);
				
				if (coupled != null) {
					EList<NamedElement> clients = coupled.getBase_Dependency().getClients();
					Iterator<NamedElement> clientsIterator = clients.iterator();
					
					while (clientsIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(clientsIterator.next(), Requirement.class);
						
						if (requirement != null) {
							coupledTo.add(requirement);
						}
					}
				}
			}
			
			directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Coupled coupled = UMLUtil.getStereotypeApplication(directedRelationship, Coupled.class);
				
				if (coupled != null) {
					EList<NamedElement> suppliers = coupled.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							if (!coupledTo.contains(requirement)) {
								coupledTo.add(requirement);
							}
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_CoupledTo(), coupledTo.size(), coupledTo.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getCopiedFrom() {
		EList<Requirement> copiedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Copy copy = UMLUtil.getStereotypeApplication(directedRelationship, Copy.class);
				
				if (copy != null) {
					EList<NamedElement> suppliers = copy.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							copiedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_CopiedFrom(), copiedFrom.size(), copiedFrom.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Requirement> getDerivedFrom() {
		EList<Requirement> derivedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Derive derive = UMLUtil.getStereotypeApplication(directedRelationship, Derive.class);
				
				if (derive != null) {
					EList<NamedElement> suppliers = derive.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							derivedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_DerivedFrom(), derivedFrom.size(), derivedFrom.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getFormalizedAs() {
		EList<String> formalizedAs = new BasicEList<String>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Formalization formalization = UMLUtil.getStereotypeApplication(directedRelationship, Formalization.class);
				
				if (formalization != null) {
					EList<NamedElement> suppliers = formalization.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						PropertyBasedStatement propertyBasedStatement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), PropertyBasedStatement.class);
						
						if (propertyBasedStatement != null) {
							formalizedAs.add(propertyBasedStatement.getStatement());
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_FormalizedAs(), formalizedAs.size(), formalizedAs.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOneRequirementSubtype(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__ONLY_ONE_REQUIREMENT_SUBTYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OnlyOneRequirementSubtype", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IDMustBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__ID_MUST_BE_UNIQUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "IDMustBeUnique", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RationaleIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__RATIONALE_IS_REQUIRED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RationaleIsRequired", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoNestedClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__NO_NESTED_CLASSIFIERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoNestedClassifiers", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__NO_ASSOCIATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoAssociations", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoGeneralizations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__NO_GENERALIZATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoGeneralizations", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoOwnedAttributes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__NO_OWNED_ATTRIBUTES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoOwnedAttributes", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoOwnedOperations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__NO_OWNED_OPERATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoOwnedOperations", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IfCopyTextIsReadOnly(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__IF_COPY_TEXT_IS_READ_ONLY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "IfCopyTextIsReadOnly", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PropertyBasedStatementSupplier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__PROPERTY_BASED_STATEMENT_SUPPLIER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PropertyBasedStatementSupplier", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RequirementFormalizationIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.REQUIREMENT__REQUIREMENT_FORMALIZATION_IS_REQUIRED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RequirementFormalizationIsRequired", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecMLPackage.REQUIREMENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case SpecMLPackage.REQUIREMENT__ID:
				return getId();
			case SpecMLPackage.REQUIREMENT__TEXT:
				return getText();
			case SpecMLPackage.REQUIREMENT__TYPE:
				return getType();
			case SpecMLPackage.REQUIREMENT__SOURCE:
				return getSource();
			case SpecMLPackage.REQUIREMENT__IS_DERIVED:
				return isDerived();
			case SpecMLPackage.REQUIREMENT__IS_STABLE:
				return isStable();
			case SpecMLPackage.REQUIREMENT__CREATION_DATE:
				return getCreationDate();
			case SpecMLPackage.REQUIREMENT__MODIFICATION_DATE:
				return getModificationDate();
			case SpecMLPackage.REQUIREMENT__REVISION:
				return getRevision();
			case SpecMLPackage.REQUIREMENT__STATUS:
				return getStatus();
			case SpecMLPackage.REQUIREMENT__IS_VERIFIABLE:
				return isVerifiable();
			case SpecMLPackage.REQUIREMENT__IS_CONSISTENT:
				return isConsistent();
			case SpecMLPackage.REQUIREMENT__IS_FORMALIZABLE:
				return isFormalizable();
			case SpecMLPackage.REQUIREMENT__REFINED_BY:
				return getRefinedBy();
			case SpecMLPackage.REQUIREMENT__REFINED_FROM:
				return getRefinedFrom();
			case SpecMLPackage.REQUIREMENT__COUPLED_TO:
				return getCoupledTo();
			case SpecMLPackage.REQUIREMENT__COPIED_FROM:
				return getCopiedFrom();
			case SpecMLPackage.REQUIREMENT__DERIVED_FROM:
				return getDerivedFrom();
			case SpecMLPackage.REQUIREMENT__FORMALIZED_AS:
				return getFormalizedAs();
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
			case SpecMLPackage.REQUIREMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__TEXT:
				setText((String)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__TYPE:
				setType((RequirementType)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Source>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__IS_STABLE:
				setIsStable((Boolean)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__MODIFICATION_DATE:
				setModificationDate((String)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__REVISION:
				setRevision((Integer)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__STATUS:
				setStatus((RequirementStatus)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__IS_VERIFIABLE:
				setIsVerifiable((Boolean)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__IS_CONSISTENT:
				setIsConsistent((Boolean)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__IS_FORMALIZABLE:
				setIsFormalizable((Boolean)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends Requirement>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__REFINED_FROM:
				getRefinedFrom().clear();
				getRefinedFrom().addAll((Collection<? extends Requirement>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__COUPLED_TO:
				getCoupledTo().clear();
				getCoupledTo().addAll((Collection<? extends Requirement>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__COPIED_FROM:
				getCopiedFrom().clear();
				getCopiedFrom().addAll((Collection<? extends Requirement>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Requirement>)newValue);
				return;
			case SpecMLPackage.REQUIREMENT__FORMALIZED_AS:
				getFormalizedAs().clear();
				getFormalizedAs().addAll((Collection<? extends String>)newValue);
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
			case SpecMLPackage.REQUIREMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case SpecMLPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__SOURCE:
				getSource().clear();
				return;
			case SpecMLPackage.REQUIREMENT__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__IS_STABLE:
				setIsStable(IS_STABLE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__MODIFICATION_DATE:
				setModificationDate(MODIFICATION_DATE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__IS_VERIFIABLE:
				setIsVerifiable(IS_VERIFIABLE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__IS_CONSISTENT:
				setIsConsistent(IS_CONSISTENT_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__IS_FORMALIZABLE:
				setIsFormalizable(IS_FORMALIZABLE_EDEFAULT);
				return;
			case SpecMLPackage.REQUIREMENT__REFINED_BY:
				getRefinedBy().clear();
				return;
			case SpecMLPackage.REQUIREMENT__REFINED_FROM:
				getRefinedFrom().clear();
				return;
			case SpecMLPackage.REQUIREMENT__COUPLED_TO:
				getCoupledTo().clear();
				return;
			case SpecMLPackage.REQUIREMENT__COPIED_FROM:
				getCopiedFrom().clear();
				return;
			case SpecMLPackage.REQUIREMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case SpecMLPackage.REQUIREMENT__FORMALIZED_AS:
				getFormalizedAs().clear();
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
			case SpecMLPackage.REQUIREMENT__BASE_CLASS:
				return base_Class != null;
			case SpecMLPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpecMLPackage.REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SpecMLPackage.REQUIREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__SOURCE:
				return source != null && !source.isEmpty();
			case SpecMLPackage.REQUIREMENT__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__IS_STABLE:
				return isStable != IS_STABLE_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case SpecMLPackage.REQUIREMENT__MODIFICATION_DATE:
				return MODIFICATION_DATE_EDEFAULT == null ? modificationDate != null : !MODIFICATION_DATE_EDEFAULT.equals(modificationDate);
			case SpecMLPackage.REQUIREMENT__REVISION:
				return revision != REVISION_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__IS_VERIFIABLE:
				return isVerifiable != IS_VERIFIABLE_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__IS_CONSISTENT:
				return isConsistent != IS_CONSISTENT_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__IS_FORMALIZABLE:
				return isFormalizable != IS_FORMALIZABLE_EDEFAULT;
			case SpecMLPackage.REQUIREMENT__REFINED_BY:
				return !getRefinedBy().isEmpty();
			case SpecMLPackage.REQUIREMENT__REFINED_FROM:
				return !getRefinedFrom().isEmpty();
			case SpecMLPackage.REQUIREMENT__COUPLED_TO:
				return !getCoupledTo().isEmpty();
			case SpecMLPackage.REQUIREMENT__COPIED_FROM:
				return !getCopiedFrom().isEmpty();
			case SpecMLPackage.REQUIREMENT__DERIVED_FROM:
				return !getDerivedFrom().isEmpty();
			case SpecMLPackage.REQUIREMENT__FORMALIZED_AS:
				return !getFormalizedAs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpecMLPackage.REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP:
				return OnlyOneRequirementSubtype((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return IDMustBeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return RationaleIsRequired((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP:
				return NoNestedClassifiers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return NoAssociations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP:
				return NoGeneralizations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
				return NoOwnedAttributes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP:
				return NoOwnedOperations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP:
				return IfCopyTextIsReadOnly((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP:
				return PropertyBasedStatementSupplier((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return RequirementFormalizationIsRequired((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", text: ");
		result.append(text);
		result.append(", type: ");
		result.append(type);
		result.append(", source: ");
		result.append(source);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isStable: ");
		result.append(isStable);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", modificationDate: ");
		result.append(modificationDate);
		result.append(", revision: ");
		result.append(revision);
		result.append(", status: ");
		result.append(status);
		result.append(", isVerifiable: ");
		result.append(isVerifiable);
		result.append(", isConsistent: ");
		result.append(isConsistent);
		result.append(", isFormalizable: ");
		result.append(isFormalizable);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
