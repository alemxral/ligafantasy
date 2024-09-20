package J2;

import J2.l;
import J2.m;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j2.C3073m;
import j2.n;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import s0.C3723m;
import u2.C3801a;
import x2.j;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f4716a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f4717b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f4718c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f4719d;

        /* renamed from: e, reason: collision with root package name */
        private Set f4720e;

        /* renamed from: f, reason: collision with root package name */
        private h.d f4721f;

        private a() {
        }

        @Override // J2.l.a
        public l build() {
            u5.h.a(this.f4716a, Context.class);
            u5.h.a(this.f4717b, Boolean.class);
            u5.h.a(this.f4718c, Function0.class);
            u5.h.a(this.f4719d, Function0.class);
            u5.h.a(this.f4720e, Set.class);
            u5.h.a(this.f4721f, h.d.class);
            return new C0092b(new u2.d(), new C3801a(), this.f4716a, this.f4717b, this.f4718c, this.f4719d, this.f4720e, this.f4721f);
        }

        @Override // J2.l.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f4716a = (Context) u5.h.b(context);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f4717b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // J2.l.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(h.d dVar) {
            this.f4721f = (h.d) u5.h.b(dVar);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f4720e = (Set) u5.h.b(set);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f4718c = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f4719d = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0092b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f4722a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f4723b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f4724c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f4725d;

        /* renamed from: e, reason: collision with root package name */
        private final C0092b f4726e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f4727f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f4728g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f4729h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f4730i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f4731j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f4732k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f4733l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f4734m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f4735n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f4736o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f4737p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f4738q;

        private x2.m h() {
            return new x2.m((InterfaceC3684d) this.f4734m.get(), (P5.g) this.f4732k.get());
        }

        private void i(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f4727f = u5.f.a(dVar2);
            u5.e a8 = u5.f.a(context);
            this.f4728g = a8;
            I2.b a9 = I2.b.a(a8);
            this.f4729h = a9;
            u5.i c8 = u5.d.c(a9);
            this.f4730i = c8;
            this.f4731j = u5.d.c(k.a(this.f4727f, c8));
            this.f4732k = u5.d.c(u2.f.a(dVar));
            u5.e a10 = u5.f.a(bool);
            this.f4733l = a10;
            this.f4734m = u5.d.c(u2.c.a(c3801a, a10));
            this.f4735n = u5.f.a(function0);
            u5.e a11 = u5.f.a(function02);
            this.f4736o = a11;
            this.f4737p = u5.d.c(n.a(this.f4735n, a11, this.f4727f));
            this.f4738q = u5.d.c(com.stripe.android.googlepaylauncher.c.a(this.f4728g, this.f4727f, this.f4734m));
        }

        private PaymentAnalyticsRequestFactory j() {
            return new PaymentAnalyticsRequestFactory(this.f4724c, this.f4722a, this.f4725d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a k() {
            return new com.stripe.android.networking.a(this.f4724c, this.f4722a, (P5.g) this.f4732k.get(), this.f4725d, j(), h(), (InterfaceC3684d) this.f4734m.get());
        }

        @Override // J2.l
        public m.a a() {
            return new c(this.f4726e);
        }

        private C0092b(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f4726e = this;
            this.f4722a = function0;
            this.f4723b = function02;
            this.f4724c = context;
            this.f4725d = set;
            i(dVar, c3801a, context, bool, function0, function02, set, dVar2);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0092b f4739a;

        /* renamed from: b, reason: collision with root package name */
        private GooglePayPaymentMethodLauncherContractV2.a f4740b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f4741c;

        @Override // J2.m.a
        public m build() {
            u5.h.a(this.f4740b, GooglePayPaymentMethodLauncherContractV2.a.class);
            u5.h.a(this.f4741c, SavedStateHandle.class);
            return new d(this.f4739a, this.f4740b, this.f4741c);
        }

        @Override // J2.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(GooglePayPaymentMethodLauncherContractV2.a aVar) {
            this.f4740b = (GooglePayPaymentMethodLauncherContractV2.a) u5.h.b(aVar);
            return this;
        }

        @Override // J2.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f4741c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(C0092b c0092b) {
            this.f4739a = c0092b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f4742a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f4743b;

        /* renamed from: c, reason: collision with root package name */
        private final C0092b f4744c;

        /* renamed from: d, reason: collision with root package name */
        private final d f4745d;

        private j.c b() {
            return new j.c(this.f4744c.f4722a, this.f4744c.f4723b);
        }

        @Override // J2.m
        public com.stripe.android.googlepaylauncher.j a() {
            return new com.stripe.android.googlepaylauncher.j((C3723m) this.f4744c.f4731j.get(), b(), this.f4742a, this.f4744c.k(), (C3073m) this.f4744c.f4737p.get(), (I2.g) this.f4744c.f4738q.get(), this.f4743b);
        }

        private d(C0092b c0092b, GooglePayPaymentMethodLauncherContractV2.a aVar, SavedStateHandle savedStateHandle) {
            this.f4745d = this;
            this.f4744c = c0092b;
            this.f4742a = aVar;
            this.f4743b = savedStateHandle;
        }
    }

    public static l.a a() {
        return new a();
    }
}
