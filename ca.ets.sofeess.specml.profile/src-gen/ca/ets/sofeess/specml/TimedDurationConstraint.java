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

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.TimedDurationConstraint#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.TimedDurationConstraint#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedDurationConstraint()
 * @model
 * @generated
 */
public interface TimedDurationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedDurationConstraint_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.TimedDurationConstraint#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ets.sofeess.specml.ConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ca.ets.sofeess.specml.ConstraintKind
	 * @see #setKind(ConstraintKind)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedDurationConstraint_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConstraintKind getKind();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.TimedDurationConstraint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ca.ets.sofeess.specml.ConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstraintKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Constraint.namespace.extension_TimedDomain <> null or self.base_Constraint.namespace.namespace.extension_TimedDomain <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ContainedInTimedDomainNamespace(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TimedDurationConstraint
