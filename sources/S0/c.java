package S0;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f8927a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8928b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f8929a;

        /* renamed from: b, reason: collision with root package name */
        private Map f8930b = null;

        b(String str) {
            this.f8929a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f8929a;
            if (this.f8930b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.f8930b));
            }
            return new c(str, unmodifiableMap);
        }

        public b b(Annotation annotation) {
            if (this.f8930b == null) {
                this.f8930b = new HashMap();
            }
            this.f8930b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f8927a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f8928b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8927a.equals(cVar.f8927a) && this.f8928b.equals(cVar.f8928b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8927a.hashCode() * 31) + this.f8928b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f8927a + ", properties=" + this.f8928b.values() + "}";
    }

    private c(String str, Map map) {
        this.f8927a = str;
        this.f8928b = map;
    }
}
