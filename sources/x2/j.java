package x2;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import g6.C2728d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.C3681a;
import r2.C3683c;
import t2.C3785f;
import x2.AbstractC3869G;
import x2.y;

/* loaded from: classes4.dex */
public final class j extends AbstractC3869G {

    /* renamed from: q, reason: collision with root package name */
    public static final a f39158q = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3869G.a f39159c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39160d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f39161e;

    /* renamed from: f, reason: collision with root package name */
    private final c f39162f;

    /* renamed from: g, reason: collision with root package name */
    private final C3683c f39163g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39164h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39165i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39166j;

    /* renamed from: k, reason: collision with root package name */
    private final String f39167k;

    /* renamed from: l, reason: collision with root package name */
    private final y.b f39168l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC3869G.b f39169m;

    /* renamed from: n, reason: collision with root package name */
    private final Iterable f39170n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f39171o;

    /* renamed from: p, reason: collision with root package name */
    private Map f39172p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C3683c f39173a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39174b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39175c;

        public b(C3683c c3683c, String apiVersion, String sdkVersion) {
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39173a = c3683c;
            this.f39174b = apiVersion;
            this.f39175c = sdkVersion;
        }

        public static /* synthetic */ j b(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.a(str, cVar, map, z8);
        }

        public static /* synthetic */ j d(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.c(str, cVar, map, z8);
        }

        public final j a(String url, c options, Map map, boolean z8) {
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(options, "options");
            return new j(AbstractC3869G.a.f39103b, url, map, options, this.f39173a, this.f39174b, this.f39175c, z8);
        }

        public final j c(String url, c options, Map map, boolean z8) {
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(options, "options");
            return new j(AbstractC3869G.a.f39104c, url, map, options, this.f39173a, this.f39174b, this.f39175c, z8);
        }
    }

    public j(AbstractC3869G.a method, String baseUrl, Map map, c options, C3683c c3683c, String apiVersion, String sdkVersion, boolean z8) {
        AbstractC3159y.i(method, "method");
        AbstractC3159y.i(baseUrl, "baseUrl");
        AbstractC3159y.i(options, "options");
        AbstractC3159y.i(apiVersion, "apiVersion");
        AbstractC3159y.i(sdkVersion, "sdkVersion");
        this.f39159c = method;
        this.f39160d = baseUrl;
        this.f39161e = map;
        this.f39162f = options;
        this.f39163g = c3683c;
        this.f39164h = apiVersion;
        this.f39165i = sdkVersion;
        this.f39166j = z8;
        this.f39167k = v.f39228a.c(map);
        y.b bVar = new y.b(options, c3683c, null, apiVersion, sdkVersion, 4, null);
        this.f39168l = bVar;
        this.f39169m = AbstractC3869G.b.f39109b;
        this.f39170n = t.a();
        this.f39171o = bVar.b();
        this.f39172p = bVar.c();
    }

    private final byte[] i() {
        try {
            byte[] bytes = this.f39167k.getBytes(C2728d.f31279b);
            AbstractC3159y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C3785f(null, null, 0, "Unable to encode parameters to " + C2728d.f31279b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f39171o;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f39159c;
    }

    @Override // x2.AbstractC3869G
    public Map c() {
        return this.f39172p;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f39170n;
    }

    @Override // x2.AbstractC3869G
    public boolean e() {
        return this.f39166j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f39159c == jVar.f39159c && AbstractC3159y.d(this.f39160d, jVar.f39160d) && AbstractC3159y.d(this.f39161e, jVar.f39161e) && AbstractC3159y.d(this.f39162f, jVar.f39162f) && AbstractC3159y.d(this.f39163g, jVar.f39163g) && AbstractC3159y.d(this.f39164h, jVar.f39164h) && AbstractC3159y.d(this.f39165i, jVar.f39165i) && this.f39166j == jVar.f39166j) {
            return true;
        }
        return false;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        if (AbstractC3869G.a.f39103b != b() && AbstractC3869G.a.f39105d != b()) {
            return this.f39160d;
        }
        String str = this.f39160d;
        String str2 = this.f39167k;
        if (str2.length() <= 0) {
            str2 = null;
        }
        List r8 = AbstractC1246t.r(str, str2);
        String str3 = "?";
        if (g6.n.H(this.f39160d, "?", false, 2, null)) {
            str3 = "&";
        }
        return AbstractC1246t.w0(r8, str3, null, null, 0, null, null, 62, null);
    }

    @Override // x2.AbstractC3869G
    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }

    public final String h() {
        return this.f39160d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f39159c.hashCode() * 31) + this.f39160d.hashCode()) * 31;
        Map map = this.f39161e;
        int i8 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f39162f.hashCode()) * 31;
        C3683c c3683c = this.f39163g;
        if (c3683c != null) {
            i8 = c3683c.hashCode();
        }
        return ((((((hashCode3 + i8) * 31) + this.f39164h.hashCode()) * 31) + this.f39165i.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f39166j);
    }

    public String toString() {
        return b().b() + " " + this.f39160d;
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f39177a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39178b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39179c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f39176d = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String apiKey, String str, String str2) {
            AbstractC3159y.i(apiKey, "apiKey");
            this.f39177a = apiKey;
            this.f39178b = str;
            this.f39179c = str2;
            new C3681a().b(apiKey);
        }

        public static /* synthetic */ c c(c cVar, String str, String str2, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = cVar.f39177a;
            }
            if ((i8 & 2) != 0) {
                str2 = cVar.f39178b;
            }
            if ((i8 & 4) != 0) {
                str3 = cVar.f39179c;
            }
            return cVar.b(str, str2, str3);
        }

        public final c b(String apiKey, String str, String str2) {
            AbstractC3159y.i(apiKey, "apiKey");
            return new c(apiKey, str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f39177a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f39177a, cVar.f39177a) && AbstractC3159y.d(this.f39178b, cVar.f39178b) && AbstractC3159y.d(this.f39179c, cVar.f39179c)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return g6.n.C(this.f39177a, "uk_", false, 2, null);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f39177a.hashCode() * 31;
            String str = this.f39178b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            String str2 = this.f39179c;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public final String i() {
            return this.f39179c;
        }

        public final String j() {
            return this.f39178b;
        }

        public String toString() {
            return "Options(apiKey=" + this.f39177a + ", stripeAccount=" + this.f39178b + ", idempotencyKey=" + this.f39179c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f39177a);
            out.writeString(this.f39178b);
            out.writeString(this.f39179c);
        }

        public /* synthetic */ c(String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
            this((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke(), null, 4, null);
            AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
