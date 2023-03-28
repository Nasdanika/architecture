module org.nasdanika.architecture.servicemesh.istio.gen {
	
	exports org.nasdanika.architecture.servicemesh.istio.gen;
	
	requires transitive org.nasdanika.architecture.containers.kubernetes.gen;
	requires transitive org.nasdanika.architecture.servicemesh.istio;
	
}