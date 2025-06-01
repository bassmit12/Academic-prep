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
		T__0=1, T__1=2, INTERSECTION=3, LPAR=4, RPAR=5, WS=6;
	public static final int
		RULE_myStart = 0, RULE_dfa = 1, RULE_firstDfa = 2, RULE_secondDfa = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "dfa", "firstDfa", "secondDfa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ab*a*'", "'(b)*ab'", "'\\u2229'", "'L('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INTERSECTION", "LPAR", "RPAR", "WS"
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
		public DfaContext dfa() {
			return getRuleContext(DfaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			dfa();
			setState(9);
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
	public static class DfaContext extends ParserRuleContext {
		public FirstDfaContext firstDfa() {
			return getRuleContext(FirstDfaContext.class,0);
		}
		public TerminalNode INTERSECTION() { return getToken(MyGrammarParser.INTERSECTION, 0); }
		public SecondDfaContext secondDfa() {
			return getRuleContext(SecondDfaContext.class,0);
		}
		public DfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDfa(this);
		}
	}

	public final DfaContext dfa() throws RecognitionException {
		DfaContext _localctx = new DfaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dfa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			firstDfa();
			setState(12);
			match(INTERSECTION);
			setState(13);
			secondDfa();
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
	public static class FirstDfaContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public FirstDfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstDfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFirstDfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFirstDfa(this);
		}
	}

	public final FirstDfaContext firstDfa() throws RecognitionException {
		FirstDfaContext _localctx = new FirstDfaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_firstDfa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(LPAR);
			setState(16);
			match(T__0);
			setState(17);
			match(RPAR);
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
	public static class SecondDfaContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public SecondDfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondDfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSecondDfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSecondDfa(this);
		}
	}

	public final SecondDfaContext secondDfa() throws RecognitionException {
		SecondDfaContext _localctx = new SecondDfaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_secondDfa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(LPAR);
			setState(20);
			match(T__1);
			setState(21);
			match(RPAR);
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
		"\u0004\u0001\u0006\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000\u0013\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000"+
		"\u0000\u0004\u000f\u0001\u0000\u0000\u0000\u0006\u0013\u0001\u0000\u0000"+
		"\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001"+
		"\u0001\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\r\u0005\u0003"+
		"\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000\u000e\u0003\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0004\u0000\u0000\u0010\u0011\u0005\u0001\u0000"+
		"\u0000\u0011\u0012\u0005\u0005\u0000\u0000\u0012\u0005\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0015\u0005\u0002\u0000"+
		"\u0000\u0015\u0016\u0005\u0005\u0000\u0000\u0016\u0007\u0001\u0000\u0000"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}