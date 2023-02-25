package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Impact;
import org.nasdanika.common.Context;

public class ImpactActionBuilder<T extends Impact> extends ModelElementActionBuilder<T> {
	
	public ImpactActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
