package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public final class Gson {

    /* renamed from: A, reason: collision with root package name */
    static final c f17502A = b.f17538a;

    /* renamed from: B, reason: collision with root package name */
    static final q f17503B = p.f17788a;

    /* renamed from: C, reason: collision with root package name */
    static final q f17504C = p.f17789b;

    /* renamed from: z, reason: collision with root package name */
    static final String f17505z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f17506a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f17507b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.c f17508c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f17509d;

    /* renamed from: e, reason: collision with root package name */
    final List f17510e;

    /* renamed from: f, reason: collision with root package name */
    final Excluder f17511f;

    /* renamed from: g, reason: collision with root package name */
    final c f17512g;

    /* renamed from: h, reason: collision with root package name */
    final Map f17513h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f17514i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f17515j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f17516k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f17517l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f17518m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f17519n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f17520o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f17521p;

    /* renamed from: q, reason: collision with root package name */
    final String f17522q;

    /* renamed from: r, reason: collision with root package name */
    final int f17523r;

    /* renamed from: s, reason: collision with root package name */
    final int f17524s;

    /* renamed from: t, reason: collision with root package name */
    final n f17525t;

    /* renamed from: u, reason: collision with root package name */
    final List f17526u;

    /* renamed from: v, reason: collision with root package name */
    final List f17527v;

    /* renamed from: w, reason: collision with root package name */
    final q f17528w;

    /* renamed from: x, reason: collision with root package name */
    final q f17529x;

    /* renamed from: y, reason: collision with root package name */
    final List f17530y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private TypeAdapter f17535a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter f() {
            TypeAdapter typeAdapter = this.f17535a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(C3596a c3596a) {
            return f().b(c3596a);
        }

        @Override // com.google.gson.TypeAdapter
        public void d(p1.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter e() {
            return f();
        }

        public void g(TypeAdapter typeAdapter) {
            if (this.f17535a == null) {
                this.f17535a = typeAdapter;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }
    }

    public Gson() {
        this(Excluder.f17549g, f17502A, Collections.emptyMap(), false, false, false, true, false, false, false, true, n.f17780a, f17505z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f17503B, f17504C, Collections.emptyList());
    }

    private static void a(Object obj, C3596a c3596a) {
        if (obj != null) {
            try {
                if (c3596a.N() != EnumC3597b.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (p1.d e8) {
                throw new m(e8);
            } catch (IOException e9) {
                throw new g(e9);
            }
        }
    }

    private static TypeAdapter b(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicLong b(C3596a c3596a) {
                return new AtomicLong(((Number) TypeAdapter.this.b(c3596a)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.d(cVar, Long.valueOf(atomicLong.get()));
            }
        }.a();
    }

    private static TypeAdapter c(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray b(C3596a c3596a) {
                ArrayList arrayList = new ArrayList();
                c3596a.a();
                while (c3596a.t()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.b(c3596a)).longValue()));
                }
                c3596a.h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, AtomicLongArray atomicLongArray) {
                cVar.e();
                int length = atomicLongArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    TypeAdapter.this.d(cVar, Long.valueOf(atomicLongArray.get(i8)));
                }
                cVar.h();
            }
        }.a();
    }

    static void d(double d8) {
        if (!Double.isNaN(d8) && !Double.isInfinite(d8)) {
            return;
        }
        throw new IllegalArgumentException(d8 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private TypeAdapter e(boolean z8) {
        if (z8) {
            return TypeAdapters.f17680v;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Double b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return Double.valueOf(c3596a.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.d(doubleValue);
                cVar.M(doubleValue);
            }
        };
    }

    private TypeAdapter f(boolean z8) {
        if (z8) {
            return TypeAdapters.f17679u;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return Float.valueOf((float) c3596a.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.d(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.P(number);
            }
        };
    }

    private static TypeAdapter n(n nVar) {
        if (nVar == n.f17780a) {
            return TypeAdapters.f17678t;
        }
        return new TypeAdapter() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return Long.valueOf(c3596a.G());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                } else {
                    cVar.Q(number.toString());
                }
            }
        };
    }

    public Object g(Reader reader, TypeToken typeToken) {
        C3596a o8 = o(reader);
        Object j8 = j(o8, typeToken);
        a(j8, o8);
        return j8;
    }

    public Object h(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), typeToken);
    }

    public Object i(String str, Type type) {
        return h(str, TypeToken.b(type));
    }

    public Object j(C3596a c3596a, TypeToken typeToken) {
        boolean u8 = c3596a.u();
        boolean z8 = true;
        c3596a.S(true);
        try {
            try {
                try {
                    c3596a.N();
                    z8 = false;
                    return k(typeToken).b(c3596a);
                } catch (EOFException e8) {
                    if (z8) {
                        c3596a.S(u8);
                        return null;
                    }
                    throw new m(e8);
                } catch (IOException e9) {
                    throw new m(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
            } catch (IllegalStateException e11) {
                throw new m(e11);
            }
        } finally {
            c3596a.S(u8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r2.g(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.TypeAdapter k(com.google.gson.reflect.TypeToken r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f17507b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.f17506a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f17506a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.f17510e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.r r4 = (com.google.gson.r) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.a(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.g(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.f17506a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r6.f17507b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r0 = r6.f17506a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.k(com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public TypeAdapter l(Class cls) {
        return k(TypeToken.a(cls));
    }

    public TypeAdapter m(r rVar, TypeToken typeToken) {
        if (!this.f17510e.contains(rVar)) {
            rVar = this.f17509d;
        }
        boolean z8 = false;
        for (r rVar2 : this.f17510e) {
            if (!z8) {
                if (rVar2 == rVar) {
                    z8 = true;
                }
            } else {
                TypeAdapter a8 = rVar2.a(this, typeToken);
                if (a8 != null) {
                    return a8;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public C3596a o(Reader reader) {
        C3596a c3596a = new C3596a(reader);
        c3596a.S(this.f17519n);
        return c3596a;
    }

    public p1.c p(Writer writer) {
        if (this.f17516k) {
            writer.write(")]}'\n");
        }
        p1.c cVar = new p1.c(writer);
        if (this.f17518m) {
            cVar.I("  ");
        }
        cVar.H(this.f17517l);
        cVar.J(this.f17519n);
        cVar.K(this.f17514i);
        return cVar;
    }

    public String q(f fVar) {
        StringWriter stringWriter = new StringWriter();
        t(fVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        if (obj == null) {
            return q(h.f17547a);
        }
        return s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(f fVar, Appendable appendable) {
        try {
            u(fVar, p(com.google.gson.internal.l.b(appendable)));
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f17514i + ",factories:" + this.f17510e + ",instanceCreators:" + this.f17508c + "}";
    }

    public void u(f fVar, p1.c cVar) {
        boolean r8 = cVar.r();
        cVar.J(true);
        boolean o8 = cVar.o();
        cVar.H(this.f17517l);
        boolean m8 = cVar.m();
        cVar.K(this.f17514i);
        try {
            try {
                com.google.gson.internal.l.a(fVar, cVar);
            } catch (IOException e8) {
                throw new g(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.J(r8);
            cVar.H(o8);
            cVar.K(m8);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, p(com.google.gson.internal.l.b(appendable)));
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public void w(Object obj, Type type, p1.c cVar) {
        TypeAdapter k8 = k(TypeToken.b(type));
        boolean r8 = cVar.r();
        cVar.J(true);
        boolean o8 = cVar.o();
        cVar.H(this.f17517l);
        boolean m8 = cVar.m();
        cVar.K(this.f17514i);
        try {
            try {
                k8.d(cVar, obj);
            } catch (IOException e8) {
                throw new g(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.J(r8);
            cVar.H(o8);
            cVar.K(m8);
        }
    }

    Gson(Excluder excluder, c cVar, Map map, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, n nVar, String str, int i8, int i9, List list, List list2, List list3, q qVar, q qVar2, List list4) {
        this.f17506a = new ThreadLocal();
        this.f17507b = new ConcurrentHashMap();
        this.f17511f = excluder;
        this.f17512g = cVar;
        this.f17513h = map;
        com.google.gson.internal.c cVar2 = new com.google.gson.internal.c(map, z15, list4);
        this.f17508c = cVar2;
        this.f17514i = z8;
        this.f17515j = z9;
        this.f17516k = z10;
        this.f17517l = z11;
        this.f17518m = z12;
        this.f17519n = z13;
        this.f17520o = z14;
        this.f17521p = z15;
        this.f17525t = nVar;
        this.f17522q = str;
        this.f17523r = i8;
        this.f17524s = i9;
        this.f17526u = list;
        this.f17527v = list2;
        this.f17528w = qVar;
        this.f17529x = qVar2;
        this.f17530y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f17657W);
        arrayList.add(ObjectTypeAdapter.e(qVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f17637C);
        arrayList.add(TypeAdapters.f17671m);
        arrayList.add(TypeAdapters.f17665g);
        arrayList.add(TypeAdapters.f17667i);
        arrayList.add(TypeAdapters.f17669k);
        TypeAdapter n8 = n(nVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, n8));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.e(qVar2));
        arrayList.add(TypeAdapters.f17673o);
        arrayList.add(TypeAdapters.f17675q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(n8)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(n8)));
        arrayList.add(TypeAdapters.f17677s);
        arrayList.add(TypeAdapters.f17682x);
        arrayList.add(TypeAdapters.f17639E);
        arrayList.add(TypeAdapters.f17641G);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f17684z));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f17635A));
        arrayList.add(TypeAdapters.a(com.google.gson.internal.f.class, TypeAdapters.f17636B));
        arrayList.add(TypeAdapters.f17643I);
        arrayList.add(TypeAdapters.f17645K);
        arrayList.add(TypeAdapters.f17649O);
        arrayList.add(TypeAdapters.f17651Q);
        arrayList.add(TypeAdapters.f17655U);
        arrayList.add(TypeAdapters.f17647M);
        arrayList.add(TypeAdapters.f17662d);
        arrayList.add(DateTypeAdapter.f17575b);
        arrayList.add(TypeAdapters.f17653S);
        if (com.google.gson.internal.sql.a.f17773a) {
            arrayList.add(com.google.gson.internal.sql.a.f17777e);
            arrayList.add(com.google.gson.internal.sql.a.f17776d);
            arrayList.add(com.google.gson.internal.sql.a.f17778f);
        }
        arrayList.add(ArrayTypeAdapter.f17569c);
        arrayList.add(TypeAdapters.f17660b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2, z9));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f17509d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f17658X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f17510e = DesugarCollections.unmodifiableList(arrayList);
    }
}
