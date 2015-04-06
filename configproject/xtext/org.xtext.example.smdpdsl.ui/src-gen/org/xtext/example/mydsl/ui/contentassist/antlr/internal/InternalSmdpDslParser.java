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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyURI'", "'Boolean'", "'not'", "'&&'", "'|'", "'<'", "'>'", "'='", "'can'", "'if'", "'then'", "'{'", "'}'", "','", "'has'", "'Constrained by'", "'['", "']'", "'left'", "'right'", "'single'", "':'", "'-'"
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:321:1: rulemyString : ( ( rule__MyString__ValueAssignment ) ) ;
    public final void rulemyString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:325:2: ( ( ( rule__MyString__ValueAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyString__ValueAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:326:1: ( ( rule__MyString__ValueAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:327:1: ( rule__MyString__ValueAssignment )
            {
             before(grammarAccess.getMyStringAccess().getValueAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:1: ( rule__MyString__ValueAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:328:2: rule__MyString__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyString__ValueAssignment_in_rulemyString634);
            rule__MyString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:349:1: rulemyInt : ( ( rule__MyInt__ValueAssignment ) ) ;
    public final void rulemyInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:353:2: ( ( ( rule__MyInt__ValueAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyInt__ValueAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:354:1: ( ( rule__MyInt__ValueAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:355:1: ( rule__MyInt__ValueAssignment )
            {
             before(grammarAccess.getMyIntAccess().getValueAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:1: ( rule__MyInt__ValueAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:356:2: rule__MyInt__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyInt__ValueAssignment_in_rulemyInt694);
            rule__MyInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyIntAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:377:1: ruleBoolLiteral : ( ( rule__BoolLiteral__ValueAssignment ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:381:2: ( ( ( rule__BoolLiteral__ValueAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__BoolLiteral__ValueAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:382:1: ( ( rule__BoolLiteral__ValueAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:383:1: ( rule__BoolLiteral__ValueAssignment )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:1: ( rule__BoolLiteral__ValueAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:384:2: rule__BoolLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolLiteral__ValueAssignment_in_ruleBoolLiteral754);
            rule__BoolLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:405:1: rulemyIdentifier : ( ( rule__MyIdentifier__MyIntentifierIsAssignment ) ) ;
    public final void rulemyIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:409:2: ( ( ( rule__MyIdentifier__MyIntentifierIsAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:410:1: ( ( rule__MyIdentifier__MyIntentifierIsAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:411:1: ( rule__MyIdentifier__MyIntentifierIsAssignment )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:1: ( rule__MyIdentifier__MyIntentifierIsAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:412:2: rule__MyIdentifier__MyIntentifierIsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_in_rulemyIdentifier814);
            rule__MyIdentifier__MyIntentifierIsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:456:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:457:1: ( ruleBoolean EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:458:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean905);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean912); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:465:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:469:2: ( ( 'Boolean' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:470:1: ( 'Boolean' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:470:1: ( 'Boolean' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:471:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolean939); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:486:1: entryRulemyEnum : rulemyEnum EOF ;
    public final void entryRulemyEnum() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:487:1: ( rulemyEnum EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:488:1: rulemyEnum EOF
            {
             before(grammarAccess.getMyEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_entryRulemyEnum967);
            rulemyEnum();

            state._fsp--;

             after(grammarAccess.getMyEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyEnum974); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:495:1: rulemyEnum : ( ( rule__MyEnum__Group__0 ) ) ;
    public final void rulemyEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:499:2: ( ( ( rule__MyEnum__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:500:1: ( ( rule__MyEnum__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:500:1: ( ( rule__MyEnum__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:501:1: ( rule__MyEnum__Group__0 )
            {
             before(grammarAccess.getMyEnumAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:502:1: ( rule__MyEnum__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:502:2: rule__MyEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0_in_rulemyEnum1000);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:514:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:515:1: ( ruleBooleanValue EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:516:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1027);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1034); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:523:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:527:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:528:1: ( ( rule__BooleanValue__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:528:1: ( ( rule__BooleanValue__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:529:1: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:530:1: ( rule__BooleanValue__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:530:2: rule__BooleanValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue1060);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:542:1: entryRulemyRange : rulemyRange EOF ;
    public final void entryRulemyRange() throws RecognitionException {
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:543:1: ( rulemyRange EOF )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:544:1: rulemyRange EOF
            {
             before(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange1087);
            rulemyRange();

            state._fsp--;

             after(grammarAccess.getMyRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange1094); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:551:1: rulemyRange : ( ( rule__MyRange__Group__0 ) ) ;
    public final void rulemyRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:555:2: ( ( ( rule__MyRange__Group__0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:556:1: ( ( rule__MyRange__Group__0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:556:1: ( ( rule__MyRange__Group__0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:557:1: ( rule__MyRange__Group__0 )
            {
             before(grammarAccess.getMyRangeAccess().getGroup()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:558:1: ( rule__MyRange__Group__0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:558:2: rule__MyRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0_in_rulemyRange1120);
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


    // $ANTLR start "rulemyBinaryOparators"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:573:1: rulemyBinaryOparators : ( ( rule__MyBinaryOparators__Alternatives ) ) ;
    public final void rulemyBinaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:577:1: ( ( ( rule__MyBinaryOparators__Alternatives ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:578:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:578:1: ( ( rule__MyBinaryOparators__Alternatives ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:579:1: ( rule__MyBinaryOparators__Alternatives )
            {
             before(grammarAccess.getMyBinaryOparatorsAccess().getAlternatives()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:580:1: ( rule__MyBinaryOparators__Alternatives )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:580:2: rule__MyBinaryOparators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1159);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:592:1: rulemyUnaryOparators : ( ( 'not' ) ) ;
    public final void rulemyUnaryOparators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:596:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:597:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:597:1: ( ( 'not' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:598:1: ( 'not' )
            {
             before(grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:599:1: ( 'not' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:599:3: 'not'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_rulemyUnaryOparators1196); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:611:1: rule__MyExpression__Alternatives : ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyString ) | ( rulemyInt ) | ( ruleBoolLiteral ) | ( rulemyIdentifier ) );
    public final void rule__MyExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:615:1: ( ( rulemyBinary ) | ( rulemyUnary ) | ( rulemyString ) | ( rulemyInt ) | ( ruleBoolLiteral ) | ( rulemyIdentifier ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 13:
            case 31:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            case RULE_INT:
                {
                alt1=4;
                }
                break;
            case 12:
                {
                alt1=5;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:616:1: ( rulemyBinary )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:616:1: ( rulemyBinary )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:617:1: rulemyBinary
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1233);
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
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1250);
                    rulemyUnary();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:628:6: ( rulemyString )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:628:6: ( rulemyString )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:629:1: rulemyString
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyString_in_rule__MyExpression__Alternatives1267);
                    rulemyString();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:6: ( rulemyInt )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:634:6: ( rulemyInt )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:635:1: rulemyInt
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyInt_in_rule__MyExpression__Alternatives1284);
                    rulemyInt();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:640:6: ( ruleBoolLiteral )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:640:6: ( ruleBoolLiteral )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:641:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_rule__MyExpression__Alternatives1301);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:646:6: ( rulemyIdentifier )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:646:6: ( rulemyIdentifier )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:647:1: rulemyIdentifier
                    {
                     before(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1318);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:657:1: rule__MyValue__Alternatives : ( ( rulemyEnum ) | ( ruleBooleanValue ) | ( rulemyRange ) );
    public final void rule__MyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:661:1: ( ( rulemyEnum ) | ( ruleBooleanValue ) | ( rulemyRange ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==32) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==24||LA2_1==28) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||LA2_2==24||LA2_2==28) ) {
                    alt2=1;
                }
                else if ( (LA2_2==32) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:662:1: ( rulemyEnum )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:662:1: ( rulemyEnum )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:663:1: rulemyEnum
                    {
                     before(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_rule__MyValue__Alternatives1350);
                    rulemyEnum();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:668:6: ( ruleBooleanValue )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:668:6: ( ruleBooleanValue )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:669:1: ruleBooleanValue
                    {
                     before(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__MyValue__Alternatives1367);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:674:6: ( rulemyRange )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:674:6: ( rulemyRange )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:675:1: rulemyRange
                    {
                     before(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1384);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:685:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:689:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:690:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:690:1: ( RULE_STRING )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:691:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1416); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:696:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:696:6: ( RULE_ID )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:697:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1433); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:707:1: rule__MyBinaryOparators__Alternatives : ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) );
    public final void rule__MyBinaryOparators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:711:1: ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
                {
                alt4=7;
                }
                break;
            case 21:
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:712:1: ( ( '&&' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:712:1: ( ( '&&' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:713:1: ( '&&' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:714:1: ( '&&' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:714:3: '&&'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__MyBinaryOparators__Alternatives1466); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:719:6: ( ( '|' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:719:6: ( ( '|' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:720:1: ( '|' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:721:1: ( '|' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:721:3: '|'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__MyBinaryOparators__Alternatives1487); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:726:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:726:6: ( ( '<' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:727:1: ( '<' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:728:1: ( '<' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:728:3: '<'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1508); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:733:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:733:6: ( ( '>' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:734:1: ( '>' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:735:1: ( '>' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:735:3: '>'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1529); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:740:6: ( ( '=' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:740:6: ( ( '=' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:741:1: ( '=' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:742:1: ( '=' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:742:3: '='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1550); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:747:6: ( ( 'can' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:747:6: ( ( 'can' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:748:1: ( 'can' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:749:1: ( 'can' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:749:3: 'can'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1571); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:754:6: ( ( 'if' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:754:6: ( ( 'if' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:755:1: ( 'if' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:756:1: ( 'if' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:756:3: 'if'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1592); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:761:6: ( ( 'then' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:761:6: ( ( 'then' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:762:1: ( 'then' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:763:1: ( 'then' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:763:3: 'then'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1613); 

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:1: rule__MyModel__Group__0 : rule__MyModel__Group__0__Impl rule__MyModel__Group__1 ;
    public final void rule__MyModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:779:1: ( rule__MyModel__Group__0__Impl rule__MyModel__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:780:2: rule__MyModel__Group__0__Impl rule__MyModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01646);
            rule__MyModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01649);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:787:1: rule__MyModel__Group__0__Impl : ( () ) ;
    public final void rule__MyModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:791:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:792:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:792:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:793:1: ()
            {
             before(grammarAccess.getMyModelAccess().getMyModelAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:794:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:796:1: 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:806:1: rule__MyModel__Group__1 : rule__MyModel__Group__1__Impl rule__MyModel__Group__2 ;
    public final void rule__MyModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:810:1: ( rule__MyModel__Group__1__Impl rule__MyModel__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:811:2: rule__MyModel__Group__1__Impl rule__MyModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11707);
            rule__MyModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11710);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:818:1: rule__MyModel__Group__1__Impl : ( ( rule__MyModel__NameAssignment_1 ) ) ;
    public final void rule__MyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:822:1: ( ( ( rule__MyModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:823:1: ( ( rule__MyModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:823:1: ( ( rule__MyModel__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:824:1: ( rule__MyModel__NameAssignment_1 )
            {
             before(grammarAccess.getMyModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:825:1: ( rule__MyModel__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:825:2: rule__MyModel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1737);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:835:1: rule__MyModel__Group__2 : rule__MyModel__Group__2__Impl ;
    public final void rule__MyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:839:1: ( rule__MyModel__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:840:2: rule__MyModel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21767);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:846:1: rule__MyModel__Group__2__Impl : ( ( rule__MyModel__Group_2__0 )? ) ;
    public final void rule__MyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:850:1: ( ( ( rule__MyModel__Group_2__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:851:1: ( ( rule__MyModel__Group_2__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:851:1: ( ( rule__MyModel__Group_2__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:852:1: ( rule__MyModel__Group_2__0 )?
            {
             before(grammarAccess.getMyModelAccess().getGroup_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:853:1: ( rule__MyModel__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:853:2: rule__MyModel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1794);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:869:1: rule__MyModel__Group_2__0 : rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 ;
    public final void rule__MyModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:873:1: ( rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:874:2: rule__MyModel__Group_2__0__Impl rule__MyModel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01831);
            rule__MyModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01834);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:881:1: rule__MyModel__Group_2__0__Impl : ( '{' ) ;
    public final void rule__MyModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:885:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:886:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:886:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:887:1: '{'
            {
             before(grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MyModel__Group_2__0__Impl1862); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:900:1: rule__MyModel__Group_2__1 : rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 ;
    public final void rule__MyModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:904:1: ( rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:905:2: rule__MyModel__Group_2__1__Impl rule__MyModel__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__11893);
            rule__MyModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__11896);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:912:1: rule__MyModel__Group_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) ;
    public final void rule__MyModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:916:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:917:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:917:1: ( ( rule__MyModel__MyModelContainsAssignment_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:918:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:919:1: ( rule__MyModel__MyModelContainsAssignment_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:919:2: rule__MyModel__MyModelContainsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl1923);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:929:1: rule__MyModel__Group_2__2 : rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 ;
    public final void rule__MyModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:933:1: ( rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:934:2: rule__MyModel__Group_2__2__Impl rule__MyModel__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__21953);
            rule__MyModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__21956);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:941:1: rule__MyModel__Group_2__2__Impl : ( ( rule__MyModel__Group_2_2__0 )* ) ;
    public final void rule__MyModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:945:1: ( ( ( rule__MyModel__Group_2_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:946:1: ( ( rule__MyModel__Group_2_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:946:1: ( ( rule__MyModel__Group_2_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:947:1: ( rule__MyModel__Group_2_2__0 )*
            {
             before(grammarAccess.getMyModelAccess().getGroup_2_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:948:1: ( rule__MyModel__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:948:2: rule__MyModel__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl1983);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:958:1: rule__MyModel__Group_2__3 : rule__MyModel__Group_2__3__Impl ;
    public final void rule__MyModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:962:1: ( rule__MyModel__Group_2__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:963:2: rule__MyModel__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32014);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:969:1: rule__MyModel__Group_2__3__Impl : ( '}' ) ;
    public final void rule__MyModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:973:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:974:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:974:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:975:1: '}'
            {
             before(grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MyModel__Group_2__3__Impl2042); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:996:1: rule__MyModel__Group_2_2__0 : rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 ;
    public final void rule__MyModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1000:1: ( rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1001:2: rule__MyModel__Group_2_2__0__Impl rule__MyModel__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02081);
            rule__MyModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02084);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1008:1: rule__MyModel__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__MyModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1012:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1013:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1013:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1014:1: ','
            {
             before(grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyModel__Group_2_2__0__Impl2112); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1027:1: rule__MyModel__Group_2_2__1 : rule__MyModel__Group_2_2__1__Impl ;
    public final void rule__MyModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1031:1: ( rule__MyModel__Group_2_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1032:2: rule__MyModel__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12143);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1038:1: rule__MyModel__Group_2_2__1__Impl : ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) ;
    public final void rule__MyModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1042:1: ( ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1043:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1043:1: ( ( rule__MyModel__MyModelContainsAssignment_2_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1044:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1045:1: ( rule__MyModel__MyModelContainsAssignment_2_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1045:2: rule__MyModel__MyModelContainsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2170);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1059:1: rule__MyObject__Group__0 : rule__MyObject__Group__0__Impl rule__MyObject__Group__1 ;
    public final void rule__MyObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1063:1: ( rule__MyObject__Group__0__Impl rule__MyObject__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1064:2: rule__MyObject__Group__0__Impl rule__MyObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02204);
            rule__MyObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02207);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1071:1: rule__MyObject__Group__0__Impl : ( () ) ;
    public final void rule__MyObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1075:1: ( ( () ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1076:1: ( () )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1076:1: ( () )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1077:1: ()
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectAction_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1078:1: ()
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1080:1: 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1090:1: rule__MyObject__Group__1 : rule__MyObject__Group__1__Impl rule__MyObject__Group__2 ;
    public final void rule__MyObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1094:1: ( rule__MyObject__Group__1__Impl rule__MyObject__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1095:2: rule__MyObject__Group__1__Impl rule__MyObject__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12265);
            rule__MyObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12268);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1102:1: rule__MyObject__Group__1__Impl : ( ( rule__MyObject__NameAssignment_1 ) ) ;
    public final void rule__MyObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1106:1: ( ( ( rule__MyObject__NameAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1107:1: ( ( rule__MyObject__NameAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1107:1: ( ( rule__MyObject__NameAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1108:1: ( rule__MyObject__NameAssignment_1 )
            {
             before(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1109:1: ( rule__MyObject__NameAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1109:2: rule__MyObject__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2295);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1119:1: rule__MyObject__Group__2 : rule__MyObject__Group__2__Impl rule__MyObject__Group__3 ;
    public final void rule__MyObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1123:1: ( rule__MyObject__Group__2__Impl rule__MyObject__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1124:2: rule__MyObject__Group__2__Impl rule__MyObject__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22325);
            rule__MyObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22328);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1131:1: rule__MyObject__Group__2__Impl : ( '{' ) ;
    public final void rule__MyObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1135:1: ( ( '{' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1136:1: ( '{' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1136:1: ( '{' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1137:1: '{'
            {
             before(grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MyObject__Group__2__Impl2356); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1150:1: rule__MyObject__Group__3 : rule__MyObject__Group__3__Impl rule__MyObject__Group__4 ;
    public final void rule__MyObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1154:1: ( rule__MyObject__Group__3__Impl rule__MyObject__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1155:2: rule__MyObject__Group__3__Impl rule__MyObject__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32387);
            rule__MyObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32390);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1162:1: rule__MyObject__Group__3__Impl : ( ( rule__MyObject__Group_3__0 )? ) ;
    public final void rule__MyObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1166:1: ( ( ( rule__MyObject__Group_3__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1167:1: ( ( rule__MyObject__Group_3__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1167:1: ( ( rule__MyObject__Group_3__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1168:1: ( rule__MyObject__Group_3__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1169:1: ( rule__MyObject__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1169:2: rule__MyObject__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2417);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1179:1: rule__MyObject__Group__4 : rule__MyObject__Group__4__Impl rule__MyObject__Group__5 ;
    public final void rule__MyObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1183:1: ( rule__MyObject__Group__4__Impl rule__MyObject__Group__5 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1184:2: rule__MyObject__Group__4__Impl rule__MyObject__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42448);
            rule__MyObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42451);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1191:1: rule__MyObject__Group__4__Impl : ( ( rule__MyObject__Group_4__0 )? ) ;
    public final void rule__MyObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1195:1: ( ( ( rule__MyObject__Group_4__0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1196:1: ( ( rule__MyObject__Group_4__0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1196:1: ( ( rule__MyObject__Group_4__0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1197:1: ( rule__MyObject__Group_4__0 )?
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1198:1: ( rule__MyObject__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1198:2: rule__MyObject__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2478);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1208:1: rule__MyObject__Group__5 : rule__MyObject__Group__5__Impl ;
    public final void rule__MyObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1212:1: ( rule__MyObject__Group__5__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1213:2: rule__MyObject__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52509);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1219:1: rule__MyObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MyObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1223:1: ( ( '}' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1224:1: ( '}' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1224:1: ( '}' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1225:1: '}'
            {
             before(grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MyObject__Group__5__Impl2537); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1250:1: rule__MyObject__Group_3__0 : rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 ;
    public final void rule__MyObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1254:1: ( rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1255:2: rule__MyObject__Group_3__0__Impl rule__MyObject__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02580);
            rule__MyObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02583);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1262:1: rule__MyObject__Group_3__0__Impl : ( 'has' ) ;
    public final void rule__MyObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1266:1: ( ( 'has' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1267:1: ( 'has' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1267:1: ( 'has' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1268:1: 'has'
            {
             before(grammarAccess.getMyObjectAccess().getHasKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MyObject__Group_3__0__Impl2611); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1281:1: rule__MyObject__Group_3__1 : rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 ;
    public final void rule__MyObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1285:1: ( rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1286:2: rule__MyObject__Group_3__1__Impl rule__MyObject__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12642);
            rule__MyObject__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12645);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1293:1: rule__MyObject__Group_3__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) ;
    public final void rule__MyObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1297:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1298:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1298:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1299:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1300:1: ( rule__MyObject__MyAttributeContainsAssignment_3_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1300:2: rule__MyObject__MyAttributeContainsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2672);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1310:1: rule__MyObject__Group_3__2 : rule__MyObject__Group_3__2__Impl ;
    public final void rule__MyObject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1314:1: ( rule__MyObject__Group_3__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1315:2: rule__MyObject__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22702);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1321:1: rule__MyObject__Group_3__2__Impl : ( ( rule__MyObject__Group_3_2__0 )* ) ;
    public final void rule__MyObject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1325:1: ( ( ( rule__MyObject__Group_3_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1326:1: ( ( rule__MyObject__Group_3_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1326:1: ( ( rule__MyObject__Group_3_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1327:1: ( rule__MyObject__Group_3_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_3_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1328:1: ( rule__MyObject__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1328:2: rule__MyObject__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2729);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1344:1: rule__MyObject__Group_3_2__0 : rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 ;
    public final void rule__MyObject__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1348:1: ( rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1349:2: rule__MyObject__Group_3_2__0__Impl rule__MyObject__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02766);
            rule__MyObject__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02769);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1356:1: rule__MyObject__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1360:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1361:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1361:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1362:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group_3_2__0__Impl2797); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1375:1: rule__MyObject__Group_3_2__1 : rule__MyObject__Group_3_2__1__Impl ;
    public final void rule__MyObject__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1379:1: ( rule__MyObject__Group_3_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1380:2: rule__MyObject__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12828);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1386:1: rule__MyObject__Group_3_2__1__Impl : ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) ;
    public final void rule__MyObject__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1390:1: ( ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1391:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1391:1: ( ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1392:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1393:1: ( rule__MyObject__MyAttributeContainsAssignment_3_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1393:2: rule__MyObject__MyAttributeContainsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2855);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1407:1: rule__MyObject__Group_4__0 : rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 ;
    public final void rule__MyObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1411:1: ( rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1412:2: rule__MyObject__Group_4__0__Impl rule__MyObject__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__02889);
            rule__MyObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__02892);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1419:1: rule__MyObject__Group_4__0__Impl : ( 'Constrained by' ) ;
    public final void rule__MyObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1423:1: ( ( 'Constrained by' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1424:1: ( 'Constrained by' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1424:1: ( 'Constrained by' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1425:1: 'Constrained by'
            {
             before(grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_4__0__Impl2920); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1438:1: rule__MyObject__Group_4__1 : rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 ;
    public final void rule__MyObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1442:1: ( rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1443:2: rule__MyObject__Group_4__1__Impl rule__MyObject__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__12951);
            rule__MyObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__12954);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1450:1: rule__MyObject__Group_4__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) ;
    public final void rule__MyObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1454:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1455:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1455:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1456:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1457:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1457:2: rule__MyObject__MyObjectHasAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl2981);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1467:1: rule__MyObject__Group_4__2 : rule__MyObject__Group_4__2__Impl ;
    public final void rule__MyObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1471:1: ( rule__MyObject__Group_4__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1472:2: rule__MyObject__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23011);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1478:1: rule__MyObject__Group_4__2__Impl : ( ( rule__MyObject__Group_4_2__0 )* ) ;
    public final void rule__MyObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1482:1: ( ( ( rule__MyObject__Group_4_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1483:1: ( ( rule__MyObject__Group_4_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1483:1: ( ( rule__MyObject__Group_4_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1484:1: ( rule__MyObject__Group_4_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1485:1: ( rule__MyObject__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1485:2: rule__MyObject__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3038);
            	    rule__MyObject__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1501:1: rule__MyObject__Group_4_2__0 : rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 ;
    public final void rule__MyObject__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1505:1: ( rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1506:2: rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03075);
            rule__MyObject__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03078);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1513:1: rule__MyObject__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1517:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1518:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1518:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1519:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyObject__Group_4_2__0__Impl3106); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1532:1: rule__MyObject__Group_4_2__1 : rule__MyObject__Group_4_2__1__Impl ;
    public final void rule__MyObject__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1536:1: ( rule__MyObject__Group_4_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1537:2: rule__MyObject__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13137);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1543:1: rule__MyObject__Group_4_2__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) ;
    public final void rule__MyObject__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1547:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1548:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1548:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1549:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1550:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1550:2: rule__MyObject__MyObjectHasAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3164);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1564:1: rule__MyConstraint__Group__0 : rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 ;
    public final void rule__MyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1568:1: ( rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1569:2: rule__MyConstraint__Group__0__Impl rule__MyConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03198);
            rule__MyConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03201);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1576:1: rule__MyConstraint__Group__0__Impl : ( 'if' ) ;
    public final void rule__MyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1580:1: ( ( 'if' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1581:1: ( 'if' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1581:1: ( 'if' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1582:1: 'if'
            {
             before(grammarAccess.getMyConstraintAccess().getIfKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MyConstraint__Group__0__Impl3229); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1595:1: rule__MyConstraint__Group__1 : rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 ;
    public final void rule__MyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1599:1: ( rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1600:2: rule__MyConstraint__Group__1__Impl rule__MyConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13260);
            rule__MyConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13263);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1607:1: rule__MyConstraint__Group__1__Impl : ( ( rule__MyConstraint__MyConstraintContainsAssignment_1 ) ) ;
    public final void rule__MyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1611:1: ( ( ( rule__MyConstraint__MyConstraintContainsAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1612:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1612:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1613:1: ( rule__MyConstraint__MyConstraintContainsAssignment_1 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1614:1: ( rule__MyConstraint__MyConstraintContainsAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1614:2: rule__MyConstraint__MyConstraintContainsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_1_in_rule__MyConstraint__Group__1__Impl3290);
            rule__MyConstraint__MyConstraintContainsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1624:1: rule__MyConstraint__Group__2 : rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 ;
    public final void rule__MyConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1628:1: ( rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1629:2: rule__MyConstraint__Group__2__Impl rule__MyConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23320);
            rule__MyConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23323);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1636:1: rule__MyConstraint__Group__2__Impl : ( 'then' ) ;
    public final void rule__MyConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1640:1: ( ( 'then' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1641:1: ( 'then' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1641:1: ( 'then' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1642:1: 'then'
            {
             before(grammarAccess.getMyConstraintAccess().getThenKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MyConstraint__Group__2__Impl3351); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1655:1: rule__MyConstraint__Group__3 : rule__MyConstraint__Group__3__Impl ;
    public final void rule__MyConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1659:1: ( rule__MyConstraint__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1660:2: rule__MyConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33382);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1666:1: rule__MyConstraint__Group__3__Impl : ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) ;
    public final void rule__MyConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1670:1: ( ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1671:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1671:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment_3 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1672:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_3()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1673:1: ( rule__MyConstraint__MyConstraintContainsAssignment_3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1673:2: rule__MyConstraint__MyConstraintContainsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl3409);
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


    // $ANTLR start "rule__MyAttribute__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1691:1: rule__MyAttribute__Group__0 : rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 ;
    public final void rule__MyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1695:1: ( rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1696:2: rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03447);
            rule__MyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03450);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1703:1: rule__MyAttribute__Group__0__Impl : ( ( rule__MyAttribute__NameAssignment_0 ) ) ;
    public final void rule__MyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1707:1: ( ( ( rule__MyAttribute__NameAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1708:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1708:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1709:1: ( rule__MyAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMyAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1710:1: ( rule__MyAttribute__NameAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1710:2: rule__MyAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3477);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1720:1: rule__MyAttribute__Group__1 : rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 ;
    public final void rule__MyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1724:1: ( rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1725:2: rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13507);
            rule__MyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13510);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1732:1: rule__MyAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__MyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1736:1: ( ( '[' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1737:1: ( '[' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1737:1: ( '[' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1738:1: '['
            {
             before(grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MyAttribute__Group__1__Impl3538); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1751:1: rule__MyAttribute__Group__2 : rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 ;
    public final void rule__MyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1755:1: ( rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1756:2: rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23569);
            rule__MyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23572);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1763:1: rule__MyAttribute__Group__2__Impl : ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) ;
    public final void rule__MyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1767:1: ( ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1768:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1768:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1769:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1770:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1770:2: rule__MyAttribute__MyAttributeContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3599);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1780:1: rule__MyAttribute__Group__3 : rule__MyAttribute__Group__3__Impl ;
    public final void rule__MyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1784:1: ( rule__MyAttribute__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1785:2: rule__MyAttribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33629);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1791:1: rule__MyAttribute__Group__3__Impl : ( ']' ) ;
    public final void rule__MyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( ']' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( ']' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( ']' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:1: ']'
            {
             before(grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyAttribute__Group__3__Impl3657); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1818:1: rule__MyBinary__Group__0 : rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 ;
    public final void rule__MyBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1822:1: ( rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1823:2: rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03696);
            rule__MyBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03699);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1830:1: rule__MyBinary__Group__0__Impl : ( 'left' ) ;
    public final void rule__MyBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1834:1: ( ( 'left' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1835:1: ( 'left' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1835:1: ( 'left' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1836:1: 'left'
            {
             before(grammarAccess.getMyBinaryAccess().getLeftKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MyBinary__Group__0__Impl3727); 
             after(grammarAccess.getMyBinaryAccess().getLeftKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1849:1: rule__MyBinary__Group__1 : rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 ;
    public final void rule__MyBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1853:1: ( rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1854:2: rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13758);
            rule__MyBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13761);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1861:1: rule__MyBinary__Group__1__Impl : ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) ;
    public final void rule__MyBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1865:1: ( ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1866:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1866:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1867:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1868:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1868:2: rule__MyBinary__MyBinaryLeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3788);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1878:1: rule__MyBinary__Group__2 : rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 ;
    public final void rule__MyBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1882:1: ( rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1883:2: rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23818);
            rule__MyBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23821);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1890:1: rule__MyBinary__Group__2__Impl : ( ( rule__MyBinary__OparandAssignment_2 )? ) ;
    public final void rule__MyBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1894:1: ( ( ( rule__MyBinary__OparandAssignment_2 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1895:1: ( ( rule__MyBinary__OparandAssignment_2 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1895:1: ( ( rule__MyBinary__OparandAssignment_2 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1896:1: ( rule__MyBinary__OparandAssignment_2 )?
            {
             before(grammarAccess.getMyBinaryAccess().getOparandAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1897:1: ( rule__MyBinary__OparandAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=14 && LA11_0<=21)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1897:2: rule__MyBinary__OparandAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3848);
                    rule__MyBinary__OparandAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1907:1: rule__MyBinary__Group__3 : rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 ;
    public final void rule__MyBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1911:1: ( rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1912:2: rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33879);
            rule__MyBinary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33882);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1919:1: rule__MyBinary__Group__3__Impl : ( 'right' ) ;
    public final void rule__MyBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1923:1: ( ( 'right' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:1: ( 'right' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:1: ( 'right' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1925:1: 'right'
            {
             before(grammarAccess.getMyBinaryAccess().getRightKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MyBinary__Group__3__Impl3910); 
             after(grammarAccess.getMyBinaryAccess().getRightKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1938:1: rule__MyBinary__Group__4 : rule__MyBinary__Group__4__Impl ;
    public final void rule__MyBinary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1942:1: ( rule__MyBinary__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1943:2: rule__MyBinary__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__43941);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1949:1: rule__MyBinary__Group__4__Impl : ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) ) ;
    public final void rule__MyBinary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1953:1: ( ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1954:1: ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1954:1: ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1955:1: ( rule__MyBinary__MyBinaryRightAssignment_4 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1956:1: ( rule__MyBinary__MyBinaryRightAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1956:2: rule__MyBinary__MyBinaryRightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryRightAssignment_4_in_rule__MyBinary__Group__4__Impl3968);
            rule__MyBinary__MyBinaryRightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1976:1: rule__MyUnary__Group__0 : rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 ;
    public final void rule__MyUnary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1980:1: ( rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1981:2: rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04008);
            rule__MyUnary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04011);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1988:1: rule__MyUnary__Group__0__Impl : ( ( rule__MyUnary__OparandAssignment_0 )? ) ;
    public final void rule__MyUnary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1992:1: ( ( ( rule__MyUnary__OparandAssignment_0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1993:1: ( ( rule__MyUnary__OparandAssignment_0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1993:1: ( ( rule__MyUnary__OparandAssignment_0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1994:1: ( rule__MyUnary__OparandAssignment_0 )?
            {
             before(grammarAccess.getMyUnaryAccess().getOparandAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1995:1: ( rule__MyUnary__OparandAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1995:2: rule__MyUnary__OparandAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl4038);
                    rule__MyUnary__OparandAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2005:1: rule__MyUnary__Group__1 : rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 ;
    public final void rule__MyUnary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2009:1: ( rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2010:2: rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14069);
            rule__MyUnary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__14072);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2017:1: rule__MyUnary__Group__1__Impl : ( 'single' ) ;
    public final void rule__MyUnary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2021:1: ( ( 'single' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:1: ( 'single' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2022:1: ( 'single' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2023:1: 'single'
            {
             before(grammarAccess.getMyUnaryAccess().getSingleKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyUnary__Group__1__Impl4100); 
             after(grammarAccess.getMyUnaryAccess().getSingleKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2036:1: rule__MyUnary__Group__2 : rule__MyUnary__Group__2__Impl ;
    public final void rule__MyUnary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2040:1: ( rule__MyUnary__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2041:2: rule__MyUnary__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24131);
            rule__MyUnary__Group__2__Impl();

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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2047:1: rule__MyUnary__Group__2__Impl : ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) ) ;
    public final void rule__MyUnary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2051:1: ( ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2052:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2052:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2053:1: ( rule__MyUnary__MyUnaryExpressionAssignment_2 )
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2054:1: ( rule__MyUnary__MyUnaryExpressionAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2054:2: rule__MyUnary__MyUnaryExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_2_in_rule__MyUnary__Group__2__Impl4158);
            rule__MyUnary__MyUnaryExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyEnum__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2070:1: rule__MyEnum__Group__0 : rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 ;
    public final void rule__MyEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2074:1: ( rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2075:2: rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__04194);
            rule__MyEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__04197);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2082:1: rule__MyEnum__Group__0__Impl : ( ( rule__MyEnum__ValuesAssignment_0 ) ) ;
    public final void rule__MyEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2086:1: ( ( ( rule__MyEnum__ValuesAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2087:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2087:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2088:1: ( rule__MyEnum__ValuesAssignment_0 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2089:1: ( rule__MyEnum__ValuesAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2089:2: rule__MyEnum__ValuesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl4224);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2099:1: rule__MyEnum__Group__1 : rule__MyEnum__Group__1__Impl ;
    public final void rule__MyEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2103:1: ( rule__MyEnum__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2104:2: rule__MyEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__14254);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2110:1: rule__MyEnum__Group__1__Impl : ( ( rule__MyEnum__Group_1__0 )* ) ;
    public final void rule__MyEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2114:1: ( ( ( rule__MyEnum__Group_1__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2115:1: ( ( rule__MyEnum__Group_1__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2115:1: ( ( rule__MyEnum__Group_1__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2116:1: ( rule__MyEnum__Group_1__0 )*
            {
             before(grammarAccess.getMyEnumAccess().getGroup_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2117:1: ( rule__MyEnum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2117:2: rule__MyEnum__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl4281);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2131:1: rule__MyEnum__Group_1__0 : rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 ;
    public final void rule__MyEnum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2135:1: ( rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2136:2: rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__04316);
            rule__MyEnum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__04319);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2143:1: rule__MyEnum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MyEnum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2147:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2148:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2148:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2149:1: ','
            {
             before(grammarAccess.getMyEnumAccess().getCommaKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MyEnum__Group_1__0__Impl4347); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2162:1: rule__MyEnum__Group_1__1 : rule__MyEnum__Group_1__1__Impl ;
    public final void rule__MyEnum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2166:1: ( rule__MyEnum__Group_1__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2167:2: rule__MyEnum__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__14378);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2173:1: rule__MyEnum__Group_1__1__Impl : ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) ;
    public final void rule__MyEnum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2177:1: ( ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2178:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2178:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2179:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_1_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2180:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2180:2: rule__MyEnum__ValuesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl4405);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2194:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2198:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2199:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__04439);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__04442);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2206:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2210:1: ( ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2211:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2211:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2212:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2213:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2213:2: rule__BooleanValue__TrueValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl4469);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2223:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2227:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2228:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__14499);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__14502);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2235:1: rule__BooleanValue__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2239:1: ( ( ':' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2240:1: ( ':' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2240:1: ( ':' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2241:1: ':'
            {
             before(grammarAccess.getBooleanValueAccess().getColonKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BooleanValue__Group__1__Impl4530); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2254:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2258:1: ( rule__BooleanValue__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2259:2: rule__BooleanValue__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__24561);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2265:1: rule__BooleanValue__Group__2__Impl : ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2269:1: ( ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2270:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2270:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2271:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2272:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2272:2: rule__BooleanValue__FalseValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl4588);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2288:1: rule__MyRange__Group__0 : rule__MyRange__Group__0__Impl rule__MyRange__Group__1 ;
    public final void rule__MyRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2292:1: ( rule__MyRange__Group__0__Impl rule__MyRange__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2293:2: rule__MyRange__Group__0__Impl rule__MyRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04624);
            rule__MyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04627);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2300:1: rule__MyRange__Group__0__Impl : ( ( rule__MyRange__FromAssignment_0 ) ) ;
    public final void rule__MyRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2304:1: ( ( ( rule__MyRange__FromAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2305:1: ( ( rule__MyRange__FromAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2305:1: ( ( rule__MyRange__FromAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2306:1: ( rule__MyRange__FromAssignment_0 )
            {
             before(grammarAccess.getMyRangeAccess().getFromAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2307:1: ( rule__MyRange__FromAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2307:2: rule__MyRange__FromAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__FromAssignment_0_in_rule__MyRange__Group__0__Impl4654);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2317:1: rule__MyRange__Group__1 : rule__MyRange__Group__1__Impl rule__MyRange__Group__2 ;
    public final void rule__MyRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2321:1: ( rule__MyRange__Group__1__Impl rule__MyRange__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2322:2: rule__MyRange__Group__1__Impl rule__MyRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14684);
            rule__MyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14687);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2329:1: rule__MyRange__Group__1__Impl : ( '-' ) ;
    public final void rule__MyRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2333:1: ( ( '-' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2334:1: ( '-' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2334:1: ( '-' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2335:1: '-'
            {
             before(grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MyRange__Group__1__Impl4715); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2348:1: rule__MyRange__Group__2 : rule__MyRange__Group__2__Impl ;
    public final void rule__MyRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2352:1: ( rule__MyRange__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2353:2: rule__MyRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24746);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2359:1: rule__MyRange__Group__2__Impl : ( ( rule__MyRange__ToAssignment_2 ) ) ;
    public final void rule__MyRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2363:1: ( ( ( rule__MyRange__ToAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2364:1: ( ( rule__MyRange__ToAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2364:1: ( ( rule__MyRange__ToAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2365:1: ( rule__MyRange__ToAssignment_2 )
            {
             before(grammarAccess.getMyRangeAccess().getToAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2366:1: ( rule__MyRange__ToAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2366:2: rule__MyRange__ToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__ToAssignment_2_in_rule__MyRange__Group__2__Impl4773);
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


    // $ANTLR start "rule__MyModel__NameAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2383:1: rule__MyModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2387:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2388:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2388:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2389:1: ruleEString
            {
             before(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_14814);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2398:1: rule__MyModel__MyModelContainsAssignment_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2402:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2403:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2403:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2404:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_14845);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2413:1: rule__MyModel__MyModelContainsAssignment_2_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2417:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2418:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2418:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2419:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_14876);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2428:1: rule__MyObject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2432:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2433:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2433:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2434:1: ruleEString
            {
             before(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_14907);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2443:1: rule__MyObject__MyAttributeContainsAssignment_3_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2447:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2448:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2448:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2449:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_14938);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2458:1: rule__MyObject__MyAttributeContainsAssignment_3_2_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2462:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2463:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2463:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2464:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_14969);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2473:1: rule__MyObject__MyObjectHasAssignment_4_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2477:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2478:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2478:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2479:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_15000);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2488:1: rule__MyObject__MyObjectHasAssignment_4_2_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2492:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2493:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2493:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2494:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_15031);
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


    // $ANTLR start "rule__MyConstraint__MyConstraintContainsAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2503:1: rule__MyConstraint__MyConstraintContainsAssignment_1 : ( rulemyExpression ) ;
    public final void rule__MyConstraint__MyConstraintContainsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2507:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2508:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2508:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2509:1: rulemyExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_15062);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__MyConstraintContainsAssignment_1"


    // $ANTLR start "rule__MyConstraint__MyConstraintContainsAssignment_3"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2518:1: rule__MyConstraint__MyConstraintContainsAssignment_3 : ( rulemyExpression ) ;
    public final void rule__MyConstraint__MyConstraintContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2522:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2523:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2523:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2524:1: rulemyExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_35093);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2533:1: rule__MyAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MyAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2537:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2538:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2538:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2539:1: ruleEString
            {
             before(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_05124);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2548:1: rule__MyAttribute__MyAttributeContainsAssignment_2 : ( rulemyValue ) ;
    public final void rule__MyAttribute__MyAttributeContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2552:1: ( ( rulemyValue ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2553:1: ( rulemyValue )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2553:1: ( rulemyValue )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2554:1: rulemyValue
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_25155);
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


    // $ANTLR start "rule__MyBinary__MyBinaryLeftAssignment_1"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2563:1: rule__MyBinary__MyBinaryLeftAssignment_1 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2567:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2568:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2568:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2569:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_15186);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2578:1: rule__MyBinary__OparandAssignment_2 : ( rulemyBinaryOparators ) ;
    public final void rule__MyBinary__OparandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2582:1: ( ( rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2583:1: ( rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2583:1: ( rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2584:1: rulemyBinaryOparators
            {
             before(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_25217);
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


    // $ANTLR start "rule__MyBinary__MyBinaryRightAssignment_4"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2593:1: rule__MyBinary__MyBinaryRightAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryRightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2597:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2598:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2598:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2599:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_45248);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBinary__MyBinaryRightAssignment_4"


    // $ANTLR start "rule__MyUnary__OparandAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2608:1: rule__MyUnary__OparandAssignment_0 : ( rulemyUnaryOparators ) ;
    public final void rule__MyUnary__OparandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2612:1: ( ( rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2613:1: ( rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2613:1: ( rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2614:1: rulemyUnaryOparators
            {
             before(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_05279);
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


    // $ANTLR start "rule__MyUnary__MyUnaryExpressionAssignment_2"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2623:1: rule__MyUnary__MyUnaryExpressionAssignment_2 : ( rulemyExpression ) ;
    public final void rule__MyUnary__MyUnaryExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2627:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2628:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2628:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2629:1: rulemyExpression
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_25310);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyUnary__MyUnaryExpressionAssignment_2"


    // $ANTLR start "rule__MyString__ValueAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2638:1: rule__MyString__ValueAssignment : ( ruleAnyURI ) ;
    public final void rule__MyString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2642:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2643:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2643:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2644:1: ruleAnyURI
            {
             before(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment5341);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__ValueAssignment"


    // $ANTLR start "rule__MyInt__ValueAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2653:1: rule__MyInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__MyInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2657:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2658:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2658:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2659:1: RULE_INT
            {
             before(grammarAccess.getMyIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MyInt__ValueAssignment5372); 
             after(grammarAccess.getMyIntAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInt__ValueAssignment"


    // $ANTLR start "rule__BoolLiteral__ValueAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2668:1: rule__BoolLiteral__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__BoolLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2672:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:1: ( ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2673:1: ( ruleBoolean )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2674:1: ruleBoolean
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment5403);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__ValueAssignment"


    // $ANTLR start "rule__MyIdentifier__MyIntentifierIsAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2683:1: rule__MyIdentifier__MyIntentifierIsAssignment : ( ( ruleEString ) ) ;
    public final void rule__MyIdentifier__MyIntentifierIsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2687:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2688:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2688:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2689:1: ( ruleEString )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2690:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2691:1: ruleEString
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment5438);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIdentifier__MyIntentifierIsAssignment"


    // $ANTLR start "rule__MyEnum__ValuesAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2702:1: rule__MyEnum__ValuesAssignment_0 : ( ruleEString ) ;
    public final void rule__MyEnum__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2706:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2707:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2707:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2708:1: ruleEString
            {
             before(grammarAccess.getMyEnumAccess().getValuesEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyEnum__ValuesAssignment_05473);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesEStringParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2717:1: rule__MyEnum__ValuesAssignment_1_1 : ( ruleEString ) ;
    public final void rule__MyEnum__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2721:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2722:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2722:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2723:1: ruleEString
            {
             before(grammarAccess.getMyEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyEnum__ValuesAssignment_1_15504);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2732:1: rule__BooleanValue__TrueValueAssignment_0 : ( ruleEString ) ;
    public final void rule__BooleanValue__TrueValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2736:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2737:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2737:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2738:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__TrueValueAssignment_05535);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getTrueValueEStringParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2747:1: rule__BooleanValue__FalseValueAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanValue__FalseValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2751:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2752:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2752:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2753:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__FalseValueAssignment_25566);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getFalseValueEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyRange__FromAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2762:1: rule__MyRange__FromAssignment_0 : ( RULE_INT ) ;
    public final void rule__MyRange__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2766:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2767:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2767:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2768:1: RULE_INT
            {
             before(grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MyRange__FromAssignment_05597); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2777:1: rule__MyRange__ToAssignment_2 : ( RULE_INT ) ;
    public final void rule__MyRange__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2781:1: ( ( RULE_INT ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2782:1: ( RULE_INT )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2782:1: ( RULE_INT )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2783:1: RULE_INT
            {
             before(grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__MyRange__ToAssignment_25628); 
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
        public static final BitSet FOLLOW_rule__MyString__ValueAssignment_in_rulemyString634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_entryRulemyInt661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyInt668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyInt__ValueAssignment_in_rulemyInt694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_in_ruleBoolLiteral754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyIdentifier__MyIntentifierIsAssignment_in_rulemyIdentifier814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAnyURI875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBoolean939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_entryRulemyEnum967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyEnum974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0_in_rulemyEnum1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0_in_rulemyRange1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinaryOparators__Alternatives_in_rulemyBinaryOparators1159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rulemyUnaryOparators1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rule__MyExpression__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rule__MyExpression__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_rule__MyExpression__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_rule__MyExpression__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__MyExpression__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rule__MyExpression__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_rule__MyValue__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__MyValue__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rule__MyValue__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MyBinaryOparators__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MyBinaryOparators__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MyBinaryOparators__Alternatives1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__0__Impl_in_rule__MyModel__Group__01646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1_in_rule__MyModel__Group__01649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__1__Impl_in_rule__MyModel__Group__11707 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2_in_rule__MyModel__Group__11710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__NameAssignment_1_in_rule__MyModel__Group__1__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group__2__Impl_in_rule__MyModel__Group__21767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0_in_rule__MyModel__Group__2__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__0__Impl_in_rule__MyModel__Group_2__01831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1_in_rule__MyModel__Group_2__01834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MyModel__Group_2__0__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__1__Impl_in_rule__MyModel__Group_2__11893 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2_in_rule__MyModel__Group_2__11896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_1_in_rule__MyModel__Group_2__1__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__2__Impl_in_rule__MyModel__Group_2__21953 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3_in_rule__MyModel__Group_2__21956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0_in_rule__MyModel__Group_2__2__Impl1983 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2__3__Impl_in_rule__MyModel__Group_2__32014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MyModel__Group_2__3__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__0__Impl_in_rule__MyModel__Group_2_2__02081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1_in_rule__MyModel__Group_2_2__02084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyModel__Group_2_2__0__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__Group_2_2__1__Impl_in_rule__MyModel__Group_2_2__12143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyModel__MyModelContainsAssignment_2_2_1_in_rule__MyModel__Group_2_2__1__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__0__Impl_in_rule__MyObject__Group__02204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1_in_rule__MyObject__Group__02207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__1__Impl_in_rule__MyObject__Group__12265 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2_in_rule__MyObject__Group__12268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__NameAssignment_1_in_rule__MyObject__Group__1__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__2__Impl_in_rule__MyObject__Group__22325 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3_in_rule__MyObject__Group__22328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MyObject__Group__2__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__3__Impl_in_rule__MyObject__Group__32387 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4_in_rule__MyObject__Group__32390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0_in_rule__MyObject__Group__3__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__4__Impl_in_rule__MyObject__Group__42448 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5_in_rule__MyObject__Group__42451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0_in_rule__MyObject__Group__4__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group__5__Impl_in_rule__MyObject__Group__52509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MyObject__Group__5__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__0__Impl_in_rule__MyObject__Group_3__02580 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1_in_rule__MyObject__Group_3__02583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MyObject__Group_3__0__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__1__Impl_in_rule__MyObject__Group_3__12642 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2_in_rule__MyObject__Group_3__12645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_1_in_rule__MyObject__Group_3__1__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3__2__Impl_in_rule__MyObject__Group_3__22702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0_in_rule__MyObject__Group_3__2__Impl2729 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__0__Impl_in_rule__MyObject__Group_3_2__02766 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1_in_rule__MyObject__Group_3_2__02769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group_3_2__0__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_3_2__1__Impl_in_rule__MyObject__Group_3_2__12828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyAttributeContainsAssignment_3_2_1_in_rule__MyObject__Group_3_2__1__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__02889 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__02892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_4__0__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__12951 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__12954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3038 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03075 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyObject__Group_4_2__0__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__0__Impl_in_rule__MyConstraint__Group__03198 = new BitSet(new long[]{0x00000000A0003870L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1_in_rule__MyConstraint__Group__03201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MyConstraint__Group__0__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__1__Impl_in_rule__MyConstraint__Group__13260 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2_in_rule__MyConstraint__Group__13263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_1_in_rule__MyConstraint__Group__1__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__2__Impl_in_rule__MyConstraint__Group__23320 = new BitSet(new long[]{0x00000000A0003870L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3_in_rule__MyConstraint__Group__23323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MyConstraint__Group__2__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__Group__3__Impl_in_rule__MyConstraint__Group__33382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_3_in_rule__MyConstraint__Group__3__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03447 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13507 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MyAttribute__Group__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23569 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyAttribute__Group__3__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03696 = new BitSet(new long[]{0x00000000A0003870L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MyBinary__Group__0__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13758 = new BitSet(new long[]{0x00000000403FC000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23818 = new BitSet(new long[]{0x00000000403FC000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33879 = new BitSet(new long[]{0x00000000A0003870L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MyBinary__Group__3__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__43941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryRightAssignment_4_in_rule__MyBinary__Group__4__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__04008 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__04011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__14069 = new BitSet(new long[]{0x00000000A0003870L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__14072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyUnary__Group__1__Impl4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_2_in_rule__MyUnary__Group__2__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__04194 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__04197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__14254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl4281 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__04316 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__04319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MyEnum__Group_1__0__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__14378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__04439 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__04442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__14499 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__14502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BooleanValue__Group__1__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__24561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04624 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__FromAssignment_0_in_rule__MyRange__Group__0__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14684 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MyRange__Group__1__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__ToAssignment_2_in_rule__MyRange__Group__2__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_14814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_14845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_14876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_14907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_14938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_14969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_15000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_15031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_15062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment_35093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_05124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_25155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_15186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_25217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_45248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_05279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_25310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment5341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MyInt__ValueAssignment5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment5403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyEnum__ValuesAssignment_05473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyEnum__ValuesAssignment_1_15504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__TrueValueAssignment_05535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__FalseValueAssignment_25566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MyRange__FromAssignment_05597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__MyRange__ToAssignment_25628 = new BitSet(new long[]{0x0000000000000002L});
    }


}