package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;

    /* renamed from: C1, reason: collision with root package name */
    private static final float f13687C1 = 0.0334196f;

    /* renamed from: C2, reason: collision with root package name */
    private static final float f13688C2 = 3.49066E-4f;

    /* renamed from: C3, reason: collision with root package name */
    private static final float f13689C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;

    /* renamed from: J0, reason: collision with root package name */
    private static final float f13690J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TwilightCalculator getInstance() {
        if (sInstance == null) {
            sInstance = new TwilightCalculator();
        }
        return sInstance;
    }

    public void calculateTwilight(long j8, double d8, double d9) {
        double d10 = (0.01720197f * (((float) (j8 - UTC_2000)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d10) * 0.03341960161924362d) + d10 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - f13690J0) - r7)) + f13690J0 + ((-d9) / 360.0d) + (Math.sin(d10) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d11 = 0.01745329238474369d * d8;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d11) * Math.sin(asin))) / (Math.cos(d11) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.state = 0;
                this.sunset = -1L;
                this.sunrise = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.sunset = Math.round((round + acos) * 8.64E7d) + UTC_2000;
            long round2 = Math.round((round - acos) * 8.64E7d) + UTC_2000;
            this.sunrise = round2;
            if (round2 < j8 && this.sunset > j8) {
                this.state = 0;
            } else {
                this.state = 1;
            }
        }
    }
}
