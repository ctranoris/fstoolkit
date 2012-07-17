/**
 */
package brokermodel.federationscenarios;

import brokermodel.resources.ResourceSetting;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Setting Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.federationscenarios.ResourceSettingInstance#getRefResourceSetting <em>Ref Resource Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.federationscenarios.FederationscenariosPackage#getResourceSettingInstance()
 * @model
 * @generated
 */
public interface ResourceSettingInstance extends SettingInstance {
	/**
	 * Returns the value of the '<em><b>Ref Resource Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Resource Setting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Resource Setting</em>' reference.
	 * @see #setRefResourceSetting(ResourceSetting)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getResourceSettingInstance_RefResourceSetting()
	 * @model required="true"
	 * @generated
	 */
	ResourceSetting getRefResourceSetting();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.ResourceSettingInstance#getRefResourceSetting <em>Ref Resource Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Resource Setting</em>' reference.
	 * @see #getRefResourceSetting()
	 * @generated
	 */
	void setRefResourceSetting(ResourceSetting value);

} // ResourceSettingInstance
