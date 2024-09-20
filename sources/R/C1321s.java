package R;

import O.AbstractC1270n;
import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: R.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1321s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f8604a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8605b;

    public C1321s(Context context) {
        AbstractC1319p.l(context);
        Resources resources = context.getResources();
        this.f8604a = resources;
        this.f8605b = resources.getResourcePackageName(AbstractC1270n.f7666a);
    }

    public String a(String str) {
        int identifier = this.f8604a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f8605b);
        if (identifier == 0) {
            return null;
        }
        return this.f8604a.getString(identifier);
    }
}
