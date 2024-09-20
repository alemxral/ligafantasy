package r6;

import n6.C3486F;
import n6.I;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3694e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f37666a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3486F f37667b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3486F f37668c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3486F f37669d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3486F f37670e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f37671f;

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f37666a = e8;
        f37667b = new C3486F("PERMIT");
        f37668c = new C3486F("TAKEN");
        f37669d = new C3486F("BROKEN");
        f37670e = new C3486F("CANCELLED");
        e9 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f37671f = e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3695f h(long j8, C3695f c3695f) {
        return new C3695f(j8, c3695f, 0);
    }
}
