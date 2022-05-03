// Generated from SolidityParser.g4 by ANTLR 4.10.1
package net.aveyon.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ReservedKeywords=1, Pragma=2, Abstract=3, Anonymous=4, Address=5, As=6, 
		Assembly=7, Bool=8, Break=9, Bytes=10, Calldata=11, Catch=12, Constant=13, 
		Constructor=14, Continue=15, Contract=16, Delete=17, Do=18, Else=19, Emit=20, 
		Enum=21, Error=22, Revert=23, Event=24, External=25, Fallback=26, False=27, 
		Fixed=28, From=29, FixedBytes=30, For=31, Function=32, Global=33, Hex=34, 
		If=35, Immutable=36, Import=37, Indexed=38, Interface=39, Internal=40, 
		Is=41, Library=42, Mapping=43, Memory=44, Modifier=45, New=46, NumberUnit=47, 
		Override=48, Payable=49, Private=50, Public=51, Pure=52, Receive=53, Return=54, 
		Returns=55, SignedIntegerType=56, Storage=57, String=58, Struct=59, True=60, 
		Try=61, Type=62, Ufixed=63, Unchecked=64, UnsignedIntegerType=65, Using=66, 
		View=67, Virtual=68, While=69, LParen=70, RParen=71, LBrack=72, RBrack=73, 
		LBrace=74, RBrace=75, Colon=76, Semicolon=77, Period=78, Conditional=79, 
		DoubleArrow=80, RightArrow=81, Assign=82, AssignBitOr=83, AssignBitXor=84, 
		AssignBitAnd=85, AssignShl=86, AssignSar=87, AssignShr=88, AssignAdd=89, 
		AssignSub=90, AssignMul=91, AssignDiv=92, AssignMod=93, Comma=94, Or=95, 
		And=96, BitOr=97, BitXor=98, BitAnd=99, Shl=100, Sar=101, Shr=102, Add=103, 
		Sub=104, Mul=105, Div=106, Mod=107, Exp=108, Equal=109, NotEqual=110, 
		LessThan=111, GreaterThan=112, LessThanOrEqual=113, GreaterThanOrEqual=114, 
		Not=115, BitNot=116, Inc=117, Dec=118, DoubleQuote=119, SingleQuote=120, 
		NonEmptyStringLiteral=121, EmptyStringLiteral=122, UnicodeStringLiteral=123, 
		HexString=124, HexNumber=125, DecimalNumber=126, Identifier=127, WS=128, 
		COMMENT=129, LINE_COMMENT=130, AssemblyDialect=131, AssemblyLBrace=132, 
		AssemblyFlagString=133, AssemblyBlockLParen=134, AssemblyBlockRParen=135, 
		AssemblyBlockComma=136, AssemblyBlockWS=137, AssemblyBlockCOMMENT=138, 
		AssemblyBlockLINE_COMMENT=139, YulBreak=140, YulCase=141, YulContinue=142, 
		YulDefault=143, YulFalse=144, YulFor=145, YulFunction=146, YulIf=147, 
		YulLeave=148, YulLet=149, YulSwitch=150, YulTrue=151, YulHex=152, YulEVMBuiltin=153, 
		YulLBrace=154, YulRBrace=155, YulLParen=156, YulRParen=157, YulAssign=158, 
		YulPeriod=159, YulComma=160, YulArrow=161, YulIdentifier=162, YulHexNumber=163, 
		YulDecimalNumber=164, YulStringLiteral=165, YulHexStringLiteral=166, YulWS=167, 
		YulCOMMENT=168, YulLINE_COMMENT=169, PragmaToken=170, PragmaSemicolon=171, 
		PragmaWS=172, PragmaCOMMENT=173, PragmaLINE_COMMENT=174;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_importDirective = 2, 
		RULE_importAliases = 3, RULE_path = 4, RULE_symbolAliases = 5, RULE_contractDefinition = 6, 
		RULE_interfaceDefinition = 7, RULE_libraryDefinition = 8, RULE_inheritanceSpecifierList = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractBodyElement = 11, RULE_namedArgument = 12, 
		RULE_callArgumentList = 13, RULE_identifierPath = 14, RULE_modifierInvocation = 15, 
		RULE_visibility = 16, RULE_parameterList = 17, RULE_parameterDeclaration = 18, 
		RULE_constructorDefinition = 19, RULE_stateMutability = 20, RULE_overrideSpecifier = 21, 
		RULE_functionDefinition = 22, RULE_modifierDefinition = 23, RULE_fallbackFunctionDefinition = 24, 
		RULE_receiveFunctionDefinition = 25, RULE_structDefinition = 26, RULE_structMember = 27, 
		RULE_enumDefinition = 28, RULE_userDefinedValueTypeDefinition = 29, RULE_stateVariableDeclaration = 30, 
		RULE_constantVariableDeclaration = 31, RULE_eventParameter = 32, RULE_eventDefinition = 33, 
		RULE_errorParameter = 34, RULE_errorDefinition = 35, RULE_usingDirective = 36, 
		RULE_typeName = 37, RULE_elementaryTypeName = 38, RULE_functionTypeName = 39, 
		RULE_variableDeclaration = 40, RULE_dataLocation = 41, RULE_expression = 42, 
		RULE_assignOp = 43, RULE_tupleExpression = 44, RULE_inlineArrayExpression = 45, 
		RULE_identifier = 46, RULE_literal = 47, RULE_booleanLiteral = 48, RULE_stringLiteral = 49, 
		RULE_hexStringLiteral = 50, RULE_unicodeStringLiteral = 51, RULE_numberLiteral = 52, 
		RULE_block = 53, RULE_uncheckedBlock = 54, RULE_statement = 55, RULE_simpleStatement = 56, 
		RULE_ifStatement = 57, RULE_forStatement = 58, RULE_whileStatement = 59, 
		RULE_doWhileStatement = 60, RULE_continueStatement = 61, RULE_breakStatement = 62, 
		RULE_tryStatement = 63, RULE_catchClause = 64, RULE_returnStatement = 65, 
		RULE_emitStatement = 66, RULE_revertStatement = 67, RULE_assemblyStatement = 68, 
		RULE_assemblyFlags = 69, RULE_variableDeclarationList = 70, RULE_variableDeclarationTuple = 71, 
		RULE_variableDeclarationStatement = 72, RULE_expressionStatement = 73, 
		RULE_mappingType = 74, RULE_mappingKeyType = 75, RULE_yulStatement = 76, 
		RULE_yulBlock = 77, RULE_yulVariableDeclaration = 78, RULE_yulAssignment = 79, 
		RULE_yulIfStatement = 80, RULE_yulForStatement = 81, RULE_yulSwitchCase = 82, 
		RULE_yulSwitchStatement = 83, RULE_yulFunctionDefinition = 84, RULE_yulPath = 85, 
		RULE_yulFunctionCall = 86, RULE_yulBoolean = 87, RULE_yulLiteral = 88, 
		RULE_yulExpression = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "importDirective", "importAliases", 
			"path", "symbolAliases", "contractDefinition", "interfaceDefinition", 
			"libraryDefinition", "inheritanceSpecifierList", "inheritanceSpecifier", 
			"contractBodyElement", "namedArgument", "callArgumentList", "identifierPath", 
			"modifierInvocation", "visibility", "parameterList", "parameterDeclaration", 
			"constructorDefinition", "stateMutability", "overrideSpecifier", "functionDefinition", 
			"modifierDefinition", "fallbackFunctionDefinition", "receiveFunctionDefinition", 
			"structDefinition", "structMember", "enumDefinition", "userDefinedValueTypeDefinition", 
			"stateVariableDeclaration", "constantVariableDeclaration", "eventParameter", 
			"eventDefinition", "errorParameter", "errorDefinition", "usingDirective", 
			"typeName", "elementaryTypeName", "functionTypeName", "variableDeclaration", 
			"dataLocation", "expression", "assignOp", "tupleExpression", "inlineArrayExpression", 
			"identifier", "literal", "booleanLiteral", "stringLiteral", "hexStringLiteral", 
			"unicodeStringLiteral", "numberLiteral", "block", "uncheckedBlock", "statement", 
			"simpleStatement", "ifStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "tryStatement", "catchClause", 
			"returnStatement", "emitStatement", "revertStatement", "assemblyStatement", 
			"assemblyFlags", "variableDeclarationList", "variableDeclarationTuple", 
			"variableDeclarationStatement", "expressionStatement", "mappingType", 
			"mappingKeyType", "yulStatement", "yulBlock", "yulVariableDeclaration", 
			"yulAssignment", "yulIfStatement", "yulForStatement", "yulSwitchCase", 
			"yulSwitchStatement", "yulFunctionDefinition", "yulPath", "yulFunctionCall", 
			"yulBoolean", "yulLiteral", "yulExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pragma'", "'abstract'", "'anonymous'", "'address'", "'as'", 
			"'assembly'", "'bool'", null, "'bytes'", "'calldata'", "'catch'", "'constant'", 
			"'constructor'", null, "'contract'", "'delete'", "'do'", "'else'", "'emit'", 
			"'enum'", "'error'", "'revert'", "'event'", "'external'", "'fallback'", 
			null, null, "'from'", null, null, null, "'global'", null, null, "'immutable'", 
			"'import'", "'indexed'", "'interface'", "'internal'", "'is'", "'library'", 
			"'mapping'", "'memory'", "'modifier'", "'new'", null, "'override'", "'payable'", 
			"'private'", "'public'", "'pure'", "'receive'", "'return'", "'returns'", 
			null, "'storage'", "'string'", "'struct'", null, "'try'", "'type'", null, 
			"'unchecked'", null, "'using'", "'view'", "'virtual'", "'while'", null, 
			null, "'['", "']'", null, null, "':'", null, null, "'?'", "'=>'", null, 
			"'='", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", null, "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", 
			"'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'!'", "'~'", "'++'", "'--'", "'\"'", "'''", 
			null, null, null, null, null, null, null, null, null, null, "'\"evmasm\"'", 
			null, null, null, null, null, null, null, null, null, "'case'", null, 
			"'default'", null, null, null, null, "'leave'", "'let'", "'switch'", 
			null, null, null, null, null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ReservedKeywords", "Pragma", "Abstract", "Anonymous", "Address", 
			"As", "Assembly", "Bool", "Break", "Bytes", "Calldata", "Catch", "Constant", 
			"Constructor", "Continue", "Contract", "Delete", "Do", "Else", "Emit", 
			"Enum", "Error", "Revert", "Event", "External", "Fallback", "False", 
			"Fixed", "From", "FixedBytes", "For", "Function", "Global", "Hex", "If", 
			"Immutable", "Import", "Indexed", "Interface", "Internal", "Is", "Library", 
			"Mapping", "Memory", "Modifier", "New", "NumberUnit", "Override", "Payable", 
			"Private", "Public", "Pure", "Receive", "Return", "Returns", "SignedIntegerType", 
			"Storage", "String", "Struct", "True", "Try", "Type", "Ufixed", "Unchecked", 
			"UnsignedIntegerType", "Using", "View", "Virtual", "While", "LParen", 
			"RParen", "LBrack", "RBrack", "LBrace", "RBrace", "Colon", "Semicolon", 
			"Period", "Conditional", "DoubleArrow", "RightArrow", "Assign", "AssignBitOr", 
			"AssignBitXor", "AssignBitAnd", "AssignShl", "AssignSar", "AssignShr", 
			"AssignAdd", "AssignSub", "AssignMul", "AssignDiv", "AssignMod", "Comma", 
			"Or", "And", "BitOr", "BitXor", "BitAnd", "Shl", "Sar", "Shr", "Add", 
			"Sub", "Mul", "Div", "Mod", "Exp", "Equal", "NotEqual", "LessThan", "GreaterThan", 
			"LessThanOrEqual", "GreaterThanOrEqual", "Not", "BitNot", "Inc", "Dec", 
			"DoubleQuote", "SingleQuote", "NonEmptyStringLiteral", "EmptyStringLiteral", 
			"UnicodeStringLiteral", "HexString", "HexNumber", "DecimalNumber", "Identifier", 
			"WS", "COMMENT", "LINE_COMMENT", "AssemblyDialect", "AssemblyLBrace", 
			"AssemblyFlagString", "AssemblyBlockLParen", "AssemblyBlockRParen", "AssemblyBlockComma", 
			"AssemblyBlockWS", "AssemblyBlockCOMMENT", "AssemblyBlockLINE_COMMENT", 
			"YulBreak", "YulCase", "YulContinue", "YulDefault", "YulFalse", "YulFor", 
			"YulFunction", "YulIf", "YulLeave", "YulLet", "YulSwitch", "YulTrue", 
			"YulHex", "YulEVMBuiltin", "YulLBrace", "YulRBrace", "YulLParen", "YulRParen", 
			"YulAssign", "YulPeriod", "YulComma", "YulArrow", "YulIdentifier", "YulHexNumber", 
			"YulDecimalNumber", "YulStringLiteral", "YulHexStringLiteral", "YulWS", 
			"YulCOMMENT", "YulLINE_COMMENT", "PragmaToken", "PragmaSemicolon", "PragmaWS", 
			"PragmaCOMMENT", "PragmaLINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SolidityParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<UsingDirectiveContext> usingDirective() {
			return getRuleContexts(UsingDirectiveContext.class);
		}
		public UsingDirectiveContext usingDirective(int i) {
			return getRuleContext(UsingDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<LibraryDefinitionContext> libraryDefinition() {
			return getRuleContexts(LibraryDefinitionContext.class);
		}
		public LibraryDefinitionContext libraryDefinition(int i) {
			return getRuleContext(LibraryDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<UserDefinedValueTypeDefinitionContext> userDefinedValueTypeDefinition() {
			return getRuleContexts(UserDefinedValueTypeDefinitionContext.class);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition(int i) {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,i);
		}
		public List<ErrorDefinitionContext> errorDefinition() {
			return getRuleContexts(ErrorDefinitionContext.class);
		}
		public ErrorDefinitionContext errorDefinition(int i) {
			return getRuleContext(ErrorDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(180);
						pragmaDirective();
						}
						break;
					case 2:
						{
						setState(181);
						importDirective();
						}
						break;
					case 3:
						{
						setState(182);
						usingDirective();
						}
						break;
					case 4:
						{
						setState(183);
						contractDefinition();
						}
						break;
					case 5:
						{
						setState(184);
						interfaceDefinition();
						}
						break;
					case 6:
						{
						setState(185);
						libraryDefinition();
						}
						break;
					case 7:
						{
						setState(186);
						functionDefinition();
						}
						break;
					case 8:
						{
						setState(187);
						constantVariableDeclaration();
						}
						break;
					case 9:
						{
						setState(188);
						structDefinition();
						}
						break;
					case 10:
						{
						setState(189);
						enumDefinition();
						}
						break;
					case 11:
						{
						setState(190);
						userDefinedValueTypeDefinition();
						}
						break;
					case 12:
						{
						setState(191);
						errorDefinition();
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(197);
			match(EOF);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public TerminalNode Pragma() { return getToken(SolidityParser.Pragma, 0); }
		public TerminalNode PragmaSemicolon() { return getToken(SolidityParser.PragmaSemicolon, 0); }
		public List<TerminalNode> PragmaToken() { return getTokens(SolidityParser.PragmaToken); }
		public TerminalNode PragmaToken(int i) {
			return getToken(SolidityParser.PragmaToken, i);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Pragma);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				match(PragmaToken);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PragmaToken );
			setState(205);
			match(PragmaSemicolon);
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public IdentifierContext unitAlias;
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SymbolAliasesContext symbolAliases() {
			return getRuleContext(SymbolAliasesContext.class,0);
		}
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(Import);
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
				{
				{
				setState(208);
				path();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(209);
					match(As);
					setState(210);
					((ImportDirectiveContext)_localctx).unitAlias = identifier();
					}
				}

				}
				}
				break;
			case LBrace:
				{
				{
				setState(213);
				symbolAliases();
				setState(214);
				match(From);
				setState(215);
				path();
				}
				}
				break;
			case Mul:
				{
				{
				setState(217);
				match(Mul);
				setState(218);
				match(As);
				setState(219);
				((ImportDirectiveContext)_localctx).unitAlias = identifier();
				setState(220);
				match(From);
				setState(221);
				path();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
			match(Semicolon);
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

	public static class ImportAliasesContext extends ParserRuleContext {
		public IdentifierContext symbol;
		public IdentifierContext alias;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public ImportAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterImportAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitImportAliases(this);
		}
	}

	public final ImportAliasesContext importAliases() throws RecognitionException {
		ImportAliasesContext _localctx = new ImportAliasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((ImportAliasesContext)_localctx).symbol = identifier();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(228);
				match(As);
				setState(229);
				((ImportAliasesContext)_localctx).alias = identifier();
				}
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode NonEmptyStringLiteral() { return getToken(SolidityParser.NonEmptyStringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NonEmptyStringLiteral);
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

	public static class SymbolAliasesContext extends ParserRuleContext {
		public ImportAliasesContext importAliases;
		public List<ImportAliasesContext> aliases = new ArrayList<ImportAliasesContext>();
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ImportAliasesContext> importAliases() {
			return getRuleContexts(ImportAliasesContext.class);
		}
		public ImportAliasesContext importAliases(int i) {
			return getRuleContext(ImportAliasesContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public SymbolAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSymbolAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSymbolAliases(this);
		}
	}

	public final SymbolAliasesContext symbolAliases() throws RecognitionException {
		SymbolAliasesContext _localctx = new SymbolAliasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbolAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LBrace);
			setState(235);
			((SymbolAliasesContext)_localctx).importAliases = importAliases();
			((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(236);
				match(Comma);
				setState(237);
				((SymbolAliasesContext)_localctx).importAliases = importAliases();
				((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RBrace);
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Abstract() { return getToken(SolidityParser.Abstract, 0); }
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(245);
				match(Abstract);
				}
			}

			setState(248);
			match(Contract);
			setState(249);
			((ContractDefinitionContext)_localctx).name = identifier();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(250);
				inheritanceSpecifierList();
				}
			}

			setState(253);
			match(LBrace);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					contractBodyElement();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(260);
			match(RBrace);
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

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Interface() { return getToken(SolidityParser.Interface, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInterfaceDefinition(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Interface);
			setState(263);
			((InterfaceDefinitionContext)_localctx).name = identifier();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(264);
				inheritanceSpecifierList();
				}
			}

			setState(267);
			match(LBrace);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					contractBodyElement();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(274);
			match(RBrace);
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

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Library() { return getToken(SolidityParser.Library, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterLibraryDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitLibraryDefinition(this);
		}
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_libraryDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Library);
			setState(277);
			((LibraryDefinitionContext)_localctx).name = identifier();
			setState(278);
			match(LBrace);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					contractBodyElement();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(285);
			match(RBrace);
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

	public static class InheritanceSpecifierListContext extends ParserRuleContext {
		public InheritanceSpecifierContext inheritanceSpecifier;
		public List<InheritanceSpecifierContext> inheritanceSpecifiers = new ArrayList<InheritanceSpecifierContext>();
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InheritanceSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInheritanceSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInheritanceSpecifierList(this);
		}
	}

	public final InheritanceSpecifierListContext inheritanceSpecifierList() throws RecognitionException {
		InheritanceSpecifierListContext _localctx = new InheritanceSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inheritanceSpecifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Is);
			setState(288);
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(289);
					match(Comma);
					setState(290);
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
					}
					} 
				}
				setState(295);
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
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext name;
		public CallArgumentListContext arguments;
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((InheritanceSpecifierContext)_localctx).name = identifierPath();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LParen) {
				{
				setState(297);
				((InheritanceSpecifierContext)_localctx).arguments = callArgumentList();
				}
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

	public static class ContractBodyElementContext extends ParserRuleContext {
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FallbackFunctionDefinitionContext fallbackFunctionDefinition() {
			return getRuleContext(FallbackFunctionDefinitionContext.class,0);
		}
		public ReceiveFunctionDefinitionContext receiveFunctionDefinition() {
			return getRuleContext(ReceiveFunctionDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,0);
		}
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public ErrorDefinitionContext errorDefinition() {
			return getRuleContext(ErrorDefinitionContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public ContractBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContractBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContractBodyElement(this);
		}
	}

	public final ContractBodyElementContext contractBodyElement() throws RecognitionException {
		ContractBodyElementContext _localctx = new ContractBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractBodyElement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				constructorDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				modifierDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				fallbackFunctionDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				receiveFunctionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				structDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				userDefinedValueTypeDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(308);
				stateVariableDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(309);
				eventDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(310);
				errorDefinition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				usingDirective();
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNamedArgument(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			((NamedArgumentContext)_localctx).name = identifier();
			setState(315);
			match(Colon);
			setState(316);
			((NamedArgumentContext)_localctx).value = expression(0);
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

	public static class CallArgumentListContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitCallArgumentList(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LParen);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(319);
					expression(0);
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(320);
						match(Comma);
						setState(321);
						expression(0);
						}
						}
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(329);
				match(LBrace);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
					{
					setState(330);
					namedArgument();
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(331);
						match(Comma);
						setState(332);
						namedArgument();
						}
						}
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(340);
				match(RBrace);
				}
				break;
			}
			setState(343);
			match(RParen);
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

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Period() { return getTokens(SolidityParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(SolidityParser.Period, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIdentifierPath(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			identifier();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(Period);
					setState(347);
					identifier();
					}
					} 
				}
				setState(352);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifierInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			identifierPath();
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(354);
				callArgumentList();
				}
				break;
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode Internal() { return getToken(SolidityParser.Internal, 0); }
		public TerminalNode External() { return getToken(SolidityParser.External, 0); }
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << External) | (1L << Internal) | (1L << Private) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> parameters = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(360);
				match(Comma);
				setState(361);
				((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
				}
				}
				setState(366);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((ParameterDeclarationContext)_localctx).type = typeName(0);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(368);
				((ParameterDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
				{
				setState(371);
				((ParameterDeclarationContext)_localctx).name = identifier();
				}
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

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public boolean payableSet = false;
		public boolean visibilitySet = false;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Constructor() { return getToken(SolidityParser.Constructor, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Constructor);
			setState(375);
			match(LParen);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(376);
				((ConstructorDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(379);
			match(RParen);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(380);
						modifierInvocation();
						}
						break;
					case 2:
						{
						setState(381);
						if (!(!_localctx.payableSet)) throw new FailedPredicateException(this, "!$payableSet");
						setState(382);
						match(Payable);
						((ConstructorDefinitionContext)_localctx).payableSet =  true;
						}
						break;
					case 3:
						{
						setState(384);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(385);
						match(Internal);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(387);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(388);
						match(Public);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(395);
			((ConstructorDefinitionContext)_localctx).body = block();
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode Pure() { return getToken(SolidityParser.Pure, 0); }
		public TerminalNode View() { return getToken(SolidityParser.View, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (Payable - 49)) | (1L << (Pure - 49)) | (1L << (View - 49)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath;
		public List<IdentifierPathContext> overrides = new ArrayList<IdentifierPathContext>();
		public TerminalNode Override() { return getToken(SolidityParser.Override, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOverrideSpecifier(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(Override);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(400);
				match(LParen);
				setState(401);
				((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
				((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(402);
					match(Comma);
					setState(403);
					((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
					((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				match(RParen);
				}
				break;
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(Function);
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case Revert:
			case From:
			case Global:
			case Identifier:
				{
				setState(414);
				identifier();
				}
				break;
			case Fallback:
				{
				setState(415);
				match(Fallback);
				}
				break;
			case Receive:
				{
				setState(416);
				match(Receive);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(419);
			match(LParen);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(420);
				((FunctionDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(423);
			match(RParen);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(424);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(425);
						visibility();
						((FunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(428);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(429);
						stateMutability();
						((FunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(432);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(433);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(434);
						match(Virtual);
						((FunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(436);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(437);
						overrideSpecifier();
						((FunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(445);
				match(Returns);
				setState(446);
				match(LParen);
				setState(447);
				((FunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(448);
				match(RParen);
				}
			}

			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(452);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(453);
				((FunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public IdentifierContext name;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Modifier() { return getToken(SolidityParser.Modifier, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Modifier);
			setState(457);
			((ModifierDefinitionContext)_localctx).name = identifier();
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(458);
				match(LParen);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(459);
					((ModifierDefinitionContext)_localctx).arguments = parameterList();
					}
					break;
				}
				setState(462);
				match(RParen);
				}
				break;
			}
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(465);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(466);
						match(Virtual);
						((ModifierDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 2:
						{
						setState(468);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(469);
						overrideSpecifier();
						((ModifierDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(477);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(478);
				((ModifierDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FallbackFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public boolean hasParameters = false;
		public Token kind;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FallbackFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallbackFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFallbackFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFallbackFunctionDefinition(this);
		}
	}

	public final FallbackFunctionDefinitionContext fallbackFunctionDefinition() throws RecognitionException {
		FallbackFunctionDefinitionContext _localctx = new FallbackFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fallbackFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			((FallbackFunctionDefinitionContext)_localctx).kind = match(Fallback);
			setState(482);
			match(LParen);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(483);
				parameterList();
				 ((FallbackFunctionDefinitionContext)_localctx).hasParameters =  true; 
				}
				break;
			}
			setState(488);
			match(RParen);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(489);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(490);
						match(External);
						((FallbackFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(492);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(493);
						stateMutability();
						((FallbackFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(496);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(497);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(498);
						match(Virtual);
						((FallbackFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(500);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(501);
						overrideSpecifier();
						((FallbackFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(509);
				if (!(_localctx.hasParameters)) throw new FailedPredicateException(this, "$hasParameters");
				setState(510);
				match(Returns);
				setState(511);
				match(LParen);
				setState(512);
				((FallbackFunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(513);
				match(RParen);
				}
				break;
			case 2:
				{
				setState(515);
				if (!(!_localctx.hasParameters)) throw new FailedPredicateException(this, "!$hasParameters");
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(518);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(519);
				((FallbackFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReceiveFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public Token kind;
		public BlockContext body;
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReceiveFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterReceiveFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitReceiveFunctionDefinition(this);
		}
	}

	public final ReceiveFunctionDefinitionContext receiveFunctionDefinition() throws RecognitionException {
		ReceiveFunctionDefinitionContext _localctx = new ReceiveFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_receiveFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			((ReceiveFunctionDefinitionContext)_localctx).kind = match(Receive);
			setState(523);
			match(LParen);
			setState(524);
			match(RParen);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(525);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(526);
						match(External);
						((ReceiveFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(528);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(529);
						match(Payable);
						((ReceiveFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(531);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(532);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(533);
						match(Virtual);
						((ReceiveFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(535);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(536);
						overrideSpecifier();
						((ReceiveFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(544);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(545);
				((ReceiveFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public StructMemberContext members;
		public TerminalNode Struct() { return getToken(SolidityParser.Struct, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(Struct);
			setState(549);
			((StructDefinitionContext)_localctx).name = identifier();
			setState(550);
			match(LBrace);
			setState(552); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(551);
					((StructDefinitionContext)_localctx).members = structMember();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(554); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(556);
			match(RBrace);
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

	public static class StructMemberContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStructMember(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_structMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			((StructMemberContext)_localctx).type = typeName(0);
			setState(559);
			((StructMemberContext)_localctx).name = identifier();
			setState(560);
			match(Semicolon);
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> enumValues = new ArrayList<IdentifierContext>();
		public TerminalNode Enum() { return getToken(SolidityParser.Enum, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(Enum);
			setState(563);
			((EnumDefinitionContext)_localctx).name = identifier();
			setState(564);
			match(LBrace);
			setState(565);
			((EnumDefinitionContext)_localctx).identifier = identifier();
			((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(566);
				match(Comma);
				setState(567);
				((EnumDefinitionContext)_localctx).identifier = identifier();
				((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(RBrace);
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

	public static class UserDefinedValueTypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedValueTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUserDefinedValueTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUserDefinedValueTypeDefinition(this);
		}
	}

	public final UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() throws RecognitionException {
		UserDefinedValueTypeDefinitionContext _localctx = new UserDefinedValueTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedValueTypeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Type);
			setState(576);
			((UserDefinedValueTypeDefinitionContext)_localctx).name = identifier();
			setState(577);
			match(Is);
			setState(578);
			elementaryTypeName(true);
			setState(579);
			match(Semicolon);
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public boolean constantnessSet = false;
		public boolean visibilitySet = false;
		public boolean overrideSpecifierSet = false;
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public List<TerminalNode> Private() { return getTokens(SolidityParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SolidityParser.Private, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Constant() { return getTokens(SolidityParser.Constant); }
		public TerminalNode Constant(int i) {
			return getToken(SolidityParser.Constant, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public List<TerminalNode> Immutable() { return getTokens(SolidityParser.Immutable); }
		public TerminalNode Immutable(int i) {
			return getToken(SolidityParser.Immutable, i);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stateVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			((StateVariableDeclarationContext)_localctx).type = typeName(0);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(582);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(583);
						match(Public);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(585);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(586);
						match(Private);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 3:
						{
						setState(588);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(589);
						match(Internal);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(591);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(592);
						match(Constant);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					case 5:
						{
						setState(594);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(595);
						overrideSpecifier();
						((StateVariableDeclarationContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					case 6:
						{
						setState(598);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(599);
						match(Immutable);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(606);
			((StateVariableDeclarationContext)_localctx).name = identifier();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(607);
				match(Assign);
				setState(608);
				((StateVariableDeclarationContext)_localctx).initialValue = expression(0);
				}
			}

			setState(611);
			match(Semicolon);
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

	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Constant() { return getToken(SolidityParser.Constant, 0); }
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConstantVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConstantVariableDeclaration(this);
		}
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			((ConstantVariableDeclarationContext)_localctx).type = typeName(0);
			setState(614);
			match(Constant);
			setState(615);
			((ConstantVariableDeclarationContext)_localctx).name = identifier();
			setState(616);
			match(Assign);
			setState(617);
			((ConstantVariableDeclarationContext)_localctx).initialValue = expression(0);
			setState(618);
			match(Semicolon);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			((EventParameterContext)_localctx).type = typeName(0);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Indexed) {
				{
				setState(621);
				match(Indexed);
				}
			}

			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
				{
				setState(624);
				((EventParameterContext)_localctx).name = identifier();
				}
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public EventParameterContext eventParameter;
		public List<EventParameterContext> parameters = new ArrayList<EventParameterContext>();
		public TerminalNode Event() { return getToken(SolidityParser.Event, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Anonymous() { return getToken(SolidityParser.Anonymous, 0); }
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(Event);
			setState(628);
			((EventDefinitionContext)_localctx).name = identifier();
			setState(629);
			match(LParen);
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(630);
				((EventDefinitionContext)_localctx).eventParameter = eventParameter();
				((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(631);
					match(Comma);
					setState(632);
					((EventDefinitionContext)_localctx).eventParameter = eventParameter();
					((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(640);
			match(RParen);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Anonymous) {
				{
				setState(641);
				match(Anonymous);
				}
			}

			setState(644);
			match(Semicolon);
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

	public static class ErrorParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterErrorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitErrorParameter(this);
		}
	}

	public final ErrorParameterContext errorParameter() throws RecognitionException {
		ErrorParameterContext _localctx = new ErrorParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((ErrorParameterContext)_localctx).type = typeName(0);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
				{
				setState(647);
				((ErrorParameterContext)_localctx).name = identifier();
				}
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

	public static class ErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public ErrorParameterContext errorParameter;
		public List<ErrorParameterContext> parameters = new ArrayList<ErrorParameterContext>();
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ErrorParameterContext> errorParameter() {
			return getRuleContexts(ErrorParameterContext.class);
		}
		public ErrorParameterContext errorParameter(int i) {
			return getRuleContext(ErrorParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterErrorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitErrorDefinition(this);
		}
	}

	public final ErrorDefinitionContext errorDefinition() throws RecognitionException {
		ErrorDefinitionContext _localctx = new ErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_errorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(Error);
			setState(651);
			((ErrorDefinitionContext)_localctx).name = identifier();
			setState(652);
			match(LParen);
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(653);
				((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
				((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(654);
					match(Comma);
					setState(655);
					((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
					((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(663);
			match(RParen);
			setState(664);
			match(Semicolon);
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

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(SolidityParser.Using, 0); }
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Global() { return getToken(SolidityParser.Global, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUsingDirective(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(Using);
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case Revert:
			case From:
			case Global:
			case Identifier:
				{
				setState(667);
				identifierPath();
				}
				break;
			case LBrace:
				{
				{
				setState(668);
				match(LBrace);
				setState(669);
				identifierPath();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(670);
					match(Comma);
					setState(671);
					identifierPath();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(677);
				match(RBrace);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(681);
			match(For);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(682);
				match(Mul);
				}
				break;
			case 2:
				{
				setState(683);
				typeName(0);
				}
				break;
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Global) {
				{
				setState(686);
				match(Global);
				}
			}

			setState(689);
			match(Semicolon);
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

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingTypeContext mappingType() {
			return getRuleContext(MappingTypeContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(692);
				elementaryTypeName(true);
				}
				break;
			case 2:
				{
				setState(693);
				functionTypeName();
				}
				break;
			case 3:
				{
				setState(694);
				mappingType();
				}
				break;
			case 4:
				{
				setState(695);
				identifierPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(698);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(699);
					match(LBrack);
					setState(701);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(700);
						expression(0);
						}
						break;
					}
					setState(703);
					match(RBrack);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public boolean allowAddressPayable;
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public TerminalNode Bool() { return getToken(SolidityParser.Bool, 0); }
		public TerminalNode String() { return getToken(SolidityParser.String, 0); }
		public TerminalNode Bytes() { return getToken(SolidityParser.Bytes, 0); }
		public TerminalNode SignedIntegerType() { return getToken(SolidityParser.SignedIntegerType, 0); }
		public TerminalNode UnsignedIntegerType() { return getToken(SolidityParser.UnsignedIntegerType, 0); }
		public TerminalNode FixedBytes() { return getToken(SolidityParser.FixedBytes, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState, boolean allowAddressPayable) {
			super(parent, invokingState);
			this.allowAddressPayable = allowAddressPayable;
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName(boolean allowAddressPayable) throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState(), allowAddressPayable);
		enterRule(_localctx, 76, RULE_elementaryTypeName);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(Address);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				if (!(_localctx.allowAddressPayable)) throw new FailedPredicateException(this, "$allowAddressPayable");
				setState(711);
				match(Address);
				setState(712);
				match(Payable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				match(Bool);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(715);
				match(Bytes);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(716);
				match(SignedIntegerType);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(717);
				match(UnsignedIntegerType);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(718);
				match(FixedBytes);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(719);
				match(Fixed);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(720);
				match(Ufixed);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(Function);
			setState(724);
			match(LParen);
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(725);
				((FunctionTypeNameContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(728);
			match(RParen);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(729);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(730);
						visibility();
						((FunctionTypeNameContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(733);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(734);
						stateMutability();
						((FunctionTypeNameContext)_localctx).mutabilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(742);
				match(Returns);
				setState(743);
				match(LParen);
				setState(744);
				((FunctionTypeNameContext)_localctx).returnParameters = parameterList();
				setState(745);
				match(RParen);
				}
				break;
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			((VariableDeclarationContext)_localctx).type = typeName(0);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(750);
				((VariableDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(753);
			((VariableDeclarationContext)_localctx).name = identifier();
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

	public static class DataLocationContext extends ParserRuleContext {
		public TerminalNode Memory() { return getToken(SolidityParser.Memory, 0); }
		public TerminalNode Storage() { return getToken(SolidityParser.Storage, 0); }
		public TerminalNode Calldata() { return getToken(SolidityParser.Calldata, 0); }
		public DataLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterDataLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitDataLocation(this);
		}
	}

	public final DataLocationContext dataLocation() throws RecognitionException {
		DataLocationContext _localctx = new DataLocationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPrefixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public TerminalNode Not() { return getToken(SolidityParser.Not, 0); }
		public TerminalNode BitNot() { return getToken(SolidityParser.BitNot, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public UnaryPrefixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnaryPrefixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnaryPrefixOperation(this);
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPrimaryExpression(this);
		}
	}
	public static class OrderComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(SolidityParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(SolidityParser.GreaterThan, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(SolidityParser.LessThanOrEqual, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(SolidityParser.GreaterThanOrEqual, 0); }
		public OrderComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOrderComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOrderComparison(this);
		}
	}
	public static class ConditionalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Conditional() { return getToken(SolidityParser.Conditional, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public ConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConditional(this);
		}
	}
	public static class PayableConversionContext extends ExpressionContext {
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public PayableConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPayableConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPayableConversion(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssignment(this);
		}
	}
	public static class UnarySuffixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public UnarySuffixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnarySuffixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnarySuffixOperation(this);
		}
	}
	public static class ShiftOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Shl() { return getToken(SolidityParser.Shl, 0); }
		public TerminalNode Sar() { return getToken(SolidityParser.Sar, 0); }
		public TerminalNode Shr() { return getToken(SolidityParser.Shr, 0); }
		public ShiftOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterShiftOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitShiftOperation(this);
		}
	}
	public static class BitAndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(SolidityParser.BitAnd, 0); }
		public BitAndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitAndOperation(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionCall(this);
		}
	}
	public static class IndexRangeAccessContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexRangeAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIndexRangeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIndexRangeAccess(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNewExpression(this);
		}
	}
	public static class IndexAccessContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIndexAccess(this);
		}
	}
	public static class AddSubOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(SolidityParser.Add, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public AddSubOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAddSubOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAddSubOperation(this);
		}
	}
	public static class BitOrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(SolidityParser.BitOr, 0); }
		public BitOrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitOrOperation(this);
		}
	}
	public static class ExpOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Exp() { return getToken(SolidityParser.Exp, 0); }
		public ExpOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterExpOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitExpOperation(this);
		}
	}
	public static class AndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(SolidityParser.And, 0); }
		public AndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAndOperation(this);
		}
	}
	public static class InlineArrayContext extends ExpressionContext {
		public InlineArrayExpressionContext inlineArrayExpression() {
			return getRuleContext(InlineArrayExpressionContext.class,0);
		}
		public InlineArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInlineArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInlineArray(this);
		}
	}
	public static class OrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(SolidityParser.Or, 0); }
		public OrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOrOperation(this);
		}
	}
	public static class MemberAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Period() { return getToken(SolidityParser.Period, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public MemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMemberAccess(this);
		}
	}
	public static class MulDivModOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode Div() { return getToken(SolidityParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SolidityParser.Mod, 0); }
		public MulDivModOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMulDivModOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMulDivModOperation(this);
		}
	}
	public static class FunctionCallOptionsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public FunctionCallOptionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionCallOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionCallOptions(this);
		}
	}
	public static class BitXorOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitXor() { return getToken(SolidityParser.BitXor, 0); }
		public BitXorOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitXorOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitXorOperation(this);
		}
	}
	public static class TupleContext extends ExpressionContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTuple(this);
		}
	}
	public static class EqualityComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(SolidityParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SolidityParser.NotEqual, 0); }
		public EqualityComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEqualityComparison(this);
		}
	}
	public static class MetaTypeContext extends ExpressionContext {
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MetaTypeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMetaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMetaType(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				_localctx = new PayableConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(758);
				match(Payable);
				setState(759);
				callArgumentList();
				}
				break;
			case 2:
				{
				_localctx = new MetaTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(760);
				match(Type);
				setState(761);
				match(LParen);
				setState(762);
				typeName(0);
				setState(763);
				match(RParen);
				}
				break;
			case 3:
				{
				_localctx = new UnaryPrefixOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(765);
				_la = _input.LA(1);
				if ( !(_la==Delete || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Sub - 104)) | (1L << (Not - 104)) | (1L << (BitNot - 104)) | (1L << (Inc - 104)) | (1L << (Dec - 104)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(766);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(767);
				match(New);
				setState(768);
				typeName(0);
				}
				break;
			case 5:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(769);
				tupleExpression();
				}
				break;
			case 6:
				{
				_localctx = new InlineArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(770);
				inlineArrayExpression();
				}
				break;
			case 7:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(771);
					identifier();
					}
					break;
				case 2:
					{
					setState(772);
					literal();
					}
					break;
				case 3:
					{
					setState(773);
					elementaryTypeName(false);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(778);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(779);
						match(Exp);
						setState(780);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(782);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (Mul - 105)) | (1L << (Div - 105)) | (1L << (Mod - 105)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(783);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(785);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(786);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ShiftOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(788);
						_la = _input.LA(1);
						if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (Shl - 100)) | (1L << (Sar - 100)) | (1L << (Shr - 100)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(789);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BitAndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(791);
						match(BitAnd);
						setState(792);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BitXorOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(794);
						match(BitXor);
						setState(795);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BitOrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(797);
						match(BitOr);
						setState(798);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new OrderComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(800);
						_la = _input.LA(1);
						if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (LessThan - 111)) | (1L << (GreaterThan - 111)) | (1L << (LessThanOrEqual - 111)) | (1L << (GreaterThanOrEqual - 111)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(801);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EqualityComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(803);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(804);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new AndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(806);
						match(And);
						setState(807);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new OrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(808);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(809);
						match(Or);
						setState(810);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(812);
						match(Conditional);
						setState(813);
						expression(0);
						setState(814);
						match(Colon);
						setState(815);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(817);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(818);
						assignOp();
						setState(819);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(821);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(822);
						match(LBrack);
						setState(824);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(823);
							((IndexAccessContext)_localctx).index = expression(0);
							}
							break;
						}
						setState(826);
						match(RBrack);
						}
						break;
					case 15:
						{
						_localctx = new IndexRangeAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(827);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(828);
						match(LBrack);
						setState(830);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(829);
							((IndexRangeAccessContext)_localctx).start = expression(0);
							}
							break;
						}
						setState(832);
						match(Colon);
						setState(834);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(833);
							((IndexRangeAccessContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(836);
						match(RBrack);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(837);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(838);
						match(Period);
						setState(841);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Error:
						case Revert:
						case From:
						case Global:
						case Identifier:
							{
							setState(839);
							identifier();
							}
							break;
						case Address:
							{
							setState(840);
							match(Address);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new FunctionCallOptionsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(843);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(844);
						match(LBrace);
						setState(853);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
							{
							setState(845);
							namedArgument();
							setState(850);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(846);
								match(Comma);
								setState(847);
								namedArgument();
								}
								}
								setState(852);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(855);
						match(RBrace);
						}
						break;
					case 18:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(856);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(857);
						callArgumentList();
						}
						break;
					case 19:
						{
						_localctx = new UnarySuffixOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(858);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(859);
						_la = _input.LA(1);
						if ( !(_la==Inc || _la==Dec) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode AssignBitOr() { return getToken(SolidityParser.AssignBitOr, 0); }
		public TerminalNode AssignBitXor() { return getToken(SolidityParser.AssignBitXor, 0); }
		public TerminalNode AssignBitAnd() { return getToken(SolidityParser.AssignBitAnd, 0); }
		public TerminalNode AssignShl() { return getToken(SolidityParser.AssignShl, 0); }
		public TerminalNode AssignSar() { return getToken(SolidityParser.AssignSar, 0); }
		public TerminalNode AssignShr() { return getToken(SolidityParser.AssignShr, 0); }
		public TerminalNode AssignAdd() { return getToken(SolidityParser.AssignAdd, 0); }
		public TerminalNode AssignSub() { return getToken(SolidityParser.AssignSub, 0); }
		public TerminalNode AssignMul() { return getToken(SolidityParser.AssignMul, 0); }
		public TerminalNode AssignDiv() { return getToken(SolidityParser.AssignDiv, 0); }
		public TerminalNode AssignMod() { return getToken(SolidityParser.AssignMod, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Assign - 82)) | (1L << (AssignBitOr - 82)) | (1L << (AssignBitXor - 82)) | (1L << (AssignBitAnd - 82)) | (1L << (AssignShl - 82)) | (1L << (AssignSar - 82)) | (1L << (AssignShr - 82)) | (1L << (AssignAdd - 82)) | (1L << (AssignSub - 82)) | (1L << (AssignMul - 82)) | (1L << (AssignDiv - 82)) | (1L << (AssignMod - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(LParen);
			{
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(868);
				expression(0);
				}
				break;
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(871);
				match(Comma);
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(872);
					expression(0);
					}
					break;
				}
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(880);
			match(RParen);
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

	public static class InlineArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InlineArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInlineArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInlineArrayExpression(this);
		}
	}

	public final InlineArrayExpressionContext inlineArrayExpression() throws RecognitionException {
		InlineArrayExpressionContext _localctx = new InlineArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineArrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LBrack);
			{
			setState(883);
			expression(0);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(884);
				match(Comma);
				setState(885);
				expression(0);
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(891);
			match(RBrack);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public TerminalNode Global() { return getToken(SolidityParser.Global, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public HexStringLiteralContext hexStringLiteral() {
			return getRuleContext(HexStringLiteralContext.class,0);
		}
		public UnicodeStringLiteralContext unicodeStringLiteral() {
			return getRuleContext(UnicodeStringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
			case EmptyStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				stringLiteral();
				}
				break;
			case HexNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				numberLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				booleanLiteral();
				}
				break;
			case HexString:
				enterOuterAlt(_localctx, 4);
				{
				setState(898);
				hexStringLiteral();
				}
				break;
			case UnicodeStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(899);
				unicodeStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(SolidityParser.True, 0); }
		public TerminalNode False() { return getToken(SolidityParser.False, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NonEmptyStringLiteral() { return getTokens(SolidityParser.NonEmptyStringLiteral); }
		public TerminalNode NonEmptyStringLiteral(int i) {
			return getToken(SolidityParser.NonEmptyStringLiteral, i);
		}
		public List<TerminalNode> EmptyStringLiteral() { return getTokens(SolidityParser.EmptyStringLiteral); }
		public TerminalNode EmptyStringLiteral(int i) {
			return getToken(SolidityParser.EmptyStringLiteral, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(905); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(904);
					_la = _input.LA(1);
					if ( !(_la==NonEmptyStringLiteral || _la==EmptyStringLiteral) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(907); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class HexStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexString() { return getTokens(SolidityParser.HexString); }
		public TerminalNode HexString(int i) {
			return getToken(SolidityParser.HexString, i);
		}
		public HexStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterHexStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitHexStringLiteral(this);
		}
	}

	public final HexStringLiteralContext hexStringLiteral() throws RecognitionException {
		HexStringLiteralContext _localctx = new HexStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_hexStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(909);
					match(HexString);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(912); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UnicodeStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> UnicodeStringLiteral() { return getTokens(SolidityParser.UnicodeStringLiteral); }
		public TerminalNode UnicodeStringLiteral(int i) {
			return getToken(SolidityParser.UnicodeStringLiteral, i);
		}
		public UnicodeStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnicodeStringLiteral(this);
		}
	}

	public final UnicodeStringLiteralContext unicodeStringLiteral() throws RecognitionException {
		UnicodeStringLiteralContext _localctx = new UnicodeStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unicodeStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(914);
					match(UnicodeStringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(917); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_la = _input.LA(1);
			if ( !(_la==HexNumber || _la==DecimalNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(920);
				match(NumberUnit);
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(LBrace);
			setState(928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(926);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(924);
						statement();
						}
						break;
					case 2:
						{
						setState(925);
						uncheckedBlock();
						}
						break;
					}
					} 
				}
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(931);
			match(RBrace);
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

	public static class UncheckedBlockContext extends ParserRuleContext {
		public TerminalNode Unchecked() { return getToken(SolidityParser.Unchecked, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUncheckedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUncheckedBlock(this);
		}
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(Unchecked);
			setState(934);
			block();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public AssemblyStatementContext assemblyStatement() {
			return getRuleContext(AssemblyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statement);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				simpleStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(939);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(940);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(941);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(942);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(943);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(944);
				tryStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(945);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(946);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(947);
				revertStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(948);
				assemblyStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_simpleStatement);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				expressionStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(If);
			setState(956);
			match(LParen);
			setState(957);
			expression(0);
			setState(958);
			match(RParen);
			setState(959);
			statement();
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(960);
				match(Else);
				setState(961);
				statement();
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SolidityParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SolidityParser.Semicolon, i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(For);
			setState(965);
			match(LParen);
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(966);
				simpleStatement();
				}
				break;
			case 2:
				{
				setState(967);
				match(Semicolon);
				}
				break;
			}
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(970);
				expressionStatement();
				}
				break;
			case 2:
				{
				setState(971);
				match(Semicolon);
				}
				break;
			}
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(974);
				expression(0);
				}
				break;
			}
			setState(977);
			match(RParen);
			setState(978);
			statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(While);
			setState(981);
			match(LParen);
			setState(982);
			expression(0);
			setState(983);
			match(RParen);
			setState(984);
			statement();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(Do);
			setState(987);
			statement();
			setState(988);
			match(While);
			setState(989);
			match(LParen);
			setState(990);
			expression(0);
			setState(991);
			match(RParen);
			setState(992);
			match(Semicolon);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(Continue);
			setState(995);
			match(Semicolon);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(Break);
			setState(998);
			match(Semicolon);
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

	public static class TryStatementContext extends ParserRuleContext {
		public ParameterListContext returnParameters;
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(Try);
			setState(1001);
			expression(0);
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(1002);
				match(Returns);
				setState(1003);
				match(LParen);
				setState(1004);
				((TryStatementContext)_localctx).returnParameters = parameterList();
				setState(1005);
				match(RParen);
				}
			}

			setState(1009);
			block();
			setState(1011); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1010);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1013); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext arguments;
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(Catch);
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==LParen || _la==Identifier) {
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From) | (1L << Global))) != 0) || _la==Identifier) {
					{
					setState(1016);
					identifier();
					}
				}

				setState(1019);
				match(LParen);
				{
				setState(1020);
				((CatchClauseContext)_localctx).arguments = parameterList();
				}
				setState(1021);
				match(RParen);
				}
			}

			setState(1025);
			block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Return);
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1028);
				expression(0);
				}
				break;
			}
			setState(1031);
			match(Semicolon);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public TerminalNode Emit() { return getToken(SolidityParser.Emit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(Emit);
			setState(1034);
			expression(0);
			setState(1035);
			callArgumentList();
			setState(1036);
			match(Semicolon);
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

	public static class RevertStatementContext extends ParserRuleContext {
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitRevertStatement(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(Revert);
			setState(1039);
			expression(0);
			setState(1040);
			callArgumentList();
			setState(1041);
			match(Semicolon);
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

	public static class AssemblyStatementContext extends ParserRuleContext {
		public TerminalNode Assembly() { return getToken(SolidityParser.Assembly, 0); }
		public TerminalNode AssemblyLBrace() { return getToken(SolidityParser.AssemblyLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public TerminalNode AssemblyDialect() { return getToken(SolidityParser.AssemblyDialect, 0); }
		public AssemblyFlagsContext assemblyFlags() {
			return getRuleContext(AssemblyFlagsContext.class,0);
		}
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public AssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssemblyStatement(this);
		}
	}

	public final AssemblyStatementContext assemblyStatement() throws RecognitionException {
		AssemblyStatementContext _localctx = new AssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(Assembly);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyDialect) {
				{
				setState(1044);
				match(AssemblyDialect);
				}
			}

			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyBlockLParen) {
				{
				setState(1047);
				assemblyFlags();
				}
			}

			setState(1050);
			match(AssemblyLBrace);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (YulBreak - 140)) | (1L << (YulContinue - 140)) | (1L << (YulFor - 140)) | (1L << (YulFunction - 140)) | (1L << (YulIf - 140)) | (1L << (YulLeave - 140)) | (1L << (YulLet - 140)) | (1L << (YulSwitch - 140)) | (1L << (YulEVMBuiltin - 140)) | (1L << (YulLBrace - 140)) | (1L << (YulIdentifier - 140)))) != 0)) {
				{
				{
				setState(1051);
				yulStatement();
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1057);
			match(YulRBrace);
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

	public static class AssemblyFlagsContext extends ParserRuleContext {
		public TerminalNode AssemblyBlockLParen() { return getToken(SolidityParser.AssemblyBlockLParen, 0); }
		public List<TerminalNode> AssemblyFlagString() { return getTokens(SolidityParser.AssemblyFlagString); }
		public TerminalNode AssemblyFlagString(int i) {
			return getToken(SolidityParser.AssemblyFlagString, i);
		}
		public TerminalNode AssemblyBlockRParen() { return getToken(SolidityParser.AssemblyBlockRParen, 0); }
		public List<TerminalNode> AssemblyBlockComma() { return getTokens(SolidityParser.AssemblyBlockComma); }
		public TerminalNode AssemblyBlockComma(int i) {
			return getToken(SolidityParser.AssemblyBlockComma, i);
		}
		public AssemblyFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFlags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssemblyFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssemblyFlags(this);
		}
	}

	public final AssemblyFlagsContext assemblyFlags() throws RecognitionException {
		AssemblyFlagsContext _localctx = new AssemblyFlagsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyFlags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(AssemblyBlockLParen);
			setState(1060);
			match(AssemblyFlagString);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AssemblyBlockComma) {
				{
				{
				setState(1061);
				match(AssemblyBlockComma);
				setState(1062);
				match(AssemblyFlagString);
				}
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1068);
			match(AssemblyBlockRParen);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1071);
				match(Comma);
				setState(1072);
				((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
				((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
				}
				}
				setState(1077);
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

	public static class VariableDeclarationTupleContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationTuple(this);
		}
	}

	public final VariableDeclarationTupleContext variableDeclarationTuple() throws RecognitionException {
		VariableDeclarationTupleContext _localctx = new VariableDeclarationTupleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableDeclarationTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(LParen);
			{
			setState(1082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1079);
					match(Comma);
					}
					} 
				}
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(1085);
			((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
			}
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1087);
				match(Comma);
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1088);
					((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
					((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
					}
					break;
				}
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
			match(RParen);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationTupleContext variableDeclarationTuple() {
			return getRuleContext(VariableDeclarationTupleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				{
				setState(1098);
				variableDeclaration();
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1099);
					match(Assign);
					setState(1100);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1103);
				variableDeclarationTuple();
				setState(1104);
				match(Assign);
				setState(1105);
				expression(0);
				}
				}
				break;
			}
			setState(1109);
			match(Semicolon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			expression(0);
			setState(1112);
			match(Semicolon);
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

	public static class MappingTypeContext extends ParserRuleContext {
		public MappingKeyTypeContext key;
		public TypeNameContext value;
		public TerminalNode Mapping() { return getToken(SolidityParser.Mapping, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode DoubleArrow() { return getToken(SolidityParser.DoubleArrow, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MappingKeyTypeContext mappingKeyType() {
			return getRuleContext(MappingKeyTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMappingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMappingType(this);
		}
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_mappingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(Mapping);
			setState(1115);
			match(LParen);
			setState(1116);
			((MappingTypeContext)_localctx).key = mappingKeyType();
			setState(1117);
			match(DoubleArrow);
			setState(1118);
			((MappingTypeContext)_localctx).value = typeName(0);
			setState(1119);
			match(RParen);
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

	public static class MappingKeyTypeContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public MappingKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMappingKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMappingKeyType(this);
		}
	}

	public final MappingKeyTypeContext mappingKeyType() throws RecognitionException {
		MappingKeyTypeContext _localctx = new MappingKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_mappingKeyType);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				elementaryTypeName(false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				identifierPath();
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

	public static class YulStatementContext extends ParserRuleContext {
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulVariableDeclarationContext yulVariableDeclaration() {
			return getRuleContext(YulVariableDeclarationContext.class,0);
		}
		public YulAssignmentContext yulAssignment() {
			return getRuleContext(YulAssignmentContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulIfStatementContext yulIfStatement() {
			return getRuleContext(YulIfStatementContext.class,0);
		}
		public YulForStatementContext yulForStatement() {
			return getRuleContext(YulForStatementContext.class,0);
		}
		public YulSwitchStatementContext yulSwitchStatement() {
			return getRuleContext(YulSwitchStatementContext.class,0);
		}
		public TerminalNode YulLeave() { return getToken(SolidityParser.YulLeave, 0); }
		public TerminalNode YulBreak() { return getToken(SolidityParser.YulBreak, 0); }
		public TerminalNode YulContinue() { return getToken(SolidityParser.YulContinue, 0); }
		public YulFunctionDefinitionContext yulFunctionDefinition() {
			return getRuleContext(YulFunctionDefinitionContext.class,0);
		}
		public YulStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulStatement(this);
		}
	}

	public final YulStatementContext yulStatement() throws RecognitionException {
		YulStatementContext _localctx = new YulStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_yulStatement);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				yulBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				yulVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				yulAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1128);
				yulFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1129);
				yulIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1130);
				yulForStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1131);
				yulSwitchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1132);
				match(YulLeave);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1133);
				match(YulBreak);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1134);
				match(YulContinue);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1135);
				yulFunctionDefinition();
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

	public static class YulBlockContext extends ParserRuleContext {
		public TerminalNode YulLBrace() { return getToken(SolidityParser.YulLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public YulBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulBlock(this);
		}
	}

	public final YulBlockContext yulBlock() throws RecognitionException {
		YulBlockContext _localctx = new YulBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_yulBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(YulLBrace);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (YulBreak - 140)) | (1L << (YulContinue - 140)) | (1L << (YulFor - 140)) | (1L << (YulFunction - 140)) | (1L << (YulIf - 140)) | (1L << (YulLeave - 140)) | (1L << (YulLet - 140)) | (1L << (YulSwitch - 140)) | (1L << (YulEVMBuiltin - 140)) | (1L << (YulLBrace - 140)) | (1L << (YulIdentifier - 140)))) != 0)) {
				{
				{
				setState(1139);
				yulStatement();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1145);
			match(YulRBrace);
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

	public static class YulVariableDeclarationContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> variables = new ArrayList<Token>();
		public TerminalNode YulLet() { return getToken(SolidityParser.YulLet, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulVariableDeclaration(this);
		}
	}

	public final YulVariableDeclarationContext yulVariableDeclaration() throws RecognitionException {
		YulVariableDeclarationContext _localctx = new YulVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_yulVariableDeclaration);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1147);
				match(YulLet);
				setState(1148);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1149);
					match(YulAssign);
					setState(1150);
					yulExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1153);
				match(YulLet);
				setState(1154);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1155);
					match(YulComma);
					setState(1156);
					((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
					}
					}
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1162);
					match(YulAssign);
					setState(1163);
					yulFunctionCall();
					}
				}

				}
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

	public static class YulAssignmentContext extends ParserRuleContext {
		public List<YulPathContext> yulPath() {
			return getRuleContexts(YulPathContext.class);
		}
		public YulPathContext yulPath(int i) {
			return getRuleContext(YulPathContext.class,i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulAssignment(this);
		}
	}

	public final YulAssignmentContext yulAssignment() throws RecognitionException {
		YulAssignmentContext _localctx = new YulAssignmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yulAssignment);
		int _la;
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				yulPath();
				setState(1169);
				match(YulAssign);
				setState(1170);
				yulExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1172);
				yulPath();
				setState(1175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1173);
					match(YulComma);
					setState(1174);
					yulPath();
					}
					}
					setState(1177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulComma );
				}
				setState(1179);
				match(YulAssign);
				setState(1180);
				yulFunctionCall();
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

	public static class YulIfStatementContext extends ParserRuleContext {
		public YulExpressionContext cond;
		public YulBlockContext body;
		public TerminalNode YulIf() { return getToken(SolidityParser.YulIf, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulIfStatement(this);
		}
	}

	public final YulIfStatementContext yulIfStatement() throws RecognitionException {
		YulIfStatementContext _localctx = new YulIfStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_yulIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(YulIf);
			setState(1185);
			((YulIfStatementContext)_localctx).cond = yulExpression();
			setState(1186);
			((YulIfStatementContext)_localctx).body = yulBlock();
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

	public static class YulForStatementContext extends ParserRuleContext {
		public YulBlockContext init;
		public YulExpressionContext cond;
		public YulBlockContext post;
		public YulBlockContext body;
		public TerminalNode YulFor() { return getToken(SolidityParser.YulFor, 0); }
		public List<YulBlockContext> yulBlock() {
			return getRuleContexts(YulBlockContext.class);
		}
		public YulBlockContext yulBlock(int i) {
			return getRuleContext(YulBlockContext.class,i);
		}
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulForStatement(this);
		}
	}

	public final YulForStatementContext yulForStatement() throws RecognitionException {
		YulForStatementContext _localctx = new YulForStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_yulForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(YulFor);
			setState(1189);
			((YulForStatementContext)_localctx).init = yulBlock();
			setState(1190);
			((YulForStatementContext)_localctx).cond = yulExpression();
			setState(1191);
			((YulForStatementContext)_localctx).post = yulBlock();
			setState(1192);
			((YulForStatementContext)_localctx).body = yulBlock();
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

	public static class YulSwitchCaseContext extends ParserRuleContext {
		public TerminalNode YulCase() { return getToken(SolidityParser.YulCase, 0); }
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulSwitchCase(this);
		}
	}

	public final YulSwitchCaseContext yulSwitchCase() throws RecognitionException {
		YulSwitchCaseContext _localctx = new YulSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_yulSwitchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(YulCase);
			setState(1195);
			yulLiteral();
			setState(1196);
			yulBlock();
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

	public static class YulSwitchStatementContext extends ParserRuleContext {
		public TerminalNode YulSwitch() { return getToken(SolidityParser.YulSwitch, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public TerminalNode YulDefault() { return getToken(SolidityParser.YulDefault, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public List<YulSwitchCaseContext> yulSwitchCase() {
			return getRuleContexts(YulSwitchCaseContext.class);
		}
		public YulSwitchCaseContext yulSwitchCase(int i) {
			return getRuleContext(YulSwitchCaseContext.class,i);
		}
		public YulSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulSwitchStatement(this);
		}
	}

	public final YulSwitchStatementContext yulSwitchStatement() throws RecognitionException {
		YulSwitchStatementContext _localctx = new YulSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_yulSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(YulSwitch);
			setState(1199);
			yulExpression();
			setState(1211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulCase:
				{
				{
				setState(1201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1200);
					yulSwitchCase();
					}
					}
					setState(1203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulCase );
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulDefault) {
					{
					setState(1205);
					match(YulDefault);
					setState(1206);
					yulBlock();
					}
				}

				}
				}
				break;
			case YulDefault:
				{
				{
				setState(1209);
				match(YulDefault);
				setState(1210);
				yulBlock();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class YulFunctionDefinitionContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> arguments = new ArrayList<Token>();
		public List<Token> returnParameters = new ArrayList<Token>();
		public YulBlockContext body;
		public TerminalNode YulFunction() { return getToken(SolidityParser.YulFunction, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public TerminalNode YulArrow() { return getToken(SolidityParser.YulArrow, 0); }
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulFunctionDefinition(this);
		}
	}

	public final YulFunctionDefinitionContext yulFunctionDefinition() throws RecognitionException {
		YulFunctionDefinitionContext _localctx = new YulFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_yulFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(YulFunction);
			setState(1214);
			match(YulIdentifier);
			setState(1215);
			match(YulLParen);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulIdentifier) {
				{
				setState(1216);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1217);
					match(YulComma);
					setState(1218);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1226);
			match(YulRParen);
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulArrow) {
				{
				setState(1227);
				match(YulArrow);
				setState(1228);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1229);
					match(YulComma);
					setState(1230);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1238);
			((YulFunctionDefinitionContext)_localctx).body = yulBlock();
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

	public static class YulPathContext extends ParserRuleContext {
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public List<TerminalNode> YulPeriod() { return getTokens(SolidityParser.YulPeriod); }
		public TerminalNode YulPeriod(int i) {
			return getToken(SolidityParser.YulPeriod, i);
		}
		public List<TerminalNode> YulEVMBuiltin() { return getTokens(SolidityParser.YulEVMBuiltin); }
		public TerminalNode YulEVMBuiltin(int i) {
			return getToken(SolidityParser.YulEVMBuiltin, i);
		}
		public YulPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulPath(this);
		}
	}

	public final YulPathContext yulPath() throws RecognitionException {
		YulPathContext _localctx = new YulPathContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yulPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(YulIdentifier);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YulPeriod) {
				{
				{
				setState(1241);
				match(YulPeriod);
				setState(1242);
				_la = _input.LA(1);
				if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1247);
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

	public static class YulFunctionCallContext extends ParserRuleContext {
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public TerminalNode YulIdentifier() { return getToken(SolidityParser.YulIdentifier, 0); }
		public TerminalNode YulEVMBuiltin() { return getToken(SolidityParser.YulEVMBuiltin, 0); }
		public List<YulExpressionContext> yulExpression() {
			return getRuleContexts(YulExpressionContext.class);
		}
		public YulExpressionContext yulExpression(int i) {
			return getRuleContext(YulExpressionContext.class,i);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulFunctionCall(this);
		}
	}

	public final YulFunctionCallContext yulFunctionCall() throws RecognitionException {
		YulFunctionCallContext _localctx = new YulFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yulFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_la = _input.LA(1);
			if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1249);
			match(YulLParen);
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (YulFalse - 144)) | (1L << (YulTrue - 144)) | (1L << (YulEVMBuiltin - 144)) | (1L << (YulIdentifier - 144)) | (1L << (YulHexNumber - 144)) | (1L << (YulDecimalNumber - 144)) | (1L << (YulStringLiteral - 144)) | (1L << (YulHexStringLiteral - 144)))) != 0)) {
				{
				setState(1250);
				yulExpression();
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1251);
					match(YulComma);
					setState(1252);
					yulExpression();
					}
					}
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1260);
			match(YulRParen);
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

	public static class YulBooleanContext extends ParserRuleContext {
		public TerminalNode YulTrue() { return getToken(SolidityParser.YulTrue, 0); }
		public TerminalNode YulFalse() { return getToken(SolidityParser.YulFalse, 0); }
		public YulBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulBoolean(this);
		}
	}

	public final YulBooleanContext yulBoolean() throws RecognitionException {
		YulBooleanContext _localctx = new YulBooleanContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_yulBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_la = _input.LA(1);
			if ( !(_la==YulFalse || _la==YulTrue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class YulLiteralContext extends ParserRuleContext {
		public TerminalNode YulDecimalNumber() { return getToken(SolidityParser.YulDecimalNumber, 0); }
		public TerminalNode YulStringLiteral() { return getToken(SolidityParser.YulStringLiteral, 0); }
		public TerminalNode YulHexNumber() { return getToken(SolidityParser.YulHexNumber, 0); }
		public YulBooleanContext yulBoolean() {
			return getRuleContext(YulBooleanContext.class,0);
		}
		public TerminalNode YulHexStringLiteral() { return getToken(SolidityParser.YulHexStringLiteral, 0); }
		public YulLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulLiteral(this);
		}
	}

	public final YulLiteralContext yulLiteral() throws RecognitionException {
		YulLiteralContext _localctx = new YulLiteralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_yulLiteral);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulDecimalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(YulDecimalNumber);
				}
				break;
			case YulStringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(YulStringLiteral);
				}
				break;
			case YulHexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				match(YulHexNumber);
				}
				break;
			case YulFalse:
			case YulTrue:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				yulBoolean();
				}
				break;
			case YulHexStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				match(YulHexStringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class YulExpressionContext extends ParserRuleContext {
		public YulPathContext yulPath() {
			return getRuleContext(YulPathContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulExpression(this);
		}
	}

	public final YulExpressionContext yulExpression() throws RecognitionException {
		YulExpressionContext _localctx = new YulExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_yulExpression);
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				yulPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				yulFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1273);
				yulLiteral();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return constructorDefinition_sempred((ConstructorDefinitionContext)_localctx, predIndex);
		case 22:
			return functionDefinition_sempred((FunctionDefinitionContext)_localctx, predIndex);
		case 23:
			return modifierDefinition_sempred((ModifierDefinitionContext)_localctx, predIndex);
		case 24:
			return fallbackFunctionDefinition_sempred((FallbackFunctionDefinitionContext)_localctx, predIndex);
		case 25:
			return receiveFunctionDefinition_sempred((ReceiveFunctionDefinitionContext)_localctx, predIndex);
		case 30:
			return stateVariableDeclaration_sempred((StateVariableDeclarationContext)_localctx, predIndex);
		case 37:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 38:
			return elementaryTypeName_sempred((ElementaryTypeNameContext)_localctx, predIndex);
		case 39:
			return functionTypeName_sempred((FunctionTypeNameContext)_localctx, predIndex);
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constructorDefinition_sempred(ConstructorDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.payableSet;
		case 1:
			return !_localctx.visibilitySet;
		case 2:
			return !_localctx.visibilitySet;
		}
		return true;
	}
	private boolean functionDefinition_sempred(FunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_localctx.visibilitySet;
		case 4:
			return !_localctx.mutabilitySet;
		case 5:
			return !_localctx.virtualSet;
		case 6:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean modifierDefinition_sempred(ModifierDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_localctx.virtualSet;
		case 8:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean fallbackFunctionDefinition_sempred(FallbackFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_localctx.visibilitySet;
		case 10:
			return !_localctx.mutabilitySet;
		case 11:
			return !_localctx.virtualSet;
		case 12:
			return !_localctx.overrideSpecifierSet;
		case 13:
			return _localctx.hasParameters;
		case 14:
			return !_localctx.hasParameters;
		}
		return true;
	}
	private boolean receiveFunctionDefinition_sempred(ReceiveFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return !_localctx.visibilitySet;
		case 16:
			return !_localctx.mutabilitySet;
		case 17:
			return !_localctx.virtualSet;
		case 18:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean stateVariableDeclaration_sempred(StateVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !_localctx.visibilitySet;
		case 20:
			return !_localctx.visibilitySet;
		case 21:
			return !_localctx.visibilitySet;
		case 22:
			return !_localctx.constantnessSet;
		case 23:
			return !_localctx.overrideSpecifierSet;
		case 24:
			return !_localctx.constantnessSet;
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementaryTypeName_sempred(ElementaryTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return _localctx.allowAddressPayable;
		}
		return true;
	}
	private boolean functionTypeName_sempred(FunctionTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return !_localctx.visibilitySet;
		case 28:
			return !_localctx.mutabilitySet;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 17);
		case 30:
			return precpred(_ctx, 16);
		case 31:
			return precpred(_ctx, 15);
		case 32:
			return precpred(_ctx, 14);
		case 33:
			return precpred(_ctx, 13);
		case 34:
			return precpred(_ctx, 12);
		case 35:
			return precpred(_ctx, 11);
		case 36:
			return precpred(_ctx, 10);
		case 37:
			return precpred(_ctx, 9);
		case 38:
			return precpred(_ctx, 8);
		case 39:
			return precpred(_ctx, 7);
		case 40:
			return precpred(_ctx, 6);
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 26);
		case 43:
			return precpred(_ctx, 25);
		case 44:
			return precpred(_ctx, 24);
		case 45:
			return precpred(_ctx, 23);
		case 46:
			return precpred(_ctx, 22);
		case 47:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ae\u04fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00c1\b\u0000\n\u0000\f\u0000\u00c4\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0004\u0001\u00ca\b\u0001\u000b\u0001\f"+
		"\u0001\u00cb\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00d4\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00e0\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00e7\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ef\b\u0005"+
		"\n\u0005\f\u0005\u00f2\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u00f7\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00fc"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0100\b\u0006\n\u0006\f\u0006"+
		"\u0103\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u010a\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u010e\b"+
		"\u0007\n\u0007\f\u0007\u0111\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0119\b\b\n\b\f\b\u011c\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0124\b\t\n\t\f\t\u0127\t\t\u0001"+
		"\n\u0001\n\u0003\n\u012b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0139\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0143\b\r\n"+
		"\r\f\r\u0146\t\r\u0003\r\u0148\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u014e\b\r\n\r\f\r\u0151\t\r\u0003\r\u0153\b\r\u0001\r\u0003\r\u0156"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u015d"+
		"\b\u000e\n\u000e\f\u000e\u0160\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0164\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u016b\b\u0011\n\u0011\f\u0011\u016e\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0172\b\u0012\u0001\u0012\u0003\u0012\u0175\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017a\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0187\b\u0013"+
		"\n\u0013\f\u0013\u018a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0195\b\u0015\n\u0015\f\u0015\u0198\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u019c\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01a2\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a6\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u01b9\b\u0016\n\u0016\f\u0016\u01bc\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c3\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01c7\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01cd\b\u0017\u0001\u0017\u0003\u0017\u01d0\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u01d9\b\u0017\n\u0017\f\u0017\u01dc\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01e0\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01e7\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01f9\b\u0018\n\u0018"+
		"\f\u0018\u01fc\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0205\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0209\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u021c\b\u0019\n\u0019\f\u0019\u021f"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0223\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u0229\b\u001a\u000b\u001a"+
		"\f\u001a\u022a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0239\b\u001c\n\u001c\f\u001c\u023c\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u025a\b\u001e\n"+
		"\u001e\f\u001e\u025d\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0262\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003"+
		" \u026f\b \u0001 \u0003 \u0272\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u027a\b!\n!\f!\u027d\t!\u0003!\u027f\b!\u0001!\u0001!\u0003!"+
		"\u0283\b!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0289\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0005#\u0291\b#\n#\f#\u0294\t#\u0003#\u0296"+
		"\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u02a1\b$\n$\f$\u02a4\t$\u0001$\u0001$\u0003$\u02a8\b$\u0001$\u0001$"+
		"\u0001$\u0003$\u02ad\b$\u0001$\u0003$\u02b0\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02b9\b%\u0001%\u0001%\u0001%\u0003%\u02be"+
		"\b%\u0001%\u0005%\u02c1\b%\n%\f%\u02c4\t%\u0001&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d2"+
		"\b&\u0001\'\u0001\'\u0001\'\u0003\'\u02d7\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02e2\b\'\n\'"+
		"\f\'\u02e5\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02ec\b"+
		"\'\u0001(\u0001(\u0003(\u02f0\b(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0307\b*\u0003*\u0309\b*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0339\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u033f\b*\u0001*\u0001*\u0003*\u0343\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u034a\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u0351\b*\n*\f*\u0354\t*\u0003*\u0356\b*\u0001*\u0001*\u0001*\u0001*"+
		"\u0001*\u0005*\u035d\b*\n*\f*\u0360\t*\u0001+\u0001+\u0001,\u0001,\u0003"+
		",\u0366\b,\u0001,\u0001,\u0003,\u036a\b,\u0005,\u036c\b,\n,\f,\u036f\t"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0005-\u0377\b-\n-\f-\u037a"+
		"\t-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0385\b/\u00010\u00010\u00011\u00041\u038a\b1\u000b1\f1\u038b\u0001"+
		"2\u00042\u038f\b2\u000b2\f2\u0390\u00013\u00043\u0394\b3\u000b3\f3\u0395"+
		"\u00014\u00014\u00034\u039a\b4\u00015\u00015\u00015\u00055\u039f\b5\n"+
		"5\f5\u03a2\t5\u00015\u00015\u00016\u00016\u00016\u00017\u00017\u00017"+
		"\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u03b6\b7\u00018\u00018\u00038\u03ba\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u03c3\b9\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u03c9\b:\u0001:\u0001:\u0003:\u03cd\b:\u0001:\u0003:\u03d0\b:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u03f0\b?\u0001?\u0001?\u0004?\u03f4\b?\u000b?\f?\u03f5\u0001@\u0001"+
		"@\u0003@\u03fa\b@\u0001@\u0001@\u0001@\u0001@\u0003@\u0400\b@\u0001@\u0001"+
		"@\u0001A\u0001A\u0003A\u0406\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003D\u0416"+
		"\bD\u0001D\u0003D\u0419\bD\u0001D\u0001D\u0005D\u041d\bD\nD\fD\u0420\t"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0005E\u0428\bE\nE\fE\u042b"+
		"\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0005F\u0432\bF\nF\fF\u0435\tF"+
		"\u0001G\u0001G\u0005G\u0439\bG\nG\fG\u043c\tG\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u0442\bG\u0005G\u0444\bG\nG\fG\u0447\tG\u0001G\u0001G\u0001H"+
		"\u0001H\u0001H\u0003H\u044e\bH\u0001H\u0001H\u0001H\u0001H\u0003H\u0454"+
		"\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001K\u0001K\u0003K\u0464\bK\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0471\bL\u0001"+
		"M\u0001M\u0005M\u0475\bM\nM\fM\u0478\tM\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u0480\bN\u0001N\u0001N\u0001N\u0001N\u0005N\u0486\bN\n"+
		"N\fN\u0489\tN\u0001N\u0001N\u0003N\u048d\bN\u0003N\u048f\bN\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0004O\u0498\bO\u000bO\fO\u0499\u0001"+
		"O\u0001O\u0001O\u0003O\u049f\bO\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0004S\u04b2\bS\u000bS\fS\u04b3\u0001S\u0001S\u0003S\u04b8\b"+
		"S\u0001S\u0001S\u0003S\u04bc\bS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0005T\u04c4\bT\nT\fT\u04c7\tT\u0003T\u04c9\bT\u0001T\u0001T\u0001T"+
		"\u0001T\u0001T\u0005T\u04d0\bT\nT\fT\u04d3\tT\u0003T\u04d5\bT\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0005U\u04dc\bU\nU\fU\u04df\tU\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0005V\u04e6\bV\nV\fV\u04e9\tV\u0003V\u04eb\bV\u0001V"+
		"\u0001V\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0003X\u04f6"+
		"\bX\u0001Y\u0001Y\u0001Y\u0003Y\u04fb\bY\u0001Y\u0001\u0125\u0002JTZ\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u0000"+
		"\u0011\u0003\u0000\u0019\u0019((23\u0003\u00001144CC\u0003\u0000\u000b"+
		"\u000b,,99\u0003\u0000\u0011\u0011hhsv\u0001\u0000ik\u0001\u0000gh\u0001"+
		"\u0000df\u0001\u0000or\u0001\u0000mn\u0001\u0000uv\u0001\u0000R]\u0004"+
		"\u0000\u0016\u0017\u001d\u001d!!\u007f\u007f\u0002\u0000\u001b\u001b<"+
		"<\u0001\u0000yz\u0001\u0000}~\u0002\u0000\u0099\u0099\u00a2\u00a2\u0002"+
		"\u0000\u0090\u0090\u0097\u0097\u058e\u0000\u00c2\u0001\u0000\u0000\u0000"+
		"\u0002\u00c7\u0001\u0000\u0000\u0000\u0004\u00cf\u0001\u0000\u0000\u0000"+
		"\u0006\u00e3\u0001\u0000\u0000\u0000\b\u00e8\u0001\u0000\u0000\u0000\n"+
		"\u00ea\u0001\u0000\u0000\u0000\f\u00f6\u0001\u0000\u0000\u0000\u000e\u0106"+
		"\u0001\u0000\u0000\u0000\u0010\u0114\u0001\u0000\u0000\u0000\u0012\u011f"+
		"\u0001\u0000\u0000\u0000\u0014\u0128\u0001\u0000\u0000\u0000\u0016\u0138"+
		"\u0001\u0000\u0000\u0000\u0018\u013a\u0001\u0000\u0000\u0000\u001a\u013e"+
		"\u0001\u0000\u0000\u0000\u001c\u0159\u0001\u0000\u0000\u0000\u001e\u0161"+
		"\u0001\u0000\u0000\u0000 \u0165\u0001\u0000\u0000\u0000\"\u0167\u0001"+
		"\u0000\u0000\u0000$\u016f\u0001\u0000\u0000\u0000&\u0176\u0001\u0000\u0000"+
		"\u0000(\u018d\u0001\u0000\u0000\u0000*\u018f\u0001\u0000\u0000\u0000,"+
		"\u019d\u0001\u0000\u0000\u0000.\u01c8\u0001\u0000\u0000\u00000\u01e1\u0001"+
		"\u0000\u0000\u00002\u020a\u0001\u0000\u0000\u00004\u0224\u0001\u0000\u0000"+
		"\u00006\u022e\u0001\u0000\u0000\u00008\u0232\u0001\u0000\u0000\u0000:"+
		"\u023f\u0001\u0000\u0000\u0000<\u0245\u0001\u0000\u0000\u0000>\u0265\u0001"+
		"\u0000\u0000\u0000@\u026c\u0001\u0000\u0000\u0000B\u0273\u0001\u0000\u0000"+
		"\u0000D\u0286\u0001\u0000\u0000\u0000F\u028a\u0001\u0000\u0000\u0000H"+
		"\u029a\u0001\u0000\u0000\u0000J\u02b8\u0001\u0000\u0000\u0000L\u02d1\u0001"+
		"\u0000\u0000\u0000N\u02d3\u0001\u0000\u0000\u0000P\u02ed\u0001\u0000\u0000"+
		"\u0000R\u02f3\u0001\u0000\u0000\u0000T\u0308\u0001\u0000\u0000\u0000V"+
		"\u0361\u0001\u0000\u0000\u0000X\u0363\u0001\u0000\u0000\u0000Z\u0372\u0001"+
		"\u0000\u0000\u0000\\\u037d\u0001\u0000\u0000\u0000^\u0384\u0001\u0000"+
		"\u0000\u0000`\u0386\u0001\u0000\u0000\u0000b\u0389\u0001\u0000\u0000\u0000"+
		"d\u038e\u0001\u0000\u0000\u0000f\u0393\u0001\u0000\u0000\u0000h\u0397"+
		"\u0001\u0000\u0000\u0000j\u039b\u0001\u0000\u0000\u0000l\u03a5\u0001\u0000"+
		"\u0000\u0000n\u03b5\u0001\u0000\u0000\u0000p\u03b9\u0001\u0000\u0000\u0000"+
		"r\u03bb\u0001\u0000\u0000\u0000t\u03c4\u0001\u0000\u0000\u0000v\u03d4"+
		"\u0001\u0000\u0000\u0000x\u03da\u0001\u0000\u0000\u0000z\u03e2\u0001\u0000"+
		"\u0000\u0000|\u03e5\u0001\u0000\u0000\u0000~\u03e8\u0001\u0000\u0000\u0000"+
		"\u0080\u03f7\u0001\u0000\u0000\u0000\u0082\u0403\u0001\u0000\u0000\u0000"+
		"\u0084\u0409\u0001\u0000\u0000\u0000\u0086\u040e\u0001\u0000\u0000\u0000"+
		"\u0088\u0413\u0001\u0000\u0000\u0000\u008a\u0423\u0001\u0000\u0000\u0000"+
		"\u008c\u042e\u0001\u0000\u0000\u0000\u008e\u0436\u0001\u0000\u0000\u0000"+
		"\u0090\u0453\u0001\u0000\u0000\u0000\u0092\u0457\u0001\u0000\u0000\u0000"+
		"\u0094\u045a\u0001\u0000\u0000\u0000\u0096\u0463\u0001\u0000\u0000\u0000"+
		"\u0098\u0470\u0001\u0000\u0000\u0000\u009a\u0472\u0001\u0000\u0000\u0000"+
		"\u009c\u048e\u0001\u0000\u0000\u0000\u009e\u049e\u0001\u0000\u0000\u0000"+
		"\u00a0\u04a0\u0001\u0000\u0000\u0000\u00a2\u04a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u04aa\u0001\u0000\u0000\u0000\u00a6\u04ae\u0001\u0000\u0000\u0000"+
		"\u00a8\u04bd\u0001\u0000\u0000\u0000\u00aa\u04d8\u0001\u0000\u0000\u0000"+
		"\u00ac\u04e0\u0001\u0000\u0000\u0000\u00ae\u04ee\u0001\u0000\u0000\u0000"+
		"\u00b0\u04f5\u0001\u0000\u0000\u0000\u00b2\u04fa\u0001\u0000\u0000\u0000"+
		"\u00b4\u00c1\u0003\u0002\u0001\u0000\u00b5\u00c1\u0003\u0004\u0002\u0000"+
		"\u00b6\u00c1\u0003H$\u0000\u00b7\u00c1\u0003\f\u0006\u0000\u00b8\u00c1"+
		"\u0003\u000e\u0007\u0000\u00b9\u00c1\u0003\u0010\b\u0000\u00ba\u00c1\u0003"+
		",\u0016\u0000\u00bb\u00c1\u0003>\u001f\u0000\u00bc\u00c1\u00034\u001a"+
		"\u0000\u00bd\u00c1\u00038\u001c\u0000\u00be\u00c1\u0003:\u001d\u0000\u00bf"+
		"\u00c1\u0003F#\u0000\u00c0\u00b4\u0001\u0000\u0000\u0000\u00c0\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c0\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0000\u0000\u0001\u00c6\u0001\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005"+
		"\u0002\u0000\u0000\u00c8\u00ca\u0005\u00aa\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u00ab\u0000\u0000\u00ce\u0003\u0001"+
		"\u0000\u0000\u0000\u00cf\u00df\u0005%\u0000\u0000\u00d0\u00d3\u0003\b"+
		"\u0004\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2\u00d4\u0003\\."+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00e0\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\n\u0005\u0000"+
		"\u00d6\u00d7\u0005\u001d\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000\u00d8"+
		"\u00e0\u0001\u0000\u0000\u0000\u00d9\u00da\u0005i\u0000\u0000\u00da\u00db"+
		"\u0005\u0006\u0000\u0000\u00db\u00dc\u0003\\.\u0000\u00dc\u00dd\u0005"+
		"\u001d\u0000\u0000\u00dd\u00de\u0003\b\u0004\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000"+
		"\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005M\u0000\u0000\u00e2\u0005\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0003\\.\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000"+
		"\u00e5\u00e7\u0003\\.\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u0007\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005y\u0000\u0000\u00e9\t\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005J\u0000\u0000\u00eb\u00f0\u0003\u0006\u0003\u0000\u00ec\u00ed\u0005"+
		"^\u0000\u0000\u00ed\u00ef\u0003\u0006\u0003\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005K\u0000"+
		"\u0000\u00f4\u000b\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\u0003\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0010\u0000"+
		"\u0000\u00f9\u00fb\u0003\\.\u0000\u00fa\u00fc\u0003\u0012\t\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u0101\u0005J\u0000\u0000\u00fe\u0100"+
		"\u0003\u0016\u000b\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103"+
		"\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005K\u0000\u0000\u0105\r\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0005\'\u0000\u0000\u0107\u0109\u0003\\"+
		".\u0000\u0108\u010a\u0003\u0012\t\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010f\u0005J\u0000\u0000\u010c\u010e\u0003\u0016\u000b\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0005K\u0000\u0000\u0113\u000f\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005*\u0000\u0000\u0115\u0116\u0003\\.\u0000\u0116\u011a\u0005"+
		"J\u0000\u0000\u0117\u0119\u0003\u0016\u000b\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005K\u0000"+
		"\u0000\u011e\u0011\u0001\u0000\u0000\u0000\u011f\u0120\u0005)\u0000\u0000"+
		"\u0120\u0125\u0003\u0014\n\u0000\u0121\u0122\u0005^\u0000\u0000\u0122"+
		"\u0124\u0003\u0014\n\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0013\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0003\u001c\u000e\u0000\u0129\u012b"+
		"\u0003\u001a\r\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u0015\u0001\u0000\u0000\u0000\u012c\u0139\u0003"+
		"&\u0013\u0000\u012d\u0139\u0003,\u0016\u0000\u012e\u0139\u0003.\u0017"+
		"\u0000\u012f\u0139\u00030\u0018\u0000\u0130\u0139\u00032\u0019\u0000\u0131"+
		"\u0139\u00034\u001a\u0000\u0132\u0139\u00038\u001c\u0000\u0133\u0139\u0003"+
		":\u001d\u0000\u0134\u0139\u0003<\u001e\u0000\u0135\u0139\u0003B!\u0000"+
		"\u0136\u0139\u0003F#\u0000\u0137\u0139\u0003H$\u0000\u0138\u012c\u0001"+
		"\u0000\u0000\u0000\u0138\u012d\u0001\u0000\u0000\u0000\u0138\u012e\u0001"+
		"\u0000\u0000\u0000\u0138\u012f\u0001\u0000\u0000\u0000\u0138\u0130\u0001"+
		"\u0000\u0000\u0000\u0138\u0131\u0001\u0000\u0000\u0000\u0138\u0132\u0001"+
		"\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001"+
		"\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u0017\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0003\\.\u0000\u013b\u013c\u0005L\u0000"+
		"\u0000\u013c\u013d\u0003T*\u0000\u013d\u0019\u0001\u0000\u0000\u0000\u013e"+
		"\u0155\u0005F\u0000\u0000\u013f\u0144\u0003T*\u0000\u0140\u0141\u0005"+
		"^\u0000\u0000\u0141\u0143\u0003T*\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u013f\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0156\u0001\u0000\u0000"+
		"\u0000\u0149\u0152\u0005J\u0000\u0000\u014a\u014f\u0003\u0018\f\u0000"+
		"\u014b\u014c\u0005^\u0000\u0000\u014c\u014e\u0003\u0018\f\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u014a\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0005K\u0000\u0000\u0155\u0147"+
		"\u0001\u0000\u0000\u0000\u0155\u0149\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005G\u0000\u0000\u0158\u001b\u0001"+
		"\u0000\u0000\u0000\u0159\u015e\u0003\\.\u0000\u015a\u015b\u0005N\u0000"+
		"\u0000\u015b\u015d\u0003\\.\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u001d\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0163\u0003\u001c\u000e\u0000"+
		"\u0162\u0164\u0003\u001a\r\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u001f\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0007\u0000\u0000\u0000\u0166!\u0001\u0000\u0000\u0000\u0167\u016c"+
		"\u0003$\u0012\u0000\u0168\u0169\u0005^\u0000\u0000\u0169\u016b\u0003$"+
		"\u0012\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d#\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0003J%\u0000\u0170\u0172\u0003R)\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0001\u0000\u0000\u0000\u0173\u0175\u0003\\.\u0000\u0174\u0173\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175%\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005\u000e\u0000\u0000\u0177\u0179\u0005F\u0000"+
		"\u0000\u0178\u017a\u0003\"\u0011\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u0188\u0005G\u0000\u0000\u017c\u0187\u0003\u001e\u000f\u0000\u017d"+
		"\u017e\u0004\u0013\u0000\u0001\u017e\u017f\u00051\u0000\u0000\u017f\u0187"+
		"\u0006\u0013\uffff\uffff\u0000\u0180\u0181\u0004\u0013\u0001\u0001\u0181"+
		"\u0182\u0005(\u0000\u0000\u0182\u0187\u0006\u0013\uffff\uffff\u0000\u0183"+
		"\u0184\u0004\u0013\u0002\u0001\u0184\u0185\u00053\u0000\u0000\u0185\u0187"+
		"\u0006\u0013\uffff\uffff\u0000\u0186\u017c\u0001\u0000\u0000\u0000\u0186"+
		"\u017d\u0001\u0000\u0000\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0186"+
		"\u0183\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0003j5\u0000\u018c\'\u0001\u0000\u0000\u0000\u018d\u018e\u0007"+
		"\u0001\u0000\u0000\u018e)\u0001\u0000\u0000\u0000\u018f\u019b\u00050\u0000"+
		"\u0000\u0190\u0191\u0005F\u0000\u0000\u0191\u0196\u0003\u001c\u000e\u0000"+
		"\u0192\u0193\u0005^\u0000\u0000\u0193\u0195\u0003\u001c\u000e\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u0199\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005G\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0190"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c+\u0001"+
		"\u0000\u0000\u0000\u019d\u01a1\u0005 \u0000\u0000\u019e\u01a2\u0003\\"+
		".\u0000\u019f\u01a2\u0005\u001a\u0000\u0000\u01a0\u01a2\u00055\u0000\u0000"+
		"\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a5\u0005F\u0000\u0000\u01a4\u01a6\u0003\"\u0011\u0000\u01a5"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01ba\u0005G\u0000\u0000\u01a8\u01a9"+
		"\u0004\u0016\u0003\u0001\u01a9\u01aa\u0003 \u0010\u0000\u01aa\u01ab\u0006"+
		"\u0016\uffff\uffff\u0000\u01ab\u01b9\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0004\u0016\u0004\u0001\u01ad\u01ae\u0003(\u0014\u0000\u01ae\u01af\u0006"+
		"\u0016\uffff\uffff\u0000\u01af\u01b9\u0001\u0000\u0000\u0000\u01b0\u01b9"+
		"\u0003\u001e\u000f\u0000\u01b1\u01b2\u0004\u0016\u0005\u0001\u01b2\u01b3"+
		"\u0005D\u0000\u0000\u01b3\u01b9\u0006\u0016\uffff\uffff\u0000\u01b4\u01b5"+
		"\u0004\u0016\u0006\u0001\u01b5\u01b6\u0003*\u0015\u0000\u01b6\u01b7\u0006"+
		"\u0016\uffff\uffff\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01a8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ac\u0001\u0000\u0000\u0000\u01b8\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01c2"+
		"\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u00057\u0000\u0000\u01be\u01bf\u0005F\u0000\u0000\u01bf\u01c0\u0003\""+
		"\u0011\u0000\u01c0\u01c1\u0005G\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c2\u01bd\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c7\u0005M\u0000\u0000"+
		"\u01c5\u01c7\u0003j5\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7-\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005"+
		"-\u0000\u0000\u01c9\u01cf\u0003\\.\u0000\u01ca\u01cc\u0005F\u0000\u0000"+
		"\u01cb\u01cd\u0003\"\u0011\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\u0005G\u0000\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01da\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0004\u0017\u0007\u0001\u01d2\u01d3\u0005D\u0000\u0000\u01d3\u01d9\u0006"+
		"\u0017\uffff\uffff\u0000\u01d4\u01d5\u0004\u0017\b\u0001\u01d5\u01d6\u0003"+
		"*\u0015\u0000\u01d6\u01d7\u0006\u0017\uffff\uffff\u0000\u01d7\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d1\u0001\u0000\u0000\u0000\u01d8\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01df\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e0\u0005"+
		"M\u0000\u0000\u01de\u01e0\u0003j5\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0/\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0005\u001a\u0000\u0000\u01e2\u01e6\u0005F\u0000\u0000\u01e3"+
		"\u01e4\u0003\"\u0011\u0000\u01e4\u01e5\u0006\u0018\uffff\uffff\u0000\u01e5"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01fa\u0005G\u0000\u0000\u01e9\u01ea\u0004\u0018\t\u0001\u01ea\u01eb"+
		"\u0005\u0019\u0000\u0000\u01eb\u01f9\u0006\u0018\uffff\uffff\u0000\u01ec"+
		"\u01ed\u0004\u0018\n\u0001\u01ed\u01ee\u0003(\u0014\u0000\u01ee\u01ef"+
		"\u0006\u0018\uffff\uffff\u0000\u01ef\u01f9\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f9\u0003\u001e\u000f\u0000\u01f1\u01f2\u0004\u0018\u000b\u0001\u01f2"+
		"\u01f3\u0005D\u0000\u0000\u01f3\u01f9\u0006\u0018\uffff\uffff\u0000\u01f4"+
		"\u01f5\u0004\u0018\f\u0001\u01f5\u01f6\u0003*\u0015\u0000\u01f6\u01f7"+
		"\u0006\u0018\uffff\uffff\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01f8\u01ec\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f8\u01f1\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb"+
		"\u0204\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0004\u0018\r\u0001\u01fe\u01ff\u00057\u0000\u0000\u01ff\u0200"+
		"\u0005F\u0000\u0000\u0200\u0201\u0003\"\u0011\u0000\u0201\u0202\u0005"+
		"G\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0205\u0004\u0018"+
		"\u000e\u0001\u0204\u01fd\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0209\u0005M\u0000"+
		"\u0000\u0207\u0209\u0003j5\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u02091\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u00055\u0000\u0000\u020b\u020c\u0005F\u0000\u0000\u020c\u021d\u0005G"+
		"\u0000\u0000\u020d\u020e\u0004\u0019\u000f\u0001\u020e\u020f\u0005\u0019"+
		"\u0000\u0000\u020f\u021c\u0006\u0019\uffff\uffff\u0000\u0210\u0211\u0004"+
		"\u0019\u0010\u0001\u0211\u0212\u00051\u0000\u0000\u0212\u021c\u0006\u0019"+
		"\uffff\uffff\u0000\u0213\u021c\u0003\u001e\u000f\u0000\u0214\u0215\u0004"+
		"\u0019\u0011\u0001\u0215\u0216\u0005D\u0000\u0000\u0216\u021c\u0006\u0019"+
		"\uffff\uffff\u0000\u0217\u0218\u0004\u0019\u0012\u0001\u0218\u0219\u0003"+
		"*\u0015\u0000\u0219\u021a\u0006\u0019\uffff\uffff\u0000\u021a\u021c\u0001"+
		"\u0000\u0000\u0000\u021b\u020d\u0001\u0000\u0000\u0000\u021b\u0210\u0001"+
		"\u0000\u0000\u0000\u021b\u0213\u0001\u0000\u0000\u0000\u021b\u0214\u0001"+
		"\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021c\u021f\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u0222\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0005M\u0000\u0000\u0221\u0223\u0003j5"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0221\u0001\u0000\u0000"+
		"\u0000\u02233\u0001\u0000\u0000\u0000\u0224\u0225\u0005;\u0000\u0000\u0225"+
		"\u0226\u0003\\.\u0000\u0226\u0228\u0005J\u0000\u0000\u0227\u0229\u0003"+
		"6\u001b\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005K\u0000"+
		"\u0000\u022d5\u0001\u0000\u0000\u0000\u022e\u022f\u0003J%\u0000\u022f"+
		"\u0230\u0003\\.\u0000\u0230\u0231\u0005M\u0000\u0000\u02317\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0005\u0015\u0000\u0000\u0233\u0234\u0003\\."+
		"\u0000\u0234\u0235\u0005J\u0000\u0000\u0235\u023a\u0003\\.\u0000\u0236"+
		"\u0237\u0005^\u0000\u0000\u0237\u0239\u0003\\.\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d\u0001"+
		"\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"K\u0000\u0000\u023e9\u0001\u0000\u0000\u0000\u023f\u0240\u0005>\u0000"+
		"\u0000\u0240\u0241\u0003\\.\u0000\u0241\u0242\u0005)\u0000\u0000\u0242"+
		"\u0243\u0003L&\u0000\u0243\u0244\u0005M\u0000\u0000\u0244;\u0001\u0000"+
		"\u0000\u0000\u0245\u025b\u0003J%\u0000\u0246\u0247\u0004\u001e\u0013\u0001"+
		"\u0247\u0248\u00053\u0000\u0000\u0248\u025a\u0006\u001e\uffff\uffff\u0000"+
		"\u0249\u024a\u0004\u001e\u0014\u0001\u024a\u024b\u00052\u0000\u0000\u024b"+
		"\u025a\u0006\u001e\uffff\uffff\u0000\u024c\u024d\u0004\u001e\u0015\u0001"+
		"\u024d\u024e\u0005(\u0000\u0000\u024e\u025a\u0006\u001e\uffff\uffff\u0000"+
		"\u024f\u0250\u0004\u001e\u0016\u0001\u0250\u0251\u0005\r\u0000\u0000\u0251"+
		"\u025a\u0006\u001e\uffff\uffff\u0000\u0252\u0253\u0004\u001e\u0017\u0001"+
		"\u0253\u0254\u0003*\u0015\u0000\u0254\u0255\u0006\u001e\uffff\uffff\u0000"+
		"\u0255\u025a\u0001\u0000\u0000\u0000\u0256\u0257\u0004\u001e\u0018\u0001"+
		"\u0257\u0258\u0005$\u0000\u0000\u0258\u025a\u0006\u001e\uffff\uffff\u0000"+
		"\u0259\u0246\u0001\u0000\u0000\u0000\u0259\u0249\u0001\u0000\u0000\u0000"+
		"\u0259\u024c\u0001\u0000\u0000\u0000\u0259\u024f\u0001\u0000\u0000\u0000"+
		"\u0259\u0252\u0001\u0000\u0000\u0000\u0259\u0256\u0001\u0000\u0000\u0000"+
		"\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0261\u0003\\.\u0000\u025f"+
		"\u0260\u0005R\u0000\u0000\u0260\u0262\u0003T*\u0000\u0261\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0005M\u0000\u0000\u0264=\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0003J%\u0000\u0266\u0267\u0005\r\u0000\u0000\u0267"+
		"\u0268\u0003\\.\u0000\u0268\u0269\u0005R\u0000\u0000\u0269\u026a\u0003"+
		"T*\u0000\u026a\u026b\u0005M\u0000\u0000\u026b?\u0001\u0000\u0000\u0000"+
		"\u026c\u026e\u0003J%\u0000\u026d\u026f\u0005&\u0000\u0000\u026e\u026d"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271"+
		"\u0001\u0000\u0000\u0000\u0270\u0272\u0003\\.\u0000\u0271\u0270\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272A\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0005\u0018\u0000\u0000\u0274\u0275\u0003\\."+
		"\u0000\u0275\u027e\u0005F\u0000\u0000\u0276\u027b\u0003@ \u0000\u0277"+
		"\u0278\u0005^\u0000\u0000\u0278\u027a\u0003@ \u0000\u0279\u0277\u0001"+
		"\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027f\u0001"+
		"\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u0276\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001"+
		"\u0000\u0000\u0000\u0280\u0282\u0005G\u0000\u0000\u0281\u0283\u0005\u0004"+
		"\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000"+
		"\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0005M\u0000"+
		"\u0000\u0285C\u0001\u0000\u0000\u0000\u0286\u0288\u0003J%\u0000\u0287"+
		"\u0289\u0003\\.\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0001\u0000\u0000\u0000\u0289E\u0001\u0000\u0000\u0000\u028a\u028b\u0005"+
		"\u0016\u0000\u0000\u028b\u028c\u0003\\.\u0000\u028c\u0295\u0005F\u0000"+
		"\u0000\u028d\u0292\u0003D\"\u0000\u028e\u028f\u0005^\u0000\u0000\u028f"+
		"\u0291\u0003D\"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0294"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292"+
		"\u0001\u0000\u0000\u0000\u0295\u028d\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0005G\u0000\u0000\u0298\u0299\u0005M\u0000\u0000\u0299G\u0001\u0000"+
		"\u0000\u0000\u029a\u02a7\u0005B\u0000\u0000\u029b\u02a8\u0003\u001c\u000e"+
		"\u0000\u029c\u029d\u0005J\u0000\u0000\u029d\u02a2\u0003\u001c\u000e\u0000"+
		"\u029e\u029f\u0005^\u0000\u0000\u029f\u02a1\u0003\u001c\u000e\u0000\u02a0"+
		"\u029e\u0001\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0005K\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u029b"+
		"\u0001\u0000\u0000\u0000\u02a7\u029c\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a9\u02ac\u0005\u001f\u0000\u0000\u02aa\u02ad"+
		"\u0005i\u0000\u0000\u02ab\u02ad\u0003J%\u0000\u02ac\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0005!\u0000\u0000\u02af\u02ae\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0005M\u0000\u0000\u02b2I\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b4\u0006%\uffff\uffff\u0000\u02b4\u02b9\u0003L&\u0000\u02b5\u02b9"+
		"\u0003N\'\u0000\u02b6\u02b9\u0003\u0094J\u0000\u02b7\u02b9\u0003\u001c"+
		"\u000e\u0000\u02b8\u02b3\u0001\u0000\u0000\u0000\u02b8\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02c2\u0001\u0000\u0000\u0000\u02ba\u02bb\n\u0001\u0000"+
		"\u0000\u02bb\u02bd\u0005H\u0000\u0000\u02bc\u02be\u0003T*\u0000\u02bd"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c1\u0005I\u0000\u0000\u02c0\u02ba"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3K\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02d2\u0005"+
		"\u0005\u0000\u0000\u02c6\u02c7\u0004&\u001a\u0001\u02c7\u02c8\u0005\u0005"+
		"\u0000\u0000\u02c8\u02d2\u00051\u0000\u0000\u02c9\u02d2\u0005\b\u0000"+
		"\u0000\u02ca\u02d2\u0005:\u0000\u0000\u02cb\u02d2\u0005\n\u0000\u0000"+
		"\u02cc\u02d2\u00058\u0000\u0000\u02cd\u02d2\u0005A\u0000\u0000\u02ce\u02d2"+
		"\u0005\u001e\u0000\u0000\u02cf\u02d2\u0005\u001c\u0000\u0000\u02d0\u02d2"+
		"\u0005?\u0000\u0000\u02d1\u02c5\u0001\u0000\u0000\u0000\u02d1\u02c6\u0001"+
		"\u0000\u0000\u0000\u02d1\u02c9\u0001\u0000\u0000\u0000\u02d1\u02ca\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cb\u0001\u0000\u0000\u0000\u02d1\u02cc\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cd\u0001\u0000\u0000\u0000\u02d1\u02ce\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d2M\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005 \u0000"+
		"\u0000\u02d4\u02d6\u0005F\u0000\u0000\u02d5\u02d7\u0003\"\u0011\u0000"+
		"\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02e3\u0005G\u0000\u0000\u02d9"+
		"\u02da\u0004\'\u001b\u0001\u02da\u02db\u0003 \u0010\u0000\u02db\u02dc"+
		"\u0006\'\uffff\uffff\u0000\u02dc\u02e2\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0004\'\u001c\u0001\u02de\u02df\u0003(\u0014\u0000\u02df\u02e0\u0006"+
		"\'\uffff\uffff\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02d9\u0001"+
		"\u0000\u0000\u0000\u02e1\u02dd\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e4\u02eb\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e7\u00057\u0000\u0000\u02e7\u02e8\u0005F\u0000"+
		"\u0000\u02e8\u02e9\u0003\"\u0011\u0000\u02e9\u02ea\u0005G\u0000\u0000"+
		"\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e6\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ecO\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ef\u0003J%\u0000\u02ee\u02f0\u0003R)\u0000\u02ef\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0003\\.\u0000\u02f2Q\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0007\u0002\u0000\u0000\u02f4S\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f6\u0006*\uffff\uffff\u0000\u02f6\u02f7\u00051\u0000\u0000\u02f7\u0309"+
		"\u0003\u001a\r\u0000\u02f8\u02f9\u0005>\u0000\u0000\u02f9\u02fa\u0005"+
		"F\u0000\u0000\u02fa\u02fb\u0003J%\u0000\u02fb\u02fc\u0005G\u0000\u0000"+
		"\u02fc\u0309\u0001\u0000\u0000\u0000\u02fd\u02fe\u0007\u0003\u0000\u0000"+
		"\u02fe\u0309\u0003T*\u0013\u02ff\u0300\u0005.\u0000\u0000\u0300\u0309"+
		"\u0003J%\u0000\u0301\u0309\u0003X,\u0000\u0302\u0309\u0003Z-\u0000\u0303"+
		"\u0307\u0003\\.\u0000\u0304\u0307\u0003^/\u0000\u0305\u0307\u0003L&\u0000"+
		"\u0306\u0303\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0305\u0001\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000"+
		"\u0308\u02f5\u0001\u0000\u0000\u0000\u0308\u02f8\u0001\u0000\u0000\u0000"+
		"\u0308\u02fd\u0001\u0000\u0000\u0000\u0308\u02ff\u0001\u0000\u0000\u0000"+
		"\u0308\u0301\u0001\u0000\u0000\u0000\u0308\u0302\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u035e\u0001\u0000\u0000\u0000"+
		"\u030a\u030b\n\u0011\u0000\u0000\u030b\u030c\u0005l\u0000\u0000\u030c"+
		"\u035d\u0003T*\u0011\u030d\u030e\n\u0010\u0000\u0000\u030e\u030f\u0007"+
		"\u0004\u0000\u0000\u030f\u035d\u0003T*\u0011\u0310\u0311\n\u000f\u0000"+
		"\u0000\u0311\u0312\u0007\u0005\u0000\u0000\u0312\u035d\u0003T*\u0010\u0313"+
		"\u0314\n\u000e\u0000\u0000\u0314\u0315\u0007\u0006\u0000\u0000\u0315\u035d"+
		"\u0003T*\u000f\u0316\u0317\n\r\u0000\u0000\u0317\u0318\u0005c\u0000\u0000"+
		"\u0318\u035d\u0003T*\u000e\u0319\u031a\n\f\u0000\u0000\u031a\u031b\u0005"+
		"b\u0000\u0000\u031b\u035d\u0003T*\r\u031c\u031d\n\u000b\u0000\u0000\u031d"+
		"\u031e\u0005a\u0000\u0000\u031e\u035d\u0003T*\f\u031f\u0320\n\n\u0000"+
		"\u0000\u0320\u0321\u0007\u0007\u0000\u0000\u0321\u035d\u0003T*\u000b\u0322"+
		"\u0323\n\t\u0000\u0000\u0323\u0324\u0007\b\u0000\u0000\u0324\u035d\u0003"+
		"T*\n\u0325\u0326\n\b\u0000\u0000\u0326\u0327\u0005`\u0000\u0000\u0327"+
		"\u035d\u0003T*\t\u0328\u0329\n\u0007\u0000\u0000\u0329\u032a\u0005_\u0000"+
		"\u0000\u032a\u035d\u0003T*\b\u032b\u032c\n\u0006\u0000\u0000\u032c\u032d"+
		"\u0005O\u0000\u0000\u032d\u032e\u0003T*\u0000\u032e\u032f\u0005L\u0000"+
		"\u0000\u032f\u0330\u0003T*\u0006\u0330\u035d\u0001\u0000\u0000\u0000\u0331"+
		"\u0332\n\u0005\u0000\u0000\u0332\u0333\u0003V+\u0000\u0333\u0334\u0003"+
		"T*\u0005\u0334\u035d\u0001\u0000\u0000\u0000\u0335\u0336\n\u001a\u0000"+
		"\u0000\u0336\u0338\u0005H\u0000\u0000\u0337\u0339\u0003T*\u0000\u0338"+
		"\u0337\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033a\u035d\u0005I\u0000\u0000\u033b\u033c"+
		"\n\u0019\u0000\u0000\u033c\u033e\u0005H\u0000\u0000\u033d\u033f\u0003"+
		"T*\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000"+
		"\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0342\u0005L\u0000\u0000"+
		"\u0341\u0343\u0003T*\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u035d"+
		"\u0005I\u0000\u0000\u0345\u0346\n\u0018\u0000\u0000\u0346\u0349\u0005"+
		"N\u0000\u0000\u0347\u034a\u0003\\.\u0000\u0348\u034a\u0005\u0005\u0000"+
		"\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u0348\u0001\u0000\u0000"+
		"\u0000\u034a\u035d\u0001\u0000\u0000\u0000\u034b\u034c\n\u0017\u0000\u0000"+
		"\u034c\u0355\u0005J\u0000\u0000\u034d\u0352\u0003\u0018\f\u0000\u034e"+
		"\u034f\u0005^\u0000\u0000\u034f\u0351\u0003\u0018\f\u0000\u0350\u034e"+
		"\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0356"+
		"\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u034d"+
		"\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0001\u0000\u0000\u0000\u0357\u035d\u0005K\u0000\u0000\u0358\u0359\n"+
		"\u0016\u0000\u0000\u0359\u035d\u0003\u001a\r\u0000\u035a\u035b\n\u0012"+
		"\u0000\u0000\u035b\u035d\u0007\t\u0000\u0000\u035c\u030a\u0001\u0000\u0000"+
		"\u0000\u035c\u030d\u0001\u0000\u0000\u0000\u035c\u0310\u0001\u0000\u0000"+
		"\u0000\u035c\u0313\u0001\u0000\u0000\u0000\u035c\u0316\u0001\u0000\u0000"+
		"\u0000\u035c\u0319\u0001\u0000\u0000\u0000\u035c\u031c\u0001\u0000\u0000"+
		"\u0000\u035c\u031f\u0001\u0000\u0000\u0000\u035c\u0322\u0001\u0000\u0000"+
		"\u0000\u035c\u0325\u0001\u0000\u0000\u0000\u035c\u0328\u0001\u0000\u0000"+
		"\u0000\u035c\u032b\u0001\u0000\u0000\u0000\u035c\u0331\u0001\u0000\u0000"+
		"\u0000\u035c\u0335\u0001\u0000\u0000\u0000\u035c\u033b\u0001\u0000\u0000"+
		"\u0000\u035c\u0345\u0001\u0000\u0000\u0000\u035c\u034b\u0001\u0000\u0000"+
		"\u0000\u035c\u0358\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000"+
		"\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035fU\u0001\u0000\u0000\u0000"+
		"\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0362\u0007\n\u0000\u0000\u0362"+
		"W\u0001\u0000\u0000\u0000\u0363\u0365\u0005F\u0000\u0000\u0364\u0366\u0003"+
		"T*\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000"+
		"\u0000\u0366\u036d\u0001\u0000\u0000\u0000\u0367\u0369\u0005^\u0000\u0000"+
		"\u0368\u036a\u0003T*\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a"+
		"\u0001\u0000\u0000\u0000\u036a\u036c\u0001\u0000\u0000\u0000\u036b\u0367"+
		"\u0001\u0000\u0000\u0000\u036c\u036f\u0001\u0000\u0000\u0000\u036d\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0370"+
		"\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0005G\u0000\u0000\u0371Y\u0001\u0000\u0000\u0000\u0372\u0373\u0005H"+
		"\u0000\u0000\u0373\u0378\u0003T*\u0000\u0374\u0375\u0005^\u0000\u0000"+
		"\u0375\u0377\u0003T*\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u037a"+
		"\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0378\u0379"+
		"\u0001\u0000\u0000\u0000\u0379\u037b\u0001\u0000\u0000\u0000\u037a\u0378"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0005I\u0000\u0000\u037c[\u0001\u0000"+
		"\u0000\u0000\u037d\u037e\u0007\u000b\u0000\u0000\u037e]\u0001\u0000\u0000"+
		"\u0000\u037f\u0385\u0003b1\u0000\u0380\u0385\u0003h4\u0000\u0381\u0385"+
		"\u0003`0\u0000\u0382\u0385\u0003d2\u0000\u0383\u0385\u0003f3\u0000\u0384"+
		"\u037f\u0001\u0000\u0000\u0000\u0384\u0380\u0001\u0000\u0000\u0000\u0384"+
		"\u0381\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384"+
		"\u0383\u0001\u0000\u0000\u0000\u0385_\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u0007\f\u0000\u0000\u0387a\u0001\u0000\u0000\u0000\u0388\u038a\u0007"+
		"\r\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000"+
		"\u0000\u0000\u038cc\u0001\u0000\u0000\u0000\u038d\u038f\u0005|\u0000\u0000"+
		"\u038e\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000"+
		"\u0391e\u0001\u0000\u0000\u0000\u0392\u0394\u0005{\u0000\u0000\u0393\u0392"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0393"+
		"\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396g\u0001"+
		"\u0000\u0000\u0000\u0397\u0399\u0007\u000e\u0000\u0000\u0398\u039a\u0005"+
		"/\u0000\u0000\u0399\u0398\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000"+
		"\u0000\u0000\u039ai\u0001\u0000\u0000\u0000\u039b\u03a0\u0005J\u0000\u0000"+
		"\u039c\u039f\u0003n7\u0000\u039d\u039f\u0003l6\u0000\u039e\u039c\u0001"+
		"\u0000\u0000\u0000\u039e\u039d\u0001\u0000\u0000\u0000\u039f\u03a2\u0001"+
		"\u0000\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a4\u0005K\u0000\u0000\u03a4k\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a6\u0005@\u0000\u0000\u03a6\u03a7\u0003j5\u0000\u03a7"+
		"m\u0001\u0000\u0000\u0000\u03a8\u03b6\u0003j5\u0000\u03a9\u03b6\u0003"+
		"p8\u0000\u03aa\u03b6\u0003r9\u0000\u03ab\u03b6\u0003t:\u0000\u03ac\u03b6"+
		"\u0003v;\u0000\u03ad\u03b6\u0003x<\u0000\u03ae\u03b6\u0003z=\u0000\u03af"+
		"\u03b6\u0003|>\u0000\u03b0\u03b6\u0003~?\u0000\u03b1\u03b6\u0003\u0082"+
		"A\u0000\u03b2\u03b6\u0003\u0084B\u0000\u03b3\u03b6\u0003\u0086C\u0000"+
		"\u03b4\u03b6\u0003\u0088D\u0000\u03b5\u03a8\u0001\u0000\u0000\u0000\u03b5"+
		"\u03a9\u0001\u0000\u0000\u0000\u03b5\u03aa\u0001\u0000\u0000\u0000\u03b5"+
		"\u03ab\u0001\u0000\u0000\u0000\u03b5\u03ac\u0001\u0000\u0000\u0000\u03b5"+
		"\u03ad\u0001\u0000\u0000\u0000\u03b5\u03ae\u0001\u0000\u0000\u0000\u03b5"+
		"\u03af\u0001\u0000\u0000\u0000\u03b5\u03b0\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b5\u03b2\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b6"+
		"o\u0001\u0000\u0000\u0000\u03b7\u03ba\u0003\u0090H\u0000\u03b8\u03ba\u0003"+
		"\u0092I\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03b9\u03b8\u0001\u0000"+
		"\u0000\u0000\u03baq\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005#\u0000\u0000"+
		"\u03bc\u03bd\u0005F\u0000\u0000\u03bd\u03be\u0003T*\u0000\u03be\u03bf"+
		"\u0005G\u0000\u0000\u03bf\u03c2\u0003n7\u0000\u03c0\u03c1\u0005\u0013"+
		"\u0000\u0000\u03c1\u03c3\u0003n7\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3s\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0005\u001f\u0000\u0000\u03c5\u03c8\u0005F\u0000\u0000\u03c6\u03c9"+
		"\u0003p8\u0000\u03c7\u03c9\u0005M\u0000\u0000\u03c8\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u03cc\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cd\u0003\u0092I\u0000\u03cb\u03cd\u0005M\u0000\u0000"+
		"\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03d0\u0003T*\u0000\u03cf\u03ce"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005G\u0000\u0000\u03d2\u03d3\u0003"+
		"n7\u0000\u03d3u\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005E\u0000\u0000"+
		"\u03d5\u03d6\u0005F\u0000\u0000\u03d6\u03d7\u0003T*\u0000\u03d7\u03d8"+
		"\u0005G\u0000\u0000\u03d8\u03d9\u0003n7\u0000\u03d9w\u0001\u0000\u0000"+
		"\u0000\u03da\u03db\u0005\u0012\u0000\u0000\u03db\u03dc\u0003n7\u0000\u03dc"+
		"\u03dd\u0005E\u0000\u0000\u03dd\u03de\u0005F\u0000\u0000\u03de\u03df\u0003"+
		"T*\u0000\u03df\u03e0\u0005G\u0000\u0000\u03e0\u03e1\u0005M\u0000\u0000"+
		"\u03e1y\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005\u000f\u0000\u0000\u03e3"+
		"\u03e4\u0005M\u0000\u0000\u03e4{\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005"+
		"\t\u0000\u0000\u03e6\u03e7\u0005M\u0000\u0000\u03e7}\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e9\u0005=\u0000\u0000\u03e9\u03ef\u0003T*\u0000\u03ea"+
		"\u03eb\u00057\u0000\u0000\u03eb\u03ec\u0005F\u0000\u0000\u03ec\u03ed\u0003"+
		"\"\u0011\u0000\u03ed\u03ee\u0005G\u0000\u0000\u03ee\u03f0\u0001\u0000"+
		"\u0000\u0000\u03ef\u03ea\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f3\u0003j5\u0000"+
		"\u03f2\u03f4\u0003\u0080@\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f6\u007f\u0001\u0000\u0000\u0000\u03f7"+
		"\u03ff\u0005\f\u0000\u0000\u03f8\u03fa\u0003\\.\u0000\u03f9\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fc\u0005F\u0000\u0000\u03fc\u03fd\u0003\""+
		"\u0011\u0000\u03fd\u03fe\u0005G\u0000\u0000\u03fe\u0400\u0001\u0000\u0000"+
		"\u0000\u03ff\u03f9\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000"+
		"\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0003j5\u0000\u0402"+
		"\u0081\u0001\u0000\u0000\u0000\u0403\u0405\u00056\u0000\u0000\u0404\u0406"+
		"\u0003T*\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000"+
		"\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0005M\u0000"+
		"\u0000\u0408\u0083\u0001\u0000\u0000\u0000\u0409\u040a\u0005\u0014\u0000"+
		"\u0000\u040a\u040b\u0003T*\u0000\u040b\u040c\u0003\u001a\r\u0000\u040c"+
		"\u040d\u0005M\u0000\u0000\u040d\u0085\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0005\u0017\u0000\u0000\u040f\u0410\u0003T*\u0000\u0410\u0411\u0003\u001a"+
		"\r\u0000\u0411\u0412\u0005M\u0000\u0000\u0412\u0087\u0001\u0000\u0000"+
		"\u0000\u0413\u0415\u0005\u0007\u0000\u0000\u0414\u0416\u0005\u0083\u0000"+
		"\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000"+
		"\u0000\u0416\u0418\u0001\u0000\u0000\u0000\u0417\u0419\u0003\u008aE\u0000"+
		"\u0418\u0417\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000\u0000\u0000"+
		"\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u041e\u0005\u0084\u0000\u0000"+
		"\u041b\u041d\u0003\u0098L\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041d"+
		"\u0420\u0001\u0000\u0000\u0000\u041e\u041c\u0001\u0000\u0000\u0000\u041e"+
		"\u041f\u0001\u0000\u0000\u0000\u041f\u0421\u0001\u0000\u0000\u0000\u0420"+
		"\u041e\u0001\u0000\u0000\u0000\u0421\u0422\u0005\u009b\u0000\u0000\u0422"+
		"\u0089\u0001\u0000\u0000\u0000\u0423\u0424\u0005\u0086\u0000\u0000\u0424"+
		"\u0429\u0005\u0085\u0000\u0000\u0425\u0426\u0005\u0088\u0000\u0000\u0426"+
		"\u0428\u0005\u0085\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428"+
		"\u042b\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u0429"+
		"\u042a\u0001\u0000\u0000\u0000\u042a\u042c\u0001\u0000\u0000\u0000\u042b"+
		"\u0429\u0001\u0000\u0000\u0000\u042c\u042d\u0005\u0087\u0000\u0000\u042d"+
		"\u008b\u0001\u0000\u0000\u0000\u042e\u0433\u0003P(\u0000\u042f\u0430\u0005"+
		"^\u0000\u0000\u0430\u0432\u0003P(\u0000\u0431\u042f\u0001\u0000\u0000"+
		"\u0000\u0432\u0435\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000"+
		"\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u008d\u0001\u0000\u0000"+
		"\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0436\u043a\u0005F\u0000\u0000"+
		"\u0437\u0439\u0005^\u0000\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0439"+
		"\u043c\u0001\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a"+
		"\u043b\u0001\u0000\u0000\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c"+
		"\u043a\u0001\u0000\u0000\u0000\u043d\u043e\u0003P(\u0000\u043e\u0445\u0001"+
		"\u0000\u0000\u0000\u043f\u0441\u0005^\u0000\u0000\u0440\u0442\u0003P("+
		"\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"+
		"\u0000\u0442\u0444\u0001\u0000\u0000\u0000\u0443\u043f\u0001\u0000\u0000"+
		"\u0000\u0444\u0447\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000"+
		"\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0448\u0001\u0000\u0000"+
		"\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0448\u0449\u0005G\u0000\u0000"+
		"\u0449\u008f\u0001\u0000\u0000\u0000\u044a\u044d\u0003P(\u0000\u044b\u044c"+
		"\u0005R\u0000\u0000\u044c\u044e\u0003T*\u0000\u044d\u044b\u0001\u0000"+
		"\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0454\u0001\u0000"+
		"\u0000\u0000\u044f\u0450\u0003\u008eG\u0000\u0450\u0451\u0005R\u0000\u0000"+
		"\u0451\u0452\u0003T*\u0000\u0452\u0454\u0001\u0000\u0000\u0000\u0453\u044a"+
		"\u0001\u0000\u0000\u0000\u0453\u044f\u0001\u0000\u0000\u0000\u0454\u0455"+
		"\u0001\u0000\u0000\u0000\u0455\u0456\u0005M\u0000\u0000\u0456\u0091\u0001"+
		"\u0000\u0000\u0000\u0457\u0458\u0003T*\u0000\u0458\u0459\u0005M\u0000"+
		"\u0000\u0459\u0093\u0001\u0000\u0000\u0000\u045a\u045b\u0005+\u0000\u0000"+
		"\u045b\u045c\u0005F\u0000\u0000\u045c\u045d\u0003\u0096K\u0000\u045d\u045e"+
		"\u0005P\u0000\u0000\u045e\u045f\u0003J%\u0000\u045f\u0460\u0005G\u0000"+
		"\u0000\u0460\u0095\u0001\u0000\u0000\u0000\u0461\u0464\u0003L&\u0000\u0462"+
		"\u0464\u0003\u001c\u000e\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463"+
		"\u0462\u0001\u0000\u0000\u0000\u0464\u0097\u0001\u0000\u0000\u0000\u0465"+
		"\u0471\u0003\u009aM\u0000\u0466\u0471\u0003\u009cN\u0000\u0467\u0471\u0003"+
		"\u009eO\u0000\u0468\u0471\u0003\u00acV\u0000\u0469\u0471\u0003\u00a0P"+
		"\u0000\u046a\u0471\u0003\u00a2Q\u0000\u046b\u0471\u0003\u00a6S\u0000\u046c"+
		"\u0471\u0005\u0094\u0000\u0000\u046d\u0471\u0005\u008c\u0000\u0000\u046e"+
		"\u0471\u0005\u008e\u0000\u0000\u046f\u0471\u0003\u00a8T\u0000\u0470\u0465"+
		"\u0001\u0000\u0000\u0000\u0470\u0466\u0001\u0000\u0000\u0000\u0470\u0467"+
		"\u0001\u0000\u0000\u0000\u0470\u0468\u0001\u0000\u0000\u0000\u0470\u0469"+
		"\u0001\u0000\u0000\u0000\u0470\u046a\u0001\u0000\u0000\u0000\u0470\u046b"+
		"\u0001\u0000\u0000\u0000\u0470\u046c\u0001\u0000\u0000\u0000\u0470\u046d"+
		"\u0001\u0000\u0000\u0000\u0470\u046e\u0001\u0000\u0000\u0000\u0470\u046f"+
		"\u0001\u0000\u0000\u0000\u0471\u0099\u0001\u0000\u0000\u0000\u0472\u0476"+
		"\u0005\u009a\u0000\u0000\u0473\u0475\u0003\u0098L\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001"+
		"\u0000\u0000\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0479\u0001"+
		"\u0000\u0000\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047a\u0005"+
		"\u009b\u0000\u0000\u047a\u009b\u0001\u0000\u0000\u0000\u047b\u047c\u0005"+
		"\u0095\u0000\u0000\u047c\u047f\u0005\u00a2\u0000\u0000\u047d\u047e\u0005"+
		"\u009e\u0000\u0000\u047e\u0480\u0003\u00b2Y\u0000\u047f\u047d\u0001\u0000"+
		"\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u048f\u0001\u0000"+
		"\u0000\u0000\u0481\u0482\u0005\u0095\u0000\u0000\u0482\u0487\u0005\u00a2"+
		"\u0000\u0000\u0483\u0484\u0005\u00a0\u0000\u0000\u0484\u0486\u0005\u00a2"+
		"\u0000\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0486\u0489\u0001\u0000"+
		"\u0000\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000"+
		"\u0000\u0000\u0488\u048c\u0001\u0000\u0000\u0000\u0489\u0487\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0005\u009e\u0000\u0000\u048b\u048d\u0003\u00ac"+
		"V\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u048f\u0001\u0000\u0000\u0000\u048e\u047b\u0001\u0000\u0000"+
		"\u0000\u048e\u0481\u0001\u0000\u0000\u0000\u048f\u009d\u0001\u0000\u0000"+
		"\u0000\u0490\u0491\u0003\u00aaU\u0000\u0491\u0492\u0005\u009e\u0000\u0000"+
		"\u0492\u0493\u0003\u00b2Y\u0000\u0493\u049f\u0001\u0000\u0000\u0000\u0494"+
		"\u0497\u0003\u00aaU\u0000\u0495\u0496\u0005\u00a0\u0000\u0000\u0496\u0498"+
		"\u0003\u00aaU\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0498\u0499\u0001"+
		"\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499\u049a\u0001"+
		"\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c\u0005"+
		"\u009e\u0000\u0000\u049c\u049d\u0003\u00acV\u0000\u049d\u049f\u0001\u0000"+
		"\u0000\u0000\u049e\u0490\u0001\u0000\u0000\u0000\u049e\u0494\u0001\u0000"+
		"\u0000\u0000\u049f\u009f\u0001\u0000\u0000\u0000\u04a0\u04a1\u0005\u0093"+
		"\u0000\u0000\u04a1\u04a2\u0003\u00b2Y\u0000\u04a2\u04a3\u0003\u009aM\u0000"+
		"\u04a3\u00a1\u0001\u0000\u0000\u0000\u04a4\u04a5\u0005\u0091\u0000\u0000"+
		"\u04a5\u04a6\u0003\u009aM\u0000\u04a6\u04a7\u0003\u00b2Y\u0000\u04a7\u04a8"+
		"\u0003\u009aM\u0000\u04a8\u04a9\u0003\u009aM\u0000\u04a9\u00a3\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0005\u008d\u0000\u0000\u04ab\u04ac\u0003\u00b0"+
		"X\u0000\u04ac\u04ad\u0003\u009aM\u0000\u04ad\u00a5\u0001\u0000\u0000\u0000"+
		"\u04ae\u04af\u0005\u0096\u0000\u0000\u04af\u04bb\u0003\u00b2Y\u0000\u04b0"+
		"\u04b2\u0003\u00a4R\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b2\u04b3"+
		"\u0001\u0000\u0000\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b4"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b7\u0001\u0000\u0000\u0000\u04b5\u04b6"+
		"\u0005\u008f\u0000\u0000\u04b6\u04b8\u0003\u009aM\u0000\u04b7\u04b5\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000\u04b8\u04bc\u0001"+
		"\u0000\u0000\u0000\u04b9\u04ba\u0005\u008f\u0000\u0000\u04ba\u04bc\u0003"+
		"\u009aM\u0000\u04bb\u04b1\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bc\u00a7\u0001\u0000\u0000\u0000\u04bd\u04be\u0005\u0092"+
		"\u0000\u0000\u04be\u04bf\u0005\u00a2\u0000\u0000\u04bf\u04c8\u0005\u009c"+
		"\u0000\u0000\u04c0\u04c5\u0005\u00a2\u0000\u0000\u04c1\u04c2\u0005\u00a0"+
		"\u0000\u0000\u04c2\u04c4\u0005\u00a2\u0000\u0000\u04c3\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c7\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c9\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04c0\u0001\u0000"+
		"\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000"+
		"\u0000\u0000\u04ca\u04d4\u0005\u009d\u0000\u0000\u04cb\u04cc\u0005\u00a1"+
		"\u0000\u0000\u04cc\u04d1\u0005\u00a2\u0000\u0000\u04cd\u04ce\u0005\u00a0"+
		"\u0000\u0000\u04ce\u04d0\u0005\u00a2\u0000\u0000\u04cf\u04cd\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d3\u0001\u0000\u0000\u0000\u04d1\u04cf\u0001\u0000"+
		"\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000\u04d2\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d4\u04cb\u0001\u0000"+
		"\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d7\u0003\u009aM\u0000\u04d7\u00a9\u0001\u0000\u0000"+
		"\u0000\u04d8\u04dd\u0005\u00a2\u0000\u0000\u04d9\u04da\u0005\u009f\u0000"+
		"\u0000\u04da\u04dc\u0007\u000f\u0000\u0000\u04db\u04d9\u0001\u0000\u0000"+
		"\u0000\u04dc\u04df\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000\u0000"+
		"\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u00ab\u0001\u0000\u0000"+
		"\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04e0\u04e1\u0007\u000f\u0000"+
		"\u0000\u04e1\u04ea\u0005\u009c\u0000\u0000\u04e2\u04e7\u0003\u00b2Y\u0000"+
		"\u04e3\u04e4\u0005\u00a0\u0000\u0000\u04e4\u04e6\u0003\u00b2Y\u0000\u04e5"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8"+
		"\u04eb\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea"+
		"\u04e2\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb"+
		"\u04ec\u0001\u0000\u0000\u0000\u04ec\u04ed\u0005\u009d\u0000\u0000\u04ed"+
		"\u00ad\u0001\u0000\u0000\u0000\u04ee\u04ef\u0007\u0010\u0000\u0000\u04ef"+
		"\u00af\u0001\u0000\u0000\u0000\u04f0\u04f6\u0005\u00a4\u0000\u0000\u04f1"+
		"\u04f6\u0005\u00a5\u0000\u0000\u04f2\u04f6\u0005\u00a3\u0000\u0000\u04f3"+
		"\u04f6\u0003\u00aeW\u0000\u04f4\u04f6\u0005\u00a6\u0000\u0000\u04f5\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f5\u04f1\u0001\u0000\u0000\u0000\u04f5\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f4"+
		"\u0001\u0000\u0000\u0000\u04f6\u00b1\u0001\u0000\u0000\u0000\u04f7\u04fb"+
		"\u0003\u00aaU\u0000\u04f8\u04fb\u0003\u00acV\u0000\u04f9\u04fb\u0003\u00b0"+
		"X\u0000\u04fa\u04f7\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000"+
		"\u0000\u04fa\u04f9\u0001\u0000\u0000\u0000\u04fb\u00b3\u0001\u0000\u0000"+
		"\u0000\u008b\u00c0\u00c2\u00cb\u00d3\u00df\u00e6\u00f0\u00f6\u00fb\u0101"+
		"\u0109\u010f\u011a\u0125\u012a\u0138\u0144\u0147\u014f\u0152\u0155\u015e"+
		"\u0163\u016c\u0171\u0174\u0179\u0186\u0188\u0196\u019b\u01a1\u01a5\u01b8"+
		"\u01ba\u01c2\u01c6\u01cc\u01cf\u01d8\u01da\u01df\u01e6\u01f8\u01fa\u0204"+
		"\u0208\u021b\u021d\u0222\u022a\u023a\u0259\u025b\u0261\u026e\u0271\u027b"+
		"\u027e\u0282\u0288\u0292\u0295\u02a2\u02a7\u02ac\u02af\u02b8\u02bd\u02c2"+
		"\u02d1\u02d6\u02e1\u02e3\u02eb\u02ef\u0306\u0308\u0338\u033e\u0342\u0349"+
		"\u0352\u0355\u035c\u035e\u0365\u0369\u036d\u0378\u0384\u038b\u0390\u0395"+
		"\u0399\u039e\u03a0\u03b5\u03b9\u03c2\u03c8\u03cc\u03cf\u03ef\u03f5\u03f9"+
		"\u03ff\u0405\u0415\u0418\u041e\u0429\u0433\u043a\u0441\u0445\u044d\u0453"+
		"\u0463\u0470\u0476\u047f\u0487\u048c\u048e\u0499\u049e\u04b3\u04b7\u04bb"+
		"\u04c5\u04c8\u04d1\u04d4\u04dd\u04e7\u04ea\u04f5\u04fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}