package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $numBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1(long j8) {
        super(1);
        this.$numBytes = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(SupportSQLiteDatabase db) {
        AbstractC3159y.i(db, "db");
        return Long.valueOf(db.setMaximumSize(this.$numBytes));
    }
}
