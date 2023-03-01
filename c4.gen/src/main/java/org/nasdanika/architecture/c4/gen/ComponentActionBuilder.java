package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.Component;
import org.nasdanika.common.Context;

public class ComponentActionBuilder<T extends Component> extends ModuleActionBuilder<T> {
	
	public ComponentActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
