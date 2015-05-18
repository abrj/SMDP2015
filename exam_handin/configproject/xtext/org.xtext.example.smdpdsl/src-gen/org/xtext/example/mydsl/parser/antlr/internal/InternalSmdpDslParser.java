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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'has'", "'Constrained by'", "'if'", "'then'", "'['", "']'", "'('", "')'", "':'", "'-'", "'.'", "'E'", "'e'", "'&&'", "'|'", "'<'", "'>'", "'='", "'can'", "'not'"
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:77:1: rulemyModel returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )? ) ;
    public final EObject rulemyModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_myModelContains_2_0 = null;

        EObject lv_myModelContains_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:80:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )? ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )? )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )? )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )?
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:81:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:82:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:82:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:83:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyModel131);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:99:2: (otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:99:4: otherlv_1= '{' ( (lv_myModelContains_2_0= rulemyObject ) ) (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyModel144); 

                        	newLeafNode(otherlv_1, grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:103:1: ( (lv_myModelContains_2_0= rulemyObject ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:104:1: (lv_myModelContains_2_0= rulemyObject )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:104:1: (lv_myModelContains_2_0= rulemyObject )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:105:3: lv_myModelContains_2_0= rulemyObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel165);
                    lv_myModelContains_2_0=rulemyObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	        }
                           		add(
                           			current, 
                           			"myModelContains",
                            		lv_myModelContains_2_0, 
                            		"myObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:121:2: (otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:121:4: otherlv_3= ',' ( (lv_myModelContains_4_0= rulemyObject ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyModel178); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMyModelAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:125:1: ( (lv_myModelContains_4_0= rulemyObject ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:126:1: (lv_myModelContains_4_0= rulemyObject )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:126:1: (lv_myModelContains_4_0= rulemyObject )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:127:3: lv_myModelContains_4_0= rulemyObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyObject_in_rulemyModel199);
                    	    lv_myModelContains_4_0=rulemyObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myModelContains",
                    	            		lv_myModelContains_4_0, 
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

                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyModel213); 

                        	newLeafNode(otherlv_5, grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_1_3());
                        

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:155:1: entryRulemyValue returns [EObject current=null] : iv_rulemyValue= rulemyValue EOF ;
    public final EObject entryRulemyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyValue = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:156:2: (iv_rulemyValue= rulemyValue EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:157:2: iv_rulemyValue= rulemyValue EOF
            {
             newCompositeNode(grammarAccess.getMyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_entryRulemyValue251);
            iv_rulemyValue=rulemyValue();

            state._fsp--;

             current =iv_rulemyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyValue261); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:164:1: rulemyValue returns [EObject current=null] : (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myStringEnum_3= rulemyStringEnum ) ;
    public final EObject rulemyValue() throws RecognitionException {
        EObject current = null;

        EObject this_myBoolean_0 = null;

        EObject this_myRange_1 = null;

        EObject this_myNumberEnum_2 = null;

        EObject this_myStringEnum_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:167:28: ( (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myStringEnum_3= rulemyStringEnum ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:168:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myStringEnum_3= rulemyStringEnum )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:168:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myStringEnum_3= rulemyStringEnum )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==12||LA3_1==19) ) {
                    alt3=4;
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
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==23) ) {
                    alt3=2;
                }
                else if ( (LA3_2==EOF||LA3_2==12||LA3_2==19||LA3_2==24) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:169:5: this_myBoolean_0= rulemyBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyBooleanParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rulemyValue308);
                    this_myBoolean_0=rulemyBoolean();

                    state._fsp--;

                     
                            current = this_myBoolean_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:179:5: this_myRange_1= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyValue335);
                    this_myRange_1=rulemyRange();

                    state._fsp--;

                     
                            current = this_myRange_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:189:5: this_myNumberEnum_2= rulemyNumberEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyNumberEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rulemyValue362);
                    this_myNumberEnum_2=rulemyNumberEnum();

                    state._fsp--;

                     
                            current = this_myNumberEnum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:199:5: this_myStringEnum_3= rulemyStringEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyValueAccess().getMyStringEnumParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rulemyValue389);
                    this_myStringEnum_3=rulemyStringEnum();

                    state._fsp--;

                     
                            current = this_myStringEnum_3; 
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:215:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:216:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:217:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString425);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString436); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:224:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:227:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:228:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:228:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:228:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString476); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:236:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString502); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:251:1: entryRulemyObject returns [EObject current=null] : iv_rulemyObject= rulemyObject EOF ;
    public final EObject entryRulemyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyObject = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:252:2: (iv_rulemyObject= rulemyObject EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:253:2: iv_rulemyObject= rulemyObject EOF
            {
             newCompositeNode(grammarAccess.getMyObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyObject_in_entryRulemyObject547);
            iv_rulemyObject=rulemyObject();

            state._fsp--;

             current =iv_rulemyObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyObject557); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:260:1: rulemyObject returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )? (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )? otherlv_9= '}' ) ;
    public final EObject rulemyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_myAttributeContains_3_0 = null;

        EObject lv_myAttributeContains_5_0 = null;

        EObject lv_myObjectHas_7_0 = null;

        EObject lv_myObjectHas_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:263:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )? (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )? otherlv_9= '}' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:264:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )? (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )? otherlv_9= '}' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:264:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )? (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )? otherlv_9= '}' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:264:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )? (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )? otherlv_9= '}'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:264:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:265:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:265:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:266:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyObject603);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulemyObject615); 

                	newLeafNode(otherlv_1, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:286:1: (otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:286:3: otherlv_2= 'has' ( (lv_myAttributeContains_3_0= rulemyAttribute ) ) (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulemyObject628); 

                        	newLeafNode(otherlv_2, grammarAccess.getMyObjectAccess().getHasKeyword_2_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:290:1: ( (lv_myAttributeContains_3_0= rulemyAttribute ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:291:1: (lv_myAttributeContains_3_0= rulemyAttribute )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:291:1: (lv_myAttributeContains_3_0= rulemyAttribute )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:292:3: lv_myAttributeContains_3_0= rulemyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject649);
                    lv_myAttributeContains_3_0=rulemyAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myAttributeContains",
                            		lv_myAttributeContains_3_0, 
                            		"myAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:308:2: (otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:308:4: otherlv_4= ',' ( (lv_myAttributeContains_5_0= rulemyAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyObject662); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMyObjectAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:312:1: ( (lv_myAttributeContains_5_0= rulemyAttribute ) )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:313:1: (lv_myAttributeContains_5_0= rulemyAttribute )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:313:1: (lv_myAttributeContains_5_0= rulemyAttribute )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:314:3: lv_myAttributeContains_5_0= rulemyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_rulemyObject683);
                    	    lv_myAttributeContains_5_0=rulemyAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"myAttributeContains",
                    	            		lv_myAttributeContains_5_0, 
                    	            		"myAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:330:6: (otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:330:8: otherlv_6= 'Constrained by' ( (lv_myObjectHas_7_0= rulemyConstraint ) ) ( (lv_myObjectHas_8_0= rulemyConstraint ) )*
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulemyObject700); 

                        	newLeafNode(otherlv_6, grammarAccess.getMyObjectAccess().getConstrainedByKeyword_3_0());
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:334:1: ( (lv_myObjectHas_7_0= rulemyConstraint ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:335:1: (lv_myObjectHas_7_0= rulemyConstraint )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:335:1: (lv_myObjectHas_7_0= rulemyConstraint )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:336:3: lv_myObjectHas_7_0= rulemyConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject721);
                    lv_myObjectHas_7_0=rulemyConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"myObjectHas",
                            		lv_myObjectHas_7_0, 
                            		"myConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:352:2: ( (lv_myObjectHas_8_0= rulemyConstraint ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:353:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    	    {
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:353:1: (lv_myObjectHas_8_0= rulemyConstraint )
                    	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:354:3: lv_myObjectHas_8_0= rulemyConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_rulemyObject742);
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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulemyObject757); 

                	newLeafNode(otherlv_9, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:382:1: entryRulemyConstraint returns [EObject current=null] : iv_rulemyConstraint= rulemyConstraint EOF ;
    public final EObject entryRulemyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyConstraint = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:383:2: (iv_rulemyConstraint= rulemyConstraint EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:384:2: iv_rulemyConstraint= rulemyConstraint EOF
            {
             newCompositeNode(grammarAccess.getMyConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyConstraint_in_entryRulemyConstraint793);
            iv_rulemyConstraint=rulemyConstraint();

            state._fsp--;

             current =iv_rulemyConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyConstraint803); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:391:1: rulemyConstraint returns [EObject current=null] : (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyBinary ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyBinary ) ) ) ;
    public final EObject rulemyConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_myIfConstraint_1_0 = null;

        EObject lv_myThenConstraint_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:394:28: ( (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyBinary ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyBinary ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:395:1: (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyBinary ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyBinary ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:395:1: (otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyBinary ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyBinary ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:395:3: otherlv_0= 'if' ( (lv_myIfConstraint_1_0= rulemyBinary ) ) otherlv_2= 'then' ( (lv_myThenConstraint_3_0= rulemyBinary ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulemyConstraint840); 

                	newLeafNode(otherlv_0, grammarAccess.getMyConstraintAccess().getIfKeyword_0());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:399:1: ( (lv_myIfConstraint_1_0= rulemyBinary ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:400:1: (lv_myIfConstraint_1_0= rulemyBinary )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:400:1: (lv_myIfConstraint_1_0= rulemyBinary )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:401:3: lv_myIfConstraint_1_0= rulemyBinary
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyBinaryParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyConstraint861);
            lv_myIfConstraint_1_0=rulemyBinary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"myIfConstraint",
                    		lv_myIfConstraint_1_0, 
                    		"myBinary");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemyConstraint873); 

                	newLeafNode(otherlv_2, grammarAccess.getMyConstraintAccess().getThenKeyword_2());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:421:1: ( (lv_myThenConstraint_3_0= rulemyBinary ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:422:1: (lv_myThenConstraint_3_0= rulemyBinary )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:422:1: (lv_myThenConstraint_3_0= rulemyBinary )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:423:3: lv_myThenConstraint_3_0= rulemyBinary
            {
             
            	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyBinaryParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyConstraint894);
            lv_myThenConstraint_3_0=rulemyBinary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"myThenConstraint",
                    		lv_myThenConstraint_3_0, 
                    		"myBinary");
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:447:1: entryRulemyAttribute returns [EObject current=null] : iv_rulemyAttribute= rulemyAttribute EOF ;
    public final EObject entryRulemyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyAttribute = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:448:2: (iv_rulemyAttribute= rulemyAttribute EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:449:2: iv_rulemyAttribute= rulemyAttribute EOF
            {
             newCompositeNode(grammarAccess.getMyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyAttribute_in_entryRulemyAttribute930);
            iv_rulemyAttribute=rulemyAttribute();

            state._fsp--;

             current =iv_rulemyAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyAttribute940); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:456:1: rulemyAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) ;
    public final EObject rulemyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_myAttributeContains_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:459:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:460:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:460:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:460:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[' ( (lv_myAttributeContains_2_0= rulemyValue ) ) otherlv_3= ']'
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:460:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:461:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:461:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:462:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulemyAttribute986);
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemyAttribute998); 

                	newLeafNode(otherlv_1, grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:482:1: ( (lv_myAttributeContains_2_0= rulemyValue ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:483:1: (lv_myAttributeContains_2_0= rulemyValue )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:483:1: (lv_myAttributeContains_2_0= rulemyValue )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:484:3: lv_myAttributeContains_2_0= rulemyValue
            {
             
            	        newCompositeNode(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulemyValue_in_rulemyAttribute1019);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulemyAttribute1031); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:512:1: entryRulemyBinary returns [EObject current=null] : iv_rulemyBinary= rulemyBinary EOF ;
    public final EObject entryRulemyBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBinary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:513:2: (iv_rulemyBinary= rulemyBinary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:514:2: iv_rulemyBinary= rulemyBinary EOF
            {
             newCompositeNode(grammarAccess.getMyBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_entryRulemyBinary1067);
            iv_rulemyBinary=rulemyBinary();

            state._fsp--;

             current =iv_rulemyBinary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBinary1077); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:521:1: rulemyBinary returns [EObject current=null] : (this_myUnary_0= rulemyUnary ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )* ) ;
    public final EObject rulemyBinary() throws RecognitionException {
        EObject current = null;

        EObject this_myUnary_0 = null;

        Enumerator lv_Oparand_2_0 = null;

        EObject lv_myBinaryRight_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:524:28: ( (this_myUnary_0= rulemyUnary ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:525:1: (this_myUnary_0= rulemyUnary ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:525:1: (this_myUnary_0= rulemyUnary ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:526:5: this_myUnary_0= rulemyUnary ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMyBinaryAccess().getMyUnaryParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rulemyBinary1124);
            this_myUnary_0=rulemyUnary();

            state._fsp--;

             
                    current = this_myUnary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:534:1: ( () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=27 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:534:2: () ( (lv_Oparand_2_0= rulemyBinaryOparators ) ) ( (lv_myBinaryRight_3_0= rulemyUnary ) )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:534:2: ()
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:535:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMyBinaryAccess().getMyBinaryMyBinaryLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:540:2: ( (lv_Oparand_2_0= rulemyBinaryOparators ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:541:1: (lv_Oparand_2_0= rulemyBinaryOparators )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:541:1: (lv_Oparand_2_0= rulemyBinaryOparators )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:542:3: lv_Oparand_2_0= rulemyBinaryOparators
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulemyBinaryOparators_in_rulemyBinary1154);
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

            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:558:2: ( (lv_myBinaryRight_3_0= rulemyUnary ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:559:1: (lv_myBinaryRight_3_0= rulemyUnary )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:559:1: (lv_myBinaryRight_3_0= rulemyUnary )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:560:3: lv_myBinaryRight_3_0= rulemyUnary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyUnaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_rulemyBinary1175);
            	    lv_myBinaryRight_3_0=rulemyUnary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyBinaryRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"myBinaryRight",
            	            		lv_myBinaryRight_3_0, 
            	            		"myUnary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulemyBinary"


    // $ANTLR start "entryRulemyPrimary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:584:1: entryRulemyPrimary returns [EObject current=null] : iv_rulemyPrimary= rulemyPrimary EOF ;
    public final EObject entryRulemyPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyPrimary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:585:2: (iv_rulemyPrimary= rulemyPrimary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:586:2: iv_rulemyPrimary= rulemyPrimary EOF
            {
             newCompositeNode(grammarAccess.getMyPrimaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyPrimary_in_entryRulemyPrimary1213);
            iv_rulemyPrimary=rulemyPrimary();

            state._fsp--;

             current =iv_rulemyPrimary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyPrimary1223); 

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
    // $ANTLR end "entryRulemyPrimary"


    // $ANTLR start "rulemyPrimary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:593:1: rulemyPrimary returns [EObject current=null] : (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myIdentifier_3= rulemyIdentifier | (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' ) | this_myStringEnum_7= rulemyStringEnum ) ;
    public final EObject rulemyPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_myBoolean_0 = null;

        EObject this_myRange_1 = null;

        EObject this_myNumberEnum_2 = null;

        EObject this_myIdentifier_3 = null;

        EObject this_myBinary_5 = null;

        EObject this_myStringEnum_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:596:28: ( (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myIdentifier_3= rulemyIdentifier | (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' ) | this_myStringEnum_7= rulemyStringEnum ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:597:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myIdentifier_3= rulemyIdentifier | (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' ) | this_myStringEnum_7= rulemyStringEnum )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:597:1: (this_myBoolean_0= rulemyBoolean | this_myRange_1= rulemyRange | this_myNumberEnum_2= rulemyNumberEnum | this_myIdentifier_3= rulemyIdentifier | (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' ) | this_myStringEnum_7= rulemyStringEnum )
            int alt10=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1>=12 && LA10_1<=13)||(LA10_1>=16 && LA10_1<=17)||LA10_1==21||(LA10_1>=27 && LA10_1<=32)) ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==23) ) {
                    alt10=2;
                }
                else if ( (LA10_2==EOF||(LA10_2>=12 && LA10_2<=13)||(LA10_2>=16 && LA10_2<=17)||LA10_2==21||LA10_2==24||(LA10_2>=27 && LA10_2<=32)) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:598:5: this_myBoolean_0= rulemyBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyBooleanParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_rulemyPrimary1270);
                    this_myBoolean_0=rulemyBoolean();

                    state._fsp--;

                     
                            current = this_myBoolean_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:608:5: this_myRange_1= rulemyRange
                    {
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyRangeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyRange_in_rulemyPrimary1297);
                    this_myRange_1=rulemyRange();

                    state._fsp--;

                     
                            current = this_myRange_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:618:5: this_myNumberEnum_2= rulemyNumberEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyNumberEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_rulemyPrimary1324);
                    this_myNumberEnum_2=rulemyNumberEnum();

                    state._fsp--;

                     
                            current = this_myNumberEnum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:628:5: this_myIdentifier_3= rulemyIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyIdentifierParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_rulemyPrimary1351);
                    this_myIdentifier_3=rulemyIdentifier();

                    state._fsp--;

                     
                            current = this_myIdentifier_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:637:6: (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:637:6: (otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:637:8: otherlv_4= '(' this_myBinary_5= rulemyBinary otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulemyPrimary1369); 

                        	newLeafNode(otherlv_4, grammarAccess.getMyPrimaryAccess().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyBinaryParserRuleCall_4_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyBinary_in_rulemyPrimary1391);
                    this_myBinary_5=rulemyBinary();

                    state._fsp--;

                     
                            current = this_myBinary_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulemyPrimary1402); 

                        	newLeafNode(otherlv_6, grammarAccess.getMyPrimaryAccess().getRightParenthesisKeyword_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:656:5: this_myStringEnum_7= rulemyStringEnum
                    {
                     
                            newCompositeNode(grammarAccess.getMyPrimaryAccess().getMyStringEnumParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_rulemyPrimary1431);
                    this_myStringEnum_7=rulemyStringEnum();

                    state._fsp--;

                     
                            current = this_myStringEnum_7; 
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
    // $ANTLR end "rulemyPrimary"


    // $ANTLR start "entryRulemyUnary"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:672:1: entryRulemyUnary returns [EObject current=null] : iv_rulemyUnary= rulemyUnary EOF ;
    public final EObject entryRulemyUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyUnary = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:673:2: (iv_rulemyUnary= rulemyUnary EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:674:2: iv_rulemyUnary= rulemyUnary EOF
            {
             newCompositeNode(grammarAccess.getMyUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyUnary_in_entryRulemyUnary1466);
            iv_rulemyUnary=rulemyUnary();

            state._fsp--;

             current =iv_rulemyUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyUnary1476); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:681:1: rulemyUnary returns [EObject current=null] : ( ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) ) | this_myPrimary_3= rulemyPrimary ) ;
    public final EObject rulemyUnary() throws RecognitionException {
        EObject current = null;

        Enumerator lv_Oparand_1_0 = null;

        EObject lv_myUnaryExpression_2_0 = null;

        EObject this_myPrimary_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:684:28: ( ( ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) ) | this_myPrimary_3= rulemyPrimary ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:1: ( ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) ) | this_myPrimary_3= rulemyPrimary )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:1: ( ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) ) | this_myPrimary_3= rulemyPrimary )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||LA11_0==20||(LA11_0>=23 && LA11_0<=24)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:2: ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:2: ( () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:3: () ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:685:3: ()
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:686:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMyUnaryAccess().getMyUnaryAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:691:2: ( ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:691:3: ( (lv_Oparand_1_0= rulemyUnaryOparators ) ) ( (lv_myUnaryExpression_2_0= rulemyPrimary ) )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:691:3: ( (lv_Oparand_1_0= rulemyUnaryOparators ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:692:1: (lv_Oparand_1_0= rulemyUnaryOparators )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:692:1: (lv_Oparand_1_0= rulemyUnaryOparators )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:693:3: lv_Oparand_1_0= rulemyUnaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyUnaryOparators_in_rulemyUnary1533);
                    lv_Oparand_1_0=rulemyUnaryOparators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"Oparand",
                            		lv_Oparand_1_0, 
                            		"myUnaryOparators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:709:2: ( (lv_myUnaryExpression_2_0= rulemyPrimary ) )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:710:1: (lv_myUnaryExpression_2_0= rulemyPrimary )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:710:1: (lv_myUnaryExpression_2_0= rulemyPrimary )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:711:3: lv_myUnaryExpression_2_0= rulemyPrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyPrimaryParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulemyPrimary_in_rulemyUnary1554);
                    lv_myUnaryExpression_2_0=rulemyPrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMyUnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"myUnaryExpression",
                            		lv_myUnaryExpression_2_0, 
                            		"myPrimary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:729:5: this_myPrimary_3= rulemyPrimary
                    {
                     
                            newCompositeNode(grammarAccess.getMyUnaryAccess().getMyPrimaryParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemyPrimary_in_rulemyUnary1584);
                    this_myPrimary_3=rulemyPrimary();

                    state._fsp--;

                     
                            current = this_myPrimary_3; 
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
    // $ANTLR end "rulemyUnary"


    // $ANTLR start "entryRulemyBoolean"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:745:1: entryRulemyBoolean returns [EObject current=null] : iv_rulemyBoolean= rulemyBoolean EOF ;
    public final EObject entryRulemyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyBoolean = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:746:2: (iv_rulemyBoolean= rulemyBoolean EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:747:2: iv_rulemyBoolean= rulemyBoolean EOF
            {
             newCompositeNode(grammarAccess.getMyBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyBoolean_in_entryRulemyBoolean1619);
            iv_rulemyBoolean=rulemyBoolean();

            state._fsp--;

             current =iv_rulemyBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyBoolean1629); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:754:1: rulemyBoolean returns [EObject current=null] : ( ( (lv_trueValue_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_falseValue_2_0= RULE_STRING ) ) ) ;
    public final EObject rulemyBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_trueValue_0_0=null;
        Token otherlv_1=null;
        Token lv_falseValue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:757:28: ( ( ( (lv_trueValue_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_falseValue_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:758:1: ( ( (lv_trueValue_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_falseValue_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:758:1: ( ( (lv_trueValue_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_falseValue_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:758:2: ( (lv_trueValue_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_falseValue_2_0= RULE_STRING ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:758:2: ( (lv_trueValue_0_0= RULE_STRING ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:759:1: (lv_trueValue_0_0= RULE_STRING )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:759:1: (lv_trueValue_0_0= RULE_STRING )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:760:3: lv_trueValue_0_0= RULE_STRING
            {
            lv_trueValue_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulemyBoolean1671); 

            			newLeafNode(lv_trueValue_0_0, grammarAccess.getMyBooleanAccess().getTrueValueSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyBooleanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulemyBoolean1688); 

                	newLeafNode(otherlv_1, grammarAccess.getMyBooleanAccess().getColonKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:780:1: ( (lv_falseValue_2_0= RULE_STRING ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:781:1: (lv_falseValue_2_0= RULE_STRING )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:781:1: (lv_falseValue_2_0= RULE_STRING )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:782:3: lv_falseValue_2_0= RULE_STRING
            {
            lv_falseValue_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulemyBoolean1705); 

            			newLeafNode(lv_falseValue_2_0, grammarAccess.getMyBooleanAccess().getFalseValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyBooleanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"falseValue",
                    		lv_falseValue_2_0, 
                    		"STRING");
            	    

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:806:1: entryRulemyIdentifier returns [EObject current=null] : iv_rulemyIdentifier= rulemyIdentifier EOF ;
    public final EObject entryRulemyIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyIdentifier = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:807:2: (iv_rulemyIdentifier= rulemyIdentifier EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:808:2: iv_rulemyIdentifier= rulemyIdentifier EOF
            {
             newCompositeNode(grammarAccess.getMyIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier1746);
            iv_rulemyIdentifier=rulemyIdentifier();

            state._fsp--;

             current =iv_rulemyIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyIdentifier1756); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:815:1: rulemyIdentifier returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulemyIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:818:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:819:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:819:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:820:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:820:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:821:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMyIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemyIdentifier1800); 

            		newLeafNode(otherlv_0, grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_0()); 
            	

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:840:1: entryRulemyRange returns [EObject current=null] : iv_rulemyRange= rulemyRange EOF ;
    public final EObject entryRulemyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyRange = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:841:2: (iv_rulemyRange= rulemyRange EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:842:2: iv_rulemyRange= rulemyRange EOF
            {
             newCompositeNode(grammarAccess.getMyRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyRange_in_entryRulemyRange1835);
            iv_rulemyRange=rulemyRange();

            state._fsp--;

             current =iv_rulemyRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyRange1845); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:849:1: rulemyRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) ) ;
    public final EObject rulemyRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:852:28: ( ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:2: ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_to_2_0= RULE_INT ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:853:2: ( (lv_from_0_0= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:854:1: (lv_from_0_0= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:854:1: (lv_from_0_0= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:855:3: lv_from_0_0= RULE_INT
            {
            lv_from_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulemyRange1887); 

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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulemyRange1904); 

                	newLeafNode(otherlv_1, grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1());
                
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:875:1: ( (lv_to_2_0= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: (lv_to_2_0= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:876:1: (lv_to_2_0= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:877:3: lv_to_2_0= RULE_INT
            {
            lv_to_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulemyRange1921); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:901:1: entryRulemyStringEnum returns [EObject current=null] : iv_rulemyStringEnum= rulemyStringEnum EOF ;
    public final EObject entryRulemyStringEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyStringEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:902:2: (iv_rulemyStringEnum= rulemyStringEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:903:2: iv_rulemyStringEnum= rulemyStringEnum EOF
            {
             newCompositeNode(grammarAccess.getMyStringEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum1962);
            iv_rulemyStringEnum=rulemyStringEnum();

            state._fsp--;

             current =iv_rulemyStringEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyStringEnum1972); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:910:1: rulemyStringEnum returns [EObject current=null] : ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* ) ;
    public final EObject rulemyStringEnum() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:913:28: ( ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:914:1: ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:914:1: ( ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:914:2: ( (lv_values_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )*
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:914:2: ( (lv_values_0_0= RULE_STRING ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:915:1: (lv_values_0_0= RULE_STRING )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:915:1: (lv_values_0_0= RULE_STRING )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:916:3: lv_values_0_0= RULE_STRING
            {
            lv_values_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulemyStringEnum2014); 

            			newLeafNode(lv_values_0_0, grammarAccess.getMyStringEnumAccess().getValuesSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyStringEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:932:2: (otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:932:4: otherlv_1= ',' ( (lv_values_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyStringEnum2032); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMyStringEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:936:1: ( (lv_values_2_0= RULE_STRING ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:937:1: (lv_values_2_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:937:1: (lv_values_2_0= RULE_STRING )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:938:3: lv_values_2_0= RULE_STRING
            	    {
            	    lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulemyStringEnum2049); 

            	    			newLeafNode(lv_values_2_0, grammarAccess.getMyStringEnumAccess().getValuesSTRINGTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMyStringEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"STRING");
            	    	    

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
    // $ANTLR end "rulemyStringEnum"


    // $ANTLR start "entryRulemyNumberEnum"
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:962:1: entryRulemyNumberEnum returns [EObject current=null] : iv_rulemyNumberEnum= rulemyNumberEnum EOF ;
    public final EObject entryRulemyNumberEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyNumberEnum = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:963:2: (iv_rulemyNumberEnum= rulemyNumberEnum EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:964:2: iv_rulemyNumberEnum= rulemyNumberEnum EOF
            {
             newCompositeNode(grammarAccess.getMyNumberEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum2092);
            iv_rulemyNumberEnum=rulemyNumberEnum();

            state._fsp--;

             current =iv_rulemyNumberEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemyNumberEnum2102); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:971:1: rulemyNumberEnum returns [EObject current=null] : ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* ) ;
    public final EObject rulemyNumberEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:974:28: ( ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:975:1: ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:975:1: ( ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )* )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:975:2: ( (lv_values_0_0= ruleEDouble ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )*
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:975:2: ( (lv_values_0_0= ruleEDouble ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:976:1: (lv_values_0_0= ruleEDouble )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:976:1: (lv_values_0_0= ruleEDouble )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:977:3: lv_values_0_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulemyNumberEnum2148);
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

            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:993:2: (otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:993:4: otherlv_1= ',' ( (lv_values_2_0= ruleEDouble ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulemyNumberEnum2161); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMyNumberEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:997:1: ( (lv_values_2_0= ruleEDouble ) )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:998:1: (lv_values_2_0= ruleEDouble )
            	    {
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:998:1: (lv_values_2_0= ruleEDouble )
            	    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:999:3: lv_values_2_0= ruleEDouble
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rulemyNumberEnum2182);
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
            	    break loop13;
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1025:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1026:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1027:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2223);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2234); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1034:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1037:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1038:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1038:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1038:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1038:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1039:2: kw= '-'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEInt2273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2290); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1059:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1060:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1061:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2336);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2347); 

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1068:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;
        AntlrDatatypeRuleToken this_EInt_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1071:28: ( ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:1: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:1: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) | this_EInt_8= ruleEInt )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_INT) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==EOF||(LA20_2>=12 && LA20_2<=13)||(LA20_2>=16 && LA20_2<=17)||LA20_2==19||LA20_2==21||(LA20_2>=27 && LA20_2<=32)) ) {
                        alt20=2;
                    }
                    else if ( (LA20_2==24) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1==24) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||(LA20_2>=12 && LA20_2<=13)||(LA20_2>=16 && LA20_2<=17)||LA20_2==19||LA20_2==21||(LA20_2>=27 && LA20_2<=32)) ) {
                    alt20=2;
                }
                else if ( (LA20_2==24) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt20=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1072:3: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1073:2: kw= '-'
                            {
                            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble2387); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1078:3: (this_INT_1= RULE_INT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_INT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1078:8: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2405); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEDouble2425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_0_2()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2440); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_3()); 
                        
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1098:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=25 && LA19_0<=26)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1098:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1098:2: (kw= 'E' | kw= 'e' )
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==25) ) {
                                alt17=1;
                            }
                            else if ( (LA17_0==26) ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1099:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEDouble2460); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1106:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble2479); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1111:2: (kw= '-' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==23) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1112:2: kw= '-'
                                    {
                                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEDouble2494); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_4_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2511); 

                            		current.merge(this_INT_7);
                                
                             
                                newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_4_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1126:5: this_EInt_8= ruleEInt
                    {
                     
                            newCompositeNode(grammarAccess.getEDoubleAccess().getEIntParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleEDouble2547);
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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1144:1: rulemyBinaryOparators returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) ) ;
    public final Enumerator rulemyBinaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1146:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1147:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1147:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '|' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'can' ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
                }
                break;
            case 31:
                {
                alt21=5;
                }
                break;
            case 32:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1147:2: (enumLiteral_0= '&&' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1147:2: (enumLiteral_0= '&&' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1147:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulemyBinaryOparators2606); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1153:6: (enumLiteral_1= '|' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1153:6: (enumLiteral_1= '|' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1153:8: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulemyBinaryOparators2623); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1159:6: (enumLiteral_2= '<' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1159:6: (enumLiteral_2= '<' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1159:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulemyBinaryOparators2640); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1165:6: (enumLiteral_3= '>' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1165:6: (enumLiteral_3= '>' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1165:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemyBinaryOparators2657); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1171:6: (enumLiteral_4= '=' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1171:6: (enumLiteral_4= '=' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1171:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulemyBinaryOparators2674); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1177:6: (enumLiteral_5= 'can' )
                    {
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1177:6: (enumLiteral_5= 'can' )
                    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1177:8: enumLiteral_5= 'can'
                    {
                    enumLiteral_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulemyBinaryOparators2691); 

                            current = grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                        

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
    // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1187:1: rulemyUnaryOparators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator rulemyUnaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1189:28: ( (enumLiteral_0= 'not' ) )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1190:1: (enumLiteral_0= 'not' )
            {
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1190:1: (enumLiteral_0= 'not' )
            // ../org.xtext.example.smdpdsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalSmdpDsl.g:1190:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulemyUnaryOparators2735); 

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
        public static final BitSet FOLLOW_ruleEString_in_rulemyModel131 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_rulemyModel144 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel165 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_rulemyModel178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyObject_in_rulemyModel199 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_rulemyModel213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyValue_in_entryRulemyValue251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyValue261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rulemyValue308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyValue335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rulemyValue362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rulemyValue389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyObject_in_entryRulemyObject547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyObject557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyObject603 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulemyObject615 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_14_in_rulemyObject628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject649 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_12_in_rulemyObject662 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulemyAttribute_in_rulemyObject683 = new BitSet(new long[]{0x000000000000B000L});
        public static final BitSet FOLLOW_15_in_rulemyObject700 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject721 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rulemyConstraint_in_rulemyObject742 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_rulemyObject757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyConstraint_in_entryRulemyConstraint793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyConstraint803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulemyConstraint840 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyConstraint861 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemyConstraint873 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyConstraint894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyAttribute_in_entryRulemyAttribute930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyAttribute940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulemyAttribute986 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulemyAttribute998 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyValue_in_rulemyAttribute1019 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulemyAttribute1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBinary_in_entryRulemyBinary1067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBinary1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_rulemyBinary1124 = new BitSet(new long[]{0x00000001F8000002L});
        public static final BitSet FOLLOW_rulemyBinaryOparators_in_rulemyBinary1154 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyUnary_in_rulemyBinary1175 = new BitSet(new long[]{0x00000001F8000002L});
        public static final BitSet FOLLOW_rulemyPrimary_in_entryRulemyPrimary1213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyPrimary1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_rulemyPrimary1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_rulemyPrimary1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_rulemyPrimary1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_rulemyPrimary1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulemyPrimary1369 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyBinary_in_rulemyPrimary1391 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulemyPrimary1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_rulemyPrimary1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnary_in_entryRulemyUnary1466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyUnary1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyUnaryOparators_in_rulemyUnary1533 = new BitSet(new long[]{0x0000000201900070L});
        public static final BitSet FOLLOW_rulemyPrimary_in_rulemyUnary1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyPrimary_in_rulemyUnary1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyBoolean_in_entryRulemyBoolean1619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyBoolean1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulemyBoolean1671 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulemyBoolean1688 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulemyBoolean1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyIdentifier_in_entryRulemyIdentifier1746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyIdentifier1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemyIdentifier1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyRange_in_entryRulemyRange1835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyRange1845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rulemyRange1887 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulemyRange1904 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_rulemyRange1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemyStringEnum_in_entryRulemyStringEnum1962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyStringEnum1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulemyStringEnum2014 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_rulemyStringEnum2032 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulemyStringEnum2049 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rulemyNumberEnum_in_entryRulemyNumberEnum2092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemyNumberEnum2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulemyNumberEnum2148 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_rulemyNumberEnum2161 = new BitSet(new long[]{0x0000000001800040L});
        public static final BitSet FOLLOW_ruleEDouble_in_rulemyNumberEnum2182 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEInt2273 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEDouble2387 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2405 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEDouble2425 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2440 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_25_in_ruleEDouble2460 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_26_in_ruleEDouble2479 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_23_in_ruleEDouble2494 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleEDouble2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulemyBinaryOparators2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulemyBinaryOparators2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rulemyBinaryOparators2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulemyBinaryOparators2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulemyBinaryOparators2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulemyBinaryOparators2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulemyUnaryOparators2735 = new BitSet(new long[]{0x0000000000000002L});
    }


}