package org.nasdanika.architecture.cloud.azure.core.gen;

import org.nasdanika.architecture.cloud.azure.core.AzureElement;
import org.nasdanika.architecture.core.gen.ArchitectureElementActionBuilder;
import org.nasdanika.common.Context;

public class AzureElementActionBuilder<T extends AzureElement> extends ArchitectureElementActionBuilder<T> {
	
	public AzureElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
		
}
