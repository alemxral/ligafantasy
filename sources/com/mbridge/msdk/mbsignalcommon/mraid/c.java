package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f20545a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f20546b = new ArrayList<>();

    public static com.mbridge.msdk.mbsignalcommon.windvane.a a(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = new com.mbridge.msdk.mbsignalcommon.windvane.a();
        aVar.f20582d = x.a("n+ztLkxpVTzBLkxgHN==");
        aVar.f20583e = parse.getHost();
        int i8 = 0;
        if (f20546b.size() == 0) {
            for (Method method : b.class.getDeclaredMethods()) {
                f20546b.add(method.getName());
            }
        }
        if (!f20546b.contains(aVar.f20583e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = aVar.f20583e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f20545a.containsKey(campaignId)) {
                    String str3 = f20545a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f20545a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f20545a.put(campaignId, str2);
                }
            }
            a.C0411a.f20544a.a(windVaneWebView, aVar.f20583e);
            a.C0411a.f20544a.a(windVaneWebView, aVar.f20583e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i8);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i8);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i8, indexOf2)));
                i8 = indexOf + 1;
            } while (i8 < encodedQuery.length());
            unmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            aVar.f20584f = jSONObject.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return aVar;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f20545a.remove(str);
    }

    public static String a(String str) {
        if (f20545a.containsKey(str)) {
            return f20545a.get(str);
        }
        return null;
    }
}
