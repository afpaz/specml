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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.etsmtl.ca/sofeess/specml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecMLPackage eINSTANCE = ca.ets.sofeess.specml.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.RequirementImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_DERIVED = 5;

	/**
	 * The feature id for the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_STABLE = 6;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODIFICATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REVISION = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS = 10;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_VERIFIABLE = 11;

	/**
	 * The feature id for the '<em><b>Is Consistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_CONSISTENT = 12;

	/**
	 * The feature id for the '<em><b>Is Formalizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_FORMALIZABLE = 13;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = 14;

	/**
	 * The feature id for the '<em><b>Refined From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_FROM = 15;

	/**
	 * The feature id for the '<em><b>Coupled To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COUPLED_TO = 16;

	/**
	 * The feature id for the '<em><b>Copied From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COPIED_FROM = 17;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = 18;

	/**
	 * The feature id for the '<em><b>Formalized As</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FORMALIZED_AS = 19;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 20;

	/**
	 * The operation id for the '<em>Only One Requirement Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>ID Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Rationale Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>No Nested Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>No Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>No Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>No Owned Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>No Owned Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>If Copy Text Is Read Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The operation id for the '<em>Property Based Statement Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP = 9;

	/**
	 * The operation id for the '<em>Requirement Formalization Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = 10;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.SystemRequirementImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSystemRequirement()
	 * @generated
	 */
	int SYSTEM_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__BASE_CLASS = REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__TYPE = REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__SOURCE = REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_DERIVED = REQUIREMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_STABLE = REQUIREMENT__IS_STABLE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__CREATION_DATE = REQUIREMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__MODIFICATION_DATE = REQUIREMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__REVISION = REQUIREMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_VERIFIABLE = REQUIREMENT__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Consistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_CONSISTENT = REQUIREMENT__IS_CONSISTENT;

	/**
	 * The feature id for the '<em><b>Is Formalizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_FORMALIZABLE = REQUIREMENT__IS_FORMALIZABLE;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__REFINED_BY = REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Refined From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__REFINED_FROM = REQUIREMENT__REFINED_FROM;

	/**
	 * The feature id for the '<em><b>Coupled To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__COUPLED_TO = REQUIREMENT__COUPLED_TO;

	/**
	 * The feature id for the '<em><b>Copied From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__COPIED_FROM = REQUIREMENT__COPIED_FROM;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__DERIVED_FROM = REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Formalized As</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__FORMALIZED_AS = REQUIREMENT__FORMALIZED_AS;

	/**
	 * The feature id for the '<em><b>Allocated To Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__ALLOCATED_TO_SOFTWARE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Only One Requirement Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>ID Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Rationale Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Nested Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>If Copy Text Is Read Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Property Based Statement Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP = REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Formalization Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Coupled With Another SRATS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT___COUPLED_WITH_ANOTHER_SRATS__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.HighLevelRequirementImpl <em>High Level Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.HighLevelRequirementImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getHighLevelRequirement()
	 * @generated
	 */
	int HIGH_LEVEL_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__BASE_CLASS = REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__TYPE = REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__SOURCE = REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__IS_DERIVED = REQUIREMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__IS_STABLE = REQUIREMENT__IS_STABLE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__CREATION_DATE = REQUIREMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__MODIFICATION_DATE = REQUIREMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__REVISION = REQUIREMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__IS_VERIFIABLE = REQUIREMENT__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Consistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__IS_CONSISTENT = REQUIREMENT__IS_CONSISTENT;

	/**
	 * The feature id for the '<em><b>Is Formalizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__IS_FORMALIZABLE = REQUIREMENT__IS_FORMALIZABLE;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__REFINED_BY = REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Refined From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__REFINED_FROM = REQUIREMENT__REFINED_FROM;

	/**
	 * The feature id for the '<em><b>Coupled To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__COUPLED_TO = REQUIREMENT__COUPLED_TO;

	/**
	 * The feature id for the '<em><b>Copied From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__COPIED_FROM = REQUIREMENT__COPIED_FROM;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__DERIVED_FROM = REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Formalized As</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__FORMALIZED_AS = REQUIREMENT__FORMALIZED_AS;

	/**
	 * The feature id for the '<em><b>Precludes CFC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Describes Design Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Describes Verification Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>High Level Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Only One Requirement Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>ID Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Rationale Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Nested Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>If Copy Text Is Read Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Property Based Statement Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP = REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Formalization Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Trace Dependency Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___TRACE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Derived HLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___DERIVED_HLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Design Detail Requires Rationale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___DESIGN_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Verification Detail Requires Rationale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___VERIFICATION_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Copy An SRATS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___COPY_AN_SRATS__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Coupled With Another HLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_HLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Derive An HLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___DERIVE_AN_HLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Refine An SRATS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT___REFINE_AN_SRATS__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>High Level Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.LowLevelRequirementImpl <em>Low Level Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.LowLevelRequirementImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getLowLevelRequirement()
	 * @generated
	 */
	int LOW_LEVEL_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__BASE_CLASS = REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__TYPE = REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__SOURCE = REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__IS_DERIVED = REQUIREMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__IS_STABLE = REQUIREMENT__IS_STABLE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__CREATION_DATE = REQUIREMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__MODIFICATION_DATE = REQUIREMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__REVISION = REQUIREMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__IS_VERIFIABLE = REQUIREMENT__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Consistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__IS_CONSISTENT = REQUIREMENT__IS_CONSISTENT;

	/**
	 * The feature id for the '<em><b>Is Formalizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__IS_FORMALIZABLE = REQUIREMENT__IS_FORMALIZABLE;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__REFINED_BY = REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Refined From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__REFINED_FROM = REQUIREMENT__REFINED_FROM;

	/**
	 * The feature id for the '<em><b>Coupled To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__COUPLED_TO = REQUIREMENT__COUPLED_TO;

	/**
	 * The feature id for the '<em><b>Copied From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__COPIED_FROM = REQUIREMENT__COPIED_FROM;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__DERIVED_FROM = REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Formalized As</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT__FORMALIZED_AS = REQUIREMENT__FORMALIZED_AS;

	/**
	 * The number of structural features of the '<em>Low Level Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One Requirement Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>ID Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Rationale Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Nested Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Owned Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>If Copy Text Is Read Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Property Based Statement Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP = REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Formalization Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Refine Dependency Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___REFINE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Derived LLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___DERIVED_LLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Coupled With Another LLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_LLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Derive An LLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___DERIVE_AN_LLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Refine An HLR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT___REFINE_AN_HLR__DIAGNOSTICCHAIN_MAP = REQUIREMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Low Level Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.TraceImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 5;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.CoupledImpl <em>Coupled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.CoupledImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCoupled()
	 * @generated
	 */
	int COUPLED = 4;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED__BASE_DEPENDENCY = TRACE__BASE_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>Coupled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Coupled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.RefineReqtImpl <em>Refine Reqt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.RefineReqtImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRefineReqt()
	 * @generated
	 */
	int REFINE_REQT = 6;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT__BASE_DEPENDENCY = TRACE__BASE_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>Refine Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Client Is Not ADerived Requirement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT___CLIENT_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP = TRACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Supplier Is Not ADerived Requirement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT___SUPPLIER_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP = TRACE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refine Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REQT_OPERATION_COUNT = TRACE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.CopyImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 7;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__BASE_DEPENDENCY = TRACE__BASE_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>HLR Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___HLR_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.DeriveImpl <em>Derive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.DeriveImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getDerive()
	 * @generated
	 */
	int DERIVE = 8;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__BASE_DEPENDENCY = TRACE__BASE_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>Derive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Derived Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE___DERIVED_REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Derive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl <em>Property Based Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getPropertyBasedStatement()
	 * @generated
	 */
	int PROPERTY_BASED_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__BASE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__PREDICATE = 4;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Formalization For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR = 6;

	/**
	 * The number of structural features of the '<em>Property Based Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>No Nested Classifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>No Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>No Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>No Owned Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>No Owned Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>No Other Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___NO_OTHER_STEREOTYPE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>ID Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Constraint Block Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT___CONSTRAINT_BLOCK_SUPPLIER__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Property Based Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_STATEMENT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.TimedDomainImpl <em>Timed Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.TimedDomainImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedDomain()
	 * @generated
	 */
	int TIMED_DOMAIN = 10;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DOMAIN__BASE_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Timed Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timed Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.TimedEventImpl <em>Timed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.TimedEventImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedEvent()
	 * @generated
	 */
	int TIMED_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__REPETITION = 0;

	/**
	 * The feature id for the '<em><b>Every</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__EVERY = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Timed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Applied On Property Based Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Timed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.TimedDurationConstraintImpl <em>Timed Duration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.TimedDurationConstraintImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedDurationConstraint()
	 * @generated
	 */
	int TIMED_DURATION_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT__BASE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT__KIND = 1;

	/**
	 * The number of structural features of the '<em>Timed Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Timed Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.TimedInstantObservationImpl <em>Timed Instant Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.TimedInstantObservationImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedInstantObservation()
	 * @generated
	 */
	int TIMED_INSTANT_OBSERVATION = 13;

	/**
	 * The feature id for the '<em><b>Obs Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION__OBS_KIND = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Timed Instant Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Applied On Property Based Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Timed Instant Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.FormalizationImpl <em>Formalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.FormalizationImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getFormalization()
	 * @generated
	 */
	int FORMALIZATION = 14;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Formalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Requirement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Formalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.ConditionImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Property Based Statement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.PredicateImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 16;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Property Based Statement Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Dependency Client Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.SpecImpl <em>Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.SpecImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSpec()
	 * @generated
	 */
	int SPEC = 17;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.DataImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getData()
	 * @generated
	 */
	int DATA = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Creation Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREATION_NOTES = 4;

	/**
	 * The feature id for the '<em><b>Maintenance Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MAINTENANCE_NOTES = 5;

	/**
	 * The feature id for the '<em><b>Usage Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__USAGE_NOTES = 6;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MODIFICATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REVISION = 9;

	/**
	 * The feature id for the '<em><b>Other Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OTHER_METADATA = 10;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.DataAttributeImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getDataAttribute()
	 * @generated
	 */
	int DATA_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.FieldDataImpl <em>Field Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.FieldDataImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getFieldData()
	 * @generated
	 */
	int FIELD_DATA = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__RATIONALE = DATA__RATIONALE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__DISPLAY_NAME = DATA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__SOURCE = DATA__SOURCE;

	/**
	 * The feature id for the '<em><b>Creation Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__CREATION_NOTES = DATA__CREATION_NOTES;

	/**
	 * The feature id for the '<em><b>Maintenance Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__MAINTENANCE_NOTES = DATA__MAINTENANCE_NOTES;

	/**
	 * The feature id for the '<em><b>Usage Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__USAGE_NOTES = DATA__USAGE_NOTES;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__MODIFICATION_DATE = DATA__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__REVISION = DATA__REVISION;

	/**
	 * The feature id for the '<em><b>Other Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__OTHER_METADATA = DATA__OTHER_METADATA;

	/**
	 * The feature id for the '<em><b>Possible Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__POSSIBLE_VALUES = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__FORMAT = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__LENGTH = DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__DEFAULT_VALUE = DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__IS_REQUIRED = DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__IS_READ_ONLY = DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__IS_UNIQUE = DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__ENCODING = DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA__BASE_PROPERTY = DATA_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Field Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Field Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.impl.EntityDataImpl <em>Entity Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.impl.EntityDataImpl
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getEntityData()
	 * @generated
	 */
	int ENTITY_DATA = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__RATIONALE = DATA__RATIONALE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__DISPLAY_NAME = DATA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__SOURCE = DATA__SOURCE;

	/**
	 * The feature id for the '<em><b>Creation Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__CREATION_NOTES = DATA__CREATION_NOTES;

	/**
	 * The feature id for the '<em><b>Maintenance Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__MAINTENANCE_NOTES = DATA__MAINTENANCE_NOTES;

	/**
	 * The feature id for the '<em><b>Usage Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__USAGE_NOTES = DATA__USAGE_NOTES;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__MODIFICATION_DATE = DATA__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__REVISION = DATA__REVISION;

	/**
	 * The feature id for the '<em><b>Other Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__OTHER_METADATA = DATA__OTHER_METADATA;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA__BASE_CLASS = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.RequirementType <em>Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.RequirementType
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 22;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.Source <em>Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.Source
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 23;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.RequirementStatus <em>Requirement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.RequirementStatus
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirementStatus()
	 * @generated
	 */
	int REQUIREMENT_STATUS = 24;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.ConstraintKind <em>Constraint Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.ConstraintKind
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getConstraintKind()
	 * @generated
	 */
	int CONSTRAINT_KIND = 25;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.specml.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.specml.EventKind
	 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 26;


	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ca.ets.sofeess.specml.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Requirement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getBase_Class()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getText()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Text();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ets.sofeess.specml.Requirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getSource()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Source();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#isDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#isDerived()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#isStable <em>Is Stable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stable</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#isStable()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsStable();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getCreationDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getModificationDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getRevision()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Revision();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Status();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#isVerifiable <em>Is Verifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Verifiable</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#isVerifiable()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsVerifiable();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#isConsistent <em>Is Consistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Consistent</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#isConsistent()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsConsistent();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Requirement#isFormalizable <em>Is Formalizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Formalizable</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#isFormalizable()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsFormalizable();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.Requirement#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getRefinedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.Requirement#getRefinedFrom <em>Refined From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined From</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getRefinedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RefinedFrom();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.Requirement#getCoupledTo <em>Coupled To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coupled To</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getCoupledTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_CoupledTo();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.Requirement#getCopiedFrom <em>Copied From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Copied From</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getCopiedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_CopiedFrom();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.Requirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getDerivedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DerivedFrom();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ets.sofeess.specml.Requirement#getFormalizedAs <em>Formalized As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formalized As</em>'.
	 * @see ca.ets.sofeess.specml.Requirement#getFormalizedAs()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_FormalizedAs();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#OnlyOneRequirementSubtype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Requirement Subtype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Requirement Subtype</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#OnlyOneRequirementSubtype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__OnlyOneRequirementSubtype__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#IDMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>ID Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ID Must Be Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#IDMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__IDMustBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#RationaleIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rationale Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rationale Is Required</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#RationaleIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__RationaleIsRequired__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#NoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Nested Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Nested Classifiers</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#NoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__NoNestedClassifiers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#NoAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Associations</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#NoAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__NoAssociations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#NoGeneralizations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Generalizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Generalizations</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#NoGeneralizations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__NoGeneralizations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#NoOwnedAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Owned Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Owned Attributes</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#NoOwnedAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__NoOwnedAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#NoOwnedOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Owned Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Owned Operations</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#NoOwnedOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__NoOwnedOperations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#IfCopyTextIsReadOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>If Copy Text Is Read Only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>If Copy Text Is Read Only</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#IfCopyTextIsReadOnly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__IfCopyTextIsReadOnly__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#PropertyBasedStatementSupplier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Property Based Statement Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Property Based Statement Supplier</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#PropertyBasedStatementSupplier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__PropertyBasedStatementSupplier__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Requirement#RequirementFormalizationIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Requirement Formalization Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Formalization Is Required</em>' operation.
	 * @see ca.ets.sofeess.specml.Requirement#RequirementFormalizationIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirement__RequirementFormalizationIsRequired__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Requirement</em>'.
	 * @see ca.ets.sofeess.specml.SystemRequirement
	 * @generated
	 */
	EClass getSystemRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.SystemRequirement#isAllocatedToSoftware <em>Allocated To Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocated To Software</em>'.
	 * @see ca.ets.sofeess.specml.SystemRequirement#isAllocatedToSoftware()
	 * @see #getSystemRequirement()
	 * @generated
	 */
	EAttribute getSystemRequirement_AllocatedToSoftware();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.SystemRequirement#CoupledWithAnotherSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coupled With Another SRATS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Coupled With Another SRATS</em>' operation.
	 * @see ca.ets.sofeess.specml.SystemRequirement#CoupledWithAnotherSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystemRequirement__CoupledWithAnotherSRATS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.HighLevelRequirement <em>High Level Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level Requirement</em>'.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement
	 * @generated
	 */
	EClass getHighLevelRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.HighLevelRequirement#isPrecludesCFC <em>Precludes CFC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precludes CFC</em>'.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#isPrecludesCFC()
	 * @see #getHighLevelRequirement()
	 * @generated
	 */
	EAttribute getHighLevelRequirement_PrecludesCFC();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesDesignDetail <em>Describes Design Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Describes Design Detail</em>'.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#isDescribesDesignDetail()
	 * @see #getHighLevelRequirement()
	 * @generated
	 */
	EAttribute getHighLevelRequirement_DescribesDesignDetail();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.HighLevelRequirement#isDescribesVerificationDetail <em>Describes Verification Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Describes Verification Detail</em>'.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#isDescribesVerificationDetail()
	 * @see #getHighLevelRequirement()
	 * @generated
	 */
	EAttribute getHighLevelRequirement_DescribesVerificationDetail();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#TraceDependencyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Trace Dependency Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trace Dependency Is Required</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#TraceDependencyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__TraceDependencyIsRequired__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#DerivedHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived HLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derived HLR</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#DerivedHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__DerivedHLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#DesignDetailRequiresRationale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Design Detail Requires Rationale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Design Detail Requires Rationale</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#DesignDetailRequiresRationale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__DesignDetailRequiresRationale__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#VerificationDetailRequiresRationale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Verification Detail Requires Rationale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verification Detail Requires Rationale</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#VerificationDetailRequiresRationale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__VerificationDetailRequiresRationale__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#CopyAnSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Copy An SRATS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy An SRATS</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#CopyAnSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__CopyAnSRATS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#CoupledWithAnotherHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coupled With Another HLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Coupled With Another HLR</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#CoupledWithAnotherHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__CoupledWithAnotherHLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#DeriveAnHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derive An HLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derive An HLR</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#DeriveAnHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__DeriveAnHLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.HighLevelRequirement#RefineAnSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Refine An SRATS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refine An SRATS</em>' operation.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement#RefineAnSRATS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHighLevelRequirement__RefineAnSRATS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.LowLevelRequirement <em>Low Level Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Level Requirement</em>'.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement
	 * @generated
	 */
	EClass getLowLevelRequirement();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.LowLevelRequirement#RefineDependencyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Refine Dependency Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refine Dependency Is Required</em>' operation.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement#RefineDependencyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLowLevelRequirement__RefineDependencyIsRequired__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.LowLevelRequirement#DerivedLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived LLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derived LLR</em>' operation.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement#DerivedLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLowLevelRequirement__DerivedLLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.LowLevelRequirement#CoupledWithAnotherLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coupled With Another LLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Coupled With Another LLR</em>' operation.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement#CoupledWithAnotherLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLowLevelRequirement__CoupledWithAnotherLLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.LowLevelRequirement#DeriveAnLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derive An LLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derive An LLR</em>' operation.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement#DeriveAnLLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLowLevelRequirement__DeriveAnLLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.LowLevelRequirement#RefineAnHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Refine An HLR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refine An HLR</em>' operation.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement#RefineAnHLR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLowLevelRequirement__RefineAnHLR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Coupled <em>Coupled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled</em>'.
	 * @see ca.ets.sofeess.specml.Coupled
	 * @generated
	 */
	EClass getCoupled();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see ca.ets.sofeess.specml.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Trace#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ca.ets.sofeess.specml.Trace#getBase_Dependency()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Base_Dependency();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Trace#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Client Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Client Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Trace#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrace__DependencyClientIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Trace#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Supplier Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Trace#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrace__DependencySupplierIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Trace#RequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Requirement Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Trace#RequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrace__RequirementClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.RefineReqt <em>Refine Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine Reqt</em>'.
	 * @see ca.ets.sofeess.specml.RefineReqt
	 * @generated
	 */
	EClass getRefineReqt();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.RefineReqt#ClientIsNotADerivedRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Client Is Not ADerived Requirement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client Is Not ADerived Requirement</em>' operation.
	 * @see ca.ets.sofeess.specml.RefineReqt#ClientIsNotADerivedRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRefineReqt__ClientIsNotADerivedRequirement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.RefineReqt#SupplierIsNotADerivedRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Supplier Is Not ADerived Requirement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supplier Is Not ADerived Requirement</em>' operation.
	 * @see ca.ets.sofeess.specml.RefineReqt#SupplierIsNotADerivedRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRefineReqt__SupplierIsNotADerivedRequirement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see ca.ets.sofeess.specml.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Copy#HLRClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>HLR Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>HLR Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Copy#HLRClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCopy__HLRClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Derive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive</em>'.
	 * @see ca.ets.sofeess.specml.Derive
	 * @generated
	 */
	EClass getDerive();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Derive#DerivedRequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Derived Requirement Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derived Requirement Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Derive#DerivedRequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDerive__DerivedRequirementClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.PropertyBasedStatement <em>Property Based Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Based Statement</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement
	 * @generated
	 */
	EClass getPropertyBasedStatement();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getId()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EAttribute getPropertyBasedStatement_Id();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getText()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EAttribute getPropertyBasedStatement_Text();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getBase_Class()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EReference getPropertyBasedStatement_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getCondition()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EAttribute getPropertyBasedStatement_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getPredicate()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EAttribute getPropertyBasedStatement_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getStatement()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EAttribute getPropertyBasedStatement_Statement();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.specml.PropertyBasedStatement#getFormalizationFor <em>Formalization For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formalization For</em>'.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#getFormalizationFor()
	 * @see #getPropertyBasedStatement()
	 * @generated
	 */
	EReference getPropertyBasedStatement_FormalizationFor();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Nested Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Nested Classifiers</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoNestedClassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoNestedClassifiers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Associations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Associations</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoAssociations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoAssociations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoGeneralizations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Generalizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Generalizations</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoGeneralizations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoGeneralizations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoOwnedAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Owned Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Owned Attributes</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoOwnedAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoOwnedAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoOwnedOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Owned Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Owned Operations</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoOwnedOperations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoOwnedOperations__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#NoOtherStereotype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Other Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Other Stereotype</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#NoOtherStereotype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__NoOtherStereotype__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#IDMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>ID Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ID Must Be Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#IDMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__IDMustBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.PropertyBasedStatement#ConstraintBlockSupplier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Block Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Block Supplier</em>' operation.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement#ConstraintBlockSupplier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPropertyBasedStatement__ConstraintBlockSupplier__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.TimedDomain <em>Timed Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Domain</em>'.
	 * @see ca.ets.sofeess.specml.TimedDomain
	 * @generated
	 */
	EClass getTimedDomain();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.TimedDomain#getBase_Namespace <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see ca.ets.sofeess.specml.TimedDomain#getBase_Namespace()
	 * @see #getTimedDomain()
	 * @generated
	 */
	EReference getTimedDomain_Base_Namespace();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.TimedEvent <em>Timed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Event</em>'.
	 * @see ca.ets.sofeess.specml.TimedEvent
	 * @generated
	 */
	EClass getTimedEvent();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.TimedEvent#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition</em>'.
	 * @see ca.ets.sofeess.specml.TimedEvent#getRepetition()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EAttribute getTimedEvent_Repetition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.TimedEvent#getEvery <em>Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Every</em>'.
	 * @see ca.ets.sofeess.specml.TimedEvent#getEvery()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EAttribute getTimedEvent_Every();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.TimedEvent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ca.ets.sofeess.specml.TimedEvent#getBase_Class()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EReference getTimedEvent_Base_Class();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.TimedEvent#AppliedOnPropertyBasedStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applied On Property Based Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applied On Property Based Statement</em>' operation.
	 * @see ca.ets.sofeess.specml.TimedEvent#AppliedOnPropertyBasedStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimedEvent__AppliedOnPropertyBasedStatement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.TimedEvent#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained In Timed Domain Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * @see ca.ets.sofeess.specml.TimedEvent#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimedEvent__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.TimedDurationConstraint <em>Timed Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Duration Constraint</em>'.
	 * @see ca.ets.sofeess.specml.TimedDurationConstraint
	 * @generated
	 */
	EClass getTimedDurationConstraint();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.TimedDurationConstraint#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see ca.ets.sofeess.specml.TimedDurationConstraint#getBase_Constraint()
	 * @see #getTimedDurationConstraint()
	 * @generated
	 */
	EReference getTimedDurationConstraint_Base_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.TimedDurationConstraint#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ca.ets.sofeess.specml.TimedDurationConstraint#getKind()
	 * @see #getTimedDurationConstraint()
	 * @generated
	 */
	EAttribute getTimedDurationConstraint_Kind();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.TimedDurationConstraint#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained In Timed Domain Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * @see ca.ets.sofeess.specml.TimedDurationConstraint#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimedDurationConstraint__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.TimedInstantObservation <em>Timed Instant Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Instant Observation</em>'.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation
	 * @generated
	 */
	EClass getTimedInstantObservation();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.TimedInstantObservation#getObsKind <em>Obs Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obs Kind</em>'.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation#getObsKind()
	 * @see #getTimedInstantObservation()
	 * @generated
	 */
	EAttribute getTimedInstantObservation_ObsKind();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.TimedInstantObservation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation#getBase_Class()
	 * @see #getTimedInstantObservation()
	 * @generated
	 */
	EReference getTimedInstantObservation_Base_Class();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.TimedInstantObservation#AppliedOnPropertyBasedStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applied On Property Based Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applied On Property Based Statement</em>' operation.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation#AppliedOnPropertyBasedStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimedInstantObservation__AppliedOnPropertyBasedStatement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.TimedInstantObservation#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained In Timed Domain Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained In Timed Domain Namespace</em>' operation.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation#ContainedInTimedDomainNamespace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimedInstantObservation__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Formalization <em>Formalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formalization</em>'.
	 * @see ca.ets.sofeess.specml.Formalization
	 * @generated
	 */
	EClass getFormalization();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Formalization#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ca.ets.sofeess.specml.Formalization#getBase_Dependency()
	 * @see #getFormalization()
	 * @generated
	 */
	EReference getFormalization_Base_Dependency();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Formalization#RequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Requirement Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Formalization#RequirementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormalization__RequirementClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Formalization#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Supplier Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Formalization#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormalization__DependencySupplierIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Formalization#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Client Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Client Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Formalization#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormalization__DependencyClientIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ca.ets.sofeess.specml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Condition#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ca.ets.sofeess.specml.Condition#getBase_Dependency()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Base_Dependency();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Condition#PropertyBasedStatementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Property Based Statement Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Property Based Statement Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Condition#PropertyBasedStatementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondition__PropertyBasedStatementClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Condition#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Supplier Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Condition#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondition__DependencySupplierIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Condition#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Client Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Client Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Condition#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondition__DependencyClientIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see ca.ets.sofeess.specml.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Predicate#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ca.ets.sofeess.specml.Predicate#getBase_Dependency()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Base_Dependency();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Predicate#PropertyBasedStatementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Property Based Statement Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Property Based Statement Client</em>' operation.
	 * @see ca.ets.sofeess.specml.Predicate#PropertyBasedStatementClient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPredicate__PropertyBasedStatementClient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Predicate#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Supplier Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Supplier Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Predicate#DependencySupplierIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPredicate__DependencySupplierIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ca.ets.sofeess.specml.Predicate#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dependency Client Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dependency Client Is Unique</em>' operation.
	 * @see ca.ets.sofeess.specml.Predicate#DependencyClientIsUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPredicate__DependencyClientIsUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Spec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec</em>'.
	 * @see ca.ets.sofeess.specml.Spec
	 * @generated
	 */
	EClass getSpec();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.Spec#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see ca.ets.sofeess.specml.Spec#getBase_Package()
	 * @see #getSpec()
	 * @generated
	 */
	EReference getSpec_Base_Package();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see ca.ets.sofeess.specml.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.ets.sofeess.specml.Data#getDescription()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see ca.ets.sofeess.specml.Data#getRationale()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see ca.ets.sofeess.specml.Data#getDisplayName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DisplayName();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ets.sofeess.specml.Data#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see ca.ets.sofeess.specml.Data#getSource()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Source();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getCreationNotes <em>Creation Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Notes</em>'.
	 * @see ca.ets.sofeess.specml.Data#getCreationNotes()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_CreationNotes();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getMaintenanceNotes <em>Maintenance Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintenance Notes</em>'.
	 * @see ca.ets.sofeess.specml.Data#getMaintenanceNotes()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_MaintenanceNotes();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getUsageNotes <em>Usage Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Notes</em>'.
	 * @see ca.ets.sofeess.specml.Data#getUsageNotes()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_UsageNotes();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see ca.ets.sofeess.specml.Data#getCreationDate()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see ca.ets.sofeess.specml.Data#getModificationDate()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.Data#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ca.ets.sofeess.specml.Data#getRevision()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Revision();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.specml.Data#getOtherMetadata <em>Other Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Metadata</em>'.
	 * @see ca.ets.sofeess.specml.Data#getOtherMetadata()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_OtherMetadata();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Attribute</em>'.
	 * @see ca.ets.sofeess.specml.DataAttribute
	 * @generated
	 */
	EClass getDataAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.DataAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.ets.sofeess.specml.DataAttribute#getName()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EAttribute getDataAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.DataAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ca.ets.sofeess.specml.DataAttribute#getValue()
	 * @see #getDataAttribute()
	 * @generated
	 */
	EAttribute getDataAttribute_Value();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.FieldData <em>Field Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Data</em>'.
	 * @see ca.ets.sofeess.specml.FieldData
	 * @generated
	 */
	EClass getFieldData();

	/**
	 * Returns the meta object for the attribute list '{@link ca.ets.sofeess.specml.FieldData#getPossibleValues <em>Possible Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Possible Values</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getPossibleValues()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_PossibleValues();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getFormat()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_Format();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getLength()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_Length();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getDefaultValue()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#isRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#isRequired()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#isReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#isReadOnly()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#isUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#isUnique()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.specml.FieldData#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getEncoding()
	 * @see #getFieldData()
	 * @generated
	 */
	EAttribute getFieldData_Encoding();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.FieldData#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ca.ets.sofeess.specml.FieldData#getBase_Property()
	 * @see #getFieldData()
	 * @generated
	 */
	EReference getFieldData_Base_Property();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.specml.EntityData <em>Entity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Data</em>'.
	 * @see ca.ets.sofeess.specml.EntityData
	 * @generated
	 */
	EClass getEntityData();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.specml.EntityData#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ca.ets.sofeess.specml.EntityData#getBase_Class()
	 * @see #getEntityData()
	 * @generated
	 */
	EReference getEntityData_Base_Class();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.specml.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Type</em>'.
	 * @see ca.ets.sofeess.specml.RequirementType
	 * @generated
	 */
	EEnum getRequirementType();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.specml.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source</em>'.
	 * @see ca.ets.sofeess.specml.Source
	 * @generated
	 */
	EEnum getSource();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.specml.RequirementStatus <em>Requirement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Status</em>'.
	 * @see ca.ets.sofeess.specml.RequirementStatus
	 * @generated
	 */
	EEnum getRequirementStatus();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.specml.ConstraintKind <em>Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Kind</em>'.
	 * @see ca.ets.sofeess.specml.ConstraintKind
	 * @generated
	 */
	EEnum getConstraintKind();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.specml.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see ca.ets.sofeess.specml.EventKind
	 * @generated
	 */
	EEnum getEventKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.RequirementImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__BASE_CLASS = eINSTANCE.getRequirement_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TEXT = eINSTANCE.getRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SOURCE = eINSTANCE.getRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_DERIVED = eINSTANCE.getRequirement_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Stable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_STABLE = eINSTANCE.getRequirement_IsStable();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATION_DATE = eINSTANCE.getRequirement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MODIFICATION_DATE = eINSTANCE.getRequirement_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REVISION = eINSTANCE.getRequirement_Revision();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATUS = eINSTANCE.getRequirement_Status();

		/**
		 * The meta object literal for the '<em><b>Is Verifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_VERIFIABLE = eINSTANCE.getRequirement_IsVerifiable();

		/**
		 * The meta object literal for the '<em><b>Is Consistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_CONSISTENT = eINSTANCE.getRequirement_IsConsistent();

		/**
		 * The meta object literal for the '<em><b>Is Formalizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_FORMALIZABLE = eINSTANCE.getRequirement_IsFormalizable();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFINED_BY = eINSTANCE.getRequirement_RefinedBy();

		/**
		 * The meta object literal for the '<em><b>Refined From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFINED_FROM = eINSTANCE.getRequirement_RefinedFrom();

		/**
		 * The meta object literal for the '<em><b>Coupled To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COUPLED_TO = eINSTANCE.getRequirement_CoupledTo();

		/**
		 * The meta object literal for the '<em><b>Copied From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COPIED_FROM = eINSTANCE.getRequirement_CopiedFrom();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED_FROM = eINSTANCE.getRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Formalized As</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__FORMALIZED_AS = eINSTANCE.getRequirement_FormalizedAs();

		/**
		 * The meta object literal for the '<em><b>Only One Requirement Subtype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__OnlyOneRequirementSubtype__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>ID Must Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__IDMustBeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Rationale Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__RationaleIsRequired__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Nested Classifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__NoNestedClassifiers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Associations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__NoAssociations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Generalizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__NoGeneralizations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Owned Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__NoOwnedAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Owned Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__NoOwnedOperations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>If Copy Text Is Read Only</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__IfCopyTextIsReadOnly__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Property Based Statement Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__PropertyBasedStatementSupplier__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Requirement Formalization Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirement__RequirementFormalizationIsRequired__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.SystemRequirementImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSystemRequirement()
		 * @generated
		 */
		EClass SYSTEM_REQUIREMENT = eINSTANCE.getSystemRequirement();

		/**
		 * The meta object literal for the '<em><b>Allocated To Software</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REQUIREMENT__ALLOCATED_TO_SOFTWARE = eINSTANCE.getSystemRequirement_AllocatedToSoftware();

		/**
		 * The meta object literal for the '<em><b>Coupled With Another SRATS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM_REQUIREMENT___COUPLED_WITH_ANOTHER_SRATS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSystemRequirement__CoupledWithAnotherSRATS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.HighLevelRequirementImpl <em>High Level Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.HighLevelRequirementImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getHighLevelRequirement()
		 * @generated
		 */
		EClass HIGH_LEVEL_REQUIREMENT = eINSTANCE.getHighLevelRequirement();

		/**
		 * The meta object literal for the '<em><b>Precludes CFC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC = eINSTANCE.getHighLevelRequirement_PrecludesCFC();

		/**
		 * The meta object literal for the '<em><b>Describes Design Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL = eINSTANCE.getHighLevelRequirement_DescribesDesignDetail();

		/**
		 * The meta object literal for the '<em><b>Describes Verification Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL = eINSTANCE.getHighLevelRequirement_DescribesVerificationDetail();

		/**
		 * The meta object literal for the '<em><b>Trace Dependency Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___TRACE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__TraceDependencyIsRequired__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Derived HLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___DERIVED_HLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__DerivedHLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Design Detail Requires Rationale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___DESIGN_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__DesignDetailRequiresRationale__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Verification Detail Requires Rationale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___VERIFICATION_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__VerificationDetailRequiresRationale__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Copy An SRATS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___COPY_AN_SRATS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__CopyAnSRATS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Coupled With Another HLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_HLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__CoupledWithAnotherHLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Derive An HLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___DERIVE_AN_HLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__DeriveAnHLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Refine An SRATS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIGH_LEVEL_REQUIREMENT___REFINE_AN_SRATS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHighLevelRequirement__RefineAnSRATS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.LowLevelRequirementImpl <em>Low Level Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.LowLevelRequirementImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getLowLevelRequirement()
		 * @generated
		 */
		EClass LOW_LEVEL_REQUIREMENT = eINSTANCE.getLowLevelRequirement();

		/**
		 * The meta object literal for the '<em><b>Refine Dependency Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOW_LEVEL_REQUIREMENT___REFINE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLowLevelRequirement__RefineDependencyIsRequired__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Derived LLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOW_LEVEL_REQUIREMENT___DERIVED_LLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLowLevelRequirement__DerivedLLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Coupled With Another LLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOW_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_LLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLowLevelRequirement__CoupledWithAnotherLLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Derive An LLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOW_LEVEL_REQUIREMENT___DERIVE_AN_LLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLowLevelRequirement__DeriveAnLLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Refine An HLR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOW_LEVEL_REQUIREMENT___REFINE_AN_HLR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLowLevelRequirement__RefineAnHLR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.CoupledImpl <em>Coupled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.CoupledImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCoupled()
		 * @generated
		 */
		EClass COUPLED = eINSTANCE.getCoupled();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.TraceImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__BASE_DEPENDENCY = eINSTANCE.getTrace_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Dependency Client Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrace__DependencyClientIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Supplier Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrace__DependencySupplierIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Requirement Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrace__RequirementClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.RefineReqtImpl <em>Refine Reqt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.RefineReqtImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRefineReqt()
		 * @generated
		 */
		EClass REFINE_REQT = eINSTANCE.getRefineReqt();

		/**
		 * The meta object literal for the '<em><b>Client Is Not ADerived Requirement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFINE_REQT___CLIENT_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRefineReqt__ClientIsNotADerivedRequirement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Supplier Is Not ADerived Requirement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFINE_REQT___SUPPLIER_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRefineReqt__SupplierIsNotADerivedRequirement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.CopyImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>HLR Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COPY___HLR_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCopy__HLRClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.DeriveImpl <em>Derive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.DeriveImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getDerive()
		 * @generated
		 */
		EClass DERIVE = eINSTANCE.getDerive();

		/**
		 * The meta object literal for the '<em><b>Derived Requirement Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DERIVE___DERIVED_REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDerive__DerivedRequirementClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl <em>Property Based Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getPropertyBasedStatement()
		 * @generated
		 */
		EClass PROPERTY_BASED_STATEMENT = eINSTANCE.getPropertyBasedStatement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_STATEMENT__ID = eINSTANCE.getPropertyBasedStatement_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_STATEMENT__TEXT = eINSTANCE.getPropertyBasedStatement_Text();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BASED_STATEMENT__BASE_CLASS = eINSTANCE.getPropertyBasedStatement_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_STATEMENT__CONDITION = eINSTANCE.getPropertyBasedStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_STATEMENT__PREDICATE = eINSTANCE.getPropertyBasedStatement_Predicate();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_STATEMENT__STATEMENT = eINSTANCE.getPropertyBasedStatement_Statement();

		/**
		 * The meta object literal for the '<em><b>Formalization For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR = eINSTANCE.getPropertyBasedStatement_FormalizationFor();

		/**
		 * The meta object literal for the '<em><b>No Nested Classifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoNestedClassifiers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Associations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoAssociations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Generalizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoGeneralizations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Owned Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoOwnedAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Owned Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoOwnedOperations__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Other Stereotype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___NO_OTHER_STEREOTYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__NoOtherStereotype__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>ID Must Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__IDMustBeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint Block Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_BASED_STATEMENT___CONSTRAINT_BLOCK_SUPPLIER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPropertyBasedStatement__ConstraintBlockSupplier__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.TimedDomainImpl <em>Timed Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.TimedDomainImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedDomain()
		 * @generated
		 */
		EClass TIMED_DOMAIN = eINSTANCE.getTimedDomain();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_DOMAIN__BASE_NAMESPACE = eINSTANCE.getTimedDomain_Base_Namespace();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.TimedEventImpl <em>Timed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.TimedEventImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedEvent()
		 * @generated
		 */
		EClass TIMED_EVENT = eINSTANCE.getTimedEvent();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_EVENT__REPETITION = eINSTANCE.getTimedEvent_Repetition();

		/**
		 * The meta object literal for the '<em><b>Every</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_EVENT__EVERY = eINSTANCE.getTimedEvent_Every();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_EVENT__BASE_CLASS = eINSTANCE.getTimedEvent_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Applied On Property Based Statement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMED_EVENT___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimedEvent__AppliedOnPropertyBasedStatement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Contained In Timed Domain Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMED_EVENT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimedEvent__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.TimedDurationConstraintImpl <em>Timed Duration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.TimedDurationConstraintImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedDurationConstraint()
		 * @generated
		 */
		EClass TIMED_DURATION_CONSTRAINT = eINSTANCE.getTimedDurationConstraint();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_DURATION_CONSTRAINT__BASE_CONSTRAINT = eINSTANCE.getTimedDurationConstraint_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_DURATION_CONSTRAINT__KIND = eINSTANCE.getTimedDurationConstraint_Kind();

		/**
		 * The meta object literal for the '<em><b>Contained In Timed Domain Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMED_DURATION_CONSTRAINT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimedDurationConstraint__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.TimedInstantObservationImpl <em>Timed Instant Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.TimedInstantObservationImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getTimedInstantObservation()
		 * @generated
		 */
		EClass TIMED_INSTANT_OBSERVATION = eINSTANCE.getTimedInstantObservation();

		/**
		 * The meta object literal for the '<em><b>Obs Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_INSTANT_OBSERVATION__OBS_KIND = eINSTANCE.getTimedInstantObservation_ObsKind();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_INSTANT_OBSERVATION__BASE_CLASS = eINSTANCE.getTimedInstantObservation_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Applied On Property Based Statement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMED_INSTANT_OBSERVATION___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimedInstantObservation__AppliedOnPropertyBasedStatement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Contained In Timed Domain Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMED_INSTANT_OBSERVATION___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimedInstantObservation__ContainedInTimedDomainNamespace__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.FormalizationImpl <em>Formalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.FormalizationImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getFormalization()
		 * @generated
		 */
		EClass FORMALIZATION = eINSTANCE.getFormalization();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMALIZATION__BASE_DEPENDENCY = eINSTANCE.getFormalization_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Requirement Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMALIZATION___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormalization__RequirementClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Supplier Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMALIZATION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormalization__DependencySupplierIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Client Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMALIZATION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormalization__DependencyClientIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.ConditionImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BASE_DEPENDENCY = eINSTANCE.getCondition_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Property Based Statement Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCondition__PropertyBasedStatementClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Supplier Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCondition__DependencySupplierIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Client Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCondition__DependencyClientIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.PredicateImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__BASE_DEPENDENCY = eINSTANCE.getPredicate_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Property Based Statement Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICATE___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPredicate__PropertyBasedStatementClient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Supplier Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICATE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPredicate__DependencySupplierIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dependency Client Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICATE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPredicate__DependencyClientIsUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.SpecImpl <em>Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.SpecImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSpec()
		 * @generated
		 */
		EClass SPEC = eINSTANCE.getSpec();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC__BASE_PACKAGE = eINSTANCE.getSpec_Base_Package();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.DataImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DESCRIPTION = eINSTANCE.getData_Description();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__RATIONALE = eINSTANCE.getData_Rationale();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DISPLAY_NAME = eINSTANCE.getData_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SOURCE = eINSTANCE.getData_Source();

		/**
		 * The meta object literal for the '<em><b>Creation Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CREATION_NOTES = eINSTANCE.getData_CreationNotes();

		/**
		 * The meta object literal for the '<em><b>Maintenance Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MAINTENANCE_NOTES = eINSTANCE.getData_MaintenanceNotes();

		/**
		 * The meta object literal for the '<em><b>Usage Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__USAGE_NOTES = eINSTANCE.getData_UsageNotes();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CREATION_DATE = eINSTANCE.getData_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MODIFICATION_DATE = eINSTANCE.getData_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__REVISION = eINSTANCE.getData_Revision();

		/**
		 * The meta object literal for the '<em><b>Other Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__OTHER_METADATA = eINSTANCE.getData_OtherMetadata();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.DataAttributeImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getDataAttribute()
		 * @generated
		 */
		EClass DATA_ATTRIBUTE = eINSTANCE.getDataAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__NAME = eINSTANCE.getDataAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ATTRIBUTE__VALUE = eINSTANCE.getDataAttribute_Value();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.FieldDataImpl <em>Field Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.FieldDataImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getFieldData()
		 * @generated
		 */
		EClass FIELD_DATA = eINSTANCE.getFieldData();

		/**
		 * The meta object literal for the '<em><b>Possible Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__POSSIBLE_VALUES = eINSTANCE.getFieldData_PossibleValues();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__FORMAT = eINSTANCE.getFieldData_Format();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__LENGTH = eINSTANCE.getFieldData_Length();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__DEFAULT_VALUE = eINSTANCE.getFieldData_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__IS_REQUIRED = eINSTANCE.getFieldData_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__IS_READ_ONLY = eINSTANCE.getFieldData_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__IS_UNIQUE = eINSTANCE.getFieldData_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DATA__ENCODING = eINSTANCE.getFieldData_Encoding();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DATA__BASE_PROPERTY = eINSTANCE.getFieldData_Base_Property();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.impl.EntityDataImpl <em>Entity Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.impl.EntityDataImpl
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getEntityData()
		 * @generated
		 */
		EClass ENTITY_DATA = eINSTANCE.getEntityData();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DATA__BASE_CLASS = eINSTANCE.getEntityData_Base_Class();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.RequirementType <em>Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.RequirementType
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirementType()
		 * @generated
		 */
		EEnum REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.Source <em>Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.Source
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getSource()
		 * @generated
		 */
		EEnum SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.RequirementStatus <em>Requirement Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.RequirementStatus
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getRequirementStatus()
		 * @generated
		 */
		EEnum REQUIREMENT_STATUS = eINSTANCE.getRequirementStatus();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.ConstraintKind <em>Constraint Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.ConstraintKind
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getConstraintKind()
		 * @generated
		 */
		EEnum CONSTRAINT_KIND = eINSTANCE.getConstraintKind();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.specml.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.specml.EventKind
		 * @see ca.ets.sofeess.specml.impl.SpecPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

	}

} //SpecPackage
