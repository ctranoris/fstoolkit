/*
 * generated by Xtext
 */
package gr.upatras.ece.nam.brokerdsl;

import gr.upatras.ece.nam.brokerdsl.scoping.MyBrokerDSLQualifiedNameProvider;
import gr.upatras.ece.nam.brokerdsl.valueconvert.MyVTDLValueConverter;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class BrokerDSLRuntimeModule extends gr.upatras.ece.nam.brokerdsl.AbstractBrokerDSLRuntimeModule {
	//chris check http://pettergraff.blogspot.com/2009/11/xtext-valueconverter.html
			//for the value converter!
			@Override
		    public Class<? extends IValueConverterService> bindIValueConverterService() {
		        return MyVTDLValueConverter.class;
		    }
			
			
			@Override
			public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
				return MyBrokerDSLQualifiedNameProvider.class;
			}
}