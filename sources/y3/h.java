package y3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final d f39808a;

    /* loaded from: classes4.dex */
    public static final class a extends h {

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f39809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 onComplete) {
            super(null, 1, 0 == true ? 1 : 0);
            AbstractC3159y.i(onComplete, "onComplete");
            this.f39809b = onComplete;
        }

        public final Function0 b() {
            return this.f39809b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3159y.d(this.f39809b, ((a) obj).f39809b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f39809b.hashCode();
        }

        public String toString() {
            return "FinishProcessing(onComplete=" + this.f39809b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private final d f39810b;

        public /* synthetic */ b(d dVar, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : dVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f39810b, ((b) obj).f39810b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            d dVar = this.f39810b;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Reset(message=" + this.f39810b + ")";
        }

        public b(d dVar) {
            super(dVar, null);
            this.f39810b = dVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        public static final c f39811b = new c();

        private c() {
            super(null, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1787228877;
        }

        public String toString() {
            return "StartProcessing";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f39812a;

        public d(InterfaceC3983b message) {
            AbstractC3159y.i(message, "message");
            this.f39812a = message;
        }

        public final InterfaceC3983b a() {
            return this.f39812a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3159y.d(this.f39812a, ((d) obj).f39812a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f39812a.hashCode();
        }

        public String toString() {
            return "UserErrorMessage(message=" + this.f39812a + ")";
        }
    }

    public /* synthetic */ h(d dVar, AbstractC3151p abstractC3151p) {
        this(dVar);
    }

    public final d a() {
        return this.f39808a;
    }

    private h(d dVar) {
        this.f39808a = dVar;
    }

    public /* synthetic */ h(d dVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : dVar, null);
    }
}
