lexer grammar InternalRadl;
@header {
package gr.upatras.ece.wcl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'YES' ;
T12 : 'NO' ;
T13 : 'String' ;
T14 : 'Integer' ;
T15 : 'Boolean' ;
T16 : 'Enum' ;
T17 : 'REFERENCE' ;
T18 : 'GET' ;
T19 : 'POST' ;
T20 : 'import service' ;
T21 : 'Resource Adapter' ;
T22 : 'implements' ;
T23 : 'Configuration Parameters' ;
T24 : '{' ;
T25 : '}' ;
T26 : 'Binding Parameters' ;
T27 : 'Supported Child Types' ;
T28 : 'Allowed Types' ;
T29 : 'On Update' ;
T30 : 'ProcessOnAllConfigurationParametersComplete' ;
T31 : '=' ;
T32 : ';' ;
T33 : 'RAProtocol' ;
T34 : 'description' ;
T35 : 'SSH' ;
T36 : 'Remote Machine' ;
T37 : 'RPort' ;
T38 : 'RUsername' ;
T39 : 'RPassword' ;
T40 : 'RExecute' ;
T41 : 'RExecuteDelete' ;
T42 : 'Java' ;
T43 : '(' ;
T44 : ')' ;
T45 : ',' ;
T46 : 'JExecute' ;
T47 : 'JAssign' ;
T48 : '<<' ;
T49 : '>>' ;
T50 : 'HTTP' ;
T51 : 'RemoteMachine' ;
T52 : 'HttpURL' ;
T53 : 'HttpMethod' ;
T54 : 'HttpAuth' ;
T55 : 'Method' ;
T56 : 'AuthUsername' ;
T57 : 'AuthPassword' ;
T58 : 'PostBody' ;
T59 : 'XML-RPC' ;
T60 : 'ServerURL' ;
T61 : 'RPCMethod' ;
T62 : 'HttpBasicAuth' ;
T63 : 'BasicAuthUsername' ;
T64 : 'BasicAuthPassword' ;
T65 : 'parameters' ;

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9006
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9008
RULE_INT : ('0'..'9')+;

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9010
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9012
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9014
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9016
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../gr.upatras.ece.wcl.radl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalRadl.g" 9018
RULE_ANY_OTHER : .;


