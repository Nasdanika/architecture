package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.common.Context;

public class ArchitectureElementActionBuilder<T extends ArchitectureElement> extends ModelElementActionBuilder<T> {
	
	public ArchitectureElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
