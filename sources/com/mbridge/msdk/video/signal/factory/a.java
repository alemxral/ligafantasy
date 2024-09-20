package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes4.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f22919a;

    /* renamed from: b, reason: collision with root package name */
    protected d f22920b;

    /* renamed from: c, reason: collision with root package name */
    protected j f22921c;

    /* renamed from: d, reason: collision with root package name */
    protected g f22922d;

    /* renamed from: e, reason: collision with root package name */
    protected f f22923e;

    /* renamed from: f, reason: collision with root package name */
    protected i f22924f;

    /* renamed from: g, reason: collision with root package name */
    protected c f22925g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f22919a == null) {
            this.f22919a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f22919a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f22924f == null) {
            this.f22924f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f22924f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f22925g == null) {
            this.f22925g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f22925g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f22920b == null) {
            this.f22920b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.f22920b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f22923e == null) {
            this.f22923e = new e();
        }
        return this.f22923e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f22922d == null) {
            this.f22922d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f22922d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f22921c == null) {
            this.f22921c = new h();
        }
        return this.f22921c;
    }
}
