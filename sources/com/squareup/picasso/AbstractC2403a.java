package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2403a {

    /* renamed from: a, reason: collision with root package name */
    final s f23193a;

    /* renamed from: b, reason: collision with root package name */
    final v f23194b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f23195c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23196d;

    /* renamed from: e, reason: collision with root package name */
    final int f23197e;

    /* renamed from: f, reason: collision with root package name */
    final int f23198f;

    /* renamed from: g, reason: collision with root package name */
    final int f23199g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f23200h;

    /* renamed from: i, reason: collision with root package name */
    final String f23201i;

    /* renamed from: j, reason: collision with root package name */
    final Object f23202j;

    /* renamed from: k, reason: collision with root package name */
    boolean f23203k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23204l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0440a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2403a f23205a;

        C0440a(AbstractC2403a abstractC2403a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f23205a = abstractC2403a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2403a(s sVar, Object obj, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z8) {
        C0440a c0440a;
        this.f23193a = sVar;
        this.f23194b = vVar;
        if (obj == null) {
            c0440a = null;
        } else {
            c0440a = new C0440a(this, obj, sVar.f23313j);
        }
        this.f23195c = c0440a;
        this.f23197e = i8;
        this.f23198f = i9;
        this.f23196d = z8;
        this.f23199g = i10;
        this.f23200h = drawable;
        this.f23201i = str;
        this.f23202j = obj2 == null ? this : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f23204l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, s.e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f23201i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f23197e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f23198f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s g() {
        return this.f23193a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f h() {
        return this.f23194b.f23370t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v i() {
        return this.f23194b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object j() {
        return this.f23202j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object k() {
        WeakReference weakReference = this.f23195c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f23204l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f23203k;
    }
}
