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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.infra.nattable.tester.ITableTester;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;

import ca.ets.sofeess.specml.SpecMLPackage;

public class HLRsTableTester implements ITableTester {

	@Override
	public IStatus isAllowed(Object context) {
		Status status = null;
		if (context instanceof Element) {
			Element element = (Element) context;
			ISpecializationType type = (ISpecializationType) ElementTypeRegistry.getInstance().getType("ca.ets.sofeess.specml.HighLevelRequirement");
			IElementMatcher matcher = type.getMatcher();
			if (context instanceof Package || matcher.matches(element)) {
				Profile profile = UMLUtil.getProfile(SpecMLPackage.eINSTANCE, element);
				if (profile != null) {
					final String packageQN = profile.getQualifiedName();
					if (element.getNearestPackage().getAppliedProfile(packageQN, true) != null) {
						status = new Status(IStatus.OK, Activator.PLUGIN_ID, "The context allowed to create an HLRs Table");
					} else {
						status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The profile " + packageQN + "is not applied on the model");
					}
				}
			}
		} else {
			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The context is not a UML Element");
		}
		return status;
	}

}
