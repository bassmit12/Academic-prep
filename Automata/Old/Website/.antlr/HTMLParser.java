// Generated from d:/AP/Academic-prep/Automata/Website/HTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TAG_OPEN=4, TAG_CLOSE=5, TAG_OPEN_SLASH=6, TAG_SLASH_CLOSE=7, 
		ATTRIBUTE_NAME=8, ATTRIBUTE_VALUE=9, TAG_NAME=10, TEXT=11, WS=12;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_content = 2, RULE_script = 3, 
		RULE_style = 4, RULE_attribute = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "content", "script", "style", "attribute"
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

	@Override
	public String getGrammarFileName() { return "HTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(12);
				element();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	public static class ElementContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(HTMLParser.TAG_OPEN_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				script();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				style();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(TAG_OPEN);
				setState(23);
				match(TAG_NAME);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTRIBUTE_NAME) {
					{
					{
					setState(24);
					attribute();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				match(TAG_CLOSE);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_OPEN || _la==TEXT) {
					{
					{
					setState(31);
					content();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(TAG_OPEN_SLASH);
				setState(38);
				match(TAG_NAME);
				setState(39);
				match(TAG_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(TAG_OPEN);
				setState(41);
				match(TAG_NAME);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTRIBUTE_NAME) {
					{
					{
					setState(42);
					attribute();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(TAG_SLASH_CLOSE);
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
	public static class ContentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(HTMLParser.TEXT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				element();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(TEXT);
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
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(HTMLParser.TAG_OPEN_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(TAG_OPEN);
			setState(56);
			match(T__0);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE_NAME) {
				{
				{
				setState(57);
				attribute();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(TAG_CLOSE);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(64);
					matchWildcard();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(70);
			match(TAG_OPEN_SLASH);
			setState(71);
			match(T__0);
			setState(72);
			match(TAG_CLOSE);
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
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(HTMLParser.TAG_OPEN_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_style);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TAG_OPEN);
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE_NAME) {
				{
				{
				setState(76);
				attribute();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(TAG_CLOSE);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(83);
					matchWildcard();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(89);
			match(TAG_OPEN_SLASH);
			setState(90);
			match(T__1);
			setState(91);
			match(TAG_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_NAME() { return getToken(HTMLParser.ATTRIBUTE_NAME, 0); }
		public TerminalNode ATTRIBUTE_VALUE() { return getToken(HTMLParser.ATTRIBUTE_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ATTRIBUTE_NAME);
			setState(94);
			match(T__2);
			setState(95);
			match(ATTRIBUTE_VALUE);
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
		"\u0004\u0001\fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001"+
		"$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001"+
		"\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0002CV\u0000\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0000g\u0000\u000f\u0001\u0000\u0000\u0000\u00021\u0001\u0000"+
		"\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000"+
		"\bJ\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000"+
		"\u00142\u0003\u0006\u0003\u0000\u00152\u0003\b\u0004\u0000\u0016\u0017"+
		"\u0005\u0004\u0000\u0000\u0017\u001b\u0005\n\u0000\u0000\u0018\u001a\u0003"+
		"\n\u0005\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\"\u0005\u0005\u0000\u0000\u001f!\u0003\u0004\u0002"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0005\n\u0000"+
		"\u0000\'2\u0005\u0005\u0000\u0000()\u0005\u0004\u0000\u0000)-\u0005\n"+
		"\u0000\u0000*,\u0003\n\u0005\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000002\u0005\u0007\u0000\u0000"+
		"1\u0014\u0001\u0000\u0000\u00001\u0015\u0001\u0000\u0000\u00001\u0016"+
		"\u0001\u0000\u0000\u00001(\u0001\u0000\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000036\u0003\u0002\u0001\u000046\u0005\u000b\u0000\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0005\u0004\u0000\u00008<\u0005\u0001\u0000\u00009;\u0003\n\u0005"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?C\u0005\u0005\u0000\u0000@B\t\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0006\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u0005"+
		"\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000"+
		"KO\u0005\u0002\u0000\u0000LN\u0003\n\u0005\u0000ML\u0001\u0000\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RV\u0005\u0005"+
		"\u0000\u0000SU\t\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000"+
		"Z[\u0005\u0002\u0000\u0000[\\\u0005\u0005\u0000\u0000\\\t\u0001\u0000"+
		"\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0005\t"+
		"\u0000\u0000`\u000b\u0001\u0000\u0000\u0000\n\u000f\u001b\"-15<COV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}