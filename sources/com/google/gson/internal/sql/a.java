package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.r;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f17773a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f17774b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f17775c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f17776d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f17777e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f17778f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0387a extends DefaultDateTypeAdapter.a {
        C0387a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* loaded from: classes3.dex */
    class b extends DefaultDateTypeAdapter.a {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f17773a = z8;
        if (z8) {
            f17774b = new C0387a(Date.class);
            f17775c = new b(Timestamp.class);
            f17776d = SqlDateTypeAdapter.f17767b;
            f17777e = SqlTimeTypeAdapter.f17769b;
            f17778f = SqlTimestampTypeAdapter.f17771b;
            return;
        }
        f17774b = null;
        f17775c = null;
        f17776d = null;
        f17777e = null;
        f17778f = null;
    }
}
