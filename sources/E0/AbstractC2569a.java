package e0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2569a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f30203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30204b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2569a(IBinder iBinder, String str) {
        this.f30203a = iBinder;
        this.f30204b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30203a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30204b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30203a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(int i8, Parcel parcel) {
        try {
            this.f30203a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
