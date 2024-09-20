package com.mbridge.msdk.f.a;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.f.a.a f18973a;

    /* renamed from: b, reason: collision with root package name */
    private long f18974b;

    /* renamed from: c, reason: collision with root package name */
    private a f18975c;

    /* renamed from: d, reason: collision with root package name */
    private long f18976d = 0;

    /* loaded from: classes4.dex */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.f.a.a f18977a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.f.a.a aVar) {
            this.f18977a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.f.a.a aVar = this.f18977a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.f.a.a aVar = this.f18977a;
            if (aVar != null) {
                aVar.onTick(j8);
            }
        }
    }

    public final void a() {
        a aVar = this.f18975c;
        if (aVar != null) {
            aVar.cancel();
            this.f18975c = null;
        }
    }

    public final b b(long j8) {
        this.f18976d = j8;
        return this;
    }

    public final void b() {
        a aVar = this.f18975c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f18975c = null;
            }
            if (this.f18974b <= 0) {
                this.f18974b = this.f18976d + 1000;
            }
            a aVar2 = new a(this.f18976d, this.f18974b);
            this.f18975c = aVar2;
            aVar2.a(this.f18973a);
        }
        this.f18975c.start();
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f18974b = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.f.a.a aVar) {
        this.f18973a = aVar;
        return this;
    }
}
