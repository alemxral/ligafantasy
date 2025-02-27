package com.squareup.picasso;

import P6.L;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.s;
import com.squareup.picasso.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2404b extends x {

    /* renamed from: d, reason: collision with root package name */
    private static final int f23206d = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23207a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23208b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f23209c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2404b(Context context) {
        this.f23207a = context;
    }

    static String j(v vVar) {
        return vVar.f23354d.toString().substring(f23206d);
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        Uri uri = vVar.f23354d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        if (this.f23209c == null) {
            synchronized (this.f23208b) {
                try {
                    if (this.f23209c == null) {
                        this.f23209c = this.f23207a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new x.a(L.l(this.f23209c.open(j(vVar))), s.e.DISK);
    }
}
