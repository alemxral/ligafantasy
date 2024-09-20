package com.stripe.android.model;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import g6.C2728d;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f24782a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24783b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24784c;

    /* renamed from: d, reason: collision with root package name */
    private final b f24785d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new x(parcel.readString(), parcel.readString(), parcel.readString(), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i8) {
            return new x[i8];
        }
    }

    public x(String source, String directoryServerName, String serverTransactionId, b directoryServerEncryption) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(directoryServerName, "directoryServerName");
        AbstractC3159y.i(serverTransactionId, "serverTransactionId");
        AbstractC3159y.i(directoryServerEncryption, "directoryServerEncryption");
        this.f24782a = source;
        this.f24783b = directoryServerName;
        this.f24784c = serverTransactionId;
        this.f24785d = directoryServerEncryption;
    }

    public final b b() {
        return this.f24785d;
    }

    public final String c() {
        return this.f24783b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f24782a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC3159y.d(this.f24782a, xVar.f24782a) && AbstractC3159y.d(this.f24783b, xVar.f24783b) && AbstractC3159y.d(this.f24784c, xVar.f24784c) && AbstractC3159y.d(this.f24785d, xVar.f24785d);
    }

    public int hashCode() {
        return (((((this.f24782a.hashCode() * 31) + this.f24783b.hashCode()) * 31) + this.f24784c.hashCode()) * 31) + this.f24785d.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.f24782a + ", directoryServerName=" + this.f24783b + ", serverTransactionId=" + this.f24784c + ", directoryServerEncryption=" + this.f24785d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24782a);
        out.writeString(this.f24783b);
        out.writeString(this.f24784c);
        this.f24785d.writeToParcel(out, i8);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24788a;

        /* renamed from: b, reason: collision with root package name */
        private final PublicKey f24789b;

        /* renamed from: c, reason: collision with root package name */
        private final List f24790c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24791d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f24786e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f24787f = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0532b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate c(String str) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str.getBytes(C2728d.f31279b);
                AbstractC3159y.h(bytes, "getBytes(...)");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                AbstractC3159y.g(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List d(List list) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(b.f24786e.c((String) it.next()));
                }
                return arrayList;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.x$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0532b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new b(readString, publicKey, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String directoryServerId, PublicKey directoryServerPublicKey, List rootCerts, String str) {
            AbstractC3159y.i(directoryServerId, "directoryServerId");
            AbstractC3159y.i(directoryServerPublicKey, "directoryServerPublicKey");
            AbstractC3159y.i(rootCerts, "rootCerts");
            this.f24788a = directoryServerId;
            this.f24789b = directoryServerPublicKey;
            this.f24790c = rootCerts;
            this.f24791d = str;
        }

        public final String c() {
            return this.f24788a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final PublicKey e() {
            return this.f24789b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f24788a, bVar.f24788a) && AbstractC3159y.d(this.f24789b, bVar.f24789b) && AbstractC3159y.d(this.f24790c, bVar.f24790c) && AbstractC3159y.d(this.f24791d, bVar.f24791d);
        }

        public final String f() {
            return this.f24791d;
        }

        public int hashCode() {
            int hashCode = ((((this.f24788a.hashCode() * 31) + this.f24789b.hashCode()) * 31) + this.f24790c.hashCode()) * 31;
            String str = this.f24791d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final List i() {
            return this.f24790c;
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.f24788a + ", directoryServerPublicKey=" + this.f24789b + ", rootCerts=" + this.f24790c + ", keyId=" + this.f24791d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24788a);
            out.writeSerializable(this.f24789b);
            List list = this.f24790c;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeSerializable((Serializable) it.next());
            }
            out.writeString(this.f24791d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.lang.String r3, java.lang.String r4, java.util.List r5, java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "directoryServerId"
                kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                java.lang.String r0 = "dsCertificateData"
                kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                java.lang.String r0 = "rootCertsData"
                kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                com.stripe.android.model.x$b$a r0 = com.stripe.android.model.x.b.f24786e
                java.security.cert.X509Certificate r4 = com.stripe.android.model.x.b.a.a(r0, r4)
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "getPublicKey(...)"
                kotlin.jvm.internal.AbstractC3159y.h(r4, r1)
                java.util.List r5 = com.stripe.android.model.x.b.a.b(r0, r5)
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.x.b.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(StripeIntent.a.j.b sdkData) {
        this(sdkData.i(), sdkData.f(), sdkData.k(), new b(sdkData.e().b(), sdkData.e().c(), sdkData.e().f(), sdkData.e().e()));
        AbstractC3159y.i(sdkData, "sdkData");
    }
}
