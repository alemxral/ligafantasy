package com.google.android.datatransport.cct;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s.C3700b;
import u.g;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f14982c;

    /* renamed from: d, reason: collision with root package name */
    static final String f14983d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f14984e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f14985f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f14986g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f14987h;

    /* renamed from: a, reason: collision with root package name */
    private final String f14988a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14989b;

    static {
        String a8 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f14982c = a8;
        String a9 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f14983d = a9;
        String a10 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f14984e = a10;
        f14985f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(C3700b.b("proto"), C3700b.b("json"))));
        f14986g = new a(a8, null);
        f14987h = new a(a9, a10);
    }

    public a(String str, String str2) {
        this.f14988a = str;
        this.f14989b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // u.g
    public Set a() {
        return f14985f;
    }

    public byte[] b() {
        String str = this.f14989b;
        if (str == null && this.f14988a == null) {
            return null;
        }
        String str2 = this.f14988a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f14989b;
    }

    public String e() {
        return this.f14988a;
    }

    @Override // u.f
    public byte[] getExtras() {
        return b();
    }

    @Override // u.f
    public String getName() {
        return "cct";
    }
}
