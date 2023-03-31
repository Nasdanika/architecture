package org.nasdanika.architecture.cloud.azure.core.gen;

import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.architecture.cloud.azure.core.Resource;
import org.nasdanika.architecture.cloud.azure.core.ResourceGroup;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;

public class ResourceGroupActionBuilder extends AzureElementActionBuilder<ResourceGroup> {
	
	public ResourceGroupActionBuilder(ResourceGroup value, Context context) {
		super(value, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		createResourceActions(ret, registry, resolveConsumer, progressMonitor);						
		return ret;
	}
	
	protected void createResourceActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<EObject> children = action.getChildren();
		for (Resource resource: getTarget().getResources()) {
			children.add(createChildAction(resource, registry, resolveConsumer, progressMonitor));
		}
	}	
		
}
