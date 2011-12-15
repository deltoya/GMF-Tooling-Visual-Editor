/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.mappings.CompartmentMapping;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentRoot <em>Parent Root</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartmentMapping <em>Compartment Mapping</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartmentLabel <em>Compartment Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleCompartmentImpl extends EObjectImpl implements SimpleCompartment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleChildNode> getChildren() {
		return (EList<SimpleChildNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_PARENT_NODE__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParentNode getParentNode() {
		return (SimpleParentNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(SimpleParentNode newParentNode) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, newParentNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNode getParent() {
		return (SimpleNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SimpleNode newParent) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParentNode getParentRoot() {
		return (SimpleParentNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentRoot() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_ROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMapping getParentMapping() {
		return (SimpleMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMapping(SimpleMapping newParentMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, newParentMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentMapping getCompartmentMapping() {
		return (CompartmentMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentMapping(CompartmentMapping newCompartmentMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING, newCompartmentMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		return (Compartment)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompartment() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getCompartmentLabel() {
		return (Label)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompartmentLabel() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_NODE: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_ROOT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_ROOT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_ROOT: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_ROOT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleCompartmentImpl
