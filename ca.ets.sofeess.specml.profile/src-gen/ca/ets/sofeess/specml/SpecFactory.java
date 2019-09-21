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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage
 * @generated
 */
public interface SpecFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecFactory eINSTANCE = ca.ets.sofeess.specml.impl.SpecFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Requirement</em>'.
	 * @generated
	 */
	SystemRequirement createSystemRequirement();

	/**
	 * Returns a new object of class '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>High Level Requirement</em>'.
	 * @generated
	 */
	HighLevelRequirement createHighLevelRequirement();

	/**
	 * Returns a new object of class '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Low Level Requirement</em>'.
	 * @generated
	 */
	LowLevelRequirement createLowLevelRequirement();

	/**
	 * Returns a new object of class '<em>Coupled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled</em>'.
	 * @generated
	 */
	Coupled createCoupled();

	/**
	 * Returns a new object of class '<em>Refine Reqt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refine Reqt</em>'.
	 * @generated
	 */
	RefineReqt createRefineReqt();

	/**
	 * Returns a new object of class '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy</em>'.
	 * @generated
	 */
	Copy createCopy();

	/**
	 * Returns a new object of class '<em>Derive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derive</em>'.
	 * @generated
	 */
	Derive createDerive();

	/**
	 * Returns a new object of class '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Based Statement</em>'.
	 * @generated
	 */
	PropertyBasedStatement createPropertyBasedStatement();

	/**
	 * Returns a new object of class '<em>Timed Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Domain</em>'.
	 * @generated
	 */
	TimedDomain createTimedDomain();

	/**
	 * Returns a new object of class '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Event</em>'.
	 * @generated
	 */
	TimedEvent createTimedEvent();

	/**
	 * Returns a new object of class '<em>Timed Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Duration Constraint</em>'.
	 * @generated
	 */
	TimedDurationConstraint createTimedDurationConstraint();

	/**
	 * Returns a new object of class '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Instant Observation</em>'.
	 * @generated
	 */
	TimedInstantObservation createTimedInstantObservation();

	/**
	 * Returns a new object of class '<em>Formalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formalization</em>'.
	 * @generated
	 */
	Formalization createFormalization();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec</em>'.
	 * @generated
	 */
	Spec createSpec();

	/**
	 * Returns a new object of class '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Attribute</em>'.
	 * @generated
	 */
	DataAttribute createDataAttribute();

	/**
	 * Returns a new object of class '<em>Field Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Data</em>'.
	 * @generated
	 */
	FieldData createFieldData();

	/**
	 * Returns a new object of class '<em>Entity Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Data</em>'.
	 * @generated
	 */
	EntityData createEntityData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecMLPackage getSpecPackage();

} //SpecFactory
