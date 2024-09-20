package com.mbridge.msdk.e.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f18767a;

        /* renamed from: b, reason: collision with root package name */
        public String f18768b;

        /* renamed from: c, reason: collision with root package name */
        public long f18769c;

        /* renamed from: d, reason: collision with root package name */
        public long f18770d;

        /* renamed from: e, reason: collision with root package name */
        public long f18771e;

        /* renamed from: f, reason: collision with root package name */
        public long f18772f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f18773g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<i> f18774h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a(long j8) {
            if (this.f18771e < j8) {
                return true;
            }
            return false;
        }
    }

    a a(String str);

    void a();

    void a(String str, a aVar);

    void a(String str, boolean z8);
}
