package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends l {

    /* renamed from: e, reason: collision with root package name */
    final l[] f32140e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.f32140e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i8, Object obj) {
        int length;
        l k8;
        Object obj2;
        l[] lVarArr = this.f32140e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (k8 = ConcurrentHashMap.k(lVarArr, (length - 1) & i8)) != null) {
            do {
                int i9 = k8.f32147a;
                if (i9 == i8 && ((obj2 = k8.f32148b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return k8;
                }
                if (i9 >= 0) {
                    k8 = k8.f32150d;
                } else {
                    if (!(k8 instanceof g)) {
                        return k8.a(i8, obj);
                    }
                    lVarArr = ((g) k8).f32140e;
                }
            } while (k8 != null);
        }
        return null;
    }
}
