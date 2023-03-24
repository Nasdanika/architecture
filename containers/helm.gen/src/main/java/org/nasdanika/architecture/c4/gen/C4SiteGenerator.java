package org.nasdanika.architecture.c4.gen;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.architecture.core.gen.CoreSiteGenerator;
import org.nasdanika.html.model.app.gen.SiteGeneratorContributor;

public class C4SiteGenerator extends CoreSiteGenerator {

	@Override
	protected Collection<SiteGeneratorContributor> getContributors() {
		Collection<SiteGeneratorContributor> contributors = new ArrayList<>(super.getContributors());
		contributors.add(new C4SiteGeneratorContributor());
		return contributors;
	}

}
