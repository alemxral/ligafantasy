package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import i2.C2776d;
import i2.InterfaceC2773a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f23406a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC2773a f23407b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f23408c;

    /* renamed from: d, reason: collision with root package name */
    long f23409d;

    /* renamed from: e, reason: collision with root package name */
    long f23410e;

    /* renamed from: f, reason: collision with root package name */
    long f23411f;

    /* renamed from: g, reason: collision with root package name */
    long f23412g;

    /* renamed from: h, reason: collision with root package name */
    long f23413h;

    /* renamed from: i, reason: collision with root package name */
    long f23414i;

    /* renamed from: j, reason: collision with root package name */
    long f23415j;

    /* renamed from: k, reason: collision with root package name */
    long f23416k;

    /* renamed from: l, reason: collision with root package name */
    int f23417l;

    /* renamed from: m, reason: collision with root package name */
    int f23418m;

    /* renamed from: n, reason: collision with root package name */
    int f23419n;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final z f23420a;

        /* renamed from: com.squareup.picasso.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0443a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f23421a;

            RunnableC0443a(Message message) {
                this.f23421a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f23421a.what);
            }
        }

        a(Looper looper, z zVar) {
            super(looper);
            this.f23420a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                s.f23302o.post(new RunnableC0443a(message));
                                return;
                            } else {
                                this.f23420a.l((Long) message.obj);
                                return;
                            }
                        }
                        this.f23420a.i(message.arg1);
                        return;
                    }
                    this.f23420a.h(message.arg1);
                    return;
                }
                this.f23420a.k();
                return;
            }
            this.f23420a.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(InterfaceC2773a interfaceC2773a) {
        this.f23407b = interfaceC2773a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f23406a = handlerThread;
        handlerThread.start();
        C.i(handlerThread.getLooper());
        this.f23408c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i8, long j8) {
        return j8 / i8;
    }

    private void m(Bitmap bitmap, int i8) {
        int j8 = C.j(bitmap);
        Handler handler = this.f23408c;
        handler.sendMessage(handler.obtainMessage(i8, j8, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2776d a() {
        return new C2776d(this.f23407b.b(), this.f23407b.size(), this.f23409d, this.f23410e, this.f23411f, this.f23412g, this.f23413h, this.f23414i, this.f23415j, this.f23416k, this.f23417l, this.f23418m, this.f23419n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f23408c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f23408c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j8) {
        Handler handler = this.f23408c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void h(long j8) {
        int i8 = this.f23418m + 1;
        this.f23418m = i8;
        long j9 = this.f23412g + j8;
        this.f23412g = j9;
        this.f23415j = g(i8, j9);
    }

    void i(long j8) {
        this.f23419n++;
        long j9 = this.f23413h + j8;
        this.f23413h = j9;
        this.f23416k = g(this.f23418m, j9);
    }

    void j() {
        this.f23409d++;
    }

    void k() {
        this.f23410e++;
    }

    void l(Long l8) {
        this.f23417l++;
        long longValue = this.f23411f + l8.longValue();
        this.f23411f = longValue;
        this.f23414i = g(this.f23417l, longValue);
    }
}
