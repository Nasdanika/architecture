package org.nasdanika.architecture.containers.docker.gen;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.architecture.core.gen.CoreActionProviderAdapterFactory;
import org.nasdanika.common.Context;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.model.app.util.ActionProvider;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class DockerActionProviderAdapterFactory extends CoreActionProviderAdapterFactory {
	
	public DockerActionProviderAdapterFactory(Context context) {
		super(context);
	
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Technology>(
//					C4Package.Literals.TECHNOLOGY, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new TechnologyActionBuilder<Technology>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, TechnologyProduct>(
//					C4Package.Literals.TECHNOLOGY_PRODUCT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new TechnologyProductActionBuilder<TechnologyProduct>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, TechnologyVersion>(
//					C4Package.Literals.TECHNOLOGY_VERSION, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new TechnologyVersionActionBuilder<TechnologyVersion>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Relationship>(
//					C4Package.Literals.RELATIONSHIP, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new RelationshipActionBuilder<Relationship>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Person>(
//					C4Package.Literals.PERSON, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new PersonActionBuilder<Person>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.architecture.c4.System>(
//					C4Package.Literals.SYSTEM, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new SystemActionBuilder<org.nasdanika.architecture.c4.System>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Container>(
//					C4Package.Literals.CONTAINER, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ContainerActionBuilder<Container>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Component>(
//					C4Package.Literals.COMPONENT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ComponentActionBuilder<Component>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.architecture.c4.Module>(
//					C4Package.Literals.MODULE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ModuleActionBuilder<org.nasdanika.architecture.c4.Module>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, CodeElement>(
//					C4Package.Literals.CODE_ELEMENT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new CodeElementActionBuilder<CodeElement>(e, context) {
//						
//						@Override
//						protected String getHtmlExtension() {
//							return C4ActionProviderAdapterFactory.this.getHtmlExtension();
//						}
//						
//					}.asActionProvider()));
	}
	
	public DockerActionProviderAdapterFactory(Context context, Diagnostic diagnostic) {
		this(context);
		this.diagnostic = diagnostic;
	}
	
				
}
