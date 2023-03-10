package org.nasdanika.architecture.core.gen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.emf.NcoreActionBuilder;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.ncore.util.NcoreUtil;

public class ModelElementActionBuilder<T extends ModelElement> extends NcoreActionBuilder<T> {
	
	public ModelElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
	
	@Override
	protected Action buildAction(
			Action action, 
			BiConsumer<EObject, Action> registry,
			Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer,
			ProgressMonitor progressMonitor) {
		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);
		
		return ret;
	}
	
}
