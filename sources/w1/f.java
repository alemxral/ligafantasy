package w1;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static List f38933a;

    /* renamed from: b, reason: collision with root package name */
    public static Map f38934b;

    static {
        HashMap hashMap = new HashMap();
        f38934b = hashMap;
        hashMap.put(Integer.valueOf(h.f38941d), h.f38943f);
        f38934b.put(Integer.valueOf(g.f38935d), g.f38937f);
        f38934b.put(Integer.valueOf(o.f38971b), o.f38973d);
        f38934b.put(Integer.valueOf(l.f38959d), l.f38961f);
        f38934b.put(Integer.valueOf(i.f38947d), i.f38949f);
        f38934b.put(Integer.valueOf(n.f38967d), n.f38969f);
        f38934b.put(Integer.valueOf(j.f38951d), j.f38953f);
        f38934b.put(Integer.valueOf(m.f38963d), m.f38965f);
        f38934b.put(Integer.valueOf(k.f38955d), k.f38957f);
        f38933a = (List) Collection.EL.stream(new ArrayList(f38934b.keySet())).sorted().map(new Function() { // from class: w1.e
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String b8;
                b8 = f.b((Integer) obj);
                return b8;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Integer num) {
        return (String) f38934b.get(num);
    }
}
