/*
* generated by Xtext
*/
package gr.upatras.ece.wcl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.tokens");
	}
}