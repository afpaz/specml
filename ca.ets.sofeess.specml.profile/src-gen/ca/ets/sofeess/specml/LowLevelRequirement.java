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
 * A representation of the model object '<em><b>Low Level Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getLowLevelRequirement()
 * @model
 * @generated
 */
public interface LowLevelRequirement extends Requirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.isDerived implies self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RefineDependencyIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDerived implies self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Derive))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean DerivedLLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(LowLevelRequirement))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CoupledWithAnotherLLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Derive)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Derive) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(LowLevelRequirement))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean DeriveAnLLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(HighLevelRequirement))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RefineAnHLR(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LowLevelRequirement
