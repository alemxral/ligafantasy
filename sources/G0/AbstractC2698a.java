package g0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2698a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f31152a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31153b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2698a(IBinder iBinder, String str) {
        this.f31152a = iBinder;
        this.f31153b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31152a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel i(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f31152a.transact(i8, parcel, obtain, 0);
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
    public final Parcel j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31153b);
        return obtain;
    }
}
