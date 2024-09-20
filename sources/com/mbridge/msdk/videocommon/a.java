package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22935a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22936b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22937c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22938d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22939e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22940f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22941g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22942h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22943i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0439a> f22944j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0439a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f22945a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22946b;

        public final WindVaneWebView a() {
            return this.f22945a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f22945a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f22946b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f22945a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f22945a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.f22946b = z8;
        }
    }

    public static C0439a a(String str) {
        if (f22941g.containsKey(str)) {
            return f22941g.get(str);
        }
        if (f22942h.containsKey(str)) {
            return f22942h.get(str);
        }
        if (f22943i.containsKey(str)) {
            return f22943i.get(str);
        }
        if (f22944j.containsKey(str)) {
            return f22944j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f22941g.containsKey(str)) {
            f22941g.remove(str);
        }
        if (f22943i.containsKey(str)) {
            f22943i.remove(str);
        }
        if (f22942h.containsKey(str)) {
            f22942h.remove(str);
        }
        if (f22944j.containsKey(str)) {
            f22944j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f22941g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f22941g.remove(str2);
                }
            }
        } else {
            f22941g.clear();
        }
        f22942h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0439a> entry : f22941g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22941g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0439a> entry : f22942h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22942h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0439a c0439a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                f22942h.put(str, c0439a);
                return;
            } else {
                f22941g.put(str, c0439a);
                return;
            }
        }
        if (z9) {
            f22944j.put(str, c0439a);
        } else {
            f22943i.put(str, c0439a);
        }
    }

    public static void b(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap = f22936b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0439a> concurrentHashMap2 = f22939e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i8 != 287) {
                if (i8 != 288) {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap3 = f22935a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0439a> concurrentHashMap4 = f22938d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0439a> concurrentHashMap5 = f22937c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0439a> concurrentHashMap6 = f22940f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a() {
        f22943i.clear();
        f22944j.clear();
    }

    public static C0439a a(int i8, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i8 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i8 != 94) {
                if (i8 != 287) {
                    if (i8 != 288) {
                        ConcurrentHashMap<String, C0439a> concurrentHashMap = f22935a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f22935a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0439a> concurrentHashMap2 = f22938d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f22938d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap3 = f22937c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f22937c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0439a> concurrentHashMap4 = f22940f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f22940f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0439a> concurrentHashMap5 = f22936b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f22936b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0439a> concurrentHashMap6 = f22939e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f22939e.get(requestIdNotice);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i8, String str, C0439a c0439a) {
        try {
            if (i8 == 94) {
                if (f22939e == null) {
                    f22939e = new ConcurrentHashMap<>();
                }
                f22939e.put(str, c0439a);
            } else if (i8 == 287) {
                if (f22940f == null) {
                    f22940f = new ConcurrentHashMap<>();
                }
                f22940f.put(str, c0439a);
            } else if (i8 != 288) {
                if (f22935a == null) {
                    f22935a = new ConcurrentHashMap<>();
                }
                f22935a.put(str, c0439a);
            } else {
                if (f22938d == null) {
                    f22938d = new ConcurrentHashMap<>();
                }
                f22938d.put(str, c0439a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(int i8, String str, C0439a c0439a) {
        try {
            if (i8 == 94) {
                if (f22936b == null) {
                    f22936b = new ConcurrentHashMap<>();
                }
                f22936b.put(str, c0439a);
            } else {
                if (i8 != 287) {
                    return;
                }
                if (f22937c == null) {
                    f22937c = new ConcurrentHashMap<>();
                }
                f22937c.put(str, c0439a);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
