package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class o implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f26060b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f26061a;

    /* loaded from: classes4.dex */
    public static final class a extends o {
        public static final Parcelable.Creator<a> CREATOR = new C0616a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f26062c;

        /* renamed from: d, reason: collision with root package name */
        private final AbstractC3991f f26063d;

        /* renamed from: e, reason: collision with root package name */
        private final List f26064e;

        /* renamed from: com.stripe.android.paymentsheet.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0616a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                AbstractC3991f abstractC3991f = (AbstractC3991f) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(a.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new a(th, abstractC3991f, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Throwable th, AbstractC3991f abstractC3991f, List list) {
            super(0, null);
            this.f26062c = th;
            this.f26063d = abstractC3991f;
            this.f26064e = list;
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
            return AbstractC3159y.d(this.f26062c, aVar.f26062c) && AbstractC3159y.d(this.f26063d, aVar.f26063d) && AbstractC3159y.d(this.f26064e, aVar.f26064e);
        }

        public int hashCode() {
            Throwable th = this.f26062c;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f26063d;
            int hashCode2 = (hashCode + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31;
            List list = this.f26064e;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.f26062c + ", paymentSelection=" + this.f26063d + ", paymentMethods=" + this.f26064e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26062c);
            out.writeParcelable(this.f26063d, i8);
            List list = this.f26064e;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ o a(Intent intent) {
            if (intent != null) {
                return (o) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends o {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3991f f26065c;

        /* renamed from: d, reason: collision with root package name */
        private final List f26066d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
                AbstractC3991f abstractC3991f = (AbstractC3991f) parcel.readParcelable(c.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(c.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new c(abstractC3991f, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC3991f paymentSelection, List list) {
            super(-1, null);
            AbstractC3159y.i(paymentSelection, "paymentSelection");
            this.f26065c = paymentSelection;
            this.f26066d = list;
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
            return AbstractC3159y.d(this.f26065c, cVar.f26065c) && AbstractC3159y.d(this.f26066d, cVar.f26066d);
        }

        public int hashCode() {
            int hashCode = this.f26065c.hashCode() * 31;
            List list = this.f26066d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.f26065c + ", paymentMethods=" + this.f26066d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26065c, i8);
            List list = this.f26066d;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    public /* synthetic */ o(int i8, AbstractC3151p abstractC3151p) {
        this(i8);
    }

    public final int b() {
        return this.f26061a;
    }

    public final Bundle c() {
        return BundleKt.bundleOf(L5.x.a("extra_activity_result", this));
    }

    private o(int i8) {
        this.f26061a = i8;
    }
}
