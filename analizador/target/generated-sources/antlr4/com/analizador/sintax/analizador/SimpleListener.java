// Generated from Simple.g4 by ANTLR 4.4
package com.analizador.sintax.analizador;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#insertSQL}.
	 * @param ctx the parse tree
	 */
	void enterInsertSQL(@NotNull SimpleParser.InsertSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#insertSQL}.
	 * @param ctx the parse tree
	 */
	void exitInsertSQL(@NotNull SimpleParser.InsertSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull SimpleParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull SimpleParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valorestabla}.
	 * @param ctx the parse tree
	 */
	void enterValorestabla(@NotNull SimpleParser.ValorestablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valorestabla}.
	 * @param ctx the parse tree
	 */
	void exitValorestabla(@NotNull SimpleParser.ValorestablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comparativoNumerico}.
	 * @param ctx the parse tree
	 */
	void enterComparativoNumerico(@NotNull SimpleParser.ComparativoNumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comparativoNumerico}.
	 * @param ctx the parse tree
	 */
	void exitComparativoNumerico(@NotNull SimpleParser.ComparativoNumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentenciaSQL}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSQL(@NotNull SimpleParser.SentenciaSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentenciaSQL}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSQL(@NotNull SimpleParser.SentenciaSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(@NotNull SimpleParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(@NotNull SimpleParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#selectSQL}.
	 * @param ctx the parse tree
	 */
	void enterSelectSQL(@NotNull SimpleParser.SelectSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#selectSQL}.
	 * @param ctx the parse tree
	 */
	void exitSelectSQL(@NotNull SimpleParser.SelectSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull SimpleParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull SimpleParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#deleteSQL}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSQL(@NotNull SimpleParser.DeleteSQLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#deleteSQL}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSQL(@NotNull SimpleParser.DeleteSQLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull SimpleParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull SimpleParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comparativoCadena}.
	 * @param ctx the parse tree
	 */
	void enterComparativoCadena(@NotNull SimpleParser.ComparativoCadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comparativoCadena}.
	 * @param ctx the parse tree
	 */
	void exitComparativoCadena(@NotNull SimpleParser.ComparativoCadenaContext ctx);
}