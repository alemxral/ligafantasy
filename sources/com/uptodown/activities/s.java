package com.uptodown.activities;

import X4.G;
import X4.K;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29331a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29332b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29333c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29334d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f29335e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f29336f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f29337g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f29338h;

    /* renamed from: i, reason: collision with root package name */
    private l6.v f29339i;

    /* renamed from: j, reason: collision with root package name */
    private l6.v f29340j;

    /* renamed from: k, reason: collision with root package name */
    private l6.v f29341k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29342a;

        public a(ArrayList replies) {
            AbstractC3159y.i(replies, "replies");
            this.f29342a = replies;
        }

        public final ArrayList a() {
            return this.f29342a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29342a, ((a) obj).f29342a);
        }

        public int hashCode() {
            return this.f29342a.hashCode();
        }

        public String toString() {
            return "RepliesData(replies=" + this.f29342a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final X4.G f29343a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29344b;

        public b(X4.G reply, int i8) {
            AbstractC3159y.i(reply, "reply");
            this.f29343a = reply;
            this.f29344b = i8;
        }

        public final int a() {
            return this.f29344b;
        }

        public final X4.G b() {
            return this.f29343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f29343a, bVar.f29343a) && this.f29344b == bVar.f29344b;
        }

        public int hashCode() {
            return (this.f29343a.hashCode() * 31) + this.f29344b;
        }

        public String toString() {
            return "ReplyLikedData(reply=" + this.f29343a + ", likedSuccess=" + this.f29344b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f29345a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29346b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29347c;

        /* renamed from: d, reason: collision with root package name */
        private final long f29348d;

        /* renamed from: e, reason: collision with root package name */
        private final String f29349e;

        public c(int i8, int i9, String text, long j8, String str) {
            AbstractC3159y.i(text, "text");
            this.f29345a = i8;
            this.f29346b = i9;
            this.f29347c = text;
            this.f29348d = j8;
            this.f29349e = str;
        }

        public final String a() {
            return this.f29349e;
        }

        public final int b() {
            return this.f29346b;
        }

        public final int c() {
            return this.f29345a;
        }

        public final String d() {
            return this.f29347c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29345a == cVar.f29345a && this.f29346b == cVar.f29346b && AbstractC3159y.d(this.f29347c, cVar.f29347c) && this.f29348d == cVar.f29348d && AbstractC3159y.d(this.f29349e, cVar.f29349e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f29345a * 31) + this.f29346b) * 31) + this.f29347c.hashCode()) * 31) + androidx.collection.a.a(this.f29348d)) * 31;
            String str = this.f29349e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SendReplyData(success=" + this.f29345a + ", statusCode=" + this.f29346b + ", text=" + this.f29347c + ", reviewID=" + this.f29348d + ", msg=" + this.f29349e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, long j8, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29351b = context;
            this.f29352c = j8;
            this.f29353d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29351b, this.f29352c, this.f29353d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONArray jSONArray;
            Q5.b.e();
            if (this.f29350a == 0) {
                L5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                X4.I U7 = new C3312F(this.f29351b).U(this.f29352c, 10, 0);
                if (!U7.b() && U7.d() != null) {
                    String d8 = U7.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i8 == 1 && jSONArray != null) {
                        arrayList = X4.G.f12335l.c(jSONArray);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                this.f29353d.f29331a.setValue(new AbstractC3337y.c(new a(arrayList)));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.G f29355b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29356c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29357d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(X4.G g8, Context context, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29355b = g8;
            this.f29356c = context;
            this.f29357d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29355b, this.f29356c, this.f29357d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29354a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                G.b bVar = X4.G.f12335l;
                X4.G g8 = this.f29355b;
                Context context = this.f29356c;
                this.f29354a = 1;
                obj = bVar.b(g8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29357d.f29335e.setValue(new AbstractC3337y.c(new b(this.f29355b, ((Number) obj).intValue())));
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.K f29359b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29360c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29361d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(X4.K k8, Context context, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29359b = k8;
            this.f29360c = context;
            this.f29361d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f29359b, this.f29360c, this.f29361d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29358a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K.b bVar = X4.K.f12368o;
                X4.K k8 = this.f29359b;
                Context context = this.f29360c;
                this.f29358a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29361d.f29333c.setValue(new AbstractC3337y.c(new K.c(this.f29359b, ((Number) obj).intValue())));
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29364c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f29365d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f29366e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str, long j8, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29363b = context;
            this.f29364c = str;
            this.f29365d = j8;
            this.f29366e = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f29363b, this.f29364c, this.f29365d, this.f29366e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i8;
            Q5.b.e();
            if (this.f29362a == 0) {
                L5.t.b(obj);
                X4.K.f12368o.f(this.f29363b, this.f29364c, String.valueOf(System.currentTimeMillis()));
                X4.I H02 = new C3312F(this.f29363b).H0(this.f29365d, this.f29364c);
                int i9 = 0;
                String str2 = null;
                if (!H02.b() && H02.d() != null) {
                    String d8 = H02.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i9 = jSONObject.getInt("success");
                    }
                    if (i9 == 0) {
                        str2 = H02.g(jSONObject);
                    }
                    i8 = i9;
                    str = str2;
                } else {
                    str = null;
                    i8 = 0;
                }
                this.f29366e.f29337g.setValue(new AbstractC3337y.c(new c(i8, H02.e(), this.f29364c, this.f29365d, str)));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s() {
        AbstractC3337y.a aVar = AbstractC3337y.a.f34533a;
        l6.v a8 = AbstractC3351M.a(aVar);
        this.f29331a = a8;
        this.f29332b = a8;
        l6.v a9 = AbstractC3351M.a(aVar);
        this.f29333c = a9;
        this.f29334d = a9;
        l6.v a10 = AbstractC3351M.a(aVar);
        this.f29335e = a10;
        this.f29336f = a10;
        l6.v a11 = AbstractC3351M.a(aVar);
        this.f29337g = a11;
        this.f29338h = a11;
        this.f29339i = AbstractC3351M.a("");
        this.f29340j = AbstractC3351M.a("");
        this.f29341k = AbstractC3351M.a(null);
    }

    public final void e(Context context, long j8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, j8, this, null), 2, null);
    }

    public final l6.v f() {
        return this.f29339i;
    }

    public final InterfaceC3349K g() {
        return this.f29332b;
    }

    public final InterfaceC3349K h() {
        return this.f29336f;
    }

    public final InterfaceC3349K i() {
        return this.f29334d;
    }

    public final l6.v j() {
        return this.f29341k;
    }

    public final InterfaceC3349K k() {
        return this.f29338h;
    }

    public final l6.v l() {
        return this.f29340j;
    }

    public final void m(Context context, X4.G reply) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(reply, "reply");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(reply, context, this, null), 2, null);
    }

    public final void n(Context context, X4.K review) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(review, "review");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new f(review, context, this, null), 2, null);
    }

    public final void o(Context context, String text, long j8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(text, "text");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new g(context, text, j8, this, null), 2, null);
    }
}
