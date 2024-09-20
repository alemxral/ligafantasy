package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1860E implements v2.f {
    public static final Parcelable.Creator<C1860E> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f14267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14268b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14269c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14270d;

    /* renamed from: e, reason: collision with root package name */
    private final c f14271e;

    /* renamed from: b3.E$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1860E createFromParcel(Parcel parcel) {
            Integer valueOf;
            AbstractC3159y.i(parcel, "parcel");
            c cVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                cVar = c.CREATOR.createFromParcel(parcel);
            }
            return new C1860E(valueOf, readString, readString2, arrayList, cVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1860E[] newArray(int i8) {
            return new C1860E[i8];
        }
    }

    /* renamed from: b3.E$b */
    /* loaded from: classes4.dex */
    public static final class b implements v2.f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0353b f14272a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f14273b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14274c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14275d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f14276e;

        /* renamed from: b3.E$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                AbstractC3159y.i(parcel, "parcel");
                EnumC0353b valueOf3 = EnumC0353b.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new b(valueOf3, valueOf, readString, readString2, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: b3.E$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0353b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f14277b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0353b f14278c = new EnumC0353b("Sku", 0, "sku");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0353b f14279d = new EnumC0353b("Tax", 1, "tax");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0353b f14280e = new EnumC0353b("Shipping", 2, "shipping");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ EnumC0353b[] f14281f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ R5.a f14282g;

            /* renamed from: a, reason: collision with root package name */
            private final String f14283a;

            /* renamed from: b3.E$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final /* synthetic */ EnumC0353b a(String str) {
                    Object obj;
                    Iterator<E> it = EnumC0353b.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((EnumC0353b) obj).f14283a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (EnumC0353b) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                EnumC0353b[] a8 = a();
                f14281f = a8;
                f14282g = R5.b.a(a8);
                f14277b = new a(null);
            }

            private EnumC0353b(String str, int i8, String str2) {
                this.f14283a = str2;
            }

            private static final /* synthetic */ EnumC0353b[] a() {
                return new EnumC0353b[]{f14278c, f14279d, f14280e};
            }

            public static R5.a c() {
                return f14282g;
            }

            public static EnumC0353b valueOf(String str) {
                return (EnumC0353b) Enum.valueOf(EnumC0353b.class, str);
            }

            public static EnumC0353b[] values() {
                return (EnumC0353b[]) f14281f.clone();
            }
        }

        public b(EnumC0353b type, Integer num, String str, String str2, Integer num2) {
            AbstractC3159y.i(type, "type");
            this.f14272a = type;
            this.f14273b = num;
            this.f14274c = str;
            this.f14275d = str2;
            this.f14276e = num2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f14272a == bVar.f14272a && AbstractC3159y.d(this.f14273b, bVar.f14273b) && AbstractC3159y.d(this.f14274c, bVar.f14274c) && AbstractC3159y.d(this.f14275d, bVar.f14275d) && AbstractC3159y.d(this.f14276e, bVar.f14276e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f14272a.hashCode() * 31;
            Integer num = this.f14273b;
            int i8 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str = this.f14274c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f14275d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            Integer num2 = this.f14276e;
            if (num2 != null) {
                i8 = num2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "Item(type=" + this.f14272a + ", amount=" + this.f14273b + ", currency=" + this.f14274c + ", description=" + this.f14275d + ", quantity=" + this.f14276e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14272a.name());
            Integer num = this.f14273b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f14274c);
            out.writeString(this.f14275d);
            Integer num2 = this.f14276e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* renamed from: b3.E$c */
    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f14284a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14285b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14286c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14287d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14288e;

        /* renamed from: b3.E$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new c(createFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4) {
            this.f14284a = aVar;
            this.f14285b = str;
            this.f14286c = str2;
            this.f14287d = str3;
            this.f14288e = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f14284a, cVar.f14284a) && AbstractC3159y.d(this.f14285b, cVar.f14285b) && AbstractC3159y.d(this.f14286c, cVar.f14286c) && AbstractC3159y.d(this.f14287d, cVar.f14287d) && AbstractC3159y.d(this.f14288e, cVar.f14288e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f14284a;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f14285b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f14286c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f14287d;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str4 = this.f14288e;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "Shipping(address=" + this.f14284a + ", carrier=" + this.f14285b + ", name=" + this.f14286c + ", phone=" + this.f14287d + ", trackingNumber=" + this.f14288e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f14284a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f14285b);
            out.writeString(this.f14286c);
            out.writeString(this.f14287d);
            out.writeString(this.f14288e);
        }
    }

    public C1860E(Integer num, String str, String str2, List items, c cVar) {
        AbstractC3159y.i(items, "items");
        this.f14267a = num;
        this.f14268b = str;
        this.f14269c = str2;
        this.f14270d = items;
        this.f14271e = cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1860E)) {
            return false;
        }
        C1860E c1860e = (C1860E) obj;
        if (AbstractC3159y.d(this.f14267a, c1860e.f14267a) && AbstractC3159y.d(this.f14268b, c1860e.f14268b) && AbstractC3159y.d(this.f14269c, c1860e.f14269c) && AbstractC3159y.d(this.f14270d, c1860e.f14270d) && AbstractC3159y.d(this.f14271e, c1860e.f14271e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f14267a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f14268b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14269c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i10 + hashCode3) * 31) + this.f14270d.hashCode()) * 31;
        c cVar = this.f14271e;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return hashCode4 + i8;
    }

    public String toString() {
        return "SourceOrder(amount=" + this.f14267a + ", currency=" + this.f14268b + ", email=" + this.f14269c + ", items=" + this.f14270d + ", shipping=" + this.f14271e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        Integer num = this.f14267a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f14268b);
        out.writeString(this.f14269c);
        List list = this.f14270d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(out, i8);
        }
        c cVar = this.f14271e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
    }
}
