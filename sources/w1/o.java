package w1;

import java.util.HashMap;
import java.util.Map;
import u1.C3800a;

/* loaded from: classes3.dex */
public class o implements InterfaceC3842c {

    /* renamed from: b, reason: collision with root package name */
    public static int f38971b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static int f38972c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static String f38973d = "uspv1";

    /* renamed from: a, reason: collision with root package name */
    protected Map f38974a;

    public o() {
        e();
    }

    private void e() {
        HashMap hashMap = new HashMap();
        this.f38974a = hashMap;
        hashMap.put(v1.j.f38751a, Integer.valueOf(f38972c));
        this.f38974a.put(v1.j.f38752b, "-");
        this.f38974a.put(v1.j.f38753c, "-");
        this.f38974a.put(v1.j.f38754d, "-");
    }

    @Override // w1.InterfaceC3842c
    public void a(String str, Object obj) {
        if (this.f38974a.containsKey(str)) {
            this.f38974a.put(str, obj);
            return;
        }
        throw new u1.c(str + " not found");
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return ((("" + c(v1.j.f38751a)) + c(v1.j.f38752b)) + c(v1.j.f38753c)) + c(v1.j.f38754d);
    }

    @Override // w1.InterfaceC3842c
    public Object c(String str) {
        if (this.f38974a.containsKey(str)) {
            return this.f38974a.get(str);
        }
        return null;
    }

    public void d(String str) {
        try {
            a(v1.j.f38751a, Integer.valueOf(Integer.parseInt(String.valueOf(str.charAt(0)))));
            a(v1.j.f38752b, String.valueOf(str.charAt(1)));
            a(v1.j.f38753c, String.valueOf(str.charAt(2)));
            a(v1.j.f38754d, String.valueOf(str.charAt(3)));
        } catch (u1.c e8) {
            throw new C3800a(e8);
        }
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38971b;
    }

    public o(String str) {
        e();
        if (str == null || str.length() <= 0) {
            return;
        }
        d(str);
    }
}
