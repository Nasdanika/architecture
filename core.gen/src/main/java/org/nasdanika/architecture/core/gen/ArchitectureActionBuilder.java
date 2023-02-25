package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Architecture;
import org.nasdanika.common.Context;

public class ArchitectureActionBuilder<T extends Architecture> extends ArchitectureElementActionBuilder<T> {
	
	public ArchitectureActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
