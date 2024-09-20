package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.AbstractC2403a;
import i2.InterfaceC2773a;
import i2.InterfaceC2775c;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f23302o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile s f23303p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f23304a;

    /* renamed from: b, reason: collision with root package name */
    private final c f23305b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23306c;

    /* renamed from: d, reason: collision with root package name */
    final Context f23307d;

    /* renamed from: e, reason: collision with root package name */
    final com.squareup.picasso.g f23308e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC2773a f23309f;

    /* renamed from: g, reason: collision with root package name */
    final z f23310g;

    /* renamed from: h, reason: collision with root package name */
    final Map f23311h;

    /* renamed from: i, reason: collision with root package name */
    final Map f23312i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f23313j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f23314k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23315l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f23316m;

    /* renamed from: n, reason: collision with root package name */
    boolean f23317n;

    /* loaded from: classes4.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 3) {
                int i9 = 0;
                if (i8 != 8) {
                    if (i8 == 13) {
                        List list = (List) message.obj;
                        int size = list.size();
                        while (i9 < size) {
                            AbstractC2403a abstractC2403a = (AbstractC2403a) list.get(i9);
                            abstractC2403a.f23193a.n(abstractC2403a);
                            i9++;
                        }
                        return;
                    }
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i9 < size2) {
                    RunnableC2405c runnableC2405c = (RunnableC2405c) list2.get(i9);
                    runnableC2405c.f23215b.d(runnableC2405c);
                    i9++;
                }
                return;
            }
            AbstractC2403a abstractC2403a2 = (AbstractC2403a) message.obj;
            if (abstractC2403a2.g().f23316m) {
                C.u("Main", "canceled", abstractC2403a2.f23194b.d(), "target got garbage collected");
            }
            abstractC2403a2.f23193a.a(abstractC2403a2.k());
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f23318a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC2775c f23319b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f23320c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC2773a f23321d;

        /* renamed from: e, reason: collision with root package name */
        private g f23322e;

        /* renamed from: f, reason: collision with root package name */
        private List f23323f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f23324g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23325h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23326i;

        public b(Context context) {
            if (context != null) {
                this.f23318a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s a() {
            Context context = this.f23318a;
            if (this.f23319b == null) {
                this.f23319b = new r(context);
            }
            if (this.f23321d == null) {
                this.f23321d = new l(context);
            }
            if (this.f23320c == null) {
                this.f23320c = new u();
            }
            if (this.f23322e == null) {
                this.f23322e = g.f23340a;
            }
            z zVar = new z(this.f23321d);
            return new s(context, new com.squareup.picasso.g(context, this.f23320c, s.f23302o, this.f23319b, this.f23321d, zVar), this.f23321d, null, this.f23322e, this.f23323f, zVar, this.f23324g, this.f23325h, this.f23326i);
        }
    }

    /* loaded from: classes4.dex */
    private static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f23327a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f23328b;

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f23329a;

            a(Exception exc) {
                this.f23329a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f23329a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f23327a = referenceQueue;
            this.f23328b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC2403a.C0440a c0440a = (AbstractC2403a.C0440a) this.f23327a.remove(1000L);
                    Message obtainMessage = this.f23328b.obtainMessage();
                    if (c0440a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0440a.f23205a;
                        this.f23328b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.f23328b.post(new a(e8));
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    /* loaded from: classes4.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);


        /* renamed from: a, reason: collision with root package name */
        final int f23335a;

        e(int i8) {
            this.f23335a = i8;
        }
    }

    /* loaded from: classes4.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes4.dex */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f23340a = new a();

        /* loaded from: classes4.dex */
        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.s.g
            public v a(v vVar) {
                return vVar;
            }
        }

        v a(v vVar);
    }

    s(Context context, com.squareup.picasso.g gVar, InterfaceC2773a interfaceC2773a, d dVar, g gVar2, List list, z zVar, Bitmap.Config config, boolean z8, boolean z9) {
        int i8;
        this.f23307d = context;
        this.f23308e = gVar;
        this.f23309f = interfaceC2773a;
        this.f23304a = gVar2;
        this.f23314k = config;
        if (list != null) {
            i8 = list.size();
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList(i8 + 7);
        arrayList.add(new y(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new n(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new C2404b(context));
        arrayList.add(new i(context));
        arrayList.add(new q(gVar.f23247d, zVar));
        this.f23306c = DesugarCollections.unmodifiableList(arrayList);
        this.f23310g = zVar;
        this.f23311h = new WeakHashMap();
        this.f23312i = new WeakHashMap();
        this.f23315l = z8;
        this.f23316m = z9;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f23313j = referenceQueue;
        c cVar = new c(referenceQueue, f23302o);
        this.f23305b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, AbstractC2403a abstractC2403a, Exception exc) {
        if (abstractC2403a.l()) {
            return;
        }
        if (!abstractC2403a.m()) {
            this.f23311h.remove(abstractC2403a.k());
        }
        if (bitmap != null) {
            if (eVar != null) {
                abstractC2403a.b(bitmap, eVar);
                if (this.f23316m) {
                    C.u("Main", "completed", abstractC2403a.f23194b.d(), "from " + eVar);
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC2403a.c(exc);
        if (this.f23316m) {
            C.u("Main", "errored", abstractC2403a.f23194b.d(), exc.getMessage());
        }
    }

    public static s h() {
        if (f23303p == null) {
            synchronized (s.class) {
                try {
                    if (f23303p == null) {
                        Context context = PicassoProvider.f23192a;
                        if (context != null) {
                            f23303p = new b(context).a();
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } finally {
                }
            }
        }
        return f23303p;
    }

    void a(Object obj) {
        C.c();
        AbstractC2403a abstractC2403a = (AbstractC2403a) this.f23311h.remove(obj);
        if (abstractC2403a != null) {
            abstractC2403a.a();
            this.f23308e.c(abstractC2403a);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) this.f23312i.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void c(A a8) {
        if (a8 != null) {
            a(a8);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    void d(RunnableC2405c runnableC2405c) {
        boolean z8;
        AbstractC2403a h8 = runnableC2405c.h();
        List i8 = runnableC2405c.i();
        if (i8 != null && !i8.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (h8 == null && !z8) {
            return;
        }
        Uri uri = runnableC2405c.j().f23354d;
        Exception k8 = runnableC2405c.k();
        Bitmap s8 = runnableC2405c.s();
        e o8 = runnableC2405c.o();
        if (h8 != null) {
            f(s8, o8, h8, k8);
        }
        if (z8) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                f(s8, o8, (AbstractC2403a) i8.get(i9), k8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ImageView imageView, com.squareup.picasso.f fVar) {
        if (this.f23312i.containsKey(imageView)) {
            a(imageView);
        }
        this.f23312i.put(imageView, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(AbstractC2403a abstractC2403a) {
        Object k8 = abstractC2403a.k();
        if (k8 != null && this.f23311h.get(k8) != abstractC2403a) {
            a(k8);
            this.f23311h.put(k8, abstractC2403a);
        }
        o(abstractC2403a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f23306c;
    }

    public w j(int i8) {
        if (i8 != 0) {
            return new w(this, null, i8);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public w k(Uri uri) {
        return new w(this, uri, 0);
    }

    public w l(String str) {
        if (str == null) {
            return new w(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap m(String str) {
        Bitmap bitmap = this.f23309f.get(str);
        if (bitmap != null) {
            this.f23310g.d();
        } else {
            this.f23310g.e();
        }
        return bitmap;
    }

    void n(AbstractC2403a abstractC2403a) {
        Bitmap bitmap;
        if (o.a(abstractC2403a.f23197e)) {
            bitmap = m(abstractC2403a.d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            e eVar = e.MEMORY;
            f(bitmap, eVar, abstractC2403a, null);
            if (this.f23316m) {
                C.u("Main", "completed", abstractC2403a.f23194b.d(), "from " + eVar);
                return;
            }
            return;
        }
        g(abstractC2403a);
        if (this.f23316m) {
            C.t("Main", "resumed", abstractC2403a.f23194b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AbstractC2403a abstractC2403a) {
        this.f23308e.h(abstractC2403a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v p(v vVar) {
        v a8 = this.f23304a.a(vVar);
        if (a8 != null) {
            return a8;
        }
        throw new IllegalStateException("Request transformer " + this.f23304a.getClass().getCanonicalName() + " returned null for " + vVar);
    }
}
