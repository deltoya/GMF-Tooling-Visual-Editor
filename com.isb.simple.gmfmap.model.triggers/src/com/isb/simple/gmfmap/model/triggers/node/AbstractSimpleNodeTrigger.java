package com.isb.simple.gmfmap.model.triggers.node;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import com.isb.simple.gmfmap.model.triggers.AbstractTrigger;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;

public abstract class AbstractSimpleNodeTrigger extends AbstractTrigger {

	protected SimpleNode simpleNode;
	
	public AbstractSimpleNodeTrigger(TransactionalEditingDomain domain, SimpleNode simpleNode) {
		super(domain);
		
		this.simpleNode = simpleNode;
	}


}
