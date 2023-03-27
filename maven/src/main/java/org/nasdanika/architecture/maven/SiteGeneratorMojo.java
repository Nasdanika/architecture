package org.nasdanika.architecture.maven;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.nasdanika.architecture.c4.gen.C4SiteGeneratorContributor;
import org.nasdanika.architecture.cloud.azure.compute.gen.ComputeSiteGeneratorContributor;
import org.nasdanika.architecture.cloud.azure.networking.gen.NetworkingSiteGeneratorContributor;
import org.nasdanika.architecture.cloud.azure.storage.gen.StorageSiteGeneratorContributor;
import org.nasdanika.html.model.app.gen.SiteGeneratorContributor;
import org.nasdanika.html.model.app.gen.maven.SemanticSiteGeneratorMojo;

/**
 * Generates action site.
 */
@Mojo(name = "generate-site", defaultPhase = LifecyclePhase.SITE)
public class SiteGeneratorMojo extends SemanticSiteGeneratorMojo {

	@Override
	protected List<SiteGeneratorContributor> getContributors() {
		List<SiteGeneratorContributor> contributors = new ArrayList<>(super.getContributors());
		contributors.add(new C4SiteGeneratorContributor());

		contributors.add(new ComputeSiteGeneratorContributor());
		contributors.add(new NetworkingSiteGeneratorContributor());
		contributors.add(new StorageSiteGeneratorContributor());
		
//		contributors.add(new DockerSiteGeneratorContributor());
//		contributors.add(new KubernetesSiteGeneratorContributor());
//		contributors.add(new HelmSiteGeneratorContributor());
//		contributors.add(new IstioSiteGeneratorContributor());
		
		return contributors;
	}
	

}
