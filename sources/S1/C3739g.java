package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: s1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3739g extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37819b;

    /* renamed from: c, reason: collision with root package name */
    private int f37820c;

    public C3739g(int i8, List list) {
        this.f37819b = i8;
        this.f37820c = list.size();
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37816a = t1.k.a(str, this.f37819b, this.f37820c);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return t1.k.b((List) this.f37816a, this.f37819b, this.f37820c);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f37820c; size++) {
            arrayList.add(0);
        }
        int size2 = arrayList.size();
        int i8 = this.f37820c;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f37819b * this.f37820c) + i8);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
