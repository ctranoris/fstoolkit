lexer grammar InternalFSDL;
@header {
package org.panlab.software.fsdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'RequestedFederationScenario' ;
T12 : 'isShared' ;
T13 : 'Description' ;
T14 : 'Credentials' ;
T15 : 'import office' ;
T16 : ';' ;
T17 : 'RequestServices' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'Service' ;
T21 : 'as' ;
T22 : '[1..' ;
T23 : ']' ;
T24 : 'offered by' ;
T25 : 'optional' ;
T26 : 'settings' ;
T27 : 'ScheduledPlan' ;
T28 : 'ValidFrom' ;
T29 : 'ValidUntil' ;
T30 : 'id' ;
T31 : 'description' ;
T32 : 'UserName' ;
T33 : 'PassWord' ;
T34 : 'Setting' ;
T35 : ':' ;
T36 : '=' ;
T37 : 'assign' ;
T38 : ',' ;
T39 : 'RequestInfrastructure' ;
T40 : 'Resource' ;
T41 : 'ResourceGroup' ;
T42 : 'refersResources' ;

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1539
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1541
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1543
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1545
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1547
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1549
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g" 1551
RULE_ANY_OTHER : .;


