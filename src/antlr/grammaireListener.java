package antlr;


// Generated from grammaire.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammaireParser}.
 */
public interface grammaireListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammaireParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammaireParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammaireParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammaireParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(grammaireParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(grammaireParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(grammaireParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(grammaireParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#uop}.
	 * @param ctx the parse tree
	 */
	void enterUop(grammaireParser.UopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#uop}.
	 * @param ctx the parse tree
	 */
	void exitUop(grammaireParser.UopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(grammaireParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(grammaireParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(grammaireParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(grammaireParser.ParamContext ctx);
}