package L;

import R.AbstractC1319p;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final U.a f6010c = new U.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    private final String f6011a;

    /* renamed from: b, reason: collision with root package name */
    private final Q.l f6012b = new Q.l(null);

    public f(String str) {
        this.f6011a = AbstractC1319p.f(str);
    }

    public static P.g a(String str) {
        if (str == null) {
            return P.h.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f6012b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f15077h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f6011a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f15075f;
            } else {
                f6010c.b("Unable to revoke access!", new Object[0]);
            }
            f6010c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e8) {
            f6010c.b("IOException when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        } catch (Exception e9) {
            f6010c.b("Exception when revoking access: ".concat(String.valueOf(e9.toString())), new Object[0]);
        }
        this.f6012b.f(status);
    }
}
