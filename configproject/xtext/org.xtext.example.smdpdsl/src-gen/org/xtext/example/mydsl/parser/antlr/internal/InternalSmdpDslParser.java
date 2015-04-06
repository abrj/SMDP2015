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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'myModel'", "'{'", "'myModelContains'", "','", "'}'", "'myObject'", "'myObjectHas'", "'myAttributeContains'", "'myConstraint'", "'myConstraintContains'", "'myAttribute'", "'myBinary'", "'Oparand'", "'myBinaryLeft'", "'myBinaryRight'", "'myUnary'", "'myUnaryExpression'", "'myString'", "'value'", "'myInt'", "'BoolLiteral'", "'myIdentifier'", "'myIntentifierIs'", "'AnyURI'", "'Int'", "'Boolean'", "'myEnum'", "'values'", "'BooleanValue'", "'trueValue'", "'falseValue'", "'myRange'", "'range'", "'AnySimpleType'", "'and'", "'or'", "'gt'", "'lt'", "'eq'", "'is'", "'if'", "'then'", "'not'"
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:77:1: rulemyModel returns [EObject current=null] : ( () otherlv_1= 'myModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject rulemyModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_myModelContains_6_0 = null;

        EObject lv_myModelContains_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:80:28: ( ( () otherlv_1= 'myModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( () otherlv_1= 'myModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( () otherlv_1= 'myModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: () otherlv_1= 'myModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: ()
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyModelAccess().getMyModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getMyModelAccess().getMyModelKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyModel152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyModel164); 

                	newLeafNode(otherlv_3, grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:113:1: (otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:113:3: otherlv_4= 'myModelContains' otherlv_5= '{' ( (lv_myModelContains_6_0= rulemyObject ) ) (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyModel177); 

                        	newLeafNode(otherlv_4, grammarAccess.getMyModelAccess().getMyModelContainsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyModel189); 

                        	newLeafNode(otherlv_5, grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:121:1: ( (lv_myModelContains_6_0= rulemyObject ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:122:1: (lv_myModelContains_6_0= rulemyObject )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:122:1: (lv_myModelContains_6_0= rulemyObject )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:123:3: lv_myModelContains_6_0= rulemyObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel210);
                    lv_myModelContains_6_0=rulemyObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	        }
                           		add(
                           			current, 
                           			"myModelContains",
                            		lv_myModelContains_6_0, 
                            		"myObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:139:2: (otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:139:4: otherlv_7= ',' ( (lv_myModelContains_8_0= rulemyObject ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyModel223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMyModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:143:1: ( (lv_myModelContains_8_0= rulemyObject ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:144:1: (lv_myModelContains_8_0= rulemyObject )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:144:1: (lv_myModelContains_8_0= rulemyObject )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:145:3: lv_myModelContains_8_0= rulemyObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel244);
                    	    lv_myModelContains_8_0=rulemyObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myModelContains",
                    	            		lv_myModelContains_8_0, 
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

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyModel258); 

                        	newLeafNode(otherlv_9, grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyModel272); 

                	newLeafNode(otherlv_10, grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:177:1: entryRulemyExpression returns [EObject current=null] : iv_rulemyExpression= rulemyExpression EOF ;
    public final EObject entryRulemyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyExpression = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:178:2: (iv_rulemyExpression= rulemyExpression EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:179:2: iv_rulemyExpression= rulemyExpression EOF
            {
             newCompositeNode(grammarAccess.getMyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_entryRulemyExpression308);
            iv_rulemyExpression=rulemyExpression();

            state._fsp--;

             current =iv_rulemyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyExpression318); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:186:1: rulemyExpression returns [EObject current=null] : (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier ) ;
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
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:189:28: ( (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:190:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:190:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myString_2= rulemyString | this_myInt_3= rulemyInt | this_BoolLiteral_4= ruleBoolLiteral | this_myIdentifier_5= rulemyIdentifier )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            case 31:
                {
                alt3=5;
                }
                break;
            case 32:
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
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:191:5: this_myBinary_0= rulemyBinary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyExpression365);
                    this_myBinary_0=rulemyBinary();

                    state._fsp--;

                     
                            current = this_myBinary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:201:5: this_myUnary_1= rulemyUnary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rulemyExpression392);
                    this_myUnary_1=rulemyUnary();

                    state._fsp--;

                     
                            current = this_myUnary_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:211:5: this_myString_2= rulemyString
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyStringParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyString_in_rulemyExpression419);
                    this_myString_2=rulemyString();

                    state._fsp--;

                     
                            current = this_myString_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:221:5: this_myInt_3= rulemyInt
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIntParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyInt_in_rulemyExpression446);
                    this_myInt_3=rulemyInt();

                    state._fsp--;

                     
                            current = this_myInt_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:231:5: this_BoolLiteral_4= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getBoolLiteralParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_rulemyExpression473);
                    this_BoolLiteral_4=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:241:5: this_myIdentifier_5= rulemyIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rulemyExpression500);
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:257:1: entryRulemyValue returns [EObject current=null] : iv_rulemyValue= rulemyValue EOF ;
    public final EObject entryRulemyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:258:2: (iv_rulemyValue= rulemyValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:259:2: iv_rulemyValue= rulemyValue EOF
            {
             newCompositeNode(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue535);
            iv_rulemyValue=rulemyValue();

            state._fsp--;

             current =iv_rulemyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue545); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:266:1: rulemyValue returns [EObject current=null] : (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange ) ;
    public final EObject rulemyValue() throws RecognitionException {
        EObject current = null;

        EObject this_myEnum_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_myRange_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:269:28: ( (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:270:1: (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:270:1: (this_myEnum_0= rulemyEnum | this_BooleanValue_1= ruleBooleanValue | this_myRange_2= rulemyRange )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:271:5: this_myEnum_0= rulemyEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyEnumParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_rulemyValue592);
                    this_myEnum_0=rulemyEnum();

                    state._fsp--;

                     
                            current = this_myEnum_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:281:5: this_BooleanValue_1= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getBooleanValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rulemyValue619);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:291:5: this_myRange_2= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyValue646);
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:307:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:308:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:309:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString682);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString693); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:316:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:319:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:320:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:320:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:320:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString733); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:328:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString759); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:343:1: entryRulemyObject returns [EObject current=null] : iv_rulemyObject= rulemyObject EOF ;
    public final EObject entryRulemyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyObject = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:344:2: (iv_rulemyObject= rulemyObject EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:345:2: iv_rulemyObject= rulemyObject EOF
            {
             newCompositeNode(grammarAccess.getMyObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_entryRulemyObject804);
            iv_rulemyObject=rulemyObject();

            state._fsp--;

             current =iv_rulemyObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyObject814); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:352:1: rulemyObject returns [EObject current=null] : ( () otherlv_1= 'myObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject rulemyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_myObjectHas_6_0 = null;

        EObject lv_myObjectHas_8_0 = null;

        EObject lv_myAttributeContains_12_0 = null;

        EObject lv_myAttributeContains_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:355:28: ( ( () otherlv_1= 'myObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:356:1: ( () otherlv_1= 'myObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:356:1: ( () otherlv_1= 'myObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:356:2: () otherlv_1= 'myObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:356:2: ()
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:357:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyObjectAccess().getMyObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulemyObject860); 

                	newLeafNode(otherlv_1, grammarAccess.getMyObjectAccess().getMyObjectKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:366:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:367:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:367:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:368:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyObject881);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject893); 

                	newLeafNode(otherlv_3, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:388:1: (otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:388:3: otherlv_4= 'myObjectHas' otherlv_5= '{' ( (lv_myObjectHas_6_0= rulemyConstraint ) ) (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemyObject906); 

                        	newLeafNode(otherlv_4, grammarAccess.getMyObjectAccess().getMyObjectHasKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject918); 

                        	newLeafNode(otherlv_5, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:396:1: ( (lv_myObjectHas_6_0= rulemyConstraint ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:397:1: (lv_myObjectHas_6_0= rulemyConstraint )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:397:1: (lv_myObjectHas_6_0= rulemyConstraint )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:398:3: lv_myObjectHas_6_0= rulemyConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject939);
                    lv_myObjectHas_6_0=rulemyConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myObjectHas",
                            		lv_myObjectHas_6_0, 
                            		"myConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:414:2: (otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:414:4: otherlv_7= ',' ( (lv_myObjectHas_8_0= rulemyConstraint ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyObject952); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMyObjectAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:418:1: ( (lv_myObjectHas_8_0= rulemyConstraint ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:419:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:419:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:420:3: lv_myObjectHas_8_0= rulemyConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject973);
                    	    lv_myObjectHas_8_0=rulemyConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myObjectHas",
                    	            		lv_myObjectHas_8_0, 
                    	            		"myConstraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject987); 

                        	newLeafNode(otherlv_9, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:440:3: (otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:440:5: otherlv_10= 'myAttributeContains' otherlv_11= '{' ( (lv_myAttributeContains_12_0= rulemyAttribute ) ) (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemyObject1002); 

                        	newLeafNode(otherlv_10, grammarAccess.getMyObjectAccess().getMyAttributeContainsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject1014); 

                        	newLeafNode(otherlv_11, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:448:1: ( (lv_myAttributeContains_12_0= rulemyAttribute ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:449:1: (lv_myAttributeContains_12_0= rulemyAttribute )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:449:1: (lv_myAttributeContains_12_0= rulemyAttribute )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:450:3: lv_myAttributeContains_12_0= rulemyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject1035);
                    lv_myAttributeContains_12_0=rulemyAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myAttributeContains",
                            		lv_myAttributeContains_12_0, 
                            		"myAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:466:2: (otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:466:4: otherlv_13= ',' ( (lv_myAttributeContains_14_0= rulemyAttribute ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyObject1048); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getMyObjectAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:470:1: ( (lv_myAttributeContains_14_0= rulemyAttribute ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:471:1: (lv_myAttributeContains_14_0= rulemyAttribute )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:471:1: (lv_myAttributeContains_14_0= rulemyAttribute )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:472:3: lv_myAttributeContains_14_0= rulemyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject1069);
                    	    lv_myAttributeContains_14_0=rulemyAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myAttributeContains",
                    	            		lv_myAttributeContains_14_0, 
                    	            		"myAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject1083); 

                        	newLeafNode(otherlv_15, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject1097); 

                	newLeafNode(otherlv_16, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:504:1: entryRulemyConstraint returns [EObject current=null] : iv_rulemyConstraint= rulemyConstraint EOF ;
    public final EObject entryRulemyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyConstraint = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:505:2: (iv_rulemyConstraint= rulemyConstraint EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:506:2: iv_rulemyConstraint= rulemyConstraint EOF
            {
             newCompositeNode(grammarAccess.getMyConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_entryRulemyConstraint1133);
            iv_rulemyConstraint=rulemyConstraint();

            state._fsp--;

             current =iv_rulemyConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConstraint1143); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:513:1: rulemyConstraint returns [EObject current=null] : (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' ) ;
    public final EObject rulemyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_myConstraintContains_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:516:28: ( (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:517:1: (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:517:1: (otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:517:3: otherlv_0= 'myConstraint' otherlv_1= '{' otherlv_2= 'myConstraintContains' ( (lv_myConstraintContains_3_0= rulemyExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulemyConstraint1180); 

                	newLeafNode(otherlv_0, grammarAccess.getMyConstraintAccess().getMyConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyConstraint1192); 

                	newLeafNode(otherlv_1, grammarAccess.getMyConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulemyConstraint1204); 

                	newLeafNode(otherlv_2, grammarAccess.getMyConstraintAccess().getMyConstraintContainsKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:529:1: ( (lv_myConstraintContains_3_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:530:1: (lv_myConstraintContains_3_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:530:1: (lv_myConstraintContains_3_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:531:3: lv_myConstraintContains_3_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyConstraint1225);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyConstraint1237); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:559:1: entryRulemyAttribute returns [EObject current=null] : iv_rulemyAttribute= rulemyAttribute EOF ;
    public final EObject entryRulemyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyAttribute = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:560:2: (iv_rulemyAttribute= rulemyAttribute EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:561:2: iv_rulemyAttribute= rulemyAttribute EOF
            {
             newCompositeNode(grammarAccess.getMyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_entryRulemyAttribute1273);
            iv_rulemyAttribute=rulemyAttribute();

            state._fsp--;

             current =iv_rulemyAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyAttribute1283); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:568:1: rulemyAttribute returns [EObject current=null] : (otherlv_0= 'myAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'myAttributeContains' ( (lv_myAttributeContains_4_0= rulemyValue ) ) otherlv_5= '}' ) ;
    public final EObject rulemyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_myAttributeContains_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:571:28: ( (otherlv_0= 'myAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'myAttributeContains' ( (lv_myAttributeContains_4_0= rulemyValue ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:572:1: (otherlv_0= 'myAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'myAttributeContains' ( (lv_myAttributeContains_4_0= rulemyValue ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:572:1: (otherlv_0= 'myAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'myAttributeContains' ( (lv_myAttributeContains_4_0= rulemyValue ) ) otherlv_5= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:572:3: otherlv_0= 'myAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'myAttributeContains' ( (lv_myAttributeContains_4_0= rulemyValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulemyAttribute1320); 

                	newLeafNode(otherlv_0, grammarAccess.getMyAttributeAccess().getMyAttributeKeyword_0());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:576:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:577:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:577:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:578:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyAttribute1341);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyAttribute1353); 

                	newLeafNode(otherlv_2, grammarAccess.getMyAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemyAttribute1365); 

                	newLeafNode(otherlv_3, grammarAccess.getMyAttributeAccess().getMyAttributeContainsKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:602:1: ( (lv_myAttributeContains_4_0= rulemyValue ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:603:1: (lv_myAttributeContains_4_0= rulemyValue )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:603:1: (lv_myAttributeContains_4_0= rulemyValue )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:604:3: lv_myAttributeContains_4_0= rulemyValue
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rulemyAttribute1386);
            lv_myAttributeContains_4_0=rulemyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"myAttributeContains",
                    		lv_myAttributeContains_4_0, 
                    		"myValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyAttribute1398); 

                	newLeafNode(otherlv_5, grammarAccess.getMyAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:632:1: entryRulemyBinary returns [EObject current=null] : iv_rulemyBinary= rulemyBinary EOF ;
    public final EObject entryRulemyBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBinary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:633:2: (iv_rulemyBinary= rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:634:2: iv_rulemyBinary= rulemyBinary EOF
            {
             newCompositeNode(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary1434);
            iv_rulemyBinary=rulemyBinary();

            state._fsp--;

             current =iv_rulemyBinary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary1444); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:641:1: rulemyBinary returns [EObject current=null] : (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' ) ;
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
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:644:28: ( (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:645:1: (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:645:1: (otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:645:3: otherlv_0= 'myBinary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )? otherlv_4= 'myBinaryLeft' ( (lv_myBinaryLeft_5_0= rulemyExpression ) ) otherlv_6= 'myBinaryRight' ( (lv_myBinaryRight_7_0= rulemyExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulemyBinary1481); 

                	newLeafNode(otherlv_0, grammarAccess.getMyBinaryAccess().getMyBinaryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyBinary1493); 

                	newLeafNode(otherlv_1, grammarAccess.getMyBinaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:653:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:653:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyBinaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulemyBinary1506); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyBinaryAccess().getOparandKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:657:1: ( (lv_Oparand_3_0= rulemyBinaryOparators ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:658:1: (lv_Oparand_3_0= rulemyBinaryOparators )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:658:1: (lv_Oparand_3_0= rulemyBinaryOparators )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:659:3: lv_Oparand_3_0= rulemyBinaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rulemyBinary1527);
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

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulemyBinary1541); 

                	newLeafNode(otherlv_4, grammarAccess.getMyBinaryAccess().getMyBinaryLeftKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:679:1: ( (lv_myBinaryLeft_5_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:680:1: (lv_myBinaryLeft_5_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:680:1: (lv_myBinaryLeft_5_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:681:3: lv_myBinaryLeft_5_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyBinary1562);
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

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulemyBinary1574); 

                	newLeafNode(otherlv_6, grammarAccess.getMyBinaryAccess().getMyBinaryRightKeyword_5());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:701:1: ( (lv_myBinaryRight_7_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:702:1: (lv_myBinaryRight_7_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:702:1: (lv_myBinaryRight_7_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:703:3: lv_myBinaryRight_7_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyBinary1595);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyBinary1607); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:731:1: entryRulemyUnary returns [EObject current=null] : iv_rulemyUnary= rulemyUnary EOF ;
    public final EObject entryRulemyUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyUnary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:732:2: (iv_rulemyUnary= rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:733:2: iv_rulemyUnary= rulemyUnary EOF
            {
             newCompositeNode(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary1643);
            iv_rulemyUnary=rulemyUnary();

            state._fsp--;

             current =iv_rulemyUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary1653); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:740:1: rulemyUnary returns [EObject current=null] : (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' ) ;
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
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:743:28: ( (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:744:1: (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:744:1: (otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:744:3: otherlv_0= 'myUnary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )? otherlv_4= 'myUnaryExpression' ( (lv_myUnaryExpression_5_0= rulemyExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulemyUnary1690); 

                	newLeafNode(otherlv_0, grammarAccess.getMyUnaryAccess().getMyUnaryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyUnary1702); 

                	newLeafNode(otherlv_1, grammarAccess.getMyUnaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:752:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:752:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= rulemyUnaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulemyUnary1715); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyUnaryAccess().getOparandKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:756:1: ( (lv_Oparand_3_0= rulemyUnaryOparators ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:757:1: (lv_Oparand_3_0= rulemyUnaryOparators )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:757:1: (lv_Oparand_3_0= rulemyUnaryOparators )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:758:3: lv_Oparand_3_0= rulemyUnaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rulemyUnary1736);
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

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulemyUnary1750); 

                	newLeafNode(otherlv_4, grammarAccess.getMyUnaryAccess().getMyUnaryExpressionKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:778:1: ( (lv_myUnaryExpression_5_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:779:1: (lv_myUnaryExpression_5_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:779:1: (lv_myUnaryExpression_5_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:780:3: lv_myUnaryExpression_5_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyUnary1771);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyUnary1783); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:808:1: entryRulemyString returns [EObject current=null] : iv_rulemyString= rulemyString EOF ;
    public final EObject entryRulemyString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:809:2: (iv_rulemyString= rulemyString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:810:2: iv_rulemyString= rulemyString EOF
            {
             newCompositeNode(grammarAccess.getMyStringRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyString_in_entryRulemyString1819);
            iv_rulemyString=rulemyString();

            state._fsp--;

             current =iv_rulemyString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyString1829); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:817:1: rulemyString returns [EObject current=null] : (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) ;
    public final EObject rulemyString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:820:28: ( (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:821:1: (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:821:1: (otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:821:3: otherlv_0= 'myString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulemyString1866); 

                	newLeafNode(otherlv_0, grammarAccess.getMyStringAccess().getMyStringKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyString1878); 

                	newLeafNode(otherlv_1, grammarAccess.getMyStringAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulemyString1890); 

                	newLeafNode(otherlv_2, grammarAccess.getMyStringAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:833:1: ( (lv_value_3_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:834:1: (lv_value_3_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:834:1: (lv_value_3_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:835:3: lv_value_3_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rulemyString1911);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyString1923); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:863:1: entryRulemyInt returns [EObject current=null] : iv_rulemyInt= rulemyInt EOF ;
    public final EObject entryRulemyInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyInt = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:864:2: (iv_rulemyInt= rulemyInt EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:865:2: iv_rulemyInt= rulemyInt EOF
            {
             newCompositeNode(grammarAccess.getMyIntRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyInt_in_entryRulemyInt1959);
            iv_rulemyInt=rulemyInt();

            state._fsp--;

             current =iv_rulemyInt; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyInt1969); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:872:1: rulemyInt returns [EObject current=null] : (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject rulemyInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:875:28: ( (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: (otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:3: otherlv_0= 'myInt' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemyInt2006); 

                	newLeafNode(otherlv_0, grammarAccess.getMyIntAccess().getMyIntKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyInt2018); 

                	newLeafNode(otherlv_1, grammarAccess.getMyIntAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulemyInt2030); 

                	newLeafNode(otherlv_2, grammarAccess.getMyIntAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:888:1: ( (lv_value_3_0= ruleInt0 ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:889:1: (lv_value_3_0= ruleInt0 )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:889:1: (lv_value_3_0= ruleInt0 )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:890:3: lv_value_3_0= ruleInt0
            {
             
            	        newCompositeNode(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rulemyInt2051);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyInt2063); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:918:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:919:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:920:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2099);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolLiteral2109); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:927:1: ruleBoolLiteral returns [EObject current=null] : (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:930:28: ( (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:931:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:931:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:931:3: otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBoolLiteral2146); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolLiteral2158); 

                	newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBoolLiteral2170); 

                	newLeafNode(otherlv_2, grammarAccess.getBoolLiteralAccess().getValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:943:1: ( (lv_value_3_0= ruleBoolean ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:944:1: (lv_value_3_0= ruleBoolean )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:944:1: (lv_value_3_0= ruleBoolean )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:945:3: lv_value_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleBoolLiteral2191);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBoolLiteral2203); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:973:1: entryRulemyIdentifier returns [EObject current=null] : iv_rulemyIdentifier= rulemyIdentifier EOF ;
    public final EObject entryRulemyIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyIdentifier = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:974:2: (iv_rulemyIdentifier= rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:975:2: iv_rulemyIdentifier= rulemyIdentifier EOF
            {
             newCompositeNode(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier2239);
            iv_rulemyIdentifier=rulemyIdentifier();

            state._fsp--;

             current =iv_rulemyIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier2249); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:982:1: rulemyIdentifier returns [EObject current=null] : (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulemyIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:985:28: ( (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:986:1: (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:986:1: (otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:986:3: otherlv_0= 'myIdentifier' otherlv_1= '{' otherlv_2= 'myIntentifierIs' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulemyIdentifier2286); 

                	newLeafNode(otherlv_0, grammarAccess.getMyIdentifierAccess().getMyIdentifierKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyIdentifier2298); 

                	newLeafNode(otherlv_1, grammarAccess.getMyIdentifierAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulemyIdentifier2310); 

                	newLeafNode(otherlv_2, grammarAccess.getMyIdentifierAccess().getMyIntentifierIsKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:998:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:999:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:999:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1000:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMyIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyIdentifier2333);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyIdentifier2345); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1025:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1026:2: (iv_ruleAnyURI= ruleAnyURI EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1027:2: iv_ruleAnyURI= ruleAnyURI EOF
            {
             newCompositeNode(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI2382);
            iv_ruleAnyURI=ruleAnyURI();

            state._fsp--;

             current =iv_ruleAnyURI.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI2393); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1034:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1037:28: (kw= 'AnyURI' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1039:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAnyURI2430); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1052:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1053:2: (iv_ruleInt0= ruleInt0 EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1054:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt02470);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt02481); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1061:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1064:28: (kw= 'Int' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1066:2: kw= 'Int'
            {
            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInt02518); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1079:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1080:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1081:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean2558);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean2569); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1088:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1091:28: (kw= 'Boolean' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1093:2: kw= 'Boolean'
            {
            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBoolean2606); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1106:1: entryRulemyEnum returns [EObject current=null] : iv_rulemyEnum= rulemyEnum EOF ;
    public final EObject entryRulemyEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1107:2: (iv_rulemyEnum= rulemyEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1108:2: iv_rulemyEnum= rulemyEnum EOF
            {
             newCompositeNode(grammarAccess.getMyEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyEnum_in_entryRulemyEnum2645);
            iv_rulemyEnum=rulemyEnum();

            state._fsp--;

             current =iv_rulemyEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyEnum2655); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1115:1: rulemyEnum returns [EObject current=null] : (otherlv_0= 'myEnum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject rulemyEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_values_4_0 = null;

        AntlrDatatypeRuleToken lv_values_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1118:28: ( (otherlv_0= 'myEnum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1119:1: (otherlv_0= 'myEnum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1119:1: (otherlv_0= 'myEnum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1119:3: otherlv_0= 'myEnum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulemyEnum2692); 

                	newLeafNode(otherlv_0, grammarAccess.getMyEnumAccess().getMyEnumKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyEnum2704); 

                	newLeafNode(otherlv_1, grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulemyEnum2716); 

                	newLeafNode(otherlv_2, grammarAccess.getMyEnumAccess().getValuesKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyEnum2728); 

                	newLeafNode(otherlv_3, grammarAccess.getMyEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1135:1: ( (lv_values_4_0= ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1136:1: (lv_values_4_0= ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1136:1: (lv_values_4_0= ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1137:3: lv_values_4_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyEnum2749);
            lv_values_4_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_4_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1153:2: (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1153:4: otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyEnum2762); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMyEnumAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1157:1: ( (lv_values_6_0= ruleAnySimpleType ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1158:1: (lv_values_6_0= ruleAnySimpleType )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1158:1: (lv_values_6_0= ruleAnySimpleType )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1159:3: lv_values_6_0= ruleAnySimpleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyEnumAccess().getValuesAnySimpleTypeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyEnum2783);
            	    lv_values_6_0=ruleAnySimpleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_6_0, 
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

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyEnum2797); 

                	newLeafNode(otherlv_7, grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyEnum2809); 

                	newLeafNode(otherlv_8, grammarAccess.getMyEnumAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1191:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1192:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1193:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2845);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue2855); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1200:1: ruleBooleanValue returns [EObject current=null] : (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_trueValue_3_0 = null;

        AntlrDatatypeRuleToken lv_falseValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1203:28: ( (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1204:1: (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1204:1: (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1204:3: otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBooleanValue2892); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBooleanValue2904); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanValueAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBooleanValue2916); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getTrueValueKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1216:1: ( (lv_trueValue_3_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1217:1: (lv_trueValue_3_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1217:1: (lv_trueValue_3_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1218:3: lv_trueValue_3_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2937);
            lv_trueValue_3_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_3_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBooleanValue2949); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanValueAccess().getFalseValueKeyword_4());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1238:1: ( (lv_falseValue_5_0= ruleAnyURI ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1239:1: (lv_falseValue_5_0= ruleAnyURI )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1239:1: (lv_falseValue_5_0= ruleAnyURI )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1240:3: lv_falseValue_5_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2970);
            lv_falseValue_5_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"falseValue",
                    		lv_falseValue_5_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBooleanValue2982); 

                	newLeafNode(otherlv_6, grammarAccess.getBooleanValueAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1268:1: entryRulemyRange returns [EObject current=null] : iv_rulemyRange= rulemyRange EOF ;
    public final EObject entryRulemyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyRange = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1269:2: (iv_rulemyRange= rulemyRange EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1270:2: iv_rulemyRange= rulemyRange EOF
            {
             newCompositeNode(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange3018);
            iv_rulemyRange=rulemyRange();

            state._fsp--;

             current =iv_rulemyRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange3028); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1277:1: rulemyRange returns [EObject current=null] : (otherlv_0= 'myRange' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' ) ;
    public final EObject rulemyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_range_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1280:28: ( (otherlv_0= 'myRange' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1281:1: (otherlv_0= 'myRange' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1281:1: (otherlv_0= 'myRange' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1281:3: otherlv_0= 'myRange' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulemyRange3065); 

                	newLeafNode(otherlv_0, grammarAccess.getMyRangeAccess().getMyRangeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyRange3077); 

                	newLeafNode(otherlv_1, grammarAccess.getMyRangeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulemyRange3089); 

                	newLeafNode(otherlv_2, grammarAccess.getMyRangeAccess().getRangeKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1293:1: ( (lv_range_3_0= ruleAnySimpleType ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1294:1: (lv_range_3_0= ruleAnySimpleType )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1294:1: (lv_range_3_0= ruleAnySimpleType )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1295:3: lv_range_3_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getMyRangeAccess().getRangeAnySimpleTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rulemyRange3110);
            lv_range_3_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyRange3122); 

                	newLeafNode(otherlv_4, grammarAccess.getMyRangeAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1323:1: entryRuleAnySimpleType returns [String current=null] : iv_ruleAnySimpleType= ruleAnySimpleType EOF ;
    public final String entryRuleAnySimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnySimpleType = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1324:2: (iv_ruleAnySimpleType= ruleAnySimpleType EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1325:2: iv_ruleAnySimpleType= ruleAnySimpleType EOF
            {
             newCompositeNode(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType3159);
            iv_ruleAnySimpleType=ruleAnySimpleType();

            state._fsp--;

             current =iv_ruleAnySimpleType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType3170); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1332:1: ruleAnySimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnySimpleType' ;
    public final AntlrDatatypeRuleToken ruleAnySimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1335:28: (kw= 'AnySimpleType' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1337:2: kw= 'AnySimpleType'
            {
            kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAnySimpleType3207); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1350:1: rulemyBinaryOparators returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) ;
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
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1352:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1353:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1353:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt13=1;
                }
                break;
            case 46:
                {
                alt13=2;
                }
                break;
            case 47:
                {
                alt13=3;
                }
                break;
            case 48:
                {
                alt13=4;
                }
                break;
            case 49:
                {
                alt13=5;
                }
                break;
            case 50:
                {
                alt13=6;
                }
                break;
            case 51:
                {
                alt13=7;
                }
                break;
            case 52:
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
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1353:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1353:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1353:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulemyBinaryOparators3260); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1359:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1359:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1359:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulemyBinaryOparators3277); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1365:6: (enumLiteral_2= 'gt' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1365:6: (enumLiteral_2= 'gt' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1365:8: enumLiteral_2= 'gt'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_rulemyBinaryOparators3294); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1371:6: (enumLiteral_3= 'lt' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1371:6: (enumLiteral_3= 'lt' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1371:8: enumLiteral_3= 'lt'
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulemyBinaryOparators3311); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1377:6: (enumLiteral_4= 'eq' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1377:6: (enumLiteral_4= 'eq' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1377:8: enumLiteral_4= 'eq'
                    {
                    enumLiteral_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulemyBinaryOparators3328); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1383:6: (enumLiteral_5= 'is' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1383:6: (enumLiteral_5= 'is' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1383:8: enumLiteral_5= 'is'
                    {
                    enumLiteral_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulemyBinaryOparators3345); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1389:6: (enumLiteral_6= 'if' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1389:6: (enumLiteral_6= 'if' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1389:8: enumLiteral_6= 'if'
                    {
                    enumLiteral_6=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulemyBinaryOparators3362); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1395:6: (enumLiteral_7= 'then' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1395:6: (enumLiteral_7= 'then' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1395:8: enumLiteral_7= 'then'
                    {
                    enumLiteral_7=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulemyBinaryOparators3379); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1405:1: rulemyUnaryOparators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator rulemyUnaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1407:28: ( (enumLiteral_0= 'not' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1408:1: (enumLiteral_0= 'not' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1408:1: (enumLiteral_0= 'not' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1408:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulemyUnaryOparators3423); 

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
        public static final BitSet FOLLOW_11_in_rulemyModel131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyModel152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyModel164 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_rulemyModel177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyModel189 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulemyModel223 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulemyModel258 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyModel272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_entryRulemyExpression308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyExpression318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyExpression365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rulemyExpression392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_rulemyExpression419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_rulemyExpression446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_rulemyExpression473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rulemyExpression500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_rulemyValue592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rulemyValue619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyValue646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_entryRulemyObject804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyObject814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulemyObject860 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyObject881 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyObject893 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_rulemyObject906 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyObject918 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject939 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulemyObject952 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject973 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulemyObject987 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_rulemyObject1002 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyObject1014 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject1035 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulemyObject1048 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject1069 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulemyObject1083 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyObject1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_entryRulemyConstraint1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConstraint1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rulemyConstraint1180 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyConstraint1192 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulemyConstraint1204 = new BitSet(new long[]{0x00000001D4400000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyConstraint1225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyConstraint1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_entryRulemyAttribute1273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyAttribute1283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulemyAttribute1320 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyAttribute1341 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyAttribute1353 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulemyAttribute1365 = new BitSet(new long[]{0x000004A000000000L});
        public static final BitSet FOLLOW_rulemyValue_in_rulemyAttribute1386 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyAttribute1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary1434 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulemyBinary1481 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyBinary1493 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_rulemyBinary1506 = new BitSet(new long[]{0x001FE00000000000L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rulemyBinary1527 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulemyBinary1541 = new BitSet(new long[]{0x00000001D4400000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyBinary1562 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulemyBinary1574 = new BitSet(new long[]{0x00000001D4400000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyBinary1595 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyBinary1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary1643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rulemyUnary1690 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyUnary1702 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_23_in_rulemyUnary1715 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rulemyUnary1736 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulemyUnary1750 = new BitSet(new long[]{0x00000001D4400000L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyUnary1771 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyUnary1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyString_in_entryRulemyString1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyString1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulemyString1866 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyString1878 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulemyString1890 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rulemyString1911 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyString1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyInt_in_entryRulemyInt1959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyInt1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulemyInt2006 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyInt2018 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulemyInt2030 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleInt0_in_rulemyInt2051 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyInt2063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleBoolLiteral2146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBoolLiteral2158 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleBoolLiteral2170 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleBoolLiteral2191 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBoolLiteral2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier2239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulemyIdentifier2286 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyIdentifier2298 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulemyIdentifier2310 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyIdentifier2333 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyIdentifier2345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI2382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAnyURI2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt02470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt02481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleInt02518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBoolean2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyEnum_in_entryRulemyEnum2645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyEnum2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulemyEnum2692 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyEnum2704 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_rulemyEnum2716 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyEnum2728 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyEnum2749 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulemyEnum2762 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyEnum2783 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulemyEnum2797 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyEnum2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBooleanValue2892 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBooleanValue2904 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleBooleanValue2916 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2937 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleBooleanValue2949 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2970 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBooleanValue2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange3018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange3028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulemyRange3065 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulemyRange3077 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_rulemyRange3089 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rulemyRange3110 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulemyRange3122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType3159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAnySimpleType3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulemyBinaryOparators3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulemyBinaryOparators3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rulemyBinaryOparators3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulemyBinaryOparators3311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulemyBinaryOparators3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulemyBinaryOparators3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulemyBinaryOparators3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulemyBinaryOparators3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulemyUnaryOparators3423 = new BitSet(new long[]{0x0000000000000002L});
    }


}