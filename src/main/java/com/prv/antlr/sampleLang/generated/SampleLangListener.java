// Generated from SampleLang.g4 by ANTLR 4.5
package com.prv.antlr.sampleLang.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleLangParser}.
 */
public interface SampleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SampleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SampleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLangParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(SampleLangParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLangParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(SampleLangParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLangParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SampleLangParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLangParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SampleLangParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleLangParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(SampleLangParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleLangParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(SampleLangParser.GetContext ctx);
}