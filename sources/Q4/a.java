package Q4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: i, reason: collision with root package name */
    String[] f8256i;

    /* renamed from: n, reason: collision with root package name */
    int f8261n;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f8248a = false;

    /* renamed from: b, reason: collision with root package name */
    protected Context f8249b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f8250c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8251d = 0;

    /* renamed from: e, reason: collision with root package name */
    c f8252e = null;

    /* renamed from: f, reason: collision with root package name */
    Handler f8253f = null;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f8254g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f8255h = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f8257j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f8258k = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f8259l = true;

    /* renamed from: m, reason: collision with root package name */
    int f8260m = -1;

    /* renamed from: o, reason: collision with root package name */
    int f8262o = O4.a.f7777b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.getData().getInt("action");
            String string = message.getData().getString(MimeTypes.BASE_TYPE_TEXT);
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        a aVar = a.this;
                        aVar.d(aVar.f8261n, string);
                        return;
                    }
                    return;
                }
                a aVar2 = a.this;
                aVar2.a(aVar2.f8261n, aVar2.f8260m);
                return;
            }
            a aVar3 = a.this;
            aVar3.c(aVar3.f8261n, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final a f8264a;

        public c(a aVar) {
            this.f8264a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVar = this.f8264a;
            if (aVar.f8262o > 0) {
                synchronized (aVar) {
                    try {
                        O4.a.c("Command " + this.f8264a.f8261n + " is waiting for: " + this.f8264a.f8262o);
                        a aVar2 = this.f8264a;
                        aVar2.wait((long) aVar2.f8262o);
                    } catch (InterruptedException e8) {
                        O4.a.c("Exception: " + e8);
                    }
                    if (!this.f8264a.i()) {
                        O4.a.c("Timeout Exception has occurred for command: " + this.f8264a.f8261n + ".");
                        a.this.m("Timeout Exception");
                    }
                }
            }
        }
    }

    public a(int i8, boolean z8, String... strArr) {
        this.f8256i = new String[0];
        this.f8261n = 0;
        this.f8256i = strArr;
        this.f8261n = i8;
        e(z8);
    }

    private void e(boolean z8) {
        this.f8259l = z8;
        if (Looper.myLooper() != null && z8) {
            O4.a.c("CommandHandler created");
            this.f8253f = new b();
        } else {
            O4.a.c("CommandHandler not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (!this.f8258k) {
            synchronized (this) {
                try {
                    Handler handler = this.f8253f;
                    if (handler != null && this.f8259l) {
                        Message obtainMessage = handler.obtainMessage();
                        Bundle bundle = new Bundle();
                        bundle.putInt("action", 2);
                        obtainMessage.setData(bundle);
                        this.f8253f.sendMessage(obtainMessage);
                    } else {
                        a(this.f8261n, this.f8260m);
                    }
                    O4.a.c("Command " + this.f8261n + " finished.");
                    f();
                } finally {
                }
            }
        }
    }

    public void c(int i8, String str) {
        O4.a.e("Command", "ID: " + i8 + ", " + str);
        this.f8251d = this.f8251d + 1;
    }

    protected final void f() {
        this.f8255h = false;
        this.f8257j = true;
        notifyAll();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < this.f8256i.length; i8++) {
            if (i8 > 0) {
                sb.append('\n');
            }
            sb.append(this.f8256i[i8]);
        }
        return sb.toString();
    }

    public final boolean h() {
        return this.f8255h;
    }

    public final boolean i() {
        return this.f8257j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i8, String str) {
        this.f8250c++;
        Handler handler = this.f8253f;
        if (handler != null && this.f8259l) {
            Message obtainMessage = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
            obtainMessage.setData(bundle);
            this.f8253f.sendMessage(obtainMessage);
            return;
        }
        c(i8, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i8) {
        synchronized (this) {
            this.f8260m = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.f8254g = true;
        c cVar = new c(this);
        this.f8252e = cVar;
        cVar.setPriority(1);
        this.f8252e.start();
        this.f8255h = true;
    }

    protected final void m(String str) {
        try {
            Q4.b.z();
            O4.a.c("Terminating all shells.");
            n(str);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(String str) {
        synchronized (this) {
            try {
                Handler handler = this.f8253f;
                if (handler != null && this.f8259l) {
                    Message obtainMessage = handler.obtainMessage();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 3);
                    bundle.putString(MimeTypes.BASE_TYPE_TEXT, str);
                    obtainMessage.setData(bundle);
                    this.f8253f.sendMessage(obtainMessage);
                } else {
                    d(this.f8261n, str);
                }
                O4.a.c("Command " + this.f8261n + " did not finish because it was terminated. Termination reason: " + str);
                k(-1);
                this.f8258k = true;
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i8, int i9) {
    }

    public void d(int i8, String str) {
    }
}
