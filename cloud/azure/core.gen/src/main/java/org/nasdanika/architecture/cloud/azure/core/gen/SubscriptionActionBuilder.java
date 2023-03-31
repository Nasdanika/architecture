package org.nasdanika.architecture.cloud.azure.core.gen;

import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.architecture.cloud.azure.core.ResourceGroup;
import org.nasdanika.architecture.cloud.azure.core.Subscription;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;

public class SubscriptionActionBuilder extends ManagementGroupElementActionBuilder<Subscription> {
	
	public SubscriptionActionBuilder(Subscription value, Context context) {
		super(value, context);		
	}
		
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		createResourceGroupActions(ret, registry, resolveConsumer, progressMonitor);						
		return ret;
	}
	
	protected void createResourceGroupActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<EObject> children = action.getChildren();
		for (ResourceGroup resourceGroup: getTarget().getResourceGroups()) {
			children.add(createChildAction(resourceGroup, registry, resolveConsumer, progressMonitor));
		}
	}	
		
}
