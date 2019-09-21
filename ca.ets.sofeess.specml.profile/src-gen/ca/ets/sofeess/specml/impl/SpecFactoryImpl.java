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
package ca.ets.sofeess.specml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.ets.sofeess.specml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecFactory init() {
		try {
			SpecFactory theSpecFactory = (SpecFactory)EPackage.Registry.INSTANCE.getEFactory(SpecMLPackage.eNS_URI);
			if (theSpecFactory != null) {
				return theSpecFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpecMLPackage.SYSTEM_REQUIREMENT: return createSystemRequirement();
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT: return createHighLevelRequirement();
			case SpecMLPackage.LOW_LEVEL_REQUIREMENT: return createLowLevelRequirement();
			case SpecMLPackage.COUPLED: return createCoupled();
			case SpecMLPackage.REFINE_REQT: return createRefineReqt();
			case SpecMLPackage.COPY: return createCopy();
			case SpecMLPackage.DERIVE: return createDerive();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT: return createPropertyBasedStatement();
			case SpecMLPackage.TIMED_DOMAIN: return createTimedDomain();
			case SpecMLPackage.TIMED_EVENT: return createTimedEvent();
			case SpecMLPackage.TIMED_DURATION_CONSTRAINT: return createTimedDurationConstraint();
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION: return createTimedInstantObservation();
			case SpecMLPackage.FORMALIZATION: return createFormalization();
			case SpecMLPackage.CONDITION: return createCondition();
			case SpecMLPackage.PREDICATE: return createPredicate();
			case SpecMLPackage.SPEC: return createSpec();
			case SpecMLPackage.DATA_ATTRIBUTE: return createDataAttribute();
			case SpecMLPackage.FIELD_DATA: return createFieldData();
			case SpecMLPackage.ENTITY_DATA: return createEntityData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpecMLPackage.REQUIREMENT_TYPE:
				return createRequirementTypeFromString(eDataType, initialValue);
			case SpecMLPackage.SOURCE:
				return createSourceFromString(eDataType, initialValue);
			case SpecMLPackage.REQUIREMENT_STATUS:
				return createRequirementStatusFromString(eDataType, initialValue);
			case SpecMLPackage.CONSTRAINT_KIND:
				return createConstraintKindFromString(eDataType, initialValue);
			case SpecMLPackage.EVENT_KIND:
				return createEventKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpecMLPackage.REQUIREMENT_TYPE:
				return convertRequirementTypeToString(eDataType, instanceValue);
			case SpecMLPackage.SOURCE:
				return convertSourceToString(eDataType, instanceValue);
			case SpecMLPackage.REQUIREMENT_STATUS:
				return convertRequirementStatusToString(eDataType, instanceValue);
			case SpecMLPackage.CONSTRAINT_KIND:
				return convertConstraintKindToString(eDataType, instanceValue);
			case SpecMLPackage.EVENT_KIND:
				return convertEventKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequirement createSystemRequirement() {
		SystemRequirementImpl systemRequirement = new SystemRequirementImpl();
		return systemRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelRequirement createHighLevelRequirement() {
		HighLevelRequirementImpl highLevelRequirement = new HighLevelRequirementImpl();
		return highLevelRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowLevelRequirement createLowLevelRequirement() {
		LowLevelRequirementImpl lowLevelRequirement = new LowLevelRequirementImpl();
		return lowLevelRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coupled createCoupled() {
		CoupledImpl coupled = new CoupledImpl();
		return coupled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineReqt createRefineReqt() {
		RefineReqtImpl refineReqt = new RefineReqtImpl();
		return refineReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derive createDerive() {
		DeriveImpl derive = new DeriveImpl();
		return derive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBasedStatement createPropertyBasedStatement() {
		PropertyBasedStatementImpl propertyBasedStatement = new PropertyBasedStatementImpl();
		return propertyBasedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDomain createTimedDomain() {
		TimedDomainImpl timedDomain = new TimedDomainImpl();
		return timedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEvent createTimedEvent() {
		TimedEventImpl timedEvent = new TimedEventImpl();
		return timedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDurationConstraint createTimedDurationConstraint() {
		TimedDurationConstraintImpl timedDurationConstraint = new TimedDurationConstraintImpl();
		return timedDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantObservation createTimedInstantObservation() {
		TimedInstantObservationImpl timedInstantObservation = new TimedInstantObservationImpl();
		return timedInstantObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formalization createFormalization() {
		FormalizationImpl formalization = new FormalizationImpl();
		return formalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spec createSpec() {
		SpecImpl spec = new SpecImpl();
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAttribute createDataAttribute() {
		DataAttributeImpl dataAttribute = new DataAttributeImpl();
		return dataAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldData createFieldData() {
		FieldDataImpl fieldData = new FieldDataImpl();
		return fieldData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityData createEntityData() {
		EntityDataImpl entityData = new EntityDataImpl();
		return entityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType createRequirementTypeFromString(EDataType eDataType, String initialValue) {
		RequirementType result = RequirementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSourceFromString(EDataType eDataType, String initialValue) {
		Source result = Source.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementStatus createRequirementStatusFromString(EDataType eDataType, String initialValue) {
		RequirementStatus result = RequirementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintKind createConstraintKindFromString(EDataType eDataType, String initialValue) {
		ConstraintKind result = ConstraintKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMLPackage getSpecPackage() {
		return (SpecMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecMLPackage getPackage() {
		return SpecMLPackage.eINSTANCE;
	}

} //SpecFactoryImpl
