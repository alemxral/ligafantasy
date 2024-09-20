package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    l[] f32155a;

    /* renamed from: b, reason: collision with root package name */
    l f32156b = null;

    /* renamed from: c, reason: collision with root package name */
    o f32157c;

    /* renamed from: d, reason: collision with root package name */
    o f32158d;

    /* renamed from: e, reason: collision with root package name */
    int f32159e;

    /* renamed from: f, reason: collision with root package name */
    int f32160f;

    /* renamed from: g, reason: collision with root package name */
    int f32161g;

    /* renamed from: h, reason: collision with root package name */
    final int f32162h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i8, int i9, int i10) {
        this.f32155a = lVarArr;
        this.f32162h = i8;
        this.f32159e = i9;
        this.f32160f = i9;
        this.f32161g = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i8;
        o oVar;
        o oVar2;
        l lVar = this.f32156b;
        if (lVar != null) {
            lVar = lVar.f32150d;
        }
        while (lVar == null) {
            if (this.f32160f >= this.f32161g || (lVarArr = this.f32155a) == null || (length = lVarArr.length) <= (i8 = this.f32159e) || i8 < 0) {
                this.f32156b = null;
                return null;
            }
            l k8 = ConcurrentHashMap.k(lVarArr, i8);
            if (k8 == null || k8.f32147a >= 0) {
                lVar = k8;
            } else if (k8 instanceof g) {
                this.f32155a = ((g) k8).f32140e;
                o oVar3 = this.f32158d;
                if (oVar3 != null) {
                    this.f32158d = oVar3.f32154d;
                    oVar2 = oVar3;
                } else {
                    oVar2 = new Object();
                }
                oVar2.f32153c = lVarArr;
                oVar2.f32151a = length;
                oVar2.f32152b = i8;
                oVar2.f32154d = this.f32157c;
                this.f32157c = oVar2;
                lVar = null;
            } else {
                lVar = k8 instanceof q ? ((q) k8).f32166f : null;
            }
            if (this.f32157c != null) {
                while (true) {
                    oVar = this.f32157c;
                    if (oVar == null) {
                        break;
                    }
                    int i9 = this.f32159e;
                    int i10 = oVar.f32151a;
                    int i11 = i9 + i10;
                    this.f32159e = i11;
                    if (i11 < length) {
                        break;
                    }
                    this.f32159e = oVar.f32152b;
                    this.f32155a = oVar.f32153c;
                    oVar.f32153c = null;
                    o oVar4 = oVar.f32154d;
                    oVar.f32154d = this.f32158d;
                    this.f32157c = oVar4;
                    this.f32158d = oVar;
                    length = i10;
                }
                if (oVar == null) {
                    int i12 = this.f32159e + this.f32162h;
                    this.f32159e = i12;
                    if (i12 >= length) {
                        int i13 = this.f32160f + 1;
                        this.f32160f = i13;
                        this.f32159e = i13;
                    }
                }
            } else {
                int i14 = i8 + this.f32162h;
                this.f32159e = i14;
                if (i14 >= length) {
                    int i15 = this.f32160f + 1;
                    this.f32160f = i15;
                    this.f32159e = i15;
                }
            }
        }
        this.f32156b = lVar;
        return lVar;
    }
}
