package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f17410d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17411a;

    /* renamed from: b, reason: collision with root package name */
    private W f17412b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17413c;

    private a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f17413c = executor;
        this.f17411a = sharedPreferences;
    }

    public static synchronized a0 a(Context context, Executor executor) {
        a0 a0Var;
        synchronized (a0.class) {
            try {
                WeakReference weakReference = f17410d;
                if (weakReference != null) {
                    a0Var = (a0) weakReference.get();
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    a0Var = new a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    a0Var.c();
                    f17410d = new WeakReference(a0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    private synchronized void c() {
        this.f17412b = W.c(this.f17411a, "topic_operation_queue", ",", this.f17413c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Z b() {
        return Z.a(this.f17412b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(Z z8) {
        return this.f17412b.f(z8.e());
    }
}
