package M6;

import P6.L;
import P6.X;
import P6.Z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7060a = new C0150a();

    /* renamed from: M6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    final class C0150a implements a {
        C0150a() {
        }

        @Override // M6.a
        public X appendingSink(File file) {
            try {
                return L.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return L.a(file);
            }
        }

        @Override // M6.a
        public void delete(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // M6.a
        public void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // M6.a
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // M6.a
        public void rename(File file, File file2) {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // M6.a
        public X sink(File file) {
            try {
                return L.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return L.f(file);
            }
        }

        @Override // M6.a
        public long size(File file) {
            return file.length();
        }

        @Override // M6.a
        public Z source(File file) {
            return L.k(file);
        }
    }

    X appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    X sink(File file);

    long size(File file);

    Z source(File file);
}
