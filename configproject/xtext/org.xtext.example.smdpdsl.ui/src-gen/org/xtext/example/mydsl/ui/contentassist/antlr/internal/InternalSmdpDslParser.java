package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SmdpDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmdpDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyURI'", "'Int'", "'Boolean'", "'AnySimpleType'", "'not'", "'and'", "'or'", "'gt'", "'lt'", "'eq'", "'is'", "'if'", "'then'", "'myModel'", "'{'", "'}'", "'myModelContains'", "','", "'myObject'", "'myObjectHas'", "'myAttributeContains'", "'myConstraint'", "'myConstraintContains'", "'myAttribute'", "'myBinary'", "'myBinaryLeft'", "'myBinaryRight'", "'Oparand'", "'myUnary'", "'myUnaryExpression'", "'myString'", "'value'", "'myInt'", "'BoolLiteral'", "'myIdentifier'", "'myIntentifierIs'", "'myEnum'", "'values'", "'BooleanValue'", "'trueValue'", "'falseValue'", "'myRange'", "'range'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmdpDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmdpDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmdpDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g"; }


     
     	private SmdpDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmdpDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulemyModel"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:60:1: entryRulemyModel : rulemyModel EOF ;
    public final void entryRulemyModel() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:61:1: ( rulemyModel EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:62:1: rulemyModel EOF
            {
             before(grammarAccess.getMyModelRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyModel_in_entryRulemyModel61);
            rulemyModel();

            state._fsp--;

             after(grammarAccess.getMyModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyModel"


    // $ANTLR start "rulemyModel"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:69:1: rulemyModel : ( ( rule__MyModel__Group__0 ) ) ;
    public final void rulemyModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:73:2: ( ( ( rule__MyModel__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:74:1: ( ( rule__MyModel__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:74:1: ( ( rule__MyModel__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:75:1: ( rule__MyModel__Group__0 )
            {
             before(grammarAccess.getMyModelAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:76:1: ( rule__MyModel__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:76:2: rule__MyModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__0_in_rulemyModel94);
            rule__MyModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyModel"


    // $ANTLR start "entryRulemyExpression"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:88:1: entryRulemyExpression : rulemyExpression EOF ;
    public final void entryRulemyExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:89:1: ( rulemyExpression EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:90:1: rulemyExpression EOF
            {
             before(grammarAccess.getMyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_entryRulemyExpression121);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyExpression128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyExpression"


    // $ANTLR start "rulemyExpression"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:97:1: rulemyExpression : ( ( rule__MyExpression__Alternatives ) ) ;
    public final void rulemyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:101:2: ( ( ( rule__MyExpression__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:102:1: ( ( rule__MyExpression__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:102:1: ( ( rule__MyExpression__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:103:1: ( rule__MyExpression__Alternatives )
            {
             before(grammarAccess.getMyExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:104:1: ( rule__MyExpression__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:104:2: rule__MyExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyExpression__Alternatives_in_rulemyExpression154);
            rule__MyExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyExpression"


    // $ANTLR start "entryRulemyValue"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:116:1: entryRulemyValue : rulemyValue EOF ;
    public final void entryRulemyValue() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:117:1: ( rulemyValue EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:118:1: rulemyValue EOF
            {
             before(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue181);
            rulemyValue();

            state._fsp--;

             after(grammarAccess.getMyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyValue"


    // $ANTLR start "rulemyValue"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:125:1: rulemyValue : ( ( rule__MyValue__Alternatives ) ) ;
    public final void rulemyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:129:2: ( ( ( rule__MyValue__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:130:1: ( ( rule__MyValue__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:130:1: ( ( rule__MyValue__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:131:1: ( rule__MyValue__Alternatives )
            {
             before(grammarAccess.getMyValueAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:132:1: ( rule__MyValue__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:132:2: rule__MyValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyValue__Alternatives_in_rulemyValue214);
            rule__MyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyValue"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:145:1: ( ruleEString EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulemyObject"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:172:1: entryRulemyObject : rulemyObject EOF ;
    public final void entryRulemyObject() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:173:1: ( rulemyObject EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:174:1: rulemyObject EOF
            {
             before(grammarAccess.getMyObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_entryRulemyObject301);
            rulemyObject();

            state._fsp--;

             after(grammarAccess.getMyObjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyObject308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyObject"


    // $ANTLR start "rulemyObject"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:181:1: rulemyObject : ( ( rule__MyObject__Group__0 ) ) ;
    public final void rulemyObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:185:2: ( ( ( rule__MyObject__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:186:1: ( ( rule__MyObject__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:186:1: ( ( rule__MyObject__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:187:1: ( rule__MyObject__Group__0 )
            {
             before(grammarAccess.getMyObjectAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:188:1: ( rule__MyObject__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:188:2: rule__MyObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__0_in_rulemyObject334);
            rule__MyObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyObject"


    // $ANTLR start "entryRulemyConstraint"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:200:1: entryRulemyConstraint : rulemyConstraint EOF ;
    public final void entryRulemyConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:201:1: ( rulemyConstraint EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:202:1: rulemyConstraint EOF
            {
             before(grammarAccess.getMyConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_entryRulemyConstraint361);
            rulemyConstraint();

            state._fsp--;

             after(grammarAccess.getMyConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConstraint368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyConstraint"


    // $ANTLR start "rulemyConstraint"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:209:1: rulemyConstraint : ( ( rule__MyConstraint__Group__0 ) ) ;
    public final void rulemyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:213:2: ( ( ( rule__MyConstraint__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:214:1: ( ( rule__MyConstraint__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:214:1: ( ( rule__MyConstraint__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:215:1: ( rule__MyConstraint__Group__0 )
            {
             before(grammarAccess.getMyConstraintAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:216:1: ( rule__MyConstraint__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:216:2: rule__MyConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__0_in_rulemyConstraint394);
            rule__MyConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyConstraint"


    // $ANTLR start "entryRulemyAttribute"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:228:1: entryRulemyAttribute : rulemyAttribute EOF ;
    public final void entryRulemyAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:229:1: ( rulemyAttribute EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:230:1: rulemyAttribute EOF
            {
             before(grammarAccess.getMyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_entryRulemyAttribute421);
            rulemyAttribute();

            state._fsp--;

             after(grammarAccess.getMyAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyAttribute428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyAttribute"


    // $ANTLR start "rulemyAttribute"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:237:1: rulemyAttribute : ( ( rule__MyAttribute__Group__0 ) ) ;
    public final void rulemyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:241:2: ( ( ( rule__MyAttribute__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:242:1: ( ( rule__MyAttribute__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:242:1: ( ( rule__MyAttribute__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:243:1: ( rule__MyAttribute__Group__0 )
            {
             before(grammarAccess.getMyAttributeAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:244:1: ( rule__MyAttribute__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:244:2: rule__MyAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0_in_rulemyAttribute454);
            rule__MyAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyAttribute"


    // $ANTLR start "entryRulemyBinary"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:256:1: entryRulemyBinary : rulemyBinary EOF ;
    public final void entryRulemyBinary() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:257:1: ( rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:258:1: rulemyBinary EOF
            {
             before(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary481);
            rulemyBinary();

            state._fsp--;

             after(grammarAccess.getMyBinaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyBinary"


    // $ANTLR start "rulemyBinary"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:265:1: rulemyBinary : ( ( rule__MyBinary__Group__0 ) ) ;
    public final void rulemyBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:269:2: ( ( ( rule__MyBinary__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:270:1: ( ( rule__MyBinary__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:270:1: ( ( rule__MyBinary__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:271:1: ( rule__MyBinary__Group__0 )
            {
             before(grammarAccess.getMyBinaryAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:272:1: ( rule__MyBinary__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:272:2: rule__MyBinary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0_in_rulemyBinary514);
            rule__MyBinary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyBinary"


    // $ANTLR start "entryRulemyUnary"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:284:1: entryRulemyUnary : rulemyUnary EOF ;
    public final void entryRulemyUnary() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:285:1: ( rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:286:1: rulemyUnary EOF
            {
             before(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary541);
            rulemyUnary();

            state._fsp--;

             after(grammarAccess.getMyUnaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyUnary"


    // $ANTLR start "rulemyUnary"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:293:1: rulemyUnary : ( ( rule__MyUnary__Group__0 ) ) ;
    public final void rulemyUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:297:2: ( ( ( rule__MyUnary__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:298:1: ( ( rule__MyUnary__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:298:1: ( ( rule__MyUnary__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:299:1: ( rule__MyUnary__Group__0 )
            {
             before(grammarAccess.getMyUnaryAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:300:1: ( rule__MyUnary__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:300:2: rule__MyUnary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0_in_rulemyUnary574);
            rule__MyUnary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyUnary"


    // $ANTLR start "entryRulemyString"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:312:1: entryRulemyString : rulemyString EOF ;
    public final void entryRulemyString() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:313:1: ( rulemyString EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:314:1: rulemyString EOF
            {
             before(grammarAccess.getMyStringRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyString_in_entryRulemyString601);
            rulemyString();

            state._fsp--;

             after(grammarAccess.getMyStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyString608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyString"


    // $ANTLR start "rulemyString"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:321:1: rulemyString : ( ( rule__MyString__Group__0 ) ) ;
    public final void rulemyString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:325:2: ( ( ( rule__MyString__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyString__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyString__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:327:1: ( rule__MyString__Group__0 )
            {
             before(grammarAccess.getMyStringAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:1: ( rule__MyString__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:2: rule__MyString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__0_in_rulemyString634);
            rule__MyString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyString"


    // $ANTLR start "entryRulemyInt"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:340:1: entryRulemyInt : rulemyInt EOF ;
    public final void entryRulemyInt() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:341:1: ( rulemyInt EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:342:1: rulemyInt EOF
            {
             before(grammarAccess.getMyIntRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyInt_in_entryRulemyInt661);
            rulemyInt();

            state._fsp--;

             after(grammarAccess.getMyIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyInt668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyInt"


    // $ANTLR start "rulemyInt"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:349:1: rulemyInt : ( ( rule__MyInt__Group__0 ) ) ;
    public final void rulemyInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:353:2: ( ( ( rule__MyInt__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyInt__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyInt__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:355:1: ( rule__MyInt__Group__0 )
            {
             before(grammarAccess.getMyIntAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:1: ( rule__MyInt__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:2: rule__MyInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__0_in_rulemyInt694);
            rule__MyInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyInt"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:368:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:369:1: ( ruleBoolLiteral EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:370:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral721);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolLiteral728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:377:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:381:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__BoolLiteral__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:383:1: ( rule__BoolLiteral__Group__0 )
            {
             before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:1: ( rule__BoolLiteral__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:2: rule__BoolLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral754);
            rule__BoolLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRulemyIdentifier"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:396:1: entryRulemyIdentifier : rulemyIdentifier EOF ;
    public final void entryRulemyIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:397:1: ( rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:398:1: rulemyIdentifier EOF
            {
             before(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier781);
            rulemyIdentifier();

            state._fsp--;

             after(grammarAccess.getMyIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyIdentifier"


    // $ANTLR start "rulemyIdentifier"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:405:1: rulemyIdentifier : ( ( rule__MyIdentifier__Group__0 ) ) ;
    public final void rulemyIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:409:2: ( ( ( rule__MyIdentifier__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyIdentifier__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyIdentifier__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:411:1: ( rule__MyIdentifier__Group__0 )
            {
             before(grammarAccess.getMyIdentifierAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:1: ( rule__MyIdentifier__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:2: rule__MyIdentifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__0_in_rulemyIdentifier814);
            rule__MyIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyIdentifier"


    // $ANTLR start "entryRuleAnyURI"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:424:1: entryRuleAnyURI : ruleAnyURI EOF ;
    public final void entryRuleAnyURI() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:425:1: ( ruleAnyURI EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:426:1: ruleAnyURI EOF
            {
             before(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI841);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getAnyURIRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyURI"


    // $ANTLR start "ruleAnyURI"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:433:1: ruleAnyURI : ( 'AnyURI' ) ;
    public final void ruleAnyURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:437:2: ( ( 'AnyURI' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:438:1: ( 'AnyURI' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:438:1: ( 'AnyURI' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:439:1: 'AnyURI'
            {
             before(grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleAnyURI875); 
             after(grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyURI"


    // $ANTLR start "entryRuleInt0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:454:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:455:1: ( ruleInt0 EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:456:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt0903);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt0910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:463:1: ruleInt0 : ( 'Int' ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:467:2: ( ( 'Int' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:468:1: ( 'Int' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:468:1: ( 'Int' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:469:1: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleInt0937); 
             after(grammarAccess.getInt0Access().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:484:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:485:1: ( ruleBoolean EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:486:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean965);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean972); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:493:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:497:2: ( ( 'Boolean' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:498:1: ( 'Boolean' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:498:1: ( 'Boolean' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:499:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleBoolean999); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRulemyEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:514:1: entryRulemyEnum : rulemyEnum EOF ;
    public final void entryRulemyEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:515:1: ( rulemyEnum EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:516:1: rulemyEnum EOF
            {
             before(grammarAccess.getMyEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_entryRulemyEnum1027);
            rulemyEnum();

            state._fsp--;

             after(grammarAccess.getMyEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyEnum1034); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyEnum"


    // $ANTLR start "rulemyEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:523:1: rulemyEnum : ( ( rule__MyEnum__Group__0 ) ) ;
    public final void rulemyEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:527:2: ( ( ( rule__MyEnum__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:528:1: ( ( rule__MyEnum__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:528:1: ( ( rule__MyEnum__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:529:1: ( rule__MyEnum__Group__0 )
            {
             before(grammarAccess.getMyEnumAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:530:1: ( rule__MyEnum__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:530:2: rule__MyEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0_in_rulemyEnum1060);
            rule__MyEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyEnum"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:542:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:543:1: ( ruleBooleanValue EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:544:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1087);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1094); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:551:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:555:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:556:1: ( ( rule__BooleanValue__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:556:1: ( ( rule__BooleanValue__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:557:1: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:558:1: ( rule__BooleanValue__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:558:2: rule__BooleanValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue1120);
            rule__BooleanValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRulemyRange"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:570:1: entryRulemyRange : rulemyRange EOF ;
    public final void entryRulemyRange() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:571:1: ( rulemyRange EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:572:1: rulemyRange EOF
            {
             before(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange1147);
            rulemyRange();

            state._fsp--;

             after(grammarAccess.getMyRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange1154); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemyRange"


    // $ANTLR start "rulemyRange"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:579:1: rulemyRange : ( ( rule__MyRange__Group__0 ) ) ;
    public final void rulemyRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:583:2: ( ( ( rule__MyRange__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:584:1: ( ( rule__MyRange__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:584:1: ( ( rule__MyRange__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:585:1: ( rule__MyRange__Group__0 )
            {
             before(grammarAccess.getMyRangeAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:586:1: ( rule__MyRange__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:586:2: rule__MyRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0_in_rulemyRange1180);
            rule__MyRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyRange"


    // $ANTLR start "entryRuleAnySimpleType"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:598:1: entryRuleAnySimpleType : ruleAnySimpleType EOF ;
    public final void entryRuleAnySimpleType() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:599:1: ( ruleAnySimpleType EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:600:1: ruleAnySimpleType EOF
            {
             before(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType1207);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getAnySimpleTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType1214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnySimpleType"


    // $ANTLR start "ruleAnySimpleType"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:607:1: ruleAnySimpleType : ( 'AnySimpleType' ) ;
    public final void ruleAnySimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:611:2: ( ( 'AnySimpleType' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:612:1: ( 'AnySimpleType' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:612:1: ( 'AnySimpleType' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:613:1: 'AnySimpleType'
            {
             before(grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 
            match(input,14,FollowSets000.FOLLOW_14_in_ruleAnySimpleType1241); 
             after(grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnySimpleType"


    // $ANTLR start "rulemyBinaryOparators"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:629:1: rulemyBinaryOparators : ( ( rule__MyBinaryOparators__Alternatives ) ) ;
    public final void rulemyBinaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:633:1: ( ( ( rule__MyBinaryOparators__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:635:1: ( rule__MyBinaryOparators__Alternatives )
            {
             before(grammarAccess.getMyBinaryOparatorsAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:636:1: ( rule__MyBinaryOparators__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:636:2: rule__MyBinaryOparators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1279);
            rule__MyBinaryOparators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryOparatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyBinaryOparators"


    // $ANTLR start "rulemyUnaryOparators"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:648:1: rulemyUnaryOparators : ( ( 'not' ) ) ;
    public final void rulemyUnaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:652:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:653:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:653:1: ( ( 'not' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:654:1: ( 'not' )
            {
             before(grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:655:1: ( 'not' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:655:3: 'not'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_rulemyUnaryOparators1316); 

            }

             after(grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyUnaryOparators"


    // $ANTLR start "rule__MyExpression__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:667:1: rule__MyExpression__Alternatives : ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyString ) | ( rulemyInt ) | ( ruleBoolLiteral ) | ( rulemyIdentifier ) );
    public final void rule__MyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:671:1: ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyString ) | ( rulemyInt ) | ( ruleBoolLiteral ) | ( rulemyIdentifier ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 43:
                {
                alt1=4;
                }
                break;
            case 44:
                {
                alt1=5;
                }
                break;
            case 45:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:672:1: ( rulemyBinary )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:672:1: ( rulemyBinary )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:673:1: rulemyBinary
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1353);
                    rulemyBinary();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:678:6: ( rulemyUnary )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:678:6: ( rulemyUnary )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:679:1: rulemyUnary
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1370);
                    rulemyUnary();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:684:6: ( rulemyString )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:684:6: ( rulemyString )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:685:1: rulemyString
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyString_in_rule__MyExpression__Alternatives1387);
                    rulemyString();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:690:6: ( rulemyInt )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:690:6: ( rulemyInt )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:691:1: rulemyInt
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyInt_in_rule__MyExpression__Alternatives1404);
                    rulemyInt();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:696:6: ( ruleBoolLiteral )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:696:6: ( ruleBoolLiteral )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:697:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_rule__MyExpression__Alternatives1421);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:702:6: ( rulemyIdentifier )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:702:6: ( rulemyIdentifier )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:703:1: rulemyIdentifier
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1438);
                    rulemyIdentifier();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyExpression__Alternatives"


    // $ANTLR start "rule__MyValue__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:713:1: rule__MyValue__Alternatives : ( ( rulemyEnum ) | ( ruleBooleanValue ) | ( rulemyRange ) );
    public final void rule__MyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:717:1: ( ( rulemyEnum ) | ( ruleBooleanValue ) | ( rulemyRange ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:718:1: ( rulemyEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:718:1: ( rulemyEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:719:1: rulemyEnum
                    {
                     before(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_rule__MyValue__Alternatives1470);
                    rulemyEnum();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:724:6: ( ruleBooleanValue )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:724:6: ( ruleBooleanValue )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:725:1: ruleBooleanValue
                    {
                     before(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__MyValue__Alternatives1487);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:730:6: ( rulemyRange )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:730:6: ( rulemyRange )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:731:1: rulemyRange
                    {
                     before(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1504);
                    rulemyRange();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyValue__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:741:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:745:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:746:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:746:1: ( RULE_STRING )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:747:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1536); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:752:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:752:6: ( RULE_ID )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:753:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1553); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MyBinaryOparators__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:763:1: rule__MyBinaryOparators__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'eq' ) ) | ( ( 'is' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) );
    public final void rule__MyBinaryOparators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:767:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'gt' ) ) | ( ( 'lt' ) ) | ( ( 'eq' ) ) | ( ( 'is' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            case 21:
                {
                alt4=6;
                }
                break;
            case 22:
                {
                alt4=7;
                }
                break;
            case 23:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:768:1: ( ( 'and' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:768:1: ( ( 'and' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:769:1: ( 'and' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:770:1: ( 'and' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:770:3: 'and'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1586); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:6: ( ( 'or' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:776:1: ( 'or' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:777:1: ( 'or' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:777:3: 'or'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1607); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:782:6: ( ( 'gt' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:782:6: ( ( 'gt' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:783:1: ( 'gt' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:784:1: ( 'gt' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:784:3: 'gt'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1628); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:789:6: ( ( 'lt' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:789:6: ( ( 'lt' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:790:1: ( 'lt' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:791:1: ( 'lt' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:791:3: 'lt'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1649); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:796:6: ( ( 'eq' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:796:6: ( ( 'eq' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:797:1: ( 'eq' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:798:1: ( 'eq' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:798:3: 'eq'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1670); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:803:6: ( ( 'is' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:803:6: ( ( 'is' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:804:1: ( 'is' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:805:1: ( 'is' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:805:3: 'is'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1691); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:810:6: ( ( 'if' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:810:6: ( ( 'if' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:811:1: ( 'if' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:812:1: ( 'if' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:812:3: 'if'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__MyBinaryOparators__Alternatives1712); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:817:6: ( ( 'then' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:817:6: ( ( 'then' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:818:1: ( 'then' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:819:1: ( 'then' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:819:3: 'then'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__MyBinaryOparators__Alternatives1733); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinaryOparators__Alternatives"


    // $ANTLR start "rule__MyModel__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:831:1: rule__MyModel__Group__0 : rule__MyModel__Group__0__Impl rule__MyModel__Group__1 ;
    public final void rule__MyModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:835:1: ( rule__MyModel__Group__0__Impl rule__MyModel__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:836:2: rule__MyModel__Group__0__Impl rule__MyModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01766);
            rule__MyModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01769);
            rule__MyModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__0"


    // $ANTLR start "rule__MyModel__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:843:1: rule__MyModel__Group__0__Impl : ( () ) ;
    public final void rule__MyModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:847:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:848:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:848:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:849:1: ()
            {
             before(grammarAccess.getMyModelAccess().getMyModelAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:850:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:852:1: 
            {
            }

             after(grammarAccess.getMyModelAccess().getMyModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__0__Impl"


    // $ANTLR start "rule__MyModel__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:862:1: rule__MyModel__Group__1 : rule__MyModel__Group__1__Impl rule__MyModel__Group__2 ;
    public final void rule__MyModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:866:1: ( rule__MyModel__Group__1__Impl rule__MyModel__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:867:2: rule__MyModel__Group__1__Impl rule__MyModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11827);
            rule__MyModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11830);
            rule__MyModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__1"


    // $ANTLR start "rule__MyModel__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:874:1: rule__MyModel__Group__1__Impl : ( 'myModel' ) ;
    public final void rule__MyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:878:1: ( ( 'myModel' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:879:1: ( 'myModel' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:879:1: ( 'myModel' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:880:1: 'myModel'
            {
             before(grammarAccess.getMyModelAccess().getMyModelKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyModel__Group__1__Impl1858); 
             after(grammarAccess.getMyModelAccess().getMyModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__1__Impl"


    // $ANTLR start "rule__MyModel__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:893:1: rule__MyModel__Group__2 : rule__MyModel__Group__2__Impl rule__MyModel__Group__3 ;
    public final void rule__MyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:897:1: ( rule__MyModel__Group__2__Impl rule__MyModel__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:898:2: rule__MyModel__Group__2__Impl rule__MyModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21889);
            rule__MyModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__3_in_rule__MyModel__Group__21892);
            rule__MyModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__2"


    // $ANTLR start "rule__MyModel__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:905:1: rule__MyModel__Group__2__Impl : ( ( rule__MyModel__NameAssignment_2 ) ) ;
    public final void rule__MyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:909:1: ( ( ( rule__MyModel__NameAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:910:1: ( ( rule__MyModel__NameAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:910:1: ( ( rule__MyModel__NameAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:911:1: ( rule__MyModel__NameAssignment_2 )
            {
             before(grammarAccess.getMyModelAccess().getNameAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:912:1: ( rule__MyModel__NameAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:912:2: rule__MyModel__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__NameAssignment_2_in_rule__MyModel__Group__2__Impl1919);
            rule__MyModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__2__Impl"


    // $ANTLR start "rule__MyModel__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:922:1: rule__MyModel__Group__3 : rule__MyModel__Group__3__Impl rule__MyModel__Group__4 ;
    public final void rule__MyModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:926:1: ( rule__MyModel__Group__3__Impl rule__MyModel__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:927:2: rule__MyModel__Group__3__Impl rule__MyModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__3__Impl_in_rule__MyModel__Group__31949);
            rule__MyModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__4_in_rule__MyModel__Group__31952);
            rule__MyModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__3"


    // $ANTLR start "rule__MyModel__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:934:1: rule__MyModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MyModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:938:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:939:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:939:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:940:1: '{'
            {
             before(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyModel__Group__3__Impl1980); 
             after(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__3__Impl"


    // $ANTLR start "rule__MyModel__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:953:1: rule__MyModel__Group__4 : rule__MyModel__Group__4__Impl rule__MyModel__Group__5 ;
    public final void rule__MyModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:957:1: ( rule__MyModel__Group__4__Impl rule__MyModel__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:958:2: rule__MyModel__Group__4__Impl rule__MyModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__4__Impl_in_rule__MyModel__Group__42011);
            rule__MyModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__5_in_rule__MyModel__Group__42014);
            rule__MyModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__4"


    // $ANTLR start "rule__MyModel__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:965:1: rule__MyModel__Group__4__Impl : ( ( rule__MyModel__Group_4__0 )? ) ;
    public final void rule__MyModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:969:1: ( ( ( rule__MyModel__Group_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:970:1: ( ( rule__MyModel__Group_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:970:1: ( ( rule__MyModel__Group_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:971:1: ( rule__MyModel__Group_4__0 )?
            {
             before(grammarAccess.getMyModelAccess().getGroup_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:972:1: ( rule__MyModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:972:2: rule__MyModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__0_in_rule__MyModel__Group__4__Impl2041);
                    rule__MyModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__4__Impl"


    // $ANTLR start "rule__MyModel__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:982:1: rule__MyModel__Group__5 : rule__MyModel__Group__5__Impl ;
    public final void rule__MyModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:986:1: ( rule__MyModel__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:987:2: rule__MyModel__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__5__Impl_in_rule__MyModel__Group__52072);
            rule__MyModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__5"


    // $ANTLR start "rule__MyModel__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:993:1: rule__MyModel__Group__5__Impl : ( '}' ) ;
    public final void rule__MyModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:997:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:998:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:998:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:999:1: '}'
            {
             before(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyModel__Group__5__Impl2100); 
             after(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group__5__Impl"


    // $ANTLR start "rule__MyModel__Group_4__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1024:1: rule__MyModel__Group_4__0 : rule__MyModel__Group_4__0__Impl rule__MyModel__Group_4__1 ;
    public final void rule__MyModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1028:1: ( rule__MyModel__Group_4__0__Impl rule__MyModel__Group_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1029:2: rule__MyModel__Group_4__0__Impl rule__MyModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__0__Impl_in_rule__MyModel__Group_4__02143);
            rule__MyModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__1_in_rule__MyModel__Group_4__02146);
            rule__MyModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__0"


    // $ANTLR start "rule__MyModel__Group_4__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1036:1: rule__MyModel__Group_4__0__Impl : ( 'myModelContains' ) ;
    public final void rule__MyModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1040:1: ( ( 'myModelContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1041:1: ( 'myModelContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1041:1: ( 'myModelContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1042:1: 'myModelContains'
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MyModel__Group_4__0__Impl2174); 
             after(grammarAccess.getMyModelAccess().getMyModelContainsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__0__Impl"


    // $ANTLR start "rule__MyModel__Group_4__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1055:1: rule__MyModel__Group_4__1 : rule__MyModel__Group_4__1__Impl rule__MyModel__Group_4__2 ;
    public final void rule__MyModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1059:1: ( rule__MyModel__Group_4__1__Impl rule__MyModel__Group_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1060:2: rule__MyModel__Group_4__1__Impl rule__MyModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__1__Impl_in_rule__MyModel__Group_4__12205);
            rule__MyModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__2_in_rule__MyModel__Group_4__12208);
            rule__MyModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__1"


    // $ANTLR start "rule__MyModel__Group_4__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1067:1: rule__MyModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MyModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1071:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1072:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1072:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1073:1: '{'
            {
             before(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyModel__Group_4__1__Impl2236); 
             after(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__1__Impl"


    // $ANTLR start "rule__MyModel__Group_4__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1086:1: rule__MyModel__Group_4__2 : rule__MyModel__Group_4__2__Impl rule__MyModel__Group_4__3 ;
    public final void rule__MyModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1090:1: ( rule__MyModel__Group_4__2__Impl rule__MyModel__Group_4__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1091:2: rule__MyModel__Group_4__2__Impl rule__MyModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__2__Impl_in_rule__MyModel__Group_4__22267);
            rule__MyModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__3_in_rule__MyModel__Group_4__22270);
            rule__MyModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__2"


    // $ANTLR start "rule__MyModel__Group_4__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1098:1: rule__MyModel__Group_4__2__Impl : ( ( rule__MyModel__MyModelContainsAssignment_4_2 ) ) ;
    public final void rule__MyModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1102:1: ( ( ( rule__MyModel__MyModelContainsAssignment_4_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1103:1: ( ( rule__MyModel__MyModelContainsAssignment_4_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1103:1: ( ( rule__MyModel__MyModelContainsAssignment_4_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1104:1: ( rule__MyModel__MyModelContainsAssignment_4_2 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1105:1: ( rule__MyModel__MyModelContainsAssignment_4_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1105:2: rule__MyModel__MyModelContainsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_4_2_in_rule__MyModel__Group_4__2__Impl2297);
            rule__MyModel__MyModelContainsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__2__Impl"


    // $ANTLR start "rule__MyModel__Group_4__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1115:1: rule__MyModel__Group_4__3 : rule__MyModel__Group_4__3__Impl rule__MyModel__Group_4__4 ;
    public final void rule__MyModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1119:1: ( rule__MyModel__Group_4__3__Impl rule__MyModel__Group_4__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1120:2: rule__MyModel__Group_4__3__Impl rule__MyModel__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__3__Impl_in_rule__MyModel__Group_4__32327);
            rule__MyModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__4_in_rule__MyModel__Group_4__32330);
            rule__MyModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__3"


    // $ANTLR start "rule__MyModel__Group_4__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1127:1: rule__MyModel__Group_4__3__Impl : ( ( rule__MyModel__Group_4_3__0 )* ) ;
    public final void rule__MyModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1131:1: ( ( ( rule__MyModel__Group_4_3__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1132:1: ( ( rule__MyModel__Group_4_3__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1132:1: ( ( rule__MyModel__Group_4_3__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1133:1: ( rule__MyModel__Group_4_3__0 )*
            {
             before(grammarAccess.getMyModelAccess().getGroup_4_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1134:1: ( rule__MyModel__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1134:2: rule__MyModel__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4_3__0_in_rule__MyModel__Group_4__3__Impl2357);
            	    rule__MyModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMyModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__3__Impl"


    // $ANTLR start "rule__MyModel__Group_4__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1144:1: rule__MyModel__Group_4__4 : rule__MyModel__Group_4__4__Impl ;
    public final void rule__MyModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1148:1: ( rule__MyModel__Group_4__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1149:2: rule__MyModel__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4__4__Impl_in_rule__MyModel__Group_4__42388);
            rule__MyModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__4"


    // $ANTLR start "rule__MyModel__Group_4__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1155:1: rule__MyModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MyModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1159:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1160:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1160:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1161:1: '}'
            {
             before(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyModel__Group_4__4__Impl2416); 
             after(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4__4__Impl"


    // $ANTLR start "rule__MyModel__Group_4_3__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1184:1: rule__MyModel__Group_4_3__0 : rule__MyModel__Group_4_3__0__Impl rule__MyModel__Group_4_3__1 ;
    public final void rule__MyModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1188:1: ( rule__MyModel__Group_4_3__0__Impl rule__MyModel__Group_4_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1189:2: rule__MyModel__Group_4_3__0__Impl rule__MyModel__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4_3__0__Impl_in_rule__MyModel__Group_4_3__02457);
            rule__MyModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4_3__1_in_rule__MyModel__Group_4_3__02460);
            rule__MyModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4_3__0"


    // $ANTLR start "rule__MyModel__Group_4_3__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1196:1: rule__MyModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MyModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1200:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1201:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1201:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1202:1: ','
            {
             before(grammarAccess.getMyModelAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyModel__Group_4_3__0__Impl2488); 
             after(grammarAccess.getMyModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__MyModel__Group_4_3__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1215:1: rule__MyModel__Group_4_3__1 : rule__MyModel__Group_4_3__1__Impl ;
    public final void rule__MyModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1219:1: ( rule__MyModel__Group_4_3__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1220:2: rule__MyModel__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_4_3__1__Impl_in_rule__MyModel__Group_4_3__12519);
            rule__MyModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4_3__1"


    // $ANTLR start "rule__MyModel__Group_4_3__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1226:1: rule__MyModel__Group_4_3__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_4_3_1 ) ) ;
    public final void rule__MyModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1230:1: ( ( ( rule__MyModel__MyModelContainsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1231:1: ( ( rule__MyModel__MyModelContainsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1231:1: ( ( rule__MyModel__MyModelContainsAssignment_4_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1232:1: ( rule__MyModel__MyModelContainsAssignment_4_3_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_4_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1233:1: ( rule__MyModel__MyModelContainsAssignment_4_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1233:2: rule__MyModel__MyModelContainsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_4_3_1_in_rule__MyModel__Group_4_3__1__Impl2546);
            rule__MyModel__MyModelContainsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__MyObject__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1247:1: rule__MyObject__Group__0 : rule__MyObject__Group__0__Impl rule__MyObject__Group__1 ;
    public final void rule__MyObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1251:1: ( rule__MyObject__Group__0__Impl rule__MyObject__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1252:2: rule__MyObject__Group__0__Impl rule__MyObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02580);
            rule__MyObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02583);
            rule__MyObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__0"


    // $ANTLR start "rule__MyObject__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1259:1: rule__MyObject__Group__0__Impl : ( () ) ;
    public final void rule__MyObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1263:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1264:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1264:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1265:1: ()
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1266:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1268:1: 
            {
            }

             after(grammarAccess.getMyObjectAccess().getMyObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__0__Impl"


    // $ANTLR start "rule__MyObject__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1278:1: rule__MyObject__Group__1 : rule__MyObject__Group__1__Impl rule__MyObject__Group__2 ;
    public final void rule__MyObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1282:1: ( rule__MyObject__Group__1__Impl rule__MyObject__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1283:2: rule__MyObject__Group__1__Impl rule__MyObject__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12641);
            rule__MyObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12644);
            rule__MyObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__1"


    // $ANTLR start "rule__MyObject__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1290:1: rule__MyObject__Group__1__Impl : ( 'myObject' ) ;
    public final void rule__MyObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1294:1: ( ( 'myObject' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1295:1: ( 'myObject' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1295:1: ( 'myObject' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1296:1: 'myObject'
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MyObject__Group__1__Impl2672); 
             after(grammarAccess.getMyObjectAccess().getMyObjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__1__Impl"


    // $ANTLR start "rule__MyObject__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1309:1: rule__MyObject__Group__2 : rule__MyObject__Group__2__Impl rule__MyObject__Group__3 ;
    public final void rule__MyObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1313:1: ( rule__MyObject__Group__2__Impl rule__MyObject__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1314:2: rule__MyObject__Group__2__Impl rule__MyObject__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22703);
            rule__MyObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22706);
            rule__MyObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__2"


    // $ANTLR start "rule__MyObject__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1321:1: rule__MyObject__Group__2__Impl : ( ( rule__MyObject__NameAssignment_2 ) ) ;
    public final void rule__MyObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1325:1: ( ( ( rule__MyObject__NameAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1326:1: ( ( rule__MyObject__NameAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1326:1: ( ( rule__MyObject__NameAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1327:1: ( rule__MyObject__NameAssignment_2 )
            {
             before(grammarAccess.getMyObjectAccess().getNameAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1328:1: ( rule__MyObject__NameAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1328:2: rule__MyObject__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__NameAssignment_2_in_rule__MyObject__Group__2__Impl2733);
            rule__MyObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__2__Impl"


    // $ANTLR start "rule__MyObject__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1338:1: rule__MyObject__Group__3 : rule__MyObject__Group__3__Impl rule__MyObject__Group__4 ;
    public final void rule__MyObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1342:1: ( rule__MyObject__Group__3__Impl rule__MyObject__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1343:2: rule__MyObject__Group__3__Impl rule__MyObject__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32763);
            rule__MyObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32766);
            rule__MyObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__3"


    // $ANTLR start "rule__MyObject__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1350:1: rule__MyObject__Group__3__Impl : ( '{' ) ;
    public final void rule__MyObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1354:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1355:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1355:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1356:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group__3__Impl2794); 
             after(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__3__Impl"


    // $ANTLR start "rule__MyObject__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1369:1: rule__MyObject__Group__4 : rule__MyObject__Group__4__Impl rule__MyObject__Group__5 ;
    public final void rule__MyObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1373:1: ( rule__MyObject__Group__4__Impl rule__MyObject__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1374:2: rule__MyObject__Group__4__Impl rule__MyObject__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42825);
            rule__MyObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42828);
            rule__MyObject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__4"


    // $ANTLR start "rule__MyObject__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1381:1: rule__MyObject__Group__4__Impl : ( ( rule__MyObject__Group_4__0 )? ) ;
    public final void rule__MyObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1385:1: ( ( ( rule__MyObject__Group_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1386:1: ( ( rule__MyObject__Group_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1386:1: ( ( rule__MyObject__Group_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1387:1: ( rule__MyObject__Group_4__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1388:1: ( rule__MyObject__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1388:2: rule__MyObject__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2855);
                    rule__MyObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__4__Impl"


    // $ANTLR start "rule__MyObject__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1398:1: rule__MyObject__Group__5 : rule__MyObject__Group__5__Impl rule__MyObject__Group__6 ;
    public final void rule__MyObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1402:1: ( rule__MyObject__Group__5__Impl rule__MyObject__Group__6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1403:2: rule__MyObject__Group__5__Impl rule__MyObject__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52886);
            rule__MyObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__6_in_rule__MyObject__Group__52889);
            rule__MyObject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__5"


    // $ANTLR start "rule__MyObject__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1410:1: rule__MyObject__Group__5__Impl : ( ( rule__MyObject__Group_5__0 )? ) ;
    public final void rule__MyObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1414:1: ( ( ( rule__MyObject__Group_5__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1415:1: ( ( rule__MyObject__Group_5__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1415:1: ( ( rule__MyObject__Group_5__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1416:1: ( rule__MyObject__Group_5__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_5()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1417:1: ( rule__MyObject__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1417:2: rule__MyObject__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__0_in_rule__MyObject__Group__5__Impl2916);
                    rule__MyObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__5__Impl"


    // $ANTLR start "rule__MyObject__Group__6"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1427:1: rule__MyObject__Group__6 : rule__MyObject__Group__6__Impl ;
    public final void rule__MyObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1431:1: ( rule__MyObject__Group__6__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1432:2: rule__MyObject__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__6__Impl_in_rule__MyObject__Group__62947);
            rule__MyObject__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__6"


    // $ANTLR start "rule__MyObject__Group__6__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1438:1: rule__MyObject__Group__6__Impl : ( '}' ) ;
    public final void rule__MyObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1442:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1443:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1443:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1444:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group__6__Impl2975); 
             after(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__6__Impl"


    // $ANTLR start "rule__MyObject__Group_4__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1471:1: rule__MyObject__Group_4__0 : rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 ;
    public final void rule__MyObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1475:1: ( rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1476:2: rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__03020);
            rule__MyObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__03023);
            rule__MyObject__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__0"


    // $ANTLR start "rule__MyObject__Group_4__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1483:1: rule__MyObject__Group_4__0__Impl : ( 'myObjectHas' ) ;
    public final void rule__MyObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1487:1: ( ( 'myObjectHas' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1488:1: ( 'myObjectHas' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1488:1: ( 'myObjectHas' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1489:1: 'myObjectHas'
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasKeyword_4_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MyObject__Group_4__0__Impl3051); 
             after(grammarAccess.getMyObjectAccess().getMyObjectHasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__0__Impl"


    // $ANTLR start "rule__MyObject__Group_4__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1502:1: rule__MyObject__Group_4__1 : rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 ;
    public final void rule__MyObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1506:1: ( rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1507:2: rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13082);
            rule__MyObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13085);
            rule__MyObject__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__1"


    // $ANTLR start "rule__MyObject__Group_4__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1514:1: rule__MyObject__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MyObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1518:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1519:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1519:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1520:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group_4__1__Impl3113); 
             after(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__1__Impl"


    // $ANTLR start "rule__MyObject__Group_4__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1533:1: rule__MyObject__Group_4__2 : rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3 ;
    public final void rule__MyObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1537:1: ( rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1538:2: rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23144);
            rule__MyObject__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__3_in_rule__MyObject__Group_4__23147);
            rule__MyObject__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__2"


    // $ANTLR start "rule__MyObject__Group_4__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1545:1: rule__MyObject__Group_4__2__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) ) ;
    public final void rule__MyObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1549:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1550:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1550:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1551:1: ( rule__MyObject__MyObjectHasAssignment_4_2 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1552:1: ( rule__MyObject__MyObjectHasAssignment_4_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1552:2: rule__MyObject__MyObjectHasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_in_rule__MyObject__Group_4__2__Impl3174);
            rule__MyObject__MyObjectHasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__2__Impl"


    // $ANTLR start "rule__MyObject__Group_4__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1562:1: rule__MyObject__Group_4__3 : rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4 ;
    public final void rule__MyObject__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1566:1: ( rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1567:2: rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__3__Impl_in_rule__MyObject__Group_4__33204);
            rule__MyObject__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__4_in_rule__MyObject__Group_4__33207);
            rule__MyObject__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__3"


    // $ANTLR start "rule__MyObject__Group_4__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1574:1: rule__MyObject__Group_4__3__Impl : ( ( rule__MyObject__Group_4_3__0 )* ) ;
    public final void rule__MyObject__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1578:1: ( ( ( rule__MyObject__Group_4_3__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1579:1: ( ( rule__MyObject__Group_4_3__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1579:1: ( ( rule__MyObject__Group_4_3__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1580:1: ( rule__MyObject__Group_4_3__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1581:1: ( rule__MyObject__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1581:2: rule__MyObject__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__0_in_rule__MyObject__Group_4__3__Impl3234);
            	    rule__MyObject__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMyObjectAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__3__Impl"


    // $ANTLR start "rule__MyObject__Group_4__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1591:1: rule__MyObject__Group_4__4 : rule__MyObject__Group_4__4__Impl ;
    public final void rule__MyObject__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1595:1: ( rule__MyObject__Group_4__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1596:2: rule__MyObject__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__4__Impl_in_rule__MyObject__Group_4__43265);
            rule__MyObject__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__4"


    // $ANTLR start "rule__MyObject__Group_4__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1602:1: rule__MyObject__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MyObject__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1606:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1607:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1607:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1608:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_4__4__Impl3293); 
             after(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4__4__Impl"


    // $ANTLR start "rule__MyObject__Group_4_3__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1631:1: rule__MyObject__Group_4_3__0 : rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1 ;
    public final void rule__MyObject__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1635:1: ( rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1636:2: rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__0__Impl_in_rule__MyObject__Group_4_3__03334);
            rule__MyObject__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__1_in_rule__MyObject__Group_4_3__03337);
            rule__MyObject__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_3__0"


    // $ANTLR start "rule__MyObject__Group_4_3__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1643:1: rule__MyObject__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1647:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1648:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1648:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1649:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyObject__Group_4_3__0__Impl3365); 
             after(grammarAccess.getMyObjectAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_3__0__Impl"


    // $ANTLR start "rule__MyObject__Group_4_3__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1662:1: rule__MyObject__Group_4_3__1 : rule__MyObject__Group_4_3__1__Impl ;
    public final void rule__MyObject__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1666:1: ( rule__MyObject__Group_4_3__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1667:2: rule__MyObject__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__1__Impl_in_rule__MyObject__Group_4_3__13396);
            rule__MyObject__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_3__1"


    // $ANTLR start "rule__MyObject__Group_4_3__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1673:1: rule__MyObject__Group_4_3__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) ) ;
    public final void rule__MyObject__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1677:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1678:1: ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1678:1: ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1679:1: ( rule__MyObject__MyObjectHasAssignment_4_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1680:1: ( rule__MyObject__MyObjectHasAssignment_4_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1680:2: rule__MyObject__MyObjectHasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_3_1_in_rule__MyObject__Group_4_3__1__Impl3423);
            rule__MyObject__MyObjectHasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_3__1__Impl"


    // $ANTLR start "rule__MyObject__Group_5__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1694:1: rule__MyObject__Group_5__0 : rule__MyObject__Group_5__0__Impl rule__MyObject__Group_5__1 ;
    public final void rule__MyObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1698:1: ( rule__MyObject__Group_5__0__Impl rule__MyObject__Group_5__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1699:2: rule__MyObject__Group_5__0__Impl rule__MyObject__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__0__Impl_in_rule__MyObject__Group_5__03457);
            rule__MyObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__1_in_rule__MyObject__Group_5__03460);
            rule__MyObject__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__0"


    // $ANTLR start "rule__MyObject__Group_5__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1706:1: rule__MyObject__Group_5__0__Impl : ( 'myAttributeContains' ) ;
    public final void rule__MyObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1710:1: ( ( 'myAttributeContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1711:1: ( 'myAttributeContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1711:1: ( 'myAttributeContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1712:1: 'myAttributeContains'
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyObject__Group_5__0__Impl3488); 
             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__0__Impl"


    // $ANTLR start "rule__MyObject__Group_5__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1725:1: rule__MyObject__Group_5__1 : rule__MyObject__Group_5__1__Impl rule__MyObject__Group_5__2 ;
    public final void rule__MyObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1729:1: ( rule__MyObject__Group_5__1__Impl rule__MyObject__Group_5__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1730:2: rule__MyObject__Group_5__1__Impl rule__MyObject__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__1__Impl_in_rule__MyObject__Group_5__13519);
            rule__MyObject__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__2_in_rule__MyObject__Group_5__13522);
            rule__MyObject__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__1"


    // $ANTLR start "rule__MyObject__Group_5__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1737:1: rule__MyObject__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MyObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1741:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1742:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1742:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1743:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group_5__1__Impl3550); 
             after(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__1__Impl"


    // $ANTLR start "rule__MyObject__Group_5__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1756:1: rule__MyObject__Group_5__2 : rule__MyObject__Group_5__2__Impl rule__MyObject__Group_5__3 ;
    public final void rule__MyObject__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1760:1: ( rule__MyObject__Group_5__2__Impl rule__MyObject__Group_5__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1761:2: rule__MyObject__Group_5__2__Impl rule__MyObject__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__2__Impl_in_rule__MyObject__Group_5__23581);
            rule__MyObject__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__3_in_rule__MyObject__Group_5__23584);
            rule__MyObject__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__2"


    // $ANTLR start "rule__MyObject__Group_5__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1768:1: rule__MyObject__Group_5__2__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_5_2 ) ) ;
    public final void rule__MyObject__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1772:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_5_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1773:1: ( ( rule__MyObject__MyAttributeContainsAssignment_5_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1773:1: ( ( rule__MyObject__MyAttributeContainsAssignment_5_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1774:1: ( rule__MyObject__MyAttributeContainsAssignment_5_2 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_5_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1775:1: ( rule__MyObject__MyAttributeContainsAssignment_5_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1775:2: rule__MyObject__MyAttributeContainsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_5_2_in_rule__MyObject__Group_5__2__Impl3611);
            rule__MyObject__MyAttributeContainsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__2__Impl"


    // $ANTLR start "rule__MyObject__Group_5__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1785:1: rule__MyObject__Group_5__3 : rule__MyObject__Group_5__3__Impl rule__MyObject__Group_5__4 ;
    public final void rule__MyObject__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1789:1: ( rule__MyObject__Group_5__3__Impl rule__MyObject__Group_5__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1790:2: rule__MyObject__Group_5__3__Impl rule__MyObject__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__3__Impl_in_rule__MyObject__Group_5__33641);
            rule__MyObject__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__4_in_rule__MyObject__Group_5__33644);
            rule__MyObject__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__3"


    // $ANTLR start "rule__MyObject__Group_5__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:1: rule__MyObject__Group_5__3__Impl : ( ( rule__MyObject__Group_5_3__0 )* ) ;
    public final void rule__MyObject__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1801:1: ( ( ( rule__MyObject__Group_5_3__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1802:1: ( ( rule__MyObject__Group_5_3__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1802:1: ( ( rule__MyObject__Group_5_3__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1803:1: ( rule__MyObject__Group_5_3__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_5_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1804:1: ( rule__MyObject__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1804:2: rule__MyObject__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5_3__0_in_rule__MyObject__Group_5__3__Impl3671);
            	    rule__MyObject__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMyObjectAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__3__Impl"


    // $ANTLR start "rule__MyObject__Group_5__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1814:1: rule__MyObject__Group_5__4 : rule__MyObject__Group_5__4__Impl ;
    public final void rule__MyObject__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1818:1: ( rule__MyObject__Group_5__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1819:2: rule__MyObject__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5__4__Impl_in_rule__MyObject__Group_5__43702);
            rule__MyObject__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__4"


    // $ANTLR start "rule__MyObject__Group_5__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1825:1: rule__MyObject__Group_5__4__Impl : ( '}' ) ;
    public final void rule__MyObject__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1829:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1830:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1830:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1831:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_5__4__Impl3730); 
             after(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5__4__Impl"


    // $ANTLR start "rule__MyObject__Group_5_3__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1854:1: rule__MyObject__Group_5_3__0 : rule__MyObject__Group_5_3__0__Impl rule__MyObject__Group_5_3__1 ;
    public final void rule__MyObject__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1858:1: ( rule__MyObject__Group_5_3__0__Impl rule__MyObject__Group_5_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1859:2: rule__MyObject__Group_5_3__0__Impl rule__MyObject__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5_3__0__Impl_in_rule__MyObject__Group_5_3__03771);
            rule__MyObject__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5_3__1_in_rule__MyObject__Group_5_3__03774);
            rule__MyObject__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5_3__0"


    // $ANTLR start "rule__MyObject__Group_5_3__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1866:1: rule__MyObject__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1870:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1871:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1871:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1872:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyObject__Group_5_3__0__Impl3802); 
             after(grammarAccess.getMyObjectAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5_3__0__Impl"


    // $ANTLR start "rule__MyObject__Group_5_3__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1885:1: rule__MyObject__Group_5_3__1 : rule__MyObject__Group_5_3__1__Impl ;
    public final void rule__MyObject__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1889:1: ( rule__MyObject__Group_5_3__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1890:2: rule__MyObject__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_5_3__1__Impl_in_rule__MyObject__Group_5_3__13833);
            rule__MyObject__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5_3__1"


    // $ANTLR start "rule__MyObject__Group_5_3__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1896:1: rule__MyObject__Group_5_3__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 ) ) ;
    public final void rule__MyObject__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1900:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1901:1: ( ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1901:1: ( ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1902:1: ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_5_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1903:1: ( rule__MyObject__MyAttributeContainsAssignment_5_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1903:2: rule__MyObject__MyAttributeContainsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_5_3_1_in_rule__MyObject__Group_5_3__1__Impl3860);
            rule__MyObject__MyAttributeContainsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_5_3__1__Impl"


    // $ANTLR start "rule__MyConstraint__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1917:1: rule__MyConstraint__Group__0 : rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 ;
    public final void rule__MyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1921:1: ( rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1922:2: rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03894);
            rule__MyConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03897);
            rule__MyConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__0"


    // $ANTLR start "rule__MyConstraint__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1929:1: rule__MyConstraint__Group__0__Impl : ( 'myConstraint' ) ;
    public final void rule__MyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1933:1: ( ( 'myConstraint' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1934:1: ( 'myConstraint' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1934:1: ( 'myConstraint' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1935:1: 'myConstraint'
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MyConstraint__Group__0__Impl3925); 
             after(grammarAccess.getMyConstraintAccess().getMyConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__0__Impl"


    // $ANTLR start "rule__MyConstraint__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1948:1: rule__MyConstraint__Group__1 : rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 ;
    public final void rule__MyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1952:1: ( rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:2: rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13956);
            rule__MyConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13959);
            rule__MyConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__1"


    // $ANTLR start "rule__MyConstraint__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1960:1: rule__MyConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__MyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1964:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1965:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1965:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1966:1: '{'
            {
             before(grammarAccess.getMyConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyConstraint__Group__1__Impl3987); 
             after(grammarAccess.getMyConstraintAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__1__Impl"


    // $ANTLR start "rule__MyConstraint__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1979:1: rule__MyConstraint__Group__2 : rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 ;
    public final void rule__MyConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1983:1: ( rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1984:2: rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__24018);
            rule__MyConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__24021);
            rule__MyConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__2"


    // $ANTLR start "rule__MyConstraint__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1991:1: rule__MyConstraint__Group__2__Impl : ( 'myConstraintContains' ) ;
    public final void rule__MyConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1995:1: ( ( 'myConstraintContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1996:1: ( 'myConstraintContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1996:1: ( 'myConstraintContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1997:1: 'myConstraintContains'
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MyConstraint__Group__2__Impl4049); 
             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__2__Impl"


    // $ANTLR start "rule__MyConstraint__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2010:1: rule__MyConstraint__Group__3 : rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4 ;
    public final void rule__MyConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2014:1: ( rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2015:2: rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__34080);
            rule__MyConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__4_in_rule__MyConstraint__Group__34083);
            rule__MyConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__3"


    // $ANTLR start "rule__MyConstraint__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:1: rule__MyConstraint__Group__3__Impl : ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) ;
    public final void rule__MyConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2026:1: ( ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2027:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2027:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2028:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2029:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2029:2: rule__MyConstraint__MyConstraintContainsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl4110);
            rule__MyConstraint__MyConstraintContainsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__3__Impl"


    // $ANTLR start "rule__MyConstraint__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2039:1: rule__MyConstraint__Group__4 : rule__MyConstraint__Group__4__Impl ;
    public final void rule__MyConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2043:1: ( rule__MyConstraint__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2044:2: rule__MyConstraint__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__4__Impl_in_rule__MyConstraint__Group__44140);
            rule__MyConstraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__4"


    // $ANTLR start "rule__MyConstraint__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2050:1: rule__MyConstraint__Group__4__Impl : ( '}' ) ;
    public final void rule__MyConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2054:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2055:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2055:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2056:1: '}'
            {
             before(grammarAccess.getMyConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyConstraint__Group__4__Impl4168); 
             after(grammarAccess.getMyConstraintAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__Group__4__Impl"


    // $ANTLR start "rule__MyAttribute__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2079:1: rule__MyAttribute__Group__0 : rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 ;
    public final void rule__MyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2083:1: ( rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2084:2: rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__04209);
            rule__MyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__04212);
            rule__MyAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__0"


    // $ANTLR start "rule__MyAttribute__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2091:1: rule__MyAttribute__Group__0__Impl : ( 'myAttribute' ) ;
    public final void rule__MyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2095:1: ( ( 'myAttribute' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2096:1: ( 'myAttribute' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2096:1: ( 'myAttribute' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2097:1: 'myAttribute'
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MyAttribute__Group__0__Impl4240); 
             after(grammarAccess.getMyAttributeAccess().getMyAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__0__Impl"


    // $ANTLR start "rule__MyAttribute__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2110:1: rule__MyAttribute__Group__1 : rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 ;
    public final void rule__MyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2114:1: ( rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2115:2: rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__14271);
            rule__MyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__14274);
            rule__MyAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__1"


    // $ANTLR start "rule__MyAttribute__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2122:1: rule__MyAttribute__Group__1__Impl : ( ( rule__MyAttribute__NameAssignment_1 ) ) ;
    public final void rule__MyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2126:1: ( ( ( rule__MyAttribute__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2127:1: ( ( rule__MyAttribute__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2127:1: ( ( rule__MyAttribute__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2128:1: ( rule__MyAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getMyAttributeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2129:1: ( rule__MyAttribute__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2129:2: rule__MyAttribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__NameAssignment_1_in_rule__MyAttribute__Group__1__Impl4301);
            rule__MyAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__1__Impl"


    // $ANTLR start "rule__MyAttribute__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2139:1: rule__MyAttribute__Group__2 : rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 ;
    public final void rule__MyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2143:1: ( rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2144:2: rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__24331);
            rule__MyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__24334);
            rule__MyAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__2"


    // $ANTLR start "rule__MyAttribute__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2151:1: rule__MyAttribute__Group__2__Impl : ( '{' ) ;
    public final void rule__MyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2155:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2156:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2156:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2157:1: '{'
            {
             before(grammarAccess.getMyAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyAttribute__Group__2__Impl4362); 
             after(grammarAccess.getMyAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__2__Impl"


    // $ANTLR start "rule__MyAttribute__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2170:1: rule__MyAttribute__Group__3 : rule__MyAttribute__Group__3__Impl rule__MyAttribute__Group__4 ;
    public final void rule__MyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2174:1: ( rule__MyAttribute__Group__3__Impl rule__MyAttribute__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2175:2: rule__MyAttribute__Group__3__Impl rule__MyAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__34393);
            rule__MyAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__4_in_rule__MyAttribute__Group__34396);
            rule__MyAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__3"


    // $ANTLR start "rule__MyAttribute__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2182:1: rule__MyAttribute__Group__3__Impl : ( 'myAttributeContains' ) ;
    public final void rule__MyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2186:1: ( ( 'myAttributeContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2187:1: ( 'myAttributeContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2187:1: ( 'myAttributeContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2188:1: 'myAttributeContains'
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyAttribute__Group__3__Impl4424); 
             after(grammarAccess.getMyAttributeAccess().getMyAttributeContainsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__3__Impl"


    // $ANTLR start "rule__MyAttribute__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2201:1: rule__MyAttribute__Group__4 : rule__MyAttribute__Group__4__Impl rule__MyAttribute__Group__5 ;
    public final void rule__MyAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2205:1: ( rule__MyAttribute__Group__4__Impl rule__MyAttribute__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2206:2: rule__MyAttribute__Group__4__Impl rule__MyAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__4__Impl_in_rule__MyAttribute__Group__44455);
            rule__MyAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__5_in_rule__MyAttribute__Group__44458);
            rule__MyAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__4"


    // $ANTLR start "rule__MyAttribute__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2213:1: rule__MyAttribute__Group__4__Impl : ( ( rule__MyAttribute__MyAttributeContainsAssignment_4 ) ) ;
    public final void rule__MyAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2217:1: ( ( ( rule__MyAttribute__MyAttributeContainsAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2218:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2218:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2219:1: ( rule__MyAttribute__MyAttributeContainsAssignment_4 )
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2220:1: ( rule__MyAttribute__MyAttributeContainsAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2220:2: rule__MyAttribute__MyAttributeContainsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_4_in_rule__MyAttribute__Group__4__Impl4485);
            rule__MyAttribute__MyAttributeContainsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__4__Impl"


    // $ANTLR start "rule__MyAttribute__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2230:1: rule__MyAttribute__Group__5 : rule__MyAttribute__Group__5__Impl ;
    public final void rule__MyAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2234:1: ( rule__MyAttribute__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2235:2: rule__MyAttribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__5__Impl_in_rule__MyAttribute__Group__54515);
            rule__MyAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__5"


    // $ANTLR start "rule__MyAttribute__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2241:1: rule__MyAttribute__Group__5__Impl : ( '}' ) ;
    public final void rule__MyAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2245:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2246:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2246:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2247:1: '}'
            {
             before(grammarAccess.getMyAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyAttribute__Group__5__Impl4543); 
             after(grammarAccess.getMyAttributeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__Group__5__Impl"


    // $ANTLR start "rule__MyBinary__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2272:1: rule__MyBinary__Group__0 : rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 ;
    public final void rule__MyBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2276:1: ( rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2277:2: rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__04586);
            rule__MyBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__04589);
            rule__MyBinary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__0"


    // $ANTLR start "rule__MyBinary__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2284:1: rule__MyBinary__Group__0__Impl : ( 'myBinary' ) ;
    public final void rule__MyBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2288:1: ( ( 'myBinary' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2289:1: ( 'myBinary' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2289:1: ( 'myBinary' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2290:1: 'myBinary'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MyBinary__Group__0__Impl4617); 
             after(grammarAccess.getMyBinaryAccess().getMyBinaryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__0__Impl"


    // $ANTLR start "rule__MyBinary__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2303:1: rule__MyBinary__Group__1 : rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 ;
    public final void rule__MyBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2307:1: ( rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2308:2: rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__14648);
            rule__MyBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__14651);
            rule__MyBinary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__1"


    // $ANTLR start "rule__MyBinary__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2315:1: rule__MyBinary__Group__1__Impl : ( '{' ) ;
    public final void rule__MyBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2319:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2320:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2320:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2321:1: '{'
            {
             before(grammarAccess.getMyBinaryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyBinary__Group__1__Impl4679); 
             after(grammarAccess.getMyBinaryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__1__Impl"


    // $ANTLR start "rule__MyBinary__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2334:1: rule__MyBinary__Group__2 : rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 ;
    public final void rule__MyBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2338:1: ( rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2339:2: rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__24710);
            rule__MyBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__24713);
            rule__MyBinary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__2"


    // $ANTLR start "rule__MyBinary__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2346:1: rule__MyBinary__Group__2__Impl : ( ( rule__MyBinary__Group_2__0 )? ) ;
    public final void rule__MyBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2350:1: ( ( ( rule__MyBinary__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2351:1: ( ( rule__MyBinary__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2351:1: ( ( rule__MyBinary__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2352:1: ( rule__MyBinary__Group_2__0 )?
            {
             before(grammarAccess.getMyBinaryAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2353:1: ( rule__MyBinary__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2353:2: rule__MyBinary__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__0_in_rule__MyBinary__Group__2__Impl4740);
                    rule__MyBinary__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyBinaryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__2__Impl"


    // $ANTLR start "rule__MyBinary__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2363:1: rule__MyBinary__Group__3 : rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 ;
    public final void rule__MyBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2367:1: ( rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2368:2: rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__34771);
            rule__MyBinary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__34774);
            rule__MyBinary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__3"


    // $ANTLR start "rule__MyBinary__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2375:1: rule__MyBinary__Group__3__Impl : ( 'myBinaryLeft' ) ;
    public final void rule__MyBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2379:1: ( ( 'myBinaryLeft' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2380:1: ( 'myBinaryLeft' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2380:1: ( 'myBinaryLeft' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2381:1: 'myBinaryLeft'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MyBinary__Group__3__Impl4802); 
             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__3__Impl"


    // $ANTLR start "rule__MyBinary__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2394:1: rule__MyBinary__Group__4 : rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5 ;
    public final void rule__MyBinary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2398:1: ( rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2399:2: rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44833);
            rule__MyBinary__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__5_in_rule__MyBinary__Group__44836);
            rule__MyBinary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__4"


    // $ANTLR start "rule__MyBinary__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2406:1: rule__MyBinary__Group__4__Impl : ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) ) ;
    public final void rule__MyBinary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2410:1: ( ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2411:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2411:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2412:1: ( rule__MyBinary__MyBinaryLeftAssignment_4 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2413:1: ( rule__MyBinary__MyBinaryLeftAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2413:2: rule__MyBinary__MyBinaryLeftAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_4_in_rule__MyBinary__Group__4__Impl4863);
            rule__MyBinary__MyBinaryLeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__4__Impl"


    // $ANTLR start "rule__MyBinary__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2423:1: rule__MyBinary__Group__5 : rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6 ;
    public final void rule__MyBinary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2427:1: ( rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2428:2: rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__5__Impl_in_rule__MyBinary__Group__54893);
            rule__MyBinary__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__6_in_rule__MyBinary__Group__54896);
            rule__MyBinary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__5"


    // $ANTLR start "rule__MyBinary__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2435:1: rule__MyBinary__Group__5__Impl : ( 'myBinaryRight' ) ;
    public final void rule__MyBinary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2439:1: ( ( 'myBinaryRight' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2440:1: ( 'myBinaryRight' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2440:1: ( 'myBinaryRight' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2441:1: 'myBinaryRight'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightKeyword_5()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MyBinary__Group__5__Impl4924); 
             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__5__Impl"


    // $ANTLR start "rule__MyBinary__Group__6"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2454:1: rule__MyBinary__Group__6 : rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7 ;
    public final void rule__MyBinary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2458:1: ( rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2459:2: rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__6__Impl_in_rule__MyBinary__Group__64955);
            rule__MyBinary__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__7_in_rule__MyBinary__Group__64958);
            rule__MyBinary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__6"


    // $ANTLR start "rule__MyBinary__Group__6__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2466:1: rule__MyBinary__Group__6__Impl : ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) ) ;
    public final void rule__MyBinary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2470:1: ( ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2471:1: ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2471:1: ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2472:1: ( rule__MyBinary__MyBinaryRightAssignment_6 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_6()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2473:1: ( rule__MyBinary__MyBinaryRightAssignment_6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2473:2: rule__MyBinary__MyBinaryRightAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryRightAssignment_6_in_rule__MyBinary__Group__6__Impl4985);
            rule__MyBinary__MyBinaryRightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__6__Impl"


    // $ANTLR start "rule__MyBinary__Group__7"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2483:1: rule__MyBinary__Group__7 : rule__MyBinary__Group__7__Impl ;
    public final void rule__MyBinary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2487:1: ( rule__MyBinary__Group__7__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2488:2: rule__MyBinary__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__7__Impl_in_rule__MyBinary__Group__75015);
            rule__MyBinary__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__7"


    // $ANTLR start "rule__MyBinary__Group__7__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2494:1: rule__MyBinary__Group__7__Impl : ( '}' ) ;
    public final void rule__MyBinary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2498:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2499:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2499:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2500:1: '}'
            {
             before(grammarAccess.getMyBinaryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyBinary__Group__7__Impl5043); 
             after(grammarAccess.getMyBinaryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group__7__Impl"


    // $ANTLR start "rule__MyBinary__Group_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2529:1: rule__MyBinary__Group_2__0 : rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1 ;
    public final void rule__MyBinary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2533:1: ( rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2534:2: rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__0__Impl_in_rule__MyBinary__Group_2__05090);
            rule__MyBinary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__1_in_rule__MyBinary__Group_2__05093);
            rule__MyBinary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group_2__0"


    // $ANTLR start "rule__MyBinary__Group_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2541:1: rule__MyBinary__Group_2__0__Impl : ( 'Oparand' ) ;
    public final void rule__MyBinary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2545:1: ( ( 'Oparand' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2546:1: ( 'Oparand' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2546:1: ( 'Oparand' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2547:1: 'Oparand'
            {
             before(grammarAccess.getMyBinaryAccess().getOparandKeyword_2_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MyBinary__Group_2__0__Impl5121); 
             after(grammarAccess.getMyBinaryAccess().getOparandKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group_2__0__Impl"


    // $ANTLR start "rule__MyBinary__Group_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2560:1: rule__MyBinary__Group_2__1 : rule__MyBinary__Group_2__1__Impl ;
    public final void rule__MyBinary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2564:1: ( rule__MyBinary__Group_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2565:2: rule__MyBinary__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__1__Impl_in_rule__MyBinary__Group_2__15152);
            rule__MyBinary__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group_2__1"


    // $ANTLR start "rule__MyBinary__Group_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2571:1: rule__MyBinary__Group_2__1__Impl : ( ( rule__MyBinary__OparandAssignment_2_1 ) ) ;
    public final void rule__MyBinary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2575:1: ( ( ( rule__MyBinary__OparandAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2576:1: ( ( rule__MyBinary__OparandAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2576:1: ( ( rule__MyBinary__OparandAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2577:1: ( rule__MyBinary__OparandAssignment_2_1 )
            {
             before(grammarAccess.getMyBinaryAccess().getOparandAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2578:1: ( rule__MyBinary__OparandAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2578:2: rule__MyBinary__OparandAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__OparandAssignment_2_1_in_rule__MyBinary__Group_2__1__Impl5179);
            rule__MyBinary__OparandAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getOparandAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__Group_2__1__Impl"


    // $ANTLR start "rule__MyUnary__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2592:1: rule__MyUnary__Group__0 : rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 ;
    public final void rule__MyUnary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2596:1: ( rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2597:2: rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__05213);
            rule__MyUnary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__05216);
            rule__MyUnary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__0"


    // $ANTLR start "rule__MyUnary__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2604:1: rule__MyUnary__Group__0__Impl : ( 'myUnary' ) ;
    public final void rule__MyUnary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2608:1: ( ( 'myUnary' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2609:1: ( 'myUnary' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2609:1: ( 'myUnary' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2610:1: 'myUnary'
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MyUnary__Group__0__Impl5244); 
             after(grammarAccess.getMyUnaryAccess().getMyUnaryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__0__Impl"


    // $ANTLR start "rule__MyUnary__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2623:1: rule__MyUnary__Group__1 : rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 ;
    public final void rule__MyUnary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2627:1: ( rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2628:2: rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__15275);
            rule__MyUnary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__15278);
            rule__MyUnary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__1"


    // $ANTLR start "rule__MyUnary__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2635:1: rule__MyUnary__Group__1__Impl : ( '{' ) ;
    public final void rule__MyUnary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2639:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2640:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2640:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2641:1: '{'
            {
             before(grammarAccess.getMyUnaryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyUnary__Group__1__Impl5306); 
             after(grammarAccess.getMyUnaryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__1__Impl"


    // $ANTLR start "rule__MyUnary__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2654:1: rule__MyUnary__Group__2 : rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3 ;
    public final void rule__MyUnary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2658:1: ( rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2659:2: rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__25337);
            rule__MyUnary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__3_in_rule__MyUnary__Group__25340);
            rule__MyUnary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__2"


    // $ANTLR start "rule__MyUnary__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2666:1: rule__MyUnary__Group__2__Impl : ( ( rule__MyUnary__Group_2__0 )? ) ;
    public final void rule__MyUnary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2670:1: ( ( ( rule__MyUnary__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2671:1: ( ( rule__MyUnary__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2671:1: ( ( rule__MyUnary__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2672:1: ( rule__MyUnary__Group_2__0 )?
            {
             before(grammarAccess.getMyUnaryAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:1: ( rule__MyUnary__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:2: rule__MyUnary__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__0_in_rule__MyUnary__Group__2__Impl5367);
                    rule__MyUnary__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyUnaryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__2__Impl"


    // $ANTLR start "rule__MyUnary__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2683:1: rule__MyUnary__Group__3 : rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4 ;
    public final void rule__MyUnary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2687:1: ( rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2688:2: rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__3__Impl_in_rule__MyUnary__Group__35398);
            rule__MyUnary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__4_in_rule__MyUnary__Group__35401);
            rule__MyUnary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__3"


    // $ANTLR start "rule__MyUnary__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2695:1: rule__MyUnary__Group__3__Impl : ( 'myUnaryExpression' ) ;
    public final void rule__MyUnary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2699:1: ( ( 'myUnaryExpression' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2700:1: ( 'myUnaryExpression' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2700:1: ( 'myUnaryExpression' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2701:1: 'myUnaryExpression'
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MyUnary__Group__3__Impl5429); 
             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__3__Impl"


    // $ANTLR start "rule__MyUnary__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2714:1: rule__MyUnary__Group__4 : rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5 ;
    public final void rule__MyUnary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2718:1: ( rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2719:2: rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__4__Impl_in_rule__MyUnary__Group__45460);
            rule__MyUnary__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__5_in_rule__MyUnary__Group__45463);
            rule__MyUnary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__4"


    // $ANTLR start "rule__MyUnary__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2726:1: rule__MyUnary__Group__4__Impl : ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) ) ;
    public final void rule__MyUnary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2730:1: ( ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2731:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2731:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2732:1: ( rule__MyUnary__MyUnaryExpressionAssignment_4 )
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2733:1: ( rule__MyUnary__MyUnaryExpressionAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2733:2: rule__MyUnary__MyUnaryExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_4_in_rule__MyUnary__Group__4__Impl5490);
            rule__MyUnary__MyUnaryExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__4__Impl"


    // $ANTLR start "rule__MyUnary__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2743:1: rule__MyUnary__Group__5 : rule__MyUnary__Group__5__Impl ;
    public final void rule__MyUnary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2747:1: ( rule__MyUnary__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2748:2: rule__MyUnary__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__5__Impl_in_rule__MyUnary__Group__55520);
            rule__MyUnary__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__5"


    // $ANTLR start "rule__MyUnary__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2754:1: rule__MyUnary__Group__5__Impl : ( '}' ) ;
    public final void rule__MyUnary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2758:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2759:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2759:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2760:1: '}'
            {
             before(grammarAccess.getMyUnaryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyUnary__Group__5__Impl5548); 
             after(grammarAccess.getMyUnaryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group__5__Impl"


    // $ANTLR start "rule__MyUnary__Group_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2785:1: rule__MyUnary__Group_2__0 : rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1 ;
    public final void rule__MyUnary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2789:1: ( rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2790:2: rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__0__Impl_in_rule__MyUnary__Group_2__05591);
            rule__MyUnary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__1_in_rule__MyUnary__Group_2__05594);
            rule__MyUnary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group_2__0"


    // $ANTLR start "rule__MyUnary__Group_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2797:1: rule__MyUnary__Group_2__0__Impl : ( 'Oparand' ) ;
    public final void rule__MyUnary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2801:1: ( ( 'Oparand' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2802:1: ( 'Oparand' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2802:1: ( 'Oparand' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2803:1: 'Oparand'
            {
             before(grammarAccess.getMyUnaryAccess().getOparandKeyword_2_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MyUnary__Group_2__0__Impl5622); 
             after(grammarAccess.getMyUnaryAccess().getOparandKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group_2__0__Impl"


    // $ANTLR start "rule__MyUnary__Group_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2816:1: rule__MyUnary__Group_2__1 : rule__MyUnary__Group_2__1__Impl ;
    public final void rule__MyUnary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2820:1: ( rule__MyUnary__Group_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2821:2: rule__MyUnary__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__1__Impl_in_rule__MyUnary__Group_2__15653);
            rule__MyUnary__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group_2__1"


    // $ANTLR start "rule__MyUnary__Group_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2827:1: rule__MyUnary__Group_2__1__Impl : ( ( rule__MyUnary__OparandAssignment_2_1 ) ) ;
    public final void rule__MyUnary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2831:1: ( ( ( rule__MyUnary__OparandAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2832:1: ( ( rule__MyUnary__OparandAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2832:1: ( ( rule__MyUnary__OparandAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2833:1: ( rule__MyUnary__OparandAssignment_2_1 )
            {
             before(grammarAccess.getMyUnaryAccess().getOparandAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2834:1: ( rule__MyUnary__OparandAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2834:2: rule__MyUnary__OparandAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__OparandAssignment_2_1_in_rule__MyUnary__Group_2__1__Impl5680);
            rule__MyUnary__OparandAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getOparandAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__Group_2__1__Impl"


    // $ANTLR start "rule__MyString__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2848:1: rule__MyString__Group__0 : rule__MyString__Group__0__Impl rule__MyString__Group__1 ;
    public final void rule__MyString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2852:1: ( rule__MyString__Group__0__Impl rule__MyString__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2853:2: rule__MyString__Group__0__Impl rule__MyString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__0__Impl_in_rule__MyString__Group__05714);
            rule__MyString__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__1_in_rule__MyString__Group__05717);
            rule__MyString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__0"


    // $ANTLR start "rule__MyString__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2860:1: rule__MyString__Group__0__Impl : ( 'myString' ) ;
    public final void rule__MyString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2864:1: ( ( 'myString' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2865:1: ( 'myString' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2865:1: ( 'myString' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2866:1: 'myString'
            {
             before(grammarAccess.getMyStringAccess().getMyStringKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MyString__Group__0__Impl5745); 
             after(grammarAccess.getMyStringAccess().getMyStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__0__Impl"


    // $ANTLR start "rule__MyString__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2879:1: rule__MyString__Group__1 : rule__MyString__Group__1__Impl rule__MyString__Group__2 ;
    public final void rule__MyString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2883:1: ( rule__MyString__Group__1__Impl rule__MyString__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2884:2: rule__MyString__Group__1__Impl rule__MyString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__1__Impl_in_rule__MyString__Group__15776);
            rule__MyString__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__2_in_rule__MyString__Group__15779);
            rule__MyString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__1"


    // $ANTLR start "rule__MyString__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2891:1: rule__MyString__Group__1__Impl : ( '{' ) ;
    public final void rule__MyString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2895:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2896:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2896:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2897:1: '{'
            {
             before(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyString__Group__1__Impl5807); 
             after(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__1__Impl"


    // $ANTLR start "rule__MyString__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2910:1: rule__MyString__Group__2 : rule__MyString__Group__2__Impl rule__MyString__Group__3 ;
    public final void rule__MyString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2914:1: ( rule__MyString__Group__2__Impl rule__MyString__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2915:2: rule__MyString__Group__2__Impl rule__MyString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__2__Impl_in_rule__MyString__Group__25838);
            rule__MyString__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__3_in_rule__MyString__Group__25841);
            rule__MyString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__2"


    // $ANTLR start "rule__MyString__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2922:1: rule__MyString__Group__2__Impl : ( 'value' ) ;
    public final void rule__MyString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2926:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2927:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2927:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2928:1: 'value'
            {
             before(grammarAccess.getMyStringAccess().getValueKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__MyString__Group__2__Impl5869); 
             after(grammarAccess.getMyStringAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__2__Impl"


    // $ANTLR start "rule__MyString__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2941:1: rule__MyString__Group__3 : rule__MyString__Group__3__Impl rule__MyString__Group__4 ;
    public final void rule__MyString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2945:1: ( rule__MyString__Group__3__Impl rule__MyString__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2946:2: rule__MyString__Group__3__Impl rule__MyString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__3__Impl_in_rule__MyString__Group__35900);
            rule__MyString__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__4_in_rule__MyString__Group__35903);
            rule__MyString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__3"


    // $ANTLR start "rule__MyString__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2953:1: rule__MyString__Group__3__Impl : ( ( rule__MyString__ValueAssignment_3 ) ) ;
    public final void rule__MyString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2957:1: ( ( ( rule__MyString__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2958:1: ( ( rule__MyString__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2958:1: ( ( rule__MyString__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2959:1: ( rule__MyString__ValueAssignment_3 )
            {
             before(grammarAccess.getMyStringAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2960:1: ( rule__MyString__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2960:2: rule__MyString__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__ValueAssignment_3_in_rule__MyString__Group__3__Impl5930);
            rule__MyString__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__3__Impl"


    // $ANTLR start "rule__MyString__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2970:1: rule__MyString__Group__4 : rule__MyString__Group__4__Impl ;
    public final void rule__MyString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2974:1: ( rule__MyString__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2975:2: rule__MyString__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__4__Impl_in_rule__MyString__Group__45960);
            rule__MyString__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__4"


    // $ANTLR start "rule__MyString__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2981:1: rule__MyString__Group__4__Impl : ( '}' ) ;
    public final void rule__MyString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2985:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2986:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2986:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2987:1: '}'
            {
             before(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyString__Group__4__Impl5988); 
             after(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__Group__4__Impl"


    // $ANTLR start "rule__MyInt__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3010:1: rule__MyInt__Group__0 : rule__MyInt__Group__0__Impl rule__MyInt__Group__1 ;
    public final void rule__MyInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3014:1: ( rule__MyInt__Group__0__Impl rule__MyInt__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3015:2: rule__MyInt__Group__0__Impl rule__MyInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__0__Impl_in_rule__MyInt__Group__06029);
            rule__MyInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__1_in_rule__MyInt__Group__06032);
            rule__MyInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__0"


    // $ANTLR start "rule__MyInt__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3022:1: rule__MyInt__Group__0__Impl : ( 'myInt' ) ;
    public final void rule__MyInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3026:1: ( ( 'myInt' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3027:1: ( 'myInt' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3027:1: ( 'myInt' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3028:1: 'myInt'
            {
             before(grammarAccess.getMyIntAccess().getMyIntKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MyInt__Group__0__Impl6060); 
             after(grammarAccess.getMyIntAccess().getMyIntKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__0__Impl"


    // $ANTLR start "rule__MyInt__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3041:1: rule__MyInt__Group__1 : rule__MyInt__Group__1__Impl rule__MyInt__Group__2 ;
    public final void rule__MyInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3045:1: ( rule__MyInt__Group__1__Impl rule__MyInt__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3046:2: rule__MyInt__Group__1__Impl rule__MyInt__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__1__Impl_in_rule__MyInt__Group__16091);
            rule__MyInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__2_in_rule__MyInt__Group__16094);
            rule__MyInt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__1"


    // $ANTLR start "rule__MyInt__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3053:1: rule__MyInt__Group__1__Impl : ( '{' ) ;
    public final void rule__MyInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3057:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3058:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3058:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3059:1: '{'
            {
             before(grammarAccess.getMyIntAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyInt__Group__1__Impl6122); 
             after(grammarAccess.getMyIntAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__1__Impl"


    // $ANTLR start "rule__MyInt__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3072:1: rule__MyInt__Group__2 : rule__MyInt__Group__2__Impl rule__MyInt__Group__3 ;
    public final void rule__MyInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3076:1: ( rule__MyInt__Group__2__Impl rule__MyInt__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3077:2: rule__MyInt__Group__2__Impl rule__MyInt__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__2__Impl_in_rule__MyInt__Group__26153);
            rule__MyInt__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__3_in_rule__MyInt__Group__26156);
            rule__MyInt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__2"


    // $ANTLR start "rule__MyInt__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3084:1: rule__MyInt__Group__2__Impl : ( 'value' ) ;
    public final void rule__MyInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3088:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3089:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3089:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3090:1: 'value'
            {
             before(grammarAccess.getMyIntAccess().getValueKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__MyInt__Group__2__Impl6184); 
             after(grammarAccess.getMyIntAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__2__Impl"


    // $ANTLR start "rule__MyInt__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3103:1: rule__MyInt__Group__3 : rule__MyInt__Group__3__Impl rule__MyInt__Group__4 ;
    public final void rule__MyInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3107:1: ( rule__MyInt__Group__3__Impl rule__MyInt__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3108:2: rule__MyInt__Group__3__Impl rule__MyInt__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__3__Impl_in_rule__MyInt__Group__36215);
            rule__MyInt__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__4_in_rule__MyInt__Group__36218);
            rule__MyInt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__3"


    // $ANTLR start "rule__MyInt__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3115:1: rule__MyInt__Group__3__Impl : ( ( rule__MyInt__ValueAssignment_3 ) ) ;
    public final void rule__MyInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3119:1: ( ( ( rule__MyInt__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3120:1: ( ( rule__MyInt__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3120:1: ( ( rule__MyInt__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3121:1: ( rule__MyInt__ValueAssignment_3 )
            {
             before(grammarAccess.getMyIntAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3122:1: ( rule__MyInt__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3122:2: rule__MyInt__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__ValueAssignment_3_in_rule__MyInt__Group__3__Impl6245);
            rule__MyInt__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyIntAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__3__Impl"


    // $ANTLR start "rule__MyInt__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3132:1: rule__MyInt__Group__4 : rule__MyInt__Group__4__Impl ;
    public final void rule__MyInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3136:1: ( rule__MyInt__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3137:2: rule__MyInt__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__4__Impl_in_rule__MyInt__Group__46275);
            rule__MyInt__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__4"


    // $ANTLR start "rule__MyInt__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3143:1: rule__MyInt__Group__4__Impl : ( '}' ) ;
    public final void rule__MyInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3147:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3148:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3148:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3149:1: '}'
            {
             before(grammarAccess.getMyIntAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyInt__Group__4__Impl6303); 
             after(grammarAccess.getMyIntAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__Group__4__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3172:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3176:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3177:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__06344);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__06347);
            rule__BoolLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__0"


    // $ANTLR start "rule__BoolLiteral__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3184:1: rule__BoolLiteral__Group__0__Impl : ( 'BoolLiteral' ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3188:1: ( ( 'BoolLiteral' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3189:1: ( 'BoolLiteral' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3189:1: ( 'BoolLiteral' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3190:1: 'BoolLiteral'
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__BoolLiteral__Group__0__Impl6375); 
             after(grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__0__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3203:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2 ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3207:1: ( rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3208:2: rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__16406);
            rule__BoolLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__2_in_rule__BoolLiteral__Group__16409);
            rule__BoolLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__1"


    // $ANTLR start "rule__BoolLiteral__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3215:1: rule__BoolLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3219:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3220:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3220:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3221:1: '{'
            {
             before(grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BoolLiteral__Group__1__Impl6437); 
             after(grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__1__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3234:1: rule__BoolLiteral__Group__2 : rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3 ;
    public final void rule__BoolLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3238:1: ( rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3239:2: rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__2__Impl_in_rule__BoolLiteral__Group__26468);
            rule__BoolLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__3_in_rule__BoolLiteral__Group__26471);
            rule__BoolLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__2"


    // $ANTLR start "rule__BoolLiteral__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3246:1: rule__BoolLiteral__Group__2__Impl : ( 'value' ) ;
    public final void rule__BoolLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3250:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3251:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3251:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3252:1: 'value'
            {
             before(grammarAccess.getBoolLiteralAccess().getValueKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__BoolLiteral__Group__2__Impl6499); 
             after(grammarAccess.getBoolLiteralAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__2__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3265:1: rule__BoolLiteral__Group__3 : rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4 ;
    public final void rule__BoolLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3269:1: ( rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3270:2: rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__3__Impl_in_rule__BoolLiteral__Group__36530);
            rule__BoolLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__4_in_rule__BoolLiteral__Group__36533);
            rule__BoolLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__3"


    // $ANTLR start "rule__BoolLiteral__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3277:1: rule__BoolLiteral__Group__3__Impl : ( ( rule__BoolLiteral__ValueAssignment_3 ) ) ;
    public final void rule__BoolLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3281:1: ( ( ( rule__BoolLiteral__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3282:1: ( ( rule__BoolLiteral__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3282:1: ( ( rule__BoolLiteral__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3283:1: ( rule__BoolLiteral__ValueAssignment_3 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3284:1: ( rule__BoolLiteral__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3284:2: rule__BoolLiteral__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__ValueAssignment_3_in_rule__BoolLiteral__Group__3__Impl6560);
            rule__BoolLiteral__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__3__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3294:1: rule__BoolLiteral__Group__4 : rule__BoolLiteral__Group__4__Impl ;
    public final void rule__BoolLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3298:1: ( rule__BoolLiteral__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3299:2: rule__BoolLiteral__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__4__Impl_in_rule__BoolLiteral__Group__46590);
            rule__BoolLiteral__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__4"


    // $ANTLR start "rule__BoolLiteral__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3305:1: rule__BoolLiteral__Group__4__Impl : ( '}' ) ;
    public final void rule__BoolLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3309:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3310:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3310:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3311:1: '}'
            {
             before(grammarAccess.getBoolLiteralAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BoolLiteral__Group__4__Impl6618); 
             after(grammarAccess.getBoolLiteralAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__4__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3334:1: rule__MyIdentifier__Group__0 : rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 ;
    public final void rule__MyIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3338:1: ( rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3339:2: rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__06659);
            rule__MyIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__06662);
            rule__MyIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__0"


    // $ANTLR start "rule__MyIdentifier__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3346:1: rule__MyIdentifier__Group__0__Impl : ( 'myIdentifier' ) ;
    public final void rule__MyIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3350:1: ( ( 'myIdentifier' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3351:1: ( 'myIdentifier' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3351:1: ( 'myIdentifier' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3352:1: 'myIdentifier'
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIdentifierKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__MyIdentifier__Group__0__Impl6690); 
             after(grammarAccess.getMyIdentifierAccess().getMyIdentifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__0__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3365:1: rule__MyIdentifier__Group__1 : rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2 ;
    public final void rule__MyIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3369:1: ( rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3370:2: rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__16721);
            rule__MyIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__2_in_rule__MyIdentifier__Group__16724);
            rule__MyIdentifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__1"


    // $ANTLR start "rule__MyIdentifier__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3377:1: rule__MyIdentifier__Group__1__Impl : ( '{' ) ;
    public final void rule__MyIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3381:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3382:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3382:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3383:1: '{'
            {
             before(grammarAccess.getMyIdentifierAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyIdentifier__Group__1__Impl6752); 
             after(grammarAccess.getMyIdentifierAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__1__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3396:1: rule__MyIdentifier__Group__2 : rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3 ;
    public final void rule__MyIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3400:1: ( rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3401:2: rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__2__Impl_in_rule__MyIdentifier__Group__26783);
            rule__MyIdentifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__3_in_rule__MyIdentifier__Group__26786);
            rule__MyIdentifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__2"


    // $ANTLR start "rule__MyIdentifier__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3408:1: rule__MyIdentifier__Group__2__Impl : ( 'myIntentifierIs' ) ;
    public final void rule__MyIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3412:1: ( ( 'myIntentifierIs' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3413:1: ( 'myIntentifierIs' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3413:1: ( 'myIntentifierIs' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3414:1: 'myIntentifierIs'
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__MyIdentifier__Group__2__Impl6814); 
             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__2__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3427:1: rule__MyIdentifier__Group__3 : rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4 ;
    public final void rule__MyIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3431:1: ( rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3432:2: rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__3__Impl_in_rule__MyIdentifier__Group__36845);
            rule__MyIdentifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__4_in_rule__MyIdentifier__Group__36848);
            rule__MyIdentifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__3"


    // $ANTLR start "rule__MyIdentifier__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3439:1: rule__MyIdentifier__Group__3__Impl : ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) ) ;
    public final void rule__MyIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3443:1: ( ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3444:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3444:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3445:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_3 )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3446:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3446:2: rule__MyIdentifier__MyIntentifierIsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_3_in_rule__MyIdentifier__Group__3__Impl6875);
            rule__MyIdentifier__MyIntentifierIsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__3__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3456:1: rule__MyIdentifier__Group__4 : rule__MyIdentifier__Group__4__Impl ;
    public final void rule__MyIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3460:1: ( rule__MyIdentifier__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3461:2: rule__MyIdentifier__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__4__Impl_in_rule__MyIdentifier__Group__46905);
            rule__MyIdentifier__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__4"


    // $ANTLR start "rule__MyIdentifier__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3467:1: rule__MyIdentifier__Group__4__Impl : ( '}' ) ;
    public final void rule__MyIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3471:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3472:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3472:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3473:1: '}'
            {
             before(grammarAccess.getMyIdentifierAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyIdentifier__Group__4__Impl6933); 
             after(grammarAccess.getMyIdentifierAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__Group__4__Impl"


    // $ANTLR start "rule__MyEnum__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3496:1: rule__MyEnum__Group__0 : rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 ;
    public final void rule__MyEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3500:1: ( rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3501:2: rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__06974);
            rule__MyEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__06977);
            rule__MyEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__0"


    // $ANTLR start "rule__MyEnum__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3508:1: rule__MyEnum__Group__0__Impl : ( 'myEnum' ) ;
    public final void rule__MyEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3512:1: ( ( 'myEnum' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3513:1: ( 'myEnum' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3513:1: ( 'myEnum' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3514:1: 'myEnum'
            {
             before(grammarAccess.getMyEnumAccess().getMyEnumKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MyEnum__Group__0__Impl7005); 
             after(grammarAccess.getMyEnumAccess().getMyEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__0__Impl"


    // $ANTLR start "rule__MyEnum__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3527:1: rule__MyEnum__Group__1 : rule__MyEnum__Group__1__Impl rule__MyEnum__Group__2 ;
    public final void rule__MyEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3531:1: ( rule__MyEnum__Group__1__Impl rule__MyEnum__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3532:2: rule__MyEnum__Group__1__Impl rule__MyEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__17036);
            rule__MyEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__2_in_rule__MyEnum__Group__17039);
            rule__MyEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__1"


    // $ANTLR start "rule__MyEnum__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3539:1: rule__MyEnum__Group__1__Impl : ( '{' ) ;
    public final void rule__MyEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3543:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3544:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3544:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3545:1: '{'
            {
             before(grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyEnum__Group__1__Impl7067); 
             after(grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__1__Impl"


    // $ANTLR start "rule__MyEnum__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3558:1: rule__MyEnum__Group__2 : rule__MyEnum__Group__2__Impl rule__MyEnum__Group__3 ;
    public final void rule__MyEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3562:1: ( rule__MyEnum__Group__2__Impl rule__MyEnum__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3563:2: rule__MyEnum__Group__2__Impl rule__MyEnum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__2__Impl_in_rule__MyEnum__Group__27098);
            rule__MyEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__3_in_rule__MyEnum__Group__27101);
            rule__MyEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__2"


    // $ANTLR start "rule__MyEnum__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3570:1: rule__MyEnum__Group__2__Impl : ( 'values' ) ;
    public final void rule__MyEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3574:1: ( ( 'values' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3575:1: ( 'values' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3575:1: ( 'values' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3576:1: 'values'
            {
             before(grammarAccess.getMyEnumAccess().getValuesKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__MyEnum__Group__2__Impl7129); 
             after(grammarAccess.getMyEnumAccess().getValuesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__2__Impl"


    // $ANTLR start "rule__MyEnum__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3589:1: rule__MyEnum__Group__3 : rule__MyEnum__Group__3__Impl rule__MyEnum__Group__4 ;
    public final void rule__MyEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3593:1: ( rule__MyEnum__Group__3__Impl rule__MyEnum__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3594:2: rule__MyEnum__Group__3__Impl rule__MyEnum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__3__Impl_in_rule__MyEnum__Group__37160);
            rule__MyEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__4_in_rule__MyEnum__Group__37163);
            rule__MyEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__3"


    // $ANTLR start "rule__MyEnum__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3601:1: rule__MyEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__MyEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3605:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3606:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3606:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3607:1: '{'
            {
             before(grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyEnum__Group__3__Impl7191); 
             after(grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__3__Impl"


    // $ANTLR start "rule__MyEnum__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3620:1: rule__MyEnum__Group__4 : rule__MyEnum__Group__4__Impl rule__MyEnum__Group__5 ;
    public final void rule__MyEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3624:1: ( rule__MyEnum__Group__4__Impl rule__MyEnum__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3625:2: rule__MyEnum__Group__4__Impl rule__MyEnum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__4__Impl_in_rule__MyEnum__Group__47222);
            rule__MyEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__5_in_rule__MyEnum__Group__47225);
            rule__MyEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__4"


    // $ANTLR start "rule__MyEnum__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3632:1: rule__MyEnum__Group__4__Impl : ( ( rule__MyEnum__ValuesAssignment_4 ) ) ;
    public final void rule__MyEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3636:1: ( ( ( rule__MyEnum__ValuesAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3637:1: ( ( rule__MyEnum__ValuesAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3637:1: ( ( rule__MyEnum__ValuesAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3638:1: ( rule__MyEnum__ValuesAssignment_4 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3639:1: ( rule__MyEnum__ValuesAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3639:2: rule__MyEnum__ValuesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_4_in_rule__MyEnum__Group__4__Impl7252);
            rule__MyEnum__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMyEnumAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__4__Impl"


    // $ANTLR start "rule__MyEnum__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3649:1: rule__MyEnum__Group__5 : rule__MyEnum__Group__5__Impl rule__MyEnum__Group__6 ;
    public final void rule__MyEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3653:1: ( rule__MyEnum__Group__5__Impl rule__MyEnum__Group__6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3654:2: rule__MyEnum__Group__5__Impl rule__MyEnum__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__5__Impl_in_rule__MyEnum__Group__57282);
            rule__MyEnum__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__6_in_rule__MyEnum__Group__57285);
            rule__MyEnum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__5"


    // $ANTLR start "rule__MyEnum__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3661:1: rule__MyEnum__Group__5__Impl : ( ( rule__MyEnum__Group_5__0 )* ) ;
    public final void rule__MyEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3665:1: ( ( ( rule__MyEnum__Group_5__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3666:1: ( ( rule__MyEnum__Group_5__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3666:1: ( ( rule__MyEnum__Group_5__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3667:1: ( rule__MyEnum__Group_5__0 )*
            {
             before(grammarAccess.getMyEnumAccess().getGroup_5()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3668:1: ( rule__MyEnum__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3668:2: rule__MyEnum__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_5__0_in_rule__MyEnum__Group__5__Impl7312);
            	    rule__MyEnum__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMyEnumAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__5__Impl"


    // $ANTLR start "rule__MyEnum__Group__6"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3678:1: rule__MyEnum__Group__6 : rule__MyEnum__Group__6__Impl rule__MyEnum__Group__7 ;
    public final void rule__MyEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3682:1: ( rule__MyEnum__Group__6__Impl rule__MyEnum__Group__7 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3683:2: rule__MyEnum__Group__6__Impl rule__MyEnum__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__6__Impl_in_rule__MyEnum__Group__67343);
            rule__MyEnum__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__7_in_rule__MyEnum__Group__67346);
            rule__MyEnum__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__6"


    // $ANTLR start "rule__MyEnum__Group__6__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3690:1: rule__MyEnum__Group__6__Impl : ( '}' ) ;
    public final void rule__MyEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3694:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3695:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3695:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3696:1: '}'
            {
             before(grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyEnum__Group__6__Impl7374); 
             after(grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__6__Impl"


    // $ANTLR start "rule__MyEnum__Group__7"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3709:1: rule__MyEnum__Group__7 : rule__MyEnum__Group__7__Impl ;
    public final void rule__MyEnum__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3713:1: ( rule__MyEnum__Group__7__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3714:2: rule__MyEnum__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__7__Impl_in_rule__MyEnum__Group__77405);
            rule__MyEnum__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__7"


    // $ANTLR start "rule__MyEnum__Group__7__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3720:1: rule__MyEnum__Group__7__Impl : ( '}' ) ;
    public final void rule__MyEnum__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3724:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3725:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3725:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3726:1: '}'
            {
             before(grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyEnum__Group__7__Impl7433); 
             after(grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group__7__Impl"


    // $ANTLR start "rule__MyEnum__Group_5__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3755:1: rule__MyEnum__Group_5__0 : rule__MyEnum__Group_5__0__Impl rule__MyEnum__Group_5__1 ;
    public final void rule__MyEnum__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3759:1: ( rule__MyEnum__Group_5__0__Impl rule__MyEnum__Group_5__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3760:2: rule__MyEnum__Group_5__0__Impl rule__MyEnum__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_5__0__Impl_in_rule__MyEnum__Group_5__07480);
            rule__MyEnum__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_5__1_in_rule__MyEnum__Group_5__07483);
            rule__MyEnum__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group_5__0"


    // $ANTLR start "rule__MyEnum__Group_5__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3767:1: rule__MyEnum__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MyEnum__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3771:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3772:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3772:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3773:1: ','
            {
             before(grammarAccess.getMyEnumAccess().getCommaKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyEnum__Group_5__0__Impl7511); 
             after(grammarAccess.getMyEnumAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group_5__0__Impl"


    // $ANTLR start "rule__MyEnum__Group_5__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3786:1: rule__MyEnum__Group_5__1 : rule__MyEnum__Group_5__1__Impl ;
    public final void rule__MyEnum__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3790:1: ( rule__MyEnum__Group_5__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3791:2: rule__MyEnum__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_5__1__Impl_in_rule__MyEnum__Group_5__17542);
            rule__MyEnum__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group_5__1"


    // $ANTLR start "rule__MyEnum__Group_5__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3797:1: rule__MyEnum__Group_5__1__Impl : ( ( rule__MyEnum__ValuesAssignment_5_1 ) ) ;
    public final void rule__MyEnum__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3801:1: ( ( ( rule__MyEnum__ValuesAssignment_5_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3802:1: ( ( rule__MyEnum__ValuesAssignment_5_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3802:1: ( ( rule__MyEnum__ValuesAssignment_5_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3803:1: ( rule__MyEnum__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_5_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3804:1: ( rule__MyEnum__ValuesAssignment_5_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3804:2: rule__MyEnum__ValuesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_5_1_in_rule__MyEnum__Group_5__1__Impl7569);
            rule__MyEnum__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMyEnumAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__Group_5__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3818:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3822:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3823:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__07603);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__07606);
            rule__BooleanValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0"


    // $ANTLR start "rule__BooleanValue__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3830:1: rule__BooleanValue__Group__0__Impl : ( 'BooleanValue' ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3834:1: ( ( 'BooleanValue' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3835:1: ( 'BooleanValue' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3835:1: ( 'BooleanValue' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3836:1: 'BooleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__BooleanValue__Group__0__Impl7634); 
             after(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3849:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3853:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3854:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__17665);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__17668);
            rule__BooleanValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1"


    // $ANTLR start "rule__BooleanValue__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3861:1: rule__BooleanValue__Group__1__Impl : ( '{' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3865:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3866:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3866:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3867:1: '{'
            {
             before(grammarAccess.getBooleanValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BooleanValue__Group__1__Impl7696); 
             after(grammarAccess.getBooleanValueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3880:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3884:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3885:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__27727);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__27730);
            rule__BooleanValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2"


    // $ANTLR start "rule__BooleanValue__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3892:1: rule__BooleanValue__Group__2__Impl : ( 'trueValue' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3896:1: ( ( 'trueValue' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3897:1: ( 'trueValue' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3897:1: ( 'trueValue' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3898:1: 'trueValue'
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__BooleanValue__Group__2__Impl7758); 
             after(grammarAccess.getBooleanValueAccess().getTrueValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2__Impl"


    // $ANTLR start "rule__BooleanValue__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3911:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl rule__BooleanValue__Group__4 ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3915:1: ( rule__BooleanValue__Group__3__Impl rule__BooleanValue__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3916:2: rule__BooleanValue__Group__3__Impl rule__BooleanValue__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__37789);
            rule__BooleanValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__4_in_rule__BooleanValue__Group__37792);
            rule__BooleanValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__3"


    // $ANTLR start "rule__BooleanValue__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3923:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__TrueValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3927:1: ( ( ( rule__BooleanValue__TrueValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3928:1: ( ( rule__BooleanValue__TrueValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3928:1: ( ( rule__BooleanValue__TrueValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3929:1: ( rule__BooleanValue__TrueValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3930:1: ( rule__BooleanValue__TrueValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3930:2: rule__BooleanValue__TrueValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TrueValueAssignment_3_in_rule__BooleanValue__Group__3__Impl7819);
            rule__BooleanValue__TrueValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__3__Impl"


    // $ANTLR start "rule__BooleanValue__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3940:1: rule__BooleanValue__Group__4 : rule__BooleanValue__Group__4__Impl rule__BooleanValue__Group__5 ;
    public final void rule__BooleanValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3944:1: ( rule__BooleanValue__Group__4__Impl rule__BooleanValue__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3945:2: rule__BooleanValue__Group__4__Impl rule__BooleanValue__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__4__Impl_in_rule__BooleanValue__Group__47849);
            rule__BooleanValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__5_in_rule__BooleanValue__Group__47852);
            rule__BooleanValue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__4"


    // $ANTLR start "rule__BooleanValue__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3952:1: rule__BooleanValue__Group__4__Impl : ( 'falseValue' ) ;
    public final void rule__BooleanValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3956:1: ( ( 'falseValue' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3957:1: ( 'falseValue' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3957:1: ( 'falseValue' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3958:1: 'falseValue'
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueKeyword_4()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__BooleanValue__Group__4__Impl7880); 
             after(grammarAccess.getBooleanValueAccess().getFalseValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__4__Impl"


    // $ANTLR start "rule__BooleanValue__Group__5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3971:1: rule__BooleanValue__Group__5 : rule__BooleanValue__Group__5__Impl rule__BooleanValue__Group__6 ;
    public final void rule__BooleanValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3975:1: ( rule__BooleanValue__Group__5__Impl rule__BooleanValue__Group__6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3976:2: rule__BooleanValue__Group__5__Impl rule__BooleanValue__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__5__Impl_in_rule__BooleanValue__Group__57911);
            rule__BooleanValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__6_in_rule__BooleanValue__Group__57914);
            rule__BooleanValue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__5"


    // $ANTLR start "rule__BooleanValue__Group__5__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3983:1: rule__BooleanValue__Group__5__Impl : ( ( rule__BooleanValue__FalseValueAssignment_5 ) ) ;
    public final void rule__BooleanValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3987:1: ( ( ( rule__BooleanValue__FalseValueAssignment_5 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3988:1: ( ( rule__BooleanValue__FalseValueAssignment_5 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3988:1: ( ( rule__BooleanValue__FalseValueAssignment_5 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3989:1: ( rule__BooleanValue__FalseValueAssignment_5 )
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_5()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3990:1: ( rule__BooleanValue__FalseValueAssignment_5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3990:2: rule__BooleanValue__FalseValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__FalseValueAssignment_5_in_rule__BooleanValue__Group__5__Impl7941);
            rule__BooleanValue__FalseValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__5__Impl"


    // $ANTLR start "rule__BooleanValue__Group__6"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4000:1: rule__BooleanValue__Group__6 : rule__BooleanValue__Group__6__Impl ;
    public final void rule__BooleanValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4004:1: ( rule__BooleanValue__Group__6__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4005:2: rule__BooleanValue__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__6__Impl_in_rule__BooleanValue__Group__67971);
            rule__BooleanValue__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__6"


    // $ANTLR start "rule__BooleanValue__Group__6__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4011:1: rule__BooleanValue__Group__6__Impl : ( '}' ) ;
    public final void rule__BooleanValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4015:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4016:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4016:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4017:1: '}'
            {
             before(grammarAccess.getBooleanValueAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BooleanValue__Group__6__Impl7999); 
             after(grammarAccess.getBooleanValueAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__6__Impl"


    // $ANTLR start "rule__MyRange__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4044:1: rule__MyRange__Group__0 : rule__MyRange__Group__0__Impl rule__MyRange__Group__1 ;
    public final void rule__MyRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4048:1: ( rule__MyRange__Group__0__Impl rule__MyRange__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4049:2: rule__MyRange__Group__0__Impl rule__MyRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__08044);
            rule__MyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__08047);
            rule__MyRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__0"


    // $ANTLR start "rule__MyRange__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4056:1: rule__MyRange__Group__0__Impl : ( 'myRange' ) ;
    public final void rule__MyRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4060:1: ( ( 'myRange' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4061:1: ( 'myRange' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4061:1: ( 'myRange' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4062:1: 'myRange'
            {
             before(grammarAccess.getMyRangeAccess().getMyRangeKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__MyRange__Group__0__Impl8075); 
             after(grammarAccess.getMyRangeAccess().getMyRangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__0__Impl"


    // $ANTLR start "rule__MyRange__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4075:1: rule__MyRange__Group__1 : rule__MyRange__Group__1__Impl rule__MyRange__Group__2 ;
    public final void rule__MyRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4079:1: ( rule__MyRange__Group__1__Impl rule__MyRange__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4080:2: rule__MyRange__Group__1__Impl rule__MyRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__18106);
            rule__MyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__18109);
            rule__MyRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__1"


    // $ANTLR start "rule__MyRange__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4087:1: rule__MyRange__Group__1__Impl : ( '{' ) ;
    public final void rule__MyRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4091:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4092:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4092:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4093:1: '{'
            {
             before(grammarAccess.getMyRangeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyRange__Group__1__Impl8137); 
             after(grammarAccess.getMyRangeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__1__Impl"


    // $ANTLR start "rule__MyRange__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4106:1: rule__MyRange__Group__2 : rule__MyRange__Group__2__Impl rule__MyRange__Group__3 ;
    public final void rule__MyRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4110:1: ( rule__MyRange__Group__2__Impl rule__MyRange__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4111:2: rule__MyRange__Group__2__Impl rule__MyRange__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__28168);
            rule__MyRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__3_in_rule__MyRange__Group__28171);
            rule__MyRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__2"


    // $ANTLR start "rule__MyRange__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4118:1: rule__MyRange__Group__2__Impl : ( 'range' ) ;
    public final void rule__MyRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4122:1: ( ( 'range' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4123:1: ( 'range' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4123:1: ( 'range' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4124:1: 'range'
            {
             before(grammarAccess.getMyRangeAccess().getRangeKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__MyRange__Group__2__Impl8199); 
             after(grammarAccess.getMyRangeAccess().getRangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__2__Impl"


    // $ANTLR start "rule__MyRange__Group__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4137:1: rule__MyRange__Group__3 : rule__MyRange__Group__3__Impl rule__MyRange__Group__4 ;
    public final void rule__MyRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4141:1: ( rule__MyRange__Group__3__Impl rule__MyRange__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4142:2: rule__MyRange__Group__3__Impl rule__MyRange__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__3__Impl_in_rule__MyRange__Group__38230);
            rule__MyRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__4_in_rule__MyRange__Group__38233);
            rule__MyRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__3"


    // $ANTLR start "rule__MyRange__Group__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4149:1: rule__MyRange__Group__3__Impl : ( ( rule__MyRange__RangeAssignment_3 ) ) ;
    public final void rule__MyRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4153:1: ( ( ( rule__MyRange__RangeAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4154:1: ( ( rule__MyRange__RangeAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4154:1: ( ( rule__MyRange__RangeAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4155:1: ( rule__MyRange__RangeAssignment_3 )
            {
             before(grammarAccess.getMyRangeAccess().getRangeAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4156:1: ( rule__MyRange__RangeAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4156:2: rule__MyRange__RangeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__RangeAssignment_3_in_rule__MyRange__Group__3__Impl8260);
            rule__MyRange__RangeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getRangeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__3__Impl"


    // $ANTLR start "rule__MyRange__Group__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4166:1: rule__MyRange__Group__4 : rule__MyRange__Group__4__Impl ;
    public final void rule__MyRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4170:1: ( rule__MyRange__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4171:2: rule__MyRange__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__4__Impl_in_rule__MyRange__Group__48290);
            rule__MyRange__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__4"


    // $ANTLR start "rule__MyRange__Group__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4177:1: rule__MyRange__Group__4__Impl : ( '}' ) ;
    public final void rule__MyRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4181:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4182:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4182:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4183:1: '}'
            {
             before(grammarAccess.getMyRangeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyRange__Group__4__Impl8318); 
             after(grammarAccess.getMyRangeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__Group__4__Impl"


    // $ANTLR start "rule__MyModel__NameAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4207:1: rule__MyModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MyModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4211:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4212:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4212:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4213:1: ruleEString
            {
             before(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_28364);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__NameAssignment_2"


    // $ANTLR start "rule__MyModel__MyModelContainsAssignment_4_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4222:1: rule__MyModel__MyModelContainsAssignment_4_2 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4226:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4227:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4227:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4228:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_4_28395);
            rulemyObject();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__MyModelContainsAssignment_4_2"


    // $ANTLR start "rule__MyModel__MyModelContainsAssignment_4_3_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4237:1: rule__MyModel__MyModelContainsAssignment_4_3_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4241:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4242:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4242:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4243:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_4_3_18426);
            rulemyObject();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyModel__MyModelContainsAssignment_4_3_1"


    // $ANTLR start "rule__MyObject__NameAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4252:1: rule__MyObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MyObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4256:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4257:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4257:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4258:1: ruleEString
            {
             before(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_28457);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__NameAssignment_2"


    // $ANTLR start "rule__MyObject__MyObjectHasAssignment_4_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4267:1: rule__MyObject__MyObjectHasAssignment_4_2 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4271:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4272:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4272:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4273:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_28488);
            rulemyConstraint();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyObjectHasAssignment_4_2"


    // $ANTLR start "rule__MyObject__MyObjectHasAssignment_4_3_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4282:1: rule__MyObject__MyObjectHasAssignment_4_3_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4286:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4287:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4287:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4288:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_3_18519);
            rulemyConstraint();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyObjectHasAssignment_4_3_1"


    // $ANTLR start "rule__MyObject__MyAttributeContainsAssignment_5_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4297:1: rule__MyObject__MyAttributeContainsAssignment_5_2 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4301:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4302:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4302:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4303:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_5_28550);
            rulemyAttribute();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyAttributeContainsAssignment_5_2"


    // $ANTLR start "rule__MyObject__MyAttributeContainsAssignment_5_3_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4312:1: rule__MyObject__MyAttributeContainsAssignment_5_3_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4316:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4317:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4317:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4318:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_5_3_18581);
            rulemyAttribute();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyAttributeContainsAssignment_5_3_1"


    // $ANTLR start "rule__MyConstraint__MyConstraintContainsAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4327:1: rule__MyConstraint__MyConstraintContainsAssignment_3 : ( rulemyExpression ) ;
    public final void rule__MyConstraint__MyConstraintContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4331:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4332:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4332:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4333:1: rulemyExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_38612);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__MyConstraintContainsAssignment_3"


    // $ANTLR start "rule__MyAttribute__NameAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4342:1: rule__MyAttribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4346:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4347:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4347:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4348:1: ruleEString
            {
             before(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_18643);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__NameAssignment_1"


    // $ANTLR start "rule__MyAttribute__MyAttributeContainsAssignment_4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4357:1: rule__MyAttribute__MyAttributeContainsAssignment_4 : ( rulemyValue ) ;
    public final void rule__MyAttribute__MyAttributeContainsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4361:1: ( ( rulemyValue ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4362:1: ( rulemyValue )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4362:1: ( rulemyValue )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4363:1: rulemyValue
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_48674);
            rulemyValue();

            state._fsp--;

             after(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyAttribute__MyAttributeContainsAssignment_4"


    // $ANTLR start "rule__MyBinary__OparandAssignment_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4372:1: rule__MyBinary__OparandAssignment_2_1 : ( rulemyBinaryOparators ) ;
    public final void rule__MyBinary__OparandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4376:1: ( ( rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4377:1: ( rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4377:1: ( rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4378:1: rulemyBinaryOparators
            {
             before(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_2_18705);
            rulemyBinaryOparators();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__OparandAssignment_2_1"


    // $ANTLR start "rule__MyBinary__MyBinaryLeftAssignment_4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4387:1: rule__MyBinary__MyBinaryLeftAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryLeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4391:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4392:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4392:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4393:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_48736);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__MyBinaryLeftAssignment_4"


    // $ANTLR start "rule__MyBinary__MyBinaryRightAssignment_6"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4402:1: rule__MyBinary__MyBinaryRightAssignment_6 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryRightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4406:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4407:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4407:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4408:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_68767);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__MyBinaryRightAssignment_6"


    // $ANTLR start "rule__MyUnary__OparandAssignment_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4417:1: rule__MyUnary__OparandAssignment_2_1 : ( rulemyUnaryOparators ) ;
    public final void rule__MyUnary__OparandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4421:1: ( ( rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4422:1: ( rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4422:1: ( rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4423:1: rulemyUnaryOparators
            {
             before(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_2_18798);
            rulemyUnaryOparators();

            state._fsp--;

             after(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__OparandAssignment_2_1"


    // $ANTLR start "rule__MyUnary__MyUnaryExpressionAssignment_4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4432:1: rule__MyUnary__MyUnaryExpressionAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyUnary__MyUnaryExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4436:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4437:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4437:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4438:1: rulemyExpression
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_48829);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__MyUnaryExpressionAssignment_4"


    // $ANTLR start "rule__MyString__ValueAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4447:1: rule__MyString__ValueAssignment_3 : ( ruleAnyURI ) ;
    public final void rule__MyString__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4451:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4452:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4452:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4453:1: ruleAnyURI
            {
             before(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment_38860);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__ValueAssignment_3"


    // $ANTLR start "rule__MyInt__ValueAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4462:1: rule__MyInt__ValueAssignment_3 : ( ruleInt0 ) ;
    public final void rule__MyInt__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4466:1: ( ( ruleInt0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4467:1: ( ruleInt0 )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4467:1: ( ruleInt0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4468:1: ruleInt0
            {
             before(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment_38891);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__ValueAssignment_3"


    // $ANTLR start "rule__BoolLiteral__ValueAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4477:1: rule__BoolLiteral__ValueAssignment_3 : ( ruleBoolean ) ;
    public final void rule__BoolLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4481:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4482:1: ( ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4482:1: ( ruleBoolean )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4483:1: ruleBoolean
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment_38922);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__ValueAssignment_3"


    // $ANTLR start "rule__MyIdentifier__MyIntentifierIsAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4492:1: rule__MyIdentifier__MyIntentifierIsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__MyIdentifier__MyIntentifierIsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4496:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4497:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4497:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4498:1: ( ruleEString )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_3_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4499:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4500:1: ruleEString
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_38957);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__MyIntentifierIsAssignment_3"


    // $ANTLR start "rule__MyEnum__ValuesAssignment_4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4511:1: rule__MyEnum__ValuesAssignment_4 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4515:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4516:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4516:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4517:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_48992);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__ValuesAssignment_4"


    // $ANTLR start "rule__MyEnum__ValuesAssignment_5_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4526:1: rule__MyEnum__ValuesAssignment_5_1 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4530:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4531:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4531:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4532:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_5_19023);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyEnum__ValuesAssignment_5_1"


    // $ANTLR start "rule__BooleanValue__TrueValueAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4541:1: rule__BooleanValue__TrueValueAssignment_3 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__TrueValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4545:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4546:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4546:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4547:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_39054);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__TrueValueAssignment_3"


    // $ANTLR start "rule__BooleanValue__FalseValueAssignment_5"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4556:1: rule__BooleanValue__FalseValueAssignment_5 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__FalseValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4560:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4561:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4561:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4562:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_59085);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__FalseValueAssignment_5"


    // $ANTLR start "rule__MyRange__RangeAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4571:1: rule__MyRange__RangeAssignment_3 : ( ruleAnySimpleType ) ;
    public final void rule__MyRange__RangeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4575:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4576:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4576:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:4577:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_39116);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__RangeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulemyModel_in_entryRulemyModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__0_in_rulemyModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_entryRulemyExpression121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyExpression128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyExpression__Alternatives_in_rulemyExpression154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyValue__Alternatives_in_rulemyValue214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_entryRulemyObject301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyObject308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__0_in_rulemyObject334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_entryRulemyConstraint361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConstraint368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__0_in_rulemyConstraint394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_entryRulemyAttribute421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyAttribute428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0_in_rulemyAttribute454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0_in_rulemyBinary514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0_in_rulemyUnary574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_entryRulemyString601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyString608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__0_in_rulemyString634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_entryRulemyInt661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyInt668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__0_in_rulemyInt694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__0_in_rulemyIdentifier814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAnyURI875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt0903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt0910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleInt0937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBoolean999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_entryRulemyEnum1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyEnum1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0_in_rulemyEnum1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0_in_rulemyRange1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleAnySimpleType1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulemyUnaryOparators1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_rule__MyExpression__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_rule__MyExpression__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__MyExpression__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_rule__MyValue__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__MyValue__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MyBinaryOparators__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MyBinaryOparators__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01766 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11827 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyModel__Group__1__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21889 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__3_in_rule__MyModel__Group__21892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__NameAssignment_2_in_rule__MyModel__Group__2__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__3__Impl_in_rule__MyModel__Group__31949 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__4_in_rule__MyModel__Group__31952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyModel__Group__3__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__4__Impl_in_rule__MyModel__Group__42011 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__5_in_rule__MyModel__Group__42014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__0_in_rule__MyModel__Group__4__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__5__Impl_in_rule__MyModel__Group__52072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyModel__Group__5__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__0__Impl_in_rule__MyModel__Group_4__02143 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__1_in_rule__MyModel__Group_4__02146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MyModel__Group_4__0__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__1__Impl_in_rule__MyModel__Group_4__12205 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__2_in_rule__MyModel__Group_4__12208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyModel__Group_4__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__2__Impl_in_rule__MyModel__Group_4__22267 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__3_in_rule__MyModel__Group_4__22270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_4_2_in_rule__MyModel__Group_4__2__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__3__Impl_in_rule__MyModel__Group_4__32327 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__4_in_rule__MyModel__Group_4__32330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4_3__0_in_rule__MyModel__Group_4__3__Impl2357 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4__4__Impl_in_rule__MyModel__Group_4__42388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyModel__Group_4__4__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4_3__0__Impl_in_rule__MyModel__Group_4_3__02457 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4_3__1_in_rule__MyModel__Group_4_3__02460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyModel__Group_4_3__0__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_4_3__1__Impl_in_rule__MyModel__Group_4_3__12519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_4_3_1_in_rule__MyModel__Group_4_3__1__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02580 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12641 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MyObject__Group__1__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22703 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__NameAssignment_2_in_rule__MyObject__Group__2__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32763 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group__3__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42825 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52886 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__6_in_rule__MyObject__Group__52889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__0_in_rule__MyObject__Group__5__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__6__Impl_in_rule__MyObject__Group__62947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group__6__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__03020 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__03023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MyObject__Group_4__0__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13082 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group_4__1__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23144 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__3_in_rule__MyObject__Group_4__23147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_in_rule__MyObject__Group_4__2__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__3__Impl_in_rule__MyObject__Group_4__33204 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__4_in_rule__MyObject__Group_4__33207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__0_in_rule__MyObject__Group_4__3__Impl3234 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__4__Impl_in_rule__MyObject__Group_4__43265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_4__4__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__0__Impl_in_rule__MyObject__Group_4_3__03334 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__1_in_rule__MyObject__Group_4_3__03337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyObject__Group_4_3__0__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__1__Impl_in_rule__MyObject__Group_4_3__13396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_3_1_in_rule__MyObject__Group_4_3__1__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__0__Impl_in_rule__MyObject__Group_5__03457 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__1_in_rule__MyObject__Group_5__03460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyObject__Group_5__0__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__1__Impl_in_rule__MyObject__Group_5__13519 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__2_in_rule__MyObject__Group_5__13522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group_5__1__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__2__Impl_in_rule__MyObject__Group_5__23581 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__3_in_rule__MyObject__Group_5__23584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_5_2_in_rule__MyObject__Group_5__2__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__3__Impl_in_rule__MyObject__Group_5__33641 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__4_in_rule__MyObject__Group_5__33644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5_3__0_in_rule__MyObject__Group_5__3__Impl3671 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5__4__Impl_in_rule__MyObject__Group_5__43702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_5__4__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5_3__0__Impl_in_rule__MyObject__Group_5_3__03771 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5_3__1_in_rule__MyObject__Group_5_3__03774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyObject__Group_5_3__0__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_5_3__1__Impl_in_rule__MyObject__Group_5_3__13833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_5_3_1_in_rule__MyObject__Group_5_3__1__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03894 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MyConstraint__Group__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13956 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyConstraint__Group__1__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__24018 = new BitSet(new long[]{0x00003A8800000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__24021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MyConstraint__Group__2__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__34080 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__4_in_rule__MyConstraint__Group__34083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__4__Impl_in_rule__MyConstraint__Group__44140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyConstraint__Group__4__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__04209 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__04212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MyAttribute__Group__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__14271 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__14274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__NameAssignment_1_in_rule__MyAttribute__Group__1__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__24331 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__24334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyAttribute__Group__2__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__34393 = new BitSet(new long[]{0x0012800000000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__4_in_rule__MyAttribute__Group__34396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyAttribute__Group__3__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__4__Impl_in_rule__MyAttribute__Group__44455 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__5_in_rule__MyAttribute__Group__44458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_4_in_rule__MyAttribute__Group__4__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__5__Impl_in_rule__MyAttribute__Group__54515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyAttribute__Group__5__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__04586 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__04589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MyBinary__Group__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__14648 = new BitSet(new long[]{0x0000005000000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyBinary__Group__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__24710 = new BitSet(new long[]{0x0000005000000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__0_in_rule__MyBinary__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__34771 = new BitSet(new long[]{0x00003A8800000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__34774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MyBinary__Group__3__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44833 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__5_in_rule__MyBinary__Group__44836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_4_in_rule__MyBinary__Group__4__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__5__Impl_in_rule__MyBinary__Group__54893 = new BitSet(new long[]{0x00003A8800000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__6_in_rule__MyBinary__Group__54896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MyBinary__Group__5__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__6__Impl_in_rule__MyBinary__Group__64955 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__7_in_rule__MyBinary__Group__64958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryRightAssignment_6_in_rule__MyBinary__Group__6__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__7__Impl_in_rule__MyBinary__Group__75015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyBinary__Group__7__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__0__Impl_in_rule__MyBinary__Group_2__05090 = new BitSet(new long[]{0x0000000000FF0000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__1_in_rule__MyBinary__Group_2__05093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MyBinary__Group_2__0__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__1__Impl_in_rule__MyBinary__Group_2__15152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__OparandAssignment_2_1_in_rule__MyBinary__Group_2__1__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__05213 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__05216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MyUnary__Group__0__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__15275 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__15278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyUnary__Group__1__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__25337 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__3_in_rule__MyUnary__Group__25340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__0_in_rule__MyUnary__Group__2__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__3__Impl_in_rule__MyUnary__Group__35398 = new BitSet(new long[]{0x00003A8800000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__4_in_rule__MyUnary__Group__35401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MyUnary__Group__3__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__4__Impl_in_rule__MyUnary__Group__45460 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__5_in_rule__MyUnary__Group__45463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_4_in_rule__MyUnary__Group__4__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__5__Impl_in_rule__MyUnary__Group__55520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyUnary__Group__5__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__0__Impl_in_rule__MyUnary__Group_2__05591 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__1_in_rule__MyUnary__Group_2__05594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MyUnary__Group_2__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__1__Impl_in_rule__MyUnary__Group_2__15653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__OparandAssignment_2_1_in_rule__MyUnary__Group_2__1__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__0__Impl_in_rule__MyString__Group__05714 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__1_in_rule__MyString__Group__05717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MyString__Group__0__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__1__Impl_in_rule__MyString__Group__15776 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__2_in_rule__MyString__Group__15779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyString__Group__1__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__2__Impl_in_rule__MyString__Group__25838 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__MyString__Group__3_in_rule__MyString__Group__25841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__MyString__Group__2__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__3__Impl_in_rule__MyString__Group__35900 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__4_in_rule__MyString__Group__35903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__ValueAssignment_3_in_rule__MyString__Group__3__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__4__Impl_in_rule__MyString__Group__45960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyString__Group__4__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__0__Impl_in_rule__MyInt__Group__06029 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__1_in_rule__MyInt__Group__06032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MyInt__Group__0__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__1__Impl_in_rule__MyInt__Group__16091 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__2_in_rule__MyInt__Group__16094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyInt__Group__1__Impl6122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__2__Impl_in_rule__MyInt__Group__26153 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__3_in_rule__MyInt__Group__26156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__MyInt__Group__2__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__3__Impl_in_rule__MyInt__Group__36215 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__4_in_rule__MyInt__Group__36218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__ValueAssignment_3_in_rule__MyInt__Group__3__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__4__Impl_in_rule__MyInt__Group__46275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyInt__Group__4__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__06344 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__06347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__BoolLiteral__Group__0__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__16406 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__2_in_rule__BoolLiteral__Group__16409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BoolLiteral__Group__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__2__Impl_in_rule__BoolLiteral__Group__26468 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__3_in_rule__BoolLiteral__Group__26471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__BoolLiteral__Group__2__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__3__Impl_in_rule__BoolLiteral__Group__36530 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__4_in_rule__BoolLiteral__Group__36533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_3_in_rule__BoolLiteral__Group__3__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__4__Impl_in_rule__BoolLiteral__Group__46590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BoolLiteral__Group__4__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__06659 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__06662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__MyIdentifier__Group__0__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__16721 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__2_in_rule__MyIdentifier__Group__16724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyIdentifier__Group__1__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__2__Impl_in_rule__MyIdentifier__Group__26783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__3_in_rule__MyIdentifier__Group__26786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__MyIdentifier__Group__2__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__3__Impl_in_rule__MyIdentifier__Group__36845 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__4_in_rule__MyIdentifier__Group__36848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_3_in_rule__MyIdentifier__Group__3__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__4__Impl_in_rule__MyIdentifier__Group__46905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyIdentifier__Group__4__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__06974 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__06977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MyEnum__Group__0__Impl7005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__17036 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__2_in_rule__MyEnum__Group__17039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyEnum__Group__1__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__2__Impl_in_rule__MyEnum__Group__27098 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__3_in_rule__MyEnum__Group__27101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__MyEnum__Group__2__Impl7129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__3__Impl_in_rule__MyEnum__Group__37160 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__4_in_rule__MyEnum__Group__37163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyEnum__Group__3__Impl7191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__4__Impl_in_rule__MyEnum__Group__47222 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__5_in_rule__MyEnum__Group__47225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_4_in_rule__MyEnum__Group__4__Impl7252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__5__Impl_in_rule__MyEnum__Group__57282 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__6_in_rule__MyEnum__Group__57285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_5__0_in_rule__MyEnum__Group__5__Impl7312 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__6__Impl_in_rule__MyEnum__Group__67343 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__7_in_rule__MyEnum__Group__67346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyEnum__Group__6__Impl7374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__7__Impl_in_rule__MyEnum__Group__77405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyEnum__Group__7__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_5__0__Impl_in_rule__MyEnum__Group_5__07480 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_5__1_in_rule__MyEnum__Group_5__07483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyEnum__Group_5__0__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_5__1__Impl_in_rule__MyEnum__Group_5__17542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_5_1_in_rule__MyEnum__Group_5__1__Impl7569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__07603 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__07606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__BooleanValue__Group__0__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__17665 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__17668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BooleanValue__Group__1__Impl7696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__27727 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__27730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__BooleanValue__Group__2__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__37789 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__4_in_rule__BooleanValue__Group__37792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TrueValueAssignment_3_in_rule__BooleanValue__Group__3__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__4__Impl_in_rule__BooleanValue__Group__47849 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__5_in_rule__BooleanValue__Group__47852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__BooleanValue__Group__4__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__5__Impl_in_rule__BooleanValue__Group__57911 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__6_in_rule__BooleanValue__Group__57914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__FalseValueAssignment_5_in_rule__BooleanValue__Group__5__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__6__Impl_in_rule__BooleanValue__Group__67971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BooleanValue__Group__6__Impl7999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__08044 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__08047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__MyRange__Group__0__Impl8075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__18106 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__18109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyRange__Group__1__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__28168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__3_in_rule__MyRange__Group__28171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__MyRange__Group__2__Impl8199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__3__Impl_in_rule__MyRange__Group__38230 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__4_in_rule__MyRange__Group__38233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__RangeAssignment_3_in_rule__MyRange__Group__3__Impl8260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__4__Impl_in_rule__MyRange__Group__48290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyRange__Group__4__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_28364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_4_28395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_4_3_18426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_28457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_28488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_3_18519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_5_28550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_5_3_18581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_38612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_18643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_48674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_2_18705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_48736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_68767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_2_18798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_48829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment_38860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment_38891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment_38922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_38957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_48992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_5_19023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_39054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_59085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_39116 = new BitSet(new long[]{0x0000000000000002L});
    }


}