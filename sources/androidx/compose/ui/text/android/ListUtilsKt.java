package androidx.compose.ui.text.android;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            function1.invoke(list.get(i8));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c8, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            c8.add(function1.invoke(list.get(i8)));
        }
        return c8;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, X5.n nVar) {
        if (list.size() != 0 && list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            T t8 = list.get(0);
            int o8 = AbstractC1246t.o(list);
            while (i8 < o8) {
                i8++;
                T t9 = list.get(i8);
                arrayList.add(nVar.invoke(t8, t9));
                t8 = t9;
            }
            return arrayList;
        }
        return AbstractC1246t.m();
    }
}
