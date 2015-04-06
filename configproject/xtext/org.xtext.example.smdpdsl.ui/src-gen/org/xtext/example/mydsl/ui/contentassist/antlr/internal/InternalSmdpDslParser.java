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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyURI'", "'Int'", "'Boolean'", "'AnySimpleType'", "'not'", "'&&'", "'|'", "'<'", "'>'", "'='", "'can'", "'if'", "'then'", "'{'", "'}'", "','", "'has'", "'Constrained by'", "'['", "']'", "'left'", "'right'", "'single'", "':'", "'-'"
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
    public static final int T__35=35;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:209:1: rulemyConstraint : ( ( rule__MyConstraint__MyConstraintContainsAssignment ) ) ;
    public final void rulemyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:213:2: ( ( ( rule__MyConstraint__MyConstraintContainsAssignment ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:214:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:214:1: ( ( rule__MyConstraint__MyConstraintContainsAssignment ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:215:1: ( rule__MyConstraint__MyConstraintContainsAssignment )
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:216:1: ( rule__MyConstraint__MyConstraintContainsAssignment )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:216:2: rule__MyConstraint__MyConstraintContainsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_in_rulemyConstraint394);
            rule__MyConstraint__MyConstraintContainsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment()); 

            }


            }

        }
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
            case 31:
                {
                alt1=1;
                }
                break;
            case 15:
            case 33:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            case 12:
                {
                alt1=4;
                }
                break;
            case 13:
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

                if ( (LA2_1==EOF||LA2_1==26||LA2_1==30) ) {
                    alt2=1;
                }
                else if ( (LA2_1==35) ) {
                    alt2=3;
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:763:1: rule__MyBinaryOparators__Alternatives : ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) );
    public final void rule__MyBinaryOparators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:767:1: ( ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) | ( ( 'can' ) ) | ( ( 'if' ) ) | ( ( 'then' ) ) )
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
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:768:1: ( ( '&&' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:768:1: ( ( '&&' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:769:1: ( '&&' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:770:1: ( '&&' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:770:3: '&&'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MyBinaryOparators__Alternatives1586); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:6: ( ( '|' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:775:6: ( ( '|' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:776:1: ( '|' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:777:1: ( '|' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:777:3: '|'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MyBinaryOparators__Alternatives1607); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:782:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:782:6: ( ( '<' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:783:1: ( '<' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:784:1: ( '<' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:784:3: '<'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MyBinaryOparators__Alternatives1628); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:789:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:789:6: ( ( '>' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:790:1: ( '>' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:791:1: ( '>' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:791:3: '>'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__MyBinaryOparators__Alternatives1649); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:796:6: ( ( '=' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:796:6: ( ( '=' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:797:1: ( '=' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:798:1: ( '=' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:798:3: '='
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__MyBinaryOparators__Alternatives1670); 

                    }

                     after(grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:803:6: ( ( 'can' ) )
                    {
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:803:6: ( ( 'can' ) )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:804:1: ( 'can' )
                    {
                     before(grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:805:1: ( 'can' )
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:805:3: 'can'
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1475:1: rule__MyObject__Group_4__0__Impl : ( 'Constrained by' ) ;
    public final void rule__MyObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1479:1: ( ( 'Constrained by' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1480:1: ( 'Constrained by' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1480:1: ( 'Constrained by' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1481:1: 'Constrained by'
            {
             before(grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MyObject__Group_4__0__Impl3040); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1506:1: rule__MyObject__Group_4__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) ;
    public final void rule__MyObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1510:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1511:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1511:1: ( ( rule__MyObject__MyObjectHasAssignment_4_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1512:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1513:1: ( rule__MyObject__MyObjectHasAssignment_4_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1513:2: rule__MyObject__MyObjectHasAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl3101);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1523:1: rule__MyObject__Group_4__2 : rule__MyObject__Group_4__2__Impl ;
    public final void rule__MyObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1527:1: ( rule__MyObject__Group_4__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1528:2: rule__MyObject__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23131);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1534:1: rule__MyObject__Group_4__2__Impl : ( ( rule__MyObject__Group_4_2__0 )* ) ;
    public final void rule__MyObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1538:1: ( ( ( rule__MyObject__Group_4_2__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1539:1: ( ( rule__MyObject__Group_4_2__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1539:1: ( ( rule__MyObject__Group_4_2__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1540:1: ( rule__MyObject__Group_4_2__0 )*
            {
             before(grammarAccess.getMyObjectAccess().getGroup_4_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1541:1: ( rule__MyObject__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1541:2: rule__MyObject__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3158);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1557:1: rule__MyObject__Group_4_2__0 : rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 ;
    public final void rule__MyObject__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1561:1: ( rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1562:2: rule__MyObject__Group_4_2__0__Impl rule__MyObject__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03195);
            rule__MyObject__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03198);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1569:1: rule__MyObject__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MyObject__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1573:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1574:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1574:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1575:1: ','
            {
             before(grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyObject__Group_4_2__0__Impl3226); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1588:1: rule__MyObject__Group_4_2__1 : rule__MyObject__Group_4_2__1__Impl ;
    public final void rule__MyObject__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1592:1: ( rule__MyObject__Group_4_2__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1593:2: rule__MyObject__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13257);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1599:1: rule__MyObject__Group_4_2__1__Impl : ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) ;
    public final void rule__MyObject__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1603:1: ( ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1604:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1604:1: ( ( rule__MyObject__MyObjectHasAssignment_4_2_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1605:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1606:1: ( rule__MyObject__MyObjectHasAssignment_4_2_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1606:2: rule__MyObject__MyObjectHasAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3284);
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


    // $ANTLR start "rule__MyAttribute__Group__0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1620:1: rule__MyAttribute__Group__0 : rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 ;
    public final void rule__MyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1624:1: ( rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1625:2: rule__MyAttribute__Group__0__Impl rule__MyAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03318);
            rule__MyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03321);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1632:1: rule__MyAttribute__Group__0__Impl : ( ( rule__MyAttribute__NameAssignment_0 ) ) ;
    public final void rule__MyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1636:1: ( ( ( rule__MyAttribute__NameAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1637:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1637:1: ( ( rule__MyAttribute__NameAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1638:1: ( rule__MyAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMyAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1639:1: ( rule__MyAttribute__NameAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1639:2: rule__MyAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3348);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1649:1: rule__MyAttribute__Group__1 : rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 ;
    public final void rule__MyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1653:1: ( rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1654:2: rule__MyAttribute__Group__1__Impl rule__MyAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13378);
            rule__MyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13381);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1661:1: rule__MyAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__MyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1665:1: ( ( '[' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1666:1: ( '[' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1666:1: ( '[' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1667:1: '['
            {
             before(grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MyAttribute__Group__1__Impl3409); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1680:1: rule__MyAttribute__Group__2 : rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 ;
    public final void rule__MyAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1684:1: ( rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1685:2: rule__MyAttribute__Group__2__Impl rule__MyAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23440);
            rule__MyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23443);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1692:1: rule__MyAttribute__Group__2__Impl : ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) ;
    public final void rule__MyAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1696:1: ( ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1697:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1697:1: ( ( rule__MyAttribute__MyAttributeContainsAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1698:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1699:1: ( rule__MyAttribute__MyAttributeContainsAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1699:2: rule__MyAttribute__MyAttributeContainsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3470);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1709:1: rule__MyAttribute__Group__3 : rule__MyAttribute__Group__3__Impl ;
    public final void rule__MyAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1713:1: ( rule__MyAttribute__Group__3__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1714:2: rule__MyAttribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33500);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1720:1: rule__MyAttribute__Group__3__Impl : ( ']' ) ;
    public final void rule__MyAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1724:1: ( ( ']' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1725:1: ( ']' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1725:1: ( ']' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1726:1: ']'
            {
             before(grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MyAttribute__Group__3__Impl3528); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1747:1: rule__MyBinary__Group__0 : rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 ;
    public final void rule__MyBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1751:1: ( rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1752:2: rule__MyBinary__Group__0__Impl rule__MyBinary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03567);
            rule__MyBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03570);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1759:1: rule__MyBinary__Group__0__Impl : ( 'left' ) ;
    public final void rule__MyBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1763:1: ( ( 'left' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1764:1: ( 'left' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1764:1: ( 'left' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1765:1: 'left'
            {
             before(grammarAccess.getMyBinaryAccess().getLeftKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MyBinary__Group__0__Impl3598); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1778:1: rule__MyBinary__Group__1 : rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 ;
    public final void rule__MyBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1782:1: ( rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1783:2: rule__MyBinary__Group__1__Impl rule__MyBinary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13629);
            rule__MyBinary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13632);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1790:1: rule__MyBinary__Group__1__Impl : ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) ;
    public final void rule__MyBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1794:1: ( ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1795:1: ( ( rule__MyBinary__MyBinaryLeftAssignment_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1796:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:1: ( rule__MyBinary__MyBinaryLeftAssignment_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1797:2: rule__MyBinary__MyBinaryLeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3659);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1807:1: rule__MyBinary__Group__2 : rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 ;
    public final void rule__MyBinary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1811:1: ( rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1812:2: rule__MyBinary__Group__2__Impl rule__MyBinary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23689);
            rule__MyBinary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23692);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1819:1: rule__MyBinary__Group__2__Impl : ( ( rule__MyBinary__OparandAssignment_2 )? ) ;
    public final void rule__MyBinary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1823:1: ( ( ( rule__MyBinary__OparandAssignment_2 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1824:1: ( ( rule__MyBinary__OparandAssignment_2 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1824:1: ( ( rule__MyBinary__OparandAssignment_2 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1825:1: ( rule__MyBinary__OparandAssignment_2 )?
            {
             before(grammarAccess.getMyBinaryAccess().getOparandAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1826:1: ( rule__MyBinary__OparandAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=16 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1826:2: rule__MyBinary__OparandAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3719);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1836:1: rule__MyBinary__Group__3 : rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 ;
    public final void rule__MyBinary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1840:1: ( rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1841:2: rule__MyBinary__Group__3__Impl rule__MyBinary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33750);
            rule__MyBinary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33753);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1848:1: rule__MyBinary__Group__3__Impl : ( 'right' ) ;
    public final void rule__MyBinary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1852:1: ( ( 'right' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1853:1: ( 'right' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1853:1: ( 'right' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1854:1: 'right'
            {
             before(grammarAccess.getMyBinaryAccess().getRightKeyword_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MyBinary__Group__3__Impl3781); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1867:1: rule__MyBinary__Group__4 : rule__MyBinary__Group__4__Impl ;
    public final void rule__MyBinary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1871:1: ( rule__MyBinary__Group__4__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1872:2: rule__MyBinary__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__43812);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1878:1: rule__MyBinary__Group__4__Impl : ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) ) ;
    public final void rule__MyBinary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1882:1: ( ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1883:1: ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1883:1: ( ( rule__MyBinary__MyBinaryRightAssignment_4 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1884:1: ( rule__MyBinary__MyBinaryRightAssignment_4 )
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_4()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1885:1: ( rule__MyBinary__MyBinaryRightAssignment_4 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1885:2: rule__MyBinary__MyBinaryRightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyBinary__MyBinaryRightAssignment_4_in_rule__MyBinary__Group__4__Impl3839);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1905:1: rule__MyUnary__Group__0 : rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 ;
    public final void rule__MyUnary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1909:1: ( rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1910:2: rule__MyUnary__Group__0__Impl rule__MyUnary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__03879);
            rule__MyUnary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__03882);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1917:1: rule__MyUnary__Group__0__Impl : ( ( rule__MyUnary__OparandAssignment_0 )? ) ;
    public final void rule__MyUnary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1921:1: ( ( ( rule__MyUnary__OparandAssignment_0 )? ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1922:1: ( ( rule__MyUnary__OparandAssignment_0 )? )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1922:1: ( ( rule__MyUnary__OparandAssignment_0 )? )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1923:1: ( rule__MyUnary__OparandAssignment_0 )?
            {
             before(grammarAccess.getMyUnaryAccess().getOparandAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:1: ( rule__MyUnary__OparandAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1924:2: rule__MyUnary__OparandAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl3909);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1934:1: rule__MyUnary__Group__1 : rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 ;
    public final void rule__MyUnary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1938:1: ( rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1939:2: rule__MyUnary__Group__1__Impl rule__MyUnary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__13940);
            rule__MyUnary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__13943);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1946:1: rule__MyUnary__Group__1__Impl : ( 'single' ) ;
    public final void rule__MyUnary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1950:1: ( ( 'single' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1951:1: ( 'single' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1951:1: ( 'single' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1952:1: 'single'
            {
             before(grammarAccess.getMyUnaryAccess().getSingleKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MyUnary__Group__1__Impl3971); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1965:1: rule__MyUnary__Group__2 : rule__MyUnary__Group__2__Impl ;
    public final void rule__MyUnary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1969:1: ( rule__MyUnary__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1970:2: rule__MyUnary__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24002);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1976:1: rule__MyUnary__Group__2__Impl : ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) ) ;
    public final void rule__MyUnary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1980:1: ( ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1981:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1981:1: ( ( rule__MyUnary__MyUnaryExpressionAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1982:1: ( rule__MyUnary__MyUnaryExpressionAssignment_2 )
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1983:1: ( rule__MyUnary__MyUnaryExpressionAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1983:2: rule__MyUnary__MyUnaryExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_2_in_rule__MyUnary__Group__2__Impl4029);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:1999:1: rule__MyEnum__Group__0 : rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 ;
    public final void rule__MyEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2003:1: ( rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2004:2: rule__MyEnum__Group__0__Impl rule__MyEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__04065);
            rule__MyEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__04068);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2011:1: rule__MyEnum__Group__0__Impl : ( ( rule__MyEnum__ValuesAssignment_0 ) ) ;
    public final void rule__MyEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2015:1: ( ( ( rule__MyEnum__ValuesAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2016:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2016:1: ( ( rule__MyEnum__ValuesAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2017:1: ( rule__MyEnum__ValuesAssignment_0 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2018:1: ( rule__MyEnum__ValuesAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2018:2: rule__MyEnum__ValuesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl4095);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2028:1: rule__MyEnum__Group__1 : rule__MyEnum__Group__1__Impl ;
    public final void rule__MyEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2032:1: ( rule__MyEnum__Group__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2033:2: rule__MyEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__14125);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2039:1: rule__MyEnum__Group__1__Impl : ( ( rule__MyEnum__Group_1__0 )* ) ;
    public final void rule__MyEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2043:1: ( ( ( rule__MyEnum__Group_1__0 )* ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2044:1: ( ( rule__MyEnum__Group_1__0 )* )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2044:1: ( ( rule__MyEnum__Group_1__0 )* )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2045:1: ( rule__MyEnum__Group_1__0 )*
            {
             before(grammarAccess.getMyEnumAccess().getGroup_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2046:1: ( rule__MyEnum__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2046:2: rule__MyEnum__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl4152);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2060:1: rule__MyEnum__Group_1__0 : rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 ;
    public final void rule__MyEnum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2064:1: ( rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2065:2: rule__MyEnum__Group_1__0__Impl rule__MyEnum__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__04187);
            rule__MyEnum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__04190);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2072:1: rule__MyEnum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MyEnum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2076:1: ( ( ',' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2077:1: ( ',' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2077:1: ( ',' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2078:1: ','
            {
             before(grammarAccess.getMyEnumAccess().getCommaKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MyEnum__Group_1__0__Impl4218); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2091:1: rule__MyEnum__Group_1__1 : rule__MyEnum__Group_1__1__Impl ;
    public final void rule__MyEnum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2095:1: ( rule__MyEnum__Group_1__1__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2096:2: rule__MyEnum__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__14249);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2102:1: rule__MyEnum__Group_1__1__Impl : ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) ;
    public final void rule__MyEnum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2106:1: ( ( ( rule__MyEnum__ValuesAssignment_1_1 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2107:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2107:1: ( ( rule__MyEnum__ValuesAssignment_1_1 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2108:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getMyEnumAccess().getValuesAssignment_1_1()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2109:1: ( rule__MyEnum__ValuesAssignment_1_1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2109:2: rule__MyEnum__ValuesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl4276);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2123:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2127:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2128:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__04310);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__04313);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2135:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2139:1: ( ( ( rule__BooleanValue__TrueValueAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2140:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2140:1: ( ( rule__BooleanValue__TrueValueAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2141:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2142:1: ( rule__BooleanValue__TrueValueAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2142:2: rule__BooleanValue__TrueValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl4340);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2152:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2156:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2157:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__14370);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__14373);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2164:1: rule__BooleanValue__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2168:1: ( ( ':' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2169:1: ( ':' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2169:1: ( ':' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2170:1: ':'
            {
             before(grammarAccess.getBooleanValueAccess().getColonKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__BooleanValue__Group__1__Impl4401); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2183:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2187:1: ( rule__BooleanValue__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2188:2: rule__BooleanValue__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__24432);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2194:1: rule__BooleanValue__Group__2__Impl : ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2198:1: ( ( ( rule__BooleanValue__FalseValueAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2199:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2199:1: ( ( rule__BooleanValue__FalseValueAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2200:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2201:1: ( rule__BooleanValue__FalseValueAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2201:2: rule__BooleanValue__FalseValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl4459);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2217:1: rule__MyRange__Group__0 : rule__MyRange__Group__0__Impl rule__MyRange__Group__1 ;
    public final void rule__MyRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2221:1: ( rule__MyRange__Group__0__Impl rule__MyRange__Group__1 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2222:2: rule__MyRange__Group__0__Impl rule__MyRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04495);
            rule__MyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04498);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2229:1: rule__MyRange__Group__0__Impl : ( ( rule__MyRange__RangeAssignment_0 ) ) ;
    public final void rule__MyRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2233:1: ( ( ( rule__MyRange__RangeAssignment_0 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2234:1: ( ( rule__MyRange__RangeAssignment_0 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2234:1: ( ( rule__MyRange__RangeAssignment_0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2235:1: ( rule__MyRange__RangeAssignment_0 )
            {
             before(grammarAccess.getMyRangeAccess().getRangeAssignment_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2236:1: ( rule__MyRange__RangeAssignment_0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2236:2: rule__MyRange__RangeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__RangeAssignment_0_in_rule__MyRange__Group__0__Impl4525);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2246:1: rule__MyRange__Group__1 : rule__MyRange__Group__1__Impl rule__MyRange__Group__2 ;
    public final void rule__MyRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2250:1: ( rule__MyRange__Group__1__Impl rule__MyRange__Group__2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2251:2: rule__MyRange__Group__1__Impl rule__MyRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14555);
            rule__MyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14558);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2258:1: rule__MyRange__Group__1__Impl : ( '-' ) ;
    public final void rule__MyRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2262:1: ( ( '-' ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2263:1: ( '-' )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2263:1: ( '-' )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2264:1: '-'
            {
             before(grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MyRange__Group__1__Impl4586); 
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2277:1: rule__MyRange__Group__2 : rule__MyRange__Group__2__Impl ;
    public final void rule__MyRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2281:1: ( rule__MyRange__Group__2__Impl )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2282:2: rule__MyRange__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24617);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2288:1: rule__MyRange__Group__2__Impl : ( ( rule__MyRange__RangeAssignment_2 ) ) ;
    public final void rule__MyRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2292:1: ( ( ( rule__MyRange__RangeAssignment_2 ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2293:1: ( ( rule__MyRange__RangeAssignment_2 ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2293:1: ( ( rule__MyRange__RangeAssignment_2 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2294:1: ( rule__MyRange__RangeAssignment_2 )
            {
             before(grammarAccess.getMyRangeAccess().getRangeAssignment_2()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2295:1: ( rule__MyRange__RangeAssignment_2 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2295:2: rule__MyRange__RangeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MyRange__RangeAssignment_2_in_rule__MyRange__Group__2__Impl4644);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2312:1: rule__MyModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2316:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2317:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2317:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2318:1: ruleEString
            {
             before(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_14685);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2327:1: rule__MyModel__MyModelContainsAssignment_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2331:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2332:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2332:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2333:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_14716);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2342:1: rule__MyModel__MyModelContainsAssignment_2_2_1 : ( rulemyObject ) ;
    public final void rule__MyModel__MyModelContainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2346:1: ( ( rulemyObject ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2347:1: ( rulemyObject )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2347:1: ( rulemyObject )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2348:1: rulemyObject
            {
             before(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_14747);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2357:1: rule__MyObject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MyObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2361:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2362:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2362:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2363:1: ruleEString
            {
             before(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_14778);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2372:1: rule__MyObject__MyAttributeContainsAssignment_3_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2376:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2377:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2377:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2378:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_14809);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2387:1: rule__MyObject__MyAttributeContainsAssignment_3_2_1 : ( rulemyAttribute ) ;
    public final void rule__MyObject__MyAttributeContainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2391:1: ( ( rulemyAttribute ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2392:1: ( rulemyAttribute )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2392:1: ( rulemyAttribute )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2393:1: rulemyAttribute
            {
             before(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_14840);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2402:1: rule__MyObject__MyObjectHasAssignment_4_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2406:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2407:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2407:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2408:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_14871);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2417:1: rule__MyObject__MyObjectHasAssignment_4_2_1 : ( rulemyConstraint ) ;
    public final void rule__MyObject__MyObjectHasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2421:1: ( ( rulemyConstraint ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2422:1: ( rulemyConstraint )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2422:1: ( rulemyConstraint )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2423:1: rulemyConstraint
            {
             before(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_14902);
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


    // $ANTLR start "rule__MyConstraint__MyConstraintContainsAssignment"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2432:1: rule__MyConstraint__MyConstraintContainsAssignment : ( rulemyExpression ) ;
    public final void rule__MyConstraint__MyConstraintContainsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2436:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2437:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2437:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2438:1: rulemyExpression
            {
             before(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment4933);
            rulemyExpression();

            state._fsp--;

             after(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyConstraint__MyConstraintContainsAssignment"


    // $ANTLR start "rule__MyAttribute__NameAssignment_0"
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2447:1: rule__MyAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MyAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2451:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2452:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2452:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2453:1: ruleEString
            {
             before(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_04964);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2462:1: rule__MyAttribute__MyAttributeContainsAssignment_2 : ( rulemyValue ) ;
    public final void rule__MyAttribute__MyAttributeContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2466:1: ( ( rulemyValue ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2467:1: ( rulemyValue )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2467:1: ( rulemyValue )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2468:1: rulemyValue
            {
             before(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_24995);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2477:1: rule__MyBinary__MyBinaryLeftAssignment_1 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2481:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2482:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2482:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2483:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_15026);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2492:1: rule__MyBinary__OparandAssignment_2 : ( rulemyBinaryOparators ) ;
    public final void rule__MyBinary__OparandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2496:1: ( ( rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2497:1: ( rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2497:1: ( rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2498:1: rulemyBinaryOparators
            {
             before(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_25057);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2507:1: rule__MyBinary__MyBinaryRightAssignment_4 : ( rulemyExpression ) ;
    public final void rule__MyBinary__MyBinaryRightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2511:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2512:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2512:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2513:1: rulemyExpression
            {
             before(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_45088);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2522:1: rule__MyUnary__OparandAssignment_0 : ( rulemyUnaryOparators ) ;
    public final void rule__MyUnary__OparandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2526:1: ( ( rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2527:1: ( rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2527:1: ( rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2528:1: rulemyUnaryOparators
            {
             before(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_05119);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2537:1: rule__MyUnary__MyUnaryExpressionAssignment_2 : ( rulemyExpression ) ;
    public final void rule__MyUnary__MyUnaryExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2541:1: ( ( rulemyExpression ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2542:1: ( rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2542:1: ( rulemyExpression )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2543:1: rulemyExpression
            {
             before(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_25150);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2552:1: rule__MyString__ValueAssignment : ( ruleAnyURI ) ;
    public final void rule__MyString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2556:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2557:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2557:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2558:1: ruleAnyURI
            {
             before(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment5181);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2567:1: rule__MyInt__ValueAssignment : ( ruleInt0 ) ;
    public final void rule__MyInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2571:1: ( ( ruleInt0 ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2572:1: ( ruleInt0 )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2572:1: ( ruleInt0 )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2573:1: ruleInt0
            {
             before(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment5212);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2582:1: rule__BoolLiteral__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__BoolLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2586:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2587:1: ( ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2587:1: ( ruleBoolean )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2588:1: ruleBoolean
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment5243);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2597:1: rule__MyIdentifier__MyIntentifierIsAssignment : ( ( ruleEString ) ) ;
    public final void rule__MyIdentifier__MyIntentifierIsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2601:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2602:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2602:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2603:1: ( ruleEString )
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_0()); 
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2604:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2605:1: ruleEString
            {
             before(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment5278);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2616:1: rule__MyEnum__ValuesAssignment_0 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2620:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2621:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2621:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2622:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_05313);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2631:1: rule__MyEnum__ValuesAssignment_1_1 : ( ruleAnySimpleType ) ;
    public final void rule__MyEnum__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2635:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2636:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2636:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2637:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_1_15344);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2646:1: rule__BooleanValue__TrueValueAssignment_0 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__TrueValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2650:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2651:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2651:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2652:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_05375);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2661:1: rule__BooleanValue__FalseValueAssignment_2 : ( ruleAnyURI ) ;
    public final void rule__BooleanValue__FalseValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2665:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2666:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2666:1: ( ruleAnyURI )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2667:1: ruleAnyURI
            {
             before(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_25406);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2676:1: rule__MyRange__RangeAssignment_0 : ( ruleAnySimpleType ) ;
    public final void rule__MyRange__RangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2680:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2681:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2681:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2682:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_05437);
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
    // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2691:1: rule__MyRange__RangeAssignment_2 : ( ruleAnySimpleType ) ;
    public final void rule__MyRange__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2695:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2696:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2696:1: ( ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalSmdpDsl.g:2697:1: ruleAnySimpleType
            {
             before(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_25468);
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
        public static final BitSet FOLLOW_rule__MyConstraint__MyConstraintContainsAssignment_in_rulemyConstraint394 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__MyObject__Group_4__0__Impl_in_rule__MyObject__Group_4__03009 = new BitSet(new long[]{0x000000028000B830L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1_in_rule__MyObject__Group_4__03012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MyObject__Group_4__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__1__Impl_in_rule__MyObject__Group_4__13071 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2_in_rule__MyObject__Group_4__13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_1_in_rule__MyObject__Group_4__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4__2__Impl_in_rule__MyObject__Group_4__23131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0_in_rule__MyObject__Group_4__2__Impl3158 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__0__Impl_in_rule__MyObject__Group_4_2__03195 = new BitSet(new long[]{0x000000028000B830L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1_in_rule__MyObject__Group_4_2__03198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyObject__Group_4_2__0__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__Group_4_2__1__Impl_in_rule__MyObject__Group_4_2__13257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyObject__MyObjectHasAssignment_4_2_1_in_rule__MyObject__Group_4_2__1__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__0__Impl_in_rule__MyAttribute__Group__03318 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1_in_rule__MyAttribute__Group__03321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__NameAssignment_0_in_rule__MyAttribute__Group__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__1__Impl_in_rule__MyAttribute__Group__13378 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2_in_rule__MyAttribute__Group__13381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MyAttribute__Group__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__2__Impl_in_rule__MyAttribute__Group__23440 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3_in_rule__MyAttribute__Group__23443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__MyAttributeContainsAssignment_2_in_rule__MyAttribute__Group__2__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyAttribute__Group__3__Impl_in_rule__MyAttribute__Group__33500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MyAttribute__Group__3__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__0__Impl_in_rule__MyBinary__Group__03567 = new BitSet(new long[]{0x000000028000B830L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1_in_rule__MyBinary__Group__03570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MyBinary__Group__0__Impl3598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__1__Impl_in_rule__MyBinary__Group__13629 = new BitSet(new long[]{0x0000000100FF0000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2_in_rule__MyBinary__Group__13632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryLeftAssignment_1_in_rule__MyBinary__Group__1__Impl3659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__2__Impl_in_rule__MyBinary__Group__23689 = new BitSet(new long[]{0x0000000100FF0000L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3_in_rule__MyBinary__Group__23692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__OparandAssignment_2_in_rule__MyBinary__Group__2__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__3__Impl_in_rule__MyBinary__Group__33750 = new BitSet(new long[]{0x000000028000B830L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4_in_rule__MyBinary__Group__33753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MyBinary__Group__3__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__Group__4__Impl_in_rule__MyBinary__Group__43812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyBinary__MyBinaryRightAssignment_4_in_rule__MyBinary__Group__4__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__0__Impl_in_rule__MyUnary__Group__03879 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1_in_rule__MyUnary__Group__03882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__OparandAssignment_0_in_rule__MyUnary__Group__0__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__1__Impl_in_rule__MyUnary__Group__13940 = new BitSet(new long[]{0x000000028000B830L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2_in_rule__MyUnary__Group__13943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MyUnary__Group__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__Group__2__Impl_in_rule__MyUnary__Group__24002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyUnary__MyUnaryExpressionAssignment_2_in_rule__MyUnary__Group__2__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__0__Impl_in_rule__MyEnum__Group__04065 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1_in_rule__MyEnum__Group__04068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_0_in_rule__MyEnum__Group__0__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group__1__Impl_in_rule__MyEnum__Group__14125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0_in_rule__MyEnum__Group__1__Impl4152 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__0__Impl_in_rule__MyEnum__Group_1__04187 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1_in_rule__MyEnum__Group_1__04190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MyEnum__Group_1__0__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__Group_1__1__Impl_in_rule__MyEnum__Group_1__14249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyEnum__ValuesAssignment_1_1_in_rule__MyEnum__Group_1__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__04310 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__04313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TrueValueAssignment_0_in_rule__BooleanValue__Group__0__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__14370 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__14373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__BooleanValue__Group__1__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__24432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__FalseValueAssignment_2_in_rule__BooleanValue__Group__2__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__0__Impl_in_rule__MyRange__Group__04495 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1_in_rule__MyRange__Group__04498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__RangeAssignment_0_in_rule__MyRange__Group__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__1__Impl_in_rule__MyRange__Group__14555 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2_in_rule__MyRange__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MyRange__Group__1__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__Group__2__Impl_in_rule__MyRange__Group__24617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MyRange__RangeAssignment_2_in_rule__MyRange__Group__2__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyModel__NameAssignment_14685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_14716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_rule__MyModel__MyModelContainsAssignment_2_2_14747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyObject__NameAssignment_14778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_14809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rule__MyObject__MyAttributeContainsAssignment_3_2_14840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_14871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rule__MyObject__MyObjectHasAssignment_4_2_14902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyConstraint__MyConstraintContainsAssignment4933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyAttribute__NameAssignment_04964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_rule__MyAttribute__MyAttributeContainsAssignment_24995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryLeftAssignment_15026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rule__MyBinary__OparandAssignment_25057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyBinary__MyBinaryRightAssignment_45088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rule__MyUnary__OparandAssignment_05119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rule__MyUnary__MyUnaryExpressionAssignment_25150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__MyString__ValueAssignment5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_rule__MyInt__ValueAssignment5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__BoolLiteral__ValueAssignment5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MyIdentifier__MyIntentifierIsAssignment5278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_05313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyEnum__ValuesAssignment_1_15344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__TrueValueAssignment_05375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__BooleanValue__FalseValueAssignment_25406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_05437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__MyRange__RangeAssignment_25468 = new BitSet(new long[]{0x0000000000000002L});
    }


}