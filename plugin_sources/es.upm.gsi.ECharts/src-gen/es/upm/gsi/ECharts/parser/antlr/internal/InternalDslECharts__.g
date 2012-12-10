lexer grammar InternalDslECharts;
@header {
package es.upm.gsi.ECharts.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'package' ;
T14 : ';' ;
T15 : 'import' ;
T16 : '.*' ;
T17 : 'machine' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'concurrent' ;
T21 : 'state' ;
T22 : ':' ;
T23 : 'entry' ;
T24 : 'exit' ;
T25 : 'public' ;
T26 : '(' ;
T27 : ')' ;
T28 : '()' ;
T29 : ',' ;
T30 : 'this.' ;
T31 : '=' ;
T32 : '!' ;
T33 : '+' ;
T34 : '*' ;
T35 : '.' ;
T36 : 'transition' ;
T37 : '[' ;
T38 : ']' ;
T39 : 'private' ;
T40 : 'protected' ;
T41 : 'final' ;
T42 : 'abstract' ;
T43 : 'initial' ;
T44 : 'nonterminal' ;
T45 : 'concurent' ;

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2565
RULE_ASSINGTRANSITION : ('-->'|'- [' ( options {greedy=false;} : . )*'] /' ( options {greedy=false;} : . )*'->'|'-' RULE_ID '?' RULE_ID '/' ( options {greedy=false;} : . )*'->');

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2567
RULE_PLAINTEXT : '<* ' ( options {greedy=false;} : . )*'*>';

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2569
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2571
RULE_INT : ('0'..'9')+;

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2573
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2575
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2577
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2579
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g" 2581
RULE_ANY_OTHER : .;


