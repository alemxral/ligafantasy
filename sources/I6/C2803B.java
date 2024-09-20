package i6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2803B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31658a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2833m f31659b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f31660c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31661d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f31662e;

    public C2803B(Object obj, AbstractC2833m abstractC2833m, Function1 function1, Object obj2, Throwable th) {
        this.f31658a = obj;
        this.f31659b = abstractC2833m;
        this.f31660c = function1;
        this.f31661d = obj2;
        this.f31662e = th;
    }

    public static /* synthetic */ C2803B b(C2803B c2803b, Object obj, AbstractC2833m abstractC2833m, Function1 function1, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = c2803b.f31658a;
        }
        if ((i8 & 2) != 0) {
            abstractC2833m = c2803b.f31659b;
        }
        AbstractC2833m abstractC2833m2 = abstractC2833m;
        if ((i8 & 4) != 0) {
            function1 = c2803b.f31660c;
        }
        Function1 function12 = function1;
        if ((i8 & 8) != 0) {
            obj2 = c2803b.f31661d;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = c2803b.f31662e;
        }
        return c2803b.a(obj, abstractC2833m2, function12, obj4, th);
    }

    public final C2803B a(Object obj, AbstractC2833m abstractC2833m, Function1 function1, Object obj2, Throwable th) {
        return new C2803B(obj, abstractC2833m, function1, obj2, th);
    }

    public final boolean c() {
        if (this.f31662e != null) {
            return true;
        }
        return false;
    }

    public final void d(C2839p c2839p, Throwable th) {
        AbstractC2833m abstractC2833m = this.f31659b;
        if (abstractC2833m != null) {
            c2839p.l(abstractC2833m, th);
        }
        Function1 function1 = this.f31660c;
        if (function1 != null) {
            c2839p.m(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2803B)) {
            return false;
        }
        C2803B c2803b = (C2803B) obj;
        if (AbstractC3159y.d(this.f31658a, c2803b.f31658a) && AbstractC3159y.d(this.f31659b, c2803b.f31659b) && AbstractC3159y.d(this.f31660c, c2803b.f31660c) && AbstractC3159y.d(this.f31661d, c2803b.f31661d) && AbstractC3159y.d(this.f31662e, c2803b.f31662e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f31658a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        AbstractC2833m abstractC2833m = this.f31659b;
        if (abstractC2833m == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC2833m.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Function1 function1 = this.f31660c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Object obj2 = this.f31661d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Throwable th = this.f31662e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f31658a + ", cancelHandler=" + this.f31659b + ", onCancellation=" + this.f31660c + ", idempotentResume=" + this.f31661d + ", cancelCause=" + this.f31662e + ')';
    }

    public /* synthetic */ C2803B(Object obj, AbstractC2833m abstractC2833m, Function1 function1, Object obj2, Throwable th, int i8, AbstractC3151p abstractC3151p) {
        this(obj, (i8 & 2) != 0 ? null : abstractC2833m, (i8 & 4) != 0 ? null : function1, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
