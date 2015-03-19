package configuratorProject.cpdsl.parser.antlr.internal; 

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
import configuratorProject.cpdsl.services.CpdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Contains'", "','", "'}'", "'Object'", "'Has'", "'Constraint'", "'Attribute'", "'Binary'", "'Oparand'", "'Left'", "'Right'", "'Unary'", "'Expression'", "'String'", "'value'", "'Int'", "'BoolLiteral'", "'Identifier'", "'Is'", "'AnyURI'", "'Boolean'", "'Enum'", "'values'", "'BooleanValue'", "'trueValue'", "'falseValue'", "'Range'", "'range'", "'AnySimpleType'", "'and'", "'or'", "'gt'", "'lt'", "'eq'", "'is'", "'if'", "'then'", "'not'"
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


        public InternalCpdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCpdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCpdslParser.tokenNames; }
    public String getGrammarFileName() { return "../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g"; }



     	private CpdslGrammarAccess grammarAccess;
     	
        public InternalCpdslParser(TokenStream input, CpdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CpdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_Contains_5_0 = null;

        EObject lv_Contains_7_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:80:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:81:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:81:2: ()
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:95:1: (otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:95:3: otherlv_3= 'Contains' otherlv_4= '{' ( (lv_Contains_5_0= ruleObject ) ) (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getContainsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:103:1: ( (lv_Contains_5_0= ruleObject ) )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:104:1: (lv_Contains_5_0= ruleObject )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:104:1: (lv_Contains_5_0= ruleObject )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:105:3: lv_Contains_5_0= ruleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getContainsObjectParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleObject_in_ruleModel189);
                    lv_Contains_5_0=ruleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"Contains",
                            		lv_Contains_5_0, 
                            		"Object");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:121:2: (otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:121:4: otherlv_6= ',' ( (lv_Contains_7_0= ruleObject ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:125:1: ( (lv_Contains_7_0= ruleObject ) )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:126:1: (lv_Contains_7_0= ruleObject )
                    	    {
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:126:1: (lv_Contains_7_0= ruleObject )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:127:3: lv_Contains_7_0= ruleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getContainsObjectParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleObject_in_ruleModel223);
                    	    lv_Contains_7_0=ruleObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Contains",
                    	            		lv_Contains_7_0, 
                    	            		"Object");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel237); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel251); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:159:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:160:2: (iv_ruleExpression= ruleExpression EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:161:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression287);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression297); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:168:1: ruleExpression returns [EObject current=null] : (this_Binary_0= ruleBinary | this_Unary_1= ruleUnary | this_String0_2= ruleString0 | this_Int0_3= ruleInt0 | this_BoolLiteral_4= ruleBoolLiteral | this_Identifier_5= ruleIdentifier ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Binary_0 = null;

        EObject this_Unary_1 = null;

        EObject this_String0_2 = null;

        EObject this_Int0_3 = null;

        EObject this_BoolLiteral_4 = null;

        EObject this_Identifier_5 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:171:28: ( (this_Binary_0= ruleBinary | this_Unary_1= ruleUnary | this_String0_2= ruleString0 | this_Int0_3= ruleInt0 | this_BoolLiteral_4= ruleBoolLiteral | this_Identifier_5= ruleIdentifier ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:172:1: (this_Binary_0= ruleBinary | this_Unary_1= ruleUnary | this_String0_2= ruleString0 | this_Int0_3= ruleInt0 | this_BoolLiteral_4= ruleBoolLiteral | this_Identifier_5= ruleIdentifier )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:172:1: (this_Binary_0= ruleBinary | this_Unary_1= ruleUnary | this_String0_2= ruleString0 | this_Int0_3= ruleInt0 | this_BoolLiteral_4= ruleBoolLiteral | this_Identifier_5= ruleIdentifier )
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
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:173:5: this_Binary_0= ruleBinary
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBinaryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinary_in_ruleExpression344);
                    this_Binary_0=ruleBinary();

                    state._fsp--;

                     
                            current = this_Binary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:183:5: this_Unary_1= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getUnaryParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnary_in_ruleExpression371);
                    this_Unary_1=ruleUnary();

                    state._fsp--;

                     
                            current = this_Unary_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:193:5: this_String0_2= ruleString0
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getString0ParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleExpression398);
                    this_String0_2=ruleString0();

                    state._fsp--;

                     
                            current = this_String0_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:203:5: this_Int0_3= ruleInt0
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getInt0ParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInt0_in_ruleExpression425);
                    this_Int0_3=ruleInt0();

                    state._fsp--;

                     
                            current = this_Int0_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:213:5: this_BoolLiteral_4= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBoolLiteralParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_ruleExpression452);
                    this_BoolLiteral_4=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:223:5: this_Identifier_5= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIdentifierParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleExpression479);
                    this_Identifier_5=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_5; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleValue"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:239:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:240:2: (iv_ruleValue= ruleValue EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:241:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue514);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue524); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:248:1: ruleValue returns [EObject current=null] : (this_Enum_0= ruleEnum | this_BooleanValue_1= ruleBooleanValue | this_Range_2= ruleRange ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_Range_2 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:251:28: ( (this_Enum_0= ruleEnum | this_BooleanValue_1= ruleBooleanValue | this_Range_2= ruleRange ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:252:1: (this_Enum_0= ruleEnum | this_BooleanValue_1= ruleBooleanValue | this_Range_2= ruleRange )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:252:1: (this_Enum_0= ruleEnum | this_BooleanValue_1= ruleBooleanValue | this_Range_2= ruleRange )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 39:
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
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:253:5: this_Enum_0= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEnumParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnum_in_ruleValue571);
                    this_Enum_0=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:263:5: this_BooleanValue_1= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleValue598);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:273:5: this_Range_2= ruleRange
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getRangeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRange_in_ruleValue625);
                    this_Range_2=ruleRange();

                    state._fsp--;

                     
                            current = this_Range_2; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleObject"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:289:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:290:2: (iv_ruleObject= ruleObject EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:291:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleObject_in_entryRuleObject660);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObject670); 

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:298:1: ruleObject returns [EObject current=null] : ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
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

        EObject lv_Has_6_0 = null;

        EObject lv_Has_8_0 = null;

        EObject lv_Contains_12_0 = null;

        EObject lv_Contains_14_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:301:28: ( ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:302:1: ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:302:1: ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:302:2: () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )? (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:302:2: ()
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:303:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getObjectAccess().getObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleObject716); 

                	newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:312:1: ( (lv_name_2_0= ruleEString ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:313:1: (lv_name_2_0= ruleEString )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:313:1: (lv_name_2_0= ruleEString )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:314:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleObject737);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObject749); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:334:1: (otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:334:3: otherlv_4= 'Has' otherlv_5= '{' ( (lv_Has_6_0= ruleConstraint ) ) (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleObject762); 

                        	newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getHasKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObject774); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:342:1: ( (lv_Has_6_0= ruleConstraint ) )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:343:1: (lv_Has_6_0= ruleConstraint )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:343:1: (lv_Has_6_0= ruleConstraint )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:344:3: lv_Has_6_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getHasConstraintParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleObject795);
                    lv_Has_6_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"Has",
                            		lv_Has_6_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:360:2: (otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:360:4: otherlv_7= ',' ( (lv_Has_8_0= ruleConstraint ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObject808); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:364:1: ( (lv_Has_8_0= ruleConstraint ) )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:365:1: (lv_Has_8_0= ruleConstraint )
                    	    {
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:365:1: (lv_Has_8_0= ruleConstraint )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:366:3: lv_Has_8_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getObjectAccess().getHasConstraintParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleObject829);
                    	    lv_Has_8_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Has",
                    	            		lv_Has_8_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleObject843); 

                        	newLeafNode(otherlv_9, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:386:3: (otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:386:5: otherlv_10= 'Contains' otherlv_11= '{' ( (lv_Contains_12_0= ruleAttribute ) ) (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleObject858); 

                        	newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getContainsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObject870); 

                        	newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:394:1: ( (lv_Contains_12_0= ruleAttribute ) )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:395:1: (lv_Contains_12_0= ruleAttribute )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:395:1: (lv_Contains_12_0= ruleAttribute )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:396:3: lv_Contains_12_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAccess().getContainsAttributeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleObject891);
                    lv_Contains_12_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	        }
                           		add(
                           			current, 
                           			"Contains",
                            		lv_Contains_12_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:412:2: (otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:412:4: otherlv_13= ',' ( (lv_Contains_14_0= ruleAttribute ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObject904); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getObjectAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:416:1: ( (lv_Contains_14_0= ruleAttribute ) )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:417:1: (lv_Contains_14_0= ruleAttribute )
                    	    {
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:417:1: (lv_Contains_14_0= ruleAttribute )
                    	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:418:3: lv_Contains_14_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getObjectAccess().getContainsAttributeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleObject925);
                    	    lv_Contains_14_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getObjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Contains",
                    	            		lv_Contains_14_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleObject939); 

                        	newLeafNode(otherlv_15, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleObject953); 

                	newLeafNode(otherlv_16, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleEString"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:450:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:451:2: (iv_ruleEString= ruleEString EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:452:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString990);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1001); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:459:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:462:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:463:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:463:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:463:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1041); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:471:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1067); 

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


    // $ANTLR start "entryRuleConstraint"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:486:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:487:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:488:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint1112);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint1122); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:495:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Contains' ( (lv_Contains_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Contains_3_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:498:28: ( (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Contains' ( (lv_Contains_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:499:1: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Contains' ( (lv_Contains_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:499:1: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Contains' ( (lv_Contains_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:499:3: otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Contains' ( (lv_Contains_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstraint1159); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstraint1171); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstraint1183); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getContainsKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:511:1: ( (lv_Contains_3_0= ruleExpression ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:512:1: (lv_Contains_3_0= ruleExpression )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:512:1: (lv_Contains_3_0= ruleExpression )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:513:3: lv_Contains_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getContainsExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstraint1204);
            lv_Contains_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"Contains",
                    		lv_Contains_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstraint1216); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleAttribute"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:541:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:542:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:543:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute1252);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute1262); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:550:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Contains' ( (lv_Contains_4_0= ruleValue ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_Contains_4_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:553:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Contains' ( (lv_Contains_4_0= ruleValue ) ) otherlv_5= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:554:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Contains' ( (lv_Contains_4_0= ruleValue ) ) otherlv_5= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:554:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Contains' ( (lv_Contains_4_0= ruleValue ) ) otherlv_5= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:554:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Contains' ( (lv_Contains_4_0= ruleValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute1299); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:558:1: ( (lv_name_1_0= ruleEString ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:559:1: (lv_name_1_0= ruleEString )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:559:1: (lv_name_1_0= ruleEString )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:560:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute1320);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttribute1332); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttribute1344); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getContainsKeyword_3());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:584:1: ( (lv_Contains_4_0= ruleValue ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:585:1: (lv_Contains_4_0= ruleValue )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:585:1: (lv_Contains_4_0= ruleValue )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:586:3: lv_Contains_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getContainsValueParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleAttribute1365);
            lv_Contains_4_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"Contains",
                    		lv_Contains_4_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttribute1377); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleBinary"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:614:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:615:2: (iv_ruleBinary= ruleBinary EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:616:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinary_in_entryRuleBinary1413);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinary1423); 

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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:623:1: ruleBinary returns [EObject current=null] : (otherlv_0= 'Binary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )? otherlv_4= 'Left' ( (lv_Left_5_0= ruleExpression ) ) otherlv_6= 'Right' ( (lv_Right_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_Oparand_3_0 = null;

        EObject lv_Left_5_0 = null;

        EObject lv_Right_7_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:626:28: ( (otherlv_0= 'Binary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )? otherlv_4= 'Left' ( (lv_Left_5_0= ruleExpression ) ) otherlv_6= 'Right' ( (lv_Right_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:627:1: (otherlv_0= 'Binary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )? otherlv_4= 'Left' ( (lv_Left_5_0= ruleExpression ) ) otherlv_6= 'Right' ( (lv_Right_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:627:1: (otherlv_0= 'Binary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )? otherlv_4= 'Left' ( (lv_Left_5_0= ruleExpression ) ) otherlv_6= 'Right' ( (lv_Right_7_0= ruleExpression ) ) otherlv_8= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:627:3: otherlv_0= 'Binary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )? otherlv_4= 'Left' ( (lv_Left_5_0= ruleExpression ) ) otherlv_6= 'Right' ( (lv_Right_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBinary1460); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryAccess().getBinaryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBinary1472); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:635:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:635:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleBinaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBinary1485); 

                        	newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getOparandKeyword_2_0());
                        
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:639:1: ( (lv_Oparand_3_0= ruleBinaryOparators ) )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:640:1: (lv_Oparand_3_0= ruleBinaryOparators )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:640:1: (lv_Oparand_3_0= ruleBinaryOparators )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:641:3: lv_Oparand_3_0= ruleBinaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryAccess().getOparandBinaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOparators_in_ruleBinary1506);
                    lv_Oparand_3_0=ruleBinaryOparators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryRule());
                    	        }
                           		set(
                           			current, 
                           			"Oparand",
                            		lv_Oparand_3_0, 
                            		"BinaryOparators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBinary1520); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getLeftKeyword_3());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:661:1: ( (lv_Left_5_0= ruleExpression ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:662:1: (lv_Left_5_0= ruleExpression )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:662:1: (lv_Left_5_0= ruleExpression )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:663:3: lv_Left_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryAccess().getLeftExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinary1541);
            lv_Left_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"Left",
                    		lv_Left_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinary1553); 

                	newLeafNode(otherlv_6, grammarAccess.getBinaryAccess().getRightKeyword_5());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:683:1: ( (lv_Right_7_0= ruleExpression ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:684:1: (lv_Right_7_0= ruleExpression )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:684:1: (lv_Right_7_0= ruleExpression )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:685:3: lv_Right_7_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryAccess().getRightExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinary1574);
            lv_Right_7_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryRule());
            	        }
                   		set(
                   			current, 
                   			"Right",
                    		lv_Right_7_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBinary1586); 

                	newLeafNode(otherlv_8, grammarAccess.getBinaryAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleUnary"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:713:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:714:2: (iv_ruleUnary= ruleUnary EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:715:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnary_in_entryRuleUnary1622);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnary1632); 

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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:722:1: ruleUnary returns [EObject current=null] : (otherlv_0= 'Unary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )? otherlv_4= 'Expression' ( (lv_Expression_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_Oparand_3_0 = null;

        EObject lv_Expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:725:28: ( (otherlv_0= 'Unary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )? otherlv_4= 'Expression' ( (lv_Expression_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:726:1: (otherlv_0= 'Unary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )? otherlv_4= 'Expression' ( (lv_Expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:726:1: (otherlv_0= 'Unary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )? otherlv_4= 'Expression' ( (lv_Expression_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:726:3: otherlv_0= 'Unary' otherlv_1= '{' (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )? otherlv_4= 'Expression' ( (lv_Expression_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleUnary1669); 

                	newLeafNode(otherlv_0, grammarAccess.getUnaryAccess().getUnaryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUnary1681); 

                	newLeafNode(otherlv_1, grammarAccess.getUnaryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:734:1: (otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:734:3: otherlv_2= 'Oparand' ( (lv_Oparand_3_0= ruleUnaryOparators ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleUnary1694); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryAccess().getOparandKeyword_2_0());
                        
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:738:1: ( (lv_Oparand_3_0= ruleUnaryOparators ) )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:739:1: (lv_Oparand_3_0= ruleUnaryOparators )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:739:1: (lv_Oparand_3_0= ruleUnaryOparators )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:740:3: lv_Oparand_3_0= ruleUnaryOparators
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryAccess().getOparandUnaryOparatorsEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOparators_in_ruleUnary1715);
                    lv_Oparand_3_0=ruleUnaryOparators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"Oparand",
                            		lv_Oparand_3_0, 
                            		"UnaryOparators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleUnary1729); 

                	newLeafNode(otherlv_4, grammarAccess.getUnaryAccess().getExpressionKeyword_3());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:760:1: ( (lv_Expression_5_0= ruleExpression ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:761:1: (lv_Expression_5_0= ruleExpression )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:761:1: (lv_Expression_5_0= ruleExpression )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:762:3: lv_Expression_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getExpressionExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleUnary1750);
            lv_Expression_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"Expression",
                    		lv_Expression_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUnary1762); 

                	newLeafNode(otherlv_6, grammarAccess.getUnaryAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleString0"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:790:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:791:2: (iv_ruleString0= ruleString0 EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:792:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01798);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01808); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:799:1: ruleString0 returns [EObject current=null] : (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:802:28: ( (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:803:1: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:803:1: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:803:3: otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAnyURI ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleString01845); 

                	newLeafNode(otherlv_0, grammarAccess.getString0Access().getStringKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleString01857); 

                	newLeafNode(otherlv_1, grammarAccess.getString0Access().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleString01869); 

                	newLeafNode(otherlv_2, grammarAccess.getString0Access().getValueKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:815:1: ( (lv_value_3_0= ruleAnyURI ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:816:1: (lv_value_3_0= ruleAnyURI )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:816:1: (lv_value_3_0= ruleAnyURI )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:817:3: lv_value_3_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getString0Access().getValueAnyURIParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleString01890);
            lv_value_3_0=ruleAnyURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getString0Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"AnyURI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleString01902); 

                	newLeafNode(otherlv_4, grammarAccess.getString0Access().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInt0"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:845:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:846:2: (iv_ruleInt0= ruleInt0 EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:847:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt01938);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt01948); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:854:1: ruleInt0 returns [EObject current=null] : (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt1 ) ) otherlv_4= '}' ) ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:857:28: ( (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt1 ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:858:1: (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt1 ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:858:1: (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt1 ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:858:3: otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt1 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInt01985); 

                	newLeafNode(otherlv_0, grammarAccess.getInt0Access().getIntKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInt01997); 

                	newLeafNode(otherlv_1, grammarAccess.getInt0Access().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInt02009); 

                	newLeafNode(otherlv_2, grammarAccess.getInt0Access().getValueKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:870:1: ( (lv_value_3_0= ruleInt1 ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:871:1: (lv_value_3_0= ruleInt1 )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:871:1: (lv_value_3_0= ruleInt1 )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:872:3: lv_value_3_0= ruleInt1
            {
             
            	        newCompositeNode(grammarAccess.getInt0Access().getValueInt1ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInt1_in_ruleInt02030);
            lv_value_3_0=ruleInt1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInt0Rule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Int1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInt02042); 

                	newLeafNode(otherlv_4, grammarAccess.getInt0Access().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:900:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:901:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:902:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2078);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolLiteral2088); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:909:1: ruleBoolLiteral returns [EObject current=null] : (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:912:28: ( (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:913:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:913:1: (otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:913:3: otherlv_0= 'BoolLiteral' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBoolLiteral2125); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolLiteralAccess().getBoolLiteralKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolLiteral2137); 

                	newLeafNode(otherlv_1, grammarAccess.getBoolLiteralAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBoolLiteral2149); 

                	newLeafNode(otherlv_2, grammarAccess.getBoolLiteralAccess().getValueKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:925:1: ( (lv_value_3_0= ruleBoolean ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:926:1: (lv_value_3_0= ruleBoolean )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:926:1: (lv_value_3_0= ruleBoolean )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:927:3: lv_value_3_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleBoolLiteral2170);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBoolLiteral2182); 

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


    // $ANTLR start "entryRuleIdentifier"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:955:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:956:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:957:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier2218);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier2228); 

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:964:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Identifier' otherlv_1= '{' otherlv_2= 'Is' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:967:28: ( (otherlv_0= 'Identifier' otherlv_1= '{' otherlv_2= 'Is' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:968:1: (otherlv_0= 'Identifier' otherlv_1= '{' otherlv_2= 'Is' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:968:1: (otherlv_0= 'Identifier' otherlv_1= '{' otherlv_2= 'Is' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:968:3: otherlv_0= 'Identifier' otherlv_1= '{' otherlv_2= 'Is' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleIdentifier2265); 

                	newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdentifierKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIdentifier2277); 

                	newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleIdentifier2289); 

                	newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getIsKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:980:1: ( ( ruleEString ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:981:1: ( ruleEString )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:981:1: ( ruleEString )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:982:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIdentifierAccess().getIsAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2312);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIdentifier2324); 

                	newLeafNode(otherlv_4, grammarAccess.getIdentifierAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleAnyURI"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1007:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1008:2: (iv_ruleAnyURI= ruleAnyURI EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1009:2: iv_ruleAnyURI= ruleAnyURI EOF
            {
             newCompositeNode(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI2361);
            iv_ruleAnyURI=ruleAnyURI();

            state._fsp--;

             current =iv_ruleAnyURI.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI2372); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1016:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1019:28: (kw= 'AnyURI' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1021:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnyURI2409); 

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


    // $ANTLR start "entryRuleInt1"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1034:1: entryRuleInt1 returns [String current=null] : iv_ruleInt1= ruleInt1 EOF ;
    public final String entryRuleInt1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt1 = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1035:2: (iv_ruleInt1= ruleInt1 EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1036:2: iv_ruleInt1= ruleInt1 EOF
            {
             newCompositeNode(grammarAccess.getInt1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt1_in_entryRuleInt12449);
            iv_ruleInt1=ruleInt1();

            state._fsp--;

             current =iv_ruleInt1.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt12460); 

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
    // $ANTLR end "entryRuleInt1"


    // $ANTLR start "ruleInt1"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1043:1: ruleInt1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1046:28: (kw= 'Int' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1048:2: kw= 'Int'
            {
            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInt12497); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInt1Access().getIntKeyword()); 
                

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
    // $ANTLR end "ruleInt1"


    // $ANTLR start "entryRuleBoolean"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1061:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1062:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1063:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean2537);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean2548); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1070:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1073:28: (kw= 'Boolean' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1075:2: kw= 'Boolean'
            {
            kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBoolean2585); 

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


    // $ANTLR start "entryRuleEnum"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1088:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1089:2: (iv_ruleEnum= ruleEnum EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1090:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnum_in_entryRuleEnum2624);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnum2634); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1097:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
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
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1100:28: ( (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1101:1: (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1101:1: (otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1101:3: otherlv_0= 'Enum' otherlv_1= '{' otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleAnySimpleType ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEnum2671); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnum2683); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEnum2695); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getValuesKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnum2707); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1117:1: ( (lv_values_4_0= ruleAnySimpleType ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1118:1: (lv_values_4_0= ruleAnySimpleType )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1118:1: (lv_values_4_0= ruleAnySimpleType )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1119:3: lv_values_4_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getValuesAnySimpleTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_ruleEnum2728);
            lv_values_4_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_4_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1135:2: (otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1135:4: otherlv_5= ',' ( (lv_values_6_0= ruleAnySimpleType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEnum2741); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getCommaKeyword_5_0());
            	        
            	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1139:1: ( (lv_values_6_0= ruleAnySimpleType ) )
            	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1140:1: (lv_values_6_0= ruleAnySimpleType )
            	    {
            	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1140:1: (lv_values_6_0= ruleAnySimpleType )
            	    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1141:3: lv_values_6_0= ruleAnySimpleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getValuesAnySimpleTypeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_ruleEnum2762);
            	    lv_values_6_0=ruleAnySimpleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
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

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnum2776); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnum2788); 

                	newLeafNode(otherlv_8, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleBooleanValue"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1173:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1174:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1175:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2824);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue2834); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1182:1: ruleBooleanValue returns [EObject current=null] : (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' ) ;
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
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1185:28: ( (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1186:1: (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1186:1: (otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1186:3: otherlv_0= 'BooleanValue' otherlv_1= '{' otherlv_2= 'trueValue' ( (lv_trueValue_3_0= ruleAnyURI ) ) otherlv_4= 'falseValue' ( (lv_falseValue_5_0= ruleAnyURI ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBooleanValue2871); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBooleanValue2883); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanValueAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBooleanValue2895); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getTrueValueKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1198:1: ( (lv_trueValue_3_0= ruleAnyURI ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1199:1: (lv_trueValue_3_0= ruleAnyURI )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1199:1: (lv_trueValue_3_0= ruleAnyURI )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1200:3: lv_trueValue_3_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2916);
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

            otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBooleanValue2928); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanValueAccess().getFalseValueKeyword_4());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1220:1: ( (lv_falseValue_5_0= ruleAnyURI ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1221:1: (lv_falseValue_5_0= ruleAnyURI )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1221:1: (lv_falseValue_5_0= ruleAnyURI )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1222:3: lv_falseValue_5_0= ruleAnyURI
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleBooleanValue2949);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBooleanValue2961); 

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


    // $ANTLR start "entryRuleRange"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1250:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1251:2: (iv_ruleRange= ruleRange EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1252:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRange_in_entryRuleRange2997);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRange3007); 

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1259:1: ruleRange returns [EObject current=null] : (otherlv_0= 'Range' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_range_3_0 = null;


         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1262:28: ( (otherlv_0= 'Range' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1263:1: (otherlv_0= 'Range' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1263:1: (otherlv_0= 'Range' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1263:3: otherlv_0= 'Range' otherlv_1= '{' otherlv_2= 'range' ( (lv_range_3_0= ruleAnySimpleType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRange3044); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getRangeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRange3056); 

                	newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRange3068); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getRangeKeyword_2());
                
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1275:1: ( (lv_range_3_0= ruleAnySimpleType ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1276:1: (lv_range_3_0= ruleAnySimpleType )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1276:1: (lv_range_3_0= ruleAnySimpleType )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1277:3: lv_range_3_0= ruleAnySimpleType
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getRangeAnySimpleTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_ruleRange3089);
            lv_range_3_0=ruleAnySimpleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"AnySimpleType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRange3101); 

                	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleAnySimpleType"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1305:1: entryRuleAnySimpleType returns [String current=null] : iv_ruleAnySimpleType= ruleAnySimpleType EOF ;
    public final String entryRuleAnySimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnySimpleType = null;


        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1306:2: (iv_ruleAnySimpleType= ruleAnySimpleType EOF )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1307:2: iv_ruleAnySimpleType= ruleAnySimpleType EOF
            {
             newCompositeNode(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType3138);
            iv_ruleAnySimpleType=ruleAnySimpleType();

            state._fsp--;

             current =iv_ruleAnySimpleType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType3149); 

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
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1314:1: ruleAnySimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnySimpleType' ;
    public final AntlrDatatypeRuleToken ruleAnySimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1317:28: (kw= 'AnySimpleType' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1319:2: kw= 'AnySimpleType'
            {
            kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnySimpleType3186); 

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


    // $ANTLR start "ruleBinaryOparators"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1332:1: ruleBinaryOparators returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) ;
    public final Enumerator ruleBinaryOparators() throws RecognitionException {
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
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1334:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1335:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1335:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'gt' ) | (enumLiteral_3= 'lt' ) | (enumLiteral_4= 'eq' ) | (enumLiteral_5= 'is' ) | (enumLiteral_6= 'if' ) | (enumLiteral_7= 'then' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            case 46:
                {
                alt13=5;
                }
                break;
            case 47:
                {
                alt13=6;
                }
                break;
            case 48:
                {
                alt13=7;
                }
                break;
            case 49:
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
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1335:2: (enumLiteral_0= 'and' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1335:2: (enumLiteral_0= 'and' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1335:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOparators3239); 

                            current = grammarAccess.getBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1341:6: (enumLiteral_1= 'or' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1341:6: (enumLiteral_1= 'or' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1341:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOparators3256); 

                            current = grammarAccess.getBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1347:6: (enumLiteral_2= 'gt' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1347:6: (enumLiteral_2= 'gt' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1347:8: enumLiteral_2= 'gt'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBinaryOparators3273); 

                            current = grammarAccess.getBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1353:6: (enumLiteral_3= 'lt' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1353:6: (enumLiteral_3= 'lt' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1353:8: enumLiteral_3= 'lt'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBinaryOparators3290); 

                            current = grammarAccess.getBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1359:6: (enumLiteral_4= 'eq' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1359:6: (enumLiteral_4= 'eq' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1359:8: enumLiteral_4= 'eq'
                    {
                    enumLiteral_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBinaryOparators3307); 

                            current = grammarAccess.getBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1365:6: (enumLiteral_5= 'is' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1365:6: (enumLiteral_5= 'is' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1365:8: enumLiteral_5= 'is'
                    {
                    enumLiteral_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleBinaryOparators3324); 

                            current = grammarAccess.getBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1371:6: (enumLiteral_6= 'if' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1371:6: (enumLiteral_6= 'if' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1371:8: enumLiteral_6= 'if'
                    {
                    enumLiteral_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBinaryOparators3341); 

                            current = grammarAccess.getBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1377:6: (enumLiteral_7= 'then' )
                    {
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1377:6: (enumLiteral_7= 'then' )
                    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1377:8: enumLiteral_7= 'then'
                    {
                    enumLiteral_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBinaryOparators3358); 

                            current = grammarAccess.getBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "ruleBinaryOparators"


    // $ANTLR start "ruleUnaryOparators"
    // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1387:1: ruleUnaryOparators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryOparators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1389:28: ( (enumLiteral_0= 'not' ) )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1390:1: (enumLiteral_0= 'not' )
            {
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1390:1: (enumLiteral_0= 'not' )
            // ../configuratorProject.cpdsl/src-gen/configuratorProject/cpdsl/parser/antlr/internal/InternalCpdsl.g:1390:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleUnaryOparators3402); 

                    current = grammarAccess.getUnaryOparatorsAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleUnaryOparators"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel168 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleObject_in_ruleModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel202 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleObject_in_ruleModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinary_in_ruleExpression344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_ruleExpression371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_ruleExpression398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_ruleExpression425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleExpression452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleExpression479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_ruleValue571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRange_in_ruleValue625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObject_in_entryRuleObject660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObject670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleObject716 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleObject737 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObject749 = new BitSet(new long[]{0x000000000002A000L});
        public static final BitSet FOLLOW_17_in_ruleObject762 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObject774 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleObject795 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleObject808 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleObject829 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleObject843 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleObject858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObject870 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleObject891 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleObject904 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleObject925 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleObject939 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleObject953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleConstraint1159 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstraint1171 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstraint1183 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstraint1204 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConstraint1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAttribute1299 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute1320 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttribute1332 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttribute1344 = new BitSet(new long[]{0x0000009400000000L});
        public static final BitSet FOLLOW_ruleValue_in_ruleAttribute1365 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAttribute1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary1413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinary1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBinary1460 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBinary1472 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleBinary1485 = new BitSet(new long[]{0x0003FC0000000000L});
        public static final BitSet FOLLOW_ruleBinaryOparators_in_ruleBinary1506 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBinary1520 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinary1541 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBinary1553 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinary1574 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBinary1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnary1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleUnary1669 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUnary1681 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_21_in_ruleUnary1694 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleUnaryOparators_in_ruleUnary1715 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleUnary1729 = new BitSet(new long[]{0x0000000075100000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleUnary1750 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleUnary1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleString01845 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleString01857 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleString01869 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleString01890 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleString01902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt01938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt01948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleInt01985 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInt01997 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleInt02009 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleInt1_in_ruleInt02030 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInt02042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBoolLiteral2125 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBoolLiteral2137 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBoolLiteral2149 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleBoolLiteral2170 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBoolLiteral2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleIdentifier2265 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIdentifier2277 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleIdentifier2289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2312 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIdentifier2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAnyURI2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt1_in_entryRuleInt12449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt12460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleInt12497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBoolean2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnum2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEnum2671 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnum2683 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleEnum2695 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnum2707 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_ruleEnum2728 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleEnum2741 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_ruleEnum2762 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleEnum2776 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEnum2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBooleanValue2871 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBooleanValue2883 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBooleanValue2895 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2916 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleBooleanValue2928 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleBooleanValue2949 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBooleanValue2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRange3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleRange3044 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRange3056 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRange3068 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_ruleRange3089 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRange3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType3138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAnySimpleType3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOparators3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOparators3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBinaryOparators3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBinaryOparators3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleBinaryOparators3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleBinaryOparators3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleBinaryOparators3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleBinaryOparators3358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleUnaryOparators3402 = new BitSet(new long[]{0x0000000000000002L});
    }


}