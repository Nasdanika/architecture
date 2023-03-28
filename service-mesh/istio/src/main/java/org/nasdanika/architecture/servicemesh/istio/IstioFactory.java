/**
 */
package org.nasdanika.architecture.servicemesh.istio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.architecture.servicemesh.istio.IstioPackage
 * @generated
 */
public interface IstioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstioFactory eINSTANCE = org.nasdanika.architecture.servicemesh.istio.impl.IstioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy</em>'.
	 * @generated
	 */
	Proxy createProxy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IstioPackage getIstioPackage();

} //IstioFactory
