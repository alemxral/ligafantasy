package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.f;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final V3.k f26821a;

        /* renamed from: b, reason: collision with root package name */
        private final U3.c f26822b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f26823c;

        public a(V3.k messageTransformer, U3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3159y.i(messageTransformer, "messageTransformer");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f26821a = messageTransformer;
            this.f26822b = errorReporter;
            this.f26823c = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.a a(SecretKey secretKey) {
            AbstractC3159y.i(secretKey, "secretKey");
            return new f.a(this.f26821a, secretKey, this.f26822b, this.f26823c);
        }
    }

    f a(SecretKey secretKey);
}
