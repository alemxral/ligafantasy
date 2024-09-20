package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f18672a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.a.b f18673b;

    private f(Context context) {
        this.f18673b = null;
        com.mbridge.msdk.dycreator.a.b a8 = com.mbridge.msdk.dycreator.a.b.a();
        this.f18673b = a8;
        a8.a(context, "");
    }

    public static f a(Context context) {
        if (f18672a == null) {
            synchronized (f.class) {
                try {
                    if (f18672a == null) {
                        f18672a = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f18672a;
    }

    public final View a(String str) {
        if (new File(str).exists()) {
            return this.f18673b.f(str);
        }
        return null;
    }

    public final View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
