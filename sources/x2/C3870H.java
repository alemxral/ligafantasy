package x2;

import M5.AbstractC1246t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.z;

/* renamed from: x2.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3870H {

    /* renamed from: h, reason: collision with root package name */
    public static final a f39115h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f39116a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39117b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f39118c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39119d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39120e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39121f;

    /* renamed from: g, reason: collision with root package name */
    private final z f39122g;

    /* renamed from: x2.H$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3870H(int i8, Object obj, Map headers) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3159y.i(headers, "headers");
        this.f39116a = i8;
        this.f39117b = obj;
        this.f39118c = headers;
        if (i8 == 200) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f39119d = z8;
        if (i8 >= 200 && i8 < 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f39120e = z9;
        this.f39121f = i8 == 429;
        z.a aVar = z.f39265b;
        List c8 = c("Request-Id");
        if (c8 != null) {
            str = (String) AbstractC1246t.o0(c8);
        } else {
            str = null;
        }
        this.f39122g = aVar.a(str);
    }

    public final Object a() {
        return this.f39117b;
    }

    public final int b() {
        return this.f39116a;
    }

    public final List c(String key) {
        Object obj;
        AbstractC3159y.i(key, "key");
        Iterator it = this.f39118c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (g6.n.s((String) ((Map.Entry) obj).getKey(), key, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final z d() {
        return this.f39122g;
    }

    public final boolean e() {
        return this.f39120e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3870H)) {
            return false;
        }
        C3870H c3870h = (C3870H) obj;
        if (this.f39116a == c3870h.f39116a && AbstractC3159y.d(this.f39117b, c3870h.f39117b) && AbstractC3159y.d(this.f39118c, c3870h.f39118c)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f39119d;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f39116a * 31;
        Object obj = this.f39117b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((i8 + hashCode) * 31) + this.f39118c.hashCode();
    }

    public String toString() {
        return "Request-Id: " + this.f39122g + ", Status Code: " + this.f39116a;
    }
}
