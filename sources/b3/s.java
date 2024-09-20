package b3;

import M5.Q;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    private static final a f14535k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f14536a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14537b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f14538c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14539d;

    /* renamed from: e, reason: collision with root package name */
    private final L f14540e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14541f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14542g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14543h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f14544i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14545j;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public s(String uniqueId, String str, Boolean bool, String str2, L l8, String str3, String str4, String str5, Integer num, String str6) {
        AbstractC3159y.i(uniqueId, "uniqueId");
        this.f14536a = uniqueId;
        this.f14537b = str;
        this.f14538c = bool;
        this.f14539d = str2;
        this.f14540e = l8;
        this.f14541f = str3;
        this.f14542g = str4;
        this.f14543h = str5;
        this.f14544i = num;
        this.f14545j = str6;
    }

    public final Map a() {
        String str;
        L5.r a8 = L5.x.a("unique_id", this.f14536a);
        L5.r a9 = L5.x.a("initial_institution", this.f14537b);
        L5.r a10 = L5.x.a("manual_entry_only", this.f14538c);
        L5.r a11 = L5.x.a("search_session", this.f14539d);
        L l8 = this.f14540e;
        if (l8 != null) {
            str = l8.b();
        } else {
            str = null;
        }
        return Q.k(a8, a9, a10, a11, L5.x.a("verification_method", str), L5.x.a("customer", this.f14542g), L5.x.a("on_behalf_of", this.f14543h), L5.x.a("hosted_surface", this.f14541f), L5.x.a(RewardPlus.AMOUNT, this.f14544i), L5.x.a("currency", this.f14545j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3159y.d(this.f14536a, sVar.f14536a) && AbstractC3159y.d(this.f14537b, sVar.f14537b) && AbstractC3159y.d(this.f14538c, sVar.f14538c) && AbstractC3159y.d(this.f14539d, sVar.f14539d) && this.f14540e == sVar.f14540e && AbstractC3159y.d(this.f14541f, sVar.f14541f) && AbstractC3159y.d(this.f14542g, sVar.f14542g) && AbstractC3159y.d(this.f14543h, sVar.f14543h) && AbstractC3159y.d(this.f14544i, sVar.f14544i) && AbstractC3159y.d(this.f14545j, sVar.f14545j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.f14536a.hashCode() * 31;
        String str = this.f14537b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode) * 31;
        Boolean bool = this.f14538c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14539d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        L l8 = this.f14540e;
        if (l8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l8.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f14541f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f14542g;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f14543h;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num = this.f14544i;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str6 = this.f14545j;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.f14536a + ", initialInstitution=" + this.f14537b + ", manualEntryOnly=" + this.f14538c + ", searchSession=" + this.f14539d + ", verificationMethod=" + this.f14540e + ", hostedSurface=" + this.f14541f + ", customer=" + this.f14542g + ", onBehalfOf=" + this.f14543h + ", amount=" + this.f14544i + ", currency=" + this.f14545j + ")";
    }
}
