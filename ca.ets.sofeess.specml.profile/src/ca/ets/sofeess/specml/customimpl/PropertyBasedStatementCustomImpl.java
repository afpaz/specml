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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.sysml14.constraintblocks.ConstraintBlock;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.util.UMLUtil;

import ca.ets.sofeess.specml.Condition;
import ca.ets.sofeess.specml.Formalization;
import ca.ets.sofeess.specml.Predicate;
import ca.ets.sofeess.specml.PropertyBasedStatement;
import ca.ets.sofeess.specml.Requirement;
import ca.ets.sofeess.specml.SpecMLPackage;
import ca.ets.sofeess.specml.impl.PropertyBasedStatementImpl;

public class PropertyBasedStatementCustomImpl extends PropertyBasedStatementImpl implements PropertyBasedStatement {

	@Override
	public String getCondition() {
		String conditionString = "";
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Condition condition = UMLUtil.getStereotypeApplication(directedRelationship, Condition.class);
				
				if (condition != null) {
					EList<NamedElement> suppliers = condition.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						ConstraintBlock conditionConstraintBlock = UMLUtil.getStereotypeApplication(suppliersIterator.next(), ConstraintBlock.class);
						
						if (conditionConstraintBlock != null) {
							EList<Constraint> constraints = conditionConstraintBlock.getBase_Class().getOwnedRules();
							
							conditionString += "when ";
							
							int i = 0;
							for (Constraint constraint : constraints) {
								conditionString += ((OpaqueExpression) constraint.getSpecification()).getBodies().get(0);
								i++;
								if (constraints.size() > 1 && i < constraints.size()) {
									conditionString += " and ";
								}
							}
							
							conditionString += " -> ";
						}
					}
				}
			}
		}
		return conditionString;
	}

	@Override
	public String getPredicate() {
		String predicateString = "";
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getSourceDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Predicate predicate = UMLUtil.getStereotypeApplication(directedRelationship, Predicate.class);
				
				if (predicate != null) {
					EList<NamedElement> suppliers = predicate.getBase_Dependency().getSuppliers();
					Iterator<NamedElement> suppliersIterator = suppliers.iterator();
					
					while (suppliersIterator.hasNext()) {
						ConstraintBlock predicateConstraintBlock = UMLUtil.getStereotypeApplication(suppliersIterator.next(), ConstraintBlock.class);
						
						if (predicateConstraintBlock != null) {
							EList<Constraint> constraints = predicateConstraintBlock.getBase_Class().getOwnedRules();
							
							int i = 0;
							for (Constraint constraint : constraints) {
								predicateString += ((OpaqueExpression) constraint.getSpecification()).getBodies().get(0);
								i++;
								if (constraints.size() > 1 && i < constraints.size()) {
									predicateString += " and ";
								}
							}
							
							if (predicateString.isEmpty() && constraints.isEmpty() && suppliers.size() == 1) {
								EList<Classifier> nestedClassifiers = predicateConstraintBlock.getBase_Class().getNestedClassifiers();
								List<ConstraintBlock> nestedConstraintBlocks = new LinkedList<ConstraintBlock>();
								
								for (Classifier classifier : nestedClassifiers) {
									ConstraintBlock nestedConstraintBlock = UMLUtil.getStereotypeApplication(classifier, ConstraintBlock.class);
									
									if (nestedConstraintBlock != null) {
										nestedConstraintBlocks.add(nestedConstraintBlock);
									}
								}
								
								int j = 0;
								for (ConstraintBlock nestedConstraintBlock : nestedConstraintBlocks) {
									EList<Constraint> nestedConstraints = nestedConstraintBlock.getBase_Class().getOwnedRules();
									
									int k = 0;
									for (Constraint constraint : nestedConstraints) {
										predicateString += ((OpaqueExpression) constraint.getSpecification()).getBodies().get(0);
										k++;
										if (nestedConstraints.size() > 1 && k < nestedConstraints.size()) {
											predicateString += " and ";
										}
									}
									j++;
									if (nestedConstraintBlocks.size() > 1 && j < nestedConstraintBlocks.size()) {
										predicateString += " and ";
									}
								}
							}
						}
					}
				}
			}
		}
		return predicateString;
	}

	@Override
	public String getStatement() {
		return getCondition() + getPredicate();
	}

	@Override
	public EList<Requirement> getFormalizationFor() {
		EList<Requirement> formalizationFor = new BasicEList<Requirement>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> directedRelationshipsIterator = getBase_Class().getTargetDirectedRelationships().iterator();
			
			while (directedRelationshipsIterator.hasNext()) {
				DirectedRelationship directedRelationship = (DirectedRelationship) directedRelationshipsIterator.next();
				Formalization formalization = UMLUtil.getStereotypeApplication(directedRelationship, Formalization.class);
				
				if (formalization != null) {
					EList<NamedElement> clients = formalization.getBase_Dependency().getClients();
					Iterator<NamedElement> clientsIterator = clients.iterator();
					
					while (clientsIterator.hasNext()) {
						Requirement requirement = UMLUtil.getStereotypeApplication(clientsIterator.next(), Requirement.class);
						
						if (requirement != null) {
							formalizationFor.add(requirement);
						}
					}
				}
			}
		}
		return new UnmodifiableEList<>(this, SpecMLPackage.eINSTANCE.getPropertyBasedStatement_FormalizationFor(), formalizationFor.size(), formalizationFor.toArray());
	}

}
