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
 * A representation of the model object '<em><b>High Level Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.HighLevelRequirement#isPrecludesCFC <em>Precludes CFC</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesDesignDetail <em>Describes Design Detail</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesVerificationDetail <em>Describes Verification Detail</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getHighLevelRequirement()
 * @model
 * @generated
 */
public interface HighLevelRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Precludes CFC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precludes CFC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precludes CFC</em>' attribute.
	 * @see #setPrecludesCFC(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getHighLevelRequirement_PrecludesCFC()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPrecludesCFC();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.HighLevelRequirement#isPrecludesCFC <em>Precludes CFC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precludes CFC</em>' attribute.
	 * @see #isPrecludesCFC()
	 * @generated
	 */
	void setPrecludesCFC(boolean value);

	/**
	 * Returns the value of the '<em><b>Describes Design Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes Design Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes Design Detail</em>' attribute.
	 * @see #setDescribesDesignDetail(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getHighLevelRequirement_DescribesDesignDetail()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDescribesDesignDetail();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesDesignDetail <em>Describes Design Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes Design Detail</em>' attribute.
	 * @see #isDescribesDesignDetail()
	 * @generated
	 */
	void setDescribesDesignDetail(boolean value);

	/**
	 * Returns the value of the '<em><b>Describes Verification Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes Verification Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes Verification Detail</em>' attribute.
	 * @see #setDescribesVerificationDetail(boolean)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getHighLevelRequirement_DescribesVerificationDetail()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDescribesVerificationDetail();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesVerificationDetail <em>Describes Verification Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes Verification Detail</em>' attribute.
	 * @see #isDescribesVerificationDetail()
	 * @generated
	 */
	void setDescribesVerificationDetail(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.isDerived implies self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt) <> d.extension_Trace.oclIsKindOf(Copy))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean TraceDependencyIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean DerivedHLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.describesDesignDetail implies self.base_Class.ownedComment -> exists(c | c.extension_Rationale <> null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean DesignDetailRequiresRationale(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.describesVerificationDetail implies self.base_Class.ownedComment -> exists(c | c.extension_Rationale <> null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean VerificationDetailRequiresRationale(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Copy)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Copy) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(SystemRequirement) and s.oclAsType(Class).extension_Requirement.oclAsType(SystemRequirement).allocatedToSoftware = true)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CopyAnSRATS(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Coupled) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(HighLevelRequirement))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CoupledWithAnotherHLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Derive)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(Derive) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(HighLevelRequirement))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean DeriveAnHLR(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt)) then self.base_Class.clientDependency -> exists(d | d.extension_Trace <> null and d.extension_Trace.oclIsKindOf(RefineReqt) and d.supplier -> exists(s | s.oclIsKindOf(Class) and s.oclAsType(Class).extension_Requirement <> null and s.oclAsType(Class).extension_Requirement.oclIsKindOf(SystemRequirement) and s.oclAsType(Class).extension_Requirement.oclAsType(SystemRequirement).allocatedToSoftware = true)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RefineAnSRATS(DiagnosticChain diagnostics, Map<Object, Object> context);

} // HighLevelRequirement
