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

package ca.ets.sofeess.specml.tables;

import org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import ca.ets.sofeess.specml.HighLevelRequirement;
import ca.ets.sofeess.specml.SpecMLPackage;

public class HLRsAxisManager
		extends AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager<HighLevelRequirement> {

	@Override
	public boolean canCreateAxisElement(String elementId) {
		return "ca.ets.sofeess.specml.HighLevelRequirement".equals(elementId);
	}

	@Override
	protected HighLevelRequirement getStereotypeApplication(Element element) {
		return UMLUtil.getStereotypeApplication(element, HighLevelRequirement.class);
	}

	@Override
	protected boolean isInstanceOfRequiredStereotypeApplication(Object object) {
		return object instanceof HighLevelRequirement;
	}

	@Override
	protected Element getStereotypeBaseElement(HighLevelRequirement stereotypeApplication) {
		return stereotypeApplication.getBase_Class();
	}

	@Override
	protected boolean isAllowedAsBaseElement(Element element) {
		return element instanceof Class;
	}

	@Override
	protected String getStereotypeApplicationBasePropertyName() {
		return SpecMLPackage.eINSTANCE.getRequirement_Base_Class().getName();
	}

}
