package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SmdpDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmdpDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'has'", "'myAttributeContains'", "'myConstraint'", "'myConstraintContains'", "'['", "']'", "'myBinary'", "'Oparand'", "'myBinaryLeft'", "'myBinaryRight'", "'myUnary'", "'myUnaryExpression'", "'myString'", "'value'", "'myInt'", "'BoolLiteral'", "'myIdentifier'", "'myIntentifierIs'", "'AnyURI'", "'Int'", "'Boolean'", "':'", "'-'", "'AnySimpleType'", "'and'", "'or'", "'gt'", "'lt'", "'eq'", "'is'", "'if'", "'then'", "'not'"
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
    public String getGrammarFileName() { return "../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g"; }



     	private SmdpDslGrammarAccess grammarAccess;
     	
        public InternalSmdpDslParser(TokenStream input, SmdpDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "myModel";	
       	}
       	
       	@Override
       	protected SmdpDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulemyModel"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:68:1: entryRulemyModel returns [EObject current=null] : iv_rulemyModel= rulemyModel EOF ;
    public final EObject entryRulemyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyModel = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:69:2: (iv_rulemyModel= rulemyModel EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:70:2: iv_rulemyModel= rulemyModel EOF
            {
             newCompositeNode(grammarAccess.getMyModelRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyModel_in_entryRulemyModel75);
            iv_rulemyModel=rulemyModel();

            state._fsp--;

             current =iv_rulemyModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyModel"


    // $ANTLR start "rulemyModel"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:77:1: rulemyModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )? ) ;
    public final EObject rulemyModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_myModelContains_3_0 = null;

        EObject lv_myModelContains_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:80:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )? ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )? )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )? )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )?
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: ()
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyModelAccess().getMyModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:87:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:88:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:88:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:89:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyModel140);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:105:2: (otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:105:4: otherlv_2= '{' ( (lv_myModelContains_3_0= rulemyObject ) ) (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyModel153); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:109:1: ( (lv_myModelContains_3_0= rulemyObject ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:110:1: (lv_myModelContains_3_0= rulemyObject )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:110:1: (lv_myModelContains_3_0= rulemyObject )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:111:3: lv_myModelContains_3_0= rulemyObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel174);
                    lv_myModelContains_3_0=rulemyObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	        }
                           		add(
                           			current, 
                           			"myModelContains",
                            		lv_myModelContains_3_0, 
                            		"myObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:127:2: (otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:127:4: otherlv_4= ',' ( (lv_myModelContains_5_0= rulemyObject ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyModel187); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:131:1: ( (lv_myModelContains_5_0= rulemyObject ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:132:1: (lv_myModelContains_5_0= rulemyObject )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:132:1: (lv_myModelContains_5_0= rulemyObject )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:133:3: lv_myModelContains_5_0= rulemyObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel208);
                    	    lv_myModelContains_5_0=rulemyObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myModelContains",
                    	            		lv_myModelContains_5_0, 
                    	            		"myObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyModel222); 

                        	newLeafNode(otherlv_6, grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyModel"


    // $ANTLR start "entryRulemyExpression"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:161:1: entryRulemyExpression returns [EObject current=null] : iv_rulemyExpression= rulemyExpression EOF ;
    public final EObject entryRulemyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyExpression = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:162:2: (iv_rulemyExpression= rulemyExpression EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:163:2: iv_rulemyExpression= rulemyExpression EOF
            {
             newCompositeNode(grammarAccess.getMyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_entryRulemyExpression260);
            iv_rulemyExpression=rulemyExpression();

            state._fsp--;

             current =iv_rulemyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyExpression270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyExpression"


    // $ANTLR start "rulemyExpression"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:170:1: rulemyExpression returns [EObject current=null] : (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier ) ;
    public final EObject rulemyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_myBinary_0 = null;

        EObject this_myUnary_1 = null;

        EObject this_myString_2 = null;

        EObject this_myInt_3 = null;

        EObject this_BoolLiteral_4 = null;

        EObject this_myIdentifier_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:173:28: ( (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:174:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:174:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:175:5: this_myBinary_0= rulemyBinary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyExpression317);
                    this_myBinary_0=rulemyBinary();

                    state._fsp--;

                     
                            current = this_myBinary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:185:5: this_myUnary_1= rulemyUnary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rulemyExpression344);
                    this_myUnary_1=rulemyUnary();

                    state._fsp--;

                     
                            current = this_myUnary_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:195:5: this_myString_2= rulemyString
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyString_in_rulemyExpression371);
                    this_myString_2=rulemyString();

                    state._fsp--;

                     
                            current = this_myString_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:205:5: this_myInt_3= rulemyInt
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyInt_in_rulemyExpression398);
                    this_myInt_3=rulemyInt();

                    state._fsp--;

                     
                            current = this_myInt_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:215:5: this_BoolLiteral_4= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_rulemyExpression425);
                    this_BoolLiteral_4=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:225:5: this_myIdentifier_5= rulemyIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rulemyExpression452);
                    this_myIdentifier_5=rulemyIdentifier();

                    state._fsp--;

                     
                            current = this_myIdentifier_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyExpression"


    // $ANTLR start "entryRulemyValue"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:241:1: entryRulemyValue returns [EObject current=null] : iv_rulemyValue= rulemyValue EOF ;
    public final EObject entryRulemyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:242:2: (iv_rulemyValue= rulemyValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:243:2: iv_rulemyValue= rulemyValue EOF
            {
             newCompositeNode(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue487);
            iv_rulemyValue=rulemyValue();

            state._fsp--;

             current =iv_rulemyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyValue"


    // $ANTLR start "rulemyValue"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:250:1: rulemyValue returns [EObject current=null] : (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange ) ;
    public final EObject rulemyValue() throws RecognitionException {
        EObject current = null;

        EObject this_myEnum_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_myRange_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:253:28: ( (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:254:1: (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:254:1: (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==12||LA4_1==19) ) {
                    alt4=1;
                }
                else if ( (LA4_1==36) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:255:5: this_myEnum_0= rulemyEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_rulemyValue544);
                    this_myEnum_0=rulemyEnum();

                    state._fsp--;

                     
                            current = this_myEnum_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:265:5: this_BooleanValue_1= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rulemyValue571);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:275:5: this_myRange_2= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyValue598);
                    this_myRange_2=rulemyRange();

                    state._fsp--;

                     
                            current = this_myRange_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyValue"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:292:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:293:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString634);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:303:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:304:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString685); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:312:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString711); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulemyObject"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:327:1: entryRulemyObject returns [EObject current=null] : iv_rulemyObject= rulemyObject EOF ;
    public final EObject entryRulemyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyObject = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:328:2: (iv_rulemyObject= rulemyObject EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:329:2: iv_rulemyObject= rulemyObject EOF
            {
             newCompositeNode(grammarAccess.getMyObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_entryRulemyObject756);
            iv_rulemyObject=rulemyObject();

            state._fsp--;

             current =iv_rulemyObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyObject766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyObject"


    // $ANTLR start "rulemyObject"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:336:1: rulemyObject returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject rulemyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_myAttributeContains_4_0 = null;

        EObject lv_myAttributeContains_6_0 = null;

        EObject lv_myObjectHas_9_0 = null;

        EObject lv_myObjectHas_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:339:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:340:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:340:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:340:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:340:2: ()
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:341:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyObjectAccess().getMyObjectAction_0(),
                        current);
                

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:346:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:347:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:347:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:348:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyObject821);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyObject833); 

                	newLeafNode(otherlv_2, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:368:1: (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:368:3: otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyObject846); 

                        	newLeafNode(otherlv_3, grammarAccess.getMyObjectAccess().getHasKeyword_3_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:372:1: ( (lv_myAttributeContains_4_0= rulemyAttribute ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:373:1: (lv_myAttributeContains_4_0= rulemyAttribute )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:373:1: (lv_myAttributeContains_4_0= rulemyAttribute )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:374:3: lv_myAttributeContains_4_0= rulemyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject867);
                    lv_myAttributeContains_4_0=rulemyAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myAttributeContains",
                            		lv_myAttributeContains_4_0, 
                            		"myAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:390:2: (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:390:4: otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject880); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:394:1: ( (lv_myAttributeContains_6_0= rulemyAttribute ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:395:1: (lv_myAttributeContains_6_0= rulemyAttribute )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:395:1: (lv_myAttributeContains_6_0= rulemyAttribute )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:396:3: lv_myAttributeContains_6_0= rulemyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject901);
                    	    lv_myAttributeContains_6_0=rulemyAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myAttributeContains",
                    	            		lv_myAttributeContains_6_0, 
                    	            		"myAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:412:6: (otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:412:8: otherlv_7= 'myAttributeContains' otherlv_8= '{' ( (lv_myObjectHas_9_0= rulemyConstraint ) ) (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject918); 

                        	newLeafNode(otherlv_7, grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyObject930); 

                        	newLeafNode(otherlv_8, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:420:1: ( (lv_myObjectHas_9_0= rulemyConstraint ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:421:1: (lv_myObjectHas_9_0= rulemyConstraint )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:421:1: (lv_myObjectHas_9_0= rulemyConstraint )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:422:3: lv_myObjectHas_9_0= rulemyConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject951);
                    lv_myObjectHas_9_0=rulemyConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myObjectHas",
                            		lv_myObjectHas_9_0, 
                            		"myConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:438:2: (otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:438:4: otherlv_10= ',' ( (lv_myObjectHas_11_0= rulemyConstraint ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject964); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getMyObjectAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:442:1: ( (lv_myObjectHas_11_0= rulemyConstraint ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:443:1: (lv_myObjectHas_11_0= rulemyConstraint )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:443:1: (lv_myObjectHas_11_0= rulemyConstraint )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:444:3: lv_myObjectHas_11_0= rulemyConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject985);
                    	    lv_myObjectHas_11_0=rulemyConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myObjectHas",
                    	            		lv_myObjectHas_11_0, 
                    	            		"myConstraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyObject999); 

                        	newLeafNode(otherlv_12, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyObject1013); 

                	newLeafNode(otherlv_13, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyObject"


    // $ANTLR start "entryRulemyConstraint"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:476:1: entryRulemyConstraint returns [EObject current=null] : iv_rulemyConstraint= rulemyConstraint EOF ;
    public final EObject entryRulemyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyConstraint = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:477:2: (iv_rulemyConstraint= rulemyConstraint EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:478:2: iv_rulemyConstraint= rulemyConstraint EOF
            {
             newCompositeNode(grammarAccess.getMyConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_entryRulemyConstraint1049);
            iv_rulemyConstraint=rulemyConstraint();

            state._fsp--;

             current =iv_rulemyConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConstraint1059); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyConstraint"


    // $ANTLR start "rulemyConstraint"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:485:1: rulemyConstraint returns [EObject current=null] : (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' ) ;
    public final EObject rulemyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_myConstraintContains_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:488:28: ( (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:489:1: (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:489:1: (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:489:3: otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulemyConstraint1096); 

                	newLeafNode(otherlv_0, grammarAccess.getMyConstraintAccess().getMyConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyConstraint1108); 

                	newLeafNode(otherlv_1, grammarAccess.getMyConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemyConstraint1120); 

                	newLeafNode(otherlv_2, grammarAccess.getMyConstraintAccess().getMyConstraintContainsKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:501:1: ( (lv_myConstraintContains_3_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:502:1: (lv_myConstraintContains_3_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:502:1: (lv_myConstraintContains_3_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:503:3: lv_myConstraintContains_3_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyConstraint1141);
            lv_myConstraintContains_3_0=rulemyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"myConstraintContains",
                    		lv_myConstraintContains_3_0, 
                    		"myExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyConstraint1153); 

                	newLeafNode(otherlv_4, grammarAccess.getMyConstraintAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyConstraint"


    // $ANTLR start "entryRulemyAttribute"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:531:1: entryRulemyAttribute returns [EObject current=null] : iv_rulemyAttribute= rulemyAttribute EOF ;
    public final EObject entryRulemyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyAttribute = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:532:2: (iv_rulemyAttribute= rulemyAttribute EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:533:2: iv_rulemyAttribute= rulemyAttribute EOF
            {
             newCompositeNode(grammarAccess.getMyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_entryRulemyAttribute1189);
            iv_rulemyAttribute=rulemyAttribute();

            state._fsp--;

             current =iv_rulemyAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyAttribute1199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyAttribute"


    // $ANTLR start "rulemyAttribute"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:540:1: rulemyAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) ;
    public final EObject rulemyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_myAttributeContains_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:543:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:544:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:544:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:544:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:544:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:545:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:545:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:546:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyAttribute1245);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemyAttribute1257); 

                	newLeafNode(otherlv_1, grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:566:1: ( (lv_myAttributeContains_2_0= rulemyValue ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:567:1: (lv_myAttributeContains_2_0= rulemyValue )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:567:1: (lv_myAttributeContains_2_0= rulemyValue )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:568:3: lv_myAttributeContains_2_0= rulemyValue
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rulemyAttribute1278);
            lv_myAttributeContains_2_0=rulemyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"myAttributeContains",
                    		lv_myAttributeContains_2_0, 
                    		"myValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulemyAttribute1290); 

                	newLeafNode(otherlv_3, grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyAttribute"


    // $ANTLR start "entryRulemyBinary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:596:1: entryRulemyBinary returns [EObject current=null] : iv_rulemyBinary= rulemyBinary EOF ;
    public final EObject entryRulemyBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBinary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:597:2: (iv_rulemyBinary= rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:598:2: iv_rulemyBinary= rulemyBinary EOF
            {
             newCompositeNode(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary1326);
            iv_rulemyBinary=rulemyBinary();

            state._fsp--;

             current =iv_rulemyBinary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary1336); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyBinary"


    // $ANTLR start "rulemyBinary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:605:1: rulemyBinary returns [EObject current=null] : (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' ) ;
    public final EObject rulemyBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_Oparand_3_0 = null;

        EObject lv_myBinaryLeft_5_0 = null;

        EObject lv_myBinaryRight_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:608:28: ( (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:609:1: (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:609:1: (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:609:3: otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulemyBinary1373); 

                	newLeafNode(otherlv_0, grammarAccess.getMyBinaryAccess().getMyBinaryKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyBinary1385); 

                	newLeafNode(otherlv_1, grammarAccess.getMyBinaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:617:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:617:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulemyBinary1398); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyBinaryAccess().getOparandKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:621:1: ( (lv_Oparand_3_0= rulemyBinaryOparators ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:622:1: (lv_Oparand_3_0= rulemyBinaryOparators )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:622:1: (lv_Oparand_3_0= rulemyBinaryOparators )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:623:3: lv_Oparand_3_0= rulemyBinaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rulemyBinary1419);
                    lv_Oparand_3_0=rulemyBinaryOparators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
                    	        }
                           		set(
                           			current, 
                           			"Oparand",
                            		lv_Oparand_3_0, 
                            		"myBinaryOparators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulemyBinary1433); 

                	newLeafNode(otherlv_4, grammarAccess.getMyBinaryAccess().getMyBinaryLeftKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:643:1: ( (lv_myBinaryLeft_5_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:644:1: (lv_myBinaryLeft_5_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:644:1: (lv_myBinaryLeft_5_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:645:3: lv_myBinaryLeft_5_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyBinary1454);
            lv_myBinaryLeft_5_0=rulemyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"myBinaryLeft",
                    		lv_myBinaryLeft_5_0, 
                    		"myExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulemyBinary1466); 

                	newLeafNode(otherlv_6, grammarAccess.getMyBinaryAccess().getMyBinaryRightKeyword_5());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:665:1: ( (lv_myBinaryRight_7_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:666:1: (lv_myBinaryRight_7_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:666:1: (lv_myBinaryRight_7_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:667:3: lv_myBinaryRight_7_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyBinary1487);
            lv_myBinaryRight_7_0=rulemyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"myBinaryRight",
                    		lv_myBinaryRight_7_0, 
                    		"myExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyBinary1499); 

                	newLeafNode(otherlv_8, grammarAccess.getMyBinaryAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyBinary"


    // $ANTLR start "entryRulemyUnary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:695:1: entryRulemyUnary returns [EObject current=null] : iv_rulemyUnary= rulemyUnary EOF ;
    public final EObject entryRulemyUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyUnary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:696:2: (iv_rulemyUnary= rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:697:2: iv_rulemyUnary= rulemyUnary EOF
            {
             newCompositeNode(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary1535);
            iv_rulemyUnary=rulemyUnary();

            state._fsp--;

             current =iv_rulemyUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary1545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyUnary"


    // $ANTLR start "rulemyUnary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:704:1: rulemyUnary returns [EObject current=null] : (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' ) ;
    public final EObject rulemyUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_Oparand_3_0 = null;

        EObject lv_myUnaryExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:707:28: ( (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:708:1: (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:708:1: (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:708:3: otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulemyUnary1582); 

                	newLeafNode(otherlv_0, grammarAccess.getMyUnaryAccess().getMyUnaryKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyUnary1594); 

                	newLeafNode(otherlv_1, grammarAccess.getMyUnaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:716:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:716:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulemyUnary1607); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyUnaryAccess().getOparandKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:720:1: ( (lv_Oparand_3_0= rulemyUnaryOparators ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:721:1: (lv_Oparand_3_0= rulemyUnaryOparators )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:721:1: (lv_Oparand_3_0= rulemyUnaryOparators )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:722:3: lv_Oparand_3_0= rulemyUnaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rulemyUnary1628);
                    lv_Oparand_3_0=rulemyUnaryOparators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"Oparand",
                            		lv_Oparand_3_0, 
                            		"myUnaryOparators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulemyUnary1642); 

                	newLeafNode(otherlv_4, grammarAccess.getMyUnaryAccess().getMyUnaryExpressionKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:742:1: ( (lv_myUnaryExpression_5_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:743:1: (lv_myUnaryExpression_5_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:743:1: (lv_myUnaryExpression_5_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:744:3: lv_myUnaryExpression_5_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyUnary1663);
            lv_myUnaryExpression_5_0=rulemyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"myUnaryExpression",
                    		lv_myUnaryExpression_5_0, 
                    		"myExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyUnary1675); 

                	newLeafNode(otherlv_6, grammarAccess.getMyUnaryAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyUnary"


    // $ANTLR start "entryRulemyString"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:772:1: entryRulemyString returns [EObject current=null] : iv_rulemyString= rulemyString EOF ;
    public final EObject entryRulemyString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:773:2: (iv_rulemyString= rulemyString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:774:2: iv_rulemyString= rulemyString EOF
            {
             newCompositeNode(grammarAccess.getMyStringRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyString_in_entryRulemyString1711);
            iv_rulemyString=rulemyString();

            state._fsp--;

             current =iv_rulemyString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyString1721); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyString"


    // $ANTLR start "rulemyString"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:781:1: rulemyString returns [EObject current=null] : (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) ;
    public final EObject rulemyString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:784:28: ( (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:785:1: (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:785:1: (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:785:3: otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulemyString1758); 

                	newLeafNode(otherlv_0, grammarAccess.getMyStringAccess().getMyStringKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyString1770); 

                	newLeafNode(otherlv_1, grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulemyString1782); 

                	newLeafNode(otherlv_2, grammarAccess.getMyStringAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:797:1: ( (lv_value_3_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:798:1: (lv_value_3_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:798:1: (lv_value_3_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:799:3: lv_value_3_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rulemyString1803);
            lv_value_3_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyStringRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyString1815); 

                	newLeafNode(otherlv_4, grammarAccess.getMyStringAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyString"


    // $ANTLR start "entryRulemyInt"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:827:1: entryRulemyInt returns [EObject current=null] : iv_rulemyInt= rulemyInt EOF ;
    public final EObject entryRulemyInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyInt = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:828:2: (iv_rulemyInt= rulemyInt EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:829:2: iv_rulemyInt= rulemyInt EOF
            {
             newCompositeNode(grammarAccess.getMyIntRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyInt_in_entryRulemyInt1851);
            iv_rulemyInt=rulemyInt();

            state._fsp--;

             current =iv_rulemyInt; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyInt1861); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyInt"


    // $ANTLR start "rulemyInt"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:836:1: rulemyInt returns [EObject current=null] : (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject rulemyInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:839:28: ( (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:840:1: (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:840:1: (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:840:3: otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulemyInt1898); 

                	newLeafNode(otherlv_0, grammarAccess.getMyIntAccess().getMyIntKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyInt1910); 

                	newLeafNode(otherlv_1, grammarAccess.getMyIntAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulemyInt1922); 

                	newLeafNode(otherlv_2, grammarAccess.getMyIntAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:852:1: ( (lv_value_3_0= ruleInt0 ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:1: (lv_value_3_0= ruleInt0 )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:1: (lv_value_3_0= ruleInt0 )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:854:3: lv_value_3_0= ruleInt0
            {
             
            	        newCompositeNode(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rulemyInt1943);
            lv_value_3_0=ruleInt0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyIntRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Int0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyInt1955); 

                	newLeafNode(otherlv_4, grammarAccess.getMyIntAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyInt"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:882:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:883:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:884:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral1991);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolLiteral2001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:891:1: ruleBoolLiteral returns [EObject current=null] : (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:894:28: ( (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:895:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:895:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:895:3: otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBoolLiteral2038); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBoolLiteral2050); 

                	newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBoolLiteral2062); 

                	newLeafNode(otherlv_2, grammarAccess.getBoolLiteralAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:907:1: ( (lv_value_3_0= ruleBoolean ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:908:1: (lv_value_3_0= ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:908:1: (lv_value_3_0= ruleBoolean )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:909:3: lv_value_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleBoolLiteral2083);
            lv_value_3_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoolLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBoolLiteral2095); 

                	newLeafNode(otherlv_4, grammarAccess.getBoolLiteralAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRulemyIdentifier"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:937:1: entryRulemyIdentifier returns [EObject current=null] : iv_rulemyIdentifier= rulemyIdentifier EOF ;
    public final EObject entryRulemyIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyIdentifier = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:938:2: (iv_rulemyIdentifier= rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:939:2: iv_rulemyIdentifier= rulemyIdentifier EOF
            {
             newCompositeNode(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier2131);
            iv_rulemyIdentifier=rulemyIdentifier();

            state._fsp--;

             current =iv_rulemyIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier2141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyIdentifier"


    // $ANTLR start "rulemyIdentifier"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:946:1: rulemyIdentifier returns [EObject current=null] : (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulemyIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:949:28: ( (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:950:1: (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:950:1: (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:950:3: otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemyIdentifier2178); 

                	newLeafNode(otherlv_0, grammarAccess.getMyIdentifierAccess().getMyIdentifierKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyIdentifier2190); 

                	newLeafNode(otherlv_1, grammarAccess.getMyIdentifierAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulemyIdentifier2202); 

                	newLeafNode(otherlv_2, grammarAccess.getMyIdentifierAccess().getMyIntentifierIsKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:962:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:963:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:963:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:964:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMyIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyIdentifier2225);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyIdentifier2237); 

                	newLeafNode(otherlv_4, grammarAccess.getMyIdentifierAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyIdentifier"


    // $ANTLR start "entryRuleAnyURI"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:989:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:990:2: (iv_ruleAnyURI= ruleAnyURI EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:991:2: iv_ruleAnyURI= ruleAnyURI EOF
            {
             newCompositeNode(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI2274);
            iv_ruleAnyURI=ruleAnyURI();

            state._fsp--;

             current =iv_ruleAnyURI.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI2285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyURI"


    // $ANTLR start "ruleAnyURI"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:998:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1001:28: (kw= 'AnyURI' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1003:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnyURI2322); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyURI"


    // $ANTLR start "entryRuleInt0"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1016:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1017:2: (iv_ruleInt0= ruleInt0 EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1018:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt02362);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt02373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1025:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1028:28: (kw= 'Int' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1030:2: kw= 'Int'
            {
            kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInt02410); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1043:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1044:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1045:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean2450);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean2461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1052:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1055:28: (kw= 'Boolean' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1057:2: kw= 'Boolean'
            {
            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBoolean2498); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBooleanAccess().getBooleanKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRulemyEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1070:1: entryRulemyEnum returns [EObject current=null] : iv_rulemyEnum= rulemyEnum EOF ;
    public final EObject entryRulemyEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1071:2: (iv_rulemyEnum= rulemyEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:2: iv_rulemyEnum= rulemyEnum EOF
            {
             newCompositeNode(grammarAccess.getMyEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_entryRulemyEnum2537);
            iv_rulemyEnum=rulemyEnum();

            state._fsp--;

             current =iv_rulemyEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyEnum2547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyEnum"


    // $ANTLR start "rulemyEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1079:1: rulemyEnum returns [EObject current=null] : ( ( (lv_values_0_0= ruleAnySimpleType ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )* ) ;
    public final EObject rulemyEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1082:28: ( ( ( (lv_values_0_0= ruleAnySimpleType ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1083:1: ( ( (lv_values_0_0= ruleAnySimpleType ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1083:1: ( ( (lv_values_0_0= ruleAnySimpleType ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1083:2: ( (lv_values_0_0= ruleAnySimpleType ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )*
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1083:2: ( (lv_values_0_0= ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1084:1: (lv_values_0_0= ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1084:1: (lv_values_0_0= ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1085:3: lv_values_0_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyEnum2593);
            lv_values_0_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1101:2: (otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1101:4: otherlv_1= ',' ( (lv_values_2_0= ruleAnySimpleType ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyEnum2606); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMyEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1105:1: ( (lv_values_2_0= ruleAnySimpleType ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1106:1: (lv_values_2_0= ruleAnySimpleType )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1106:1: (lv_values_2_0= ruleAnySimpleType )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1107:3: lv_values_2_0= ruleAnySimpleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyEnum2627);
            	    lv_values_2_0=ruleAnySimpleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"AnySimpleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyEnum"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1131:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1132:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1133:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2665);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue2675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1140:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_trueValue_0_0= ruleAnyURI ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleAnyURI ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_trueValue_0_0 = null;

        AntlrDatatypeRuleToken lv_falseValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1143:28: ( ( ( (lv_trueValue_0_0= ruleAnyURI ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleAnyURI ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1144:1: ( ( (lv_trueValue_0_0= ruleAnyURI ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleAnyURI ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1144:1: ( ( (lv_trueValue_0_0= ruleAnyURI ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleAnyURI ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1144:2: ( (lv_trueValue_0_0= ruleAnyURI ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleAnyURI ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1144:2: ( (lv_trueValue_0_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1145:1: (lv_trueValue_0_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1145:1: (lv_trueValue_0_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1146:3: lv_trueValue_0_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2721);
            lv_trueValue_0_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_0_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBooleanValue2733); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanValueAccess().getColonKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1166:1: ( (lv_falseValue_2_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1167:1: (lv_falseValue_2_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1167:1: (lv_falseValue_2_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1168:3: lv_falseValue_2_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2754);
            lv_falseValue_2_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"falseValue",
                    		lv_falseValue_2_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRulemyRange"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1192:1: entryRulemyRange returns [EObject current=null] : iv_rulemyRange= rulemyRange EOF ;
    public final EObject entryRulemyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyRange = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1193:2: (iv_rulemyRange= rulemyRange EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1194:2: iv_rulemyRange= rulemyRange EOF
            {
             newCompositeNode(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange2790);
            iv_rulemyRange=rulemyRange();

            state._fsp--;

             current =iv_rulemyRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange2800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemyRange"


    // $ANTLR start "rulemyRange"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1201:1: rulemyRange returns [EObject current=null] : ( ( (lv_range_0_0= ruleAnySimpleType ) ) otherlv_1= '-' ( (lv_range_2_0= ruleAnySimpleType ) ) ) ;
    public final EObject rulemyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_range_0_0 = null;

        AntlrDatatypeRuleToken lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1204:28: ( ( ( (lv_range_0_0= ruleAnySimpleType ) ) otherlv_1= '-' ( (lv_range_2_0= ruleAnySimpleType ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:1: ( ( (lv_range_0_0= ruleAnySimpleType ) ) otherlv_1= '-' ( (lv_range_2_0= ruleAnySimpleType ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:1: ( ( (lv_range_0_0= ruleAnySimpleType ) ) otherlv_1= '-' ( (lv_range_2_0= ruleAnySimpleType ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:2: ( (lv_range_0_0= ruleAnySimpleType ) ) otherlv_1= '-' ( (lv_range_2_0= ruleAnySimpleType ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:2: ( (lv_range_0_0= ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1206:1: (lv_range_0_0= ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1206:1: (lv_range_0_0= ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1207:3: lv_range_0_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyRange2846);
            lv_range_0_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_0_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulemyRange2858); 

                	newLeafNode(otherlv_1, grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1227:1: ( (lv_range_2_0= ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1228:1: (lv_range_2_0= ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1228:1: (lv_range_2_0= ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1229:3: lv_range_2_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyRange2879);
            lv_range_2_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyRange"


    // $ANTLR start "entryRuleAnySimpleType"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1253:1: entryRuleAnySimpleType returns [String current=null] : iv_ruleAnySimpleType= ruleAnySimpleType EOF ;
    public final String entryRuleAnySimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnySimpleType = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1254:2: (iv_ruleAnySimpleType= ruleAnySimpleType EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1255:2: iv_ruleAnySimpleType= ruleAnySimpleType EOF
            {
             newCompositeNode(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType2916);
            iv_ruleAnySimpleType=ruleAnySimpleType();

            state._fsp--;

             current =iv_ruleAnySimpleType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType2927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnySimpleType"


    // $ANTLR start "ruleAnySimpleType"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1262:1: ruleAnySimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnySimpleType' ;
    public final AntlrDatatypeRuleToken ruleAnySimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1265:28: (kw= 'AnySimpleType' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1267:2: kw= 'AnySimpleType'
            {
            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAnySimpleType2964); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnySimpleType"


    // $ANTLR start "rulemyBinaryOparators"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1280:1: rulemyBinaryOparators returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) ;
    public final Enumerator rulemyBinaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1282:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1283:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1283:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 40:
                {
                alt13=3;
                }
                break;
            case 41:
                {
                alt13=4;
                }
                break;
            case 42:
                {
                alt13=5;
                }
                break;
            case 43:
                {
                alt13=6;
                }
                break;
            case 44:
                {
                alt13=7;
                }
                break;
            case 45:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1283:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1283:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1283:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulemyBinaryOparators3017); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1289:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1289:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1289:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulemyBinaryOparators3034); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1295:6: (enumLiteral_2= 'gt' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1295:6: (enumLiteral_2= 'gt' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1295:8: enumLiteral_2= 'gt'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulemyBinaryOparators3051); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1301:6: (enumLiteral_3= 'lt' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1301:6: (enumLiteral_3= 'lt' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1301:8: enumLiteral_3= 'lt'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulemyBinaryOparators3068); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1307:6: (enumLiteral_4= 'eq' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1307:6: (enumLiteral_4= 'eq' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1307:8: enumLiteral_4= 'eq'
                    {
                    enumLiteral_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulemyBinaryOparators3085); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1313:6: (enumLiteral_5= 'is' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1313:6: (enumLiteral_5= 'is' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1313:8: enumLiteral_5= 'is'
                    {
                    enumLiteral_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulemyBinaryOparators3102); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1319:6: (enumLiteral_6= 'if' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1319:6: (enumLiteral_6= 'if' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1319:8: enumLiteral_6= 'if'
                    {
                    enumLiteral_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulemyBinaryOparators3119); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1325:6: (enumLiteral_7= 'then' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1325:6: (enumLiteral_7= 'then' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1325:8: enumLiteral_7= 'then'
                    {
                    enumLiteral_7=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulemyBinaryOparators3136); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyBinaryOparators"


    // $ANTLR start "rulemyUnaryOparators"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1335:1: rulemyUnaryOparators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator rulemyUnaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1337:28: ( (enumLiteral_0= 'not' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1338:1: (enumLiteral_0= 'not' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1338:1: (enumLiteral_0= 'not' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1338:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulemyUnaryOparators3180); 

                    current = grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemyUnaryOparators"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulemyModel_in_entryRulemyModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyModel140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulemyModel153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel174 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_rulemyModel187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel208 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_rulemyModel222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_entryRulemyExpression260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyExpression270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyExpression317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rulemyExpression344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_rulemyExpression371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_rulemyExpression398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_rulemyExpression425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rulemyExpression452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_rulemyValue544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rulemyValue571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyValue598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_entryRulemyObject756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyObject766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyObject821 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyObject833 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_14_in_rulemyObject846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject867 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_12_in_rulemyObject880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject901 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_15_in_rulemyObject918 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyObject930 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject951 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_rulemyObject964 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject985 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_rulemyObject999 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyObject1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_entryRulemyConstraint1049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConstraint1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulemyConstraint1096 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyConstraint1108 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemyConstraint1120 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyConstraint1141 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyConstraint1153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_entryRulemyAttribute1189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyAttribute1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyAttribute1245 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulemyAttribute1257 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_rulemyValue_in_rulemyAttribute1278 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulemyAttribute1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary1326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulemyBinary1373 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyBinary1385 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_rulemyBinary1398 = new BitSet(new long[]{0x00003FC000000000L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rulemyBinary1419 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulemyBinary1433 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyBinary1454 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulemyBinary1466 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyBinary1487 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyBinary1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary1535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rulemyUnary1582 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyUnary1594 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_21_in_rulemyUnary1607 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rulemyUnary1628 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulemyUnary1642 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyUnary1663 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyUnary1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_entryRulemyString1711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyString1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulemyString1758 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyString1770 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulemyString1782 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rulemyString1803 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyString1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_entryRulemyInt1851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyInt1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulemyInt1898 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyInt1910 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulemyInt1922 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleInt0_in_rulemyInt1943 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyInt1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral1991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBoolLiteral2038 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleBoolLiteral2050 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBoolLiteral2062 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleBoolLiteral2083 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleBoolLiteral2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier2131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulemyIdentifier2178 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyIdentifier2190 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulemyIdentifier2202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyIdentifier2225 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulemyIdentifier2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI2274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAnyURI2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt02362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt02373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInt02410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleBoolean2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_entryRulemyEnum2537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyEnum2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyEnum2593 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_rulemyEnum2606 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyEnum2627 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2721 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleBooleanValue2733 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange2790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyRange2846 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_rulemyRange2858 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyRange2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType2916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAnySimpleType2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulemyBinaryOparators3017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulemyBinaryOparators3034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulemyBinaryOparators3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulemyBinaryOparators3068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulemyBinaryOparators3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulemyBinaryOparators3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulemyBinaryOparators3119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulemyBinaryOparators3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulemyUnaryOparators3180 = new BitSet(new long[]{0x0000000000000002L});
    }


}