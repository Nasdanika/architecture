package org.nasdanika.architecture.core.gen;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.html.model.app.gen.SemanticSiteGenerator;
import org.nasdanika.html.model.app.gen.SiteGeneratorContributor;

public class CoreSiteGenerator extends SemanticSiteGenerator {

	@Override
	protected Collection<SiteGeneratorContributor> getContributors() {
		Collection<SiteGeneratorContributor> contributors = new ArrayList<>(super.getContributors());
		contributors.add(new CoreSiteGeneratorContributor());
		return contributors;
	}

}
