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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Instant Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.TimedInstantObservation#getObsKind <em>Obs Kind</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.TimedInstantObservation#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedInstantObservation()
 * @model
 * @generated
 */
public interface TimedInstantObservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Obs Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ets.sofeess.specml.EventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obs Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Kind</em>' attribute.
	 * @see ca.ets.sofeess.specml.EventKind
	 * @see #setObsKind(EventKind)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedInstantObservation_ObsKind()
	 * @model ordered="false"
	 * @generated
	 */
	EventKind getObsKind();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.TimedInstantObservation#getObsKind <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obs Kind</em>' attribute.
	 * @see ca.ets.sofeess.specml.EventKind
	 * @see #getObsKind()
	 * @generated
	 */
	void setObsKind(EventKind value);

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
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedInstantObservation_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.TimedInstantObservation#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.extension_PropertyBasedStatement <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean AppliedOnPropertyBasedStatement(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.namespace.extension_TimedDomain <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ContainedInTimedDomainNamespace(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TimedInstantObservation
