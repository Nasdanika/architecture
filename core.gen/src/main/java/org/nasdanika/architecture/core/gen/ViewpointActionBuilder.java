package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Viewpoint;
import org.nasdanika.common.Context;

public class ViewpointActionBuilder<T extends Viewpoint> extends ModelElementActionBuilder<T> {
	
	public ViewpointActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
