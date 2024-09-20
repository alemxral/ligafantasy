package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class w extends ViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29402d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29403a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29404b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29405c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29406a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29407b;

        public b(ArrayList searchResults, boolean z8) {
            AbstractC3159y.i(searchResults, "searchResults");
            this.f29406a = searchResults;
            this.f29407b = z8;
        }

        public final boolean a() {
            return this.f29407b;
        }

        public final ArrayList b() {
            return this.f29406a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f29406a, bVar.f29406a) && this.f29407b == bVar.f29407b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f29406a.hashCode() * 31;
            boolean z8 = this.f29407b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "SearchData(searchResults=" + this.f29406a + ", firstRequest=" + this.f29407b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29408a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29411d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29412e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, int i8, P5.d dVar) {
            super(2, dVar);
            this.f29410c = context;
            this.f29411d = str;
            this.f29412e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29410c, this.f29411d, this.f29412e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[LOOP:0: B:18:0x007b->B:19:0x007d, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                Q5.b.e()
                int r0 = r8.f29408a
                if (r0 != 0) goto Lbc
                L5.t.b(r9)
                com.uptodown.activities.w r9 = com.uptodown.activities.w.this
                l6.v r9 = com.uptodown.activities.w.a(r9)
                l5.y$a r0 = l5.AbstractC3337y.a.f34533a
                r9.setValue(r0)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                l5.F r0 = new l5.F
                android.content.Context r1 = r8.f29410c
                r0.<init>(r1)
                java.lang.String r1 = r8.f29411d
                r2 = 30
                int r3 = r8.f29412e
                X4.I r0 = r0.N0(r1, r2, r3)
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto La1
                java.lang.String r1 = r0.d()
                if (r1 == 0) goto La1
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r0 = r0.d()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                r1.<init>(r0)
                java.lang.String r0 = "success"
                boolean r4 = r1.isNull(r0)
                if (r4 != 0) goto L52
                int r0 = r1.getInt(r0)
                goto L53
            L52:
                r0 = 0
            L53:
                java.lang.String r4 = "data"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L71
                org.json.JSONObject r1 = r1.getJSONObject(r4)
                java.lang.String r4 = "jsonObject.getJSONObject(Constantes.FIELD_DATA)"
                kotlin.jvm.internal.AbstractC3159y.h(r1, r4)
                java.lang.String r4 = "results"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L71
                org.json.JSONArray r1 = r1.getJSONArray(r4)
                goto L72
            L71:
                r1 = 0
            L72:
                if (r0 != r2) goto La1
                if (r1 == 0) goto La1
                int r0 = r1.length()
                r4 = 0
            L7b:
                if (r4 >= r0) goto La1
                org.json.JSONObject r5 = r1.getJSONObject(r4)
                X4.h$b r6 = X4.C1498h.f12529L0
                java.lang.String r7 = "jsonObjectTop"
                kotlin.jvm.internal.AbstractC3159y.h(r5, r7)
                X4.h r5 = r6.a(r5)
                r9.add(r5)
                com.squareup.picasso.s r6 = com.squareup.picasso.s.h()
                java.lang.String r5 = r5.m0()
                com.squareup.picasso.w r5 = r6.l(r5)
                r5.d()
                int r4 = r4 + 1
                goto L7b
            La1:
                int r0 = r8.f29412e
                if (r0 <= 0) goto La6
                r2 = 0
            La6:
                com.uptodown.activities.w r0 = com.uptodown.activities.w.this
                l6.v r0 = com.uptodown.activities.w.a(r0)
                l5.y$c r1 = new l5.y$c
                com.uptodown.activities.w$b r3 = new com.uptodown.activities.w$b
                r3.<init>(r9, r2)
                r1.<init>(r3)
                r0.setValue(r1)
                L5.I r9 = L5.I.f6474a
                return r9
            Lbc:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.b.f34534a);
        this.f29403a = a8;
        this.f29404b = a8;
    }

    public final void b(Context context, String textToSearch, int i8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(textToSearch, "textToSearch");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, textToSearch, i8, null), 2, null);
    }

    public final InterfaceC3349K c() {
        return this.f29404b;
    }

    public final boolean d() {
        return this.f29405c;
    }

    public final void e(boolean z8) {
        this.f29405c = z8;
    }
}
