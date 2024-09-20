package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2917f implements InterfaceC2927h {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f32523a;

    private /* synthetic */ C2917f(BaseStream baseStream) {
        this.f32523a = baseStream;
    }

    public static /* synthetic */ InterfaceC2927h w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C2922g ? ((C2922g) baseStream).f32528a : baseStream instanceof DoubleStream ? E.w((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C2958n0.w((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C2901b3.w((java.util.stream.Stream) baseStream) : new C2917f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f32523a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f32523a;
        if (obj instanceof C2917f) {
            obj = ((C2917f) obj).f32523a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32523a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ boolean isParallel() {
        return this.f32523a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f32523a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h onClose(Runnable runnable) {
        return w(this.f32523a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h parallel() {
        return w(this.f32523a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* synthetic */ InterfaceC2927h sequential() {
        return w(this.f32523a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f32523a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final /* synthetic */ InterfaceC2927h unordered() {
        return w(this.f32523a.unordered());
    }
}
