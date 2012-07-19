package gr.upatras.ece.nam.fstoolkit.panlaboffice;


public class TeagleAuth {
	
	private static TeagleAuth instance;

	public TeagleAuth (){
	}
	
	public static TeagleAuth getInstance(){
		if (instance == null){
			instance = new TeagleAuth();
		}
		return instance;
	}

	public void Authenticate() {

		
	}

//	public Boolean CheckCredentialsExist() {
//		String myPassw= Activator.getDefault().getPreferenceStore().getString( PanlabOfficePreferenceConstants.P_PANLABPASSWORD );
////		System.out.println();
//		if (!myPassw.equals(""))
//			return true;
//
//		//else just show the preference page to insert a password
//		try {
//			ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
//			IHandlerService handlerService = (IHandlerService)PlatformUI.getWorkbench().getService(IHandlerService.class);
//			Command prefCmd = commandService.getCommand("org.eclipse.ui.window.preferences");
//			IParameter preferencePageIdIdParm = prefCmd.getParameter("preferencePageId");
//			IParameterValues parmValues = preferencePageIdIdParm.getValues();
//			String prefPageId = "org.panlab.software.fstoolkit.preferences.FSToolkitPreferencePage";
//
//			Parameterization parm = new Parameterization(preferencePageIdIdParm, prefPageId);
//	 		ParameterizedCommand parmCommand = new ParameterizedCommand( prefCmd, new Parameterization[] { parm });
//	 
//	 		handlerService.executeCommand(parmCommand, null);
//			
//			//handlerService.executeCommand("org.eclipse.ui.window.preferences(preferencePageId=org.panlab.software.fstoolkit.preferences.FSToolkitPreferencePage)", null);
//		} catch (Exception ex) {
//			throw new RuntimeException("add.command not found");
//		}
//
//
//		return false;
//	}
}
