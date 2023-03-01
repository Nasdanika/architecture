package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;

public class ModuleActionBuilder<T extends org.nasdanika.architecture.c4.Module> extends NodeActionBuilder<T> {
	
	public ModuleActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
