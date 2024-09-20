package H0;

/* renamed from: H0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1188w {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a, reason: collision with root package name */
    private final int f3407a;

    EnumC1188w(int i8) {
        this.f3407a = i8;
    }

    public static EnumC1188w a(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int b() {
        return this.f3407a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f3407a);
    }
}
