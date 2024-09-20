package L4;

import E4.j;
import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6429g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f6430a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6431b;

    /* renamed from: c, reason: collision with root package name */
    private final L4.a f6432c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f6433d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f6434e;

    /* renamed from: f, reason: collision with root package name */
    private K4.c f6435f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public c(i nsdListener, Context context) {
        AbstractC3159y.i(nsdListener, "nsdListener");
        AbstractC3159y.i(context, "context");
        this.f6430a = nsdListener;
        this.f6431b = new d(context, nsdListener, this);
        this.f6432c = new L4.a(nsdListener, this);
    }

    private final void a() {
        try {
            Socket socket = this.f6433d;
            if (socket != null) {
                socket.close();
            }
            this.f6433d = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void b() {
        try {
            Socket socket = this.f6434e;
            if (socket != null) {
                socket.close();
            }
            this.f6434e = null;
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    private final void d(NsdServiceInfo nsdServiceInfo) {
        List hostAddresses;
        try {
            InetAddress host = nsdServiceInfo.getHost();
            if (Build.VERSION.SDK_INT >= 34) {
                hostAddresses = nsdServiceInfo.getHostAddresses();
                Iterator it = hostAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (inetAddress != null) {
                        host = inetAddress;
                        break;
                    }
                }
            }
            m(new Socket(host, nsdServiceInfo.getPort()));
            this.f6430a.z(nsdServiceInfo);
        } catch (ConnectException unused) {
            this.f6430a.c();
        } catch (IOException unused2) {
            this.f6430a.c();
        }
    }

    private final synchronized void n(Socket socket) {
        Socket socket2 = this.f6434e;
        if (socket2 != null && socket2.isConnected()) {
            try {
                Socket socket3 = this.f6434e;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        this.f6434e = socket;
    }

    public final void c() {
        NsdServiceInfo nsdServiceInfo;
        h l8 = j.f2272g.l();
        if (l8 != null) {
            nsdServiceInfo = l8.e();
        } else {
            nsdServiceInfo = null;
        }
        if (nsdServiceInfo != null) {
            d(nsdServiceInfo);
        }
    }

    public final K4.c e() {
        return this.f6435f;
    }

    public final Socket f() {
        return this.f6433d;
    }

    public final Socket g() {
        return this.f6434e;
    }

    public final L4.a h() {
        return this.f6432c;
    }

    public final d i() {
        return this.f6431b;
    }

    public final boolean j() {
        Socket socket = this.f6433d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        Socket socket = this.f6434e;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final void l(K4.c cVar) {
        this.f6435f = cVar;
    }

    public final synchronized void m(Socket socket) {
        try {
            AbstractC3159y.i(socket, "socket");
            Socket socket2 = this.f6433d;
            if (socket2 != null) {
                AbstractC3159y.f(socket2);
                if (socket2.isConnected()) {
                    n(socket);
                }
            }
            this.f6433d = socket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z8) {
        Socket socket = this.f6433d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6432c.g(z8);
                return;
            }
        }
        this.f6430a.o("Socket to write OK is null or closed");
    }

    public final void p() {
        Socket socket = this.f6433d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6432c.h(j.f2272g.m());
                return;
            }
        }
        this.f6430a.o("Socket to write ServiceName is null or closed");
    }

    public final void q(K4.c fti) {
        AbstractC3159y.i(fti, "fti");
        Socket socket = this.f6433d;
        if (socket != null) {
            AbstractC3159y.f(socket);
            if (!socket.isClosed()) {
                this.f6432c.i(fti);
                return;
            }
        }
        this.f6430a.o("Socket to write FTI is null or closed");
    }

    public final void r() {
        this.f6431b.p();
        b();
        a();
    }
}
