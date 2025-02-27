package G;

import O.AbstractC1268l;
import O.C1264h;
import O.C1265i;
import O.ServiceConnectionC1257a;
import R.AbstractC1319p;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import b0.AbstractBinderC1846e;
import b0.InterfaceC1847f;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC1257a f3060a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC1847f f3061b;

    /* renamed from: c, reason: collision with root package name */
    boolean f3062c;

    /* renamed from: d, reason: collision with root package name */
    final Object f3063d = new Object();

    /* renamed from: e, reason: collision with root package name */
    c f3064e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f3065f;

    /* renamed from: g, reason: collision with root package name */
    final long f3066g;

    /* renamed from: G.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0045a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3067a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3068b;

        public C0045a(String str, boolean z8) {
            this.f3067a = str;
            this.f3068b = z8;
        }

        public String a() {
            return this.f3067a;
        }

        public boolean b() {
            return this.f3068b;
        }

        public String toString() {
            String str = this.f3067a;
            boolean z8 = this.f3068b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z8);
            return sb.toString();
        }
    }

    public a(Context context, long j8, boolean z8, boolean z9) {
        Context applicationContext;
        AbstractC1319p.l(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f3065f = context;
        this.f3062c = false;
        this.f3066g = j8;
    }

    public static C0045a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0045a f8 = aVar.f(-1);
            aVar.e(f8, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f8;
        } finally {
        }
    }

    private final C0045a f(int i8) {
        C0045a c0045a;
        AbstractC1319p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f3062c) {
                    synchronized (this.f3063d) {
                        c cVar = this.f3064e;
                        if (cVar == null || !cVar.f3073d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f3062c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                AbstractC1319p.l(this.f3060a);
                AbstractC1319p.l(this.f3061b);
                try {
                    c0045a = new C0045a(this.f3061b.c(), this.f3061b.x(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0045a;
    }

    private final void g() {
        synchronized (this.f3063d) {
            c cVar = this.f3064e;
            if (cVar != null) {
                cVar.f3072c.countDown();
                try {
                    this.f3064e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f3066g;
            if (j8 > 0) {
                this.f3064e = new c(this, j8);
            }
        }
    }

    public final void c() {
        AbstractC1319p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3065f != null && this.f3060a != null) {
                    try {
                        if (this.f3062c) {
                            V.b.b().c(this.f3065f, this.f3060a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f3062c = false;
                    this.f3061b = null;
                    this.f3060a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(boolean z8) {
        AbstractC1319p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3062c) {
                    c();
                }
                Context context = this.f3065f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h8 = C1264h.f().h(context, AbstractC1268l.f7658a);
                    if (h8 != 0 && h8 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1257a serviceConnectionC1257a = new ServiceConnectionC1257a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (V.b.b().a(context, intent, serviceConnectionC1257a, 1)) {
                            this.f3060a = serviceConnectionC1257a;
                            try {
                                this.f3061b = AbstractBinderC1846e.i(serviceConnectionC1257a.a(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS));
                                this.f3062c = true;
                                if (z8) {
                                    g();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C1265i(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e(C0045a c0045a, boolean z8, float f8, long j8, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (c0045a != null) {
                if (true != c0045a.b()) {
                    str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
                hashMap.put("limit_ad_tracking", str2);
                String a8 = c0045a.a();
                if (a8 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a8.length()));
                }
            }
            if (th != null) {
                hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j8));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() {
        c();
        super.finalize();
    }

    public static void b(boolean z8) {
    }
}
