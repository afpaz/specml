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
package ca.ets.sofeess.specml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getText <em>Text</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#isStable <em>Is Stable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getRevision <em>Revision</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#isVerifiable <em>Is Verifiable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#isConsistent <em>Is Consistent</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#isFormalizable <em>Is Formalizable</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getRefinedFrom <em>Refined From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getCoupledTo <em>Coupled To</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getCopiedFrom <em>Copied From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Requirement#getFormalizedAs <em>Formalized As</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Text()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ets.sofeess.specml.RequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.ets.sofeess.specml.RequirementType
	 * @see #setType(RequirementType)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequirementType getType();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.ets.sofeess.specml.RequirementType
	 * @see #getType()
	 * @generated
	 */
	void setType(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Source}.
	 * The literals are from the enumeration {@link ca.ets.sofeess.specml.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute list.
	 * @see ca.ets.sofeess.specml.Source
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_IsDerived()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stable</em>' attribute.
	 * @see #setIsStable(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_IsStable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStable();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#isStable <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stable</em>' attribute.
	 * @see #isStable()
	 * @generated
	 */
	void setIsStable(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_CreationDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date</em>' attribute.
	 * @see #setModificationDate(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_ModificationDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getModificationDate();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getModificationDate <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date</em>' attribute.
	 * @see #getModificationDate()
	 * @generated
	 */
	void setModificationDate(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(int)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Revision()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ets.sofeess.specml.RequirementStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.ets.sofeess.specml.RequirementStatus
	 * @see #setStatus(RequirementStatus)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequirementStatus getStatus();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ca.ets.sofeess.specml.RequirementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequirementStatus value);

	/**
	 * Returns the value of the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Verifiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Verifiable</em>' attribute.
	 * @see #setIsVerifiable(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_IsVerifiable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVerifiable();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#isVerifiable <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Verifiable</em>' attribute.
	 * @see #isVerifiable()
	 * @generated
	 */
	void setIsVerifiable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Consistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Consistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consistent</em>' attribute.
	 * @see #setIsConsistent(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_IsConsistent()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConsistent();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#isConsistent <em>Is Consistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consistent</em>' attribute.
	 * @see #isConsistent()
	 * @generated
	 */
	void setIsConsistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Formalizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Formalizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Formalizable</em>' attribute.
	 * @see #setIsFormalizable(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_IsFormalizable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFormalizable();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Requirement#isFormalizable <em>Is Formalizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Formalizable</em>' attribute.
	 * @see #isFormalizable()
	 * @generated
	 */
	void setIsFormalizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined By</em>' reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_RefinedBy()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRefinedBy();

	/**
	 * Returns the value of the '<em><b>Refined From</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined From</em>' reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_RefinedFrom()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRefinedFrom();

	/**
	 * Returns the value of the '<em><b>Coupled To</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupled To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupled To</em>' reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_CoupledTo()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getCoupledTo();

	/**
	 * Returns the value of the '<em><b>Copied From</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copied From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copied From</em>' reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_CopiedFrom()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getCopiedFrom();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_DerivedFrom()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Formalized As</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formalized As</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalized As</em>' attribute list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirement_FormalizedAs()
	 * @model dataType="org.eclipse.uml2.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<String> getFormalizedAs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.extension_Requirement -> size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean OnlyOneRequirementSubtype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirement.allInstances() -> isUnique(id)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean IDMustBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDerived implies self.base_Class.ownedComment -> exists(c | c.extension_Rationale <> null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RationaleIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.nestedClassifier -> isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoNestedClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.association -> isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoAssociations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.generalization -> isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoGeneralizations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.ownedAttribute -> isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoOwnedAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.ownedOperation -> isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean NoOwnedOperations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Copy)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Copy) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.text = self.text)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean IfCopyTextIsReadOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Formalization <> null) then self.base_Class.clientDependency -> exists(d | d.extension_Formalization <> null and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_PropertyBasedStatement <> null)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean PropertyBasedStatementSupplier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isFormalizable implies self.base_Class.clientDependency -> exists(d | d.extension_Formalization <> null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RequirementFormalizationIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Requirement
