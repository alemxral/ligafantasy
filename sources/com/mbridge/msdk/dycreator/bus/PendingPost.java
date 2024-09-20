package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f18648d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f18649a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f18650b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f18651c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f18649a = obj;
        this.f18650b = subscription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f18648d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    PendingPost remove = list.remove(size - 1);
                    remove.f18649a = obj;
                    remove.f18650b = subscription;
                    remove.f18651c = null;
                    return remove;
                }
                return new PendingPost(obj, subscription);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PendingPost pendingPost) {
        pendingPost.f18649a = null;
        pendingPost.f18650b = null;
        pendingPost.f18651c = null;
        List<PendingPost> list = f18648d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
