package s0;

import P.a;
import R.AbstractC1317n;
import android.accounts.Account;
import android.content.Context;
import j0.C3025b;
import j0.C3041r;
import j0.C3046w;
import java.util.Locale;
import v0.InterfaceC3819i;

/* renamed from: s0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3731v {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f37792a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f37793b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC0166a f37794c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3819i f37795d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3041r f37796e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3046w f37797f;

    /* renamed from: s0.v$a */
    /* loaded from: classes3.dex */
    public static final class a implements a.d.InterfaceC0167a {

        /* renamed from: a, reason: collision with root package name */
        public final int f37798a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37799b;

        /* renamed from: c, reason: collision with root package name */
        public final Account f37800c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f37801d;

        /* renamed from: s0.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0871a {

            /* renamed from: a, reason: collision with root package name */
            private int f37802a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f37803b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f37804c = true;

            public a a() {
                return new a(this);
            }

            public C0871a b(int i8) {
                if (i8 != 0) {
                    if (i8 != 0) {
                        if (i8 != 2 && i8 != 1 && i8 != 23 && i8 != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i8)));
                        }
                    } else {
                        i8 = 0;
                    }
                }
                this.f37802a = i8;
                return this;
            }
        }

        private a(C0871a c0871a) {
            this.f37798a = c0871a.f37802a;
            this.f37799b = c0871a.f37803b;
            this.f37801d = c0871a.f37804c;
            this.f37800c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC1317n.a(Integer.valueOf(this.f37798a), Integer.valueOf(aVar.f37798a)) && AbstractC1317n.a(Integer.valueOf(this.f37799b), Integer.valueOf(aVar.f37799b)) && AbstractC1317n.a(null, null) && AbstractC1317n.a(Boolean.valueOf(this.f37801d), Boolean.valueOf(aVar.f37801d))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1317n.b(Integer.valueOf(this.f37798a), Integer.valueOf(this.f37799b), null, Boolean.valueOf(this.f37801d));
        }

        @Override // P.a.d.InterfaceC0167a
        public Account i() {
            return null;
        }
    }

    static {
        a.g gVar = new a.g();
        f37793b = gVar;
        I i8 = new I();
        f37794c = i8;
        f37792a = new P.a("Wallet.API", i8, gVar);
        f37796e = new C3041r();
        f37795d = new C3025b();
        f37797f = new C3046w();
    }

    public static C3723m a(Context context, a aVar) {
        return new C3723m(context, aVar);
    }
}
