package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19957a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19958b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19959c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19960d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19961e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19962f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f19963g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f19964h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f19963g = false;
            f19957a = false;
            f19959c = false;
            f19964h = false;
            f19958b = false;
            f19962f = false;
            f19961e = false;
            f19960d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!f19957a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f19958b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (f19959c && !TextUtils.isEmpty(str2)) {
            Log.i(a(str), str2);
        }
    }

    public static void d(String str, String str2) {
        if (f19964h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f19964h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f19958b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f19964h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
