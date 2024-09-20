package Y3;

import androidx.compose.runtime.ComposerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f13148c = new f("InvalidMessageReceived", 0, 101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes");

    /* renamed from: d, reason: collision with root package name */
    public static final f f13149d = new f("UnsupportedMessageVersion", 1, 102, "Message Version Number received is not valid for the receiving component.");

    /* renamed from: e, reason: collision with root package name */
    public static final f f13150e = new f("RequiredDataElementMissing", 2, ComposerKt.providerKey, "A message element required as defined in Table A.1 is missing from the message.");

    /* renamed from: f, reason: collision with root package name */
    public static final f f13151f = new f("UnrecognizedCriticalMessageExtensions", 3, ComposerKt.compositionLocalMapKey, "Critical message extension not recognised.");

    /* renamed from: g, reason: collision with root package name */
    public static final f f13152g = new f("InvalidDataElementFormat", 4, ComposerKt.providerValuesKey, "Data element not in the required format or value is invalid as defined in Table A.1");

    /* renamed from: h, reason: collision with root package name */
    public static final f f13153h = new f("InvalidTransactionId", 5, 301, "Transaction ID received is not valid for the receiving component.");

    /* renamed from: i, reason: collision with root package name */
    public static final f f13154i = new f("DataDecryptionFailure", 6, 302, "Data could not be decrypted by the receiving system due to technical or other reason.");

    /* renamed from: j, reason: collision with root package name */
    public static final f f13155j = new f("TransactionTimedout", 7, 402, "Transaction timed-out.");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ f[] f13156k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ R5.a f13157l;

    /* renamed from: a, reason: collision with root package name */
    private final int f13158a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13159b;

    static {
        f[] a8 = a();
        f13156k = a8;
        f13157l = R5.b.a(a8);
    }

    private f(String str, int i8, int i9, String str2) {
        this.f13158a = i9;
        this.f13159b = str2;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f13148c, f13149d, f13150e, f13151f, f13152g, f13153h, f13154i, f13155j};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f13156k.clone();
    }

    public final int b() {
        return this.f13158a;
    }

    public final String c() {
        return this.f13159b;
    }
}
