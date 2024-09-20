package com.mbridge.msdk.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18923a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18924b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18925c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18926d;

    /* renamed from: e, reason: collision with root package name */
    private final k f18927e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f18931i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f18928f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f18929g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f18930h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f18932j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f18933k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f18934l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f18935m = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final r f18938a;

        public b(Looper looper, r rVar) {
            super(looper);
            this.f18938a = rVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f18938a.f18927e.c() + " " + str + this.f18938a.f18929g.addAndGet(0) + " 数据库记录数：" + this.f18938a.f18923a.a());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e8) {
                if (com.mbridge.msdk.e.a.f18736a) {
                    Log.e("TrackManager", this.f18938a.f18927e.c() + " removeMessages failed ", e8);
                }
            }
            if (!this.f18938a.f()) {
                try {
                    sendMessageDelayed(Message.obtain(this, 1), y.a(this.f18938a.f18928f.get(), this.f18938a.f18933k, this.f18938a.f18925c));
                } catch (Exception e9) {
                    if (com.mbridge.msdk.e.a.f18736a) {
                        Log.e("TrackManager", this.f18938a.f18927e.c() + " sendMessageDelayed failed ", e9);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            e eVar;
            super.dispatchMessage(message);
            int i8 = message.what;
            if (i8 != 2 && i8 != 3) {
                if (i8 != 5) {
                    if (i8 != 6) {
                        if (i8 != 7) {
                            b();
                            if (com.mbridge.msdk.e.a.f18736a) {
                                a("触发上报（timer）当前 Event 数量：");
                            }
                            a();
                            return;
                        }
                        this.f18938a.c();
                        b();
                        if (com.mbridge.msdk.e.a.f18736a) {
                            a("触发上报（flush）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    Object obj = message.obj;
                    if (obj instanceof e) {
                        eVar = (e) obj;
                    } else {
                        eVar = null;
                    }
                    if (com.mbridge.msdk.e.a.f18736a && !y.a(eVar)) {
                        a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.a()));
                    }
                    if ((y.b(eVar) && eVar.c() == 1) || this.f18938a.e()) {
                        b();
                        if (com.mbridge.msdk.e.a.f18736a) {
                            a("触发上报（notice check）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.e.a.f18736a) {
                    a("触发删除 当前 Event 数量：");
                }
                r.a(this.f18938a);
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            b();
            if (com.mbridge.msdk.e.a.f18736a) {
                a("触发上报（report result）当前 Event 数量：");
            }
            a();
        }

        private synchronized void a() {
            try {
                r.e(this.f18938a);
            } catch (Exception e8) {
                if (com.mbridge.msdk.e.a.f18736a) {
                    Log.e("TrackManager", this.f18938a.f18927e.c() + " report failed ", e8);
                }
            }
        }
    }

    public r(k kVar) {
        this.f18923a = kVar.g();
        this.f18924b = kVar.l();
        this.f18925c = kVar.m();
        this.f18926d = kVar.n();
        this.f18927e = kVar;
    }

    static /* synthetic */ void i(r rVar) {
        rVar.f18928f.set(0);
    }

    static /* synthetic */ int j(r rVar) {
        return rVar.f18928f.getAndIncrement();
    }

    protected final boolean e() {
        return this.f18929g.addAndGet(0) >= this.f18924b;
    }

    static /* synthetic */ void e(r rVar) {
        List<i> a8 = rVar.f18923a.a(rVar.f18924b);
        if (y.a((List<?>) a8)) {
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.d("TrackManager", rVar.f18927e.c() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        rVar.f18923a.a(a8);
        int size = a8.size();
        rVar.f18929g.addAndGet(-size);
        boolean z8 = false;
        if (com.mbridge.msdk.e.a.f18736a) {
            Log.d("TrackManager", rVar.f18927e.c() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + rVar.f18929g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f18923a.a());
        }
        try {
            z8 = rVar.f18927e.p();
        } catch (IllegalStateException e8) {
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", rVar.f18927e.c() + " report environment check failed ", e8);
            }
        }
        if (!z8) {
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", rVar.f18927e.c() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        n q8 = rVar.f18927e.q();
        q8.a(new a(rVar.f18931i, rVar));
        Map<String, String> hashMap = new HashMap<>();
        try {
            hashMap = rVar.f18927e.j().a(rVar.f18927e.k(), a8, rVar.f18927e.f());
        } catch (Exception e9) {
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", rVar.f18927e.c() + " report decorate request params failed ", e9);
            }
        }
        q8.a(new s(a8), hashMap, y.b(a8));
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f18931i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f18931i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f18925c);
        this.f18932j = false;
    }

    public final void b() {
        this.f18931i.removeMessages(1);
        Handler handler = this.f18931i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public final void c() {
        synchronized (this.f18930h) {
            try {
                if (!this.f18934l) {
                    this.f18934l = true;
                    this.f18923a.c();
                }
                if (!this.f18935m) {
                    this.f18935m = true;
                    this.f18929g.addAndGet(this.f18923a.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f18929g.incrementAndGet();
    }

    final boolean f() {
        return this.f18932j;
    }

    static /* synthetic */ void b(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!y.a(iVar)) {
                boolean z8 = !iVar.b() && iVar.d() >= rVar.f18926d;
                boolean z9 = !iVar.a() && iVar.g() < System.currentTimeMillis();
                if (!z8 && !z9) {
                    iVar.a(iVar.d() + (y.a(rVar.f18927e.e()) ? 1 : 0));
                    iVar.b(3);
                    i8++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        rVar.f18923a.c((List<i>) list);
        rVar.f18929g.addAndGet(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f18936a;

        /* renamed from: b, reason: collision with root package name */
        private final r f18937b;

        public a(Handler handler, r rVar) {
            this.f18936a = handler;
            this.f18937b = rVar;
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar) {
            r.a(this.f18937b, sVar.a());
            r.i(this.f18937b);
            this.f18937b.f18933k = 0L;
            if (this.f18937b.e()) {
                Handler handler = this.f18936a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.d("TrackManager", this.f18937b.f18927e.c() + " report success " + sVar.a().size() + " 剩余事件数：" + this.f18937b.f18929g.addAndGet(0) + " 个，数据库记录数：" + this.f18937b.f18923a.a() + " 个");
            }
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar, int i8, String str) {
            r.b(this.f18937b, sVar.a());
            this.f18937b.f18933k = System.currentTimeMillis();
            int j8 = r.j(this.f18937b);
            if (j8 <= 10) {
                Handler handler = this.f18936a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), j8 * 1000);
            }
            if (com.mbridge.msdk.e.a.f18736a) {
                Log.d("TrackManager", this.f18937b.f18927e.c() + " report failed " + sVar.a().size() + " 剩余事件数：" + this.f18937b.f18929g.addAndGet(0) + " 个，数据库记录数：" + this.f18937b.f18923a.a() + " 个 连续失败次数： " + j8);
            }
        }
    }

    public final void a(e eVar) {
        Handler handler = this.f18931i;
        handler.sendMessage(Message.obtain(handler, 6, eVar));
    }

    static /* synthetic */ void a(r rVar) {
        if (com.mbridge.msdk.e.a.f18736a && com.mbridge.msdk.f.e.f18983b) {
            return;
        }
        int b8 = rVar.f18923a.b();
        if (com.mbridge.msdk.e.a.f18736a) {
            Log.d("TrackManager", rVar.f18927e.c() + " 删除无效数据的数量 = " + b8 + " 当前剩余事件数 = " + rVar.f18929g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f18923a.a());
        }
    }

    static /* synthetic */ void a(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        rVar.f18923a.b((List<i>) list);
    }
}
