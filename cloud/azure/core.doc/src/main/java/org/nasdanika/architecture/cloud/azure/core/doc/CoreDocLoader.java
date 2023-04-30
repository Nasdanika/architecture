package org.nasdanika.architecture.cloud.azure.core.doc;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.util.AppObjectLoaderSupplier;
import org.nasdanika.ncore.ModelElement;

/**
 * Loads documentation actions from classpath resources
 * @author Pavel
 *
 */
public class CoreDocLoader {
	
	private Map<URI, Action> prototypes = new HashMap<>();
	
	public CoreDocLoader(
			Consumer<org.nasdanika.common.Diagnostic> diagnosticConsumer,
			Context context,
			ProgressMonitor progressMonitor) {		
		
		prototypes.put(URI.createURI(
				"ecore://nasdanika.org/architecture/cloud/azure/core/eClassifiers/ResourceGroup"), 
				(Action) AppObjectLoaderSupplier.loadObject(URI.createURI("classpath://org/nasdanika/architecture/cloud/azure/core/doc/ResourceGroup.yml"), diagnosticConsumer, context, progressMonitor));
	}
	
	public Action getPrototype(URI uri) {
		Action prototype = prototypes.get(uri);
		if (prototype == null) {
			return null;
		}
		Action copy = EcoreUtil.copy(prototype);
		copy.setUuid(UUID.randomUUID().toString());
		TreeIterator<EObject> cit = copy.eAllContents();
		while (cit.hasNext()) {
			EObject next = cit.next();
			if (next instanceof ModelElement) {
				((ModelElement) next).setUuid(UUID.randomUUID().toString());
			}
		}
		return copy;
	}

}
