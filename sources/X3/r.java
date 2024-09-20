package X3;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12284h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f12285a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12286b;

    /* renamed from: c, reason: collision with root package name */
    private final PublicKey f12287c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12288d;

    /* renamed from: e, reason: collision with root package name */
    private final q f12289e;

    /* renamed from: f, reason: collision with root package name */
    private final KeyPair f12290f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12291g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public r(d areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        AbstractC3159y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        AbstractC3159y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f12285a = areqParamsFactory;
        this.f12286b = directoryServerId;
        this.f12287c = directoryServerPublicKey;
        this.f12288d = str;
        this.f12289e = sdkTransactionId;
        this.f12290f = sdkKeyPair;
        this.f12291g = sdkReferenceNumber;
    }

    @Override // X3.s
    public m a(e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3159y.i(challengeParameters, "challengeParameters");
        AbstractC3159y.i(intentData, "intentData");
        return new m(this.f12291g, this.f12290f, challengeParameters, d6.m.d(i8, 5), intentData);
    }

    @Override // X3.s
    public Object b(P5.d dVar) {
        d dVar2 = this.f12285a;
        String str = this.f12286b;
        PublicKey publicKey = this.f12287c;
        String str2 = this.f12288d;
        q c8 = c();
        PublicKey publicKey2 = this.f12290f.getPublic();
        AbstractC3159y.h(publicKey2, "getPublic(...)");
        return dVar2.a(str, publicKey, str2, c8, publicKey2, dVar);
    }

    public q c() {
        return this.f12289e;
    }
}
