/* The following code was generated by JFlex 1.4.1 on 14.01.12 13:06 */

/* It's an automatically generated code. Do not modify it. */
package org.fest.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.xml.XmlElementType;
import com.intellij.psi.xml.XmlTokenType;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 14.01.12 13:06 from the specification file
 * <tt>D:/projects/github/FestSupport/src/org/fest/lang/lexer/_FestLexer.flex</tt>
 */
public class __FestLexer implements FlexLexer {
	/**
	 * initial size of the lookahead buffer
	 */
	private static final int ZZ_BUFFERSIZE = 16384;

	/**
	 * lexical states
	 */
	public static final int PROCESSING_INSTRUCTION = 4;
	public static final int C_COMMENT_END = 16;
	public static final int TAG = 3;
	public static final int FEST_TAG = 1;
	public static final int END_TAG = 6;
	public static final int C_COMMENT_START = 15;
	public static final int ATTR_VALUE_START = 10;
	public static final int PI_ANY = 5;
	public static final int CDATA = 14;
	public static final int COMMENT = 7;
	public static final int ATTR_VALUE_DQ = 11;
	public static final int FEST_END_TAG = 2;
	public static final int ATTR_VALUE_SQ = 12;
	public static final int DTD_MARKUP = 10;
	public static final int YYINITIAL = 0;
	public static final int DOCTYPE = 13;
	public static final int ATTR = 9;
	public static final int ATTR_LIST = 8;

	/**
	 * Translates characters to character classes
	 */
	private static final String ZZ_CMAP_PACKED =
			"\11\0\2\3\1\0\2\3\22\0\1\3\1\15\1\57\1\6\1\4" +
					"\1\67\1\16\1\60\1\14\1\14\3\0\1\11\1\10\1\65\12\2" +
					"\1\12\1\30\1\17\1\66\1\13\1\61\1\0\1\23\1\54\1\21" +
					"\1\22\1\50\1\44\2\1\1\56\2\1\1\55\1\52\1\1\1\45" +
					"\1\47\2\1\1\51\1\24\1\53\3\1\1\46\1\1\1\20\1\70" +
					"\1\25\1\0\1\7\1\0\1\32\1\41\2\44\1\64\1\63\1\31" +
					"\4\1\1\26\1\42\1\40\1\34\1\33\1\36\1\1\1\35\1\27" +
					"\1\37\2\1\1\43\2\1\1\5\1\14\1\62\54\0\1\1\12\0" +
					"\1\1\4\0\1\1\5\0\27\1\1\0\37\1\1\0\u013f\1\31\0" +
					"\162\1\4\0\14\1\16\0\5\1\11\0\1\1\213\0\1\1\13\0" +
					"\1\1\1\0\3\1\1\0\1\1\1\0\24\1\1\0\54\1\1\0" +
					"\46\1\1\0\5\1\4\0\202\1\10\0\105\1\1\0\46\1\2\0" +
					"\2\1\6\0\20\1\41\0\46\1\2\0\1\1\7\0\47\1\110\0" +
					"\33\1\5\0\3\1\56\0\32\1\5\0\13\1\43\0\2\1\1\0" +
					"\143\1\1\0\1\1\17\0\2\1\7\0\2\1\12\0\3\1\2\0" +
					"\1\1\20\0\1\1\1\0\36\1\35\0\3\1\60\0\46\1\13\0" +
					"\1\1\u0152\0\66\1\3\0\1\1\22\0\1\1\7\0\12\1\43\0" +
					"\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0\1\1\3\0" +
					"\4\1\3\0\1\1\36\0\2\1\1\0\3\1\16\0\2\1\23\0" +
					"\6\1\4\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0" +
					"\2\1\1\0\2\1\37\0\4\1\1\0\1\1\23\0\3\1\20\0" +
					"\11\1\1\0\3\1\1\0\26\1\1\0\7\1\1\0\2\1\1\0" +
					"\5\1\3\0\1\1\22\0\1\1\17\0\2\1\43\0\10\1\2\0" +
					"\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1\3\0" +
					"\1\1\36\0\2\1\1\0\3\1\17\0\1\1\21\0\1\1\1\0" +
					"\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0" +
					"\2\1\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1\113\0" +
					"\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1\46\0" +
					"\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0" +
					"\5\1\3\0\1\1\40\0\1\1\1\0\2\1\43\0\10\1\1\0" +
					"\3\1\1\0\27\1\1\0\20\1\46\0\2\1\43\0\22\1\3\0" +
					"\30\1\1\0\11\1\1\0\1\1\2\0\7\1\72\0\60\1\1\0" +
					"\2\1\14\0\7\1\72\0\2\1\1\0\1\1\2\0\2\1\1\0" +
					"\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0" +
					"\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1\11\0" +
					"\1\1\2\0\5\1\1\0\1\1\25\0\2\1\42\0\1\1\77\0" +
					"\10\1\1\0\42\1\35\0\4\1\164\0\42\1\1\0\5\1\1\0" +
					"\2\1\45\0\6\1\112\0\46\1\12\0\51\1\7\0\132\1\5\0" +
					"\104\1\5\0\122\1\6\0\7\1\1\0\77\1\1\0\1\1\1\0" +
					"\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\47\1\1\0" +
					"\1\1\1\0\4\1\2\0\37\1\1\0\1\1\1\0\4\1\2\0" +
					"\7\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\7\1\1\0" +
					"\27\1\1\0\37\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0" +
					"\47\1\1\0\23\1\105\0\125\1\14\0\u026c\1\2\0\10\1\12\0" +
					"\32\1\5\0\113\1\25\0\15\1\1\0\4\1\16\0\22\1\16\0" +
					"\22\1\16\0\15\1\1\0\3\1\17\0\64\1\43\0\1\1\4\0" +
					"\1\1\103\0\130\1\10\0\51\1\127\0\35\1\63\0\36\1\2\0" +
					"\5\1\u038b\0\154\1\224\0\234\1\4\0\132\1\6\0\26\1\2\0" +
					"\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0\1\1\1\0" +
					"\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0\7\1\1\0" +
					"\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1\4\0" +
					"\15\1\5\0\3\1\1\0\7\1\164\0\1\1\15\0\1\1\202\0" +
					"\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1\6\0" +
					"\1\1\1\0\1\1\1\0\1\1\1\0\4\1\1\0\3\1\1\0" +
					"\7\1\3\0\3\1\5\0\5\1\u0ebb\0\2\1\52\0\5\1\5\0" +
					"\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0\4\1\5\0" +
					"\50\1\4\0\136\1\21\0\30\1\70\0\20\1\u0200\0\u19b6\1\112\0" +
					"\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0\u012e\1\2\0\73\1\225\0" +
					"\7\1\14\0\5\1\5\0\1\1\1\0\12\1\1\0\15\1\1\0" +
					"\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0\154\1\41\0" +
					"\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1\164\0\5\1\1\0" +
					"\207\1\44\0\32\1\6\0\32\1\13\0\131\1\3\0\6\1\2\0" +
					"\6\1\2\0\6\1\2\0\3\1\43\0";

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 =
			"\1\1\20\0\1\1\1\2\1\1\1\3\1\4\1\1" +
					"\1\3\1\5\1\6\1\7\2\3\1\10\1\11\1\12" +
					"\1\3\2\13\1\3\4\14\1\15\1\16\1\17\1\16" +
					"\1\20\1\21\3\22\1\23\1\24\1\25\2\26\1\17" +
					"\1\26\1\27\3\26\1\30\1\3\2\15\2\3\2\1" +
					"\1\31\1\16\4\31\1\32\10\0\1\33\1\0\1\34" +
					"\1\0\1\35\1\11\1\36\2\13\1\37\1\15\2\0" +
					"\1\21\5\0\1\40\1\0\2\15\3\0\1\41\1\42" +
					"\1\0\1\43\14\0\1\44\1\45\1\46\1\47\1\50" +
					"\2\15\1\51\1\52\2\0\1\53\4\0\2\15\4\0" +
					"\2\15\2\0\1\54\1\0\1\55\1\56\2\0\1\57" +
					"\2\0\1\60\1\61";

	private static int[] zzUnpackAction() {
		int[] result = new int[162];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0;	   /* index in packed string  */
		int j = offset;  /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do result[j++] = value; while (--count > 0);
		}
		return j;
	}


	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 =
			"\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f" +
					"\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357" +
					"\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f" +
					"\0\u0558\0\u0591\0\u051f\0\u05ca\0\u0603\0\u063c\0\u0675\0\u051f" +
					"\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u051f\0\u0474\0\u05ca\0\u0759" +
					"\0\u0792\0\u051f\0\u07cb\0\u0804\0\u051f\0\u083d\0\u051f\0\u0474" +
					"\0\u05ca\0\u051f\0\u051f\0\u051f\0\u051f\0\u0876\0\u0474\0\u05ca" +
					"\0\u051f\0\u08af\0\u08e8\0\u0921\0\u051f\0\u095a\0\u0993\0\u09cc" +
					"\0\u0a05\0\u0a3e\0\u051f\0\u0a77\0\u051f\0\u0ab0\0\u0ae9\0\u0474" +
					"\0\u05ca\0\u0b22\0\u051f\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u0c3f" +
					"\0\u0c78\0\u0cb1\0\u0cea\0\u051f\0\u0d23\0\u0d5c\0\u0d95\0\u051f" +
					"\0\u0dce\0\u051f\0\u0e07\0\u0e40\0\u051f\0\u0e79\0\u0eb2\0\u0eeb" +
					"\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008\0\u095a\0\u051f\0\u1041" +
					"\0\u107a\0\u10b3\0\u0a05\0\u0a3e\0\u10ec\0\u051f\0\u051f\0\u1125" +
					"\0\u051f\0\u115e\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4" +
					"\0\u12ed\0\u1326\0\u135f\0\u1398\0\u13d1\0\u06e7\0\u051f\0\u051f" +
					"\0\u051f\0\u051f\0\u140a\0\u1443\0\u051f\0\u051f\0\u147c\0\u14b5" +
					"\0\u051f\0\u14ee\0\u1527\0\u1560\0\u1599\0\u15d2\0\u160b\0\u1644" +
					"\0\u167d\0\u16b6\0\u16ef\0\u1728\0\u1761\0\u179a\0\u17d3\0\u051f" +
					"\0\u180c\0\u0792\0\u0792\0\u1845\0\u187e\0\u051f\0\u18b7\0\u18f0" +
					"\0\u051f\0\u051f";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[162];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0;  /* index in packed string  */
		int j = offset;  /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 =
			"\3\22\1\23\1\24\1\22\1\24\7\22\1\25\1\26" +
					"\50\22\1\27\1\30\1\31\1\30\1\32\3\30\1\31" +
					"\3\30\1\33\2\30\1\25\1\34\1\30\4\31\1\30" +
					"\2\31\1\30\26\31\4\30\2\31\1\35\4\30\1\36" +
					"\1\30\1\32\3\30\1\36\3\30\1\33\2\30\1\25" +
					"\1\34\1\30\4\36\1\30\2\36\1\30\26\36\4\30" +
					"\2\36\5\30\1\37\1\30\1\32\3\30\1\37\3\30" +
					"\1\40\2\30\1\25\1\34\1\30\4\37\1\30\2\37" +
					"\1\30\26\37\4\30\2\37\1\41\4\30\1\42\5\30" +
					"\1\42\6\30\1\25\1\34\1\30\4\42\1\30\2\42" +
					"\1\30\12\42\1\43\13\42\2\30\1\44\1\30\2\42" +
					"\4\30\3\45\1\32\12\45\1\46\1\47\41\45\1\50" +
					"\7\45\1\30\1\51\1\30\1\32\3\30\1\51\3\30" +
					"\1\40\2\30\1\25\1\34\1\30\4\51\1\30\2\51" +
					"\1\30\26\51\4\30\2\51\4\30\11\52\1\53\5\52" +
					"\1\54\1\55\50\52\1\30\1\56\1\30\1\32\3\30" +
					"\1\56\6\30\1\25\1\34\1\30\4\56\1\30\2\56" +
					"\1\30\26\56\4\30\2\56\4\30\3\57\1\32\12\57" +
					"\1\60\1\61\37\57\1\62\1\63\5\57\1\64\2\57" +
					"\16\30\1\25\1\34\51\30\4\65\1\66\1\65\1\66" +
					"\7\65\1\67\1\70\37\65\1\71\7\65\1\72\5\65" +
					"\1\73\1\65\1\73\7\65\1\67\1\70\40\65\1\71" +
					"\6\65\1\74\1\65\1\30\1\51\1\30\1\32\3\30" +
					"\1\51\3\30\1\75\2\30\1\25\1\34\1\76\4\51" +
					"\1\30\2\51\1\30\16\51\1\77\1\51\1\100\5\51" +
					"\1\101\1\102\2\30\2\51\4\30\25\103\1\104\43\103" +
					"\1\105\1\106\7\105\1\107\4\105\1\110\1\111\1\105" +
					"\4\106\1\112\2\106\1\105\26\106\4\105\2\106\5\105" +
					"\1\106\7\105\1\107\4\105\1\110\1\111\1\105\4\106" +
					"\1\113\2\106\1\105\26\106\4\105\2\106\4\105\3\22" +
					"\2\0\1\22\1\0\7\22\2\0\50\22\1\27\3\0" +
					"\1\23\72\0\1\114\64\0\1\115\4\0\1\116\1\115" +
					"\11\0\4\115\1\0\1\117\1\115\1\0\1\117\1\120" +
					"\3\115\1\121\1\115\1\122\16\115\4\0\2\115\21\0" +
					"\1\123\43\0\1\124\1\0\1\125\1\0\1\126\3\0" +
					"\3\22\1\0\12\22\2\0\50\22\1\27\72\0\2\31" +
					"\4\0\3\31\7\0\4\31\1\0\2\31\1\0\26\31" +
					"\4\0\2\31\7\0\1\32\102\0\1\127\66\0\1\130" +
					"\56\0\2\36\4\0\3\36\7\0\4\36\1\0\2\36" +
					"\1\0\26\36\4\0\2\36\5\0\2\37\4\0\3\37" +
					"\1\131\6\0\4\37\1\0\2\37\1\0\26\37\4\0" +
					"\2\37\17\0\1\132\56\0\2\42\4\0\3\42\1\133" +
					"\6\0\4\42\1\0\2\42\1\0\26\42\4\0\2\42" +
					"\5\0\2\42\4\0\3\42\1\133\6\0\4\42\1\0" +
					"\2\42\1\0\11\42\1\134\14\42\4\0\2\42\17\0" +
					"\1\135\56\0\2\51\4\0\3\51\1\136\6\0\4\51" +
					"\1\0\2\51\1\0\26\51\4\0\2\51\4\0\11\52" +
					"\1\137\57\52\15\0\1\140\54\0\2\56\4\0\3\56" +
					"\1\141\6\0\4\56\1\0\2\56\1\0\26\56\4\0" +
					"\2\56\11\0\1\142\151\0\1\143\7\0\1\144\151\0" +
					"\1\145\2\0\25\146\1\147\31\146\1\150\11\146\1\0" +
					"\2\51\4\0\3\51\1\136\6\0\4\51\1\0\2\51" +
					"\1\0\22\51\1\151\3\51\4\0\2\51\5\0\2\51" +
					"\4\0\3\51\1\136\6\0\4\51\1\0\2\51\1\0" +
					"\15\51\1\152\10\51\4\0\2\51\4\0\57\153\1\65" +
					"\11\153\60\154\1\65\10\154\25\0\1\155\44\0\3\106" +
					"\4\0\1\106\3\0\3\106\2\0\4\106\1\0\2\106" +
					"\1\0\26\106\4\0\2\106\15\0\1\137\72\0\1\156" +
					"\55\0\17\114\1\0\42\114\1\157\6\114\1\0\2\115" +
					"\4\0\3\115\1\160\6\0\4\115\1\0\2\115\1\161" +
					"\26\115\4\0\2\115\6\0\1\162\40\0\1\163\26\0" +
					"\2\115\4\0\3\115\1\160\6\0\4\115\1\0\1\115" +
					"\1\164\1\161\26\115\4\0\2\115\5\0\2\115\4\0" +
					"\3\115\1\160\6\0\4\115\1\0\2\115\1\161\2\115" +
					"\1\165\6\115\1\166\14\115\4\0\2\115\5\0\2\115" +
					"\4\0\3\115\1\160\6\0\4\115\1\0\2\115\1\161" +
					"\6\115\1\167\17\115\4\0\2\115\5\0\2\115\4\0" +
					"\3\115\1\160\6\0\4\115\1\0\2\115\1\161\10\115" +
					"\1\170\15\115\4\0\2\115\15\0\1\171\6\0\1\172" +
					"\1\0\1\173\132\0\1\174\67\0\1\175\16\0\1\171" +
					"\6\0\1\172\51\0\2\131\4\0\3\131\7\0\4\131" +
					"\1\0\2\131\1\0\26\131\4\0\2\131\5\0\2\133" +
					"\4\0\3\133\7\0\4\133\1\0\2\133\1\0\26\133" +
					"\4\0\2\133\5\0\2\42\4\0\3\42\1\133\6\0" +
					"\4\42\1\0\1\176\1\42\1\0\26\42\4\0\2\42" +
					"\5\0\2\136\4\0\3\136\7\0\4\136\1\0\2\136" +
					"\1\0\26\136\4\0\2\136\17\0\1\177\75\0\1\200" +
					"\51\0\2\141\4\0\3\141\7\0\4\141\1\0\2\141" +
					"\1\0\26\141\4\0\2\141\4\0\57\142\1\0\2\142" +
					"\1\201\6\142\57\143\1\0\7\143\1\202\1\143\60\144" +
					"\1\0\1\144\1\201\6\144\60\145\1\0\6\145\1\202" +
					"\1\145\57\150\1\146\11\150\1\0\2\51\4\0\3\51" +
					"\1\136\6\0\4\51\1\0\2\51\1\0\23\51\1\203" +
					"\2\51\4\0\2\51\5\0\2\51\4\0\3\51\1\136" +
					"\6\0\4\51\1\0\2\51\1\0\20\51\1\204\5\51" +
					"\4\0\2\51\17\0\1\205\56\0\2\160\4\0\3\160" +
					"\7\0\4\160\1\0\2\160\1\161\26\160\4\0\2\160" +
					"\6\0\1\162\25\0\1\206\42\0\1\207\16\0\3\207" +
					"\6\0\1\207\6\0\1\207\2\0\1\207\3\0\1\207" +
					"\3\0\1\207\6\0\2\207\5\0\2\115\4\0\3\115" +
					"\1\160\6\0\4\115\1\0\2\115\1\206\26\115\4\0" +
					"\2\115\5\0\2\115\4\0\3\115\1\160\6\0\4\115" +
					"\1\0\2\115\1\161\3\115\1\210\22\115\4\0\2\115" +
					"\5\0\2\115\4\0\3\115\1\160\6\0\4\115\1\0" +
					"\2\115\1\161\2\115\1\164\23\115\4\0\2\115\5\0" +
					"\2\115\4\0\3\115\1\160\6\0\4\115\1\0\2\115" +
					"\1\161\3\115\1\117\22\115\4\0\2\115\5\0\2\115" +
					"\4\0\3\115\1\160\6\0\4\115\1\0\2\115\1\161" +
					"\4\115\1\166\21\115\4\0\2\115\15\0\1\211\100\0" +
					"\1\212\114\0\1\213\60\0\1\214\117\0\1\215\5\0" +
					"\2\51\4\0\3\51\1\136\6\0\4\51\1\0\2\51" +
					"\1\0\24\51\1\216\1\51\4\0\2\51\5\0\2\51" +
					"\4\0\3\51\1\136\6\0\3\51\1\217\1\0\2\51" +
					"\1\0\26\51\4\0\2\51\6\0\1\207\16\0\3\207" +
					"\4\0\1\206\1\0\1\207\6\0\1\207\2\0\1\207" +
					"\3\0\1\207\3\0\1\207\6\0\2\207\5\0\2\115" +
					"\4\0\3\115\1\160\6\0\4\115\1\0\2\115\1\161" +
					"\4\115\1\164\21\115\4\0\2\115\26\0\1\220\67\0" +
					"\1\221\76\0\1\222\76\0\1\223\34\0\2\51\4\0" +
					"\3\51\1\136\6\0\4\51\1\0\2\51\1\0\25\51" +
					"\1\224\4\0\2\51\5\0\2\51\4\0\3\51\1\136" +
					"\6\0\4\51\1\0\2\51\1\0\17\51\1\225\6\51" +
					"\4\0\2\51\27\0\1\226\71\0\1\227\56\0\1\230" +
					"\105\0\1\231\42\0\2\51\4\0\3\51\1\136\6\0" +
					"\1\232\3\51\1\0\2\51\1\0\26\51\4\0\2\51" +
					"\5\0\2\51\4\0\3\51\1\136\6\0\4\51\1\0" +
					"\2\51\1\0\21\51\1\233\4\51\4\0\2\51\30\0" +
					"\1\234\112\0\1\235\34\0\1\236\101\0\1\237\114\0" +
					"\1\240\41\0\1\241\120\0\1\242\20\0";

	private static int[] zzUnpackTrans() {
		int[] result = new int[6441];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0;	   /* index in packed string  */
		int j = offset;  /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do result[j++] = value; while (--count > 0);
		}
		return j;
	}


	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;
	private static final char[] EMPTY_BUFFER = new char[0];
	private static final int YYEOF = -1;
	private static java.io.Reader zzReader = null; // Fake

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = {
			"Unkown internal scanner error",
			"Error: could not match input",
			"Error: pushback value was too large"
	};

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 =
			"\1\1\20\0\6\1\1\11\2\1\1\11\4\1\1\11" +
					"\4\1\1\11\4\1\1\11\2\1\1\11\1\1\1\11" +
					"\2\1\4\11\3\1\1\11\3\1\1\11\5\1\1\11" +
					"\1\1\1\11\5\1\1\11\10\0\1\11\1\0\1\1" +
					"\1\0\1\11\1\1\1\11\2\1\1\11\1\1\2\0" +
					"\1\1\5\0\1\11\1\0\2\1\3\0\2\11\1\0" +
					"\1\11\14\0\1\1\4\11\2\1\2\11\2\0\1\11" +
					"\4\0\2\1\4\0\2\1\2\0\1\11\1\0\2\1" +
					"\2\0\1\11\2\0\2\11";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[162];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0;	   /* index in packed string  */
		int j = offset;  /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do result[j++] = value; while (--count > 0);
		}
		return j;
	}

	/**
	 * the current state of the DFA
	 */
	private int zzState;

	/**
	 * the current lexical state
	 */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is
	 * the source of the yytext() string
	 */
	private CharSequence zzBuffer = "";

	/**
	 * this buffer may contains the current text array to be matched when it is cheap to acquire it
	 */
	private char[] zzBufferArray;

	/**
	 * the textposition at the last accepting state
	 */
	private int zzMarkedPos;

	/**
	 * the textposition at the last state to be included in yytext
	 */
	private int zzPushbackPos;

	/**
	 * the current text position in the buffer
	 */
	private int zzCurrentPos;

	/**
	 * startRead marks the beginning of the yytext() string in the buffer
	 */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read
	 * from input
	 */
	private int zzEndRead;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/**
	 * zzAtEOF == true <=> the scanner is at the EOF
	 */
	private boolean zzAtEOF;

	/**
	 * denotes if the user-EOF-code has already been executed
	 */
	private boolean zzEOFDone;

	/* user code: */
	private IElementType elTokenType = XmlTokenType.XML_DATA_CHARACTERS;
	private IElementType elTokenType2 = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
	private IElementType javaEmbeddedTokenType = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
	private boolean myConditionalCommentsSupport;

	public void setConditionalCommentsSupport(final boolean b) {
		myConditionalCommentsSupport = b;
	}

	public void setElTypes(IElementType _elTokenType, IElementType _elTokenType2) {
		elTokenType = _elTokenType;
		elTokenType2 = _elTokenType2;
	}

	public void setJavaEmbeddedType(IElementType _tokenType) {
		javaEmbeddedTokenType = _tokenType;
	}

	private int myPrevState = YYINITIAL;

	public int yyprevstate() {
		return myPrevState;
	}

	private int popState() {
		final int prev = myPrevState;
		myPrevState = YYINITIAL;
		return prev;
	}

	protected void pushState(int state) {
		myPrevState = state;
	}


	public __FestLexer(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Creates a new scanner.
	 * There is also java.io.Reader version of this constructor.
	 *
	 * @param in the java.io.Inputstream to read input from.
	 */
	public __FestLexer(java.io.InputStream in) {
		this(new java.io.InputStreamReader(in));
	}

	/**
	 * Unpacks the compressed character translation table.
	 *
	 * @param packed the packed character translation table
	 * @return the unpacked character translation table
	 */
	private static char[] zzUnpackCMap(String packed) {
		char[] map = new char[0x10000];
		int i = 0;  /* index in packed string  */
		int j = 0;  /* index in unpacked array */
		while (i < 1252) {
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			do map[j++] = value; while (--count > 0);
		}
		return map;
	}

	public final int getTokenStart() {
		return zzStartRead;
	}

	public final int getTokenEnd() {
		return getTokenStart() + yylength();
	}

	public void reset(CharSequence buffer, int start, int end, int initialState) {
		zzBuffer = buffer;
		zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
		zzCurrentPos = zzMarkedPos = zzStartRead = start;
		zzPushbackPos = 0;
		zzAtEOF = false;
		zzAtBOL = true;
		zzEndRead = end;
		yybegin(initialState);
	}

	/**
	 * Refills the input buffer.
	 *
	 * @return <code>false</code>, iff there was new input.
	 * @throws java.io.IOException if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {
		return true;
	}


	/**
	 * Returns the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}


	/**
	 * Enters a new lexical state
	 *
	 * @param newState the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}


	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final CharSequence yytext() {
		return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
	}


	/**
	 * Returns the character at position <tt>pos</tt> from the
	 * matched text.
	 * <p/>
	 * It is equivalent to yytext().charAt(pos), but faster
	 *
	 * @param pos the position of the character to fetch.
	 *            A value from 0 to yylength()-1.
	 * @return the character at position pos
	 */
	public final char yycharat(int pos) {
		return zzBufferArray != null ? zzBufferArray[zzStartRead + pos] : zzBuffer.charAt(zzStartRead + pos);
	}


	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}


	/**
	 * Reports an error that occured while scanning.
	 * <p/>
	 * In a wellformed scanner (no or only correct usage of
	 * yypushback(int) and a match-all fallback rule) this method
	 * will only be called with things that "Can't Possibly Happen".
	 * If this method is called, something is seriously wrong
	 * (e.g. a JFlex bug producing a faulty scanner etc.).
	 * <p/>
	 * Usual syntax/scanner level error handling should be done
	 * in error fallback rules.
	 *
	 * @param errorCode the code of the errormessage to display
	 */
	private void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}


	/**
	 * Pushes the specified amount of characters back into the input stream.
	 * <p/>
	 * They will be read again by then next call of the scanning method
	 *
	 * @param number the number of characters to be read again.
	 *               This number must not be greater than yylength()!
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}


	/**
	 * Contains user EOF-code, which will be executed exactly once,
	 * when the end of file is reached
	 */
	private void zzDoEOF() {
		if (!zzEOFDone) {
			zzEOFDone = true;

		}
	}


	/**
	 * Resumes scanning until the next regular expression is matched,
	 * the end of input is encountered or an I/O-Error occurs.
	 *
	 * @return the next token
	 * @throws java.io.IOException if any I/O-Error occurs
	 */
	public IElementType advance() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		CharSequence zzBufferL = zzBuffer;
		char[] zzBufferArrayL = zzBufferArray;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = zzLexicalState;


			zzForAction:
			{
				while (true) {

					if (zzCurrentPosL < zzEndReadL)
						zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++);
					else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++);
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1) break zzForAction;
					zzState = zzNext;

					int zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8) break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
				case 23: {
					yybegin(ATTR_LIST);
					return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
				}
				case 50:
					break;
				case 22: {
					return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
				}
				case 51:
					break;
				case 46: {
					return XmlTokenType.XML_DOCTYPE_SYSTEM;
				}
				case 52:
					break;
				case 5: {
					yybegin(ATTR_LIST);
					pushState(FEST_TAG);
					return FestTokenType.XML_NAME;
				}
				case 53:
					break;
				case 21: {
					return XmlTokenType.XML_EQ;
				}
				case 54:
					break;
				case 12: {
					return XmlTokenType.XML_TAG_CHARACTERS;
				}
				case 55:
					break;
				case 48: {
					yybegin(CDATA);
					return XmlTokenType.XML_CDATA_START;
				}
				case 56:
					break;
				case 9: {
					yybegin(ATTR_LIST);
					pushState(TAG);
					return XmlTokenType.XML_NAME;
				}
				case 57:
					break;
				case 28: {
					yybegin(END_TAG);
					return XmlTokenType.XML_END_TAG_START;
				}
				case 58:
					break;
				case 38: {
					if (myConditionalCommentsSupport) {
						yybegin(C_COMMENT_END);
						return XmlTokenType.XML_CONDITIONAL_COMMENT_END_START;
					} else return XmlTokenType.XML_COMMENT_CHARACTERS;
				}
				case 59:
					break;
				case 34: {
					return elTokenType;
				}
				case 60:
					break;
				case 13: {
					return XmlTokenType.XML_NAME;
				}
				case 61:
					break;
				case 45: {
					return XmlTokenType.XML_DOCTYPE_PUBLIC;
				}
				case 62:
					break;
				case 43: {
					yybegin(COMMENT);
					return XmlTokenType.XML_COMMENT_START;
				}
				case 63:
					break;
				case 40: {
					return javaEmbeddedTokenType;
				}
				case 64:
					break;
				case 36: {
					yybegin(ATTR_LIST);
					pushState(PROCESSING_INSTRUCTION);
					return XmlTokenType.XML_NAME;
				}
				case 65:
					break;
				case 32: {
					return XmlElementType.XML_MARKUP;
				}
				case 66:
					break;
				case 2: {
					return XmlTokenType.XML_REAL_WHITE_SPACE;
				}
				case 67:
					break;
				case 1: {
					return XmlTokenType.XML_DATA_CHARACTERS;
				}
				case 68:
					break;
				case 26: {
					yybegin(COMMENT);
					return XmlTokenType.XML_CONDITIONAL_COMMENT_END;
				}
				case 69:
					break;
				case 47: {
					yybegin(FEST_END_TAG);
					return FestTokenType.XML_END_TAG_START;
				}
				case 70:
					break;
				case 15: {
					return XmlTokenType.XML_BAD_CHARACTER;
				}
				case 71:
					break;
				case 44: {
					yybegin(FEST_TAG);
					return FestTokenType.XML_START_TAG_START;
				}
				case 72:
					break;
				case 10: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_TAG_END;
				}
				case 73:
					break;
				case 7: {
					yybegin(YYINITIAL);
					return FestTokenType.XML_TAG_END;
				}
				case 74:
					break;
				case 33: {
					yybegin(COMMENT);
					return XmlTokenType.XML_CONDITIONAL_COMMENT_START_END;
				}
				case 75:
					break;
				case 37: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_COMMENT_END;
				}
				case 76:
					break;
				case 4: {
					yybegin(TAG);
					return XmlTokenType.XML_START_TAG_START;
				}
				case 77:
					break;
				case 30: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_EMPTY_ELEMENT_END;
				}
				case 78:
					break;
				case 27: {
					yybegin(PROCESSING_INSTRUCTION);
					return XmlTokenType.XML_PI_START;
				}
				case 79:
					break;
				case 8: {
					return FestTokenType.XML_NAME;
				}
				case 80:
					break;
				case 11: {
					yybegin(PI_ANY);
					return XmlTokenType.XML_NAME;
				}
				case 81:
					break;
				case 16: {
					if (myConditionalCommentsSupport) {
						yybegin(C_COMMENT_START);
						return XmlTokenType.XML_CONDITIONAL_COMMENT_START;
					} else return XmlTokenType.XML_COMMENT_CHARACTERS;
				}
				case 82:
					break;
				case 17: {
					yybegin(ATTR);
					return XmlTokenType.XML_NAME;
				}
				case 83:
					break;
				case 18: {
					yybegin(ATTR_LIST);
					yypushback(yylength());
				}
				case 84:
					break;
				case 24: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_DOCTYPE_END;
				}
				case 85:
					break;
				case 42: {
					return XmlTokenType.XML_CHAR_ENTITY_REF;
				}
				case 86:
					break;
				case 6: {
					return XmlTokenType.XML_WHITE_SPACE;
				}
				case 87:
					break;
				case 35: {
					return XmlTokenType.XML_ENTITY_REF_TOKEN;
				}
				case 88:
					break;
				case 19: {
					yybegin(ATTR_VALUE_DQ);
					return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
				}
				case 89:
					break;
				case 29: {
					yybegin(YYINITIAL);
					return FestTokenType.XML_EMPTY_ELEMENT_END;
				}
				case 90:
					break;
				case 20: {
					yybegin(ATTR_VALUE_SQ);
					return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
				}
				case 91:
					break;
				case 25: {
					yybegin(COMMENT);
					return XmlTokenType.XML_COMMENT_CHARACTERS;
				}
				case 92:
					break;
				case 41: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_CDATA_END;
				}
				case 93:
					break;
				case 3: {
					if (yystate() == YYINITIAL) {
						return XmlTokenType.XML_BAD_CHARACTER;
					} else yybegin(popState());
					yypushback(yylength());
				}
				case 94:
					break;
				case 39: {
					return elTokenType2;
				}
				case 95:
					break;
				case 31: {
					yybegin(YYINITIAL);
					return XmlTokenType.XML_PI_END;
				}
				case 96:
					break;
				case 49: {
					yybegin(DOCTYPE);
					return XmlTokenType.XML_DOCTYPE_START;
				}
				case 97:
					break;
				case 14: {
					return XmlTokenType.XML_COMMENT_CHARACTERS;
				}
				case 98:
					break;
				default:
					if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
						zzAtEOF = true;
						zzDoEOF();
						return null;
					} else {
						zzScanError(ZZ_NO_MATCH);
					}
			}
		}
	}


}
