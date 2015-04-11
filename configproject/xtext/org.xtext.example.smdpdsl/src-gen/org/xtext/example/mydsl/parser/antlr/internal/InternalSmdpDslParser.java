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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'has'", "'Constrained by'", "'if'", "'then'", "'['", "']'", "'('", "')'", "':'", "'*'", "'-'", "'.'", "'E'", "'e'", "'&&'", "'|'", "'<'", "'>'", "'='", "'can'", "'not'"
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


    // $ANTLR start "entryRulemyValue"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:161:1: entryRulemyValue returns [EObject current=null] : iv_rulemyValue= rulemyValue EOF ;
    public final EObject entryRulemyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:162:2: (iv_rulemyValue= rulemyValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:163:2: iv_rulemyValue= rulemyValue EOF
            {
             newCompositeNode(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue260);
            iv_rulemyValue=rulemyValue();

            state._fsp--;

             current =iv_rulemyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue270); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:170:1: rulemyValue returns [EObject current=null] : (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myStringEnum_2= rulemyStringEnum | this_myNumberEnum_3= rulemyNumberEnum ) ;
    public final EObject rulemyValue() throws RecognitionException {
        EObject current = null;

        EObject this_myBoolean_0 = null;

        EObject this_myRange_1 = null;

        EObject this_myStringEnum_2 = null;

        EObject this_myNumberEnum_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:173:28: ( (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myStringEnum_2= rulemyStringEnum | this_myNumberEnum_3= rulemyNumberEnum ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:174:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myStringEnum_2= rulemyStringEnum | this_myNumberEnum_3= rulemyNumberEnum )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:174:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myStringEnum_2= rulemyStringEnum | this_myNumberEnum_3= rulemyNumberEnum )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==12||LA3_1==19) ) {
                    alt3=3;
                }
                else if ( (LA3_1==22) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==12||LA3_2==19) ) {
                    alt3=3;
                }
                else if ( (LA3_2==22) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EOF||LA3_3==12||LA3_3==19||LA3_3==25) ) {
                    alt3=4;
                }
                else if ( (LA3_3==24) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:175:5: this_myBoolean_0= rulemyBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyBooleanParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rulemyValue317);
                    this_myBoolean_0=rulemyBoolean();

                    state._fsp--;

                     
                            current = this_myBoolean_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:185:5: this_myRange_1= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyValue344);
                    this_myRange_1=rulemyRange();

                    state._fsp--;

                     
                            current = this_myRange_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:195:5: this_myStringEnum_2= rulemyStringEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyStringEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rulemyValue371);
                    this_myStringEnum_2=rulemyStringEnum();

                    state._fsp--;

                     
                            current = this_myStringEnum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:205:5: this_myNumberEnum_3= rulemyNumberEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyNumberEnumParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rulemyValue398);
                    this_myNumberEnum_3=rulemyNumberEnum();

                    state._fsp--;

                     
                            current = this_myNumberEnum_3; 
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


    // $ANTLR start "entryRulemyExpression"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:221:1: entryRulemyExpression returns [EObject current=null] : iv_rulemyExpression= rulemyExpression EOF ;
    public final EObject entryRulemyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyExpression = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:222:2: (iv_rulemyExpression= rulemyExpression EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:223:2: iv_rulemyExpression= rulemyExpression EOF
            {
             newCompositeNode(grammarAccess.getMyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_entryRulemyExpression433);
            iv_rulemyExpression=rulemyExpression();

            state._fsp--;

             current =iv_rulemyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyExpression443); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:230:1: rulemyExpression returns [EObject current=null] : (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myBoolean_2= rulemyBoolean | this_myRange_3= rulemyRange | this_myStringEnum_4= rulemyStringEnum | this_myNumberEnum_5= rulemyNumberEnum | this_myIdentifier_6= rulemyIdentifier ) ;
    public final EObject rulemyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_myBinary_0 = null;

        EObject this_myUnary_1 = null;

        EObject this_myBoolean_2 = null;

        EObject this_myRange_3 = null;

        EObject this_myStringEnum_4 = null;

        EObject this_myNumberEnum_5 = null;

        EObject this_myIdentifier_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:233:28: ( (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myBoolean_2= rulemyBoolean | this_myRange_3= rulemyRange | this_myStringEnum_4= rulemyStringEnum | this_myNumberEnum_5= rulemyNumberEnum | this_myIdentifier_6= rulemyIdentifier ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:234:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myBoolean_2= rulemyBoolean | this_myRange_3= rulemyRange | this_myStringEnum_4= rulemyStringEnum | this_myNumberEnum_5= rulemyNumberEnum | this_myIdentifier_6= rulemyIdentifier )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:234:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myBoolean_2= rulemyBoolean | this_myRange_3= rulemyRange | this_myStringEnum_4= rulemyStringEnum | this_myNumberEnum_5= rulemyNumberEnum | this_myIdentifier_6= rulemyIdentifier )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:235:5: this_myBinary_0= rulemyBinary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyExpression490);
                    this_myBinary_0=rulemyBinary();

                    state._fsp--;

                     
                            current = this_myBinary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:245:5: this_myUnary_1= rulemyUnary
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rulemyExpression517);
                    this_myUnary_1=rulemyUnary();

                    state._fsp--;

                     
                            current = this_myUnary_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:255:5: this_myBoolean_2= rulemyBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBooleanParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rulemyExpression544);
                    this_myBoolean_2=rulemyBoolean();

                    state._fsp--;

                     
                            current = this_myBoolean_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:265:5: this_myRange_3= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyRangeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyExpression571);
                    this_myRange_3=rulemyRange();

                    state._fsp--;

                     
                            current = this_myRange_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:275:5: this_myStringEnum_4= rulemyStringEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyStringEnumParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rulemyExpression598);
                    this_myStringEnum_4=rulemyStringEnum();

                    state._fsp--;

                     
                            current = this_myStringEnum_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:285:5: this_myNumberEnum_5= rulemyNumberEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyNumberEnumParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rulemyExpression625);
                    this_myNumberEnum_5=rulemyNumberEnum();

                    state._fsp--;

                     
                            current = this_myNumberEnum_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:295:5: this_myIdentifier_6= rulemyIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rulemyExpression652);
                    this_myIdentifier_6=rulemyIdentifier();

                    state._fsp--;

                     
                            current = this_myIdentifier_6; 
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:311:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:312:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:313:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString688);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString699); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:320:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:323:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:324:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:324:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:324:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString739); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:332:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString765); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:347:1: entryRulemyObject returns [EObject current=null] : iv_rulemyObject= rulemyObject EOF ;
    public final EObject entryRulemyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyObject = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:348:2: (iv_rulemyObject= rulemyObject EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:349:2: iv_rulemyObject= rulemyObject EOF
            {
             newCompositeNode(grammarAccess.getMyObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_entryRulemyObject810);
            iv_rulemyObject=rulemyObject();

            state._fsp--;

             current =iv_rulemyObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyObject820); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:356:1: rulemyObject returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )? otherlv_11= '}' ) ;
    public final EObject rulemyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_myAttributeContains_4_0 = null;

        EObject lv_myAttributeContains_6_0 = null;

        EObject lv_myObjectHas_8_0 = null;

        EObject lv_myObjectHas_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:359:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )? otherlv_11= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:360:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )? otherlv_11= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:360:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )? otherlv_11= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:360:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )? (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )? otherlv_11= '}'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:360:2: ()
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:361:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyObjectAccess().getMyObjectAction_0(),
                        current);
                

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:366:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:367:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:367:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:368:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyObject875);
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

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyObject887); 

                	newLeafNode(otherlv_2, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:388:1: (otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:388:3: otherlv_3= 'has' ( (lv_myAttributeContains_4_0= rulemyAttribute ) ) (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyObject900); 

                        	newLeafNode(otherlv_3, grammarAccess.getMyObjectAccess().getHasKeyword_3_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:392:1: ( (lv_myAttributeContains_4_0= rulemyAttribute ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:393:1: (lv_myAttributeContains_4_0= rulemyAttribute )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:393:1: (lv_myAttributeContains_4_0= rulemyAttribute )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:394:3: lv_myAttributeContains_4_0= rulemyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject921);
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

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:410:2: (otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:410:4: otherlv_5= ',' ( (lv_myAttributeContains_6_0= rulemyAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject934); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:414:1: ( (lv_myAttributeContains_6_0= rulemyAttribute ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:415:1: (lv_myAttributeContains_6_0= rulemyAttribute )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:415:1: (lv_myAttributeContains_6_0= rulemyAttribute )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:416:3: lv_myAttributeContains_6_0= rulemyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject955);
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

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:432:6: (otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:432:8: otherlv_7= 'Constrained by' ( (lv_myObjectHas_8_0= rulemyConstraint ) ) (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )*
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject972); 

                        	newLeafNode(otherlv_7, grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:436:1: ( (lv_myObjectHas_8_0= rulemyConstraint ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:437:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:437:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:438:3: lv_myObjectHas_8_0= rulemyConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject993);
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

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:454:2: (otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:454:4: otherlv_9= ',' ( (lv_myObjectHas_10_0= rulemyConstraint ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject1006); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:458:1: ( (lv_myObjectHas_10_0= rulemyConstraint ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:459:1: (lv_myObjectHas_10_0= rulemyConstraint )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:459:1: (lv_myObjectHas_10_0= rulemyConstraint )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:460:3: lv_myObjectHas_10_0= rulemyConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject1027);
                    	    lv_myObjectHas_10_0=rulemyConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myObjectHas",
                    	            		lv_myObjectHas_10_0, 
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


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyObject1043); 

                	newLeafNode(otherlv_11, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:488:1: entryRulemyConstraint returns [EObject current=null] : iv_rulemyConstraint= rulemyConstraint EOF ;
    public final EObject entryRulemyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyConstraint = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:489:2: (iv_rulemyConstraint= rulemyConstraint EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:490:2: iv_rulemyConstraint= rulemyConstraint EOF
            {
             newCompositeNode(grammarAccess.getMyConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_entryRulemyConstraint1079);
            iv_rulemyConstraint=rulemyConstraint();

            state._fsp--;

             current =iv_rulemyConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConstraint1089); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:497:1: rulemyConstraint returns [EObject current=null] : (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) ) ) ;
    public final EObject rulemyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_myIfConstraint_1_0 = null;

        EObject lv_myThenConstraint_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:500:28: ( (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:501:1: (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:501:1: (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:501:3: otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulemyConstraint1126); 

                	newLeafNode(otherlv_0, grammarAccess.getMyConstraintAccess().getIfKeyword_0());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:505:1: ( (lv_myIfConstraint_1_0= rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:506:1: (lv_myIfConstraint_1_0= rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:506:1: (lv_myIfConstraint_1_0= rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:507:3: lv_myIfConstraint_1_0= rulemyConcreteExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyConcreteExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rulemyConstraint1147);
            lv_myIfConstraint_1_0=rulemyConcreteExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"myIfConstraint",
                    		lv_myIfConstraint_1_0, 
                    		"myConcreteExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemyConstraint1159); 

                	newLeafNode(otherlv_2, grammarAccess.getMyConstraintAccess().getThenKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:527:1: ( (lv_myThenConstraint_3_0= rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:528:1: (lv_myThenConstraint_3_0= rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:528:1: (lv_myThenConstraint_3_0= rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:529:3: lv_myThenConstraint_3_0= rulemyConcreteExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyConcreteExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rulemyConstraint1180);
            lv_myThenConstraint_3_0=rulemyConcreteExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"myThenConstraint",
                    		lv_myThenConstraint_3_0, 
                    		"myConcreteExpression");
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
    // $ANTLR end "rulemyConstraint"


    // $ANTLR start "entryRulemyAttribute"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:553:1: entryRulemyAttribute returns [EObject current=null] : iv_rulemyAttribute= rulemyAttribute EOF ;
    public final EObject entryRulemyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyAttribute = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:554:2: (iv_rulemyAttribute= rulemyAttribute EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:555:2: iv_rulemyAttribute= rulemyAttribute EOF
            {
             newCompositeNode(grammarAccess.getMyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_entryRulemyAttribute1216);
            iv_rulemyAttribute=rulemyAttribute();

            state._fsp--;

             current =iv_rulemyAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyAttribute1226); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:562:1: rulemyAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) ;
    public final EObject rulemyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_myAttributeContains_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:565:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:566:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:566:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:566:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:566:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:567:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:567:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:568:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyAttribute1272);
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemyAttribute1284); 

                	newLeafNode(otherlv_1, grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:588:1: ( (lv_myAttributeContains_2_0= rulemyValue ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:589:1: (lv_myAttributeContains_2_0= rulemyValue )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:589:1: (lv_myAttributeContains_2_0= rulemyValue )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:590:3: lv_myAttributeContains_2_0= rulemyValue
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rulemyAttribute1305);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulemyAttribute1317); 

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


    // $ANTLR start "entryRulemyConcreteExpression"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:618:1: entryRulemyConcreteExpression returns [EObject current=null] : iv_rulemyConcreteExpression= rulemyConcreteExpression EOF ;
    public final EObject entryRulemyConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyConcreteExpression = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:619:2: (iv_rulemyConcreteExpression= rulemyConcreteExpression EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:620:2: iv_rulemyConcreteExpression= rulemyConcreteExpression EOF
            {
             newCompositeNode(grammarAccess.getMyConcreteExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_entryRulemyConcreteExpression1353);
            iv_rulemyConcreteExpression=rulemyConcreteExpression();

            state._fsp--;

             current =iv_rulemyConcreteExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConcreteExpression1363); 

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
    // $ANTLR end "entryRulemyConcreteExpression"


    // $ANTLR start "rulemyConcreteExpression"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:627:1: rulemyConcreteExpression returns [EObject current=null] : ( (lv_myConcreteEx_0_0= rulemyExpression ) ) ;
    public final EObject rulemyConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_myConcreteEx_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:630:28: ( ( (lv_myConcreteEx_0_0= rulemyExpression ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:631:1: ( (lv_myConcreteEx_0_0= rulemyExpression ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:631:1: ( (lv_myConcreteEx_0_0= rulemyExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:632:1: (lv_myConcreteEx_0_0= rulemyExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:632:1: (lv_myConcreteEx_0_0= rulemyExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:633:3: lv_myConcreteEx_0_0= rulemyExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExMyExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyExpression_in_rulemyConcreteExpression1408);
            lv_myConcreteEx_0_0=rulemyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConcreteExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"myConcreteEx",
                    		lv_myConcreteEx_0_0, 
                    		"myExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulemyConcreteExpression"


    // $ANTLR start "entryRulemyBinary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:657:1: entryRulemyBinary returns [EObject current=null] : iv_rulemyBinary= rulemyBinary EOF ;
    public final EObject entryRulemyBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBinary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:658:2: (iv_rulemyBinary= rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:659:2: iv_rulemyBinary= rulemyBinary EOF
            {
             newCompositeNode(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary1443);
            iv_rulemyBinary=rulemyBinary();

            state._fsp--;

             current =iv_rulemyBinary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary1453); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:666:1: rulemyBinary returns [EObject current=null] : (otherlv_0= '(' ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) ) ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulemyBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_myBinaryLeft_1_0 = null;

        Enumerator lv_Oparand_2_0 = null;

        EObject lv_myBinaryRight_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:669:28: ( (otherlv_0= '(' ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) ) ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:670:1: (otherlv_0= '(' ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) ) ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:670:1: (otherlv_0= '(' ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) ) ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) ) otherlv_4= ')' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:670:3: otherlv_0= '(' ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) ) ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulemyBinary1490); 

                	newLeafNode(otherlv_0, grammarAccess.getMyBinaryAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:674:1: ( (lv_myBinaryLeft_1_0= rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:675:1: (lv_myBinaryLeft_1_0= rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:675:1: (lv_myBinaryLeft_1_0= rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:676:3: lv_myBinaryLeft_1_0= rulemyConcreteExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyConcreteExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rulemyBinary1511);
            lv_myBinaryLeft_1_0=rulemyConcreteExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"myBinaryLeft",
                    		lv_myBinaryLeft_1_0, 
                    		"myConcreteExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:692:2: ( (lv_Oparand_2_0= rulemyBinaryOparators ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:693:1: (lv_Oparand_2_0= rulemyBinaryOparators )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:693:1: (lv_Oparand_2_0= rulemyBinaryOparators )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:694:3: lv_Oparand_2_0= rulemyBinaryOparators
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rulemyBinary1532);
            lv_Oparand_2_0=rulemyBinaryOparators();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"Oparand",
                    		lv_Oparand_2_0, 
                    		"myBinaryOparators");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:710:2: ( (lv_myBinaryRight_3_0= rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:711:1: (lv_myBinaryRight_3_0= rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:711:1: (lv_myBinaryRight_3_0= rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:712:3: lv_myBinaryRight_3_0= rulemyConcreteExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyConcreteExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rulemyBinary1553);
            lv_myBinaryRight_3_0=rulemyConcreteExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"myBinaryRight",
                    		lv_myBinaryRight_3_0, 
                    		"myConcreteExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulemyBinary1565); 

                	newLeafNode(otherlv_4, grammarAccess.getMyBinaryAccess().getRightParenthesisKeyword_4());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:740:1: entryRulemyUnary returns [EObject current=null] : iv_rulemyUnary= rulemyUnary EOF ;
    public final EObject entryRulemyUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyUnary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:741:2: (iv_rulemyUnary= rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:742:2: iv_rulemyUnary= rulemyUnary EOF
            {
             newCompositeNode(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary1601);
            iv_rulemyUnary=rulemyUnary();

            state._fsp--;

             current =iv_rulemyUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary1611); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:749:1: rulemyUnary returns [EObject current=null] : ( ( (lv_Oparand_0_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) ) ) ;
    public final EObject rulemyUnary() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Oparand_0_0 = null;

        EObject lv_myUnaryExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:752:28: ( ( ( (lv_Oparand_0_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:753:1: ( ( (lv_Oparand_0_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:753:1: ( ( (lv_Oparand_0_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:753:2: ( (lv_Oparand_0_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:753:2: ( (lv_Oparand_0_0= rulemyUnaryOparators ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:754:1: (lv_Oparand_0_0= rulemyUnaryOparators )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:754:1: (lv_Oparand_0_0= rulemyUnaryOparators )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:755:3: lv_Oparand_0_0= rulemyUnaryOparators
            {
             
            	        newCompositeNode(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rulemyUnary1657);
            lv_Oparand_0_0=rulemyUnaryOparators();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"Oparand",
                    		lv_Oparand_0_0, 
                    		"myUnaryOparators");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:771:2: ( (lv_myUnaryExpression_1_0= rulemyConcreteExpression ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:772:1: (lv_myUnaryExpression_1_0= rulemyConcreteExpression )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:772:1: (lv_myUnaryExpression_1_0= rulemyConcreteExpression )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:773:3: lv_myUnaryExpression_1_0= rulemyConcreteExpression
            {
             
            	        newCompositeNode(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyConcreteExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyConcreteExpression_in_rulemyUnary1678);
            lv_myUnaryExpression_1_0=rulemyConcreteExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"myUnaryExpression",
                    		lv_myUnaryExpression_1_0, 
                    		"myConcreteExpression");
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
    // $ANTLR end "rulemyUnary"


    // $ANTLR start "entryRulemyBoolean"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:797:1: entryRulemyBoolean returns [EObject current=null] : iv_rulemyBoolean= rulemyBoolean EOF ;
    public final EObject entryRulemyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBoolean = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:798:2: (iv_rulemyBoolean= rulemyBoolean EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:799:2: iv_rulemyBoolean= rulemyBoolean EOF
            {
             newCompositeNode(grammarAccess.getMyBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_entryRulemyBoolean1714);
            iv_rulemyBoolean=rulemyBoolean();

            state._fsp--;

             current =iv_rulemyBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBoolean1724); 

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
    // $ANTLR end "entryRulemyBoolean"


    // $ANTLR start "rulemyBoolean"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:806:1: rulemyBoolean returns [EObject current=null] : ( ( (lv_trueValue_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleEString ) ) ) ;
    public final EObject rulemyBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_trueValue_0_0 = null;

        AntlrDatatypeRuleToken lv_falseValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:809:28: ( ( ( (lv_trueValue_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:810:1: ( ( (lv_trueValue_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:810:1: ( ( (lv_trueValue_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleEString ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:810:2: ( (lv_trueValue_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_falseValue_2_0= ruleEString ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:810:2: ( (lv_trueValue_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:811:1: (lv_trueValue_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:811:1: (lv_trueValue_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:812:3: lv_trueValue_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyBooleanAccess().getTrueValueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyBoolean1770);
            lv_trueValue_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulemyBoolean1782); 

                	newLeafNode(otherlv_1, grammarAccess.getMyBooleanAccess().getColonKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:832:1: ( (lv_falseValue_2_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:833:1: (lv_falseValue_2_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:833:1: (lv_falseValue_2_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:834:3: lv_falseValue_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyBooleanAccess().getFalseValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyBoolean1803);
            lv_falseValue_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"falseValue",
                    		lv_falseValue_2_0, 
                    		"EString");
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
    // $ANTLR end "rulemyBoolean"


    // $ANTLR start "entryRulemyIdentifier"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:858:1: entryRulemyIdentifier returns [EObject current=null] : iv_rulemyIdentifier= rulemyIdentifier EOF ;
    public final EObject entryRulemyIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyIdentifier = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:859:2: (iv_rulemyIdentifier= rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:860:2: iv_rulemyIdentifier= rulemyIdentifier EOF
            {
             newCompositeNode(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier1839);
            iv_rulemyIdentifier=rulemyIdentifier();

            state._fsp--;

             current =iv_rulemyIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier1849); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:867:1: rulemyIdentifier returns [EObject current=null] : (otherlv_0= '*' ( ( ruleEString ) ) ) ;
    public final EObject rulemyIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:870:28: ( (otherlv_0= '*' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:871:1: (otherlv_0= '*' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:871:1: (otherlv_0= '*' ( ( ruleEString ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:871:3: otherlv_0= '*' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulemyIdentifier1886); 

                	newLeafNode(otherlv_0, grammarAccess.getMyIdentifierAccess().getAsteriskKeyword_0());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:875:1: ( ( ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: ( ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: ( ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:877:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMyIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyIdentifier1909);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "rulemyIdentifier"


    // $ANTLR start "entryRulemyRange"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:898:1: entryRulemyRange returns [EObject current=null] : iv_rulemyRange= rulemyRange EOF ;
    public final EObject entryRulemyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyRange = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:899:2: (iv_rulemyRange= rulemyRange EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:900:2: iv_rulemyRange= rulemyRange EOF
            {
             newCompositeNode(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange1945);
            iv_rulemyRange=rulemyRange();

            state._fsp--;

             current =iv_rulemyRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange1955); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:907:1: rulemyRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) ) ;
    public final EObject rulemyRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:910:28: ( ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:911:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:911:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:911:2: ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:911:2: ( (lv_from_0_0= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:912:1: (lv_from_0_0= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:912:1: (lv_from_0_0= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:913:3: lv_from_0_0= RULE_INT
            {
            lv_from_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulemyRange1997); 

            			newLeafNode(lv_from_0_0, grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"from",
                    		lv_from_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulemyRange2014); 

                	newLeafNode(otherlv_1, grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:933:1: ( (lv_to_2_0= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:934:1: (lv_to_2_0= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:934:1: (lv_to_2_0= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:935:3: lv_to_2_0= RULE_INT
            {
            lv_to_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulemyRange2031); 

            			newLeafNode(lv_to_2_0, grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"to",
                    		lv_to_2_0, 
                    		"INT");
            	    

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


    // $ANTLR start "entryRulemyStringEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:959:1: entryRulemyStringEnum returns [EObject current=null] : iv_rulemyStringEnum= rulemyStringEnum EOF ;
    public final EObject entryRulemyStringEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyStringEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:960:2: (iv_rulemyStringEnum= rulemyStringEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:961:2: iv_rulemyStringEnum= rulemyStringEnum EOF
            {
             newCompositeNode(grammarAccess.getMyStringEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum2072);
            iv_rulemyStringEnum=rulemyStringEnum();

            state._fsp--;

             current =iv_rulemyStringEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyStringEnum2082); 

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
    // $ANTLR end "entryRulemyStringEnum"


    // $ANTLR start "rulemyStringEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:968:1: rulemyStringEnum returns [EObject current=null] : ( ( (lv_values_0_0= ruleEString ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )* ) ;
    public final EObject rulemyStringEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:971:28: ( ( ( (lv_values_0_0= ruleEString ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:972:1: ( ( (lv_values_0_0= ruleEString ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:972:1: ( ( (lv_values_0_0= ruleEString ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:972:2: ( (lv_values_0_0= ruleEString ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )*
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:972:2: ( (lv_values_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:973:1: (lv_values_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:973:1: (lv_values_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:974:3: lv_values_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyStringEnum2128);
            lv_values_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyStringEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:990:2: (otherlv_1= ',' ( (lv_values_2_0= ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    int LA10_2 = input.LA(2);

                    if ( ((LA10_2>=RULE_STRING && LA10_2<=RULE_ID)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:990:4: otherlv_1= ',' ( (lv_values_2_0= ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyStringEnum2141); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMyStringEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:994:1: ( (lv_values_2_0= ruleEString ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:995:1: (lv_values_2_0= ruleEString )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:995:1: (lv_values_2_0= ruleEString )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:996:3: lv_values_2_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyStringEnum2162);
            	    lv_values_2_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyStringEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulemyStringEnum"


    // $ANTLR start "entryRulemyNumberEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1020:1: entryRulemyNumberEnum returns [EObject current=null] : iv_rulemyNumberEnum= rulemyNumberEnum EOF ;
    public final EObject entryRulemyNumberEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyNumberEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1021:2: (iv_rulemyNumberEnum= rulemyNumberEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1022:2: iv_rulemyNumberEnum= rulemyNumberEnum EOF
            {
             newCompositeNode(grammarAccess.getMyNumberEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum2200);
            iv_rulemyNumberEnum=rulemyNumberEnum();

            state._fsp--;

             current =iv_rulemyNumberEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyNumberEnum2210); 

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
    // $ANTLR end "entryRulemyNumberEnum"


    // $ANTLR start "rulemyNumberEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1029:1: rulemyNumberEnum returns [EObject current=null] : ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* ) ;
    public final EObject rulemyNumberEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1032:28: ( ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1033:1: ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1033:1: ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1033:2: ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )*
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1033:2: ( (lv_values_0_0= ruleEDouble ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1034:1: (lv_values_0_0= ruleEDouble )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1034:1: (lv_values_0_0= ruleEDouble )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1035:3: lv_values_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulemyNumberEnum2256);
            lv_values_0_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyNumberEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1051:2: (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_INT||(LA11_2>=24 && LA11_2<=25)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1051:4: otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyNumberEnum2269); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMyNumberEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1055:1: ( (lv_values_2_0= ruleEDouble ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1056:1: (lv_values_2_0= ruleEDouble )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1056:1: (lv_values_2_0= ruleEDouble )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1057:3: lv_values_2_0= ruleEDouble
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulemyNumberEnum2290);
            	    lv_values_2_0=ruleEDouble();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyNumberEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"EDouble");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "rulemyNumberEnum"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1083:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1084:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1085:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2331);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2342); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1092:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1095:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1096:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1096:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1096:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1096:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1097:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt2381); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2398); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1117:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1118:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1119:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2444);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2455); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1126:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;
        AntlrDatatypeRuleToken this_EInt_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1129:28: ( ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:1: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:1: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt )
            int alt18=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_INT) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==25) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==EOF||(LA18_2>=12 && LA18_2<=13)||(LA18_2>=16 && LA18_2<=17)||LA18_2==19||LA18_2==21||(LA18_2>=28 && LA18_2<=33)) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==25) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==25) ) {
                    alt18=1;
                }
                else if ( (LA18_2==EOF||(LA18_2>=12 && LA18_2<=13)||(LA18_2>=16 && LA18_2<=17)||LA18_2==19||LA18_2==21||(LA18_2>=28 && LA18_2<=33)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt18=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1130:3: (kw= '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1131:2: kw= '-'
                            {
                            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble2495); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1136:3: (this_INT_1= RULE_INT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1136:8: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2513); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDouble2533); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_0_2()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2548); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_3()); 
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1156:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=26 && LA17_0<=27)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1156:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1156:2: (kw= 'E' | kw= 'e' )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==26) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==27) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1157:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble2568); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1164:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDouble2587); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1169:2: (kw= '-' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==24) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1170:2: kw= '-'
                                    {
                                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble2602); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_4_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2619); 

                            		current.merge(this_INT_7);
                                
                             
                                newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_4_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1184:5: this_EInt_8= ruleEInt
                    {
                     
                            newCompositeNode(grammarAccess.getEDoubleAccess().getEIntParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDouble2655);
                    this_EInt_8=ruleEInt();

                    state._fsp--;


                    		current.merge(this_EInt_8);
                        
                     
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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rulemyBinaryOparators"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1202:1: rulemyBinaryOparators returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) ;
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
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1204:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            case 31:
                {
                alt19=4;
                }
                break;
            case 32:
                {
                alt19=5;
                }
                break;
            case 33:
                {
                alt19=6;
                }
                break;
            case 16:
                {
                alt19=7;
                }
                break;
            case 17:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:2: (enumLiteral_0= '&&' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:2: (enumLiteral_0= '&&' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1205:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulemyBinaryOparators2714); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1211:6: (enumLiteral_1= '|' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1211:6: (enumLiteral_1= '|' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1211:8: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulemyBinaryOparators2731); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1217:6: (enumLiteral_2= '<' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1217:6: (enumLiteral_2= '<' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1217:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemyBinaryOparators2748); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1223:6: (enumLiteral_3= '>' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1223:6: (enumLiteral_3= '>' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1223:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulemyBinaryOparators2765); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1229:6: (enumLiteral_4= '=' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1229:6: (enumLiteral_4= '=' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1229:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulemyBinaryOparators2782); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1235:6: (enumLiteral_5= 'can' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1235:6: (enumLiteral_5= 'can' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1235:8: enumLiteral_5= 'can'
                    {
                    enumLiteral_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulemyBinaryOparators2799); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1241:6: (enumLiteral_6= 'if' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1241:6: (enumLiteral_6= 'if' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1241:8: enumLiteral_6= 'if'
                    {
                    enumLiteral_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulemyBinaryOparators2816); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1247:6: (enumLiteral_7= 'then' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1247:6: (enumLiteral_7= 'then' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1247:8: enumLiteral_7= 'then'
                    {
                    enumLiteral_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemyBinaryOparators2833); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1257:1: rulemyUnaryOparators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator rulemyUnaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1259:28: ( (enumLiteral_0= 'not' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1260:1: (enumLiteral_0= 'not' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1260:1: (enumLiteral_0= 'not' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1260:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulemyUnaryOparators2877); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\3\uffff\2\10\1\6\5\uffff";
    static final String DFA4_minS =
        "\1\4\2\uffff\3\14\5\uffff";
    static final String DFA4_maxS =
        "\1\42\2\uffff\3\41\5\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\1\5\1\3\1\4";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\4\1\5\15\uffff\1\1\2\uffff\1\7\2\6\10\uffff\1\2",
            "",
            "",
            "\2\10\2\uffff\2\10\3\uffff\1\10\1\11\5\uffff\6\10",
            "\2\10\2\uffff\2\10\3\uffff\1\10\1\11\5\uffff\6\10",
            "\2\6\2\uffff\2\6\3\uffff\1\6\2\uffff\1\12\1\6\2\uffff\6\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "234:1: (this_myBinary_0= rulemyBinary | this_myUnary_1= rulemyUnary | this_myBoolean_2= rulemyBoolean | this_myRange_3= rulemyRange | this_myStringEnum_4= rulemyStringEnum | this_myNumberEnum_5= rulemyNumberEnum | this_myIdentifier_6= rulemyIdentifier )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulemyModel_in_entryRulemyModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyModel140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulemyModel153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel174 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_rulemyModel187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel208 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_rulemyModel222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rulemyValue317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyValue344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rulemyValue371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rulemyValue398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_entryRulemyExpression433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyExpression443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyExpression490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rulemyExpression517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rulemyExpression544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyExpression571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rulemyExpression598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rulemyExpression625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rulemyExpression652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_entryRulemyObject810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyObject820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyObject875 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyObject887 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_14_in_rulemyObject900 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject921 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_12_in_rulemyObject934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject955 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_15_in_rulemyObject972 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject993 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_rulemyObject1006 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject1027 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_rulemyObject1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_entryRulemyConstraint1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConstraint1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulemyConstraint1126 = new BitSet(new long[]{0x0000000403900070L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rulemyConstraint1147 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemyConstraint1159 = new BitSet(new long[]{0x0000000403900070L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rulemyConstraint1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_entryRulemyAttribute1216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyAttribute1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyAttribute1272 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulemyAttribute1284 = new BitSet(new long[]{0x0000000003000070L});
        public static final BitSet FOLLOW_rulemyValue_in_rulemyAttribute1305 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulemyAttribute1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_entryRulemyConcreteExpression1353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConcreteExpression1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyExpression_in_rulemyConcreteExpression1408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary1443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulemyBinary1490 = new BitSet(new long[]{0x0000000403900070L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rulemyBinary1511 = new BitSet(new long[]{0x00000003F0030000L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rulemyBinary1532 = new BitSet(new long[]{0x0000000403900070L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rulemyBinary1553 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulemyBinary1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary1601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rulemyUnary1657 = new BitSet(new long[]{0x0000000403900070L});
        public static final BitSet FOLLOW_rulemyConcreteExpression_in_rulemyUnary1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_entryRulemyBoolean1714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBoolean1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyBoolean1770 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulemyBoolean1782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyBoolean1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier1839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulemyIdentifier1886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyIdentifier1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rulemyRange1997 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulemyRange2014 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_rulemyRange2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum2072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyStringEnum2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyStringEnum2128 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_rulemyStringEnum2141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyStringEnum2162 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum2200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyNumberEnum2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulemyNumberEnum2256 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_rulemyNumberEnum2269 = new BitSet(new long[]{0x0000000003000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulemyNumberEnum2290 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt2381 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEDouble2495 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2513 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleEDouble2533 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2548 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_26_in_ruleEDouble2568 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_27_in_ruleEDouble2587 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_24_in_ruleEDouble2602 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDouble2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulemyBinaryOparators2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rulemyBinaryOparators2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulemyBinaryOparators2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulemyBinaryOparators2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulemyBinaryOparators2782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulemyBinaryOparators2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulemyBinaryOparators2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rulemyBinaryOparators2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulemyUnaryOparators2877 = new BitSet(new long[]{0x0000000000000002L});
    }


}