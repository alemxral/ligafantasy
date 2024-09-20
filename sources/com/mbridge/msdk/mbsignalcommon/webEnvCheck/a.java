package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f20555a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f20556b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f20557c;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView != null) {
            try {
                webView.destroy();
                return true;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBWebViewChecker", "destroy webview error", e8);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(final Context context) {
        g gVar;
        try {
            gVar = h.a().a(c.m().k());
        } catch (Exception unused) {
            gVar = null;
        }
        if (gVar != null) {
            f20557c = Boolean.valueOf(gVar.aE());
        } else {
            f20557c = Boolean.FALSE;
        }
        Boolean bool = f20557c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f20555a == null) {
                try {
                    f20555a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    f20555a = Boolean.FALSE;
                }
            }
            if (f20555a == null) {
                f20555a = new Boolean(false);
            }
            return f20555a.booleanValue();
        }
        if (f20555a == null && f20556b == null) {
            f20556b = new Handler(Looper.getMainLooper());
            f20556b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.f20555a == null) {
                        try {
                            Boolean unused3 = a.f20555a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.f20555a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f20555a == null) {
            return true;
        }
        return f20555a.booleanValue();
    }
}
