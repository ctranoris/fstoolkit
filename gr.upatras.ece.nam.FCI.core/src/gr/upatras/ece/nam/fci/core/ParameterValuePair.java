package gr.upatras.ece.nam.fci.core;

public class ParameterValuePair {
	
	
	/**
	 * CreatesA parameter calue to pass to a resource
	* @param parameter The name of the parameter name of the resource
	 * @param value The vaule of the parameter
	 * @param parameterAlias A user defined alias name for the input parameter
	 */
	public ParameterValuePair(String parameter, String value, String parameterAlias) {
		super();
		Parameter = parameter;
		Value = value;
		ParameterAlias = parameterAlias; 
	}
	
	private String Parameter;
	private String Value;
	private String ParameterAlias;
	
	
	public void setParameter(String parameter) {
		Parameter = parameter;
	}
	public String getParameter() {
		return Parameter;
	}
	
	public void setParameterAlias(String parameter) {
		ParameterAlias = parameter;
	}
	public String getParameterAlias() {
		return ParameterAlias;
	}
	
	public void setValue(String value) {
		Value = value;
	}
	public String getValue() {
		return Value;
	}
	
}
