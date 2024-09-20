package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.e;
import x5.C3929b;
import x5.InterfaceC3928a;
import x5.InterfaceC3930c;

/* loaded from: classes5.dex */
final class c implements eightbitlab.com.blurview.a {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3928a f30913b;

    /* renamed from: c, reason: collision with root package name */
    private C3929b f30914c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f30915d;

    /* renamed from: e, reason: collision with root package name */
    final BlurView f30916e;

    /* renamed from: f, reason: collision with root package name */
    private int f30917f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f30918g;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30923l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f30924m;

    /* renamed from: a, reason: collision with root package name */
    private float f30912a = 16.0f;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f30919h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f30920i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f30921j = new a();

    /* renamed from: k, reason: collision with root package name */
    private boolean f30922k = true;

    /* loaded from: classes5.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BlurView blurView, ViewGroup viewGroup, int i8, InterfaceC3928a interfaceC3928a) {
        this.f30918g = viewGroup;
        this.f30916e = blurView;
        this.f30917f = i8;
        this.f30913b = interfaceC3928a;
        if (interfaceC3928a instanceof d) {
            ((d) interfaceC3928a).f(blurView.getContext());
        }
        f(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void e() {
        this.f30915d = this.f30913b.e(this.f30915d, this.f30912a);
        if (!this.f30913b.c()) {
            this.f30914c.setBitmap(this.f30915d);
        }
    }

    private void g() {
        this.f30918g.getLocationOnScreen(this.f30919h);
        this.f30916e.getLocationOnScreen(this.f30920i);
        int[] iArr = this.f30920i;
        int i8 = iArr[0];
        int[] iArr2 = this.f30919h;
        int i9 = i8 - iArr2[0];
        int i10 = iArr[1] - iArr2[1];
        float height = this.f30916e.getHeight() / this.f30915d.getHeight();
        float width = this.f30916e.getWidth() / this.f30915d.getWidth();
        this.f30914c.translate((-i9) / width, (-i10) / height);
        this.f30914c.scale(1.0f / width, 1.0f / height);
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c a(boolean z8) {
        this.f30918g.getViewTreeObserver().removeOnPreDrawListener(this.f30921j);
        if (z8) {
            this.f30918g.getViewTreeObserver().addOnPreDrawListener(this.f30921j);
        }
        return this;
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c b(Drawable drawable) {
        this.f30924m = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void c() {
        f(this.f30916e.getMeasuredWidth(), this.f30916e.getMeasuredHeight());
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c d(float f8) {
        this.f30912a = f8;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void destroy() {
        a(false);
        this.f30913b.destroy();
        this.f30923l = false;
    }

    @Override // eightbitlab.com.blurview.a
    public boolean draw(Canvas canvas) {
        if (this.f30922k && this.f30923l) {
            if (canvas instanceof C3929b) {
                return false;
            }
            float width = this.f30916e.getWidth() / this.f30915d.getWidth();
            canvas.save();
            canvas.scale(width, this.f30916e.getHeight() / this.f30915d.getHeight());
            this.f30913b.d(canvas, this.f30915d);
            canvas.restore();
            int i8 = this.f30917f;
            if (i8 != 0) {
                canvas.drawColor(i8);
            }
        }
        return true;
    }

    void f(int i8, int i9) {
        a(true);
        e eVar = new e(this.f30913b.a());
        if (eVar.b(i8, i9)) {
            this.f30916e.setWillNotDraw(true);
            return;
        }
        this.f30916e.setWillNotDraw(false);
        e.a d8 = eVar.d(i8, i9);
        this.f30915d = Bitmap.createBitmap(d8.f30933a, d8.f30934b, this.f30913b.b());
        this.f30914c = new C3929b(this.f30915d);
        this.f30923l = true;
        h();
    }

    void h() {
        if (this.f30922k && this.f30923l) {
            Drawable drawable = this.f30924m;
            if (drawable == null) {
                this.f30915d.eraseColor(0);
            } else {
                drawable.draw(this.f30914c);
            }
            this.f30914c.save();
            g();
            this.f30918g.draw(this.f30914c);
            this.f30914c.restore();
            e();
        }
    }
}
