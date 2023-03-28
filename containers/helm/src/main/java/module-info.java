module org.nasdanika.architecture.containers.helm {
	
	requires transitive org.nasdanika.architecture.containers.kubernetes;
	
	exports org.nasdanika.architecture.containers.helm;
	exports org.nasdanika.architecture.containers.helm.impl;
	exports org.nasdanika.architecture.containers.helm.util;	
}