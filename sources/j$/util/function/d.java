package j$.util.function;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f32195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f32196c;

    public /* synthetic */ d(Function function, Function function2, int i8) {
        this.f32194a = i8;
        this.f32195b = function;
        this.f32196c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f32194a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f32194a) {
            case 0:
                return this.f32196c.apply(this.f32195b.apply(obj));
            default:
                return this.f32195b.apply(this.f32196c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f32194a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
