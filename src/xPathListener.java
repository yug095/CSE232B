// Generated from xPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xPathParser}.
 */
public interface xPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code apsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApsl(xPathParser.ApslContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApsl(xPathParser.ApslContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apslsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApslsl(xPathParser.ApslslContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apslsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApslsl(xPathParser.ApslslContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parent}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(xPathParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parent}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(xPathParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlashRp(xPathParser.DoubleSlashRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlashRp(xPathParser.DoubleSlashRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParens(xPathParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParens(xPathParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterStar(xPathParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitStar(xPathParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(xPathParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(xPathParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCommaRp(xPathParser.CommaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCommaRp(xPathParser.CommaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDot(xPathParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDot(xPathParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(xPathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(xPathParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(xPathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(xPathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(xPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(xPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSingleSlashRp(xPathParser.SingleSlashRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSingleSlashRp(xPathParser.SingleSlashRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(xPathParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(xPathParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(xPathParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(xPathParser.AndFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterEq2Filter(xPathParser.Eq2FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitEq2Filter(xPathParser.Eq2FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterIs1Filter(xPathParser.Is1FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitIs1Filter(xPathParser.Is1FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(xPathParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(xPathParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterIs2Filter(xPathParser.Is2FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitIs2Filter(xPathParser.Is2FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(xPathParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(xPathParser.OrFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterEq1Filter(xPathParser.Eq1FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitEq1Filter(xPathParser.Eq1FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterParensFilter(xPathParser.ParensFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitParensFilter(xPathParser.ParensFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFlwrXQ(xPathParser.FlwrXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFlwrXQ(xPathParser.FlwrXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterSingleSlashXQ(xPathParser.SingleSlashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitSingleSlashXQ(xPathParser.SingleSlashXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagNameXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagNameXQ(xPathParser.TagNameXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagNameXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagNameXQ(xPathParser.TagNameXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXQ(xPathParser.ApXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXQ(xPathParser.ApXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXQ(xPathParser.LetXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXQ(xPathParser.LetXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterParensXQ(xPathParser.ParensXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitParensXQ(xPathParser.ParensXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterCommaXQ(xPathParser.CommaXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitCommaXQ(xPathParser.CommaXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXQ(xPathParser.VarXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXQ(xPathParser.VarXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterScXQ(xPathParser.ScXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitScXQ(xPathParser.ScXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlashXQ(xPathParser.DoubleSlashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlashXQ(xPathParser.DoubleSlashXQContext ctx);
	/**
	 * Enter a parse tree produced by {@link xPathParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(xPathParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link xPathParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(xPathParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link xPathParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(xPathParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xPathParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(xPathParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xPathParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(xPathParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xPathParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(xPathParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xPathParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(xPathParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xPathParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(xPathParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xPathParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(xPathParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xPathParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(xPathParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEq2Cond(xPathParser.Eq2CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEq2Cond(xPathParser.Eq2CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(xPathParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(xPathParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIs2Cond(xPathParser.Is2CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIs2Cond(xPathParser.Is2CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIs1Cond(xPathParser.Is1CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIs1Cond(xPathParser.Is1CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(xPathParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(xPathParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(xPathParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(xPathParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEq1Cond(xPathParser.Eq1CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEq1Cond(xPathParser.Eq1CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someSatisCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSomeSatisCond(xPathParser.SomeSatisCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someSatisCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSomeSatisCond(xPathParser.SomeSatisCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParensCond(xPathParser.ParensCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParensCond(xPathParser.ParensCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(xPathParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(xPathParser.NotCondContext ctx);
}