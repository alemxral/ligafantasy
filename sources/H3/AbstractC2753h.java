package h3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h3.InterfaceC2746a;
import i3.C2778a;
import i3.C2779b;
import i3.C2780c;
import kotlin.jvm.functions.Function0;
import l6.u;
import r2.InterfaceC3684d;
import u2.C3801a;
import x2.m;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2753h {

    /* renamed from: h3.h$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC2746a.InterfaceC0755a {

        /* renamed from: a, reason: collision with root package name */
        private Application f31373a;

        /* renamed from: b, reason: collision with root package name */
        private u f31374b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f31375c;

        /* renamed from: d, reason: collision with root package name */
        private CollectBankAccountContract.a f31376d;

        private a() {
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        public InterfaceC2746a build() {
            u5.h.a(this.f31373a, Application.class);
            u5.h.a(this.f31374b, u.class);
            u5.h.a(this.f31375c, SavedStateHandle.class);
            u5.h.a(this.f31376d, CollectBankAccountContract.a.class);
            return new b(new u2.d(), new C3801a(), this.f31373a, this.f31374b, this.f31375c, this.f31376d);
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f31373a = (Application) u5.h.b(application);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(CollectBankAccountContract.a aVar) {
            this.f31376d = (CollectBankAccountContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f31375c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(u uVar) {
            this.f31374b = (u) u5.h.b(uVar);
            return this;
        }
    }

    /* renamed from: h3.h$b */
    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC2746a {

        /* renamed from: a, reason: collision with root package name */
        private final CollectBankAccountContract.a f31377a;

        /* renamed from: b, reason: collision with root package name */
        private final u f31378b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f31379c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f31380d;

        /* renamed from: e, reason: collision with root package name */
        private final b f31381e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f31382f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f31383g;

        private C2778a b() {
            return new C2778a(j());
        }

        private Context c() {
            return AbstractC2749d.a(this.f31379c);
        }

        private C2779b d() {
            return new C2779b(j());
        }

        private m e() {
            return new m((InterfaceC3684d) this.f31383g.get(), (P5.g) this.f31382f.get());
        }

        private void f(u2.d dVar, C3801a c3801a, Application application, u uVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f31382f = u5.d.c(u2.f.a(dVar));
            this.f31383g = u5.d.c(u2.c.a(c3801a, C2750e.a()));
        }

        private Function0 g() {
            return AbstractC2748c.a(this.f31377a);
        }

        private PaymentAnalyticsRequestFactory h() {
            return new PaymentAnalyticsRequestFactory(c(), g(), AbstractC2751f.a());
        }

        private C2780c i() {
            return new C2780c(j());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(c(), g(), (P5.g) this.f31382f.get(), AbstractC2751f.a(), h(), e(), (InterfaceC3684d) this.f31383g.get());
        }

        @Override // h3.InterfaceC2746a
        public com.stripe.android.payments.bankaccount.ui.b a() {
            return new com.stripe.android.payments.bankaccount.ui.b(this.f31377a, this.f31378b, d(), b(), i(), this.f31380d, (InterfaceC3684d) this.f31383g.get());
        }

        private b(u2.d dVar, C3801a c3801a, Application application, u uVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f31381e = this;
            this.f31377a = aVar;
            this.f31378b = uVar;
            this.f31379c = application;
            this.f31380d = savedStateHandle;
            f(dVar, c3801a, application, uVar, savedStateHandle, aVar);
        }
    }

    public static InterfaceC2746a.InterfaceC0755a a() {
        return new a();
    }
}
