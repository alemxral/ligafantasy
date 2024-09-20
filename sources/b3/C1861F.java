package b3;

import L5.s;
import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1861F implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f14290a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14291b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14292c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14293d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14294e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14295f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14296g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14297h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14298i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f14289j = new a(null);
    public static final Parcelable.Creator<C1861F> CREATOR = new b();

    /* renamed from: b3.F$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.F$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1861F createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1861F(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1861F[] newArray(int i8) {
            return new C1861F[i8];
        }
    }

    public C1861F(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i8, String str) {
        AbstractC3159y.i(sourceId, "sourceId");
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(deviceData, "deviceData");
        AbstractC3159y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3159y.i(messageVersion, "messageVersion");
        this.f14290a = sourceId;
        this.f14291b = sdkAppId;
        this.f14292c = sdkReferenceNumber;
        this.f14293d = sdkTransactionId;
        this.f14294e = deviceData;
        this.f14295f = sdkEphemeralPublicKey;
        this.f14296g = messageVersion;
        this.f14297h = i8;
        this.f14298i = str;
    }

    private final JSONObject c() {
        Object b8;
        try {
            s.a aVar = L5.s.f6498b;
            b8 = L5.s.b(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) AbstractC1246t.p("01", "02", "03", "04", "05"))));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6498b;
            b8 = L5.s.b(L5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (L5.s.g(b8)) {
            b8 = jSONObject;
        }
        return (JSONObject) b8;
    }

    public final /* synthetic */ JSONObject b() {
        Object b8;
        try {
            s.a aVar = L5.s.f6498b;
            b8 = L5.s.b(new JSONObject().put("sdkAppID", this.f14291b).put("sdkTransID", this.f14293d).put("sdkEncData", this.f14294e).put("sdkEphemPubKey", new JSONObject(this.f14295f)).put("sdkMaxTimeout", g6.n.e0(String.valueOf(this.f14297h), 2, '0')).put("sdkReferenceNumber", this.f14292c).put("messageVersion", this.f14296g).put("deviceRenderOptions", c()));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6498b;
            b8 = L5.s.b(L5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (L5.s.g(b8)) {
            b8 = jSONObject;
        }
        return (JSONObject) b8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861F)) {
            return false;
        }
        C1861F c1861f = (C1861F) obj;
        if (AbstractC3159y.d(this.f14290a, c1861f.f14290a) && AbstractC3159y.d(this.f14291b, c1861f.f14291b) && AbstractC3159y.d(this.f14292c, c1861f.f14292c) && AbstractC3159y.d(this.f14293d, c1861f.f14293d) && AbstractC3159y.d(this.f14294e, c1861f.f14294e) && AbstractC3159y.d(this.f14295f, c1861f.f14295f) && AbstractC3159y.d(this.f14296g, c1861f.f14296g) && this.f14297h == c1861f.f14297h && AbstractC3159y.d(this.f14298i, c1861f.f14298i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f14290a.hashCode() * 31) + this.f14291b.hashCode()) * 31) + this.f14292c.hashCode()) * 31) + this.f14293d.hashCode()) * 31) + this.f14294e.hashCode()) * 31) + this.f14295f.hashCode()) * 31) + this.f14296g.hashCode()) * 31) + this.f14297h) * 31;
        String str = this.f14298i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.f14290a + ", sdkAppId=" + this.f14291b + ", sdkReferenceNumber=" + this.f14292c + ", sdkTransactionId=" + this.f14293d + ", deviceData=" + this.f14294e + ", sdkEphemeralPublicKey=" + this.f14295f + ", messageVersion=" + this.f14296g + ", maxTimeout=" + this.f14297h + ", returnUrl=" + this.f14298i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14290a);
        out.writeString(this.f14291b);
        out.writeString(this.f14292c);
        out.writeString(this.f14293d);
        out.writeString(this.f14294e);
        out.writeString(this.f14295f);
        out.writeString(this.f14296g);
        out.writeInt(this.f14297h);
        out.writeString(this.f14298i);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map k8 = Q.k(L5.x.a("source", this.f14290a), L5.x.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, b().toString()));
        String str = this.f14298i;
        if (str != null) {
            map = Q.e(L5.x.a("fallback_return_url", str));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }
}
