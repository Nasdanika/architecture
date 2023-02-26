package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Tag;
import org.nasdanika.common.Context;

public class TagActionBuilder<T extends Tag> extends ModelElementActionBuilder<T> {
	
	public TagActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
