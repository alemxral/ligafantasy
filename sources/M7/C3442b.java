package m7;

import D7.h;
import D7.i;
import D7.k;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3442b extends AbstractC3441a {

    /* renamed from: c, reason: collision with root package name */
    private int f35942c;

    /* renamed from: d, reason: collision with root package name */
    private int f35943d;

    /* renamed from: e, reason: collision with root package name */
    private D7.b f35944e;

    /* renamed from: f, reason: collision with root package name */
    private i f35945f;

    /* renamed from: g, reason: collision with root package name */
    private h f35946g;

    /* renamed from: h, reason: collision with root package name */
    private D7.a f35947h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f35948i;

    public C3442b(int i8, int i9, D7.b bVar, i iVar, D7.a aVar, h hVar, String str) {
        super(true, str);
        this.f35942c = i8;
        this.f35943d = i9;
        this.f35944e = bVar;
        this.f35945f = iVar;
        this.f35947h = aVar;
        this.f35946g = hVar;
        this.f35948i = new k(bVar, iVar).c();
    }

    public D7.b b() {
        return this.f35944e;
    }

    public i c() {
        return this.f35945f;
    }

    public D7.a d() {
        return this.f35947h;
    }

    public int e() {
        return this.f35943d;
    }

    public int f() {
        return this.f35942c;
    }

    public h g() {
        return this.f35946g;
    }

    public C3442b(int i8, int i9, D7.b bVar, i iVar, h hVar, String str) {
        this(i8, i9, bVar, iVar, D7.c.a(bVar, iVar), hVar, str);
    }
}
