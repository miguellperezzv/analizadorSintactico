// Generated from Simple.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUMA=1, RESTA=2, MULT=3, DIVISION=4, IGUAL=5, IGUALA=6, MENORQUE=7, MENORIGUALQUE=8, 
		MAYORIGUALQUE=9, MAYORQUE=10, DIFERENTE=11, P_OPEN=12, P_CLOSE=13, L_OPEN=14, 
		L_CLOSE=15, COMA=16, P_COMA=17, COMILLA=18, IF=19, VOID=20, PRINTLN=21, 
		FOR=22, WHILE=23, TRUE=24, FALSE=25, INTEGER=26, STRING=27, VAR=28, CADENA=29, 
		NUMERO=30, ESPACIO=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'<'", "'<='", 
		"'>='", "'>'", "'!='", "'('", "')'", "'{'", "'}'", "','", "';'", "'\"'", 
		"'if'", "'void'", "'println'", "'for'", "'while'", "'true'", "'false'", 
		"'int'", "'String'", "VAR", "CADENA", "NUMERO", "ESPACIO"
	};
	public static final int
		RULE_procedure = 0, RULE_sentencia = 1, RULE_asignacion = 2, RULE_ciclo = 3, 
		RULE_cicloFor = 4, RULE_println = 5, RULE_condicional = 6, RULE_expresion = 7, 
		RULE_expresionMat = 8, RULE_operadorCondicional = 9, RULE_condicionnum = 10, 
		RULE_incremento = 11, RULE_condicion = 12, RULE_simboloMat = 13;
	public static final String[] ruleNames = {
		"procedure", "sentencia", "asignacion", "ciclo", "cicloFor", "println", 
		"condicional", "expresion", "expresionMat", "operadorCondicional", "condicionnum", 
		"incremento", "condicion", "simboloMat"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode L_CLOSE() { return getToken(SimpleParser.L_CLOSE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode L_OPEN() { return getToken(SimpleParser.L_OPEN, 0); }
		public TerminalNode VOID() { return getToken(SimpleParser.VOID, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
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
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(VOID);
			setState(29); match(P_OPEN);
			setState(30); match(P_CLOSE);
			setState(31); match(L_OPEN);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINTLN) | (1L << FOR) | (1L << WHILE) | (1L << INTEGER) | (1L << VAR))) != 0)) {
				{
				{
				setState(32); sentencia();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38); match(L_CLOSE);
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

	public static class SentenciaContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			switch (_input.LA(1)) {
			case INTEGER:
			case VAR:
				{
				setState(40); asignacion();
				}
				break;
			case WHILE:
				{
				setState(41); ciclo();
				}
				break;
			case FOR:
				{
				setState(42); cicloFor();
				}
				break;
			case PRINTLN:
				{
				setState(43); println();
				}
				break;
			case IF:
				{
				setState(44); condicional();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode INTEGER() { return getToken(SimpleParser.INTEGER, 0); }
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(47); match(VAR);
				setState(48); match(IGUAL);
				setState(49); match(NUMERO);
				setState(50); match(P_COMA);
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); match(INTEGER);
				setState(52); match(VAR);
				setState(53); match(IGUAL);
				setState(54); match(NUMERO);
				setState(55); match(P_COMA);
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

	public static class CicloContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode L_CLOSE() { return getToken(SimpleParser.L_CLOSE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(SimpleParser.FALSE, 0); }
		public TerminalNode L_OPEN() { return getToken(SimpleParser.L_OPEN, 0); }
		public TerminalNode TRUE() { return getToken(SimpleParser.TRUE, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public CondicionnumContext condicionnum() {
			return getRuleContext(CondicionnumContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(WHILE);
			setState(59); match(P_OPEN);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(60); condicionnum();
				}
				break;
			case 2:
				{
				setState(61); condicion();
				}
				break;
			case 3:
				{
				setState(62); match(TRUE);
				}
				break;
			case 4:
				{
				setState(63); match(FALSE);
				}
				break;
			}
			setState(66); match(P_CLOSE);
			setState(67); match(L_OPEN);
			setState(68); sentencia();
			setState(69); match(L_CLOSE);
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

	public static class CicloForContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode L_CLOSE() { return getToken(SimpleParser.L_CLOSE, 0); }
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public TerminalNode L_OPEN() { return getToken(SimpleParser.L_OPEN, 0); }
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public CondicionnumContext condicionnum() {
			return getRuleContext(CondicionnumContext.class,0);
		}
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCicloFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCicloFor(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cicloFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(FOR);
			setState(72); match(P_OPEN);
			setState(73); asignacion();
			setState(74); condicionnum();
			setState(75); match(P_COMA);
			setState(76); incremento();
			setState(77); match(P_CLOSE);
			setState(78); match(L_OPEN);
			setState(79); sentencia();
			setState(80); match(L_CLOSE);
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode P_COMA() { return getToken(SimpleParser.P_COMA, 0); }
		public ExpresionMatContext expresionMat() {
			return getRuleContext(ExpresionMatContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(PRINTLN);
			setState(83); match(P_OPEN);
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(84); expresion();
				}
				break;
			case 2:
				{
				setState(85); expresionMat();
				}
				break;
			}
			setState(88); match(P_CLOSE);
			setState(89); match(P_COMA);
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

	public static class CondicionalContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode L_CLOSE() { return getToken(SimpleParser.L_CLOSE, 0); }
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(SimpleParser.FALSE, 0); }
		public TerminalNode L_OPEN() { return getToken(SimpleParser.L_OPEN, 0); }
		public TerminalNode TRUE() { return getToken(SimpleParser.TRUE, 0); }
		public TerminalNode P_CLOSE() { return getToken(SimpleParser.P_CLOSE, 0); }
		public TerminalNode P_OPEN() { return getToken(SimpleParser.P_OPEN, 0); }
		public CondicionnumContext condicionnum() {
			return getRuleContext(CondicionnumContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(IF);
			setState(92); match(P_OPEN);
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93); condicion();
				}
				break;
			case 2:
				{
				setState(94); condicionnum();
				}
				break;
			case 3:
				{
				setState(95); match(TRUE);
				}
				break;
			case 4:
				{
				setState(96); match(FALSE);
				}
				break;
			}
			setState(99); match(P_CLOSE);
			setState(100); match(L_OPEN);
			setState(101); sentencia();
			setState(102); match(L_CLOSE);
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
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode CADENA() { return getToken(SimpleParser.CADENA, 0); }
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
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CADENA) | (1L << NUMERO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpresionMatContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SimpleParser.INTEGER, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public SimboloMatContext simboloMat() {
			return getRuleContext(SimboloMatContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleParser.NUMERO, i);
		}
		public ExpresionMatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpresionMat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpresionMat(this);
		}
	}

	public final ExpresionMatContext expresionMat() throws RecognitionException {
		ExpresionMatContext _localctx = new ExpresionMatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresionMat);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(NUMERO);
				setState(108); simboloMat();
				setState(109); match(NUMERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); match(INTEGER);
				setState(112); match(VAR);
				setState(113); match(IGUAL);
				setState(114); match(NUMERO);
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

	public static class OperadorCondicionalContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(SimpleParser.MENORQUE, 0); }
		public TerminalNode MENORIGUALQUE() { return getToken(SimpleParser.MENORIGUALQUE, 0); }
		public TerminalNode MAYORIGUALQUE() { return getToken(SimpleParser.MAYORIGUALQUE, 0); }
		public TerminalNode IGUALA() { return getToken(SimpleParser.IGUALA, 0); }
		public TerminalNode MAYORQUE() { return getToken(SimpleParser.MAYORQUE, 0); }
		public TerminalNode DIFERENTE() { return getToken(SimpleParser.DIFERENTE, 0); }
		public OperadorCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperadorCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperadorCondicional(this);
		}
	}

	public final OperadorCondicionalContext operadorCondicional() throws RecognitionException {
		OperadorCondicionalContext _localctx = new OperadorCondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadorCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALA) | (1L << MENORQUE) | (1L << MENORIGUALQUE) | (1L << MAYORIGUALQUE) | (1L << MAYORQUE) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CondicionnumContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(SimpleParser.VAR); }
		public OperadorCondicionalContext operadorCondicional() {
			return getRuleContext(OperadorCondicionalContext.class,0);
		}
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public TerminalNode VAR(int i) {
			return getToken(SimpleParser.VAR, i);
		}
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleParser.NUMERO, i);
		}
		public CondicionnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondicionnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondicionnum(this);
		}
	}

	public final CondicionnumContext condicionnum() throws RecognitionException {
		CondicionnumContext _localctx = new CondicionnumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicionnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(120); operadorCondicional();
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode SUMA(int i) {
			return getToken(SimpleParser.SUMA, i);
		}
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public List<TerminalNode> SUMA() { return getTokens(SimpleParser.SUMA); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIncremento(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(VAR);
			setState(124); match(SUMA);
			setState(125); match(SUMA);
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
		public List<TerminalNode> VAR() { return getTokens(SimpleParser.VAR); }
		public List<TerminalNode> CADENA() { return getTokens(SimpleParser.CADENA); }
		public TerminalNode VAR(int i) {
			return getToken(SimpleParser.VAR, i);
		}
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode CADENA(int i) {
			return getToken(SimpleParser.CADENA, i);
		}
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
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(128); match(IGUAL);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SimboloMatContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(SimpleParser.DIVISION, 0); }
		public TerminalNode MULT() { return getToken(SimpleParser.MULT, 0); }
		public TerminalNode RESTA() { return getToken(SimpleParser.RESTA, 0); }
		public TerminalNode SUMA() { return getToken(SimpleParser.SUMA, 0); }
		public SimboloMatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simboloMat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSimboloMat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSimboloMat(this);
		}
	}

	public final SimboloMatContext simboloMat() throws RecognitionException {
		SimboloMatContext _localctx = new SimboloMatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simboloMat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f"+
		"\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7Y\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\2"+
		"\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\36 \3\2\b\r\4\2\36\36"+
		"  \3\2\36\37\3\2\3\6\u0088\2\36\3\2\2\2\4/\3\2\2\2\6:\3\2\2\2\b<\3\2\2"+
		"\2\nI\3\2\2\2\fT\3\2\2\2\16]\3\2\2\2\20j\3\2\2\2\22u\3\2\2\2\24w\3\2\2"+
		"\2\26y\3\2\2\2\30}\3\2\2\2\32\u0081\3\2\2\2\34\u0085\3\2\2\2\36\37\7\26"+
		"\2\2\37 \7\16\2\2 !\7\17\2\2!%\7\20\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\21\2\2)\3\3\2\2\2*\60"+
		"\5\6\4\2+\60\5\b\5\2,\60\5\n\6\2-\60\5\f\7\2.\60\5\16\b\2/*\3\2\2\2/+"+
		"\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62\7\36\2\2\62"+
		"\63\7\7\2\2\63\64\7 \2\2\64;\7\23\2\2\65\66\7\34\2\2\66\67\7\36\2\2\67"+
		"8\7\7\2\289\7 \2\29;\7\23\2\2:\61\3\2\2\2:\65\3\2\2\2;\7\3\2\2\2<=\7\31"+
		"\2\2=B\7\16\2\2>C\5\26\f\2?C\5\32\16\2@C\7\32\2\2AC\7\33\2\2B>\3\2\2\2"+
		"B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DE\7\17\2\2EF\7\20\2\2FG\5\4\3"+
		"\2GH\7\21\2\2H\t\3\2\2\2IJ\7\30\2\2JK\7\16\2\2KL\5\6\4\2LM\5\26\f\2MN"+
		"\7\23\2\2NO\5\30\r\2OP\7\17\2\2PQ\7\20\2\2QR\5\4\3\2RS\7\21\2\2S\13\3"+
		"\2\2\2TU\7\27\2\2UX\7\16\2\2VY\5\20\t\2WY\5\22\n\2XV\3\2\2\2XW\3\2\2\2"+
		"YZ\3\2\2\2Z[\7\17\2\2[\\\7\23\2\2\\\r\3\2\2\2]^\7\25\2\2^c\7\16\2\2_d"+
		"\5\32\16\2`d\5\26\f\2ad\7\32\2\2bd\7\33\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2"+
		"\2\2cb\3\2\2\2de\3\2\2\2ef\7\17\2\2fg\7\20\2\2gh\5\4\3\2hi\7\21\2\2i\17"+
		"\3\2\2\2jk\t\2\2\2k\21\3\2\2\2lv\7 \2\2mn\7 \2\2no\5\34\17\2op\7 \2\2"+
		"pv\3\2\2\2qr\7\34\2\2rs\7\36\2\2st\7\7\2\2tv\7 \2\2ul\3\2\2\2um\3\2\2"+
		"\2uq\3\2\2\2v\23\3\2\2\2wx\t\3\2\2x\25\3\2\2\2yz\t\4\2\2z{\5\24\13\2{"+
		"|\t\4\2\2|\27\3\2\2\2}~\7\36\2\2~\177\7\3\2\2\177\u0080\7\3\2\2\u0080"+
		"\31\3\2\2\2\u0081\u0082\t\5\2\2\u0082\u0083\7\7\2\2\u0083\u0084\t\5\2"+
		"\2\u0084\33\3\2\2\2\u0085\u0086\t\6\2\2\u0086\35\3\2\2\2\t%/:BXcu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}