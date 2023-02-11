/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Module is an implementation unit. E.g. a Java jar file/module. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.Module#getCodeElements <em>Code Elements</em>}</li>
 *   <li>{@link org.nasdanika.architecture.c4.Module#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getModule()
 * @model
 * @generated
 */
public interface Module extends Node, TechnologyConsumer {
	/**
	 * Returns the value of the '<em><b>Code Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.CodeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component/module contains code elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Elements</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getModule_CodeElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeElement> getCodeElements();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modules can be nested. E.g. a Maven module may contain sub-modules. A Java package may be considered a module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getModule_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

} // Module
