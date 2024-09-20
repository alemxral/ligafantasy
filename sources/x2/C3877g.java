package x2;

import M5.AbstractC1246t;
import M5.Q;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import g6.C2728d;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import x2.AbstractC3869G;
import x6.AbstractC3942d0;
import x6.AbstractC3964y;
import x6.C;
import x6.C3944e0;
import x6.C3959t;
import x6.K;
import x6.n0;
import x6.r0;
import y6.AbstractC4007i;

@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: x2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3877g extends AbstractC3869G {
    public static final b Companion = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final t6.b[] f39141n;

    /* renamed from: c, reason: collision with root package name */
    private final String f39142c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39143d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39144e;

    /* renamed from: f, reason: collision with root package name */
    private final double f39145f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC4007i f39146g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39147h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f39148i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3869G.a f39149j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC3869G.b f39150k;

    /* renamed from: l, reason: collision with root package name */
    private final Iterable f39151l;

    /* renamed from: m, reason: collision with root package name */
    private final String f39152m;

    /* renamed from: x2.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39153a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f39154b;

        static {
            a aVar = new a();
            f39153a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.core.networking.AnalyticsRequestV2", aVar, 11);
            c3944e0.k("eventName", false);
            c3944e0.k("clientId", false);
            c3944e0.k(TtmlNode.ATTR_TTS_ORIGIN, false);
            c3944e0.k("created", false);
            c3944e0.k("params", false);
            c3944e0.k("postParameters", true);
            c3944e0.k("headers", true);
            c3944e0.k("method", true);
            c3944e0.k("mimeType", true);
            c3944e0.k("retryResponseCodes", true);
            c3944e0.k("url", true);
            f39154b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f39154b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = C3877g.f39141n;
            t6.b bVar = bVarArr[6];
            t6.b bVar2 = bVarArr[7];
            t6.b bVar3 = bVarArr[8];
            t6.b bVar4 = bVarArr[9];
            r0 r0Var = r0.f39581a;
            return new t6.b[]{r0Var, r0Var, r0Var, C3959t.f39592a, y6.k.f39985a, r0Var, bVar, bVar2, bVar3, bVar4, r0Var};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x009e. Please report as an issue. */
        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3877g c(w6.e decoder) {
            int i8;
            AbstractC3869G.b bVar;
            Iterable iterable;
            AbstractC3869G.a aVar;
            Map map;
            AbstractC4007i abstractC4007i;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            double d8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d9 = decoder.d(a8);
            t6.b[] bVarArr = C3877g.f39141n;
            int i9 = 10;
            String str6 = null;
            if (d9.z()) {
                String q8 = d9.q(a8, 0);
                String q9 = d9.q(a8, 1);
                String q10 = d9.q(a8, 2);
                double B8 = d9.B(a8, 3);
                AbstractC4007i abstractC4007i2 = (AbstractC4007i) d9.r(a8, 4, y6.k.f39985a, null);
                String q11 = d9.q(a8, 5);
                Map map2 = (Map) d9.r(a8, 6, bVarArr[6], null);
                AbstractC3869G.a aVar2 = (AbstractC3869G.a) d9.r(a8, 7, bVarArr[7], null);
                AbstractC3869G.b bVar2 = (AbstractC3869G.b) d9.r(a8, 8, bVarArr[8], null);
                iterable = (Iterable) d9.r(a8, 9, bVarArr[9], null);
                str = q8;
                str5 = d9.q(a8, 10);
                str4 = q11;
                abstractC4007i = abstractC4007i2;
                map = map2;
                str3 = q10;
                aVar = aVar2;
                bVar = bVar2;
                str2 = q9;
                d8 = B8;
                i8 = 2047;
            } else {
                AbstractC3869G.b bVar3 = null;
                Iterable iterable2 = null;
                AbstractC3869G.a aVar3 = null;
                Map map3 = null;
                AbstractC4007i abstractC4007i3 = null;
                String str7 = null;
                String str8 = null;
                double d10 = 0.0d;
                int i10 = 0;
                boolean z8 = true;
                String str9 = null;
                String str10 = null;
                while (z8) {
                    int p8 = d9.p(a8);
                    switch (p8) {
                        case -1:
                            i9 = 10;
                            z8 = false;
                        case 0:
                            i10 |= 1;
                            str6 = d9.q(a8, 0);
                            i9 = 10;
                        case 1:
                            str9 = d9.q(a8, 1);
                            i10 |= 2;
                            i9 = 10;
                        case 2:
                            str10 = d9.q(a8, 2);
                            i10 |= 4;
                            i9 = 10;
                        case 3:
                            d10 = d9.B(a8, 3);
                            i10 |= 8;
                            i9 = 10;
                        case 4:
                            abstractC4007i3 = (AbstractC4007i) d9.r(a8, 4, y6.k.f39985a, abstractC4007i3);
                            i10 |= 16;
                            i9 = 10;
                        case 5:
                            str7 = d9.q(a8, 5);
                            i10 |= 32;
                        case 6:
                            map3 = (Map) d9.r(a8, 6, bVarArr[6], map3);
                            i10 |= 64;
                        case 7:
                            aVar3 = (AbstractC3869G.a) d9.r(a8, 7, bVarArr[7], aVar3);
                            i10 |= 128;
                        case 8:
                            bVar3 = (AbstractC3869G.b) d9.r(a8, 8, bVarArr[8], bVar3);
                            i10 |= 256;
                        case 9:
                            iterable2 = (Iterable) d9.r(a8, 9, bVarArr[9], iterable2);
                            i10 |= 512;
                        case 10:
                            str8 = d9.q(a8, i9);
                            i10 |= 1024;
                        default:
                            throw new t6.l(p8);
                    }
                }
                i8 = i10;
                bVar = bVar3;
                iterable = iterable2;
                aVar = aVar3;
                map = map3;
                abstractC4007i = abstractC4007i3;
                str = str6;
                str2 = str9;
                str3 = str10;
                str4 = str7;
                str5 = str8;
                d8 = d10;
            }
            d9.a(a8);
            return new C3877g(i8, str, str2, str3, d8, abstractC4007i, str4, map, aVar, bVar, iterable, str5, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C3877g value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C3877g.u(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: x2.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f39153a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x2.g$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f39155a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39156b;

        public c(String key, String value) {
            AbstractC3159y.i(key, "key");
            AbstractC3159y.i(value, "value");
            this.f39155a = key;
            this.f39156b = value;
        }

        private final String a(String str) {
            String encode = URLEncoder.encode(str, C2728d.f31279b.name());
            AbstractC3159y.h(encode, "encode(...)");
            return encode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f39155a, cVar.f39155a) && AbstractC3159y.d(this.f39156b, cVar.f39156b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f39155a.hashCode() * 31) + this.f39156b.hashCode();
        }

        public String toString() {
            return a(this.f39155a) + "=" + a(this.f39156b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x2.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f39157a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(c it) {
            AbstractC3159y.i(it, "it");
            return it.toString();
        }
    }

    static {
        r0 r0Var = r0.f39581a;
        f39141n = new t6.b[]{null, null, null, null, null, null, new K(r0Var, r0Var), AbstractC3964y.b("com.stripe.android.core.networking.StripeRequest.Method", AbstractC3869G.a.values()), AbstractC3964y.b("com.stripe.android.core.networking.StripeRequest.MimeType", AbstractC3869G.b.values()), new t6.e(U.b(Iterable.class), new Annotation[0]), null};
    }

    public /* synthetic */ C3877g(int i8, String str, String str2, String str3, double d8, AbstractC4007i abstractC4007i, String str4, Map map, AbstractC3869G.a aVar, AbstractC3869G.b bVar, Iterable iterable, String str5, n0 n0Var) {
        if (31 != (i8 & 31)) {
            AbstractC3942d0.a(i8, 31, a.f39153a.a());
        }
        this.f39142c = str;
        this.f39143d = str2;
        this.f39144e = str3;
        this.f39145f = d8;
        this.f39146g = abstractC4007i;
        if ((i8 & 32) == 0) {
            this.f39147h = m();
        } else {
            this.f39147h = str4;
        }
        if ((i8 & 64) == 0) {
            this.f39148i = Q.k(L5.x.a("Content-Type", AbstractC3869G.b.f39109b.b() + "; charset=" + C2728d.f31279b.name()), L5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), L5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"));
        } else {
            this.f39148i = map;
        }
        if ((i8 & 128) == 0) {
            this.f39149j = AbstractC3869G.a.f39104c;
        } else {
            this.f39149j = aVar;
        }
        if ((i8 & 256) == 0) {
            this.f39150k = AbstractC3869G.b.f39109b;
        } else {
            this.f39150k = bVar;
        }
        if ((i8 & 512) == 0) {
            this.f39151l = new d6.i(429, 429);
        } else {
            this.f39151l = iterable;
        }
        if ((i8 & 1024) == 0) {
            this.f39152m = "https://r.stripe.com/0";
        } else {
            this.f39152m = str5;
        }
    }

    private final Map j() {
        return Q.k(L5.x.a("client_id", this.f39143d), L5.x.a("created", Double.valueOf(this.f39145f)), L5.x.a("event_name", this.f39142c), L5.x.a("event_id", UUID.randomUUID().toString()));
    }

    public static /* synthetic */ C3877g l(C3877g c3877g, String str, String str2, String str3, double d8, AbstractC4007i abstractC4007i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c3877g.f39142c;
        }
        if ((i8 & 2) != 0) {
            str2 = c3877g.f39143d;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            str3 = c3877g.f39144e;
        }
        String str5 = str3;
        if ((i8 & 8) != 0) {
            d8 = c3877g.f39145f;
        }
        double d9 = d8;
        if ((i8 & 16) != 0) {
            abstractC4007i = c3877g.f39146g;
        }
        return c3877g.k(str, str4, str5, d9, abstractC4007i);
    }

    private final String m() {
        Map q8 = Q.q(q.a(this.f39146g), j());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : v.f39228a.a(q8).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new c(str, p(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new c(str, value.toString()));
            }
        }
        return AbstractC1246t.w0(arrayList, "&", null, null, 0, null, d.f39157a, 30, null);
    }

    private final Map n(int i8) {
        boolean z8;
        boolean z9;
        C2758a.C0756a c0756a = C2758a.f31395b;
        if (C2758a.G(AbstractC2760c.t(System.currentTimeMillis(), EnumC2761d.f31404d), EnumC2761d.f31405e) - this.f39145f > 5.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        L5.r a8 = L5.x.a("uses_work_manager", Boolean.TRUE);
        if (i8 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Q.k(a8, L5.x.a("is_retry", Boolean.valueOf(z9)), L5.x.a("delayed", Boolean.valueOf(z8)));
    }

    private final String o(Map map, int i8) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        AbstractC3159y.h(sb, "append(...)");
        sb.append('\n');
        AbstractC3159y.h(sb, "append(...)");
        boolean z8 = true;
        for (Map.Entry entry : Q.g(map, new Comparator() { // from class: x2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int q8;
                q8 = C3877g.q(obj, obj2);
                return q8;
            }
        }).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                str = o((Map) value, i8 + 1);
            } else if (value == null) {
                str = "";
            } else {
                str = "\"" + value + "\"";
            }
            if (!g6.n.u(str)) {
                if (z8) {
                    sb.append(g6.n.w("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                    z8 = false;
                } else {
                    sb.append(",");
                    AbstractC3159y.h(sb, "append(...)");
                    sb.append('\n');
                    AbstractC3159y.h(sb, "append(...)");
                    sb.append(g6.n.w("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                }
            }
        }
        sb.append('\n');
        AbstractC3159y.h(sb, "append(...)");
        sb.append(g6.n.w("  ", i8));
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    static /* synthetic */ String p(C3877g c3877g, Map map, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3877g.o(map, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] s() {
        byte[] bytes = this.f39147h.getBytes(C2728d.f31279b);
        AbstractC3159y.h(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008d, code lost:
    
        if (kotlin.jvm.internal.AbstractC3159y.d(r11.a(), M5.Q.k(L5.x.a("Content-Type", x2.AbstractC3869G.b.f39109b.b() + "; charset=" + g6.C2728d.f31279b.name()), L5.x.a(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_ORIGIN, r11.f39144e), L5.x.a(com.mbridge.msdk.foundation.download.Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"))) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void u(x2.C3877g r11, w6.d r12, v6.f r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C3877g.u(x2.g, w6.d, v6.f):void");
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f39148i;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f39149j;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f39151l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3877g)) {
            return false;
        }
        C3877g c3877g = (C3877g) obj;
        if (AbstractC3159y.d(this.f39142c, c3877g.f39142c) && AbstractC3159y.d(this.f39143d, c3877g.f39143d) && AbstractC3159y.d(this.f39144e, c3877g.f39144e) && Double.compare(this.f39145f, c3877g.f39145f) == 0 && AbstractC3159y.d(this.f39146g, c3877g.f39146g)) {
            return true;
        }
        return false;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        return this.f39152m;
    }

    @Override // x2.AbstractC3869G
    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
        outputStream.write(s());
        outputStream.flush();
    }

    public int hashCode() {
        return (((((((this.f39142c.hashCode() * 31) + this.f39143d.hashCode()) * 31) + this.f39144e.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f39145f)) * 31) + this.f39146g.hashCode();
    }

    public final C3877g k(String eventName, String clientId, String origin, double d8, AbstractC4007i params) {
        AbstractC3159y.i(eventName, "eventName");
        AbstractC3159y.i(clientId, "clientId");
        AbstractC3159y.i(origin, "origin");
        AbstractC3159y.i(params, "params");
        return new C3877g(eventName, clientId, origin, d8, params);
    }

    public AbstractC3869G.b r() {
        return this.f39150k;
    }

    public final C3877g t(int i8) {
        AbstractC4007i c8;
        c8 = AbstractC3878h.c(Q.q(q.a(this.f39146g), n(i8)));
        return l(this, null, null, null, 0.0d, c8, 15, null);
    }

    public String toString() {
        return "AnalyticsRequestV2(eventName=" + this.f39142c + ", clientId=" + this.f39143d + ", origin=" + this.f39144e + ", created=" + this.f39145f + ", params=" + this.f39146g + ")";
    }

    private C3877g(String str, String str2, String str3, double d8, AbstractC4007i abstractC4007i) {
        this.f39142c = str;
        this.f39143d = str2;
        this.f39144e = str3;
        this.f39145f = d8;
        this.f39146g = abstractC4007i;
        this.f39147h = m();
        AbstractC3869G.b bVar = AbstractC3869G.b.f39109b;
        this.f39148i = Q.k(L5.x.a("Content-Type", bVar.b() + "; charset=" + C2728d.f31279b.name()), L5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), L5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"));
        this.f39149j = AbstractC3869G.a.f39104c;
        this.f39150k = bVar;
        this.f39151l = new d6.i(429, 429);
        this.f39152m = "https://r.stripe.com/0";
    }
}
