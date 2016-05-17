package antlr;

// Generated from grammaire.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammaireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CONST=20, CALL=21, TYPES=22, AFFECT=23, INT=24, BOOLEAN=25, 
		WS=26, F=27, IF=28, THEN=29, ELSE=30, WHILE=31, DO=32, ID=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "CONST", "CALL", "TYPES", "AFFECT", "INT", "BOOLEAN", 
		"WS", "F", "IF", "THEN", "ELSE", "WHILE", "DO", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'('", "')'", "':'", "'skip'", "';'", "'-'", "'not'", "'+'", 
		"'x'", "'/'", "'and'", "'or'", "'<'", "'<='", "'='", "'!='", "'>='", "'>'", 
		null, null, null, "':='", null, null, null, "'f'", "'if'", "'then'", "'else'", 
		"'while'", "'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CONST", "CALL", "TYPES", 
		"AFFECT", "INT", "BOOLEAN", "WS", "F", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "ID"
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


	public grammaireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammaire.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25{\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0086\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0096\n\27\3\30\3\30\3\30\3\31"+
		"\6\31\u009c\n\31\r\31\16\31\u009d\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u00a9\n\32\3\33\6\33\u00ac\n\33\r\33\16\33\u00ad\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\6\"\u00cb\n\"\r\"\16\"\u00cc\2"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\u00d4\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5I\3\2\2\2\7K\3"+
		"\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23\\"+
		"\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33f\3\2\2\2\35i\3\2\2\2\37"+
		"k\3\2\2\2!n\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+\u0085\3"+
		"\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63\u00a8\3\2\2\2"+
		"\65\u00ab\3\2\2\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00bb"+
		"\3\2\2\2?\u00c0\3\2\2\2A\u00c6\3\2\2\2C\u00ca\3\2\2\2EF\7x\2\2FG\7c\2"+
		"\2GH\7t\2\2H\4\3\2\2\2IJ\7*\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2MN\7<\2"+
		"\2N\n\3\2\2\2OP\7u\2\2PQ\7m\2\2QR\7k\2\2RS\7r\2\2S\f\3\2\2\2TU\7=\2\2"+
		"U\16\3\2\2\2VW\7/\2\2W\20\3\2\2\2XY\7p\2\2YZ\7q\2\2Z[\7v\2\2[\22\3\2\2"+
		"\2\\]\7-\2\2]\24\3\2\2\2^_\7z\2\2_\26\3\2\2\2`a\7\61\2\2a\30\3\2\2\2b"+
		"c\7c\2\2cd\7p\2\2de\7f\2\2e\32\3\2\2\2fg\7q\2\2gh\7t\2\2h\34\3\2\2\2i"+
		"j\7>\2\2j\36\3\2\2\2kl\7>\2\2lm\7?\2\2m \3\2\2\2no\7?\2\2o\"\3\2\2\2p"+
		"q\7#\2\2qr\7?\2\2r$\3\2\2\2st\7@\2\2tu\7?\2\2u&\3\2\2\2vw\7@\2\2w(\3\2"+
		"\2\2x{\5\61\31\2y{\5\63\32\2zx\3\2\2\2zy\3\2\2\2{*\3\2\2\2|}\7t\2\2}~"+
		"\7g\2\2~\177\7c\2\2\177\u0086\7f\2\2\u0080\u0081\7y\2\2\u0081\u0082\7"+
		"t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084\u0086\7g\2\2\u0085|"+
		"\3\2\2\2\u0085\u0080\3\2\2\2\u0086,\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7i\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u0096\7t\2\2\u008e\u008f\7d\2\2\u008f\u0090\7q\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0096\7p\2\2\u0095\u0087\3\2\2\2\u0095\u008e\3\2\2\2\u0096"+
		".\3\2\2\2\u0097\u0098\7<\2\2\u0098\u0099\7?\2\2\u0099\60\3\2\2\2\u009a"+
		"\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\62\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2"+
		"\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\64\3\2\2\2\u00aa\u00ac"+
		"\t\3\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\33\2\2\u00b0\66\3\2\2"+
		"\2\u00b1\u00b2\7h\2\2\u00b28\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7"+
		"h\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7p\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf>\3\2\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"B\3\2\2\2\u00c9\u00cb\t\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdD\3\2\2\2\n\2z\u0085\u0095"+
		"\u009d\u00a8\u00ad\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}