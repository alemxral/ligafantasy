package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f18654a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f18655b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f18656c;

    /* renamed from: d, reason: collision with root package name */
    String f18657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f18654a = method;
        this.f18655b = threadMode;
        this.f18656c = cls;
    }

    private synchronized void a() {
        if (this.f18657d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f18654a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f18654a.getName());
            sb.append('(');
            sb.append(this.f18656c.getName());
            this.f18657d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f18657d.equals(((SubscriberMethod) obj).f18657d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18654a.hashCode();
    }
}
