package mainpkg;

import java.awt.*;
import javax.swing.*;
import java.io.*;

import com.jcraft.jsch.*;

public class SSHExec {

	private JSch jsch;
	private Session session;
//	private Channel channel;

	private String response;
	
	public SSHExec(String user, String passw, String host, int port,
			String command, String privateKey) {
		try {
			System.out.println("EXEC connecting...1");
			jsch = new JSch();
			System.out.println("EXEC connecting...2");

			session = jsch.getSession(user, host, port);
			System.out.println("EXEC connecting...3 to host: " + host);
			session.setPassword(passw);
			session.setHostKeyAlias("dd");
			java.util.Properties newconf = new java.util.Properties();
			newconf.put("StrictHostKeyChecking", "no");

			// jsch.addIdentity(privateKey.toString());//auto me arxeio
			if (!"".equals(privateKey)) {
				final byte[] prvkey = privateKey.getBytes();
				final byte[] emptyPassPhrase = new byte[0]; // Empty passphrase
															// for now, get real
															// passphrase from
															// MyUserInfo
				jsch.addIdentity("", // String userName
						prvkey, // byte[] privateKey
						null, // byte[] publicKey
						emptyPassPhrase // byte[] passPhrase
						);
			}

			session.setConfig(newconf);
			System.out
					.println("org.panlab.ras.uop.jschwrapper.Exec connecting...");
			session.connect();

//			channel = session.openChannel("exec");
//			((ChannelExec) channel).setCommand(command);
//
//			channel.setInputStream(null);
//
//			((ChannelExec) channel).setErrStream(System.err);
//
//			InputStream in = channel.getInputStream();
//
//			channel.connect();
//
//			byte[] tmp = new byte[1024];
//			while (true) {
//				while (in.available() > 0) {
//					int i = in.read(tmp, 0, 1024);
//					if (i < 0)
//						break;
//					System.out.print(new String(tmp, 0, i));
//				}
//				if (channel.isClosed()) {
//					System.out.println("exit-status: "
//							+ channel.getExitStatus());
//					break;
//				}
//				try {
//					Thread.sleep(1000);
//				} catch (Exception ee) {
//				}
//			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addUserPass(String command, String usr, String passw) {
		try {
			System.out
					.println("org.panlab.ras.uop.jschwrapper.Exec connecting...");
			// session.connect();

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			channel.setInputStream(null);

			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();

			channel.connect();
			

			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					response = new String(tmp, 0, i);
					System.out.print(response);
				}
				if (channel.isClosed()) {
					System.out.println("exit-status: "
							+ channel.getExitStatus());
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {
				}
			}
			channel.disconnect();
			session.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	public void disconnectSession() {

		session.disconnect();

	}

	public void runCommand(String command) {

		try {

			Channel channel = session.openChannel("exec");
			System.out.println("session.openChannel()"+command);

			channel.setInputStream(null);

			channel.setOutputStream(System.out);

			((ChannelExec) channel).setCommand(command);

			System.out.println("setCommand(command);");
			channel.connect();
			System.out.println("channel.connect()");

			InputStream in = channel.getInputStream();
			System.out.println("channel.getInputStream()");

			byte[] tmp = new byte[1024];

			while (true) {
				System.out.println("while() 1"+tmp);
				while (in.available() > 0) {
					System.out.println("while() 1.1");
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					System.out.print(new String(tmp, 0, i));
				}
				
				System.out.println("while() 2");
				
				if (channel.isClosed()) {
					System.out
							.println("exit-status:" + channel.getExitStatus());
					break;
				}
				System.out.println("while() 3");

				try {

					Thread.sleep(1000);

				} catch (Exception ee) {

				}

			}

			System.out.println("while() 4");
			channel.disconnect();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
