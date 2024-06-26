// Generated from d:/AP/Academic-prep/Automata/Website/HTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TAG_OPEN=4, TAG_CLOSE=5, TAG_OPEN_SLASH=6, TAG_SLASH_CLOSE=7, 
		ATTRIBUTE_NAME=8, ATTRIBUTE_VALUE=9, TAG_NAME=10, TEXT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SLASH", "TAG_SLASH_CLOSE", 
			"ATTRIBUTE_NAME", "ATTRIBUTE_VALUE", "TAG_NAME", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'script'", "'style'", "'='", "'<'", "'>'", "'</'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SLASH", "TAG_SLASH_CLOSE", 
			"ATTRIBUTE_NAME", "ATTRIBUTE_VALUE", "TAG_NAME", "TEXT", "WS"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTML.g4"; }

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
		"\u0004\u0000\f^\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u00075\b\u0007"+
		"\n\u0007\f\u00078\t\u0007\u0001\b\u0001\b\u0005\b<\b\b\n\b\f\b?\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bD\b\b\n\b\f\bG\t\b\u0001\b\u0003\bJ\b\b\u0001"+
		"\t\u0001\t\u0005\tN\b\t\n\t\f\tQ\t\t\u0001\n\u0004\nT\b\n\u000b\n\f\n"+
		"U\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b\f\u000bZ\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\u0006\u0004\u0000::AZ__az\u0005\u0000-.0:AZ__az\u0001\u0000"+
		"\"\"\u0001\u0000\'\'\u0001\u0000<<\u0003\u0000\t\n\r\r  d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000"+
		"\u0007(\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b,\u0001"+
		"\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f2\u0001\u0000\u0000"+
		"\u0000\u0011I\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015"+
		"S\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"s\u0000\u0000\u001a\u001b\u0005c\u0000\u0000\u001b\u001c\u0005r\u0000"+
		"\u0000\u001c\u001d\u0005i\u0000\u0000\u001d\u001e\u0005p\u0000\u0000\u001e"+
		"\u001f\u0005t\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !\u0005"+
		"s\u0000\u0000!\"\u0005t\u0000\u0000\"#\u0005y\u0000\u0000#$\u0005l\u0000"+
		"\u0000$%\u0005e\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005=\u0000"+
		"\u0000\'\u0006\u0001\u0000\u0000\u0000()\u0005<\u0000\u0000)\b\u0001\u0000"+
		"\u0000\u0000*+\u0005>\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005<"+
		"\u0000\u0000-.\u0005/\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005/"+
		"\u0000\u000001\u0005>\u0000\u00001\u000e\u0001\u0000\u0000\u000026\u0007"+
		"\u0000\u0000\u000035\u0007\u0001\u0000\u000043\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007\u0010\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009=\u0005"+
		"\"\u0000\u0000:<\b\u0002\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@J\u0005\"\u0000\u0000"+
		"AE\u0005\'\u0000\u0000BD\b\u0003\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0005\'\u0000"+
		"\u0000I9\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000J\u0012\u0001"+
		"\u0000\u0000\u0000KO\u0007\u0000\u0000\u0000LN\u0007\u0001\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0014\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RT\b\u0004\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u0016\u0001\u0000\u0000\u0000WY\u0007\u0005\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0006\u000b\u0000\u0000"+
		"]\u0018\u0001\u0000\u0000\u0000\b\u00006=EIOUZ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}