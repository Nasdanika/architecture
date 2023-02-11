/**
 */
package org.nasdanika.architecture.c4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technology product. For example, a software product like Java, or a standard like TOGAF or HTML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.architecture.c4.TechnologyProduct#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.architecture.c4.C4Package#getTechnologyProduct()
 * @model
 * @generated
 */
public interface TechnologyProduct extends Technology {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.architecture.c4.TechnologyVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.architecture.c4.C4Package#getTechnologyProduct_Versions()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true' strict-containment='true'"
	 * @generated
	 */
	EList<TechnologyVersion> getVersions();

} // TechnologyProduct
