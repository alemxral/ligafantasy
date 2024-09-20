package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077q0;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2278w2 {

    /* renamed from: a, reason: collision with root package name */
    final Context f16886a;

    /* renamed from: b, reason: collision with root package name */
    String f16887b;

    /* renamed from: c, reason: collision with root package name */
    String f16888c;

    /* renamed from: d, reason: collision with root package name */
    String f16889d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f16890e;

    /* renamed from: f, reason: collision with root package name */
    long f16891f;

    /* renamed from: g, reason: collision with root package name */
    C2077q0 f16892g;

    /* renamed from: h, reason: collision with root package name */
    boolean f16893h;

    /* renamed from: i, reason: collision with root package name */
    final Long f16894i;

    /* renamed from: j, reason: collision with root package name */
    String f16895j;

    public C2278w2(Context context, C2077q0 c2077q0, Long l8) {
        this.f16893h = true;
        AbstractC1319p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1319p.l(applicationContext);
        this.f16886a = applicationContext;
        this.f16894i = l8;
        if (c2077q0 != null) {
            this.f16892g = c2077q0;
            this.f16887b = c2077q0.f15837f;
            this.f16888c = c2077q0.f15836e;
            this.f16889d = c2077q0.f15835d;
            this.f16893h = c2077q0.f15834c;
            this.f16891f = c2077q0.f15833b;
            this.f16895j = c2077q0.f15839h;
            Bundle bundle = c2077q0.f15838g;
            if (bundle != null) {
                this.f16890e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
