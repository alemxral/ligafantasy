package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static SystemIdInfo a(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
        AbstractC3159y.i(id, "id");
        return systemIdInfoDao.getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    public static void b(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
        AbstractC3159y.i(id, "id");
        systemIdInfoDao.removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }
}
