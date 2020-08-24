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
	 * Enter a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull SimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull SimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(@NotNull SimpleParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(@NotNull SimpleParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(@NotNull SimpleParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(@NotNull SimpleParser.IncrementoContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#operadorCondicional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorCondicional(@NotNull SimpleParser.OperadorCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operadorCondicional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorCondicional(@NotNull SimpleParser.OperadorCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull SimpleParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull SimpleParser.SentenciaContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(@NotNull SimpleParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(@NotNull SimpleParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#simboloMat}.
	 * @param ctx the parse tree
	 */
	void enterSimboloMat(@NotNull SimpleParser.SimboloMatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#simboloMat}.
	 * @param ctx the parse tree
	 */
	void exitSimboloMat(@NotNull SimpleParser.SimboloMatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condicionnum}.
	 * @param ctx the parse tree
	 */
	void enterCondicionnum(@NotNull SimpleParser.CondicionnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condicionnum}.
	 * @param ctx the parse tree
	 */
	void exitCondicionnum(@NotNull SimpleParser.CondicionnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void enterCicloFor(@NotNull SimpleParser.CicloForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void exitCicloFor(@NotNull SimpleParser.CicloForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expresionMat}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMat(@NotNull SimpleParser.ExpresionMatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expresionMat}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMat(@NotNull SimpleParser.ExpresionMatContext ctx);
}