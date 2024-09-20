package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i8) {
            return new BatchReportMessage[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f19789a;

    /* renamed from: b, reason: collision with root package name */
    private long f19790b;

    /* renamed from: c, reason: collision with root package name */
    private String f19791c;

    public BatchReportMessage(String str, String str2, long j8) {
        this.f19791c = str;
        this.f19789a = str2;
        this.f19790b = j8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f19789a;
    }

    public long getTimestamp() {
        return this.f19790b;
    }

    public String getUuid() {
        return this.f19791c;
    }

    public void setReportMessage(String str) {
        this.f19789a = str;
    }

    public void setTimestamp(long j8) {
        this.f19790b = j8;
    }

    public void setUuid(String str) {
        this.f19791c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f19791c);
        parcel.writeString(this.f19789a);
        parcel.writeLong(this.f19790b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f19791c = parcel.readString();
        this.f19789a = parcel.readString();
        this.f19790b = parcel.readLong();
    }
}
