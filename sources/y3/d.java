package Y3;

import X3.q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f13124a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13125b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13126c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13127d;

    /* renamed from: e, reason: collision with root package name */
    private final c f13128e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13129f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13130g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13131h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13132i;

    /* renamed from: j, reason: collision with root package name */
    private final q f13133j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f13123k = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(JSONObject payload) {
            q qVar;
            AbstractC3159y.i(payload, "payload");
            String optString = payload.optString("threeDSServerTransID");
            String optString2 = payload.optString("acsTransID");
            String optString3 = payload.optString("dsTransID");
            String optString4 = payload.optString("errorCode");
            AbstractC3159y.h(optString4, "optString(...)");
            c a8 = c.f13134b.a(payload.optString("errorComponent"));
            String optString5 = payload.optString("errorDescription");
            AbstractC3159y.h(optString5, "optString(...)");
            String optString6 = payload.optString("errorDetail");
            AbstractC3159y.h(optString6, "optString(...)");
            String optString7 = payload.optString("errorMessageType");
            String optString8 = payload.optString("messageVersion");
            AbstractC3159y.h(optString8, "optString(...)");
            String optString9 = payload.optString("sdkTransID");
            if (optString9 != null) {
                qVar = new q(optString9);
            } else {
                qVar = null;
            }
            return new d(optString, optString2, optString3, optString4, a8, optString5, optString6, optString7, optString8, qVar);
        }

        public final boolean b(JSONObject payload) {
            AbstractC3159y.i(payload, "payload");
            return AbstractC3159y.d("Erro", payload.optString("messageType"));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            c valueOf;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            q qVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = c.valueOf(parcel.readString());
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                qVar = q.CREATOR.createFromParcel(parcel);
            }
            return new d(readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, readString8, qVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13134b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f13135c = new c("ThreeDsSdk", 0, "C");

        /* renamed from: d, reason: collision with root package name */
        public static final c f13136d = new c("ThreeDsServer", 1, ExifInterface.LATITUDE_SOUTH);

        /* renamed from: e, reason: collision with root package name */
        public static final c f13137e = new c("DirectoryServer", 2, "D");

        /* renamed from: f, reason: collision with root package name */
        public static final c f13138f = new c("Acs", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ c[] f13139g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f13140h;

        /* renamed from: a, reason: collision with root package name */
        private final String f13141a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final c a(String str) {
                Object obj;
                Iterator<E> it = c.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((c) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (c) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            c[] a8 = a();
            f13139g = a8;
            f13140h = R5.b.a(a8);
            f13134b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f13141a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f13135c, f13136d, f13137e, f13138f};
        }

        public static R5.a c() {
            return f13140h;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f13139g.clone();
        }

        public final String b() {
            return this.f13141a;
        }
    }

    public d(String str, String str2, String str3, String errorCode, c cVar, String errorDescription, String errorDetail, String str4, String messageVersion, q qVar) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(errorDescription, "errorDescription");
        AbstractC3159y.i(errorDetail, "errorDetail");
        AbstractC3159y.i(messageVersion, "messageVersion");
        this.f13124a = str;
        this.f13125b = str2;
        this.f13126c = str3;
        this.f13127d = errorCode;
        this.f13128e = cVar;
        this.f13129f = errorDescription;
        this.f13130g = errorDetail;
        this.f13131h = str4;
        this.f13132i = messageVersion;
        this.f13133j = qVar;
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("messageType", "Erro").put("messageVersion", this.f13132i).put("sdkTransID", this.f13133j).put("errorCode", this.f13127d).put("errorDescription", this.f13129f).put("errorDetail", this.f13130g);
        String str = this.f13124a;
        if (str != null) {
            put.put("threeDSServerTransID", str);
        }
        String str2 = this.f13125b;
        if (str2 != null) {
            put.put("acsTransID", str2);
        }
        String str3 = this.f13126c;
        if (str3 != null) {
            put.put("dsTransID", str3);
        }
        c cVar = this.f13128e;
        if (cVar != null) {
            put.put("errorComponent", cVar.b());
        }
        String str4 = this.f13131h;
        if (str4 != null) {
            put.put("errorMessageType", str4);
        }
        AbstractC3159y.f(put);
        return put;
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
        if (AbstractC3159y.d(this.f13124a, dVar.f13124a) && AbstractC3159y.d(this.f13125b, dVar.f13125b) && AbstractC3159y.d(this.f13126c, dVar.f13126c) && AbstractC3159y.d(this.f13127d, dVar.f13127d) && this.f13128e == dVar.f13128e && AbstractC3159y.d(this.f13129f, dVar.f13129f) && AbstractC3159y.d(this.f13130g, dVar.f13130g) && AbstractC3159y.d(this.f13131h, dVar.f13131h) && AbstractC3159y.d(this.f13132i, dVar.f13132i) && AbstractC3159y.d(this.f13133j, dVar.f13133j)) {
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
        String str = this.f13124a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f13125b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f13126c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode6 = (((i10 + hashCode3) * 31) + this.f13127d.hashCode()) * 31;
        c cVar = this.f13128e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int hashCode7 = (((((hashCode6 + hashCode4) * 31) + this.f13129f.hashCode()) * 31) + this.f13130g.hashCode()) * 31;
        String str4 = this.f13131h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode5) * 31) + this.f13132i.hashCode()) * 31;
        q qVar = this.f13133j;
        if (qVar != null) {
            i8 = qVar.hashCode();
        }
        return hashCode8 + i8;
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.f13124a + ", acsTransId=" + this.f13125b + ", dsTransId=" + this.f13126c + ", errorCode=" + this.f13127d + ", errorComponent=" + this.f13128e + ", errorDescription=" + this.f13129f + ", errorDetail=" + this.f13130g + ", errorMessageType=" + this.f13131h + ", messageVersion=" + this.f13132i + ", sdkTransId=" + this.f13133j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f13124a);
        out.writeString(this.f13125b);
        out.writeString(this.f13126c);
        out.writeString(this.f13127d);
        c cVar = this.f13128e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        out.writeString(this.f13129f);
        out.writeString(this.f13130g);
        out.writeString(this.f13131h);
        out.writeString(this.f13132i);
        q qVar = this.f13133j;
        if (qVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            qVar.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, String str8, q qVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, str4, (i8 & 16) != 0 ? null : cVar, str5, str6, (i8 & 128) != 0 ? null : str7, str8, qVar);
    }
}
