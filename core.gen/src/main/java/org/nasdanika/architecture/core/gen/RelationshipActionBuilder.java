package org.nasdanika.architecture.core.gen;

import org.nasdanika.architecture.core.Relationship;
import org.nasdanika.common.Context;

public class RelationshipActionBuilder<T extends Relationship> extends ArchitectureElementActionBuilder<T> {
	
	public RelationshipActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
