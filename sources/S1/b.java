package S1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected Field f8931a;

    /* renamed from: b, reason: collision with root package name */
    protected Method f8932b;

    /* renamed from: c, reason: collision with root package name */
    protected Method f8933c;

    /* renamed from: d, reason: collision with root package name */
    protected Class f8934d;

    /* renamed from: e, reason: collision with root package name */
    protected Type f8935e;

    /* renamed from: f, reason: collision with root package name */
    protected String f8936f;

    public b(Class cls, Field field, j jVar) {
        String c8;
        this.f8936f = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f8931a = field;
        }
        try {
            this.f8932b = cls.getDeclaredMethod(a.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        if (equals) {
            c8 = a.d(field.getName());
        } else {
            c8 = a.c(field.getName());
        }
        try {
            this.f8933c = cls.getDeclaredMethod(c8, null);
        } catch (Exception unused2) {
        }
        if (this.f8933c == null && equals) {
            try {
                this.f8933c = cls.getDeclaredMethod(a.c(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.f8931a == null && this.f8933c == null && this.f8932b == null) {
            return;
        }
        Method method = this.f8933c;
        if (method != null && !jVar.a(field, method)) {
            this.f8933c = null;
        }
        Method method2 = this.f8932b;
        if (method2 != null && !jVar.a(field, method2)) {
            this.f8932b = null;
        }
        if (this.f8933c == null && this.f8932b == null && this.f8931a == null) {
            return;
        }
        this.f8934d = field.getType();
        this.f8935e = field.getGenericType();
    }

    public String a() {
        return this.f8936f;
    }

    public Class b() {
        return this.f8934d;
    }

    public boolean c() {
        return this.f8934d.isEnum();
    }

    public boolean d() {
        if (this.f8932b == null && this.f8933c == null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f8931a == null && this.f8933c == null) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f8931a == null && this.f8933c == null && this.f8932b == null) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.f8931a == null && this.f8933c == null) {
            return false;
        }
        return true;
    }
}
