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
}