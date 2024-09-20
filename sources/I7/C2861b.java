package i7;

import f7.C2693b;
import f7.InterfaceC2692a;
import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C2861b implements InterfaceC2692a {

    /* renamed from: e, reason: collision with root package name */
    private static Permission f31811e = new C2693b("BC", "threadLocalEcImplicitlyCa");

    /* renamed from: f, reason: collision with root package name */
    private static Permission f31812f = new C2693b("BC", "ecImplicitlyCa");

    /* renamed from: g, reason: collision with root package name */
    private static Permission f31813g = new C2693b("BC", "threadLocalDhDefaultParams");

    /* renamed from: h, reason: collision with root package name */
    private static Permission f31814h = new C2693b("BC", "DhDefaultParams");

    /* renamed from: i, reason: collision with root package name */
    private static Permission f31815i = new C2693b("BC", "acceptableEcCurves");

    /* renamed from: j, reason: collision with root package name */
    private static Permission f31816j = new C2693b("BC", "additionalEcParameters");

    /* renamed from: a, reason: collision with root package name */
    private ThreadLocal f31817a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private ThreadLocal f31818b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    private volatile Set f31819c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f31820d = new HashMap();
}
