package gr.upatras.ece.nam.fstoolkit.sfaclient.preferences;

/**
 * @author ctranoris
 *
 */
public class SFAAccount {
	private String registry_url;
	private String aggregate_url;
	private String slicemanager_url;
	private String keystoreFileName;
	private String keystorePassword;
	private String trustStoreFileName;
	private String trustStorePassword;
	private String username;
	private String authority;
	private String certificateFileName;//The .pem self signed certificate , from command C:\Users\ctranoris\Desktop\_downloads\tmp\plckeys>c:\OpenSSL-Win32\bin\openssl x509 -text -in sfa1inria.pem
	private String SFAversion;
	private String SFAtype;
	private boolean enabledAccount;
	private boolean cacheModel;

	/**
	 * @param registry_url the URL of the registry SFA authority with port number
	 * @param aggregate_url
	 * @param slicemanager_url
	 * @param keystoreFileName
	 * @param keystorePassword
	 * @param username
	 * @param authority sould be plc.[baseurl] where replace baseurl with the provided one by sfa authority
	 * @param certificateFileName
	 * @param trustStoreFileName
	 * @param trustStorePassword
	 * @param SFAversion
	 * @param SFAtype
	 * @param enabledAccount
	 * @param cacheModel
	 */
	public SFAAccount(String registry_url, String aggregate_url,
			String slicemanager_url, String keystoreFileName,
			String keystorePassword, String username, String authority,
			String certificateFileName,
			String trustStoreFileName,
			String trustStorePassword,
			String SFAversion,
			String SFAtype,
			boolean enabledAccount,
			boolean cacheModel) {
		super();
		this.registry_url = registry_url;
		this.aggregate_url = aggregate_url;
		this.slicemanager_url = slicemanager_url;
		this.keystoreFileName = keystoreFileName;
		this.keystorePassword = keystorePassword;
		this.username = username;
		this.authority = authority;
		this.certificateFileName = certificateFileName;
		this.trustStoreFileName=trustStoreFileName;
		this.trustStorePassword = trustStorePassword;
		this.SFAversion = SFAversion;
		this.SFAtype = SFAtype;
		this.enabledAccount = enabledAccount;
		this.cacheModel = cacheModel;
	}


	/**
	 * @return the trustStoreFileName
	 */
	public String getTrustStoreFileName() {
		return trustStoreFileName;
	}


	/**
	 * @param trustStoreFileName the trustStoreFileName to set
	 */
	public void setTrustStoreFileName(String trustStoreFileName) {
		this.trustStoreFileName = trustStoreFileName;
	}


	/**
	 * @return the trustStorePassword
	 */
	public String getTrustStorePassword() {
		return trustStorePassword;
	}


	/**
	 * @param trustStorePassword the trustStorePassword to set
	 */
	public void setTrustStorePassword(String trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}


	/**
	 * @return the registry_url
	 */
	public String getRegistry_url() {
		return registry_url;
	}


	/**
	 * @param registry_url the registry_url to set
	 */
	public void setRegistry_url(String registry_url) {
		this.registry_url = registry_url;
	}


	/**
	 * @return the aggregate_url
	 */
	public String getAggregate_url() {
		return aggregate_url;
	}


	/**
	 * @param aggregate_url the aggregate_url to set
	 */
	public void setAggregate_url(String aggregate_url) {
		this.aggregate_url = aggregate_url;
	}


	/**
	 * @return the slicemanager_url
	 */
	public String getSlicemanager_url() {
		return slicemanager_url;
	}


	/**
	 * @param slicemanager_url the slicemanager_url to set
	 */
	public void setSlicemanager_url(String slicemanager_url) {
		this.slicemanager_url = slicemanager_url;
	}
	
	
	/**
	 * @return the keystoreFileName
	 */
	public String getKeystoreFileName() {
		return keystoreFileName;
	}


	/**
	 * @param keystoreFileName the keystoreFileName to set
	 */
	public void setKeystoreFileName(String keystoreFileName) {
		this.keystoreFileName = keystoreFileName;
	}


	/**
	 * @return the certificateFileName
	 */
	public String getCertificateFileName() {
		return certificateFileName;
	}


	/**
	 * @param certificateFileName the certificateFileName to set
	 */
	public void setCertificateFileName(String certificateFileName) {
		this.certificateFileName = certificateFileName;
	}


	public String getKeystorePassword() {
		return keystorePassword;
	}
	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}


	public String getSFAVersion() {
		return this.SFAversion;
	}


	public String getSFAType() {
		return this.SFAtype ;
	}


	public void setSFAVersionText(String sfaversion) {
		this.SFAversion = sfaversion;
		
	}


	public void setSFATypeText(String sfatype) {
		this.SFAtype = sfatype;
		
	}


	public void setEnabledAccount(boolean selection) {
		this.enabledAccount = selection;
		
	}


	public void setCacheModel(boolean selection) {
		this.cacheModel = selection;
		
	}
	
	public boolean getEnabledAccount() {
		return this.enabledAccount;
		
	}


	public boolean getCacheModel() {
		return this.cacheModel;
		
	}
	
}
