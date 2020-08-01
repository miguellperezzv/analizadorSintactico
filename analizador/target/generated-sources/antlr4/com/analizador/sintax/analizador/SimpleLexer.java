// Generated from Simple.g4 by ANTLR 4.4
package com.analizador.sintax.analizador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, INSERT=3, VALUES=4, FROM=5, INTO=6, CREATE=7, PROCEDURE=8, 
		ALL=9, WHERE=10, AS=11, GO=12, LENGUAJE=13, SQL=14, AND=15, OR=16, NOT=17, 
		LIKE=18, IGUAL=19, MENORQUE=20, MENORIGUALQUE=21, MAYORIGUALQUE=22, MAYORQUE=23, 
		DIFERENTE=24, P_OPEN=25, P_CLOSE=26, L_OPEN=27, L_CLOSE=28, COMA=29, P_COMA=30, 
		COMILLA=31, PROCEDURE_DEL=32, VAR=33, CADENA=34, NUMERO=35, ESPACIO=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'"
	};
	public static final String[] ruleNames = {
		"SELECT", "DELETE", "INSERT", "VALUES", "FROM", "INTO", "CREATE", "PROCEDURE", 
		"ALL", "WHERE", "AS", "GO", "LENGUAJE", "SQL", "AND", "OR", "NOT", "LIKE", 
		"IGUAL", "MENORQUE", "MENORIGUALQUE", "MAYORIGUALQUE", "MAYORQUE", "DIFERENTE", 
		"P_OPEN", "P_CLOSE", "L_OPEN", "L_CLOSE", "COMA", "P_COMA", "COMILLA", 
		"PROCEDURE_DEL", "VAR", "CADENA", "NUMERO", "ESPACIO"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\7\"\u00d0\n\""+
		"\f\"\16\"\u00d3\13\"\3#\3#\7#\u00d7\n#\f#\16#\u00da\13#\3#\3#\3$\3$\3"+
		"$\7$\u00e1\n$\f$\16$\u00e4\13$\5$\u00e6\n$\3%\6%\u00e9\n%\r%\16%\u00ea"+
		"\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\3\2\62"+
		";\5\2\13\f\17\17\"\"\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5R\3\2\2\2\7Y\3\2\2\2"+
		"\t`\3\2\2\2\13g\3\2\2\2\rl\3\2\2\2\17q\3\2\2\2\21x\3\2\2\2\23\u0082\3"+
		"\2\2\2\25\u0084\3\2\2\2\27\u008a\3\2\2\2\31\u008d\3\2\2\2\33\u0090\3\2"+
		"\2\2\35\u0099\3\2\2\2\37\u009d\3\2\2\2!\u00a1\3\2\2\2#\u00a4\3\2\2\2%"+
		"\u00a8\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b4\3"+
		"\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bc\3\2\2\2\65\u00be\3\2\2"+
		"\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4\3\2\2\2=\u00c6\3\2\2\2?\u00c8"+
		"\3\2\2\2A\u00ca\3\2\2\2C\u00cd\3\2\2\2E\u00d4\3\2\2\2G\u00e5\3\2\2\2I"+
		"\u00e8\3\2\2\2KL\7U\2\2LM\7G\2\2MN\7N\2\2NO\7G\2\2OP\7E\2\2PQ\7V\2\2Q"+
		"\4\3\2\2\2RS\7F\2\2ST\7G\2\2TU\7N\2\2UV\7G\2\2VW\7V\2\2WX\7G\2\2X\6\3"+
		"\2\2\2YZ\7K\2\2Z[\7P\2\2[\\\7U\2\2\\]\7G\2\2]^\7T\2\2^_\7V\2\2_\b\3\2"+
		"\2\2`a\7X\2\2ab\7C\2\2bc\7N\2\2cd\7W\2\2de\7G\2\2ef\7U\2\2f\n\3\2\2\2"+
		"gh\7H\2\2hi\7T\2\2ij\7Q\2\2jk\7O\2\2k\f\3\2\2\2lm\7K\2\2mn\7P\2\2no\7"+
		"V\2\2op\7Q\2\2p\16\3\2\2\2qr\7E\2\2rs\7T\2\2st\7G\2\2tu\7C\2\2uv\7V\2"+
		"\2vw\7G\2\2w\20\3\2\2\2xy\7R\2\2yz\7T\2\2z{\7Q\2\2{|\7E\2\2|}\7G\2\2}"+
		"~\7F\2\2~\177\7W\2\2\177\u0080\7T\2\2\u0080\u0081\7G\2\2\u0081\22\3\2"+
		"\2\2\u0082\u0083\7,\2\2\u0083\24\3\2\2\2\u0084\u0085\7Y\2\2\u0085\u0086"+
		"\7J\2\2\u0086\u0087\7G\2\2\u0087\u0088\7T\2\2\u0088\u0089\7G\2\2\u0089"+
		"\26\3\2\2\2\u008a\u008b\7C\2\2\u008b\u008c\7U\2\2\u008c\30\3\2\2\2\u008d"+
		"\u008e\7I\2\2\u008e\u008f\7Q\2\2\u008f\32\3\2\2\2\u0090\u0091\7N\2\2\u0091"+
		"\u0092\7C\2\2\u0092\u0093\7P\2\2\u0093\u0094\7I\2\2\u0094\u0095\7W\2\2"+
		"\u0095\u0096\7C\2\2\u0096\u0097\7I\2\2\u0097\u0098\7G\2\2\u0098\34\3\2"+
		"\2\2\u0099\u009a\7U\2\2\u009a\u009b\7S\2\2\u009b\u009c\7N\2\2\u009c\36"+
		"\3\2\2\2\u009d\u009e\7C\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7F\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7T\2\2\u00a3\"\3\2\2\2\u00a4"+
		"\u00a5\7P\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7\7V\2\2\u00a7$\3\2\2\2\u00a8"+
		"\u00a9\7N\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7M\2\2\u00ab\u00ac\7G\2\2"+
		"\u00ac&\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae(\3\2\2\2\u00af\u00b0\7>\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3,\3\2\2\2\u00b4\u00b5"+
		"\7@\2\2\u00b5\u00b6\7?\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\60"+
		"\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb\62\3\2\2\2\u00bc"+
		"\u00bd\7*\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7+\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c1\7}\2\2\u00c18\3\2\2\2\u00c2\u00c3\7\177\2\2\u00c3:\3\2\2\2\u00c4"+
		"\u00c5\7.\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7>\3\2\2\2\u00c8\u00c9"+
		"\7$\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\7&\2\2\u00ccB\3"+
		"\2\2\2\u00cd\u00d1\t\2\2\2\u00ce\u00d0\t\3\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2D\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d8\t\4\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\t\4\2\2\u00dcF\3\2\2\2"+
		"\u00dd\u00e6\t\5\2\2\u00de\u00e2\t\5\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00de\3\2"+
		"\2\2\u00e6H\3\2\2\2\u00e7\u00e9\t\6\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\b%\2\2\u00edJ\3\2\2\2\b\2\u00d1\u00d8\u00e2\u00e5\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}