package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.Technology;
import org.nasdanika.architecture.core.gen.ArchitectureElementActionBuilder;
import org.nasdanika.common.Context;

public class TechnologyActionBuilder<T extends Technology> extends ArchitectureElementActionBuilder<T> {
	
	public TechnologyActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
