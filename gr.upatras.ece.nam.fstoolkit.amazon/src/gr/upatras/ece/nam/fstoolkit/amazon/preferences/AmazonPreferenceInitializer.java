package gr.upatras.ece.nam.fstoolkit.amazon.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import gr.upatras.ece.nam.fstoolkit.amazon.Activator;

public class AmazonPreferenceInitializer extends AbstractPreferenceInitializer {

	public AmazonPreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(AmazonPreferenceConstants.P_BOOLEAN, true);
		store.setDefault(AmazonPreferenceConstants.P_CHOICE, "choice2");
		store.setDefault(AmazonPreferenceConstants.P_STRING,
		"Default value");
		store.setDefault(AmazonPreferenceConstants.P_ACCESSKEYID,
		"[ENTER YOUR ACCESS KEY ID]");
		store.setDefault(AmazonPreferenceConstants.P_SECRETACCESSKEY,
		"");

	}

}
