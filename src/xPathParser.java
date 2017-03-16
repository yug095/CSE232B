// Generated from xPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, DOC=34, NAME=35, TEXT=36, WS=37, StringConstant=38;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_filter = 2, RULE_xq = 3, RULE_var = 4, 
		RULE_forClause = 5, RULE_letClause = 6, RULE_whereClause = 7, RULE_returnClause = 8, 
		RULE_joinClause = 9, RULE_varList = 10, RULE_cond = 11, RULE_subxq = 12, 
		RULE_subcond = 13, RULE_subreturn = 14, RULE_path = 15, RULE_sep = 16;
	public static final String[] ruleNames = {
		"ap", "rp", "filter", "xq", "var", "forClause", "letClause", "whereClause", 
		"returnClause", "joinClause", "varList", "cond", "subxq", "subcond", "subreturn", 
		"path", "sep"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", "'@'", "'['", 
		"']'", "','", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", 
		"'<'", "'>'", "'{'", "'}'", "'$'", "'for'", "'in'", "'let'", "':='", "'where'", 
		"'return'", "'join'", "'empty'", "'some'", "'satisfies'", null, null, 
		"'text()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "DOC", "NAME", 
		"TEXT", "WS", "StringConstant"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "xPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApslContext extends ApContext {
		public TerminalNode DOC() { return getToken(xPathParser.DOC, 0); }
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApslContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterApsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitApsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitApsl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApslslContext extends ApContext {
		public TerminalNode DOC() { return getToken(xPathParser.DOC, 0); }
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApslslContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterApslsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitApslsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitApslsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApslContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(DOC);
				setState(35);
				match(T__0);
				setState(36);
				match(StringConstant);
				setState(37);
				match(T__1);
				setState(38);
				match(T__2);
				setState(39);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApslslContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(DOC);
				setState(41);
				match(T__0);
				setState(42);
				match(StringConstant);
				setState(43);
				match(T__1);
				setState(44);
				match(T__3);
				setState(45);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleSlashRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public DoubleSlashRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterDoubleSlashRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitDoubleSlashRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitDoubleSlashRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ParensContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends RpContext {
		public StarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public CommaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterCommaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitCommaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitCommaRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends RpContext {
		public DotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TerminalNode TEXT() { return getToken(xPathParser.TEXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RpContext {
		public TerminalNode NAME() { return getToken(xPathParser.NAME, 0); }
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(xPathParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleSlashRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public SingleSlashRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterSingleSlashRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitSingleSlashRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitSingleSlashRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(49);
				match(NAME);
				}
				break;
			case T__4:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__4);
				}
				break;
			case T__5:
				{
				_localctx = new DotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__6);
				}
				break;
			case TEXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(TEXT);
				}
				break;
			case T__7:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__7);
				setState(55);
				match(NAME);
				}
				break;
			case T__0:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__0);
				setState(57);
				rp(0);
				setState(58);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new SingleSlashRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(T__2);
						setState(64);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DoubleSlashRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(T__3);
						setState(67);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new CommaRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(68);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(69);
						match(T__10);
						setState(70);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__8);
						setState(73);
						filter(0);
						setState(74);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotFilterContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public NotFilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndFilterContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public AndFilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterAndFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitAndFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitAndFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq2FilterContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Eq2FilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterEq2Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitEq2Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitEq2Filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is1FilterContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Is1FilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterIs1Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitIs1Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitIs1Filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is2FilterContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Is2FilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterIs2Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitIs2Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitIs2Filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrFilterContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public OrFilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterOrFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitOrFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitOrFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq1FilterContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Eq1FilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterEq1Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitEq1Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitEq1Filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensFilterContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public ParensFilterContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterParensFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitParensFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitParensFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Eq1FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__11);
				setState(85);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Eq2FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				rp(0);
				setState(88);
				match(T__12);
				setState(89);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Is1FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				rp(0);
				setState(92);
				match(T__13);
				setState(93);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Is2FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				rp(0);
				setState(96);
				match(T__14);
				setState(97);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new ParensFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__0);
				setState(100);
				filter(0);
				setState(101);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(T__17);
				setState(104);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108);
						match(T__15);
						setState(109);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(110);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(111);
						match(T__16);
						setState(112);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlwrXQContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FlwrXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterFlwrXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitFlwrXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitFlwrXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleSlashXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SingleSlashXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterSingleSlashXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitSingleSlashXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitSingleSlashXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameXQContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TagNameXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterTagNameXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitTagNameXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitTagNameXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApXQContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterApXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitApXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitApXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetXQContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterLetXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitLetXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitLetXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ParensXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterParensXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitParensXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitParensXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaXQContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CommaXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterCommaXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitCommaXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitCommaXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarXQContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScXQContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public ScXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterScXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitScXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitScXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinXQContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterJoinXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitJoinXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitJoinXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleSlashXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DoubleSlashXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterDoubleSlashXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitDoubleSlashXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitDoubleSlashXQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			switch (_input.LA(1)) {
			case T__22:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new ScXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(StringConstant);
				}
				break;
			case DOC:
				{
				_localctx = new ApXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new ParensXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__0);
				setState(123);
				xq(0);
				setState(124);
				match(T__1);
				}
				break;
			case T__18:
				{
				_localctx = new TagNameXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__18);
				setState(127);
				match(NAME);
				setState(128);
				match(T__19);
				setState(129);
				match(T__20);
				setState(130);
				xq(0);
				setState(131);
				match(T__21);
				setState(132);
				match(T__18);
				setState(133);
				match(T__2);
				setState(134);
				match(NAME);
				setState(135);
				match(T__19);
				}
				break;
			case T__23:
				{
				_localctx = new FlwrXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				forClause();
				setState(139);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(138);
					letClause();
					}
				}

				setState(142);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(141);
					whereClause();
					}
				}

				setState(144);
				returnClause();
				}
				break;
			case T__25:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				letClause();
				setState(147);
				xq(2);
				}
				break;
			case T__29:
				{
				_localctx = new JoinXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						match(T__10);
						setState(154);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						match(T__2);
						setState(157);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						match(T__3);
						setState(160);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xPathParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__22);
			setState(167);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__23);
			setState(170);
			var();
			setState(171);
			match(T__24);
			setState(172);
			xq(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(173);
				match(T__10);
				setState(174);
				var();
				setState(175);
				match(T__24);
				setState(176);
				xq(0);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__25);
			setState(184);
			var();
			setState(185);
			match(T__26);
			setState(186);
			xq(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(187);
				match(T__10);
				setState(188);
				var();
				setState(189);
				match(T__26);
				setState(190);
				xq(0);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__27);
			setState(198);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__28);
			setState(201);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<VarListContext> varList() {
			return getRuleContexts(VarListContext.class);
		}
		public VarListContext varList(int i) {
			return getRuleContext(VarListContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__29);
			setState(204);
			match(T__0);
			setState(205);
			xq(0);
			setState(206);
			match(T__10);
			setState(207);
			xq(0);
			setState(208);
			match(T__10);
			setState(209);
			varList();
			setState(210);
			match(T__10);
			setState(211);
			varList();
			setState(212);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__8);
			setState(215);
			match(NAME);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(216);
				match(T__10);
				setState(217);
				match(NAME);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Eq2CondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Eq2CondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterEq2Cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitEq2Cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitEq2Cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public OrCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterOrCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitOrCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitOrCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is2CondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Is2CondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterIs2Cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitIs2Cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitIs2Cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is1CondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Is1CondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterIs1Cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitIs1Cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitIs1Cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyCondContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterEmptyCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitEmptyCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitEmptyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public AndCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterAndCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitAndCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitAndCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq1CondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Eq1CondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterEq1Cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitEq1Cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitEq1Cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeSatisCondContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SomeSatisCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterSomeSatisCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitSomeSatisCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitSomeSatisCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ParensCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterParensCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitParensCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitParensCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterNotCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitNotCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitNotCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new Eq1CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226);
				xq(0);
				setState(227);
				match(T__11);
				setState(228);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Eq2CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				xq(0);
				setState(231);
				match(T__12);
				setState(232);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Is1CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				xq(0);
				setState(235);
				match(T__13);
				setState(236);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new Is2CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				xq(0);
				setState(239);
				match(T__14);
				setState(240);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(T__30);
				setState(243);
				match(T__0);
				setState(244);
				xq(0);
				setState(245);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new SomeSatisCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(T__31);
				setState(248);
				var();
				setState(249);
				match(T__24);
				setState(250);
				xq(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(251);
					var();
					setState(252);
					match(T__24);
					setState(253);
					xq(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__32);
				setState(261);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new ParensCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__0);
				setState(264);
				cond(0);
				setState(265);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(T__17);
				setState(268);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						match(T__15);
						setState(273);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(T__16);
						setState(276);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubxqContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public SubcondContext subcond() {
			return getRuleContext(SubcondContext.class,0);
		}
		public SubreturnContext subreturn() {
			return getRuleContext(SubreturnContext.class,0);
		}
		public SubxqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subxq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterSubxq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitSubxq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitSubxq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubxqContext subxq() throws RecognitionException {
		SubxqContext _localctx = new SubxqContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subxq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__23);
			setState(283);
			var();
			setState(284);
			match(T__24);
			setState(285);
			path();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(286);
				match(T__10);
				setState(287);
				var();
				setState(288);
				match(T__24);
				setState(289);
				path();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(T__27);
			setState(297);
			subcond(0);
			setState(298);
			match(T__28);
			setState(299);
			subreturn(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubcondContext extends ParserRuleContext {
		public SubcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcond; }
	 
		public SubcondContext() { }
		public void copyFrom(SubcondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarEq1SubCondContext extends SubcondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarEq1SubCondContext(SubcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarEq1SubCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarEq1SubCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarEq1SubCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStrEq1SubCondContext extends SubcondContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public VarStrEq1SubCondContext(SubcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarStrEq1SubCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarStrEq1SubCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarStrEq1SubCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStrEq2SubCondContext extends SubcondContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public VarStrEq2SubCondContext(SubcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarStrEq2SubCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarStrEq2SubCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarStrEq2SubCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndSubCondContext extends SubcondContext {
		public List<SubcondContext> subcond() {
			return getRuleContexts(SubcondContext.class);
		}
		public SubcondContext subcond(int i) {
			return getRuleContext(SubcondContext.class,i);
		}
		public AndSubCondContext(SubcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterAndSubCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitAndSubCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitAndSubCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarEq2SubCondContext extends SubcondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarEq2SubCondContext(SubcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarEq2SubCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarEq2SubCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarEq2SubCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubcondContext subcond() throws RecognitionException {
		return subcond(0);
	}

	private SubcondContext subcond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubcondContext _localctx = new SubcondContext(_ctx, _parentState);
		SubcondContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_subcond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new VarEq1SubCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(302);
				var();
				setState(303);
				match(T__12);
				setState(304);
				var();
				}
				break;
			case 2:
				{
				_localctx = new VarEq2SubCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				var();
				setState(307);
				match(T__11);
				setState(308);
				var();
				}
				break;
			case 3:
				{
				_localctx = new VarStrEq1SubCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				var();
				setState(311);
				match(T__11);
				setState(312);
				match(StringConstant);
				}
				break;
			case 4:
				{
				_localctx = new VarStrEq2SubCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				var();
				setState(315);
				match(T__12);
				setState(316);
				match(StringConstant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndSubCondContext(new SubcondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_subcond);
					setState(320);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(321);
					match(T__15);
					setState(322);
					subcond(2);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubreturnContext extends ParserRuleContext {
		public SubreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subreturn; }
	 
		public SubreturnContext() { }
		public void copyFrom(SubreturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommaSubReturnContext extends SubreturnContext {
		public List<SubreturnContext> subreturn() {
			return getRuleContexts(SubreturnContext.class);
		}
		public SubreturnContext subreturn(int i) {
			return getRuleContext(SubreturnContext.class,i);
		}
		public CommaSubReturnContext(SubreturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterCommaSubReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitCommaSubReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitCommaSubReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarSubReturnContext extends SubreturnContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarSubReturnContext(SubreturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarSubReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarSubReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarSubReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagSubReturnContext extends SubreturnContext {
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public SubreturnContext subreturn() {
			return getRuleContext(SubreturnContext.class,0);
		}
		public TagSubReturnContext(SubreturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterTagSubReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitTagSubReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitTagSubReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqSubReturnContext extends SubreturnContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public XqSubReturnContext(SubreturnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterXqSubReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitXqSubReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitXqSubReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubreturnContext subreturn() throws RecognitionException {
		return subreturn(0);
	}

	private SubreturnContext subreturn(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubreturnContext _localctx = new SubreturnContext(_ctx, _parentState);
		SubreturnContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_subreturn, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new VarSubReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(329);
				var();
				}
				break;
			case 2:
				{
				_localctx = new TagSubReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(T__18);
				setState(331);
				match(NAME);
				setState(332);
				match(T__19);
				setState(333);
				match(T__20);
				setState(334);
				subreturn(0);
				setState(335);
				match(T__21);
				setState(336);
				match(T__18);
				setState(337);
				match(T__2);
				setState(338);
				match(NAME);
				setState(339);
				match(T__19);
				}
				break;
			case 3:
				{
				_localctx = new XqSubReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				path();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaSubReturnContext(new SubreturnContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_subreturn);
					setState(344);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(345);
					match(T__10);
					setState(346);
					subreturn(4);
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RootnodePathContext extends PathContext {
		public TerminalNode DOC() { return getToken(xPathParser.DOC, 0); }
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public RootnodePathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterRootnodePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitRootnodePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitRootnodePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarnodePathContext extends PathContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public VarnodePathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVarnodePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVarnodePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVarnodePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VartextPathContext extends PathContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(xPathParser.TEXT, 0); }
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public VartextPathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterVartextPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitVartextPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitVartextPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoottextPathContext extends PathContext {
		public TerminalNode DOC() { return getToken(xPathParser.DOC, 0); }
		public TerminalNode StringConstant() { return getToken(xPathParser.StringConstant, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(xPathParser.TEXT, 0); }
		public List<TerminalNode> NAME() { return getTokens(xPathParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xPathParser.NAME, i);
		}
		public RoottextPathContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterRoottextPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitRoottextPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitRoottextPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_path);
		try {
			int _alt;
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new RootnodePathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(DOC);
				setState(353);
				match(T__0);
				setState(354);
				match(StringConstant);
				setState(355);
				match(T__1);
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						sep();
						setState(357);
						match(NAME);
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new RoottextPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(DOC);
				setState(365);
				match(T__0);
				setState(366);
				match(StringConstant);
				setState(367);
				match(T__1);
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						sep();
						setState(369);
						match(NAME);
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(376);
				sep();
				setState(377);
				match(TEXT);
				}
				break;
			case 3:
				_localctx = new VarnodePathContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				var();
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380);
						sep();
						setState(381);
						match(NAME);
						}
						} 
					}
					setState(387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new VartextPathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				var();
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						sep();
						setState(390);
						match(NAME);
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(397);
				sep();
				setState(398);
				match(TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SepContext extends ParserRuleContext {
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xPathListener ) ((xPathListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xPathVisitor ) return ((xPathVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return filter_sempred((FilterContext)_localctx, predIndex);
		case 3:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 11:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 13:
			return subcond_sempred((SubcondContext)_localctx, predIndex);
		case 14:
			return subreturn_sempred((SubreturnContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subcond_sempred(SubcondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean subreturn_sempred(SubreturnContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0197\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\5\5\u0091\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0099\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a4\n\5\f\5"+
		"\16\5\u00a7\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b5"+
		"\n\7\f\7\16\7\u00b8\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c3"+
		"\n\b\f\b\16\b\u00c6\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00dd\n\f\f\f\16"+
		"\f\u00e0\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0110\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0118\n\r\f\r\16\r\u011b"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0126\n\16\f\16"+
		"\16\16\u0129\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0141"+
		"\n\17\3\17\3\17\3\17\7\17\u0146\n\17\f\17\16\17\u0149\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0159"+
		"\n\20\3\20\3\20\3\20\7\20\u015e\n\20\f\20\16\20\u0161\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u016a\n\21\f\21\16\21\u016d\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0176\n\21\f\21\16\21\u0179\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0182\n\21\f\21\16\21\u0185\13"+
		"\21\3\21\3\21\3\21\3\21\7\21\u018b\n\21\f\21\16\21\u018e\13\21\3\21\3"+
		"\21\3\21\5\21\u0193\n\21\3\22\3\22\3\22\2\b\4\6\b\30\34\36\23\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\5\6\u01c0\2\60\3\2\2\2\4>\3"+
		"\2\2\2\6k\3\2\2\2\b\u0098\3\2\2\2\n\u00a8\3\2\2\2\f\u00ab\3\2\2\2\16\u00b9"+
		"\3\2\2\2\20\u00c7\3\2\2\2\22\u00ca\3\2\2\2\24\u00cd\3\2\2\2\26\u00d8\3"+
		"\2\2\2\30\u010f\3\2\2\2\32\u011c\3\2\2\2\34\u0140\3\2\2\2\36\u0158\3\2"+
		"\2\2 \u0192\3\2\2\2\"\u0194\3\2\2\2$%\7$\2\2%&\7\3\2\2&\'\7(\2\2\'(\7"+
		"\4\2\2()\7\5\2\2)\61\5\4\3\2*+\7$\2\2+,\7\3\2\2,-\7(\2\2-.\7\4\2\2./\7"+
		"\6\2\2/\61\5\4\3\2\60$\3\2\2\2\60*\3\2\2\2\61\3\3\2\2\2\62\63\b\3\1\2"+
		"\63?\7%\2\2\64?\7\7\2\2\65?\7\b\2\2\66?\7\t\2\2\67?\7&\2\289\7\n\2\29"+
		"?\7%\2\2:;\7\3\2\2;<\5\4\3\2<=\7\4\2\2=?\3\2\2\2>\62\3\2\2\2>\64\3\2\2"+
		"\2>\65\3\2\2\2>\66\3\2\2\2>\67\3\2\2\2>8\3\2\2\2>:\3\2\2\2?P\3\2\2\2@"+
		"A\f\6\2\2AB\7\5\2\2BO\5\4\3\7CD\f\5\2\2DE\7\6\2\2EO\5\4\3\6FG\f\3\2\2"+
		"GH\7\r\2\2HO\5\4\3\4IJ\f\4\2\2JK\7\13\2\2KL\5\6\4\2LM\7\f\2\2MO\3\2\2"+
		"\2N@\3\2\2\2NC\3\2\2\2NF\3\2\2\2NI\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2Q\5\3\2\2\2RP\3\2\2\2ST\b\4\1\2Tl\5\4\3\2UV\5\4\3\2VW\7\16\2\2WX\5\4"+
		"\3\2Xl\3\2\2\2YZ\5\4\3\2Z[\7\17\2\2[\\\5\4\3\2\\l\3\2\2\2]^\5\4\3\2^_"+
		"\7\20\2\2_`\5\4\3\2`l\3\2\2\2ab\5\4\3\2bc\7\21\2\2cd\5\4\3\2dl\3\2\2\2"+
		"ef\7\3\2\2fg\5\6\4\2gh\7\4\2\2hl\3\2\2\2ij\7\24\2\2jl\5\6\4\3kS\3\2\2"+
		"\2kU\3\2\2\2kY\3\2\2\2k]\3\2\2\2ka\3\2\2\2ke\3\2\2\2ki\3\2\2\2lu\3\2\2"+
		"\2mn\f\5\2\2no\7\22\2\2ot\5\6\4\6pq\f\4\2\2qr\7\23\2\2rt\5\6\4\5sm\3\2"+
		"\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\7\3\2\2\2wu\3\2\2\2xy\b"+
		"\5\1\2y\u0099\5\n\6\2z\u0099\7(\2\2{\u0099\5\2\2\2|}\7\3\2\2}~\5\b\5\2"+
		"~\177\7\4\2\2\177\u0099\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082\7%\2"+
		"\2\u0082\u0083\7\26\2\2\u0083\u0084\7\27\2\2\u0084\u0085\5\b\5\2\u0085"+
		"\u0086\7\30\2\2\u0086\u0087\7\25\2\2\u0087\u0088\7\5\2\2\u0088\u0089\7"+
		"%\2\2\u0089\u008a\7\26\2\2\u008a\u0099\3\2\2\2\u008b\u008d\5\f\7\2\u008c"+
		"\u008e\5\16\b\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3"+
		"\2\2\2\u008f\u0091\5\20\t\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0099\3\2\2\2\u0094\u0095\5"+
		"\16\b\2\u0095\u0096\5\b\5\4\u0096\u0099\3\2\2\2\u0097\u0099\5\24\13\2"+
		"\u0098x\3\2\2\2\u0098z\3\2\2\2\u0098{\3\2\2\2\u0098|\3\2\2\2\u0098\u0080"+
		"\3\2\2\2\u0098\u008b\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u00a5\3\2\2\2\u009a\u009b\f\t\2\2\u009b\u009c\7\r\2\2\u009c\u00a4\5\b"+
		"\5\n\u009d\u009e\f\b\2\2\u009e\u009f\7\5\2\2\u009f\u00a4\5\4\3\2\u00a0"+
		"\u00a1\f\7\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\5\4\3\2\u00a3\u009a\3\2"+
		"\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\t\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00a9\7\31\2\2\u00a9\u00aa\7%\2\2\u00aa\13\3\2\2\2\u00ab\u00ac"+
		"\7\32\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae\7\33\2\2\u00ae\u00b6\5\b\5\2"+
		"\u00af\u00b0\7\r\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3"+
		"\5\b\5\2\u00b3\u00b5\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b9\u00ba\7\34\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\7\35\2\2\u00bc\u00c4"+
		"\5\b\5\2\u00bd\u00be\7\r\2\2\u00be\u00bf\5\n\6\2\u00bf\u00c0\7\35\2\2"+
		"\u00c0\u00c1\5\b\5\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7\36\2\2\u00c8\u00c9\5\30\r\2\u00c9\21\3\2"+
		"\2\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\5\b\5\2\u00cc\23\3\2\2\2\u00cd\u00ce"+
		"\7 \2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\7\r\2\2\u00d1"+
		"\u00d2\5\b\5\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\5\26\f\2\u00d4\u00d5\7"+
		"\r\2\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\7\4\2\2\u00d7\25\3\2\2\2\u00d8"+
		"\u00d9\7\13\2\2\u00d9\u00de\7%\2\2\u00da\u00db\7\r\2\2\u00db\u00dd\7%"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\f"+
		"\2\2\u00e2\27\3\2\2\2\u00e3\u00e4\b\r\1\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6"+
		"\7\16\2\2\u00e6\u00e7\5\b\5\2\u00e7\u0110\3\2\2\2\u00e8\u00e9\5\b\5\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\u00eb\5\b\5\2\u00eb\u0110\3\2\2\2\u00ec\u00ed"+
		"\5\b\5\2\u00ed\u00ee\7\20\2\2\u00ee\u00ef\5\b\5\2\u00ef\u0110\3\2\2\2"+
		"\u00f0\u00f1\5\b\5\2\u00f1\u00f2\7\21\2\2\u00f2\u00f3\5\b\5\2\u00f3\u0110"+
		"\3\2\2\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\5\b\5\2\u00f7"+
		"\u00f8\7\4\2\2\u00f8\u0110\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\5\n"+
		"\6\2\u00fb\u00fc\7\33\2\2\u00fc\u0103\5\b\5\2\u00fd\u00fe\5\n\6\2\u00fe"+
		"\u00ff\7\33\2\2\u00ff\u0100\5\b\5\2\u0100\u0102\3\2\2\2\u0101\u00fd\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\5\30"+
		"\r\7\u0108\u0110\3\2\2\2\u0109\u010a\7\3\2\2\u010a\u010b\5\30\r\2\u010b"+
		"\u010c\7\4\2\2\u010c\u0110\3\2\2\2\u010d\u010e\7\24\2\2\u010e\u0110\5"+
		"\30\r\3\u010f\u00e3\3\2\2\2\u010f\u00e8\3\2\2\2\u010f\u00ec\3\2\2\2\u010f"+
		"\u00f0\3\2\2\2\u010f\u00f4\3\2\2\2\u010f\u00f9\3\2\2\2\u010f\u0109\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u0119\3\2\2\2\u0111\u0112\f\5\2\2\u0112"+
		"\u0113\7\22\2\2\u0113\u0118\5\30\r\6\u0114\u0115\f\4\2\2\u0115\u0116\7"+
		"\23\2\2\u0116\u0118\5\30\r\5\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\31\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011c\u011d\7\32\2\2\u011d\u011e\5\n\6\2\u011e"+
		"\u011f\7\33\2\2\u011f\u0127\5 \21\2\u0120\u0121\7\r\2\2\u0121\u0122\5"+
		"\n\6\2\u0122\u0123\7\33\2\2\u0123\u0124\5 \21\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\36\2\2\u012b"+
		"\u012c\5\34\17\2\u012c\u012d\7\37\2\2\u012d\u012e\5\36\20\2\u012e\33\3"+
		"\2\2\2\u012f\u0130\b\17\1\2\u0130\u0131\5\n\6\2\u0131\u0132\7\17\2\2\u0132"+
		"\u0133\5\n\6\2\u0133\u0141\3\2\2\2\u0134\u0135\5\n\6\2\u0135\u0136\7\16"+
		"\2\2\u0136\u0137\5\n\6\2\u0137\u0141\3\2\2\2\u0138\u0139\5\n\6\2\u0139"+
		"\u013a\7\16\2\2\u013a\u013b\7(\2\2\u013b\u0141\3\2\2\2\u013c\u013d\5\n"+
		"\6\2\u013d\u013e\7\17\2\2\u013e\u013f\7(\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u012f\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u013c\3\2"+
		"\2\2\u0141\u0147\3\2\2\2\u0142\u0143\f\3\2\2\u0143\u0144\7\22\2\2\u0144"+
		"\u0146\5\34\17\4\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\35\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\b\20\1\2\u014b\u0159\5\n\6\2\u014c\u014d\7\25\2\2\u014d\u014e\7"+
		"%\2\2\u014e\u014f\7\26\2\2\u014f\u0150\7\27\2\2\u0150\u0151\5\36\20\2"+
		"\u0151\u0152\7\30\2\2\u0152\u0153\7\25\2\2\u0153\u0154\7\5\2\2\u0154\u0155"+
		"\7%\2\2\u0155\u0156\7\26\2\2\u0156\u0159\3\2\2\2\u0157\u0159\5 \21\2\u0158"+
		"\u014a\3\2\2\2\u0158\u014c\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015f\3\2"+
		"\2\2\u015a\u015b\f\5\2\2\u015b\u015c\7\r\2\2\u015c\u015e\5\36\20\6\u015d"+
		"\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\37\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7$\2\2\u0163\u0164"+
		"\7\3\2\2\u0164\u0165\7(\2\2\u0165\u016b\7\4\2\2\u0166\u0167\5\"\22\2\u0167"+
		"\u0168\7%\2\2\u0168\u016a\3\2\2\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0193\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7$\2\2\u016f\u0170\7\3\2\2\u0170\u0171\7(\2"+
		"\2\u0171\u0177\7\4\2\2\u0172\u0173\5\"\22\2\u0173\u0174\7%\2\2\u0174\u0176"+
		"\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5\""+
		"\22\2\u017b\u017c\7&\2\2\u017c\u0193\3\2\2\2\u017d\u0183\5\n\6\2\u017e"+
		"\u017f\5\"\22\2\u017f\u0180\7%\2\2\u0180\u0182\3\2\2\2\u0181\u017e\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0193\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u018c\5\n\6\2\u0187\u0188\5\""+
		"\22\2\u0188\u0189\7%\2\2\u0189\u018b\3\2\2\2\u018a\u0187\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018f\u0190\5\"\22\2\u0190\u0191\7&\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0162\3\2\2\2\u0192\u016e\3\2\2\2\u0192\u017d\3\2"+
		"\2\2\u0192\u0186\3\2\2\2\u0193!\3\2\2\2\u0194\u0195\t\2\2\2\u0195#\3\2"+
		"\2\2\37\60>NPksu\u008d\u0090\u0098\u00a3\u00a5\u00b6\u00c4\u00de\u0103"+
		"\u010f\u0117\u0119\u0127\u0140\u0147\u0158\u015f\u016b\u0177\u0183\u018c"+
		"\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}