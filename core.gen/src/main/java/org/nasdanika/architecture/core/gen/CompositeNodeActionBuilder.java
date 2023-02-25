package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.CompositeNode;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.common.Context;
import org.nasdanika.html.emf.NcoreActionBuilder;

public class CompositeNodeActionBuilder<T extends CompositeNode> extends NodeActionBuilder<T> {
	
	public CompositeNodeActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
