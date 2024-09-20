package z1;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4013a {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    INVITATION_ACCEPTED("invitationAccept");


    /* renamed from: a, reason: collision with root package name */
    String f40033a;

    EnumC4013a(String str) {
        this.f40033a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f40033a;
    }
}
