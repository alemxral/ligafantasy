package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsCallback;
import b3.InterfaceC1863H;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final c f24305a;

    /* renamed from: b, reason: collision with root package name */
    private static final a f24304b = new a(null);
    public static final Parcelable.Creator<m> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new m((c) parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24306a;

        /* loaded from: classes4.dex */
        public static final class a extends c {

            /* renamed from: b, reason: collision with root package name */
            private final String f24309b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24310c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f24311d;

            /* renamed from: e, reason: collision with root package name */
            public static final C0513a f24307e = new C0513a(null);
            public static final Parcelable.Creator<a> CREATOR = new b();

            /* renamed from: f, reason: collision with root package name */
            private static final a f24308f = new a(null, null, true, 3, null);

            /* renamed from: com.stripe.android.model.m$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0513a {
                private C0513a() {
                }

                public final a a() {
                    return a.f24308f;
                }

                public /* synthetic */ C0513a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(String str, String str2, boolean z8, int i8, AbstractC3151p abstractC3151p) {
                this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? false : z8);
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
                return AbstractC3159y.d(this.f24309b, aVar.f24309b) && AbstractC3159y.d(this.f24310c, aVar.f24310c) && this.f24311d == aVar.f24311d;
            }

            public int hashCode() {
                String str = this.f24309b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f24310c;
                return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f24311d);
            }

            public String toString() {
                return "Online(ipAddress=" + this.f24309b + ", userAgent=" + this.f24310c + ", inferFromClient=" + this.f24311d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24309b);
                out.writeString(this.f24310c);
                out.writeInt(this.f24311d ? 1 : 0);
            }

            @Override // b3.InterfaceC1863H
            public Map y() {
                if (this.f24311d) {
                    return Q.e(L5.x.a("infer_from_client", Boolean.TRUE));
                }
                String str = this.f24309b;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                L5.r a8 = L5.x.a("ip_address", str);
                String str3 = this.f24310c;
                if (str3 != null) {
                    str2 = str3;
                }
                return Q.k(a8, L5.x.a("user_agent", str2));
            }

            public a(String str, String str2, boolean z8) {
                super(CustomTabsCallback.ONLINE_EXTRAS_KEY, null);
                this.f24309b = str;
                this.f24310c = str2;
                this.f24311d = z8;
            }
        }

        public /* synthetic */ c(String str, AbstractC3151p abstractC3151p) {
            this(str);
        }

        public final String b() {
            return this.f24306a;
        }

        private c(String str) {
            this.f24306a = str;
        }
    }

    public m(c type) {
        AbstractC3159y.i(type, "type");
        this.f24305a = type;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && AbstractC3159y.d(this.f24305a, ((m) obj).f24305a);
    }

    public int hashCode() {
        return this.f24305a.hashCode();
    }

    public String toString() {
        return "MandateDataParams(type=" + this.f24305a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24305a, i8);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        return Q.e(L5.x.a("customer_acceptance", Q.k(L5.x.a("type", this.f24305a.b()), L5.x.a(this.f24305a.b(), this.f24305a.y()))));
    }
}
