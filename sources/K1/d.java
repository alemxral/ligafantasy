package K1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final d f5716e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f5717f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f5718g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f5719h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f5720i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f5721j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f5722k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f5723l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f5724m;

    /* renamed from: d, reason: collision with root package name */
    private final int f5725d;

    static {
        x xVar = x.REQUIRED;
        f5716e = new d("A128CBC-HS256", xVar, 256);
        x xVar2 = x.OPTIONAL;
        f5717f = new d("A192CBC-HS384", xVar2, 384);
        f5718g = new d("A256CBC-HS512", xVar, 512);
        f5719h = new d("A128CBC+HS256", xVar2, 256);
        f5720i = new d("A256CBC+HS512", xVar2, 512);
        x xVar3 = x.RECOMMENDED;
        f5721j = new d("A128GCM", xVar3, 128);
        f5722k = new d("A192GCM", xVar2, PsExtractor.AUDIO_STREAM);
        f5723l = new d("A256GCM", xVar3, 256);
        f5724m = new d("XC20P", xVar2, 256);
    }

    public d(String str, x xVar, int i8) {
        super(str, xVar);
        this.f5725d = i8;
    }

    public static d d(String str) {
        d dVar = f5716e;
        if (str.equals(dVar.a())) {
            return dVar;
        }
        d dVar2 = f5717f;
        if (str.equals(dVar2.a())) {
            return dVar2;
        }
        d dVar3 = f5718g;
        if (str.equals(dVar3.a())) {
            return dVar3;
        }
        d dVar4 = f5721j;
        if (str.equals(dVar4.a())) {
            return dVar4;
        }
        d dVar5 = f5722k;
        if (str.equals(dVar5.a())) {
            return dVar5;
        }
        d dVar6 = f5723l;
        if (str.equals(dVar6.a())) {
            return dVar6;
        }
        d dVar7 = f5719h;
        if (str.equals(dVar7.a())) {
            return dVar7;
        }
        d dVar8 = f5720i;
        if (str.equals(dVar8.a())) {
            return dVar8;
        }
        d dVar9 = f5724m;
        if (str.equals(dVar9.a())) {
            return dVar9;
        }
        return new d(str);
    }

    public int c() {
        return this.f5725d;
    }

    public d(String str) {
        this(str, null, 0);
    }
}
