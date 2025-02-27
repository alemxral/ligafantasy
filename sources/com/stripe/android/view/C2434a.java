package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2434a implements InterfaceC2464p {

    /* renamed from: b, reason: collision with root package name */
    private final ComponentActivity f27631b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f27632c;

    /* renamed from: d, reason: collision with root package name */
    private final LifecycleOwner f27633d;

    public C2434a(ComponentActivity activity, Integer num) {
        AbstractC3159y.i(activity, "activity");
        this.f27631b = activity;
        this.f27632c = num;
        this.f27633d = activity;
    }

    @Override // com.stripe.android.view.InterfaceC2464p
    public void a(Class target, Bundle extras, int i8) {
        AbstractC3159y.i(target, "target");
        AbstractC3159y.i(extras, "extras");
        Intent putExtras = new Intent(this.f27631b, (Class<?>) target).putExtras(extras);
        AbstractC3159y.h(putExtras, "putExtras(...)");
        this.f27631b.startActivityForResult(putExtras, i8);
    }

    @Override // com.stripe.android.view.InterfaceC2464p
    public Integer b() {
        return this.f27632c;
    }

    @Override // com.stripe.android.view.InterfaceC2464p
    public Application c() {
        Application application = this.f27631b.getApplication();
        AbstractC3159y.h(application, "getApplication(...)");
        return application;
    }

    @Override // com.stripe.android.view.InterfaceC2464p
    public LifecycleOwner d() {
        return this.f27633d;
    }
}
