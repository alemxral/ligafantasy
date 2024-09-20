package R;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f8527a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8528b;

    public e0(AbstractC1306c abstractC1306c, int i8) {
        this.f8528b = abstractC1306c;
        this.f8527a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC1315l u8;
        AbstractC1306c abstractC1306c = this.f8528b;
        if (iBinder != null) {
            obj = abstractC1306c.f8487n;
            synchronized (obj) {
                try {
                    AbstractC1306c abstractC1306c2 = this.f8528b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1315l)) {
                        u8 = (InterfaceC1315l) queryLocalInterface;
                    } else {
                        u8 = new U(iBinder);
                    }
                    abstractC1306c2.f8488o = u8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f8528b.e0(0, null, this.f8527a);
            return;
        }
        AbstractC1306c.d0(abstractC1306c, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f8528b.f8487n;
        synchronized (obj) {
            this.f8528b.f8488o = null;
        }
        AbstractC1306c abstractC1306c = this.f8528b;
        int i8 = this.f8527a;
        Handler handler = abstractC1306c.f8485l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
