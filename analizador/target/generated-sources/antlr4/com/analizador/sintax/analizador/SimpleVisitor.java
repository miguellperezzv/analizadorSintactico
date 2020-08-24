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
	 * Visit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(SimpleParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(SimpleParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SimpleParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(SimpleParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expresionMat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMat(SimpleParser.ExpresionMatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#operadorCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorCondicional(SimpleParser.OperadorCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condicionnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionnum(SimpleParser.CondicionnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(SimpleParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(SimpleParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#simboloMat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimboloMat(SimpleParser.SimboloMatContext ctx);
}