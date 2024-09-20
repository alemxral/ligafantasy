package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2241p extends AbstractC2258s2 {

    /* renamed from: c, reason: collision with root package name */
    private long f16708c;

    /* renamed from: d, reason: collision with root package name */
    private String f16709d;

    /* renamed from: e, reason: collision with root package name */
    private AccountManager f16710e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f16711f;

    /* renamed from: g, reason: collision with root package name */
    private long f16712g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2241p(Y1 y12) {
        super(y12);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f16708c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f16709d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long o() {
        h();
        return this.f16712g;
    }

    public final long p() {
        k();
        return this.f16708c;
    }

    public final String q() {
        k();
        return this.f16709d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        h();
        this.f16711f = null;
        this.f16712g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        Account[] result;
        h();
        long currentTimeMillis = this.f16764a.a().currentTimeMillis();
        if (currentTimeMillis - this.f16712g > 86400000) {
            this.f16711f = null;
        }
        Boolean bool = this.f16711f;
        if (bool == null) {
            if (ContextCompat.checkSelfPermission(this.f16764a.c(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f16764a.d().y().a("Permission error checking for dasher/unicorn accounts");
                this.f16712g = currentTimeMillis;
                this.f16711f = Boolean.FALSE;
                return false;
            }
            if (this.f16710e == null) {
                this.f16710e = AccountManager.get(this.f16764a.c());
            }
            try {
                result = this.f16710e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e8) {
                e = e8;
                this.f16764a.d().t().b("Exception checking account types", e);
                this.f16712g = currentTimeMillis;
                this.f16711f = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e9) {
                e = e9;
                this.f16764a.d().t().b("Exception checking account types", e);
                this.f16712g = currentTimeMillis;
                this.f16711f = Boolean.FALSE;
                return false;
            } catch (IOException e10) {
                e = e10;
                this.f16764a.d().t().b("Exception checking account types", e);
                this.f16712g = currentTimeMillis;
                this.f16711f = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.f16711f = Boolean.TRUE;
                this.f16712g = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f16710e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f16711f = Boolean.TRUE;
                this.f16712g = currentTimeMillis;
                return true;
            }
            this.f16712g = currentTimeMillis;
            this.f16711f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
