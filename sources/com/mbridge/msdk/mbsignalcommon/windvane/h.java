package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    protected Context f20603b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f20604c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f20605d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f20603b = context;
        this.f20605d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f20604c = obj;
        this.f20605d = windVaneWebView;
    }
}
