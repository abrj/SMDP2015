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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'E'", "'e'", "'&&'", "'|'", "'<'", "'>'", "'='", "'can'", "'if'", "'then'", "'{'", "'}'", "','", "'has'", "'Constrained by'", "'['", "']'", "'('", "')'", "':'", "'*'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRulemyValue"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:88:1: entryRulemyValue : rulemyValue EOF ;
    public final void entryRulemyValue() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:89:1: ( rulemyValue EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:90:1: rulemyValue EOF
            {
             before(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue121);
            rulemyValue();

            state._fsp--;

             after(grammarAccess.getMyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue128); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:97:1: rulemyValue : ( ( rule__MyValue__Alternatives ) ) ;
    public final void rulemyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:101:2: ( ( ( rule__MyValue__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:102:1: ( ( rule__MyValue__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:102:1: ( ( rule__MyValue__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:103:1: ( rule__MyValue__Alternatives )
            {
             before(grammarAccess.getMyValueAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:104:1: ( rule__MyValue__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:104:2: rule__MyValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyValue__Alternatives_in_rulemyValue154);
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


    // $ANTLR start "entryRulemyExpression"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:116:1: entryRulemyExpression : rulemyExpression EOF ;
    public final void entryRulemyExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:117:1: ( rulemyExpression EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:118:1: rulemyExpression EOF
            {
             before(grammarAccess.getMyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_entryRulemyExpression181);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyExpression188); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:125:1: rulemyExpression : ( ( rule__MyExpression__Alternatives ) ) ;
    public final void rulemyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:129:2: ( ( ( rule__MyExpression__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:130:1: ( ( rule__MyExpression__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:130:1: ( ( rule__MyExpression__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:131:1: ( rule__MyExpression__Alternatives )
            {
             before(grammarAccess.getMyExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:132:1: ( rule__MyExpression__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:132:2: rule__MyExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyExpression__Alternatives_in_rulemyExpression214);
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


    // $ANTLR start "entryRulemyConcreteExpression"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:256:1: entryRulemyConcreteExpression : rulemyConcreteExpression EOF ;
    public final void entryRulemyConcreteExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:257:1: ( rulemyConcreteExpression EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:258:1: rulemyConcreteExpression EOF
            {
             before(grammarAccess.getMyConcreteExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_entryRulemyConcreteExpression481);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyConcreteExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConcreteExpression488); 

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
    // $ANTLR end "entryRulemyConcreteExpression"


    // $ANTLR start "rulemyConcreteExpression"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:265:1: rulemyConcreteExpression : ( ( rule__MyConcreteExpression__MyConcreteExAssignment ) ) ;
    public final void rulemyConcreteExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:269:2: ( ( ( rule__MyConcreteExpression__MyConcreteExAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:270:1: ( ( rule__MyConcreteExpression__MyConcreteExAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:270:1: ( ( rule__MyConcreteExpression__MyConcreteExAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:271:1: ( rule__MyConcreteExpression__MyConcreteExAssignment )
            {
             before(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:272:1: ( rule__MyConcreteExpression__MyConcreteExAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:272:2: rule__MyConcreteExpression__MyConcreteExAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConcreteExpression__MyConcreteExAssignment_in_rulemyConcreteExpression514);
            rule__MyConcreteExpression__MyConcreteExAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyConcreteExpression"


    // $ANTLR start "entryRulemyBinary"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:284:1: entryRulemyBinary : rulemyBinary EOF ;
    public final void entryRulemyBinary() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:285:1: ( rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:286:1: rulemyBinary EOF
            {
             before(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary541);
            rulemyBinary();

            state._fsp--;

             after(grammarAccess.getMyBinaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary548); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:293:1: rulemyBinary : ( ( rule__MyBinary__Group__0 ) ) ;
    public final void rulemyBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:297:2: ( ( ( rule__MyBinary__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:298:1: ( ( rule__MyBinary__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:298:1: ( ( rule__MyBinary__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:299:1: ( rule__MyBinary__Group__0 )
            {
             before(grammarAccess.getMyBinaryAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:300:1: ( rule__MyBinary__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:300:2: rule__MyBinary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0_in_rulemyBinary574);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:312:1: entryRulemyUnary : rulemyUnary EOF ;
    public final void entryRulemyUnary() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:313:1: ( rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:314:1: rulemyUnary EOF
            {
             before(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary601);
            rulemyUnary();

            state._fsp--;

             after(grammarAccess.getMyUnaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary608); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:321:1: rulemyUnary : ( ( rule__MyUnary__Group__0 ) ) ;
    public final void rulemyUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:325:2: ( ( ( rule__MyUnary__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyUnary__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyUnary__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:327:1: ( rule__MyUnary__Group__0 )
            {
             before(grammarAccess.getMyUnaryAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:1: ( rule__MyUnary__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:2: rule__MyUnary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0_in_rulemyUnary634);
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


    // $ANTLR start "entryRulemyBoolean"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:340:1: entryRulemyBoolean : rulemyBoolean EOF ;
    public final void entryRulemyBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:341:1: ( rulemyBoolean EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:342:1: rulemyBoolean EOF
            {
             before(grammarAccess.getMyBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_entryRulemyBoolean661);
            rulemyBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBoolean668); 

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
    // $ANTLR end "entryRulemyBoolean"


    // $ANTLR start "rulemyBoolean"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:349:1: rulemyBoolean : ( ( rule__MyBoolean__Group__0 ) ) ;
    public final void rulemyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:353:2: ( ( ( rule__MyBoolean__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyBoolean__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyBoolean__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:355:1: ( rule__MyBoolean__Group__0 )
            {
             before(grammarAccess.getMyBooleanAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:1: ( rule__MyBoolean__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:2: rule__MyBoolean__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__0_in_rulemyBoolean694);
            rule__MyBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyBoolean"


    // $ANTLR start "entryRulemyIdentifier"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:368:1: entryRulemyIdentifier : rulemyIdentifier EOF ;
    public final void entryRulemyIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:369:1: ( rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:370:1: rulemyIdentifier EOF
            {
             before(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier721);
            rulemyIdentifier();

            state._fsp--;

             after(grammarAccess.getMyIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier728); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:377:1: rulemyIdentifier : ( ( rule__MyIdentifier__Group__0 ) ) ;
    public final void rulemyIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:381:2: ( ( ( rule__MyIdentifier__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__MyIdentifier__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__MyIdentifier__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:383:1: ( rule__MyIdentifier__Group__0 )
            {
             before(grammarAccess.getMyIdentifierAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:1: ( rule__MyIdentifier__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:2: rule__MyIdentifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__0_in_rulemyIdentifier754);
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


    // $ANTLR start "entryRulemyRange"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:396:1: entryRulemyRange : rulemyRange EOF ;
    public final void entryRulemyRange() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:397:1: ( rulemyRange EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:398:1: rulemyRange EOF
            {
             before(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange781);
            rulemyRange();

            state._fsp--;

             after(grammarAccess.getMyRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange788); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:405:1: rulemyRange : ( ( rule__MyRange__Group__0 ) ) ;
    public final void rulemyRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:409:2: ( ( ( rule__MyRange__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyRange__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyRange__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:411:1: ( rule__MyRange__Group__0 )
            {
             before(grammarAccess.getMyRangeAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:1: ( rule__MyRange__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:2: rule__MyRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0_in_rulemyRange814);
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


    // $ANTLR start "entryRulemyStringEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:424:1: entryRulemyStringEnum : rulemyStringEnum EOF ;
    public final void entryRulemyStringEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:425:1: ( rulemyStringEnum EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:426:1: rulemyStringEnum EOF
            {
             before(grammarAccess.getMyStringEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum841);
            rulemyStringEnum();

            state._fsp--;

             after(grammarAccess.getMyStringEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyStringEnum848); 

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
    // $ANTLR end "entryRulemyStringEnum"


    // $ANTLR start "rulemyStringEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:433:1: rulemyStringEnum : ( ( rule__MyStringEnum__Group__0 ) ) ;
    public final void rulemyStringEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:437:2: ( ( ( rule__MyStringEnum__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:438:1: ( ( rule__MyStringEnum__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:438:1: ( ( rule__MyStringEnum__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:439:1: ( rule__MyStringEnum__Group__0 )
            {
             before(grammarAccess.getMyStringEnumAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:440:1: ( rule__MyStringEnum__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:440:2: rule__MyStringEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group__0_in_rulemyStringEnum874);
            rule__MyStringEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyStringEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyStringEnum"


    // $ANTLR start "entryRulemyNumberEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:452:1: entryRulemyNumberEnum : rulemyNumberEnum EOF ;
    public final void entryRulemyNumberEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:453:1: ( rulemyNumberEnum EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:454:1: rulemyNumberEnum EOF
            {
             before(grammarAccess.getMyNumberEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum901);
            rulemyNumberEnum();

            state._fsp--;

             after(grammarAccess.getMyNumberEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyNumberEnum908); 

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
    // $ANTLR end "entryRulemyNumberEnum"


    // $ANTLR start "rulemyNumberEnum"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:461:1: rulemyNumberEnum : ( ( rule__MyNumberEnum__Group__0 ) ) ;
    public final void rulemyNumberEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:465:2: ( ( ( rule__MyNumberEnum__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:466:1: ( ( rule__MyNumberEnum__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:466:1: ( ( rule__MyNumberEnum__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:467:1: ( rule__MyNumberEnum__Group__0 )
            {
             before(grammarAccess.getMyNumberEnumAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:468:1: ( rule__MyNumberEnum__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:468:2: rule__MyNumberEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group__0_in_rulemyNumberEnum934);
            rule__MyNumberEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyNumberEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemyNumberEnum"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:482:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:483:1: ( ruleEInt EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:484:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt963);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt970); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:491:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:495:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:496:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:496:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:497:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:498:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:498:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt996);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:510:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:511:1: ( ruleEDouble EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:512:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1023);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1030); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:519:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:523:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:524:1: ( ( rule__EDouble__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:524:1: ( ( rule__EDouble__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:525:1: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:526:1: ( rule__EDouble__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:526:2: rule__EDouble__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_in_ruleEDouble1056);
            rule__EDouble__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rulemyBinaryOparators"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:539:1: rulemyBinaryOparators : ( ( rule__MyBinaryOparators__Alternatives ) ) ;
    public final void rulemyBinaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:543:1: ( ( ( rule__MyBinaryOparators__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:544:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:544:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:545:1: ( rule__MyBinaryOparators__Alternatives )
            {
             before(grammarAccess.getMyBinaryOparatorsAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:546:1: ( rule__MyBinaryOparators__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:546:2: rule__MyBinaryOparators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1093);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:558:1: rulemyUnaryOparators : ( ( 'not' ) ) ;
    public final void rulemyUnaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:562:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:563:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:563:1: ( ( 'not' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:564:1: ( 'not' )
            {
             before(grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:565:1: ( 'not' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:565:3: 'not'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_rulemyUnaryOparators1130); 

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


    // $ANTLR start "rule__MyValue__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:577:1: rule__MyValue__Alternatives : ( ( rulemyBoolean ) | ( rulemyRange ) | ( rulemyStringEnum ) | ( rulemyNumberEnum ) );
    public final void rule__MyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:581:1: ( ( rulemyBoolean ) | ( rulemyRange ) | ( rulemyStringEnum ) | ( rulemyNumberEnum ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==31) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==24||LA1_1==28) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==31) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||LA1_2==24||LA1_2==28) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==33) ) {
                    alt1=2;
                }
                else if ( (LA1_3==EOF||LA1_3==24||LA1_3==28||LA1_3==34) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 34:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:582:1: ( rulemyBoolean )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:582:1: ( rulemyBoolean )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:583:1: rulemyBoolean
                    {
                     before(grammarAccess.getMyValueAccess().getMyBooleanParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rule__MyValue__Alternatives1167);
                    rulemyBoolean();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyBooleanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:588:6: ( rulemyRange )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:588:6: ( rulemyRange )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:589:1: rulemyRange
                    {
                     before(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1184);
                    rulemyRange();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:594:6: ( rulemyStringEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:594:6: ( rulemyStringEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:595:1: rulemyStringEnum
                    {
                     before(grammarAccess.getMyValueAccess().getMyStringEnumParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rule__MyValue__Alternatives1201);
                    rulemyStringEnum();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyStringEnumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:600:6: ( rulemyNumberEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:600:6: ( rulemyNumberEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:601:1: rulemyNumberEnum
                    {
                     before(grammarAccess.getMyValueAccess().getMyNumberEnumParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rule__MyValue__Alternatives1218);
                    rulemyNumberEnum();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyNumberEnumParserRuleCall_3()); 

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


    // $ANTLR start "rule__MyExpression__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:611:1: rule__MyExpression__Alternatives : ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyBoolean ) | ( rulemyRange ) | ( rulemyStringEnum ) | ( rulemyNumberEnum ) | ( rulemyIdentifier ) );
    public final void rule__MyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:615:1: ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyBoolean ) | ( rulemyRange ) | ( rulemyStringEnum ) | ( rulemyNumberEnum ) | ( rulemyIdentifier ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:616:1: ( rulemyBinary )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:616:1: ( rulemyBinary )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:617:1: rulemyBinary
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1250);
                    rulemyBinary();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:622:6: ( rulemyUnary )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:622:6: ( rulemyUnary )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:623:1: rulemyUnary
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1267);
                    rulemyUnary();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:628:6: ( rulemyBoolean )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:628:6: ( rulemyBoolean )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:629:1: rulemyBoolean
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyBooleanParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rule__MyExpression__Alternatives1284);
                    rulemyBoolean();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyBooleanParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:6: ( rulemyRange )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:6: ( rulemyRange )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:635:1: rulemyRange
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyRangeParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rule__MyExpression__Alternatives1301);
                    rulemyRange();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyRangeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:640:6: ( rulemyStringEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:640:6: ( rulemyStringEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:641:1: rulemyStringEnum
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyStringEnumParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rule__MyExpression__Alternatives1318);
                    rulemyStringEnum();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyStringEnumParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:646:6: ( rulemyNumberEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:646:6: ( rulemyNumberEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:647:1: rulemyNumberEnum
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyNumberEnumParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rule__MyExpression__Alternatives1335);
                    rulemyNumberEnum();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyNumberEnumParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:652:6: ( rulemyIdentifier )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:652:6: ( rulemyIdentifier )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:653:1: rulemyIdentifier
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1352);
                    rulemyIdentifier();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_6()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:663:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:667:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:668:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:668:1: ( RULE_STRING )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:669:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1384); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:674:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:674:6: ( RULE_ID )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:675:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1401); 
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


    // $ANTLR start "rule__EDouble__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:686:1: rule__EDouble__Alternatives : ( ( ( rule__EDouble__Group_0__0 ) ) | ( ruleEInt ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:690:1: ( ( ( rule__EDouble__Group_0__0 ) ) | ( ruleEInt ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==34) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==EOF||(LA4_2>=14 && LA4_2<=21)||(LA4_2>=23 && LA4_2<=24)||LA4_2==28||LA4_2==30) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==34) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==34) ) {
                    alt4=1;
                }
                else if ( (LA4_2==EOF||(LA4_2>=14 && LA4_2<=21)||(LA4_2>=23 && LA4_2<=24)||LA4_2==28||LA4_2==30) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt4=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:691:1: ( ( rule__EDouble__Group_0__0 ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:691:1: ( ( rule__EDouble__Group_0__0 ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:692:1: ( rule__EDouble__Group_0__0 )
                    {
                     before(grammarAccess.getEDoubleAccess().getGroup_0()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:693:1: ( rule__EDouble__Group_0__0 )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:693:2: rule__EDouble__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__0_in_rule__EDouble__Alternatives1434);
                    rule__EDouble__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEDoubleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:697:6: ( ruleEInt )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:697:6: ( ruleEInt )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:698:1: ruleEInt
                    {
                     before(grammarAccess.getEDoubleAccess().getEIntParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__EDouble__Alternatives1452);
                    ruleEInt();

                    state._fsp--;

                     after(grammarAccess.getEDoubleAccess().getEIntParserRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_0_4_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:708:1: rule__EDouble__Alternatives_0_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:712:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:713:1: ( 'E' )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:713:1: ( 'E' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:714:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_0_4_01485); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:721:6: ( 'e' )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:721:6: ( 'e' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:722:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EDouble__Alternatives_0_4_01505); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_0_4_0"


    // $ANTLR start "rule__MyBinaryOparators__Alternatives"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:734:1: rule__MyBinaryOparators__Alternatives : ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) );
    public final void rule__MyBinaryOparators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:738:1: ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:739:1: ( ( '&&' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:739:1: ( ( '&&' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:740:1: ( '&&' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:741:1: ( '&&' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:741:3: '&&'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__MyBinaryOparators__Alternatives1540); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:746:6: ( ( '|' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:746:6: ( ( '|' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:747:1: ( '|' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:748:1: ( '|' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:748:3: '|'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__MyBinaryOparators__Alternatives1561); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:753:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:753:6: ( ( '<' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:754:1: ( '<' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:755:1: ( '<' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:755:3: '<'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1582); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:760:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:760:6: ( ( '>' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:761:1: ( '>' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:762:1: ( '>' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:762:3: '>'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1603); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:767:6: ( ( '=' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:767:6: ( ( '=' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:768:1: ( '=' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:769:1: ( '=' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:769:3: '='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1624); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:774:6: ( ( 'can' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:774:6: ( ( 'can' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:1: ( 'can' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:776:1: ( 'can' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:776:3: 'can'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1645); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:781:6: ( ( 'if' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:781:6: ( ( 'if' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:782:1: ( 'if' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:783:1: ( 'if' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:783:3: 'if'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1666); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:788:6: ( ( 'then' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:788:6: ( ( 'then' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:789:1: ( 'then' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:790:1: ( 'then' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:790:3: 'then'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1687); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:802:1: rule__MyModel__Group__0 : rule__MyModel__Group__0__Impl rule__MyModel__Group__1 ;
    public final void rule__MyModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:806:1: ( rule__MyModel__Group__0__Impl rule__MyModel__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:807:2: rule__MyModel__Group__0__Impl rule__MyModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01720);
            rule__MyModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01723);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:814:1: rule__MyModel__Group__0__Impl : ( () ) ;
    public final void rule__MyModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:818:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:819:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:819:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:820:1: ()
            {
             before(grammarAccess.getMyModelAccess().getMyModelAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:821:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:823:1: 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:833:1: rule__MyModel__Group__1 : rule__MyModel__Group__1__Impl rule__MyModel__Group__2 ;
    public final void rule__MyModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:837:1: ( rule__MyModel__Group__1__Impl rule__MyModel__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:838:2: rule__MyModel__Group__1__Impl rule__MyModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11781);
            rule__MyModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11784);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:845:1: rule__MyModel__Group__1__Impl : ( ( rule__MyModel__NameAssignment_1 ) ) ;
    public final void rule__MyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:849:1: ( ( ( rule__MyModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:850:1: ( ( rule__MyModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:850:1: ( ( rule__MyModel__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:851:1: ( rule__MyModel__NameAssignment_1 )
            {
             before(grammarAccess.getMyModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:852:1: ( rule__MyModel__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:852:2: rule__MyModel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1811);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:862:1: rule__MyModel__Group__2 : rule__MyModel__Group__2__Impl ;
    public final void rule__MyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:866:1: ( rule__MyModel__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:867:2: rule__MyModel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21841);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:873:1: rule__MyModel__Group__2__Impl : ( ( rule__MyModel__Group_2__0 )? ) ;
    public final void rule__MyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:877:1: ( ( ( rule__MyModel__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:878:1: ( ( rule__MyModel__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:878:1: ( ( rule__MyModel__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:879:1: ( rule__MyModel__Group_2__0 )?
            {
             before(grammarAccess.getMyModelAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:880:1: ( rule__MyModel__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:880:2: rule__MyModel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1868);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:896:1: rule__MyModel__Group_2__0 : rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 ;
    public final void rule__MyModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:900:1: ( rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:901:2: rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01905);
            rule__MyModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01908);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:908:1: rule__MyModel__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MyModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:912:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:913:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:913:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:914:1: '{'
            {
             before(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MyModel__Group_2__0__Impl1936); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:927:1: rule__MyModel__Group_2__1 : rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 ;
    public final void rule__MyModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:931:1: ( rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:932:2: rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__11967);
            rule__MyModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__11970);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:939:1: rule__MyModel__Group_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) ;
    public final void rule__MyModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:943:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:944:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:944:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:945:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:946:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:946:2: rule__MyModel__MyModelContainsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl1997);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:956:1: rule__MyModel__Group_2__2 : rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 ;
    public final void rule__MyModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:960:1: ( rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:961:2: rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__22027);
            rule__MyModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__22030);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:968:1: rule__MyModel__Group_2__2__Impl : ( ( rule__MyModel__Group_2_2__0 )* ) ;
    public final void rule__MyModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:972:1: ( ( ( rule__MyModel__Group_2_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:973:1: ( ( rule__MyModel__Group_2_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:973:1: ( ( rule__MyModel__Group_2_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:974:1: ( rule__MyModel__Group_2_2__0 )*
            {
             before(grammarAccess.getMyModelAccess().getGroup_2_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:975:1: ( rule__MyModel__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:975:2: rule__MyModel__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl2057);
            	    rule__MyModel__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:985:1: rule__MyModel__Group_2__3 : rule__MyModel__Group_2__3__Impl ;
    public final void rule__MyModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:989:1: ( rule__MyModel__Group_2__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:990:2: rule__MyModel__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32088);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:996:1: rule__MyModel__Group_2__3__Impl : ( '}' ) ;
    public final void rule__MyModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1000:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1001:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1001:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1002:1: '}'
            {
             before(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MyModel__Group_2__3__Impl2116); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1023:1: rule__MyModel__Group_2_2__0 : rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 ;
    public final void rule__MyModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1027:1: ( rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1028:2: rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02155);
            rule__MyModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02158);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1035:1: rule__MyModel__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MyModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1039:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1040:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1040:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1041:1: ','
            {
             before(grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyModel__Group_2_2__0__Impl2186); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1054:1: rule__MyModel__Group_2_2__1 : rule__MyModel__Group_2_2__1__Impl ;
    public final void rule__MyModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1058:1: ( rule__MyModel__Group_2_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1059:2: rule__MyModel__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12217);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1065:1: rule__MyModel__Group_2_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) ;
    public final void rule__MyModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1069:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1070:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1070:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1071:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1072:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1072:2: rule__MyModel__MyModelContainsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2244);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1086:1: rule__MyObject__Group__0 : rule__MyObject__Group__0__Impl rule__MyObject__Group__1 ;
    public final void rule__MyObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1090:1: ( rule__MyObject__Group__0__Impl rule__MyObject__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1091:2: rule__MyObject__Group__0__Impl rule__MyObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02278);
            rule__MyObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02281);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1098:1: rule__MyObject__Group__0__Impl : ( () ) ;
    public final void rule__MyObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1102:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1103:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1103:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1104:1: ()
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1105:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1107:1: 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1117:1: rule__MyObject__Group__1 : rule__MyObject__Group__1__Impl rule__MyObject__Group__2 ;
    public final void rule__MyObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1121:1: ( rule__MyObject__Group__1__Impl rule__MyObject__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1122:2: rule__MyObject__Group__1__Impl rule__MyObject__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12339);
            rule__MyObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12342);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1129:1: rule__MyObject__Group__1__Impl : ( ( rule__MyObject__NameAssignment_1 ) ) ;
    public final void rule__MyObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1133:1: ( ( ( rule__MyObject__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1134:1: ( ( rule__MyObject__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1134:1: ( ( rule__MyObject__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1135:1: ( rule__MyObject__NameAssignment_1 )
            {
             before(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1136:1: ( rule__MyObject__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1136:2: rule__MyObject__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2369);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1146:1: rule__MyObject__Group__2 : rule__MyObject__Group__2__Impl rule__MyObject__Group__3 ;
    public final void rule__MyObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1150:1: ( rule__MyObject__Group__2__Impl rule__MyObject__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1151:2: rule__MyObject__Group__2__Impl rule__MyObject__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22399);
            rule__MyObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22402);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1158:1: rule__MyObject__Group__2__Impl : ( '{' ) ;
    public final void rule__MyObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1162:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1163:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1163:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1164:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MyObject__Group__2__Impl2430); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1177:1: rule__MyObject__Group__3 : rule__MyObject__Group__3__Impl rule__MyObject__Group__4 ;
    public final void rule__MyObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1181:1: ( rule__MyObject__Group__3__Impl rule__MyObject__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1182:2: rule__MyObject__Group__3__Impl rule__MyObject__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32461);
            rule__MyObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32464);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1189:1: rule__MyObject__Group__3__Impl : ( ( rule__MyObject__Group_3__0 )? ) ;
    public final void rule__MyObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1193:1: ( ( ( rule__MyObject__Group_3__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1194:1: ( ( rule__MyObject__Group_3__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1194:1: ( ( rule__MyObject__Group_3__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1195:1: ( rule__MyObject__Group_3__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1196:1: ( rule__MyObject__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1196:2: rule__MyObject__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2491);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1206:1: rule__MyObject__Group__4 : rule__MyObject__Group__4__Impl rule__MyObject__Group__5 ;
    public final void rule__MyObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1210:1: ( rule__MyObject__Group__4__Impl rule__MyObject__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1211:2: rule__MyObject__Group__4__Impl rule__MyObject__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42522);
            rule__MyObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42525);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1218:1: rule__MyObject__Group__4__Impl : ( ( rule__MyObject__Group_4__0 )? ) ;
    public final void rule__MyObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1222:1: ( ( ( rule__MyObject__Group_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1223:1: ( ( rule__MyObject__Group_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1223:1: ( ( rule__MyObject__Group_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1224:1: ( rule__MyObject__Group_4__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1225:1: ( rule__MyObject__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1225:2: rule__MyObject__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2552);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1235:1: rule__MyObject__Group__5 : rule__MyObject__Group__5__Impl ;
    public final void rule__MyObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1239:1: ( rule__MyObject__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1240:2: rule__MyObject__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52583);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1246:1: rule__MyObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MyObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1250:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1251:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1251:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1252:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MyObject__Group__5__Impl2611); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1277:1: rule__MyObject__Group_3__0 : rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 ;
    public final void rule__MyObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1281:1: ( rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1282:2: rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02654);
            rule__MyObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02657);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1289:1: rule__MyObject__Group_3__0__Impl : ( 'has' ) ;
    public final void rule__MyObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1293:1: ( ( 'has' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1294:1: ( 'has' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1294:1: ( 'has' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1295:1: 'has'
            {
             before(grammarAccess.getMyObjectAccess().getHasKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group_3__0__Impl2685); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1308:1: rule__MyObject__Group_3__1 : rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 ;
    public final void rule__MyObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1312:1: ( rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1313:2: rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12716);
            rule__MyObject__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12719);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1320:1: rule__MyObject__Group_3__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) ;
    public final void rule__MyObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1324:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1325:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1325:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1326:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1327:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1327:2: rule__MyObject__MyAttributeContainsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2746);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1337:1: rule__MyObject__Group_3__2 : rule__MyObject__Group_3__2__Impl ;
    public final void rule__MyObject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1341:1: ( rule__MyObject__Group_3__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1342:2: rule__MyObject__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22776);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1348:1: rule__MyObject__Group_3__2__Impl : ( ( rule__MyObject__Group_3_2__0 )* ) ;
    public final void rule__MyObject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1352:1: ( ( ( rule__MyObject__Group_3_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1353:1: ( ( rule__MyObject__Group_3_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1353:1: ( ( rule__MyObject__Group_3_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1354:1: ( rule__MyObject__Group_3_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1355:1: ( rule__MyObject__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1355:2: rule__MyObject__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2803);
            	    rule__MyObject__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1371:1: rule__MyObject__Group_3_2__0 : rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 ;
    public final void rule__MyObject__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1375:1: ( rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1376:2: rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02840);
            rule__MyObject__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02843);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1383:1: rule__MyObject__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1387:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1388:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1388:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1389:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group_3_2__0__Impl2871); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1402:1: rule__MyObject__Group_3_2__1 : rule__MyObject__Group_3_2__1__Impl ;
    public final void rule__MyObject__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1406:1: ( rule__MyObject__Group_3_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1407:2: rule__MyObject__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12902);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1413:1: rule__MyObject__Group_3_2__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) ;
    public final void rule__MyObject__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1417:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1418:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1418:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1419:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1420:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1420:2: rule__MyObject__MyAttributeContainsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2929);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1434:1: rule__MyObject__Group_4__0 : rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 ;
    public final void rule__MyObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1438:1: ( rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1439:2: rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__02963);
            rule__MyObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__02966);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1446:1: rule__MyObject__Group_4__0__Impl : ( 'Constrained by' ) ;
    public final void rule__MyObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1450:1: ( ( 'Constrained by' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1451:1: ( 'Constrained by' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1451:1: ( 'Constrained by' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1452:1: 'Constrained by'
            {
             before(grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_4__0__Impl2994); 
             after(grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1465:1: rule__MyObject__Group_4__1 : rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 ;
    public final void rule__MyObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1469:1: ( rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1470:2: rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13025);
            rule__MyObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13028);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1477:1: rule__MyObject__Group_4__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) ;
    public final void rule__MyObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1481:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1482:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1482:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1483:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1484:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1484:2: rule__MyObject__MyObjectHasAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl3055);
            rule__MyObject__MyObjectHasAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_1()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1494:1: rule__MyObject__Group_4__2 : rule__MyObject__Group_4__2__Impl ;
    public final void rule__MyObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1498:1: ( rule__MyObject__Group_4__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1499:2: rule__MyObject__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23085);
            rule__MyObject__Group_4__2__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1505:1: rule__MyObject__Group_4__2__Impl : ( ( rule__MyObject__Group_4_2__0 )* ) ;
    public final void rule__MyObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1509:1: ( ( ( rule__MyObject__Group_4_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1510:1: ( ( rule__MyObject__Group_4_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1510:1: ( ( rule__MyObject__Group_4_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1511:1: ( rule__MyObject__Group_4_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1512:1: ( rule__MyObject__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1512:2: rule__MyObject__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3112);
            	    rule__MyObject__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMyObjectAccess().getGroup_4_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyObject__Group_4_2__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1528:1: rule__MyObject__Group_4_2__0 : rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 ;
    public final void rule__MyObject__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1532:1: ( rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1533:2: rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03149);
            rule__MyObject__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03152);
            rule__MyObject__Group_4_2__1();

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
    // $ANTLR end "rule__MyObject__Group_4_2__0"


    // $ANTLR start "rule__MyObject__Group_4_2__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1540:1: rule__MyObject__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1544:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1545:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1545:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1546:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group_4_2__0__Impl3180); 
             after(grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_2__0__Impl"


    // $ANTLR start "rule__MyObject__Group_4_2__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1559:1: rule__MyObject__Group_4_2__1 : rule__MyObject__Group_4_2__1__Impl ;
    public final void rule__MyObject__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1563:1: ( rule__MyObject__Group_4_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1564:2: rule__MyObject__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13211);
            rule__MyObject__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__MyObject__Group_4_2__1"


    // $ANTLR start "rule__MyObject__Group_4_2__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1570:1: rule__MyObject__Group_4_2__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) ;
    public final void rule__MyObject__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1574:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1575:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1575:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1576:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1577:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1577:2: rule__MyObject__MyObjectHasAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3238);
            rule__MyObject__MyObjectHasAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group_4_2__1__Impl"


    // $ANTLR start "rule__MyConstraint__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1591:1: rule__MyConstraint__Group__0 : rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 ;
    public final void rule__MyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1595:1: ( rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1596:2: rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03272);
            rule__MyConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03275);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1603:1: rule__MyConstraint__Group__0__Impl : ( 'if' ) ;
    public final void rule__MyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1607:1: ( ( 'if' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1608:1: ( 'if' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1608:1: ( 'if' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1609:1: 'if'
            {
             before(grammarAccess.getMyConstraintAccess().getIfKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MyConstraint__Group__0__Impl3303); 
             after(grammarAccess.getMyConstraintAccess().getIfKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1622:1: rule__MyConstraint__Group__1 : rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 ;
    public final void rule__MyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1626:1: ( rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1627:2: rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13334);
            rule__MyConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13337);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1634:1: rule__MyConstraint__Group__1__Impl : ( ( rule__MyConstraint__MyIfConstraintAssignment_1 ) ) ;
    public final void rule__MyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1638:1: ( ( ( rule__MyConstraint__MyIfConstraintAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1639:1: ( ( rule__MyConstraint__MyIfConstraintAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1639:1: ( ( rule__MyConstraint__MyIfConstraintAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1640:1: ( rule__MyConstraint__MyIfConstraintAssignment_1 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyIfConstraintAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1641:1: ( rule__MyConstraint__MyIfConstraintAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1641:2: rule__MyConstraint__MyIfConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyIfConstraintAssignment_1_in_rule__MyConstraint__Group__1__Impl3364);
            rule__MyConstraint__MyIfConstraintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getMyIfConstraintAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1651:1: rule__MyConstraint__Group__2 : rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 ;
    public final void rule__MyConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1655:1: ( rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1656:2: rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23394);
            rule__MyConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23397);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1663:1: rule__MyConstraint__Group__2__Impl : ( 'then' ) ;
    public final void rule__MyConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1667:1: ( ( 'then' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1668:1: ( 'then' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1668:1: ( 'then' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1669:1: 'then'
            {
             before(grammarAccess.getMyConstraintAccess().getThenKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MyConstraint__Group__2__Impl3425); 
             after(grammarAccess.getMyConstraintAccess().getThenKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1682:1: rule__MyConstraint__Group__3 : rule__MyConstraint__Group__3__Impl ;
    public final void rule__MyConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1686:1: ( rule__MyConstraint__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1687:2: rule__MyConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33456);
            rule__MyConstraint__Group__3__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1693:1: rule__MyConstraint__Group__3__Impl : ( ( rule__MyConstraint__MyThenConstraintAssignment_3 ) ) ;
    public final void rule__MyConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1697:1: ( ( ( rule__MyConstraint__MyThenConstraintAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1698:1: ( ( rule__MyConstraint__MyThenConstraintAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1698:1: ( ( rule__MyConstraint__MyThenConstraintAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1699:1: ( rule__MyConstraint__MyThenConstraintAssignment_3 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyThenConstraintAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1700:1: ( rule__MyConstraint__MyThenConstraintAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1700:2: rule__MyConstraint__MyThenConstraintAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyThenConstraintAssignment_3_in_rule__MyConstraint__Group__3__Impl3483);
            rule__MyConstraint__MyThenConstraintAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getMyThenConstraintAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyAttribute__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1718:1: rule__MyAttribute__Group__0 : rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 ;
    public final void rule__MyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1722:1: ( rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1723:2: rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03521);
            rule__MyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03524);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1730:1: rule__MyAttribute__Group__0__Impl : ( ( rule__MyAttribute__NameAssignment_0 ) ) ;
    public final void rule__MyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1734:1: ( ( ( rule__MyAttribute__NameAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1735:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1735:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1736:1: ( rule__MyAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMyAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1737:1: ( rule__MyAttribute__NameAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1737:2: rule__MyAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3551);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1747:1: rule__MyAttribute__Group__1 : rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 ;
    public final void rule__MyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1751:1: ( rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1752:2: rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13581);
            rule__MyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13584);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1759:1: rule__MyAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__MyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1763:1: ( ( '[' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1764:1: ( '[' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1764:1: ( '[' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1765:1: '['
            {
             before(grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MyAttribute__Group__1__Impl3612); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1778:1: rule__MyAttribute__Group__2 : rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 ;
    public final void rule__MyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1782:1: ( rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1783:2: rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23643);
            rule__MyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23646);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1790:1: rule__MyAttribute__Group__2__Impl : ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) ;
    public final void rule__MyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1794:1: ( ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:2: rule__MyAttribute__MyAttributeContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3673);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1807:1: rule__MyAttribute__Group__3 : rule__MyAttribute__Group__3__Impl ;
    public final void rule__MyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1811:1: ( rule__MyAttribute__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1812:2: rule__MyAttribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33703);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1818:1: rule__MyAttribute__Group__3__Impl : ( ']' ) ;
    public final void rule__MyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1822:1: ( ( ']' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1823:1: ( ']' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1823:1: ( ']' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1824:1: ']'
            {
             before(grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyAttribute__Group__3__Impl3731); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1845:1: rule__MyBinary__Group__0 : rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 ;
    public final void rule__MyBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1849:1: ( rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1850:2: rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03770);
            rule__MyBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03773);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1857:1: rule__MyBinary__Group__0__Impl : ( '(' ) ;
    public final void rule__MyBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1861:1: ( ( '(' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1862:1: ( '(' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1862:1: ( '(' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1863:1: '('
            {
             before(grammarAccess.getMyBinaryAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MyBinary__Group__0__Impl3801); 
             after(grammarAccess.getMyBinaryAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1876:1: rule__MyBinary__Group__1 : rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 ;
    public final void rule__MyBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1880:1: ( rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1881:2: rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13832);
            rule__MyBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13835);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1888:1: rule__MyBinary__Group__1__Impl : ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) ;
    public final void rule__MyBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1892:1: ( ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1893:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1893:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1894:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1895:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1895:2: rule__MyBinary__MyBinaryLeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3862);
            rule__MyBinary__MyBinaryLeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1905:1: rule__MyBinary__Group__2 : rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 ;
    public final void rule__MyBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1909:1: ( rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1910:2: rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23892);
            rule__MyBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23895);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1917:1: rule__MyBinary__Group__2__Impl : ( ( rule__MyBinary__OparandAssignment_2 ) ) ;
    public final void rule__MyBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1921:1: ( ( ( rule__MyBinary__OparandAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1922:1: ( ( rule__MyBinary__OparandAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1922:1: ( ( rule__MyBinary__OparandAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1923:1: ( rule__MyBinary__OparandAssignment_2 )
            {
             before(grammarAccess.getMyBinaryAccess().getOparandAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:1: ( rule__MyBinary__OparandAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:2: rule__MyBinary__OparandAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3922);
            rule__MyBinary__OparandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getOparandAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1934:1: rule__MyBinary__Group__3 : rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 ;
    public final void rule__MyBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1938:1: ( rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1939:2: rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33952);
            rule__MyBinary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33955);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1946:1: rule__MyBinary__Group__3__Impl : ( ( rule__MyBinary__MyBinaryRightAssignment_3 ) ) ;
    public final void rule__MyBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1950:1: ( ( ( rule__MyBinary__MyBinaryRightAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1951:1: ( ( rule__MyBinary__MyBinaryRightAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1951:1: ( ( rule__MyBinary__MyBinaryRightAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1952:1: ( rule__MyBinary__MyBinaryRightAssignment_3 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:1: ( rule__MyBinary__MyBinaryRightAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:2: rule__MyBinary__MyBinaryRightAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryRightAssignment_3_in_rule__MyBinary__Group__3__Impl3982);
            rule__MyBinary__MyBinaryRightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1963:1: rule__MyBinary__Group__4 : rule__MyBinary__Group__4__Impl ;
    public final void rule__MyBinary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1967:1: ( rule__MyBinary__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1968:2: rule__MyBinary__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44012);
            rule__MyBinary__Group__4__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1974:1: rule__MyBinary__Group__4__Impl : ( ')' ) ;
    public final void rule__MyBinary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1978:1: ( ( ')' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1979:1: ( ')' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1979:1: ( ')' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1980:1: ')'
            {
             before(grammarAccess.getMyBinaryAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MyBinary__Group__4__Impl4040); 
             after(grammarAccess.getMyBinaryAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyUnary__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2003:1: rule__MyUnary__Group__0 : rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 ;
    public final void rule__MyUnary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2007:1: ( rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2008:2: rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04081);
            rule__MyUnary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04084);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2015:1: rule__MyUnary__Group__0__Impl : ( ( rule__MyUnary__OparandAssignment_0 ) ) ;
    public final void rule__MyUnary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2019:1: ( ( ( rule__MyUnary__OparandAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2020:1: ( ( rule__MyUnary__OparandAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2020:1: ( ( rule__MyUnary__OparandAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2021:1: ( rule__MyUnary__OparandAssignment_0 )
            {
             before(grammarAccess.getMyUnaryAccess().getOparandAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:1: ( rule__MyUnary__OparandAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:2: rule__MyUnary__OparandAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl4111);
            rule__MyUnary__OparandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getOparandAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2032:1: rule__MyUnary__Group__1 : rule__MyUnary__Group__1__Impl ;
    public final void rule__MyUnary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2036:1: ( rule__MyUnary__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2037:2: rule__MyUnary__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14141);
            rule__MyUnary__Group__1__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2043:1: rule__MyUnary__Group__1__Impl : ( ( rule__MyUnary__MyUnaryExpressionAssignment_1 ) ) ;
    public final void rule__MyUnary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2047:1: ( ( ( rule__MyUnary__MyUnaryExpressionAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2048:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2048:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2049:1: ( rule__MyUnary__MyUnaryExpressionAssignment_1 )
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2050:1: ( rule__MyUnary__MyUnaryExpressionAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2050:2: rule__MyUnary__MyUnaryExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_1_in_rule__MyUnary__Group__1__Impl4168);
            rule__MyUnary__MyUnaryExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyBoolean__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2064:1: rule__MyBoolean__Group__0 : rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 ;
    public final void rule__MyBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2068:1: ( rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2069:2: rule__MyBoolean__Group__0__Impl rule__MyBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__0__Impl_in_rule__MyBoolean__Group__04202);
            rule__MyBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__1_in_rule__MyBoolean__Group__04205);
            rule__MyBoolean__Group__1();

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
    // $ANTLR end "rule__MyBoolean__Group__0"


    // $ANTLR start "rule__MyBoolean__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2076:1: rule__MyBoolean__Group__0__Impl : ( ( rule__MyBoolean__TrueValueAssignment_0 ) ) ;
    public final void rule__MyBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2080:1: ( ( ( rule__MyBoolean__TrueValueAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2081:1: ( ( rule__MyBoolean__TrueValueAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2081:1: ( ( rule__MyBoolean__TrueValueAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2082:1: ( rule__MyBoolean__TrueValueAssignment_0 )
            {
             before(grammarAccess.getMyBooleanAccess().getTrueValueAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2083:1: ( rule__MyBoolean__TrueValueAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2083:2: rule__MyBoolean__TrueValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__TrueValueAssignment_0_in_rule__MyBoolean__Group__0__Impl4232);
            rule__MyBoolean__TrueValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getTrueValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__0__Impl"


    // $ANTLR start "rule__MyBoolean__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2093:1: rule__MyBoolean__Group__1 : rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 ;
    public final void rule__MyBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2097:1: ( rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2098:2: rule__MyBoolean__Group__1__Impl rule__MyBoolean__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__1__Impl_in_rule__MyBoolean__Group__14262);
            rule__MyBoolean__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__2_in_rule__MyBoolean__Group__14265);
            rule__MyBoolean__Group__2();

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
    // $ANTLR end "rule__MyBoolean__Group__1"


    // $ANTLR start "rule__MyBoolean__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2105:1: rule__MyBoolean__Group__1__Impl : ( ':' ) ;
    public final void rule__MyBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2109:1: ( ( ':' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2110:1: ( ':' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2110:1: ( ':' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2111:1: ':'
            {
             before(grammarAccess.getMyBooleanAccess().getColonKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyBoolean__Group__1__Impl4293); 
             after(grammarAccess.getMyBooleanAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__1__Impl"


    // $ANTLR start "rule__MyBoolean__Group__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2124:1: rule__MyBoolean__Group__2 : rule__MyBoolean__Group__2__Impl ;
    public final void rule__MyBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2128:1: ( rule__MyBoolean__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2129:2: rule__MyBoolean__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__Group__2__Impl_in_rule__MyBoolean__Group__24324);
            rule__MyBoolean__Group__2__Impl();

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
    // $ANTLR end "rule__MyBoolean__Group__2"


    // $ANTLR start "rule__MyBoolean__Group__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2135:1: rule__MyBoolean__Group__2__Impl : ( ( rule__MyBoolean__FalseValueAssignment_2 ) ) ;
    public final void rule__MyBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2139:1: ( ( ( rule__MyBoolean__FalseValueAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2140:1: ( ( rule__MyBoolean__FalseValueAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2140:1: ( ( rule__MyBoolean__FalseValueAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2141:1: ( rule__MyBoolean__FalseValueAssignment_2 )
            {
             before(grammarAccess.getMyBooleanAccess().getFalseValueAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2142:1: ( rule__MyBoolean__FalseValueAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2142:2: rule__MyBoolean__FalseValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBoolean__FalseValueAssignment_2_in_rule__MyBoolean__Group__2__Impl4351);
            rule__MyBoolean__FalseValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getFalseValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__Group__2__Impl"


    // $ANTLR start "rule__MyIdentifier__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2158:1: rule__MyIdentifier__Group__0 : rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 ;
    public final void rule__MyIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2162:1: ( rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2163:2: rule__MyIdentifier__Group__0__Impl rule__MyIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__04387);
            rule__MyIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__04390);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2170:1: rule__MyIdentifier__Group__0__Impl : ( '*' ) ;
    public final void rule__MyIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2174:1: ( ( '*' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2175:1: ( '*' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2175:1: ( '*' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2176:1: '*'
            {
             before(grammarAccess.getMyIdentifierAccess().getAsteriskKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MyIdentifier__Group__0__Impl4418); 
             after(grammarAccess.getMyIdentifierAccess().getAsteriskKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2189:1: rule__MyIdentifier__Group__1 : rule__MyIdentifier__Group__1__Impl ;
    public final void rule__MyIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2193:1: ( rule__MyIdentifier__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2194:2: rule__MyIdentifier__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__14449);
            rule__MyIdentifier__Group__1__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2200:1: rule__MyIdentifier__Group__1__Impl : ( ( rule__MyIdentifier__MyIntentifierIsAssignment_1 ) ) ;
    public final void rule__MyIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2204:1: ( ( ( rule__MyIdentifier__MyIntentifierIsAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2205:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2205:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2206:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_1 )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2207:1: ( rule__MyIdentifier__MyIntentifierIsAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2207:2: rule__MyIdentifier__MyIntentifierIsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_1_in_rule__MyIdentifier__Group__1__Impl4476);
            rule__MyIdentifier__MyIntentifierIsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyRange__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2221:1: rule__MyRange__Group__0 : rule__MyRange__Group__0__Impl rule__MyRange__Group__1 ;
    public final void rule__MyRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2225:1: ( rule__MyRange__Group__0__Impl rule__MyRange__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2226:2: rule__MyRange__Group__0__Impl rule__MyRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04510);
            rule__MyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04513);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2233:1: rule__MyRange__Group__0__Impl : ( ( rule__MyRange__FromAssignment_0 ) ) ;
    public final void rule__MyRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2237:1: ( ( ( rule__MyRange__FromAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2238:1: ( ( rule__MyRange__FromAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2238:1: ( ( rule__MyRange__FromAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2239:1: ( rule__MyRange__FromAssignment_0 )
            {
             before(grammarAccess.getMyRangeAccess().getFromAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2240:1: ( rule__MyRange__FromAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2240:2: rule__MyRange__FromAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__FromAssignment_0_in_rule__MyRange__Group__0__Impl4540);
            rule__MyRange__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getFromAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2250:1: rule__MyRange__Group__1 : rule__MyRange__Group__1__Impl rule__MyRange__Group__2 ;
    public final void rule__MyRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2254:1: ( rule__MyRange__Group__1__Impl rule__MyRange__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2255:2: rule__MyRange__Group__1__Impl rule__MyRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14570);
            rule__MyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14573);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2262:1: rule__MyRange__Group__1__Impl : ( '-' ) ;
    public final void rule__MyRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2266:1: ( ( '-' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2267:1: ( '-' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2267:1: ( '-' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2268:1: '-'
            {
             before(grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MyRange__Group__1__Impl4601); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2281:1: rule__MyRange__Group__2 : rule__MyRange__Group__2__Impl ;
    public final void rule__MyRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2285:1: ( rule__MyRange__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2286:2: rule__MyRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24632);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2292:1: rule__MyRange__Group__2__Impl : ( ( rule__MyRange__ToAssignment_2 ) ) ;
    public final void rule__MyRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2296:1: ( ( ( rule__MyRange__ToAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2297:1: ( ( rule__MyRange__ToAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2297:1: ( ( rule__MyRange__ToAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2298:1: ( rule__MyRange__ToAssignment_2 )
            {
             before(grammarAccess.getMyRangeAccess().getToAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2299:1: ( rule__MyRange__ToAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2299:2: rule__MyRange__ToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__ToAssignment_2_in_rule__MyRange__Group__2__Impl4659);
            rule__MyRange__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyRangeAccess().getToAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyStringEnum__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2315:1: rule__MyStringEnum__Group__0 : rule__MyStringEnum__Group__0__Impl rule__MyStringEnum__Group__1 ;
    public final void rule__MyStringEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2319:1: ( rule__MyStringEnum__Group__0__Impl rule__MyStringEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2320:2: rule__MyStringEnum__Group__0__Impl rule__MyStringEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group__0__Impl_in_rule__MyStringEnum__Group__04695);
            rule__MyStringEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group__1_in_rule__MyStringEnum__Group__04698);
            rule__MyStringEnum__Group__1();

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
    // $ANTLR end "rule__MyStringEnum__Group__0"


    // $ANTLR start "rule__MyStringEnum__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2327:1: rule__MyStringEnum__Group__0__Impl : ( ( rule__MyStringEnum__ValuesAssignment_0 ) ) ;
    public final void rule__MyStringEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2331:1: ( ( ( rule__MyStringEnum__ValuesAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2332:1: ( ( rule__MyStringEnum__ValuesAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2332:1: ( ( rule__MyStringEnum__ValuesAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2333:1: ( rule__MyStringEnum__ValuesAssignment_0 )
            {
             before(grammarAccess.getMyStringEnumAccess().getValuesAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2334:1: ( rule__MyStringEnum__ValuesAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2334:2: rule__MyStringEnum__ValuesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__ValuesAssignment_0_in_rule__MyStringEnum__Group__0__Impl4725);
            rule__MyStringEnum__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyStringEnumAccess().getValuesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__Group__0__Impl"


    // $ANTLR start "rule__MyStringEnum__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2344:1: rule__MyStringEnum__Group__1 : rule__MyStringEnum__Group__1__Impl ;
    public final void rule__MyStringEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2348:1: ( rule__MyStringEnum__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2349:2: rule__MyStringEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group__1__Impl_in_rule__MyStringEnum__Group__14755);
            rule__MyStringEnum__Group__1__Impl();

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
    // $ANTLR end "rule__MyStringEnum__Group__1"


    // $ANTLR start "rule__MyStringEnum__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2355:1: rule__MyStringEnum__Group__1__Impl : ( ( rule__MyStringEnum__Group_1__0 )* ) ;
    public final void rule__MyStringEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2359:1: ( ( ( rule__MyStringEnum__Group_1__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2360:1: ( ( rule__MyStringEnum__Group_1__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2360:1: ( ( rule__MyStringEnum__Group_1__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2361:1: ( rule__MyStringEnum__Group_1__0 )*
            {
             before(grammarAccess.getMyStringEnumAccess().getGroup_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2362:1: ( rule__MyStringEnum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2362:2: rule__MyStringEnum__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group_1__0_in_rule__MyStringEnum__Group__1__Impl4782);
            	    rule__MyStringEnum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMyStringEnumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__Group__1__Impl"


    // $ANTLR start "rule__MyStringEnum__Group_1__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2376:1: rule__MyStringEnum__Group_1__0 : rule__MyStringEnum__Group_1__0__Impl rule__MyStringEnum__Group_1__1 ;
    public final void rule__MyStringEnum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2380:1: ( rule__MyStringEnum__Group_1__0__Impl rule__MyStringEnum__Group_1__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2381:2: rule__MyStringEnum__Group_1__0__Impl rule__MyStringEnum__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group_1__0__Impl_in_rule__MyStringEnum__Group_1__04817);
            rule__MyStringEnum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group_1__1_in_rule__MyStringEnum__Group_1__04820);
            rule__MyStringEnum__Group_1__1();

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
    // $ANTLR end "rule__MyStringEnum__Group_1__0"


    // $ANTLR start "rule__MyStringEnum__Group_1__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2388:1: rule__MyStringEnum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MyStringEnum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2392:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2393:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2393:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2394:1: ','
            {
             before(grammarAccess.getMyStringEnumAccess().getCommaKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyStringEnum__Group_1__0__Impl4848); 
             after(grammarAccess.getMyStringEnumAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__Group_1__0__Impl"


    // $ANTLR start "rule__MyStringEnum__Group_1__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2407:1: rule__MyStringEnum__Group_1__1 : rule__MyStringEnum__Group_1__1__Impl ;
    public final void rule__MyStringEnum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2411:1: ( rule__MyStringEnum__Group_1__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2412:2: rule__MyStringEnum__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__Group_1__1__Impl_in_rule__MyStringEnum__Group_1__14879);
            rule__MyStringEnum__Group_1__1__Impl();

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
    // $ANTLR end "rule__MyStringEnum__Group_1__1"


    // $ANTLR start "rule__MyStringEnum__Group_1__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2418:1: rule__MyStringEnum__Group_1__1__Impl : ( ( rule__MyStringEnum__ValuesAssignment_1_1 ) ) ;
    public final void rule__MyStringEnum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2422:1: ( ( ( rule__MyStringEnum__ValuesAssignment_1_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2423:1: ( ( rule__MyStringEnum__ValuesAssignment_1_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2423:1: ( ( rule__MyStringEnum__ValuesAssignment_1_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2424:1: ( rule__MyStringEnum__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getMyStringEnumAccess().getValuesAssignment_1_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2425:1: ( rule__MyStringEnum__ValuesAssignment_1_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2425:2: rule__MyStringEnum__ValuesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyStringEnum__ValuesAssignment_1_1_in_rule__MyStringEnum__Group_1__1__Impl4906);
            rule__MyStringEnum__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMyStringEnumAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__Group_1__1__Impl"


    // $ANTLR start "rule__MyNumberEnum__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2439:1: rule__MyNumberEnum__Group__0 : rule__MyNumberEnum__Group__0__Impl rule__MyNumberEnum__Group__1 ;
    public final void rule__MyNumberEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2443:1: ( rule__MyNumberEnum__Group__0__Impl rule__MyNumberEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2444:2: rule__MyNumberEnum__Group__0__Impl rule__MyNumberEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group__0__Impl_in_rule__MyNumberEnum__Group__04940);
            rule__MyNumberEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group__1_in_rule__MyNumberEnum__Group__04943);
            rule__MyNumberEnum__Group__1();

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
    // $ANTLR end "rule__MyNumberEnum__Group__0"


    // $ANTLR start "rule__MyNumberEnum__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2451:1: rule__MyNumberEnum__Group__0__Impl : ( ( rule__MyNumberEnum__ValuesAssignment_0 ) ) ;
    public final void rule__MyNumberEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2455:1: ( ( ( rule__MyNumberEnum__ValuesAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2456:1: ( ( rule__MyNumberEnum__ValuesAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2456:1: ( ( rule__MyNumberEnum__ValuesAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2457:1: ( rule__MyNumberEnum__ValuesAssignment_0 )
            {
             before(grammarAccess.getMyNumberEnumAccess().getValuesAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2458:1: ( rule__MyNumberEnum__ValuesAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2458:2: rule__MyNumberEnum__ValuesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__ValuesAssignment_0_in_rule__MyNumberEnum__Group__0__Impl4970);
            rule__MyNumberEnum__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyNumberEnumAccess().getValuesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__Group__0__Impl"


    // $ANTLR start "rule__MyNumberEnum__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2468:1: rule__MyNumberEnum__Group__1 : rule__MyNumberEnum__Group__1__Impl ;
    public final void rule__MyNumberEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2472:1: ( rule__MyNumberEnum__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2473:2: rule__MyNumberEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group__1__Impl_in_rule__MyNumberEnum__Group__15000);
            rule__MyNumberEnum__Group__1__Impl();

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
    // $ANTLR end "rule__MyNumberEnum__Group__1"


    // $ANTLR start "rule__MyNumberEnum__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2479:1: rule__MyNumberEnum__Group__1__Impl : ( ( rule__MyNumberEnum__Group_1__0 )* ) ;
    public final void rule__MyNumberEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2483:1: ( ( ( rule__MyNumberEnum__Group_1__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2484:1: ( ( rule__MyNumberEnum__Group_1__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2484:1: ( ( rule__MyNumberEnum__Group_1__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2485:1: ( rule__MyNumberEnum__Group_1__0 )*
            {
             before(grammarAccess.getMyNumberEnumAccess().getGroup_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2486:1: ( rule__MyNumberEnum__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_INT||(LA14_2>=33 && LA14_2<=34)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2486:2: rule__MyNumberEnum__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group_1__0_in_rule__MyNumberEnum__Group__1__Impl5027);
            	    rule__MyNumberEnum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMyNumberEnumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__Group__1__Impl"


    // $ANTLR start "rule__MyNumberEnum__Group_1__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2500:1: rule__MyNumberEnum__Group_1__0 : rule__MyNumberEnum__Group_1__0__Impl rule__MyNumberEnum__Group_1__1 ;
    public final void rule__MyNumberEnum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2504:1: ( rule__MyNumberEnum__Group_1__0__Impl rule__MyNumberEnum__Group_1__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2505:2: rule__MyNumberEnum__Group_1__0__Impl rule__MyNumberEnum__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group_1__0__Impl_in_rule__MyNumberEnum__Group_1__05062);
            rule__MyNumberEnum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group_1__1_in_rule__MyNumberEnum__Group_1__05065);
            rule__MyNumberEnum__Group_1__1();

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
    // $ANTLR end "rule__MyNumberEnum__Group_1__0"


    // $ANTLR start "rule__MyNumberEnum__Group_1__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2512:1: rule__MyNumberEnum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MyNumberEnum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2516:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2517:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2517:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2518:1: ','
            {
             before(grammarAccess.getMyNumberEnumAccess().getCommaKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyNumberEnum__Group_1__0__Impl5093); 
             after(grammarAccess.getMyNumberEnumAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__Group_1__0__Impl"


    // $ANTLR start "rule__MyNumberEnum__Group_1__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2531:1: rule__MyNumberEnum__Group_1__1 : rule__MyNumberEnum__Group_1__1__Impl ;
    public final void rule__MyNumberEnum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2535:1: ( rule__MyNumberEnum__Group_1__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2536:2: rule__MyNumberEnum__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__Group_1__1__Impl_in_rule__MyNumberEnum__Group_1__15124);
            rule__MyNumberEnum__Group_1__1__Impl();

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
    // $ANTLR end "rule__MyNumberEnum__Group_1__1"


    // $ANTLR start "rule__MyNumberEnum__Group_1__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2542:1: rule__MyNumberEnum__Group_1__1__Impl : ( ( rule__MyNumberEnum__ValuesAssignment_1_1 ) ) ;
    public final void rule__MyNumberEnum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2546:1: ( ( ( rule__MyNumberEnum__ValuesAssignment_1_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2547:1: ( ( rule__MyNumberEnum__ValuesAssignment_1_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2547:1: ( ( rule__MyNumberEnum__ValuesAssignment_1_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2548:1: ( rule__MyNumberEnum__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getMyNumberEnumAccess().getValuesAssignment_1_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2549:1: ( rule__MyNumberEnum__ValuesAssignment_1_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2549:2: rule__MyNumberEnum__ValuesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyNumberEnum__ValuesAssignment_1_1_in_rule__MyNumberEnum__Group_1__1__Impl5151);
            rule__MyNumberEnum__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMyNumberEnumAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2563:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2567:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2568:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05185);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05188);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2575:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2579:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2580:1: ( ( '-' )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2580:1: ( ( '-' )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2581:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2582:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2583:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EInt__Group__0__Impl5217); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2594:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2598:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2599:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15250);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2605:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2609:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2610:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2610:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2611:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5277); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group_0__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2626:1: rule__EDouble__Group_0__0 : rule__EDouble__Group_0__0__Impl rule__EDouble__Group_0__1 ;
    public final void rule__EDouble__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2630:1: ( rule__EDouble__Group_0__0__Impl rule__EDouble__Group_0__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2631:2: rule__EDouble__Group_0__0__Impl rule__EDouble__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__0__Impl_in_rule__EDouble__Group_0__05310);
            rule__EDouble__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__1_in_rule__EDouble__Group_0__05313);
            rule__EDouble__Group_0__1();

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
    // $ANTLR end "rule__EDouble__Group_0__0"


    // $ANTLR start "rule__EDouble__Group_0__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2638:1: rule__EDouble__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2642:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2643:1: ( ( '-' )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2643:1: ( ( '-' )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2644:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2645:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2646:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group_0__0__Impl5342); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0__0__Impl"


    // $ANTLR start "rule__EDouble__Group_0__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2657:1: rule__EDouble__Group_0__1 : rule__EDouble__Group_0__1__Impl rule__EDouble__Group_0__2 ;
    public final void rule__EDouble__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2661:1: ( rule__EDouble__Group_0__1__Impl rule__EDouble__Group_0__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2662:2: rule__EDouble__Group_0__1__Impl rule__EDouble__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__1__Impl_in_rule__EDouble__Group_0__15375);
            rule__EDouble__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__2_in_rule__EDouble__Group_0__15378);
            rule__EDouble__Group_0__2();

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
    // $ANTLR end "rule__EDouble__Group_0__1"


    // $ANTLR start "rule__EDouble__Group_0__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2669:1: rule__EDouble__Group_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2674:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2674:1: ( ( RULE_INT )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2675:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2676:1: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2676:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_0__1__Impl5406); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0__1__Impl"


    // $ANTLR start "rule__EDouble__Group_0__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2686:1: rule__EDouble__Group_0__2 : rule__EDouble__Group_0__2__Impl rule__EDouble__Group_0__3 ;
    public final void rule__EDouble__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2690:1: ( rule__EDouble__Group_0__2__Impl rule__EDouble__Group_0__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2691:2: rule__EDouble__Group_0__2__Impl rule__EDouble__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__2__Impl_in_rule__EDouble__Group_0__25437);
            rule__EDouble__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__3_in_rule__EDouble__Group_0__25440);
            rule__EDouble__Group_0__3();

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
    // $ANTLR end "rule__EDouble__Group_0__2"


    // $ANTLR start "rule__EDouble__Group_0__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2698:1: rule__EDouble__Group_0__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2702:1: ( ( '.' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2703:1: ( '.' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2703:1: ( '.' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2704:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_0_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group_0__2__Impl5468); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0__2__Impl"


    // $ANTLR start "rule__EDouble__Group_0__3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2717:1: rule__EDouble__Group_0__3 : rule__EDouble__Group_0__3__Impl rule__EDouble__Group_0__4 ;
    public final void rule__EDouble__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2721:1: ( rule__EDouble__Group_0__3__Impl rule__EDouble__Group_0__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2722:2: rule__EDouble__Group_0__3__Impl rule__EDouble__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__3__Impl_in_rule__EDouble__Group_0__35499);
            rule__EDouble__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__4_in_rule__EDouble__Group_0__35502);
            rule__EDouble__Group_0__4();

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
    // $ANTLR end "rule__EDouble__Group_0__3"


    // $ANTLR start "rule__EDouble__Group_0__3__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2729:1: rule__EDouble__Group_0__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2733:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2734:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2734:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2735:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_0__3__Impl5529); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0__3__Impl"


    // $ANTLR start "rule__EDouble__Group_0__4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2746:1: rule__EDouble__Group_0__4 : rule__EDouble__Group_0__4__Impl ;
    public final void rule__EDouble__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2750:1: ( rule__EDouble__Group_0__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2751:2: rule__EDouble__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0__4__Impl_in_rule__EDouble__Group_0__45558);
            rule__EDouble__Group_0__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group_0__4"


    // $ANTLR start "rule__EDouble__Group_0__4__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2757:1: rule__EDouble__Group_0__4__Impl : ( ( rule__EDouble__Group_0_4__0 )? ) ;
    public final void rule__EDouble__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2761:1: ( ( ( rule__EDouble__Group_0_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2762:1: ( ( rule__EDouble__Group_0_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2762:1: ( ( rule__EDouble__Group_0_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2763:1: ( rule__EDouble__Group_0_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_0_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2764:1: ( rule__EDouble__Group_0_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2764:2: rule__EDouble__Group_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__0_in_rule__EDouble__Group_0__4__Impl5585);
                    rule__EDouble__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0__4__Impl"


    // $ANTLR start "rule__EDouble__Group_0_4__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2784:1: rule__EDouble__Group_0_4__0 : rule__EDouble__Group_0_4__0__Impl rule__EDouble__Group_0_4__1 ;
    public final void rule__EDouble__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2788:1: ( rule__EDouble__Group_0_4__0__Impl rule__EDouble__Group_0_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2789:2: rule__EDouble__Group_0_4__0__Impl rule__EDouble__Group_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__0__Impl_in_rule__EDouble__Group_0_4__05626);
            rule__EDouble__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__1_in_rule__EDouble__Group_0_4__05629);
            rule__EDouble__Group_0_4__1();

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
    // $ANTLR end "rule__EDouble__Group_0_4__0"


    // $ANTLR start "rule__EDouble__Group_0_4__0__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2796:1: rule__EDouble__Group_0_4__0__Impl : ( ( rule__EDouble__Alternatives_0_4_0 ) ) ;
    public final void rule__EDouble__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2800:1: ( ( ( rule__EDouble__Alternatives_0_4_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2801:1: ( ( rule__EDouble__Alternatives_0_4_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2801:1: ( ( rule__EDouble__Alternatives_0_4_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2802:1: ( rule__EDouble__Alternatives_0_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_0_4_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2803:1: ( rule__EDouble__Alternatives_0_4_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2803:2: rule__EDouble__Alternatives_0_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_0_4_0_in_rule__EDouble__Group_0_4__0__Impl5656);
            rule__EDouble__Alternatives_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_0_4__1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2813:1: rule__EDouble__Group_0_4__1 : rule__EDouble__Group_0_4__1__Impl rule__EDouble__Group_0_4__2 ;
    public final void rule__EDouble__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2817:1: ( rule__EDouble__Group_0_4__1__Impl rule__EDouble__Group_0_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2818:2: rule__EDouble__Group_0_4__1__Impl rule__EDouble__Group_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__1__Impl_in_rule__EDouble__Group_0_4__15686);
            rule__EDouble__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__2_in_rule__EDouble__Group_0_4__15689);
            rule__EDouble__Group_0_4__2();

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
    // $ANTLR end "rule__EDouble__Group_0_4__1"


    // $ANTLR start "rule__EDouble__Group_0_4__1__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2825:1: rule__EDouble__Group_0_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2829:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2830:1: ( ( '-' )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2830:1: ( ( '-' )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2831:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_4_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2832:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2833:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group_0_4__1__Impl5718); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_0_4__2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2844:1: rule__EDouble__Group_0_4__2 : rule__EDouble__Group_0_4__2__Impl ;
    public final void rule__EDouble__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2848:1: ( rule__EDouble__Group_0_4__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2849:2: rule__EDouble__Group_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_0_4__2__Impl_in_rule__EDouble__Group_0_4__25751);
            rule__EDouble__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_0_4__2"


    // $ANTLR start "rule__EDouble__Group_0_4__2__Impl"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2855:1: rule__EDouble__Group_0_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2859:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2860:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2860:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2861:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_0_4__2__Impl5778); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_0_4__2__Impl"


    // $ANTLR start "rule__MyModel__NameAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2879:1: rule__MyModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2883:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2884:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2884:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2885:1: ruleEString
            {
             before(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_15818);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2894:1: rule__MyModel__MyModelContainsAssignment_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2898:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2899:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2899:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2900:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_15849);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2909:1: rule__MyModel__MyModelContainsAssignment_2_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2913:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2914:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2914:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2915:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_15880);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2924:1: rule__MyObject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2928:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2929:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2929:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2930:1: ruleEString
            {
             before(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_15911);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2939:1: rule__MyObject__MyAttributeContainsAssignment_3_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2943:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2944:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2944:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2945:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_15942);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2954:1: rule__MyObject__MyAttributeContainsAssignment_3_2_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2958:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2959:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2959:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2960:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_15973);
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


    // $ANTLR start "rule__MyObject__MyObjectHasAssignment_4_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2969:1: rule__MyObject__MyObjectHasAssignment_4_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2973:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2974:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2974:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2975:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_16004);
            rulemyConstraint();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyObjectHasAssignment_4_1"


    // $ANTLR start "rule__MyObject__MyObjectHasAssignment_4_2_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2984:1: rule__MyObject__MyObjectHasAssignment_4_2_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2988:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2989:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2989:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2990:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_16035);
            rulemyConstraint();

            state._fsp--;

             after(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__MyObjectHasAssignment_4_2_1"


    // $ANTLR start "rule__MyConstraint__MyIfConstraintAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2999:1: rule__MyConstraint__MyIfConstraintAssignment_1 : ( rulemyConcreteExpression ) ;
    public final void rule__MyConstraint__MyIfConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3003:1: ( ( rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3004:1: ( rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3004:1: ( rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3005:1: rulemyConcreteExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyConcreteExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rule__MyConstraint__MyIfConstraintAssignment_16066);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyConcreteExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__MyIfConstraintAssignment_1"


    // $ANTLR start "rule__MyConstraint__MyThenConstraintAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3014:1: rule__MyConstraint__MyThenConstraintAssignment_3 : ( rulemyConcreteExpression ) ;
    public final void rule__MyConstraint__MyThenConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3018:1: ( ( rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3019:1: ( rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3019:1: ( rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3020:1: rulemyConcreteExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyConcreteExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rule__MyConstraint__MyThenConstraintAssignment_36097);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyConcreteExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__MyThenConstraintAssignment_3"


    // $ANTLR start "rule__MyAttribute__NameAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3029:1: rule__MyAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MyAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3033:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3034:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3034:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3035:1: ruleEString
            {
             before(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_06128);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3044:1: rule__MyAttribute__MyAttributeContainsAssignment_2 : ( rulemyValue ) ;
    public final void rule__MyAttribute__MyAttributeContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3048:1: ( ( rulemyValue ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3049:1: ( rulemyValue )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3049:1: ( rulemyValue )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3050:1: rulemyValue
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_26159);
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


    // $ANTLR start "rule__MyConcreteExpression__MyConcreteExAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3059:1: rule__MyConcreteExpression__MyConcreteExAssignment : ( rulemyExpression ) ;
    public final void rule__MyConcreteExpression__MyConcreteExAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3063:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3064:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3064:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3065:1: rulemyExpression
            {
             before(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExMyExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConcreteExpression__MyConcreteExAssignment6190);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExMyExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConcreteExpression__MyConcreteExAssignment"


    // $ANTLR start "rule__MyBinary__MyBinaryLeftAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3074:1: rule__MyBinary__MyBinaryLeftAssignment_1 : ( rulemyConcreteExpression ) ;
    public final void rule__MyBinary__MyBinaryLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3078:1: ( ( rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3079:1: ( rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3079:1: ( rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3080:1: rulemyConcreteExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyConcreteExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rule__MyBinary__MyBinaryLeftAssignment_16221);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyConcreteExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__MyBinaryLeftAssignment_1"


    // $ANTLR start "rule__MyBinary__OparandAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3089:1: rule__MyBinary__OparandAssignment_2 : ( rulemyBinaryOparators ) ;
    public final void rule__MyBinary__OparandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3093:1: ( ( rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3094:1: ( rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3094:1: ( rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3095:1: rulemyBinaryOparators
            {
             before(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_26252);
            rulemyBinaryOparators();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__OparandAssignment_2"


    // $ANTLR start "rule__MyBinary__MyBinaryRightAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3104:1: rule__MyBinary__MyBinaryRightAssignment_3 : ( rulemyConcreteExpression ) ;
    public final void rule__MyBinary__MyBinaryRightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3108:1: ( ( rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3109:1: ( rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3109:1: ( rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3110:1: rulemyConcreteExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyConcreteExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rule__MyBinary__MyBinaryRightAssignment_36283);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyConcreteExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__MyBinaryRightAssignment_3"


    // $ANTLR start "rule__MyUnary__OparandAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3119:1: rule__MyUnary__OparandAssignment_0 : ( rulemyUnaryOparators ) ;
    public final void rule__MyUnary__OparandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3123:1: ( ( rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3124:1: ( rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3124:1: ( rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3125:1: rulemyUnaryOparators
            {
             before(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_06314);
            rulemyUnaryOparators();

            state._fsp--;

             after(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__OparandAssignment_0"


    // $ANTLR start "rule__MyUnary__MyUnaryExpressionAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3134:1: rule__MyUnary__MyUnaryExpressionAssignment_1 : ( rulemyConcreteExpression ) ;
    public final void rule__MyUnary__MyUnaryExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3138:1: ( ( rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3139:1: ( rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3139:1: ( rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3140:1: rulemyConcreteExpression
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyConcreteExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_16345);
            rulemyConcreteExpression();

            state._fsp--;

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyConcreteExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__MyUnaryExpressionAssignment_1"


    // $ANTLR start "rule__MyBoolean__TrueValueAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3149:1: rule__MyBoolean__TrueValueAssignment_0 : ( ruleEString ) ;
    public final void rule__MyBoolean__TrueValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3153:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3154:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3154:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3155:1: ruleEString
            {
             before(grammarAccess.getMyBooleanAccess().getTrueValueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyBoolean__TrueValueAssignment_06376);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyBooleanAccess().getTrueValueEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__TrueValueAssignment_0"


    // $ANTLR start "rule__MyBoolean__FalseValueAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3164:1: rule__MyBoolean__FalseValueAssignment_2 : ( ruleEString ) ;
    public final void rule__MyBoolean__FalseValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3168:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3169:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3169:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3170:1: ruleEString
            {
             before(grammarAccess.getMyBooleanAccess().getFalseValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyBoolean__FalseValueAssignment_26407);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyBooleanAccess().getFalseValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__FalseValueAssignment_2"


    // $ANTLR start "rule__MyIdentifier__MyIntentifierIsAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3179:1: rule__MyIdentifier__MyIntentifierIsAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__MyIdentifier__MyIntentifierIsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3183:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3184:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3184:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3185:1: ( ruleEString )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_1_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3186:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3187:1: ruleEString
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_16442);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__MyIntentifierIsAssignment_1"


    // $ANTLR start "rule__MyRange__FromAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3198:1: rule__MyRange__FromAssignment_0 : ( RULE_INT ) ;
    public final void rule__MyRange__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3202:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3203:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3203:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3204:1: RULE_INT
            {
             before(grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MyRange__FromAssignment_06477); 
             after(grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__FromAssignment_0"


    // $ANTLR start "rule__MyRange__ToAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3213:1: rule__MyRange__ToAssignment_2 : ( RULE_INT ) ;
    public final void rule__MyRange__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3217:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3218:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3218:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3219:1: RULE_INT
            {
             before(grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MyRange__ToAssignment_26508); 
             after(grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyRange__ToAssignment_2"


    // $ANTLR start "rule__MyStringEnum__ValuesAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3228:1: rule__MyStringEnum__ValuesAssignment_0 : ( ruleEString ) ;
    public final void rule__MyStringEnum__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3232:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3233:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3233:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3234:1: ruleEString
            {
             before(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyStringEnum__ValuesAssignment_06539);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__ValuesAssignment_0"


    // $ANTLR start "rule__MyStringEnum__ValuesAssignment_1_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3243:1: rule__MyStringEnum__ValuesAssignment_1_1 : ( ruleEString ) ;
    public final void rule__MyStringEnum__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3247:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3248:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3248:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3249:1: ruleEString
            {
             before(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyStringEnum__ValuesAssignment_1_16570);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringEnum__ValuesAssignment_1_1"


    // $ANTLR start "rule__MyNumberEnum__ValuesAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3258:1: rule__MyNumberEnum__ValuesAssignment_0 : ( ruleEDouble ) ;
    public final void rule__MyNumberEnum__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3262:1: ( ( ruleEDouble ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3263:1: ( ruleEDouble )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3263:1: ( ruleEDouble )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3264:1: ruleEDouble
            {
             before(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__MyNumberEnum__ValuesAssignment_06601);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__ValuesAssignment_0"


    // $ANTLR start "rule__MyNumberEnum__ValuesAssignment_1_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3273:1: rule__MyNumberEnum__ValuesAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__MyNumberEnum__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3277:1: ( ( ruleEDouble ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3278:1: ( ruleEDouble )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3278:1: ( ruleEDouble )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:3279:1: ruleEDouble
            {
             before(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__MyNumberEnum__ValuesAssignment_1_16632);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumberEnum__ValuesAssignment_1_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\3\uffff\2\11\1\6\5\uffff";
    static final String DFA2_minS =
        "\1\4\2\uffff\3\16\5\uffff";
    static final String DFA2_maxS =
        "\1\42\2\uffff\2\37\1\42\5\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\1\3\1\5\1\4";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\4\1\5\4\uffff\1\2\21\uffff\1\1\2\uffff\1\7\2\6",
            "",
            "",
            "\10\11\1\uffff\2\11\5\uffff\1\11\1\10",
            "\10\11\1\uffff\2\11\5\uffff\1\11\1\10",
            "\10\6\1\uffff\2\6\5\uffff\1\6\2\uffff\1\12\1\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "611:1: rule__MyExpression__Alternatives : ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyBoolean ) | ( rulemyRange ) | ( rulemyStringEnum ) | ( rulemyNumberEnum ) | ( rulemyIdentifier ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulemyModel_in_entryRulemyModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__0_in_rulemyModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyValue__Alternatives_in_rulemyValue154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_entryRulemyExpression181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyExpression188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyExpression__Alternatives_in_rulemyExpression214 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_entryRulemyConcreteExpression481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConcreteExpression488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConcreteExpression__MyConcreteExAssignment_in_rulemyConcreteExpression514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0_in_rulemyBinary574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0_in_rulemyUnary634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_entryRulemyBoolean661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBoolean668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__0_in_rulemyBoolean694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__0_in_rulemyIdentifier754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0_in_rulemyRange814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyStringEnum848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group__0_in_rulemyStringEnum874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyNumberEnum908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group__0_in_rulemyNumberEnum934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_in_ruleEDouble1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulemyUnaryOparators1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rule__MyValue__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rule__MyValue__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rule__MyValue__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rule__MyExpression__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rule__MyExpression__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rule__MyExpression__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rule__MyExpression__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__0_in_rule__EDouble__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__EDouble__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_0_4_01485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EDouble__Alternatives_0_4_01505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MyBinaryOparators__Alternatives1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MyBinaryOparators__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11781 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MyModel__Group_2__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__11967 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__11970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__22027 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__22030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl2057 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MyModel__Group_2__3__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyModel__Group_2_2__0__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02278 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12339 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22399 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MyObject__Group__2__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32461 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42522 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MyObject__Group__5__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group_3__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12716 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2803 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02840 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group_3_2__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__02963 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__02966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_4__0__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13025 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3112 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03149 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group_4_2__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03272 = new BitSet(new long[]{0x0000000720000870L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MyConstraint__Group__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13334 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyIfConstraintAssignment_1_in_rule__MyConstraint__Group__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23394 = new BitSet(new long[]{0x0000000720000870L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MyConstraint__Group__2__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyThenConstraintAssignment_3_in_rule__MyConstraint__Group__3__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03521 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13581 = new BitSet(new long[]{0x0000000600000070L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MyAttribute__Group__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23643 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyAttribute__Group__3__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03770 = new BitSet(new long[]{0x0000000720000870L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MyBinary__Group__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13832 = new BitSet(new long[]{0x00000000003FC000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23892 = new BitSet(new long[]{0x0000000720000870L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33952 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryRightAssignment_3_in_rule__MyBinary__Group__3__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__44012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MyBinary__Group__4__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04081 = new BitSet(new long[]{0x0000000720000870L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_1_in_rule__MyUnary__Group__1__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__0__Impl_in_rule__MyBoolean__Group__04202 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__1_in_rule__MyBoolean__Group__04205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__TrueValueAssignment_0_in_rule__MyBoolean__Group__0__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__1__Impl_in_rule__MyBoolean__Group__14262 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__2_in_rule__MyBoolean__Group__14265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyBoolean__Group__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__Group__2__Impl_in_rule__MyBoolean__Group__24324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBoolean__FalseValueAssignment_2_in_rule__MyBoolean__Group__2__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__0__Impl_in_rule__MyIdentifier__Group__04387 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1_in_rule__MyIdentifier__Group__04390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MyIdentifier__Group__0__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__Group__1__Impl_in_rule__MyIdentifier__Group__14449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_1_in_rule__MyIdentifier__Group__1__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04510 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__FromAssignment_0_in_rule__MyRange__Group__0__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14570 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MyRange__Group__1__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__ToAssignment_2_in_rule__MyRange__Group__2__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group__0__Impl_in_rule__MyStringEnum__Group__04695 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group__1_in_rule__MyStringEnum__Group__04698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__ValuesAssignment_0_in_rule__MyStringEnum__Group__0__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group__1__Impl_in_rule__MyStringEnum__Group__14755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group_1__0_in_rule__MyStringEnum__Group__1__Impl4782 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group_1__0__Impl_in_rule__MyStringEnum__Group_1__04817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group_1__1_in_rule__MyStringEnum__Group_1__04820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyStringEnum__Group_1__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__Group_1__1__Impl_in_rule__MyStringEnum__Group_1__14879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyStringEnum__ValuesAssignment_1_1_in_rule__MyStringEnum__Group_1__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group__0__Impl_in_rule__MyNumberEnum__Group__04940 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group__1_in_rule__MyNumberEnum__Group__04943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__ValuesAssignment_0_in_rule__MyNumberEnum__Group__0__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group__1__Impl_in_rule__MyNumberEnum__Group__15000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group_1__0_in_rule__MyNumberEnum__Group__1__Impl5027 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group_1__0__Impl_in_rule__MyNumberEnum__Group_1__05062 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group_1__1_in_rule__MyNumberEnum__Group_1__05065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyNumberEnum__Group_1__0__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__Group_1__1__Impl_in_rule__MyNumberEnum__Group_1__15124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyNumberEnum__ValuesAssignment_1_1_in_rule__MyNumberEnum__Group_1__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05185 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EInt__Group__0__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__0__Impl_in_rule__EDouble__Group_0__05310 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__1_in_rule__EDouble__Group_0__05313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group_0__0__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__1__Impl_in_rule__EDouble__Group_0__15375 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__2_in_rule__EDouble__Group_0__15378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_0__1__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__2__Impl_in_rule__EDouble__Group_0__25437 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__3_in_rule__EDouble__Group_0__25440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group_0__2__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__3__Impl_in_rule__EDouble__Group_0__35499 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__4_in_rule__EDouble__Group_0__35502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_0__3__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0__4__Impl_in_rule__EDouble__Group_0__45558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__0_in_rule__EDouble__Group_0__4__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__0__Impl_in_rule__EDouble__Group_0_4__05626 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__1_in_rule__EDouble__Group_0_4__05629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_0_4_0_in_rule__EDouble__Group_0_4__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__1__Impl_in_rule__EDouble__Group_0_4__15686 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__2_in_rule__EDouble__Group_0_4__15689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group_0_4__1__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_0_4__2__Impl_in_rule__EDouble__Group_0_4__25751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_0_4__2__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_15818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_15849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_15880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_15911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_15942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_15973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_16004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_16035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rule__MyConstraint__MyIfConstraintAssignment_16066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rule__MyConstraint__MyThenConstraintAssignment_36097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_06128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_26159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConcreteExpression__MyConcreteExAssignment6190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rule__MyBinary__MyBinaryLeftAssignment_16221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_26252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rule__MyBinary__MyBinaryRightAssignment_36283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_06314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_16345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyBoolean__TrueValueAssignment_06376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyBoolean__FalseValueAssignment_26407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment_16442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MyRange__FromAssignment_06477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MyRange__ToAssignment_26508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyStringEnum__ValuesAssignment_06539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyStringEnum__ValuesAssignment_1_16570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__MyNumberEnum__ValuesAssignment_06601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__MyNumberEnum__ValuesAssignment_1_16632 = new BitSet(new long[]{0x0000000000000002L});
    }


}