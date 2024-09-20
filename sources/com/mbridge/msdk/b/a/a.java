package com.mbridge.msdk.b.a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f17857a;

    /* renamed from: b, reason: collision with root package name */
    private int f17858b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17859c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f17857a = new WeakReference<>(preloadListener);
        }
    }

    public final boolean a() {
        return this.f17859c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f17857a;
        if (weakReference != null && weakReference.get() != null) {
            this.f17857a.get().onPreloadFaild(str);
        }
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f17857a;
        if (weakReference != null && weakReference.get() != null) {
            this.f17857a.get().onPreloadSucceed();
        }
    }

    public final void a(boolean z8) {
        this.f17859c = z8;
    }
}
