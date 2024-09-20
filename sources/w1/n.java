package w1;

import java.util.Arrays;
import java.util.HashMap;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;

/* loaded from: classes3.dex */
public class n extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38967d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static int f38968e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38969f = "usvav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38970c = new C3774e();

    public n() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38925a = hashMap;
        hashMap.put(v1.i.f38740a, new C3738f(6, Integer.valueOf(f38968e)));
        this.f38925a.put(v1.i.f38741b, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38742c, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38743d, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38744e, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38745f, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38746g, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38925a.put(v1.i.f38747h, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38748i, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38749j, new C3738f(2, 0));
        this.f38925a.put(v1.i.f38750k, new C3738f(2, 0));
        this.f38926b = new String[]{v1.i.f38740a, v1.i.f38741b, v1.i.f38742c, v1.i.f38743d, v1.i.f38744e, v1.i.f38745f, v1.i.f38746g, v1.i.f38747h, v1.i.f38748i, v1.i.f38749j, v1.i.f38750k};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38970c.d(e());
    }

    public void f(String str) {
        d(this.f38970c.c(str));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38967d;
    }

    public n(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
