lexer grammar InternalSDL;
@header {
package gr.upatras.ece.wcl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'true' ;
T12 : 'false' ;
T13 : 'import office' ;
T14 : ';' ;
T15 : 'ServiceSetting' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'id' ;
T19 : 'description' ;
T20 : 'Readable' ;
T21 : 'Writable' ;
T22 : 'requiresParams' ;
T23 : '(' ;
T24 : ')' ;
T25 : ',' ;
T26 : 'settingType' ;
T27 : 'OfferedService' ;
T28 : 'serviceSettings' ;
T29 : 'STRING' ;
T30 : 'defaultValue' ;
T31 : 'Enum' ;
T32 : 'tideEnumlist' ;
T33 : 'tideTypeEnumItem' ;
T34 : 'value' ;
T35 : 'userExposed' ;
T36 : 'userEditable' ;
T37 : 'canBePublished' ;

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3299
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3301
RULE_INT : ('0'..'9')+;

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3303
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3305
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3307
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3309
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g" 3311
RULE_ANY_OTHER : .;


