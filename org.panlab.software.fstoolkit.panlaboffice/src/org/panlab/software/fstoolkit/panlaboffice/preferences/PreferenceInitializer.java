package org.panlab.software.fstoolkit.panlaboffice.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.panlab.software.fstoolkit.panlaboffice.Activator;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public PreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PanlabOfficePreferenceConstants.P_BOOLEAN, true);
		store.setDefault(PanlabOfficePreferenceConstants.P_CHOICE, "choice2");
		store.setDefault(PanlabOfficePreferenceConstants.P_STRING,
		"Default value");
		store.setDefault(PanlabOfficePreferenceConstants.P_PANLABUSERNAME,
		"[ENTER YOUR PANLAB USERNAME]");
		store.setDefault(PanlabOfficePreferenceConstants.P_PANLABPASSWORD,
		"");

	}

}
