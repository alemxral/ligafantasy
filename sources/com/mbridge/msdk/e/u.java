package com.mbridge.msdk.e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u<T> extends com.mbridge.msdk.e.a.p<T> {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f18948a;

    /* renamed from: b, reason: collision with root package name */
    private p.b f18949b;

    /* renamed from: c, reason: collision with root package name */
    private r.b<T> f18950c;

    /* renamed from: d, reason: collision with root package name */
    private v f18951d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.e.a.f f18952e;

    public u(String str, int i8) {
        super(i8, str);
    }

    public final void a(v vVar) {
        this.f18951d = vVar;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final com.mbridge.msdk.e.a.v b() {
        if (y.a(this.f18952e)) {
            this.f18952e = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.f18952e;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        return hashMap;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final p.b e() {
        return this.f18949b;
    }

    public u(String str, int i8, int i9) {
        super(i8, str, i9);
    }

    public final void a(p.b bVar) {
        this.f18949b = bVar;
    }

    public final void a(Map<String, String> map) {
        this.f18948a = map;
    }

    public final void a(r.b<T> bVar) {
        this.f18950c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final com.mbridge.msdk.e.a.r<T> a(com.mbridge.msdk.e.a.m mVar) {
        return this.f18951d.a(mVar);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        return this.f18948a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final void a(T t8) {
        r.b<T> bVar = this.f18950c;
        this.f18950c = bVar;
        if (bVar != null) {
            bVar.a(t8);
        }
    }
}
