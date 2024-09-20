package X0;

/* loaded from: classes3.dex */
public interface j {

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f12173a;

        a(int i8) {
            this.f12173a = i8;
        }

        public int a() {
            return this.f12173a;
        }
    }

    a b(String str);
}
