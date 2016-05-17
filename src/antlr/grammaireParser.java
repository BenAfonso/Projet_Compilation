package antlr;

// Generated from grammaire.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammaireParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CONST=20, CALL=21, TYPES=22, AFFECT=23, INT=24, BOOLEAN=25, 
		WS=26, F=27, IF=28, THEN=29, ELSE=30, WHILE=31, DO=32, ID=33;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_func = 2, RULE_instructions = 3, RULE_uop = 4, 
		RULE_bop = 5, RULE_param = 6;
	public static final String[] ruleNames = {
		"prog", "expr", "func", "instructions", "uop", "bop", "param"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'('", "')'", "':'", "'skip'", "';'", "'-'", "'not'", "'+'", 
		"'x'", "'/'", "'and'", "'or'", "'<'", "'<='", "'='", "'!='", "'>='", "'>'", 
		null, null, null, "':='", null, null, null, "'f'", "'if'", "'then'", "'else'", 
		"'while'", "'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CONST", "CALL", "TYPES", 
		"AFFECT", "INT", "BOOLEAN", "WS", "F", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "ID"
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
	public String getGrammarFileName() { return "grammaire.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammaireParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(15);
					param();
					}
					}
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << CALL) | (1L << F) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(21);
					func();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				instructions(0);
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

	public static class ExprContext extends ParserRuleContext {
		public UopContext uop() {
			return getRuleContext(UopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CALL() { return getToken(grammaireParser.CALL, 0); }
		public TerminalNode F() { return getToken(grammaireParser.F, 0); }
		public TerminalNode CONST() { return getToken(grammaireParser.CONST, 0); }
		public TerminalNode ID() { return getToken(grammaireParser.ID, 0); }
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(31);
				uop();
				setState(32);
				expr(6);
				}
				break;
			case 2:
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==CALL || _la==F) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(35);
				match(T__1);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << CONST) | (1L << CALL) | (1L << F) | (1L << ID))) != 0)) {
					{
					{
					setState(36);
					expr(0);
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(43);
				match(CONST);
				}
				break;
			case 4:
				{
				setState(44);
				match(F);
				}
				break;
			case 5:
				{
				setState(45);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(48);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(49);
					bop();
					setState(50);
					expr(6);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(grammaireParser.F, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode TYPES() { return getToken(grammaireParser.TYPES, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		int _la;
		try {
			int _alt;
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(F);
				setState(58);
				match(T__1);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(59);
					param();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(T__2);
				setState(68);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(66);
					match(T__3);
					setState(67);
					match(TYPES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__0);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						param();
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				instructions(0);
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

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammaireParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(grammaireParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(grammaireParser.ELSE, 0); }
		public TerminalNode F() { return getToken(grammaireParser.F, 0); }
		public TerminalNode AFFECT() { return getToken(grammaireParser.AFFECT, 0); }
		public TerminalNode ID() { return getToken(grammaireParser.ID, 0); }
		public TerminalNode WHILE() { return getToken(grammaireParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(grammaireParser.DO, 0); }
		public TerminalNode CALL() { return getToken(grammaireParser.CALL, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		return instructions(0);
	}

	private InstructionsContext instructions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionsContext _localctx = new InstructionsContext(_ctx, _parentState);
		InstructionsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_instructions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(81);
				match(IF);
				setState(82);
				expr(0);
				setState(83);
				match(THEN);
				setState(84);
				instructions(0);
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(85);
					match(ELSE);
					setState(86);
					instructions(0);
					}
					break;
				}
				}
				break;
			case F:
				{
				setState(89);
				match(F);
				setState(90);
				match(AFFECT);
				setState(91);
				expr(0);
				}
				break;
			case ID:
				{
				setState(92);
				match(ID);
				setState(93);
				match(AFFECT);
				setState(94);
				expr(0);
				}
				break;
			case WHILE:
				{
				setState(95);
				match(WHILE);
				setState(96);
				expr(0);
				setState(97);
				match(DO);
				setState(98);
				instructions(4);
				}
				break;
			case T__4:
				{
				setState(100);
				match(T__4);
				}
				break;
			case CALL:
				{
				{
				setState(101);
				match(CALL);
				setState(102);
				match(T__1);
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << CONST) | (1L << CALL) | (1L << F) | (1L << ID))) != 0)) {
					{
					{
					setState(104);
					expr(0);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructions);
					setState(113);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(114);
					match(T__5);
					setState(115);
					instructions(3);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class UopContext extends ParserRuleContext {
		public UopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterUop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitUop(this);
		}
	}

	public final UopContext uop() throws RecognitionException {
		UopContext _localctx = new UopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_uop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaireParser.ID, 0); }
		public TerminalNode TYPES() { return getToken(grammaireParser.TYPES, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(T__3);
			setState(127);
			match(TYPES);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return instructions_sempred((InstructionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean instructions_sempred(InstructionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2"+
		"\16\2\26\13\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\5\2\37\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\3\3\5\3\61\n\3"+
		"\3\3\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\7\4?\n\4\f\4\16"+
		"\4B\13\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\5\4"+
		"Q\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\5\5r"+
		"\n\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\2\4\4\b\t\2\4\6\b\n\f\16\2\5\4\2\27\27\35\35\3\2\t\n\4\2\t\t\13"+
		"\25\u0093\2\36\3\2\2\2\4\60\3\2\2\2\6P\3\2\2\2\bq\3\2\2\2\n{\3\2\2\2\f"+
		"}\3\2\2\2\16\177\3\2\2\2\20\24\7\3\2\2\21\23\5\16\b\2\22\21\3\2\2\2\23"+
		"\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\37\3\2\2\2\26\24\3\2\2\2\27"+
		"\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\37\3\2\2\2\34\32\3\2\2\2\35\37\5\b\5\2\36\20\3\2\2\2\36\32\3\2\2\2\36"+
		"\35\3\2\2\2\37\3\3\2\2\2 !\b\3\1\2!\"\5\n\6\2\"#\5\4\3\b#\61\3\2\2\2$"+
		"%\t\2\2\2%)\7\4\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
		"\2*,\3\2\2\2+)\3\2\2\2,\61\7\5\2\2-\61\7\26\2\2.\61\7\35\2\2/\61\7#\2"+
		"\2\60 \3\2\2\2\60$\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\618\3\2"+
		"\2\2\62\63\f\7\2\2\63\64\5\f\7\2\64\65\5\4\3\b\65\67\3\2\2\2\66\62\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;<\7\35\2\2"+
		"<@\7\4\2\2=?\5\16\b\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2B@\3\2\2\2CF\7\5\2\2DE\7\6\2\2EG\7\30\2\2FD\3\2\2\2FG\3\2\2\2GQ\3\2"+
		"\2\2HL\7\3\2\2IK\5\16\b\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MQ\3"+
		"\2\2\2NL\3\2\2\2OQ\5\b\5\2P;\3\2\2\2PH\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RS"+
		"\b\5\1\2ST\7\36\2\2TU\5\4\3\2UV\7\37\2\2VY\5\b\5\2WX\7 \2\2XZ\5\b\5\2"+
		"YW\3\2\2\2YZ\3\2\2\2Zr\3\2\2\2[\\\7\35\2\2\\]\7\31\2\2]r\5\4\3\2^_\7#"+
		"\2\2_`\7\31\2\2`r\5\4\3\2ab\7!\2\2bc\5\4\3\2cd\7\"\2\2de\5\b\5\6er\3\2"+
		"\2\2fr\7\7\2\2gh\7\27\2\2hi\7\4\2\2im\3\2\2\2jl\5\4\3\2kj\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pr\7\5\2\2qR\3\2\2\2q[\3"+
		"\2\2\2q^\3\2\2\2qa\3\2\2\2qf\3\2\2\2qg\3\2\2\2rx\3\2\2\2st\f\4\2\2tu\7"+
		"\b\2\2uw\5\b\5\5vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\t\3\2\2\2zx"+
		"\3\2\2\2{|\t\3\2\2|\13\3\2\2\2}~\t\4\2\2~\r\3\2\2\2\177\u0080\7#\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0082\7\30\2\2\u0082\17\3\2\2\2\20\24\32\36)\608"+
		"@FLPYmqx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}