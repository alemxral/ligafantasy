package w1;

import java.util.Arrays;
import java.util.HashMap;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;

/* loaded from: classes3.dex */
public class m extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38963d = 11;

    /* renamed from: e, reason: collision with root package name */
    public static int f38964e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38965f = "usutv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38966c = new C3774e();

    public m() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38925a = hashMap;
        hashMap.put(v1.h.f38728a, new C3738f(6, Integer.valueOf(f38964e)));
        this.f38925a.put(v1.h.f38729b, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38730c, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38731d, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38732e, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38733f, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38734g, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38735h, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38925a.put(v1.h.f38736i, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38737j, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38738k, new C3738f(2, 0));
        this.f38925a.put(v1.h.f38739l, new C3738f(2, 0));
        this.f38926b = new String[]{v1.h.f38728a, v1.h.f38729b, v1.h.f38730c, v1.h.f38731d, v1.h.f38732e, v1.h.f38733f, v1.h.f38734g, v1.h.f38735h, v1.h.f38736i, v1.h.f38737j, v1.h.f38738k, v1.h.f38739l};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38966c.d(e());
    }

    public void f(String str) {
        d(this.f38966c.c(str));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38963d;
    }

    public m(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
