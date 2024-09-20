package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a;

/* loaded from: classes3.dex */
final class i implements ComponentCallbacks2C1937a.InterfaceC0376a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1939c f15149a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(C1939c c1939c) {
        this.f15149a = c1939c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a.InterfaceC0376a
    public final void a(boolean z8) {
        Handler handler;
        Handler handler2;
        C1939c c1939c = this.f15149a;
        handler = c1939c.f15132n;
        handler2 = c1939c.f15132n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
