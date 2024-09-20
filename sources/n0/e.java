package N0;

import H0.AbstractC1184s;
import H0.E;
import H0.W;
import android.database.SQLException;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.C3679j;
import s.AbstractC3701c;
import s.EnumC3702d;
import s.f;
import s.h;
import u.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f7143a;

    /* renamed from: b, reason: collision with root package name */
    private final double f7144b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7145c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7146d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7147e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f7148f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f7149g;

    /* renamed from: h, reason: collision with root package name */
    private final f f7150h;

    /* renamed from: i, reason: collision with root package name */
    private final E f7151i;

    /* renamed from: j, reason: collision with root package name */
    private int f7152j;

    /* renamed from: k, reason: collision with root package name */
    private long f7153k;

    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1184s f7154a;

        /* renamed from: b, reason: collision with root package name */
        private final C3679j f7155b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f7154a, this.f7155b);
            e.this.f7151i.c();
            double g8 = e.this.g();
            E0.f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g8 / 1000.0d)) + " s for report: " + this.f7154a.d());
            e.q(g8);
        }

        private b(AbstractC1184s abstractC1184s, C3679j c3679j) {
            this.f7154a = abstractC1184s;
            this.f7155b = c3679j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, O0.d dVar, E e8) {
        this(dVar.f7686f, dVar.f7687g, dVar.f7688h * 1000, fVar, e8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f7143a) * Math.pow(this.f7144b, h()));
    }

    private int h() {
        int max;
        if (this.f7153k == 0) {
            this.f7153k = o();
        }
        int o8 = (int) ((o() - this.f7153k) / this.f7145c);
        if (l()) {
            max = Math.min(100, this.f7152j + o8);
        } else {
            max = Math.max(0, this.f7152j - o8);
        }
        if (this.f7152j != max) {
            this.f7152j = max;
            this.f7153k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f7148f.size() < this.f7147e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f7148f.size() == this.f7147e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f7150h, EnumC3702d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C3679j c3679j, boolean z8, AbstractC1184s abstractC1184s, Exception exc) {
        if (exc != null) {
            c3679j.d(exc);
            return;
        }
        if (z8) {
            j();
        }
        c3679j.e(abstractC1184s);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final AbstractC1184s abstractC1184s, final C3679j c3679j) {
        final boolean z8;
        E0.f.f().b("Sending report through Google DataTransport: " + abstractC1184s.d());
        if (SystemClock.elapsedRealtime() - this.f7146d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f7150h.a(AbstractC3701c.e(abstractC1184s.b()), new h() { // from class: N0.c
            @Override // s.h
            public final void a(Exception exc) {
                e.this.n(c3679j, z8, abstractC1184s, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d8) {
        try {
            Thread.sleep((long) d8);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3679j i(AbstractC1184s abstractC1184s, boolean z8) {
        synchronized (this.f7148f) {
            try {
                C3679j c3679j = new C3679j();
                if (z8) {
                    this.f7151i.b();
                    if (k()) {
                        E0.f.f().b("Enqueueing report: " + abstractC1184s.d());
                        E0.f.f().b("Queue size: " + this.f7148f.size());
                        this.f7149g.execute(new b(abstractC1184s, c3679j));
                        E0.f.f().b("Closing task for report: " + abstractC1184s.d());
                        c3679j.e(abstractC1184s);
                        return c3679j;
                    }
                    h();
                    E0.f.f().b("Dropping report due to queue being full: " + abstractC1184s.d());
                    this.f7151i.a();
                    c3679j.e(abstractC1184s);
                    return c3679j;
                }
                p(abstractC1184s, c3679j);
                return c3679j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: N0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        W.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d8, double d9, long j8, f fVar, E e8) {
        this.f7143a = d8;
        this.f7144b = d9;
        this.f7145c = j8;
        this.f7150h = fVar;
        this.f7151i = e8;
        this.f7146d = SystemClock.elapsedRealtime();
        int i8 = (int) d8;
        this.f7147e = i8;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i8);
        this.f7148f = arrayBlockingQueue;
        this.f7149g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7152j = 0;
        this.f7153k = 0L;
    }
}
