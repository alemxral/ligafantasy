package E1;

import android.app.UiModeManager;
import android.content.Context;
import y1.EnumC3974g;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f1918a;

    public static EnumC3974g a() {
        int currentModeType = f1918a.getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 4) {
                return EnumC3974g.OTHER;
            }
            return EnumC3974g.CTV;
        }
        return EnumC3974g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f1918a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
