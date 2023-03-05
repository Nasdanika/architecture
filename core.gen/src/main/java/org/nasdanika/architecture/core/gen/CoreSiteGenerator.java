package org.nasdanika.architecture.core.gen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.gen.SemanticSiteGenerator;

public class CoreSiteGenerator extends SemanticSiteGenerator {
	
	@Override
	protected ResourceSet createSemanticModelResourceSet(Context context, ProgressMonitor progressMonitor) {
		ResourceSet resourceSet = super.createResourceSet(context, progressMonitor);
		resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		return resourceSet;
	}
	
	@Override
	protected List<AdapterFactory> createActionProviderAdapterFactories(Context context, Diagnostic instanceDiagnostic) {
		return Collections.singletonList(new CoreActionProviderAdapterFactory(context, instanceDiagnostic));
	}		

}
