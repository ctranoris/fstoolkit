package gr.upatras.ece.nam.fci.core;

public class ParameterValuePair {
	
	public ParameterValuePair(String parameter, String value) {
		super();
		Parameter = parameter;
		Value = value;
	}
	
	private String Parameter;
	private String Value;
	
	
	public void setParameter(String parameter) {
		Parameter = parameter;
	}
	public String getParameter() {
		return Parameter;
	}
	
	public void setValue(String value) {
		Value = value;
	}
	public String getValue() {
		return Value;
	}
	
}
