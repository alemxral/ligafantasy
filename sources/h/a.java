package H;

import L.h;
import P.a;
import R.AbstractC1317n;
import android.os.Bundle;
import d0.C2533e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f3228a;

    /* renamed from: b, reason: collision with root package name */
    public static final P.a f3229b;

    /* renamed from: c, reason: collision with root package name */
    public static final P.a f3230c;

    /* renamed from: d, reason: collision with root package name */
    public static final J.a f3231d;

    /* renamed from: e, reason: collision with root package name */
    public static final I.a f3232e;

    /* renamed from: f, reason: collision with root package name */
    public static final K.a f3233f;

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f3234g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.g f3235h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.AbstractC0166a f3236i;

    /* renamed from: j, reason: collision with root package name */
    private static final a.AbstractC0166a f3237j;

    /* renamed from: H.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0050a implements a.d {

        /* renamed from: d, reason: collision with root package name */
        public static final C0050a f3238d = new C0050a(new C0051a());

        /* renamed from: a, reason: collision with root package name */
        private final String f3239a = null;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3240b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3241c;

        /* renamed from: H.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0051a {

            /* renamed from: a, reason: collision with root package name */
            protected Boolean f3242a;

            /* renamed from: b, reason: collision with root package name */
            protected String f3243b;

            public C0051a() {
                this.f3242a = Boolean.FALSE;
            }

            public final C0051a a(String str) {
                this.f3243b = str;
                return this;
            }

            public C0051a(C0050a c0050a) {
                this.f3242a = Boolean.FALSE;
                C0050a.b(c0050a);
                this.f3242a = Boolean.valueOf(c0050a.f3240b);
                this.f3243b = c0050a.f3241c;
            }
        }

        public C0050a(C0051a c0051a) {
            this.f3240b = c0051a.f3242a.booleanValue();
            this.f3241c = c0051a.f3243b;
        }

        static /* bridge */ /* synthetic */ String b(C0050a c0050a) {
            String str = c0050a.f3239a;
            return null;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f3240b);
            bundle.putString("log_session_id", this.f3241c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0050a)) {
                return false;
            }
            C0050a c0050a = (C0050a) obj;
            String str = c0050a.f3239a;
            if (AbstractC1317n.a(null, null) && this.f3240b == c0050a.f3240b && AbstractC1317n.a(this.f3241c, c0050a.f3241c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1317n.b(null, Boolean.valueOf(this.f3240b), this.f3241c);
        }
    }

    static {
        a.g gVar = new a.g();
        f3234g = gVar;
        a.g gVar2 = new a.g();
        f3235h = gVar2;
        d dVar = new d();
        f3236i = dVar;
        e eVar = new e();
        f3237j = eVar;
        f3228a = b.f3244a;
        f3229b = new P.a("Auth.CREDENTIALS_API", dVar, gVar);
        f3230c = new P.a("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
        f3231d = b.f3245b;
        f3232e = new C2533e();
        f3233f = new h();
    }
}
