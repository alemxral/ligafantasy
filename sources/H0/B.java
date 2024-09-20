package H0;

import android.content.Context;

/* loaded from: classes3.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private String f3248a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        try {
            if (this.f3248a == null) {
                this.f3248a = b(context);
            }
            if ("".equals(this.f3248a)) {
                str = null;
            } else {
                str = this.f3248a;
            }
        } finally {
        }
        return str;
    }
}
