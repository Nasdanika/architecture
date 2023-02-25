package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Stage;
import org.nasdanika.common.Context;

public class StageActionBuilder<T extends Stage> extends ArchitectureElementActionBuilder<T> {
	
	public StageActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
