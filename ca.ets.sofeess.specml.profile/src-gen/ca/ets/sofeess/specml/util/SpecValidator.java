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
package ca.ets.sofeess.specml.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ca.ets.sofeess.specml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage
 * @generated
 */
public class SpecValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpecValidator INSTANCE = new SpecValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ca.ets.sofeess.specml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Requirement Subtype' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__ONLY_ONE_REQUIREMENT_SUBTYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ID Must Be Unique' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__ID_MUST_BE_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rationale Is Required' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__RATIONALE_IS_REQUIRED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Nested Classifiers' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__NO_NESTED_CLASSIFIERS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Associations' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__NO_ASSOCIATIONS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Generalizations' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__NO_GENERALIZATIONS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Owned Attributes' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__NO_OWNED_ATTRIBUTES = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Owned Operations' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__NO_OWNED_OPERATIONS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'If Copy Text Is Read Only' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__IF_COPY_TEXT_IS_READ_ONLY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Property Based Statement Supplier' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__PROPERTY_BASED_STATEMENT_SUPPLIER = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Requirement Formalization Is Required' of 'Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUIREMENT__REQUIREMENT_FORMALIZATION_IS_REQUIRED = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coupled With Another SRATS' of 'System Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_REQUIREMENT__COUPLED_WITH_ANOTHER_SRATS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Trace Dependency Is Required' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__TRACE_DEPENDENCY_IS_REQUIRED = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derived HLR' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__DERIVED_HLR = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Design Detail Requires Rationale' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__DESIGN_DETAIL_REQUIRES_RATIONALE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Verification Detail Requires Rationale' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__VERIFICATION_DETAIL_REQUIRES_RATIONALE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Copy An SRATS' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__COPY_AN_SRATS = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coupled With Another HLR' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__COUPLED_WITH_ANOTHER_HLR = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derive An HLR' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__DERIVE_AN_HLR = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Refine An SRATS' of 'High Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIGH_LEVEL_REQUIREMENT__REFINE_AN_SRATS = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Refine Dependency Is Required' of 'Low Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOW_LEVEL_REQUIREMENT__REFINE_DEPENDENCY_IS_REQUIRED = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derived LLR' of 'Low Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOW_LEVEL_REQUIREMENT__DERIVED_LLR = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coupled With Another LLR' of 'Low Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOW_LEVEL_REQUIREMENT__COUPLED_WITH_ANOTHER_LLR = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derive An LLR' of 'Low Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOW_LEVEL_REQUIREMENT__DERIVE_AN_LLR = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Refine An HLR' of 'Low Level Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOW_LEVEL_REQUIREMENT__REFINE_AN_HLR = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Client Is Unique' of 'Trace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRACE__DEPENDENCY_CLIENT_IS_UNIQUE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Supplier Is Unique' of 'Trace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRACE__DEPENDENCY_SUPPLIER_IS_UNIQUE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Requirement Client' of 'Trace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRACE__REQUIREMENT_CLIENT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Client Is Not ADerived Requirement' of 'Refine Reqt'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFINE_REQT__CLIENT_IS_NOT_ADERIVED_REQUIREMENT = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supplier Is Not ADerived Requirement' of 'Refine Reqt'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFINE_REQT__SUPPLIER_IS_NOT_ADERIVED_REQUIREMENT = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'HLR Client' of 'Copy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPY__HLR_CLIENT = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derived Requirement Client' of 'Derive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DERIVE__DERIVED_REQUIREMENT_CLIENT = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Nested Classifiers' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_NESTED_CLASSIFIERS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Associations' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_ASSOCIATIONS = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Generalizations' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_GENERALIZATIONS = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Owned Attributes' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_OWNED_ATTRIBUTES = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Owned Operations' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_OWNED_OPERATIONS = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Other Stereotype' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__NO_OTHER_STEREOTYPE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ID Must Be Unique' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__ID_MUST_BE_UNIQUE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint Block Supplier' of 'Property Based Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_BASED_STATEMENT__CONSTRAINT_BLOCK_SUPPLIER = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applied On Property Based Statement' of 'Timed Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIMED_EVENT__APPLIED_ON_PROPERTY_BASED_STATEMENT = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained In Timed Domain Namespace' of 'Timed Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIMED_EVENT__CONTAINED_IN_TIMED_DOMAIN_NAMESPACE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained In Timed Domain Namespace' of 'Timed Duration Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIMED_DURATION_CONSTRAINT__CONTAINED_IN_TIMED_DOMAIN_NAMESPACE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applied On Property Based Statement' of 'Timed Instant Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIMED_INSTANT_OBSERVATION__APPLIED_ON_PROPERTY_BASED_STATEMENT = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained In Timed Domain Namespace' of 'Timed Instant Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIMED_INSTANT_OBSERVATION__CONTAINED_IN_TIMED_DOMAIN_NAMESPACE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Requirement Client' of 'Formalization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMALIZATION__REQUIREMENT_CLIENT = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Supplier Is Unique' of 'Formalization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMALIZATION__DEPENDENCY_SUPPLIER_IS_UNIQUE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Client Is Unique' of 'Formalization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMALIZATION__DEPENDENCY_CLIENT_IS_UNIQUE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Property Based Statement Client' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__PROPERTY_BASED_STATEMENT_CLIENT = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Supplier Is Unique' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__DEPENDENCY_SUPPLIER_IS_UNIQUE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Client Is Unique' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__DEPENDENCY_CLIENT_IS_UNIQUE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Property Based Statement Client' of 'Predicate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREDICATE__PROPERTY_BASED_STATEMENT_CLIENT = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Supplier Is Unique' of 'Predicate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREDICATE__DEPENDENCY_SUPPLIER_IS_UNIQUE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dependency Client Is Unique' of 'Predicate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREDICATE__DEPENDENCY_CLIENT_IS_UNIQUE = 54;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 54;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SpecMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SpecMLPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case SpecMLPackage.SYSTEM_REQUIREMENT:
				return validateSystemRequirement((SystemRequirement)value, diagnostics, context);
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT:
				return validateHighLevelRequirement((HighLevelRequirement)value, diagnostics, context);
			case SpecMLPackage.LOW_LEVEL_REQUIREMENT:
				return validateLowLevelRequirement((LowLevelRequirement)value, diagnostics, context);
			case SpecMLPackage.COUPLED:
				return validateCoupled((Coupled)value, diagnostics, context);
			case SpecMLPackage.TRACE:
				return validateTrace((Trace)value, diagnostics, context);
			case SpecMLPackage.REFINE_REQT:
				return validateRefineReqt((RefineReqt)value, diagnostics, context);
			case SpecMLPackage.COPY:
				return validateCopy((Copy)value, diagnostics, context);
			case SpecMLPackage.DERIVE:
				return validateDerive((Derive)value, diagnostics, context);
			case SpecMLPackage.PROPERTY_BASED_STATEMENT:
				return validatePropertyBasedStatement((PropertyBasedStatement)value, diagnostics, context);
			case SpecMLPackage.TIMED_DOMAIN:
				return validateTimedDomain((TimedDomain)value, diagnostics, context);
			case SpecMLPackage.TIMED_EVENT:
				return validateTimedEvent((TimedEvent)value, diagnostics, context);
			case SpecMLPackage.TIMED_DURATION_CONSTRAINT:
				return validateTimedDurationConstraint((TimedDurationConstraint)value, diagnostics, context);
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION:
				return validateTimedInstantObservation((TimedInstantObservation)value, diagnostics, context);
			case SpecMLPackage.FORMALIZATION:
				return validateFormalization((Formalization)value, diagnostics, context);
			case SpecMLPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case SpecMLPackage.PREDICATE:
				return validatePredicate((Predicate)value, diagnostics, context);
			case SpecMLPackage.SPEC:
				return validateSpec((Spec)value, diagnostics, context);
			case SpecMLPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case SpecMLPackage.DATA_ATTRIBUTE:
				return validateDataAttribute((DataAttribute)value, diagnostics, context);
			case SpecMLPackage.FIELD_DATA:
				return validateFieldData((FieldData)value, diagnostics, context);
			case SpecMLPackage.ENTITY_DATA:
				return validateEntityData((EntityData)value, diagnostics, context);
			case SpecMLPackage.REQUIREMENT_TYPE:
				return validateRequirementType((RequirementType)value, diagnostics, context);
			case SpecMLPackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case SpecMLPackage.REQUIREMENT_STATUS:
				return validateRequirementStatus((RequirementStatus)value, diagnostics, context);
			case SpecMLPackage.CONSTRAINT_KIND:
				return validateConstraintKind((ConstraintKind)value, diagnostics, context);
			case SpecMLPackage.EVENT_KIND:
				return validateEventKind((EventKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_OnlyOneRequirementSubtype(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IDMustBeUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RationaleIsRequired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoNestedClassifiers(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoAssociations(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoGeneralizations(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedAttributes(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedOperations(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IfCopyTextIsReadOnly(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_PropertyBasedStatementSupplier(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RequirementFormalizationIsRequired(requirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyOneRequirementSubtype constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_OnlyOneRequirementSubtype(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.OnlyOneRequirementSubtype(diagnostics, context);
	}

	/**
	 * Validates the IDMustBeUnique constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_IDMustBeUnique(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.IDMustBeUnique(diagnostics, context);
	}

	/**
	 * Validates the RationaleIsRequired constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_RationaleIsRequired(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.RationaleIsRequired(diagnostics, context);
	}

	/**
	 * Validates the NoNestedClassifiers constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NoNestedClassifiers(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.NoNestedClassifiers(diagnostics, context);
	}

	/**
	 * Validates the NoAssociations constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NoAssociations(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.NoAssociations(diagnostics, context);
	}

	/**
	 * Validates the NoGeneralizations constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NoGeneralizations(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.NoGeneralizations(diagnostics, context);
	}

	/**
	 * Validates the NoOwnedAttributes constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NoOwnedAttributes(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.NoOwnedAttributes(diagnostics, context);
	}

	/**
	 * Validates the NoOwnedOperations constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_NoOwnedOperations(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.NoOwnedOperations(diagnostics, context);
	}

	/**
	 * Validates the IfCopyTextIsReadOnly constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_IfCopyTextIsReadOnly(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.IfCopyTextIsReadOnly(diagnostics, context);
	}

	/**
	 * Validates the PropertyBasedStatementSupplier constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_PropertyBasedStatementSupplier(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.PropertyBasedStatementSupplier(diagnostics, context);
	}

	/**
	 * Validates the RequirementFormalizationIsRequired constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_RequirementFormalizationIsRequired(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requirement.RequirementFormalizationIsRequired(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRequirement(SystemRequirement systemRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_OnlyOneRequirementSubtype(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IDMustBeUnique(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RationaleIsRequired(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoNestedClassifiers(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoAssociations(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoGeneralizations(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedAttributes(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedOperations(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IfCopyTextIsReadOnly(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_PropertyBasedStatementSupplier(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RequirementFormalizationIsRequired(systemRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemRequirement_CoupledWithAnotherSRATS(systemRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CoupledWithAnotherSRATS constraint of '<em>System Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRequirement_CoupledWithAnotherSRATS(SystemRequirement systemRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemRequirement.CoupledWithAnotherSRATS(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(highLevelRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_OnlyOneRequirementSubtype(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IDMustBeUnique(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RationaleIsRequired(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoNestedClassifiers(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoAssociations(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoGeneralizations(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedAttributes(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedOperations(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IfCopyTextIsReadOnly(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_PropertyBasedStatementSupplier(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RequirementFormalizationIsRequired(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_TraceDependencyIsRequired(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_DerivedHLR(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_DesignDetailRequiresRationale(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_VerificationDetailRequiresRationale(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_CopyAnSRATS(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_CoupledWithAnotherHLR(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_DeriveAnHLR(highLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateHighLevelRequirement_RefineAnSRATS(highLevelRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TraceDependencyIsRequired constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_TraceDependencyIsRequired(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.TraceDependencyIsRequired(diagnostics, context);
	}

	/**
	 * Validates the DerivedHLR constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_DerivedHLR(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.DerivedHLR(diagnostics, context);
	}

	/**
	 * Validates the DesignDetailRequiresRationale constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_DesignDetailRequiresRationale(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.DesignDetailRequiresRationale(diagnostics, context);
	}

	/**
	 * Validates the VerificationDetailRequiresRationale constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_VerificationDetailRequiresRationale(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.VerificationDetailRequiresRationale(diagnostics, context);
	}

	/**
	 * Validates the CopyAnSRATS constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_CopyAnSRATS(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.CopyAnSRATS(diagnostics, context);
	}

	/**
	 * Validates the CoupledWithAnotherHLR constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_CoupledWithAnotherHLR(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.CoupledWithAnotherHLR(diagnostics, context);
	}

	/**
	 * Validates the DeriveAnHLR constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_DeriveAnHLR(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.DeriveAnHLR(diagnostics, context);
	}

	/**
	 * Validates the RefineAnSRATS constraint of '<em>High Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighLevelRequirement_RefineAnSRATS(HighLevelRequirement highLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return highLevelRequirement.RefineAnSRATS(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lowLevelRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_OnlyOneRequirementSubtype(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IDMustBeUnique(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RationaleIsRequired(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoNestedClassifiers(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoAssociations(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoGeneralizations(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedAttributes(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_NoOwnedOperations(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_IfCopyTextIsReadOnly(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_PropertyBasedStatementSupplier(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_RequirementFormalizationIsRequired(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLowLevelRequirement_RefineDependencyIsRequired(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLowLevelRequirement_DerivedLLR(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLowLevelRequirement_CoupledWithAnotherLLR(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLowLevelRequirement_DeriveAnLLR(lowLevelRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLowLevelRequirement_RefineAnHLR(lowLevelRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RefineDependencyIsRequired constraint of '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement_RefineDependencyIsRequired(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lowLevelRequirement.RefineDependencyIsRequired(diagnostics, context);
	}

	/**
	 * Validates the DerivedLLR constraint of '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement_DerivedLLR(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lowLevelRequirement.DerivedLLR(diagnostics, context);
	}

	/**
	 * Validates the CoupledWithAnotherLLR constraint of '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement_CoupledWithAnotherLLR(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lowLevelRequirement.CoupledWithAnotherLLR(diagnostics, context);
	}

	/**
	 * Validates the DeriveAnLLR constraint of '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement_DeriveAnLLR(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lowLevelRequirement.DeriveAnLLR(diagnostics, context);
	}

	/**
	 * Validates the RefineAnHLR constraint of '<em>Low Level Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowLevelRequirement_RefineAnHLR(LowLevelRequirement lowLevelRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lowLevelRequirement.RefineAnHLR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoupled(Coupled coupled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coupled, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencyClientIsUnique(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencySupplierIsUnique(coupled, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_RequirementClient(coupled, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencyClientIsUnique(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencySupplierIsUnique(trace, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_RequirementClient(trace, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DependencyClientIsUnique constraint of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace_DependencyClientIsUnique(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trace.DependencyClientIsUnique(diagnostics, context);
	}

	/**
	 * Validates the DependencySupplierIsUnique constraint of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace_DependencySupplierIsUnique(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trace.DependencySupplierIsUnique(diagnostics, context);
	}

	/**
	 * Validates the RequirementClient constraint of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace_RequirementClient(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trace.RequirementClient(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefineReqt(RefineReqt refineReqt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refineReqt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencyClientIsUnique(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencySupplierIsUnique(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_RequirementClient(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineReqt_ClientIsNotADerivedRequirement(refineReqt, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineReqt_SupplierIsNotADerivedRequirement(refineReqt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ClientIsNotADerivedRequirement constraint of '<em>Refine Reqt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefineReqt_ClientIsNotADerivedRequirement(RefineReqt refineReqt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refineReqt.ClientIsNotADerivedRequirement(diagnostics, context);
	}

	/**
	 * Validates the SupplierIsNotADerivedRequirement constraint of '<em>Refine Reqt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefineReqt_SupplierIsNotADerivedRequirement(RefineReqt refineReqt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refineReqt.SupplierIsNotADerivedRequirement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopy(Copy copy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencyClientIsUnique(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencySupplierIsUnique(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_RequirementClient(copy, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopy_HLRClient(copy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HLRClient constraint of '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopy_HLRClient(Copy copy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copy.HLRClient(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerive(Derive derive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(derive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencyClientIsUnique(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_DependencySupplierIsUnique(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrace_RequirementClient(derive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDerive_DerivedRequirementClient(derive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DerivedRequirementClient constraint of '<em>Derive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerive_DerivedRequirementClient(Derive derive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return derive.DerivedRequirementClient(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyBasedStatement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoNestedClassifiers(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoAssociations(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoGeneralizations(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoOwnedAttributes(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoOwnedOperations(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_NoOtherStereotype(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_IDMustBeUnique(propertyBasedStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyBasedStatement_ConstraintBlockSupplier(propertyBasedStatement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoNestedClassifiers constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoNestedClassifiers(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoNestedClassifiers(diagnostics, context);
	}

	/**
	 * Validates the NoAssociations constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoAssociations(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoAssociations(diagnostics, context);
	}

	/**
	 * Validates the NoGeneralizations constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoGeneralizations(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoGeneralizations(diagnostics, context);
	}

	/**
	 * Validates the NoOwnedAttributes constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoOwnedAttributes(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoOwnedAttributes(diagnostics, context);
	}

	/**
	 * Validates the NoOwnedOperations constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoOwnedOperations(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoOwnedOperations(diagnostics, context);
	}

	/**
	 * Validates the NoOtherStereotype constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_NoOtherStereotype(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.NoOtherStereotype(diagnostics, context);
	}

	/**
	 * Validates the IDMustBeUnique constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_IDMustBeUnique(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.IDMustBeUnique(diagnostics, context);
	}

	/**
	 * Validates the ConstraintBlockSupplier constraint of '<em>Property Based Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedStatement_ConstraintBlockSupplier(PropertyBasedStatement propertyBasedStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return propertyBasedStatement.ConstraintBlockSupplier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedDomain(TimedDomain timedDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timedDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedEvent(TimedEvent timedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEvent_AppliedOnPropertyBasedStatement(timedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEvent_ContainedInTimedDomainNamespace(timedEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AppliedOnPropertyBasedStatement constraint of '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedEvent_AppliedOnPropertyBasedStatement(TimedEvent timedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timedEvent.AppliedOnPropertyBasedStatement(diagnostics, context);
	}

	/**
	 * Validates the ContainedInTimedDomainNamespace constraint of '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedEvent_ContainedInTimedDomainNamespace(TimedEvent timedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timedEvent.ContainedInTimedDomainNamespace(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedDurationConstraint(TimedDurationConstraint timedDurationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedDurationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedDurationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedDurationConstraint_ContainedInTimedDomainNamespace(timedDurationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContainedInTimedDomainNamespace constraint of '<em>Timed Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedDurationConstraint_ContainedInTimedDomainNamespace(TimedDurationConstraint timedDurationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timedDurationConstraint.ContainedInTimedDomainNamespace(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedInstantObservation(TimedInstantObservation timedInstantObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedInstantObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedInstantObservation_AppliedOnPropertyBasedStatement(timedInstantObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedInstantObservation_ContainedInTimedDomainNamespace(timedInstantObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AppliedOnPropertyBasedStatement constraint of '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedInstantObservation_AppliedOnPropertyBasedStatement(TimedInstantObservation timedInstantObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timedInstantObservation.AppliedOnPropertyBasedStatement(diagnostics, context);
	}

	/**
	 * Validates the ContainedInTimedDomainNamespace constraint of '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedInstantObservation_ContainedInTimedDomainNamespace(TimedInstantObservation timedInstantObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timedInstantObservation.ContainedInTimedDomainNamespace(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalization(Formalization formalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formalization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalization_RequirementClient(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalization_DependencySupplierIsUnique(formalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalization_DependencyClientIsUnique(formalization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RequirementClient constraint of '<em>Formalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalization_RequirementClient(Formalization formalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formalization.RequirementClient(diagnostics, context);
	}

	/**
	 * Validates the DependencySupplierIsUnique constraint of '<em>Formalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalization_DependencySupplierIsUnique(Formalization formalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formalization.DependencySupplierIsUnique(diagnostics, context);
	}

	/**
	 * Validates the DependencyClientIsUnique constraint of '<em>Formalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalization_DependencyClientIsUnique(Formalization formalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formalization.DependencyClientIsUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_PropertyBasedStatementClient(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_DependencySupplierIsUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_DependencyClientIsUnique(condition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PropertyBasedStatementClient constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_PropertyBasedStatementClient(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.PropertyBasedStatementClient(diagnostics, context);
	}

	/**
	 * Validates the DependencySupplierIsUnique constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_DependencySupplierIsUnique(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.DependencySupplierIsUnique(diagnostics, context);
	}

	/**
	 * Validates the DependencyClientIsUnique constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_DependencyClientIsUnique(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.DependencyClientIsUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate(Predicate predicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(predicate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePredicate_PropertyBasedStatementClient(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePredicate_DependencySupplierIsUnique(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePredicate_DependencyClientIsUnique(predicate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PropertyBasedStatementClient constraint of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate_PropertyBasedStatementClient(Predicate predicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return predicate.PropertyBasedStatementClient(diagnostics, context);
	}

	/**
	 * Validates the DependencySupplierIsUnique constraint of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate_DependencySupplierIsUnique(Predicate predicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return predicate.DependencySupplierIsUnique(diagnostics, context);
	}

	/**
	 * Validates the DependencyClientIsUnique constraint of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate_DependencyClientIsUnique(Predicate predicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return predicate.DependencyClientIsUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpec(Spec spec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAttribute(DataAttribute dataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldData(FieldData fieldData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityData(EntityData entityData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementType(RequirementType requirementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementStatus(RequirementStatus requirementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintKind(ConstraintKind constraintKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventKind(EventKind eventKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SpecValidator
