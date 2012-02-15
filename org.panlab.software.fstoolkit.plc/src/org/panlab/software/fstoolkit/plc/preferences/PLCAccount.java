package org.panlab.software.fstoolkit.plc.preferences;

public class PLCAccount {
	private String plcName;
	private String urlapi;
	private String username;
	private String password;
	private boolean enabledAccount;
	
	public PLCAccount (String plcname, String url, String username, String pwd, boolean enabledAccount){
		this.plcName = plcname;
		this.urlapi=url;
		this.username = username;
		this.password = pwd;
		this.enabledAccount = enabledAccount;
	}
	
	public String getPlcName() {
		return plcName;
	}
	public void setPlcName(String plcName) {
		this.plcName = plcName;
	}
	public String getUrlapi() {
		return urlapi;
	}
	public void setUrlapi(String urlapi) {
		this.urlapi = urlapi;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabledAccount(boolean selection) {
		this.enabledAccount = selection;
		
	}
	
	public boolean getEnabledAccount( ) {
		return this.enabledAccount;
		
	}
}
