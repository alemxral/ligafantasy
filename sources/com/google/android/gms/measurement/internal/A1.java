package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class A1 extends AbstractC2181e1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f15987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(Y1 y12) {
        super(y12);
        this.f16764a.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (m()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f15987b) {
            if (!n()) {
                this.f16764a.g();
                this.f15987b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void k() {
        if (!this.f15987b) {
            l();
            this.f16764a.g();
            this.f15987b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.f15987b;
    }

    protected abstract boolean n();
}
