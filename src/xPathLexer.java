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
		T__9=10, T__10=11, T__11=12, T__12=13, NAME=14, STAR=15, DOT=16, PARENT=17, 
		TEXT=18, AT=19, AND=20, OR=21, NOT=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "NAME", "STAR", "DOT", "PARENT", "TEXT", 
		"AT", "AND", "OR", "NOT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'('", "'\"'", "')'", "'/'", "'//'", "'['", "']'", "','", 
		"'='", "'eq'", "'=='", "'is'", null, "'*'", "'.'", "'..'", "'text()'", 
		"'@'", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NAME", "STAR", "DOT", "PARENT", "TEXT", "AT", "AND", "OR", 
		"NOT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\6\17S\n\17"+
		"\r\17\16\17T\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\6\30s\n\30\r\30\16\30t\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\3\2\4\6\2\62;C\\aac|\4\2\13\f\17\17y\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17@\3\2"+
		"\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33N\3"+
		"\2\2\2\35R\3\2\2\2\37V\3\2\2\2!X\3\2\2\2#Z\3\2\2\2%]\3\2\2\2\'d\3\2\2"+
		"\2)f\3\2\2\2+j\3\2\2\2-m\3\2\2\2/r\3\2\2\2\61\62\7f\2\2\62\63\7q\2\2\63"+
		"\64\7e\2\2\64\4\3\2\2\2\65\66\7*\2\2\66\6\3\2\2\2\678\7$\2\28\b\3\2\2"+
		"\29:\7+\2\2:\n\3\2\2\2;<\7\61\2\2<\f\3\2\2\2=>\7\61\2\2>?\7\61\2\2?\16"+
		"\3\2\2\2@A\7]\2\2A\20\3\2\2\2BC\7_\2\2C\22\3\2\2\2DE\7.\2\2E\24\3\2\2"+
		"\2FG\7?\2\2G\26\3\2\2\2HI\7g\2\2IJ\7s\2\2J\30\3\2\2\2KL\7?\2\2LM\7?\2"+
		"\2M\32\3\2\2\2NO\7k\2\2OP\7u\2\2P\34\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2U\36\3\2\2\2VW\7,\2\2W \3\2\2\2XY\7\60\2\2Y\""+
		"\3\2\2\2Z[\7\60\2\2[\\\7\60\2\2\\$\3\2\2\2]^\7v\2\2^_\7g\2\2_`\7z\2\2"+
		"`a\7v\2\2ab\7*\2\2bc\7+\2\2c&\3\2\2\2de\7B\2\2e(\3\2\2\2fg\7c\2\2gh\7"+
		"p\2\2hi\7f\2\2i*\3\2\2\2jk\7q\2\2kl\7t\2\2l,\3\2\2\2mn\7p\2\2no\7q\2\2"+
		"op\7v\2\2p.\3\2\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"uv\3\2\2\2vw\b\30\2\2w\60\3\2\2\2\5\2Tt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}