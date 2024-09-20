package O0;

import H0.AbstractC1176j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final File f7677a;

    public a(M0.f fVar) {
        this.f7677a = fVar.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f7677a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        E0.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a8 = a();
                if (a8.exists()) {
                    fileInputStream = new FileInputStream(a8);
                    try {
                        jSONObject = new JSONObject(AbstractC1176j.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        E0.f.f().e("Failed to fetch cached settings", e);
                        AbstractC1176j.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    E0.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC1176j.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e9) {
                e = e9;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1176j.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC1176j.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j8, JSONObject jSONObject) {
        E0.f.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j8);
                    FileWriter fileWriter2 = new FileWriter(a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        AbstractC1176j.e(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e8) {
                        e = e8;
                        fileWriter = fileWriter2;
                        E0.f.f().e("Failed to cache settings", e);
                        AbstractC1176j.e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        AbstractC1176j.e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
