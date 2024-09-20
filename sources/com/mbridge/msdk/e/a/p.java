package com.mbridge.msdk.e.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class p<T> implements Comparable<p<T>> {

    /* renamed from: a, reason: collision with root package name */
    private d f18806a;

    /* renamed from: b, reason: collision with root package name */
    private String f18807b;

    /* renamed from: c, reason: collision with root package name */
    private s f18808c;

    /* renamed from: d, reason: collision with root package name */
    private final aa.a f18809d;

    /* renamed from: e, reason: collision with root package name */
    private int f18810e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18811f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18812g;

    /* renamed from: h, reason: collision with root package name */
    private final int f18813h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f18814i;

    /* renamed from: j, reason: collision with root package name */
    private r.a f18815j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f18816k;

    /* renamed from: l, reason: collision with root package name */
    private q f18817l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18818m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18819n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18820o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18821p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18822q;

    /* renamed from: r, reason: collision with root package name */
    private v f18823r;

    /* renamed from: s, reason: collision with root package name */
    private b.a f18824s;

    /* renamed from: t, reason: collision with root package name */
    private a f18825t;

    /* loaded from: classes4.dex */
    interface a {
        void a(p<?> pVar);

        void a(p<?> pVar, r<?> rVar);
    }

    /* loaded from: classes4.dex */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public p(int i8, String str) {
        this(i8, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract r<T> a(m mVar);

    protected Map<String, String> a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i8) {
        q qVar = this.f18817l;
        if (qVar != null) {
            qVar.a(this, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        q qVar = this.f18817l;
        if (qVar != null) {
            qVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        p pVar = (p) obj;
        b e8 = e();
        b e9 = pVar.e();
        if (e8 == e9) {
            return this.f18816k.intValue() - pVar.f18816k.intValue();
        }
        return e9.ordinal() - e8.ordinal();
    }

    public Map<String, String> d() {
        return Collections.emptyMap();
    }

    public b e() {
        return b.NORMAL;
    }

    public final int f() {
        return this.f18812g;
    }

    public final int g() {
        return this.f18810e;
    }

    public final int h() {
        return this.f18813h;
    }

    public final String i() {
        return this.f18811f;
    }

    public final String j() {
        if (!TextUtils.isEmpty(this.f18807b)) {
            return this.f18807b;
        }
        if (this.f18806a == null) {
            this.f18806a = new com.mbridge.msdk.e.a.a.d();
        }
        String a8 = this.f18806a.a(this);
        this.f18807b = a8;
        return a8;
    }

    public final s k() {
        return this.f18808c;
    }

    public final b.a l() {
        return this.f18824s;
    }

    public final boolean m() {
        boolean z8;
        synchronized (this.f18814i) {
            z8 = this.f18819n;
        }
        return z8;
    }

    public final String n() {
        return "application/x-www-form-urlencoded; charset=" + C.UTF8_NAME;
    }

    public final byte[] o() {
        Map<String, String> a8 = a();
        if (a8 != null && a8.size() > 0) {
            return a(a8, C.UTF8_NAME);
        }
        return null;
    }

    public final boolean p() {
        return this.f18818m;
    }

    public final boolean q() {
        return this.f18821p;
    }

    public final boolean r() {
        return this.f18822q;
    }

    public final int s() {
        return b().a();
    }

    public final void t() {
        synchronized (this.f18814i) {
            this.f18820o = true;
        }
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f18813h);
        StringBuilder sb = new StringBuilder();
        if (m()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(this.f18811f);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(e());
        sb.append(" ");
        sb.append(this.f18816k);
        return sb.toString();
    }

    public final boolean u() {
        boolean z8;
        synchronized (this.f18814i) {
            z8 = this.f18820o;
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        a aVar;
        synchronized (this.f18814i) {
            aVar = this.f18825t;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public p(int i8, String str, int i9) {
        Uri parse;
        String host;
        this.f18809d = null;
        this.f18814i = new Object();
        int i10 = 0;
        this.f18818m = false;
        this.f18819n = false;
        this.f18820o = false;
        this.f18821p = false;
        this.f18822q = false;
        this.f18824s = null;
        this.f18810e = i8;
        this.f18811f = str;
        this.f18812g = i9;
        this.f18823r = new f();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i10 = host.hashCode();
        }
        this.f18813h = i10;
    }

    public final void a(r.a aVar) {
        this.f18815j = aVar;
    }

    public final void a(int i8) {
        this.f18810e = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> b(boolean z8) {
        this.f18821p = z8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(int i8) {
        this.f18816k = Integer.valueOf(i8);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(q qVar) {
        this.f18817l = qVar;
        return this;
    }

    public v b() {
        return this.f18823r;
    }

    public void c() {
        synchronized (this.f18814i) {
            this.f18819n = true;
            this.f18815j = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(b.a aVar) {
        this.f18824s = aVar;
        return this;
    }

    public final void b(z zVar) {
        r.a aVar;
        synchronized (this.f18814i) {
            aVar = this.f18815j;
        }
        if (aVar != null) {
            aVar.a(zVar);
        }
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i8++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i8 <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Encoding not supported: " + str, e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(boolean z8) {
        this.f18822q = z8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(boolean z8) {
        this.f18818m = z8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar) {
        synchronized (this.f18814i) {
            this.f18825t = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(r<?> rVar) {
        a aVar;
        synchronized (this.f18814i) {
            aVar = this.f18825t;
        }
        if (aVar != null) {
            aVar.a(this, rVar);
        }
    }
}
