package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f20598a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f20599b;

    /* renamed from: c, reason: collision with root package name */
    private Object f20600c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f20601d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.f20599b = context;
        this.f20601d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20469a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i8 = RewardSignal.f22625g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20470b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i9 = VideoCommunication.f22651g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20471c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i10 = MraidSignalCommunication.f20542g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20473e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i11 = BannerSignalPlugin.f20534g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20474f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20475g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i12 = WebGLCheckSignal.f20554g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f20476h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.f.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }

    public final void a(Context context) {
        this.f20599b = context;
    }

    public final void a(Object obj) {
        this.f20600c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f20598a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f20600c, windVaneWebView);
            return hVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f20598a == null) {
            f20598a = new HashMap<>();
        }
        f20598a.put(str, cls);
    }

    public final Object a(String str) {
        if (f20598a == null) {
            f20598a = new HashMap<>();
        }
        return a(str, this.f20601d, this.f20599b);
    }
}
