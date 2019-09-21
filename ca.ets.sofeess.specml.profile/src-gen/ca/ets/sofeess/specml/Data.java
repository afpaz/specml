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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.Data#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getRationale <em>Rationale</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getCreationNotes <em>Creation Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getMaintenanceNotes <em>Maintenance Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getUsageNotes <em>Usage Notes</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getRevision <em>Revision</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.Data#getOtherMetadata <em>Other Metadata</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_Rationale()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_DisplayName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

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
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Creation Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Notes</em>' attribute.
	 * @see #setCreationNotes(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_CreationNotes()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCreationNotes();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getCreationNotes <em>Creation Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Notes</em>' attribute.
	 * @see #getCreationNotes()
	 * @generated
	 */
	void setCreationNotes(String value);

	/**
	 * Returns the value of the '<em><b>Maintenance Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintenance Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Notes</em>' attribute.
	 * @see #setMaintenanceNotes(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_MaintenanceNotes()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMaintenanceNotes();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getMaintenanceNotes <em>Maintenance Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Notes</em>' attribute.
	 * @see #getMaintenanceNotes()
	 * @generated
	 */
	void setMaintenanceNotes(String value);

	/**
	 * Returns the value of the '<em><b>Usage Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Notes</em>' attribute.
	 * @see #setUsageNotes(String)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_UsageNotes()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUsageNotes();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getUsageNotes <em>Usage Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Notes</em>' attribute.
	 * @see #getUsageNotes()
	 * @generated
	 */
	void setUsageNotes(String value);

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
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_CreationDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getCreationDate <em>Creation Date</em>}' attribute.
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
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_ModificationDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getModificationDate();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getModificationDate <em>Modification Date</em>}' attribute.
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
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_Revision()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.Data#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

	/**
	 * Returns the value of the '<em><b>Other Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.specml.DataAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Metadata</em>' containment reference list.
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getData_OtherMetadata()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataAttribute> getOtherMetadata();

} // Data
