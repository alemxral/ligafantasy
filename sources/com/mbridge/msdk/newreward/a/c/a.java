package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f20783a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f20784b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f20785c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0413a {
        void a(String str, long j8);
    }

    /* loaded from: classes4.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f20786a;

        /* renamed from: b, reason: collision with root package name */
        private final long f20787b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20788c;

        public b(String str, long j8) {
            this.f20786a = str;
            this.f20787b = j8;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f20789a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0413a f20790b;

        public c(b bVar, InterfaceC0413a interfaceC0413a) {
            this.f20789a = bVar;
            this.f20790b = interfaceC0413a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0413a interfaceC0413a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f20789a.f20786a + " isStop: " + this.f20789a.f20788c);
            }
            if (this.f20789a.f20788c || (interfaceC0413a = this.f20790b) == null) {
                return;
            }
            try {
                interfaceC0413a.a(this.f20789a.f20786a, this.f20789a.f20787b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f20785c = new Handler(handlerThread.getLooper());
        this.f20784b = new HashMap();
    }

    public static a a() {
        if (f20783a == null) {
            synchronized (a.class) {
                try {
                    if (f20783a == null) {
                        f20783a = new a();
                    }
                } finally {
                }
            }
        }
        return f20783a;
    }

    public final void a(String str, long j8, InterfaceC0413a interfaceC0413a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j8);
        }
        if (this.f20784b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j8), interfaceC0413a);
        this.f20784b.put(str, cVar);
        this.f20785c.postDelayed(cVar, j8);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.f20784b.remove(str);
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (remove != null) {
            remove.f20789a.f20788c = true;
            this.f20785c.removeCallbacks(remove);
        }
    }
}
