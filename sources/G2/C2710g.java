package g2;

import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2710g extends AbstractC2577a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2540d f31180a = EnumC2540d.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private float f31181b;

    /* renamed from: c, reason: collision with root package name */
    private float f31182c;

    /* renamed from: d, reason: collision with root package name */
    private String f31183d;

    @Override // e2.AbstractC2577a, e2.c
    public void a(InterfaceC2541e youTubePlayer, float f8) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        this.f31182c = f8;
    }

    @Override // e2.AbstractC2577a, e2.c
    public void h(InterfaceC2541e youTubePlayer, String videoId) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(videoId, "videoId");
        this.f31183d = videoId;
    }

    @Override // e2.AbstractC2577a, e2.c
    public void i(InterfaceC2541e youTubePlayer, float f8) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        this.f31181b = f8;
    }

    @Override // e2.AbstractC2577a, e2.c
    public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(state, "state");
        this.f31180a = state;
    }
}
