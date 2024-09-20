package com.stripe.android.stripe3ds2.transaction;

import L5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26824a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends h {
        public static final Parcelable.Creator<a> CREATOR = new C0680a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26825b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26826c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26827d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0680a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(intentData, "intentData");
            this.f26825b = str;
            this.f26826c = gVar;
            this.f26827d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26826c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26827d;
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
            return AbstractC3159y.d(this.f26825b, aVar.f26825b) && this.f26826c == aVar.f26826c && AbstractC3159y.d(this.f26827d, aVar.f26827d);
        }

        public final String f() {
            return this.f26825b;
        }

        public int hashCode() {
            String str = this.f26825b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Y3.g gVar = this.f26826c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f26827d.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.f26825b + ", initialUiType=" + this.f26826c + ", intentData=" + this.f26827d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26825b);
            Y3.g gVar = this.f26826c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26827d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final h a(Intent intent) {
            h hVar;
            if (intent == null || (hVar = (h) IntentCompat.getParcelableExtra(intent, "extra_result", h.class)) == null) {
                return new e(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, n.f26873e.a());
            }
            return hVar;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26828b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26829c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26830d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String uiTypeCode, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(uiTypeCode, "uiTypeCode");
            AbstractC3159y.i(intentData, "intentData");
            this.f26828b = uiTypeCode;
            this.f26829c = gVar;
            this.f26830d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26829c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26830d;
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
            return AbstractC3159y.d(this.f26828b, cVar.f26828b) && this.f26829c == cVar.f26829c && AbstractC3159y.d(this.f26830d, cVar.f26830d);
        }

        public final String f() {
            return this.f26828b;
        }

        public int hashCode() {
            int hashCode = this.f26828b.hashCode() * 31;
            Y3.g gVar = this.f26829c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26830d.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.f26828b + ", initialUiType=" + this.f26829c + ", intentData=" + this.f26830d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26828b);
            Y3.g gVar = this.f26829c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26830d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends h {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Y3.d f26831b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26832c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26833d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(Y3.d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y3.d data, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(data, "data");
            AbstractC3159y.i(intentData, "intentData");
            this.f26831b = data;
            this.f26832c = gVar;
            this.f26833d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26832c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26833d;
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
            return AbstractC3159y.d(this.f26831b, dVar.f26831b) && this.f26832c == dVar.f26832c && AbstractC3159y.d(this.f26833d, dVar.f26833d);
        }

        public int hashCode() {
            int hashCode = this.f26831b.hashCode() * 31;
            Y3.g gVar = this.f26832c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26833d.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f26831b + ", initialUiType=" + this.f26832c + ", intentData=" + this.f26833d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26831b.writeToParcel(out, i8);
            Y3.g gVar = this.f26832c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26833d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends h {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f26834b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26835c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26836d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable throwable, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(throwable, "throwable");
            AbstractC3159y.i(intentData, "intentData");
            this.f26834b = throwable;
            this.f26835c = gVar;
            this.f26836d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26835c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26836d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f26834b, eVar.f26834b) && this.f26835c == eVar.f26835c && AbstractC3159y.d(this.f26836d, eVar.f26836d);
        }

        public int hashCode() {
            int hashCode = this.f26834b.hashCode() * 31;
            Y3.g gVar = this.f26835c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26836d.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f26834b + ", initialUiType=" + this.f26835c + ", intentData=" + this.f26836d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26834b);
            Y3.g gVar = this.f26835c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26836d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends h {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26837b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26838c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26839d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new f(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String uiTypeCode, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(uiTypeCode, "uiTypeCode");
            AbstractC3159y.i(intentData, "intentData");
            this.f26837b = uiTypeCode;
            this.f26838c = gVar;
            this.f26839d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26838c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26839d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC3159y.d(this.f26837b, fVar.f26837b) && this.f26838c == fVar.f26838c && AbstractC3159y.d(this.f26839d, fVar.f26839d);
        }

        public final String f() {
            return this.f26837b;
        }

        public int hashCode() {
            int hashCode = this.f26837b.hashCode() * 31;
            Y3.g gVar = this.f26838c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26839d.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.f26837b + ", initialUiType=" + this.f26838c + ", intentData=" + this.f26839d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26837b);
            Y3.g gVar = this.f26838c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26839d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends h {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26840b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26841c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26842d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(intentData, "intentData");
            this.f26840b = str;
            this.f26841c = gVar;
            this.f26842d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26841c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26842d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3159y.d(this.f26840b, gVar.f26840b) && this.f26841c == gVar.f26841c && AbstractC3159y.d(this.f26842d, gVar.f26842d);
        }

        public final String f() {
            return this.f26840b;
        }

        public int hashCode() {
            String str = this.f26840b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Y3.g gVar = this.f26841c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f26842d.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.f26840b + ", initialUiType=" + this.f26841c + ", intentData=" + this.f26842d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26840b);
            Y3.g gVar = this.f26841c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26842d.writeToParcel(out, i8);
        }
    }

    private h() {
    }

    public abstract Y3.g b();

    public abstract n c();

    public final Bundle e() {
        return BundleKt.bundleOf(x.a("extra_result", this));
    }

    public /* synthetic */ h(AbstractC3151p abstractC3151p) {
        this();
    }
}
