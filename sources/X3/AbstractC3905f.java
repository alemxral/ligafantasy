package x3;

import android.app.Application;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.g;
import com.stripe.android.paymentsheet.addresselement.h;
import e4.C2630q0;
import f4.InterfaceC2669b;
import java.util.Map;
import s3.C3748d;
import s3.InterfaceC3746b;
import u2.C3801a;
import x3.InterfaceC3885G;
import x3.InterfaceC3900a;
import x3.InterfaceC3904e;

/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3905f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3900a {

        /* renamed from: a, reason: collision with root package name */
        private final AddressElementActivityContract.a f39297a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f39298b;

        /* renamed from: c, reason: collision with root package name */
        private final a f39299c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39300d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39301e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39302f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39303g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39304h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39305i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39306j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39307k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39308l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39309m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39310n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39311o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39312p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39313q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39314r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0911a implements u5.i {
            C0911a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC3885G.a get() {
                return new g(a.this.f39299c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC3904e.a get() {
                return new b(a.this.f39299c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$c */
        /* loaded from: classes4.dex */
        public class c implements u5.i {
            c() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h.a get() {
                return new e(a.this.f39299c);
            }
        }

        private void i(u2.d dVar, C3801a c3801a, C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
            this.f39300d = u5.d.c(r3.c.a());
            this.f39301e = new C0911a();
            this.f39302f = new b();
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39303g = c8;
            this.f39304h = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39305i = c9;
            this.f39306j = x2.n.a(this.f39304h, c9);
            u5.e a8 = u5.f.a(context);
            this.f39307k = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39308l = a9;
            C3892N a10 = C3892N.a(this.f39307k, a9);
            this.f39309m = a10;
            u5.i c10 = u5.d.c(C3748d.a(this.f39306j, a10, this.f39305i));
            this.f39310n = c10;
            this.f39311o = u5.d.c(C3902c.a(c3901b, c10));
            this.f39312p = new c();
            u5.e a11 = u5.f.a(aVar);
            this.f39313q = a11;
            this.f39314r = u5.d.c(C3903d.a(c3901b, this.f39307k, a11));
        }

        @Override // x3.InterfaceC3900a
        public com.stripe.android.paymentsheet.addresselement.c a() {
            return new com.stripe.android.paymentsheet.addresselement.c((com.stripe.android.paymentsheet.addresselement.a) this.f39300d.get(), this.f39301e, this.f39302f);
        }

        private a(u2.d dVar, C3801a c3801a, C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
            this.f39299c = this;
            this.f39297a = aVar;
            this.f39298b = context;
            i(dVar, c3801a, c3901b, context, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3904e.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39318a;

        /* renamed from: b, reason: collision with root package name */
        private Application f39319b;

        /* renamed from: c, reason: collision with root package name */
        private g.c f39320c;

        @Override // x3.InterfaceC3904e.a
        public InterfaceC3904e build() {
            u5.h.a(this.f39319b, Application.class);
            u5.h.a(this.f39320c, g.c.class);
            return new c(this.f39318a, this.f39319b, this.f39320c);
        }

        @Override // x3.InterfaceC3904e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Application application) {
            this.f39319b = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.InterfaceC3904e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(g.c cVar) {
            this.f39320c = (g.c) u5.h.b(cVar);
            return this;
        }

        private b(a aVar) {
            this.f39318a = aVar;
        }
    }

    /* renamed from: x3.f$c */
    /* loaded from: classes4.dex */
    private static final class c implements InterfaceC3904e {

        /* renamed from: a, reason: collision with root package name */
        private final g.c f39321a;

        /* renamed from: b, reason: collision with root package name */
        private final Application f39322b;

        /* renamed from: c, reason: collision with root package name */
        private final a f39323c;

        /* renamed from: d, reason: collision with root package name */
        private final c f39324d;

        @Override // x3.InterfaceC3904e
        public com.stripe.android.paymentsheet.addresselement.g a() {
            return new com.stripe.android.paymentsheet.addresselement.g(this.f39323c.f39297a, (com.stripe.android.paymentsheet.addresselement.a) this.f39323c.f39300d.get(), (InterfaceC2669b) this.f39323c.f39314r.get(), this.f39321a, (InterfaceC3746b) this.f39323c.f39311o.get(), this.f39322b);
        }

        private c(a aVar, Application application, g.c cVar) {
            this.f39324d = this;
            this.f39323c = aVar;
            this.f39321a = cVar;
            this.f39322b = application;
        }
    }

    /* renamed from: x3.f$d */
    /* loaded from: classes4.dex */
    private static final class d implements InterfaceC3900a.InterfaceC0910a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39325a;

        /* renamed from: b, reason: collision with root package name */
        private AddressElementActivityContract.a f39326b;

        private d() {
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        public InterfaceC3900a build() {
            u5.h.a(this.f39325a, Context.class);
            u5.h.a(this.f39326b, AddressElementActivityContract.a.class);
            return new a(new u2.d(), new C3801a(), new C3901b(), this.f39325a, this.f39326b);
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            this.f39325a = (Context) u5.h.b(context);
            return this;
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b(AddressElementActivityContract.a aVar) {
            this.f39326b = (AddressElementActivityContract.a) u5.h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$e */
    /* loaded from: classes4.dex */
    public static final class e implements h.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39327a;

        /* renamed from: b, reason: collision with root package name */
        private C2630q0 f39328b;

        /* renamed from: c, reason: collision with root package name */
        private Map f39329c;

        /* renamed from: d, reason: collision with root package name */
        private Map f39330d;

        /* renamed from: e, reason: collision with root package name */
        private i6.M f39331e;

        /* renamed from: f, reason: collision with root package name */
        private StripeIntent f39332f;

        /* renamed from: g, reason: collision with root package name */
        private String f39333g;

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        public com.stripe.android.paymentsheet.addresselement.h build() {
            u5.h.a(this.f39328b, C2630q0.class);
            u5.h.a(this.f39329c, Map.class);
            u5.h.a(this.f39331e, i6.M.class);
            u5.h.a(this.f39333g, String.class);
            return new C0912f(this.f39327a, this.f39328b, this.f39329c, this.f39330d, this.f39331e, this.f39332f, this.f39333g);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e d(C2630q0 c2630q0) {
            this.f39328b = (C2630q0) u5.h.b(c2630q0);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e a(Map map) {
            this.f39329c = (Map) u5.h.b(map);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e b(String str) {
            this.f39333g = (String) u5.h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e c(Map map) {
            this.f39330d = map;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public e f(StripeIntent stripeIntent) {
            this.f39332f = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public e e(i6.M m8) {
            this.f39331e = (i6.M) u5.h.b(m8);
            return this;
        }

        private e(a aVar) {
            this.f39327a = aVar;
        }
    }

    /* renamed from: x3.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0912f implements com.stripe.android.paymentsheet.addresselement.h {

        /* renamed from: a, reason: collision with root package name */
        private final C2630q0 f39334a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39335b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f39336c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f39337d;

        /* renamed from: e, reason: collision with root package name */
        private final a f39338e;

        /* renamed from: f, reason: collision with root package name */
        private final C0912f f39339f;

        private X2.h b() {
            return r3.k.a(this.f39338e.f39298b, this.f39335b, this.f39336c, this.f39337d);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h
        public r3.i a() {
            return new r3.i(this.f39334a, b());
        }

        private C0912f(a aVar, C2630q0 c2630q0, Map map, Map map2, i6.M m8, StripeIntent stripeIntent, String str) {
            this.f39339f = this;
            this.f39338e = aVar;
            this.f39334a = c2630q0;
            this.f39335b = str;
            this.f39336c = map;
            this.f39337d = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC3885G.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39340a;

        @Override // x3.InterfaceC3885G.a
        public InterfaceC3885G build() {
            return new h(this.f39340a);
        }

        private g(a aVar) {
            this.f39340a = aVar;
        }
    }

    /* renamed from: x3.f$h */
    /* loaded from: classes4.dex */
    private static final class h implements InterfaceC3885G {

        /* renamed from: a, reason: collision with root package name */
        private final a f39341a;

        /* renamed from: b, reason: collision with root package name */
        private final h f39342b;

        @Override // x3.InterfaceC3885G
        public com.stripe.android.paymentsheet.addresselement.j a() {
            return new com.stripe.android.paymentsheet.addresselement.j(this.f39341a.f39297a, (com.stripe.android.paymentsheet.addresselement.a) this.f39341a.f39300d.get(), (InterfaceC3746b) this.f39341a.f39311o.get(), this.f39341a.f39312p);
        }

        private h(a aVar) {
            this.f39342b = this;
            this.f39341a = aVar;
        }
    }

    public static InterfaceC3900a.InterfaceC0910a a() {
        return new d();
    }
}
