// Generated from d:/AP/Academic-prep/Automata/New/Research/demo/RegexGame.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RegexGameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHALLENGE_START=1, CHALLENGE_END=2, SOLUTION_START=3, SOLUTION_END=4, 
		DIFFICULTY=5, DESCRIPTION=6, SAMPLES=7, MATCH=8, NONMATCH=9, REGEX=10, 
		EXPLANATION=11, COLON=12, SEMICOLON=13, TEXT=14, COMMENT=15, WS=16;
	public static final int
		RULE_gameStart = 0, RULE_challenge = 1, RULE_solution = 2, RULE_difficulty = 3, 
		RULE_description = 4, RULE_samples = 5, RULE_sampleItem = 6, RULE_match = 7, 
		RULE_nonMatch = 8, RULE_regex = 9, RULE_explanation = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"gameStart", "challenge", "solution", "difficulty", "description", "samples", 
			"sampleItem", "match", "nonMatch", "regex", "explanation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CHALLENGE:'", "'END_CHALLENGE'", "'SOLUTION:'", "'END_SOLUTION'", 
			"'Difficulty'", "'Description'", "'Samples'", "'Match:'", "'NonMatch:'", 
			"'Regex'", "'Explanation'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHALLENGE_START", "CHALLENGE_END", "SOLUTION_START", "SOLUTION_END", 
			"DIFFICULTY", "DESCRIPTION", "SAMPLES", "MATCH", "NONMATCH", "REGEX", 
			"EXPLANATION", "COLON", "SEMICOLON", "TEXT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "RegexGame.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegexGameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GameStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RegexGameParser.EOF, 0); }
		public List<ChallengeContext> challenge() {
			return getRuleContexts(ChallengeContext.class);
		}
		public ChallengeContext challenge(int i) {
			return getRuleContext(ChallengeContext.class,i);
		}
		public List<SolutionContext> solution() {
			return getRuleContexts(SolutionContext.class);
		}
		public SolutionContext solution(int i) {
			return getRuleContext(SolutionContext.class,i);
		}
		public GameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameStart; }
	}

	public final GameStartContext gameStart() throws RecognitionException {
		GameStartContext _localctx = new GameStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gameStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHALLENGE_START:
					{
					setState(22);
					challenge();
					}
					break;
				case SOLUTION_START:
					{
					setState(23);
					solution();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHALLENGE_START || _la==SOLUTION_START );
			setState(28);
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
	public static class ChallengeContext extends ParserRuleContext {
		public TerminalNode CHALLENGE_START() { return getToken(RegexGameParser.CHALLENGE_START, 0); }
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public SamplesContext samples() {
			return getRuleContext(SamplesContext.class,0);
		}
		public TerminalNode CHALLENGE_END() { return getToken(RegexGameParser.CHALLENGE_END, 0); }
		public ChallengeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_challenge; }
	}

	public final ChallengeContext challenge() throws RecognitionException {
		ChallengeContext _localctx = new ChallengeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_challenge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(CHALLENGE_START);
			setState(31);
			difficulty();
			setState(32);
			description();
			setState(33);
			samples();
			setState(34);
			match(CHALLENGE_END);
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
	public static class SolutionContext extends ParserRuleContext {
		public TerminalNode SOLUTION_START() { return getToken(RegexGameParser.SOLUTION_START, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public ExplanationContext explanation() {
			return getRuleContext(ExplanationContext.class,0);
		}
		public TerminalNode SOLUTION_END() { return getToken(RegexGameParser.SOLUTION_END, 0); }
		public SolutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solution; }
	}

	public final SolutionContext solution() throws RecognitionException {
		SolutionContext _localctx = new SolutionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(SOLUTION_START);
			setState(37);
			regex();
			setState(38);
			explanation();
			setState(39);
			match(SOLUTION_END);
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
	public static class DifficultyContext extends ParserRuleContext {
		public TerminalNode DIFFICULTY() { return getToken(RegexGameParser.DIFFICULTY, 0); }
		public TerminalNode COLON() { return getToken(RegexGameParser.COLON, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public DifficultyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difficulty; }
	}

	public final DifficultyContext difficulty() throws RecognitionException {
		DifficultyContext _localctx = new DifficultyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_difficulty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(DIFFICULTY);
			setState(42);
			match(COLON);
			setState(43);
			match(TEXT);
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
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(RegexGameParser.DESCRIPTION, 0); }
		public TerminalNode COLON() { return getToken(RegexGameParser.COLON, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(DESCRIPTION);
			setState(46);
			match(COLON);
			setState(47);
			match(TEXT);
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
	public static class SamplesContext extends ParserRuleContext {
		public TerminalNode SAMPLES() { return getToken(RegexGameParser.SAMPLES, 0); }
		public TerminalNode COLON() { return getToken(RegexGameParser.COLON, 0); }
		public List<SampleItemContext> sampleItem() {
			return getRuleContexts(SampleItemContext.class);
		}
		public SampleItemContext sampleItem(int i) {
			return getRuleContext(SampleItemContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RegexGameParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RegexGameParser.SEMICOLON, i);
		}
		public SamplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samples; }
	}

	public final SamplesContext samples() throws RecognitionException {
		SamplesContext _localctx = new SamplesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_samples);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SAMPLES);
			setState(50);
			match(COLON);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					sampleItem();
					setState(52);
					match(SEMICOLON);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(59);
			sampleItem();
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
	public static class SampleItemContext extends ParserRuleContext {
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public NonMatchContext nonMatch() {
			return getRuleContext(NonMatchContext.class,0);
		}
		public SampleItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleItem; }
	}

	public final SampleItemContext sampleItem() throws RecognitionException {
		SampleItemContext _localctx = new SampleItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sampleItem);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match();
				}
				break;
			case NONMATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				nonMatch();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(RegexGameParser.MATCH, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(MATCH);
			setState(66);
			match(TEXT);
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
	public static class NonMatchContext extends ParserRuleContext {
		public TerminalNode NONMATCH() { return getToken(RegexGameParser.NONMATCH, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public NonMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonMatch; }
	}

	public final NonMatchContext nonMatch() throws RecognitionException {
		NonMatchContext _localctx = new NonMatchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(NONMATCH);
			setState(69);
			match(TEXT);
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
	public static class RegexContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(RegexGameParser.REGEX, 0); }
		public TerminalNode COLON() { return getToken(RegexGameParser.COLON, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(REGEX);
			setState(72);
			match(COLON);
			setState(73);
			match(TEXT);
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
	public static class ExplanationContext extends ParserRuleContext {
		public TerminalNode EXPLANATION() { return getToken(RegexGameParser.EXPLANATION, 0); }
		public TerminalNode COLON() { return getToken(RegexGameParser.COLON, 0); }
		public TerminalNode TEXT() { return getToken(RegexGameParser.TEXT, 0); }
		public ExplanationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explanation; }
	}

	public final ExplanationContext explanation() throws RecognitionException {
		ExplanationContext _localctx = new ExplanationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_explanation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(EXPLANATION);
			setState(76);
			match(COLON);
			setState(77);
			match(TEXT);
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
		"\u0004\u0001\u0010P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0019\b\u0000\u000b\u0000\f\u0000\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u00057\b\u0005\n\u0005\f\u0005:\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006@\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000H\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000"+
		"\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n1\u0001"+
		"\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000"+
		"\u0000\u0010D\u0001\u0000\u0000\u0000\u0012G\u0001\u0000\u0000\u0000\u0014"+
		"K\u0001\u0000\u0000\u0000\u0016\u0019\u0003\u0002\u0001\u0000\u0017\u0019"+
		"\u0003\u0004\u0002\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003"+
		"\u0006\u0003\u0000 !\u0003\b\u0004\u0000!\"\u0003\n\u0005\u0000\"#\u0005"+
		"\u0002\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000"+
		"\u0000%&\u0003\u0012\t\u0000&\'\u0003\u0014\n\u0000\'(\u0005\u0004\u0000"+
		"\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000*+\u0005"+
		"\f\u0000\u0000+,\u0005\u000e\u0000\u0000,\u0007\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0006\u0000\u0000./\u0005\f\u0000\u0000/0\u0005\u000e\u0000\u0000"+
		"0\t\u0001\u0000\u0000\u000012\u0005\u0007\u0000\u000028\u0005\f\u0000"+
		"\u000034\u0003\f\u0006\u000045\u0005\r\u0000\u000057\u0001\u0000\u0000"+
		"\u000063\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0003\f\u0006\u0000<\u000b\u0001\u0000\u0000\u0000"+
		"=@\u0003\u000e\u0007\u0000>@\u0003\u0010\b\u0000?=\u0001\u0000\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@\r\u0001\u0000\u0000\u0000AB\u0005\b\u0000"+
		"\u0000BC\u0005\u000e\u0000\u0000C\u000f\u0001\u0000\u0000\u0000DE\u0005"+
		"\t\u0000\u0000EF\u0005\u000e\u0000\u0000F\u0011\u0001\u0000\u0000\u0000"+
		"GH\u0005\n\u0000\u0000HI\u0005\f\u0000\u0000IJ\u0005\u000e\u0000\u0000"+
		"J\u0013\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000\u0000LM\u0005\f\u0000"+
		"\u0000MN\u0005\u000e\u0000\u0000N\u0015\u0001\u0000\u0000\u0000\u0004"+
		"\u0018\u001a8?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}