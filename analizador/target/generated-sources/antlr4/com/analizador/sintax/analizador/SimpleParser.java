// Generated from com\analizador\sintax\analizador\Simple.g4 by ANTLR 4.5.1
package com.analizador.sintax.analizador;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, INSERT=3, VALUES=4, FROM=5, INTO=6, CREATE=7, PROCEDURE=8, 
		ALL=9, WHERE=10, AS=11, GO=12, LENGUAJE=13, SQL=14, AND=15, OR=16, NOT=17, 
		LIKE=18, IGUAL=19, MENORQUE=20, MENORIGUALQUE=21, MAYORIGUALQUE=22, MAYORQUE=23, 
		DIFERENTE=24, P_OPEN=25, P_CLOSE=26, L_OPEN=27, L_CLOSE=28, COMA=29, P_COMA=30, 
		COMILLA=31, PROCEDURE_DEL=32, VAR=33, CADENA=34, NUMERO=35, ESPACIO=36;
	public static final int
		RULE_procedure = 0, RULE_sentenciaSQL = 1, RULE_selectSQL = 2, RULE_deleteSQL = 3, 
		RULE_insertSQL = 4, RULE_valores = 5, RULE_valorestabla = 6, RULE_condicion = 7, 
		RULE_comparativoNumerico = 8, RULE_comparativoCadena = 9, RULE_expresion = 10;
	public static final String[] ruleNames = {
		"procedure", "sentenciaSQL", "selectSQL", "deleteSQL", "insertSQL", "valores", 
		"valorestabla", "condicion", "comparativoNumerico", "comparativoCadena", 
		"expresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'DELETE'", "'INSERT'", "'VALUES'", "'FROM'", "'INTO'", 
		"'CREATE'", "'PROCEDURE'", "'*'", "'WHERE'", "'AS'", "'GO'", "'LANGUAGE'", 
		"'SQL'", "'AND'", "'OR'", "'NOT'", "'LIKE'", "'='", "'<'", "'<='", "'>='", 
		"'>'", "'!='", "'('", "')'", "'{'", "'}'", "','", "';'", "'\"'", "'$$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "DELETE", "INSERT", "VALUES", "FROM", "INTO", "CREATE", 
		"PROCEDURE", "ALL", "WHERE", "AS", "GO", "LENGUAJE", "SQL", "AND", "OR", 
		"NOT", "LIKE", "IGUAL", "MENORQUE", "MENORIGUALQUE", "MAYORIGUALQUE", 
		"MAYORQUE", "DIFERENTE", "P_OPEN", "P_CLOSE", "L_OPEN", "L_CLOSE", "COMA", 
		"P_COMA", "COMILLA", "PROCEDURE_DEL", "VAR", "CADENA", "NUMERO", "ESPACIO"
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

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SimpleParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(SimpleParser.PROCEDURE, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode LENGUAJE() { return getToken(SimpleParser.LENGUAJE, 0); }
		public TerminalNode SQL() { return getToken(SimpleParser.SQL, 0); }
		public TerminalNode AS() { return getToken(SimpleParser.AS, 0); }
		public List<TerminalNode> PROCEDURE_DEL() { return getTokens(SimpleParser.PROCEDURE_DEL); }
		public TerminalNode PROCEDURE_DEL(int i) {
			return getToken(SimpleParser.PROCEDURE_DEL, i);
		}
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public List<SentenciaSQLContext> sentenciaSQL() {
			return getRuleContexts(SentenciaSQLContext.class);
		}
		public SentenciaSQLContext sentenciaSQL(int i) {
			return getRuleContext(SentenciaSQLContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CREATE);
			setState(23);
			match(PROCEDURE);
			setState(24);
			match(VAR);
			setState(25);
			match(LENGUAJE);
			setState(26);
			match(SQL);
			setState(27);
			match(AS);
			setState(28);
			match(PROCEDURE_DEL);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << DELETE) | (1L << INSERT))) != 0)) {
				{
				{
				setState(29);
				sentenciaSQL();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(PROCEDURE_DEL);
			setState(36);
			match(P_COMA);
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

	public static class SentenciaSQLContext extends ParserRuleContext {
		public InsertSQLContext insertSQL() {
			return getRuleContext(InsertSQLContext.class,0);
		}
		public DeleteSQLContext deleteSQL() {
			return getRuleContext(DeleteSQLContext.class,0);
		}
		public SelectSQLContext selectSQL() {
			return getRuleContext(SelectSQLContext.class,0);
		}
		public SentenciaSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentenciaSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentenciaSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentenciaSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaSQLContext sentenciaSQL() throws RecognitionException {
		SentenciaSQLContext _localctx = new SentenciaSQLContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentenciaSQL);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				insertSQL();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				deleteSQL();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				selectSQL();
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

	public static class SelectSQLContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SimpleParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SimpleParser.FROM, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode ALL() { return getToken(SimpleParser.ALL, 0); }
		public ValorestablaContext valorestabla() {
			return getRuleContext(ValorestablaContext.class,0);
		}
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public SelectSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSelectSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSelectSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSelectSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSQLContext selectSQL() throws RecognitionException {
		SelectSQLContext _localctx = new SelectSQLContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SELECT);
			setState(46);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(44);
				match(ALL);
				}
				break;
			case P_OPEN:
			case VAR:
				{
				setState(45);
				valorestabla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48);
			match(FROM);
			setState(49);
			match(VAR);
			setState(54);
			switch (_input.LA(1)) {
			case P_COMA:
				{
				setState(50);
				match(P_COMA);
				}
				break;
			case WHERE:
				{
				setState(51);
				condicion();
				setState(52);
				match(P_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.println("SENTENCIA SQL SELECT");
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

	public static class DeleteSQLContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SimpleParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SimpleParser.FROM, 0); }
		public List<TerminalNode> VAR() { return getTokens(SimpleParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SimpleParser.VAR, i);
		}
		public TerminalNode WHERE() { return getToken(SimpleParser.WHERE, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public DeleteSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeleteSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeleteSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDeleteSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSQLContext deleteSQL() throws RecognitionException {
		DeleteSQLContext _localctx = new DeleteSQLContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(DELETE);
			setState(59);
			match(FROM);
			setState(60);
			match(VAR);
			setState(61);
			match(WHERE);
			setState(62);
			match(VAR);
			setState(63);
			match(IGUAL);
			setState(64);
			match(NUMERO);
			setState(65);
			match(P_COMA);
			System.out.println("SENTENCIA SQL DELETE");
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

	public static class InsertSQLContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SimpleParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SimpleParser.INTO, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode VALUES() { return getToken(SimpleParser.VALUES, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public InsertSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSQL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterInsertSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitInsertSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitInsertSQL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSQLContext insertSQL() throws RecognitionException {
		InsertSQLContext _localctx = new InsertSQLContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertSQL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INSERT);
			setState(69);
			match(INTO);
			setState(70);
			match(VAR);
			setState(71);
			match(VALUES);
			setState(72);
			match(P_OPEN);
			setState(73);
			valores();
			setState(74);
			match(P_CLOSE);
			setState(75);
			match(P_COMA);
			System.out.println("SENTENCIA SQL INSERT");
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

	public static class ValoresContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleParser.NUMERO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(SimpleParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(SimpleParser.CADENA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SimpleParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SimpleParser.COMA, i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valores);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					_la = _input.LA(1);
					if ( !(_la==CADENA || _la==NUMERO) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(79);
					match(COMA);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==CADENA || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class ValorestablaContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(SimpleParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SimpleParser.VAR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SimpleParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SimpleParser.COMA, i);
		}
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public ValorestablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorestabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterValorestabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitValorestabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitValorestabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorestablaContext valorestabla() throws RecognitionException {
		ValorestablaContext _localctx = new ValorestablaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valorestabla);
		try {
			int _alt;
			setState(106);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						match(VAR);
						setState(88);
						match(COMA);
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(94);
				match(VAR);
				}
				}
				break;
			case P_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(P_OPEN);
				{
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						match(VAR);
						setState(97);
						match(COMA);
						}
						} 
					}
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(103);
				match(VAR);
				}
				setState(105);
				match(P_CLOSE);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SimpleParser.WHERE, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public ComparativoNumericoContext comparativoNumerico() {
			return getRuleContext(ComparativoNumericoContext.class,0);
		}
		public ComparativoCadenaContext comparativoCadena() {
			return getRuleContext(ComparativoCadenaContext.class,0);
		}
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHERE);
			setState(114);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(109);
				match(VAR);
				setState(110);
				comparativoNumerico();
				}
				break;
			case LIKE:
			case IGUAL:
				{
				setState(111);
				comparativoCadena();
				setState(112);
				match(P_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ComparativoNumericoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode MENORQUE() { return getToken(SimpleParser.MENORQUE, 0); }
		public TerminalNode MAYORQUE() { return getToken(SimpleParser.MAYORQUE, 0); }
		public TerminalNode MENORIGUALQUE() { return getToken(SimpleParser.MENORIGUALQUE, 0); }
		public TerminalNode MAYORIGUALQUE() { return getToken(SimpleParser.MAYORIGUALQUE, 0); }
		public TerminalNode DIFERENTE() { return getToken(SimpleParser.DIFERENTE, 0); }
		public ComparativoNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparativoNumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComparativoNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComparativoNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitComparativoNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparativoNumericoContext comparativoNumerico() throws RecognitionException {
		ComparativoNumericoContext _localctx = new ComparativoNumericoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparativoNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENORQUE) | (1L << MENORIGUALQUE) | (1L << MAYORIGUALQUE) | (1L << MAYORQUE) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(117);
			match(NUMERO);
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

	public static class ComparativoCadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(SimpleParser.CADENA, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode LIKE() { return getToken(SimpleParser.LIKE, 0); }
		public ComparativoCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparativoCadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComparativoCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComparativoCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitComparativoCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparativoCadenaContext comparativoCadena() throws RecognitionException {
		ComparativoCadenaContext _localctx = new ComparativoCadenaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparativoCadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==LIKE || _la==IGUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(120);
			match(CADENA);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public Token NUMERO;
		public Token VAR;
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((ExpresionContext)_localctx).NUMERO = match(NUMERO);
				((ExpresionContext)_localctx).value =  Integer.parseInt((((ExpresionContext)_localctx).NUMERO!=null?((ExpresionContext)_localctx).NUMERO.getText():null)); 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((ExpresionContext)_localctx).VAR = match(VAR);
				((ExpresionContext)_localctx).value =  (((ExpresionContext)_localctx).VAR!=null?((ExpresionContext)_localctx).VAR.getText():null);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0083\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7S\n\7\f\7\16\7V\13\7\3"+
		"\7\3\7\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\3\b\3\b\3\b\7\be\n\b\f\b\16"+
		"\bh\13\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\f\2\2\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\5\3\2$%\3\2\25\32\3\2\24\25\u0082\2\30\3\2\2\2\4+"+
		"\3\2\2\2\6-\3\2\2\2\b<\3\2\2\2\nF\3\2\2\2\fT\3\2\2\2\16l\3\2\2\2\20n\3"+
		"\2\2\2\22v\3\2\2\2\24y\3\2\2\2\26\u0080\3\2\2\2\30\31\7\t\2\2\31\32\7"+
		"\n\2\2\32\33\7#\2\2\33\34\7\17\2\2\34\35\7\20\2\2\35\36\7\r\2\2\36\"\7"+
		"\"\2\2\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2"+
		"\2$\"\3\2\2\2%&\7\"\2\2&\'\7 \2\2\'\3\3\2\2\2(,\5\n\6\2),\5\b\5\2*,\5"+
		"\6\4\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-\60\7\3\2\2.\61\7\13\2"+
		"\2/\61\5\16\b\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\7\7\2\2\63"+
		"8\7#\2\2\649\7 \2\2\65\66\5\20\t\2\66\67\7 \2\2\679\3\2\2\28\64\3\2\2"+
		"\28\65\3\2\2\29:\3\2\2\2:;\b\4\1\2;\7\3\2\2\2<=\7\4\2\2=>\7\7\2\2>?\7"+
		"#\2\2?@\7\f\2\2@A\7#\2\2AB\7\25\2\2BC\7%\2\2CD\7 \2\2DE\b\5\1\2E\t\3\2"+
		"\2\2FG\7\5\2\2GH\7\b\2\2HI\7#\2\2IJ\7\6\2\2JK\7\33\2\2KL\5\f\7\2LM\7\34"+
		"\2\2MN\7 \2\2NO\b\6\1\2O\13\3\2\2\2PQ\t\2\2\2QS\7\37\2\2RP\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\t\2\2\2X\r\3\2\2\2YZ"+
		"\7#\2\2Z\\\7\37\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2"+
		"_]\3\2\2\2`m\7#\2\2af\7\33\2\2bc\7#\2\2ce\7\37\2\2db\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7#\2\2jk\3\2\2\2km\7\34\2\2"+
		"l]\3\2\2\2la\3\2\2\2m\17\3\2\2\2nt\7\f\2\2op\7#\2\2pu\5\22\n\2qr\5\24"+
		"\13\2rs\7 \2\2su\3\2\2\2to\3\2\2\2tq\3\2\2\2u\21\3\2\2\2vw\t\3\2\2wx\7"+
		"%\2\2x\23\3\2\2\2yz\t\4\2\2z{\7$\2\2{\25\3\2\2\2|}\7%\2\2}\u0081\b\f\1"+
		"\2~\177\7#\2\2\177\u0081\b\f\1\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\27"+
		"\3\2\2\2\f\"+\608T]flt\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}