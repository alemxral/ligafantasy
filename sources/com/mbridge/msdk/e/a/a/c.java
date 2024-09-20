package com.mbridge.msdk.e.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f18739a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.e.a.a.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f18740b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f18741c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f18742d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f18743e;

    public c(int i8) {
        this.f18743e = i8;
    }

    public final synchronized byte[] a(int i8) {
        for (int i9 = 0; i9 < this.f18741c.size(); i9++) {
            byte[] bArr = this.f18741c.get(i9);
            if (bArr.length >= i8) {
                this.f18742d -= bArr.length;
                this.f18741c.remove(i9);
                this.f18740b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f18743e) {
                this.f18740b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f18741c, bArr, f18739a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f18741c.add(binarySearch, bArr);
                this.f18742d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f18742d > this.f18743e) {
            byte[] remove = this.f18740b.remove(0);
            this.f18741c.remove(remove);
            this.f18742d -= remove.length;
        }
    }
}
