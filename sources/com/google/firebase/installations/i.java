package com.google.firebase.installations;

import android.text.TextUtils;
import b1.AbstractC1854d;
import d1.C2536b;
import d1.InterfaceC2535a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f17276b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f17277c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static i f17278d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2535a f17279a;

    private i(InterfaceC2535a interfaceC2535a) {
        this.f17279a = interfaceC2535a;
    }

    public static i c() {
        return d(C2536b.a());
    }

    public static i d(InterfaceC2535a interfaceC2535a) {
        if (f17278d == null) {
            f17278d = new i(interfaceC2535a);
        }
        return f17278d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f17277c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f17279a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC1854d abstractC1854d) {
        if (TextUtils.isEmpty(abstractC1854d.b()) || abstractC1854d.h() + abstractC1854d.c() < b() + f17276b) {
            return true;
        }
        return false;
    }
}
