package n3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import m3.C3397b;
import n3.E;
import n3.F;
import r2.InterfaceC3684d;
import u2.C3801a;

/* renamed from: n3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3464j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements E.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36063a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36064b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f36065c;

        /* renamed from: d, reason: collision with root package name */
        private Set f36066d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f36067e;

        private a() {
        }

        @Override // n3.E.a
        public E build() {
            u5.h.a(this.f36063a, Context.class);
            u5.h.a(this.f36064b, Boolean.class);
            u5.h.a(this.f36065c, Function0.class);
            u5.h.a(this.f36066d, Set.class);
            u5.h.a(this.f36067e, Boolean.class);
            return new b(new u2.d(), new C3801a(), this.f36063a, this.f36064b, this.f36065c, this.f36066d, this.f36067e);
        }

        @Override // n3.E.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36063a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.E.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f36064b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.E.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f36067e = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.E.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36066d = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.E.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f36065c = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36068a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f36069b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f36070c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f36071d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36072e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36073f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36074g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36075h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36076i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36077j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36078k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36079l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36080m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36081n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36082o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36083p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36084q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36085r;

        /* JADX INFO: Access modifiers changed from: private */
        public x2.m j() {
            return new x2.m((InterfaceC3684d) this.f36075h.get(), (P5.g) this.f36073f.get());
        }

        private void k(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f36073f = u5.d.c(u2.f.a(dVar));
            u5.e a8 = u5.f.a(bool);
            this.f36074g = a8;
            this.f36075h = u5.d.c(u2.c.a(c3801a, a8));
            u5.e a9 = u5.f.a(context);
            this.f36076i = a9;
            this.f36077j = u5.d.c(D.a(a9, this.f36074g, this.f36073f));
            this.f36078k = u5.d.c(C3454C.a());
            this.f36079l = u5.f.a(function0);
            u5.e a10 = u5.f.a(set);
            this.f36080m = a10;
            this.f36081n = e3.j.a(this.f36076i, this.f36079l, a10);
            x2.n a11 = x2.n.a(this.f36075h, this.f36073f);
            this.f36082o = a11;
            this.f36083p = e3.k.a(this.f36076i, this.f36079l, this.f36073f, this.f36080m, this.f36081n, a11, this.f36075h);
            u5.i c8 = u5.d.c(x2.s.a());
            this.f36084q = c8;
            this.f36085r = u5.d.c(C3397b.a(this.f36083p, this.f36082o, this.f36081n, c8, this.f36075h, this.f36073f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory l() {
            return new PaymentAnalyticsRequestFactory(this.f36068a, this.f36069b, this.f36070c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a m() {
            return new com.stripe.android.networking.a(this.f36068a, this.f36069b, (P5.g) this.f36073f.get(), this.f36070c, l(), j(), (InterfaceC3684d) this.f36075h.get());
        }

        @Override // n3.E
        public F.a a() {
            return new c(this.f36072e);
        }

        private b(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f36072e = this;
            this.f36068a = context;
            this.f36069b = function0;
            this.f36070c = set;
            this.f36071d = bool2;
            k(dVar, c3801a, context, bool, function0, set, bool2);
        }
    }

    /* renamed from: n3.j$c */
    /* loaded from: classes4.dex */
    private static final class c implements F.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f36086a;

        /* renamed from: b, reason: collision with root package name */
        private Stripe3ds2TransactionContract.a f36087b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f36088c;

        /* renamed from: d, reason: collision with root package name */
        private Application f36089d;

        @Override // n3.F.a
        public F build() {
            u5.h.a(this.f36087b, Stripe3ds2TransactionContract.a.class);
            u5.h.a(this.f36088c, SavedStateHandle.class);
            u5.h.a(this.f36089d, Application.class);
            return new d(this.f36086a, new G(), this.f36087b, this.f36088c, this.f36089d);
        }

        @Override // n3.F.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(Application application) {
            this.f36089d = (Application) u5.h.b(application);
            return this;
        }

        @Override // n3.F.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(Stripe3ds2TransactionContract.a aVar) {
            this.f36087b = (Stripe3ds2TransactionContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // n3.F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f36088c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f36086a = bVar;
        }
    }

    /* renamed from: n3.j$d */
    /* loaded from: classes4.dex */
    private static final class d implements F {

        /* renamed from: a, reason: collision with root package name */
        private final Stripe3ds2TransactionContract.a f36090a;

        /* renamed from: b, reason: collision with root package name */
        private final G f36091b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f36092c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f36093d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36094e;

        /* renamed from: f, reason: collision with root package name */
        private final d f36095f;

        private X3.n b() {
            return H.a(this.f36091b, this.f36092c, this.f36090a, (P5.g) this.f36094e.f36073f.get());
        }

        @Override // n3.F
        public com.stripe.android.payments.core.authentication.threeds2.d a() {
            return new com.stripe.android.payments.core.authentication.threeds2.d(this.f36090a, this.f36094e.m(), this.f36094e.j(), this.f36094e.l(), (W3.a) this.f36094e.f36077j.get(), (X3.p) this.f36094e.f36078k.get(), (m3.d) this.f36094e.f36085r.get(), b(), (P5.g) this.f36094e.f36073f.get(), this.f36093d, this.f36094e.f36071d.booleanValue());
        }

        private d(b bVar, G g8, Stripe3ds2TransactionContract.a aVar, SavedStateHandle savedStateHandle, Application application) {
            this.f36095f = this;
            this.f36094e = bVar;
            this.f36090a = aVar;
            this.f36091b = g8;
            this.f36092c = application;
            this.f36093d = savedStateHandle;
        }
    }

    public static E.a a() {
        return new a();
    }
}
