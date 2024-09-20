package Y1;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: e, reason: collision with root package name */
    public static final D f12774e = new D(0, "VZCBSIFJD", 0, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final D f12775f = new D(1, "VZCBSIFJD", 1, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final D f12776g = new D(2, "VZCBSIFJD", 2, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final D f12777h = new D(3, "VZCBSIFJD", 3, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final D f12778i = new D(4, "VZCBSIFJD", 4, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final D f12779j = new D(5, "VZCBSIFJD", 5, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final D f12780k = new D(6, "VZCBSIFJD", 6, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final D f12781l = new D(7, "VZCBSIFJD", 7, 8);

    /* renamed from: m, reason: collision with root package name */
    public static final D f12782m = new D(8, "VZCBSIFJD", 8, 9);

    /* renamed from: a, reason: collision with root package name */
    private final int f12783a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12784b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12785c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12786d;

    private D(int i8, String str, int i9, int i10) {
        this.f12783a = i8;
        this.f12784b = str;
        this.f12785c = i9;
        this.f12786d = i10;
    }

    private static void a(Class cls, StringBuilder sb) {
        char c8;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c8 = 'I';
            } else if (cls == Void.TYPE) {
                c8 = 'V';
            } else if (cls == Boolean.TYPE) {
                c8 = 'Z';
            } else if (cls == Byte.TYPE) {
                c8 = 'B';
            } else if (cls == Character.TYPE) {
                c8 = 'C';
            } else if (cls == Short.TYPE) {
                c8 = 'S';
            } else if (cls == Double.TYPE) {
                c8 = 'D';
            } else if (cls == Float.TYPE) {
                c8 = 'F';
            } else if (cls == Long.TYPE) {
                c8 = 'J';
            } else {
                throw new AssertionError();
            }
            sb.append(c8);
            return;
        }
        sb.append('L');
        sb.append(g(cls));
        sb.append(';');
    }

    public static D[] b(String str) {
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (str.charAt(i9) != ')') {
            while (str.charAt(i9) == '[') {
                i9++;
            }
            int i11 = i9 + 1;
            if (str.charAt(i9) == 'L') {
                i9 = Math.max(i11, str.indexOf(59, i11) + 1);
            } else {
                i9 = i11;
            }
            i10++;
        }
        D[] dArr = new D[i10];
        int i12 = 1;
        while (str.charAt(i12) != ')') {
            int i13 = i12;
            while (str.charAt(i13) == '[') {
                i13++;
            }
            int i14 = i13 + 1;
            if (str.charAt(i13) == 'L') {
                i14 = Math.max(i14, str.indexOf(59, i14) + 1);
            }
            dArr[i8] = o(str, i12, i14);
            i8++;
            i12 = i14;
        }
        return dArr;
    }

    public static int c(String str) {
        int i8 = 1;
        char charAt = str.charAt(1);
        int i9 = 1;
        int i10 = 1;
        while (charAt != ')') {
            if (charAt != 'J' && charAt != 'D') {
                while (str.charAt(i9) == '[') {
                    i9++;
                }
                int i11 = i9 + 1;
                if (str.charAt(i9) == 'L') {
                    i11 = Math.max(i11, str.indexOf(59, i11) + 1);
                }
                i10++;
                i9 = i11;
            } else {
                i9++;
                i10 += 2;
            }
            charAt = str.charAt(i9);
        }
        char charAt2 = str.charAt(i9 + 1);
        if (charAt2 == 'V') {
            return i10 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i8 = 2;
        }
        return (i10 << 2) | i8;
    }

    public static String e(Class cls) {
        StringBuilder sb = new StringBuilder();
        a(cls, sb);
        return sb.toString();
    }

    public static String g(Class cls) {
        return cls.getName().replace('.', '/');
    }

    public static String h(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb);
        }
        sb.append(')');
        a(method.getReturnType(), sb);
        return sb.toString();
    }

    public static D i(String str) {
        return new D(11, str, 0, str.length());
    }

    public static D j(String str) {
        int i8;
        if (str.charAt(0) == '[') {
            i8 = 9;
        } else {
            i8 = 12;
        }
        return new D(i8, str, 0, str.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(String str) {
        int i8 = 1;
        while (str.charAt(i8) != ')') {
            while (str.charAt(i8) == '[') {
                i8++;
            }
            int i9 = i8 + 1;
            if (str.charAt(i8) == 'L') {
                i8 = Math.max(i9, str.indexOf(59, i9) + 1);
            } else {
                i8 = i9;
            }
        }
        return i8 + 1;
    }

    public static D m(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f12779j;
            }
            if (cls == Void.TYPE) {
                return f12774e;
            }
            if (cls == Boolean.TYPE) {
                return f12775f;
            }
            if (cls == Byte.TYPE) {
                return f12777h;
            }
            if (cls == Character.TYPE) {
                return f12776g;
            }
            if (cls == Short.TYPE) {
                return f12778i;
            }
            if (cls == Double.TYPE) {
                return f12782m;
            }
            if (cls == Float.TYPE) {
                return f12780k;
            }
            if (cls == Long.TYPE) {
                return f12781l;
            }
            throw new AssertionError();
        }
        return n(e(cls));
    }

    public static D n(String str) {
        return o(str, 0, str.length());
    }

    private static D o(String str, int i8, int i9) {
        char charAt = str.charAt(i8);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return f12777h;
                                                case 'C':
                                                    return f12776g;
                                                case 'D':
                                                    return f12782m;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new D(9, str, i8, i9);
                                    }
                                    return f12775f;
                                }
                                return f12781l;
                            }
                            return f12779j;
                        }
                        return f12774e;
                    }
                    return f12778i;
                }
                return new D(10, str, i8 + 1, i9 - 1);
            }
            return f12780k;
        }
        return new D(11, str, i8, i9);
    }

    public String d() {
        int i8 = this.f12783a;
        if (i8 == 10) {
            return this.f12784b.substring(this.f12785c - 1, this.f12786d + 1);
        }
        if (i8 == 12) {
            return 'L' + this.f12784b.substring(this.f12785c, this.f12786d) + ';';
        }
        return this.f12784b.substring(this.f12785c, this.f12786d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        int i8 = this.f12783a;
        int i9 = 10;
        if (i8 == 12) {
            i8 = 10;
        }
        int i10 = d8.f12783a;
        if (i10 != 12) {
            i9 = i10;
        }
        if (i8 != i9) {
            return false;
        }
        int i11 = this.f12785c;
        int i12 = this.f12786d;
        int i13 = d8.f12785c;
        if (i12 - i11 != d8.f12786d - i13) {
            return false;
        }
        while (i11 < i12) {
            if (this.f12784b.charAt(i11) != d8.f12784b.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }

    public String f() {
        return this.f12784b.substring(this.f12785c, this.f12786d);
    }

    public int hashCode() {
        int i8;
        int i9 = this.f12783a;
        if (i9 == 12) {
            i8 = 10;
        } else {
            i8 = i9;
        }
        int i10 = i8 * 13;
        if (i9 >= 9) {
            int i11 = this.f12786d;
            for (int i12 = this.f12785c; i12 < i11; i12++) {
                i10 = (i10 + this.f12784b.charAt(i12)) * 17;
            }
        }
        return i10;
    }

    public int l() {
        int i8 = this.f12783a;
        if (i8 == 12) {
            return 10;
        }
        return i8;
    }

    public String toString() {
        return d();
    }
}
