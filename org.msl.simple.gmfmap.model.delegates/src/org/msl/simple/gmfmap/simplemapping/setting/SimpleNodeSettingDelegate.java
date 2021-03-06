package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleNodeSettingDelegate extends Stateless {

	public SimpleNodeSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE__CONTAINMENT_FEATURE:
		      		return getContainmentFeature((SimpleNode)owner);
		      	case SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT:
		      		return getDomainMetaElement((SimpleNode)owner);		     
		      	case SimplemappingsPackage.SIMPLE_NODE__PARENT_META_ELEMENT:
		      		return getParentMetaElement((SimpleNode)owner);			
		      	case SimplemappingsPackage.SIMPLE_NODE__TOOL:
		      		return getTool((SimpleNode)owner);			      		
		      	case SimplemappingsPackage.SIMPLE_NODE__LABEL_ATTRIBUTES:
		      		return getLabelAttributes((SimpleNode)owner);		
		      	case SimplemappingsPackage.SIMPLE_NODE__NAME:
		      		return getName((SimpleNode)owner);			      		
		      	case SimplemappingsPackage.SIMPLE_NODE__DIAGRAM_NODE:
		      		return getDiagramNode((SimpleNode)owner);	
		      	case SimplemappingsPackage.SIMPLE_NODE__DIAGRAM_LABEL:
		      		return getDiagramLabel((SimpleNode)owner);			      		
		      }
	    
	    }
		
		return null;
	}
	
	
	/**
	 * Devuelve el label por defecto (El primero definido)
	 * @param owner
	 * @return
	 */
	private DiagramLabel getDiagramLabel(SimpleNode owner) {
		
		NodeReference nodeRef = owner.getNodeReference();
		
		if(nodeRef!=null && nodeRef.getChild()!=null)
		{
			NodeMapping nodeMapping = nodeRef.getChild();
			
			//Devolvemos el primer label definido
			if(!nodeMapping.getLabelMappings().isEmpty())
				return nodeMapping.getLabelMappings().get(0).getDiagramLabel();
		}
		
		
		return null;
	}

	private Node getDiagramNode(SimpleNode owner) {
		
		NodeReference nodeRef = owner.getNodeReference();
		
		if(nodeRef!=null && nodeRef.getChild()!=null)
		{
			NodeMapping nodeMapping = nodeRef.getChild();
			
			return nodeMapping.getDiagramNode();
		}
		
		return null;
	}

	private String getName(SimpleNode owner) {
		
		String name = null;
		
		if(owner.getContainmentFeature()!=null)
			name = owner.getContainmentFeature().getName();
			
		if(owner.getDomainMetaElement()!=null)
			name += ":" +  owner.getDomainMetaElement().getName();
		
		return name;
	}

	private Object getLabelAttributes(SimpleNode owner) {
		
		FeatureLabelMapping featureLabelMapping = !owner.getNodeReference().getChild().getLabelMappings().isEmpty()?
													(FeatureLabelMapping)owner.getNodeReference().getChild().getLabelMappings().get(0):null; 
		return featureLabelMapping!=null?featureLabelMapping.getFeatures():new BasicEList<EAttribute>();
	}

	private AbstractTool getTool(SimpleNode owner) {
		
		NodeReference nodeRef = owner.getNodeReference();
		
		if(nodeRef!=null && nodeRef.getChild()!=null)
		{
			NodeMapping nodeMapping = nodeRef.getChild();
			
			return nodeMapping.getTool();
		}
		
		return null;
	}

	private Object getParentMetaElement(SimpleChildNode owner) {
		
		if(owner.getParent() instanceof SimpleNode)
		{
			SimpleNode parent = (SimpleNode)owner.getParent();
			return parent.getDomainMetaElement();
		}
		
		if(owner.getParent() instanceof SimpleCompartment)
		{
			SimpleNode parent = (SimpleNode)((SimpleCompartment)owner.getParent()).getParent();
			return parent.getDomainMetaElement();
		}
		
		if(owner.getParentNode()instanceof SimpleMapping)
		{
			SimpleMapping parent = (SimpleMapping)owner.getParentNode();
			return parent.getMapping().getDiagram().getDomainMetaElement();
		}

		
		return null;
	}
	

	private void refreshNodeName(SimpleNode owner) {
		
		String name = null;
		
		if(owner.getContainmentFeature()!=null)
		{
			EReference feature = owner.getContainmentFeature();
			name = feature.getName();
		}
			
		if(owner.getDomainMetaElement()!=null)
		{
			EClass metaElement = owner.getDomainMetaElement();
			name += ":" +  metaElement.getName();
		}
		
			
		owner.setName(name);
	}

	private Object getDomainMetaElement(SimpleNode owner) {
		return owner.getNodeReference()!=null?owner.getNodeReference().getChild().getDomainMetaElement():null;
	}

	private Object getContainmentFeature(SimpleNode owner) {
		return owner.getNodeReference()!=null?owner.getNodeReference().getContainmentFeature():null;
	}

	@Override
	protected void set(InternalEObject owner, Object newValue) {
		
	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE__CONTAINMENT_FEATURE:
		      		setContainmentFeature((SimpleNode)owner, (EReference)newValue); break;
		      	case SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT:
		      		setDomainMetaElement((SimpleNode)owner, (EClass)newValue); break;		
		      }
	    
	    }
		
	}


	private void setDomainMetaElement(SimpleNode owner, EClass newValue) {
		owner.getNodeReference().getChild().setDomainMetaElement(newValue);
		
		//refreshNodeName(owner);
		
	}

	private void setContainmentFeature(SimpleNode owner, EReference newValue) {
		owner.getNodeReference().setContainmentFeature(newValue);
		
		//refreshNodeName(owner);
		
	}

	@Override
	protected boolean isSet(InternalEObject owner) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE__CONTAINMENT_FEATURE:
		      		return getContainmentFeature((SimpleNode)owner)!=null;
		      }
	    
	    }
		
		return false;
	}

}
