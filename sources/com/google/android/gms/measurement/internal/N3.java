package com.google.android.gms.measurement.internal;

import G.a;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class N3 extends AbstractC2190f4 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f16221d;

    /* renamed from: e, reason: collision with root package name */
    public final F1 f16222e;

    /* renamed from: f, reason: collision with root package name */
    public final F1 f16223f;

    /* renamed from: g, reason: collision with root package name */
    public final F1 f16224g;

    /* renamed from: h, reason: collision with root package name */
    public final F1 f16225h;

    /* renamed from: i, reason: collision with root package name */
    public final F1 f16226i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(r4 r4Var) {
        super(r4Var);
        this.f16221d = new HashMap();
        I1 F8 = this.f16764a.F();
        F8.getClass();
        this.f16222e = new F1(F8, "last_delete_stale", 0L);
        I1 F9 = this.f16764a.F();
        F9.getClass();
        this.f16223f = new F1(F9, "backoff", 0L);
        I1 F10 = this.f16764a.F();
        F10.getClass();
        this.f16224g = new F1(F10, "last_upload", 0L);
        I1 F11 = this.f16764a.F();
        F11.getClass();
        this.f16225h = new F1(F11, "last_upload_attempt", 0L);
        I1 F12 = this.f16764a.F();
        F12.getClass();
        this.f16226i = new F1(F12, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    final Pair m(String str) {
        M3 m32;
        a.C0045a c0045a;
        h();
        long elapsedRealtime = this.f16764a.a().elapsedRealtime();
        M3 m33 = (M3) this.f16221d.get(str);
        if (m33 != null && elapsedRealtime < m33.f16214c) {
            return new Pair(m33.f16212a, Boolean.valueOf(m33.f16213b));
        }
        G.a.b(true);
        long r8 = this.f16764a.z().r(str, AbstractC2217k1.f16573c) + elapsedRealtime;
        try {
            long r9 = this.f16764a.z().r(str, AbstractC2217k1.f16575d);
            if (r9 > 0) {
                try {
                    c0045a = G.a.a(this.f16764a.c());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (m33 != null && elapsedRealtime < m33.f16214c + r9) {
                        return new Pair(m33.f16212a, Boolean.valueOf(m33.f16213b));
                    }
                    c0045a = null;
                }
            } else {
                c0045a = G.a.a(this.f16764a.c());
            }
        } catch (Exception e8) {
            this.f16764a.d().q().b("Unable to get advertising id", e8);
            m32 = new M3("", false, r8);
        }
        if (c0045a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a8 = c0045a.a();
        if (a8 != null) {
            m32 = new M3(a8, c0045a.b(), r8);
        } else {
            m32 = new M3("", c0045a.b(), r8);
        }
        this.f16221d.put(str, m32);
        G.a.b(false);
        return new Pair(m32.f16212a, Boolean.valueOf(m32.f16213b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair n(String str, m0.p pVar) {
        if (pVar.j(m0.o.AD_STORAGE)) {
            return m(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String o(String str, boolean z8) {
        String str2;
        h();
        if (z8) {
            str2 = (String) m(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest t8 = y4.t();
        if (t8 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, t8.digest(str2.getBytes())));
    }
}
