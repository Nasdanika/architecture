module org.nasdanika.architecture.servicemesh.istio {
	
	requires transitive org.nasdanika.architecture.containers.kubernetes;
	
	exports org.nasdanika.architecture.servicemesh.istio;
	exports org.nasdanika.architecture.servicemesh.istio.impl;
	exports org.nasdanika.architecture.servicemesh.istio.util;	
}