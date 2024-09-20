package k1;

import L5.I;
import L5.t;
import X5.n;
import a1.InterfaceC1554e;
import android.util.Log;
import androidx.datastore.core.DataStore;
import g6.j;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i1.C2768b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r6.AbstractC3692c;
import r6.InterfaceC3690a;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3103c implements InterfaceC3108h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f33285g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f33286a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1554e f33287b;

    /* renamed from: c, reason: collision with root package name */
    private final C2768b f33288c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3101a f33289d;

    /* renamed from: e, reason: collision with root package name */
    private final C3107g f33290e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3690a f33291f;

    /* renamed from: k1.c$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33292a;

        /* renamed from: b, reason: collision with root package name */
        Object f33293b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33294c;

        /* renamed from: e, reason: collision with root package name */
        int f33296e;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33294c = obj;
            this.f33296e |= Integer.MIN_VALUE;
            return C3103c.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0770c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f33297a;

        /* renamed from: b, reason: collision with root package name */
        Object f33298b;

        /* renamed from: c, reason: collision with root package name */
        int f33299c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33300d;

        C0770c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            C0770c c0770c = new C0770c(dVar);
            c0770c.f33300d = obj;
            return c0770c;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, P5.d dVar) {
            return ((C0770c) create(jSONObject, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0181 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.C3103c.C0770c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f33302a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33303b;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f33303b = obj;
            return dVar2;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((d) create(str, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33302a == 0) {
                t.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f33303b));
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3103c(P5.g backgroundDispatcher, InterfaceC1554e firebaseInstallationsApi, C2768b appInfo, InterfaceC3101a configsFetcher, DataStore dataStore) {
        AbstractC3159y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3159y.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(configsFetcher, "configsFetcher");
        AbstractC3159y.i(dataStore, "dataStore");
        this.f33286a = backgroundDispatcher;
        this.f33287b = firebaseInstallationsApi;
        this.f33288c = appInfo;
        this.f33289d = configsFetcher;
        this.f33290e = new C3107g(dataStore);
        this.f33291f = AbstractC3692c.b(false, 1, null);
    }

    private final String f(String str) {
        return new j("/").f(str, "");
    }

    @Override // k1.InterfaceC3108h
    public Boolean a() {
        return this.f33290e.g();
    }

    @Override // k1.InterfaceC3108h
    public C2758a b() {
        Integer e8 = this.f33290e.e();
        if (e8 != null) {
            C2758a.C0756a c0756a = C2758a.f31395b;
            return C2758a.e(AbstractC2760c.s(e8.intValue(), EnumC2761d.f31405e));
        }
        return null;
    }

    @Override // k1.InterfaceC3108h
    public Double c() {
        return this.f33290e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // k1.InterfaceC3108h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(P5.d r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3103c.d(P5.d):java.lang.Object");
    }
}
