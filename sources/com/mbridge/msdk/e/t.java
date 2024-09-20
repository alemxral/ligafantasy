package com.mbridge.msdk.e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile t f18940d;

    /* renamed from: b, reason: collision with root package name */
    private m f18942b;

    /* renamed from: c, reason: collision with root package name */
    private w f18943c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18944e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f18945f = 30000;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f18946g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    Handler f18941a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.e.t.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    t.this.c();
                    t.this.f18941a.removeMessages(1);
                    t.this.d();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
    };

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f18941a.sendEmptyMessageDelayed(1, this.f18945f);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final synchronized void b() {
        if (this.f18944e) {
            return;
        }
        this.f18944e = true;
        d();
    }

    public final void c() {
        m[] d8 = m.d();
        if (d8.length == 0) {
            return;
        }
        try {
            for (m mVar : d8) {
                String c8 = mVar.c();
                if (!"monitor".equals(c8)) {
                    String b8 = mVar.b();
                    long[] g8 = mVar.g();
                    long j8 = g8[1];
                    if (j8 != 0) {
                        long j9 = g8[0];
                        if (this.f18946g.containsKey(c8)) {
                            if ((j9 + "").equals(this.f18946g.get(c8))) {
                            }
                        }
                        this.f18946g.put(c8, j9 + "");
                        if (this.f18942b != null) {
                            try {
                                e eVar = new e("event_lib_monitor");
                                eVar.b(1);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(LeanbackPreferenceDialogFragment.ARG_KEY, "m_report_rate");
                                jSONObject.put("task_name", c8);
                                jSONObject.put("task_count", j8);
                                jSONObject.put("task_session_id", b8);
                                jSONObject.put("task_ts", j9);
                                eVar.a(jSONObject);
                                this.f18942b.a(eVar);
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(Context context, w wVar, int i8, JSONObject jSONObject) {
        this.f18943c = wVar;
        this.f18945f = i8;
        m a8 = m.a("monitor", context, wVar);
        this.f18942b = a8;
        if (a8 != null) {
            a8.a(jSONObject);
            this.f18942b.a();
        }
        b();
    }

    public static t a() {
        if (f18940d == null) {
            synchronized (t.class) {
                try {
                    if (f18940d == null) {
                        f18940d = new t();
                    }
                } finally {
                }
            }
        }
        return f18940d;
    }
}
