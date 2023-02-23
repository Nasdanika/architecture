package org.nasdanika.architecture.core.gen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.architecture.core.ModelElement;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.html.emf.EObjectActionBuilder;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.SectionStyle;
import org.nasdanika.html.model.bootstrap.Table;
import org.nasdanika.html.model.html.HtmlFactory;
import org.nasdanika.ncore.util.NcoreUtil;

public class ModelElementActionBuilder<T extends ModelElement> extends EObjectActionBuilder<T> {
	
//	/**
//	 * Descriptions shorter than this value are put on the top of the tabs, longer
//	 * ones end up in their own tab. 
//	 */
//	protected int descriptionTabLengthThreshold = 2500;
//
	public ModelElementActionBuilder(T value, Context context) {
		super(value, context);		
	}
//	
//	@Override
//	protected Action buildAction(
//			Action action,
//			BiConsumer<EObject,Action> registry, 
//			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
//			ProgressMonitor progressMonitor) {
//		Action ret = super.buildAction(action, registry, resolveConsumer, progressMonitor);		
//		T eObj = getTarget();
//		URI uri = NcoreUtil.getUri(eObj);
//		String id = uri == null ? eObj.getUuid() : uri.toString();
//		try {
//			String digest = Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(id.getBytes(StandardCharsets.UTF_8)));
//			ret.setId(digest);
//		} catch (NoSuchAlgorithmException e) {
//			throw new NasdanikaException(e);
//		}
//		
//		String description = eObj.getDescription();
//		ret.setDescription(description);
//
//		BiSupplier<EObject, String> cPath = NcoreUtil.containmentPath(eObj);
//		if (cPath == null || Util.isBlank(cPath.getSecond())) {
//			ret.setLocation("${base-uri}index.html");
//		} else {
//			ret.setLocation(cPath.getSecond() + "/index.html");
//		}
//		
//		ret.setSectionStyle(SectionStyle.HEADER);
//		
//		EList<Action> sections = ret.getSections();
//		for (Document section: eObj.getSections()) {
//			sections.add(createChildAction(section, registry, resolveConsumer, progressMonitor));			
//		}
//		
//		createResourcesAction(ret, registry, resolveConsumer, progressMonitor);				
//		return ret;
//	}
//
//	protected void createResourcesAction(
//			Action action,
//			BiConsumer<EObject,Action> registry, 
//			java.util.function.Consumer<org.nasdanika.common.Consumer<org.nasdanika.html.emf.EObjectActionResolver.Context>> resolveConsumer, 
//			ProgressMonitor progressMonitor) {
//		
//		EList<NamedElement> resources = getTarget().getResources();
//		if (!resources.isEmpty()) {
//			Action group = AppFactory.eINSTANCE.createAction();
//			group.setText("Resources");
//			group.setUuid(action.getUuid() + "-resources");
//			group.setLocation("resources.html");
//			EList<Action> groupAnonymous = group.getAnonymous();
//			for (NamedElement resource: resources) {
//				groupAnonymous.add(createChildAction(resource, registry, resolveConsumer, progressMonitor));
//			}
//		
//			action.getNavigation().add(group);
//		}	
//	}
//	
//	@Override
//	protected Table createPropertiesTable(
//			Action action,
//			org.nasdanika.html.emf.EObjectActionResolver.Context context,
//			ProgressMonitor progressMonitor) {
//		Table propertiesTable = super.createPropertiesTable(action, context, progressMonitor);
//		propertiesTable.getAttributes().put("style", createText("width:auto"));
//		return propertiesTable;
//	}
//	
//	@Override
//	protected void resolve(Action action, org.nasdanika.html.emf.EObjectActionResolver.Context context,	ProgressMonitor progressMonitor) {
//		super.resolve(action, context, progressMonitor);
//		
//		// Adding documentation here so it appears under the properties table
//		T semanticElement = getTarget();
//		EList<EObject> documentation = semanticElement.getDocumentation();
//		if (documentation.isEmpty()) {
//			// Using description as documentation only if documentation is empty.
//			String description = semanticElement.getDescription();
//			addContent(action, description);
//		} else {
//			action.getContent().addAll(EcoreUtil.copyAll(documentation)); // TODO - wrap into a group in order to inject uri's properties, optionally save into its own resource.
//		}		
//		
//		EList<NamedElement> resources = semanticElement.getResources();
//		if (!resources.isEmpty()) {
//			String resourcesGroupUUID = action.getUuid() + "-resources";
//			Optional<Action> resourcesActionOptional = action.getNavigation().stream()
//					.filter(Action.class::isInstance)					
//					.map(Action.class::cast)
//					.filter(a -> resourcesGroupUUID.equals(a.getUuid()))
//					.findFirst();
//			
//			Action resourcesAction = resourcesActionOptional.get();
//			resourcesAction.getContent().add(renderList(resources, true, createResourceChildrenProvider(), resourcesAction, EngineeringPackage.Literals.MODEL_ELEMENT__RESOURCES, context, progressMonitor)); // Table?
//		}
//				
//	}
//	
//	private ContentProvider<NamedElement> createResourceChildrenProvider() {
//		return new ContentProvider<NamedElement>() {
//	
//			@Override
//			public List<EObject> createContent(
//					NamedElement element, 
//					Action base, 
//					ETypedElement typedElement,
//					org.nasdanika.html.emf.EObjectActionResolver.Context context, 
//					ProgressMonitor progressMonitor) {
//	
//				if (element instanceof Directory) {
//					EList<NamedElement> children = ((Directory) element).getElements();
//					if (!children.isEmpty()) {
//						return Collections.singletonList(renderList(children, true, this, base, EngineeringPackage.Literals.DIRECTORY__ELEMENTS, context, progressMonitor));
//					}
//				}
//				return null;
//			}
//			
//		};
//	}	
//	
//	@Override
//	protected EObject renderValue(
//			Action base, 
//			ETypedElement typedElement, 
//			Object value,
//			org.nasdanika.html.emf.EObjectActionResolver.Context context, ProgressMonitor progressMonitor) {
//
//		if ((typedElement == EngineeringPackage.Literals.ENDEAVOR__COMPLETION || typedElement == EngineeringPackage.Literals.KEY_RESULT__COMPLETION) && value instanceof Double) {
//			double completion = (Double) value;
//			if (completion != Double.NaN && completion > 0.001) {
//				int percentage = (int) (100.0 * completion);
//				org.nasdanika.html.model.html.Tag progressBar = HtmlFactory.eINSTANCE.createTag();
//				progressBar.setName("div");
//				progressBar.getAttributes().put("class", createText("progress-bar"));
//				progressBar.getAttributes().put("style", createText("width:" + percentage + "%"));
//				progressBar.getContent().add(createText(percentage + "%"));
//				
//				org.nasdanika.html.model.html.Tag progress = HtmlFactory.eINSTANCE.createTag();
//				progress.setName("div");
//				progress.getAttributes().put("class", createText("progress"));
//				progress.getContent().add(progressBar);
//				return progress;
//			}
//			return null;
//		}		
//		
//		return super.renderValue(base, typedElement, value, context, progressMonitor);
//	}
	
}
