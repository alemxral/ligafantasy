package L7;

import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f6777a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.a f6778b;

    /* renamed from: c, reason: collision with root package name */
    public final K7.b f6779c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedStorage f6780d;

    /* renamed from: e, reason: collision with root package name */
    public final y5.h f6781e;

    /* renamed from: f, reason: collision with root package name */
    public final C6.g f6782f;

    /* renamed from: g, reason: collision with root package name */
    public final M7.j f6783g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6784h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6785i;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6786a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6787b;

        /* renamed from: d, reason: collision with root package name */
        public int f6789d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6787b = obj;
            this.f6789d |= Integer.MIN_VALUE;
            return t.this.a(this);
        }
    }

    public t(Locale appLocale, K7.a networkUtil, K7.b requestApi, SharedStorage sharedStorage, y5.h jurisdiction, C6.g state, M7.j resolver) {
        AbstractC3159y.i(appLocale, "appLocale");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(jurisdiction, "jurisdiction");
        AbstractC3159y.i(state, "state");
        AbstractC3159y.i(resolver, "resolver");
        this.f6777a = appLocale;
        this.f6778b = networkUtil;
        this.f6779c = requestApi;
        this.f6780d = sharedStorage;
        this.f6781e = jurisdiction;
        this.f6782f = state;
        this.f6783g = resolver;
        this.f6784h = "us-mspa/v1/purposes-state-%s-";
        this.f6785i = "us-mspa/v1/purposes-national-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L7.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof L7.t.a
            if (r0 == 0) goto L13
            r0 = r9
            L7.t$a r0 = (L7.t.a) r0
            int r1 = r0.f6789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6789d = r1
            goto L18
        L13:
            L7.t$a r0 = new L7.t$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6787b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6789d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f6786a
            L7.t r0 = (L7.t) r0
            L5.t.b(r9)     // Catch: v5.C3831a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            L5.t.b(r9)
            K7.a r9 = r8.f6778b     // Catch: v5.C3831a -> L6c
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L6c
            if (r9 == 0) goto L55
            K7.b r9 = r8.f6779c     // Catch: v5.C3831a -> L6c
            java.lang.String r2 = r8.b()     // Catch: v5.C3831a -> L6c
            r0.f6786a = r8     // Catch: v5.C3831a -> L6c
            r0.f6789d = r3     // Catch: v5.C3831a -> L6c
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: v5.C3831a -> L6c
            if (r9 != r1) goto L51
            return r1
        L51:
            r0 = r8
        L52:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L6d
            goto L75
        L55:
            v5.b r1 = v5.C3832b.f38857a     // Catch: v5.C3831a -> L6c
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L6c
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            v5.C3832b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: v5.C3831a -> L6c
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6780d     // Catch: v5.C3831a -> L6c
            N7.a r0 = N7.a.MSPA_PURPOSES     // Catch: v5.C3831a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: v5.C3831a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f6780d
            N7.a r1 = N7.a.MSPA_PURPOSES
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f6780d
            N7.a r2 = N7.a.MSPA_PURPOSES
            r1.e(r2, r9)
            M7.j r0 = r0.f6783g
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.t.a(P5.d):java.lang.Object");
    }

    public final String b() {
        String str;
        String str2;
        y5.h hVar = this.f6781e;
        y5.h value = y5.h.STATE_AND_NATIONAL;
        if (hVar == value) {
            C6.g state = this.f6782f;
            AbstractC3159y.i(state, "state");
            AbstractC3159y.i(state, "state");
            int ordinal = state.ordinal();
            String str3 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str2 = "co";
                } else if (ordinal == 2) {
                    str2 = "ct";
                } else if (ordinal == 3) {
                    str2 = "ut";
                } else if (ordinal == 4) {
                    str2 = "va";
                } else {
                    str2 = "";
                }
            } else {
                str2 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            }
            if (str2.length() > 0) {
                C6.d dVar = C6.d.f1320a;
                AbstractC3159y.i(value, "value");
                C6.d.f1327h = value;
                Y y8 = Y.f33752a;
                String str4 = this.f6784h;
                C6.g state2 = this.f6782f;
                AbstractC3159y.i(state2, "state");
                int ordinal2 = state2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        str3 = "co";
                    } else if (ordinal2 == 2) {
                        str3 = "ct";
                    } else if (ordinal2 == 3) {
                        str3 = "ut";
                    } else if (ordinal2 == 4) {
                        str3 = "va";
                    } else {
                        str3 = "";
                    }
                }
                str = String.format(str4, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC3159y.h(str, "format(format, *args)");
                StringBuilder sb = new StringBuilder();
                sb.append("https://cmp.inmobi.com/");
                sb.append(str);
                String lowerCase = "EN".toLowerCase(this.f6777a);
                AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                sb.append(".json");
                return sb.toString();
            }
        }
        C6.d dVar2 = C6.d.f1320a;
        y5.h value2 = y5.h.NATIONAL;
        AbstractC3159y.i(value2, "value");
        C6.d.f1327h = value2;
        str = this.f6785i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://cmp.inmobi.com/");
        sb2.append(str);
        String lowerCase2 = "EN".toLowerCase(this.f6777a);
        AbstractC3159y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase2);
        sb2.append(".json");
        return sb2.toString();
    }
}
