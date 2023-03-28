package org.nasdanika.architecture.servicemesh.istio.gen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.architecture.servicemesh.istio.IstioPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.model.app.gen.SiteGeneratorContributor;

public class IstioSiteGeneratorContributor implements SiteGeneratorContributor {

	@Override
	public void configureSemanticModelResourceSet(ResourceSet resourceSet, Context context, ProgressMonitor progressMonitor) {
		resourceSet.getPackageRegistry().put(IstioPackage.eNS_URI, IstioPackage.eINSTANCE);
	}

	@Override
	public List<AdapterFactory> createActionProviderAdapterFactories(
			Context context, 
			Diagnostic instanceDiagnostic,
			ProgressMonitor progressMonitor) {
		
		return Collections.singletonList(new IstioActionProviderAdapterFactory(context, instanceDiagnostic));
	}
		
}
