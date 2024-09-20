package com.mbridge.msdk.d;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f18207a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18208b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f18209c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f18210d;

    /* renamed from: e, reason: collision with root package name */
    private int f18211e;

    /* renamed from: f, reason: collision with root package name */
    private int f18212f;

    /* renamed from: g, reason: collision with root package name */
    private f f18213g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f18214h;

    /* renamed from: i, reason: collision with root package name */
    private o f18215i;

    /* renamed from: j, reason: collision with root package name */
    private h f18216j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f18217k;

    /* renamed from: com.mbridge.msdk.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0390a {

        /* renamed from: a, reason: collision with root package name */
        static a f18221a = new a();
    }

    static /* synthetic */ void c(a aVar) {
        try {
            LinkedList<i> linkedList = aVar.f18209c;
            if (linkedList != null && linkedList.size() > 0 && aVar.f18211e < aVar.f18209c.size()) {
                i iVar = aVar.f18209c.get(aVar.f18211e);
                aVar.f18211e++;
                if (aVar.a(iVar)) {
                    aVar.a(iVar.a(), iVar.b(), false);
                }
            } else {
                LinkedList<i> linkedList2 = aVar.f18210d;
                if (linkedList2 != null && linkedList2.size() > 0 && aVar.f18212f < aVar.f18210d.size()) {
                    i iVar2 = aVar.f18210d.get(aVar.f18212f);
                    aVar.f18212f++;
                    if (aVar.a(iVar2)) {
                        aVar.a(iVar2.a(), iVar2.b(), true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.a("LoopTimer", th.getMessage(), th);
        }
    }

    private a() {
        this.f18208b = false;
        this.f18209c = new LinkedList<>();
        this.f18210d = new LinkedList<>();
        this.f18211e = 0;
        this.f18212f = 0;
        this.f18217k = new Handler() { // from class: com.mbridge.msdk.d.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                synchronized (a.this) {
                    try {
                        int i8 = message.what;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                a.c(a.this);
                            }
                        } else {
                            if (a.this.f18208b) {
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, aVar.f18207a);
                            sendMessageDelayed(obtainMessage(1), a.this.f18207a);
                        }
                    } finally {
                    }
                }
            }
        };
    }

    private boolean a(i iVar) {
        boolean z8 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.b())) {
            return false;
        }
        String b8 = iVar.b();
        try {
            if (this.f18213g != null) {
                com.mbridge.msdk.videocommon.d.a aVar = this.f18214h;
                int a8 = this.f18213g.a(b8, aVar != null ? aVar.f() : 0L);
                if (a8 != -1) {
                    if (a8 != 1) {
                    }
                } else if (!TextUtils.isEmpty(b8)) {
                    LinkedList<i> linkedList = this.f18209c;
                    if (linkedList != null && linkedList.contains(b8)) {
                        this.f18209c.remove(b8);
                    } else {
                        LinkedList<i> linkedList2 = this.f18210d;
                        if (linkedList2 != null && linkedList2.contains(b8)) {
                            this.f18210d.remove(b8);
                        }
                    }
                    o oVar = this.f18215i;
                    if (oVar != null) {
                        oVar.a(b8);
                    }
                }
                try {
                    Handler handler = this.f18217k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    ad.a("LoopTimer", th.getMessage(), th);
                    return z8;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z8 = true;
        }
    }

    public final void b(String str, String str2) {
        if (this.f18210d.contains(str2)) {
            return;
        }
        this.f18210d.add(new i(str, str2, 287));
        o oVar = this.f18215i;
        if (oVar != null) {
            oVar.a(str, str2, 287);
        }
    }

    private void a(String str, String str2, boolean z8) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return;
            }
            final com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(c8, str, str2);
            cVar.b(z8);
            cVar.a(new com.mbridge.msdk.reward.adapter.a() { // from class: com.mbridge.msdk.d.a.2
                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                    a.this.f18217k.sendMessage(a.this.f18217k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                    a.this.f18217k.sendMessage(a.this.f18217k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            });
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.c(SameMD5.getMD5(ai.d()));
            bVar.d(str2);
            if (z8) {
                bVar.b(287);
            } else {
                bVar.b(94);
            }
            bVar.i(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            bVar.b("1");
            cVar.a(1, 8000, false, bVar);
        } catch (Exception e8) {
            ad.a("LoopTimer", e8.getMessage(), e8);
        }
    }

    public final void a(String str, String str2) {
        if (this.f18209c.contains(str2)) {
            return;
        }
        this.f18209c.add(new i(str, str2, 94));
        o oVar = this.f18215i;
        if (oVar != null) {
            oVar.a(str, str2, 94);
        }
    }

    public final void a(long j8) {
        if (this.f18216j == null) {
            this.f18216j = h.a(c.m().c());
        }
        if (this.f18215i == null) {
            this.f18215i = o.a(this.f18216j);
        }
        List<i> a8 = this.f18215i.a(287);
        if (a8 != null) {
            this.f18210d.addAll(a8);
            for (i iVar : a8) {
                b(iVar.a(), iVar.b());
            }
        }
        List<i> a9 = this.f18215i.a(94);
        if (a9 != null) {
            this.f18209c.addAll(a9);
            for (i iVar2 : a9) {
                a(iVar2.a(), iVar2.b());
            }
        }
        if (this.f18213g == null) {
            this.f18213g = f.a(this.f18216j);
        }
        if (this.f18214h == null) {
            this.f18214h = com.mbridge.msdk.videocommon.d.b.a().b();
        }
        this.f18207a = j8;
        this.f18208b = false;
        Handler handler = this.f18217k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f18207a);
    }

    static /* synthetic */ void a(a aVar, long j8) {
        LinkedList<i> linkedList = aVar.f18209c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f18211e == 0 || aVar.f18209c.size() <= aVar.f18211e) {
            LinkedList<i> linkedList2 = aVar.f18210d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f18212f == 0 || aVar.f18210d.size() == aVar.f18212f) {
                aVar.f18212f = 0;
                aVar.f18211e = 0;
                Handler handler = aVar.f18217k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }
}
