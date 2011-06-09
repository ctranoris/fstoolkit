/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl;

import FederationOffice.services.ServiceSetting;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.ConfigurationParam#getServsetting <em>Servsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl.RadlPackage#getConfigurationParam()
 * @model
 * @generated
 */
public interface ConfigurationParam extends scriptParam
{
  /**
   * Returns the value of the '<em><b>Servsetting</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servsetting</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servsetting</em>' reference.
   * @see #setServsetting(ServiceSetting)
   * @see gr.upatras.ece.wcl.radl.RadlPackage#getConfigurationParam_Servsetting()
   * @model
   * @generated
   */
  ServiceSetting getServsetting();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl.ConfigurationParam#getServsetting <em>Servsetting</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servsetting</em>' reference.
   * @see #getServsetting()
   * @generated
   */
  void setServsetting(ServiceSetting value);

} // ConfigurationParam
