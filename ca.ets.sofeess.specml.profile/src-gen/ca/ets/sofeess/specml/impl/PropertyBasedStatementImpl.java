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

import ca.ets.sofeess.specml.PropertyBasedStatement;
import ca.ets.sofeess.specml.Requirement;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.util.SpecValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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
 * An implementation of the model object '<em><b>Property Based Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getId <em>Id</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getText <em>Text</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl#getFormalizationFor <em>Formalization For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyBasedStatementImpl extends MinimalEObjectImpl.Container implements PropertyBasedStatement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyBasedStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecMLPackage.Literals.PROPERTY_BASED_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.PROPERTY_BASED_STATEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.PROPERTY_BASED_STATEMENT__TEXT, oldText, text));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		// TODO: implement this method to return the 'Condition' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		// TODO: implement this method to set the 'Condition' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredicate() {
		// TODO: implement this method to return the 'Predicate' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(String newPredicate) {
		// TODO: implement this method to set the 'Predicate' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		// TODO: implement this method to return the 'Statement' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		// TODO: implement this method to set the 'Statement' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getFormalizationFor() {
		// TODO: implement this method to return the 'Formalization For' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoNestedClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_NESTED_CLASSIFIERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoNestedClassifiers", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean NoAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_ASSOCIATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoAssociations", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean NoGeneralizations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_GENERALIZATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoGeneralizations", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean NoOwnedAttributes(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_OWNED_ATTRIBUTES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoOwnedAttributes", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean NoOwnedOperations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_OWNED_OPERATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoOwnedOperations", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean NoOtherStereotype(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__NO_OTHER_STEREOTYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoOtherStereotype", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean IDMustBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__ID_MUST_BE_UNIQUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "IDMustBeUnique", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ConstraintBlockSupplier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SpecValidator.PROPERTY_BASED_STATEMENT__CONSTRAINT_BLOCK_SUPPLIER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstraintBlockSupplier", EObjectValidator.getObjectLabel(this, context) }),
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
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__ID:
				return getId();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__TEXT:
				return getText();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__CONDITION:
				return getCondition();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__PREDICATE:
				return getPredicate();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__STATEMENT:
				return getStatement();
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR:
				return getFormalizationFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__ID:
				setId((String)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__TEXT:
				setText((String)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__CONDITION:
				setCondition((String)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__PREDICATE:
				setPredicate((String)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__STATEMENT:
				setStatement((String)newValue);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR:
				getFormalizationFor().clear();
				getFormalizationFor().addAll((Collection<? extends Requirement>)newValue);
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
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR:
				getFormalizationFor().clear();
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
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__BASE_CLASS:
				return base_Class != null;
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__PREDICATE:
				return PREDICATE_EDEFAULT == null ? getPredicate() != null : !PREDICATE_EDEFAULT.equals(getPredicate());
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__STATEMENT:
				return STATEMENT_EDEFAULT == null ? getStatement() != null : !STATEMENT_EDEFAULT.equals(getStatement());
			case SpecMLPackage.PROPERTY_BASED_STATEMENT__FORMALIZATION_FOR:
				return !getFormalizationFor().isEmpty();
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
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP:
				return NoNestedClassifiers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return NoAssociations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_GENERALIZATIONS__DIAGNOSTICCHAIN_MAP:
				return NoGeneralizations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_OWNED_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
				return NoOwnedAttributes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_OWNED_OPERATIONS__DIAGNOSTICCHAIN_MAP:
				return NoOwnedOperations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___NO_OTHER_STEREOTYPE__DIAGNOSTICCHAIN_MAP:
				return NoOtherStereotype((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___ID_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return IDMustBeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SpecMLPackage.PROPERTY_BASED_STATEMENT___CONSTRAINT_BLOCK_SUPPLIER__DIAGNOSTICCHAIN_MAP:
				return ConstraintBlockSupplier((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //PropertyBasedStatementImpl
