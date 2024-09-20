package N4;

import L5.I;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Build;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2854x;
import i6.M;
import i6.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7202d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC2854x f7203e;

    /* renamed from: f, reason: collision with root package name */
    private static InterfaceC2854x f7204f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7205a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.h f7206b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7207c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final InterfaceC2854x a() {
            return h.f7203e;
        }

        public final InterfaceC2854x b() {
            return h.f7204f;
        }

        public final void c(InterfaceC2854x interfaceC2854x) {
            h.f7203e = interfaceC2854x;
        }

        public final void d(InterfaceC2854x interfaceC2854x) {
            h.f7204f = interfaceC2854x;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7208a;

        /* renamed from: b, reason: collision with root package name */
        Object f7209b;

        /* renamed from: c, reason: collision with root package name */
        Object f7210c;

        /* renamed from: d, reason: collision with root package name */
        int f7211d;

        /* renamed from: e, reason: collision with root package name */
        int f7212e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f7214g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7215a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f7216b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f7217c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, String str, P5.d dVar) {
                super(2, dVar);
                this.f7216b = hVar;
                this.f7217c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7216b, this.f7217c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7215a == 0) {
                    L5.t.b(obj);
                    J4.h r8 = this.f7216b.r();
                    if (r8 != null) {
                        r8.b(this.f7217c);
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0154b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7218a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f7219b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f7220c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0154b(h hVar, String str, P5.d dVar) {
                super(2, dVar);
                this.f7219b = hVar;
                this.f7220c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0154b(this.f7219b, this.f7220c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0154b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7218a == 0) {
                    L5.t.b(obj);
                    J4.h r8 = this.f7219b.r();
                    if (r8 != null) {
                        r8.b(this.f7220c);
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f7214g = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f7214g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0386, code lost:
        
            if (r0 == null) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0388, code lost:
        
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x03cd, code lost:
        
            return L5.I.f6474a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x03c8, code lost:
        
            if (r0 == null) goto L148;
         */
        /* JADX WARN: Removed duplicated region for block: B:129:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02f7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x03bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x037b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x037c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01f2 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01fe A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0214 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x021d A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0222 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0244 A[Catch: all -> 0x0280, Exception -> 0x0287, TRY_LEAVE, TryCatch #13 {Exception -> 0x0287, all -> 0x0280, blocks: (B:93:0x0232, B:94:0x023e, B:96:0x0244, B:106:0x027c, B:124:0x029b, B:125:0x029e, B:127:0x029f, B:130:0x02b7, B:98:0x0255, B:105:0x0279, B:115:0x0294, B:116:0x0297, B:100:0x025d, B:102:0x0261, B:103:0x026d, B:111:0x0291, B:120:0x0298), top: B:92:0x0232, inners: #5, #7 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 984
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f7221a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f7223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f7223c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f7223c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f7221a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                h hVar = h.this;
                ArrayList arrayList = this.f7223c;
                this.f7221a = 1;
                if (hVar.w(arrayList, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public h(Context context, J4.h hVar) {
        AbstractC3159y.i(context, "context");
        this.f7205a = context;
        this.f7206b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(PackageInstaller packageInstaller) {
        Iterator<PackageInstaller.SessionInfo> it = packageInstaller.getMySessions().iterator();
        while (it.hasNext()) {
            try {
                packageInstaller.abandonSession(it.next().getSessionId());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i8, PackageInstaller packageInstaller) {
        try {
            packageInstaller.abandonSession(i8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(int i8, PackageInstaller.Session session, int i9) {
        if (i8 == 0) {
            String string = this.f7205a.getString(E4.h.f2206G, "102");
            AbstractC3159y.h(string, "context.getString(R.stri…RROR_CODE_CREATE_SESSION)");
            return string;
        }
        if (session == null) {
            String string2 = this.f7205a.getString(E4.h.f2206G, "103");
            AbstractC3159y.h(string2, "context.getString(R.stri….ERROR_CODE_OPEN_SESSION)");
            return string2;
        }
        if (i9 == 0) {
            String string3 = this.f7205a.getString(E4.h.f2217R);
            AbstractC3159y.h(string3, "context.getString(R.stri…n_status_failure_storage)");
            return string3;
        }
        if (i9 == 1) {
            String string4 = this.f7205a.getString(E4.h.f2206G, "105");
            AbstractC3159y.h(string4, "context.getString(R.stri….ERROR_CODE_FSYNC_FAILED)");
            return string4;
        }
        if (i9 == 2) {
            String string5 = this.f7205a.getString(E4.h.f2206G, "106");
            AbstractC3159y.h(string5, "context.getString(R.stri…ROR_CODE_CALLBACK_INTENT)");
            return string5;
        }
        if (i9 == 3) {
            String string6 = this.f7205a.getString(E4.h.f2206G, "107");
            AbstractC3159y.h(string6, "context.getString(R.stri…NDING_INTENT_GET_SERVICE)");
            return string6;
        }
        if (i9 == 4) {
            String string7 = this.f7205a.getString(E4.h.f2206G, "108");
            AbstractC3159y.h(string7, "context.getString(R.stri…RROR_CODE_SESSION_COMMIT)");
            return string7;
        }
        String string8 = this.f7205a.getString(E4.h.f2206G, "101");
        AbstractC3159y.h(string8, "context.getString(R.stri…re, Const.ERROR_CODE_101)");
        return string8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream q(Object obj) {
        if (obj instanceof File) {
            return new FileInputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            ContentResolver contentResolver = this.f7205a.getContentResolver();
            if (contentResolver != null) {
                return contentResolver.openInputStream(((DocumentFile) obj).getUri());
            }
            return null;
        }
        throw new Exception("getInputStream: Illegal parameter type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutputStream s(PackageInstaller.Session session, Object obj) {
        String name;
        long length;
        if (obj instanceof File) {
            File file = (File) obj;
            name = file.getName();
            AbstractC3159y.h(name, "any.name");
            length = file.length();
        } else if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.getName() != null) {
                name = documentFile.getName();
                AbstractC3159y.f(name);
                length = documentFile.length();
            } else {
                throw new Exception("getOutputStream: DocumentFile name is null");
            }
        } else {
            throw new Exception("getOutputStream: Illegal parameter type");
        }
        OutputStream openWrite = session.openWrite(name, 0L, length);
        AbstractC3159y.h(openWrite, "session.openWrite(name, 0, length)");
        return openWrite;
    }

    public static /* synthetic */ void u(h hVar, File file, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        hVar.t(file, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(ArrayList arrayList, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new b(arrayList, null), dVar);
    }

    private final void x(ArrayList arrayList) {
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new c(arrayList, null), 3, null);
    }

    public final Context o() {
        return this.f7205a;
    }

    public final J4.h r() {
        return this.f7206b;
    }

    public final void t(File apk, boolean z8) {
        AbstractC3159y.i(apk, "apk");
        this.f7207c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(apk);
        x(arrayList);
    }

    public final void v(ArrayList apks, boolean z8) {
        AbstractC3159y.i(apks, "apks");
        this.f7207c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(apks);
        x(arrayList);
    }

    public final boolean y(int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            return false;
        }
        if (i9 == 31 && i8 >= 29) {
            return true;
        }
        if (i9 == 32 && i8 >= 29) {
            return true;
        }
        if (i9 == 33 && i8 >= 30) {
            return true;
        }
        if (i9 < 34 || i8 < 31) {
            return false;
        }
        return true;
    }
}
