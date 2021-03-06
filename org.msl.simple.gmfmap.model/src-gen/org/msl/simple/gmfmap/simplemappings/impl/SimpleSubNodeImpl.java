/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.Figure;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleRootNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sub Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getSubNodes <em>Sub Nodes</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParentRoot <em>Parent Root</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParentSubNodeReference <em>Parent Sub Node Reference</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getParentRootNode <em>Parent Root Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSubNodeImpl extends EObjectImpl implements SimpleSubNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSubNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_SUB_NODE;
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
	public EList<SimpleSubNode> getSubNodes() {
		return (EList<SimpleSubNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__SUB_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleLinkMapping> getOutputs() {
		return (EList<SimpleLinkMapping>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__OUTPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleLinkMapping> getInputs() {
		return (EList<SimpleLinkMapping>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__INPUTS, true);
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
	public SimpleSubNodeReference getParentSubNodeReference() {
		return (SimpleSubNodeReference)eGet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_SUB_NODE_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSubNodeReference(SimpleSubNodeReference newParentSubNodeReference) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_SUB_NODE_REFERENCE, newParentSubNodeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRootNode getParentRootNode() {
		return (SimpleRootNode)eGet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_ROOT_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRootNode(SimpleRootNode newParentRootNode) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_ROOT_NODE, newParentRootNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleChildNode> getChildren() {
		return (EList<SimpleChildNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #getNodeFigure() <em>Get Node Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeFigure()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NODE_FIGURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE___GET_NODE_FIGURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getNodeFigure() {
		try {
			return (Figure)GET_NODE_FIGURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getLabelFigure() <em>Get Label Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFigure()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_LABEL_FIGURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE___GET_LABEL_FIGURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getLabelFigure() {
		try {
			return (Figure)GET_LABEL_FIGURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
				case SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT;
				case SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_ROOT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_ROOT;
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
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT: return SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_ROOT: return SimplemappingsPackage.SIMPLE_SUB_NODE__PARENT_ROOT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (baseOperationID) {
				case SimplemappingsPackage.SIMPLE_CHILD_NODE___GET_NODE_FIGURE: return SimplemappingsPackage.SIMPLE_SUB_NODE___GET_NODE_FIGURE;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE___GET_LABEL_FIGURE: return SimplemappingsPackage.SIMPLE_SUB_NODE___GET_LABEL_FIGURE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimplemappingsPackage.SIMPLE_SUB_NODE___GET_NODE_FIGURE:
				return getNodeFigure();
			case SimplemappingsPackage.SIMPLE_SUB_NODE___GET_LABEL_FIGURE:
				return getLabelFigure();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleSubNodeImpl
