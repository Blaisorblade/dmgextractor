/* Generated By:JavaCC: Do not edit this line. AssConstants.java */
package org.catacombae.xml.parser;

public interface AssConstants {

  int EOF = 0;
  int SINGLE_S = 1;
  int CHAR = 2;
  int NAME = 3;
  int NAMESTART = 4;
  int NAMECHAR = 5;
  int LETTER = 6;
  int BASECHAR = 7;
  int IDEOGRAPHIC = 8;
  int COMBININGCHAR = 9;
  int DIGIT = 10;
  int EXTENDER = 11;
  int REFERENCE = 12;
  int ENTITYREF = 13;
  int CHARREF = 14;
  int STARTTAG = 16;
  int STARTCLOSINGTAG = 17;
  int STARTPI = 18;
  int STARTXMLDECL = 19;
  int STARTDOCTYPEDECL = 20;
  int STARTCOMMENT = 21;
  int STARTCDATA = 22;
  int CHARDATA = 23;
  int DEFAULT_REFERENCE = 24;
  int ENDXMLDECL = 25;
  int XMLDECL_EQ = 26;
  int XD_DQUOTE_OPEN = 27;
  int XD_SQUOTE_OPEN = 28;
  int VERSION = 29;
  int ENCODING = 30;
  int STANDALONE = 31;
  int XD_DQUOTE_STRING = 33;
  int XD_DQUOTE_CLOSE = 34;
  int XD_SQUOTE_STRING = 35;
  int XD_SQUOTE_CLOSE = 36;
  int VERSION_DOPEN = 37;
  int VERSION_DCLOSE = 38;
  int VERSION_SOPEN = 39;
  int VERSION_SCLOSE = 40;
  int VER = 41;
  int STANDALONE_DOPEN = 42;
  int STANDALONE_DCLOSE = 43;
  int STANDALONE_SOPEN = 44;
  int STANDALONE_SCLOSE = 45;
  int STANDALONE_YES = 46;
  int STANDALONE_NO = 47;
  int WDD_NAME = 48;
  int ENDDOCTYPEDECL = 49;
  int EXTERNALID = 50;
  int SYSTEMLITERAL = 51;
  int PUBIDLITERAL = 52;
  int PUBIDCHAR = 53;
  int BEGIN_INTSUBSET = 54;
  int END_INTSUBSET = 56;
  int WHATEVER = 57;
  int ENDCOMMENT = 58;
  int COMMENT_ILLEGAL = 59;
  int COMMENT_CHAR = 60;
  int ENDPI = 61;
  int ILLEGALTARGET = 62;
  int PITARGET = 63;
  int WITHINPI_S = 64;
  int PC_CHAR = 65;
  int WT_EQ = 66;
  int WT_NAME = 67;
  int WT_DQUOTE = 68;
  int WT_SQUOTE = 69;
  int EMPTY_ENDTAG = 70;
  int ENDTAG = 71;
  int ATTR_DQUOTE = 73;
  int ATTR_SQUOTE = 74;
  int ATTR_DQUOTE_STRING = 75;
  int ATTR_SQUOTE_STRING = 76;
  int ATTR_REFERENCE = 77;
  int ENDCDATA = 78;
  int WCD_CHAR = 79;

  int WithinCData = 0;
  int Attribute = 1;
  int WithinTag = 2;
  int WithinPIContent = 3;
  int WithinPI = 4;
  int Comment = 5;
  int WithinIntSubset = 6;
  int WithinDoctypeDecl = 7;
  int WithinXMLDecl_Standalone = 8;
  int WithinXMLDecl_Version = 9;
  int WithinXMLDecl_SquoteString = 10;
  int WithinXMLDecl_DquoteString = 11;
  int WithinXMLDecl = 12;
  int DEFAULT = 13;

  String[] tokenImage = {
    "<EOF>",
    "<SINGLE_S>",
    "<CHAR>",
    "<NAME>",
    "<NAMESTART>",
    "<NAMECHAR>",
    "<LETTER>",
    "<BASECHAR>",
    "<IDEOGRAPHIC>",
    "<COMBININGCHAR>",
    "<DIGIT>",
    "<EXTENDER>",
    "<REFERENCE>",
    "<ENTITYREF>",
    "<CHARREF>",
    "<token of kind 15>",
    "\"<\"",
    "\"</\"",
    "\"<?\"",
    "\"<?xml\"",
    "\"<!DOCTYPE\"",
    "\"<!--\"",
    "\"<![CDATA[\"",
    "<CHARDATA>",
    "<DEFAULT_REFERENCE>",
    "\"?>\"",
    "\"=\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"version\"",
    "\"encoding\"",
    "\"standalone\"",
    "<token of kind 32>",
    "<XD_DQUOTE_STRING>",
    "\"\\\"\"",
    "<XD_SQUOTE_STRING>",
    "\"\\\'\"",
    "\"=\\\"\"",
    "\"\\\"\"",
    "\"=\\\'\"",
    "\"\\\'\"",
    "\"1.0\"",
    "\"=\\\"\"",
    "\"\\\"\"",
    "\"=\\\'\"",
    "\"\\\'\"",
    "\"yes\"",
    "\"no\"",
    "<WDD_NAME>",
    "\">\"",
    "<EXTERNALID>",
    "<SYSTEMLITERAL>",
    "<PUBIDLITERAL>",
    "<PUBIDCHAR>",
    "\"[\"",
    "<token of kind 55>",
    "\"]\"",
    "<WHATEVER>",
    "\"-->\"",
    "\"--\"",
    "<COMMENT_CHAR>",
    "\"?>\"",
    "<ILLEGALTARGET>",
    "<PITARGET>",
    "<WITHINPI_S>",
    "<PC_CHAR>",
    "\"=\"",
    "<WT_NAME>",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"/>\"",
    "\">\"",
    "<token of kind 72>",
    "\"\\\"\"",
    "\"\\\'\"",
    "<ATTR_DQUOTE_STRING>",
    "<ATTR_SQUOTE_STRING>",
    "<ATTR_REFERENCE>",
    "\"]]>\"",
    "<WCD_CHAR>",
  };

}
