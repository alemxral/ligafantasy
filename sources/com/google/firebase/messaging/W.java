package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17369a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17370b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17371c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f17373e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f17372d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f17374f = false;

    private W(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f17369a = sharedPreferences;
        this.f17370b = str;
        this.f17371c = str2;
        this.f17373e = executor;
    }

    private boolean b(boolean z8) {
        if (z8 && !this.f17374f) {
            i();
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static W c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        W w8 = new W(sharedPreferences, str, str2, executor);
        w8.d();
        return w8;
    }

    private void d() {
        synchronized (this.f17372d) {
            try {
                this.f17372d.clear();
                String string = this.f17369a.getString(this.f17370b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f17371c)) {
                    String[] split = string.split(this.f17371c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f17372d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f17372d) {
            this.f17369a.edit().putString(this.f17370b, g()).commit();
        }
    }

    private void i() {
        this.f17373e.execute(new Runnable() { // from class: com.google.firebase.messaging.V
            @Override // java.lang.Runnable
            public final void run() {
                W.this.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f17372d) {
            str = (String) this.f17372d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b8;
        synchronized (this.f17372d) {
            b8 = b(this.f17372d.remove(obj));
        }
        return b8;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f17372d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f17371c);
        }
        return sb.toString();
    }
}
