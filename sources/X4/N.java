package X4;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private C1501k f12406a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f12407b;

    /* renamed from: c, reason: collision with root package name */
    private int f12408c;

    public N(C1501k category, ArrayList apps, int i8) {
        AbstractC3159y.i(category, "category");
        AbstractC3159y.i(apps, "apps");
        this.f12406a = category;
        this.f12407b = apps;
        this.f12408c = i8;
    }

    public final ArrayList a() {
        return this.f12407b;
    }

    public final C1501k b() {
        return this.f12406a;
    }

    public final int c() {
        return this.f12408c;
    }

    public final void d(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f12407b = arrayList;
    }

    public final void e(C1501k c1501k) {
        AbstractC3159y.i(c1501k, "<set-?>");
        this.f12406a = c1501k;
    }

    public final void f(int i8) {
        this.f12408c = i8;
    }

    public /* synthetic */ N(C1501k c1501k, ArrayList arrayList, int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? new C1501k(0, null, null, 7, null) : c1501k, (i9 & 2) != 0 ? new ArrayList() : arrayList, (i9 & 4) != 0 ? 0 : i8);
    }
}
