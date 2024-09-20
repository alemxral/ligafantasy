package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f20088a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (u.class) {
            try {
                if (f20088a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    f20088a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().c().getSystemService("connectivity");
                }
            } catch (Exception e8) {
                ad.b("NetManager", e8.getMessage());
            }
            connectivityManager = f20088a;
        }
        return connectivityManager;
    }
}
