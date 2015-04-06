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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyURI'", "'Int'", "'Boolean'", "'AnySimpleType'", "'not'", "'and'", "'or'", "'gt'", "'lt'", "'eq'", "'is'", "'if'", "'then'", "'{'", "'}'", "','", "'has'", "'myAttributeContains'", "'myConstraint'", "'myConstraintContains'", "'['", "']'", "'myBinary'", "'myBinaryLeft'", "'myBinaryRight'", "'Oparand'", "'myUnary'", "'myUnaryExpression'", "'myString'", "'value'", "'myInt'", "'BoolLiteral'", "'myIdentifier'", "'myIntentifierIs'", "':'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
            case 33:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 39:
                {
                alt1=3;
                }
                break;
            case 41:
                {
                alt1=4;
                }
                break;
            case 42:
                {
                alt1=5;
                }
                break;
            case 43:
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
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==46) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||LA2_1==26||LA2_1==32) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:874:1: rule__MyModel__Group__1__Impl : ( ( rule__MyModel__NameAssignment_1 ) ) ;
    public final void rule__MyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:878:1: ( ( ( rule__MyModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:879:1: ( ( rule__MyModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:879:1: ( ( rule__MyModel__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:880:1: ( rule__MyModel__NameAssignment_1 )
            {
             before(grammarAccess.getMyModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:881:1: ( rule__MyModel__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:881:2: rule__MyModel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1857);
            rule__MyModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getNameAssignment_1()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:891:1: rule__MyModel__Group__2 : rule__MyModel__Group__2__Impl ;
    public final void rule__MyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:895:1: ( rule__MyModel__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:896:2: rule__MyModel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21887);
            rule__MyModel__Group__2__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:902:1: rule__MyModel__Group__2__Impl : ( ( rule__MyModel__Group_2__0 )? ) ;
    public final void rule__MyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:906:1: ( ( ( rule__MyModel__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:907:1: ( ( rule__MyModel__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:907:1: ( ( rule__MyModel__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:908:1: ( rule__MyModel__Group_2__0 )?
            {
             before(grammarAccess.getMyModelAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:909:1: ( rule__MyModel__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:909:2: rule__MyModel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1914);
                    rule__MyModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyModelAccess().getGroup_2()); 

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


    // $ANTLR start "rule__MyModel__Group_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:925:1: rule__MyModel__Group_2__0 : rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 ;
    public final void rule__MyModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:929:1: ( rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:930:2: rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01951);
            rule__MyModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01954);
            rule__MyModel__Group_2__1();

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
    // $ANTLR end "rule__MyModel__Group_2__0"


    // $ANTLR start "rule__MyModel__Group_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:937:1: rule__MyModel__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MyModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:941:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:942:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:942:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:943:1: '{'
            {
             before(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyModel__Group_2__0__Impl1982); 
             after(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__MyModel__Group_2__0__Impl"


    // $ANTLR start "rule__MyModel__Group_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:956:1: rule__MyModel__Group_2__1 : rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 ;
    public final void rule__MyModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:960:1: ( rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:961:2: rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__12013);
            rule__MyModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__12016);
            rule__MyModel__Group_2__2();

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
    // $ANTLR end "rule__MyModel__Group_2__1"


    // $ANTLR start "rule__MyModel__Group_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:968:1: rule__MyModel__Group_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) ;
    public final void rule__MyModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:972:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:973:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:973:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:974:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:975:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:975:2: rule__MyModel__MyModelContainsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl2043);
            rule__MyModel__MyModelContainsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_1()); 

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
    // $ANTLR end "rule__MyModel__Group_2__1__Impl"


    // $ANTLR start "rule__MyModel__Group_2__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:985:1: rule__MyModel__Group_2__2 : rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 ;
    public final void rule__MyModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:989:1: ( rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:990:2: rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__22073);
            rule__MyModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__22076);
            rule__MyModel__Group_2__3();

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
    // $ANTLR end "rule__MyModel__Group_2__2"


    // $ANTLR start "rule__MyModel__Group_2__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:997:1: rule__MyModel__Group_2__2__Impl : ( ( rule__MyModel__Group_2_2__0 )* ) ;
    public final void rule__MyModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1001:1: ( ( ( rule__MyModel__Group_2_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1002:1: ( ( rule__MyModel__Group_2_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1002:1: ( ( rule__MyModel__Group_2_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1003:1: ( rule__MyModel__Group_2_2__0 )*
            {
             before(grammarAccess.getMyModelAccess().getGroup_2_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1004:1: ( rule__MyModel__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1004:2: rule__MyModel__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl2103);
            	    rule__MyModel__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMyModelAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__MyModel__Group_2__2__Impl"


    // $ANTLR start "rule__MyModel__Group_2__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1014:1: rule__MyModel__Group_2__3 : rule__MyModel__Group_2__3__Impl ;
    public final void rule__MyModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1018:1: ( rule__MyModel__Group_2__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1019:2: rule__MyModel__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32134);
            rule__MyModel__Group_2__3__Impl();

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
    // $ANTLR end "rule__MyModel__Group_2__3"


    // $ANTLR start "rule__MyModel__Group_2__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1025:1: rule__MyModel__Group_2__3__Impl : ( '}' ) ;
    public final void rule__MyModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1029:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1030:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1030:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1031:1: '}'
            {
             before(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyModel__Group_2__3__Impl2162); 
             after(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__MyModel__Group_2__3__Impl"


    // $ANTLR start "rule__MyModel__Group_2_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1052:1: rule__MyModel__Group_2_2__0 : rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 ;
    public final void rule__MyModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1056:1: ( rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1057:2: rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02201);
            rule__MyModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02204);
            rule__MyModel__Group_2_2__1();

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
    // $ANTLR end "rule__MyModel__Group_2_2__0"


    // $ANTLR start "rule__MyModel__Group_2_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1064:1: rule__MyModel__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MyModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1068:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1069:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1069:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1070:1: ','
            {
             before(grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyModel__Group_2_2__0__Impl2232); 
             after(grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__MyModel__Group_2_2__0__Impl"


    // $ANTLR start "rule__MyModel__Group_2_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1083:1: rule__MyModel__Group_2_2__1 : rule__MyModel__Group_2_2__1__Impl ;
    public final void rule__MyModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1087:1: ( rule__MyModel__Group_2_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1088:2: rule__MyModel__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12263);
            rule__MyModel__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__MyModel__Group_2_2__1"


    // $ANTLR start "rule__MyModel__Group_2_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1094:1: rule__MyModel__Group_2_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) ;
    public final void rule__MyModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1098:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1099:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1099:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1100:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1101:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1101:2: rule__MyModel__MyModelContainsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2290);
            rule__MyModel__MyModelContainsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__MyModel__Group_2_2__1__Impl"


    // $ANTLR start "rule__MyObject__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1115:1: rule__MyObject__Group__0 : rule__MyObject__Group__0__Impl rule__MyObject__Group__1 ;
    public final void rule__MyObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1119:1: ( rule__MyObject__Group__0__Impl rule__MyObject__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1120:2: rule__MyObject__Group__0__Impl rule__MyObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02324);
            rule__MyObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02327);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1127:1: rule__MyObject__Group__0__Impl : ( () ) ;
    public final void rule__MyObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1131:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1132:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1132:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1133:1: ()
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1134:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1136:1: 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1146:1: rule__MyObject__Group__1 : rule__MyObject__Group__1__Impl rule__MyObject__Group__2 ;
    public final void rule__MyObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1150:1: ( rule__MyObject__Group__1__Impl rule__MyObject__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1151:2: rule__MyObject__Group__1__Impl rule__MyObject__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12385);
            rule__MyObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12388);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1158:1: rule__MyObject__Group__1__Impl : ( ( rule__MyObject__NameAssignment_1 ) ) ;
    public final void rule__MyObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1162:1: ( ( ( rule__MyObject__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1163:1: ( ( rule__MyObject__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1163:1: ( ( rule__MyObject__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1164:1: ( rule__MyObject__NameAssignment_1 )
            {
             before(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1165:1: ( rule__MyObject__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1165:2: rule__MyObject__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2415);
            rule__MyObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1175:1: rule__MyObject__Group__2 : rule__MyObject__Group__2__Impl rule__MyObject__Group__3 ;
    public final void rule__MyObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1179:1: ( rule__MyObject__Group__2__Impl rule__MyObject__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1180:2: rule__MyObject__Group__2__Impl rule__MyObject__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22445);
            rule__MyObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22448);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1187:1: rule__MyObject__Group__2__Impl : ( '{' ) ;
    public final void rule__MyObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1191:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1192:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1192:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1193:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group__2__Impl2476); 
             after(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1206:1: rule__MyObject__Group__3 : rule__MyObject__Group__3__Impl rule__MyObject__Group__4 ;
    public final void rule__MyObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1210:1: ( rule__MyObject__Group__3__Impl rule__MyObject__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1211:2: rule__MyObject__Group__3__Impl rule__MyObject__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32507);
            rule__MyObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32510);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1218:1: rule__MyObject__Group__3__Impl : ( ( rule__MyObject__Group_3__0 )? ) ;
    public final void rule__MyObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1222:1: ( ( ( rule__MyObject__Group_3__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1223:1: ( ( rule__MyObject__Group_3__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1223:1: ( ( rule__MyObject__Group_3__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1224:1: ( rule__MyObject__Group_3__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1225:1: ( rule__MyObject__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1225:2: rule__MyObject__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2537);
                    rule__MyObject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMyObjectAccess().getGroup_3()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1235:1: rule__MyObject__Group__4 : rule__MyObject__Group__4__Impl rule__MyObject__Group__5 ;
    public final void rule__MyObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1239:1: ( rule__MyObject__Group__4__Impl rule__MyObject__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1240:2: rule__MyObject__Group__4__Impl rule__MyObject__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42568);
            rule__MyObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42571);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1247:1: rule__MyObject__Group__4__Impl : ( ( rule__MyObject__Group_4__0 )? ) ;
    public final void rule__MyObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1251:1: ( ( ( rule__MyObject__Group_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1252:1: ( ( rule__MyObject__Group_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1252:1: ( ( rule__MyObject__Group_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1253:1: ( rule__MyObject__Group_4__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1254:1: ( rule__MyObject__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1254:2: rule__MyObject__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2598);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1264:1: rule__MyObject__Group__5 : rule__MyObject__Group__5__Impl ;
    public final void rule__MyObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1268:1: ( rule__MyObject__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1269:2: rule__MyObject__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52629);
            rule__MyObject__Group__5__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1275:1: rule__MyObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MyObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1279:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1280:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1280:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1281:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group__5__Impl2657); 
             after(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__MyObject__Group_3__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1306:1: rule__MyObject__Group_3__0 : rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 ;
    public final void rule__MyObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1310:1: ( rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1311:2: rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02700);
            rule__MyObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02703);
            rule__MyObject__Group_3__1();

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
    // $ANTLR end "rule__MyObject__Group_3__0"


    // $ANTLR start "rule__MyObject__Group_3__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1318:1: rule__MyObject__Group_3__0__Impl : ( 'has' ) ;
    public final void rule__MyObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1322:1: ( ( 'has' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1323:1: ( 'has' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1323:1: ( 'has' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1324:1: 'has'
            {
             before(grammarAccess.getMyObjectAccess().getHasKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MyObject__Group_3__0__Impl2731); 
             after(grammarAccess.getMyObjectAccess().getHasKeyword_3_0()); 

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
    // $ANTLR end "rule__MyObject__Group_3__0__Impl"


    // $ANTLR start "rule__MyObject__Group_3__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1337:1: rule__MyObject__Group_3__1 : rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 ;
    public final void rule__MyObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1341:1: ( rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1342:2: rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12762);
            rule__MyObject__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12765);
            rule__MyObject__Group_3__2();

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
    // $ANTLR end "rule__MyObject__Group_3__1"


    // $ANTLR start "rule__MyObject__Group_3__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1349:1: rule__MyObject__Group_3__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) ;
    public final void rule__MyObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1353:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1354:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1354:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1355:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1356:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1356:2: rule__MyObject__MyAttributeContainsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2792);
            rule__MyObject__MyAttributeContainsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_1()); 

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
    // $ANTLR end "rule__MyObject__Group_3__1__Impl"


    // $ANTLR start "rule__MyObject__Group_3__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1366:1: rule__MyObject__Group_3__2 : rule__MyObject__Group_3__2__Impl ;
    public final void rule__MyObject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1370:1: ( rule__MyObject__Group_3__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1371:2: rule__MyObject__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22822);
            rule__MyObject__Group_3__2__Impl();

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
    // $ANTLR end "rule__MyObject__Group_3__2"


    // $ANTLR start "rule__MyObject__Group_3__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1377:1: rule__MyObject__Group_3__2__Impl : ( ( rule__MyObject__Group_3_2__0 )* ) ;
    public final void rule__MyObject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1381:1: ( ( ( rule__MyObject__Group_3_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1382:1: ( ( rule__MyObject__Group_3_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1382:1: ( ( rule__MyObject__Group_3_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1383:1: ( rule__MyObject__Group_3_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1384:1: ( rule__MyObject__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1384:2: rule__MyObject__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2849);
            	    rule__MyObject__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMyObjectAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__MyObject__Group_3__2__Impl"


    // $ANTLR start "rule__MyObject__Group_3_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1400:1: rule__MyObject__Group_3_2__0 : rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 ;
    public final void rule__MyObject__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1404:1: ( rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1405:2: rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02886);
            rule__MyObject__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02889);
            rule__MyObject__Group_3_2__1();

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
    // $ANTLR end "rule__MyObject__Group_3_2__0"


    // $ANTLR start "rule__MyObject__Group_3_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1412:1: rule__MyObject__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1416:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1417:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1417:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1418:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_3_2__0__Impl2917); 
             after(grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__MyObject__Group_3_2__0__Impl"


    // $ANTLR start "rule__MyObject__Group_3_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1431:1: rule__MyObject__Group_3_2__1 : rule__MyObject__Group_3_2__1__Impl ;
    public final void rule__MyObject__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1435:1: ( rule__MyObject__Group_3_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1436:2: rule__MyObject__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12948);
            rule__MyObject__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__MyObject__Group_3_2__1"


    // $ANTLR start "rule__MyObject__Group_3_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1442:1: rule__MyObject__Group_3_2__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) ;
    public final void rule__MyObject__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1446:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1447:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1447:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1448:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1449:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1449:2: rule__MyObject__MyAttributeContainsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2975);
            rule__MyObject__MyAttributeContainsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__MyObject__Group_3_2__1__Impl"


    // $ANTLR start "rule__MyObject__Group_4__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1463:1: rule__MyObject__Group_4__0 : rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 ;
    public final void rule__MyObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1467:1: ( rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1468:2: rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__03009);
            rule__MyObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__03012);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1475:1: rule__MyObject__Group_4__0__Impl : ( 'myAttributeContains' ) ;
    public final void rule__MyObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1479:1: ( ( 'myAttributeContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1480:1: ( 'myAttributeContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1480:1: ( 'myAttributeContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1481:1: 'myAttributeContains'
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_4_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyObject__Group_4__0__Impl3040); 
             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_4_0()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1494:1: rule__MyObject__Group_4__1 : rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 ;
    public final void rule__MyObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1498:1: ( rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1499:2: rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13071);
            rule__MyObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13074);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1506:1: rule__MyObject__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MyObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1510:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1511:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1511:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1512:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group_4__1__Impl3102); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1525:1: rule__MyObject__Group_4__2 : rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3 ;
    public final void rule__MyObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1529:1: ( rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1530:2: rule__MyObject__Group_4__2__Impl rule__MyObject__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23133);
            rule__MyObject__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__3_in_rule__MyObject__Group_4__23136);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1537:1: rule__MyObject__Group_4__2__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) ) ;
    public final void rule__MyObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1541:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1542:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1542:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1543:1: ( rule__MyObject__MyObjectHasAssignment_4_2 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1544:1: ( rule__MyObject__MyObjectHasAssignment_4_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1544:2: rule__MyObject__MyObjectHasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_in_rule__MyObject__Group_4__2__Impl3163);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1554:1: rule__MyObject__Group_4__3 : rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4 ;
    public final void rule__MyObject__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1558:1: ( rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1559:2: rule__MyObject__Group_4__3__Impl rule__MyObject__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__3__Impl_in_rule__MyObject__Group_4__33193);
            rule__MyObject__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__4_in_rule__MyObject__Group_4__33196);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1566:1: rule__MyObject__Group_4__3__Impl : ( ( rule__MyObject__Group_4_3__0 )* ) ;
    public final void rule__MyObject__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1570:1: ( ( ( rule__MyObject__Group_4_3__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1571:1: ( ( rule__MyObject__Group_4_3__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1571:1: ( ( rule__MyObject__Group_4_3__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1572:1: ( rule__MyObject__Group_4_3__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1573:1: ( rule__MyObject__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1573:2: rule__MyObject__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__0_in_rule__MyObject__Group_4__3__Impl3223);
            	    rule__MyObject__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1583:1: rule__MyObject__Group_4__4 : rule__MyObject__Group_4__4__Impl ;
    public final void rule__MyObject__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1587:1: ( rule__MyObject__Group_4__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1588:2: rule__MyObject__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__4__Impl_in_rule__MyObject__Group_4__43254);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1594:1: rule__MyObject__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MyObject__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1598:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1599:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1599:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1600:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group_4__4__Impl3282); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1623:1: rule__MyObject__Group_4_3__0 : rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1 ;
    public final void rule__MyObject__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1627:1: ( rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1628:2: rule__MyObject__Group_4_3__0__Impl rule__MyObject__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__0__Impl_in_rule__MyObject__Group_4_3__03323);
            rule__MyObject__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__1_in_rule__MyObject__Group_4_3__03326);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1635:1: rule__MyObject__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1639:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1640:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1640:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1641:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_4_3__0__Impl3354); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1654:1: rule__MyObject__Group_4_3__1 : rule__MyObject__Group_4_3__1__Impl ;
    public final void rule__MyObject__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1658:1: ( rule__MyObject__Group_4_3__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1659:2: rule__MyObject__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_3__1__Impl_in_rule__MyObject__Group_4_3__13385);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1665:1: rule__MyObject__Group_4_3__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) ) ;
    public final void rule__MyObject__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1669:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1670:1: ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1670:1: ( ( rule__MyObject__MyObjectHasAssignment_4_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1671:1: ( rule__MyObject__MyObjectHasAssignment_4_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1672:1: ( rule__MyObject__MyObjectHasAssignment_4_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1672:2: rule__MyObject__MyObjectHasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_3_1_in_rule__MyObject__Group_4_3__1__Impl3412);
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


    // $ANTLR start "rule__MyConstraint__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1686:1: rule__MyConstraint__Group__0 : rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 ;
    public final void rule__MyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1690:1: ( rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1691:2: rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03446);
            rule__MyConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03449);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1698:1: rule__MyConstraint__Group__0__Impl : ( 'myConstraint' ) ;
    public final void rule__MyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1702:1: ( ( 'myConstraint' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1703:1: ( 'myConstraint' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1703:1: ( 'myConstraint' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1704:1: 'myConstraint'
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MyConstraint__Group__0__Impl3477); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1717:1: rule__MyConstraint__Group__1 : rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 ;
    public final void rule__MyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1721:1: ( rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1722:2: rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13508);
            rule__MyConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13511);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1729:1: rule__MyConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__MyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1733:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1734:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1734:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1735:1: '{'
            {
             before(grammarAccess.getMyConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyConstraint__Group__1__Impl3539); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1748:1: rule__MyConstraint__Group__2 : rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 ;
    public final void rule__MyConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1752:1: ( rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1753:2: rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23570);
            rule__MyConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23573);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1760:1: rule__MyConstraint__Group__2__Impl : ( 'myConstraintContains' ) ;
    public final void rule__MyConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1764:1: ( ( 'myConstraintContains' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1765:1: ( 'myConstraintContains' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1765:1: ( 'myConstraintContains' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1766:1: 'myConstraintContains'
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MyConstraint__Group__2__Impl3601); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1779:1: rule__MyConstraint__Group__3 : rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4 ;
    public final void rule__MyConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1783:1: ( rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1784:2: rule__MyConstraint__Group__3__Impl rule__MyConstraint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33632);
            rule__MyConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__4_in_rule__MyConstraint__Group__33635);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1791:1: rule__MyConstraint__Group__3__Impl : ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) ;
    public final void rule__MyConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1798:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1798:2: rule__MyConstraint__MyConstraintContainsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl3662);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1808:1: rule__MyConstraint__Group__4 : rule__MyConstraint__Group__4__Impl ;
    public final void rule__MyConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1812:1: ( rule__MyConstraint__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1813:2: rule__MyConstraint__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__4__Impl_in_rule__MyConstraint__Group__43692);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1819:1: rule__MyConstraint__Group__4__Impl : ( '}' ) ;
    public final void rule__MyConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1823:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1824:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1824:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1825:1: '}'
            {
             before(grammarAccess.getMyConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyConstraint__Group__4__Impl3720); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1848:1: rule__MyAttribute__Group__0 : rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 ;
    public final void rule__MyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1852:1: ( rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1853:2: rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03761);
            rule__MyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03764);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1860:1: rule__MyAttribute__Group__0__Impl : ( ( rule__MyAttribute__NameAssignment_0 ) ) ;
    public final void rule__MyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1864:1: ( ( ( rule__MyAttribute__NameAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1865:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1865:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1866:1: ( rule__MyAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMyAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1867:1: ( rule__MyAttribute__NameAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1867:2: rule__MyAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3791);
            rule__MyAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyAttributeAccess().getNameAssignment_0()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1877:1: rule__MyAttribute__Group__1 : rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 ;
    public final void rule__MyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1881:1: ( rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1882:2: rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13821);
            rule__MyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13824);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1889:1: rule__MyAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__MyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1893:1: ( ( '[' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1894:1: ( '[' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1894:1: ( '[' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1895:1: '['
            {
             before(grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyAttribute__Group__1__Impl3852); 
             after(grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1908:1: rule__MyAttribute__Group__2 : rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 ;
    public final void rule__MyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1912:1: ( rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1913:2: rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23883);
            rule__MyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23886);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1920:1: rule__MyAttribute__Group__2__Impl : ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) ;
    public final void rule__MyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:1: ( ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1925:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1925:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1926:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1927:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1927:2: rule__MyAttribute__MyAttributeContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3913);
            rule__MyAttribute__MyAttributeContainsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1937:1: rule__MyAttribute__Group__3 : rule__MyAttribute__Group__3__Impl ;
    public final void rule__MyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1941:1: ( rule__MyAttribute__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1942:2: rule__MyAttribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33943);
            rule__MyAttribute__Group__3__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1948:1: rule__MyAttribute__Group__3__Impl : ( ']' ) ;
    public final void rule__MyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1952:1: ( ( ']' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:1: ( ']' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:1: ( ']' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1954:1: ']'
            {
             before(grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MyAttribute__Group__3__Impl3971); 
             after(grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3()); 

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


    // $ANTLR start "rule__MyBinary__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1975:1: rule__MyBinary__Group__0 : rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 ;
    public final void rule__MyBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1979:1: ( rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1980:2: rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__04010);
            rule__MyBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__04013);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1987:1: rule__MyBinary__Group__0__Impl : ( 'myBinary' ) ;
    public final void rule__MyBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1991:1: ( ( 'myBinary' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1992:1: ( 'myBinary' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1992:1: ( 'myBinary' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1993:1: 'myBinary'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MyBinary__Group__0__Impl4041); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2006:1: rule__MyBinary__Group__1 : rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 ;
    public final void rule__MyBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2010:1: ( rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2011:2: rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__14072);
            rule__MyBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__14075);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2018:1: rule__MyBinary__Group__1__Impl : ( '{' ) ;
    public final void rule__MyBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2023:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2023:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2024:1: '{'
            {
             before(grammarAccess.getMyBinaryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyBinary__Group__1__Impl4103); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2037:1: rule__MyBinary__Group__2 : rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 ;
    public final void rule__MyBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2041:1: ( rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2042:2: rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__24134);
            rule__MyBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__24137);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2049:1: rule__MyBinary__Group__2__Impl : ( ( rule__MyBinary__Group_2__0 )? ) ;
    public final void rule__MyBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2053:1: ( ( ( rule__MyBinary__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2054:1: ( ( rule__MyBinary__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2054:1: ( ( rule__MyBinary__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2055:1: ( rule__MyBinary__Group_2__0 )?
            {
             before(grammarAccess.getMyBinaryAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2056:1: ( rule__MyBinary__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2056:2: rule__MyBinary__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__0_in_rule__MyBinary__Group__2__Impl4164);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2066:1: rule__MyBinary__Group__3 : rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 ;
    public final void rule__MyBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2070:1: ( rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2071:2: rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__34195);
            rule__MyBinary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__34198);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2078:1: rule__MyBinary__Group__3__Impl : ( 'myBinaryLeft' ) ;
    public final void rule__MyBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2082:1: ( ( 'myBinaryLeft' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2083:1: ( 'myBinaryLeft' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2083:1: ( 'myBinaryLeft' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2084:1: 'myBinaryLeft'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftKeyword_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MyBinary__Group__3__Impl4226); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2097:1: rule__MyBinary__Group__4 : rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5 ;
    public final void rule__MyBinary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2101:1: ( rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2102:2: rule__MyBinary__Group__4__Impl rule__MyBinary__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44257);
            rule__MyBinary__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__5_in_rule__MyBinary__Group__44260);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2109:1: rule__MyBinary__Group__4__Impl : ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) ) ;
    public final void rule__MyBinary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2113:1: ( ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2114:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2114:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2115:1: ( rule__MyBinary__MyBinaryLeftAssignment_4 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2116:1: ( rule__MyBinary__MyBinaryLeftAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2116:2: rule__MyBinary__MyBinaryLeftAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_4_in_rule__MyBinary__Group__4__Impl4287);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2126:1: rule__MyBinary__Group__5 : rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6 ;
    public final void rule__MyBinary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2130:1: ( rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2131:2: rule__MyBinary__Group__5__Impl rule__MyBinary__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__5__Impl_in_rule__MyBinary__Group__54317);
            rule__MyBinary__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__6_in_rule__MyBinary__Group__54320);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2138:1: rule__MyBinary__Group__5__Impl : ( 'myBinaryRight' ) ;
    public final void rule__MyBinary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2142:1: ( ( 'myBinaryRight' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2143:1: ( 'myBinaryRight' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2143:1: ( 'myBinaryRight' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2144:1: 'myBinaryRight'
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightKeyword_5()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MyBinary__Group__5__Impl4348); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2157:1: rule__MyBinary__Group__6 : rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7 ;
    public final void rule__MyBinary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2161:1: ( rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2162:2: rule__MyBinary__Group__6__Impl rule__MyBinary__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__6__Impl_in_rule__MyBinary__Group__64379);
            rule__MyBinary__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__7_in_rule__MyBinary__Group__64382);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2169:1: rule__MyBinary__Group__6__Impl : ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) ) ;
    public final void rule__MyBinary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2173:1: ( ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2174:1: ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2174:1: ( ( rule__MyBinary__MyBinaryRightAssignment_6 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2175:1: ( rule__MyBinary__MyBinaryRightAssignment_6 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_6()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2176:1: ( rule__MyBinary__MyBinaryRightAssignment_6 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2176:2: rule__MyBinary__MyBinaryRightAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryRightAssignment_6_in_rule__MyBinary__Group__6__Impl4409);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2186:1: rule__MyBinary__Group__7 : rule__MyBinary__Group__7__Impl ;
    public final void rule__MyBinary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2190:1: ( rule__MyBinary__Group__7__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2191:2: rule__MyBinary__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__7__Impl_in_rule__MyBinary__Group__74439);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2197:1: rule__MyBinary__Group__7__Impl : ( '}' ) ;
    public final void rule__MyBinary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2201:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2202:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2202:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2203:1: '}'
            {
             before(grammarAccess.getMyBinaryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyBinary__Group__7__Impl4467); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2232:1: rule__MyBinary__Group_2__0 : rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1 ;
    public final void rule__MyBinary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2236:1: ( rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2237:2: rule__MyBinary__Group_2__0__Impl rule__MyBinary__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__0__Impl_in_rule__MyBinary__Group_2__04514);
            rule__MyBinary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__1_in_rule__MyBinary__Group_2__04517);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2244:1: rule__MyBinary__Group_2__0__Impl : ( 'Oparand' ) ;
    public final void rule__MyBinary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2248:1: ( ( 'Oparand' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2249:1: ( 'Oparand' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2249:1: ( 'Oparand' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2250:1: 'Oparand'
            {
             before(grammarAccess.getMyBinaryAccess().getOparandKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MyBinary__Group_2__0__Impl4545); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2263:1: rule__MyBinary__Group_2__1 : rule__MyBinary__Group_2__1__Impl ;
    public final void rule__MyBinary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2267:1: ( rule__MyBinary__Group_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2268:2: rule__MyBinary__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group_2__1__Impl_in_rule__MyBinary__Group_2__14576);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2274:1: rule__MyBinary__Group_2__1__Impl : ( ( rule__MyBinary__OparandAssignment_2_1 ) ) ;
    public final void rule__MyBinary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2278:1: ( ( ( rule__MyBinary__OparandAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2279:1: ( ( rule__MyBinary__OparandAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2279:1: ( ( rule__MyBinary__OparandAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2280:1: ( rule__MyBinary__OparandAssignment_2_1 )
            {
             before(grammarAccess.getMyBinaryAccess().getOparandAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2281:1: ( rule__MyBinary__OparandAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2281:2: rule__MyBinary__OparandAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__OparandAssignment_2_1_in_rule__MyBinary__Group_2__1__Impl4603);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2295:1: rule__MyUnary__Group__0 : rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 ;
    public final void rule__MyUnary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2299:1: ( rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2300:2: rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04637);
            rule__MyUnary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04640);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2307:1: rule__MyUnary__Group__0__Impl : ( 'myUnary' ) ;
    public final void rule__MyUnary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2311:1: ( ( 'myUnary' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2312:1: ( 'myUnary' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2312:1: ( 'myUnary' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2313:1: 'myUnary'
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MyUnary__Group__0__Impl4668); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2326:1: rule__MyUnary__Group__1 : rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 ;
    public final void rule__MyUnary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2330:1: ( rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2331:2: rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14699);
            rule__MyUnary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__14702);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2338:1: rule__MyUnary__Group__1__Impl : ( '{' ) ;
    public final void rule__MyUnary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2342:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2343:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2343:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2344:1: '{'
            {
             before(grammarAccess.getMyUnaryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyUnary__Group__1__Impl4730); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2357:1: rule__MyUnary__Group__2 : rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3 ;
    public final void rule__MyUnary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2361:1: ( rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2362:2: rule__MyUnary__Group__2__Impl rule__MyUnary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24761);
            rule__MyUnary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__3_in_rule__MyUnary__Group__24764);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2369:1: rule__MyUnary__Group__2__Impl : ( ( rule__MyUnary__Group_2__0 )? ) ;
    public final void rule__MyUnary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2373:1: ( ( ( rule__MyUnary__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2374:1: ( ( rule__MyUnary__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2374:1: ( ( rule__MyUnary__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2375:1: ( rule__MyUnary__Group_2__0 )?
            {
             before(grammarAccess.getMyUnaryAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2376:1: ( rule__MyUnary__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2376:2: rule__MyUnary__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__0_in_rule__MyUnary__Group__2__Impl4791);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2386:1: rule__MyUnary__Group__3 : rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4 ;
    public final void rule__MyUnary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2390:1: ( rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2391:2: rule__MyUnary__Group__3__Impl rule__MyUnary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__3__Impl_in_rule__MyUnary__Group__34822);
            rule__MyUnary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__4_in_rule__MyUnary__Group__34825);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2398:1: rule__MyUnary__Group__3__Impl : ( 'myUnaryExpression' ) ;
    public final void rule__MyUnary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2402:1: ( ( 'myUnaryExpression' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2403:1: ( 'myUnaryExpression' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2403:1: ( 'myUnaryExpression' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2404:1: 'myUnaryExpression'
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MyUnary__Group__3__Impl4853); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2417:1: rule__MyUnary__Group__4 : rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5 ;
    public final void rule__MyUnary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2421:1: ( rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2422:2: rule__MyUnary__Group__4__Impl rule__MyUnary__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__4__Impl_in_rule__MyUnary__Group__44884);
            rule__MyUnary__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__5_in_rule__MyUnary__Group__44887);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2429:1: rule__MyUnary__Group__4__Impl : ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) ) ;
    public final void rule__MyUnary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2433:1: ( ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2434:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2434:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2435:1: ( rule__MyUnary__MyUnaryExpressionAssignment_4 )
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2436:1: ( rule__MyUnary__MyUnaryExpressionAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2436:2: rule__MyUnary__MyUnaryExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_4_in_rule__MyUnary__Group__4__Impl4914);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2446:1: rule__MyUnary__Group__5 : rule__MyUnary__Group__5__Impl ;
    public final void rule__MyUnary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2450:1: ( rule__MyUnary__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2451:2: rule__MyUnary__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__5__Impl_in_rule__MyUnary__Group__54944);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2457:1: rule__MyUnary__Group__5__Impl : ( '}' ) ;
    public final void rule__MyUnary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2461:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2462:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2462:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2463:1: '}'
            {
             before(grammarAccess.getMyUnaryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyUnary__Group__5__Impl4972); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2488:1: rule__MyUnary__Group_2__0 : rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1 ;
    public final void rule__MyUnary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2492:1: ( rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2493:2: rule__MyUnary__Group_2__0__Impl rule__MyUnary__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__0__Impl_in_rule__MyUnary__Group_2__05015);
            rule__MyUnary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__1_in_rule__MyUnary__Group_2__05018);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2500:1: rule__MyUnary__Group_2__0__Impl : ( 'Oparand' ) ;
    public final void rule__MyUnary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2504:1: ( ( 'Oparand' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2505:1: ( 'Oparand' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2505:1: ( 'Oparand' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2506:1: 'Oparand'
            {
             before(grammarAccess.getMyUnaryAccess().getOparandKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MyUnary__Group_2__0__Impl5046); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2519:1: rule__MyUnary__Group_2__1 : rule__MyUnary__Group_2__1__Impl ;
    public final void rule__MyUnary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2523:1: ( rule__MyUnary__Group_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2524:2: rule__MyUnary__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group_2__1__Impl_in_rule__MyUnary__Group_2__15077);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2530:1: rule__MyUnary__Group_2__1__Impl : ( ( rule__MyUnary__OparandAssignment_2_1 ) ) ;
    public final void rule__MyUnary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2534:1: ( ( ( rule__MyUnary__OparandAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2535:1: ( ( rule__MyUnary__OparandAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2535:1: ( ( rule__MyUnary__OparandAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2536:1: ( rule__MyUnary__OparandAssignment_2_1 )
            {
             before(grammarAccess.getMyUnaryAccess().getOparandAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2537:1: ( rule__MyUnary__OparandAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2537:2: rule__MyUnary__OparandAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__OparandAssignment_2_1_in_rule__MyUnary__Group_2__1__Impl5104);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2551:1: rule__MyString__Group__0 : rule__MyString__Group__0__Impl rule__MyString__Group__1 ;
    public final void rule__MyString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2555:1: ( rule__MyString__Group__0__Impl rule__MyString__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2556:2: rule__MyString__Group__0__Impl rule__MyString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__0__Impl_in_rule__MyString__Group__05138);
            rule__MyString__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__1_in_rule__MyString__Group__05141);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2563:1: rule__MyString__Group__0__Impl : ( 'myString' ) ;
    public final void rule__MyString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2567:1: ( ( 'myString' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2568:1: ( 'myString' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2568:1: ( 'myString' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2569:1: 'myString'
            {
             before(grammarAccess.getMyStringAccess().getMyStringKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MyString__Group__0__Impl5169); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2582:1: rule__MyString__Group__1 : rule__MyString__Group__1__Impl rule__MyString__Group__2 ;
    public final void rule__MyString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2586:1: ( rule__MyString__Group__1__Impl rule__MyString__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2587:2: rule__MyString__Group__1__Impl rule__MyString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__1__Impl_in_rule__MyString__Group__15200);
            rule__MyString__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__2_in_rule__MyString__Group__15203);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2594:1: rule__MyString__Group__1__Impl : ( '{' ) ;
    public final void rule__MyString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2598:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2599:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2599:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2600:1: '{'
            {
             before(grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyString__Group__1__Impl5231); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2613:1: rule__MyString__Group__2 : rule__MyString__Group__2__Impl rule__MyString__Group__3 ;
    public final void rule__MyString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2617:1: ( rule__MyString__Group__2__Impl rule__MyString__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2618:2: rule__MyString__Group__2__Impl rule__MyString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__2__Impl_in_rule__MyString__Group__25262);
            rule__MyString__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__3_in_rule__MyString__Group__25265);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2625:1: rule__MyString__Group__2__Impl : ( 'value' ) ;
    public final void rule__MyString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2629:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2630:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2630:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2631:1: 'value'
            {
             before(grammarAccess.getMyStringAccess().getValueKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MyString__Group__2__Impl5293); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2644:1: rule__MyString__Group__3 : rule__MyString__Group__3__Impl rule__MyString__Group__4 ;
    public final void rule__MyString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2648:1: ( rule__MyString__Group__3__Impl rule__MyString__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2649:2: rule__MyString__Group__3__Impl rule__MyString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__3__Impl_in_rule__MyString__Group__35324);
            rule__MyString__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__4_in_rule__MyString__Group__35327);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2656:1: rule__MyString__Group__3__Impl : ( ( rule__MyString__ValueAssignment_3 ) ) ;
    public final void rule__MyString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2660:1: ( ( ( rule__MyString__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2661:1: ( ( rule__MyString__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2661:1: ( ( rule__MyString__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2662:1: ( rule__MyString__ValueAssignment_3 )
            {
             before(grammarAccess.getMyStringAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2663:1: ( rule__MyString__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2663:2: rule__MyString__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__ValueAssignment_3_in_rule__MyString__Group__3__Impl5354);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:1: rule__MyString__Group__4 : rule__MyString__Group__4__Impl ;
    public final void rule__MyString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2677:1: ( rule__MyString__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2678:2: rule__MyString__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__Group__4__Impl_in_rule__MyString__Group__45384);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2684:1: rule__MyString__Group__4__Impl : ( '}' ) ;
    public final void rule__MyString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2688:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2689:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2689:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2690:1: '}'
            {
             before(grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyString__Group__4__Impl5412); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2713:1: rule__MyInt__Group__0 : rule__MyInt__Group__0__Impl rule__MyInt__Group__1 ;
    public final void rule__MyInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2717:1: ( rule__MyInt__Group__0__Impl rule__MyInt__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2718:2: rule__MyInt__Group__0__Impl rule__MyInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__0__Impl_in_rule__MyInt__Group__05453);
            rule__MyInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__1_in_rule__MyInt__Group__05456);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2725:1: rule__MyInt__Group__0__Impl : ( 'myInt' ) ;
    public final void rule__MyInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2729:1: ( ( 'myInt' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2730:1: ( 'myInt' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2730:1: ( 'myInt' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2731:1: 'myInt'
            {
             before(grammarAccess.getMyIntAccess().getMyIntKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MyInt__Group__0__Impl5484); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2744:1: rule__MyInt__Group__1 : rule__MyInt__Group__1__Impl rule__MyInt__Group__2 ;
    public final void rule__MyInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2748:1: ( rule__MyInt__Group__1__Impl rule__MyInt__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2749:2: rule__MyInt__Group__1__Impl rule__MyInt__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__1__Impl_in_rule__MyInt__Group__15515);
            rule__MyInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__2_in_rule__MyInt__Group__15518);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2756:1: rule__MyInt__Group__1__Impl : ( '{' ) ;
    public final void rule__MyInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2760:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2761:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2761:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2762:1: '{'
            {
             before(grammarAccess.getMyIntAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyInt__Group__1__Impl5546); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2775:1: rule__MyInt__Group__2 : rule__MyInt__Group__2__Impl rule__MyInt__Group__3 ;
    public final void rule__MyInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2779:1: ( rule__MyInt__Group__2__Impl rule__MyInt__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2780:2: rule__MyInt__Group__2__Impl rule__MyInt__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__2__Impl_in_rule__MyInt__Group__25577);
            rule__MyInt__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__3_in_rule__MyInt__Group__25580);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2787:1: rule__MyInt__Group__2__Impl : ( 'value' ) ;
    public final void rule__MyInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2791:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2792:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2792:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2793:1: 'value'
            {
             before(grammarAccess.getMyIntAccess().getValueKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MyInt__Group__2__Impl5608); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2806:1: rule__MyInt__Group__3 : rule__MyInt__Group__3__Impl rule__MyInt__Group__4 ;
    public final void rule__MyInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2810:1: ( rule__MyInt__Group__3__Impl rule__MyInt__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2811:2: rule__MyInt__Group__3__Impl rule__MyInt__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__3__Impl_in_rule__MyInt__Group__35639);
            rule__MyInt__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__4_in_rule__MyInt__Group__35642);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2818:1: rule__MyInt__Group__3__Impl : ( ( rule__MyInt__ValueAssignment_3 ) ) ;
    public final void rule__MyInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2822:1: ( ( ( rule__MyInt__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2823:1: ( ( rule__MyInt__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2823:1: ( ( rule__MyInt__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2824:1: ( rule__MyInt__ValueAssignment_3 )
            {
             before(grammarAccess.getMyIntAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2825:1: ( rule__MyInt__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2825:2: rule__MyInt__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__ValueAssignment_3_in_rule__MyInt__Group__3__Impl5669);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2835:1: rule__MyInt__Group__4 : rule__MyInt__Group__4__Impl ;
    public final void rule__MyInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2839:1: ( rule__MyInt__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2840:2: rule__MyInt__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__Group__4__Impl_in_rule__MyInt__Group__45699);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2846:1: rule__MyInt__Group__4__Impl : ( '}' ) ;
    public final void rule__MyInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2850:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2851:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2851:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2852:1: '}'
            {
             before(grammarAccess.getMyIntAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyInt__Group__4__Impl5727); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2875:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2879:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2880:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__05768);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__05771);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2887:1: rule__BoolLiteral__Group__0__Impl : ( 'BoolLiteral' ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2891:1: ( ( 'BoolLiteral' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2892:1: ( 'BoolLiteral' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2892:1: ( 'BoolLiteral' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2893:1: 'BoolLiteral'
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__BoolLiteral__Group__0__Impl5799); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2906:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2 ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2910:1: ( rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2911:2: rule__BoolLiteral__Group__1__Impl rule__BoolLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__15830);
            rule__BoolLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__2_in_rule__BoolLiteral__Group__15833);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2918:1: rule__BoolLiteral__Group__1__Impl : ( '{' ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2922:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2923:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2923:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2924:1: '{'
            {
             before(grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__BoolLiteral__Group__1__Impl5861); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2937:1: rule__BoolLiteral__Group__2 : rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3 ;
    public final void rule__BoolLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2941:1: ( rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2942:2: rule__BoolLiteral__Group__2__Impl rule__BoolLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__2__Impl_in_rule__BoolLiteral__Group__25892);
            rule__BoolLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__3_in_rule__BoolLiteral__Group__25895);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2949:1: rule__BoolLiteral__Group__2__Impl : ( 'value' ) ;
    public final void rule__BoolLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2953:1: ( ( 'value' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2954:1: ( 'value' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2954:1: ( 'value' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2955:1: 'value'
            {
             before(grammarAccess.getBoolLiteralAccess().getValueKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__BoolLiteral__Group__2__Impl5923); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2968:1: rule__BoolLiteral__Group__3 : rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4 ;
    public final void rule__BoolLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2972:1: ( rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2973:2: rule__BoolLiteral__Group__3__Impl rule__BoolLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__3__Impl_in_rule__BoolLiteral__Group__35954);
            rule__BoolLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__4_in_rule__BoolLiteral__Group__35957);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2980:1: rule__BoolLiteral__Group__3__Impl : ( ( rule__BoolLiteral__ValueAssignment_3 ) ) ;
    public final void rule__BoolLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2984:1: ( ( ( rule__BoolLiteral__ValueAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2985:1: ( ( rule__BoolLiteral__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2985:1: ( ( rule__BoolLiteral__ValueAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2986:1: ( rule__BoolLiteral__ValueAssignment_3 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2987:1: ( rule__BoolLiteral__ValueAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2987:2: rule__BoolLiteral__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__ValueAssignment_3_in_rule__BoolLiteral__Group__3__Impl5984);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2997:1: rule__BoolLiteral__Group__4 : rule__BoolLiteral__Group__4__Impl ;
    public final void rule__BoolLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3001:1: ( rule__BoolLiteral__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3002:2: rule__BoolLiteral__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__Group__4__Impl_in_rule__BoolLiteral__Group__46014);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3008:1: rule__BoolLiteral__Group__4__Impl : ( '}' ) ;
    public final void rule__BoolLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3012:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3013:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3013:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3014:1: '}'
            {
             before(grammarAccess.getBoolLiteralAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BoolLiteral__Group__4__Impl6042); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3037:1: rule__MyIdentifier__Group__0 : rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 ;
    public final void rule__MyIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3041:1: ( rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3042:2: rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__06083);
            rule__MyIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__06086);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3049:1: rule__MyIdentifier__Group__0__Impl : ( 'myIdentifier' ) ;
    public final void rule__MyIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3053:1: ( ( 'myIdentifier' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3054:1: ( 'myIdentifier' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3054:1: ( 'myIdentifier' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3055:1: 'myIdentifier'
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIdentifierKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MyIdentifier__Group__0__Impl6114); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3068:1: rule__MyIdentifier__Group__1 : rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2 ;
    public final void rule__MyIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3072:1: ( rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3073:2: rule__MyIdentifier__Group__1__Impl rule__MyIdentifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__16145);
            rule__MyIdentifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__2_in_rule__MyIdentifier__Group__16148);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3080:1: rule__MyIdentifier__Group__1__Impl : ( '{' ) ;
    public final void rule__MyIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3084:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3085:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3085:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3086:1: '{'
            {
             before(grammarAccess.getMyIdentifierAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyIdentifier__Group__1__Impl6176); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3099:1: rule__MyIdentifier__Group__2 : rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3 ;
    public final void rule__MyIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3103:1: ( rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3104:2: rule__MyIdentifier__Group__2__Impl rule__MyIdentifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__2__Impl_in_rule__MyIdentifier__Group__26207);
            rule__MyIdentifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__3_in_rule__MyIdentifier__Group__26210);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3111:1: rule__MyIdentifier__Group__2__Impl : ( 'myIntentifierIs' ) ;
    public final void rule__MyIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3115:1: ( ( 'myIntentifierIs' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3116:1: ( 'myIntentifierIs' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3116:1: ( 'myIntentifierIs' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3117:1: 'myIntentifierIs'
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__MyIdentifier__Group__2__Impl6238); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3130:1: rule__MyIdentifier__Group__3 : rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4 ;
    public final void rule__MyIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3134:1: ( rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3135:2: rule__MyIdentifier__Group__3__Impl rule__MyIdentifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__3__Impl_in_rule__MyIdentifier__Group__36269);
            rule__MyIdentifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__4_in_rule__MyIdentifier__Group__36272);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3142:1: rule__MyIdentifier__Group__3__Impl : ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) ) ;
    public final void rule__MyIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3146:1: ( ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3147:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3147:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3148:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_3 )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3149:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3149:2: rule__MyIdentifier__MyIntentifierIsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_3_in_rule__MyIdentifier__Group__3__Impl6299);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3159:1: rule__MyIdentifier__Group__4 : rule__MyIdentifier__Group__4__Impl ;
    public final void rule__MyIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3163:1: ( rule__MyIdentifier__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3164:2: rule__MyIdentifier__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__4__Impl_in_rule__MyIdentifier__Group__46329);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3170:1: rule__MyIdentifier__Group__4__Impl : ( '}' ) ;
    public final void rule__MyIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3174:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3175:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3175:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3176:1: '}'
            {
             before(grammarAccess.getMyIdentifierAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyIdentifier__Group__4__Impl6357); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3199:1: rule__MyEnum__Group__0 : rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 ;
    public final void rule__MyEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3203:1: ( rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3204:2: rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__06398);
            rule__MyEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__06401);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3211:1: rule__MyEnum__Group__0__Impl : ( ( rule__MyEnum__ValuesAssignment_0 ) ) ;
    public final void rule__MyEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3215:1: ( ( ( rule__MyEnum__ValuesAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3216:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3216:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3217:1: ( rule__MyEnum__ValuesAssignment_0 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3218:1: ( rule__MyEnum__ValuesAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3218:2: rule__MyEnum__ValuesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl6428);
            rule__MyEnum__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyEnumAccess().getValuesAssignment_0()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3228:1: rule__MyEnum__Group__1 : rule__MyEnum__Group__1__Impl ;
    public final void rule__MyEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3232:1: ( rule__MyEnum__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3233:2: rule__MyEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__16458);
            rule__MyEnum__Group__1__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3239:1: rule__MyEnum__Group__1__Impl : ( ( rule__MyEnum__Group_1__0 )* ) ;
    public final void rule__MyEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3243:1: ( ( ( rule__MyEnum__Group_1__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3244:1: ( ( rule__MyEnum__Group_1__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3244:1: ( ( rule__MyEnum__Group_1__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3245:1: ( rule__MyEnum__Group_1__0 )*
            {
             before(grammarAccess.getMyEnumAccess().getGroup_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3246:1: ( rule__MyEnum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3246:2: rule__MyEnum__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl6485);
            	    rule__MyEnum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMyEnumAccess().getGroup_1()); 

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


    // $ANTLR start "rule__MyEnum__Group_1__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3260:1: rule__MyEnum__Group_1__0 : rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 ;
    public final void rule__MyEnum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3264:1: ( rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3265:2: rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__06520);
            rule__MyEnum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__06523);
            rule__MyEnum__Group_1__1();

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
    // $ANTLR end "rule__MyEnum__Group_1__0"


    // $ANTLR start "rule__MyEnum__Group_1__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3272:1: rule__MyEnum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MyEnum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3276:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3277:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3277:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3278:1: ','
            {
             before(grammarAccess.getMyEnumAccess().getCommaKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyEnum__Group_1__0__Impl6551); 
             after(grammarAccess.getMyEnumAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__MyEnum__Group_1__0__Impl"


    // $ANTLR start "rule__MyEnum__Group_1__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3291:1: rule__MyEnum__Group_1__1 : rule__MyEnum__Group_1__1__Impl ;
    public final void rule__MyEnum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3295:1: ( rule__MyEnum__Group_1__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3296:2: rule__MyEnum__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__16582);
            rule__MyEnum__Group_1__1__Impl();

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
    // $ANTLR end "rule__MyEnum__Group_1__1"


    // $ANTLR start "rule__MyEnum__Group_1__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3302:1: rule__MyEnum__Group_1__1__Impl : ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) ;
    public final void rule__MyEnum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3306:1: ( ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3307:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3307:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3308:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_1_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3309:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3309:2: rule__MyEnum__ValuesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl6609);
            rule__MyEnum__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMyEnumAccess().getValuesAssignment_1_1()); 

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
    // $ANTLR end "rule__MyEnum__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3323:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3327:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3328:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__06643);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__06646);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3335:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3339:1: ( ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3340:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3340:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3341:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3342:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3342:2: rule__BooleanValue__TrueValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl6673);
            rule__BooleanValue__TrueValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_0()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3352:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3356:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3357:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__16703);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__16706);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3364:1: rule__BooleanValue__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3368:1: ( ( ':' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3369:1: ( ':' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3369:1: ( ':' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3370:1: ':'
            {
             before(grammarAccess.getBooleanValueAccess().getColonKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__BooleanValue__Group__1__Impl6734); 
             after(grammarAccess.getBooleanValueAccess().getColonKeyword_1()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3383:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3387:1: ( rule__BooleanValue__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3388:2: rule__BooleanValue__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__26765);
            rule__BooleanValue__Group__2__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3394:1: rule__BooleanValue__Group__2__Impl : ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3398:1: ( ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3399:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3399:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3400:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3401:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3401:2: rule__BooleanValue__FalseValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl6792);
            rule__BooleanValue__FalseValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_2()); 

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


    // $ANTLR start "rule__MyRange__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3417:1: rule__MyRange__Group__0 : rule__MyRange__Group__0__Impl rule__MyRange__Group__1 ;
    public final void rule__MyRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3421:1: ( rule__MyRange__Group__0__Impl rule__MyRange__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3422:2: rule__MyRange__Group__0__Impl rule__MyRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__06828);
            rule__MyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__06831);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3429:1: rule__MyRange__Group__0__Impl : ( ( rule__MyRange__RangeAssignment_0 ) ) ;
    public final void rule__MyRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3433:1: ( ( ( rule__MyRange__RangeAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3434:1: ( ( rule__MyRange__RangeAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3434:1: ( ( rule__MyRange__RangeAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3435:1: ( rule__MyRange__RangeAssignment_0 )
            {
             before(grammarAccess.getMyRangeAccess().getRangeAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3436:1: ( rule__MyRange__RangeAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3436:2: rule__MyRange__RangeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__RangeAssignment_0_in_rule__MyRange__Group__0__Impl6858);
            rule__MyRange__RangeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getRangeAssignment_0()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3446:1: rule__MyRange__Group__1 : rule__MyRange__Group__1__Impl rule__MyRange__Group__2 ;
    public final void rule__MyRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3450:1: ( rule__MyRange__Group__1__Impl rule__MyRange__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3451:2: rule__MyRange__Group__1__Impl rule__MyRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__16888);
            rule__MyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__16891);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3458:1: rule__MyRange__Group__1__Impl : ( '-' ) ;
    public final void rule__MyRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3462:1: ( ( '-' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3463:1: ( '-' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3463:1: ( '-' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3464:1: '-'
            {
             before(grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__MyRange__Group__1__Impl6919); 
             after(grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1()); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3477:1: rule__MyRange__Group__2 : rule__MyRange__Group__2__Impl ;
    public final void rule__MyRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3481:1: ( rule__MyRange__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3482:2: rule__MyRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__26950);
            rule__MyRange__Group__2__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3488:1: rule__MyRange__Group__2__Impl : ( ( rule__MyRange__RangeAssignment_2 ) ) ;
    public final void rule__MyRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3492:1: ( ( ( rule__MyRange__RangeAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3493:1: ( ( rule__MyRange__RangeAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3493:1: ( ( rule__MyRange__RangeAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3494:1: ( rule__MyRange__RangeAssignment_2 )
            {
             before(grammarAccess.getMyRangeAccess().getRangeAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3495:1: ( rule__MyRange__RangeAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3495:2: rule__MyRange__RangeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__RangeAssignment_2_in_rule__MyRange__Group__2__Impl6977);
            rule__MyRange__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getRangeAssignment_2()); 

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


    // $ANTLR start "rule__MyModel__NameAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3512:1: rule__MyModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3516:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3517:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3517:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3518:1: ruleEString
            {
             before(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_17018);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyModel__NameAssignment_1"


    // $ANTLR start "rule__MyModel__MyModelContainsAssignment_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3527:1: rule__MyModel__MyModelContainsAssignment_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3531:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3532:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3532:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3533:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_17049);
            rulemyObject();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MyModel__MyModelContainsAssignment_2_1"


    // $ANTLR start "rule__MyModel__MyModelContainsAssignment_2_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3542:1: rule__MyModel__MyModelContainsAssignment_2_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3546:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3547:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3547:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3548:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_17080);
            rulemyObject();

            state._fsp--;

             after(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__MyModel__MyModelContainsAssignment_2_2_1"


    // $ANTLR start "rule__MyObject__NameAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3557:1: rule__MyObject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3561:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3562:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3562:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3563:1: ruleEString
            {
             before(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_17111);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MyObject__NameAssignment_1"


    // $ANTLR start "rule__MyObject__MyAttributeContainsAssignment_3_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3572:1: rule__MyObject__MyAttributeContainsAssignment_3_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3576:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3577:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3577:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3578:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_17142);
            rulemyAttribute();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MyObject__MyAttributeContainsAssignment_3_1"


    // $ANTLR start "rule__MyObject__MyAttributeContainsAssignment_3_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3587:1: rule__MyObject__MyAttributeContainsAssignment_3_2_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3591:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3592:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3592:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3593:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_17173);
            rulemyAttribute();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__MyObject__MyAttributeContainsAssignment_3_2_1"


    // $ANTLR start "rule__MyObject__MyObjectHasAssignment_4_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3602:1: rule__MyObject__MyObjectHasAssignment_4_2 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3606:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3607:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3607:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3608:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_27204);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3617:1: rule__MyObject__MyObjectHasAssignment_4_3_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3621:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3622:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3622:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3623:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_3_17235);
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


    // $ANTLR start "rule__MyConstraint__MyConstraintContainsAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3632:1: rule__MyConstraint__MyConstraintContainsAssignment_3 : ( rulemyExpression ) ;
    public final void rule__MyConstraint__MyConstraintContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3636:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3637:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3637:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3638:1: rulemyExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_37266);
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


    // $ANTLR start "rule__MyAttribute__NameAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3647:1: rule__MyAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MyAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3651:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3652:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3652:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3653:1: ruleEString
            {
             before(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_07297);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MyAttribute__NameAssignment_0"


    // $ANTLR start "rule__MyAttribute__MyAttributeContainsAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3662:1: rule__MyAttribute__MyAttributeContainsAssignment_2 : ( rulemyValue ) ;
    public final void rule__MyAttribute__MyAttributeContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3666:1: ( ( rulemyValue ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3667:1: ( rulemyValue )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3667:1: ( rulemyValue )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3668:1: rulemyValue
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_27328);
            rulemyValue();

            state._fsp--;

             after(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MyAttribute__MyAttributeContainsAssignment_2"


    // $ANTLR start "rule__MyBinary__OparandAssignment_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3677:1: rule__MyBinary__OparandAssignment_2_1 : ( rulemyBinaryOparators ) ;
    public final void rule__MyBinary__OparandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3681:1: ( ( rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3682:1: ( rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3682:1: ( rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3683:1: rulemyBinaryOparators
            {
             before(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_2_17359);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3692:1: rule__MyBinary__MyBinaryLeftAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryLeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3696:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3697:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3697:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3698:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_47390);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3707:1: rule__MyBinary__MyBinaryRightAssignment_6 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryRightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3711:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3712:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3712:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3713:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_67421);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3722:1: rule__MyUnary__OparandAssignment_2_1 : ( rulemyUnaryOparators ) ;
    public final void rule__MyUnary__OparandAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3726:1: ( ( rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3727:1: ( rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3727:1: ( rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3728:1: rulemyUnaryOparators
            {
             before(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_2_17452);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3737:1: rule__MyUnary__MyUnaryExpressionAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyUnary__MyUnaryExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3741:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3742:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3742:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3743:1: rulemyExpression
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_47483);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3752:1: rule__MyString__ValueAssignment_3 : ( ruleAnyURI ) ;
    public final void rule__MyString__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3756:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3757:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3757:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3758:1: ruleAnyURI
            {
             before(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment_37514);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3767:1: rule__MyInt__ValueAssignment_3 : ( ruleInt0 ) ;
    public final void rule__MyInt__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3771:1: ( ( ruleInt0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3772:1: ( ruleInt0 )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3772:1: ( ruleInt0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3773:1: ruleInt0
            {
             before(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment_37545);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3782:1: rule__BoolLiteral__ValueAssignment_3 : ( ruleBoolean ) ;
    public final void rule__BoolLiteral__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3786:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3787:1: ( ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3787:1: ( ruleBoolean )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3788:1: ruleBoolean
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment_37576);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3797:1: rule__MyIdentifier__MyIntentifierIsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__MyIdentifier__MyIntentifierIsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3801:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3802:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3802:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3803:1: ( ruleEString )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_3_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3804:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3805:1: ruleEString
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_37611);
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


    // $ANTLR start "rule__MyEnum__ValuesAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3816:1: rule__MyEnum__ValuesAssignment_0 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3820:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3821:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3821:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3822:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_07646);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MyEnum__ValuesAssignment_0"


    // $ANTLR start "rule__MyEnum__ValuesAssignment_1_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3831:1: rule__MyEnum__ValuesAssignment_1_1 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3835:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3836:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3836:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3837:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_1_17677);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MyEnum__ValuesAssignment_1_1"


    // $ANTLR start "rule__BooleanValue__TrueValueAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3846:1: rule__BooleanValue__TrueValueAssignment_0 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__TrueValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3850:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3851:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3851:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3852:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_07708);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BooleanValue__TrueValueAssignment_0"


    // $ANTLR start "rule__BooleanValue__FalseValueAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3861:1: rule__BooleanValue__FalseValueAssignment_2 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__FalseValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3865:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3866:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3866:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3867:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_27739);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BooleanValue__FalseValueAssignment_2"


    // $ANTLR start "rule__MyRange__RangeAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3876:1: rule__MyRange__RangeAssignment_0 : ( ruleAnySimpleType ) ;
    public final void rule__MyRange__RangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3880:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3881:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3881:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3882:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_07770);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MyRange__RangeAssignment_0"


    // $ANTLR start "rule__MyRange__RangeAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3891:1: rule__MyRange__RangeAssignment_2 : ( ruleAnySimpleType ) ;
    public final void rule__MyRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3895:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3896:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3896:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3897:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_27801);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MyRange__RangeAssignment_2"

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
        public static final BitSet FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01766 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11827 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyModel__Group_2__0__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__12013 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__12016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__22073 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__22076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl2103 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyModel__Group_2__3__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyModel__Group_2_2__0__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02324 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12385 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22445 = new BitSet(new long[]{0x000000001A000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group__2__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32507 = new BitSet(new long[]{0x000000001A000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42568 = new BitSet(new long[]{0x000000001A000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group__5__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MyObject__Group_3__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12762 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2849 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_3_2__0__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__03009 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__03012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyObject__Group_4__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13071 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group_4__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23133 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__3_in_rule__MyObject__Group_4__23136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_in_rule__MyObject__Group_4__2__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__3__Impl_in_rule__MyObject__Group_4__33193 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__4_in_rule__MyObject__Group_4__33196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__0_in_rule__MyObject__Group_4__3__Impl3223 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__4__Impl_in_rule__MyObject__Group_4__43254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group_4__4__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__0__Impl_in_rule__MyObject__Group_4_3__03323 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__1_in_rule__MyObject__Group_4_3__03326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_4_3__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_3__1__Impl_in_rule__MyObject__Group_4_3__13385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_3_1_in_rule__MyObject__Group_4_3__1__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03446 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MyConstraint__Group__0__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13508 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyConstraint__Group__1__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23570 = new BitSet(new long[]{0x00000EA200000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MyConstraint__Group__2__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33632 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__4_in_rule__MyConstraint__Group__33635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__4__Impl_in_rule__MyConstraint__Group__43692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyConstraint__Group__4__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03761 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13821 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyAttribute__Group__1__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23883 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MyAttribute__Group__3__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__04010 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__04013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MyBinary__Group__0__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__14072 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__14075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyBinary__Group__1__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__24134 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__24137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__0_in_rule__MyBinary__Group__2__Impl4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__34195 = new BitSet(new long[]{0x00000EA200000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__34198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MyBinary__Group__3__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44257 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__5_in_rule__MyBinary__Group__44260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_4_in_rule__MyBinary__Group__4__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__5__Impl_in_rule__MyBinary__Group__54317 = new BitSet(new long[]{0x00000EA200000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__6_in_rule__MyBinary__Group__54320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MyBinary__Group__5__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__6__Impl_in_rule__MyBinary__Group__64379 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__7_in_rule__MyBinary__Group__64382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryRightAssignment_6_in_rule__MyBinary__Group__6__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__7__Impl_in_rule__MyBinary__Group__74439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyBinary__Group__7__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__0__Impl_in_rule__MyBinary__Group_2__04514 = new BitSet(new long[]{0x0000000000FF0000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__1_in_rule__MyBinary__Group_2__04517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MyBinary__Group_2__0__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group_2__1__Impl_in_rule__MyBinary__Group_2__14576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__OparandAssignment_2_1_in_rule__MyBinary__Group_2__1__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04637 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MyUnary__Group__0__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14699 = new BitSet(new long[]{0x0000005000000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__14702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyUnary__Group__1__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24761 = new BitSet(new long[]{0x0000005000000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__3_in_rule__MyUnary__Group__24764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__0_in_rule__MyUnary__Group__2__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__3__Impl_in_rule__MyUnary__Group__34822 = new BitSet(new long[]{0x00000EA200000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__4_in_rule__MyUnary__Group__34825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MyUnary__Group__3__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__4__Impl_in_rule__MyUnary__Group__44884 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__5_in_rule__MyUnary__Group__44887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_4_in_rule__MyUnary__Group__4__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__5__Impl_in_rule__MyUnary__Group__54944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyUnary__Group__5__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__0__Impl_in_rule__MyUnary__Group_2__05015 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__1_in_rule__MyUnary__Group_2__05018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MyUnary__Group_2__0__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group_2__1__Impl_in_rule__MyUnary__Group_2__15077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__OparandAssignment_2_1_in_rule__MyUnary__Group_2__1__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__0__Impl_in_rule__MyString__Group__05138 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__1_in_rule__MyString__Group__05141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MyString__Group__0__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__1__Impl_in_rule__MyString__Group__15200 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__2_in_rule__MyString__Group__15203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyString__Group__1__Impl5231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__2__Impl_in_rule__MyString__Group__25262 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__MyString__Group__3_in_rule__MyString__Group__25265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MyString__Group__2__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__3__Impl_in_rule__MyString__Group__35324 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyString__Group__4_in_rule__MyString__Group__35327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__ValueAssignment_3_in_rule__MyString__Group__3__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyString__Group__4__Impl_in_rule__MyString__Group__45384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyString__Group__4__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__0__Impl_in_rule__MyInt__Group__05453 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__1_in_rule__MyInt__Group__05456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MyInt__Group__0__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__1__Impl_in_rule__MyInt__Group__15515 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__2_in_rule__MyInt__Group__15518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyInt__Group__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__2__Impl_in_rule__MyInt__Group__25577 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__3_in_rule__MyInt__Group__25580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MyInt__Group__2__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__3__Impl_in_rule__MyInt__Group__35639 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyInt__Group__4_in_rule__MyInt__Group__35642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__ValueAssignment_3_in_rule__MyInt__Group__3__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__Group__4__Impl_in_rule__MyInt__Group__45699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyInt__Group__4__Impl5727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__05768 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__05771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__BoolLiteral__Group__0__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__15830 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__2_in_rule__BoolLiteral__Group__15833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BoolLiteral__Group__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__2__Impl_in_rule__BoolLiteral__Group__25892 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__3_in_rule__BoolLiteral__Group__25895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__BoolLiteral__Group__2__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__3__Impl_in_rule__BoolLiteral__Group__35954 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__4_in_rule__BoolLiteral__Group__35957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_3_in_rule__BoolLiteral__Group__3__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__Group__4__Impl_in_rule__BoolLiteral__Group__46014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BoolLiteral__Group__4__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__06083 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__06086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MyIdentifier__Group__0__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__16145 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__2_in_rule__MyIdentifier__Group__16148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyIdentifier__Group__1__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__2__Impl_in_rule__MyIdentifier__Group__26207 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__3_in_rule__MyIdentifier__Group__26210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__MyIdentifier__Group__2__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__3__Impl_in_rule__MyIdentifier__Group__36269 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__4_in_rule__MyIdentifier__Group__36272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_3_in_rule__MyIdentifier__Group__3__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__4__Impl_in_rule__MyIdentifier__Group__46329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyIdentifier__Group__4__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__06398 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__06401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__16458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl6485 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__06520 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__06523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyEnum__Group_1__0__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__16582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__06643 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__06646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__16703 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__16706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__BooleanValue__Group__1__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__26765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__06828 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__06831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__RangeAssignment_0_in_rule__MyRange__Group__0__Impl6858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__16888 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__16891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__MyRange__Group__1__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__26950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__RangeAssignment_2_in_rule__MyRange__Group__2__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_17018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_17049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_17080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_17111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_17142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_17173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_27204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_3_17235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_37266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_07297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_27328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_2_17359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_47390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_67421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_2_17452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_47483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment_37514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment_37545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment_37576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_37611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_07646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_1_17677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_07708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_27739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_07770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_27801 = new BitSet(new long[]{0x0000000000000002L});
    }


}