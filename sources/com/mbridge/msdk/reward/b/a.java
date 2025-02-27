package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.i;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static String f21534b = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f21535d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f21536e = "";

    /* renamed from: A, reason: collision with root package name */
    private int f21538A;

    /* renamed from: B, reason: collision with root package name */
    private int f21539B;

    /* renamed from: C, reason: collision with root package name */
    private int f21540C;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21545H;

    /* renamed from: P, reason: collision with root package name */
    private Queue<Integer> f21551P;

    /* renamed from: Q, reason: collision with root package name */
    private String f21552Q;

    /* renamed from: Z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f21561Z;

    /* renamed from: a, reason: collision with root package name */
    b f21562a;
    private List<CampaignEx> aa;

    /* renamed from: l, reason: collision with root package name */
    private Context f21569l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f21570m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f21571n;

    /* renamed from: o, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f21572o;

    /* renamed from: p, reason: collision with root package name */
    private volatile InterVideoOutListener f21573p;

    /* renamed from: q, reason: collision with root package name */
    private volatile c f21574q;

    /* renamed from: r, reason: collision with root package name */
    private String f21575r;

    /* renamed from: s, reason: collision with root package name */
    private String f21576s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeIds f21577t;

    /* renamed from: u, reason: collision with root package name */
    private String f21578u;

    /* renamed from: v, reason: collision with root package name */
    private volatile String f21579v;

    /* renamed from: w, reason: collision with root package name */
    private String f21580w;

    /* renamed from: N, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f21532N = new ConcurrentHashMap<>();

    /* renamed from: O, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f21533O = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f21537f = new ConcurrentHashMap<>();

    /* renamed from: x, reason: collision with root package name */
    private int f21581x = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f21583z = 2;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21541D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21542E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21543F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21544G = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21546I = false;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<Integer> f21547J = new ArrayList<>(7);

    /* renamed from: K, reason: collision with root package name */
    private boolean f21548K = false;

    /* renamed from: L, reason: collision with root package name */
    private final Object f21549L = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f21563c = false;

    /* renamed from: M, reason: collision with root package name */
    private List<CampaignEx> f21550M = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    private h f21553R = null;

    /* renamed from: S, reason: collision with root package name */
    private volatile boolean f21554S = true;

    /* renamed from: T, reason: collision with root package name */
    private volatile boolean f21555T = false;

    /* renamed from: U, reason: collision with root package name */
    private volatile boolean f21556U = false;

    /* renamed from: V, reason: collision with root package name */
    private volatile boolean f21557V = false;

    /* renamed from: W, reason: collision with root package name */
    private volatile boolean f21558W = false;

    /* renamed from: X, reason: collision with root package name */
    private volatile boolean f21559X = false;

    /* renamed from: Y, reason: collision with root package name */
    private volatile boolean f21560Y = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f21564g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f21565h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f21566i = false;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f21567j = false;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f21568k = false;

    /* renamed from: y, reason: collision with root package name */
    private Handler f21582y = new com.mbridge.msdk.reward.b.b(this);

    /* renamed from: com.mbridge.msdk.reward.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0427a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f21624b;

        /* renamed from: c, reason: collision with root package name */
        private final int f21625c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f21626d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f21627e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f21628f;

        /* renamed from: g, reason: collision with root package name */
        private String f21629g;

        /* renamed from: h, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f21630h;

        public RunnableC0427a(com.mbridge.msdk.reward.adapter.c cVar, int i8, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f21624b = cVar;
            this.f21625c = i8;
            this.f21626d = z8;
            if (cVar != null) {
                cVar.e(false);
            }
            this.f21629g = str;
            this.f21630h = bVar;
        }

        public final void a() {
            this.f21627e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f21627e) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f21624b;
            if (cVar != null) {
                cVar.e(true);
            }
            ad.b("RewardVideoController", "adSource=" + this.f21625c + " CommonCancelTimeTask mIsDevCall：" + this.f21626d);
            a.this.a(com.mbridge.msdk.foundation.c.a.b(880023, "v3 is timeout"), this.f21630h);
        }

        public final void a(int i8) {
            this.f21628f = i8;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f21632b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21633c;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0427a f21634d;

        public b(com.mbridge.msdk.reward.adapter.c cVar, boolean z8) {
            this.f21632b = cVar;
            this.f21633c = z8;
        }

        public final void a(RunnableC0427a runnableC0427a) {
            this.f21634d = runnableC0427a;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0427a runnableC0427a = this.f21634d;
            if (runnableC0427a != null) {
                runnableC0427a.a();
                a.this.f21582y.removeCallbacks(this.f21634d);
            }
            if (a.this.f21574q != null) {
                c.b(a.this.f21574q, a.this.f21579v, a.this.f21576s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0427a runnableC0427a = this.f21634d;
            if (runnableC0427a != null) {
                runnableC0427a.a();
                a.this.f21582y.removeCallbacks(this.f21634d);
            }
            a.this.a(list);
            if (a.this.f21574q != null) {
                a.this.f21574q.a(a.this.f21579v, a.this.f21576s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            RunnableC0427a runnableC0427a = this.f21634d;
            if (runnableC0427a != null) {
                runnableC0427a.a();
                a.this.f21582y.removeCallbacks(this.f21634d);
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f21632b;
            if (cVar != null) {
                cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f21632b = null;
            }
            a.this.a(list);
            if (a.this.f21574q != null) {
                a.this.f21574q.a(bVar, bVar2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f21636b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f21637c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f21638d;

        /* renamed from: e, reason: collision with root package name */
        private String f21639e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f21640f;

        public final void a(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f21638d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f21637c.get() == 2 || this.f21638d == null) {
                return;
            }
            this.f21637c.set(2);
            if (a.this.f21557V) {
                return;
            }
            a.this.f21557V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.b(a.this.f21550M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f21638d.sendMessage(obtain);
            }
        }

        private c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f21636b = new WeakReference<>(interVideoOutListener);
            this.f21637c = new AtomicInteger(0);
            this.f21638d = handler;
            this.f21639e = str;
        }

        public final void b(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f21638d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f21637c.get() == 2 || this.f21638d == null) {
                return;
            }
            if (this.f21637c.get() == 1) {
                this.f21637c.set(3);
            }
            if (a.this.f21557V) {
                return;
            }
            a.this.f21557V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.a(true);
            bVar.b(a.this.f21550M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f21638d.sendMessage(obtain);
            }
            if (a.this.f21558W) {
                this.f21637c.set(2);
            }
        }

        public final void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            if (bVar != null && bVar2 != null) {
                str = bVar.b();
                bVar2.a(bVar);
            } else {
                str = "";
            }
            if (a.this.f21570m != null) {
                a.this.f21570m.a(a.this.f21562a);
                CopyOnWriteArrayList<CampaignEx> e8 = a.this.f21570m.e();
                CampaignEx campaignEx = (a.this.f21550M == null || a.this.f21550M.size() == 0) ? null : (CampaignEx) a.this.f21550M.get(0);
                if (campaignEx == null) {
                    campaignEx = (e8 == null || e8.size() == 0) ? null : e8.get(0);
                }
                CampaignEx campaignEx2 = campaignEx;
                if (a.this.f21542E && ((campaignEx2 == null || TextUtils.isEmpty(campaignEx2.getNLRid())) && ((e8 == null || e8.size() == 0) && a.this.f21570m.a(campaignEx2, true, bVar, 2, bVar2)))) {
                    return;
                } else {
                    a.this.f21570m.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.f21638d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f21637c.get() == 2 || this.f21638d == null) {
                return;
            }
            a.this.f21558W = true;
            if (!a.this.f21560Y || str.contains("resource load timeout")) {
                a.this.f21559X = true;
            }
            if (a.this.f21557V) {
                this.f21637c.set(2);
            }
            if (a.this.f21558W && a.this.f21559X && !a.this.f21557V) {
                this.f21637c.set(2);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    this.f21638d.sendMessage(obtain);
                }
            }
        }

        static /* synthetic */ void b(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((cVar.f21637c.get() != 1 && cVar.f21637c.get() != 3) || cVar.f21638d == null || a.this.f21556U) {
                return;
            }
            a.this.f21556U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f21638d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.a(str, str2, bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f21636b;
            a.a(a.this, "2000047", bVar, weakReference != null ? weakReference.get() : null);
            if (this.f21638d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                if (bVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVar.f());
                    obtain.setData(bundle);
                }
                this.f21638d.sendMessage(obtain);
            }
        }

        public final void a(boolean z8) {
            this.f21640f = z8;
        }

        static /* synthetic */ int a(c cVar) {
            return cVar.f21637c.get();
        }

        static /* synthetic */ void a(c cVar, int i8) {
            cVar.f21637c.set(i8);
        }

        static /* synthetic */ void a(c cVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            cVar.f21637c.set(2);
            cVar.a(str, bVar);
        }

        static /* synthetic */ void a(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f21638d == null || a.this.f21556U) {
                return;
            }
            a.this.f21556U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f21638d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.b(str, str2, bVar);
                }
            }
        }

        static /* synthetic */ void a(c cVar, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            WeakReference<InterVideoOutListener> weakReference = cVar.f21636b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f21637c.get() == 2 || cVar.f21638d == null) {
                return;
            }
            a.this.f21559X = true;
            if (bVar != null) {
                str = bVar.b();
            } else {
                str = "";
            }
            if (str.contains("resource load timeout")) {
                a.this.f21558W = true;
            }
            if (a.this.f21559X && a.this.f21558W && !a.this.f21557V) {
                cVar.f21637c.set(2);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    cVar.f21638d.sendMessage(obtain);
                }
                if (bVar2 == null) {
                    bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                bVar2.a(true);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d extends com.mbridge.msdk.video.bt.module.b.b {

        /* renamed from: d, reason: collision with root package name */
        private a f21642d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f21643e;

        /* renamed from: f, reason: collision with root package name */
        private int f21644f;

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                a aVar = this.f21642d;
                if (aVar != null && aVar.f21573p != null) {
                    try {
                        this.f21642d.f21573p.onEndcardShow(a.this.f21577t);
                        com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e8.getMessage());
                        }
                    }
                    this.f21644f = 6;
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f21644f = 0;
            this.f21642d = aVar;
            this.f21643e = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            a.this.f21563c = false;
            try {
                com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(a.this.f21576s, a.this.f21541D);
                a aVar2 = this.f21642d;
                aVar.a(bVar.f(), (aVar2 == null || aVar2.f21570m == null) ? "" : this.f21642d.f21570m.f21450c, 3, a.f21534b);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
            try {
                a aVar3 = this.f21642d;
                if (aVar3 != null) {
                    aVar3.f21548K = true;
                    if (this.f21642d.f21570m != null) {
                        this.f21642d.f21570m.f21450c = "";
                    }
                    final a aVar4 = this.f21642d;
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.f21553R == null) {
                                    a.this.f21553R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
                                }
                                i a8 = i.a(a.this.f21553R);
                                if (a8 != null) {
                                    a8.a(a.this.f21576s);
                                }
                            } catch (Throwable unused) {
                                ad.b("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                        }
                    });
                    if (a.this.f21542E) {
                        a.this.c();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", bVar, aVar5.f21573p, "");
                    this.f21957b = true;
                    if (this.f21642d.f21573p != null) {
                        this.f21642d.f21573p.onAdShow(a.this.f21577t);
                        this.f21644f = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                a aVar = this.f21642d;
                if (aVar != null && aVar.f21573p != null) {
                    if (cVar == null) {
                        cVar = com.mbridge.msdk.videocommon.b.c.b(this.f21642d.f21580w);
                    }
                    if (a.this.f21542E) {
                        a.this.c();
                        a.this.b();
                        com.mbridge.msdk.foundation.same.a.d.d(a.this.f21576s, a.this.a());
                    }
                    this.f21642d.f21573p.onAdClose(a.this.f21577t, new RewardInfo(z8, cVar.a(), String.valueOf(cVar.b())));
                    this.f21644f = 7;
                    this.f21642d.f21548K = false;
                    a.this.f21547J.clear();
                    this.f21642d = null;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                a aVar = a.this;
                aVar.f21563c = false;
                if (this.f21642d != null) {
                    if (aVar.f21542E) {
                        a.this.c();
                    }
                    this.f21642d.f21548K = false;
                    a.this.a("2000131", bVar, this.f21642d.f21573p, str);
                    this.f21958c = true;
                    if (this.f21642d.f21573p != null) {
                        try {
                            this.f21642d.f21573p.onShowFail(bVar, a.this.f21577t, str);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e8.getMessage());
                            }
                        }
                        this.f21644f = 4;
                    }
                }
            } catch (Exception e9) {
                this.f21644f = 0;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, String str, String str2) {
            try {
                a aVar = this.f21642d;
                if (aVar == null || aVar.f21573p == null) {
                    return;
                }
                if (a.this.f21542E) {
                    a.this.c();
                }
                this.f21642d.f21548K = false;
                try {
                    this.f21642d.f21573p.onVideoAdClicked(z8, a.this.f21577t);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                a aVar = this.f21642d;
                if (aVar == null || aVar.f21573p == null) {
                    return;
                }
                try {
                    this.f21642d.f21573p.onVideoComplete(a.this.f21577t);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
                this.f21644f = 5;
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, int i8) {
            try {
                a aVar = this.f21642d;
                if (aVar != null && aVar.f21573p != null) {
                    try {
                        this.f21642d.f21573p.onAdCloseWithIVReward(a.this.f21577t, new RewardInfo(z8, i8));
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e8.getMessage());
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i8, String str, String str2) {
            this.f21644f = i8;
            a aVar = this.f21642d;
            if (aVar == null || aVar.f21542E || this.f21642d.f21541D || this.f21642d.f21571n == null || !this.f21642d.f21571n.s(this.f21644f) || this.f21642d.f21574q == null || c.a(this.f21642d.f21574q) == 1 || c.a(this.f21642d.f21574q) == 3 || a.this.f21547J.contains(Integer.valueOf(this.f21644f))) {
                return;
            }
            a.this.f21547J.add(Integer.valueOf(this.f21644f));
            int A8 = this.f21642d.f21571n.A() * 1000;
            if (this.f21644f == 4) {
                A8 = PathInterpolatorCompat.MAX_NUM_POINTS;
            }
            Handler handler = this.f21643e;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f21643e.sendEmptyMessageDelayed(1001001, A8);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9;
                        if (d.this.f21642d != null) {
                            com.mbridge.msdk.foundation.same.report.d.c a8 = com.mbridge.msdk.foundation.same.report.d.c.a();
                            if (a.this.f21541D) {
                                i9 = 287;
                            } else {
                                i9 = 94;
                            }
                            d.this.f21642d.a(false, a8.a(0, i9, a.this.f21576s, true, 1));
                        }
                    }
                }, A8);
            }
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            j a8 = j.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            f fVar = new f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a8.a(fVar);
        }
    }

    private void p() {
        com.mbridge.msdk.foundation.db.f.a(h.a(this.f21569l)).a(this.f21576s);
    }

    private void q() {
        try {
            List<CampaignEx> b8 = com.mbridge.msdk.foundation.db.f.a(h.a(this.f21569l)).b(this.f21576s);
            if (b8 == null || b8.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : b8) {
                if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(this.f21576s + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.b(this.f21576s + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                } else {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e8.getMessage());
            }
        }
    }

    private void r() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f21569l, this.f21579v, this.f21576s);
        this.f21570m = cVar;
        cVar.b(this.f21541D);
        this.f21570m.c(this.f21542E);
        if (this.f21541D) {
            this.f21570m.a(this.f21538A, this.f21539B, this.f21540C);
        }
        this.f21570m.a(this.f21571n);
    }

    private boolean s() {
        try {
            if (this.f21553R == null) {
                this.f21553R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            i a8 = i.a(this.f21553R);
            if (this.f21571n == null) {
                this.f21571n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21576s, this.f21541D);
            }
            int d8 = this.f21571n.d();
            if (a8 != null) {
                return a8.a(this.f21576s, d8);
            }
            return false;
        } catch (Throwable unused) {
            ad.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public final List<CampaignEx> f() {
        return this.aa;
    }

    public final com.mbridge.msdk.reward.adapter.c g() {
        return this.f21570m;
    }

    public final boolean h() {
        return this.f21545H;
    }

    public final String i() {
        return this.f21576s;
    }

    public final String j() {
        return this.f21579v;
    }

    public final c k() {
        return this.f21574q;
    }

    public final InterVideoOutListener l() {
        return this.f21573p;
    }

    public final boolean m() {
        return this.f21542E;
    }

    public final MBridgeIds n() {
        return this.f21577t;
    }

    public final boolean o() {
        return this.f21541D;
    }

    private boolean e(boolean z8) {
        if (z8) {
            d("is_ready_start", "");
        }
        if (this.f21570m == null) {
            r();
        }
        List<com.mbridge.msdk.foundation.entity.c> a8 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21576s);
        if (a8 == null || a8.size() <= 0) {
            if (!z8) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String b8 = com.mbridge.msdk.foundation.same.a.d.b(this.f21576s);
        boolean a9 = TextUtils.isEmpty(b8) ? false : a(a8, b8);
        if (z8) {
            d("is_ready_ctir_" + a9, "");
        }
        if (a9) {
            return a9;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : a8) {
            if (cVar != null) {
                this.f21570m.a(cVar.a());
                this.f21570m.f21451d = cVar.d();
                if (this.f21570m.d(z8)) {
                    return true;
                }
            }
        }
        return a9;
    }

    public final void b(boolean z8) {
        this.f21542E = z8;
    }

    public final void c(boolean z8) {
        this.f21546I = z8;
    }

    public final boolean d(boolean z8) {
        try {
            if (s()) {
                if (!z8) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                return false;
            }
            if (this.f21542E) {
                try {
                    return e(z8);
                } catch (Exception e8) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    ad.b("RewardVideoController", e8.getMessage());
                    return false;
                }
            }
            if (this.f21570m == null) {
                r();
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f21570m;
            if (cVar != null) {
                return cVar.b();
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b("RewardVideoController", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.b.a$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f21610a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f21611b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f21612c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f21613d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f21614e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21615f;

        AnonymousClass4(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z8, int i8) {
            this.f21611b = campaignEx;
            this.f21612c = copyOnWriteArrayList;
            this.f21613d = cVar;
            this.f21614e = z8;
            this.f21615f = i8;
            this.f21610a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            a.this.f21565h = true;
            if (!a.this.f21564g || a.this.f21566i || a.this.f21582y == null) {
                return;
            }
            a.this.f21566i = true;
            a.this.f21582y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b a8 = com.mbridge.msdk.reward.adapter.b.a();
                    boolean z8 = a.this.f21546I;
                    Handler handler = a.this.f21582y;
                    boolean z9 = a.this.f21541D;
                    boolean z10 = a.this.f21542E;
                    String str5 = str3;
                    String requestIdNotice = AnonymousClass4.this.f21611b.getRequestIdNotice();
                    String str6 = str;
                    String str7 = str2;
                    String cMPTEntryUrl = AnonymousClass4.this.f21611b.getCMPTEntryUrl();
                    int i8 = a.this.f21583z;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    a8.a(z8, handler, z9, z10, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i8, anonymousClass4.f21611b, anonymousClass4.f21612c, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass4.this.f21611b.getCMPTEntryUrl()), str2, a.this.f21571n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.4.1.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, String str11, String str12, a.C0439a c0439a) {
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            com.mbridge.msdk.reward.adapter.c cVar = anonymousClass42.f21613d;
                            if (cVar != null && cVar.a(anonymousClass42.f21612c, anonymousClass42.f21614e, anonymousClass42.f21615f)) {
                                if (a.this.f21574q == null || a.this.f21568k) {
                                    return;
                                }
                                a.this.f21568k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccess");
                                AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                                a.this.a(anonymousClass43.f21612c);
                                AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass44.f21610a;
                                if (bVar != null) {
                                    bVar.b(anonymousClass44.f21612c);
                                }
                                a.this.f21574q.b(str9, str10, AnonymousClass4.this.f21610a);
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, str10, aVar.aa);
                            if (a.this.f21574q == null || a.this.f21567j) {
                                return;
                            }
                            a.this.f21567j = true;
                            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass4 anonymousClass45 = AnonymousClass4.this;
                            if (anonymousClass45.f21610a == null) {
                                anonymousClass45.f21610a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass46 = AnonymousClass4.this;
                            anonymousClass46.f21610a.b(anonymousClass46.f21612c);
                            AnonymousClass4.this.f21610a.a(b8);
                            c.a(a.this.f21574q, b8, AnonymousClass4.this.f21610a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f21574q == null || a.this.f21567j) {
                                return;
                            }
                            a.this.f21567j = true;
                            if (bVar != null) {
                                bVar.a("errorCode: 3303 errorMessage: tpl temp preload failed");
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            if (anonymousClass42.f21610a == null) {
                                anonymousClass42.f21610a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                            anonymousClass43.f21610a.b(anonymousClass43.f21612c);
                            AnonymousClass4.this.f21610a.a(bVar);
                            c.a(a.this.f21574q, bVar, AnonymousClass4.this.f21610a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            String str3;
            if (bVar != null) {
                str3 = bVar.d().getUnitId();
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                str3 = "";
            }
            a aVar = a.this;
            a.a(aVar, str3, aVar.aa);
            if (this.f21610a == null) {
                this.f21610a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f21610a.a(bVar);
            this.f21610a.b(this.f21612c);
            a.this.f21565h = false;
            if (a.this.f21574q == null || a.this.f21567j) {
                return;
            }
            a.this.f21567j = true;
            c.a(a.this.f21574q, bVar, this.f21610a);
        }
    }

    public final void b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f21548K || (concurrentHashMap = f21533O) == null || concurrentHashMap.containsKey(a())) {
            return;
        }
        f21533O.remove(a());
    }

    public final void c() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f21577t;
            if (mBridgeIds != null) {
                if (!this.f21548K) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String a8 = a();
                if (TextUtils.isEmpty(a8)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f21533O;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(a8) && !TextUtils.isEmpty(f21533O.get(a8))) {
                    str = f21533O.get(a8);
                }
                this.f21577t.setBidToken(str);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(boolean z8) {
        this.f21541D = z8;
        if (z8) {
            this.f21583z = com.mbridge.msdk.foundation.same.a.f19399W;
        } else {
            this.f21583z = com.mbridge.msdk.foundation.same.a.f19398V;
        }
    }

    public final void b(String str, String str2) {
        try {
            this.f21569l = com.mbridge.msdk.foundation.controller.c.m().c();
            this.f21576s = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f21579v = str;
            this.f21577t = new MBridgeIds(this.f21579v, this.f21576s);
            this.f21572o = com.mbridge.msdk.videocommon.d.b.a().b();
            com.mbridge.msdk.foundation.same.f.b.b().execute(new com.mbridge.msdk.reward.b.c(this.f21569l, this.f21576s));
            if (this.f21553R == null) {
                this.f21553R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        } catch (Throwable th) {
            ad.a("RewardVideoController", th.getMessage(), th);
        }
    }

    public final void a(int i8) {
        this.f21583z = i8;
    }

    public final String a() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f21570m;
        if (cVar != null) {
            return cVar.a(this.f21548K);
        }
        return "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            al.b(this.f21569l, "MBridge_ConfirmTitle" + this.f21576s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            al.b(this.f21569l, "MBridge_ConfirmContent" + this.f21576s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(this.f21569l, "MBridge_CancelText" + this.f21576s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        al.b(this.f21569l, "MBridge_ConfirmText" + this.f21576s, str3.trim());
    }

    private com.mbridge.msdk.foundation.same.report.d.b b(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        List<String> e8;
        String a8;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        try {
            if (z8) {
                try {
                    com.mbridge.msdk.foundation.db.f a9 = com.mbridge.msdk.foundation.db.f.a(h.a(this.f21569l));
                    if (a9 != null && (e8 = a9.e(this.f21576s)) != null && e8.size() > 0) {
                        Iterator<String> it = e8.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                        }
                    }
                    LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.d.b> b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b();
                    if (b8 != null && b8.size() > 0) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b>> it2 = b8.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b> next = it2.next();
                            if (next != null && next.getValue().s()) {
                                it2.remove();
                            }
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                a8 = SameMD5.getMD5(ai.d());
            } else {
                a8 = a(str);
            }
            bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(a8);
            if (bVar == null) {
                com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                try {
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(a8, bVar2);
                    bVar2.d(true);
                    bVar = bVar2;
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                    return bVar;
                }
            }
            bVar.c(a8);
            bVar.d(this.f21576s);
            String str2 = "1";
            if (dVar != null) {
                if (dVar.a("adtp")) {
                    bVar.b(Integer.parseInt((String) dVar.b("adtp")));
                }
                if (dVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) dVar.b(CampaignEx.JSON_KEY_HB);
                    bVar.i(str3);
                    if (str3.equals("1")) {
                        bVar.e(str);
                    }
                }
            }
            if (z8) {
                str2 = "2";
            }
            bVar.b(str2);
            if (z8) {
                com.mbridge.msdk.reward.c.a.a.a().a("2000123", bVar);
            }
        } catch (Exception e11) {
            e = e11;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r4.f21570m     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> Lf
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> Lf
            if (r0 != 0) goto L28
            goto L11
        Lf:
            r0 = move-exception
            goto L37
        L11:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> Lf
            android.content.Context r1 = r4.f21569l     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = r4.f21579v     // Catch: java.lang.Exception -> Lf
            r0.<init>(r1, r2, r5)     // Catch: java.lang.Exception -> Lf
            r4.f21570m = r0     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f21541D     // Catch: java.lang.Exception -> Lf
            r0.b(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.f21570m     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f21542E     // Catch: java.lang.Exception -> Lf
            r0.c(r1)     // Catch: java.lang.Exception -> Lf
        L28:
            com.mbridge.msdk.reward.adapter.c r0 = r4.f21570m     // Catch: java.lang.Exception -> Lf
            int r1 = r4.f21583z     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.f21570m     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.videocommon.d.c r1 = r4.f21571n     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            goto L44
        L37:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L44
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L44:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r1 = r4.f21542E
            r2 = 1
            java.util.List r0 = r0.a(r5, r2, r1)
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r3 = r4.f21542E
            java.util.List r1 = r1.b(r5, r2, r3)
            r4.aa = r1
            if (r0 == 0) goto L98
            int r1 = r0.size()
            if (r1 <= 0) goto L98
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            r1.a(r5, r0, r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f21561Z
            if (r5 != 0) goto L76
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>()
            r4.f21561Z = r5
            goto L79
        L76:
            r5.clear()
        L79:
            java.util.Iterator r5 = r0.iterator()
        L7d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r5.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r0.setLocalRequestId(r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f21561Z
            r1.add(r0)
            goto L7d
        L92:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f21561Z
            r4.a(r5)
            return r2
        L98:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f21561Z
            if (r5 == 0) goto L9f
            r5.clear()
        L9f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.c(java.lang.String, java.lang.String):boolean");
    }

    public final String d() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f21570m;
        if (cVar != null) {
            return cVar.f();
        }
        return "";
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.d(this.f21576s);
            bVar.b(this.f21541D ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("event_name", str);
            dVar.a("reason", str2);
            bVar.a("m_temp_is_ready_check", dVar);
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.f21561Z;
    }

    public final void a(int i8, int i9, int i10) {
        this.f21538A = i8;
        this.f21539B = i9;
        if (i9 == com.mbridge.msdk.foundation.same.a.f19386J) {
            this.f21540C = i10 < 0 ? 5 : i10;
        }
        if (i9 == com.mbridge.msdk.foundation.same.a.f19385I) {
            this.f21540C = i10 < 0 ? 80 : i10;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i8 == com.mbridge.msdk.foundation.same.a.f19383G ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i9 == com.mbridge.msdk.foundation.same.a.f19385I ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i10);
            com.mbridge.msdk.c.h.a().f(this.f21576s, jSONObject.toString());
        } catch (Exception unused) {
            ad.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.b.a$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f21585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f21586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21587c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f21588d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21589e;

        AnonymousClass2(CampaignEx campaignEx, boolean z8, com.mbridge.msdk.reward.adapter.c cVar, int i8) {
            this.f21586b = campaignEx;
            this.f21587c = z8;
            this.f21588d = cVar;
            this.f21589e = i8;
            this.f21585a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.f21564g = true;
            if (!this.f21587c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && a.this.f21582y != null) {
                        a.this.f21582y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b.a().a(a.this.f21546I, a.this.f21582y, a.this.f21541D, a.this.f21542E, null, next.getRewardTemplateMode().e(), a.this.f21583z, AnonymousClass2.this.f21586b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), a.this.f21571n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0439a c0439a) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        com.mbridge.msdk.reward.adapter.c cVar = anonymousClass2.f21588d;
                                        if (cVar != null && cVar.a(copyOnWriteArrayList, anonymousClass2.f21587c, anonymousClass2.f21589e)) {
                                            if (a.this.f21574q == null || a.this.f21568k) {
                                                return;
                                            }
                                            a.this.f21568k = true;
                                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                            a.this.a(copyOnWriteArrayList);
                                            a.this.f21574q.b(str5, str6, AnonymousClass2.this.f21585a);
                                            return;
                                        }
                                        a aVar = a.this;
                                        a.a(aVar, str6, aVar.aa);
                                        if (a.this.f21574q == null || a.this.f21567j) {
                                            return;
                                        }
                                        a.this.f21567j = true;
                                        com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (anonymousClass22.f21585a == null) {
                                            anonymousClass22.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                        AnonymousClass2.this.f21585a.b(copyOnWriteArrayList);
                                        AnonymousClass2.this.f21585a.a(b8);
                                        c.a(a.this.f21574q, b8, AnonymousClass2.this.f21585a);
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        a aVar = a.this;
                                        a.a(aVar, str2, aVar.aa);
                                        if (a.this.f21574q == null || a.this.f21567j) {
                                            return;
                                        }
                                        a.this.f21567j = true;
                                        bVar.a("errorCode: 3301 errorMessage: temp preload failed");
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        if (anonymousClass2.f21585a == null) {
                                            anonymousClass2.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        anonymousClass22.f21585a.b(a.this.f21561Z);
                                        AnonymousClass2.this.f21585a.a(bVar);
                                        c.a(a.this.f21574q, bVar, AnonymousClass2.this.f21585a);
                                    }
                                });
                            }
                        });
                    } else {
                        com.mbridge.msdk.reward.adapter.c cVar = this.f21588d;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, this.f21587c, this.f21589e)) {
                            if (a.this.f21574q != null && !a.this.f21568k) {
                                a.this.f21568k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                a.this.a(copyOnWriteArrayList);
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f21585a;
                                if (bVar != null) {
                                    bVar.b(copyOnWriteArrayList);
                                }
                                a.this.f21574q.b(str, str2, this.f21585a);
                            }
                        } else {
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f21574q != null && !a.this.f21567j) {
                                a.this.f21567j = true;
                                com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f21585a == null) {
                                    this.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f21585a.b(a.this.f21561Z);
                                this.f21585a.a(b8);
                                c.a(a.this.f21574q, b8, this.f21585a);
                            }
                        }
                    }
                }
                return;
            }
            if (!a.this.f21565h || a.this.f21566i || a.this.f21582y == null) {
                return;
            }
            a.this.f21566i = true;
            a.this.f21582y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.f21546I, a.this.f21582y, a.this.f21541D, a.this.f21542E, str3, AnonymousClass2.this.f21586b.getRequestIdNotice(), str, str2, AnonymousClass2.this.f21586b.getCMPTEntryUrl(), a.this.f21583z, AnonymousClass2.this.f21586b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass2.this.f21586b.getCMPTEntryUrl()), str2, a.this.f21571n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.2.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, String str7, String str8, a.C0439a c0439a) {
                            RunnableC04252 runnableC04252 = RunnableC04252.this;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            com.mbridge.msdk.reward.adapter.c cVar2 = anonymousClass2.f21588d;
                            if (cVar2 != null && cVar2.a(copyOnWriteArrayList, anonymousClass2.f21587c, anonymousClass2.f21589e)) {
                                if (a.this.f21574q == null || a.this.f21568k) {
                                    return;
                                }
                                a.this.f21568k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                RunnableC04252 runnableC042522 = RunnableC04252.this;
                                a.this.a(copyOnWriteArrayList);
                                RunnableC04252 runnableC042523 = RunnableC04252.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar2 = AnonymousClass2.this.f21585a;
                                if (bVar2 != null) {
                                    bVar2.b(copyOnWriteArrayList);
                                }
                                a.this.f21574q.b(str5, str6, AnonymousClass2.this.f21585a);
                                return;
                            }
                            a aVar2 = a.this;
                            a.a(aVar2, str6, aVar2.aa);
                            if (a.this.f21574q == null || a.this.f21567j) {
                                return;
                            }
                            a.this.f21567j = true;
                            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            if (anonymousClass22.f21585a == null) {
                                anonymousClass22.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass2.this.f21585a.a(b9);
                            RunnableC04252 runnableC042524 = RunnableC04252.this;
                            AnonymousClass2.this.f21585a.b(copyOnWriteArrayList);
                            c.a(a.this.f21574q, b9, AnonymousClass2.this.f21585a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar2) {
                            RunnableC04252 runnableC04252 = RunnableC04252.this;
                            a aVar2 = a.this;
                            a.a(aVar2, str2, aVar2.aa);
                            if (a.this.f21574q == null || a.this.f21567j) {
                                return;
                            }
                            a.this.f21567j = true;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3302 errorMessage: tpl preload failed");
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (anonymousClass2.f21585a == null) {
                                anonymousClass2.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            RunnableC04252 runnableC042522 = RunnableC04252.this;
                            AnonymousClass2.this.f21585a.b(copyOnWriteArrayList);
                            AnonymousClass2.this.f21585a.a(bVar2);
                            c.a(a.this.f21574q, bVar2, AnonymousClass2.this.f21585a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar) {
            a.this.f21564g = false;
            a aVar = a.this;
            a.a(aVar, aVar.f21576s, a.this.aa);
            if (a.this.f21574q == null || a.this.f21567j) {
                return;
            }
            a.this.f21567j = true;
            if (this.f21585a == null) {
                this.f21585a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f21585a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.a("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f21585a.a(bVar);
            c.a(a.this.f21574q, bVar, this.f21585a);
        }
    }

    public static void a(String str, int i8) {
        try {
            if (f21532N == null || !an.b(str)) {
                return;
            }
            f21532N.put(str, Integer.valueOf(i8));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e8.getMessage());
            }
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f21533O) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f21533O.put(str, str2);
    }

    public final void a(InterVideoOutListener interVideoOutListener) {
        this.f21573p = interVideoOutListener;
        this.f21574q = new c(interVideoOutListener, this.f21582y, this.f21576s);
    }

    public final void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        a(z8, "", dVar);
    }

    public final void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        com.mbridge.msdk.foundation.same.report.d.b b8 = b(z8, str, dVar);
        if (this.f21574q == null) {
            this.f21574q = new c(null, this.f21582y, this.f21576s);
        }
        if (this.f21574q != null && c.a(this.f21574q) == 1) {
            a(z8, b8);
            return;
        }
        if (this.f21574q != null && c.a(this.f21574q) == 3) {
            this.f21554S = false;
        } else {
            this.f21554S = true;
            if (this.f21574q != null) {
                c.a(this.f21574q, 1);
            }
        }
        this.f21545H = z8;
        this.f21582y.removeMessages(1001001);
        this.f21557V = false;
        this.f21556U = false;
        this.f21558W = false;
        this.f21559X = false;
        q();
        p();
        com.mbridge.msdk.reward.adapter.b.a();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f21541D) {
                    com.mbridge.msdk.d.b.getInstance().addInterstitialList(this.f21579v, this.f21576s);
                } else {
                    com.mbridge.msdk.d.b.getInstance().addRewardList(this.f21579v, this.f21576s);
                }
            }
            if (this.f21542E && TextUtils.isEmpty(str)) {
                b(b8);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                a(b8);
                return;
            }
            com.mbridge.msdk.videocommon.d.c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21576s);
            this.f21571n = a8;
            if (a8 == null) {
                this.f21552Q = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.videocommon.d.b.a().a(this.f21552Q, com.mbridge.msdk.foundation.controller.c.m().b(), this.f21576s, new com.mbridge.msdk.videocommon.c.c() { // from class: com.mbridge.msdk.reward.b.a.1
                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void a(String str2) {
                    }

                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void b(String str2) {
                    }
                });
                this.f21571n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21576s, this.f21541D);
            }
            if (!TextUtils.isEmpty(this.f21579v)) {
                this.f21571n.b(this.f21579v);
            }
            int F8 = this.f21571n.F() * 1000;
            if (this.f21582y != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001002;
                if (b8 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", b8.f());
                    obtain.setData(bundle);
                }
                this.f21582y.sendMessageDelayed(obtain, F8);
            }
            this.f21551P = this.f21571n.B();
            try {
                a(z8, str, b8);
            } catch (Exception e8) {
                if (this.f21574q != null) {
                    com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880020, "load exception");
                    if (b8 != null) {
                        b8.a(b9);
                        b8.c(true);
                    }
                    this.f21574q.a(b9, b8);
                }
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        } catch (Exception e9) {
            if (this.f21574q != null) {
                com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "");
                if (b8 != null) {
                    b8.a(b10);
                    b8.c(true);
                }
                this.f21574q.a(b10, b8);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21574q != null) {
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880035, "");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            c.a(this.f21574q, "bidToken is empty", bVar);
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21574q != null) {
            String a8 = com.mbridge.msdk.foundation.c.a.a(880001, "");
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880001, "");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            c.a(this.f21574q, a8, bVar);
        }
    }

    private void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (!this.f21545H) {
            if (z8) {
                this.f21545H = z8;
            }
        } else if (z8) {
            String a8 = com.mbridge.msdk.foundation.c.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            this.f21574q.a(a8, bVar);
        }
    }

    private void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.reward.a.a aVar;
        com.mbridge.msdk.reward.a.a aVar2;
        if (this.f21574q != null) {
            if (!this.f21542E) {
                this.f21560Y = c(this.f21576s, bVar.f());
                if (this.f21560Y) {
                    if (!s()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f21561Z;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            bVar.a("2000127", dVar);
                            bVar.a("2000048", dVar);
                            bVar.a(copyOnWriteArrayList);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e8.getMessage());
                            }
                        }
                        c.a(this.f21574q, this.f21579v, this.f21576s, bVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f21574q.a(this.f21542E);
                        com.mbridge.msdk.reward.adapter.c cVar = this.f21570m;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f21574q.b(this.f21579v, this.f21576s, bVar);
                        } else {
                            a(copyOnWriteArrayList, this.f21570m);
                        }
                        if (this.f21554S) {
                            com.mbridge.msdk.reward.adapter.c cVar2 = this.f21570m;
                            if (cVar2 != null) {
                                cVar2.a(this.f21561Z);
                            }
                            a(this.f21551P, z8, str, bVar);
                            return;
                        }
                        return;
                    }
                    ad.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f21561Z;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.f21561Z.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.a.a.a().a(it.next(), this.f21576s);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.f21570m;
                    if (cVar3 != null) {
                        cVar3.a(this.f21561Z);
                    }
                    if (z8) {
                        if (this.f21574q != null) {
                            String a8 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                            bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                            bVar.c(true);
                            c.a(this.f21574q, a8, bVar);
                            return;
                        }
                        return;
                    }
                    this.f21560Y = false;
                    this.f21574q.a(this.f21542E);
                    a(this.f21551P, z8, str, bVar);
                    return;
                }
                if (!s()) {
                    this.f21560Y = false;
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.f21570m;
                    if (cVar4 != null) {
                        cVar4.a(this.f21561Z);
                    }
                    this.f21574q.a(this.f21542E);
                    a(this.f21551P, z8, str, bVar);
                    return;
                }
                if (z8) {
                    if (this.f21574q != null) {
                        String a9 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                        bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                        bVar.c(true);
                        c.a(this.f21574q, a9, bVar);
                        return;
                    }
                    return;
                }
                this.f21560Y = false;
                com.mbridge.msdk.reward.adapter.c cVar5 = this.f21570m;
                if (cVar5 != null) {
                    cVar5.a(this.f21561Z);
                }
                this.f21574q.a(this.f21542E);
                a(this.f21551P, z8, str, bVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> a10 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21576s, 1, this.f21542E, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = null;
            if (a10 != null && a10.size() > 0) {
                if (!s()) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
                    if (a10.size() > 0 && !TextUtils.isEmpty(str)) {
                        for (CampaignEx campaignEx2 : a10) {
                            if (campaignEx2 != null && str.equals(campaignEx2.getBidToken())) {
                                copyOnWriteArrayList4.add(campaignEx2);
                            }
                        }
                    }
                    if (copyOnWriteArrayList4.size() > 0) {
                        a(copyOnWriteArrayList4, str, bVar);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.a.a aVar3 = new com.mbridge.msdk.reward.a.a(this.f21576s, this.f21541D);
                        com.mbridge.msdk.foundation.b.c cVar6 = new com.mbridge.msdk.foundation.b.c();
                        if (aVar3.a(str)) {
                            if (this.f21570m == null) {
                                com.mbridge.msdk.reward.adapter.c cVar7 = new com.mbridge.msdk.reward.adapter.c(this.f21569l, this.f21579v, this.f21576s);
                                this.f21570m = cVar7;
                                cVar7.b(this.f21541D);
                                this.f21570m.c(this.f21542E);
                                if (this.f21541D) {
                                    this.f21570m.a(this.f21538A, this.f21539B, this.f21540C);
                                }
                                this.f21570m.a(this.f21583z);
                                this.f21570m.a(this.f21571n);
                            }
                            aVar2 = aVar3;
                            cVar6 = aVar3.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f21570m);
                            if (cVar6 != null && cVar6.g() == com.mbridge.msdk.foundation.b.c.f19011d && cVar6.a() != null && cVar6.a().size() > 0 && this.f21570m != null) {
                                CopyOnWriteArrayList<CampaignEx> a11 = cVar6.a();
                                ArrayList arrayList = new ArrayList();
                                Iterator<CampaignEx> it2 = a10.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next = it2.next();
                                    if (next != null) {
                                        String requestId = next.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i8 = 0; i8 < a11.size(); i8++) {
                                                CampaignEx campaignEx3 = a11.get(i8);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i8 == a11.size() - 1) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                            }
                                            if (a11.size() == 0) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                                this.f21570m.a(arrayList);
                                this.f21570m.a(cVar6.a(), false, true);
                                copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar6.a());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayList3 = a(str, a10);
                            if (copyOnWriteArrayList3.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                            }
                            cVar6.d("cb is closed");
                            cVar6.a(com.mbridge.msdk.foundation.b.c.f19010c);
                        }
                        aVar2.a(bVar, str, cVar6, (List<a.C0395a>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                            a(copyOnWriteArrayList3, str, bVar);
                            if (this.f21570m != null && !aVar2.a(str)) {
                                this.f21570m.a(copyOnWriteArrayList3);
                            }
                        }
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e9.getMessage());
                        }
                    }
                    this.f21560Y = false;
                    this.f21574q.a(this.f21542E);
                    a(this.f21551P, z8, str, bVar);
                    return;
                }
                com.mbridge.msdk.videocommon.a.a.a().a(this.f21576s, str);
                if (!z8 || this.f21574q == null) {
                    return;
                }
                String a12 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                if (bVar != null) {
                    bVar.a(b8);
                    bVar.c(true);
                }
                c.a(this.f21574q, a12, bVar);
                return;
            }
            if (!s()) {
                try {
                    com.mbridge.msdk.reward.a.a aVar4 = new com.mbridge.msdk.reward.a.a(this.f21576s, this.f21541D);
                    com.mbridge.msdk.foundation.b.c cVar8 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar4.a(str)) {
                        if (this.f21570m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.f21569l, this.f21579v, this.f21576s);
                            this.f21570m = cVar9;
                            cVar9.b(this.f21541D);
                            this.f21570m.c(this.f21542E);
                            if (this.f21541D) {
                                this.f21570m.a(this.f21538A, this.f21539B, this.f21540C);
                            }
                            this.f21570m.a(this.f21583z);
                            this.f21570m.a(this.f21571n);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f21570m);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.b.c.f19011d && cVar8.a() != null && cVar8.a().size() > 0 && this.f21570m != null) {
                            CopyOnWriteArrayList<CampaignEx> a13 = cVar8.a();
                            if (a10 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CampaignEx> it3 = a10.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next2 = it3.next();
                                    if (next2 != null) {
                                        String requestId2 = next2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i9 = 0; i9 < a13.size(); i9++) {
                                                CampaignEx campaignEx4 = a13.get(i9);
                                                if (campaignEx4 != null) {
                                                    if (requestId2.equals(campaignEx4.getRequestId())) {
                                                        break;
                                                    } else if (i9 == a13.size() - 1) {
                                                        arrayList2.add(next2);
                                                    }
                                                }
                                            }
                                            if (a13.size() == 0) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                                this.f21570m.a(arrayList2);
                            }
                            this.f21570m.a(cVar8.a(), false, true);
                            copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar8.a());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayList3 = a(str, a10);
                        if (copyOnWriteArrayList3.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.b.c.f19010c);
                    }
                    aVar.a(bVar, str, cVar8, (List<a.C0395a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        a(copyOnWriteArrayList3, str, bVar);
                        if (this.f21570m != null && !aVar.a(str)) {
                            this.f21570m.a(copyOnWriteArrayList3);
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f21560Y = false;
                this.f21574q.a(this.f21542E);
                a(this.f21551P, z8, str, bVar);
                return;
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f21576s, str);
            if (!z8 || this.f21574q == null) {
                return;
            }
            String a14 = com.mbridge.msdk.foundation.c.a.a(880019, "");
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880019, "");
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            c.a(this.f21574q, a14, bVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("cache", 1);
            bVar.a("2000127", dVar);
            bVar.a("2000048", dVar);
            bVar.a(copyOnWriteArrayList);
        } catch (Exception e8) {
            ad.b("RewardVideoController", e8.getMessage());
        }
        this.f21560Y = true;
        this.f21574q.a(this.f21542E);
        c.a(this.f21574q, this.f21579v, this.f21576s, bVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar = this.f21570m;
        if (cVar != null && cVar.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f21574q.b(this.f21579v, this.f21576s, bVar);
        } else {
            a(copyOnWriteArrayList, this.f21570m);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i8 = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > i8) {
                                i8 = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= i8 && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.a.d.a(this.f21576s, str, i8);
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z8 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f21564g = false;
        this.f21565h = false;
        this.f21566i = false;
        this.f21567j = false;
        this.f21568k = false;
        com.mbridge.msdk.reward.adapter.b.a().a(this.f21569l, z8, nscpt, this.f21542E, this.f21541D ? 287 : 94, this.f21579v, this.f21576s, campaignEx.getRequestId(), copyOnWriteArrayList, new AnonymousClass2(campaignEx, z8, cVar, nscpt), new b.i(campaignEx, copyOnWriteArrayList, z8, nscpt) { // from class: com.mbridge.msdk.reward.b.a.3

            /* renamed from: a, reason: collision with root package name */
            com.mbridge.msdk.foundation.same.report.d.b f21604a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CampaignEx f21605b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f21606c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f21607d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f21608e;

            {
                this.f21605b = campaignEx;
                this.f21606c = copyOnWriteArrayList;
                this.f21607d = z8;
                this.f21608e = nscpt;
                this.f21604a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, String str3, String str4) {
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
                String unitId = bVar == null ? "" : bVar.d().getUnitId();
                a aVar = a.this;
                a.a(aVar, unitId, aVar.aa);
                if (bVar != null) {
                    bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (this.f21604a == null) {
                    this.f21604a = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                this.f21604a.b(this.f21606c);
                this.f21604a.a(bVar);
                if (!this.f21607d && a.this.f21574q != null) {
                    if (a.this.f21567j) {
                        return;
                    }
                    a.this.f21567j = true;
                    c.a(a.this.f21574q, bVar, this.f21604a);
                    return;
                }
                if (this.f21608e != 1 || a.this.f21567j || a.this.f21574q == null) {
                    return;
                }
                a.this.f21567j = true;
                c.a(a.this.f21574q, bVar, this.f21604a);
            }
        });
        if (z8) {
            com.mbridge.msdk.reward.adapter.b.a().a(this.f21569l, campaignEx, this.f21579v, this.f21576s, campaignEx.getRequestId(), new AnonymousClass4(campaignEx, copyOnWriteArrayList, cVar, z8, nscpt));
        }
    }

    private void a(Queue<Integer> queue, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        Integer poll;
        int intValue;
        try {
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (poll = queue.poll()) != null) {
                        intValue = poll.intValue();
                        a(1, intValue, z8, str, bVar);
                        return;
                    }
                } catch (Exception e8) {
                    com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e8.getMessage());
                    if (bVar != null) {
                        bVar.a(b8);
                        bVar.c(true);
                    }
                    a(b8, bVar);
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                        return;
                    }
                    return;
                }
            }
            a(1, intValue, z8, str, bVar);
            return;
        } catch (Exception e9) {
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e9.getMessage());
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            a(b9, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
                return;
            }
            return;
        }
        intValue = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        if (this.f21574q != null) {
            this.f21559X = true;
            this.f21574q.a(bVar, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002d, B:9:0x0031, B:10:0x003c, B:14:0x0014), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r11, int r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.d.b r15) {
        /*
            r10 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r10.f21570m     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L14
            java.lang.String r1 = r10.f21576s     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L11
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L2d
            goto L14
        L11:
            r11 = move-exception
            goto L82
        L14:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> L11
            android.content.Context r1 = r10.f21569l     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r10.f21579v     // Catch: java.lang.Exception -> L11
            java.lang.String r3 = r10.f21576s     // Catch: java.lang.Exception -> L11
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L11
            r10.f21570m = r0     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f21541D     // Catch: java.lang.Exception -> L11
            r0.b(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.f21570m     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f21542E     // Catch: java.lang.Exception -> L11
            r0.c(r1)     // Catch: java.lang.Exception -> L11
        L2d:
            boolean r0 = r10.f21541D     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L3c
            com.mbridge.msdk.reward.adapter.c r0 = r10.f21570m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f21538A     // Catch: java.lang.Exception -> L11
            int r2 = r10.f21539B     // Catch: java.lang.Exception -> L11
            int r3 = r10.f21540C     // Catch: java.lang.Exception -> L11
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L11
        L3c:
            com.mbridge.msdk.reward.adapter.c r0 = r10.f21570m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f21583z     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.f21570m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.videocommon.d.c r1 = r10.f21571n     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$a r0 = new com.mbridge.msdk.reward.b.a$a     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r4 = r10.f21570m     // Catch: java.lang.Exception -> L11
            r2 = r0
            r3 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            r2.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L11
            r0.a(r12)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r1 = new com.mbridge.msdk.reward.b.a$b     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r2 = r10.f21570m     // Catch: java.lang.Exception -> L11
            r1.<init>(r2, r13)     // Catch: java.lang.Exception -> L11
            r10.f21562a = r1     // Catch: java.lang.Exception -> L11
            r1.a(r0)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r1 = r10.f21570m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r2 = r10.f21562a     // Catch: java.lang.Exception -> L11
            r1.a(r2)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r3 = r10.f21570m     // Catch: java.lang.Exception -> L11
            boolean r8 = r10.f21546I     // Catch: java.lang.Exception -> L11
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            r3.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L11
            android.os.Handler r11 = r10.f21582y     // Catch: java.lang.Exception -> L11
            int r12 = r12 * 1000
            long r12 = (long) r12     // Catch: java.lang.Exception -> L11
            r11.postDelayed(r0, r12)     // Catch: java.lang.Exception -> L11
            goto La6
        L82:
            r12 = 880020(0xd6d94, float:1.23317E-39)
            java.lang.String r13 = r11.getMessage()
            com.mbridge.msdk.foundation.c.b r12 = com.mbridge.msdk.foundation.c.a.b(r12, r13)
            if (r15 == 0) goto L96
            r15.a(r12)
            r13 = 1
            r15.c(r13)
        L96:
            r10.a(r12, r15)
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto La6
            java.lang.String r12 = "RewardVideoController"
            java.lang.String r11 = r11.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r12, r11)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(int, int, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):void");
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.videocommon.d.c cVar;
        com.mbridge.msdk.videocommon.d.c cVar2;
        boolean b8;
        boolean c8;
        try {
            if (this.f21570m == null) {
                r();
            }
            if (this.f21570m != null) {
                ad.b("RewardVideoController", "controller 819");
                if (this.f21542E) {
                    b8 = e(false);
                } else {
                    b8 = this.f21570m.b();
                }
                if (b8) {
                    ad.c("RewardVideoController", "invoke adapter show isReady");
                    d dVar = new d(this, this.f21582y);
                    f21537f.put(this.f21576s, dVar);
                    this.f21570m.a(dVar, str, this.f21575r, this.f21583z, this.f21578u, bVar);
                    this.f21563c = false;
                    return;
                }
                if (this.f21542E) {
                    if (this.f21570m == null) {
                        r();
                    }
                    List<com.mbridge.msdk.foundation.entity.c> a8 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21576s);
                    if (a8 != null && a8.size() > 0) {
                        for (com.mbridge.msdk.foundation.entity.c cVar3 : a8) {
                            if (cVar3 != null) {
                                this.f21570m.a(cVar3.a());
                                this.f21570m.f21451d = cVar3.d();
                                if (this.f21570m.c()) {
                                    c8 = true;
                                    break;
                                }
                                com.mbridge.msdk.videocommon.a.a.a().c(this.f21576s, cVar3.a());
                            }
                        }
                    }
                    c8 = false;
                } else {
                    c8 = this.f21570m.c();
                }
                if (c8) {
                    ad.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    d dVar2 = new d(this, this.f21582y);
                    f21537f.put(this.f21576s, dVar2);
                    this.f21570m.a(dVar2, str, this.f21575r, this.f21583z, this.f21578u, bVar);
                    this.f21563c = false;
                    return;
                }
            }
            this.f21563c = false;
            a("2000131", bVar, this.f21573p, "can't show because load is failed");
            if (this.f21573p != null) {
                try {
                    this.f21573p.onShowFail(bVar, this.f21577t, "can't show because load is failed");
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
            }
            if (this.f21541D || this.f21542E || (cVar2 = this.f21571n) == null || !cVar2.s(4) || this.f21574q == null || c.a(this.f21574q) == 1 || c.a(this.f21574q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f21576s, true, 1));
        } catch (Exception e9) {
            this.f21563c = false;
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getLocalizedMessage());
            }
            a("2000131", bVar, this.f21573p, "show exception");
            if (this.f21573p != null) {
                try {
                    this.f21573p.onShowFail(bVar, this.f21577t, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e9.getMessage());
                    }
                }
            }
            if (this.f21541D || this.f21542E || (cVar = this.f21571n) == null || !cVar.s(4) || this.f21574q == null || c.a(this.f21574q) == 1 || c.a(this.f21574q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f21576s, true, 1));
        }
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f21570m.a(cVar.a());
                this.f21570m.f21451d = cVar.d();
                if (this.f21570m.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.d.d r14) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.d.d):void");
    }

    private com.mbridge.msdk.foundation.same.report.d.b a(com.mbridge.msdk.foundation.same.report.d.d dVar) {
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21576s);
            String str = "";
            if (a8 != null && a8.size() > 0 && (campaignEx = a8.get(0)) != null) {
                str = campaignEx.getCurrentLocalRid();
            }
            r0 = TextUtils.isEmpty(str) ? null : com.mbridge.msdk.foundation.same.report.d.c.a().b().get(str);
            if (r0 != null) {
                r0.b(a8);
                r0.a("2000128", dVar);
                r0.c(str);
                r0.d(this.f21576s);
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", r0);
                return r0;
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            try {
                bVar.d(this.f21576s);
                dVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                bVar.a("2000128", dVar);
                if (TextUtils.isEmpty(str)) {
                    bVar.c(SameMD5.getMD5(ai.d()));
                } else {
                    bVar.c(str);
                    bVar.b(a8);
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
                }
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            } catch (Exception e8) {
                e = e8;
                r0 = bVar;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
                return r0;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f21550M = list;
    }

    private String a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = SameMD5.getMD5(ai.d());
            }
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                str2 = split[2];
            }
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(ai.d()) : str2;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e8.printStackTrace();
            return "";
        }
    }

    public final com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = null;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
        return bVar == null ? new com.mbridge.msdk.foundation.same.report.d.b() : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(this.f21550M);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (!TextUtils.isEmpty(str2)) {
            dVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            dVar.a("listener_state", 1);
        } else {
            dVar.a("listener_state", 2);
        }
        bVar.a(str, dVar);
        com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:25:0x0009, B:27:0x000f, B:29:0x0016, B:30:0x002f, B:4:0x0039, B:8:0x0040, B:11:0x0075, B:13:0x0088, B:15:0x0096), top: B:24:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.foundation.same.report.d.b a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.d.b r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.d.b r0 = new com.mbridge.msdk.foundation.same.report.d.b
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L38
            int r2 = r5.size()     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L38
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L2e
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            goto La2
        L2e:
            r2 = r1
        L2f:
            r0.c(r1)     // Catch: java.lang.Exception -> L2b
            r0.b(r5)     // Catch: java.lang.Exception -> L2b
            r5 = r1
            r1 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L40
            return r6
        L40:
            com.mbridge.msdk.foundation.same.report.d.d r6 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L2b
            r6.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = r4.f21541D     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L73
            r6 = 287(0x11f, float:4.02E-43)
            goto L75
        L73:
            r6 = 94
        L75:
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "1"
            r0.i(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "2"
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L2b
            goto La9
        La2:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La9
            r5.printStackTrace()
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.d.b):com.mbridge.msdk.foundation.same.report.d.b");
    }

    static /* synthetic */ void a(a aVar, String str, List list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || aVar.f21557V) {
                    return;
                }
                com.mbridge.msdk.foundation.db.f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a((List<CampaignEx>) list, str);
            } catch (Throwable th) {
                ad.b("RewardVideoController", th.getMessage());
            }
        }
    }

    static /* synthetic */ void a(a aVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener) {
        if (aVar.f21545H) {
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(aVar.f21550M);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (interVideoOutListener != null) {
                    dVar.a("listener_state", 1);
                } else {
                    dVar.a("listener_state", 2);
                }
                bVar.a(str, dVar);
                com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }
}
