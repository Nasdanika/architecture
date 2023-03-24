package org.nasdanika.architecture.c4.gen;

import org.nasdanika.architecture.c4.CodeElement;
import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;

public class CodeElementActionBuilder<T extends CodeElement> extends NodeActionBuilder<T> {
	
	public CodeElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
}
