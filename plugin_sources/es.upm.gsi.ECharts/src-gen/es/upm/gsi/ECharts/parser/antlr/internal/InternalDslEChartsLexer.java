package es.upm.gsi.ECharts.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslEChartsLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int RULE_PLAINTEXT=8;
    public static final int T43=43;
    public static final int Tokens=46;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int RULE_ASSINGTRANSITION=7;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=11;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalDslEChartsLexer() {;} 
    public InternalDslEChartsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:10:5: ( 'package' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:10:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:11:5: ( ';' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:12:5: ( 'import' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:12:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:13:5: ( '.*' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:13:7: '.*'
            {
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:14:5: ( 'machine' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:14:7: 'machine'
            {
            match("machine"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:15:5: ( '{' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:15:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:16:5: ( '}' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:17:5: ( 'concurrent' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:17:7: 'concurrent'
            {
            match("concurrent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:18:5: ( 'state' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:18:7: 'state'
            {
            match("state"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:19:5: ( ':' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:19:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:20:5: ( 'entry' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:20:7: 'entry'
            {
            match("entry"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:21:5: ( 'exit' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:21:7: 'exit'
            {
            match("exit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:22:5: ( 'public' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:22:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:23:5: ( '(' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:23:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:24:5: ( ')' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:24:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:25:5: ( '()' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:25:7: '()'
            {
            match("()"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:26:5: ( ',' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:26:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:27:5: ( 'this.' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:27:7: 'this.'
            {
            match("this."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:28:5: ( '=' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:28:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:29:5: ( '!' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:29:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:30:5: ( '+' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:30:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:31:5: ( '*' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:31:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:32:5: ( '.' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:32:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:33:5: ( 'transition' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:33:7: 'transition'
            {
            match("transition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:34:5: ( '[' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:34:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:35:5: ( ']' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:35:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:36:5: ( 'private' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:36:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:37:5: ( 'protected' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:37:7: 'protected'
            {
            match("protected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:38:5: ( 'final' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:38:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:39:5: ( 'abstract' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:39:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:40:5: ( 'initial' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:40:7: 'initial'
            {
            match("initial"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:41:5: ( 'nonterminal' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:41:7: 'nonterminal'
            {
            match("nonterminal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:42:5: ( 'concurent' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:42:7: 'concurent'
            {
            match("concurent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_ASSINGTRANSITION
    public final void mRULE_ASSINGTRANSITION() throws RecognitionException {
        try {
            int _type = RULE_ASSINGTRANSITION;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:23: ( ( '-->' | '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->' | '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->' ) )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:25: ( '-->' | '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->' | '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->' )
            {
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:25: ( '-->' | '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->' | '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                switch ( input.LA(2) ) {
                case '-':
                    {
                    alt4=1;
                    }
                    break;
                case ' ':
                    {
                    alt4=2;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '^':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("2565:25: ( '-->' | '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->' | '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->' )", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2565:25: ( '-->' | '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->' | '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:26: '-->'
                    {
                    match("-->"); 


                    }
                    break;
                case 2 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:32: '- [' ( options {greedy=false; } : . )* '] /' ( options {greedy=false; } : . )* '->'
                    {
                    match("- ["); 

                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:38: ( options {greedy=false; } : . )*
                    loop1:
                    do {
                        int alt1=2;
                        alt1 = dfa1.predict(input);
                        switch (alt1) {
                    	case 1 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:66: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match("] /"); 

                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:76: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='-') ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1=='>') ) {
                                alt2=2;
                            }
                            else if ( ((LA2_1>='\u0000' && LA2_1<='=')||(LA2_1>='?' && LA2_1<='\uFFFE')) ) {
                                alt2=1;
                            }


                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='\uFFFE')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:104: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match("->"); 


                    }
                    break;
                case 3 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:113: '-' RULE_ID '?' RULE_ID '/' ( options {greedy=false; } : . )* '->'
                    {
                    match('-'); 
                    mRULE_ID(); 
                    match('?'); 
                    mRULE_ID(); 
                    match('/'); 
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:141: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='-') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='>') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1>='\u0000' && LA3_1<='=')||(LA3_1>='?' && LA3_1<='\uFFFE')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<=',')||(LA3_0>='.' && LA3_0<='\uFFFE')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2565:169: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match("->"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ASSINGTRANSITION

    // $ANTLR start RULE_PLAINTEXT
    public final void mRULE_PLAINTEXT() throws RecognitionException {
        try {
            int _type = RULE_PLAINTEXT;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2567:16: ( '<* ' ( options {greedy=false; } : . )* '*>' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2567:18: '<* ' ( options {greedy=false; } : . )* '*>'
            {
            match("<* "); 

            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2567:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='>') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='=')||(LA5_1>='?' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2567:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PLAINTEXT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2569:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2569:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2569:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2569:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2569:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2571:10: ( ( '0' .. '9' )+ )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2571:12: ( '0' .. '9' )+
            {
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2571:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2571:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2573:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2573:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2575:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2575:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2575:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2575:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:41: ( '\\r' )? '\\n'
                    {
                    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2577:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2579:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2579:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2579:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2581:16: ( . )
            // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:2581:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ASSINGTRANSITION | RULE_PLAINTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=42;
        int LA17_0 = input.LA(1);

        if ( (LA17_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA17_35 = input.LA(3);

                if ( (LA17_35=='c') ) {
                    int LA17_74 = input.LA(4);

                    if ( (LA17_74=='k') ) {
                        int LA17_90 = input.LA(5);

                        if ( (LA17_90=='a') ) {
                            int LA17_106 = input.LA(6);

                            if ( (LA17_106=='g') ) {
                                int LA17_122 = input.LA(7);

                                if ( (LA17_122=='e') ) {
                                    int LA17_136 = input.LA(8);

                                    if ( ((LA17_136>='0' && LA17_136<='9')||(LA17_136>='A' && LA17_136<='Z')||LA17_136=='_'||(LA17_136>='a' && LA17_136<='z')) ) {
                                        alt17=36;
                                    }
                                    else {
                                        alt17=1;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA17_75 = input.LA(4);

                    if ( (LA17_75=='v') ) {
                        int LA17_91 = input.LA(5);

                        if ( (LA17_91=='a') ) {
                            int LA17_107 = input.LA(6);

                            if ( (LA17_107=='t') ) {
                                int LA17_123 = input.LA(7);

                                if ( (LA17_123=='e') ) {
                                    int LA17_137 = input.LA(8);

                                    if ( ((LA17_137>='0' && LA17_137<='9')||(LA17_137>='A' && LA17_137<='Z')||LA17_137=='_'||(LA17_137>='a' && LA17_137<='z')) ) {
                                        alt17=36;
                                    }
                                    else {
                                        alt17=27;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                    }
                    break;
                case 'o':
                    {
                    int LA17_76 = input.LA(4);

                    if ( (LA17_76=='t') ) {
                        int LA17_92 = input.LA(5);

                        if ( (LA17_92=='e') ) {
                            int LA17_108 = input.LA(6);

                            if ( (LA17_108=='c') ) {
                                int LA17_124 = input.LA(7);

                                if ( (LA17_124=='t') ) {
                                    int LA17_138 = input.LA(8);

                                    if ( (LA17_138=='e') ) {
                                        int LA17_150 = input.LA(9);

                                        if ( (LA17_150=='d') ) {
                                            int LA17_158 = input.LA(10);

                                            if ( ((LA17_158>='0' && LA17_158<='9')||(LA17_158>='A' && LA17_158<='Z')||LA17_158=='_'||(LA17_158>='a' && LA17_158<='z')) ) {
                                                alt17=36;
                                            }
                                            else {
                                                alt17=28;}
                                        }
                                        else {
                                            alt17=36;}
                                    }
                                    else {
                                        alt17=36;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                    }
                    break;
                default:
                    alt17=36;}

                }
                break;
            case 'u':
                {
                int LA17_37 = input.LA(3);

                if ( (LA17_37=='b') ) {
                    int LA17_77 = input.LA(4);

                    if ( (LA17_77=='l') ) {
                        int LA17_93 = input.LA(5);

                        if ( (LA17_93=='i') ) {
                            int LA17_109 = input.LA(6);

                            if ( (LA17_109=='c') ) {
                                int LA17_125 = input.LA(7);

                                if ( ((LA17_125>='0' && LA17_125<='9')||(LA17_125>='A' && LA17_125<='Z')||LA17_125=='_'||(LA17_125>='a' && LA17_125<='z')) ) {
                                    alt17=36;
                                }
                                else {
                                    alt17=13;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            default:
                alt17=36;}

        }
        else if ( (LA17_0==';') ) {
            alt17=2;
        }
        else if ( (LA17_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA17_40 = input.LA(3);

                if ( (LA17_40=='i') ) {
                    int LA17_78 = input.LA(4);

                    if ( (LA17_78=='t') ) {
                        int LA17_94 = input.LA(5);

                        if ( (LA17_94=='i') ) {
                            int LA17_110 = input.LA(6);

                            if ( (LA17_110=='a') ) {
                                int LA17_126 = input.LA(7);

                                if ( (LA17_126=='l') ) {
                                    int LA17_140 = input.LA(8);

                                    if ( ((LA17_140>='0' && LA17_140<='9')||(LA17_140>='A' && LA17_140<='Z')||LA17_140=='_'||(LA17_140>='a' && LA17_140<='z')) ) {
                                        alt17=36;
                                    }
                                    else {
                                        alt17=31;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            case 'm':
                {
                int LA17_41 = input.LA(3);

                if ( (LA17_41=='p') ) {
                    int LA17_79 = input.LA(4);

                    if ( (LA17_79=='o') ) {
                        int LA17_95 = input.LA(5);

                        if ( (LA17_95=='r') ) {
                            int LA17_111 = input.LA(6);

                            if ( (LA17_111=='t') ) {
                                int LA17_127 = input.LA(7);

                                if ( ((LA17_127>='0' && LA17_127<='9')||(LA17_127>='A' && LA17_127<='Z')||LA17_127=='_'||(LA17_127>='a' && LA17_127<='z')) ) {
                                    alt17=36;
                                }
                                else {
                                    alt17=3;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            default:
                alt17=36;}

        }
        else if ( (LA17_0=='.') ) {
            int LA17_4 = input.LA(2);

            if ( (LA17_4=='*') ) {
                alt17=4;
            }
            else {
                alt17=23;}
        }
        else if ( (LA17_0=='m') ) {
            int LA17_5 = input.LA(2);

            if ( (LA17_5=='a') ) {
                int LA17_44 = input.LA(3);

                if ( (LA17_44=='c') ) {
                    int LA17_80 = input.LA(4);

                    if ( (LA17_80=='h') ) {
                        int LA17_96 = input.LA(5);

                        if ( (LA17_96=='i') ) {
                            int LA17_112 = input.LA(6);

                            if ( (LA17_112=='n') ) {
                                int LA17_128 = input.LA(7);

                                if ( (LA17_128=='e') ) {
                                    int LA17_142 = input.LA(8);

                                    if ( ((LA17_142>='0' && LA17_142<='9')||(LA17_142>='A' && LA17_142<='Z')||LA17_142=='_'||(LA17_142>='a' && LA17_142<='z')) ) {
                                        alt17=36;
                                    }
                                    else {
                                        alt17=5;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0=='{') ) {
            alt17=6;
        }
        else if ( (LA17_0=='}') ) {
            alt17=7;
        }
        else if ( (LA17_0=='c') ) {
            int LA17_8 = input.LA(2);

            if ( (LA17_8=='o') ) {
                int LA17_47 = input.LA(3);

                if ( (LA17_47=='n') ) {
                    int LA17_81 = input.LA(4);

                    if ( (LA17_81=='c') ) {
                        int LA17_97 = input.LA(5);

                        if ( (LA17_97=='u') ) {
                            int LA17_113 = input.LA(6);

                            if ( (LA17_113=='r') ) {
                                switch ( input.LA(7) ) {
                                case 'e':
                                    {
                                    int LA17_143 = input.LA(8);

                                    if ( (LA17_143=='n') ) {
                                        int LA17_153 = input.LA(9);

                                        if ( (LA17_153=='t') ) {
                                            int LA17_159 = input.LA(10);

                                            if ( ((LA17_159>='0' && LA17_159<='9')||(LA17_159>='A' && LA17_159<='Z')||LA17_159=='_'||(LA17_159>='a' && LA17_159<='z')) ) {
                                                alt17=36;
                                            }
                                            else {
                                                alt17=33;}
                                        }
                                        else {
                                            alt17=36;}
                                    }
                                    else {
                                        alt17=36;}
                                    }
                                    break;
                                case 'r':
                                    {
                                    int LA17_144 = input.LA(8);

                                    if ( (LA17_144=='e') ) {
                                        int LA17_154 = input.LA(9);

                                        if ( (LA17_154=='n') ) {
                                            int LA17_160 = input.LA(10);

                                            if ( (LA17_160=='t') ) {
                                                int LA17_166 = input.LA(11);

                                                if ( ((LA17_166>='0' && LA17_166<='9')||(LA17_166>='A' && LA17_166<='Z')||LA17_166=='_'||(LA17_166>='a' && LA17_166<='z')) ) {
                                                    alt17=36;
                                                }
                                                else {
                                                    alt17=8;}
                                            }
                                            else {
                                                alt17=36;}
                                        }
                                        else {
                                            alt17=36;}
                                    }
                                    else {
                                        alt17=36;}
                                    }
                                    break;
                                default:
                                    alt17=36;}

                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0=='s') ) {
            int LA17_9 = input.LA(2);

            if ( (LA17_9=='t') ) {
                int LA17_48 = input.LA(3);

                if ( (LA17_48=='a') ) {
                    int LA17_82 = input.LA(4);

                    if ( (LA17_82=='t') ) {
                        int LA17_98 = input.LA(5);

                        if ( (LA17_98=='e') ) {
                            int LA17_114 = input.LA(6);

                            if ( ((LA17_114>='0' && LA17_114<='9')||(LA17_114>='A' && LA17_114<='Z')||LA17_114=='_'||(LA17_114>='a' && LA17_114<='z')) ) {
                                alt17=36;
                            }
                            else {
                                alt17=9;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0==':') ) {
            alt17=10;
        }
        else if ( (LA17_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA17_50 = input.LA(3);

                if ( (LA17_50=='i') ) {
                    int LA17_83 = input.LA(4);

                    if ( (LA17_83=='t') ) {
                        int LA17_99 = input.LA(5);

                        if ( ((LA17_99>='0' && LA17_99<='9')||(LA17_99>='A' && LA17_99<='Z')||LA17_99=='_'||(LA17_99>='a' && LA17_99<='z')) ) {
                            alt17=36;
                        }
                        else {
                            alt17=12;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            case 'n':
                {
                int LA17_51 = input.LA(3);

                if ( (LA17_51=='t') ) {
                    int LA17_84 = input.LA(4);

                    if ( (LA17_84=='r') ) {
                        int LA17_100 = input.LA(5);

                        if ( (LA17_100=='y') ) {
                            int LA17_116 = input.LA(6);

                            if ( ((LA17_116>='0' && LA17_116<='9')||(LA17_116>='A' && LA17_116<='Z')||LA17_116=='_'||(LA17_116>='a' && LA17_116<='z')) ) {
                                alt17=36;
                            }
                            else {
                                alt17=11;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            default:
                alt17=36;}

        }
        else if ( (LA17_0=='(') ) {
            int LA17_12 = input.LA(2);

            if ( (LA17_12==')') ) {
                alt17=16;
            }
            else {
                alt17=14;}
        }
        else if ( (LA17_0==')') ) {
            alt17=15;
        }
        else if ( (LA17_0==',') ) {
            alt17=17;
        }
        else if ( (LA17_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA17_56 = input.LA(3);

                if ( (LA17_56=='i') ) {
                    int LA17_85 = input.LA(4);

                    if ( (LA17_85=='s') ) {
                        int LA17_101 = input.LA(5);

                        if ( (LA17_101=='.') ) {
                            alt17=18;
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            case 'r':
                {
                int LA17_57 = input.LA(3);

                if ( (LA17_57=='a') ) {
                    int LA17_86 = input.LA(4);

                    if ( (LA17_86=='n') ) {
                        int LA17_102 = input.LA(5);

                        if ( (LA17_102=='s') ) {
                            int LA17_118 = input.LA(6);

                            if ( (LA17_118=='i') ) {
                                int LA17_132 = input.LA(7);

                                if ( (LA17_132=='t') ) {
                                    int LA17_145 = input.LA(8);

                                    if ( (LA17_145=='i') ) {
                                        int LA17_155 = input.LA(9);

                                        if ( (LA17_155=='o') ) {
                                            int LA17_161 = input.LA(10);

                                            if ( (LA17_161=='n') ) {
                                                int LA17_167 = input.LA(11);

                                                if ( ((LA17_167>='0' && LA17_167<='9')||(LA17_167>='A' && LA17_167<='Z')||LA17_167=='_'||(LA17_167>='a' && LA17_167<='z')) ) {
                                                    alt17=36;
                                                }
                                                else {
                                                    alt17=24;}
                                            }
                                            else {
                                                alt17=36;}
                                        }
                                        else {
                                            alt17=36;}
                                    }
                                    else {
                                        alt17=36;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
                }
                break;
            default:
                alt17=36;}

        }
        else if ( (LA17_0=='=') ) {
            alt17=19;
        }
        else if ( (LA17_0=='!') ) {
            alt17=20;
        }
        else if ( (LA17_0=='+') ) {
            alt17=21;
        }
        else if ( (LA17_0=='*') ) {
            alt17=22;
        }
        else if ( (LA17_0=='[') ) {
            alt17=25;
        }
        else if ( (LA17_0==']') ) {
            alt17=26;
        }
        else if ( (LA17_0=='f') ) {
            int LA17_22 = input.LA(2);

            if ( (LA17_22=='i') ) {
                int LA17_64 = input.LA(3);

                if ( (LA17_64=='n') ) {
                    int LA17_87 = input.LA(4);

                    if ( (LA17_87=='a') ) {
                        int LA17_103 = input.LA(5);

                        if ( (LA17_103=='l') ) {
                            int LA17_119 = input.LA(6);

                            if ( ((LA17_119>='0' && LA17_119<='9')||(LA17_119>='A' && LA17_119<='Z')||LA17_119=='_'||(LA17_119>='a' && LA17_119<='z')) ) {
                                alt17=36;
                            }
                            else {
                                alt17=29;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0=='a') ) {
            int LA17_23 = input.LA(2);

            if ( (LA17_23=='b') ) {
                int LA17_65 = input.LA(3);

                if ( (LA17_65=='s') ) {
                    int LA17_88 = input.LA(4);

                    if ( (LA17_88=='t') ) {
                        int LA17_104 = input.LA(5);

                        if ( (LA17_104=='r') ) {
                            int LA17_120 = input.LA(6);

                            if ( (LA17_120=='a') ) {
                                int LA17_134 = input.LA(7);

                                if ( (LA17_134=='c') ) {
                                    int LA17_146 = input.LA(8);

                                    if ( (LA17_146=='t') ) {
                                        int LA17_156 = input.LA(9);

                                        if ( ((LA17_156>='0' && LA17_156<='9')||(LA17_156>='A' && LA17_156<='Z')||LA17_156=='_'||(LA17_156>='a' && LA17_156<='z')) ) {
                                            alt17=36;
                                        }
                                        else {
                                            alt17=30;}
                                    }
                                    else {
                                        alt17=36;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0=='n') ) {
            int LA17_24 = input.LA(2);

            if ( (LA17_24=='o') ) {
                int LA17_66 = input.LA(3);

                if ( (LA17_66=='n') ) {
                    int LA17_89 = input.LA(4);

                    if ( (LA17_89=='t') ) {
                        int LA17_105 = input.LA(5);

                        if ( (LA17_105=='e') ) {
                            int LA17_121 = input.LA(6);

                            if ( (LA17_121=='r') ) {
                                int LA17_135 = input.LA(7);

                                if ( (LA17_135=='m') ) {
                                    int LA17_147 = input.LA(8);

                                    if ( (LA17_147=='i') ) {
                                        int LA17_157 = input.LA(9);

                                        if ( (LA17_157=='n') ) {
                                            int LA17_163 = input.LA(10);

                                            if ( (LA17_163=='a') ) {
                                                int LA17_168 = input.LA(11);

                                                if ( (LA17_168=='l') ) {
                                                    int LA17_171 = input.LA(12);

                                                    if ( ((LA17_171>='0' && LA17_171<='9')||(LA17_171>='A' && LA17_171<='Z')||LA17_171=='_'||(LA17_171>='a' && LA17_171<='z')) ) {
                                                        alt17=36;
                                                    }
                                                    else {
                                                        alt17=32;}
                                                }
                                                else {
                                                    alt17=36;}
                                            }
                                            else {
                                                alt17=36;}
                                        }
                                        else {
                                            alt17=36;}
                                    }
                                    else {
                                        alt17=36;}
                                }
                                else {
                                    alt17=36;}
                            }
                            else {
                                alt17=36;}
                        }
                        else {
                            alt17=36;}
                    }
                    else {
                        alt17=36;}
                }
                else {
                    alt17=36;}
            }
            else {
                alt17=36;}
        }
        else if ( (LA17_0=='-') ) {
            int LA17_25 = input.LA(2);

            if ( (LA17_25==' '||LA17_25=='-'||(LA17_25>='A' && LA17_25<='Z')||(LA17_25>='^' && LA17_25<='_')||(LA17_25>='a' && LA17_25<='z')) ) {
                alt17=34;
            }
            else {
                alt17=42;}
        }
        else if ( (LA17_0=='<') ) {
            int LA17_26 = input.LA(2);

            if ( (LA17_26=='*') ) {
                alt17=35;
            }
            else {
                alt17=42;}
        }
        else if ( (LA17_0=='^') ) {
            int LA17_27 = input.LA(2);

            if ( ((LA17_27>='A' && LA17_27<='Z')||LA17_27=='_'||(LA17_27>='a' && LA17_27<='z')) ) {
                alt17=36;
            }
            else {
                alt17=42;}
        }
        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||LA17_0=='d'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||LA17_0=='o'||(LA17_0>='q' && LA17_0<='r')||(LA17_0>='u' && LA17_0<='z')) ) {
            alt17=36;
        }
        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {
            alt17=37;
        }
        else if ( (LA17_0=='\"') ) {
            int LA17_30 = input.LA(2);

            if ( ((LA17_30>='\u0000' && LA17_30<='\uFFFE')) ) {
                alt17=38;
            }
            else {
                alt17=42;}
        }
        else if ( (LA17_0=='\'') ) {
            int LA17_31 = input.LA(2);

            if ( ((LA17_31>='\u0000' && LA17_31<='\uFFFE')) ) {
                alt17=38;
            }
            else {
                alt17=42;}
        }
        else if ( (LA17_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt17=40;
                }
                break;
            case '*':
                {
                alt17=39;
                }
                break;
            default:
                alt17=42;}

        }
        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
            alt17=41;
        }
        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='>' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFE')) ) {
            alt17=42;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ASSINGTRANSITION | RULE_PLAINTEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 17, 0, input);

            throw nvae;
        }
        switch (alt17) {
            case 1 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:142: RULE_ASSINGTRANSITION
                {
                mRULE_ASSINGTRANSITION(); 

                }
                break;
            case 35 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:164: RULE_PLAINTEXT
                {
                mRULE_PLAINTEXT(); 

                }
                break;
            case 36 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../es.upm.gsi.ECharts/src-gen/es/upm/gsi/ECharts/parser/antlr/internal/InternalDslECharts.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\2\0\1\uffff\5\0\1\uffff\1\0\1\uffff";
    static final String DFA1_maxS =
        "\2\ufffe\1\uffff\5\ufffe\1\uffff\1\ufffe\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\1\uffff\1\2";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\135\2\1\1\uffa1\2",
            "\40\2\1\3\uffde\2",
            "",
            "\57\2\1\4\uffcf\2",
            "\55\7\1\5\57\7\1\6\uffa1\7",
            "\55\7\1\5\20\7\1\10\36\7\1\6\uffa1\7",
            "\40\7\1\11\14\7\1\5\57\7\1\6\uffa1\7",
            "\55\7\1\5\57\7\1\6\uffa1\7",
            "",
            "\55\7\1\5\1\7\1\12\55\7\1\6\uffa1\7",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 2565:38: ( options {greedy=false; } : . )*";
        }
    }
 

}