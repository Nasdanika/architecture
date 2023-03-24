package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;

public class SystemActionBuilder<T extends org.nasdanika.architecture.c4.System> extends NodeActionBuilder<T> {
	
	public SystemActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
