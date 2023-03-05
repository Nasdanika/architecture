package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.CompositeNode;
import org.nasdanika.common.Context;

public class CompositeNodeActionBuilder<T extends CompositeNode> extends NodeActionBuilder<T> {
	
	public CompositeNodeActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
