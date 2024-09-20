package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f18660a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f18661b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f18660a = obj;
        this.f18661b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f18660a != subscription.f18660a || !this.f18661b.equals(subscription.f18661b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18660a.hashCode() + this.f18661b.f18657d.hashCode();
    }
}
