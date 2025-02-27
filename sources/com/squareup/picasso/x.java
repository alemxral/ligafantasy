package com.squareup.picasso;

import P6.Z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.s;

/* loaded from: classes4.dex */
public abstract class x {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final s.e f23401a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f23402b;

        /* renamed from: c, reason: collision with root package name */
        private final Z f23403c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23404d;

        public a(Bitmap bitmap, s.e eVar) {
            this((Bitmap) C.e(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.f23402b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f23404d;
        }

        public s.e c() {
            return this.f23401a;
        }

        public Z d() {
            return this.f23403c;
        }

        public a(Z z8, s.e eVar) {
            this(null, (Z) C.e(z8, "source == null"), eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Bitmap bitmap, Z z8, s.e eVar, int i8) {
            if ((bitmap != null) != (z8 != null)) {
                this.f23402b = bitmap;
                this.f23403c = z8;
                this.f23401a = (s.e) C.e(eVar, "loadedFrom == null");
                this.f23404d = i8;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i8, int i9, int i10, int i11, BitmapFactory.Options options, v vVar) {
        int min;
        double floor;
        if (i11 <= i9 && i10 <= i8) {
            min = 1;
        } else {
            if (i9 == 0) {
                floor = Math.floor(i10 / i8);
            } else if (i8 == 0) {
                floor = Math.floor(i11 / i9);
            } else {
                int floor2 = (int) Math.floor(i11 / i9);
                int floor3 = (int) Math.floor(i10 / i8);
                if (vVar.f23362l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i8, int i9, BitmapFactory.Options options, v vVar) {
        a(i8, i9, options.outWidth, options.outHeight, options, vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BitmapFactory.Options d(v vVar) {
        boolean z8;
        boolean c8 = vVar.c();
        if (vVar.f23369s != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!c8 && !z8 && !vVar.f23368r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c8;
        boolean z9 = vVar.f23368r;
        options.inInputShareable = z9;
        options.inPurgeable = z9;
        if (z8) {
            options.inPreferredConfig = vVar.f23369s;
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(BitmapFactory.Options options) {
        if (options != null && options.inJustDecodeBounds) {
            return true;
        }
        return false;
    }

    public abstract boolean c(v vVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(v vVar, int i8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(boolean z8, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }
}
