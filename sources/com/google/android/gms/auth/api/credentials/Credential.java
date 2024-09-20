package com.google.android.gms.auth.api.credentials;

import R.AbstractC1317n;
import R.AbstractC1319p;
import S.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class Credential extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Credential> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f15004a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15005b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f15006c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15007d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15008e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15009f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15010g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15011h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        Boolean bool;
        String trim = ((String) AbstractC1319p.m(str, "credential identifier cannot be null")).trim();
        AbstractC1319p.g(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                    boolean z8 = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z8 = false;
                    }
                    bool = Boolean.valueOf(z8);
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f15005b = str2;
        this.f15006c = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        this.f15007d = unmodifiableList;
        this.f15004a = trim;
        this.f15008e = str3;
        this.f15009f = str4;
        this.f15010g = str5;
        this.f15011h = str6;
    }

    public List G() {
        return this.f15007d;
    }

    public String I() {
        return this.f15005b;
    }

    public String L() {
        return this.f15008e;
    }

    public Uri V() {
        return this.f15006c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.f15004a, credential.f15004a) && TextUtils.equals(this.f15005b, credential.f15005b) && AbstractC1317n.a(this.f15006c, credential.f15006c) && TextUtils.equals(this.f15008e, credential.f15008e) && TextUtils.equals(this.f15009f, credential.f15009f)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f15004a;
    }

    public int hashCode() {
        return AbstractC1317n.b(this.f15004a, this.f15005b, this.f15006c, this.f15008e, this.f15009f);
    }

    public String s() {
        return this.f15009f;
    }

    public String u() {
        return this.f15011h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 1, getId(), false);
        c.q(parcel, 2, I(), false);
        c.p(parcel, 3, V(), i8, false);
        c.u(parcel, 4, G(), false);
        c.q(parcel, 5, L(), false);
        c.q(parcel, 6, s(), false);
        c.q(parcel, 9, z(), false);
        c.q(parcel, 10, u(), false);
        c.b(parcel, a8);
    }

    public String z() {
        return this.f15010g;
    }
}
