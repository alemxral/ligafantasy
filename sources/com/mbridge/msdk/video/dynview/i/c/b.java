package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f22082a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f22083b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f22084c;

    /* renamed from: d, reason: collision with root package name */
    private a f22085d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.i.c.a f22086a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.f22086a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f22086a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f22086a;
            if (aVar != null) {
                aVar.a(j8);
            }
        }
    }

    private void c() {
        a aVar = this.f22085d;
        if (aVar != null) {
            aVar.cancel();
            this.f22085d = null;
        }
        if (this.f22083b <= 0) {
            this.f22083b = this.f22082a + 1000;
        }
        a aVar2 = new a(this.f22082a, this.f22083b);
        this.f22085d = aVar2;
        aVar2.a(this.f22084c);
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f22083b = j8;
        return this;
    }

    public final b b(long j8) {
        this.f22082a = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f22084c = aVar;
        return this;
    }

    public final void b() {
        a aVar = this.f22085d;
        if (aVar != null) {
            aVar.cancel();
            this.f22085d = null;
        }
    }

    public final void a() {
        if (this.f22085d == null) {
            c();
        }
        this.f22085d.start();
    }

    public final void a(long j8, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f22082a = j8;
        this.f22084c = aVar;
        c();
        a aVar2 = this.f22085d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}
