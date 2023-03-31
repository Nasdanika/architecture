package org.nasdanika.architecture.c4.gen;

import java.util.List;
import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.architecture.core.gen.NodeActionBuilder;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;

public class SystemActionBuilder<T extends org.nasdanika.architecture.c4.System> extends NodeActionBuilder<T> {
	
	public SystemActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		createElementActions(ret, registry, resolveConsumer, progressMonitor);						
		return ret;
	}
	
	protected void createElementActions(
			Action action,
			BiConsumer<EObject,Action> registry, 
			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
			ProgressMonitor progressMonitor) {
		
		List<EObject> children = action.getChildren();
		for (ModelElement element: getTarget().getElements()) {
			children.add(createChildAction(element, registry, resolveConsumer, progressMonitor));
		}
	}	
	
}
