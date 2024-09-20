package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f22587j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.d.c f22588k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f22589l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f22578a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f22579b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f22580c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f22581d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f22582e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f22583f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f22584g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f22585h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f22586i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0437a f22590m = new C0438a();

    /* renamed from: n, reason: collision with root package name */
    protected int f22591n = 2;

    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0438a implements a.InterfaceC0437a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public void b() {
            ad.a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i8) {
            ad.a("DefaultJSCommon", "onDownloadProgress,progress:" + i8);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            ad.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public void a(boolean z8) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public void a(int i8, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i8 + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i8) {
        this.f22591n = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i8) {
        this.f22581d = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i8) {
        this.f22580c = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i8, String str) {
        ad.a("DefaultJSCommon", "click:type" + i8 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i8) {
        this.f22582e = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i8) {
        this.f22584g = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.f22586i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i8) {
        ad.a("DefaultJSCommon", "setAlertDialogRole " + i8);
        this.f22585h = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i8, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i8 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    public final int j() {
        if (this.f22580c == 0 && this.f22579b) {
            this.f22580c = 1;
        }
        return this.f22580c;
    }

    public final int k() {
        if (this.f22581d == 0 && this.f22579b) {
            this.f22581d = 1;
        }
        return this.f22581d;
    }

    public final int l() {
        if (this.f22582e == 0 && this.f22579b) {
            this.f22582e = 1;
        }
        return this.f22582e;
    }

    public final boolean m() {
        return this.f22579b;
    }

    /* loaded from: classes4.dex */
    public static class b implements a.InterfaceC0437a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f22592a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0437a f22593b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0437a interfaceC0437a) {
            this.f22592a = dVar;
            this.f22593b = interfaceC0437a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a() {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void b() {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i8) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onDownloadProgress(i8);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f22592a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null && interfaceC0437a.onInterceptDefaultLoadingDialog()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f22592a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a(boolean z8) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.a(z8);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0437a
        public final void a(int i8, String str) {
            a.InterfaceC0437a interfaceC0437a = this.f22593b;
            if (interfaceC0437a != null) {
                interfaceC0437a.a(i8, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.f22584g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.f22578a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        ad.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d() {
        ad.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e() {
        ad.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f22589l;
        if (aVar != null) {
            aVar.a(false);
            this.f22589l.a((NativeListener.NativeTrackingListener) null);
            this.f22589l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i8) {
        this.f22586i = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i8) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z8) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z8);
        this.f22579b = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z8) {
        this.f22578a = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.f22585h);
        return this.f22585h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        ad.a("DefaultJSCommon", "setUnitId:" + str);
        this.f22587j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0437a interfaceC0437a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0437a);
        this.f22590m = interfaceC0437a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f22588k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i8, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i8 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }
}
