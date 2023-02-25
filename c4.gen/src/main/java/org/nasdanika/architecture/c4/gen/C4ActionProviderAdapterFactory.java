package org.nasdanika.architecture.c4.gen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.architecture.core.gen.CoreActionProviderAdapterFactory;
import org.nasdanika.common.Context;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class C4ActionProviderAdapterFactory extends CoreActionProviderAdapterFactory {
	
	public C4ActionProviderAdapterFactory(Context context) {
		super(context);
		
		
	}
				
}
