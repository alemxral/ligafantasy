package com.mbridge.msdk.e.a;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private int f18783a;

    /* renamed from: b, reason: collision with root package name */
    private int f18784b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18785c;

    /* renamed from: d, reason: collision with root package name */
    private final float f18786d;

    public f() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int a() {
        return this.f18783a;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int b() {
        return this.f18784b;
    }

    public f(int i8, int i9, float f8) {
        this.f18783a = i8;
        this.f18785c = i9;
        this.f18786d = f8;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final void a(z zVar) throws z {
        int i8 = this.f18784b + 1;
        this.f18784b = i8;
        int i9 = this.f18783a;
        this.f18783a = i9 + ((int) (i9 * this.f18786d));
        if (i8 > this.f18785c) {
            throw zVar;
        }
    }
}
