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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirementSource()
 * @model
 * @generated
 */
public enum RequirementSource implements Enumerator {
	/**
	 * The '<em><b>Acquirer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUIRER_VALUE
	 * @generated
	 * @ordered
	 */
	ACQUIRER(0, "Acquirer", "Acquirer"),

	/**
	 * The '<em><b>Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATOR(1, "Operator", "Operator"),

	/**
	 * The '<em><b>Certification Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATION_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATION_AUTHORITY(2, "CertificationAuthority", "CertificationAuthority"),

	/**
	 * The '<em><b>Specialty Engineer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALTY_ENGINEER_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALTY_ENGINEER(3, "SpecialtyEngineer", "SpecialtyEngineer"),

	/**
	 * The '<em><b>Other Stakeholder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_STAKEHOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_STAKEHOLDER(4, "OtherStakeholder", "OtherStakeholder"),

	/**
	 * The '<em><b>Certification Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATION_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATION_STANDARD(5, "CertificationStandard", "CertificationStandard"),

	/**
	 * The '<em><b>Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(6, "Safety", "Safety"),

	/**
	 * The '<em><b>Costs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTS_VALUE
	 * @generated
	 * @ordered
	 */
	COSTS(7, "Costs", "Costs"),

	/**
	 * The '<em><b>Environmental Conditions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTAL_CONDITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENTAL_CONDITIONS(8, "EnvironmentalConditions", "EnvironmentalConditions"),

	/**
	 * The '<em><b>Design</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(9, "Design", "Design"),

	/**
	 * The '<em><b>Production</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTION(10, "Production", "Production"),

	/**
	 * The '<em><b>Tests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTS_VALUE
	 * @generated
	 * @ordered
	 */
	TESTS(11, "Tests", "Tests"),

	/**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(12, "Maintenance", "Maintenance"),

	/**
	 * The '<em><b>Other Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_SOURCE(13, "OtherSource", "OtherSource");

	/**
	 * The '<em><b>Acquirer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acquirer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACQUIRER
	 * @model name="Acquirer"
	 * @generated
	 * @ordered
	 */
	public static final int ACQUIRER_VALUE = 0;

	/**
	 * The '<em><b>Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATOR
	 * @model name="Operator"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATOR_VALUE = 1;

	/**
	 * The '<em><b>Certification Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Certification Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATION_AUTHORITY
	 * @model name="CertificationAuthority"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATION_AUTHORITY_VALUE = 2;

	/**
	 * The '<em><b>Specialty Engineer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specialty Engineer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIALTY_ENGINEER
	 * @model name="SpecialtyEngineer"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALTY_ENGINEER_VALUE = 3;

	/**
	 * The '<em><b>Other Stakeholder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Stakeholder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_STAKEHOLDER
	 * @model name="OtherStakeholder"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_STAKEHOLDER_VALUE = 4;

	/**
	 * The '<em><b>Certification Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Certification Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATION_STANDARD
	 * @model name="CertificationStandard"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATION_STANDARD_VALUE = 5;

	/**
	 * The '<em><b>Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model name="Safety"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 6;

	/**
	 * The '<em><b>Costs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Costs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COSTS
	 * @model name="Costs"
	 * @generated
	 * @ordered
	 */
	public static final int COSTS_VALUE = 7;

	/**
	 * The '<em><b>Environmental Conditions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Environmental Conditions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTAL_CONDITIONS
	 * @model name="EnvironmentalConditions"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENTAL_CONDITIONS_VALUE = 8;

	/**
	 * The '<em><b>Design</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Design</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN
	 * @model name="Design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 9;

	/**
	 * The '<em><b>Production</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Production</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCTION
	 * @model name="Production"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTION_VALUE = 10;

	/**
	 * The '<em><b>Tests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tests</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESTS
	 * @model name="Tests"
	 * @generated
	 * @ordered
	 */
	public static final int TESTS_VALUE = 11;

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="Maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 12;

	/**
	 * The '<em><b>Other Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_SOURCE
	 * @model name="OtherSource"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_SOURCE_VALUE = 13;

	/**
	 * An array of all the '<em><b>Requirement Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementSource[] VALUES_ARRAY =
		new RequirementSource[] {
			ACQUIRER,
			OPERATOR,
			CERTIFICATION_AUTHORITY,
			SPECIALTY_ENGINEER,
			OTHER_STAKEHOLDER,
			CERTIFICATION_STANDARD,
			SAFETY,
			COSTS,
			ENVIRONMENTAL_CONDITIONS,
			DESIGN,
			PRODUCTION,
			TESTS,
			MAINTENANCE,
			OTHER_SOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementSource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementSource get(int value) {
		switch (value) {
			case ACQUIRER_VALUE: return ACQUIRER;
			case OPERATOR_VALUE: return OPERATOR;
			case CERTIFICATION_AUTHORITY_VALUE: return CERTIFICATION_AUTHORITY;
			case SPECIALTY_ENGINEER_VALUE: return SPECIALTY_ENGINEER;
			case OTHER_STAKEHOLDER_VALUE: return OTHER_STAKEHOLDER;
			case CERTIFICATION_STANDARD_VALUE: return CERTIFICATION_STANDARD;
			case SAFETY_VALUE: return SAFETY;
			case COSTS_VALUE: return COSTS;
			case ENVIRONMENTAL_CONDITIONS_VALUE: return ENVIRONMENTAL_CONDITIONS;
			case DESIGN_VALUE: return DESIGN;
			case PRODUCTION_VALUE: return PRODUCTION;
			case TESTS_VALUE: return TESTS;
			case MAINTENANCE_VALUE: return MAINTENANCE;
			case OTHER_SOURCE_VALUE: return OTHER_SOURCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RequirementSource(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RequirementSource
