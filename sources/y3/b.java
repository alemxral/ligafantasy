package Y3;

import L5.C1224h;
import L5.s;
import L5.t;
import M5.AbstractC1246t;
import M5.a0;
import X3.q;
import X3.u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import g6.C2728d;
import g6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: C, reason: collision with root package name */
    public static final C0250b f13081C = new C0250b(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: D, reason: collision with root package name */
    private static final List f13082D = AbstractC1246t.p("Y", "N");

    /* renamed from: E, reason: collision with root package name */
    private static final Set f13083E = a0.i("threeDSServerTransID", "acsCounterAtoS", "acsTransID", "challengeCompletionInd", "messageExtension", "messageType", "messageVersion", "sdkTransID", "transStatus");

    /* renamed from: A, reason: collision with root package name */
    private final String f13084A;

    /* renamed from: B, reason: collision with root package name */
    private final String f13085B;

    /* renamed from: a, reason: collision with root package name */
    private final String f13086a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13087b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13088c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13089d;

    /* renamed from: e, reason: collision with root package name */
    private final g f13090e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13091f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13092g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13093h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13094i;

    /* renamed from: j, reason: collision with root package name */
    private final String f13095j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f13096k;

    /* renamed from: l, reason: collision with root package name */
    private final List f13097l;

    /* renamed from: m, reason: collision with root package name */
    private final String f13098m;

    /* renamed from: n, reason: collision with root package name */
    private final String f13099n;

    /* renamed from: o, reason: collision with root package name */
    private final d f13100o;

    /* renamed from: p, reason: collision with root package name */
    private final List f13101p;

    /* renamed from: q, reason: collision with root package name */
    private final String f13102q;

    /* renamed from: r, reason: collision with root package name */
    private final String f13103r;

    /* renamed from: s, reason: collision with root package name */
    private final String f13104s;

    /* renamed from: t, reason: collision with root package name */
    private final String f13105t;

    /* renamed from: u, reason: collision with root package name */
    private final d f13106u;

    /* renamed from: v, reason: collision with root package name */
    private final String f13107v;

    /* renamed from: w, reason: collision with root package name */
    private final q f13108w;

    /* renamed from: x, reason: collision with root package name */
    private final String f13109x;

    /* renamed from: y, reason: collision with root package name */
    private final String f13110y;

    /* renamed from: z, reason: collision with root package name */
    private final String f13111z;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f13113a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13114b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0248a f13112c = new C0248a(null);
        public static final Parcelable.Creator<a> CREATOR = new C0249b();

        /* renamed from: Y3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0248a {
            private C0248a() {
            }

            public final List a(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    if (optJSONObject != null) {
                        String next = optJSONObject.keys().next();
                        String optString = optJSONObject.optString(next);
                        AbstractC3159y.f(next);
                        AbstractC3159y.f(optString);
                        arrayList.add(new a(next, optString));
                    }
                }
                return arrayList;
            }

            public /* synthetic */ C0248a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: Y3.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0249b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String name, String text) {
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(text, "text");
            this.f13113a = name;
            this.f13114b = text;
        }

        public final String b() {
            return this.f13113a;
        }

        public final String c() {
            return this.f13114b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f13113a, aVar.f13113a) && AbstractC3159y.d(this.f13114b, aVar.f13114b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13113a.hashCode() * 31) + this.f13114b.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.f13113a + ", text=" + this.f13114b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f13113a);
            out.writeString(this.f13114b);
        }
    }

    /* renamed from: Y3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0250b {
        private C0250b() {
        }

        private final String c(String str) {
            Object b8;
            Object obj = null;
            if (str == null) {
                return null;
            }
            C0250b c0250b = b.f13081C;
            try {
                s.a aVar = s.f6498b;
                byte[] decode = Base64.decode(str, 8);
                AbstractC3159y.h(decode, "decode(...)");
                b8 = s.b(new String(decode, C2728d.f31279b));
            } catch (Throwable th) {
                s.a aVar2 = s.f6498b;
                b8 = s.b(t.a(th));
            }
            if (!s.g(b8)) {
                obj = b8;
            }
            return (String) obj;
        }

        private final String j(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void a(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            Iterator<String> keys = cresJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!b.f13083E.contains(next)) {
                    throw new Y3.c(f.f13148c.b(), "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void b(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            if (AbstractC3159y.d("CRes", cresJson.optString("messageType"))) {
            } else {
                throw new Y3.c(f.f13148c.b(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final b d(JSONObject cresJson) {
            b bVar;
            AbstractC3159y.i(cresJson, "cresJson");
            b(cresJson);
            boolean p8 = p(cresJson, "challengeCompletionInd", true);
            q qVar = new q(n(cresJson, "sdkTransID"));
            String uuid = n(cresJson, "threeDSServerTransID").toString();
            AbstractC3159y.h(uuid, "toString(...)");
            String uuid2 = n(cresJson, "acsTransID").toString();
            AbstractC3159y.h(uuid2, "toString(...)");
            String h8 = h(cresJson);
            List g8 = g(cresJson);
            if (p8) {
                a(cresJson);
                bVar = new b(uuid, uuid2, null, null, null, p8, null, null, null, null, false, null, null, null, null, g8, h8, null, null, null, null, null, qVar, null, null, null, null, m(cresJson).b(), 129925084, null);
            } else {
                boolean p9 = p(cresJson, "challengeInfoTextIndicator", false);
                String k8 = k(cresJson);
                JSONArray e8 = e(cresJson);
                g o8 = o(cresJson);
                String l8 = l(cresJson, o8);
                String f8 = f(cresJson, o8);
                String i8 = i(cresJson, o8);
                List a8 = a.f13112c.a(e8);
                String c8 = c(cresJson.optString("acsHTMLRefresh"));
                String optString = cresJson.optString("challengeInfoHeader");
                String optString2 = cresJson.optString("challengeInfoLabel");
                String optString3 = cresJson.optString("challengeInfoText");
                String optString4 = cresJson.optString("challengeAddInfo");
                String optString5 = cresJson.optString("expandInfoLabel");
                String optString6 = cresJson.optString("expandInfoText");
                d.a aVar = d.f13115d;
                bVar = new b(uuid, uuid2, f8, c8, o8, p8, optString, optString2, optString3, optString4, p9, a8, optString5, optString6, aVar.a(cresJson.optJSONObject("issuerImage")), g8, h8, cresJson.optString("oobAppURL"), cresJson.optString("oobAppLabel"), i8, aVar.a(cresJson.optJSONObject("psImage")), k8, qVar, l8, cresJson.optString("whitelistingInfoText"), cresJson.optString("whyInfoLabel"), cresJson.optString("whyInfoText"), "");
            }
            if (bVar.g0()) {
                return bVar;
            }
            throw Y3.c.f13119d.b("UI fields missing");
        }

        public final JSONArray e(JSONObject cresJson) {
            Object b8;
            AbstractC3159y.i(cresJson, "cresJson");
            if (!cresJson.has("challengeSelectInfo")) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            C0250b c0250b = b.f13081C;
            try {
                s.a aVar = s.f6498b;
                b8 = s.b(cresJson.getJSONArray("challengeSelectInfo"));
            } catch (Throwable th) {
                s.a aVar2 = s.f6498b;
                b8 = s.b(t.a(th));
            }
            if (s.e(b8) == null) {
                return (JSONArray) b8;
            }
            throw Y3.c.f13119d.a("challengeSelectInfo");
        }

        public final String f(JSONObject cresJson, g uiType) {
            AbstractC3159y.i(cresJson, "cresJson");
            AbstractC3159y.i(uiType, "uiType");
            String j8 = j(cresJson, "acsHTML");
            if ((j8 != null && !n.u(j8)) || uiType != g.f13165h) {
                return c(j8);
            }
            throw Y3.c.f13119d.b("acsHTML");
        }

        public final List g(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            List b8 = e.f13142e.b(cresJson.optJSONArray("messageExtension"));
            if (b8 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : b8) {
                    e eVar = (e) obj;
                    if (eVar.b() && !eVar.c()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new Y3.c(f.f13151f, AbstractC1246t.w0(arrayList, ",", null, null, 0, null, null, 62, null));
                }
            }
            return b8;
        }

        public final String h(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            String optString = cresJson.optString("messageVersion");
            AbstractC3159y.f(optString);
            if (!(!n.u(optString))) {
                optString = null;
            }
            if (optString != null) {
                return optString;
            }
            throw Y3.c.f13119d.b("messageVersion");
        }

        public final String i(JSONObject cresJson, g uiType) {
            AbstractC3159y.i(cresJson, "cresJson");
            AbstractC3159y.i(uiType, "uiType");
            String optString = cresJson.optString("oobContinueLabel");
            if ((optString != null && !n.u(optString)) || uiType != g.f13164g) {
                return optString;
            }
            throw Y3.c.f13119d.b("oobContinueLabel");
        }

        public final String k(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            String j8 = j(cresJson, "resendInformationLabel");
            if (j8 != null && j8.length() == 0) {
                throw Y3.c.f13119d.a("resendInformationLabel");
            }
            return j8;
        }

        public final String l(JSONObject cresJson, g uiType) {
            AbstractC3159y.i(cresJson, "cresJson");
            AbstractC3159y.i(uiType, "uiType");
            String j8 = j(cresJson, "submitAuthenticationLabel");
            if ((j8 != null && !n.u(j8)) || !uiType.d()) {
                return j8;
            }
            throw Y3.c.f13119d.b("submitAuthenticationLabel");
        }

        public final u m(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            String optString = cresJson.optString("transStatus");
            if (optString != null && !n.u(optString)) {
                u a8 = u.f12292b.a(optString);
                if (a8 != null) {
                    return a8;
                }
                throw Y3.c.f13119d.a("transStatus");
            }
            throw Y3.c.f13119d.b("transStatus");
        }

        public final UUID n(JSONObject cresJson, String fieldName) {
            AbstractC3159y.i(cresJson, "cresJson");
            AbstractC3159y.i(fieldName, "fieldName");
            String optString = cresJson.optString(fieldName);
            if (optString != null && !n.u(optString)) {
                try {
                    s.a aVar = s.f6498b;
                    UUID fromString = UUID.fromString(optString);
                    AbstractC3159y.h(fromString, "fromString(...)");
                    return fromString;
                } catch (Throwable th) {
                    s.a aVar2 = s.f6498b;
                    if (s.e(s.b(t.a(th))) == null) {
                        throw new C1224h();
                    }
                    throw Y3.c.f13119d.a(fieldName);
                }
            }
            throw Y3.c.f13119d.b(fieldName);
        }

        public final g o(JSONObject cresJson) {
            AbstractC3159y.i(cresJson, "cresJson");
            String optString = cresJson.optString("acsUiType");
            if (optString != null && !n.u(optString)) {
                g a8 = g.f13160c.a(optString);
                if (a8 != null) {
                    return a8;
                }
                throw Y3.c.f13119d.a("acsUiType");
            }
            throw Y3.c.f13119d.b("acsUiType");
        }

        public final boolean p(JSONObject cresJson, String fieldName, boolean z8) {
            String j8;
            AbstractC3159y.i(cresJson, "cresJson");
            AbstractC3159y.i(fieldName, "fieldName");
            if (z8) {
                if (cresJson.has(fieldName)) {
                    j8 = cresJson.getString(fieldName);
                } else {
                    throw Y3.c.f13119d.b(fieldName);
                }
            } else {
                j8 = j(cresJson, fieldName);
            }
            if (j8 != null && !b.f13082D.contains(j8)) {
                if (!z8 || !n.u(j8)) {
                    throw Y3.c.f13119d.a(fieldName);
                }
                throw Y3.c.f13119d.b(fieldName);
            }
            return AbstractC3159y.d("Y", j8);
        }

        public /* synthetic */ C0250b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            g valueOf;
            boolean z8;
            boolean z9;
            ArrayList arrayList;
            d createFromParcel;
            ArrayList arrayList2;
            d createFromParcel2;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = g.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(a.CREATOR.createFromParcel(parcel));
                }
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = d.CREATOR.createFromParcel(parcel);
            }
            d dVar = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    arrayList3.add(e.CREATOR.createFromParcel(parcel));
                    i9++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList3;
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = d.CREATOR.createFromParcel(parcel);
            }
            return new b(readString, readString2, readString3, readString4, valueOf, z8, readString5, readString6, readString7, readString8, z9, arrayList, readString9, readString10, dVar, arrayList2, readString11, readString12, readString13, readString14, createFromParcel2, parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f13116a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13117b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13118c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f13115d = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0251b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final d a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new d(jSONObject.optString("medium"), jSONObject.optString("high"), jSONObject.optString("extraHigh"));
                }
                return null;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: Y3.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0251b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            this.f13116a = str;
            this.f13117b = str2;
            this.f13118c = str3;
        }

        public final String b() {
            Object obj;
            boolean z8;
            Iterator it = AbstractC1246t.p(this.f13118c, this.f13117b, this.f13116a).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String str = (String) obj;
                    if (str != null && !n.u(str)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (!z8) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (String) obj;
        }

        public final String c(int i8) {
            String str;
            if (i8 <= 160) {
                str = this.f13116a;
            } else if (i8 >= 320) {
                str = this.f13118c;
            } else {
                str = this.f13117b;
            }
            if (str == null || n.u(str)) {
                str = null;
            }
            if (str == null) {
                return b();
            }
            return str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f13116a, dVar.f13116a) && AbstractC3159y.d(this.f13117b, dVar.f13117b) && AbstractC3159y.d(this.f13118c, dVar.f13118c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f13116a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f13117b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f13118c;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i10 + i8;
        }

        public String toString() {
            return "Image(mediumUrl=" + this.f13116a + ", highUrl=" + this.f13117b + ", extraHighUrl=" + this.f13118c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f13116a);
            out.writeString(this.f13117b);
            out.writeString(this.f13118c);
        }
    }

    public b(String serverTransId, String acsTransId, String str, String str2, g gVar, boolean z8, String str3, String str4, String str5, String str6, boolean z9, List list, String str7, String str8, d dVar, List list2, String messageVersion, String str9, String str10, String str11, d dVar2, String str12, q sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        AbstractC3159y.i(serverTransId, "serverTransId");
        AbstractC3159y.i(acsTransId, "acsTransId");
        AbstractC3159y.i(messageVersion, "messageVersion");
        AbstractC3159y.i(sdkTransId, "sdkTransId");
        this.f13086a = serverTransId;
        this.f13087b = acsTransId;
        this.f13088c = str;
        this.f13089d = str2;
        this.f13090e = gVar;
        this.f13091f = z8;
        this.f13092g = str3;
        this.f13093h = str4;
        this.f13094i = str5;
        this.f13095j = str6;
        this.f13096k = z9;
        this.f13097l = list;
        this.f13098m = str7;
        this.f13099n = str8;
        this.f13100o = dVar;
        this.f13101p = list2;
        this.f13102q = messageVersion;
        this.f13103r = str9;
        this.f13104s = str10;
        this.f13105t = str11;
        this.f13106u = dVar2;
        this.f13107v = str12;
        this.f13108w = sdkTransId;
        this.f13109x = str13;
        this.f13110y = str14;
        this.f13111z = str15;
        this.f13084A = str16;
        this.f13085B = str17;
    }

    public final d G() {
        return this.f13100o;
    }

    public final String I() {
        return this.f13102q;
    }

    public final String L() {
        return this.f13105t;
    }

    public final d Q() {
        return this.f13106u;
    }

    public final String T() {
        return this.f13107v;
    }

    public final q V() {
        return this.f13108w;
    }

    public final String X() {
        return this.f13086a;
    }

    public final boolean Y() {
        return this.f13096k;
    }

    public final String Z() {
        return this.f13109x;
    }

    public final String a0() {
        return this.f13085B;
    }

    public final g b0() {
        return this.f13090e;
    }

    public final String c0() {
        return this.f13110y;
    }

    public final String d0() {
        return this.f13111z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f13088c;
    }

    public final String e0() {
        return this.f13084A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f13086a, bVar.f13086a) && AbstractC3159y.d(this.f13087b, bVar.f13087b) && AbstractC3159y.d(this.f13088c, bVar.f13088c) && AbstractC3159y.d(this.f13089d, bVar.f13089d) && this.f13090e == bVar.f13090e && this.f13091f == bVar.f13091f && AbstractC3159y.d(this.f13092g, bVar.f13092g) && AbstractC3159y.d(this.f13093h, bVar.f13093h) && AbstractC3159y.d(this.f13094i, bVar.f13094i) && AbstractC3159y.d(this.f13095j, bVar.f13095j) && this.f13096k == bVar.f13096k && AbstractC3159y.d(this.f13097l, bVar.f13097l) && AbstractC3159y.d(this.f13098m, bVar.f13098m) && AbstractC3159y.d(this.f13099n, bVar.f13099n) && AbstractC3159y.d(this.f13100o, bVar.f13100o) && AbstractC3159y.d(this.f13101p, bVar.f13101p) && AbstractC3159y.d(this.f13102q, bVar.f13102q) && AbstractC3159y.d(this.f13103r, bVar.f13103r) && AbstractC3159y.d(this.f13104s, bVar.f13104s) && AbstractC3159y.d(this.f13105t, bVar.f13105t) && AbstractC3159y.d(this.f13106u, bVar.f13106u) && AbstractC3159y.d(this.f13107v, bVar.f13107v) && AbstractC3159y.d(this.f13108w, bVar.f13108w) && AbstractC3159y.d(this.f13109x, bVar.f13109x) && AbstractC3159y.d(this.f13110y, bVar.f13110y) && AbstractC3159y.d(this.f13111z, bVar.f13111z) && AbstractC3159y.d(this.f13084A, bVar.f13084A) && AbstractC3159y.d(this.f13085B, bVar.f13085B)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f13089d;
    }

    public final boolean f0() {
        return this.f13091f;
    }

    public final boolean g0() {
        List list;
        boolean z8;
        g gVar = this.f13090e;
        if (gVar == null) {
            return true;
        }
        boolean z9 = false;
        if (gVar == g.f13165h) {
            String str = this.f13088c;
            if (str == null || n.u(str)) {
                z9 = true;
            }
            return !z9;
        }
        Set i8 = a0.i(this.f13092g, this.f13093h, this.f13094i, this.f13111z, this.f13084A, this.f13098m, this.f13099n, this.f13107v);
        if (!(i8 instanceof Collection) || !i8.isEmpty()) {
            Iterator it = i8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && !n.u(str2)) {
                    g gVar2 = this.f13090e;
                    if (gVar2 == g.f13164g) {
                        Set<String> i9 = a0.i(this.f13104s, this.f13103r, this.f13105t);
                        if (!(i9 instanceof Collection) || !i9.isEmpty()) {
                            for (String str3 : i9) {
                                if (str3 != null && !n.u(str3)) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (!z8) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if ((gVar2 != g.f13162e && gVar2 != g.f13163f) || ((list = this.f13097l) != null && !list.isEmpty())) {
                        String str4 = this.f13109x;
                        if (str4 == null || n.u(str4)) {
                            z9 = true;
                        }
                        return !z9;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22 = ((this.f13086a.hashCode() * 31) + this.f13087b.hashCode()) * 31;
        String str = this.f13088c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode22 + hashCode) * 31;
        String str2 = this.f13089d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        g gVar = this.f13090e;
        if (gVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        boolean z8 = this.f13091f;
        int i12 = 1;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        String str3 = this.f13092g;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f13093h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str5 = this.f13094i;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str6 = this.f13095j;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        boolean z9 = this.f13096k;
        if (!z9) {
            i12 = z9 ? 1 : 0;
        }
        int i19 = (i18 + i12) * 31;
        List list = this.f13097l;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        String str7 = this.f13098m;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i21 = (i20 + hashCode9) * 31;
        String str8 = this.f13099n;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        d dVar = this.f13100o;
        if (dVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = dVar.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List list2 = this.f13101p;
        if (list2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list2.hashCode();
        }
        int hashCode23 = (((i23 + hashCode12) * 31) + this.f13102q.hashCode()) * 31;
        String str9 = this.f13103r;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i24 = (hashCode23 + hashCode13) * 31;
        String str10 = this.f13104s;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i25 = (i24 + hashCode14) * 31;
        String str11 = this.f13105t;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i26 = (i25 + hashCode15) * 31;
        d dVar2 = this.f13106u;
        if (dVar2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = dVar2.hashCode();
        }
        int i27 = (i26 + hashCode16) * 31;
        String str12 = this.f13107v;
        if (str12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str12.hashCode();
        }
        int hashCode24 = (((i27 + hashCode17) * 31) + this.f13108w.hashCode()) * 31;
        String str13 = this.f13109x;
        if (str13 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str13.hashCode();
        }
        int i28 = (hashCode24 + hashCode18) * 31;
        String str14 = this.f13110y;
        if (str14 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str14.hashCode();
        }
        int i29 = (i28 + hashCode19) * 31;
        String str15 = this.f13111z;
        if (str15 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str15.hashCode();
        }
        int i30 = (i29 + hashCode20) * 31;
        String str16 = this.f13084A;
        if (str16 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str16.hashCode();
        }
        int i31 = (i30 + hashCode21) * 31;
        String str17 = this.f13085B;
        if (str17 != null) {
            i8 = str17.hashCode();
        }
        return i31 + i8;
    }

    public final String i() {
        return this.f13087b;
    }

    public final String j() {
        return this.f13095j;
    }

    public final String k() {
        return this.f13092g;
    }

    public final String n() {
        return this.f13093h;
    }

    public final String o() {
        return this.f13094i;
    }

    public final List s() {
        return this.f13097l;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.f13086a + ", acsTransId=" + this.f13087b + ", acsHtml=" + this.f13088c + ", acsHtmlRefresh=" + this.f13089d + ", uiType=" + this.f13090e + ", isChallengeCompleted=" + this.f13091f + ", challengeInfoHeader=" + this.f13092g + ", challengeInfoLabel=" + this.f13093h + ", challengeInfoText=" + this.f13094i + ", challengeAdditionalInfoText=" + this.f13095j + ", shouldShowChallengeInfoTextIndicator=" + this.f13096k + ", challengeSelectOptions=" + this.f13097l + ", expandInfoLabel=" + this.f13098m + ", expandInfoText=" + this.f13099n + ", issuerImage=" + this.f13100o + ", messageExtensions=" + this.f13101p + ", messageVersion=" + this.f13102q + ", oobAppUrl=" + this.f13103r + ", oobAppLabel=" + this.f13104s + ", oobContinueLabel=" + this.f13105t + ", paymentSystemImage=" + this.f13106u + ", resendInformationLabel=" + this.f13107v + ", sdkTransId=" + this.f13108w + ", submitAuthenticationLabel=" + this.f13109x + ", whitelistingInfoText=" + this.f13110y + ", whyInfoLabel=" + this.f13111z + ", whyInfoText=" + this.f13084A + ", transStatus=" + this.f13085B + ")";
    }

    public final String u() {
        return this.f13098m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f13086a);
        out.writeString(this.f13087b);
        out.writeString(this.f13088c);
        out.writeString(this.f13089d);
        g gVar = this.f13090e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gVar.name());
        }
        out.writeInt(this.f13091f ? 1 : 0);
        out.writeString(this.f13092g);
        out.writeString(this.f13093h);
        out.writeString(this.f13094i);
        out.writeString(this.f13095j);
        out.writeInt(this.f13096k ? 1 : 0);
        List list = this.f13097l;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f13098m);
        out.writeString(this.f13099n);
        d dVar = this.f13100o;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        List list2 = this.f13101p;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f13102q);
        out.writeString(this.f13103r);
        out.writeString(this.f13104s);
        out.writeString(this.f13105t);
        d dVar2 = this.f13106u;
        if (dVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar2.writeToParcel(out, i8);
        }
        out.writeString(this.f13107v);
        this.f13108w.writeToParcel(out, i8);
        out.writeString(this.f13109x);
        out.writeString(this.f13110y);
        out.writeString(this.f13111z);
        out.writeString(this.f13084A);
        out.writeString(this.f13085B);
    }

    public final String z() {
        return this.f13099n;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, g gVar, boolean z8, String str5, String str6, String str7, String str8, boolean z9, List list, String str9, String str10, d dVar, List list2, String str11, String str12, String str13, String str14, d dVar2, String str15, q qVar, String str16, String str17, String str18, String str19, String str20, int i8, AbstractC3151p abstractC3151p) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : str6, (i8 & 256) != 0 ? null : str7, (i8 & 512) != 0 ? null : str8, (i8 & 1024) != 0 ? false : z9, (i8 & 2048) != 0 ? null : list, (i8 & 4096) != 0 ? null : str9, (i8 & 8192) != 0 ? null : str10, (i8 & 16384) != 0 ? null : dVar, (32768 & i8) != 0 ? null : list2, str11, (131072 & i8) != 0 ? null : str12, (262144 & i8) != 0 ? null : str13, (524288 & i8) != 0 ? null : str14, (1048576 & i8) != 0 ? null : dVar2, (2097152 & i8) != 0 ? null : str15, qVar, (8388608 & i8) != 0 ? null : str16, (16777216 & i8) != 0 ? null : str17, (33554432 & i8) != 0 ? null : str18, (67108864 & i8) != 0 ? null : str19, (i8 & 134217728) != 0 ? null : str20);
    }
}
