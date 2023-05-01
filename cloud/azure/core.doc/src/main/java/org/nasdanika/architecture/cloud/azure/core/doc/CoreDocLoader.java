package org.nasdanika.architecture.cloud.azure.core.doc;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.util.AppObjectLoaderSupplier;
import org.nasdanika.html.model.app.util.DocLoader;

/**
 * Loads documentation actions from classpath resources
 * @author Pavel
 *
 */
public class CoreDocLoader extends DocLoader {
		
	public CoreDocLoader(
			Consumer<org.nasdanika.common.Diagnostic> diagnosticConsumer,
			Context context,
			ProgressMonitor progressMonitor) {		

		prototypes.put(URI.createURI(
				"ecore://nasdanika.org/architecture/cloud/azure/core"), 
				(Action) AppObjectLoaderSupplier.loadObject(URI.createURI("classpath://org/nasdanika/architecture/cloud/azure/core/doc/package-summary.yml"), diagnosticConsumer, context, progressMonitor));
		
		prototypes.put(URI.createURI(
				"ecore://nasdanika.org/architecture/cloud/azure/core/eClassifiers/ResourceGroup"), 
				(Action) AppObjectLoaderSupplier.loadObject(URI.createURI("classpath://org/nasdanika/architecture/cloud/azure/core/doc/ResourceGroup.yml"), diagnosticConsumer, context, progressMonitor));
		
	}

}
