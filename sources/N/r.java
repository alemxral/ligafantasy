package N;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f7114a;

    /* renamed from: b, reason: collision with root package name */
    private final h f7115b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(IBinder iBinder) {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7114a = new Messenger(iBinder);
            this.f7115b = null;
        } else {
            if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f7115b = new h(iBinder);
                this.f7114a = null;
                return;
            }
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f7114a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        h hVar = this.f7115b;
        if (hVar != null) {
            hVar.c(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
