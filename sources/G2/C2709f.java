package g2;

import d2.EnumC2539c;
import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2709f extends AbstractC2577a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f31174a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31175b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2539c f31176c;

    /* renamed from: d, reason: collision with root package name */
    private String f31177d;

    /* renamed from: e, reason: collision with root package name */
    private float f31178e;

    /* renamed from: g2.f$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31179a;

        static {
            int[] iArr = new int[EnumC2540d.values().length];
            try {
                iArr[EnumC2540d.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2540d.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2540d.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31179a = iArr;
        }
    }

    @Override // e2.AbstractC2577a, e2.c
    public void c(InterfaceC2541e youTubePlayer, EnumC2539c error) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(error, "error");
        if (error == EnumC2539c.HTML_5_PLAYER) {
            this.f31176c = error;
        }
    }

    @Override // e2.AbstractC2577a, e2.c
    public void h(InterfaceC2541e youTubePlayer, String videoId) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(videoId, "videoId");
        this.f31177d = videoId;
    }

    @Override // e2.AbstractC2577a, e2.c
    public void i(InterfaceC2541e youTubePlayer, float f8) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        this.f31178e = f8;
    }

    @Override // e2.AbstractC2577a, e2.c
    public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(state, "state");
        int i8 = a.f31179a[state.ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                this.f31175b = true;
                return;
            }
            return;
        }
        this.f31175b = false;
    }

    public final void k() {
        this.f31174a = true;
    }

    public final void l() {
        this.f31174a = false;
    }

    public final void m(InterfaceC2541e youTubePlayer) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        String str = this.f31177d;
        if (str == null) {
            return;
        }
        boolean z8 = this.f31175b;
        if (z8 && this.f31176c == EnumC2539c.HTML_5_PLAYER) {
            AbstractC2711h.a(youTubePlayer, this.f31174a, str, this.f31178e);
        } else if (!z8 && this.f31176c == EnumC2539c.HTML_5_PLAYER) {
            youTubePlayer.d(str, this.f31178e);
        }
        this.f31176c = null;
    }
}
