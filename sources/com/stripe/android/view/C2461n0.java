package com.stripe.android.view;

import L5.InterfaceC1227k;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e6.InterfaceC2643c;
import f3.C2662c;
import i6.C2812b0;
import j2.C3057I;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.InterfaceC3684d;
import x2.C3866D;
import x2.C3872b;
import x2.InterfaceC3873c;

/* renamed from: com.stripe.android.view.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2461n0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentBrowserAuthContract.a f27857a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f27858b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f27859c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f27860d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f27861e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b f27862f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f27863g;

    /* renamed from: com.stripe.android.view.n0$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f27864a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3684d f27865b;

        /* renamed from: c, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f27866c;

        public a(Application application, InterfaceC3684d logger, PaymentBrowserAuthContract.a args) {
            AbstractC3159y.i(application, "application");
            AbstractC3159y.i(logger, "logger");
            AbstractC3159y.i(args, "args");
            this.f27864a = application;
            this.f27865b = logger;
            this.f27866c = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            return new C2461n0(this.f27866c, new x2.m(this.f27865b, C2812b0.b()), new PaymentAnalyticsRequestFactory(this.f27864a, this.f27866c.i(), M5.a0.d("PaymentAuthWebViewActivity")));
        }
    }

    /* renamed from: com.stripe.android.view.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f27867a;

        /* renamed from: b, reason: collision with root package name */
        private final T3.k f27868b;

        public b(String text, T3.k toolbarCustomization) {
            AbstractC3159y.i(text, "text");
            AbstractC3159y.i(toolbarCustomization, "toolbarCustomization");
            this.f27867a = text;
            this.f27868b = toolbarCustomization;
        }

        public final String a() {
            return this.f27867a;
        }

        public final T3.k b() {
            return this.f27868b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f27867a, bVar.f27867a) && AbstractC3159y.d(this.f27868b, bVar.f27868b);
        }

        public int hashCode() {
            return (this.f27867a.hashCode() * 31) + this.f27868b.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.f27867a + ", toolbarCustomization=" + this.f27868b + ")";
        }
    }

    /* renamed from: com.stripe.android.view.n0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            C2461n0 c2461n0 = C2461n0.this;
            Map c8 = M5.Q.c();
            if (c2461n0.f27857a.j() != null) {
                c8.put("Referer", c2461n0.f27857a.j());
            }
            return M5.Q.q(new C3866D(null, 1, null).a(C3057I.f32920f.b()), M5.Q.b(c8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2461n0(com.stripe.android.auth.PaymentBrowserAuthContract.a r3, x2.InterfaceC3873c r4, com.stripe.android.networking.PaymentAnalyticsRequestFactory r5) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
            java.lang.String r0 = "paymentAnalyticsRequestFactory"
            kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
            r2.<init>()
            r2.f27857a = r3
            r2.f27858b = r4
            r2.f27859c = r5
            com.stripe.android.view.n0$c r4 = new com.stripe.android.view.n0$c
            r4.<init>()
            L5.k r4 = L5.l.b(r4)
            r2.f27860d = r4
            T3.k r4 = r3.z()
            r5 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = r4.s()
            if (r4 == 0) goto L36
            boolean r0 = g6.n.u(r4)
            if (r0 == 0) goto L37
        L36:
            r4 = r5
        L37:
            r2.f27861e = r4
            T3.k r4 = r3.z()
            if (r4 == 0) goto L57
            java.lang.String r0 = r4.f()
            if (r0 == 0) goto L4b
            boolean r1 = g6.n.u(r0)
            if (r1 == 0) goto L4c
        L4b:
            r0 = r5
        L4c:
            if (r0 == 0) goto L57
            com.stripe.android.view.n0$b r1 = new com.stripe.android.view.n0$b
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            r1.<init>(r0, r4)
            goto L58
        L57:
            r1 = r5
        L58:
            r2.f27862f = r1
            T3.k r3 = r3.z()
            if (r3 == 0) goto L64
            java.lang.String r5 = r3.e()
        L64:
            r2.f27863g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2461n0.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$a, x2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory):void");
    }

    private final void b(C3872b c3872b) {
        this.f27858b.a(c3872b);
    }

    public final String c() {
        return this.f27861e;
    }

    public final /* synthetic */ Intent d() {
        int i8;
        Intent intent = new Intent();
        C2662c f8 = f();
        if (this.f27857a.n()) {
            i8 = 3;
        } else {
            i8 = 1;
        }
        Intent putExtras = intent.putExtras(C2662c.c(f8, null, i8, null, this.f27857a.o(), null, null, null, 117, null).o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final Map e() {
        return (Map) this.f27860d.getValue();
    }

    public final /* synthetic */ C2662c f() {
        String d8 = this.f27857a.d();
        String lastPathSegment = Uri.parse(this.f27857a.G()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new C2662c(d8, 0, null, false, lastPathSegment, null, this.f27857a.u(), 46, null);
    }

    public final String g() {
        return this.f27863g;
    }

    public final b h() {
        return this.f27862f;
    }

    public final void i() {
        b(PaymentAnalyticsRequestFactory.v(this.f27859c, PaymentAnalyticsEvent.f24808J, null, null, null, null, null, 62, null));
    }

    public final void j() {
        b(PaymentAnalyticsRequestFactory.v(this.f27859c, PaymentAnalyticsEvent.f24807I, null, null, null, null, null, 62, null));
    }

    public final void k() {
        b(PaymentAnalyticsRequestFactory.v(this.f27859c, PaymentAnalyticsEvent.f24806H, null, null, null, null, null, 62, null));
        b(PaymentAnalyticsRequestFactory.v(this.f27859c, PaymentAnalyticsEvent.f24809K, null, null, null, null, null, 62, null));
    }
}
