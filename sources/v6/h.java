package v6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class h {

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f38898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f38899b;

        a(f fVar) {
            this.f38899b = fVar;
            this.f38898a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f38899b;
            int e8 = fVar.e();
            int i8 = this.f38898a;
            this.f38898a = i8 - 1;
            return fVar.h(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38898a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f38900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f38901b;

        b(f fVar) {
            this.f38901b = fVar;
            this.f38900a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f38901b;
            int e8 = fVar.e();
            int i8 = this.f38900a;
            this.f38900a = i8 - 1;
            return fVar.f(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38900a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Iterable, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38902a;

        public c(f fVar) {
            this.f38902a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f38902a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterable, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38903a;

        public d(f fVar) {
            this.f38903a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f38903a);
        }
    }

    public static final Iterable a(f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        return new d(fVar);
    }
}
