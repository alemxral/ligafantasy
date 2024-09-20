package s1;

import t1.n;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3741i extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37821b;

    public C3741i(int i8, String str) {
        this.f37821b = i8;
        d(str);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37816a = n.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return n.b((String) this.f37816a, this.f37821b);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f37821b * 6) + i8);
    }
}
