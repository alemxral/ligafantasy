package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26692a = new a();

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f26693a;

        public b(InterfaceC3983b interfaceC3983b) {
            this.f26693a = interfaceC3983b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f26693a, ((b) obj).f26693a);
        }

        public int hashCode() {
            InterfaceC3983b interfaceC3983b = this.f26693a;
            if (interfaceC3983b == null) {
                return 0;
            }
            return interfaceC3983b.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f26693a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26694a = new c();

        private c() {
        }
    }
}
