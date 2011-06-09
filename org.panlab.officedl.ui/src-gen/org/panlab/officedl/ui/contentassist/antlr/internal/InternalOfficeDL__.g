lexer grammar InternalOfficeDL;
@header {
package org.panlab.officedl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'E' ;
T12 : 'e' ;
T13 : 'SINGLETON' ;
T14 : 'MULTITON' ;
T15 : 'OP_CREATE' ;
T16 : 'OP_READ' ;
T17 : 'OP_UPDATE' ;
T18 : 'OP_DELETE' ;
T19 : 'DAILY' ;
T20 : 'WEEKLY' ;
T21 : 'MONTHLY' ;
T22 : 'YEARLY' ;
T23 : 'MIN' ;
T24 : 'HOUR' ;
T25 : 'DAY' ;
T26 : 'USAGE' ;
T27 : 'OTHER' ;
T28 : 'import service description' ;
T29 : ';' ;
T30 : 'Office' ;
T31 : '{' ;
T32 : '}' ;
T33 : 'name' ;
T34 : 'id' ;
T35 : 'description' ;
T36 : 'resourceURI' ;
T37 : 'APIGateway' ;
T38 : 'registeredUsers' ;
T39 : ',' ;
T40 : 'contributedTaxonomies' ;
T41 : 'offeredServices' ;
T42 : 'offeredServiceCompositions' ;
T43 : 'ResourceServiceContracts' ;
T44 : 'SLAs' ;
T45 : '-' ;
T46 : 'Taxonomy' ;
T47 : 'hasScenarios' ;
T48 : '(' ;
T49 : ')' ;
T50 : 'hasServices' ;
T51 : 'taxonomies' ;
T52 : 'categories' ;
T53 : 'OfferedService' ;
T54 : 'requiresServices' ;
T55 : 'serviceSettings' ;
T56 : 'ServiceComposition' ;
T57 : 'ResourceServiceContract' ;
T58 : 'StartDate' ;
T59 : 'EndDate' ;
T60 : 'forOfferedService' ;
T61 : 'forOfferedResource' ;
T62 : 'availability' ;
T63 : 'SLA' ;
T64 : 'ValidFrom' ;
T65 : 'ValidUntil' ;
T66 : 'forVT' ;
T67 : 'ReservedRsources' ;
T68 : 'Account' ;
T69 : 'password' ;
T70 : 'username' ;
T71 : 'ResourcesProvider' ;
T72 : 'organization' ;
T73 : 'address' ;
T74 : 'telephone' ;
T75 : 'hasAccount' ;
T76 : 'offeredSiteList' ;
T77 : 'TestbedDesigner' ;
T78 : 'designsVirtualTestbeds' ;
T79 : 'Admin' ;
T80 : 'OfficeCustomer' ;
T81 : 'utilizesVirtualTestbed' ;
T82 : 'hasTestbedDesigner' ;
T83 : 'OfficePersonel' ;
T84 : 'Site' ;
T85 : 'ptm' ;
T86 : 'igwlist' ;
T87 : 'locatedAt' ;
T88 : 'offeredResourcesList' ;
T89 : 'PTM' ;
T90 : 'IP' ;
T91 : 'IGW' ;
T92 : 'SiteLocation' ;
T93 : 'geocoords' ;
T94 : 'OfferedResource' ;
T95 : 'resourceType' ;
T96 : 'multitonMaxOccur' ;
T97 : 'contributesToCategories' ;
T98 : 'requiresResources' ;
T99 : 'implOfferedService' ;
T100 : 'resourceSettings' ;
T101 : 'ResourceSetting' ;
T102 : 'requiresParams' ;
T103 : 'OnlyConfiguredByResources' ;
T104 : 'implServiceSetting' ;
T105 : 'settingType' ;
T106 : 'settingConstraints' ;
T107 : 'ResourceCategory' ;
T108 : 'resourcelist' ;
T109 : 'Resource' ;
T110 : 'Service' ;
T111 : 'SettingConstraint' ;
T112 : 'ForOperation' ;
T113 : 'AbstractSetting' ;
T114 : 'ServiceSetting' ;
T115 : 'mappedToResourceSettings' ;
T116 : 'providedByResources' ;
T117 : 'tideTypeString' ;
T118 : 'defaultValue' ;
T119 : 'tideTypeEnum' ;
T120 : 'tideEnumlist' ;
T121 : 'tideTypeList' ;
T122 : 'ContainsElementsOf' ;
T123 : 'tideTypeTideElement' ;
T124 : 'ofTideElement' ;
T125 : 'tideTypeEnumItem' ;
T126 : 'value' ;
T127 : 'Availability' ;
T128 : 'FromTime' ;
T129 : 'ToTime' ;
T130 : 'FromDate' ;
T131 : 'ToDate' ;
T132 : 'Repeatability' ;
T133 : 'RepeatUntil' ;
T134 : 'cost' ;
T135 : 'Cost' ;
T136 : 'perUnit' ;
T137 : 'Amount' ;
T138 : '.' ;
T139 : 'ReservedResourceContract' ;
T140 : 'forResource' ;
T141 : 'userExposed' ;
T142 : 'userEditable' ;
T143 : 'canBePublished' ;
T144 : 'Readable' ;
T145 : 'Writable' ;
T146 : 'AvailableAfterOperation' ;
T147 : 'RequiredBeforeOperation' ;
T148 : 'Repeat' ;

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35808
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35810
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35812
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35814
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35816
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35818
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.panlab.officedl.ui/src-gen/org/panlab/officedl/ui/contentassist/antlr/internal/InternalOfficeDL.g" 35820
RULE_ANY_OTHER : .;


