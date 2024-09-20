package com.google.android.gms.auth.api.signin;

import P.a;
import R.AbstractC1319p;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GoogleSignInOptions extends S.a implements a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f15028l;

    /* renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f15029m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f15030n = new Scope("profile");

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f15031o = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f15032p = new Scope("openid");

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f15033q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f15034r;

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator f15035s;

    /* renamed from: a, reason: collision with root package name */
    final int f15036a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15037b;

    /* renamed from: c, reason: collision with root package name */
    private Account f15038c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15039d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15040e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15041f;

    /* renamed from: g, reason: collision with root package name */
    private String f15042g;

    /* renamed from: h, reason: collision with root package name */
    private String f15043h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f15044i;

    /* renamed from: j, reason: collision with root package name */
    private String f15045j;

    /* renamed from: k, reason: collision with root package name */
    private Map f15046k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f15033q = scope;
        f15034r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f15028l = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f15029m = aVar2.a();
        CREATOR = new e();
        f15035s = new d();
    }

    public static GoogleSignInOptions Y(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z8 = jSONObject.getBoolean("idTokenRequested");
        boolean z9 = jSONObject.getBoolean("serverAuthRequested");
        boolean z10 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z8, z9, z10, str3, str4, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map j0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                L.a aVar = (L.a) it.next();
                hashMap.put(Integer.valueOf(aVar.s()), aVar);
            }
        }
        return hashMap;
    }

    public String G() {
        return this.f15042g;
    }

    public boolean I() {
        return this.f15041f;
    }

    public boolean L() {
        return this.f15039d;
    }

    public boolean V() {
        return this.f15040e;
    }

    public final String c0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15037b, f15035s);
            Iterator it = this.f15037b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).s());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f15038c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f15039d);
            jSONObject.put("forceCodeForRefreshToken", this.f15041f);
            jSONObject.put("serverAuthRequested", this.f15040e);
            if (!TextUtils.isEmpty(this.f15042g)) {
                jSONObject.put("serverClientId", this.f15042g);
            }
            if (!TextUtils.isEmpty(this.f15043h)) {
                jSONObject.put("hostedDomain", this.f15043h);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.i()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f15044i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f15044i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f15037b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f15037b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f15038c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f15042g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f15042g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f15041f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.I()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15039d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.L()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15040e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.V()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f15045j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.u()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15037b;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).s());
        }
        Collections.sort(arrayList);
        L.b bVar = new L.b();
        bVar.a(arrayList);
        bVar.a(this.f15038c);
        bVar.a(this.f15042g);
        bVar.c(this.f15041f);
        bVar.c(this.f15039d);
        bVar.c(this.f15040e);
        bVar.a(this.f15045j);
        return bVar.b();
    }

    public Account i() {
        return this.f15038c;
    }

    public ArrayList s() {
        return this.f15044i;
    }

    public String u() {
        return this.f15045j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15036a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.u(parcel, 2, z(), false);
        S.c.p(parcel, 3, i(), i8, false);
        S.c.c(parcel, 4, L());
        S.c.c(parcel, 5, V());
        S.c.c(parcel, 6, I());
        S.c.q(parcel, 7, G(), false);
        S.c.q(parcel, 8, this.f15043h, false);
        S.c.u(parcel, 9, s(), false);
        S.c.q(parcel, 10, u(), false);
        S.c.b(parcel, a8);
    }

    public ArrayList z() {
        return new ArrayList(this.f15037b);
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f15047a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15048b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15049c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15050d;

        /* renamed from: e, reason: collision with root package name */
        private String f15051e;

        /* renamed from: f, reason: collision with root package name */
        private Account f15052f;

        /* renamed from: g, reason: collision with root package name */
        private String f15053g;

        /* renamed from: h, reason: collision with root package name */
        private Map f15054h;

        /* renamed from: i, reason: collision with root package name */
        private String f15055i;

        public a() {
            this.f15047a = new HashSet();
            this.f15054h = new HashMap();
        }

        private final String h(String str) {
            AbstractC1319p.f(str);
            String str2 = this.f15051e;
            boolean z8 = true;
            if (str2 != null && !str2.equals(str)) {
                z8 = false;
            }
            AbstractC1319p.b(z8, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f15047a.contains(GoogleSignInOptions.f15034r)) {
                Set set = this.f15047a;
                Scope scope = GoogleSignInOptions.f15033q;
                if (set.contains(scope)) {
                    this.f15047a.remove(scope);
                }
            }
            if (this.f15050d && (this.f15052f == null || !this.f15047a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f15047a), this.f15052f, this.f15050d, this.f15048b, this.f15049c, this.f15051e, this.f15053g, this.f15054h, this.f15055i);
        }

        public a b() {
            this.f15047a.add(GoogleSignInOptions.f15031o);
            return this;
        }

        public a c() {
            this.f15047a.add(GoogleSignInOptions.f15032p);
            return this;
        }

        public a d(String str) {
            this.f15050d = true;
            h(str);
            this.f15051e = str;
            return this;
        }

        public a e() {
            this.f15047a.add(GoogleSignInOptions.f15030n);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f15047a.add(scope);
            this.f15047a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str) {
            this.f15055i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f15047a = new HashSet();
            this.f15054h = new HashMap();
            AbstractC1319p.l(googleSignInOptions);
            this.f15047a = new HashSet(googleSignInOptions.f15037b);
            this.f15048b = googleSignInOptions.f15040e;
            this.f15049c = googleSignInOptions.f15041f;
            this.f15050d = googleSignInOptions.f15039d;
            this.f15051e = googleSignInOptions.f15042g;
            this.f15052f = googleSignInOptions.f15038c;
            this.f15053g = googleSignInOptions.f15043h;
            this.f15054h = GoogleSignInOptions.j0(googleSignInOptions.f15044i);
            this.f15055i = googleSignInOptions.f15045j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, ArrayList arrayList2, String str3) {
        this(i8, arrayList, account, z8, z9, z10, str, str2, j0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, Map map, String str3) {
        this.f15036a = i8;
        this.f15037b = arrayList;
        this.f15038c = account;
        this.f15039d = z8;
        this.f15040e = z9;
        this.f15041f = z10;
        this.f15042g = str;
        this.f15043h = str2;
        this.f15044i = new ArrayList(map.values());
        this.f15046k = map;
        this.f15045j = str3;
    }
}
