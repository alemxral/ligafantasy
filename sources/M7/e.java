package M7;

import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f7064a;

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            this.f7064a = new JSONObject(jsonString);
            return new J7.d(b());
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38857a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new J7.d(null, 1);
        }
    }

    public final List b() {
        JSONObject jSONObject = this.f7064a;
        if (jSONObject == null) {
            AbstractC3159y.y("json");
            jSONObject = null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("disclosures");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            JSONObject disclosure = jSONArray.getJSONObject(i8);
            String optString = disclosure.optString("identifier");
            String a8 = d.a(optString, "disclosure.optString(\"identifier\")", disclosure, "type", "disclosure.optString(\"type\")");
            int optInt = disclosure.optInt("maxAgeSeconds");
            String optString2 = disclosure.optString("domain");
            AbstractC3159y.h(optString2, "disclosure.optString(\"domain\")");
            AbstractC3159y.h(disclosure, "disclosure");
            arrayList.add(new J7.f(optString, a8, optInt, optString2, i.a(disclosure, "purposes")));
            i8 = i9;
        }
        return arrayList;
    }
}
