package z6;

import M5.C1238k;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4046f {

    /* renamed from: a, reason: collision with root package name */
    private final C1238k f40537a = new C1238k();

    /* renamed from: b, reason: collision with root package name */
    private int f40538b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(char[] array) {
        int i8;
        AbstractC3159y.i(array, "array");
        synchronized (this) {
            try {
                int length = this.f40538b + array.length;
                i8 = AbstractC4044d.f40535a;
                if (length < i8) {
                    this.f40538b += array.length;
                    this.f40537a.g(array);
                }
                L5.I i9 = L5.I.f6474a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final char[] b(int i8) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f40537a.A();
            if (cArr != null) {
                this.f40538b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i8];
        }
        return cArr;
    }
}
