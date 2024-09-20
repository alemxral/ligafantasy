package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import m1.c;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public abstract class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter f17635A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeAdapter f17636B;

    /* renamed from: C, reason: collision with root package name */
    public static final r f17637C;

    /* renamed from: D, reason: collision with root package name */
    public static final TypeAdapter f17638D;

    /* renamed from: E, reason: collision with root package name */
    public static final r f17639E;

    /* renamed from: F, reason: collision with root package name */
    public static final TypeAdapter f17640F;

    /* renamed from: G, reason: collision with root package name */
    public static final r f17641G;

    /* renamed from: H, reason: collision with root package name */
    public static final TypeAdapter f17642H;

    /* renamed from: I, reason: collision with root package name */
    public static final r f17643I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter f17644J;

    /* renamed from: K, reason: collision with root package name */
    public static final r f17645K;

    /* renamed from: L, reason: collision with root package name */
    public static final TypeAdapter f17646L;

    /* renamed from: M, reason: collision with root package name */
    public static final r f17647M;

    /* renamed from: N, reason: collision with root package name */
    public static final TypeAdapter f17648N;

    /* renamed from: O, reason: collision with root package name */
    public static final r f17649O;

    /* renamed from: P, reason: collision with root package name */
    public static final TypeAdapter f17650P;

    /* renamed from: Q, reason: collision with root package name */
    public static final r f17651Q;

    /* renamed from: R, reason: collision with root package name */
    public static final TypeAdapter f17652R;

    /* renamed from: S, reason: collision with root package name */
    public static final r f17653S;

    /* renamed from: T, reason: collision with root package name */
    public static final TypeAdapter f17654T;

    /* renamed from: U, reason: collision with root package name */
    public static final r f17655U;

    /* renamed from: V, reason: collision with root package name */
    public static final TypeAdapter f17656V;

    /* renamed from: W, reason: collision with root package name */
    public static final r f17657W;

    /* renamed from: X, reason: collision with root package name */
    public static final r f17658X;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapter f17659a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f17660b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter f17661c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f17662d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter f17663e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter f17664f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f17665g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeAdapter f17666h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f17667i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeAdapter f17668j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f17669k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeAdapter f17670l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f17671m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter f17672n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f17673o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeAdapter f17674p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f17675q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeAdapter f17676r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f17677s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeAdapter f17678t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeAdapter f17679u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeAdapter f17680v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeAdapter f17681w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f17682x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeAdapter f17683y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter f17684z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass30 implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypeToken f17685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f17686b;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.equals(this.f17685a)) {
                return this.f17686b;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final Map f17699a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f17700b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map f17701c = new HashMap();

        /* loaded from: classes3.dex */
        class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f17702a;

            a(Class cls) {
                this.f17702a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f17702a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    c cVar = (c) field.getAnnotation(c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.f17699a.put(str2, r42);
                        }
                    }
                    this.f17699a.put(name, r42);
                    this.f17700b.put(str, r42);
                    this.f17701c.put(r42, name);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(C3596a c3596a) {
            if (c3596a.N() == EnumC3597b.NULL) {
                c3596a.J();
                return null;
            }
            String L8 = c3596a.L();
            Enum r02 = (Enum) this.f17699a.get(L8);
            if (r02 == null) {
                return (Enum) this.f17700b.get(L8);
            }
            return r02;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p1.c cVar, Enum r32) {
            String str;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f17701c.get(r32);
            }
            cVar.Q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17704a;

        static {
            int[] iArr = new int[EnumC3597b.values().length];
            f17704a = iArr;
            try {
                iArr[EnumC3597b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17704a[EnumC3597b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17704a[EnumC3597b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17704a[EnumC3597b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17704a[EnumC3597b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17704a[EnumC3597b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter a8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Class b(C3596a c3596a) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.a();
        f17659a = a8;
        f17660b = a(Class.class, a8);
        TypeAdapter a9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BitSet b(C3596a c3596a) {
                BitSet bitSet = new BitSet();
                c3596a.a();
                EnumC3597b N8 = c3596a.N();
                int i8 = 0;
                while (N8 != EnumC3597b.END_ARRAY) {
                    int i9 = a.f17704a[N8.ordinal()];
                    boolean z8 = true;
                    if (i9 != 1 && i9 != 2) {
                        if (i9 == 3) {
                            z8 = c3596a.A();
                        } else {
                            throw new m("Invalid bitset value type: " + N8 + "; at path " + c3596a.getPath());
                        }
                    } else {
                        int F8 = c3596a.F();
                        if (F8 == 0) {
                            z8 = false;
                        } else if (F8 != 1) {
                            throw new m("Invalid bitset value " + F8 + ", expected 0 or 1; at path " + c3596a.r());
                        }
                    }
                    if (z8) {
                        bitSet.set(i8);
                    }
                    i8++;
                    N8 = c3596a.N();
                }
                c3596a.h();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, BitSet bitSet) {
                cVar.e();
                int length = bitSet.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.N(bitSet.get(i8) ? 1L : 0L);
                }
                cVar.h();
            }
        }.a();
        f17661c = a9;
        f17662d = a(BitSet.class, a9);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean b(C3596a c3596a) {
                EnumC3597b N8 = c3596a.N();
                if (N8 == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                if (N8 == EnumC3597b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(c3596a.L()));
                }
                return Boolean.valueOf(c3596a.A());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Boolean bool) {
                cVar.O(bool);
            }
        };
        f17663e = typeAdapter;
        f17664f = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return Boolean.valueOf(c3596a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Boolean bool) {
                String bool2;
                if (bool == null) {
                    bool2 = "null";
                } else {
                    bool2 = bool.toString();
                }
                cVar.Q(bool2);
            }
        };
        f17665g = b(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                try {
                    int F8 = c3596a.F();
                    if (F8 <= 255 && F8 >= -128) {
                        return Byte.valueOf((byte) F8);
                    }
                    throw new m("Lossy conversion from " + F8 + " to byte; at path " + c3596a.r());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                } else {
                    cVar.N(number.byteValue());
                }
            }
        };
        f17666h = typeAdapter2;
        f17667i = b(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                try {
                    int F8 = c3596a.F();
                    if (F8 <= 65535 && F8 >= -32768) {
                        return Short.valueOf((short) F8);
                    }
                    throw new m("Lossy conversion from " + F8 + " to short; at path " + c3596a.r());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                } else {
                    cVar.N(number.shortValue());
                }
            }
        };
        f17668j = typeAdapter3;
        f17669k = b(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                try {
                    return Integer.valueOf(c3596a.F());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                } else {
                    cVar.N(number.intValue());
                }
            }
        };
        f17670l = typeAdapter4;
        f17671m = b(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter a10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicInteger b(C3596a c3596a) {
                try {
                    return new AtomicInteger(c3596a.F());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, AtomicInteger atomicInteger) {
                cVar.N(atomicInteger.get());
            }
        }.a();
        f17672n = a10;
        f17673o = a(AtomicInteger.class, a10);
        TypeAdapter a11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean b(C3596a c3596a) {
                return new AtomicBoolean(c3596a.A());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, AtomicBoolean atomicBoolean) {
                cVar.R(atomicBoolean.get());
            }
        }.a();
        f17674p = a11;
        f17675q = a(AtomicBoolean.class, a11);
        TypeAdapter a12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray b(C3596a c3596a) {
                ArrayList arrayList = new ArrayList();
                c3596a.a();
                while (c3596a.t()) {
                    try {
                        arrayList.add(Integer.valueOf(c3596a.F()));
                    } catch (NumberFormatException e8) {
                        throw new m(e8);
                    }
                }
                c3596a.h();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.e();
                int length = atomicIntegerArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.N(atomicIntegerArray.get(i8));
                }
                cVar.h();
            }
        }.a();
        f17676r = a12;
        f17677s = a(AtomicIntegerArray.class, a12);
        f17678t = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                try {
                    return Long.valueOf(c3596a.G());
                } catch (NumberFormatException e8) {
                    throw new m(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Number number) {
                if (number == null) {
                    cVar.x();
                } else {
                    cVar.N(number.longValue());
                }
            }
        };
        f17679u = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
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
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.P(number);
            }
        };
        f17680v = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Number b(C3596a c3596a) {
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
                } else {
                    cVar.M(number.doubleValue());
                }
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Character b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                String L8 = c3596a.L();
                if (L8.length() == 1) {
                    return Character.valueOf(L8.charAt(0));
                }
                throw new m("Expecting character, got: " + L8 + "; at " + c3596a.r());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Character ch) {
                String valueOf;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                cVar.Q(valueOf);
            }
        };
        f17681w = typeAdapter5;
        f17682x = b(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public String b(C3596a c3596a) {
                EnumC3597b N8 = c3596a.N();
                if (N8 == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                if (N8 == EnumC3597b.BOOLEAN) {
                    return Boolean.toString(c3596a.A());
                }
                return c3596a.L();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, String str) {
                cVar.Q(str);
            }
        };
        f17683y = typeAdapter6;
        f17684z = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BigDecimal b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                String L8 = c3596a.L();
                try {
                    return new BigDecimal(L8);
                } catch (NumberFormatException e8) {
                    throw new m("Failed parsing '" + L8 + "' as BigDecimal; at path " + c3596a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, BigDecimal bigDecimal) {
                cVar.P(bigDecimal);
            }
        };
        f17635A = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public BigInteger b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                String L8 = c3596a.L();
                try {
                    return new BigInteger(L8);
                } catch (NumberFormatException e8) {
                    throw new m("Failed parsing '" + L8 + "' as BigInteger; at path " + c3596a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, BigInteger bigInteger) {
                cVar.P(bigInteger);
            }
        };
        f17636B = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public f b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return new f(c3596a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, f fVar) {
                cVar.P(fVar);
            }
        };
        f17637C = a(String.class, typeAdapter6);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public StringBuilder b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return new StringBuilder(c3596a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, StringBuilder sb) {
                String sb2;
                if (sb == null) {
                    sb2 = null;
                } else {
                    sb2 = sb.toString();
                }
                cVar.Q(sb2);
            }
        };
        f17638D = typeAdapter7;
        f17639E = a(StringBuilder.class, typeAdapter7);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public StringBuffer b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return new StringBuffer(c3596a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, StringBuffer stringBuffer) {
                String stringBuffer2;
                if (stringBuffer == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer.toString();
                }
                cVar.Q(stringBuffer2);
            }
        };
        f17640F = typeAdapter8;
        f17641G = a(StringBuffer.class, typeAdapter8);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public URL b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                String L8 = c3596a.L();
                if ("null".equals(L8)) {
                    return null;
                }
                return new URL(L8);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, URL url) {
                String externalForm;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                cVar.Q(externalForm);
            }
        };
        f17642H = typeAdapter9;
        f17643I = a(URL.class, typeAdapter9);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public URI b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                try {
                    String L8 = c3596a.L();
                    if ("null".equals(L8)) {
                        return null;
                    }
                    return new URI(L8);
                } catch (URISyntaxException e8) {
                    throw new g(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, URI uri) {
                String aSCIIString;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                cVar.Q(aSCIIString);
            }
        };
        f17644J = typeAdapter10;
        f17645K = a(URI.class, typeAdapter10);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InetAddress b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return InetAddress.getByName(c3596a.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, InetAddress inetAddress) {
                String hostAddress;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                cVar.Q(hostAddress);
            }
        };
        f17646L = typeAdapter11;
        f17647M = d(InetAddress.class, typeAdapter11);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public UUID b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                String L8 = c3596a.L();
                try {
                    return UUID.fromString(L8);
                } catch (IllegalArgumentException e8) {
                    throw new m("Failed parsing '" + L8 + "' as UUID; at path " + c3596a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, UUID uuid) {
                String uuid2;
                if (uuid == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid.toString();
                }
                cVar.Q(uuid2);
            }
        };
        f17648N = typeAdapter12;
        f17649O = a(UUID.class, typeAdapter12);
        TypeAdapter a13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Currency b(C3596a c3596a) {
                String L8 = c3596a.L();
                try {
                    return Currency.getInstance(L8);
                } catch (IllegalArgumentException e8) {
                    throw new m("Failed parsing '" + L8 + "' as Currency; at path " + c3596a.r(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Currency currency) {
                cVar.Q(currency.getCurrencyCode());
            }
        }.a();
        f17650P = a13;
        f17651Q = a(Currency.class, a13);
        TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Calendar b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                c3596a.b();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (c3596a.N() != EnumC3597b.END_OBJECT) {
                    String H8 = c3596a.H();
                    int F8 = c3596a.F();
                    if ("year".equals(H8)) {
                        i8 = F8;
                    } else if ("month".equals(H8)) {
                        i9 = F8;
                    } else if ("dayOfMonth".equals(H8)) {
                        i10 = F8;
                    } else if ("hourOfDay".equals(H8)) {
                        i11 = F8;
                    } else if ("minute".equals(H8)) {
                        i12 = F8;
                    } else if ("second".equals(H8)) {
                        i13 = F8;
                    }
                }
                c3596a.l();
                return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.x();
                    return;
                }
                cVar.f();
                cVar.u("year");
                cVar.N(calendar.get(1));
                cVar.u("month");
                cVar.N(calendar.get(2));
                cVar.u("dayOfMonth");
                cVar.N(calendar.get(5));
                cVar.u("hourOfDay");
                cVar.N(calendar.get(11));
                cVar.u("minute");
                cVar.N(calendar.get(12));
                cVar.u("second");
                cVar.N(calendar.get(13));
                cVar.l();
            }
        };
        f17652R = typeAdapter13;
        f17653S = c(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Locale b(C3596a c3596a) {
                String str;
                String str2;
                String str3 = null;
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c3596a.L(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, Locale locale) {
                String locale2;
                if (locale == null) {
                    locale2 = null;
                } else {
                    locale2 = locale.toString();
                }
                cVar.Q(locale2);
            }
        };
        f17654T = typeAdapter14;
        f17655U = a(Locale.class, typeAdapter14);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private com.google.gson.f f(C3596a c3596a, EnumC3597b enumC3597b) {
                int i8 = a.f17704a[enumC3597b.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 6) {
                                c3596a.J();
                                return h.f17547a;
                            }
                            throw new IllegalStateException("Unexpected token: " + enumC3597b);
                        }
                        return new k(Boolean.valueOf(c3596a.A()));
                    }
                    return new k(c3596a.L());
                }
                return new k(new f(c3596a.L()));
            }

            private com.google.gson.f g(C3596a c3596a, EnumC3597b enumC3597b) {
                int i8 = a.f17704a[enumC3597b.ordinal()];
                if (i8 != 4) {
                    if (i8 != 5) {
                        return null;
                    }
                    c3596a.b();
                    return new i();
                }
                c3596a.a();
                return new d();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public com.google.gson.f b(C3596a c3596a) {
                String str;
                boolean z8;
                EnumC3597b N8 = c3596a.N();
                com.google.gson.f g8 = g(c3596a, N8);
                if (g8 == null) {
                    return f(c3596a, N8);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c3596a.t()) {
                        if (g8 instanceof i) {
                            str = c3596a.H();
                        } else {
                            str = null;
                        }
                        EnumC3597b N9 = c3596a.N();
                        com.google.gson.f g9 = g(c3596a, N9);
                        if (g9 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (g9 == null) {
                            g9 = f(c3596a, N9);
                        }
                        if (g8 instanceof d) {
                            ((d) g8).p(g9);
                        } else {
                            ((i) g8).p(str, g9);
                        }
                        if (z8) {
                            arrayDeque.addLast(g8);
                            g8 = g9;
                        }
                    } else {
                        if (g8 instanceof d) {
                            c3596a.h();
                        } else {
                            c3596a.l();
                        }
                        if (arrayDeque.isEmpty()) {
                            return g8;
                        }
                        g8 = (com.google.gson.f) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(p1.c cVar, com.google.gson.f fVar) {
                if (fVar != null && !fVar.i()) {
                    if (fVar.m()) {
                        k g8 = fVar.g();
                        if (g8.u()) {
                            cVar.P(g8.q());
                            return;
                        } else if (g8.s()) {
                            cVar.R(g8.p());
                            return;
                        } else {
                            cVar.Q(g8.r());
                            return;
                        }
                    }
                    if (fVar.h()) {
                        cVar.e();
                        Iterator it = fVar.a().iterator();
                        while (it.hasNext()) {
                            d(cVar, (com.google.gson.f) it.next());
                        }
                        cVar.h();
                        return;
                    }
                    if (fVar.l()) {
                        cVar.f();
                        for (Map.Entry entry : fVar.d().q()) {
                            cVar.u((String) entry.getKey());
                            d(cVar, (com.google.gson.f) entry.getValue());
                        }
                        cVar.l();
                        return;
                    }
                    throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
                }
                cVar.x();
            }
        };
        f17656V = typeAdapter15;
        f17657W = d(com.google.gson.f.class, typeAdapter15);
        f17658X = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (Enum.class.isAssignableFrom(c8) && c8 != Enum.class) {
                    if (!c8.isEnum()) {
                        c8 = c8.getSuperclass();
                    }
                    return new EnumTypeAdapter(c8);
                }
                return null;
            }
        };
    }

    public static r a(final Class cls, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r b(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (c8 != cls && c8 != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r c(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class c8 = typeToken.c();
                if (c8 != cls && c8 != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static r d(final Class cls, final TypeAdapter typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                final Class<?> c8 = typeToken.c();
                if (!cls.isAssignableFrom(c8)) {
                    return null;
                }
                return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                    @Override // com.google.gson.TypeAdapter
                    public Object b(C3596a c3596a) {
                        Object b8 = typeAdapter.b(c3596a);
                        if (b8 != null && !c8.isInstance(b8)) {
                            throw new m("Expected a " + c8.getName() + " but was " + b8.getClass().getName() + "; at path " + c3596a.r());
                        }
                        return b8;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void d(p1.c cVar, Object obj) {
                        typeAdapter.d(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
