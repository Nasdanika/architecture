package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.Person;
import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;

public class PersonActionBuilder<T extends Person> extends NodeActionBuilder<T> {
	
	public PersonActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
