package androidx.datastore.preferences.core;

import M5.AbstractC1246t;
import P6.AbstractC1285k;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioStorage;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 4) != 0) {
            list = AbstractC1246t.m();
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(Actual_jvmKt.ioDispatcher().plus(U0.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, m8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 2) != 0) {
            list = AbstractC1246t.m();
        }
        if ((i8 & 4) != 0) {
            m8 = N.a(Actual_jvmKt.ioDispatcher().plus(U0.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, m8, function0);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        AbstractC3159y.i(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (M) null, 14, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, Function0 produceFile) {
        AbstractC3159y.i(migrations, "migrations");
        AbstractC3159y.i(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        AbstractC3159y.i(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (M) null, 12, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0 produceFile) {
        AbstractC3159y.i(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations) {
        AbstractC3159y.i(storage, "storage");
        AbstractC3159y.i(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (M) null, 8, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(Function0 produceFile) {
        AbstractC3159y.i(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 2) != 0) {
            list = AbstractC1246t.m();
        }
        if ((i8 & 4) != 0) {
            m8 = N.a(C2812b0.b().plus(U0.b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, m8, function0);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, Function0 produceFile) {
        AbstractC3159y.i(migrations, "migrations");
        AbstractC3159y.i(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (M) null, produceFile, 4, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, M scope, Function0 produceFile) {
        AbstractC3159y.i(migrations, "migrations");
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new PreferenceDataStoreFactory$createWithPath$1(produceFile));
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0 produceFile) {
        AbstractC3159y.i(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (M) null, produceFile, 6, (Object) null);
    }

    public final DataStore<Preferences> create(Function0 produceFile) {
        AbstractC3159y.i(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (M) null, produceFile, 7, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, M scope, Function0 produceFile) {
        AbstractC3159y.i(migrations, "migrations");
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(produceFile, "produceFile");
        return new PreferenceDataStore(create(new OkioStorage(AbstractC1285k.f8077b, PreferencesSerializer.INSTANCE, null, new PreferenceDataStoreFactory$create$delegate$1(produceFile), 4, null), replaceFileCorruptionHandler, migrations, scope));
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, M scope) {
        AbstractC3159y.i(storage, "storage");
        AbstractC3159y.i(migrations, "migrations");
        AbstractC3159y.i(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
