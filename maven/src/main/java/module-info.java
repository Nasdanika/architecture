module org.nasdanika.architecture.maven {
	requires transitive org.nasdanika.html.model.app.gen.maven;
	requires transitive org.nasdanika.architecture.c4.gen;
	
	requires transitive org.nasdanika.architecture.cloud.azure.compute.gen;
	requires transitive org.nasdanika.architecture.cloud.azure.networking.gen;
	requires transitive org.nasdanika.architecture.cloud.azure.storage.gen;
	
//	requires transitive org.nasdanika.architecture.containers.docker.gen;
//	requires transitive org.nasdanika.architecture.containers.kubernetes.gen;
//	requires transitive org.nasdanika.architecture.containers.helm.gen;
//	requires transitive org.nasdanika.architecture.containers.istio.gen;	
	
	exports org.nasdanika.architecture.maven;
	
}
