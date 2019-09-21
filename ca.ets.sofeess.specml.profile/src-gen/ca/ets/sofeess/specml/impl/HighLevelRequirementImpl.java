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

import ca.ets.sofeess.specml.HighLevelRequirement;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.util.SpecValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>High Level Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.impl.HighLevelRequirementImpl#isPrecludesCFC <em>Precludes CFC</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.HighLevelRequirementImpl#isDescribesDesignDetail <em>Describes Design Detail</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.HighLevelRequirementImpl#isDescribesVerificationDetail <em>Describes Verification Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighLevelRequirementImpl extends RequirementImpl implements HighLevelRequirement {
	/**
	 * The default value of the '{@link #isPrecludesCFC() <em>Precludes CFC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecludesCFC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRECLUDES_CFC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrecludesCFC() <em>Precludes CFC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecludesCFC()
	 * @generated
	 * @ordered
	 */
	protected boolean precludesCFC = PRECLUDES_CFC_EDEFAULT;

	/**
	 * The default value of the '{@link #isDescribesDesignDetail() <em>Describes Design Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescribesDesignDetail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIBES_DESIGN_DETAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDescribesDesignDetail() <em>Describes Design Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescribesDesignDetail()
	 * @generated
	 * @ordered
	 */
	protected boolean describesDesignDetail = DESCRIBES_DESIGN_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDescribesVerificationDetail() <em>Describes Verification Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescribesVerificationDetail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIBES_VERIFICATION_DETAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDescribesVerificationDetail() <em>Describes Verification Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescribesVerificationDetail()
	 * @generated
	 * @ordered
	 */
	protected boolean describesVerificationDetail = DESCRIBES_VERIFICATION_DETAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecMLPackage.Literals.HIGH_LEVEL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrecludesCFC() {
		return precludesCFC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecludesCFC(boolean newPrecludesCFC) {
		boolean oldPrecludesCFC = precludesCFC;
		precludesCFC = newPrecludesCFC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC, oldPrecludesCFC, precludesCFC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescribesDesignDetail() {
		return describesDesignDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribesDesignDetail(boolean newDescribesDesignDetail) {
		boolean oldDescribesDesignDetail = describesDesignDetail;
		describesDesignDetail = newDescribesDesignDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL, oldDescribesDesignDetail, describesDesignDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescribesVerificationDetail() {
		return describesVerificationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribesVerificationDetail(boolean newDescribesVerificationDetail) {
		boolean oldDescribesVerificationDetail = describesVerificationDetail;
		describesVerificationDetail = newDescribesVerificationDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL, oldDescribesVerificationDetail, describesVerificationDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TraceDependencyIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__TRACE_DEPENDENCY_IS_REQUIRED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TraceDependencyIsRequired", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DerivedHLR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__DERIVED_HLR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DerivedHLR", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DesignDetailRequiresRationale(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__DESIGN_DETAIL_REQUIRES_RATIONALE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DesignDetailRequiresRationale", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean VerificationDetailRequiresRationale(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__VERIFICATION_DETAIL_REQUIRES_RATIONALE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "VerificationDetailRequiresRationale", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CopyAnSRATS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__COPY_AN_SRATS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CopyAnSRATS", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoupledWithAnotherHLR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__COUPLED_WITH_ANOTHER_HLR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoupledWithAnotherHLR", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DeriveAnHLR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__DERIVE_AN_HLR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeriveAnHLR", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RefineAnSRATS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SpecValidator.DIAGNOSTIC_SOURCE,
						 SpecValidator.HIGH_LEVEL_REQUIREMENT__REFINE_AN_SRATS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "RefineAnSRATS", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC:
				return isPrecludesCFC();
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL:
				return isDescribesDesignDetail();
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL:
				return isDescribesVerificationDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC:
				setPrecludesCFC((Boolean)newValue);
				return;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL:
				setDescribesDesignDetail((Boolean)newValue);
				return;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL:
				setDescribesVerificationDetail((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC:
				setPrecludesCFC(PRECLUDES_CFC_EDEFAULT);
				return;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL:
				setDescribesDesignDetail(DESCRIBES_DESIGN_DETAIL_EDEFAULT);
				return;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL:
				setDescribesVerificationDetail(DESCRIBES_VERIFICATION_DETAIL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__PRECLUDES_CFC:
				return precludesCFC != PRECLUDES_CFC_EDEFAULT;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_DESIGN_DETAIL:
				return describesDesignDetail != DESCRIBES_DESIGN_DETAIL_EDEFAULT;
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT__DESCRIBES_VERIFICATION_DETAIL:
				return describesVerificationDetail != DESCRIBES_VERIFICATION_DETAIL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___TRACE_DEPENDENCY_IS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return TraceDependencyIsRequired((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___DERIVED_HLR__DIAGNOSTICCHAIN_MAP:
				return DerivedHLR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___DESIGN_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP:
				return DesignDetailRequiresRationale((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___VERIFICATION_DETAIL_REQUIRES_RATIONALE__DIAGNOSTICCHAIN_MAP:
				return VerificationDetailRequiresRationale((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___COPY_AN_SRATS__DIAGNOSTICCHAIN_MAP:
				return CopyAnSRATS((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___COUPLED_WITH_ANOTHER_HLR__DIAGNOSTICCHAIN_MAP:
				return CoupledWithAnotherHLR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___DERIVE_AN_HLR__DIAGNOSTICCHAIN_MAP:
				return DeriveAnHLR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.HIGH_LEVEL_REQUIREMENT___REFINE_AN_SRATS__DIAGNOSTICCHAIN_MAP:
				return RefineAnSRATS((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (precludesCFC: ");
		result.append(precludesCFC);
		result.append(", describesDesignDetail: ");
		result.append(describesDesignDetail);
		result.append(", describesVerificationDetail: ");
		result.append(describesVerificationDetail);
		result.append(')');
		return result.toString();
	}

} //HighLevelRequirementImpl
