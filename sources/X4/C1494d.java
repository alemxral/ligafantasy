package X4;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3330r;
import org.json.JSONObject;

/* renamed from: X4.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1494d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12482h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f12483a;

    /* renamed from: b, reason: collision with root package name */
    private String f12484b;

    /* renamed from: c, reason: collision with root package name */
    private String f12485c;

    /* renamed from: d, reason: collision with root package name */
    private String f12486d;

    /* renamed from: e, reason: collision with root package name */
    private String f12487e;

    /* renamed from: f, reason: collision with root package name */
    private String f12488f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12489g;

    /* renamed from: X4.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1494d a(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            C1494d c1494d = new C1494d();
            if (!jsonObjectData.isNull("affiliatedURL")) {
                c1494d.j(jsonObjectData.getString("affiliatedURL"));
            }
            if (!jsonObjectData.isNull(CampaignEx.JSON_KEY_TITLE)) {
                c1494d.o(jsonObjectData.getString(CampaignEx.JSON_KEY_TITLE));
            }
            if (!jsonObjectData.isNull("description")) {
                c1494d.l(jsonObjectData.getString("description"));
            }
            if (!jsonObjectData.isNull("buttonText")) {
                c1494d.k(jsonObjectData.getString("buttonText"));
            }
            if (!jsonObjectData.isNull("mainColor")) {
                c1494d.m(jsonObjectData.getString("mainColor"));
            }
            if (!jsonObjectData.isNull("secondaryColor")) {
                c1494d.n(jsonObjectData.getString("secondaryColor"));
            }
            return c1494d;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final void a(Context context, Long l8) {
        AbstractC3159y.i(context, "context");
        Bundle bundle = new Bundle();
        if (l8 != null && l8.longValue() > 0) {
            bundle.putString("appId", l8.toString());
        }
        bundle.putString("type", "clicked");
        new C3330r(context).b("affiliated", bundle);
    }

    public final void b(Context context, Long l8) {
        AbstractC3159y.i(context, "context");
        if (!this.f12489g) {
            this.f12489g = true;
            Bundle bundle = new Bundle();
            if (l8 != null && l8.longValue() > 0) {
                bundle.putString("appId", l8.toString());
            }
            bundle.putString("type", "shown");
            new C3330r(context).b("affiliated", bundle);
        }
    }

    public final String c() {
        return this.f12483a;
    }

    public final String d() {
        return this.f12486d;
    }

    public final String e() {
        return this.f12485c;
    }

    public final String f() {
        return this.f12487e;
    }

    public final String g() {
        return this.f12488f;
    }

    public final boolean h() {
        return this.f12489g;
    }

    public final String i() {
        return this.f12484b;
    }

    public final void j(String str) {
        this.f12483a = str;
    }

    public final void k(String str) {
        this.f12486d = str;
    }

    public final void l(String str) {
        this.f12485c = str;
    }

    public final void m(String str) {
        this.f12487e = str;
    }

    public final void n(String str) {
        this.f12488f = str;
    }

    public final void o(String str) {
        this.f12484b = str;
    }
}
