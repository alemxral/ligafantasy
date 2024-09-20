package d6;

import M5.AbstractC1245s;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2558b extends AbstractC1245s {

    /* renamed from: a, reason: collision with root package name */
    private final int f30169a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30170b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30171c;

    /* renamed from: d, reason: collision with root package name */
    private int f30172d;

    public C2558b(char c8, char c9, int i8) {
        this.f30169a = i8;
        this.f30170b = c9;
        boolean z8 = false;
        if (i8 <= 0 ? AbstractC3159y.k(c8, c9) >= 0 : AbstractC3159y.k(c8, c9) <= 0) {
            z8 = true;
        }
        this.f30171c = z8;
        this.f30172d = z8 ? c8 : c9;
    }

    @Override // M5.AbstractC1245s
    public char b() {
        int i8 = this.f30172d;
        if (i8 == this.f30170b) {
            if (this.f30171c) {
                this.f30171c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f30172d = this.f30169a + i8;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30171c;
    }
}
