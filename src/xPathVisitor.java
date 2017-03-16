// Generated from xPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code apsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApsl(xPathParser.ApslContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apslsl}
	 * labeled alternative in {@link xPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApslsl(xPathParser.ApslslContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parent}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(xPathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSlashRp(xPathParser.DoubleSlashRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(xPathParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(xPathParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(xPathParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaRp(xPathParser.CommaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(xPathParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(xPathParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(xPathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagName}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleSlashRp}
	 * labeled alternative in {@link xPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSlashRp(xPathParser.SingleSlashRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(xPathParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFilter(xPathParser.AndFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq2Filter(xPathParser.Eq2FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs1Filter(xPathParser.Is1FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(xPathParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is2Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs2Filter(xPathParser.Is2FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrFilter(xPathParser.OrFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq1Filter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq1Filter(xPathParser.Eq1FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensFilter}
	 * labeled alternative in {@link xPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensFilter(xPathParser.ParensFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlwrXQ(xPathParser.FlwrXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSlashXQ(xPathParser.SingleSlashXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagNameXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameXQ(xPathParser.TagNameXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApXQ(xPathParser.ApXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXQ(xPathParser.LetXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensXQ(xPathParser.ParensXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaXQ(xPathParser.CommaXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXQ(xPathParser.VarXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScXQ(xPathParser.ScXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinXQ(xPathParser.JoinXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleSlashXQ}
	 * labeled alternative in {@link xPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSlashXQ(xPathParser.DoubleSlashXQContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(xPathParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(xPathParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(xPathParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(xPathParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(xPathParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(xPathParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(xPathParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq2Cond(xPathParser.Eq2CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCond(xPathParser.OrCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is2Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs2Cond(xPathParser.Is2CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs1Cond(xPathParser.Is1CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(xPathParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCond(xPathParser.AndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq1Cond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq1Cond(xPathParser.Eq1CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someSatisCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeSatisCond(xPathParser.SomeSatisCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCond(xPathParser.ParensCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link xPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(xPathParser.NotCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#subxq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubxq(xPathParser.SubxqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEq1SubCond}
	 * labeled alternative in {@link xPathParser#subcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEq1SubCond(xPathParser.VarEq1SubCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStrEq1SubCond}
	 * labeled alternative in {@link xPathParser#subcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStrEq1SubCond(xPathParser.VarStrEq1SubCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStrEq2SubCond}
	 * labeled alternative in {@link xPathParser#subcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStrEq2SubCond(xPathParser.VarStrEq2SubCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andSubCond}
	 * labeled alternative in {@link xPathParser#subcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSubCond(xPathParser.AndSubCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEq2SubCond}
	 * labeled alternative in {@link xPathParser#subcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEq2SubCond(xPathParser.VarEq2SubCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaSubReturn}
	 * labeled alternative in {@link xPathParser#subreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSubReturn(xPathParser.CommaSubReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSubReturn}
	 * labeled alternative in {@link xPathParser#subreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSubReturn(xPathParser.VarSubReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagSubReturn}
	 * labeled alternative in {@link xPathParser#subreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagSubReturn(xPathParser.TagSubReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqSubReturn}
	 * labeled alternative in {@link xPathParser#subreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSubReturn(xPathParser.XqSubReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootnodePath}
	 * labeled alternative in {@link xPathParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootnodePath(xPathParser.RootnodePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roottextPath}
	 * labeled alternative in {@link xPathParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoottextPath(xPathParser.RoottextPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varnodePath}
	 * labeled alternative in {@link xPathParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnodePath(xPathParser.VarnodePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartextPath}
	 * labeled alternative in {@link xPathParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartextPath(xPathParser.VartextPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link xPathParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(xPathParser.SepContext ctx);
}