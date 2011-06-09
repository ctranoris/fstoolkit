package gr.upatras.ece.wcl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDLLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=38;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalSDLLexer() {;} 
    public InternalSDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:10:5: ( 'true' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:10:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:11:5: ( 'false' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:11:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:12:5: ( 'import office' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:12:7: 'import office'
            {
            match("import office"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:13:5: ( ';' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:13:7: ';'
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:14:5: ( 'ServiceSetting' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:14:7: 'ServiceSetting'
            {
            match("ServiceSetting"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:15:5: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:15:7: '{'
            {
            match('{'); 

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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:16:5: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:16:7: '}'
            {
            match('}'); 

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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:17:5: ( 'id' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:17:7: 'id'
            {
            match("id"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:18:5: ( 'description' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:18:7: 'description'
            {
            match("description"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:19:5: ( 'Readable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:19:7: 'Readable'
            {
            match("Readable"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:20:5: ( 'Writable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:20:7: 'Writable'
            {
            match("Writable"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:21:5: ( 'requiresParams' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:21:7: 'requiresParams'
            {
            match("requiresParams"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:22:5: ( '(' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:22:7: '('
            {
            match('('); 

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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:23:5: ( ')' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:23:7: ')'
            {
            match(')'); 

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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:24:5: ( ',' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:24:7: ','
            {
            match(','); 

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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:25:5: ( 'settingType' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:25:7: 'settingType'
            {
            match("settingType"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:26:5: ( 'OfferedService' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:26:7: 'OfferedService'
            {
            match("OfferedService"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:27:5: ( 'serviceSettings' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:27:7: 'serviceSettings'
            {
            match("serviceSettings"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:28:5: ( 'STRING' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:28:7: 'STRING'
            {
            match("STRING"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:29:5: ( 'defaultValue' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:29:7: 'defaultValue'
            {
            match("defaultValue"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:30:5: ( 'Enum' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:30:7: 'Enum'
            {
            match("Enum"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:31:5: ( 'tideEnumlist' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:31:7: 'tideEnumlist'
            {
            match("tideEnumlist"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:32:5: ( 'tideTypeEnumItem' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:32:7: 'tideTypeEnumItem'
            {
            match("tideTypeEnumItem"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:33:5: ( 'value' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:33:7: 'value'
            {
            match("value"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:34:5: ( 'userExposed' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:34:7: 'userExposed'
            {
            match("userExposed"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:35:5: ( 'userEditable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:35:7: 'userEditable'
            {
            match("userEditable"); 


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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:36:5: ( 'canBePublished' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:36:7: 'canBePublished'
            {
            match("canBePublished"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3299:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3299:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3299:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3299:11: '^'
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

            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3299:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:
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
            	    break loop2;
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3301:10: ( ( '0' .. '9' )+ )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3301:12: ( '0' .. '9' )+
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3301:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3301:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3303:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3303:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3305:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3305:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3305:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3305:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:41: ( '\\r' )? '\\n'
                    {
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3307:41: '\\r'
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3309:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3309:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3309:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3311:16: ( . )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3311:18: .
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
        // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=34;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='f') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='S') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='d') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='R') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='W') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='r') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='O') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='E') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='u') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper021();
        }
        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='q')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12 = mTokensHelper022();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper026();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper027();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper028();
        }
        else {
            alt12 = mTokensHelper029();
        }
        switch (alt12) {
            case 1 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:118: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:126: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:135: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:147: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:163: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:179: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1:187: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'i':
            {
            int LA12_29 = input.LA(3);

            if ( (LA12_29=='d') ) {
                int LA12_58 = input.LA(4);

                if ( (LA12_58=='e') ) {
                    switch ( input.LA(5) ) {
                    case 'T':
                        {
                        int LA12_95 = input.LA(6);

                        if ( (LA12_95=='y') ) {
                            int LA12_114 = input.LA(7);

                            if ( (LA12_114=='p') ) {
                                int LA12_132 = input.LA(8);

                                if ( (LA12_132=='e') ) {
                                    int LA12_148 = input.LA(9);

                                    if ( (LA12_148=='E') ) {
                                        int LA12_162 = input.LA(10);

                                        if ( (LA12_162=='n') ) {
                                            int LA12_176 = input.LA(11);

                                            if ( (LA12_176=='u') ) {
                                                int LA12_188 = input.LA(12);

                                                if ( (LA12_188=='m') ) {
                                                    int LA12_200 = input.LA(13);

                                                    if ( (LA12_200=='I') ) {
                                                        int LA12_212 = input.LA(14);

                                                        if ( (LA12_212=='t') ) {
                                                            int LA12_221 = input.LA(15);

                                                            if ( (LA12_221=='e') ) {
                                                                int LA12_227 = input.LA(16);

                                                                if ( (LA12_227=='m') ) {
                                                                    int LA12_233 = input.LA(17);

                                                                    if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                                                        return 28;
                                                                    }
                                                                    else {
                                                                        return 23;}
                                                                }
                                                                else {
                                                                    return 28;}
                                                            }
                                                            else {
                                                                return 28;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                        }
                    case 'E':
                        {
                        int LA12_96 = input.LA(6);

                        if ( (LA12_96=='n') ) {
                            int LA12_115 = input.LA(7);

                            if ( (LA12_115=='u') ) {
                                int LA12_133 = input.LA(8);

                                if ( (LA12_133=='m') ) {
                                    int LA12_149 = input.LA(9);

                                    if ( (LA12_149=='l') ) {
                                        int LA12_163 = input.LA(10);

                                        if ( (LA12_163=='i') ) {
                                            int LA12_177 = input.LA(11);

                                            if ( (LA12_177=='s') ) {
                                                int LA12_189 = input.LA(12);

                                                if ( (LA12_189=='t') ) {
                                                    int LA12_201 = input.LA(13);

                                                    if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                                        return 28;
                                                    }
                                                    else {
                                                        return 22;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                        }
                    default:
                        return 28;}

                }
                else {
                    return 28;}
            }
            else {
                return 28;}
            }
        case 'r':
            {
            int LA12_30 = input.LA(3);

            if ( (LA12_30=='u') ) {
                int LA12_59 = input.LA(4);

                if ( (LA12_59=='e') ) {
                    int LA12_78 = input.LA(5);

                    if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                        return 28;
                    }
                    else {
                        return 1;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
            }
        default:
            return 28;}

    }

    private int mTokensHelper002() throws RecognitionException {
        int LA12_2 = input.LA(2);

        if ( (LA12_2=='a') ) {
            int LA12_32 = input.LA(3);

            if ( (LA12_32=='l') ) {
                int LA12_60 = input.LA(4);

                if ( (LA12_60=='s') ) {
                    int LA12_79 = input.LA(5);

                    if ( (LA12_79=='e') ) {
                        int LA12_98 = input.LA(6);

                        if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                            return 28;
                        }
                        else {
                            return 2;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper003() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'm':
            {
            int LA12_33 = input.LA(3);

            if ( (LA12_33=='p') ) {
                int LA12_61 = input.LA(4);

                if ( (LA12_61=='o') ) {
                    int LA12_80 = input.LA(5);

                    if ( (LA12_80=='r') ) {
                        int LA12_99 = input.LA(6);

                        if ( (LA12_99=='t') ) {
                            int LA12_117 = input.LA(7);

                            if ( (LA12_117==' ') ) {
                                return 3;
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
            }
        case 'd':
            {
            int LA12_34 = input.LA(3);

            if ( ((LA12_34>='0' && LA12_34<='9')||(LA12_34>='A' && LA12_34<='Z')||LA12_34=='_'||(LA12_34>='a' && LA12_34<='z')) ) {
                return 28;
            }
            else {
                return 8;}
            }
        default:
            return 28;}

    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_36 = input.LA(3);

            if ( (LA12_36=='r') ) {
                int LA12_63 = input.LA(4);

                if ( (LA12_63=='v') ) {
                    int LA12_81 = input.LA(5);

                    if ( (LA12_81=='i') ) {
                        int LA12_100 = input.LA(6);

                        if ( (LA12_100=='c') ) {
                            int LA12_118 = input.LA(7);

                            if ( (LA12_118=='e') ) {
                                int LA12_135 = input.LA(8);

                                if ( (LA12_135=='S') ) {
                                    int LA12_150 = input.LA(9);

                                    if ( (LA12_150=='e') ) {
                                        int LA12_164 = input.LA(10);

                                        if ( (LA12_164=='t') ) {
                                            int LA12_178 = input.LA(11);

                                            if ( (LA12_178=='t') ) {
                                                int LA12_190 = input.LA(12);

                                                if ( (LA12_190=='i') ) {
                                                    int LA12_202 = input.LA(13);

                                                    if ( (LA12_202=='n') ) {
                                                        int LA12_214 = input.LA(14);

                                                        if ( (LA12_214=='g') ) {
                                                            int LA12_222 = input.LA(15);

                                                            if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                                                return 28;
                                                            }
                                                            else {
                                                                return 5;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
            }
        case 'T':
            {
            int LA12_37 = input.LA(3);

            if ( (LA12_37=='R') ) {
                int LA12_64 = input.LA(4);

                if ( (LA12_64=='I') ) {
                    int LA12_82 = input.LA(5);

                    if ( (LA12_82=='N') ) {
                        int LA12_101 = input.LA(6);

                        if ( (LA12_101=='G') ) {
                            int LA12_119 = input.LA(7);

                            if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                                return 28;
                            }
                            else {
                                return 19;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
            }
        default:
            return 28;}

    }

    private int mTokensHelper006() throws RecognitionException {
        return 6;
    }

    private int mTokensHelper007() throws RecognitionException {
        return 7;
    }

    private int mTokensHelper008() throws RecognitionException {
        int LA12_8 = input.LA(2);

        if ( (LA12_8=='e') ) {
            switch ( input.LA(3) ) {
            case 'f':
                {
                int LA12_65 = input.LA(4);

                if ( (LA12_65=='a') ) {
                    int LA12_83 = input.LA(5);

                    if ( (LA12_83=='u') ) {
                        int LA12_102 = input.LA(6);

                        if ( (LA12_102=='l') ) {
                            int LA12_120 = input.LA(7);

                            if ( (LA12_120=='t') ) {
                                int LA12_137 = input.LA(8);

                                if ( (LA12_137=='V') ) {
                                    int LA12_151 = input.LA(9);

                                    if ( (LA12_151=='a') ) {
                                        int LA12_165 = input.LA(10);

                                        if ( (LA12_165=='l') ) {
                                            int LA12_179 = input.LA(11);

                                            if ( (LA12_179=='u') ) {
                                                int LA12_191 = input.LA(12);

                                                if ( (LA12_191=='e') ) {
                                                    int LA12_203 = input.LA(13);

                                                    if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                                        return 28;
                                                    }
                                                    else {
                                                        return 20;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
                }
            case 's':
                {
                int LA12_66 = input.LA(4);

                if ( (LA12_66=='c') ) {
                    int LA12_84 = input.LA(5);

                    if ( (LA12_84=='r') ) {
                        int LA12_103 = input.LA(6);

                        if ( (LA12_103=='i') ) {
                            int LA12_121 = input.LA(7);

                            if ( (LA12_121=='p') ) {
                                int LA12_138 = input.LA(8);

                                if ( (LA12_138=='t') ) {
                                    int LA12_152 = input.LA(9);

                                    if ( (LA12_152=='i') ) {
                                        int LA12_166 = input.LA(10);

                                        if ( (LA12_166=='o') ) {
                                            int LA12_180 = input.LA(11);

                                            if ( (LA12_180=='n') ) {
                                                int LA12_192 = input.LA(12);

                                                if ( ((LA12_192>='0' && LA12_192<='9')||(LA12_192>='A' && LA12_192<='Z')||LA12_192=='_'||(LA12_192>='a' && LA12_192<='z')) ) {
                                                    return 28;
                                                }
                                                else {
                                                    return 9;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
                }
            default:
                return 28;}

        }
        else {
            return 28;}
    }

    private int mTokensHelper009() throws RecognitionException {
        int LA12_9 = input.LA(2);

        if ( (LA12_9=='e') ) {
            int LA12_41 = input.LA(3);

            if ( (LA12_41=='a') ) {
                int LA12_67 = input.LA(4);

                if ( (LA12_67=='d') ) {
                    int LA12_85 = input.LA(5);

                    if ( (LA12_85=='a') ) {
                        int LA12_104 = input.LA(6);

                        if ( (LA12_104=='b') ) {
                            int LA12_122 = input.LA(7);

                            if ( (LA12_122=='l') ) {
                                int LA12_139 = input.LA(8);

                                if ( (LA12_139=='e') ) {
                                    int LA12_153 = input.LA(9);

                                    if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                        return 28;
                                    }
                                    else {
                                        return 10;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper010() throws RecognitionException {
        int LA12_10 = input.LA(2);

        if ( (LA12_10=='r') ) {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='i') ) {
                int LA12_68 = input.LA(4);

                if ( (LA12_68=='t') ) {
                    int LA12_86 = input.LA(5);

                    if ( (LA12_86=='a') ) {
                        int LA12_105 = input.LA(6);

                        if ( (LA12_105=='b') ) {
                            int LA12_123 = input.LA(7);

                            if ( (LA12_123=='l') ) {
                                int LA12_140 = input.LA(8);

                                if ( (LA12_140=='e') ) {
                                    int LA12_154 = input.LA(9);

                                    if ( ((LA12_154>='0' && LA12_154<='9')||(LA12_154>='A' && LA12_154<='Z')||LA12_154=='_'||(LA12_154>='a' && LA12_154<='z')) ) {
                                        return 28;
                                    }
                                    else {
                                        return 11;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA12_11 = input.LA(2);

        if ( (LA12_11=='e') ) {
            int LA12_43 = input.LA(3);

            if ( (LA12_43=='q') ) {
                int LA12_69 = input.LA(4);

                if ( (LA12_69=='u') ) {
                    int LA12_87 = input.LA(5);

                    if ( (LA12_87=='i') ) {
                        int LA12_106 = input.LA(6);

                        if ( (LA12_106=='r') ) {
                            int LA12_124 = input.LA(7);

                            if ( (LA12_124=='e') ) {
                                int LA12_141 = input.LA(8);

                                if ( (LA12_141=='s') ) {
                                    int LA12_155 = input.LA(9);

                                    if ( (LA12_155=='P') ) {
                                        int LA12_169 = input.LA(10);

                                        if ( (LA12_169=='a') ) {
                                            int LA12_181 = input.LA(11);

                                            if ( (LA12_181=='r') ) {
                                                int LA12_193 = input.LA(12);

                                                if ( (LA12_193=='a') ) {
                                                    int LA12_205 = input.LA(13);

                                                    if ( (LA12_205=='m') ) {
                                                        int LA12_216 = input.LA(14);

                                                        if ( (LA12_216=='s') ) {
                                                            int LA12_223 = input.LA(15);

                                                            if ( ((LA12_223>='0' && LA12_223<='9')||(LA12_223>='A' && LA12_223<='Z')||LA12_223=='_'||(LA12_223>='a' && LA12_223<='z')) ) {
                                                                return 28;
                                                            }
                                                            else {
                                                                return 12;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper012() throws RecognitionException {
        return 13;
    }

    private int mTokensHelper013() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper014() throws RecognitionException {
        return 15;
    }

    private int mTokensHelper015() throws RecognitionException {
        int LA12_15 = input.LA(2);

        if ( (LA12_15=='e') ) {
            switch ( input.LA(3) ) {
            case 't':
                {
                int LA12_70 = input.LA(4);

                if ( (LA12_70=='t') ) {
                    int LA12_88 = input.LA(5);

                    if ( (LA12_88=='i') ) {
                        int LA12_107 = input.LA(6);

                        if ( (LA12_107=='n') ) {
                            int LA12_125 = input.LA(7);

                            if ( (LA12_125=='g') ) {
                                int LA12_142 = input.LA(8);

                                if ( (LA12_142=='T') ) {
                                    int LA12_156 = input.LA(9);

                                    if ( (LA12_156=='y') ) {
                                        int LA12_170 = input.LA(10);

                                        if ( (LA12_170=='p') ) {
                                            int LA12_182 = input.LA(11);

                                            if ( (LA12_182=='e') ) {
                                                int LA12_194 = input.LA(12);

                                                if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                                                    return 28;
                                                }
                                                else {
                                                    return 16;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
                }
            case 'r':
                {
                int LA12_71 = input.LA(4);

                if ( (LA12_71=='v') ) {
                    int LA12_89 = input.LA(5);

                    if ( (LA12_89=='i') ) {
                        int LA12_108 = input.LA(6);

                        if ( (LA12_108=='c') ) {
                            int LA12_126 = input.LA(7);

                            if ( (LA12_126=='e') ) {
                                int LA12_143 = input.LA(8);

                                if ( (LA12_143=='S') ) {
                                    int LA12_157 = input.LA(9);

                                    if ( (LA12_157=='e') ) {
                                        int LA12_171 = input.LA(10);

                                        if ( (LA12_171=='t') ) {
                                            int LA12_183 = input.LA(11);

                                            if ( (LA12_183=='t') ) {
                                                int LA12_195 = input.LA(12);

                                                if ( (LA12_195=='i') ) {
                                                    int LA12_207 = input.LA(13);

                                                    if ( (LA12_207=='n') ) {
                                                        int LA12_217 = input.LA(14);

                                                        if ( (LA12_217=='g') ) {
                                                            int LA12_224 = input.LA(15);

                                                            if ( (LA12_224=='s') ) {
                                                                int LA12_230 = input.LA(16);

                                                                if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
                                                                    return 28;
                                                                }
                                                                else {
                                                                    return 18;}
                                                            }
                                                            else {
                                                                return 28;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
                }
            default:
                return 28;}

        }
        else {
            return 28;}
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA12_16 = input.LA(2);

        if ( (LA12_16=='f') ) {
            int LA12_48 = input.LA(3);

            if ( (LA12_48=='f') ) {
                int LA12_72 = input.LA(4);

                if ( (LA12_72=='e') ) {
                    int LA12_90 = input.LA(5);

                    if ( (LA12_90=='r') ) {
                        int LA12_109 = input.LA(6);

                        if ( (LA12_109=='e') ) {
                            int LA12_127 = input.LA(7);

                            if ( (LA12_127=='d') ) {
                                int LA12_144 = input.LA(8);

                                if ( (LA12_144=='S') ) {
                                    int LA12_158 = input.LA(9);

                                    if ( (LA12_158=='e') ) {
                                        int LA12_172 = input.LA(10);

                                        if ( (LA12_172=='r') ) {
                                            int LA12_184 = input.LA(11);

                                            if ( (LA12_184=='v') ) {
                                                int LA12_196 = input.LA(12);

                                                if ( (LA12_196=='i') ) {
                                                    int LA12_208 = input.LA(13);

                                                    if ( (LA12_208=='c') ) {
                                                        int LA12_218 = input.LA(14);

                                                        if ( (LA12_218=='e') ) {
                                                            int LA12_225 = input.LA(15);

                                                            if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
                                                                return 28;
                                                            }
                                                            else {
                                                                return 17;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='n') ) {
            int LA12_49 = input.LA(3);

            if ( (LA12_49=='u') ) {
                int LA12_73 = input.LA(4);

                if ( (LA12_73=='m') ) {
                    int LA12_91 = input.LA(5);

                    if ( ((LA12_91>='0' && LA12_91<='9')||(LA12_91>='A' && LA12_91<='Z')||LA12_91=='_'||(LA12_91>='a' && LA12_91<='z')) ) {
                        return 28;
                    }
                    else {
                        return 21;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='a') ) {
            int LA12_50 = input.LA(3);

            if ( (LA12_50=='l') ) {
                int LA12_74 = input.LA(4);

                if ( (LA12_74=='u') ) {
                    int LA12_92 = input.LA(5);

                    if ( (LA12_92=='e') ) {
                        int LA12_111 = input.LA(6);

                        if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                            return 28;
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( (LA12_19=='s') ) {
            int LA12_51 = input.LA(3);

            if ( (LA12_51=='e') ) {
                int LA12_75 = input.LA(4);

                if ( (LA12_75=='r') ) {
                    int LA12_93 = input.LA(5);

                    if ( (LA12_93=='E') ) {
                        switch ( input.LA(6) ) {
                        case 'd':
                            {
                            int LA12_129 = input.LA(7);

                            if ( (LA12_129=='i') ) {
                                int LA12_145 = input.LA(8);

                                if ( (LA12_145=='t') ) {
                                    int LA12_159 = input.LA(9);

                                    if ( (LA12_159=='a') ) {
                                        int LA12_173 = input.LA(10);

                                        if ( (LA12_173=='b') ) {
                                            int LA12_185 = input.LA(11);

                                            if ( (LA12_185=='l') ) {
                                                int LA12_197 = input.LA(12);

                                                if ( (LA12_197=='e') ) {
                                                    int LA12_209 = input.LA(13);

                                                    if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                                        return 28;
                                                    }
                                                    else {
                                                        return 26;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                            }
                        case 'x':
                            {
                            int LA12_130 = input.LA(7);

                            if ( (LA12_130=='p') ) {
                                int LA12_146 = input.LA(8);

                                if ( (LA12_146=='o') ) {
                                    int LA12_160 = input.LA(9);

                                    if ( (LA12_160=='s') ) {
                                        int LA12_174 = input.LA(10);

                                        if ( (LA12_174=='e') ) {
                                            int LA12_186 = input.LA(11);

                                            if ( (LA12_186=='d') ) {
                                                int LA12_198 = input.LA(12);

                                                if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                                                    return 28;
                                                }
                                                else {
                                                    return 25;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                            }
                        default:
                            return 28;}

                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper020() throws RecognitionException {
        int LA12_20 = input.LA(2);

        if ( (LA12_20=='a') ) {
            int LA12_52 = input.LA(3);

            if ( (LA12_52=='n') ) {
                int LA12_76 = input.LA(4);

                if ( (LA12_76=='B') ) {
                    int LA12_94 = input.LA(5);

                    if ( (LA12_94=='e') ) {
                        int LA12_113 = input.LA(6);

                        if ( (LA12_113=='P') ) {
                            int LA12_131 = input.LA(7);

                            if ( (LA12_131=='u') ) {
                                int LA12_147 = input.LA(8);

                                if ( (LA12_147=='b') ) {
                                    int LA12_161 = input.LA(9);

                                    if ( (LA12_161=='l') ) {
                                        int LA12_175 = input.LA(10);

                                        if ( (LA12_175=='i') ) {
                                            int LA12_187 = input.LA(11);

                                            if ( (LA12_187=='s') ) {
                                                int LA12_199 = input.LA(12);

                                                if ( (LA12_199=='h') ) {
                                                    int LA12_211 = input.LA(13);

                                                    if ( (LA12_211=='e') ) {
                                                        int LA12_220 = input.LA(14);

                                                        if ( (LA12_220=='d') ) {
                                                            int LA12_226 = input.LA(15);

                                                            if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                                                return 28;
                                                            }
                                                            else {
                                                                return 27;}
                                                        }
                                                        else {
                                                            return 28;}
                                                    }
                                                    else {
                                                        return 28;}
                                                }
                                                else {
                                                    return 28;}
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 28;}
                                    }
                                    else {
                                        return 28;}
                                }
                                else {
                                    return 28;}
                            }
                            else {
                                return 28;}
                        }
                        else {
                            return 28;}
                    }
                    else {
                        return 28;}
                }
                else {
                    return 28;}
            }
            else {
                return 28;}
        }
        else {
            return 28;}
    }

    private int mTokensHelper021() throws RecognitionException {
        int LA12_21 = input.LA(2);

        if ( ((LA12_21>='A' && LA12_21<='Z')||LA12_21=='_'||(LA12_21>='a' && LA12_21<='z')) ) {
            return 28;
        }
        else {
            return 34;}
    }

    private int mTokensHelper022() throws RecognitionException {
        return 28;
    }

    private int mTokensHelper023() throws RecognitionException {
        return 29;
    }

    private int mTokensHelper024() throws RecognitionException {
        int LA12_24 = input.LA(2);

        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
            return 30;
        }
        else {
            return 34;}
    }

    private int mTokensHelper025() throws RecognitionException {
        int LA12_25 = input.LA(2);

        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
            return 30;
        }
        else {
            return 34;}
    }

    private int mTokensHelper026() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '*':
            {
            return 31;
            }
        case '/':
            {
            return 32;
            }
        default:
            return 34;}

    }

    private int mTokensHelper027() throws RecognitionException {
        return 33;
    }

    private int mTokensHelper028() throws RecognitionException {
        return 34;
    }

    private int mTokensHelper029() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}