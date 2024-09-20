package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3159y;
import q3.EnumC3653f;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public interface n {

    /* loaded from: classes4.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final q3.n f26054a;

        public a(q3.n action) {
            AbstractC3159y.i(action, "action");
            this.f26054a = action;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f26054a == ((a) obj).f26054a;
        }

        public int hashCode() {
            return this.f26054a.hashCode();
        }

        public String toString() {
            return "Canceled(action=" + this.f26054a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26055a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3983b f26056b;

        /* renamed from: c, reason: collision with root package name */
        private final k f26057c;

        public b(Throwable cause, InterfaceC3983b message, k type) {
            AbstractC3159y.i(cause, "cause");
            AbstractC3159y.i(message, "message");
            AbstractC3159y.i(type, "type");
            this.f26055a = cause;
            this.f26056b = message;
            this.f26057c = type;
        }

        public final Throwable a() {
            return this.f26055a;
        }

        public final InterfaceC3983b b() {
            return this.f26056b;
        }

        public final k c() {
            return this.f26057c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26055a, bVar.f26055a) && AbstractC3159y.d(this.f26056b, bVar.f26056b) && AbstractC3159y.d(this.f26057c, bVar.f26057c);
        }

        public int hashCode() {
            return (((this.f26055a.hashCode() * 31) + this.f26056b.hashCode()) * 31) + this.f26057c.hashCode();
        }

        public String toString() {
            return "Failed(cause=" + this.f26055a + ", message=" + this.f26056b + ", type=" + this.f26057c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f26058a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC3653f f26059b;

        public c(StripeIntent intent, EnumC3653f enumC3653f) {
            AbstractC3159y.i(intent, "intent");
            this.f26058a = intent;
            this.f26059b = enumC3653f;
        }

        public final EnumC3653f a() {
            return this.f26059b;
        }

        public final StripeIntent b() {
            return this.f26058a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f26058a, cVar.f26058a) && this.f26059b == cVar.f26059b;
        }

        public int hashCode() {
            int hashCode = this.f26058a.hashCode() * 31;
            EnumC3653f enumC3653f = this.f26059b;
            return hashCode + (enumC3653f == null ? 0 : enumC3653f.hashCode());
        }

        public String toString() {
            return "Succeeded(intent=" + this.f26058a + ", deferredIntentConfirmationType=" + this.f26059b + ")";
        }
    }
}
