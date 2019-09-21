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

package ca.ets.sofeess.specml.architecture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.sysml14.util.SysMLResource;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

import ca.ets.sofeess.specml.profile.SpecMLResource;

public class SpecModelCreationCommand extends ModelCreationCommandBase {

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Package packageOwner = (Package) owner;
		
		Profile specProfile = (Profile) PackageUtil.loadPackage(URI.createURI(SpecMLResource.PROFILE_PATH), owner.eResource().getResourceSet());
		if (specProfile != null) {
			PackageUtil.applyProfile(packageOwner, specProfile, true);
		}

		Profile sysml = (Profile) PackageUtil.loadPackage(URI.createURI(SysMLResource.PROFILE_PATH), owner.eResource().getResourceSet());
		if (sysml != null) {
			PackageUtil.applyProfile(packageOwner, sysml, true);
		}
		
		Profile standardUMLProfile = (Profile) PackageUtil.loadPackage(URI.createURI(UMLResource.STANDARD_PROFILE_URI), owner.eResource().getResourceSet());
		if (standardUMLProfile != null) {
			PackageUtil.applyProfile(packageOwner, standardUMLProfile, true);
		}
	}
	
}
