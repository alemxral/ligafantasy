package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2952m implements BiConsumer, Supplier, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32563c;

    public /* synthetic */ C2952m(int i8, Object obj, Object obj2) {
        this.f32561a = i8;
        this.f32562b = obj;
        this.f32563c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f32561a) {
            case 2:
                ((C2961n3) this.f32562b).b((Consumer) this.f32563c, obj);
                return;
            case 3:
                if (obj == null) {
                    ((AtomicBoolean) this.f32562b).set(true);
                    return;
                } else {
                    ((ConcurrentHashMap) this.f32563c).putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            default:
                ((BiConsumer) this.f32562b).accept(this.f32563c, obj);
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Collectors.a((Function) this.f32562b, (Function) this.f32563c, (Map) obj, obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f32561a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C2977r0((EnumC3001w0) this.f32562b, (Predicate) this.f32563c);
    }
}
