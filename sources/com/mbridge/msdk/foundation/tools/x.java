package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20091a = "x";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f20092b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f20093c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f20094d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f20095e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f20092b = hashMap;
        hashMap.put('v', 'A');
        f20092b.put('S', 'B');
        f20092b.put('o', 'C');
        f20092b.put('a', 'D');
        f20092b.put('j', 'E');
        f20092b.put('c', 'F');
        f20092b.put('7', 'G');
        f20092b.put('d', 'H');
        f20092b.put('R', 'I');
        f20092b.put('z', 'J');
        f20092b.put('p', 'K');
        f20092b.put('W', 'L');
        f20092b.put('i', 'M');
        f20092b.put('f', 'N');
        f20092b.put('G', 'O');
        f20092b.put('y', 'P');
        f20092b.put('N', 'Q');
        f20092b.put('x', 'R');
        f20092b.put('Z', 'S');
        f20092b.put('n', 'T');
        f20092b.put('V', 'U');
        f20092b.put('5', 'V');
        f20092b.put('k', 'W');
        f20092b.put('+', 'X');
        f20092b.put('D', 'Y');
        f20092b.put('H', 'Z');
        f20092b.put('L', 'a');
        f20092b.put('Y', 'b');
        f20092b.put('h', 'c');
        f20092b.put('J', 'd');
        f20092b.put('4', 'e');
        f20092b.put('6', 'f');
        f20092b.put('l', 'g');
        f20092b.put('t', 'h');
        f20092b.put('0', 'i');
        f20092b.put('U', 'j');
        f20092b.put('3', 'k');
        f20092b.put('Q', 'l');
        f20092b.put('r', 'm');
        f20092b.put('g', 'n');
        f20092b.put('E', 'o');
        f20092b.put('u', 'p');
        f20092b.put('q', 'q');
        f20092b.put('8', 'r');
        f20092b.put('s', 's');
        f20092b.put('w', 't');
        f20092b.put('/', 'u');
        f20092b.put('X', 'v');
        f20092b.put('M', 'w');
        f20092b.put('e', 'x');
        f20092b.put('B', 'y');
        f20092b.put('A', 'z');
        f20092b.put('T', '0');
        f20092b.put('2', '1');
        f20092b.put('F', '2');
        f20092b.put('b', '3');
        f20092b.put('9', '4');
        f20092b.put('P', '5');
        f20092b.put('1', '6');
        f20092b.put('O', '7');
        f20092b.put('I', '8');
        f20092b.put('K', '9');
        f20092b.put('m', '+');
        f20092b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f20093c = hashMap2;
        hashMap2.put('A', 'v');
        f20093c.put('B', 'S');
        f20093c.put('C', 'o');
        f20093c.put('D', 'a');
        f20093c.put('E', 'j');
        f20093c.put('F', 'c');
        f20093c.put('G', '7');
        f20093c.put('H', 'd');
        f20093c.put('I', 'R');
        f20093c.put('J', 'z');
        f20093c.put('K', 'p');
        f20093c.put('L', 'W');
        f20093c.put('M', 'i');
        f20093c.put('N', 'f');
        f20093c.put('O', 'G');
        f20093c.put('P', 'y');
        f20093c.put('Q', 'N');
        f20093c.put('R', 'x');
        f20093c.put('S', 'Z');
        f20093c.put('T', 'n');
        f20093c.put('U', 'V');
        f20093c.put('V', '5');
        f20093c.put('W', 'k');
        f20093c.put('X', '+');
        f20093c.put('Y', 'D');
        f20093c.put('Z', 'H');
        f20093c.put('a', 'L');
        f20093c.put('b', 'Y');
        f20093c.put('c', 'h');
        f20093c.put('d', 'J');
        f20093c.put('e', '4');
        f20093c.put('f', '6');
        f20093c.put('g', 'l');
        f20093c.put('h', 't');
        f20093c.put('i', '0');
        f20093c.put('j', 'U');
        f20093c.put('k', '3');
        f20093c.put('l', 'Q');
        f20093c.put('m', 'r');
        f20093c.put('n', 'g');
        f20093c.put('o', 'E');
        f20093c.put('p', 'u');
        f20093c.put('q', 'q');
        f20093c.put('r', '8');
        f20093c.put('s', 's');
        f20093c.put('t', 'w');
        f20093c.put('u', '/');
        f20093c.put('v', 'X');
        f20093c.put('w', 'M');
        f20093c.put('x', 'e');
        f20093c.put('y', 'B');
        f20093c.put('z', 'A');
        f20093c.put('0', 'T');
        f20093c.put('1', '2');
        f20093c.put('2', 'F');
        f20093c.put('3', 'b');
        f20093c.put('4', '9');
        f20093c.put('5', 'P');
        f20093c.put('6', '1');
        f20093c.put('7', 'O');
        f20093c.put('8', 'I');
        f20093c.put('9', 'K');
        f20093c.put('+', 'm');
        f20093c.put('/', 'C');
    }

    private x() {
    }

    public static String a(String str) {
        return ae.a(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ae.b(str);
    }
}
