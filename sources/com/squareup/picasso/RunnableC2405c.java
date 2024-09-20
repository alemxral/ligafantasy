package com.squareup.picasso;

import P6.InterfaceC1281g;
import P6.L;
import P6.Z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.q;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import i2.InterfaceC2773a;
import i2.InterfaceC2777e;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC2405c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f23210t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static final ThreadLocal f23211u = new a();

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f23212v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    private static final x f23213w = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f23214a = f23212v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    final s f23215b;

    /* renamed from: c, reason: collision with root package name */
    final g f23216c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC2773a f23217d;

    /* renamed from: e, reason: collision with root package name */
    final z f23218e;

    /* renamed from: f, reason: collision with root package name */
    final String f23219f;

    /* renamed from: g, reason: collision with root package name */
    final v f23220g;

    /* renamed from: h, reason: collision with root package name */
    final int f23221h;

    /* renamed from: i, reason: collision with root package name */
    int f23222i;

    /* renamed from: j, reason: collision with root package name */
    final x f23223j;

    /* renamed from: k, reason: collision with root package name */
    AbstractC2403a f23224k;

    /* renamed from: l, reason: collision with root package name */
    List f23225l;

    /* renamed from: m, reason: collision with root package name */
    Bitmap f23226m;

    /* renamed from: n, reason: collision with root package name */
    Future f23227n;

    /* renamed from: o, reason: collision with root package name */
    s.e f23228o;

    /* renamed from: p, reason: collision with root package name */
    Exception f23229p;

    /* renamed from: q, reason: collision with root package name */
    int f23230q;

    /* renamed from: r, reason: collision with root package name */
    int f23231r;

    /* renamed from: s, reason: collision with root package name */
    s.f f23232s;

    /* renamed from: com.squareup.picasso.c$a */
    /* loaded from: classes4.dex */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    /* loaded from: classes4.dex */
    static class b extends x {
        b() {
        }

        @Override // com.squareup.picasso.x
        public boolean c(v vVar) {
            return true;
        }

        @Override // com.squareup.picasso.x
        public x.a f(v vVar, int i8) {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class RunnableC0441c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2777e f23233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RuntimeException f23234b;

        RunnableC0441c(InterfaceC2777e interfaceC2777e, RuntimeException runtimeException) {
            this.f23233a = interfaceC2777e;
            this.f23234b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f23233a.key() + " crashed with exception.", this.f23234b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$d */
    /* loaded from: classes4.dex */
    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f23235a;

        d(StringBuilder sb) {
            this.f23235a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f23235a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$e */
    /* loaded from: classes4.dex */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2777e f23236a;

        e(InterfaceC2777e interfaceC2777e) {
            this.f23236a = interfaceC2777e;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f23236a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$f */
    /* loaded from: classes4.dex */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2777e f23237a;

        f(InterfaceC2777e interfaceC2777e) {
            this.f23237a = interfaceC2777e;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f23237a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    RunnableC2405c(s sVar, g gVar, InterfaceC2773a interfaceC2773a, z zVar, AbstractC2403a abstractC2403a, x xVar) {
        this.f23215b = sVar;
        this.f23216c = gVar;
        this.f23217d = interfaceC2773a;
        this.f23218e = zVar;
        this.f23224k = abstractC2403a;
        this.f23219f = abstractC2403a.d();
        this.f23220g = abstractC2403a.i();
        this.f23232s = abstractC2403a.h();
        this.f23221h = abstractC2403a.e();
        this.f23222i = abstractC2403a.f();
        this.f23223j = xVar;
        this.f23231r = xVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            InterfaceC2777e interfaceC2777e = (InterfaceC2777e) list.get(i8);
            try {
                Bitmap a8 = interfaceC2777e.a(bitmap);
                if (a8 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(interfaceC2777e.key());
                    sb.append(" returned null after ");
                    sb.append(i8);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(((InterfaceC2777e) it.next()).key());
                        sb.append('\n');
                    }
                    s.f23302o.post(new d(sb));
                    return null;
                }
                if (a8 == bitmap && bitmap.isRecycled()) {
                    s.f23302o.post(new e(interfaceC2777e));
                    return null;
                }
                if (a8 != bitmap && !bitmap.isRecycled()) {
                    s.f23302o.post(new f(interfaceC2777e));
                    return null;
                }
                i8++;
                bitmap = a8;
            } catch (RuntimeException e8) {
                s.f23302o.post(new RunnableC0441c(interfaceC2777e, e8));
                return null;
            }
        }
        return bitmap;
    }

    private s.f d() {
        boolean z8;
        s.f fVar = s.f.LOW;
        List list = this.f23225l;
        if (list != null && !list.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC2403a abstractC2403a = this.f23224k;
        if (abstractC2403a == null && !z8) {
            return fVar;
        }
        if (abstractC2403a != null) {
            fVar = abstractC2403a.h();
        }
        if (z8) {
            int size = this.f23225l.size();
            for (int i8 = 0; i8 < size; i8++) {
                s.f h8 = ((AbstractC2403a) this.f23225l.get(i8)).h();
                if (h8.ordinal() > fVar.ordinal()) {
                    fVar = h8;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(Z z8, v vVar) {
        InterfaceC1281g d8 = L.d(z8);
        boolean s8 = C.s(d8);
        boolean z9 = vVar.f23368r;
        BitmapFactory.Options d9 = x.d(vVar);
        boolean g8 = x.g(d9);
        if (!s8) {
            InputStream inputStream = d8.inputStream();
            if (g8) {
                m mVar = new m(inputStream);
                mVar.a(false);
                long e8 = mVar.e(1024);
                BitmapFactory.decodeStream(mVar, null, d9);
                x.b(vVar.f23358h, vVar.f23359i, d9, vVar);
                mVar.b(e8);
                mVar.a(true);
                inputStream = mVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, d9);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] readByteArray = d8.readByteArray();
        if (g8) {
            BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
            x.b(vVar.f23358h, vVar.f23359i, d9, vVar);
        }
        return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RunnableC2405c g(s sVar, g gVar, InterfaceC2773a interfaceC2773a, z zVar, AbstractC2403a abstractC2403a) {
        v i8 = abstractC2403a.i();
        List i9 = sVar.i();
        int size = i9.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) i9.get(i10);
            if (xVar.c(i8)) {
                return new RunnableC2405c(sVar, gVar, interfaceC2773a, zVar, abstractC2403a, xVar);
            }
        }
        return new RunnableC2405c(sVar, gVar, interfaceC2773a, zVar, abstractC2403a, f23213w);
    }

    static int l(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    static int m(int i8) {
        return (i8 == 2 || i8 == 7 || i8 == 4 || i8 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z8, int i8, int i9, int i10, int i11) {
        return !z8 || (i10 != 0 && i8 > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.graphics.Bitmap y(com.squareup.picasso.v r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2405c.y(com.squareup.picasso.v, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(v vVar) {
        String a8 = vVar.a();
        StringBuilder sb = (StringBuilder) f23211u.get();
        sb.ensureCapacity(a8.length() + 8);
        sb.replace(8, sb.length(), a8);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AbstractC2403a abstractC2403a) {
        boolean z8 = this.f23215b.f23316m;
        v vVar = abstractC2403a.f23194b;
        if (this.f23224k == null) {
            this.f23224k = abstractC2403a;
            if (z8) {
                List list = this.f23225l;
                if (list != null && !list.isEmpty()) {
                    C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
                    return;
                } else {
                    C.u("Hunter", "joined", vVar.d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f23225l == null) {
            this.f23225l = new ArrayList(3);
        }
        this.f23225l.add(abstractC2403a);
        if (z8) {
            C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
        }
        s.f h8 = abstractC2403a.h();
        if (h8.ordinal() > this.f23232s.ordinal()) {
            this.f23232s = h8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Future future;
        if (this.f23224k != null) {
            return false;
        }
        List list = this.f23225l;
        if ((list != null && !list.isEmpty()) || (future = this.f23227n) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(AbstractC2403a abstractC2403a) {
        boolean z8;
        if (this.f23224k == abstractC2403a) {
            this.f23224k = null;
            z8 = true;
        } else {
            List list = this.f23225l;
            if (list != null) {
                z8 = list.remove(abstractC2403a);
            } else {
                z8 = false;
            }
        }
        if (z8 && abstractC2403a.h() == this.f23232s) {
            this.f23232s = d();
        }
        if (this.f23215b.f23316m) {
            C.u("Hunter", "removed", abstractC2403a.f23194b.d(), C.l(this, "from "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2403a h() {
        return this.f23224k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f23225l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v j() {
        return this.f23220g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Exception k() {
        return this.f23229p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        return this.f23219f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.e o() {
        return this.f23228o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f23221h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s q() {
        return this.f23215b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f r() {
        return this.f23232s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f23220g);
                        if (this.f23215b.f23316m) {
                            C.t("Hunter", "executing", C.k(this));
                        }
                        Bitmap t8 = t();
                        this.f23226m = t8;
                        if (t8 == null) {
                            this.f23216c.e(this);
                        } else {
                            this.f23216c.d(this);
                        }
                    } catch (q.b e8) {
                        if (!p.a(e8.f23298b) || e8.f23297a != 504) {
                            this.f23229p = e8;
                        }
                        this.f23216c.e(this);
                    } catch (Exception e9) {
                        this.f23229p = e9;
                        this.f23216c.e(this);
                    }
                } catch (IOException e10) {
                    this.f23229p = e10;
                    this.f23216c.g(this);
                }
            } catch (OutOfMemoryError e11) {
                StringWriter stringWriter = new StringWriter();
                this.f23218e.a().a(new PrintWriter(stringWriter));
                this.f23229p = new RuntimeException(stringWriter.toString(), e11);
                this.f23216c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap s() {
        return this.f23226m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:43:0x009a, B:45:0x00a2, B:48:0x00c4, B:50:0x00cc, B:52:0x00da, B:53:0x00e9, B:57:0x00a9, B:59:0x00b7), top: B:42:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap t() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2405c.t():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        Future future = this.f23227n;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z8, NetworkInfo networkInfo) {
        int i8 = this.f23231r;
        if (i8 > 0) {
            this.f23231r = i8 - 1;
            return this.f23223j.h(z8, networkInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f23223j.i();
    }
}
