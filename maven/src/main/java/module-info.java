module org.nasdanika.architecture.maven {
	requires transitive org.nasdanika.html.model.app.gen.maven;
	requires transitive org.nasdanika.architecture.c4.gen;
	
	requires transitive org.nasdanika.architecture.cloud.azure.compute.gen;
	
	TODO - the rest of gen's
	
	exports org.nasdanika.architecture.maven;
	
}
