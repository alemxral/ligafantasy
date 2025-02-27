package d0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2529a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f30077a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30078b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2529a(IBinder iBinder, String str) {
        this.f30077a = iBinder;
        this.f30078b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30077a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30078b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30077a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
