package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f32144a;

    /* renamed from: b, reason: collision with root package name */
    Object f32145b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f32146c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f32144a = obj;
        this.f32145b = obj2;
        this.f32146c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f32144a) || key.equals(obj2)) && (value == (obj3 = this.f32145b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f32144a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32145b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f32144a.hashCode() ^ this.f32145b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f32145b;
        this.f32145b = obj;
        this.f32146c.put(this.f32144a, obj);
        return obj2;
    }

    public final String toString() {
        return u.b(this.f32144a, this.f32145b);
    }
}
