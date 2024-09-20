package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0669a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0669a f26785a = new C0669a();
        public static final Parcelable.Creator<C0669a> CREATOR = new C0670a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0670a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0669a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0669a.f26785a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0669a[] newArray(int i8) {
                return new C0669a[i8];
            }
        }

        private C0669a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0671a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26786a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0671a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String userEntry) {
            super(null);
            AbstractC3159y.i(userEntry, "userEntry");
            this.f26786a = userEntry;
        }

        public final String b() {
            return this.f26786a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f26786a, ((b) obj).f26786a);
        }

        public int hashCode() {
            return this.f26786a.hashCode();
        }

        public String toString() {
            return "HtmlForm(userEntry=" + this.f26786a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0672a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26787a;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0672a implements Parcelable.Creator {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String userEntry) {
            super(null);
            AbstractC3159y.i(userEntry, "userEntry");
            this.f26787a = userEntry;
        }

        public final String b() {
            return this.f26787a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f26787a, ((c) obj).f26787a);
        }

        public int hashCode() {
            return this.f26787a.hashCode();
        }

        public String toString() {
            return "NativeForm(userEntry=" + this.f26787a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26787a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26788a = new d();
        public static final Parcelable.Creator<d> CREATOR = new C0673a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0673a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return d.f26788a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f26789a = new e();
        public static final Parcelable.Creator<e> CREATOR = new C0674a();

        /* renamed from: com.stripe.android.stripe3ds2.transaction.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0674a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return e.f26789a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        private e() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }
}
