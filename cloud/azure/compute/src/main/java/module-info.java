module org.nasdanika.architecture.cloud.azure.compute {
	
	requires transitive org.nasdanika.architecture.cloud.azure.networking;
	requires transitive org.nasdanika.architecture.containers.kubernetes;
	
	exports org.nasdanika.architecture.cloud.azure.compute;
	exports org.nasdanika.architecture.cloud.azure.compute.impl;
	exports org.nasdanika.architecture.cloud.azure.compute.util;	
}