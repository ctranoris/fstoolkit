lexer grammar InternalFSDL;
@header {
package org.panlab.software.fsdl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'RequestedFederationScenario' ;
T12 : 'Description' ;
T13 : 'Credentials' ;
T14 : 'import office' ;
T15 : ';' ;
T16 : 'RequestServices' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'Service' ;
T20 : 'as' ;
T21 : '[1..' ;
T22 : ']' ;
T23 : 'offered by' ;
T24 : 'optional' ;
T25 : 'settings' ;
T26 : 'ScheduledPlan' ;
T27 : 'ValidFrom' ;
T28 : 'ValidUntil' ;
T29 : 'id' ;
T30 : 'description' ;
T31 : 'UserName' ;
T32 : 'PassWord' ;
T33 : 'Setting' ;
T34 : ':' ;
T35 : '=' ;
T36 : 'assign' ;
T37 : ',' ;
T38 : 'RequestInfrastructure' ;
T39 : 'Resource' ;
T40 : 'ResourceGroup' ;
T41 : 'refersResources' ;
T42 : 'isShared' ;

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4875
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4877
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4879
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4881
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4883
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4885
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.panlab.software.fsdl.ui/src-gen/org/panlab/software/fsdl/ui/contentassist/antlr/internal/InternalFSDL.g" 4887
RULE_ANY_OTHER : .;


