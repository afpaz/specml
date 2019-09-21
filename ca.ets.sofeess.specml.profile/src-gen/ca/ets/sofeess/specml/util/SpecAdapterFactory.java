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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ca.ets.sofeess.specml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage
 * @generated
 */
public class SpecAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpecMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecSwitch<Adapter> modelSwitch =
		new SpecSwitch<Adapter>() {
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseSystemRequirement(SystemRequirement object) {
				return createSystemRequirementAdapter();
			}
			@Override
			public Adapter caseHighLevelRequirement(HighLevelRequirement object) {
				return createHighLevelRequirementAdapter();
			}
			@Override
			public Adapter caseLowLevelRequirement(LowLevelRequirement object) {
				return createLowLevelRequirementAdapter();
			}
			@Override
			public Adapter caseCoupled(Coupled object) {
				return createCoupledAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseRefineReqt(RefineReqt object) {
				return createRefineReqtAdapter();
			}
			@Override
			public Adapter caseCopy(Copy object) {
				return createCopyAdapter();
			}
			@Override
			public Adapter caseDerive(Derive object) {
				return createDeriveAdapter();
			}
			@Override
			public Adapter casePropertyBasedStatement(PropertyBasedStatement object) {
				return createPropertyBasedStatementAdapter();
			}
			@Override
			public Adapter caseTimedDomain(TimedDomain object) {
				return createTimedDomainAdapter();
			}
			@Override
			public Adapter caseTimedEvent(TimedEvent object) {
				return createTimedEventAdapter();
			}
			@Override
			public Adapter caseTimedDurationConstraint(TimedDurationConstraint object) {
				return createTimedDurationConstraintAdapter();
			}
			@Override
			public Adapter caseTimedInstantObservation(TimedInstantObservation object) {
				return createTimedInstantObservationAdapter();
			}
			@Override
			public Adapter caseFormalization(Formalization object) {
				return createFormalizationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseSpec(Spec object) {
				return createSpecAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseDataAttribute(DataAttribute object) {
				return createDataAttributeAdapter();
			}
			@Override
			public Adapter caseFieldData(FieldData object) {
				return createFieldDataAdapter();
			}
			@Override
			public Adapter caseEntityData(EntityData object) {
				return createEntityDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.SystemRequirement
	 * @generated
	 */
	public Adapter createSystemRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.HighLevelRequirement <em>High Level Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.HighLevelRequirement
	 * @generated
	 */
	public Adapter createHighLevelRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.LowLevelRequirement <em>Low Level Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.LowLevelRequirement
	 * @generated
	 */
	public Adapter createLowLevelRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Coupled <em>Coupled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Coupled
	 * @generated
	 */
	public Adapter createCoupledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.RefineReqt <em>Refine Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.RefineReqt
	 * @generated
	 */
	public Adapter createRefineReqtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Copy
	 * @generated
	 */
	public Adapter createCopyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Derive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Derive
	 * @generated
	 */
	public Adapter createDeriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.PropertyBasedStatement <em>Property Based Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.PropertyBasedStatement
	 * @generated
	 */
	public Adapter createPropertyBasedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.TimedDomain <em>Timed Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.TimedDomain
	 * @generated
	 */
	public Adapter createTimedDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.TimedEvent <em>Timed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.TimedEvent
	 * @generated
	 */
	public Adapter createTimedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.TimedDurationConstraint <em>Timed Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.TimedDurationConstraint
	 * @generated
	 */
	public Adapter createTimedDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.TimedInstantObservation <em>Timed Instant Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.TimedInstantObservation
	 * @generated
	 */
	public Adapter createTimedInstantObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Formalization <em>Formalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Formalization
	 * @generated
	 */
	public Adapter createFormalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Spec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Spec
	 * @generated
	 */
	public Adapter createSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.DataAttribute <em>Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.DataAttribute
	 * @generated
	 */
	public Adapter createDataAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.FieldData <em>Field Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.FieldData
	 * @generated
	 */
	public Adapter createFieldDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.specml.EntityData <em>Entity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.specml.EntityData
	 * @generated
	 */
	public Adapter createEntityDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpecAdapterFactory
