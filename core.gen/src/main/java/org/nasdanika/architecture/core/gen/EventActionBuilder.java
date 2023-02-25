package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Event;
import org.nasdanika.common.Context;

public class EventActionBuilder<T extends Event> extends ModelElementActionBuilder<T> {
	
	public EventActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
