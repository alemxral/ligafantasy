package Y3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13119d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f13120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13121b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13122c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a(String fieldName) {
            AbstractC3159y.i(fieldName, "fieldName");
            return new c(f.f13152g.b(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        public final c b(String fieldName) {
            AbstractC3159y.i(fieldName, "fieldName");
            return new c(f.f13150e.b(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i8, String description, String detail) {
        super(i8 + " - " + description + " (" + detail + ")");
        AbstractC3159y.i(description, "description");
        AbstractC3159y.i(detail, "detail");
        this.f13120a = i8;
        this.f13121b = description;
        this.f13122c = detail;
    }

    public final int a() {
        return this.f13120a;
    }

    public final String b() {
        return this.f13121b;
    }

    public final String c() {
        return this.f13122c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f protocolError, String detail) {
        this(protocolError.b(), protocolError.c(), detail);
        AbstractC3159y.i(protocolError, "protocolError");
        AbstractC3159y.i(detail, "detail");
    }
}
