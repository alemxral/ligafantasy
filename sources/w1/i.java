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
public class i extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38947d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static int f38948e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38949f = "uscav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38950c = new C3774e();

    public i() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38927a = hashMap;
        hashMap.put(AbstractC3823d.f38666a, new C3738f(6, Integer.valueOf(f38948e)));
        this.f38927a.put(AbstractC3823d.f38667b, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38668c, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38669d, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38670e, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38671f, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38672g, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38927a.put(AbstractC3823d.f38673h, new C3739g(2, Arrays.asList(0, 0)));
        this.f38927a.put(AbstractC3823d.f38674i, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38675j, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38676k, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38677l, new C3738f(2, 0));
        this.f38927a.put(AbstractC3823d.f38678m, new C3738f(2, 1));
        this.f38927a.put(AbstractC3823d.f38679n, new C3734b(Boolean.TRUE));
        this.f38927a.put(AbstractC3823d.f38680o, new C3734b(Boolean.FALSE));
        this.f38928b = new String[][]{new String[]{AbstractC3823d.f38666a, AbstractC3823d.f38667b, AbstractC3823d.f38668c, AbstractC3823d.f38669d, AbstractC3823d.f38670e, AbstractC3823d.f38671f, AbstractC3823d.f38672g, AbstractC3823d.f38673h, AbstractC3823d.f38674i, AbstractC3823d.f38675j, AbstractC3823d.f38676k, AbstractC3823d.f38677l}, new String[]{AbstractC3823d.f38678m, AbstractC3823d.f38680o}};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38950c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC3733a) this.f38927a.get(AbstractC3823d.f38679n)).c()).booleanValue()) {
                arrayList.add(this.f38950c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f38950c.c(split[i8]);
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
        return f38947d;
    }

    public i(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
