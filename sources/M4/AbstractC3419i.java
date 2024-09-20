package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k4.InterfaceC3123c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3419i implements Parcelable {

    /* renamed from: m4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3419i implements InterfaceC3123c {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f35519a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f35520b;

        /* renamed from: c, reason: collision with root package name */
        private final W f35521c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f35522d;

        /* renamed from: m4.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new b(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3159y.i(phoneNumberState, "phoneNumberState");
            AbstractC3159y.i(onNavigation, "onNavigation");
            this.f35519a = str;
            this.f35520b = set;
            this.f35521c = phoneNumberState;
            this.f35522d = onNavigation;
        }

        @Override // k4.InterfaceC3123c
        public boolean b(String str, I i8) {
            return InterfaceC3123c.a.a(this, str, i8);
        }

        @Override // k4.InterfaceC3123c
        public String c() {
            return this.f35519a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // k4.InterfaceC3123c
        public Function0 e() {
            return this.f35522d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f35519a, bVar.f35519a) && AbstractC3159y.d(this.f35520b, bVar.f35520b) && this.f35521c == bVar.f35521c && AbstractC3159y.d(this.f35522d, bVar.f35522d)) {
                return true;
            }
            return false;
        }

        @Override // k4.InterfaceC3123c
        public Set f() {
            return this.f35520b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f35519a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f35520b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f35521c.hashCode()) * 31) + this.f35522d.hashCode();
        }

        @Override // m4.AbstractC3419i
        public W i() {
            return this.f35521c;
        }

        public String toString() {
            return "ShippingCondensed(googleApiKey=" + this.f35519a + ", autocompleteCountries=" + this.f35520b + ", phoneNumberState=" + this.f35521c + ", onNavigation=" + this.f35522d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f35519a);
            Set set = this.f35520b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f35521c.name());
            out.writeSerializable((Serializable) this.f35522d);
        }
    }

    /* renamed from: m4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3419i implements InterfaceC3123c {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f35523a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f35524b;

        /* renamed from: c, reason: collision with root package name */
        private final W f35525c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f35526d;

        /* renamed from: m4.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new c(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3159y.i(phoneNumberState, "phoneNumberState");
            AbstractC3159y.i(onNavigation, "onNavigation");
            this.f35523a = str;
            this.f35524b = set;
            this.f35525c = phoneNumberState;
            this.f35526d = onNavigation;
        }

        @Override // k4.InterfaceC3123c
        public boolean b(String str, I i8) {
            return InterfaceC3123c.a.a(this, str, i8);
        }

        @Override // k4.InterfaceC3123c
        public String c() {
            return this.f35523a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // k4.InterfaceC3123c
        public Function0 e() {
            return this.f35526d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f35523a, cVar.f35523a) && AbstractC3159y.d(this.f35524b, cVar.f35524b) && this.f35525c == cVar.f35525c && AbstractC3159y.d(this.f35526d, cVar.f35526d)) {
                return true;
            }
            return false;
        }

        @Override // k4.InterfaceC3123c
        public Set f() {
            return this.f35524b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f35523a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f35524b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f35525c.hashCode()) * 31) + this.f35526d.hashCode();
        }

        @Override // m4.AbstractC3419i
        public W i() {
            return this.f35525c;
        }

        public String toString() {
            return "ShippingExpanded(googleApiKey=" + this.f35523a + ", autocompleteCountries=" + this.f35524b + ", phoneNumberState=" + this.f35525c + ", onNavigation=" + this.f35526d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f35523a);
            Set set = this.f35524b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f35525c.name());
            out.writeSerializable((Serializable) this.f35526d);
        }
    }

    public /* synthetic */ AbstractC3419i(AbstractC3151p abstractC3151p) {
        this();
    }

    public abstract W i();

    /* renamed from: m4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3419i {
        public static final Parcelable.Creator<a> CREATOR = new C0820a();

        /* renamed from: a, reason: collision with root package name */
        private final W f35518a;

        /* renamed from: m4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0820a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(W.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(W w8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? W.f35276b : w8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f35518a == ((a) obj).f35518a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35518a.hashCode();
        }

        @Override // m4.AbstractC3419i
        public W i() {
            return this.f35518a;
        }

        public String toString() {
            return "Normal(phoneNumberState=" + this.f35518a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f35518a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W phoneNumberState) {
            super(null);
            AbstractC3159y.i(phoneNumberState, "phoneNumberState");
            this.f35518a = phoneNumberState;
        }
    }

    private AbstractC3419i() {
    }
}
