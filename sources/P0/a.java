package P0;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f7841a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f7842b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7843c;

    public a(int i8, d... dVarArr) {
        this.f7841a = i8;
        this.f7842b = dVarArr;
        this.f7843c = new b(i8);
    }

    @Override // P0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f7841a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f7842b) {
            if (stackTraceElementArr2.length <= this.f7841a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f7841a) {
            return this.f7843c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
