package X4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class G implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f12336a;

    /* renamed from: b, reason: collision with root package name */
    private String f12337b;

    /* renamed from: c, reason: collision with root package name */
    private String f12338c;

    /* renamed from: d, reason: collision with root package name */
    private String f12339d;

    /* renamed from: e, reason: collision with root package name */
    private long f12340e;

    /* renamed from: f, reason: collision with root package name */
    private String f12341f;

    /* renamed from: g, reason: collision with root package name */
    private String f12342g;

    /* renamed from: h, reason: collision with root package name */
    private int f12343h;

    /* renamed from: i, reason: collision with root package name */
    private int f12344i;

    /* renamed from: j, reason: collision with root package name */
    private int f12345j;

    /* renamed from: k, reason: collision with root package name */
    private String f12346k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f12335l = new b(null);
    public static Parcelable.Creator<G> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new G(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G[] newArray(int i8) {
            return new G[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f12347a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f12348b;

            /* renamed from: d, reason: collision with root package name */
            int f12350d;

            a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f12348b = obj;
                this.f12350d |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.G$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0238b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f12351a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f12352b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f12353c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f12354d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0238b(Context context, G g8, kotlin.jvm.internal.Q q8, P5.d dVar) {
                super(2, dVar);
                this.f12352b = context;
                this.f12353c = g8;
                this.f12354d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0238b(this.f12352b, this.f12353c, this.f12354d, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((C0238b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f12351a == 0) {
                    L5.t.b(obj);
                    I x02 = new C3312F(this.f12352b).x0(this.f12353c.e());
                    if (!x02.b() && x02.d() != null) {
                        String d8 = x02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f12354d.f33745a = jSONObject.getInt("success");
                        }
                        if (this.f12354d.f33745a == 1) {
                            G g8 = this.f12353c;
                            g8.I(g8.f() + 1);
                        }
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private b() {
        }

        public final G a(JSONObject jsonObject) {
            AbstractC3159y.i(jsonObject, "jsonObject");
            G g8 = new G();
            if (!jsonObject.isNull("id")) {
                g8.G(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("userName")) {
                g8.X(jsonObject.getString("userName"));
                if (!jsonObject.isNull("userAvatar")) {
                    g8.z(jsonObject.getString("userAvatar"));
                }
                if (!jsonObject.isNull("userID")) {
                    g8.V(jsonObject.getString("userID"));
                }
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                g8.L(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull("timeAgo")) {
                g8.Q(jsonObject.getString("timeAgo"));
            }
            if (!jsonObject.isNull("likes")) {
                g8.I(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isAuthorVerified")) {
                g8.u(jsonObject.getInt("isAuthorVerified"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                g8.T(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                g8.Y(jsonObject.getString("usernameFormat"));
            }
            return g8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(X4.G r7, android.content.Context r8, P5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof X4.G.b.a
                if (r0 == 0) goto L13
                r0 = r9
                X4.G$b$a r0 = (X4.G.b.a) r0
                int r1 = r0.f12350d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12350d = r1
                goto L18
            L13:
                X4.G$b$a r0 = new X4.G$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12348b
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f12350d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f12347a
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                L5.t.b(r9)
                goto L5c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                L5.t.b(r9)
                l5.A r9 = l5.C3307A.f34459a
                long r4 = r7.e()
                r9.a(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                i6.I r2 = i6.C2812b0.b()
                X4.G$b$b r4 = new X4.G$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f12347a = r9
                r0.f12350d = r3
                java.lang.Object r7 = i6.AbstractC2825i.g(r2, r4, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                r7 = r9
            L5c:
                int r7 = r7.f33745a
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: X4.G.b.b(X4.G, android.content.Context, P5.d):java.lang.Object");
        }

        public final ArrayList c(JSONArray jsonArray) {
            AbstractC3159y.i(jsonArray, "jsonArray");
            ArrayList arrayList = new ArrayList();
            try {
                int length = jsonArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject jSONObject = jsonArray.getJSONObject(i8);
                    AbstractC3159y.h(jSONObject, "jsonArray.getJSONObject(i)");
                    arrayList.add(a(jSONObject));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public G() {
    }

    public final void G(long j8) {
        this.f12336a = j8;
    }

    public final void I(int i8) {
        this.f12343h = i8;
    }

    public final void L(String str) {
        this.f12341f = str;
    }

    public final void Q(String str) {
        this.f12342g = str;
    }

    public final void T(int i8) {
        this.f12345j = i8;
    }

    public final void V(String str) {
        this.f12338c = str;
    }

    public final void X(String str) {
        this.f12337b = str;
    }

    public final void Y(String str) {
        this.f12346k = str;
    }

    public final int b() {
        return this.f12344i;
    }

    public final String c() {
        return this.f12339d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final long e() {
        return this.f12336a;
    }

    public final int f() {
        return this.f12343h;
    }

    public final Spanned i() {
        String str = this.f12341f;
        if (str == null) {
            return null;
        }
        C3307A c3307a = C3307A.f34459a;
        AbstractC3159y.f(str);
        return c3307a.c(g6.n.A(str, "\n", "<br />", false, 4, null));
    }

    public final String j() {
        return this.f12342g;
    }

    public final String k() {
        return this.f12338c;
    }

    public final String n() {
        return this.f12337b;
    }

    public final String o() {
        return this.f12346k;
    }

    public final boolean s() {
        if (this.f12345j == 1) {
            return true;
        }
        return false;
    }

    public final void u(int i8) {
        this.f12344i = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12336a);
        parcel.writeLong(this.f12340e);
        parcel.writeString(this.f12337b);
        parcel.writeString(this.f12338c);
        parcel.writeString(this.f12339d);
        parcel.writeString(this.f12341f);
        parcel.writeString(this.f12342g);
        parcel.writeInt(this.f12343h);
        parcel.writeInt(this.f12344i);
        parcel.writeInt(this.f12345j);
        parcel.writeString(this.f12346k);
    }

    public final void z(String str) {
        this.f12339d = str;
    }

    public G(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12336a = source.readLong();
        this.f12340e = source.readLong();
        this.f12337b = source.readString();
        this.f12338c = source.readString();
        this.f12339d = source.readString();
        this.f12341f = source.readString();
        this.f12342g = source.readString();
        this.f12343h = source.readInt();
        this.f12344i = source.readInt();
        this.f12345j = source.readInt();
        this.f12346k = source.readString();
    }
}
