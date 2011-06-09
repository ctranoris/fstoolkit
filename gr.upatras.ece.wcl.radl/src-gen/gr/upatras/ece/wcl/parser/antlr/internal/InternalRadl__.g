lexer grammar InternalRadl;
@header {
package gr.upatras.ece.wcl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import service' ;
T12 : 'Resource Adapter' ;
T13 : 'implements' ;
T14 : 'Configuration Parameters' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'Binding Parameters' ;
T18 : 'Supported Child Types' ;
T19 : 'Allowed Types' ;
T20 : 'On Update' ;
T21 : 'ProcessOnAllConfigurationParametersComplete' ;
T22 : '=' ;
T23 : 'YES' ;
T24 : 'NO' ;
T25 : ';' ;
T26 : 'RAProtocol' ;
T27 : 'description' ;
T28 : 'String' ;
T29 : 'Integer' ;
T30 : 'Boolean' ;
T31 : 'Enum' ;
T32 : 'REFERENCE' ;
T33 : 'SSH' ;
T34 : 'Remote Machine' ;
T35 : 'RPort' ;
T36 : 'RUsername' ;
T37 : 'RPassword' ;
T38 : 'RExecute' ;
T39 : 'RExecuteDelete' ;
T40 : 'Java' ;
T41 : '(' ;
T42 : ',' ;
T43 : ')' ;
T44 : 'JExecute' ;
T45 : 'JAssign' ;
T46 : '<<' ;
T47 : '>>' ;
T48 : 'HTTP' ;
T49 : 'RemoteMachine' ;
T50 : 'HttpURL' ;
T51 : 'HttpMethod' ;
T52 : 'GET' ;
T53 : 'POST' ;
T54 : 'HttpAuth' ;
T55 : 'Method' ;
T56 : 'AuthUsername' ;
T57 : 'AuthPassword' ;
T58 : 'PostBody' ;
T59 : 'XML-RPC' ;
T60 : 'ServerURL' ;
T61 : 'HttpBasicAuth' ;
T62 : 'BasicAuthUsername' ;
T63 : 'BasicAuthPassword' ;
T64 : 'RPCMethod' ;
T65 : 'parameters' ;

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2807
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2809
RULE_INT : ('0'..'9')+;

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2811
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2813
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2815
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2817
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g" 2819
RULE_ANY_OTHER : .;


