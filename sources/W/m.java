package W;

import R.AbstractC1319p;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static String f11945a;

    /* renamed from: b, reason: collision with root package name */
    private static int f11946b;

    public static String a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f11945a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f11945a = processName;
            } else {
                int i8 = f11946b;
                if (i8 == 0) {
                    i8 = Process.myPid();
                    f11946b = i8;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i8 > 0) {
                    try {
                        str = "/proc/" + i8 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            AbstractC1319p.l(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            j.a(bufferedReader2);
                            throw th;
                        }
                        j.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f11945a = str2;
            }
        }
        return f11945a;
    }
}
