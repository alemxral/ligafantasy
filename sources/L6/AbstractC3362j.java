package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3362j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.j$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34628a;

        /* renamed from: b, reason: collision with root package name */
        Object f34629b;

        /* renamed from: c, reason: collision with root package name */
        Object f34630c;

        /* renamed from: d, reason: collision with root package name */
        boolean f34631d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f34632e;

        /* renamed from: f, reason: collision with root package name */
        int f34633f;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34632e = obj;
            this.f34633f |= Integer.MIN_VALUE;
            return AbstractC3362j.d(null, null, false, this);
        }
    }

    public static final InterfaceC3358f b(k6.u uVar) {
        return new C3355c(uVar, true, null, 0, null, 28, null);
    }

    public static final Object c(InterfaceC3359g interfaceC3359g, k6.u uVar, P5.d dVar) {
        Object d8 = d(interfaceC3359g, uVar, true, dVar);
        if (d8 == Q5.b.e()) {
            return d8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(l6.InterfaceC3359g r6, k6.u r7, boolean r8, P5.d r9) {
        /*
            boolean r0 = r9 instanceof l6.AbstractC3362j.a
            if (r0 == 0) goto L13
            r0 = r9
            l6.j$a r0 = (l6.AbstractC3362j.a) r0
            int r1 = r0.f34633f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34633f = r1
            goto L18
        L13:
            l6.j$a r0 = new l6.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34632e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34633f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f34631d
            java.lang.Object r6 = r0.f34630c
            k6.f r6 = (k6.f) r6
            java.lang.Object r7 = r0.f34629b
            k6.u r7 = (k6.u) r7
            java.lang.Object r2 = r0.f34628a
            l6.g r2 = (l6.InterfaceC3359g) r2
            L5.t.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f34631d
            java.lang.Object r6 = r0.f34630c
            k6.f r6 = (k6.f) r6
            java.lang.Object r7 = r0.f34629b
            k6.u r7 = (k6.u) r7
            java.lang.Object r2 = r0.f34628a
            l6.g r2 = (l6.InterfaceC3359g) r2
            L5.t.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            L5.t.b(r9)
            l6.AbstractC3360h.s(r6)
            k6.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f34628a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f34629b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f34630c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f34631d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f34633f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f34628a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f34629b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f34630c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f34631d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f34633f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            k6.k.a(r7, r6)
        L9a:
            L5.I r6 = L5.I.f6474a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            k6.k.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3362j.d(l6.g, k6.u, boolean, P5.d):java.lang.Object");
    }
}
