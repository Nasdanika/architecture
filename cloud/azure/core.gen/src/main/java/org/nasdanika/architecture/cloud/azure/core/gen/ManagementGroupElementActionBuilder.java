package org.nasdanika.architecture.cloud.azure.core.gen;

import org.nasdanika.architecture.cloud.azure.core.ManagementGroupElement;
import org.nasdanika.common.Context;

public class ManagementGroupElementActionBuilder<T extends ManagementGroupElement> extends AzureElementActionBuilder<T> {
	
	public ManagementGroupElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
		
}
