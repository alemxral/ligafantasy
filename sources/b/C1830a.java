package b;

import com.inmobi.cmp.ChoiceCmp;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830a extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChoiceCmp f14190b;

    /* renamed from: c, reason: collision with root package name */
    public int f14191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830a(ChoiceCmp choiceCmp, P5.d dVar) {
        super(dVar);
        this.f14190b = choiceCmp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14189a = obj;
        this.f14191c |= Integer.MIN_VALUE;
        return ChoiceCmp.access$loadCmpInfo(this.f14190b, this);
    }
}
