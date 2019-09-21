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

import ca.ets.sofeess.specml.Condition;
import ca.ets.sofeess.specml.ConstraintKind;
import ca.ets.sofeess.specml.Copy;
import ca.ets.sofeess.specml.Coupled;
import ca.ets.sofeess.specml.Data;
import ca.ets.sofeess.specml.DataAttribute;
import ca.ets.sofeess.specml.Derive;
import ca.ets.sofeess.specml.EntityData;
import ca.ets.sofeess.specml.EventKind;
import ca.ets.sofeess.specml.FieldData;
import ca.ets.sofeess.specml.Formalization;
import ca.ets.sofeess.specml.HighLevelRequirement;
import ca.ets.sofeess.specml.LowLevelRequirement;
import ca.ets.sofeess.specml.Predicate;
import ca.ets.sofeess.specml.PropertyBasedStatement;
import ca.ets.sofeess.specml.RefineReqt;
import ca.ets.sofeess.specml.Requirement;
import ca.ets.sofeess.specml.RequirementStatus;
import ca.ets.sofeess.specml.RequirementType;
import ca.ets.sofeess.specml.Source;
import ca.ets.sofeess.specml.Spec;
import ca.ets.sofeess.specml.SpecFactory;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.SystemRequirement;
import ca.ets.sofeess.specml.TimedDomain;
import ca.ets.sofeess.specml.TimedDurationConstraint;
import ca.ets.sofeess.specml.TimedEvent;
import ca.ets.sofeess.specml.TimedInstantObservation;
import ca.ets.sofeess.specml.Trace;
import ca.ets.sofeess.specml.util.SpecValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecPackageImpl extends EPackageImpl implements SpecMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowLevelRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refineReqtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBasedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedDurationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedInstantObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.ets.sofeess.specml.SpecMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecPackageImpl() {
		super(eNS_URI, SpecFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpecMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecMLPackage init() {
		if (isInited) return (SpecMLPackage)EPackage.Registry.INSTANCE.getEPackage(SpecMLPackage.eNS_URI);

		// Obtain or create and register package
		SpecPackageImpl theSpecPackage = (SpecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpecPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpecPackage.createPackageContents();

		// Initialize created meta-data
		theSpecPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSpecPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SpecValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSpecPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecMLPackage.eNS_URI, theSpecPackage);
		return theSpecPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Base_Class() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Id() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Text() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Type() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Source() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsDerived() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsStable() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_CreationDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ModificationDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Revision() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Status() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsVerifiable() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsConsistent() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsFormalizable() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RefinedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RefinedFrom() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_CoupledTo() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_CopiedFrom() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_DerivedFrom() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_FormalizedAs() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__OnlyOneRequirementSubtype__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__IDMustBeUnique__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__RationaleIsRequired__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__NoNestedClassifiers__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__NoAssociations__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__NoGeneralizations__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__NoOwnedAttributes__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__NoOwnedOperations__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__IfCopyTextIsReadOnly__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__PropertyBasedStatementSupplier__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirement__RequirementFormalizationIsRequired__DiagnosticChain_Map() {
		return requirementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRequirement() {
		return systemRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRequirement_AllocatedToSoftware() {
		return (EAttribute)systemRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemRequirement__CoupledWithAnotherSRATS__DiagnosticChain_Map() {
		return systemRequirementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighLevelRequirement() {
		return highLevelRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevelRequirement_PrecludesCFC() {
		return (EAttribute)highLevelRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevelRequirement_DescribesDesignDetail() {
		return (EAttribute)highLevelRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighLevelRequirement_DescribesVerificationDetail() {
		return (EAttribute)highLevelRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__TraceDependencyIsRequired__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__DerivedHLR__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__DesignDetailRequiresRationale__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__VerificationDetailRequiresRationale__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__CopyAnSRATS__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__CoupledWithAnotherHLR__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__DeriveAnHLR__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHighLevelRequirement__RefineAnSRATS__DiagnosticChain_Map() {
		return highLevelRequirementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowLevelRequirement() {
		return lowLevelRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowLevelRequirement__RefineDependencyIsRequired__DiagnosticChain_Map() {
		return lowLevelRequirementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowLevelRequirement__DerivedLLR__DiagnosticChain_Map() {
		return lowLevelRequirementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowLevelRequirement__CoupledWithAnotherLLR__DiagnosticChain_Map() {
		return lowLevelRequirementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowLevelRequirement__DeriveAnLLR__DiagnosticChain_Map() {
		return lowLevelRequirementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowLevelRequirement__RefineAnHLR__DiagnosticChain_Map() {
		return lowLevelRequirementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupled() {
		return coupledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Base_Dependency() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrace__DependencyClientIsUnique__DiagnosticChain_Map() {
		return traceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrace__DependencySupplierIsUnique__DiagnosticChain_Map() {
		return traceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrace__RequirementClient__DiagnosticChain_Map() {
		return traceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefineReqt() {
		return refineReqtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefineReqt__ClientIsNotADerivedRequirement__DiagnosticChain_Map() {
		return refineReqtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefineReqt__SupplierIsNotADerivedRequirement__DiagnosticChain_Map() {
		return refineReqtEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopy() {
		return copyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCopy__HLRClient__DiagnosticChain_Map() {
		return copyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerive() {
		return deriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDerive__DerivedRequirementClient__DiagnosticChain_Map() {
		return deriveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBasedStatement() {
		return propertyBasedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBasedStatement_Id() {
		return (EAttribute)propertyBasedStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBasedStatement_Text() {
		return (EAttribute)propertyBasedStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedStatement_Base_Class() {
		return (EReference)propertyBasedStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBasedStatement_Condition() {
		return (EAttribute)propertyBasedStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBasedStatement_Predicate() {
		return (EAttribute)propertyBasedStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyBasedStatement_Statement() {
		return (EAttribute)propertyBasedStatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedStatement_FormalizationFor() {
		return (EReference)propertyBasedStatementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoNestedClassifiers__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoAssociations__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoGeneralizations__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoOwnedAttributes__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoOwnedOperations__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__NoOtherStereotype__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__IDMustBeUnique__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyBasedStatement__ConstraintBlockSupplier__DiagnosticChain_Map() {
		return propertyBasedStatementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedDomain() {
		return timedDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedDomain_Base_Namespace() {
		return (EReference)timedDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedEvent() {
		return timedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedEvent_Repetition() {
		return (EAttribute)timedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedEvent_Every() {
		return (EAttribute)timedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedEvent_Base_Class() {
		return (EReference)timedEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimedEvent__AppliedOnPropertyBasedStatement__DiagnosticChain_Map() {
		return timedEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimedEvent__ContainedInTimedDomainNamespace__DiagnosticChain_Map() {
		return timedEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedDurationConstraint() {
		return timedDurationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedDurationConstraint_Base_Constraint() {
		return (EReference)timedDurationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedDurationConstraint_Kind() {
		return (EAttribute)timedDurationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimedDurationConstraint__ContainedInTimedDomainNamespace__DiagnosticChain_Map() {
		return timedDurationConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedInstantObservation() {
		return timedInstantObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedInstantObservation_ObsKind() {
		return (EAttribute)timedInstantObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedInstantObservation_Base_Class() {
		return (EReference)timedInstantObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimedInstantObservation__AppliedOnPropertyBasedStatement__DiagnosticChain_Map() {
		return timedInstantObservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimedInstantObservation__ContainedInTimedDomainNamespace__DiagnosticChain_Map() {
		return timedInstantObservationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalization() {
		return formalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalization_Base_Dependency() {
		return (EReference)formalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormalization__RequirementClient__DiagnosticChain_Map() {
		return formalizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormalization__DependencySupplierIsUnique__DiagnosticChain_Map() {
		return formalizationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormalization__DependencyClientIsUnique__DiagnosticChain_Map() {
		return formalizationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Base_Dependency() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__PropertyBasedStatementClient__DiagnosticChain_Map() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__DependencySupplierIsUnique__DiagnosticChain_Map() {
		return conditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__DependencyClientIsUnique__DiagnosticChain_Map() {
		return conditionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Base_Dependency() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredicate__PropertyBasedStatementClient__DiagnosticChain_Map() {
		return predicateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredicate__DependencySupplierIsUnique__DiagnosticChain_Map() {
		return predicateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPredicate__DependencyClientIsUnique__DiagnosticChain_Map() {
		return predicateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpec() {
		return specEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpec_Base_Package() {
		return (EReference)specEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Description() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Rationale() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_DisplayName() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Source() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_CreationNotes() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_MaintenanceNotes() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_UsageNotes() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_CreationDate() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_ModificationDate() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Revision() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_OtherMetadata() {
		return (EReference)dataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAttribute() {
		return dataAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAttribute_Name() {
		return (EAttribute)dataAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAttribute_Value() {
		return (EAttribute)dataAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldData() {
		return fieldDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_PossibleValues() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_Format() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_Length() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_DefaultValue() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_IsRequired() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_IsReadOnly() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_IsUnique() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldData_Encoding() {
		return (EAttribute)fieldDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldData_Base_Property() {
		return (EReference)fieldDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityData() {
		return entityDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityData_Base_Class() {
		return (EReference)entityDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementType() {
		return requirementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSource() {
		return sourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementStatus() {
		return requirementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintKind() {
		return constraintKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactory getSpecFactory() {
		return (SpecFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__BASE_CLASS);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__TEXT);
		createEAttribute(requirementEClass, REQUIREMENT__TYPE);
		createEAttribute(requirementEClass, REQUIREMENT__SOURCE);
		createEAttribute(requirementEClass, REQUIREMENT__IS_DERIVED);
		createEAttribute(requirementEClass, REQUIREMENT__IS_STABLE);
		createEAttribute(requirementEClass, REQUIREMENT__CREATION_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__MODIFICATION_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__REVISION);
		createEAttribute(requirementEClass, REQUIREMENT__STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__IS_VERIFIABLE);
		createEAttribute(requirementEClass, REQUIREMENT__IS_CONSISTENT);
		createEAttribute(requirementEClass, REQUIREMENT__IS_FORMALIZABLE);
		createEReference(requirementEClass, REQUIREMENT__REFINED_BY);
		createEReference(requirementEClass, REQUIREMENT__REFINED_FROM);
		createEReference(requirementEClass, REQUIREMENT__COUPLED_TO);
		createEReference(requirementEClass, REQUIREMENT__COPIED_FROM);
		createEReference(requirementEClass, REQUIREMENT__DERIVED_FROM);
		createEAttribute(requirementEClass, REQUIREMENT__FORMALIZED_AS);
		createEOperation(requirementEClass, REQUIREMENT___ONLY_ONE_REQUIREMENT_SUBTYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___RATIONALE_IS_REQUIRED__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___IF_COPY_TEXT_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___PROPERTY_BASED_STATEMENT_SUPPLIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(requirementEClass, REQUIREMENT___REQUIREMENT_FORMALIZATION_IS_REQUIRED__DIAGNOSTICCHAIN_MAP);

		systemRequirementEClass = createEClass(SYSTEM_REQUIREMENT);
		createEAttribute(systemRequirementEClass, SYSTEM_REQUIREMENT__ALLOCATED_TO_SOFTWARE);
		createEOperation(systemRequirementEClass, SYSTEM_REQUIREMENT___COUPLED_WITH_ANOTHER_SRATS__DIAGNOSTICCHAIN_MAP);

		highLevelRequirementEClass = createEClass(HIGH_LEVEL_REQUIREMENT);
		createEAttribute(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC);
		createEAttribute(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL);
		createEAttribute(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___TRACE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___DERIVED_HLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___DESIGN_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___VERIFICATION_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___COPY_AN_SRATS__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_HLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___DERIVE_AN_HLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(highLevelRequirementEClass, HIGH_LEVEL_REQUIREMENT___REFINE_AN_SRATS__DIAGNOSTICCHAIN_MAP);

		lowLevelRequirementEClass = createEClass(LOW_LEVEL_REQUIREMENT);
		createEOperation(lowLevelRequirementEClass, LOW_LEVEL_REQUIREMENT___REFINE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP);
		createEOperation(lowLevelRequirementEClass, LOW_LEVEL_REQUIREMENT___DERIVED_LLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(lowLevelRequirementEClass, LOW_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_LLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(lowLevelRequirementEClass, LOW_LEVEL_REQUIREMENT___DERIVE_AN_LLR__DIAGNOSTICCHAIN_MAP);
		createEOperation(lowLevelRequirementEClass, LOW_LEVEL_REQUIREMENT___REFINE_AN_HLR__DIAGNOSTICCHAIN_MAP);

		coupledEClass = createEClass(COUPLED);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__BASE_DEPENDENCY);
		createEOperation(traceEClass, TRACE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(traceEClass, TRACE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(traceEClass, TRACE___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP);

		refineReqtEClass = createEClass(REFINE_REQT);
		createEOperation(refineReqtEClass, REFINE_REQT___CLIENT_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(refineReqtEClass, REFINE_REQT___SUPPLIER_IS_NOT_ADERIVED_REQUIREMENT__DIAGNOSTICCHAIN_MAP);

		copyEClass = createEClass(COPY);
		createEOperation(copyEClass, COPY___HLR_CLIENT__DIAGNOSTICCHAIN_MAP);

		deriveEClass = createEClass(DERIVE);
		createEOperation(deriveEClass, DERIVE___DERIVED_REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP);

		propertyBasedStatementEClass = createEClass(PROPERTY_BASED_STATEMENT);
		createEAttribute(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__ID);
		createEAttribute(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__TEXT);
		createEReference(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__BASE_CLASS);
		createEAttribute(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__CONDITION);
		createEAttribute(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__PREDICATE);
		createEAttribute(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__STATEMENT);
		createEReference(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___NO_OTHER_STEREOTYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyBasedStatementEClass, PROPERTY_BASED_STATEMENT___CONSTRAINT_BLOCK_SUPPLIER__DIAGNOSTICCHAIN_MAP);

		timedDomainEClass = createEClass(TIMED_DOMAIN);
		createEReference(timedDomainEClass, TIMED_DOMAIN__BASE_NAMESPACE);

		timedEventEClass = createEClass(TIMED_EVENT);
		createEAttribute(timedEventEClass, TIMED_EVENT__REPETITION);
		createEAttribute(timedEventEClass, TIMED_EVENT__EVERY);
		createEReference(timedEventEClass, TIMED_EVENT__BASE_CLASS);
		createEOperation(timedEventEClass, TIMED_EVENT___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(timedEventEClass, TIMED_EVENT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP);

		timedDurationConstraintEClass = createEClass(TIMED_DURATION_CONSTRAINT);
		createEReference(timedDurationConstraintEClass, TIMED_DURATION_CONSTRAINT__BASE_CONSTRAINT);
		createEAttribute(timedDurationConstraintEClass, TIMED_DURATION_CONSTRAINT__KIND);
		createEOperation(timedDurationConstraintEClass, TIMED_DURATION_CONSTRAINT___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP);

		timedInstantObservationEClass = createEClass(TIMED_INSTANT_OBSERVATION);
		createEAttribute(timedInstantObservationEClass, TIMED_INSTANT_OBSERVATION__OBS_KIND);
		createEReference(timedInstantObservationEClass, TIMED_INSTANT_OBSERVATION__BASE_CLASS);
		createEOperation(timedInstantObservationEClass, TIMED_INSTANT_OBSERVATION___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(timedInstantObservationEClass, TIMED_INSTANT_OBSERVATION___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP);

		formalizationEClass = createEClass(FORMALIZATION);
		createEReference(formalizationEClass, FORMALIZATION__BASE_DEPENDENCY);
		createEOperation(formalizationEClass, FORMALIZATION___REQUIREMENT_CLIENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(formalizationEClass, FORMALIZATION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(formalizationEClass, FORMALIZATION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__BASE_DEPENDENCY);
		createEOperation(conditionEClass, CONDITION___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionEClass, CONDITION___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionEClass, CONDITION___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);

		predicateEClass = createEClass(PREDICATE);
		createEReference(predicateEClass, PREDICATE__BASE_DEPENDENCY);
		createEOperation(predicateEClass, PREDICATE___PROPERTY_BASED_STATEMENT_CLIENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(predicateEClass, PREDICATE___DEPENDENCY_SUPPLIER_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(predicateEClass, PREDICATE___DEPENDENCY_CLIENT_IS_UNIQUE__DIAGNOSTICCHAIN_MAP);

		specEClass = createEClass(SPEC);
		createEReference(specEClass, SPEC__BASE_PACKAGE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__DESCRIPTION);
		createEAttribute(dataEClass, DATA__RATIONALE);
		createEAttribute(dataEClass, DATA__DISPLAY_NAME);
		createEAttribute(dataEClass, DATA__SOURCE);
		createEAttribute(dataEClass, DATA__CREATION_NOTES);
		createEAttribute(dataEClass, DATA__MAINTENANCE_NOTES);
		createEAttribute(dataEClass, DATA__USAGE_NOTES);
		createEAttribute(dataEClass, DATA__CREATION_DATE);
		createEAttribute(dataEClass, DATA__MODIFICATION_DATE);
		createEAttribute(dataEClass, DATA__REVISION);
		createEReference(dataEClass, DATA__OTHER_METADATA);

		dataAttributeEClass = createEClass(DATA_ATTRIBUTE);
		createEAttribute(dataAttributeEClass, DATA_ATTRIBUTE__NAME);
		createEAttribute(dataAttributeEClass, DATA_ATTRIBUTE__VALUE);

		fieldDataEClass = createEClass(FIELD_DATA);
		createEAttribute(fieldDataEClass, FIELD_DATA__POSSIBLE_VALUES);
		createEAttribute(fieldDataEClass, FIELD_DATA__FORMAT);
		createEAttribute(fieldDataEClass, FIELD_DATA__LENGTH);
		createEAttribute(fieldDataEClass, FIELD_DATA__DEFAULT_VALUE);
		createEAttribute(fieldDataEClass, FIELD_DATA__IS_REQUIRED);
		createEAttribute(fieldDataEClass, FIELD_DATA__IS_READ_ONLY);
		createEAttribute(fieldDataEClass, FIELD_DATA__IS_UNIQUE);
		createEAttribute(fieldDataEClass, FIELD_DATA__ENCODING);
		createEReference(fieldDataEClass, FIELD_DATA__BASE_PROPERTY);

		entityDataEClass = createEClass(ENTITY_DATA);
		createEReference(entityDataEClass, ENTITY_DATA__BASE_CLASS);

		// Create enums
		requirementTypeEEnum = createEEnum(REQUIREMENT_TYPE);
		sourceEEnum = createEEnum(SOURCE);
		requirementStatusEEnum = createEEnum(REQUIREMENT_STATUS);
		constraintKindEEnum = createEEnum(CONSTRAINT_KIND);
		eventKindEEnum = createEEnum(EVENT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemRequirementEClass.getESuperTypes().add(this.getRequirement());
		highLevelRequirementEClass.getESuperTypes().add(this.getRequirement());
		lowLevelRequirementEClass.getESuperTypes().add(this.getRequirement());
		coupledEClass.getESuperTypes().add(this.getTrace());
		refineReqtEClass.getESuperTypes().add(this.getTrace());
		copyEClass.getESuperTypes().add(this.getTrace());
		deriveEClass.getESuperTypes().add(this.getTrace());
		fieldDataEClass.getESuperTypes().add(this.getData());
		entityDataEClass.getESuperTypes().add(this.getData());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Id(), theTypesPackage.getString(), "id", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Text(), theTypesPackage.getString(), "text", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Type(), this.getRequirementType(), "type", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Source(), this.getSource(), "source", null, 1, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_IsDerived(), theTypesPackage.getBoolean(), "isDerived", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_IsStable(), theTypesPackage.getBoolean(), "isStable", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_CreationDate(), theTypesPackage.getString(), "creationDate", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_ModificationDate(), theTypesPackage.getString(), "modificationDate", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Revision(), theTypesPackage.getInteger(), "revision", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_Status(), this.getRequirementStatus(), "status", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_IsVerifiable(), theTypesPackage.getBoolean(), "isVerifiable", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_IsConsistent(), theTypesPackage.getBoolean(), "isConsistent", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_IsFormalizable(), theTypesPackage.getBoolean(), "isFormalizable", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_RefinedBy(), this.getRequirement(), null, "refinedBy", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_RefinedFrom(), this.getRequirement(), null, "refinedFrom", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_CoupledTo(), this.getRequirement(), null, "coupledTo", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_CopiedFrom(), this.getRequirement(), null, "copiedFrom", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_DerivedFrom(), this.getRequirement(), null, "derivedFrom", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirement_FormalizedAs(), theTypesPackage.getString(), "formalizedAs", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRequirement__OnlyOneRequirementSubtype__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOneRequirementSubtype", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__IDMustBeUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "IDMustBeUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__RationaleIsRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RationaleIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__NoNestedClassifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoNestedClassifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__NoAssociations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoAssociations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__NoGeneralizations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoGeneralizations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__NoOwnedAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOwnedAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__NoOwnedOperations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOwnedOperations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__IfCopyTextIsReadOnly__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "IfCopyTextIsReadOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__PropertyBasedStatementSupplier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PropertyBasedStatementSupplier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequirement__RequirementFormalizationIsRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RequirementFormalizationIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemRequirementEClass, SystemRequirement.class, "SystemRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemRequirement_AllocatedToSoftware(), theTypesPackage.getBoolean(), "allocatedToSoftware", null, 1, 1, SystemRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSystemRequirement__CoupledWithAnotherSRATS__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CoupledWithAnotherSRATS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(highLevelRequirementEClass, HighLevelRequirement.class, "HighLevelRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighLevelRequirement_PrecludesCFC(), theTypesPackage.getBoolean(), "precludesCFC", null, 1, 1, HighLevelRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHighLevelRequirement_DescribesDesignDetail(), theTypesPackage.getBoolean(), "describesDesignDetail", null, 1, 1, HighLevelRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHighLevelRequirement_DescribesVerificationDetail(), theTypesPackage.getBoolean(), "describesVerificationDetail", null, 1, 1, HighLevelRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__TraceDependencyIsRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TraceDependencyIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__DerivedHLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DerivedHLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__DesignDetailRequiresRationale__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DesignDetailRequiresRationale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__VerificationDetailRequiresRationale__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "VerificationDetailRequiresRationale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__CopyAnSRATS__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CopyAnSRATS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__CoupledWithAnotherHLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CoupledWithAnotherHLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__DeriveAnHLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DeriveAnHLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHighLevelRequirement__RefineAnSRATS__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RefineAnSRATS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lowLevelRequirementEClass, LowLevelRequirement.class, "LowLevelRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLowLevelRequirement__RefineDependencyIsRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RefineDependencyIsRequired", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLowLevelRequirement__DerivedLLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DerivedLLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLowLevelRequirement__CoupledWithAnotherLLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CoupledWithAnotherLLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLowLevelRequirement__DeriveAnLLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DeriveAnLLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLowLevelRequirement__RefineAnHLR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RefineAnHLR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coupledEClass, Coupled.class, "Coupled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traceEClass, Trace.class, "Trace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTrace__DependencyClientIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencyClientIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTrace__DependencySupplierIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencySupplierIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTrace__RequirementClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RequirementClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(refineReqtEClass, RefineReqt.class, "RefineReqt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRefineReqt__ClientIsNotADerivedRequirement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ClientIsNotADerivedRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRefineReqt__SupplierIsNotADerivedRequirement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SupplierIsNotADerivedRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(copyEClass, Copy.class, "Copy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCopy__HLRClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "HLRClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deriveEClass, Derive.class, "Derive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDerive__DerivedRequirementClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DerivedRequirementClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyBasedStatementEClass, PropertyBasedStatement.class, "PropertyBasedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyBasedStatement_Id(), theTypesPackage.getString(), "id", null, 1, 1, PropertyBasedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyBasedStatement_Text(), theTypesPackage.getString(), "text", null, 1, 1, PropertyBasedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyBasedStatement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, PropertyBasedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyBasedStatement_Condition(), theTypesPackage.getString(), "condition", null, 1, 1, PropertyBasedStatement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyBasedStatement_Predicate(), theTypesPackage.getString(), "predicate", null, 1, 1, PropertyBasedStatement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyBasedStatement_Statement(), theTypesPackage.getString(), "statement", null, 1, 1, PropertyBasedStatement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyBasedStatement_FormalizationFor(), this.getRequirement(), null, "formalizationFor", null, 0, -1, PropertyBasedStatement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoNestedClassifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoNestedClassifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoAssociations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoAssociations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoGeneralizations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoGeneralizations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoOwnedAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOwnedAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoOwnedOperations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOwnedOperations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__NoOtherStereotype__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoOtherStereotype", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__IDMustBeUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "IDMustBeUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPropertyBasedStatement__ConstraintBlockSupplier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ConstraintBlockSupplier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timedDomainEClass, TimedDomain.class, "TimedDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedDomain_Base_Namespace(), theUMLPackage.getNamespace(), null, "base_Namespace", null, 1, 1, TimedDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timedEventEClass, TimedEvent.class, "TimedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedEvent_Repetition(), theTypesPackage.getInteger(), "repetition", null, 0, 1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimedEvent_Every(), theTypesPackage.getString(), "every", null, 0, 1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimedEvent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTimedEvent__AppliedOnPropertyBasedStatement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AppliedOnPropertyBasedStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimedEvent__ContainedInTimedDomainNamespace__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainedInTimedDomainNamespace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timedDurationConstraintEClass, TimedDurationConstraint.class, "TimedDurationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedDurationConstraint_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, TimedDurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimedDurationConstraint_Kind(), this.getConstraintKind(), "kind", null, 1, 1, TimedDurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTimedDurationConstraint__ContainedInTimedDomainNamespace__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainedInTimedDomainNamespace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timedInstantObservationEClass, TimedInstantObservation.class, "TimedInstantObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedInstantObservation_ObsKind(), this.getEventKind(), "obsKind", null, 0, 1, TimedInstantObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimedInstantObservation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, TimedInstantObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTimedInstantObservation__AppliedOnPropertyBasedStatement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AppliedOnPropertyBasedStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimedInstantObservation__ContainedInTimedDomainNamespace__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainedInTimedDomainNamespace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(formalizationEClass, Formalization.class, "Formalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalization_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Formalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFormalization__RequirementClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RequirementClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFormalization__DependencySupplierIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencySupplierIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFormalization__DependencyClientIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencyClientIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCondition__PropertyBasedStatementClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PropertyBasedStatementClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondition__DependencySupplierIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencySupplierIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondition__DependencyClientIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencyClientIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicate_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPredicate__PropertyBasedStatementClient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "PropertyBasedStatementClient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPredicate__DependencySupplierIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencySupplierIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPredicate__DependencyClientIsUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DependencyClientIsUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specEClass, Spec.class, "Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpec_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Description(), theTypesPackage.getString(), "description", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_Rationale(), theTypesPackage.getString(), "rationale", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_DisplayName(), theTypesPackage.getString(), "displayName", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_Source(), this.getSource(), "source", null, 1, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_CreationNotes(), theTypesPackage.getString(), "creationNotes", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_MaintenanceNotes(), theTypesPackage.getString(), "maintenanceNotes", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_UsageNotes(), theTypesPackage.getString(), "usageNotes", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_CreationDate(), theTypesPackage.getString(), "creationDate", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_ModificationDate(), theTypesPackage.getString(), "modificationDate", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getData_Revision(), theTypesPackage.getInteger(), "revision", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getData_OtherMetadata(), this.getDataAttribute(), null, "otherMetadata", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAttribute_Name(), theTypesPackage.getString(), "name", null, 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataAttribute_Value(), theTypesPackage.getString(), "value", null, 1, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fieldDataEClass, FieldData.class, "FieldData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldData_PossibleValues(), theTypesPackage.getString(), "possibleValues", null, 1, -1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_Format(), theTypesPackage.getString(), "format", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_Length(), theTypesPackage.getInteger(), "length", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_DefaultValue(), theTypesPackage.getString(), "defaultValue", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_IsRequired(), theTypesPackage.getBoolean(), "isRequired", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_IsUnique(), theTypesPackage.getBoolean(), "isUnique", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFieldData_Encoding(), theTypesPackage.getString(), "encoding", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFieldData_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, FieldData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entityDataEClass, EntityData.class, "EntityData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityData_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, EntityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requirementTypeEEnum, RequirementType.class, "RequirementType");
		addEEnumLiteral(requirementTypeEEnum, RequirementType.STRUCTURAL_REQUIREMENT);
		addEEnumLiteral(requirementTypeEEnum, RequirementType.BEHAVIOURAL_REQUIREMENT);
		addEEnumLiteral(requirementTypeEEnum, RequirementType.MIXED_REQUIREMENT);
		addEEnumLiteral(requirementTypeEEnum, RequirementType.OTHER_REQUIREMENT_TYPE);

		initEEnum(sourceEEnum, Source.class, "Source");
		addEEnumLiteral(sourceEEnum, Source.ACQUIRER);
		addEEnumLiteral(sourceEEnum, Source.OPERATOR);
		addEEnumLiteral(sourceEEnum, Source.CERTIFICATION_AUTHORITY);
		addEEnumLiteral(sourceEEnum, Source.SPECIALTY_ENGINEER);
		addEEnumLiteral(sourceEEnum, Source.OTHER_STAKEHOLDER);
		addEEnumLiteral(sourceEEnum, Source.CERTIFICATION_STANDARD);
		addEEnumLiteral(sourceEEnum, Source.SAFETY);
		addEEnumLiteral(sourceEEnum, Source.COSTS);
		addEEnumLiteral(sourceEEnum, Source.ENVIRONMENTAL_CONDITIONS);
		addEEnumLiteral(sourceEEnum, Source.DESIGN);
		addEEnumLiteral(sourceEEnum, Source.PRODUCTION);
		addEEnumLiteral(sourceEEnum, Source.TESTS);
		addEEnumLiteral(sourceEEnum, Source.MAINTENANCE);
		addEEnumLiteral(sourceEEnum, Source.OTHER_SOURCE);

		initEEnum(requirementStatusEEnum, RequirementStatus.class, "RequirementStatus");
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.PENDING_REVIEW);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.REVIEWED_AND_ACCEPTED);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.REVIEWED_AND_INCORRECT);

		initEEnum(constraintKindEEnum, ConstraintKind.class, "ConstraintKind");
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.REQUIRED);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.OFFERED);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.CONTRACT);

		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.START);
		addEEnumLiteral(eventKindEEnum, EventKind.FINISH);
		addEEnumLiteral(eventKindEEnum, EventKind.SEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RECEIVE);
		addEEnumLiteral(eventKindEEnum, EventKind.CONSUME);

		// Create resource
		createResource(eNS_URI);
	}

} //SpecPackageImpl
