/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import FederationOffice.Office;

import FederationOffice.services.OfferedService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getName <em>Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getImplname <em>Implname</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getByoffice <em>Byoffice</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getConfParams <em>Conf Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getBindParams <em>Bind Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getChildParams <em>Child Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getAllowParams <em>Allow Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getConfComplete <em>Conf Complete</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter()
 * @model
 * @generated
 */
public interface ResourceAdapter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Implname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implname</em>' reference.
   * @see #setImplname(OfferedService)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_Implname()
   * @model
   * @generated
   */
  OfferedService getImplname();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getImplname <em>Implname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implname</em>' reference.
   * @see #getImplname()
   * @generated
   */
  void setImplname(OfferedService value);

  /**
   * Returns the value of the '<em><b>Byoffice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Byoffice</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Byoffice</em>' reference.
   * @see #setByoffice(Office)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_Byoffice()
   * @model
   * @generated
   */
  Office getByoffice();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getByoffice <em>Byoffice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Byoffice</em>' reference.
   * @see #getByoffice()
   * @generated
   */
  void setByoffice(Office value);

  /**
   * Returns the value of the '<em><b>Conf Params</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.ConfigurationParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conf Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conf Params</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_ConfParams()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationParam> getConfParams();

  /**
   * Returns the value of the '<em><b>Bind Params</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.BindingParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind Params</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_BindParams()
   * @model containment="true"
   * @generated
   */
  EList<BindingParam> getBindParams();

  /**
   * Returns the value of the '<em><b>Child Params</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child Params</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_ChildParams()
   * @model containment="true"
   * @generated
   */
  EList<SupportedChildType> getChildParams();

  /**
   * Returns the value of the '<em><b>Allow Params</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.AllowedType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allow Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allow Params</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_AllowParams()
   * @model containment="true"
   * @generated
   */
  EList<AllowedType> getAllowParams();

  /**
   * Returns the value of the '<em><b>Conf Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conf Complete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conf Complete</em>' attribute.
   * @see #setConfComplete(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_ConfComplete()
   * @model
   * @generated
   */
  String getConfComplete();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getConfComplete <em>Conf Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conf Complete</em>' attribute.
   * @see #getConfComplete()
   * @generated
   */
  void setConfComplete(String value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' containment reference.
   * @see #setProtocol(Protocol)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getResourceAdapter_Protocol()
   * @model containment="true"
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ResourceAdapter#getProtocol <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' containment reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // ResourceAdapter
