// Generated from .\PersonalInfo.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PersonalInfoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, COLON=4, WORD=5, DIGIT=6, DASH=7, SPACE=8, WS=9;
	public static final int
		RULE_document = 0, RULE_info = 1, RULE_nameAndLastName = 2, RULE_nameWithAge = 3, 
		RULE_telephoneNumber = 4, RULE_firstName = 5, RULE_lastName = 6, RULE_name = 7, 
		RULE_age = 8, RULE_number = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "info", "nameAndLastName", "nameWithAge", "telephoneNumber", 
			"firstName", "lastName", "name", "age", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'with'", "'telephone number'", "':'", null, null, "'-'", 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "COLON", "WORD", "DIGIT", "DASH", "SPACE", "WS"
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
	public String getGrammarFileName() { return "PersonalInfo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PersonalInfoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public List<InfoContext> info() {
			return getRuleContexts(InfoContext.class);
		}
		public InfoContext info(int i) {
			return getRuleContext(InfoContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				info();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==WORD );
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

	public static class InfoContext extends ParserRuleContext {
		public NameAndLastNameContext nameAndLastName() {
			return getRuleContext(NameAndLastNameContext.class,0);
		}
		public NameWithAgeContext nameWithAge() {
			return getRuleContext(NameWithAgeContext.class,0);
		}
		public TelephoneNumberContext telephoneNumber() {
			return getRuleContext(TelephoneNumberContext.class,0);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitInfo(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				nameAndLastName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				nameWithAge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				telephoneNumber();
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

	public static class NameAndLastNameContext extends ParserRuleContext {
		public FirstNameContext firstName() {
			return getRuleContext(FirstNameContext.class,0);
		}
		public LastNameContext lastName() {
			return getRuleContext(LastNameContext.class,0);
		}
		public NameAndLastNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndLastName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterNameAndLastName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitNameAndLastName(this);
		}
	}

	public final NameAndLastNameContext nameAndLastName() throws RecognitionException {
		NameAndLastNameContext _localctx = new NameAndLastNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameAndLastName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			firstName();
			setState(31);
			match(T__0);
			setState(32);
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

	public static class NameWithAgeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public NameWithAgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameWithAge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterNameWithAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitNameWithAge(this);
		}
	}

	public final NameWithAgeContext nameWithAge() throws RecognitionException {
		NameWithAgeContext _localctx = new NameWithAgeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameWithAge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			name();
			setState(35);
			match(T__1);
			setState(36);
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

	public static class TelephoneNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PersonalInfoParser.COLON, 0); }
		public TelephoneNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telephoneNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterTelephoneNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitTelephoneNumber(this);
		}
	}

	public final TelephoneNumberContext telephoneNumber() throws RecognitionException {
		TelephoneNumberContext _localctx = new TelephoneNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_telephoneNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(39);
				match(COLON);
				}
			}

			setState(42);
			number();
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

	public static class FirstNameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PersonalInfoParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PersonalInfoParser.WORD, i);
		}
		public FirstNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterFirstName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitFirstName(this);
		}
	}

	public final FirstNameContext firstName() throws RecognitionException {
		FirstNameContext _localctx = new FirstNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_firstName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(WORD);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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

	public static class LastNameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PersonalInfoParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PersonalInfoParser.WORD, i);
		}
		public LastNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterLastName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitLastName(this);
		}
	}

	public final LastNameContext lastName() throws RecognitionException {
		LastNameContext _localctx = new LastNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lastName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(49);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(52); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PersonalInfoParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PersonalInfoParser.WORD, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(WORD);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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

	public static class AgeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(PersonalInfoParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(PersonalInfoParser.DIGIT, i);
		}
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitAge(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				match(DIGIT);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(PersonalInfoParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(PersonalInfoParser.DIGIT, i);
		}
		public List<TerminalNode> DASH() { return getTokens(PersonalInfoParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PersonalInfoParser.DASH, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PersonalInfoParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(PersonalInfoParser.SPACE, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonalInfoListener ) ((PersonalInfoListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(DIGIT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << DASH) | (1L << SPACE))) != 0)) {
				{
				{
				setState(65);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << DASH) | (1L << SPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\u0004\u0001\tH\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004)\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005.\b\u0005\u000b"+
		"\u0005\f\u0005/\u0001\u0006\u0004\u00063\b\u0006\u000b\u0006\f\u00064"+
		"\u0001\u0007\u0004\u00078\b\u0007\u000b\u0007\f\u00079\u0001\b\u0004\b"+
		"=\b\b\u000b\b\f\b>\u0001\t\u0001\t\u0005\tC\b\t\n\t\f\tF\t\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001"+
		"\u0000\u0006\bF\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001c\u0001"+
		"\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000"+
		"\u0000\u0000\b&\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f2"+
		"\u0001\u0000\u0000\u0000\u000e7\u0001\u0000\u0000\u0000\u0010<\u0001\u0000"+
		"\u0000\u0000\u0012@\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001d\u0003\u0004\u0002"+
		"\u0000\u001a\u001d\u0003\u0006\u0003\u0000\u001b\u001d\u0003\b\u0004\u0000"+
		"\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0003\n\u0005\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003"+
		"\f\u0006\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0003\u000e\u0007\u0000"+
		"#$\u0005\u0002\u0000\u0000$%\u0003\u0010\b\u0000%\u0007\u0001\u0000\u0000"+
		"\u0000&(\u0005\u0003\u0000\u0000\')\u0005\u0004\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0012\t\u0000+\t\u0001\u0000\u0000\u0000,.\u0005\u0005\u0000\u0000-,"+
		"\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000\u000b\u0001\u0000\u0000\u000013\u0005"+
		"\u0005\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\r\u0001\u0000\u0000"+
		"\u000068\u0005\u0005\u0000\u000076\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u000f"+
		"\u0001\u0000\u0000\u0000;=\u0005\u0006\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?\u0011\u0001\u0000\u0000\u0000@D\u0005\u0006\u0000\u0000"+
		"AC\u0007\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0013\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000\b\u0017\u001c(/49>D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}