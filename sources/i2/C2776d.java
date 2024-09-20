package i2;

import java.io.PrintWriter;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2776d {

    /* renamed from: a, reason: collision with root package name */
    public final int f31536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31537b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31538c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31539d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31540e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31541f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31542g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31543h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31544i;

    /* renamed from: j, reason: collision with root package name */
    public final long f31545j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31546k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31547l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31548m;

    /* renamed from: n, reason: collision with root package name */
    public final long f31549n;

    public C2776d(int i8, int i9, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i10, int i11, int i12, long j16) {
        this.f31536a = i8;
        this.f31537b = i9;
        this.f31538c = j8;
        this.f31539d = j9;
        this.f31540e = j10;
        this.f31541f = j11;
        this.f31542g = j12;
        this.f31543h = j13;
        this.f31544i = j14;
        this.f31545j = j15;
        this.f31546k = i10;
        this.f31547l = i11;
        this.f31548m = i12;
        this.f31549n = j16;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f31536a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f31537b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f31537b / this.f31536a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f31538c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f31539d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f31546k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f31540e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f31543h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f31547l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f31541f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f31548m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f31542g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f31544i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f31545j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f31536a + ", size=" + this.f31537b + ", cacheHits=" + this.f31538c + ", cacheMisses=" + this.f31539d + ", downloadCount=" + this.f31546k + ", totalDownloadSize=" + this.f31540e + ", averageDownloadSize=" + this.f31543h + ", totalOriginalBitmapSize=" + this.f31541f + ", totalTransformedBitmapSize=" + this.f31542g + ", averageOriginalBitmapSize=" + this.f31544i + ", averageTransformedBitmapSize=" + this.f31545j + ", originalBitmapCount=" + this.f31547l + ", transformedBitmapCount=" + this.f31548m + ", timeStamp=" + this.f31549n + '}';
    }
}
