package gr.upatras.ece.nam.fstoolkit.panlaboffice.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import gr.upatras.ece.nam.fstoolkit.panlaboffice.Activator;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public PreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PanlabBrokerPreferenceConstants.P_BOOLEAN, true);
		store.setDefault(PanlabBrokerPreferenceConstants.P_CHOICE, "choice2");
		store.setDefault(PanlabBrokerPreferenceConstants.P_STRING,
		"Default value");
		store.setDefault(PanlabBrokerPreferenceConstants.P_PANLABUSERNAME,
		"[ENTER YOUR PANLAB USERNAME]");
		store.setDefault(PanlabBrokerPreferenceConstants.P_PANLABPASSWORD,
		"");

	}

}
