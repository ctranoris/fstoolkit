lexer grammar InternalOfficeDL;
@header {
package org.panlab.officedl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import service description' ;
T12 : ';' ;
T13 : 'Office' ;
T14 : '{' ;
T15 : 'name' ;
T16 : 'id' ;
T17 : 'description' ;
T18 : 'resourceURI' ;
T19 : 'APIGateway' ;
T20 : 'registeredUsers' ;
T21 : ',' ;
T22 : '}' ;
T23 : 'contributedTaxonomies' ;
T24 : 'offeredServices' ;
T25 : 'offeredServiceCompositions' ;
T26 : 'ResourceServiceContracts' ;
T27 : 'SLAs' ;
T28 : '-' ;
T29 : 'Taxonomy' ;
T30 : 'hasScenarios' ;
T31 : '(' ;
T32 : ')' ;
T33 : 'hasServices' ;
T34 : 'taxonomies' ;
T35 : 'categories' ;
T36 : 'OfferedService' ;
T37 : 'requiresServices' ;
T38 : 'serviceSettings' ;
T39 : 'ServiceComposition' ;
T40 : 'ResourceServiceContract' ;
T41 : 'StartDate' ;
T42 : 'EndDate' ;
T43 : 'forOfferedService' ;
T44 : 'forOfferedResource' ;
T45 : 'availability' ;
T46 : 'SLA' ;
T47 : 'ValidFrom' ;
T48 : 'ValidUntil' ;
T49 : 'forVT' ;
T50 : 'ReservedRsources' ;
T51 : 'Account' ;
T52 : 'password' ;
T53 : 'username' ;
T54 : 'ResourcesProvider' ;
T55 : 'organization' ;
T56 : 'address' ;
T57 : 'telephone' ;
T58 : 'hasAccount' ;
T59 : 'offeredSiteList' ;
T60 : 'TestbedDesigner' ;
T61 : 'designsVirtualTestbeds' ;
T62 : 'Admin' ;
T63 : 'OfficeCustomer' ;
T64 : 'utilizesVirtualTestbed' ;
T65 : 'hasTestbedDesigner' ;
T66 : 'OfficePersonel' ;
T67 : 'Site' ;
T68 : 'ptm' ;
T69 : 'igwlist' ;
T70 : 'locatedAt' ;
T71 : 'offeredResourcesList' ;
T72 : 'PTM' ;
T73 : 'IP' ;
T74 : 'IGW' ;
T75 : 'SiteLocation' ;
T76 : 'geocoords' ;
T77 : 'OfferedResource' ;
T78 : 'resourceType' ;
T79 : 'multitonMaxOccur' ;
T80 : 'contributesToCategories' ;
T81 : 'requiresResources' ;
T82 : 'implOfferedService' ;
T83 : 'resourceSettings' ;
T84 : 'userExposed' ;
T85 : 'userEditable' ;
T86 : 'canBePublished' ;
T87 : 'ResourceSetting' ;
T88 : 'Readable' ;
T89 : 'Writable' ;
T90 : 'requiresParams' ;
T91 : 'OnlyConfiguredByResources' ;
T92 : 'implServiceSetting' ;
T93 : 'settingType' ;
T94 : 'settingConstraints' ;
T95 : 'ResourceCategory' ;
T96 : 'resourcelist' ;
T97 : 'Resource' ;
T98 : 'Service' ;
T99 : 'SettingConstraint' ;
T100 : 'AvailableAfterOperation' ;
T101 : 'RequiredBeforeOperation' ;
T102 : 'ForOperation' ;
T103 : 'AbstractSetting' ;
T104 : 'ServiceSetting' ;
T105 : 'mappedToResourceSettings' ;
T106 : 'providedByResources' ;
T107 : 'tideTypeString' ;
T108 : 'defaultValue' ;
T109 : 'tideTypeEnum' ;
T110 : 'tideEnumlist' ;
T111 : 'tideTypeList' ;
T112 : 'ContainsElementsOf' ;
T113 : 'tideTypeTideElement' ;
T114 : 'ofTideElement' ;
T115 : 'tideTypeEnumItem' ;
T116 : 'value' ;
T117 : 'Repeat' ;
T118 : 'Availability' ;
T119 : 'FromTime' ;
T120 : 'ToTime' ;
T121 : 'FromDate' ;
T122 : 'ToDate' ;
T123 : 'Repeatability' ;
T124 : 'RepeatUntil' ;
T125 : 'cost' ;
T126 : 'Cost' ;
T127 : 'perUnit' ;
T128 : 'Amount' ;
T129 : '.' ;
T130 : 'E' ;
T131 : 'e' ;
T132 : 'ReservedResourceContract' ;
T133 : 'forResource' ;
T134 : 'SINGLETON' ;
T135 : 'MULTITON' ;
T136 : 'OP_CREATE' ;
T137 : 'OP_READ' ;
T138 : 'OP_UPDATE' ;
T139 : 'OP_DELETE' ;
T140 : 'DAILY' ;
T141 : 'WEEKLY' ;
T142 : 'MONTHLY' ;
T143 : 'YEARLY' ;
T144 : 'MIN' ;
T145 : 'HOUR' ;
T146 : 'DAY' ;
T147 : 'USAGE' ;
T148 : 'OTHER' ;

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9377
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9379
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9381
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9383
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9385
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9387
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.panlab.officedl/src-gen/org/panlab/officedl/parser/antlr/internal/InternalOfficeDL.g" 9389
RULE_ANY_OTHER : .;


