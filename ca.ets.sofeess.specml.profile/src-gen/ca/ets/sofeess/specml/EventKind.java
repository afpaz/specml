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
 * A representation of the literals of the enumeration '<em><b>Event Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.specml.SpecMLPackage#getEventKind()
 * @model
 * @generated
 */
public enum EventKind implements Enumerator {
	/**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(0, "start", "start"),

	/**
	 * The '<em><b>Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_VALUE
	 * @generated
	 * @ordered
	 */
	FINISH(1, "finish", "finish"),

	/**
	 * The '<em><b>Send</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(2, "send", "send"),

	/**
	 * The '<em><b>Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVE(3, "receive", "receive"),

	/**
	 * The '<em><b>Consume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUME_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUME(4, "consume", "consume");

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model name="start"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 0;

	/**
	 * The '<em><b>Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH
	 * @model name="finish"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_VALUE = 1;

	/**
	 * The '<em><b>Send</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model name="send"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 2;

	/**
	 * The '<em><b>Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVE
	 * @model name="receive"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_VALUE = 3;

	/**
	 * The '<em><b>Consume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUME
	 * @model name="consume"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUME_VALUE = 4;

	/**
	 * An array of all the '<em><b>Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventKind[] VALUES_ARRAY =
		new EventKind[] {
			START,
			FINISH,
			SEND,
			RECEIVE,
			CONSUME,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind get(int value) {
		switch (value) {
			case START_VALUE: return START;
			case FINISH_VALUE: return FINISH;
			case SEND_VALUE: return SEND;
			case RECEIVE_VALUE: return RECEIVE;
			case CONSUME_VALUE: return CONSUME;
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
	private EventKind(int value, String name, String literal) {
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
	
} //EventKind
