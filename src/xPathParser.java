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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NAME=30, STAR=31, DOT=32, 
		PARENT=33, TEXT=34, AT=35, StringConstant=36, WS=37;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_filter = 2, RULE_xq = 3, RULE_var = 4, 
		RULE_forClause = 5, RULE_letClause = 6, RULE_whereClause = 7, RULE_returnClause = 8, 
		RULE_cond = 9;
	public static final String[] ruleNames = {
		"ap", "rp", "filter", "xq", "var", "forClause", "letClause", "whereClause", 
		"returnClause", "cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'='", 
		"'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'<'", "'>'", "'{'", 
		"'}'", "'$'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", 
		"'empty'", "'some'", "'satisfies'", null, "'*'", "'.'", "'..'", "'text()'", 
		"'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NAME", "STAR", "DOT", "PARENT", "TEXT", 
		"AT", "StringConstant", "WS"
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
		public TerminalNode NAME() { return getToken(xPathParser.NAME, 0); }
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
		public TerminalNode NAME() { return getToken(xPathParser.NAME, 0); }
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
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApslContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__0);
				setState(21);
				match(T__1);
				setState(22);
				match(NAME);
				setState(23);
				match(T__2);
				setState(24);
				match(T__3);
				setState(25);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApslslContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(T__1);
				setState(28);
				match(NAME);
				setState(29);
				match(T__2);
				setState(30);
				match(T__4);
				setState(31);
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
		public TerminalNode PARENT() { return getToken(xPathParser.PARENT, 0); }
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
		public TerminalNode STAR() { return getToken(xPathParser.STAR, 0); }
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
		public TerminalNode DOT() { return getToken(xPathParser.DOT, 0); }
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
		public TerminalNode AT() { return getToken(xPathParser.AT, 0); }
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
			setState(46);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				match(NAME);
				}
				break;
			case STAR:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new DotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(DOT);
				}
				break;
			case PARENT:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(PARENT);
				}
				break;
			case TEXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(TEXT);
				}
				break;
			case AT:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(AT);
				setState(41);
				match(NAME);
				}
				break;
			case T__1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__1);
				setState(43);
				rp(0);
				setState(44);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new SingleSlashRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(48);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(49);
						match(T__3);
						setState(50);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DoubleSlashRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(51);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(52);
						match(T__4);
						setState(53);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new CommaRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(54);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(55);
						match(T__7);
						setState(56);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(57);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(58);
						match(T__5);
						setState(59);
						filter(0);
						setState(60);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(66);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Eq1FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				rp(0);
				setState(70);
				match(T__8);
				setState(71);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Eq2FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				rp(0);
				setState(74);
				match(T__9);
				setState(75);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Is1FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				rp(0);
				setState(78);
				match(T__10);
				setState(79);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Is2FilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				rp(0);
				setState(82);
				match(T__11);
				setState(83);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new ParensFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__1);
				setState(86);
				filter(0);
				setState(87);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__14);
				setState(90);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(T__12);
						setState(95);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(T__13);
						setState(98);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(103);
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
			setState(135);
			switch (_input.LA(1)) {
			case T__19:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new ScXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(StringConstant);
				}
				break;
			case T__0:
				{
				_localctx = new ApXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new ParensXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__1);
				setState(109);
				xq(0);
				setState(110);
				match(T__2);
				}
				break;
			case T__15:
				{
				_localctx = new TagNameXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__15);
				setState(113);
				match(NAME);
				setState(114);
				match(T__16);
				setState(115);
				match(T__17);
				setState(116);
				xq(0);
				setState(117);
				match(T__18);
				setState(118);
				match(T__15);
				setState(119);
				match(T__3);
				setState(120);
				match(NAME);
				setState(121);
				match(T__16);
				}
				break;
			case T__20:
				{
				_localctx = new FlwrXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				forClause();
				setState(125);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(124);
					letClause();
					}
				}

				setState(128);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(127);
					whereClause();
					}
				}

				setState(130);
				returnClause();
				}
				break;
			case T__22:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				letClause();
				setState(133);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(T__7);
						setState(139);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						match(T__3);
						setState(142);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						match(T__4);
						setState(145);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(150);
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
			setState(151);
			match(T__19);
			setState(152);
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
			setState(154);
			match(T__20);
			setState(155);
			var();
			setState(156);
			match(T__21);
			setState(157);
			xq(0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(158);
				match(T__7);
				setState(159);
				var();
				setState(160);
				match(T__21);
				setState(161);
				xq(0);
				}
				}
				setState(167);
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
			setState(168);
			match(T__22);
			setState(169);
			var();
			setState(170);
			match(T__23);
			setState(171);
			xq(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(172);
				match(T__7);
				setState(173);
				var();
				setState(174);
				match(T__23);
				setState(175);
				xq(0);
				}
				}
				setState(181);
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
			setState(182);
			match(T__24);
			setState(183);
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
			setState(185);
			match(T__25);
			setState(186);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Eq1CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				xq(0);
				setState(190);
				match(T__8);
				setState(191);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Eq2CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				xq(0);
				setState(194);
				match(T__9);
				setState(195);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Is1CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				xq(0);
				setState(198);
				match(T__10);
				setState(199);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new Is2CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				xq(0);
				setState(202);
				match(T__11);
				setState(203);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(T__26);
				setState(206);
				match(T__1);
				setState(207);
				xq(0);
				setState(208);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new SomeSatisCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__27);
				setState(211);
				var();
				setState(212);
				match(T__21);
				setState(213);
				xq(0);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(214);
					var();
					setState(215);
					match(T__21);
					setState(216);
					xq(0);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__28);
				setState(224);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new ParensCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(T__1);
				setState(227);
				cond(0);
				setState(228);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(T__14);
				setState(231);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						match(T__12);
						setState(236);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						match(T__13);
						setState(239);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return filter_sempred((FilterContext)_localctx, predIndex);
		case 3:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 9:
			return cond_sempred((CondContext)_localctx, predIndex);
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
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3A\n\3\f\3\16\3D\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\5\5\u0083\n\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u008a\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0095\n\5\f\5\16"+
		"\5\u0098\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a6"+
		"\n\7\f\7\16\7\u00a9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b4"+
		"\n\b\f\b\16\b\u00b7\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00dd"+
		"\n\13\f\13\16\13\u00e0\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00eb\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f3\n\13\f\13"+
		"\16\13\u00f6\13\13\3\13\2\6\4\6\b\24\f\2\4\6\b\n\f\16\20\22\24\2\2\u0117"+
		"\2\"\3\2\2\2\4\60\3\2\2\2\6]\3\2\2\2\b\u0089\3\2\2\2\n\u0099\3\2\2\2\f"+
		"\u009c\3\2\2\2\16\u00aa\3\2\2\2\20\u00b8\3\2\2\2\22\u00bb\3\2\2\2\24\u00ea"+
		"\3\2\2\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31\7 \2\2\31\32\7\5\2\2\32\33"+
		"\7\6\2\2\33#\5\4\3\2\34\35\7\3\2\2\35\36\7\4\2\2\36\37\7 \2\2\37 \7\5"+
		"\2\2 !\7\7\2\2!#\5\4\3\2\"\26\3\2\2\2\"\34\3\2\2\2#\3\3\2\2\2$%\b\3\1"+
		"\2%\61\7 \2\2&\61\7!\2\2\'\61\7\"\2\2(\61\7#\2\2)\61\7$\2\2*+\7%\2\2+"+
		"\61\7 \2\2,-\7\4\2\2-.\5\4\3\2./\7\5\2\2/\61\3\2\2\2\60$\3\2\2\2\60&\3"+
		"\2\2\2\60\'\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60,\3\2\2\2\61"+
		"B\3\2\2\2\62\63\f\6\2\2\63\64\7\6\2\2\64A\5\4\3\7\65\66\f\5\2\2\66\67"+
		"\7\7\2\2\67A\5\4\3\689\f\3\2\29:\7\n\2\2:A\5\4\3\4;<\f\4\2\2<=\7\b\2\2"+
		"=>\5\6\4\2>?\7\t\2\2?A\3\2\2\2@\62\3\2\2\2@\65\3\2\2\2@8\3\2\2\2@;\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EF\b\4\1\2F^\5"+
		"\4\3\2GH\5\4\3\2HI\7\13\2\2IJ\5\4\3\2J^\3\2\2\2KL\5\4\3\2LM\7\f\2\2MN"+
		"\5\4\3\2N^\3\2\2\2OP\5\4\3\2PQ\7\r\2\2QR\5\4\3\2R^\3\2\2\2ST\5\4\3\2T"+
		"U\7\16\2\2UV\5\4\3\2V^\3\2\2\2WX\7\4\2\2XY\5\6\4\2YZ\7\5\2\2Z^\3\2\2\2"+
		"[\\\7\21\2\2\\^\5\6\4\3]E\3\2\2\2]G\3\2\2\2]K\3\2\2\2]O\3\2\2\2]S\3\2"+
		"\2\2]W\3\2\2\2][\3\2\2\2^g\3\2\2\2_`\f\5\2\2`a\7\17\2\2af\5\6\4\6bc\f"+
		"\4\2\2cd\7\20\2\2df\5\6\4\5e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh"+
		"\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jk\b\5\1\2k\u008a\5\n\6\2l\u008a\7&\2\2m"+
		"\u008a\5\2\2\2no\7\4\2\2op\5\b\5\2pq\7\5\2\2q\u008a\3\2\2\2rs\7\22\2\2"+
		"st\7 \2\2tu\7\23\2\2uv\7\24\2\2vw\5\b\5\2wx\7\25\2\2xy\7\22\2\2yz\7\6"+
		"\2\2z{\7 \2\2{|\7\23\2\2|\u008a\3\2\2\2}\177\5\f\7\2~\u0080\5\16\b\2\177"+
		"~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\20\t\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\22"+
		"\n\2\u0085\u008a\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088\5\b\5\3\u0088"+
		"\u008a\3\2\2\2\u0089j\3\2\2\2\u0089l\3\2\2\2\u0089m\3\2\2\2\u0089n\3\2"+
		"\2\2\u0089r\3\2\2\2\u0089}\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u0096\3\2"+
		"\2\2\u008b\u008c\f\b\2\2\u008c\u008d\7\n\2\2\u008d\u0095\5\b\5\t\u008e"+
		"\u008f\f\7\2\2\u008f\u0090\7\6\2\2\u0090\u0095\5\4\3\2\u0091\u0092\f\6"+
		"\2\2\u0092\u0093\7\7\2\2\u0093\u0095\5\4\3\2\u0094\u008b\3\2\2\2\u0094"+
		"\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\t\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7\26\2\2\u009a\u009b\7 \2\2\u009b\13\3\2\2\2\u009c\u009d\7\27\2\2\u009d"+
		"\u009e\5\n\6\2\u009e\u009f\7\30\2\2\u009f\u00a7\5\b\5\2\u00a0\u00a1\7"+
		"\n\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\5\b\5\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\r\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab"+
		"\7\31\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\7\32\2\2\u00ad\u00b5\5\b\5\2"+
		"\u00ae\u00af\7\n\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2"+
		"\5\b\5\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8\u00b9\7\33\2\2\u00b9\u00ba\5\24\13\2\u00ba\21\3\2\2\2\u00bb\u00bc"+
		"\7\34\2\2\u00bc\u00bd\5\b\5\2\u00bd\23\3\2\2\2\u00be\u00bf\b\13\1\2\u00bf"+
		"\u00c0\5\b\5\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00eb\3"+
		"\2\2\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\5\b\5\2\u00c6"+
		"\u00eb\3\2\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5\b"+
		"\5\2\u00ca\u00eb\3\2\2\2\u00cb\u00cc\5\b\5\2\u00cc\u00cd\7\16\2\2\u00cd"+
		"\u00ce\5\b\5\2\u00ce\u00eb\3\2\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\7"+
		"\4\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\7\5\2\2\u00d3\u00eb\3\2\2\2\u00d4"+
		"\u00d5\7\36\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\7\30\2\2\u00d7\u00de\5"+
		"\b\5\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\7\30\2\2\u00da\u00db\5\b\5\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\37\2\2\u00e2\u00e3\5\24\13\7\u00e3\u00eb\3\2\2\2\u00e4\u00e5"+
		"\7\4\2\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\7\5\2\2\u00e7\u00eb\3\2\2\2"+
		"\u00e8\u00e9\7\21\2\2\u00e9\u00eb\5\24\13\3\u00ea\u00be\3\2\2\2\u00ea"+
		"\u00c3\3\2\2\2\u00ea\u00c7\3\2\2\2\u00ea\u00cb\3\2\2\2\u00ea\u00cf\3\2"+
		"\2\2\u00ea\u00d4\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00f4\3\2\2\2\u00ec\u00ed\f\5\2\2\u00ed\u00ee\7\17\2\2\u00ee\u00f3\5"+
		"\24\13\6\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7\20\2\2\u00f1\u00f3\5\24\13"+
		"\5\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\25\3\2\2\2\u00f6\u00f4\3\2\2\2\24\""+
		"\60@B]eg\177\u0082\u0089\u0094\u0096\u00a7\u00b5\u00de\u00ea\u00f2\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}