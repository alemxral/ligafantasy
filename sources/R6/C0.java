package R6;

import java.io.InputStream;

/* loaded from: classes5.dex */
abstract class C0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    protected final InputStream f8754a;

    /* renamed from: b, reason: collision with root package name */
    private int f8755b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0(InputStream inputStream, int i8) {
        this.f8754a = inputStream;
        this.f8755b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f8755b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z8) {
        InputStream inputStream = this.f8754a;
        if (inputStream instanceof z0) {
            ((z0) inputStream).f(z8);
        }
    }
}
