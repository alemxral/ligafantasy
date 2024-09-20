package com.mbridge.msdk.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f18978a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f18979b;

    public static boolean a() {
        boolean z8;
        if (f18978a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f18978a = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isChina", e8);
                }
            }
        }
        if (f18978a == null || !f18978a.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        boolean z8;
        if (f18979b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f18979b = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isOversea", e8);
                }
            }
        }
        if (f18979b == null || !f18979b.booleanValue()) {
            return false;
        }
        return true;
    }
}
