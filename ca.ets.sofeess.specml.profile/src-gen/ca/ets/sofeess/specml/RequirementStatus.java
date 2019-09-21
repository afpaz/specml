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
 * A representation of the literals of the enumeration '<em><b>Requirement Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage#getRequirementStatus()
 * @model
 * @generated
 */
public enum RequirementStatus implements Enumerator {
	/**
	 * The '<em><b>Pending Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_REVIEW(0, "PendingReview", "PendingReview"),

	/**
	 * The '<em><b>Reviewed And Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_AND_ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWED_AND_ACCEPTED(1, "ReviewedAndAccepted", "ReviewedAndAccepted"),

	/**
	 * The '<em><b>Reviewed And Incorrect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_AND_INCORRECT_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWED_AND_INCORRECT(2, "ReviewedAndIncorrect", "ReviewedAndIncorrect");

	/**
	 * The '<em><b>Pending Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pending Review</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDING_REVIEW
	 * @model name="PendingReview"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_REVIEW_VALUE = 0;

	/**
	 * The '<em><b>Reviewed And Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reviewed And Accepted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_AND_ACCEPTED
	 * @model name="ReviewedAndAccepted"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWED_AND_ACCEPTED_VALUE = 1;

	/**
	 * The '<em><b>Reviewed And Incorrect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reviewed And Incorrect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_AND_INCORRECT
	 * @model name="ReviewedAndIncorrect"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWED_AND_INCORRECT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Requirement Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementStatus[] VALUES_ARRAY =
		new RequirementStatus[] {
			PENDING_REVIEW,
			REVIEWED_AND_ACCEPTED,
			REVIEWED_AND_INCORRECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementStatus get(int value) {
		switch (value) {
			case PENDING_REVIEW_VALUE: return PENDING_REVIEW;
			case REVIEWED_AND_ACCEPTED_VALUE: return REVIEWED_AND_ACCEPTED;
			case REVIEWED_AND_INCORRECT_VALUE: return REVIEWED_AND_INCORRECT;
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
	private RequirementStatus(int value, String name, String literal) {
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
	
} //RequirementStatus
