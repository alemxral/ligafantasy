package d6;

import M5.N;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class h extends N {

    /* renamed from: a, reason: collision with root package name */
    private final int f30181a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30182b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30183c;

    /* renamed from: d, reason: collision with root package name */
    private int f30184d;

    public h(int i8, int i9, int i10) {
        this.f30181a = i10;
        this.f30182b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f30183c = z8;
        this.f30184d = z8 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30183c;
    }

    @Override // M5.N
    public int nextInt() {
        int i8 = this.f30184d;
        if (i8 == this.f30182b) {
            if (this.f30183c) {
                this.f30183c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f30184d = this.f30181a + i8;
        }
        return i8;
    }
}
