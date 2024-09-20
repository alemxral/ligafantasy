package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f13651a;

    /* renamed from: b, reason: collision with root package name */
    final long f13652b;

    /* renamed from: c, reason: collision with root package name */
    final long f13653c;

    /* renamed from: d, reason: collision with root package name */
    final float f13654d;

    /* renamed from: e, reason: collision with root package name */
    final long f13655e;

    /* renamed from: f, reason: collision with root package name */
    final int f13656f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f13657g;

    /* renamed from: h, reason: collision with root package name */
    final long f13658h;

    /* renamed from: i, reason: collision with root package name */
    List f13659i;

    /* renamed from: j, reason: collision with root package name */
    final long f13660j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f13661k;

    /* renamed from: l, reason: collision with root package name */
    private Object f13662l;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i8) {
            return new PlaybackStateCompat[i8];
        }
    }

    PlaybackStateCompat(int i8, long j8, long j9, float f8, long j10, int i9, CharSequence charSequence, long j11, List list, long j12, Bundle bundle) {
        this.f13651a = i8;
        this.f13652b = j8;
        this.f13653c = j9;
        this.f13654d = f8;
        this.f13655e = j10;
        this.f13656f = i9;
        this.f13657g = charSequence;
        this.f13658h = j11;
        this.f13659i = new ArrayList(list);
        this.f13660j = j12;
        this.f13661k = bundle;
    }

    public static PlaybackStateCompat b(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        List d8 = e.d(obj);
        if (d8 != null) {
            ArrayList arrayList2 = new ArrayList(d8.size());
            Iterator it = d8.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.b(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = g.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.i(obj), e.h(obj), e.c(obj), e.g(obj), e.a(obj), 0, e.e(obj), e.f(obj), arrayList, e.b(obj), bundle);
        playbackStateCompat.f13662l = obj;
        return playbackStateCompat;
    }

    public static int o(long j8) {
        if (j8 == 4) {
            return 126;
        }
        if (j8 == 2) {
            return 127;
        }
        if (j8 == 32) {
            return 87;
        }
        if (j8 == 16) {
            return 88;
        }
        if (j8 == 1) {
            return 86;
        }
        if (j8 == 64) {
            return 90;
        }
        if (j8 == 8) {
            return 89;
        }
        return j8 == 512 ? 85 : 0;
    }

    public long c() {
        return this.f13655e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f13653c;
    }

    public int f() {
        return this.f13656f;
    }

    public CharSequence i() {
        return this.f13657g;
    }

    public float j() {
        return this.f13654d;
    }

    public long k() {
        return this.f13652b;
    }

    public int n() {
        return this.f13651a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f13651a + ", position=" + this.f13652b + ", buffered position=" + this.f13653c + ", speed=" + this.f13654d + ", updated=" + this.f13658h + ", actions=" + this.f13655e + ", error code=" + this.f13656f + ", error message=" + this.f13657g + ", custom actions=" + this.f13659i + ", active item id=" + this.f13660j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f13651a);
        parcel.writeLong(this.f13652b);
        parcel.writeFloat(this.f13654d);
        parcel.writeLong(this.f13658h);
        parcel.writeLong(this.f13653c);
        parcel.writeLong(this.f13655e);
        TextUtils.writeToParcel(this.f13657g, parcel, i8);
        parcel.writeTypedList(this.f13659i);
        parcel.writeLong(this.f13660j);
        parcel.writeBundle(this.f13661k);
        parcel.writeInt(this.f13656f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f13663a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f13664b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13665c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f13666d;

        /* renamed from: e, reason: collision with root package name */
        private Object f13667e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i8) {
                return new CustomAction[i8];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i8, Bundle bundle) {
            this.f13663a = str;
            this.f13664b = charSequence;
            this.f13665c = i8;
            this.f13666d = bundle;
        }

        public static CustomAction b(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(e.a.a(obj), e.a.d(obj), e.a.c(obj), e.a.b(obj));
                customAction.f13667e = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f13664b) + ", mIcon=" + this.f13665c + ", mExtras=" + this.f13666d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f13663a);
            TextUtils.writeToParcel(this.f13664b, parcel, i8);
            parcel.writeInt(this.f13665c);
            parcel.writeBundle(this.f13666d);
        }

        CustomAction(Parcel parcel) {
            this.f13663a = parcel.readString();
            this.f13664b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13665c = parcel.readInt();
            this.f13666d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f13651a = parcel.readInt();
        this.f13652b = parcel.readLong();
        this.f13654d = parcel.readFloat();
        this.f13658h = parcel.readLong();
        this.f13653c = parcel.readLong();
        this.f13655e = parcel.readLong();
        this.f13657g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13659i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f13660j = parcel.readLong();
        this.f13661k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f13656f = parcel.readInt();
    }
}
