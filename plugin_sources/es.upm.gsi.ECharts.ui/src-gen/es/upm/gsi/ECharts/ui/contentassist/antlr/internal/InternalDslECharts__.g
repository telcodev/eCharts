lexer grammar InternalDslECharts;
@header {
package es.upm.gsi.ECharts.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : ';' ;
T14 : '()' ;
T15 : 'private' ;
T16 : 'public' ;
T17 : 'protected' ;
T18 : 'final' ;
T19 : 'abstract' ;
T20 : 'initial' ;
T21 : 'nonterminal' ;
T22 : 'concurent' ;
T23 : 'package' ;
T24 : 'import' ;
T25 : '.*' ;
T26 : 'machine' ;
T27 : '{' ;
T28 : '}' ;
T29 : 'state' ;
T30 : ':' ;
T31 : 'entry' ;
T32 : 'exit' ;
T33 : '(' ;
T34 : ')' ;
T35 : ',' ;
T36 : 'this.' ;
T37 : '=' ;
T38 : '!' ;
T39 : '+' ;
T40 : '*' ;
T41 : '.' ;
T42 : 'transition' ;
T43 : '[' ;
T44 : ']' ;
T45 : 'concurrent' ;

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5623
RULE_ASSINGTRANSITION : ('-->'|'- [' ( options {greedy=false;} : . )*'] /' ( options {greedy=false;} : . )*'->'|'-' RULE_ID '?' RULE_ID '/' ( options {greedy=false;} : . )*'->');

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5625
RULE_PLAINTEXT : '<* ' ( options {greedy=false;} : . )*'*>';

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5627
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5629
RULE_INT : ('0'..'9')+;

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5631
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5633
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5635
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5637
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../es.upm.gsi.ECharts.ui/src-gen/es/upm/gsi/ECharts/ui/contentassist/antlr/internal/InternalDslECharts.g" 5639
RULE_ANY_OTHER : .;


