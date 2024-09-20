package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
public class U {

    /* renamed from: e, reason: collision with root package name */
    private static U f17363e;

    /* renamed from: a, reason: collision with root package name */
    private String f17364a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17365b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f17366c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f17367d = new ArrayDeque();

    private U() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f8 = f(context, intent);
        if (f8 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f8);
            }
            intent.setClassName(context.getPackageName(), f8);
        }
        try {
            if (e(context)) {
                startService = f0.h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR;
            }
            return -1;
        } catch (IllegalStateException e8) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e8);
            return 402;
        } catch (SecurityException e9) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized U b() {
        U u8;
        synchronized (U.class) {
            try {
                if (f17363e == null) {
                    f17363e = new U();
                }
                u8 = f17363e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u8;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f17364a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f17364a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f17364a = serviceInfo.name;
                    }
                    return this.f17364a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent c() {
        return (Intent) this.f17367d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Context context) {
        boolean z8;
        if (this.f17366c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f17366c = Boolean.valueOf(z8);
        }
        if (!this.f17365b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17366c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Context context) {
        boolean z8;
        if (this.f17365b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f17365b = Boolean.valueOf(z8);
        }
        if (!this.f17365b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17365b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f17367d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
