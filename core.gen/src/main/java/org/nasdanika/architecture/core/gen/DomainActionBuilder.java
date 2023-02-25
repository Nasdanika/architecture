package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Domain;
import org.nasdanika.common.Context;

public class DomainActionBuilder<T extends Domain> extends ArchitectureElementActionBuilder<T> {
	
	public DomainActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
