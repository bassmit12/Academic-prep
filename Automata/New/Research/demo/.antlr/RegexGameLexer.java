// Generated from d:/AP/Academic-prep/Automata/New/Research/demo/RegexGame.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RegexGameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHALLENGE_START=1, CHALLENGE_END=2, SOLUTION_START=3, SOLUTION_END=4, 
		DIFFICULTY=5, DESCRIPTION=6, SAMPLES=7, MATCH=8, NONMATCH=9, REGEX=10, 
		EXPLANATION=11, COLON=12, SEMICOLON=13, TEXT=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CHALLENGE_START", "CHALLENGE_END", "SOLUTION_START", "SOLUTION_END", 
			"DIFFICULTY", "DESCRIPTION", "SAMPLES", "MATCH", "NONMATCH", "REGEX", 
			"EXPLANATION", "COLON", "SEMICOLON", "TEXT", "COMMENT", "WS"
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


	public RegexGameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegexGame.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u00b4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009c"+
		"\b\r\n\r\f\r\u009f\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00af\b\u000f\u000b\u000f\f"+
		"\u000f\u00b0\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\u0003\u0004\u0000\n\n\r\r\"\"\\\\\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\n\r\r  \u00b7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000"+
		"\u0005:\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000\tQ\u0001"+
		"\u0000\u0000\u0000\u000b\\\u0001\u0000\u0000\u0000\rh\u0001\u0000\u0000"+
		"\u0000\u000fp\u0001\u0000\u0000\u0000\u0011w\u0001\u0000\u0000\u0000\u0013"+
		"\u0081\u0001\u0000\u0000\u0000\u0015\u0087\u0001\u0000\u0000\u0000\u0017"+
		"\u0093\u0001\u0000\u0000\u0000\u0019\u0095\u0001\u0000\u0000\u0000\u001b"+
		"\u0097\u0001\u0000\u0000\u0000\u001d\u00a2\u0001\u0000\u0000\u0000\u001f"+
		"\u00ae\u0001\u0000\u0000\u0000!\"\u0005C\u0000\u0000\"#\u0005H\u0000\u0000"+
		"#$\u0005A\u0000\u0000$%\u0005L\u0000\u0000%&\u0005L\u0000\u0000&\'\u0005"+
		"E\u0000\u0000\'(\u0005N\u0000\u0000()\u0005G\u0000\u0000)*\u0005E\u0000"+
		"\u0000*+\u0005:\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005E\u0000"+
		"\u0000-.\u0005N\u0000\u0000./\u0005D\u0000\u0000/0\u0005_\u0000\u0000"+
		"01\u0005C\u0000\u000012\u0005H\u0000\u000023\u0005A\u0000\u000034\u0005"+
		"L\u0000\u000045\u0005L\u0000\u000056\u0005E\u0000\u000067\u0005N\u0000"+
		"\u000078\u0005G\u0000\u000089\u0005E\u0000\u00009\u0004\u0001\u0000\u0000"+
		"\u0000:;\u0005S\u0000\u0000;<\u0005O\u0000\u0000<=\u0005L\u0000\u0000"+
		"=>\u0005U\u0000\u0000>?\u0005T\u0000\u0000?@\u0005I\u0000\u0000@A\u0005"+
		"O\u0000\u0000AB\u0005N\u0000\u0000BC\u0005:\u0000\u0000C\u0006\u0001\u0000"+
		"\u0000\u0000DE\u0005E\u0000\u0000EF\u0005N\u0000\u0000FG\u0005D\u0000"+
		"\u0000GH\u0005_\u0000\u0000HI\u0005S\u0000\u0000IJ\u0005O\u0000\u0000"+
		"JK\u0005L\u0000\u0000KL\u0005U\u0000\u0000LM\u0005T\u0000\u0000MN\u0005"+
		"I\u0000\u0000NO\u0005O\u0000\u0000OP\u0005N\u0000\u0000P\b\u0001\u0000"+
		"\u0000\u0000QR\u0005D\u0000\u0000RS\u0005i\u0000\u0000ST\u0005f\u0000"+
		"\u0000TU\u0005f\u0000\u0000UV\u0005i\u0000\u0000VW\u0005c\u0000\u0000"+
		"WX\u0005u\u0000\u0000XY\u0005l\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005"+
		"y\u0000\u0000[\n\u0001\u0000\u0000\u0000\\]\u0005D\u0000\u0000]^\u0005"+
		"e\u0000\u0000^_\u0005s\u0000\u0000_`\u0005c\u0000\u0000`a\u0005r\u0000"+
		"\u0000ab\u0005i\u0000\u0000bc\u0005p\u0000\u0000cd\u0005t\u0000\u0000"+
		"de\u0005i\u0000\u0000ef\u0005o\u0000\u0000fg\u0005n\u0000\u0000g\f\u0001"+
		"\u0000\u0000\u0000hi\u0005S\u0000\u0000ij\u0005a\u0000\u0000jk\u0005m"+
		"\u0000\u0000kl\u0005p\u0000\u0000lm\u0005l\u0000\u0000mn\u0005e\u0000"+
		"\u0000no\u0005s\u0000\u0000o\u000e\u0001\u0000\u0000\u0000pq\u0005M\u0000"+
		"\u0000qr\u0005a\u0000\u0000rs\u0005t\u0000\u0000st\u0005c\u0000\u0000"+
		"tu\u0005h\u0000\u0000uv\u0005:\u0000\u0000v\u0010\u0001\u0000\u0000\u0000"+
		"wx\u0005N\u0000\u0000xy\u0005o\u0000\u0000yz\u0005n\u0000\u0000z{\u0005"+
		"M\u0000\u0000{|\u0005a\u0000\u0000|}\u0005t\u0000\u0000}~\u0005c\u0000"+
		"\u0000~\u007f\u0005h\u0000\u0000\u007f\u0080\u0005:\u0000\u0000\u0080"+
		"\u0012\u0001\u0000\u0000\u0000\u0081\u0082\u0005R\u0000\u0000\u0082\u0083"+
		"\u0005e\u0000\u0000\u0083\u0084\u0005g\u0000\u0000\u0084\u0085\u0005e"+
		"\u0000\u0000\u0085\u0086\u0005x\u0000\u0000\u0086\u0014\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005E\u0000\u0000\u0088\u0089\u0005x\u0000\u0000\u0089"+
		"\u008a\u0005p\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b\u008c\u0005"+
		"a\u0000\u0000\u008c\u008d\u0005n\u0000\u0000\u008d\u008e\u0005a\u0000"+
		"\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090"+
		"\u0091\u0005o\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u0092\u0016\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005:\u0000\u0000\u0094\u0018\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005;\u0000\u0000\u0096\u001a\u0001\u0000\u0000"+
		"\u0000\u0097\u009d\u0005\"\u0000\u0000\u0098\u009c\b\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\\\u0000\u0000\u009a\u009c\t\u0000\u0000\u0000\u009b"+
		"\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\"\u0000\u0000\u00a1\u001c"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005/\u0000\u0000\u00a3\u00a4\u0005"+
		"/\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a7\b\u0001"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0006\u000e\u0000\u0000\u00ac\u001e\u0001\u0000"+
		"\u0000\u0000\u00ad\u00af\u0007\u0002\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0006\u000f\u0000\u0000\u00b3 \u0001\u0000\u0000"+
		"\u0000\u0005\u0000\u009b\u009d\u00a8\u00b0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}