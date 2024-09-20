package v;

import android.content.Context;

/* loaded from: classes3.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38566a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f38567b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f38568c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38569d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, E.a aVar, E.a aVar2, String str) {
        if (context != null) {
            this.f38566a = context;
            if (aVar != null) {
                this.f38567b = aVar;
                if (aVar2 != null) {
                    this.f38568c = aVar2;
                    if (str != null) {
                        this.f38569d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // v.h
    public Context b() {
        return this.f38566a;
    }

    @Override // v.h
    public String c() {
        return this.f38569d;
    }

    @Override // v.h
    public E.a d() {
        return this.f38568c;
    }

    @Override // v.h
    public E.a e() {
        return this.f38567b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f38566a.equals(hVar.b()) && this.f38567b.equals(hVar.e()) && this.f38568c.equals(hVar.d()) && this.f38569d.equals(hVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f38566a.hashCode() ^ 1000003) * 1000003) ^ this.f38567b.hashCode()) * 1000003) ^ this.f38568c.hashCode()) * 1000003) ^ this.f38569d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f38566a + ", wallClock=" + this.f38567b + ", monotonicClock=" + this.f38568c + ", backendName=" + this.f38569d + "}";
    }
}
