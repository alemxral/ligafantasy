package com.stripe.android.view;

/* loaded from: classes4.dex */
public interface L {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27390a = new a("Number", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f27391b = new a("Expiry", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f27392c = new a("Cvc", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f27393d = new a("Postal", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f27394e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27395f;

        static {
            a[] a8 = a();
            f27394e = a8;
            f27395f = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27390a, f27391b, f27392c, f27393d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27394e.clone();
        }
    }
}
