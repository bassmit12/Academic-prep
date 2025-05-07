// Generated from c:/Users/bassm/OneDrive/Documenten/GitHub/Academic-prep/automata/ImageToText/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, SPACE=2, PERIOD=3;
	public static final int
		RULE_text = 0, RULE_sentence = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "sentence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "' '", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WORD", "SPACE", "PERIOD"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				sentence();
				}
				}
				setState(7); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ExprParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ExprParser.WORD, i);
		}
		public TerminalNode PERIOD() { return getToken(ExprParser.PERIOD, 0); }
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(WORD);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(10);
				match(SPACE);
				setState(11);
				match(WORD);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(PERIOD);
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
		"\u0004\u0001\u0003\u0014\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\r\b\u0001\n\u0001\f\u0001\u0010"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002"+
		"\u0000\u0000\u0013\u0000\u0005\u0001\u0000\u0000\u0000\u0002\t\u0001\u0000"+
		"\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000"+
		"\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000"+
		"\u0000\t\u000e\u0005\u0001\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000"+
		"\u000b\r\u0005\u0001\u0000\u0000\f\n\u0001\u0000\u0000\u0000\r\u0010\u0001"+
		"\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\u0011\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012\u0003\u0001\u0000"+
		"\u0000\u0000\u0002\u0007\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}