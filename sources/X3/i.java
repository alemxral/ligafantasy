package X3;

import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    private final d f12261a;

    /* renamed from: b, reason: collision with root package name */
    private final V3.g f12262b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12263c;

    public i(d areqParamsFactory, V3.g ephemeralKeyPairGenerator, String sdkReferenceNumber) {
        AbstractC3159y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3159y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f12261a = areqParamsFactory;
        this.f12262b = ephemeralKeyPairGenerator;
        this.f12263c = sdkReferenceNumber;
    }

    @Override // X3.t
    public s a(String directoryServerId, List rootCerts, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, boolean z8, com.stripe.android.stripe3ds2.views.a brand) {
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        AbstractC3159y.i(rootCerts, "rootCerts");
        AbstractC3159y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(brand, "brand");
        return new r(this.f12261a, directoryServerId, directoryServerPublicKey, str, sdkTransactionId, this.f12262b.a(), this.f12263c);
    }
}
