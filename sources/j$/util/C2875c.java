package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2875c implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f32107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32108c;

    public /* synthetic */ C2875c(Comparator comparator, Object obj, int i8) {
        this.f32106a = i8;
        this.f32107b = comparator;
        this.f32108c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32106a) {
            case 0:
                int compare = this.f32107b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f32108c).compare(obj, obj2);
            default:
                Function function = (Function) this.f32108c;
                return this.f32107b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
