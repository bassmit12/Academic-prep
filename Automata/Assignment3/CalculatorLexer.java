// Generated from Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, ID=8, WS=9, PLUS=10, 
		MINUS=11, MULT=12, DIV=13, ASSIGN=14, LPAREN=15, RPAREN=16, SEMI=17, PRINT=18, 
		IF=19, ELSE=20, WHILE=21, TRUE=22, FALSE=23, AND=24, OR=25, NOT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NUM", "ID", "WS", "PLUS", 
			"MINUS", "MULT", "DIV", "ASSIGN", "LPAREN", "RPAREN", "SEMI", "PRINT", 
			"IF", "ELSE", "WHILE", "TRUE", "FALSE", "AND", "OR", "NOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "','", "'<'", "'>'", "'=='", "'!='", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "';'", "'print'", 
			"'if'", "'else'", "'while'", "'true'", "'false'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "ID", "WS", "PLUS", 
			"MINUS", "MULT", "DIV", "ASSIGN", "LPAREN", "RPAREN", "SEMI", "PRINT", 
			"IF", "ELSE", "WHILE", "TRUE", "FALSE", "AND", "OR", "NOT"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u001a\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006L\b\u0006\u000b\u0006\f\u0006M\u0001"+
		"\u0007\u0004\u0007Q\b\u0007\u000b\u0007\f\u0007R\u0001\b\u0004\bV\b\b"+
		"\u000b\b\f\bW\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0003\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0094\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015"+
		"\u0001\u0000\u0000\u0000\u0003>\u0001\u0000\u0000\u0000\u0005@\u0001\u0000"+
		"\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fP\u0001"+
		"\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000"+
		"\u0000\u0015]\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019"+
		"a\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001de\u0001"+
		"\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000!i\u0001\u0000\u0000"+
		"\u0000#k\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000\u0000\'t\u0001\u0000"+
		"\u0000\u0000)y\u0001\u0000\u0000\u0000+\u007f\u0001\u0000\u0000\u0000"+
		"-\u0084\u0001\u0000\u0000\u0000/\u008a\u0001\u0000\u0000\u00001\u008d"+
		"\u0001\u0000\u0000\u00003\u0090\u0001\u0000\u0000\u000056\u0005f\u0000"+
		"\u000067\u0005u\u0000\u000078\u0005n\u0000\u000089\u0005c\u0000\u0000"+
		"9:\u0005t\u0000\u0000:;\u0005i\u0000\u0000;<\u0005o\u0000\u0000<=\u0005"+
		"n\u0000\u0000=\u0002\u0001\u0000\u0000\u0000>?\u0005,\u0000\u0000?\u0004"+
		"\u0001\u0000\u0000\u0000@A\u0005<\u0000\u0000A\u0006\u0001\u0000\u0000"+
		"\u0000BC\u0005>\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005=\u0000"+
		"\u0000EF\u0005=\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005!\u0000"+
		"\u0000HI\u0005=\u0000\u0000I\f\u0001\u0000\u0000\u0000JL\u0007\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000e\u0001\u0000\u0000\u0000"+
		"OQ\u0007\u0001\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0010\u0001"+
		"\u0000\u0000\u0000TV\u0007\u0002\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\b\u0000\u0000Z\u0012\u0001\u0000"+
		"\u0000\u0000[\\\u0005+\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005"+
		"-\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005*\u0000\u0000`\u0018"+
		"\u0001\u0000\u0000\u0000ab\u0005/\u0000\u0000b\u001a\u0001\u0000\u0000"+
		"\u0000cd\u0005=\u0000\u0000d\u001c\u0001\u0000\u0000\u0000ef\u0005(\u0000"+
		"\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005)\u0000\u0000h \u0001\u0000"+
		"\u0000\u0000ij\u0005;\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005p"+
		"\u0000\u0000lm\u0005r\u0000\u0000mn\u0005i\u0000\u0000no\u0005n\u0000"+
		"\u0000op\u0005t\u0000\u0000p$\u0001\u0000\u0000\u0000qr\u0005i\u0000\u0000"+
		"rs\u0005f\u0000\u0000s&\u0001\u0000\u0000\u0000tu\u0005e\u0000\u0000u"+
		"v\u0005l\u0000\u0000vw\u0005s\u0000\u0000wx\u0005e\u0000\u0000x(\u0001"+
		"\u0000\u0000\u0000yz\u0005w\u0000\u0000z{\u0005h\u0000\u0000{|\u0005i"+
		"\u0000\u0000|}\u0005l\u0000\u0000}~\u0005e\u0000\u0000~*\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005t\u0000\u0000\u0080\u0081\u0005r\u0000\u0000\u0081"+
		"\u0082\u0005u\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083,\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005f\u0000\u0000\u0085\u0086\u0005a\u0000"+
		"\u0000\u0086\u0087\u0005l\u0000\u0000\u0087\u0088\u0005s\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089.\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"&\u0000\u0000\u008b\u008c\u0005&\u0000\u0000\u008c0\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005|\u0000\u0000\u008e\u008f\u0005|\u0000\u0000\u008f"+
		"2\u0001\u0000\u0000\u0000\u0090\u0091\u0005!\u0000\u0000\u00914\u0001"+
		"\u0000\u0000\u0000\u0004\u0000MRW\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}