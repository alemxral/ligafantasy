package P0;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f7846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7847b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f7848c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7849d;

    public e(Throwable th, d dVar) {
        e eVar;
        this.f7846a = th.getLocalizedMessage();
        this.f7847b = th.getClass().getName();
        this.f7848c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f7849d = eVar;
    }
}
