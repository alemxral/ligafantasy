package com.stripe.android.stripe3ds2.transaction;

import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.stripe.android.stripe3ds2.transaction.q;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Application f26863a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26864b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.q f26865c;

    /* renamed from: d, reason: collision with root package name */
    private final T3.m f26866d;

    /* renamed from: e, reason: collision with root package name */
    private final List f26867e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26868f;

    /* renamed from: g, reason: collision with root package name */
    private final P5.g f26869g;

    public l(Application application, boolean z8, X3.q sdkTransactionId, T3.m uiCustomization, List rootCerts, boolean z9, P5.g workContext) {
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(rootCerts, "rootCerts");
        AbstractC3159y.i(workContext, "workContext");
        this.f26863a = application;
        this.f26864b = z8;
        this.f26865c = sdkTransactionId;
        this.f26866d = uiCustomization;
        this.f26867e = rootCerts;
        this.f26868f = z9;
        this.f26869g = workContext;
    }

    public final X3.n a() {
        o a8 = o.f26879a.a(this.f26868f);
        U3.a aVar = new U3.a(this.f26863a, new U3.e(this.f26865c), this.f26869g, a8, null, null, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return new j(this.f26865c, new X3.p(), new X3.h(this.f26864b, this.f26867e, aVar), new V3.c(this.f26864b), new X3.f(aVar), new i(aVar, this.f26869g), new q.b(this.f26869g), this.f26866d, aVar, a8);
    }
}
