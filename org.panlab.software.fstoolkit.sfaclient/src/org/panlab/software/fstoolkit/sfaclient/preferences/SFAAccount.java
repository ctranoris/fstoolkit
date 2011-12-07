package org.panlab.software.fstoolkit.sfaclient.preferences;

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
	private String username;
	private String authority;
	private String certificateFileName;//The .pem self signed certificate , from command C:\Users\ctranoris\Desktop\_downloads\tmp\plckeys>c:\OpenSSL-Win32\bin\openssl x509 -text -in sfa1inria.pem
	

	/**
	 * @param registry_url the URL of the registry SFA authority with port number
	 * @param aggregate_url
	 * @param slicemanager_url
	 * @param keystoreFileName
	 * @param keystorePassword
	 * @param username
	 * @param authority sould be plc.[baseurl] where replace baseurl with the provided one by sfa authority
	 * @param certificateFileName
	 */
	public SFAAccount(String registry_url, String aggregate_url,
			String slicemanager_url, String keystoreFileName,
			String keystorePassword, String username, String authority,
			String certificateFileName) {
		super();
		this.registry_url = registry_url;
		this.aggregate_url = aggregate_url;
		this.slicemanager_url = slicemanager_url;
		this.keystoreFileName = keystoreFileName;
		this.keystorePassword = keystorePassword;
		this.username = username;
		this.authority = authority;
		this.certificateFileName = certificateFileName;
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
	
}
