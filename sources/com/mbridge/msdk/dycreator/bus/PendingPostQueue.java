package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f18652a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f18653b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.f18653b;
                if (pendingPost2 != null) {
                    pendingPost2.f18651c = pendingPost;
                    this.f18653b = pendingPost;
                } else if (this.f18652a == null) {
                    this.f18653b = pendingPost;
                    this.f18652a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f18652a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f18651c;
            this.f18652a = pendingPost2;
            if (pendingPost2 == null) {
                this.f18653b = null;
            }
        }
        return pendingPost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a(int i8) throws InterruptedException {
        try {
            if (this.f18652a == null) {
                wait(i8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
