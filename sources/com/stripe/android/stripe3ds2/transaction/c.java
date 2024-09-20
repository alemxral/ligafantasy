package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements Serializable, Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0677a();

        /* renamed from: a, reason: collision with root package name */
        private final V3.k f26804a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26805b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.a f26806c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26807d;

        /* renamed from: e, reason: collision with root package name */
        private final b f26808e;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0677a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((V3.k) parcel.readSerializable(), parcel.readString(), Y3.a.CREATOR.createFromParcel(parcel), parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Serializable, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C0678a();

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f26809a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f26810b;

            /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0678a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                AbstractC3159y.i(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                AbstractC3159y.i(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.f26809a = sdkPrivateKeyEncoded;
                this.f26810b = acsPublicKeyEncoded;
            }

            private final boolean e(b bVar) {
                if (Arrays.equals(this.f26809a, bVar.f26809a) && Arrays.equals(this.f26810b, bVar.f26810b)) {
                    return true;
                }
                return false;
            }

            public final byte[] b() {
                return this.f26810b;
            }

            public final byte[] c() {
                return this.f26809a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return e((b) obj);
                }
                return false;
            }

            public int hashCode() {
                return Z3.c.b(this.f26809a, this.f26810b);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.f26809a) + ", acsPublicKeyEncoded=" + Arrays.toString(this.f26810b) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeByteArray(this.f26809a);
                out.writeByteArray(this.f26810b);
            }
        }

        public a(V3.k messageTransformer, String sdkReferenceId, Y3.a creqData, String acsUrl, b keys) {
            AbstractC3159y.i(messageTransformer, "messageTransformer");
            AbstractC3159y.i(sdkReferenceId, "sdkReferenceId");
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(acsUrl, "acsUrl");
            AbstractC3159y.i(keys, "keys");
            this.f26804a = messageTransformer;
            this.f26805b = sdkReferenceId;
            this.f26806c = creqData;
            this.f26807d = acsUrl;
            this.f26808e = keys;
        }

        public final String b() {
            return this.f26807d;
        }

        public final b c() {
            return this.f26808e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final V3.k e() {
            return this.f26804a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26804a, aVar.f26804a) && AbstractC3159y.d(this.f26805b, aVar.f26805b) && AbstractC3159y.d(this.f26806c, aVar.f26806c) && AbstractC3159y.d(this.f26807d, aVar.f26807d) && AbstractC3159y.d(this.f26808e, aVar.f26808e);
        }

        public final String f() {
            return this.f26805b;
        }

        public int hashCode() {
            return (((((((this.f26804a.hashCode() * 31) + this.f26805b.hashCode()) * 31) + this.f26806c.hashCode()) * 31) + this.f26807d.hashCode()) * 31) + this.f26808e.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.f26804a + ", sdkReferenceId=" + this.f26805b + ", creqData=" + this.f26806c + ", acsUrl=" + this.f26807d + ", keys=" + this.f26808e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26804a);
            out.writeString(this.f26805b);
            this.f26806c.writeToParcel(out, i8);
            out.writeString(this.f26807d);
            this.f26808e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Serializable {
        c s(U3.c cVar, P5.g gVar);
    }

    Object a(Y3.a aVar, P5.d dVar);
}
