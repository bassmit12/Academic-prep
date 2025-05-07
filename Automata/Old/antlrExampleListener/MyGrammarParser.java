// Generated from MyGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GOODBYE=1, HELLO=2, NUMBER=3, ID=4, WS=5;
	public static final int
		RULE_myStart = 0, RULE_hello = 1, RULE_goodbye = 2, RULE_name = 3, RULE_age = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "hello", "goodbye", "name", "age"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Bye'", "'Hello'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GOODBYE", "HELLO", "NUMBER", "ID", "WS"
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

	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<HelloContext> hello() {
			return getRuleContexts(HelloContext.class);
		}
		public HelloContext hello(int i) {
			return getRuleContext(HelloContext.class,i);
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
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HELLO:
					{
					setState(10);
					hello();
					}
					break;
				case GOODBYE:
					{
					setState(11);
					goodbye();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GOODBYE || _la==HELLO );
			setState(16);
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

	public static class HelloContext extends ParserRuleContext {
		public TerminalNode HELLO() { return getToken(MyGrammarParser.HELLO, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public HelloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hello; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterHello(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitHello(this);
		}
	}

	public final HelloContext hello() throws RecognitionException {
		HelloContext _localctx = new HelloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hello);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(HELLO);
			setState(19);
			name();
			setState(20);
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
			setState(22);
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
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
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
		enterRule(_localctx, 8, RULE_age);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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
		"\u0004\u0001\u0005\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\r\b\u0000\u000b\u0000\f\u0000\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\u0019"+
		"\u0000\f\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004"+
		"\u0016\u0001\u0000\u0000\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b\u001a"+
		"\u0001\u0000\u0000\u0000\n\r\u0003\u0002\u0001\u0000\u000b\r\u0003\u0004"+
		"\u0002\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0005\u0002\u0000\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014"+
		"\u0015\u0003\b\u0004\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\u0001\u0000\u0000\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0004\u0000\u0000\u0019\u0007\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0003\u0000\u0000\u001b\t\u0001\u0000\u0000\u0000\u0002\f\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}