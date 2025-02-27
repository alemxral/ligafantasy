package j2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f33030d;

    /* renamed from: a, reason: collision with root package name */
    private final c f33032a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f33028b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f33029c = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final p f33031e = new a().b(new c.a().a()).a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private c f33033a;

        public final p a() {
            c cVar = this.f33033a;
            if (cVar != null) {
                return new p(cVar, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final a b(c stripe3ds2Config) {
            AbstractC3159y.i(stripe3ds2Config, "stripe3ds2Config");
            this.f33033a = stripe3ds2Config;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final p a() {
            p pVar = p.f33030d;
            if (pVar == null) {
                return p.f33031e;
            }
            return pVar;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final int f33036a;

        /* renamed from: b, reason: collision with root package name */
        private final d f33037b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f33034c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f33035d = 8;
        public static final Parcelable.Creator<c> CREATOR = new C0766c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f33038a = 5;

            /* renamed from: b, reason: collision with root package name */
            private d f33039b = new d.a().a();

            public final c a() {
                return new c(this.f33038a, this.f33039b);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: j2.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0766c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readInt(), d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(int i8, d uiCustomization) {
            AbstractC3159y.i(uiCustomization, "uiCustomization");
            this.f33036a = i8;
            this.f33037b = uiCustomization;
            b(i8);
        }

        private final void b(int i8) {
            if (i8 >= 5 && i8 <= 99) {
            } else {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public final int c() {
            return this.f33036a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final d e() {
            return this.f33037b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f33036a == cVar.f33036a && AbstractC3159y.d(this.f33037b, cVar.f33037b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f33036a * 31) + this.f33037b.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.f33036a + ", uiCustomization=" + this.f33037b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f33036a);
            this.f33037b.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final T3.m f33040a;

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d((T3.m) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(T3.m uiCustomization) {
            AbstractC3159y.i(uiCustomization, "uiCustomization");
            this.f33040a = uiCustomization;
        }

        public final T3.m b() {
            return this.f33040a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3159y.d(this.f33040a, ((d) obj).f33040a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f33040a.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.f33040a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f33040a, i8);
        }

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final C0767a f33041b = new C0767a(null);

            /* renamed from: c, reason: collision with root package name */
            public static final int f33042c = 8;

            /* renamed from: a, reason: collision with root package name */
            private final T3.m f33043a;

            /* renamed from: j2.p$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0767a {
                private C0767a() {
                }

                public /* synthetic */ C0767a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            private a(T3.m mVar) {
                this.f33043a = mVar;
            }

            public final d a() {
                return new d(this.f33043a);
            }

            public a() {
                this(new T3.m());
            }
        }
    }

    public /* synthetic */ p(c cVar, AbstractC3151p abstractC3151p) {
        this(cVar);
    }

    public final c c() {
        return this.f33032a;
    }

    private p(c cVar) {
        this.f33032a = cVar;
    }
}
