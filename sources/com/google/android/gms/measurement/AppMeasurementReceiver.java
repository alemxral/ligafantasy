package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import m0.h;
import m0.i;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements h {

    /* renamed from: a, reason: collision with root package name */
    private i f15978a;

    @Override // m0.h
    public void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f15978a == null) {
            this.f15978a = new i(this);
        }
        this.f15978a.a(context, intent);
    }
}
