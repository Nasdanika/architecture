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
		
		// Carrying over URI's for semantic mapping, discarding relative
		for (URI uri: NcoreUtil.getUris(getTarget())) {
			if (!uri.isRelative()) {
				ret.getUris().add(uri.toString());
			}
		}	
		
		Map<String,String> typeSpec = new LinkedHashMap<>();
		EClass targetEClass = getTarget().eClass();
		typeSpec.put("ns-uri", targetEClass.getEPackage().getNsURI());
		typeSpec.put("name", targetEClass.getName());		
		
		ret.setAnnotation("semantic-type", typeSpec);
		
		return ret;
	}
	
}
