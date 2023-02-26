package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Stakeholder;
import org.nasdanika.common.Context;

public class StakeholderActionBuilder<T extends Stakeholder> extends ModelElementActionBuilder<T> {
	
	public StakeholderActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
