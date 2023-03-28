module org.nasdanika.architecture.containers.kubernetes {
	
	requires transitive org.nasdanika.architecture.containers.docker;
	
	exports org.nasdanika.architecture.containers.kubernetes;
	exports org.nasdanika.architecture.containers.kubernetes.impl;
	exports org.nasdanika.architecture.containers.kubernetes.util;	
}