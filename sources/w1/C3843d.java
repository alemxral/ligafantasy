package w1;

import java.util.ArrayList;
import java.util.HashMap;
import s1.AbstractC3733a;
import s1.C3736d;
import s1.C3738f;
import t1.AbstractC3772c;
import t1.C3774e;
import v1.AbstractC3820a;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3843d extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38929d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f38930e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38931f = "header";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38932c = new C3774e();

    public C3843d() {
        h();
    }

    private void h() {
        HashMap hashMap = new HashMap();
        this.f38925a = hashMap;
        hashMap.put(AbstractC3820a.f38613a, new C3738f(6, Integer.valueOf(f38929d)));
        this.f38925a.put(AbstractC3820a.f38614b, new C3738f(6, Integer.valueOf(f38930e)));
        this.f38925a.put(AbstractC3820a.f38615c, new C3736d(new ArrayList()));
        this.f38926b = new String[]{AbstractC3820a.f38613a, AbstractC3820a.f38614b, AbstractC3820a.f38615c};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38932c.d(e());
    }

    public void f(String str) {
        d(this.f38932c.c(str));
    }

    public Integer g() {
        return (Integer) ((AbstractC3733a) this.f38925a.get(AbstractC3820a.f38614b)).c();
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38929d;
    }

    public C3843d(String str) {
        h();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
