/*
* generated by Xtext
*/
package gr.upatras.ece.nam.fsdl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FSDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.tokens");
	}
}
