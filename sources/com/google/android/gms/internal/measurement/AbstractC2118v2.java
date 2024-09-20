package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2118v2 {

    /* renamed from: f, reason: collision with root package name */
    static HashMap f15913f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f15918k;

    /* renamed from: l, reason: collision with root package name */
    static boolean f15919l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f15908a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f15909b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15910c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15911d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f15912e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f15914g = new HashMap(16, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f15915h = new HashMap(16, 1.0f);

    /* renamed from: i, reason: collision with root package name */
    static final HashMap f15916i = new HashMap(16, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    static final HashMap f15917j = new HashMap(16, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    static final String[] f15920m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC2118v2.class) {
            try {
                String str3 = null;
                if (f15913f == null) {
                    f15912e.set(false);
                    f15913f = new HashMap(16, 1.0f);
                    f15918k = new Object();
                    f15919l = false;
                    contentResolver.registerContentObserver(f15908a, true, new C2102t2(null));
                } else if (f15912e.getAndSet(false)) {
                    f15913f.clear();
                    f15914g.clear();
                    f15915h.clear();
                    f15916i.clear();
                    f15917j.clear();
                    f15918k = new Object();
                    f15919l = false;
                }
                Object obj = f15918k;
                if (f15913f.containsKey(str)) {
                    String str4 = (String) f15913f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f15920m.length;
                Cursor query = contentResolver.query(f15908a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string == null) {
                        return null;
                    }
                    return string;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC2118v2.class) {
            try {
                if (obj == f15918k) {
                    f15913f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
