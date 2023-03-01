package org.nasdanika.architecture.core.gen;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.architecture.core.ArchitectureElement;
import org.nasdanika.architecture.core.CompositeNode;
import org.nasdanika.architecture.core.Concern;
import org.nasdanika.architecture.core.CorePackage;
import org.nasdanika.architecture.core.Domain;
import org.nasdanika.architecture.core.Event;
import org.nasdanika.architecture.core.Impact;
import org.nasdanika.architecture.core.Node;
import org.nasdanika.architecture.core.Stage;
import org.nasdanika.architecture.core.Stakeholder;
import org.nasdanika.architecture.core.Tag;
import org.nasdanika.architecture.core.View;
import org.nasdanika.architecture.core.Viewpoint;
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
public class CoreActionProviderAdapterFactory extends ActionProviderAdapterFactory {
	
	public CoreActionProviderAdapterFactory(Context context) {
		super(context);

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, ArchitectureElement>(
						CorePackage.Literals.ARCHITECTURE_ELEMENT, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ArchitectureElementActionBuilder<ArchitectureElement>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, CompositeNode>(
					CorePackage.Literals.COMPOSITE_NODE, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new CompositeNodeActionBuilder<CompositeNode>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Domain>(
					CorePackage.Literals.DOMAIN, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new DomainActionBuilder<Domain>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Event>(
					CorePackage.Literals.EVENT, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new EventActionBuilder<Event>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Impact>(
					CorePackage.Literals.IMPACT, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ImpactActionBuilder<Impact>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));

		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Node>(
					CorePackage.Literals.NODE, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new NodeActionBuilder<Node>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Stage>(
					CorePackage.Literals.STAGE, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new StageActionBuilder<Stage>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Tag>(
					CorePackage.Literals.TAG, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new TagActionBuilder<Tag>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Stakeholder>(
					CorePackage.Literals.STAKEHOLDER, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new StakeholderActionBuilder<Stakeholder>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Concern>(
					CorePackage.Literals.CONCERN, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ConcernActionBuilder<Concern>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, Viewpoint>(
					CorePackage.Literals.VIEWPOINT, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ViewpointActionBuilder<Viewpoint>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<ActionProvider, View>(
					CorePackage.Literals.VIEW, 
					ActionProvider.class, 
					this.getClass().getClassLoader(), 
					e -> new ViewActionBuilder<View>(e, context) {
						
						@Override
						protected String getHtmlExtension() {
							return CoreActionProviderAdapterFactory.this.getHtmlExtension();
						}
						
					}.asActionProvider()));
		
	}
			
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		if (type == DiagnosticProvider.class) {
			return new DiagnosticProviderAdapter(target, this::getDiagnostic, this::getFeatureDiagnostic);
		}
		return super.adaptNew(target, type);
	}
	
}
