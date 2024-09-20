package R;

import O.C1260d;
import R.InterfaceC1313j;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* renamed from: R.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1309f extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1309f> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f8529o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C1260d[] f8530p = new C1260d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f8531a;

    /* renamed from: b, reason: collision with root package name */
    final int f8532b;

    /* renamed from: c, reason: collision with root package name */
    final int f8533c;

    /* renamed from: d, reason: collision with root package name */
    String f8534d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f8535e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f8536f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f8537g;

    /* renamed from: h, reason: collision with root package name */
    Account f8538h;

    /* renamed from: i, reason: collision with root package name */
    C1260d[] f8539i;

    /* renamed from: j, reason: collision with root package name */
    C1260d[] f8540j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f8541k;

    /* renamed from: l, reason: collision with root package name */
    final int f8542l;

    /* renamed from: m, reason: collision with root package name */
    boolean f8543m;

    /* renamed from: n, reason: collision with root package name */
    private final String f8544n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1309f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1260d[] c1260dArr, C1260d[] c1260dArr2, boolean z8, int i11, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f8529o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1260dArr = c1260dArr == null ? f8530p : c1260dArr;
        c1260dArr2 = c1260dArr2 == null ? f8530p : c1260dArr2;
        this.f8531a = i8;
        this.f8532b = i9;
        this.f8533c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f8534d = "com.google.android.gms";
        } else {
            this.f8534d = str;
        }
        if (i8 < 2) {
            this.f8538h = iBinder != null ? AbstractBinderC1304a.l(InterfaceC1313j.a.j(iBinder)) : null;
        } else {
            this.f8535e = iBinder;
            this.f8538h = account;
        }
        this.f8536f = scopeArr;
        this.f8537g = bundle;
        this.f8539i = c1260dArr;
        this.f8540j = c1260dArr2;
        this.f8541k = z8;
        this.f8542l = i11;
        this.f8543m = z9;
        this.f8544n = str2;
    }

    public final String s() {
        return this.f8544n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        k0.a(this, parcel, i8);
    }
}
