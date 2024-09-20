package com.stripe.android.paymentsheet.analytics;

import A2.d;
import L5.I;
import L5.p;
import L5.t;
import P5.g;
import X5.n;
import b3.EnumC1870e;
import b3.y;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.c;
import com.stripe.android.paymentsheet.u;
import h6.C2758a;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import q3.EnumC3653f;
import t3.AbstractC3792b;
import t3.AbstractC3793c;
import x2.InterfaceC3873c;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class a implements EventReporter {

    /* renamed from: a, reason: collision with root package name */
    private final EventReporter.Mode f25719a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3873c f25720b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25721c;

    /* renamed from: d, reason: collision with root package name */
    private final d f25722d;

    /* renamed from: e, reason: collision with root package name */
    private final g f25723e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25724f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25725g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25726h;

    /* renamed from: i, reason: collision with root package name */
    private String f25727i;

    /* renamed from: com.stripe.android.paymentsheet.analytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0601a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25728a;

        static {
            int[] iArr = new int[EventReporter.a.values().length];
            try {
                iArr[EventReporter.a.f25716b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.a.f25715a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25728a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25729a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f25731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, P5.d dVar) {
            super(2, dVar);
            this.f25731c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f25731c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f25729a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = a.this.f25720b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f25721c;
                c cVar = this.f25731c;
                interfaceC3873c.a(paymentAnalyticsRequestFactory.g(cVar, cVar.e()));
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(EventReporter.Mode mode, InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d durationProvider, g workContext) {
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(durationProvider, "durationProvider");
        AbstractC3159y.i(workContext, "workContext");
        this.f25719a = mode;
        this.f25720b = analyticsRequestExecutor;
        this.f25721c = paymentAnalyticsRequestFactory;
        this.f25722d = durationProvider;
        this.f25723e = workContext;
    }

    private final void A(c cVar) {
        AbstractC2829k.d(N.a(this.f25723e), null, null, new b(cVar, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void a() {
        A(new c.C0602c(this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void b(EnumC1870e selectedBrand, Throwable error) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        AbstractC3159y.i(error, "error");
        A(new c.x(selectedBrand, error, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void c(EnumC1870e selectedBrand) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        A(new c.y(selectedBrand, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void d() {
        A(new c.t(this.f25719a, this.f25727i, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void e(String type) {
        AbstractC3159y.i(type, "type");
        A(new c.a(type, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void f() {
        A(new c.s(this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void g(AbstractC3991f abstractC3991f, AbstractC3792b error) {
        AbstractC3159y.i(error, "error");
        A(new c.n(this.f25719a, new c.n.a.b(error), this.f25722d.a(d.b.f79b), abstractC3991f, this.f25727i, this.f25724f, this.f25725g, this.f25726h, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void h(String code) {
        AbstractC3159y.i(code, "code");
        A(new c.q(code, this.f25727i, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void i(boolean z8) {
        d.a.a(this.f25722d, d.b.f78a, false, 2, null);
        A(new c.k(this.f25724f, this.f25725g, this.f25726h, z8));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void j(u.g configuration, boolean z8) {
        AbstractC3159y.i(configuration, "configuration");
        this.f25724f = z8;
        A(new c.i(this.f25719a, configuration, z8, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void k(AbstractC3991f paymentSelection) {
        AbstractC3159y.i(paymentSelection, "paymentSelection");
        A(new c.r(this.f25719a, paymentSelection, this.f25727i, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void l(EventReporter.a source, EnumC1870e selectedBrand) {
        c.v.a aVar;
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        int i8 = C0601a.f25728a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.v.a.f25853b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.v.a.f25854c;
        }
        A(new c.v(aVar, selectedBrand, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void m(AbstractC3991f abstractC3991f, EnumC3653f enumC3653f) {
        AbstractC3991f.C0916f c0916f;
        AbstractC3991f abstractC3991f2;
        boolean z8;
        AbstractC3991f.C0916f.b k8;
        AbstractC3991f b8;
        if (abstractC3991f instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) abstractC3991f;
        } else {
            c0916f = null;
        }
        if (c0916f != null && (k8 = c0916f.k()) != null && (b8 = k8.b()) != null) {
            abstractC3991f2 = b8;
        } else {
            abstractC3991f2 = abstractC3991f;
        }
        C2758a a8 = this.f25722d.a(d.b.f79b);
        EventReporter.Mode mode = this.f25719a;
        c.n.a.C0604c c0604c = c.n.a.C0604c.f25812a;
        String str = this.f25727i;
        if (enumC3653f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        A(new c.n(mode, c0604c, a8, abstractC3991f2, str, z8, this.f25725g, this.f25726h, enumC3653f, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void n(Throwable error) {
        AbstractC3159y.i(error, "error");
        A(new c.f(error, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void o(String code) {
        AbstractC3159y.i(code, "code");
        d.a.a(this.f25722d, d.b.f81d, false, 2, null);
        A(new c.w(code, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        A(new c.e(this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void p(Throwable error) {
        AbstractC3159y.i(error, "error");
        A(new c.j(this.f25722d.a(d.b.f78a), error, this.f25724f, this.f25725g, this.f25726h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void q(String str) {
        A(new c.m(this.f25724f, this.f25725g, this.f25726h, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void r() {
        A(new c.u(this.f25719a, this.f25727i, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void s(AbstractC3991f abstractC3991f) {
        A(new c.p(this.f25727i, this.f25722d.a(d.b.f81d), AbstractC3793c.c(abstractC3991f), AbstractC3793c.e(abstractC3991f), this.f25724f, this.f25725g, this.f25726h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void t(AbstractC3991f abstractC3991f, y yVar, boolean z8, String str, u.l initializationMode, List orderedLpms) {
        boolean z9;
        AbstractC3159y.i(initializationMode, "initializationMode");
        AbstractC3159y.i(orderedLpms, "orderedLpms");
        this.f25727i = str;
        if (yVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f25725g = z9;
        this.f25726h = z8;
        d.a.a(this.f25722d, d.b.f79b, false, 2, null);
        A(new c.l(abstractC3991f, initializationMode, orderedLpms, this.f25722d.a(d.b.f78a), yVar, this.f25724f, z8, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void u(EventReporter.a source, EnumC1870e enumC1870e) {
        c.h.a aVar;
        AbstractC3159y.i(source, "source");
        int i8 = C0601a.f25728a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.h.a.f25773b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.h.a.f25774c;
        }
        A(new c.h(aVar, enumC1870e, this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void v() {
        A(new c.b(this.f25719a));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void w() {
        A(new c.g(this.f25724f, this.f25725g, this.f25726h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void x(String code) {
        AbstractC3159y.i(code, "code");
        A(new c.o(code, this.f25724f, this.f25725g, this.f25726h));
    }
}
