package F7;

/* loaded from: classes5.dex */
public class a extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f3054a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, Throwable th) {
        super(str);
        this.f3054a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f3054a;
    }
}
