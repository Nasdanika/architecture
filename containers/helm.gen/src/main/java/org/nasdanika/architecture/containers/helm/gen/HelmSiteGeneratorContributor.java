package org.nasdanika.architecture.containers.helm.gen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.architecture.containers.helm.HelmPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.gen.SiteGeneratorContributor;

public class HelmSiteGeneratorContributor implements SiteGeneratorContributor {

	@Override
	public void configureSemanticModelResourceSet(ResourceSet resourceSet, Context context, ProgressMonitor progressMonitor) {
		resourceSet.getPackageRegistry().put(HelmPackage.eNS_URI, HelmPackage.eINSTANCE);
	}

	@Override
	public List<AdapterFactory> createActionProviderAdapterFactories(
			Context context, 
			Diagnostic instanceDiagnostic,
			ProgressMonitor progressMonitor) {
		
		return Collections.singletonList(new HelmActionProviderAdapterFactory(context, instanceDiagnostic));
	}
		
}
