package j2;

import M5.AbstractC1246t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: j2.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3073m {

    /* renamed from: c, reason: collision with root package name */
    private static final b f32988c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final List f32989d = AbstractC1246t.p("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* renamed from: e, reason: collision with root package name */
    private static final List f32990e = AbstractC1246t.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* renamed from: a, reason: collision with root package name */
    private final C3072l f32991a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32992b;

    /* renamed from: j2.m$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: j2.m$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f33002a;

        /* renamed from: j2.m$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            this.f33002a = str;
        }

        public final String b() {
            return this.f33002a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f33002a, ((c) obj).f33002a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f33002a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.f33002a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f33002a);
        }
    }

    /* renamed from: j2.m$d */
    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f33003a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f33004b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f33005c;

        /* renamed from: j2.m$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3159y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new d(z8, linkedHashSet, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(boolean z8, Set allowedCountryCodes, boolean z9) {
            AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
            this.f33003a = z8;
            this.f33004b = allowedCountryCodes;
            this.f33005c = z9;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : b()) {
                AbstractC3159y.f(iSOCountries);
                for (String str2 : iSOCountries) {
                    if (AbstractC3159y.d(str, str2)) {
                        break;
                    }
                }
                throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
            }
        }

        public final Set b() {
            Set set = this.f33004b;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                AbstractC3159y.h(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            return AbstractC1246t.b1(arrayList);
        }

        public final boolean c() {
            return this.f33005c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f33003a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f33003a == dVar.f33003a && AbstractC3159y.d(this.f33004b, dVar.f33004b) && this.f33005c == dVar.f33005c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f33003a) * 31) + this.f33004b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f33005c);
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.f33003a + ", allowedCountryCodes=" + this.f33004b + ", phoneNumberRequired=" + this.f33005c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f33003a ? 1 : 0);
            Set set = this.f33004b;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            out.writeInt(this.f33005c ? 1 : 0);
        }
    }

    /* renamed from: j2.m$e */
    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final String f33006a;

        /* renamed from: b, reason: collision with root package name */
        private final c f33007b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33008c;

        /* renamed from: d, reason: collision with root package name */
        private final String f33009d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f33010e;

        /* renamed from: f, reason: collision with root package name */
        private final String f33011f;

        /* renamed from: g, reason: collision with root package name */
        private final a f33012g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: j2.m$e$a */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f33013b = new a("Default", 0, "DEFAULT");

            /* renamed from: c, reason: collision with root package name */
            public static final a f33014c = new a("CompleteImmediatePurchase", 1, "COMPLETE_IMMEDIATE_PURCHASE");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f33015d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f33016e;

            /* renamed from: a, reason: collision with root package name */
            private final String f33017a;

            static {
                a[] a8 = a();
                f33015d = a8;
                f33016e = R5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f33017a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f33013b, f33014c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f33015d.clone();
            }

            public final String b() {
                return this.f33017a;
            }
        }

        /* renamed from: j2.m$e$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Long valueOf;
                a valueOf2;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                c valueOf3 = c.valueOf(parcel.readString());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = a.valueOf(parcel.readString());
                }
                return new e(readString, valueOf3, readString2, readString3, valueOf, readString4, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: j2.m$e$c */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final c f33018b = new c("NotCurrentlyKnown", 0, "NOT_CURRENTLY_KNOWN");

            /* renamed from: c, reason: collision with root package name */
            public static final c f33019c = new c("Estimated", 1, "ESTIMATED");

            /* renamed from: d, reason: collision with root package name */
            public static final c f33020d = new c("Final", 2, "FINAL");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f33021e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f33022f;

            /* renamed from: a, reason: collision with root package name */
            private final String f33023a;

            static {
                c[] a8 = a();
                f33021e = a8;
                f33022f = R5.b.a(a8);
            }

            private c(String str, int i8, String str2) {
                this.f33023a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f33018b, f33019c, f33020d};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f33021e.clone();
            }

            public final String b() {
                return this.f33023a;
            }
        }

        public e(String currencyCode, c totalPriceStatus, String str, String str2, Long l8, String str3, a aVar) {
            AbstractC3159y.i(currencyCode, "currencyCode");
            AbstractC3159y.i(totalPriceStatus, "totalPriceStatus");
            this.f33006a = currencyCode;
            this.f33007b = totalPriceStatus;
            this.f33008c = str;
            this.f33009d = str2;
            this.f33010e = l8;
            this.f33011f = str3;
            this.f33012g = aVar;
        }

        public final a b() {
            return this.f33012g;
        }

        public final String c() {
            return this.f33008c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f33006a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3159y.d(this.f33006a, eVar.f33006a) && this.f33007b == eVar.f33007b && AbstractC3159y.d(this.f33008c, eVar.f33008c) && AbstractC3159y.d(this.f33009d, eVar.f33009d) && AbstractC3159y.d(this.f33010e, eVar.f33010e) && AbstractC3159y.d(this.f33011f, eVar.f33011f) && this.f33012g == eVar.f33012g) {
                return true;
            }
            return false;
        }

        public final Long f() {
            return this.f33010e;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = ((this.f33006a.hashCode() * 31) + this.f33007b.hashCode()) * 31;
            String str = this.f33008c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode5 + hashCode) * 31;
            String str2 = this.f33009d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            Long l8 = this.f33010e;
            if (l8 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l8.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f33011f;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            a aVar = this.f33012g;
            if (aVar != null) {
                i8 = aVar.hashCode();
            }
            return i12 + i8;
        }

        public final String i() {
            return this.f33011f;
        }

        public final c j() {
            return this.f33007b;
        }

        public final String k() {
            return this.f33009d;
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.f33006a + ", totalPriceStatus=" + this.f33007b + ", countryCode=" + this.f33008c + ", transactionId=" + this.f33009d + ", totalPrice=" + this.f33010e + ", totalPriceLabel=" + this.f33011f + ", checkoutOption=" + this.f33012g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f33006a);
            out.writeString(this.f33007b.name());
            out.writeString(this.f33008c);
            out.writeString(this.f33009d);
            Long l8 = this.f33010e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f33011f);
            a aVar = this.f33012g;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(aVar.name());
            }
        }
    }

    public C3073m(C3072l googlePayConfig, boolean z8) {
        AbstractC3159y.i(googlePayConfig, "googlePayConfig");
        this.f32991a = googlePayConfig;
        this.f32992b = z8;
    }

    private final JSONObject a() {
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f32989d));
        List list = f32990e;
        List e8 = AbstractC1246t.e("JCB");
        if (!this.f32992b) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1246t.m();
        }
        JSONObject put2 = put.put("allowedCardNetworks", new JSONArray((Collection) AbstractC1246t.G0(list, e8)));
        AbstractC3159y.h(put2, "put(...)");
        return put2;
    }

    public static /* synthetic */ JSONObject e(C3073m c3073m, e eVar, a aVar, d dVar, boolean z8, c cVar, Boolean bool, int i8, Object obj) {
        a aVar2;
        d dVar2;
        boolean z9;
        c cVar2;
        Boolean bool2 = null;
        if ((i8 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i8 & 4) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 16) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i8 & 32) == 0) {
            bool2 = bool;
        }
        return c3073m.d(eVar, aVar2, dVar2, z9, cVar2, bool2);
    }

    private final JSONObject f(d dVar) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) dVar.b())).put("phoneNumberRequired", dVar.c());
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    private final JSONObject g(e eVar) {
        JSONObject jSONObject = new JSONObject();
        String e8 = eVar.e();
        Locale locale = Locale.ROOT;
        String upperCase = e8.toUpperCase(locale);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        JSONObject put = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", eVar.j().b());
        String c8 = eVar.c();
        if (c8 != null) {
            String upperCase2 = c8.toUpperCase(locale);
            AbstractC3159y.h(upperCase2, "toUpperCase(...)");
            put.put("countryCode", upperCase2);
        }
        String k8 = eVar.k();
        if (k8 != null) {
            put.put("transactionId", k8);
        }
        Long f8 = eVar.f();
        if (f8 != null) {
            long longValue = f8.longValue();
            String upperCase3 = eVar.e().toUpperCase(locale);
            AbstractC3159y.h(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            AbstractC3159y.h(currency, "getInstance(...)");
            put.put("totalPrice", o.a(longValue, currency));
        }
        String i8 = eVar.i();
        if (i8 != null) {
            put.put("totalPriceLabel", i8);
        }
        e.a b8 = eVar.b();
        if (b8 != null) {
            put.put("checkoutOption", b8.b());
        }
        AbstractC3159y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject b(a aVar, Boolean bool) {
        JSONObject a8 = a();
        if (aVar != null && aVar.e()) {
            a8.put("billingAddressRequired", true);
            a8.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", aVar.c()).put("format", aVar.b().b()));
        }
        if (bool != null) {
            a8.put("allowCreditCards", bool.booleanValue());
        }
        JSONObject put = new JSONObject().put("type", "CARD").put("parameters", a8).put("tokenizationSpecification", this.f32991a.b());
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    public final JSONObject c(a aVar, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool2)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        AbstractC3159y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject d(e transactionInfo, a aVar, d dVar, boolean z8, c cVar, Boolean bool) {
        String b8;
        AbstractC3159y.i(transactionInfo, "transactionInfo");
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool))).put("transactionInfo", g(transactionInfo)).put("emailRequired", z8);
        if (dVar != null && dVar.e()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", f(dVar));
        }
        if (cVar != null && (b8 = cVar.b()) != null && b8.length() != 0) {
            put.put("merchantInfo", new JSONObject().put("merchantName", cVar.b()));
        }
        AbstractC3159y.h(put, "apply(...)");
        return put;
    }

    /* renamed from: j2.m$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0765a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f32993d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f32994a;

        /* renamed from: b, reason: collision with root package name */
        private final b f32995b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32996c;

        /* renamed from: j2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0765a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3159y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                b valueOf = b.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new a(z8, valueOf, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: j2.m$a$b */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: b, reason: collision with root package name */
            public static final b f32997b = new b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final b f32998c = new b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f32999d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f33000e;

            /* renamed from: a, reason: collision with root package name */
            private final String f33001a;

            static {
                b[] a8 = a();
                f32999d = a8;
                f33000e = R5.b.a(a8);
            }

            private b(String str, int i8, String str2) {
                this.f33001a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f32997b, f32998c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f32999d.clone();
            }

            public final String b() {
                return this.f33001a;
            }
        }

        public a(boolean z8, b format, boolean z9) {
            AbstractC3159y.i(format, "format");
            this.f32994a = z8;
            this.f32995b = format;
            this.f32996c = z9;
        }

        public final b b() {
            return this.f32995b;
        }

        public final boolean c() {
            return this.f32996c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f32994a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f32994a == aVar.f32994a && this.f32995b == aVar.f32995b && this.f32996c == aVar.f32996c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f32994a) * 31) + this.f32995b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32996c);
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.f32994a + ", format=" + this.f32995b + ", isPhoneNumberRequired=" + this.f32996c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f32994a ? 1 : 0);
            out.writeString(this.f32995b.name());
            out.writeInt(this.f32996c ? 1 : 0);
        }

        public /* synthetic */ a(boolean z8, b bVar, boolean z9, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? b.f32997b : bVar, (i8 & 4) != 0 ? false : z9);
        }
    }

    public /* synthetic */ C3073m(Context context, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(context, (i8 & 2) != 0 ? false : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3073m(Context context, boolean z8) {
        this(new C3072l(context), z8);
        AbstractC3159y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3073m(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, h.d googlePayConfig) {
        this(new C3072l((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke()), googlePayConfig.n());
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3159y.i(googlePayConfig, "googlePayConfig");
    }
}
