// Generated from MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GOODBYE=1, HELLO=2, NUMBER=3, DASH=4, ID=5, WS=6;
	public static final int
		RULE_myStart = 0, RULE_greeting = 1, RULE_goodbye = 2, RULE_personInfo = 3, 
		RULE_nameAge = 4, RULE_fullName = 5, RULE_namePhone = 6, RULE_fullNamePhone = 7, 
		RULE_name = 8, RULE_firstName = 9, RULE_lastName = 10, RULE_age = 11, 
		RULE_phone = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "greeting", "goodbye", "personInfo", "nameAge", "fullName", 
			"namePhone", "fullNamePhone", "name", "firstName", "lastName", "age", 
			"phone"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Bye'", "'Hello'", null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GOODBYE", "HELLO", "NUMBER", "DASH", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<GreetingContext> greeting() {
			return getRuleContexts(GreetingContext.class);
		}
		public GreetingContext greeting(int i) {
			return getRuleContext(GreetingContext.class,i);
		}
		public List<GoodbyeContext> goodbye() {
			return getRuleContexts(GoodbyeContext.class);
		}
		public GoodbyeContext goodbye(int i) {
			return getRuleContext(GoodbyeContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HELLO:
					{
					setState(26);
					greeting();
					}
					break;
				case GOODBYE:
					{
					setState(27);
					goodbye();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GOODBYE || _la==HELLO );
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreetingContext extends ParserRuleContext {
		public TerminalNode HELLO() { return getToken(MyGrammarParser.HELLO, 0); }
		public PersonInfoContext personInfo() {
			return getRuleContext(PersonInfoContext.class,0);
		}
		public GreetingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greeting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGreeting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGreeting(this);
		}
	}

	public final GreetingContext greeting() throws RecognitionException {
		GreetingContext _localctx = new GreetingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_greeting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(HELLO);
			setState(35);
			personInfo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GoodbyeContext extends ParserRuleContext {
		public TerminalNode GOODBYE() { return getToken(MyGrammarParser.GOODBYE, 0); }
		public GoodbyeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goodbye; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGoodbye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGoodbye(this);
		}
	}

	public final GoodbyeContext goodbye() throws RecognitionException {
		GoodbyeContext _localctx = new GoodbyeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_goodbye);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(GOODBYE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonInfoContext extends ParserRuleContext {
		public NameAgeContext nameAge() {
			return getRuleContext(NameAgeContext.class,0);
		}
		public FullNameContext fullName() {
			return getRuleContext(FullNameContext.class,0);
		}
		public NamePhoneContext namePhone() {
			return getRuleContext(NamePhoneContext.class,0);
		}
		public FullNamePhoneContext fullNamePhone() {
			return getRuleContext(FullNamePhoneContext.class,0);
		}
		public PersonInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPersonInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPersonInfo(this);
		}
	}

	public final PersonInfoContext personInfo() throws RecognitionException {
		PersonInfoContext _localctx = new PersonInfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_personInfo);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				nameAge();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				fullName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				namePhone();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				fullNamePhone();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameAgeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public NameAgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNameAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNameAge(this);
		}
	}

	public final NameAgeContext nameAge() throws RecognitionException {
		NameAgeContext _localctx = new NameAgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nameAge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			name();
			setState(46);
			age();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullNameContext extends ParserRuleContext {
		public FirstNameContext firstName() {
			return getRuleContext(FirstNameContext.class,0);
		}
		public LastNameContext lastName() {
			return getRuleContext(LastNameContext.class,0);
		}
		public FullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFullName(this);
		}
	}

	public final FullNameContext fullName() throws RecognitionException {
		FullNameContext _localctx = new FullNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fullName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			firstName();
			setState(49);
			lastName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamePhoneContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PhoneContext phone() {
			return getRuleContext(PhoneContext.class,0);
		}
		public NamePhoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namePhone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNamePhone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNamePhone(this);
		}
	}

	public final NamePhoneContext namePhone() throws RecognitionException {
		NamePhoneContext _localctx = new NamePhoneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namePhone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			name();
			setState(52);
			phone();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullNamePhoneContext extends ParserRuleContext {
		public FirstNameContext firstName() {
			return getRuleContext(FirstNameContext.class,0);
		}
		public LastNameContext lastName() {
			return getRuleContext(LastNameContext.class,0);
		}
		public PhoneContext phone() {
			return getRuleContext(PhoneContext.class,0);
		}
		public FullNamePhoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullNamePhone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFullNamePhone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFullNamePhone(this);
		}
	}

	public final FullNamePhoneContext fullNamePhone() throws RecognitionException {
		FullNamePhoneContext _localctx = new FullNamePhoneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fullNamePhone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			firstName();
			setState(55);
			lastName();
			setState(56);
			phone();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FirstNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public FirstNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFirstName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFirstName(this);
		}
	}

	public final FirstNameContext firstName() throws RecognitionException {
		FirstNameContext _localctx = new FirstNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_firstName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public LastNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLastName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLastName(this);
		}
	}

	public final LastNameContext lastName() throws RecognitionException {
		LastNameContext _localctx = new LastNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lastName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAge(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_age);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PhoneContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MyGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> DASH() { return getTokens(MyGrammarParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(MyGrammarParser.DASH, i);
		}
		public PhoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPhone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPhone(this);
		}
	}

	public final PhoneContext phone() throws RecognitionException {
		PhoneContext _localctx = new PhoneContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_phone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NUMBER);
			setState(67);
			match(DASH);
			setState(68);
			match(NUMBER);
			setState(69);
			match(DASH);
			setState(70);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b\u0000"+
		"\f\u0000\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0000@\u0000\u001c\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006"+
		"+\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n0\u0001\u0000\u0000"+
		"\u0000\f3\u0001\u0000\u0000\u0000\u000e6\u0001\u0000\u0000\u0000\u0010"+
		":\u0001\u0000\u0000\u0000\u0012<\u0001\u0000\u0000\u0000\u0014>\u0001"+
		"\u0000\u0000\u0000\u0016@\u0001\u0000\u0000\u0000\u0018B\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0004\u0002"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0002"+
		"\u0000\u0000#$\u0003\u0006\u0003\u0000$\u0003\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0001\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\',\u0003\b\u0004"+
		"\u0000(,\u0003\n\u0005\u0000),\u0003\f\u0006\u0000*,\u0003\u000e\u0007"+
		"\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0010\b\u0000./\u0003\u0016\u000b\u0000/\t\u0001\u0000\u0000"+
		"\u000001\u0003\u0012\t\u000012\u0003\u0014\n\u00002\u000b\u0001\u0000"+
		"\u0000\u000034\u0003\u0010\b\u000045\u0003\u0018\f\u00005\r\u0001\u0000"+
		"\u0000\u000067\u0003\u0012\t\u000078\u0003\u0014\n\u000089\u0003\u0018"+
		"\f\u00009\u000f\u0001\u0000\u0000\u0000:;\u0005\u0005\u0000\u0000;\u0011"+
		"\u0001\u0000\u0000\u0000<=\u0005\u0005\u0000\u0000=\u0013\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0005\u0000\u0000?\u0015\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0003\u0000\u0000A\u0017\u0001\u0000\u0000\u0000BC\u0005\u0003"+
		"\u0000\u0000CD\u0005\u0004\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005"+
		"\u0004\u0000\u0000FG\u0005\u0003\u0000\u0000G\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\u001c\u001e+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}