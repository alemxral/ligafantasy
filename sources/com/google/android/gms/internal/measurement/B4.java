package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class B4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f15256a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);

    /* renamed from: b, reason: collision with root package name */
    static final Charset f15257b = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    /* renamed from: c, reason: collision with root package name */
    static final Charset f15258c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f15259d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f15260e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1955b4 f15261f;

    static {
        byte[] bArr = new byte[0];
        f15259d = bArr;
        f15260e = ByteBuffer.wrap(bArr);
        int i8 = AbstractC1955b4.f15635a;
        Z3 z32 = new Z3(bArr, 0, 0, false, null);
        try {
            z32.c(0);
            f15261f = z32;
        } catch (D4 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f15257b);
    }
}
