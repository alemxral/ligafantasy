package s1;

import t1.AbstractC3779j;

/* renamed from: s1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3738f extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37818b;

    public C3738f(int i8, Integer num) {
        this.f37818b = i8;
        d(num);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37816a = Integer.valueOf(AbstractC3779j.a(str));
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3779j.b(((Integer) this.f37816a).intValue(), this.f37818b);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, this.f37818b + i8);
    }
}
