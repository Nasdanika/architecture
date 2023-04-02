package org.nasdanika.architecture.cloud.azure.compute.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.nasdanika.architecture.cloud.azure.compute.ComputePackage;
import org.nasdanika.ncore.util.NcoreUtil;

class TestURIs {

	@Test
	void testECoreURI() {
		List<URI> mapIdentifiers = NcoreUtil.getIdentifiers(ComputePackage.Literals.VIRTUAL_MACHINE__DISKS);
		assertEquals(1, mapIdentifiers.size());
		assertEquals(URI.createURI("ecore://nasdanika.org/architecture/cloud/azure/compute/eClassifiers/VirtualMachine/eStructuralFeatures/disks"), mapIdentifiers.get(0));
	}

}
