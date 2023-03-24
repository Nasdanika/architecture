package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.TechnologyProduct;
import org.nasdanika.common.Context;

public class TechnologyProductActionBuilder<T extends TechnologyProduct> extends TechnologyActionBuilder<T> {
	
	public TechnologyProductActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
