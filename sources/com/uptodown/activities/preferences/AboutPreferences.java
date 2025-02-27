package com.uptodown.activities.preferences;

import C4.g;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.AboutPreferences;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3323k;

/* loaded from: classes4.dex */
public final class AboutPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {

        /* renamed from: a, reason: collision with root package name */
        private Preference f29299a;

        /* renamed from: b, reason: collision with root package name */
        private int f29300b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            if (this$0.getActivity() != null) {
                C3323k c3323k = new C3323k();
                FragmentActivity requireActivity = this$0.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                C3323k.r(c3323k, requireActivity, this$0.getString(R.string.url) + "/android", null, 4, null);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            if (this$0.getActivity() != null) {
                C3323k c3323k = new C3323k();
                FragmentActivity requireActivity = this$0.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                String string = this$0.getString(R.string.url_developers);
                AbstractC3159y.h(string, "getString(R.string.url_developers)");
                C3323k.r(c3323k, requireActivity, string, null, 4, null);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a this$0, Preference preference, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            if (this$0.f29300b == 4) {
                preference.setSummary(((Object) preference.getSummary()) + " id:" + Settings.Secure.getString(this$0.requireActivity().getContentResolver(), "android_id"));
            }
            int i8 = this$0.f29300b;
            if (i8 < 5) {
                this$0.f29300b = i8 + 1;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) B4.a.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f27990B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.about_preferences);
            Preference findPreference = findPreference("uptodown_website");
            AbstractC3159y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.a
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean l8;
                    l8 = AboutPreferences.a.l(AboutPreferences.a.this, preference);
                    return l8;
                }
            });
            Preference findPreference2 = findPreference("uptodown_developers");
            AbstractC3159y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.b
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean m8;
                    m8 = AboutPreferences.a.m(AboutPreferences.a.this, preference);
                    return m8;
                }
            });
            final Preference findPreference3 = findPreference("version");
            AbstractC3159y.f(findPreference3);
            findPreference3.setSummary(getString(R.string.version, getString(R.string.app_name), "6.25", "625"));
            findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.c
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean n8;
                    n8 = AboutPreferences.a.n(AboutPreferences.a.this, findPreference3, preference);
                    return n8;
                }
            });
            Preference findPreference4 = findPreference("publication_date");
            AbstractC3159y.f(findPreference4);
            findPreference4.setSummary("Sep 18, 2024 01:06");
            Preference findPreference5 = findPreference("core_version");
            AbstractC3159y.f(findPreference5);
            findPreference5.setSummary("0.1.96");
            Preference findPreference6 = findPreference("consola");
            this.f29299a = findPreference6;
            if (findPreference6 != null) {
                findPreference6.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.d
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean o8;
                        o8 = AboutPreferences.a.o(AboutPreferences.a.this, preference);
                        return o8;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}
