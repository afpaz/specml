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

package ca.ets.sofeess.specml.customimpl;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.emf.common.util.EList;

import ca.ets.sofeess.specml.Copy;
import ca.ets.sofeess.specml.Coupled;
import ca.ets.sofeess.specml.Derive;
import ca.ets.sofeess.specml.Formalization;
import ca.ets.sofeess.specml.PropertyBasedStatement;
import ca.ets.sofeess.specml.RefineReqt;
import ca.ets.sofeess.specml.Requirement;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.impl.RequirementImpl;

public class RequirementCustomImpl extends RequirementImpl implements Requirement {

	@Override
	public EList<Requirement> getRefinedBy() {
		EList<Requirement> refinedBy = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getTargetDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				RefineReqt refineReqt = UMLUtil.getStereotypeApplication(directedRelationship, RefineReqt.class);
				
				if (refineReqt != null) {
					EList<NamedElement> clients = refineReqt.getBase_Dependency().getClients();
					Iterator<NamedElement> clientsIterator = clients.iterator();
					
					while (clientsIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(clientsIterator.next(), Requirement.class);
						
						if (requirement != null) {
							refinedBy.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_RefinedBy(), refinedBy.size(), refinedBy.toArray());
	}

	@Override
	public EList<Requirement> getRefinedFrom() {
		EList<Requirement> refinedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				RefineReqt refineReqt = UMLUtil.getStereotypeApplication(directedRelationship, RefineReqt.class);
				
				if (refineReqt != null) {
					EList<NamedElement> suppliers = refineReqt.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							refinedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_RefinedFrom(), refinedFrom.size(), refinedFrom.toArray());
	}

	@Override
	public EList<Requirement> getCoupledTo() {
		EList<Requirement> coupledTo = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getTargetDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Coupled coupled = UMLUtil.getStereotypeApplication(directedRelationship, Coupled.class);
				
				if (coupled != null) {
					EList<NamedElement> clients = coupled.getBase_Dependency().getClients();
					Iterator<NamedElement> clientsIterator = clients.iterator();
					
					while (clientsIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(clientsIterator.next(), Requirement.class);
						
						if (requirement != null) {
							coupledTo.add(requirement);
						}
					}
				}
			}
			
			directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Coupled coupled = UMLUtil.getStereotypeApplication(directedRelationship, Coupled.class);
				
				if (coupled != null) {
					EList<NamedElement> suppliers = coupled.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							if (!coupledTo.contains(requirement)) {
								coupledTo.add(requirement);
							}
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_CoupledTo(), coupledTo.size(), coupledTo.toArray());
	}

	@Override
	public EList<Requirement> getCopiedFrom() {
		EList<Requirement> copiedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Copy copy = UMLUtil.getStereotypeApplication(directedRelationship, Copy.class);
				
				if (copy != null) {
					EList<NamedElement> suppliers = copy.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							copiedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_CopiedFrom(), copiedFrom.size(), copiedFrom.toArray());
	}

	@Override
	public EList<Requirement> getDerivedFrom() {
		EList<Requirement> derivedFrom = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Derive derive = UMLUtil.getStereotypeApplication(directedRelationship, Derive.class);
				
				if (derive != null) {
					EList<NamedElement> suppliers = derive.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), Requirement.class);
						
						if (requirement != null) {
							derivedFrom.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_DerivedFrom(), derivedFrom.size(), derivedFrom.toArray());
	}

	@Override
	public EList<String> getFormalizedAs() {
		EList<String> formalizedAs = new BasicEList<String>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Formalization formalization = UMLUtil.getStereotypeApplication(directedRelationship, Formalization.class);
				
				if (formalization != null) {
					EList<NamedElement> suppliers = formalization.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						PropertyBasedStatement propertyBasedStatement = UMLUtil.getStereotypeApplication(suppliersIterator.next(), PropertyBasedStatement.class);
						
						if (propertyBasedStatement != null) {
							formalizedAs.add(propertyBasedStatement.getStatement());
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getRequirement_FormalizedAs(), formalizedAs.size(), formalizedAs.toArray());
	}

}
