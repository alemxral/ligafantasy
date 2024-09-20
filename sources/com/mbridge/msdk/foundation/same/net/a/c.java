package com.mbridge.msdk.foundation.same.net.a;

import java.io.ByteArrayOutputStream;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class c extends UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    BlockingQueue<b> f19575a;

    /* renamed from: b, reason: collision with root package name */
    ByteArrayOutputStream f19576b = null;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.foundation.same.net.f.b f19577c = null;

    /* renamed from: d, reason: collision with root package name */
    WritableByteChannel f19578d = null;

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f19579e = new AtomicBoolean(false);

    public c(BlockingQueue<b> blockingQueue) {
        this.f19575a = blockingQueue;
    }
}
