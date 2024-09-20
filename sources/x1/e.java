package X1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f12192a;

    /* renamed from: b, reason: collision with root package name */
    public f f12193b;

    /* renamed from: c, reason: collision with root package name */
    public f f12194c;

    public e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.f12192a = concurrentHashMap;
        concurrentHashMap.put(Date.class, b.f12191c);
        concurrentHashMap.put(int[].class, a.f12175c);
        concurrentHashMap.put(Integer[].class, a.f12176d);
        concurrentHashMap.put(short[].class, a.f12175c);
        concurrentHashMap.put(Short[].class, a.f12176d);
        concurrentHashMap.put(long[].class, a.f12183k);
        concurrentHashMap.put(Long[].class, a.f12184l);
        concurrentHashMap.put(byte[].class, a.f12179g);
        concurrentHashMap.put(Byte[].class, a.f12180h);
        concurrentHashMap.put(char[].class, a.f12181i);
        concurrentHashMap.put(Character[].class, a.f12182j);
        concurrentHashMap.put(float[].class, a.f12185m);
        concurrentHashMap.put(Float[].class, a.f12186n);
        concurrentHashMap.put(double[].class, a.f12187o);
        concurrentHashMap.put(Double[].class, a.f12188p);
        concurrentHashMap.put(boolean[].class, a.f12189q);
        concurrentHashMap.put(Boolean[].class, a.f12190r);
        this.f12193b = new c(this);
        this.f12194c = new d(this);
        concurrentHashMap.put(T1.c.class, this.f12193b);
        concurrentHashMap.put(T1.b.class, this.f12193b);
        concurrentHashMap.put(T1.a.class, this.f12193b);
        concurrentHashMap.put(T1.d.class, this.f12193b);
    }
}
