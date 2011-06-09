package org.panlab.officedl.valueconvert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

public class MyVTDLValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule = "EDate")
    public IValueConverter<Date> EDate() {
        return new IValueConverter<Date>() {
            public Date toValue(String string, AbstractNode node) throws ValueConverterException{
            	DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 
            	Date dateNow = new Date ();
            	string = string.replace("\"", "");
                if (Strings.isEmpty(string))
                    throw new ValueConverterException("Couldn't convert empty string to Date", node, null);
                else if ("now".equals(string.trim()))
                    return  dateNow;
                try {
                	//System.out.println("MyVTDLValueConverter.toValue() in return! ="+ sdf.parse(string));
                    return  sdf.parse(string) ;
                } catch (ParseException e) {
                	//System.out.println("MyVTDLValueConverter.toValue() in return ParseException! ");
                    throw new ValueConverterException("Couldn't convert '"+string+"' to Date", node, e);
                }
            }

            public String toString(Date value) {
            	//System.out.println("MyVTDLValueConverter.toString()= "+value);
            	DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 
                return   sdf.format (value) ;
            }
        };
	}
	
//	@ValueConverter(rule = "EBoolean")
//    public IValueConverter<Boolean> EBoolean() {
//        return new IValueConverter<Boolean>() {
//            public Boolean toValue(String string, AbstractNode node) throws ValueConverterException{
//            	
//            	string = string.replace("\"", "");
//                if (Strings.isEmpty(string))
//                    throw new ValueConverterException("Couldn't convert empty string to Boolean", node, null);
//                else if ("true".equals(string.trim()))
//                    return  true;
//                else 
//                    return  false;
//            }
//
//            public String toString(Boolean value) {
//            	//System.out.println("MyVTDLValueConverter.toString()= "+value);
//                return  value.toString();
//            }
//
//            
//
//			
//        };
//	}
	
	
}