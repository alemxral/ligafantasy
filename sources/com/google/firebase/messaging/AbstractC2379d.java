package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2379d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f17430a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final NotificationCompat.Builder f17431a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17432b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17433c;

        a(NotificationCompat.Builder builder, String str, int i8) {
            this.f17431a = builder;
            this.f17432b = str;
            this.f17433c = i8;
        }
    }

    private static PendingIntent a(Context context, H h8, String str, PackageManager packageManager) {
        Intent f8 = f(str, h8, packageManager);
        if (f8 == null) {
            return null;
        }
        f8.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        f8.putExtras(h8.y());
        if (q(h8)) {
            f8.putExtra("gcm.n.analytics_data", h8.x());
        }
        return PendingIntent.getActivity(context, g(), f8, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, H h8) {
        if (!q(h8)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(h8.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, H h8, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String n8 = h8.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n8)) {
            builder.setContentTitle(n8);
        }
        String n9 = h8.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n9)) {
            builder.setContentText(n9);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(n9));
        }
        builder.setSmallIcon(m(packageManager, resources, packageName, h8.p("gcm.n.icon"), bundle));
        Uri n10 = n(packageName, h8, resources);
        if (n10 != null) {
            builder.setSound(n10);
        }
        builder.setContentIntent(a(context, h8, packageName, packageManager));
        PendingIntent b8 = b(context, context2, h8);
        if (b8 != null) {
            builder.setDeleteIntent(b8);
        }
        Integer h9 = h(context2, h8.p("gcm.n.color"), bundle);
        if (h9 != null) {
            builder.setColor(h9.intValue());
        }
        builder.setAutoCancel(!h8.a("gcm.n.sticky"));
        builder.setLocalOnly(h8.a("gcm.n.local_only"));
        String p8 = h8.p("gcm.n.ticker");
        if (p8 != null) {
            builder.setTicker(p8);
        }
        Integer m8 = h8.m();
        if (m8 != null) {
            builder.setPriority(m8.intValue());
        }
        Integer r8 = h8.r();
        if (r8 != null) {
            builder.setVisibility(r8.intValue());
        }
        Integer l8 = h8.l();
        if (l8 != null) {
            builder.setNumber(l8.intValue());
        }
        Long j8 = h8.j("gcm.n.event_time");
        if (j8 != null) {
            builder.setShowWhen(true);
            builder.setWhen(j8.longValue());
        }
        long[] q8 = h8.q();
        if (q8 != null) {
            builder.setVibrate(q8);
        }
        int[] e8 = h8.e();
        if (e8 != null) {
            builder.setLights(e8[0], e8[1], e8[2]);
        }
        builder.setDefaults(i(h8));
        return new a(builder, o(h8), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e(Context context, H h8) {
        Bundle j8 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, h8, k(context, h8.k(), j8), j8);
    }

    private static Intent f(String str, H h8, PackageManager packageManager) {
        String p8 = h8.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p8)) {
            Intent intent = new Intent(p8);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f8 = h8.f();
        if (f8 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f8);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f17430a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i8 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i8 != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(context, i8));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(H h8) {
        boolean a8 = h8.a("gcm.n.default_sound");
        ?? r02 = a8;
        if (h8.a("gcm.n.default_vibrate_timings")) {
            r02 = (a8 ? 1 : 0) | 2;
        }
        if (h8.a("gcm.n.default_light_settings")) {
            return r02 | 4;
        }
        return r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e8);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        Object systemService;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (!TextUtils.isEmpty(str)) {
                    notificationChannel3 = notificationManager.getNotificationChannel(str);
                    if (notificationChannel3 != null) {
                        return str;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string2);
                    if (notificationChannel2 != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                if (notificationChannel == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", TypedValues.Custom.S_STRING, context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(androidx.browser.trusted.h.a("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i8 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        return i8;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i8 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i8 == 0 || !p(resources, i8)) {
            try {
                i8 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e8);
            }
        }
        if (i8 == 0 || !p(resources, i8)) {
            return R.drawable.sym_def_app_icon;
        }
        return i8;
    }

    private static Uri n(String str, H h8, Resources resources) {
        String o8 = h8.o();
        if (TextUtils.isEmpty(o8)) {
            return null;
        }
        if (!"default".equals(o8) && resources.getIdentifier(o8, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o8);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(H h8) {
        String p8 = h8.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p8)) {
            return p8;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i8) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC2378c.a(resources.getDrawable(i8, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i8);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i8 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(H h8) {
        return h8.a("google.c.a.e");
    }
}
