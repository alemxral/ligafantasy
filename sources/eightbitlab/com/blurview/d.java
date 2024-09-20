package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.compose.ui.platform.J0;
import x5.C3932e;
import x5.InterfaceC3928a;

/* loaded from: classes5.dex */
public class d implements InterfaceC3928a {

    /* renamed from: b, reason: collision with root package name */
    private int f30927b;

    /* renamed from: c, reason: collision with root package name */
    private int f30928c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3928a f30930e;

    /* renamed from: f, reason: collision with root package name */
    private Context f30931f;

    /* renamed from: a, reason: collision with root package name */
    private final RenderNode f30926a = J0.a("BlurViewNode");

    /* renamed from: d, reason: collision with root package name */
    private float f30929d = 1.0f;

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
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f30926a);
            return;
        }
        if (this.f30930e == null) {
            this.f30930e = new C3932e(this.f30931f);
        }
        this.f30930e.e(bitmap, this.f30929d);
        this.f30930e.d(canvas, bitmap);
    }

    @Override // x5.InterfaceC3928a
    public void destroy() {
        this.f30926a.discardDisplayList();
        InterfaceC3928a interfaceC3928a = this.f30930e;
        if (interfaceC3928a != null) {
            interfaceC3928a.destroy();
        }
    }

    @Override // x5.InterfaceC3928a
    public Bitmap e(Bitmap bitmap, float f8) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f30929d = f8;
        if (bitmap.getHeight() != this.f30927b || bitmap.getWidth() != this.f30928c) {
            this.f30927b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f30928c = width;
            this.f30926a.setPosition(0, 0, width, this.f30927b);
        }
        beginRecording = this.f30926a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f30926a.endRecording();
        RenderNode renderNode = this.f30926a;
        createBlurEffect = RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Context context) {
        this.f30931f = context;
    }
}
