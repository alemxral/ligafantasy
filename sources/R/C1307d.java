package R;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o0.C3519a;

/* renamed from: R.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1307d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f8504a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8505b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8506c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8507d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8508e;

    /* renamed from: f, reason: collision with root package name */
    private final View f8509f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8510g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8511h;

    /* renamed from: i, reason: collision with root package name */
    private final C3519a f8512i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8513j;

    /* renamed from: R.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f8514a;

        /* renamed from: b, reason: collision with root package name */
        private ArraySet f8515b;

        /* renamed from: c, reason: collision with root package name */
        private String f8516c;

        /* renamed from: d, reason: collision with root package name */
        private String f8517d;

        /* renamed from: e, reason: collision with root package name */
        private final C3519a f8518e = C3519a.f36330j;

        public C1307d a() {
            return new C1307d(this.f8514a, this.f8515b, null, 0, null, this.f8516c, this.f8517d, this.f8518e, false);
        }

        public a b(String str) {
            this.f8516c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f8515b == null) {
                this.f8515b = new ArraySet();
            }
            this.f8515b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f8514a = account;
            return this;
        }

        public final a e(String str) {
            this.f8517d = str;
            return this;
        }
    }

    public C1307d(Account account, Set set, Map map, int i8, View view, String str, String str2, C3519a c3519a, boolean z8) {
        Set unmodifiableSet;
        this.f8504a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.f8505b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f8507d = map;
        this.f8509f = view;
        this.f8508e = i8;
        this.f8510g = str;
        this.f8511h = str2;
        this.f8512i = c3519a == null ? C3519a.f36330j : c3519a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f8506c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f8504a;
    }

    public String b() {
        Account account = this.f8504a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f8504a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f8506c;
    }

    public Set e(P.a aVar) {
        android.support.v4.media.a.a(this.f8507d.get(aVar));
        return this.f8505b;
    }

    public String f() {
        return this.f8510g;
    }

    public Set g() {
        return this.f8505b;
    }

    public final C3519a h() {
        return this.f8512i;
    }

    public final Integer i() {
        return this.f8513j;
    }

    public final String j() {
        return this.f8511h;
    }

    public final void k(Integer num) {
        this.f8513j = num;
    }
}
