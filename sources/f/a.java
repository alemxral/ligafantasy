package F;

import android.util.SparseArray;
import java.util.HashMap;
import s.EnumC3702d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f2397a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f2398b;

    static {
        HashMap hashMap = new HashMap();
        f2398b = hashMap;
        hashMap.put(EnumC3702d.DEFAULT, 0);
        f2398b.put(EnumC3702d.VERY_LOW, 1);
        f2398b.put(EnumC3702d.HIGHEST, 2);
        for (EnumC3702d enumC3702d : f2398b.keySet()) {
            f2397a.append(((Integer) f2398b.get(enumC3702d)).intValue(), enumC3702d);
        }
    }

    public static int a(EnumC3702d enumC3702d) {
        Integer num = (Integer) f2398b.get(enumC3702d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC3702d);
    }

    public static EnumC3702d b(int i8) {
        EnumC3702d enumC3702d = (EnumC3702d) f2397a.get(i8);
        if (enumC3702d != null) {
            return enumC3702d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
