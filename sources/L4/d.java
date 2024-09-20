package L4;

import android.content.Context;
import g6.n;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6436a;

    /* renamed from: b, reason: collision with root package name */
    private final i f6437b;

    /* renamed from: c, reason: collision with root package name */
    private final L4.c f6438c;

    /* renamed from: d, reason: collision with root package name */
    private int f6439d;

    /* renamed from: e, reason: collision with root package name */
    private ServerSocket f6440e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f6441f;

    /* renamed from: g, reason: collision with root package name */
    private Thread f6442g;

    /* renamed from: h, reason: collision with root package name */
    private K4.c f6443h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f6438c.f() == null) {
                    d.this.f6437b.b();
                    return;
                }
                Socket f8 = d.this.f6438c.f();
                AbstractC3159y.f(f8);
                if (f8.isClosed()) {
                    d.this.f6437b.b();
                    return;
                }
                while (true) {
                    Socket f9 = d.this.f6438c.f();
                    AbstractC3159y.f(f9);
                    String readUTF = new DataInputStream(f9.getInputStream()).readUTF();
                    if (readUTF != null) {
                        if (n.s(readUTF, "OK", true)) {
                            if (d.this.f6438c.e() != null) {
                                i iVar = d.this.f6437b;
                                K4.c e8 = d.this.f6438c.e();
                                AbstractC3159y.f(e8);
                                iVar.r(e8);
                            }
                        } else if (n.s(readUTF, "KO", true)) {
                            d.this.f6437b.h();
                        } else if (n.s(readUTF, "FileReceived", true)) {
                            d.this.f6437b.p();
                        } else if (n.C(readUTF, "resolveService:", false, 2, null)) {
                            String substring = readUTF.substring(15);
                            AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                            d.this.f6437b.q(substring);
                        } else {
                            d.this.f6443h = new K4.c();
                            K4.c cVar = d.this.f6443h;
                            AbstractC3159y.f(cVar);
                            cVar.c(readUTF);
                            i iVar2 = d.this.f6437b;
                            K4.c cVar2 = d.this.f6443h;
                            AbstractC3159y.f(cVar2);
                            iVar2.y(cVar2);
                        }
                    } else {
                        d.this.f6437b.b();
                    }
                }
            } catch (EOFException unused) {
                d.this.f6437b.j();
            } catch (IOException unused2) {
                d.this.f6437b.b();
            } catch (Exception unused3) {
                d.this.f6437b.b();
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.j();
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f6440e = new ServerSocket(0);
                d dVar = d.this;
                ServerSocket serverSocket = dVar.f6440e;
                AbstractC3159y.f(serverSocket);
                dVar.k(serverSocket.getLocalPort());
                d.this.f6437b.f(d.this.i());
                while (true) {
                    Thread thread = d.this.f6441f;
                    AbstractC3159y.f(thread);
                    if (!thread.isInterrupted()) {
                        ServerSocket serverSocket2 = d.this.f6440e;
                        AbstractC3159y.f(serverSocket2);
                        Socket socketTmp = serverSocket2.accept();
                        L4.c cVar = d.this.f6438c;
                        AbstractC3159y.h(socketTmp, "socketTmp");
                        cVar.m(socketTmp);
                        d.this.f6437b.d(socketTmp.getRemoteSocketAddress().toString());
                    } else {
                        return;
                    }
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public d(Context context, i nsdListener, L4.c nsdConnectionManager) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(nsdListener, "nsdListener");
        AbstractC3159y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f6436a = context;
        this.f6437b = nsdListener;
        this.f6438c = nsdConnectionManager;
        this.f6439d = -1;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        int read;
        long j8;
        try {
            File f8 = new N4.f().f(this.f6436a);
            K4.c cVar = this.f6443h;
            AbstractC3159y.f(cVar);
            if (cVar.e() != null) {
                K4.c cVar2 = this.f6443h;
                AbstractC3159y.f(cVar2);
                String e8 = cVar2.e();
                AbstractC3159y.f(e8);
                File file = new File(f8, e8);
                Socket g8 = this.f6438c.g();
                AbstractC3159y.f(g8);
                InputStream inputStream = g8.getInputStream();
                if (inputStream != null) {
                    byte[] bArr = new byte[8192];
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    K4.c cVar3 = this.f6443h;
                    AbstractC3159y.f(cVar3);
                    long h8 = cVar3.h();
                    long j9 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    for (int i10 = 8192; i8 < h8 && (read = inputStream.read(bArr, 0, i10)) > 0; i10 = 8192) {
                        fileOutputStream.write(bArr, 0, read);
                        i8 += read;
                        byte[] bArr2 = bArr;
                        int i11 = (int) ((i8 * 100.0d) / h8);
                        if (i11 <= i9 + 5) {
                            j8 = h8;
                            if (System.currentTimeMillis() > 1000 + j9 && i11 > i9) {
                            }
                            bArr = bArr2;
                            h8 = j8;
                        } else {
                            j8 = h8;
                        }
                        j9 = System.currentTimeMillis();
                        this.f6437b.m(i11);
                        i9 = i11;
                        bArr = bArr2;
                        h8 = j8;
                    }
                    this.f6437b.m(100);
                    fileOutputStream.close();
                    String e9 = N4.d.f7188a.e(file.getAbsolutePath());
                    if (e9 != null) {
                        K4.c cVar4 = this.f6443h;
                        AbstractC3159y.f(cVar4);
                        if (n.s(e9, cVar4.g(), true)) {
                            i iVar = this.f6437b;
                            K4.c cVar5 = this.f6443h;
                            AbstractC3159y.f(cVar5);
                            String e10 = cVar5.e();
                            AbstractC3159y.f(e10);
                            iVar.x(e10, "File Transfer is correct!");
                            return;
                        }
                    }
                    this.f6437b.l("ERROR: File hashes do not macth!");
                    return;
                }
                this.f6437b.l("ERROR: cant create output file");
            }
        } catch (Exception e11) {
            if (e11.getMessage() != null) {
                i iVar2 = this.f6437b;
                String message = e11.getMessage();
                AbstractC3159y.f(message);
                iVar2.l(message);
                return;
            }
            this.f6437b.l("Exception");
        }
    }

    private final void o() {
        Thread thread = new Thread(new c());
        this.f6441f = thread;
        AbstractC3159y.f(thread);
        thread.start();
    }

    public final int i() {
        return this.f6439d;
    }

    public final void k(int i8) {
        this.f6439d = i8;
    }

    public final void l() {
        Thread thread = this.f6442g;
        if (thread != null) {
            AbstractC3159y.f(thread);
            if (thread.isAlive()) {
                return;
            }
        }
        Thread thread2 = new Thread(new a());
        this.f6442g = thread2;
        AbstractC3159y.f(thread2);
        thread2.start();
    }

    public final void m(K4.c cVar) {
        this.f6438c.l(cVar);
        l();
    }

    public final void n() {
        new Thread(new b()).start();
    }

    public final void p() {
        Thread thread = this.f6441f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            ServerSocket serverSocket = this.f6440e;
            if (serverSocket != null) {
                serverSocket.close();
            }
            this.f6440e = null;
        } catch (IOException unused) {
        }
    }
}
