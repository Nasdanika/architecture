package org.nasdanika.architecture.c4.gen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.architecture.c4.C4Package;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.gen.SemanticSiteGenerator;

public class C4SiteGenerator extends SemanticSiteGenerator {
	
	@Override
	protected ResourceSet createSemanticModelResourceSet(Context context, ProgressMonitor progressMonitor) {
		ResourceSet resourceSet = super.createResourceSet(context, progressMonitor);
		resourceSet.getPackageRegistry().put(C4Package.eNS_URI, C4Package.eINSTANCE);
		return resourceSet;
	}
	
	@Override
	protected List<AdapterFactory> createActionProviderAdapterFactories(Context context, Diagnostic instanceDiagnostic) {
		return Collections.singletonList(new C4ActionProviderAdapterFactory(context, instanceDiagnostic));
	}		

}
