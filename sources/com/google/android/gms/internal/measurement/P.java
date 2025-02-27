package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class P implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f15471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15472b;

    /* JADX INFO: Access modifiers changed from: protected */
    public P(IBinder iBinder, String str) {
        this.f15471a = iBinder;
        this.f15472b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15471a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15472b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel j(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15471a.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15471a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
