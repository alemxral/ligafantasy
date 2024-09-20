package n3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f3.C2660a;
import f3.C2667h;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.InterfaceC3178h;
import n3.x;
import n3.y;
import r2.InterfaceC3684d;
import u2.C3801a;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3459e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36026a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36027b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f36028c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f36029d;

        /* renamed from: e, reason: collision with root package name */
        private Set f36030e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f36031f;

        private a() {
        }

        @Override // n3.x.a
        public x build() {
            u5.h.a(this.f36026a, Context.class);
            u5.h.a(this.f36027b, Boolean.class);
            u5.h.a(this.f36028c, Function0.class);
            u5.h.a(this.f36029d, Function0.class);
            u5.h.a(this.f36030e, Set.class);
            u5.h.a(this.f36031f, Boolean.class);
            return new b(new s(), new u2.d(), new C3801a(), this.f36026a, this.f36027b, this.f36028c, this.f36029d, this.f36030e, this.f36031f);
        }

        @Override // n3.x.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36026a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f36027b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.x.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(boolean z8) {
            this.f36031f = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.x.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36030e = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f36028c = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // n3.x.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f36029d = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.e$b */
    /* loaded from: classes4.dex */
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36032a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f36033b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f36034c;

        /* renamed from: d, reason: collision with root package name */
        private final s f36035d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36036e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36037f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36038g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36039h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36040i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36041j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36042k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36043l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36044m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36045n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36046o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36047p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36048q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36049r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f36050s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f36051t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f36052u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f36053v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f36054w;

        /* JADX INFO: Access modifiers changed from: private */
        public x2.m n() {
            return new x2.m((InterfaceC3684d) this.f36039h.get(), (P5.g) this.f36037f.get());
        }

        private void o(s sVar, u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f36037f = u5.d.c(u2.f.a(dVar));
            u5.e a8 = u5.f.a(bool);
            this.f36038g = a8;
            this.f36039h = u5.d.c(u2.c.a(c3801a, a8));
            this.f36040i = u5.f.a(context);
            this.f36041j = u5.d.c(u2.e.a(dVar));
            this.f36042k = u5.d.c(w.a(sVar));
            this.f36043l = u5.f.a(function0);
            u5.e a9 = u5.f.a(set);
            this.f36044m = a9;
            this.f36045n = e3.j.a(this.f36040i, this.f36043l, a9);
            this.f36046o = u.a(sVar, this.f36040i);
            u5.e a10 = u5.f.a(bool2);
            this.f36047p = a10;
            this.f36048q = u5.d.c(v.a(sVar, this.f36040i, this.f36038g, this.f36037f, this.f36041j, this.f36042k, this.f36045n, this.f36043l, this.f36044m, this.f36046o, a10));
            this.f36049r = u5.d.c(t.a(sVar, this.f36040i));
            this.f36050s = u5.f.a(function02);
            x2.n a11 = x2.n.a(this.f36039h, this.f36037f);
            this.f36051t = a11;
            e3.k a12 = e3.k.a(this.f36040i, this.f36043l, this.f36037f, this.f36044m, this.f36045n, a11, this.f36039h);
            this.f36052u = a12;
            this.f36053v = u5.d.c(C2667h.a(this.f36040i, this.f36043l, a12, this.f36039h, this.f36037f));
            this.f36054w = u5.d.c(f3.k.a(this.f36040i, this.f36043l, this.f36052u, this.f36039h, this.f36037f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.f36035d.b(this.f36032a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory q() {
            return new PaymentAnalyticsRequestFactory(this.f36032a, this.f36033b, this.f36034c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a r() {
            return new com.stripe.android.networking.a(this.f36032a, this.f36033b, (P5.g) this.f36037f.get(), this.f36034c, q(), n(), (InterfaceC3684d) this.f36039h.get());
        }

        @Override // n3.x
        public y.a a() {
            return new c(this.f36036e);
        }

        private b(s sVar, u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, Boolean bool2) {
            this.f36036e = this;
            this.f36032a = context;
            this.f36033b = function0;
            this.f36034c = set;
            this.f36035d = sVar;
            o(sVar, dVar, c3801a, context, bool, function0, function02, set, bool2);
        }
    }

    /* renamed from: n3.e$c */
    /* loaded from: classes4.dex */
    private static final class c implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f36055a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36056b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f36057c;

        @Override // n3.y.a
        public y build() {
            u5.h.a(this.f36056b, Boolean.class);
            u5.h.a(this.f36057c, SavedStateHandle.class);
            return new d(this.f36055a, this.f36056b, this.f36057c);
        }

        @Override // n3.y.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(boolean z8) {
            this.f36056b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.y.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f36057c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f36055a = bVar;
        }
    }

    /* renamed from: n3.e$d */
    /* loaded from: classes4.dex */
    private static final class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f36058a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f36059b;

        /* renamed from: c, reason: collision with root package name */
        private final b f36060c;

        /* renamed from: d, reason: collision with root package name */
        private final d f36061d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f36062e;

        private void b(Boolean bool, SavedStateHandle savedStateHandle) {
            this.f36062e = x2.k.a(this.f36060c.f36043l, this.f36060c.f36050s);
        }

        @Override // n3.y
        public com.stripe.android.payments.paymentlauncher.b a() {
            return new com.stripe.android.payments.paymentlauncher.b(this.f36058a.booleanValue(), this.f36060c.r(), (InterfaceC3178h) this.f36060c.f36048q.get(), (C2660a) this.f36060c.f36049r.get(), this.f36062e, (Map) this.f36060c.f36042k.get(), u5.d.b(this.f36060c.f36053v), u5.d.b(this.f36060c.f36054w), this.f36060c.n(), this.f36060c.q(), (P5.g) this.f36060c.f36041j.get(), this.f36059b, this.f36060c.p());
        }

        private d(b bVar, Boolean bool, SavedStateHandle savedStateHandle) {
            this.f36061d = this;
            this.f36060c = bVar;
            this.f36058a = bool;
            this.f36059b = savedStateHandle;
            b(bool, savedStateHandle);
        }
    }

    public static x.a a() {
        return new a();
    }
}
