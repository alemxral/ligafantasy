package com.mbridge.msdk.foundation.same.net.f;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f19642a;

    /* renamed from: b, reason: collision with root package name */
    public final List<com.mbridge.msdk.foundation.same.net.d.b> f19643b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f19644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19645d;

    public c(int i8, byte[] bArr, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this(i8, bArr, a(list), list);
    }

    private static Map<String, String> a(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.mbridge.msdk.foundation.same.net.d.b bVar : list) {
            treeMap.put(bVar.a(), bVar.b());
        }
        return treeMap;
    }

    private c(int i8, byte[] bArr, Map<String, String> map, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this.f19645d = i8;
        this.f19642a = bArr;
        this.f19644c = map;
        if (list == null) {
            this.f19643b = null;
        } else {
            this.f19643b = DesugarCollections.unmodifiableList(list);
        }
    }
}
