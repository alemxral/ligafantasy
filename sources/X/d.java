package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f39069c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f39070a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39071b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f39072a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f39073b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f39072a, DesugarCollections.unmodifiableList(this.f39073b));
        }

        public a b(List list) {
            this.f39073b = list;
            return this;
        }

        public a c(String str) {
            this.f39072a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f39070a = str;
        this.f39071b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f39071b;
    }

    public String b() {
        return this.f39070a;
    }
}
