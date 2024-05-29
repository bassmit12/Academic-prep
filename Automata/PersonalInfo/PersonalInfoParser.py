# Generated from PersonalInfo.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,17,101,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,1,0,4,0,34,8,0,11,0,12,0,35,1,1,1,1,1,1,1,1,
        3,1,42,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,5,3,
        5,57,8,5,1,5,1,5,3,5,61,8,5,1,5,1,5,3,5,65,8,5,1,6,1,6,1,7,1,7,1,
        8,1,8,1,9,1,9,1,10,4,10,76,8,10,11,10,12,10,77,1,11,1,11,1,11,3,
        11,83,8,11,1,12,1,12,5,12,87,8,12,10,12,12,12,90,9,12,1,13,4,13,
        93,8,13,11,13,12,13,94,1,14,1,14,1,15,1,15,1,15,0,0,16,0,2,4,6,8,
        10,12,14,16,18,20,22,24,26,28,30,0,3,1,0,14,16,1,0,5,8,1,0,9,11,
        95,0,33,1,0,0,0,2,41,1,0,0,0,4,43,1,0,0,0,6,47,1,0,0,0,8,51,1,0,
        0,0,10,56,1,0,0,0,12,66,1,0,0,0,14,68,1,0,0,0,16,70,1,0,0,0,18,72,
        1,0,0,0,20,75,1,0,0,0,22,79,1,0,0,0,24,84,1,0,0,0,26,92,1,0,0,0,
        28,96,1,0,0,0,30,98,1,0,0,0,32,34,3,2,1,0,33,32,1,0,0,0,34,35,1,
        0,0,0,35,33,1,0,0,0,35,36,1,0,0,0,36,1,1,0,0,0,37,42,3,4,2,0,38,
        42,3,6,3,0,39,42,3,8,4,0,40,42,3,10,5,0,41,37,1,0,0,0,41,38,1,0,
        0,0,41,39,1,0,0,0,41,40,1,0,0,0,42,3,1,0,0,0,43,44,3,12,6,0,44,45,
        5,1,0,0,45,46,3,14,7,0,46,5,1,0,0,0,47,48,3,18,9,0,48,49,5,2,0,0,
        49,50,3,20,10,0,50,7,1,0,0,0,51,52,5,3,0,0,52,53,5,12,0,0,53,54,
        3,22,11,0,54,9,1,0,0,0,55,57,3,28,14,0,56,55,1,0,0,0,56,57,1,0,0,
        0,57,58,1,0,0,0,58,60,3,12,6,0,59,61,3,16,8,0,60,59,1,0,0,0,60,61,
        1,0,0,0,61,62,1,0,0,0,62,64,3,14,7,0,63,65,3,30,15,0,64,63,1,0,0,
        0,64,65,1,0,0,0,65,11,1,0,0,0,66,67,5,13,0,0,67,13,1,0,0,0,68,69,
        5,13,0,0,69,15,1,0,0,0,70,71,5,13,0,0,71,17,1,0,0,0,72,73,5,13,0,
        0,73,19,1,0,0,0,74,76,5,14,0,0,75,74,1,0,0,0,76,77,1,0,0,0,77,75,
        1,0,0,0,77,78,1,0,0,0,78,21,1,0,0,0,79,82,3,24,12,0,80,81,5,4,0,
        0,81,83,3,26,13,0,82,80,1,0,0,0,82,83,1,0,0,0,83,23,1,0,0,0,84,88,
        5,14,0,0,85,87,7,0,0,0,86,85,1,0,0,0,87,90,1,0,0,0,88,86,1,0,0,0,
        88,89,1,0,0,0,89,25,1,0,0,0,90,88,1,0,0,0,91,93,5,14,0,0,92,91,1,
        0,0,0,93,94,1,0,0,0,94,92,1,0,0,0,94,95,1,0,0,0,95,27,1,0,0,0,96,
        97,7,1,0,0,97,29,1,0,0,0,98,99,7,2,0,0,99,31,1,0,0,0,9,35,41,56,
        60,64,77,82,88,94
    ]

class PersonalInfoParser ( Parser ):

    grammarFileName = "PersonalInfo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'and'", "'with'", "'telephone number'", 
                     "'ext'", "'Mr.'", "'Mrs.'", "'Ms.'", "'Dr.'", "'Jr.'", 
                     "'Sr.'", "'III'", "':'", "<INVALID>", "<INVALID>", 
                     "'-'", "' '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "COLON", "WORD", "DIGIT", "DASH", "SPACE", "WS" ]

    RULE_document = 0
    RULE_info = 1
    RULE_nameAndLastName = 2
    RULE_nameWithAge = 3
    RULE_detailedPhoneNumber = 4
    RULE_fullNameWithDetails = 5
    RULE_firstName = 6
    RULE_lastName = 7
    RULE_middleName = 8
    RULE_name = 9
    RULE_age = 10
    RULE_detailedNumber = 11
    RULE_number = 12
    RULE_extension = 13
    RULE_title = 14
    RULE_suffix = 15

    ruleNames =  [ "document", "info", "nameAndLastName", "nameWithAge", 
                   "detailedPhoneNumber", "fullNameWithDetails", "firstName", 
                   "lastName", "middleName", "name", "age", "detailedNumber", 
                   "number", "extension", "title", "suffix" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    COLON=12
    WORD=13
    DIGIT=14
    DASH=15
    SPACE=16
    WS=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def info(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PersonalInfoParser.InfoContext)
            else:
                return self.getTypedRuleContext(PersonalInfoParser.InfoContext,i)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)




    def document(self):

        localctx = PersonalInfoParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 32
                self.info()
                self.state = 35 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 8680) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InfoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def nameAndLastName(self):
            return self.getTypedRuleContext(PersonalInfoParser.NameAndLastNameContext,0)


        def nameWithAge(self):
            return self.getTypedRuleContext(PersonalInfoParser.NameWithAgeContext,0)


        def detailedPhoneNumber(self):
            return self.getTypedRuleContext(PersonalInfoParser.DetailedPhoneNumberContext,0)


        def fullNameWithDetails(self):
            return self.getTypedRuleContext(PersonalInfoParser.FullNameWithDetailsContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_info

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInfo" ):
                listener.enterInfo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInfo" ):
                listener.exitInfo(self)




    def info(self):

        localctx = PersonalInfoParser.InfoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_info)
        try:
            self.state = 41
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 37
                self.nameAndLastName()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 38
                self.nameWithAge()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 39
                self.detailedPhoneNumber()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.fullNameWithDetails()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NameAndLastNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def firstName(self):
            return self.getTypedRuleContext(PersonalInfoParser.FirstNameContext,0)


        def lastName(self):
            return self.getTypedRuleContext(PersonalInfoParser.LastNameContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_nameAndLastName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNameAndLastName" ):
                listener.enterNameAndLastName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNameAndLastName" ):
                listener.exitNameAndLastName(self)




    def nameAndLastName(self):

        localctx = PersonalInfoParser.NameAndLastNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_nameAndLastName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.firstName()
            self.state = 44
            self.match(PersonalInfoParser.T__0)
            self.state = 45
            self.lastName()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NameWithAgeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def name(self):
            return self.getTypedRuleContext(PersonalInfoParser.NameContext,0)


        def age(self):
            return self.getTypedRuleContext(PersonalInfoParser.AgeContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_nameWithAge

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNameWithAge" ):
                listener.enterNameWithAge(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNameWithAge" ):
                listener.exitNameWithAge(self)




    def nameWithAge(self):

        localctx = PersonalInfoParser.NameWithAgeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_nameWithAge)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.name()
            self.state = 48
            self.match(PersonalInfoParser.T__1)
            self.state = 49
            self.age()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DetailedPhoneNumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLON(self):
            return self.getToken(PersonalInfoParser.COLON, 0)

        def detailedNumber(self):
            return self.getTypedRuleContext(PersonalInfoParser.DetailedNumberContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_detailedPhoneNumber

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDetailedPhoneNumber" ):
                listener.enterDetailedPhoneNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDetailedPhoneNumber" ):
                listener.exitDetailedPhoneNumber(self)




    def detailedPhoneNumber(self):

        localctx = PersonalInfoParser.DetailedPhoneNumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_detailedPhoneNumber)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(PersonalInfoParser.T__2)
            self.state = 52
            self.match(PersonalInfoParser.COLON)
            self.state = 53
            self.detailedNumber()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FullNameWithDetailsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def firstName(self):
            return self.getTypedRuleContext(PersonalInfoParser.FirstNameContext,0)


        def lastName(self):
            return self.getTypedRuleContext(PersonalInfoParser.LastNameContext,0)


        def title(self):
            return self.getTypedRuleContext(PersonalInfoParser.TitleContext,0)


        def middleName(self):
            return self.getTypedRuleContext(PersonalInfoParser.MiddleNameContext,0)


        def suffix(self):
            return self.getTypedRuleContext(PersonalInfoParser.SuffixContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_fullNameWithDetails

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFullNameWithDetails" ):
                listener.enterFullNameWithDetails(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFullNameWithDetails" ):
                listener.exitFullNameWithDetails(self)




    def fullNameWithDetails(self):

        localctx = PersonalInfoParser.FullNameWithDetailsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_fullNameWithDetails)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 480) != 0):
                self.state = 55
                self.title()


            self.state = 58
            self.firstName()
            self.state = 60
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 59
                self.middleName()


            self.state = 62
            self.lastName()
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 3584) != 0):
                self.state = 63
                self.suffix()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FirstNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(PersonalInfoParser.WORD, 0)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_firstName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFirstName" ):
                listener.enterFirstName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFirstName" ):
                listener.exitFirstName(self)




    def firstName(self):

        localctx = PersonalInfoParser.FirstNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_firstName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(PersonalInfoParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LastNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(PersonalInfoParser.WORD, 0)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_lastName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLastName" ):
                listener.enterLastName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLastName" ):
                listener.exitLastName(self)




    def lastName(self):

        localctx = PersonalInfoParser.LastNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_lastName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(PersonalInfoParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MiddleNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(PersonalInfoParser.WORD, 0)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_middleName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMiddleName" ):
                listener.enterMiddleName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMiddleName" ):
                listener.exitMiddleName(self)




    def middleName(self):

        localctx = PersonalInfoParser.MiddleNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_middleName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(PersonalInfoParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(PersonalInfoParser.WORD, 0)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterName" ):
                listener.enterName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitName" ):
                listener.exitName(self)




    def name(self):

        localctx = PersonalInfoParser.NameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_name)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(PersonalInfoParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AgeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(PersonalInfoParser.DIGIT)
            else:
                return self.getToken(PersonalInfoParser.DIGIT, i)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_age

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAge" ):
                listener.enterAge(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAge" ):
                listener.exitAge(self)




    def age(self):

        localctx = PersonalInfoParser.AgeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_age)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 74
                self.match(PersonalInfoParser.DIGIT)
                self.state = 77 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==14):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DetailedNumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def number(self):
            return self.getTypedRuleContext(PersonalInfoParser.NumberContext,0)


        def extension(self):
            return self.getTypedRuleContext(PersonalInfoParser.ExtensionContext,0)


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_detailedNumber

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDetailedNumber" ):
                listener.enterDetailedNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDetailedNumber" ):
                listener.exitDetailedNumber(self)




    def detailedNumber(self):

        localctx = PersonalInfoParser.DetailedNumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_detailedNumber)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            self.number()
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==4:
                self.state = 80
                self.match(PersonalInfoParser.T__3)
                self.state = 81
                self.extension()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(PersonalInfoParser.DIGIT)
            else:
                return self.getToken(PersonalInfoParser.DIGIT, i)

        def DASH(self, i:int=None):
            if i is None:
                return self.getTokens(PersonalInfoParser.DASH)
            else:
                return self.getToken(PersonalInfoParser.DASH, i)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(PersonalInfoParser.SPACE)
            else:
                return self.getToken(PersonalInfoParser.SPACE, i)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_number

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)




    def number(self):

        localctx = PersonalInfoParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_number)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(PersonalInfoParser.DIGIT)
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 114688) != 0):
                self.state = 85
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 114688) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 90
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExtensionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(PersonalInfoParser.DIGIT)
            else:
                return self.getToken(PersonalInfoParser.DIGIT, i)

        def getRuleIndex(self):
            return PersonalInfoParser.RULE_extension

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExtension" ):
                listener.enterExtension(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExtension" ):
                listener.exitExtension(self)




    def extension(self):

        localctx = PersonalInfoParser.ExtensionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_extension)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 91
                self.match(PersonalInfoParser.DIGIT)
                self.state = 94 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==14):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TitleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_title

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTitle" ):
                listener.enterTitle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTitle" ):
                listener.exitTitle(self)




    def title(self):

        localctx = PersonalInfoParser.TitleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_title)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 480) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuffixContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return PersonalInfoParser.RULE_suffix

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuffix" ):
                listener.enterSuffix(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuffix" ):
                listener.exitSuffix(self)




    def suffix(self):

        localctx = PersonalInfoParser.SuffixContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_suffix)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3584) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





