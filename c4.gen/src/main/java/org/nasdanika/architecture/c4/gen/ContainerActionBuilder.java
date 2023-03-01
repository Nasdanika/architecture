package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.Container;
import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;

public class ContainerActionBuilder<T extends Container> extends NodeActionBuilder<T> {
	
	public ContainerActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
