lexer grammar InternalSDL;
@header {
package gr.upatras.ece.wcl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import office' ;
T12 : ';' ;
T13 : 'userExposed' ;
T14 : 'userEditable' ;
T15 : 'canBePublished' ;
T16 : 'ServiceSetting' ;
T17 : '{' ;
T18 : 'id' ;
T19 : 'description' ;
T20 : 'Readable' ;
T21 : 'Writable' ;
T22 : 'requiresParams' ;
T23 : '(' ;
T24 : ',' ;
T25 : ')' ;
T26 : 'settingType' ;
T27 : '}' ;
T28 : 'OfferedService' ;
T29 : 'serviceSettings' ;
T30 : 'true' ;
T31 : 'false' ;
T32 : 'STRING' ;
T33 : 'defaultValue' ;
T34 : 'Enum' ;
T35 : 'tideEnumlist' ;
T36 : 'tideTypeEnumItem' ;
T37 : 'value' ;

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1044
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1046
RULE_INT : ('0'..'9')+;

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1048
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1050
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1052
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1054
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g" 1056
RULE_ANY_OTHER : .;


