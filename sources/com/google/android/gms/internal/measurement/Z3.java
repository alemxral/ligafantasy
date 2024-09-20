package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class Z3 extends AbstractC1955b4 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15618b;

    /* renamed from: c, reason: collision with root package name */
    private int f15619c;

    /* renamed from: d, reason: collision with root package name */
    private int f15620d;

    /* renamed from: e, reason: collision with root package name */
    private int f15621e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Z3(byte[] bArr, int i8, int i9, boolean z8, Y3 y32) {
        super(null);
        this.f15621e = Integer.MAX_VALUE;
        this.f15618b = bArr;
        this.f15619c = 0;
    }

    public final int c(int i8) {
        int i9 = this.f15621e;
        this.f15621e = 0;
        int i10 = this.f15619c + this.f15620d;
        this.f15619c = i10;
        if (i10 > 0) {
            this.f15620d = i10;
            this.f15619c = 0;
        } else {
            this.f15620d = 0;
        }
        return i9;
    }
}
