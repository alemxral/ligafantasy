package M5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: M5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1249w extends AbstractC1248v {
    public static int x(Iterable iterable, int i8) {
        AbstractC3159y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i8;
    }

    public static final Integer y(Iterable iterable) {
        AbstractC3159y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List z(Iterable iterable) {
        AbstractC3159y.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC1246t.D(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
