package j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
abstract class N3 {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f32354a = ((Boolean) AccessController.doPrivileged((PrivilegedAction) new Object())).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
