// Generated from xPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NAME=13, STAR=14, DOT=15, PARENT=16, TEXT=17, 
		AT=18, AND=19, OR=20, NOT=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "NAME", "STAR", "DOT", "PARENT", "TEXT", "AT", 
		"AND", "OR", "NOT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'='", 
		"'eq'", "'=='", "'is'", null, "'*'", "'.'", "'..'", "'text()'", "'@'", 
		"'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NAME", "STAR", "DOT", "PARENT", "TEXT", "AT", "AND", "OR", "NOT", 
		"WS"
	};
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


	public xPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16O\n\16\r\16\16\16P\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27o"+
		"\n\27\r\27\16\27p\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3"+
		"\2\2\2\139\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D"+
		"\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33N\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!"+
		"V\3\2\2\2#Y\3\2\2\2%`\3\2\2\2\'b\3\2\2\2)f\3\2\2\2+i\3\2\2\2-n\3\2\2\2"+
		"/\60\7f\2\2\60\61\7q\2\2\61\62\7e\2\2\62\4\3\2\2\2\63\64\7*\2\2\64\6\3"+
		"\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7\61\2\28\n\3\2\2\29:\7\61\2\2:;"+
		"\7\61\2\2;\f\3\2\2\2<=\7]\2\2=\16\3\2\2\2>?\7_\2\2?\20\3\2\2\2@A\7.\2"+
		"\2A\22\3\2\2\2BC\7?\2\2C\24\3\2\2\2DE\7g\2\2EF\7s\2\2F\26\3\2\2\2GH\7"+
		"?\2\2HI\7?\2\2I\30\3\2\2\2JK\7k\2\2KL\7u\2\2L\32\3\2\2\2MO\t\2\2\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\34\3\2\2\2RS\7,\2\2S\36\3\2\2\2"+
		"TU\7\60\2\2U \3\2\2\2VW\7\60\2\2WX\7\60\2\2X\"\3\2\2\2YZ\7v\2\2Z[\7g\2"+
		"\2[\\\7z\2\2\\]\7v\2\2]^\7*\2\2^_\7+\2\2_$\3\2\2\2`a\7B\2\2a&\3\2\2\2"+
		"bc\7c\2\2cd\7p\2\2de\7f\2\2e(\3\2\2\2fg\7q\2\2gh\7t\2\2h*\3\2\2\2ij\7"+
		"p\2\2jk\7q\2\2kl\7v\2\2l,\3\2\2\2mo\t\3\2\2nm\3\2\2\2op\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2qr\3\2\2\2rs\b\27\2\2s.\3\2\2\2\5\2Pp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}