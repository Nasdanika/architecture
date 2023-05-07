package org.nasdanika.architecture.cloud.azure.core.doc;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.architecture.cloud.azure.core.CorePackage;
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

		URI nsURI = URI.createURI(CorePackage.eNS_URI);
		URI resourceBase = URI.createURI("classpath://" + CoreDocLoader.class.getName().replace('.', '/'));
		
		prototypes.put(nsURI, (Action) AppObjectLoaderSupplier.loadObject(URI.createURI("package-summary.yml").resolve(resourceBase), diagnosticConsumer, context, progressMonitor));		
		prototypes.put(URI.createURI("eClassifiers/ResourceGroup").resolve(nsURI), (Action) AppObjectLoaderSupplier.loadObject(URI.createURI("ResourceGroup.yml").resolve(resourceBase), diagnosticConsumer, context, progressMonitor));
		
	}

}
