package x3;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import f4.InterfaceC2669b;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3903d implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3901b f39292a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39293b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f39294c;

    public C3903d(C3901b c3901b, I5.a aVar, I5.a aVar2) {
        this.f39292a = c3901b;
        this.f39293b = aVar;
        this.f39294c = aVar2;
    }

    public static C3903d a(C3901b c3901b, I5.a aVar, I5.a aVar2) {
        return new C3903d(c3901b, aVar, aVar2);
    }

    public static InterfaceC2669b c(C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
        return c3901b.b(context, aVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2669b get() {
        return c(this.f39292a, (Context) this.f39293b.get(), (AddressElementActivityContract.a) this.f39294c.get());
    }
}
