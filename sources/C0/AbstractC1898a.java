package c0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1898a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14832a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14833b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1898a(IBinder iBinder, String str) {
        this.f14832a = iBinder;
        this.f14833b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14832a;
    }
}
