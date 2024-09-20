package n3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class u implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f36106a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f36107b;

    public u(s sVar, I5.a aVar) {
        this.f36106a = sVar;
        this.f36107b = aVar;
    }

    public static u a(s sVar, I5.a aVar) {
        return new u(sVar, aVar);
    }

    public static boolean c(s sVar, Context context) {
        return sVar.b(context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f36106a, (Context) this.f36107b.get()));
    }
}
