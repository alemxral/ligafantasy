package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.support.v4.media.f;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f13593a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f13594b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f13595c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f13596d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f13597e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f13598f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f13599g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f13600h;

    /* renamed from: i, reason: collision with root package name */
    private Object f13601i;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.b(c.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i8) {
            return new MediaDescriptionCompat[i8];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f13602a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f13603b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f13604c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f13605d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f13606e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f13607f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f13608g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f13609h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f13602a, this.f13603b, this.f13604c, this.f13605d, this.f13606e, this.f13607f, this.f13608g, this.f13609h);
        }

        public b b(CharSequence charSequence) {
            this.f13605d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f13608g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f13606e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f13607f = uri;
            return this;
        }

        public b f(String str) {
            this.f13602a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f13609h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f13604c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f13603b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f13593a = str;
        this.f13594b = charSequence;
        this.f13595c = charSequence2;
        this.f13596d = charSequence3;
        this.f13597e = bitmap;
        this.f13598f = uri;
        this.f13599g = bundle;
        this.f13600h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat b(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.c.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.c.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.c.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.c.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.c(r0)
            if (r5 == 0) goto L69
            r2.g(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.v4.media.f.a(r9)
            r2.g(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f13601i = r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Bitmap c() {
        return this.f13597e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object e() {
        Object obj = this.f13601i;
        if (obj == null) {
            int i8 = Build.VERSION.SDK_INT;
            Object b8 = c.a.b();
            c.a.g(b8, this.f13593a);
            c.a.i(b8, this.f13594b);
            c.a.h(b8, this.f13595c);
            c.a.c(b8, this.f13596d);
            c.a.e(b8, this.f13597e);
            c.a.f(b8, this.f13598f);
            Bundle bundle = this.f13599g;
            if (i8 < 23 && this.f13600h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f13600h);
            }
            c.a.d(b8, bundle);
            if (i8 >= 23) {
                f.a.a(b8, this.f13600h);
            }
            Object a8 = c.a.a(b8);
            this.f13601i = a8;
            return a8;
        }
        return obj;
    }

    public CharSequence f() {
        return this.f13595c;
    }

    public CharSequence i() {
        return this.f13594b;
    }

    public String toString() {
        return ((Object) this.f13594b) + ", " + ((Object) this.f13595c) + ", " + ((Object) this.f13596d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        c.i(e(), parcel, i8);
    }
}
