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

import ca.ets.sofeess.specml.EventKind;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.TimedInstantObservation;
import ca.ets.sofeess.specml.util.SpecValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Instant Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.impl.TimedInstantObservationImpl#getObsKind <em>Obs Kind</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.TimedInstantObservationImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedInstantObservationImpl extends MinimalEObjectImpl.Container implements TimedInstantObservation {
	/**
	 * The default value of the '{@link #getObsKind() <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsKind()
	 * @generated
	 * @ordered
	 */
	protected static final EventKind OBS_KIND_EDEFAULT = EventKind.START;

	/**
	 * The cached value of the '{@link #getObsKind() <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsKind()
	 * @generated
	 * @ordered
	 */
	protected EventKind obsKind = OBS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedInstantObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecMLPackage.Literals.TIMED_INSTANT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind getObsKind() {
		return obsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObsKind(EventKind newObsKind) {
		EventKind oldObsKind = obsKind;
		obsKind = newObsKind == null ? OBS_KIND_EDEFAULT : newObsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.TIMED_INSTANT_OBSERVATION__OBS_KIND, oldObsKind, obsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AppliedOnPropertyBasedStatement(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.TIMED_INSTANT_OBSERVATION__APPLIED_ON_PROPERTY_BASED_STATEMENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AppliedOnPropertyBasedStatement", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ContainedInTimedDomainNamespace(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.TIMED_INSTANT_OBSERVATION__CONTAINED_IN_TIMED_DOMAIN_NAMESPACE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ContainedInTimedDomainNamespace", EObjectValidator.getObjectLabel(this, context) }),
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
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__OBS_KIND:
				return getObsKind();
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__OBS_KIND:
				setObsKind((EventKind)newValue);
				return;
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__OBS_KIND:
				setObsKind(OBS_KIND_EDEFAULT);
				return;
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__OBS_KIND:
				return obsKind != OBS_KIND_EDEFAULT;
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION__BASE_CLASS:
				return base_Class != null;
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
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION___APPLIED_ON_PROPERTY_BASED_STATEMENT__DIAGNOSTICCHAIN_MAP:
				return AppliedOnPropertyBasedStatement((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.TIMED_INSTANT_OBSERVATION___CONTAINED_IN_TIMED_DOMAIN_NAMESPACE__DIAGNOSTICCHAIN_MAP:
				return ContainedInTimedDomainNamespace((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (obsKind: ");
		result.append(obsKind);
		result.append(')');
		return result.toString();
	}

} //TimedInstantObservationImpl
