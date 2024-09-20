package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import p3.InterfaceC3599a;

/* loaded from: classes4.dex */
public final class c implements InterfaceC3599a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f25347a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f25348b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f25349c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f25350d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25351e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25352f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f25353g;

    public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, ActivityResultLauncher hostActivityLauncher, Integer num, boolean z8, boolean z9, Set productUsage) {
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3159y.i(hostActivityLauncher, "hostActivityLauncher");
        AbstractC3159y.i(productUsage, "productUsage");
        this.f25347a = publishableKeyProvider;
        this.f25348b = stripeAccountIdProvider;
        this.f25349c = hostActivityLauncher;
        this.f25350d = num;
        this.f25351e = z8;
        this.f25352f = z9;
        this.f25353g = productUsage;
    }

    @Override // p3.InterfaceC3599a
    public void a(com.stripe.android.model.b params) {
        AbstractC3159y.i(params, "params");
        this.f25349c.launch(new PaymentLauncherContract.a.b((String) this.f25347a.invoke(), (String) this.f25348b.invoke(), this.f25352f, this.f25353g, this.f25351e, params, this.f25350d));
    }

    @Override // p3.InterfaceC3599a
    public void b(String clientSecret) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f25349c.launch(new PaymentLauncherContract.a.c((String) this.f25347a.invoke(), (String) this.f25348b.invoke(), this.f25352f, this.f25353g, this.f25351e, clientSecret, this.f25350d));
    }

    @Override // p3.InterfaceC3599a
    public void c(com.stripe.android.model.c params) {
        AbstractC3159y.i(params, "params");
        this.f25349c.launch(new PaymentLauncherContract.a.b((String) this.f25347a.invoke(), (String) this.f25348b.invoke(), this.f25352f, this.f25353g, this.f25351e, params, this.f25350d));
    }

    @Override // p3.InterfaceC3599a
    public void d(String clientSecret) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f25349c.launch(new PaymentLauncherContract.a.d((String) this.f25347a.invoke(), (String) this.f25348b.invoke(), this.f25352f, this.f25353g, this.f25351e, clientSecret, this.f25350d));
    }
}
