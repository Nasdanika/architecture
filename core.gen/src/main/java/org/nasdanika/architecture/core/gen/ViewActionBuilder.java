package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.View;
import org.nasdanika.common.Context;

public class ViewActionBuilder<T extends View> extends ModelElementActionBuilder<T> {
	
	public ViewActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
