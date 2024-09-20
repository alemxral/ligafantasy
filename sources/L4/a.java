package L4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private i f6417a;

    /* renamed from: b, reason: collision with root package name */
    private final L4.c f6418b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f6419c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class RunnableC0137a implements Runnable {
        public RunnableC0137a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.d("FileReceived")) {
                a.this.c().u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final File f6421a;

        public b(File file) {
            this.f6421a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f6421a != null) {
                    a.this.c().t(this.f6421a);
                    byte[] bArr = new byte[8192];
                    FileInputStream fileInputStream = new FileInputStream(this.f6421a);
                    Socket g8 = a.this.f6418b.g();
                    AbstractC3159y.f(g8);
                    OutputStream outputStream = g8.getOutputStream();
                    int available = fileInputStream.available();
                    long j8 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 8192);
                        if (read > 0) {
                            outputStream.write(bArr, 0, read);
                            i8 += read;
                            if (available > 0) {
                                int i10 = (int) ((i8 * 100.0d) / available);
                                if (i10 <= i9 + 5) {
                                    if (System.currentTimeMillis() > 1000 + j8 && i10 > i9) {
                                    }
                                }
                                j8 = System.currentTimeMillis();
                                a.this.c().n(i10);
                                i9 = i10;
                            }
                        } else {
                            a.this.c().n(100);
                            fileInputStream.close();
                            outputStream.flush();
                            a.this.c().k();
                            return;
                        }
                    }
                }
            } catch (Exception e8) {
                if (e8.getMessage() != null) {
                    i c8 = a.this.c();
                    String message = e8.getMessage();
                    AbstractC3159y.f(message);
                    c8.w(message);
                    return;
                }
                a.this.c().w("Exception");
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6423a;

        public c(boolean z8) {
            this.f6423a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (this.f6423a) {
                str = "OK";
            } else {
                str = "KO";
            }
            if (a.this.d(str)) {
                if (this.f6423a) {
                    a.this.f6418b.i().n();
                } else {
                    a.this.f6418b.i().l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f6425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6426b;

        public d(a aVar, String serviceName) {
            AbstractC3159y.i(serviceName, "serviceName");
            this.f6426b = aVar;
            this.f6425a = serviceName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6426b.d("resolveService:" + this.f6425a)) {
                this.f6426b.f6418b.i().l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final K4.c f6427a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6428b;

        public e(a aVar, K4.c ftiToSend) {
            AbstractC3159y.i(ftiToSend, "ftiToSend");
            this.f6428b = aVar;
            this.f6427a = ftiToSend;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6428b.d(this.f6427a.i())) {
                this.f6428b.c().v(this.f6427a);
            }
        }
    }

    public a(i nsdListener, L4.c nsdConnectionManager) {
        AbstractC3159y.i(nsdListener, "nsdListener");
        AbstractC3159y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f6417a = nsdListener;
        this.f6418b = nsdConnectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str) {
        try {
            if (this.f6418b.f() == null) {
                this.f6417a.o("Socket is closed");
                return false;
            }
            Socket f8 = this.f6418b.f();
            AbstractC3159y.f(f8);
            if (f8.isClosed()) {
                this.f6417a.o("Socket is closed");
                return false;
            }
            Socket f9 = this.f6418b.f();
            AbstractC3159y.f(f9);
            DataOutputStream dataOutputStream = new DataOutputStream(f9.getOutputStream());
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            return true;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            this.f6417a.o("Unknown Host");
            return false;
        } catch (IOException e9) {
            e9.printStackTrace();
            this.f6417a.o("I/O Exception");
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f6417a.o("Error3");
            return false;
        }
    }

    public final i c() {
        return this.f6417a;
    }

    public final void e() {
        new Thread(new RunnableC0137a()).start();
    }

    public final void f(File file) {
        AbstractC3159y.i(file, "file");
        Thread thread = new Thread(new b(file));
        this.f6419c = thread;
        AbstractC3159y.f(thread);
        thread.start();
    }

    public final void g(boolean z8) {
        new Thread(new c(z8)).start();
    }

    public final void h(String serviceName) {
        AbstractC3159y.i(serviceName, "serviceName");
        new Thread(new d(this, serviceName)).start();
    }

    public final void i(K4.c ftiToSend) {
        AbstractC3159y.i(ftiToSend, "ftiToSend");
        new Thread(new e(this, ftiToSend)).start();
    }
}
