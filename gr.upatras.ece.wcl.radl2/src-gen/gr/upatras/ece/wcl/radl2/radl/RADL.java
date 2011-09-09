/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RADL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.RADL#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.RADL#getResourceAdapter <em>Resource Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getRADL()
 * @model
 * @generated
 */
public interface RADL extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(Import)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getRADL_Imports()
   * @model containment="true"
   * @generated
   */
  Import getImports();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.RADL#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(Import value);

  /**
   * Returns the value of the '<em><b>Resource Adapter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Adapter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Adapter</em>' containment reference.
   * @see #setResourceAdapter(ResourceAdapter)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getRADL_ResourceAdapter()
   * @model containment="true"
   * @generated
   */
  ResourceAdapter getResourceAdapter();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.RADL#getResourceAdapter <em>Resource Adapter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Adapter</em>' containment reference.
   * @see #getResourceAdapter()
   * @generated
   */
  void setResourceAdapter(ResourceAdapter value);

} // RADL
