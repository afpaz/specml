/*
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

/**
 * @author: Andrés Paz
 */

package ca.ets.sofeess.specml.properties.internal;

import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;

public final class ContextConfigurator {

	/** Configuration manager instance */
	protected static ConfigurationManager configurationManager = ConfigurationManager.getInstance();

	private ContextConfigurator() {
	}

	/**
	 * Disables the context with the given name.
	 * If no such context can be found,
	 * 
	 * @param name
	 *            context name
	 * @see Context
	 */
	public static void disableContext(String name) {
		org.eclipse.papyrus.infra.properties.contexts.Context context = configurationManager.getContext(name);
		if (context != null) {
			try {
				configurationManager.disableContext(context, true);
			} catch (IllegalStateException e) {
				// nothing we can really do
			}
		}
	}

	public interface Context {
		/** AdvanceStyle */
		String ADVANCE_STYLE = "AdvanceStyle";

		/** CSS in Diagrams */
		String CSS = "CSS";

		/** Customization Models */
		String CUSTOMIZATION = "Customization";

		/** Diagram Notation */
		String NOTATION = "notation";

		/** Diagram Styles */
		String STYLE = "style";

		/** Diagram Synchronization */
		String SYNCHRONIZATION = "synchronization";

		/** UML Diagram Symbols */
		String SYMBOLS = "Symbols";

		/** UML Graphical Notation */
		String UML_NOTATION = "UMLNotation";

		/** UML Metamodel */
		String UML = "UML";

		/** UML Profile Externalization */
		String UML_STEREOTYPE_APPLICATION_EXTERNAL_RESOURCE = "UMLStereotypeApplicationExternalResource";

		/** UML Sequence Diagram Notation */
		String SEQUENCE_NOTATION = "SequenceNotation";
	}
}
