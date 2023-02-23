package org.nasdanika.architecture.c4.gen;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.architecture.core.gen.CoreActionProviderAdapterFactory;
import org.nasdanika.common.Context;
import org.nasdanika.emf.DiagnosticProvider;
import org.nasdanika.emf.DiagnosticProviderAdapter;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.html.emf.ActionProviderAdapterFactory;
import org.nasdanika.html.model.app.util.ActionProvider;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class C4ActionProviderAdapterFactory extends CoreActionProviderAdapterFactory {
	
	public C4ActionProviderAdapterFactory(Context context) {
		super(context);
		
		// Registering adapter factories.
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Persona>(
//				EngineeringPackage.Literals.PERSONA, 
//				ActionProvider.class, 
//				this.getClass().getClassLoader(), 
//				e -> new PersonaActionBuilder<Persona>(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Engineer>(
//					EngineeringPackage.Literals.ENGINEER, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new EngineerActionBuilder<Engineer>(e, context).asActionProvider()));
//			
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Organization>(
//					EngineeringPackage.Literals.ORGANIZATION, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new OrganizationActionBuilder<>(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.ProductOrganization>(
//					EngineeringPackage.Literals.PRODUCT_ORGANIZATION, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ProductOrganizationActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Module>(
//					EngineeringPackage.Literals.MODULE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ModuleActionBuilder<org.nasdanika.engineering.Module>(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Domain>(
//					EngineeringPackage.Literals.DOMAIN, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new DomainActionBuilder(e, context).asActionProvider()));
//	
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Product>(
//					EngineeringPackage.Literals.PRODUCT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ProductActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Goal>(
//					EngineeringPackage.Literals.GOAL, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new GoalActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Principle>(
//					EngineeringPackage.Literals.PRINCIPLE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new PrincipleActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.IssueCategory>(
//					EngineeringPackage.Literals.ISSUE_CATEGORY, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IssueCategoryActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.EngineeredElementStatus>(
//					EngineeringPackage.Literals.ENGINEERED_ELEMENT_STATUS, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new EngineeredElementStatusActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Interface>(
//					EngineeringPackage.Literals.INTERFACE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new InterfaceActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.IssuePriority>(
//					EngineeringPackage.Literals.ISSUE_PRIORITY, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IssuePriorityActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.IssueSeverity>(
//					EngineeringPackage.Literals.ISSUE_SEVERITY, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IssueSeverityActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.IssueStatus>(
//					EngineeringPackage.Literals.ISSUE_STATUS, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IssueStatusActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Issue>(
//					EngineeringPackage.Literals.ISSUE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IssueActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Feature>(
//					EngineeringPackage.Literals.FEATURE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new FeatureActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Release>(
//					EngineeringPackage.Literals.RELEASE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ReleaseActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, org.nasdanika.engineering.Increment>(
//					EngineeringPackage.Literals.INCREMENT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new IncrementActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, KeyResult>(
//					EngineeringPackage.Literals.KEY_RESULT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new KeyResultActionBuilder<KeyResult>(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Objective>(
//					EngineeringPackage.Literals.OBJECTIVE, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ObjectiveActionBuilder(e, context).asActionProvider()));
//		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Forum>(
//					EngineeringPackage.Literals.FORUM, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ForumActionBuilder<Forum>(e, context).asActionProvider()));
//
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Topic>(
//					EngineeringPackage.Literals.TOPIC, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new TopicActionBuilder(e, context).asActionProvider()));
//
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Connection>(
//					EngineeringPackage.Literals.CONNECTION, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new ConnectionActionBuilder(e, context).asActionProvider()));
//
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Document>(
//					EngineeringPackage.Literals.DOCUMENT, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new DocumentActionBuilder(e, context).asActionProvider()));
//
//		registerAdapterFactory(
//				new FunctionAdapterFactory<ActionProvider, Directory>(
//					EngineeringPackage.Literals.DIRECTORY, 
//					ActionProvider.class, 
//					this.getClass().getClassLoader(), 
//					e -> new DirectoryActionBuilder(e, context).asActionProvider()));
		
	}
			
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		if (type == DiagnosticProvider.class) {
			return new DiagnosticProviderAdapter(target, this::getDiagnostic, this::getFeatureDiagnostic);
		}
		return super.adaptNew(target, type);
	}
	
	@Override
	public boolean isFactoryForType(Object type) {
		return super.isFactoryForType(type) || type == DiagnosticProvider.class;
	}
	
	protected Collection<Diagnostic> getDiagnostic(Notifier target) {
		return Collections.emptyList();
	}

	protected Collection<Diagnostic> getFeatureDiagnostic(Notifier target, EStructuralFeature feature) {
		return Collections.emptyList();
	}
	
}
