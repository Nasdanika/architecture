package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Concern;
import org.nasdanika.common.Context;

public class ConcernActionBuilder<T extends Concern> extends ModelElementActionBuilder<T> {
	
	public ConcernActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
