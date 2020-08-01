// Generated from com\analizador\sintax\analizador\Simple.g4 by ANTLR 4.5.1
package com.analizador.sintax.analizador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(SimpleParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentenciaSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaSQL(SimpleParser.SentenciaSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#selectSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSQL(SimpleParser.SelectSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#deleteSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSQL(SimpleParser.DeleteSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#insertSQL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSQL(SimpleParser.InsertSQLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(SimpleParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#valorestabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorestabla(SimpleParser.ValorestablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(SimpleParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#comparativoNumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparativoNumerico(SimpleParser.ComparativoNumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#comparativoCadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparativoCadena(SimpleParser.ComparativoCadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(SimpleParser.ExpresionContext ctx);
}