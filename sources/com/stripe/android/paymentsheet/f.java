package com.stripe.android.paymentsheet;

import b3.InterfaceC1874i;
import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import q3.EnumC3653f;
import q3.InterfaceC3648a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25957a = a.f25958a;

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {
            @Override // com.stripe.android.paymentsheet.f.b
            public abstract EnumC3653f a();
        }

        /* renamed from: com.stripe.android.paymentsheet.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0609b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC1874i f25959a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25960b;

            public C0609b(InterfaceC1874i confirmParams, boolean z8) {
                AbstractC3159y.i(confirmParams, "confirmParams");
                this.f25959a = confirmParams;
                this.f25960b = z8;
            }

            @Override // com.stripe.android.paymentsheet.f.b
            public EnumC3653f a() {
                EnumC3653f enumC3653f = EnumC3653f.f37309b;
                if (!this.f25960b) {
                    return null;
                }
                return enumC3653f;
            }

            public final InterfaceC1874i b() {
                return this.f25959a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0609b)) {
                    return false;
                }
                C0609b c0609b = (C0609b) obj;
                return AbstractC3159y.d(this.f25959a, c0609b.f25959a) && this.f25960b == c0609b.f25960b;
            }

            public int hashCode() {
                return (this.f25959a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25960b);
            }

            public String toString() {
                return "Confirm(confirmParams=" + this.f25959a + ", isDeferred=" + this.f25960b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f25961a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3983b f25962b;

            public c(Throwable cause, InterfaceC3983b message) {
                AbstractC3159y.i(cause, "cause");
                AbstractC3159y.i(message, "message");
                this.f25961a = cause;
                this.f25962b = message;
            }

            @Override // com.stripe.android.paymentsheet.f.b
            public EnumC3653f a() {
                return null;
            }

            public final Throwable b() {
                return this.f25961a;
            }

            public final InterfaceC3983b c() {
                return this.f25962b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f25961a, cVar.f25961a) && AbstractC3159y.d(this.f25962b, cVar.f25962b);
            }

            public int hashCode() {
                return (this.f25961a.hashCode() * 31) + this.f25962b.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.f25961a + ", message=" + this.f25962b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements b {
            public abstract String b();
        }

        EnumC3653f a();
    }

    Object a(u.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, P5.d dVar2);

    Object b(u.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, P5.d dVar2);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f25958a = new a();

        private a() {
        }

        public final InterfaceC3648a a() {
            return null;
        }

        public final void b(InterfaceC3648a interfaceC3648a) {
        }
    }
}
