package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import b3.InterfaceC1863H;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class v implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f24727a;

    /* renamed from: b, reason: collision with root package name */
    private final d f24728b;

    /* renamed from: c, reason: collision with root package name */
    private static final a f24725c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f24726d = 8;
    public static final Parcelable.Creator<v> CREATOR = new b();

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
        public final v createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC3159y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(c.CREATOR.createFromParcel(parcel));
                }
            }
            return new v(arrayList, parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0530c f24730a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f24731b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24732c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24733d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24734e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f24735f;

        /* renamed from: g, reason: collision with root package name */
        private static final a f24729g = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

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
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : EnumC0530c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.model.v$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0530c {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0530c f24736b = new EnumC0530c("Sku", 0, "sku");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0530c f24737c = new EnumC0530c("Tax", 1, "tax");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0530c f24738d = new EnumC0530c("Shipping", 2, "shipping");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ EnumC0530c[] f24739e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24740f;

            /* renamed from: a, reason: collision with root package name */
            private final String f24741a;

            static {
                EnumC0530c[] a8 = a();
                f24739e = a8;
                f24740f = R5.b.a(a8);
            }

            private EnumC0530c(String str, int i8, String str2) {
                this.f24741a = str2;
            }

            private static final /* synthetic */ EnumC0530c[] a() {
                return new EnumC0530c[]{f24736b, f24737c, f24738d};
            }

            public static EnumC0530c valueOf(String str) {
                return (EnumC0530c) Enum.valueOf(EnumC0530c.class, str);
            }

            public static EnumC0530c[] values() {
                return (EnumC0530c[]) f24739e.clone();
            }

            public final String b() {
                return this.f24741a;
            }
        }

        public c(EnumC0530c enumC0530c, Integer num, String str, String str2, String str3, Integer num2) {
            this.f24730a = enumC0530c;
            this.f24731b = num;
            this.f24732c = str;
            this.f24733d = str2;
            this.f24734e = str3;
            this.f24735f = num2;
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
            return this.f24730a == cVar.f24730a && AbstractC3159y.d(this.f24731b, cVar.f24731b) && AbstractC3159y.d(this.f24732c, cVar.f24732c) && AbstractC3159y.d(this.f24733d, cVar.f24733d) && AbstractC3159y.d(this.f24734e, cVar.f24734e) && AbstractC3159y.d(this.f24735f, cVar.f24735f);
        }

        public int hashCode() {
            EnumC0530c enumC0530c = this.f24730a;
            int hashCode = (enumC0530c == null ? 0 : enumC0530c.hashCode()) * 31;
            Integer num = this.f24731b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f24732c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24733d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24734e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f24735f;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.f24730a + ", amount=" + this.f24731b + ", currency=" + this.f24732c + ", description=" + this.f24733d + ", parent=" + this.f24734e + ", quantity=" + this.f24735f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            EnumC0530c enumC0530c = this.f24730a;
            if (enumC0530c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC0530c.name());
            }
            Integer num = this.f24731b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f24732c);
            out.writeString(this.f24733d);
            out.writeString(this.f24734e);
            Integer num2 = this.f24735f;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            Map h8 = Q.h();
            Integer num = this.f24731b;
            Map map6 = null;
            if (num != null) {
                map = Q.e(L5.x.a(RewardPlus.AMOUNT, Integer.valueOf(num.intValue())));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f24732c;
            if (str != null) {
                map2 = Q.e(L5.x.a("currency", str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f24733d;
            if (str2 != null) {
                map3 = Q.e(L5.x.a("description", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f24734e;
            if (str3 != null) {
                map4 = Q.e(L5.x.a("parent", str3));
            } else {
                map4 = null;
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            Map q11 = Q.q(q10, map4);
            Integer num2 = this.f24735f;
            if (num2 != null) {
                map5 = Q.e(L5.x.a("quantity", Integer.valueOf(num2.intValue())));
            } else {
                map5 = null;
            }
            if (map5 == null) {
                map5 = Q.h();
            }
            Map q12 = Q.q(q11, map5);
            EnumC0530c enumC0530c = this.f24730a;
            if (enumC0530c != null) {
                map6 = Q.e(L5.x.a("type", enumC0530c.b()));
            }
            if (map6 == null) {
                map6 = Q.h();
            }
            return Q.q(q12, map6);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24743a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24744b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24745c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24746d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24747e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f24742f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3159y.i(address, "address");
            this.f24743a = address;
            this.f24744b = str;
            this.f24745c = str2;
            this.f24746d = str3;
            this.f24747e = str4;
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
            return AbstractC3159y.d(this.f24743a, dVar.f24743a) && AbstractC3159y.d(this.f24744b, dVar.f24744b) && AbstractC3159y.d(this.f24745c, dVar.f24745c) && AbstractC3159y.d(this.f24746d, dVar.f24746d) && AbstractC3159y.d(this.f24747e, dVar.f24747e);
        }

        public int hashCode() {
            int hashCode = this.f24743a.hashCode() * 31;
            String str = this.f24744b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24745c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24746d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24747e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f24743a + ", carrier=" + this.f24744b + ", name=" + this.f24745c + ", phone=" + this.f24746d + ", trackingNumber=" + this.f24747e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24743a.writeToParcel(out, i8);
            out.writeString(this.f24744b);
            out.writeString(this.f24745c);
            out.writeString(this.f24746d);
            out.writeString(this.f24747e);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Map map3;
            Map e8 = Q.e(L5.x.a("address", this.f24743a.y()));
            String str = this.f24744b;
            Map map4 = null;
            if (str != null) {
                map = Q.e(L5.x.a("carrier", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(e8, map);
            String str2 = this.f24745c;
            if (str2 != null) {
                map2 = Q.e(L5.x.a("name", str2));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str3 = this.f24746d;
            if (str3 != null) {
                map3 = Q.e(L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str4 = this.f24747e;
            if (str4 != null) {
                map4 = Q.e(L5.x.a("tracking_number", str4));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }
    }

    public v(List list, d dVar) {
        this.f24727a = list;
        this.f24728b = dVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC3159y.d(this.f24727a, vVar.f24727a) && AbstractC3159y.d(this.f24728b, vVar.f24728b);
    }

    public int hashCode() {
        List list = this.f24727a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        d dVar = this.f24728b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "SourceOrderParams(items=" + this.f24727a + ", shipping=" + this.f24728b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        List list = this.f24727a;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).writeToParcel(out, i8);
            }
        }
        d dVar = this.f24728b;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map h8 = Q.h();
        List list = this.f24727a;
        Map map2 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).y());
            }
            map = Q.e(L5.x.a("items", arrayList));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(h8, map);
        d dVar = this.f24728b;
        if (dVar != null) {
            map2 = Q.e(L5.x.a("shipping", dVar.y()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(q8, map2);
    }
}
