// Generated from d:/AP/Academic-prep/Automata/New/Week 4/3.2.8/MyGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, B=2, NEWLINE=3, WS=4;
	public static final int
		RULE_myStart = 0, RULE_validInput = 1, RULE_invalidInput = 2, RULE_abbRepetition = 3, 
		RULE_aStarbbStar = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "validInput", "invalidInput", "abbRepetition", "aStarbbStar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'a'", "'b'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "B", "NEWLINE", "WS"
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
		public List<ValidInputContext> validInput() {
			return getRuleContexts(ValidInputContext.class);
		}
		public ValidInputContext validInput(int i) {
			return getRuleContext(ValidInputContext.class,i);
		}
		public List<InvalidInputContext> invalidInput() {
			return getRuleContexts(InvalidInputContext.class);
		}
		public InvalidInputContext invalidInput(int i) {
			return getRuleContext(InvalidInputContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
				case B:
					{
					setState(10);
					validInput();
					}
					break;
				case WS:
					{
					setState(11);
					invalidInput();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
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
	public static class ValidInputContext extends ParserRuleContext {
		public AbbRepetitionContext abbRepetition() {
			return getRuleContext(AbbRepetitionContext.class,0);
		}
		public AStarbbStarContext aStarbbStar() {
			return getRuleContext(AStarbbStarContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public ValidInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validInput; }
	}

	public final ValidInputContext validInput() throws RecognitionException {
		ValidInputContext _localctx = new ValidInputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_validInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(19);
				abbRepetition();
				}
				break;
			case 2:
				{
				setState(20);
				aStarbbStar();
				}
				break;
			}
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(23);
				match(NEWLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvalidInputContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyGrammarParser.NEWLINE, i);
		}
		public List<TerminalNode> A() { return getTokens(MyGrammarParser.A); }
		public TerminalNode A(int i) {
			return getToken(MyGrammarParser.A, i);
		}
		public List<TerminalNode> B() { return getTokens(MyGrammarParser.B); }
		public TerminalNode B(int i) {
			return getToken(MyGrammarParser.B, i);
		}
		public InvalidInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidInput; }
	}

	public final InvalidInputContext invalidInput() throws RecognitionException {
		InvalidInputContext _localctx = new InvalidInputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_invalidInput);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(26);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(29); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(31);
				match(NEWLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbbRepetitionContext extends ParserRuleContext {
		public List<TerminalNode> A() { return getTokens(MyGrammarParser.A); }
		public TerminalNode A(int i) {
			return getToken(MyGrammarParser.A, i);
		}
		public List<TerminalNode> B() { return getTokens(MyGrammarParser.B); }
		public TerminalNode B(int i) {
			return getToken(MyGrammarParser.B, i);
		}
		public AbbRepetitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbRepetition; }
	}

	public final AbbRepetitionContext abbRepetition() throws RecognitionException {
		AbbRepetitionContext _localctx = new AbbRepetitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_abbRepetition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					match(A);
					setState(35);
					match(B);
					setState(36);
					match(B);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AStarbbStarContext extends ParserRuleContext {
		public List<TerminalNode> B() { return getTokens(MyGrammarParser.B); }
		public TerminalNode B(int i) {
			return getToken(MyGrammarParser.B, i);
		}
		public List<TerminalNode> A() { return getTokens(MyGrammarParser.A); }
		public TerminalNode A(int i) {
			return getToken(MyGrammarParser.A, i);
		}
		public AStarbbStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aStarbbStar; }
	}

	public final AStarbbStarContext aStarbbStar() throws RecognitionException {
		AStarbbStarContext _localctx = new AStarbbStarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aStarbbStar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==A) {
				{
				{
				setState(41);
				match(A);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(B);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(B);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		"\u0004\u0001\u00047\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0004\u0002\u001c\b"+
		"\u0002\u000b\u0002\f\u0002\u001d\u0001\u0002\u0003\u0002!\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003&\b\u0003\u000b\u0003\f\u0003"+
		"\'\u0001\u0004\u0005\u0004+\b\u0004\n\u0004\f\u0004.\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0001"+
		"\u0003:\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000"+
		"\b,\u0001\u0000\u0000\u0000\n\r\u0003\u0002\u0001\u0000\u000b\r\u0003"+
		"\u0004\u0002\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000"+
		"\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011\u0001\u0000\u0000\u0000"+
		"\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001"+
		"\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0016\u0003\u0006\u0003\u0000"+
		"\u0014\u0016\u0003\b\u0004\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017"+
		"\u0019\u0005\u0003\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\b\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f!\u0005\u0003"+
		"\u0000\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u0005\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005\u0002"+
		"\u0000\u0000$&\u0005\u0002\u0000\u0000%\"\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(\u0007\u0001\u0000\u0000\u0000)+\u0005\u0001\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/3\u0005\u0002\u0000\u000002\u0005\u0002\u0000\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u00004\t\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000\t\f"+
		"\u000e\u0015\u0018\u001d \',3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}