package L7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final K7.a f6790a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f6791b;

    /* renamed from: c, reason: collision with root package name */
    public final K7.b f6792c;

    /* renamed from: d, reason: collision with root package name */
    public final M7.j f6793d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6794e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6795a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6796b;

        /* renamed from: d, reason: collision with root package name */
        public int f6798d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6796b = obj;
            this.f6798d |= Integer.MIN_VALUE;
            return v.this.b(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6799a;

        /* renamed from: c, reason: collision with root package name */
        public int f6801c;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6799a = obj;
            this.f6801c |= Integer.MIN_VALUE;
            return v.this.a(this);
        }
    }

    public v(K7.a networkUtil, SharedStorage sharedStorage, K7.b requestApi, M7.j resolver, String packageName, String pCode) {
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(pCode, "pCode");
        this.f6790a = networkUtil;
        this.f6791b = sharedStorage;
        this.f6792c = requestApi;
        this.f6793d = resolver;
        Y y8 = Y.f33752a;
        String format = String.format(AbstractC3159y.q("https://cmp.inmobi.com/", "choice/%s/%s/app-config.json"), Arrays.copyOf(new Object[]{pCode, packageName}, 2));
        AbstractC3159y.h(format, "format(format, *args)");
        this.f6794e = format;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(3:16|17|(2:19|(1:21))(2:22|23))|11|12))|25|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // L7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof L7.v.b
            if (r0 == 0) goto L13
            r0 = r8
            L7.v$b r0 = (L7.v.b) r0
            int r1 = r0.f6801c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6801c = r1
            goto L18
        L13:
            L7.v$b r0 = new L7.v$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6799a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6801c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r8)     // Catch: v5.C3831a -> L6b
            goto L5b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            L5.t.b(r8)
            K7.a r8 = r7.f6790a     // Catch: v5.C3831a -> L6b
            boolean r8 = r8.a()     // Catch: v5.C3831a -> L6b
            if (r8 == 0) goto L5e
            M7.j r8 = r7.f6793d     // Catch: v5.C3831a -> L6b
            com.inmobi.cmp.data.storage.SharedStorage r2 = r7.f6791b     // Catch: v5.C3831a -> L6b
            N7.a r4 = N7.a.PORTAL_CONFIG     // Catch: v5.C3831a -> L6b
            java.lang.String r2 = r2.j(r4)     // Catch: v5.C3831a -> L6b
            java.lang.Object r8 = r8.a(r2)     // Catch: v5.C3831a -> L6b
            E6.f r8 = (E6.f) r8     // Catch: v5.C3831a -> L6b
            K7.b r2 = r7.f6792c     // Catch: v5.C3831a -> L6b
            E6.a r8 = r8.f2373b     // Catch: v5.C3831a -> L6b
            java.lang.String r8 = r8.f2348r     // Catch: v5.C3831a -> L6b
            r0.f6801c = r3     // Catch: v5.C3831a -> L6b
            java.lang.Object r8 = r2.a(r8, r0)     // Catch: v5.C3831a -> L6b
            if (r8 != r1) goto L5b
            return r1
        L5b:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: v5.C3831a -> L6b
            goto L6c
        L5e:
            v5.b r0 = v5.C3832b.f38857a     // Catch: v5.C3831a -> L6b
            com.inmobi.cmp.model.ChoiceError r1 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L6b
            r5 = 0
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            v5.C3832b.b(r0, r1, r2, r3, r4, r5, r6)     // Catch: v5.C3831a -> L6b
        L6b:
            r8 = 0
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.v.a(P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof L7.v.a
            if (r0 == 0) goto L13
            r0 = r9
            L7.v$a r0 = (L7.v.a) r0
            int r1 = r0.f6798d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6798d = r1
            goto L18
        L13:
            L7.v$a r0 = new L7.v$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6796b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6798d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f6795a
            L7.v r0 = (L7.v) r0
            L5.t.b(r9)     // Catch: v5.C3831a -> L6b
            goto L50
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            L5.t.b(r9)
            K7.a r9 = r8.f6790a     // Catch: v5.C3831a -> L6a
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L6a
            if (r9 == 0) goto L53
            K7.b r9 = r8.f6792c     // Catch: v5.C3831a -> L6a
            java.lang.String r2 = r8.f6794e     // Catch: v5.C3831a -> L6a
            r0.f6795a = r8     // Catch: v5.C3831a -> L6a
            r0.f6798d = r3     // Catch: v5.C3831a -> L6a
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: v5.C3831a -> L6a
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r0 = r8
        L50:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L6b
            goto L73
        L53:
            v5.b r1 = v5.C3832b.f38857a     // Catch: v5.C3831a -> L6a
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L6a
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            v5.C3832b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: v5.C3831a -> L6a
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6791b     // Catch: v5.C3831a -> L6a
            N7.a r0 = N7.a.PORTAL_CONFIG     // Catch: v5.C3831a -> L6a
            java.lang.String r9 = r9.j(r0)     // Catch: v5.C3831a -> L6a
            r0 = r8
            goto L73
        L6a:
            r0 = r8
        L6b:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f6791b
            N7.a r1 = N7.a.PORTAL_CONFIG
            java.lang.String r9 = r9.j(r1)
        L73:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f6791b
            N7.a r2 = N7.a.PORTAL_CONFIG
            r1.e(r2, r9)
            M7.j r0 = r0.f6793d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.v.b(P5.d):java.lang.Object");
    }
}
