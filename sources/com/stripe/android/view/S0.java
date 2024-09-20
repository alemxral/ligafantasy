package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import j2.AbstractC3050B;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f27565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27566b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27567c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27568d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27569e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27570f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f27571g;

    public S0(Context context) {
        AbstractC3159y.i(context, "context");
        N0 n02 = new N0(context);
        this.f27565a = n02;
        int a8 = a(context, n02.a(), j2.x.f33084a);
        this.f27566b = a8;
        this.f27567c = a(context, n02.b(), j2.x.f33088e);
        int a9 = a(context, n02.e(), j2.x.f33085b);
        this.f27568d = a9;
        Resources resources = context.getResources();
        int i8 = AbstractC3050B.f32787b;
        int alphaComponent = ColorUtils.setAlphaComponent(a8, resources.getInteger(i8));
        this.f27569e = alphaComponent;
        int alphaComponent2 = ColorUtils.setAlphaComponent(a9, context.getResources().getInteger(i8));
        this.f27570f = alphaComponent2;
        this.f27571g = new int[]{a8, alphaComponent, a9, alphaComponent2};
    }

    private final int a(Context context, int i8, int i9) {
        if (N0.f27423g.b(i8)) {
            return ContextCompat.getColor(context, i9);
        }
        return i8;
    }

    public final int b(boolean z8) {
        if (z8) {
            return this.f27569e;
        }
        return this.f27570f;
    }

    public final int c(boolean z8) {
        if (z8) {
            return this.f27566b;
        }
        return this.f27568d;
    }

    public final int d(boolean z8) {
        if (z8) {
            return this.f27566b;
        }
        return this.f27567c;
    }
}
