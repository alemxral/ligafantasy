package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final int f32147a;

    /* renamed from: b, reason: collision with root package name */
    final Object f32148b;

    /* renamed from: c, reason: collision with root package name */
    volatile Object f32149c;

    /* renamed from: d, reason: collision with root package name */
    volatile l f32150d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i8, Object obj, Object obj2) {
        this.f32147a = i8;
        this.f32148b = obj;
        this.f32149c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i8, Object obj, Object obj2, l lVar) {
        this(i8, obj, obj2);
        this.f32150d = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(int i8, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        l lVar = this;
        do {
            if (lVar.f32147a == i8 && ((obj2 = lVar.f32148b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f32150d;
        } while (lVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f32148b) || key.equals(obj2)) && (value == (obj3 = this.f32149c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f32148b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32149c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f32148b.hashCode() ^ this.f32149c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return u.b(this.f32148b, this.f32149c);
    }
}
