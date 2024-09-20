package H0;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: H0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1183q {

    /* renamed from: a, reason: collision with root package name */
    private final String f3380a;

    /* renamed from: b, reason: collision with root package name */
    private final M0.f f3381b;

    public C1183q(String str, M0.f fVar) {
        this.f3380a = str;
        this.f3381b = fVar;
    }

    private File b() {
        return this.f3381b.e(this.f3380a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e8) {
            E0.f.f().e("Error creating marker: " + this.f3380a, e8);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
