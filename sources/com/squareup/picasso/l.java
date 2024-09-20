package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import i2.InterfaceC2773a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC2773a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f23267a;

    /* loaded from: classes4.dex */
    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f23270b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f23269a;

        /* renamed from: b, reason: collision with root package name */
        final int f23270b;

        b(Bitmap bitmap, int i8) {
            this.f23269a = bitmap;
            this.f23270b = i8;
        }
    }

    public l(Context context) {
        this(C.b(context));
    }

    @Override // i2.InterfaceC2773a
    public void a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int j8 = C.j(bitmap);
            if (j8 > b()) {
                this.f23267a.remove(str);
                return;
            } else {
                this.f23267a.put(str, new b(bitmap, j8));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // i2.InterfaceC2773a
    public int b() {
        return this.f23267a.maxSize();
    }

    @Override // i2.InterfaceC2773a
    public Bitmap get(String str) {
        b bVar = (b) this.f23267a.get(str);
        if (bVar != null) {
            return bVar.f23269a;
        }
        return null;
    }

    @Override // i2.InterfaceC2773a
    public int size() {
        return this.f23267a.size();
    }

    public l(int i8) {
        this.f23267a = new a(i8);
    }
}
