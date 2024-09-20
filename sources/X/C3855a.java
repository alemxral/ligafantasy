package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u.m;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3855a {

    /* renamed from: e, reason: collision with root package name */
    private static final C3855a f39043e = new C0907a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f39044a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39045b;

    /* renamed from: c, reason: collision with root package name */
    private final C3856b f39046c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39047d;

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0907a {

        /* renamed from: a, reason: collision with root package name */
        private f f39048a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f39049b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C3856b f39050c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f39051d = "";

        C0907a() {
        }

        public C0907a a(d dVar) {
            this.f39049b.add(dVar);
            return this;
        }

        public C3855a b() {
            return new C3855a(this.f39048a, DesugarCollections.unmodifiableList(this.f39049b), this.f39050c, this.f39051d);
        }

        public C0907a c(String str) {
            this.f39051d = str;
            return this;
        }

        public C0907a d(C3856b c3856b) {
            this.f39050c = c3856b;
            return this;
        }

        public C0907a e(f fVar) {
            this.f39048a = fVar;
            return this;
        }
    }

    C3855a(f fVar, List list, C3856b c3856b, String str) {
        this.f39044a = fVar;
        this.f39045b = list;
        this.f39046c = c3856b;
        this.f39047d = str;
    }

    public static C0907a e() {
        return new C0907a();
    }

    public String a() {
        return this.f39047d;
    }

    public C3856b b() {
        return this.f39046c;
    }

    public List c() {
        return this.f39045b;
    }

    public f d() {
        return this.f39044a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
