package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Node;
import org.nasdanika.common.Context;

public class NodeActionBuilder<T extends Node> extends ArchitectureElementActionBuilder<T> {
	
	public NodeActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
