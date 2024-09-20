package com.mbridge.msdk.e;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18853a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f18856d;

    /* renamed from: i, reason: collision with root package name */
    private h f18861i;

    /* renamed from: b, reason: collision with root package name */
    private int f18854b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18855c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f18859g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f18860h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18862j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18863k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f18858f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f18857e = UUID.randomUUID().toString();

    public e(String str) {
        this.f18853a = str;
    }

    public final String a() {
        return this.f18853a;
    }

    public final int b() {
        return this.f18854b;
    }

    public final int c() {
        return this.f18855c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f18856d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18856d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String e() {
        return this.f18857e;
    }

    public final long f() {
        return this.f18858f;
    }

    public final long g() {
        return this.f18859g;
    }

    public final long h() {
        return this.f18860h;
    }

    public final h i() {
        return this.f18861i;
    }

    public final boolean j() {
        return this.f18862j;
    }

    public final boolean k() {
        return this.f18863k;
    }

    public final void a(int i8) {
        this.f18854b = i8;
    }

    public final void b(int i8) {
        this.f18855c = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f18860h = j8;
    }

    public final void a(JSONObject jSONObject) {
        this.f18856d = jSONObject;
    }

    public final void b(long j8) {
        this.f18859g = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.f18857e = str;
    }

    public final void a(long j8) {
        this.f18858f = j8;
    }

    public final void a(h hVar) {
        this.f18861i = hVar;
    }

    public final void a(boolean z8) {
        this.f18863k = z8;
    }
}
