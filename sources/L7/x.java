package L7;

import M5.AbstractC1246t;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.AbstractC3995b;

/* loaded from: classes5.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f6802a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.a f6803b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f6804c;

    /* renamed from: d, reason: collision with root package name */
    public final K7.b f6805d;

    /* renamed from: e, reason: collision with root package name */
    public M7.j f6806e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6807f;

    /* renamed from: g, reason: collision with root package name */
    public J7.r f6808g;

    /* renamed from: h, reason: collision with root package name */
    public J7.e f6809h;

    /* renamed from: i, reason: collision with root package name */
    public J7.i f6810i;

    /* renamed from: j, reason: collision with root package name */
    public J7.n f6811j;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6812a;

        static {
            int[] iArr = new int[ChoiceError.values().length];
            iArr[ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR.ordinal()] = 1;
            f6812a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6813a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6814b;

        /* renamed from: d, reason: collision with root package name */
        public int f6816d;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6814b = obj;
            this.f6816d |= Integer.MIN_VALUE;
            return x.this.c(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6817a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6818b;

        /* renamed from: d, reason: collision with root package name */
        public int f6820d;

        public c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6818b = obj;
            this.f6820d |= Integer.MIN_VALUE;
            return x.this.a(this);
        }
    }

    public x(Locale appLocale, K7.a networkUtil, SharedStorage shareStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(appLocale, "appLocale");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(shareStorage, "shareStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6802a = appLocale;
        this.f6803b = networkUtil;
        this.f6804c = shareStorage;
        this.f6805d = requestApi;
        this.f6806e = resolver;
        this.f6807f = "tcfv2/translations/";
        this.f6809h = new J7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143);
        this.f6810i = new J7.i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
        this.f6811j = new J7.n(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // L7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(P5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof L7.x.c
            if (r0 == 0) goto L13
            r0 = r13
            L7.x$c r0 = (L7.x.c) r0
            int r1 = r0.f6820d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6820d = r1
            goto L18
        L13:
            L7.x$c r0 = new L7.x$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6818b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6820d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f6817a
            L7.x r0 = (L7.x) r0
            L5.t.b(r13)
            goto L94
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.f6817a
            L7.x r2 = (L7.x) r2
            L5.t.b(r13)     // Catch: v5.C3831a -> L40
            goto L5f
        L40:
            r13 = move-exception
            goto L7c
        L42:
            L5.t.b(r13)
            K7.a r13 = r12.f6803b     // Catch: v5.C3831a -> L62
            boolean r13 = r13.a()     // Catch: v5.C3831a -> L62
            if (r13 == 0) goto L65
            K7.b r13 = r12.f6805d     // Catch: v5.C3831a -> L62
            java.lang.String r2 = r12.j()     // Catch: v5.C3831a -> L62
            r0.f6817a = r12     // Catch: v5.C3831a -> L62
            r0.f6820d = r4     // Catch: v5.C3831a -> L62
            java.lang.Object r13 = r13.b(r2, r0)     // Catch: v5.C3831a -> L62
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r2 = r12
        L5f:
            java.lang.String r13 = (java.lang.String) r13     // Catch: v5.C3831a -> L40
            goto La0
        L62:
            r13 = move-exception
            r2 = r12
            goto L7c
        L65:
            v5.b r5 = v5.C3832b.f38857a     // Catch: v5.C3831a -> L62
            com.inmobi.cmp.model.ChoiceError r6 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L62
            r10 = 0
            r11 = 30
            r7 = 0
            r8 = 0
            r9 = 0
            v5.C3832b.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: v5.C3831a -> L62
            com.inmobi.cmp.data.storage.SharedStorage r13 = r12.f6804c     // Catch: v5.C3831a -> L62
            N7.a r2 = N7.a.TRANSLATIONS_TEXT     // Catch: v5.C3831a -> L62
            java.lang.String r13 = r13.j(r2)     // Catch: v5.C3831a -> L62
            r2 = r12
            goto La0
        L7c:
            com.inmobi.cmp.model.ChoiceError r13 = r13.f38856a
            int[] r5 = L7.x.a.f6812a
            int r13 = r13.ordinal()
            r13 = r5[r13]
            if (r13 != r4) goto L98
            r0.f6817a = r2
            r0.f6820d = r3
            java.lang.Object r13 = r2.c(r0)
            if (r13 != r1) goto L93
            return r1
        L93:
            r0 = r2
        L94:
            java.lang.String r13 = (java.lang.String) r13
            r2 = r0
            goto La0
        L98:
            com.inmobi.cmp.data.storage.SharedStorage r13 = r2.f6804c
            N7.a r0 = N7.a.TRANSLATIONS_TEXT
            java.lang.String r13 = r13.j(r0)
        La0:
            com.inmobi.cmp.data.storage.SharedStorage r0 = r2.f6804c
            N7.a r1 = N7.a.TRANSLATIONS_TEXT
            r0.e(r1, r13)
            M7.j r0 = r2.f6806e
            java.lang.Object r13 = r0.a(r13)
            J7.r r13 = (J7.r) r13
            r2.f6808g = r13
            if (r13 != 0) goto Lb9
            java.lang.String r13 = "translationsText"
            kotlin.jvm.internal.AbstractC3159y.y(r13)
            r13 = 0
        Lb9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.a(P5.d):java.lang.Object");
    }

    @Override // L7.w
    public void b(E6.f portalConfig) {
        AbstractC3159y.i(portalConfig, "portalConfig");
        this.f6809h = portalConfig.f2375d;
        this.f6810i = portalConfig.f2376e;
        this.f6811j = portalConfig.f2377f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(P5.d r78) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.c(P5.d):java.lang.Object");
    }

    @Override // L7.w
    public J7.m d() {
        String str;
        k();
        if (this.f6809h.f5570X.length() == 0) {
            J7.r rVar = this.f6808g;
            if (rVar == null) {
                AbstractC3159y.y("translationsText");
                rVar = null;
            }
            str = rVar.f5697a.f5570X;
        } else {
            str = this.f6809h.f5570X;
        }
        return new J7.m(str, i());
    }

    @Override // L7.w
    public J7.h e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        k();
        J7.r rVar = null;
        if (this.f6809h.f5588r.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5697a.f5588r;
        } else {
            str = this.f6809h.f5588r;
        }
        String str11 = str;
        if (this.f6809h.f5553G.length() == 0) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5697a.f5553G;
        } else {
            str2 = this.f6809h.f5553G;
        }
        String str12 = str2;
        if (this.f6809h.f5557K.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5697a.f5557K;
        } else {
            str3 = this.f6809h.f5557K;
        }
        String str13 = str3;
        if (this.f6809h.f5558L.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5697a.f5558L;
        } else {
            str4 = this.f6809h.f5558L;
        }
        String str14 = str4;
        if (this.f6809h.f5559M.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f5697a.f5559M;
        } else {
            str5 = this.f6809h.f5559M;
        }
        String str15 = str5;
        if (this.f6810i.f5622b.length() == 0) {
            J7.r rVar7 = this.f6808g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str6 = rVar7.f5699c.f5622b;
        } else {
            str6 = this.f6810i.f5622b;
        }
        String str16 = str6;
        if (this.f6809h.f5563Q.length() == 0) {
            J7.r rVar8 = this.f6808g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str7 = rVar8.f5697a.f5563Q;
        } else {
            str7 = this.f6809h.f5563Q;
        }
        String str17 = str7;
        if (this.f6809h.f5587q.length() == 0) {
            J7.r rVar9 = this.f6808g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str8 = rVar9.f5697a.f5587q;
        } else {
            str8 = this.f6809h.f5587q;
        }
        String str18 = str8;
        if (this.f6810i.f5624d.length() == 0) {
            J7.r rVar10 = this.f6808g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str9 = rVar10.f5699c.f5624d;
        } else {
            str9 = this.f6810i.f5624d;
        }
        String str19 = str9;
        if (this.f6810i.f5625e.length() == 0) {
            J7.r rVar11 = this.f6808g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar11;
            }
            str10 = rVar.f5699c.f5625e;
        } else {
            str10 = this.f6810i.f5625e;
        }
        return new J7.h(str11, str12, str13, str14, str15, str16, str17, str18, str19, str10, i());
    }

    @Override // L7.w
    public J7.j f() {
        String str;
        String w02;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        k();
        J7.r rVar = null;
        if (this.f6809h.f5571a.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5697a.f5571a;
        } else {
            str = this.f6809h.f5571a;
        }
        String str15 = str;
        if (this.f6810i.f5635o.isEmpty()) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            w02 = AbstractC1246t.w0(rVar3.f5699c.f5635o, " ", null, null, 0, null, null, 62, null);
        } else {
            w02 = AbstractC1246t.w0(this.f6810i.f5635o, " ", null, null, 0, null, null, 62, null);
        }
        String str16 = w02;
        if (this.f6809h.f5588r.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f5697a.f5588r;
        } else {
            str2 = this.f6809h.f5588r;
        }
        String str17 = str2;
        if (this.f6809h.f5563Q.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f5697a.f5563Q;
        } else {
            str3 = this.f6809h.f5563Q;
        }
        String str18 = str3;
        if (this.f6810i.f5626f.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str4 = rVar6.f5699c.f5626f;
        } else {
            str4 = this.f6810i.f5626f;
        }
        String str19 = str4;
        if (this.f6809h.f5585o.length() == 0) {
            J7.r rVar7 = this.f6808g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str5 = rVar7.f5697a.f5585o;
        } else {
            str5 = this.f6809h.f5585o;
        }
        String str20 = str5;
        if (this.f6809h.f5573c.length() == 0) {
            J7.r rVar8 = this.f6808g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str6 = rVar8.f5697a.f5573c;
        } else {
            str6 = this.f6809h.f5573c;
        }
        String str21 = str6;
        if (this.f6809h.f5586p.length() == 0) {
            J7.r rVar9 = this.f6808g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str7 = rVar9.f5697a.f5586p;
        } else {
            str7 = this.f6809h.f5586p;
        }
        String str22 = str7;
        if (this.f6809h.f5547A.length() == 0) {
            J7.r rVar10 = this.f6808g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str8 = rVar10.f5697a.f5547A;
        } else {
            str8 = this.f6809h.f5547A;
        }
        String str23 = str8;
        if (this.f6809h.f5587q.length() == 0) {
            J7.r rVar11 = this.f6808g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
                rVar11 = null;
            }
            str9 = rVar11.f5697a.f5587q;
        } else {
            str9 = this.f6809h.f5587q;
        }
        String str24 = str9;
        if (this.f6810i.f5629i.length() == 0) {
            J7.r rVar12 = this.f6808g;
            if (rVar12 == null) {
                AbstractC3159y.y("translationsText");
                rVar12 = null;
            }
            str10 = rVar12.f5699c.f5629i;
        } else {
            str10 = this.f6810i.f5629i;
        }
        String str25 = str10;
        if (this.f6810i.f5630j.length() == 0) {
            J7.r rVar13 = this.f6808g;
            if (rVar13 == null) {
                AbstractC3159y.y("translationsText");
                rVar13 = null;
            }
            str11 = rVar13.f5699c.f5630j;
        } else {
            str11 = this.f6810i.f5630j;
        }
        String str26 = str11;
        if (this.f6810i.f5631k.length() == 0) {
            J7.r rVar14 = this.f6808g;
            if (rVar14 == null) {
                AbstractC3159y.y("translationsText");
                rVar14 = null;
            }
            str12 = rVar14.f5699c.f5631k;
        } else {
            str12 = this.f6810i.f5631k;
        }
        String str27 = str12;
        if (this.f6810i.f5632l.length() == 0) {
            J7.r rVar15 = this.f6808g;
            if (rVar15 == null) {
                AbstractC3159y.y("translationsText");
                rVar15 = null;
            }
            str13 = rVar15.f5699c.f5632l;
        } else {
            str13 = this.f6810i.f5632l;
        }
        String str28 = str13;
        String i8 = i();
        if (this.f6809h.f5548B.length() == 0) {
            J7.r rVar16 = this.f6808g;
            if (rVar16 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar16;
            }
            str14 = rVar.f5697a.f5548B;
        } else {
            str14 = this.f6809h.f5548B;
        }
        return new J7.j(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i8, str14);
    }

    @Override // L7.w
    public J7.k g() {
        String str;
        String upperCase;
        String upperCase2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        k();
        J7.r rVar = null;
        if (this.f6809h.f5563Q.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5697a.f5563Q;
        } else {
            str = this.f6809h.f5563Q;
        }
        String str13 = str;
        if (this.f6809h.f5588r.length() == 0) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            upperCase = rVar3.f5697a.f5588r.toUpperCase(this.f6802a);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase = this.f6809h.f5588r.toUpperCase(this.f6802a);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        }
        String str14 = upperCase;
        if (this.f6809h.f5589s.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            upperCase2 = rVar4.f5697a.f5589s.toUpperCase(this.f6802a);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase2 = this.f6809h.f5589s.toUpperCase(this.f6802a);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        }
        String str15 = upperCase2;
        if (this.f6809h.f5591u.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str2 = rVar5.f5697a.f5591u;
        } else {
            str2 = this.f6809h.f5591u;
        }
        String str16 = str2;
        if (this.f6809h.f5590t.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str3 = rVar6.f5697a.f5590t;
        } else {
            str3 = this.f6809h.f5590t;
        }
        String str17 = str3;
        if (this.f6809h.f5592v.length() == 0) {
            J7.r rVar7 = this.f6808g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str4 = rVar7.f5697a.f5592v;
        } else {
            str4 = this.f6809h.f5592v;
        }
        String str18 = str4;
        if (this.f6809h.f5551E.length() == 0) {
            J7.r rVar8 = this.f6808g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str5 = rVar8.f5697a.f5551E;
        } else {
            str5 = this.f6809h.f5551E;
        }
        String str19 = str5;
        if (this.f6809h.f5564R.length() == 0) {
            J7.r rVar9 = this.f6808g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str6 = rVar9.f5697a.f5564R;
        } else {
            str6 = this.f6809h.f5564R;
        }
        String str20 = str6;
        if (this.f6809h.f5565S.length() == 0) {
            J7.r rVar10 = this.f6808g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str7 = rVar10.f5697a.f5565S;
        } else {
            str7 = this.f6809h.f5565S;
        }
        String str21 = str7;
        if (this.f6809h.f5566T.length() == 0) {
            J7.r rVar11 = this.f6808g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
                rVar11 = null;
            }
            str8 = rVar11.f5697a.f5566T;
        } else {
            str8 = this.f6809h.f5566T;
        }
        String str22 = str8;
        if (this.f6809h.f5567U.length() == 0) {
            J7.r rVar12 = this.f6808g;
            if (rVar12 == null) {
                AbstractC3159y.y("translationsText");
                rVar12 = null;
            }
            str9 = rVar12.f5697a.f5567U;
        } else {
            str9 = this.f6809h.f5567U;
        }
        String str23 = str9;
        if (this.f6809h.f5568V.length() == 0) {
            J7.r rVar13 = this.f6808g;
            if (rVar13 == null) {
                AbstractC3159y.y("translationsText");
                rVar13 = null;
            }
            str10 = rVar13.f5697a.f5568V;
        } else {
            str10 = this.f6809h.f5568V;
        }
        String str24 = str10;
        if (this.f6809h.f5569W.length() == 0) {
            J7.r rVar14 = this.f6808g;
            if (rVar14 == null) {
                AbstractC3159y.y("translationsText");
                rVar14 = null;
            }
            str11 = rVar14.f5697a.f5569W;
        } else {
            str11 = this.f6809h.f5569W;
        }
        String str25 = str11;
        if (this.f6809h.f5570X.length() == 0) {
            J7.r rVar15 = this.f6808g;
            if (rVar15 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar15;
            }
            str12 = rVar.f5697a.f5570X;
        } else {
            str12 = this.f6809h.f5570X;
        }
        return new J7.k(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str12, str23, str24, str25, i());
    }

    @Override // L7.w
    public J7.q h() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        k();
        J7.r rVar = null;
        if (this.f6809h.f5563Q.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5697a.f5563Q;
        } else {
            str = this.f6809h.f5563Q;
        }
        String str6 = str;
        if (this.f6809h.f5547A.length() == 0) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5697a.f5547A;
        } else {
            str2 = this.f6809h.f5547A;
        }
        String str7 = str2;
        if (this.f6809h.f5573c.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5697a.f5573c;
        } else {
            str3 = this.f6809h.f5573c;
        }
        String str8 = str3;
        if (this.f6810i.f5622b.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5699c.f5622b;
        } else {
            str4 = this.f6810i.f5622b;
        }
        String str9 = str4;
        if (this.f6810i.f5632l.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str5 = rVar.f5699c.f5632l;
        } else {
            str5 = this.f6810i.f5632l;
        }
        return new J7.q(str6, str7, str8, str9, str5, i());
    }

    public final String i() {
        if (this.f6809h.f5593w.length() == 0) {
            J7.r rVar = this.f6808g;
            if (rVar == null) {
                AbstractC3159y.y("translationsText");
                rVar = null;
            }
            return rVar.f5697a.f5593w;
        }
        return this.f6809h.f5593w;
    }

    public final String j() {
        String language = this.f6804c.j(N7.a.PORTAL_CHOICE_LANG);
        AbstractC3159y.i(language, "key");
        int[] a8 = AbstractC3995b.a(26);
        int length = a8.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                int i9 = a8[i8];
                i8++;
                if (g6.n.s(B6.a.b(i9), language, true) && !g6.n.s(language, "autoDetectedLanguage", true)) {
                    break;
                }
            } else {
                language = this.f6802a.getLanguage();
                break;
            }
        }
        StringBuilder a9 = AbstractC3689a.a("https://cmp.inmobi.com/");
        a9.append(this.f6807f);
        AbstractC3159y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f6802a);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a9.append(lowerCase);
        a9.append(".json");
        return a9.toString();
    }

    public final void k() {
        J7.r rVar;
        if (this.f6808g == null) {
            String j8 = this.f6804c.j(N7.a.TRANSLATIONS_TEXT);
            if (j8.length() > 0) {
                rVar = (J7.r) this.f6806e.a(j8);
            } else {
                rVar = new J7.r(null, null, null, 7);
            }
            this.f6808g = rVar;
        }
    }

    @Override // L7.w
    public J7.a b() {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        J7.r rVar = null;
        if (this.f6811j.f5678c.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5698b.f5678c;
        } else {
            str = this.f6811j.f5678c;
        }
        String str5 = str;
        if (this.f6811j.f5679d.isEmpty()) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            list = rVar3.f5698b.f5679d;
        } else {
            list = this.f6811j.f5679d;
        }
        List list2 = list;
        if (this.f6811j.f5682g.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f5698b.f5682g;
        } else {
            str2 = this.f6811j.f5682g;
        }
        String str6 = str2;
        if (this.f6811j.f5683h.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f5698b.f5683h;
        } else {
            str3 = this.f6811j.f5683h;
        }
        String str7 = str3;
        if (this.f6811j.f5681f.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str4 = rVar.f5698b.f5681f;
        } else {
            str4 = this.f6811j.f5681f;
        }
        return new J7.a(str5, list2, str6, str7, str4, i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        if (r0 == null) goto L66;
     */
    @Override // L7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J7.g c() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.c():J7.g");
    }

    @Override // L7.w
    public J7.l a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        k();
        J7.r rVar = null;
        if (this.f6810i.f5626f.length() == 0) {
            J7.r rVar2 = this.f6808g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5699c.f5626f;
        } else {
            str = this.f6810i.f5626f;
        }
        String str7 = str;
        if (this.f6809h.f5550D.length() == 0) {
            J7.r rVar3 = this.f6808g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5697a.f5550D;
        } else {
            str2 = this.f6809h.f5550D;
        }
        String str8 = str2;
        if (this.f6810i.f5622b.length() == 0) {
            J7.r rVar4 = this.f6808g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5699c.f5622b;
        } else {
            str3 = this.f6810i.f5622b;
        }
        String str9 = str3;
        if (this.f6809h.f5587q.length() == 0) {
            J7.r rVar5 = this.f6808g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5697a.f5587q;
        } else {
            str4 = this.f6809h.f5587q;
        }
        String str10 = str4;
        if (this.f6810i.f5624d.length() == 0) {
            J7.r rVar6 = this.f6808g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f5699c.f5624d;
        } else {
            str5 = this.f6810i.f5624d;
        }
        String str11 = str5;
        if (this.f6810i.f5625e.length() == 0) {
            J7.r rVar7 = this.f6808g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar7;
            }
            str6 = rVar.f5699c.f5625e;
        } else {
            str6 = this.f6810i.f5625e;
        }
        return new J7.l(str7, str8, str9, str10, str11, str6, i());
    }
}
