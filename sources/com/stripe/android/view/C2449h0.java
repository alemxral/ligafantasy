package com.stripe.android.view;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2449h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f27717a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f27718b;

    public C2449h0(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        this.f27717a = activity;
        Object systemService = activity.getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f27718b = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void a() {
        IBinder iBinder;
        if (this.f27718b.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.f27718b;
            View currentFocus = this.f27717a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
