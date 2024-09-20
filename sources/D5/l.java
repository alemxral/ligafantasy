package D5;

import L7.u;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import kotlin.jvm.internal.AbstractC3159y;
import y5.C3998e;
import y5.s;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f1864a;

    /* renamed from: b, reason: collision with root package name */
    public final E6.f f1865b;

    /* renamed from: c, reason: collision with root package name */
    public final C3998e f1866c;

    /* renamed from: d, reason: collision with root package name */
    public final B6.l f1867d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1868e;

    /* renamed from: f, reason: collision with root package name */
    public final L7.e f1869f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1870g;

    /* renamed from: h, reason: collision with root package name */
    public final J7.g f1871h;

    /* renamed from: i, reason: collision with root package name */
    public final G5.c f1872i;

    /* renamed from: j, reason: collision with root package name */
    public final L7.i f1873j;

    public l(s tcModel, E6.f portalConfig, C3998e googleVendorList, B6.l lVar, u portalConfigRepository, L7.e consentRepository, boolean z8, J7.g initScreen, G5.c gbcPurposeResponse, L7.i gbcConsentRepository) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(googleVendorList, "googleVendorList");
        AbstractC3159y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3159y.i(consentRepository, "consentRepository");
        AbstractC3159y.i(initScreen, "initScreen");
        AbstractC3159y.i(gbcPurposeResponse, "gbcPurposeResponse");
        AbstractC3159y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f1864a = tcModel;
        this.f1865b = portalConfig;
        this.f1866c = googleVendorList;
        this.f1867d = lVar;
        this.f1868e = portalConfigRepository;
        this.f1869f = consentRepository;
        this.f1870g = z8;
        this.f1871h = initScreen;
        this.f1872i = gbcPurposeResponse;
        this.f1873j = gbcConsentRepository;
    }

    public final void a() {
        String str = this.f1865b.f2373b.f2320I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f1869f.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f1865b.f2373b.f2320I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f1869f.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f1869f.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
