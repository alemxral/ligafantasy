package I0;

import H0.C1178l;
import I0.h;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final d f3712a;

    /* renamed from: b, reason: collision with root package name */
    private final C1178l f3713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3714c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3715d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f3716e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicMarkableReference f3717f = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f3718a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f3719b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3720c;

        public a(boolean z8) {
            int i8;
            this.f3720c = z8;
            if (z8) {
                i8 = 8192;
            } else {
                i8 = 1024;
            }
            this.f3718a = new AtomicMarkableReference(new b(64, i8), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.f3719b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: I0.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c8;
                    c8 = h.a.this.c();
                    return c8;
                }
            };
            if (androidx.compose.animation.core.d.a(this.f3719b, null, callable)) {
                h.this.f3713b.g(callable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f3718a.isMarked()) {
                        map = ((b) this.f3718a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f3718a;
                        atomicMarkableReference.set((b) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                h.this.f3712a.k(h.this.f3714c, map, this.f3720c);
            }
        }

        public Map b() {
            return ((b) this.f3718a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((b) this.f3718a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f3718a;
                    atomicMarkableReference.set((b) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public h(String str, M0.f fVar, C1178l c1178l) {
        this.f3714c = str;
        this.f3712a = new d(fVar);
        this.f3713b = c1178l;
    }

    public static h f(String str, M0.f fVar, C1178l c1178l) {
        d dVar = new d(fVar);
        h hVar = new h(str, fVar, c1178l);
        ((b) hVar.f3715d.f3718a.getReference()).e(dVar.g(str, false));
        ((b) hVar.f3716e.f3718a.getReference()).e(dVar.g(str, true));
        hVar.f3717f.set(dVar.h(str), false);
        return hVar;
    }

    public static String g(String str, M0.f fVar) {
        return new d(fVar).h(str);
    }

    public Map d() {
        return this.f3715d.b();
    }

    public Map e() {
        return this.f3716e.b();
    }

    public boolean h(String str, String str2) {
        return this.f3716e.f(str, str2);
    }
}
