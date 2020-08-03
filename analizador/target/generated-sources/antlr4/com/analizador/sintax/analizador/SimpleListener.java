// Generated from com\analizador\sintax\analizador\Simple.g4 by ANTLR 4.5.1
package com.analizador.sintax.analizador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(SimpleParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(SimpleParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentenciaSQL}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSQL(SimpleParser.SentenciaSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentenciaSQL}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSQL(SimpleParser.SentenciaSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#selectSQL}.
	 * @param ctx the parse tree
	 */
	void enterSelectSQL(SimpleParser.SelectSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#selectSQL}.
	 * @param ctx the parse tree
	 */
	void exitSelectSQL(SimpleParser.SelectSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#deleteSQL}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSQL(SimpleParser.DeleteSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#deleteSQL}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSQL(SimpleParser.DeleteSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#insertSQL}.
	 * @param ctx the parse tree
	 */
	void enterInsertSQL(SimpleParser.InsertSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#insertSQL}.
	 * @param ctx the parse tree
	 */
	void exitInsertSQL(SimpleParser.InsertSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(SimpleParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(SimpleParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valorestabla}.
	 * @param ctx the parse tree
	 */
	void enterValorestabla(SimpleParser.ValorestablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valorestabla}.
	 * @param ctx the parse tree
	 */
	void exitValorestabla(SimpleParser.ValorestablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(SimpleParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(SimpleParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comparativoNumerico}.
	 * @param ctx the parse tree
	 */
	void enterComparativoNumerico(SimpleParser.ComparativoNumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comparativoNumerico}.
	 * @param ctx the parse tree
	 */
	void exitComparativoNumerico(SimpleParser.ComparativoNumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comparativoCadena}.
	 * @param ctx the parse tree
	 */
	void enterComparativoCadena(SimpleParser.ComparativoCadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comparativoCadena}.
	 * @param ctx the parse tree
	 */
	void exitComparativoCadena(SimpleParser.ComparativoCadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(SimpleParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(SimpleParser.ExpresionContext ctx);
}