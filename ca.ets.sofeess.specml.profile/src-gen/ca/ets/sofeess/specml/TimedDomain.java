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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.TimedDomain#getBase_Namespace <em>Base Namespace</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedDomain()
 * @model
 * @generated
 */
public interface TimedDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see ca.ets.sofeess.specml.SpecMLPackage#getTimedDomain_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.specml.TimedDomain#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

} // TimedDomain
