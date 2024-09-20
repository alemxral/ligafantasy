package w1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import s1.AbstractC3733a;
import s1.C3734b;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;
import u1.C3800a;
import v1.AbstractC3823d;

/* loaded from: classes3.dex */
public class l extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38959d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static int f38960e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38961f = "usnatv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38962c = new C3774e();

    public l() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38927a = hashMap;
        hashMap.put(v1.g.f38709a, new C3738f(6, Integer.valueOf(f38960e)));
        this.f38927a.put(v1.g.f38710b, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38711c, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38712d, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38713e, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38714f, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38715g, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38716h, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38717i, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38718j, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38719k, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38927a.put(v1.g.f38720l, new C3739g(2, Arrays.asList(0, 0)));
        this.f38927a.put(v1.g.f38721m, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38722n, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38723o, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38724p, new C3738f(2, 0));
        this.f38927a.put(v1.g.f38725q, new C3738f(2, 1));
        this.f38927a.put(v1.g.f38726r, new C3734b(Boolean.TRUE));
        this.f38927a.put(v1.g.f38727s, new C3734b(Boolean.FALSE));
        this.f38928b = new String[][]{new String[]{v1.g.f38709a, v1.g.f38710b, v1.g.f38711c, v1.g.f38712d, v1.g.f38713e, v1.g.f38714f, v1.g.f38715g, v1.g.f38716h, v1.g.f38717i, v1.g.f38718j, v1.g.f38719k, v1.g.f38720l, v1.g.f38721m, v1.g.f38722n, v1.g.f38723o, v1.g.f38724p}, new String[]{v1.g.f38725q, v1.g.f38727s}};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38962c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC3733a) this.f38927a.get(v1.g.f38726r)).c()).booleanValue()) {
                arrayList.add(this.f38962c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f38962c.c(split[i8]);
            String substring = c8.substring(0, 2);
            substring.hashCode();
            if (!substring.equals("00")) {
                if (substring.equals("01")) {
                    strArr[1] = c8;
                    z8 = true;
                } else {
                    throw new C3800a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
        ((AbstractC3733a) this.f38927a.get(AbstractC3823d.f38679n)).d(Boolean.valueOf(z8));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38959d;
    }

    public l(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
