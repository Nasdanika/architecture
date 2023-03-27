module org.nasdanika.architecture.cloud.azure.storage {
	
	requires transitive org.nasdanika.architecture.cloud.azure.core;
	
	exports org.nasdanika.architecture.cloud.azure.storage;
	exports org.nasdanika.architecture.cloud.azure.storage.impl;
	exports org.nasdanika.architecture.cloud.azure.storage.util;	
}