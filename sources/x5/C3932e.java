package x5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: x5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3932e implements InterfaceC3928a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f39476b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f39477c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f39478d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f39475a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f39479e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f39480f = -1;

    public C3932e(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f39476b = create;
        this.f39477c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(Bitmap bitmap) {
        if (bitmap.getHeight() == this.f39480f && bitmap.getWidth() == this.f39479e) {
            return true;
        }
        return false;
    }

    @Override // x5.InterfaceC3928a
    public float a() {
        return 6.0f;
    }

    @Override // x5.InterfaceC3928a
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // x5.InterfaceC3928a
    public boolean c() {
        return true;
    }

    @Override // x5.InterfaceC3928a
    public void d(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f39475a);
    }

    @Override // x5.InterfaceC3928a
    public final void destroy() {
        this.f39477c.destroy();
        this.f39476b.destroy();
        Allocation allocation = this.f39478d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // x5.InterfaceC3928a
    public Bitmap e(Bitmap bitmap, float f8) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f39476b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f39478d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f39478d = Allocation.createTyped(this.f39476b, createFromBitmap.getType());
            this.f39479e = bitmap.getWidth();
            this.f39480f = bitmap.getHeight();
        }
        this.f39477c.setRadius(f8);
        this.f39477c.setInput(createFromBitmap);
        this.f39477c.forEach(this.f39478d);
        this.f39478d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
