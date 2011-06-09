package org.panlab.software.fci.core;

public class AuthorizationKey {
	private String username;
	private String passkey;

	public AuthorizationKey(FCICredentials cred) {
		//It would be nice to have a unique encoded key over https
		//to make all subsequent calls
		setUsername(cred.getUsername());
		setPasskey(cred.getPassword());		
		
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	public String getPasskey() {
		return passkey;
	}

}
