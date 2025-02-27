package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class B2 implements F2 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f15244h = new ArrayMap();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f15245i = {LeanbackPreferenceDialogFragment.ARG_KEY, "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f15246a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f15247b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f15248c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f15249d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15250e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f15251f;

    /* renamed from: g, reason: collision with root package name */
    private final List f15252g;

    private B2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        A2 a22 = new A2(this, null);
        this.f15249d = a22;
        this.f15250e = new Object();
        this.f15252g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f15246a = contentResolver;
        this.f15247b = uri;
        this.f15248c = runnable;
        contentResolver.registerContentObserver(uri, false, a22);
    }

    public static B2 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        B2 b22;
        synchronized (B2.class) {
            Map map = f15244h;
            b22 = (B2) map.get(uri);
            if (b22 == null) {
                try {
                    B2 b23 = new B2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, b23);
                    } catch (SecurityException unused) {
                    }
                    b22 = b23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return b22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        synchronized (B2.class) {
            try {
                for (B2 b22 : f15244h.values()) {
                    b22.f15246a.unregisterContentObserver(b22.f15249d);
                }
                f15244h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.F2
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map c() {
        Map map;
        Map map2;
        Map map3 = this.f15251f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f15250e) {
                Map map5 = this.f15251f;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) D2.a(new E2() { // from class: com.google.android.gms.internal.measurement.z2
                                @Override // com.google.android.gms.internal.measurement.E2
                                public final Object a() {
                                    return B2.this.d();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f15251f = map;
                        allowThreadDiskReads = map;
                        map2 = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        if (map4 != null) {
            return map4;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Map hashMap;
        Cursor query = this.f15246a.query(this.f15247b, f15245i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void f() {
        synchronized (this.f15250e) {
            this.f15251f = null;
            this.f15248c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f15252g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
