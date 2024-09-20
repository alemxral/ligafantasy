package J1;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    static final Pattern f4674o = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: p, reason: collision with root package name */
    private static final OutputStream f4675p = new b();

    /* renamed from: a, reason: collision with root package name */
    private final File f4676a;

    /* renamed from: b, reason: collision with root package name */
    private final File f4677b;

    /* renamed from: c, reason: collision with root package name */
    private final File f4678c;

    /* renamed from: d, reason: collision with root package name */
    private final File f4679d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4680e;

    /* renamed from: f, reason: collision with root package name */
    private long f4681f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4682g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f4684i;

    /* renamed from: k, reason: collision with root package name */
    private int f4686k;

    /* renamed from: h, reason: collision with root package name */
    private long f4683h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f4685j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f4687l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f4688m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    private final Callable f4689n = new CallableC0090a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class CallableC0090a implements Callable {
        CallableC0090a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f4684i != null) {
                        a.this.N();
                        if (a.this.F()) {
                            a.this.K();
                            a.this.f4686k = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f4691a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f4692b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4693c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4694d;

        /* renamed from: J1.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private class C0091a extends FilterOutputStream {
            /* synthetic */ C0091a(c cVar, OutputStream outputStream, CallableC0090a callableC0090a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f4693c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f4693c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i8) {
                try {
                    ((FilterOutputStream) this).out.write(i8);
                } catch (IOException unused) {
                    c.this.f4693c = true;
                }
            }

            private C0091a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i8, i9);
                } catch (IOException unused) {
                    c.this.f4693c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0090a callableC0090a) {
            this(dVar);
        }

        public void a() {
            a.this.t(this, false);
        }

        public void e() {
            if (this.f4693c) {
                a.this.t(this, false);
                a.this.L(this.f4691a.f4697a);
            } else {
                a.this.t(this, true);
            }
            this.f4694d = true;
        }

        public OutputStream f(int i8) {
            FileOutputStream fileOutputStream;
            C0091a c0091a;
            synchronized (a.this) {
                try {
                    if (this.f4691a.f4700d == this) {
                        if (!this.f4691a.f4699c) {
                            this.f4692b[i8] = true;
                        }
                        File k8 = this.f4691a.k(i8);
                        try {
                            fileOutputStream = new FileOutputStream(k8);
                        } catch (FileNotFoundException unused) {
                            a.this.f4676a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(k8);
                            } catch (FileNotFoundException unused2) {
                                return a.f4675p;
                            }
                        }
                        c0091a = new C0091a(this, fileOutputStream, null);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0091a;
        }

        private c(d dVar) {
            this.f4691a = dVar;
            this.f4692b = dVar.f4699c ? null : new boolean[a.this.f4682g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f4697a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f4698b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4699c;

        /* renamed from: d, reason: collision with root package name */
        private c f4700d;

        /* renamed from: e, reason: collision with root package name */
        private long f4701e;

        /* synthetic */ d(a aVar, String str, CallableC0090a callableC0090a) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == a.this.f4682g) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f4698b[i8] = Long.parseLong(strArr[i8]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i8) {
            return new File(a.this.f4676a, this.f4697a + "." + i8);
        }

        public File k(int i8) {
            return new File(a.this.f4676a, this.f4697a + "." + i8 + ".tmp");
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j8 : this.f4698b) {
                sb.append(' ');
                sb.append(j8);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f4697a = str;
            this.f4698b = new long[a.this.f4682g];
        }
    }

    /* loaded from: classes3.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f4703a;

        /* renamed from: b, reason: collision with root package name */
        private final long f4704b;

        /* renamed from: c, reason: collision with root package name */
        private final InputStream[] f4705c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f4706d;

        /* synthetic */ e(a aVar, String str, long j8, InputStream[] inputStreamArr, long[] jArr, CallableC0090a callableC0090a) {
            this(str, j8, inputStreamArr, jArr);
        }

        public InputStream a(int i8) {
            return this.f4705c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f4705c) {
                J1.c.a(inputStream);
            }
        }

        private e(String str, long j8, InputStream[] inputStreamArr, long[] jArr) {
            this.f4703a = str;
            this.f4704b = j8;
            this.f4705c = inputStreamArr;
            this.f4706d = jArr;
        }
    }

    private a(File file, int i8, int i9, long j8) {
        this.f4676a = file;
        this.f4680e = i8;
        this.f4677b = new File(file, "journal");
        this.f4678c = new File(file, "journal.tmp");
        this.f4679d = new File(file, "journal.bkp");
        this.f4682g = i9;
        this.f4681f = j8;
    }

    private synchronized c A(String str, long j8) {
        r();
        O(str);
        d dVar = (d) this.f4685j.get(str);
        CallableC0090a callableC0090a = null;
        if (j8 != -1 && (dVar == null || dVar.f4701e != j8)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0090a);
            this.f4685j.put(str, dVar);
        } else if (dVar.f4700d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0090a);
        dVar.f4700d = cVar;
        this.f4684i.write("DIRTY " + str + '\n');
        this.f4684i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        int i8 = this.f4686k;
        if (i8 >= 2000 && i8 >= this.f4685j.size()) {
            return true;
        }
        return false;
    }

    public static a G(File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        M(file2, file3, false);
                    }
                }
                a aVar = new a(file, i8, i9, j8);
                if (aVar.f4677b.exists()) {
                    try {
                        aVar.I();
                        aVar.H();
                        aVar.f4684i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f4677b, true), J1.c.f4714a));
                        return aVar;
                    } catch (IOException e8) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                        aVar.u();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i8, i9, j8);
                aVar2.K();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void H() {
        w(this.f4678c);
        Iterator it = this.f4685j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i8 = 0;
            if (dVar.f4700d != null) {
                dVar.f4700d = null;
                while (i8 < this.f4682g) {
                    w(dVar.j(i8));
                    w(dVar.k(i8));
                    i8++;
                }
                it.remove();
            } else {
                while (i8 < this.f4682g) {
                    this.f4683h += dVar.f4698b[i8];
                    i8++;
                }
            }
        }
    }

    private void I() {
        J1.b bVar = new J1.b(new FileInputStream(this.f4677b), J1.c.f4714a);
        try {
            String e8 = bVar.e();
            String e9 = bVar.e();
            String e10 = bVar.e();
            String e11 = bVar.e();
            String e12 = bVar.e();
            if ("libcore.io.DiskLruCache".equals(e8) && "1".equals(e9) && Integer.toString(this.f4680e).equals(e10) && Integer.toString(this.f4682g).equals(e11) && "".equals(e12)) {
                int i8 = 0;
                while (true) {
                    try {
                        J(bVar.e());
                        i8++;
                    } catch (EOFException unused) {
                        this.f4686k = i8 - this.f4685j.size();
                        J1.c.a(bVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + e8 + ", " + e9 + ", " + e11 + ", " + e12 + "]");
            }
        } catch (Throwable th) {
            J1.c.a(bVar);
            throw th;
        }
    }

    private void J(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f4685j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            d dVar = (d) this.f4685j.get(substring);
            CallableC0090a callableC0090a = null;
            if (dVar == null) {
                dVar = new d(this, substring, callableC0090a);
                this.f4685j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f4699c = true;
                dVar.f4700d = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f4700d = new c(this, dVar, callableC0090a);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void K() {
        try {
            Writer writer = this.f4684i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4678c), J1.c.f4714a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4680e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4682g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f4685j.values()) {
                    if (dVar.f4700d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f4697a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f4697a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f4677b.exists()) {
                    M(this.f4677b, this.f4679d, true);
                }
                M(this.f4678c, this.f4677b, false);
                this.f4679d.delete();
                this.f4684i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4677b, true), J1.c.f4714a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void M(File file, File file2, boolean z8) {
        if (z8) {
            w(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        while (this.f4683h > this.f4681f) {
            L((String) ((Map.Entry) this.f4685j.entrySet().iterator().next()).getKey());
        }
    }

    private void O(String str) {
        if (f4674o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private void r() {
        if (this.f4684i != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t(c cVar, boolean z8) {
        d dVar = cVar.f4691a;
        if (dVar.f4700d == cVar) {
            if (z8 && !dVar.f4699c) {
                for (int i8 = 0; i8 < this.f4682g; i8++) {
                    if (cVar.f4692b[i8]) {
                        if (!dVar.k(i8).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f4682g; i9++) {
                File k8 = dVar.k(i9);
                if (z8) {
                    if (k8.exists()) {
                        File j8 = dVar.j(i9);
                        k8.renameTo(j8);
                        long j9 = dVar.f4698b[i9];
                        long length = j8.length();
                        dVar.f4698b[i9] = length;
                        this.f4683h = (this.f4683h - j9) + length;
                    }
                } else {
                    w(k8);
                }
            }
            this.f4686k++;
            dVar.f4700d = null;
            if (dVar.f4699c | z8) {
                dVar.f4699c = true;
                this.f4684i.write("CLEAN " + dVar.f4697a + dVar.l() + '\n');
                if (z8) {
                    long j10 = this.f4687l;
                    this.f4687l = 1 + j10;
                    dVar.f4701e = j10;
                }
            } else {
                this.f4685j.remove(dVar.f4697a);
                this.f4684i.write("REMOVE " + dVar.f4697a + '\n');
            }
            this.f4684i.flush();
            if (this.f4683h > this.f4681f || F()) {
                this.f4688m.submit(this.f4689n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void w(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e E(String str) {
        InputStream inputStream;
        r();
        O(str);
        d dVar = (d) this.f4685j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4699c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f4682g];
        for (int i8 = 0; i8 < this.f4682g; i8++) {
            try {
                inputStreamArr[i8] = new FileInputStream(dVar.j(i8));
            } catch (FileNotFoundException unused) {
                for (int i9 = 0; i9 < this.f4682g && (inputStream = inputStreamArr[i9]) != null; i9++) {
                    J1.c.a(inputStream);
                }
                return null;
            }
        }
        this.f4686k++;
        this.f4684i.append((CharSequence) ("READ " + str + '\n'));
        if (F()) {
            this.f4688m.submit(this.f4689n);
        }
        return new e(this, str, dVar.f4701e, inputStreamArr, dVar.f4698b, null);
    }

    public synchronized boolean L(String str) {
        try {
            r();
            O(str);
            d dVar = (d) this.f4685j.get(str);
            if (dVar != null && dVar.f4700d == null) {
                for (int i8 = 0; i8 < this.f4682g; i8++) {
                    File j8 = dVar.j(i8);
                    if (j8.exists() && !j8.delete()) {
                        throw new IOException("failed to delete " + j8);
                    }
                    this.f4683h -= dVar.f4698b[i8];
                    dVar.f4698b[i8] = 0;
                }
                this.f4686k++;
                this.f4684i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f4685j.remove(str);
                if (F()) {
                    this.f4688m.submit(this.f4689n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f4684i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f4685j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f4700d != null) {
                    dVar.f4700d.a();
                }
            }
            N();
            this.f4684i.close();
            this.f4684i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() {
        r();
        N();
        this.f4684i.flush();
    }

    public void u() {
        close();
        J1.c.b(this.f4676a);
    }

    public c x(String str) {
        return A(str, -1L);
    }

    /* loaded from: classes3.dex */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
        }
    }
}
