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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.SystemRequirement#isAllocatedToSoftware <em>Allocated To Software</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getSystemRequirement()
 * @model
 * @generated
 */
public interface SystemRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Allocated To Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated To Software</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To Software</em>' attribute.
	 * @see #setAllocatedToSoftware(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getSystemRequirement_AllocatedToSoftware()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllocatedToSoftware();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.SystemRequirement#isAllocatedToSoftware <em>Allocated To Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated To Software</em>' attribute.
	 * @see #isAllocatedToSoftware()
	 * @generated
	 */
	void setAllocatedToSoftware(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(SystemRequirement) and s.oclAsType(Class).extension_Requirement.oclAsType(SystemRequirement).allocatedToSoftware = true)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CoupledWithAnotherSRATS(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SystemRequirement
