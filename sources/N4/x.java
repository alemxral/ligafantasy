package N4;

import L5.I;
import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.S;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7312a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f7313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7314a;

        /* renamed from: b, reason: collision with root package name */
        int f7315b;

        /* renamed from: c, reason: collision with root package name */
        int f7316c;

        /* renamed from: d, reason: collision with root package name */
        int f7317d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7318e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f7319f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f7320g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7321h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, x xVar, P5.d dVar) {
            super(2, dVar);
            this.f7318e = documentFile;
            this.f7319f = zipOutputStream;
            this.f7320g = context;
            this.f7321h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f7318e, this.f7319f, this.f7320g, this.f7321h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00ae -> B:5:0x00b1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f7317d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f7316c
                int r3 = r8.f7315b
                java.lang.Object r4 = r8.f7314a
                androidx.documentfile.provider.DocumentFile[] r4 = (androidx.documentfile.provider.DocumentFile[]) r4
                L5.t.b(r9)
                goto Lb1
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                L5.t.b(r9)
                androidx.documentfile.provider.DocumentFile r9 = r8.f7318e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L7c
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                androidx.documentfile.provider.DocumentFile r0 = r8.f7318e
                java.lang.String r0 = r0.getName()
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f7319f
                r0.putNextEntry(r9)
                android.content.Context r9 = r8.f7320g
                android.content.ContentResolver r9 = r9.getContentResolver()
                r0 = 0
                if (r9 == 0) goto L50
                androidx.documentfile.provider.DocumentFile r2 = r8.f7318e
                android.net.Uri r2 = r2.getUri()
                java.io.InputStream r9 = r9.openInputStream(r2)
                goto L51
            L50:
                r9 = r0
            L51:
                N4.x r2 = r8.f7321h
                java.util.zip.ZipOutputStream r3 = r8.f7319f
                if (r9 == 0) goto L6b
            L57:
                byte[] r4 = N4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                int r4 = r9.read(r4)     // Catch: java.lang.Throwable -> L69
                if (r4 <= 0) goto L6b
                byte[] r5 = N4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                r3.write(r5, r1, r4)     // Catch: java.lang.Throwable -> L69
                goto L57
            L69:
                r0 = move-exception
                goto L76
            L6b:
                L5.I r1 = L5.I.f6474a     // Catch: java.lang.Throwable -> L69
                V5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f7319f
                r9.closeEntry()
                goto Lb3
            L76:
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r1 = move-exception
                V5.b.a(r9, r0)
                throw r1
            L7c:
                androidx.documentfile.provider.DocumentFile r9 = r8.f7318e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb3
                androidx.documentfile.provider.DocumentFile r9 = r8.f7318e
                androidx.documentfile.provider.DocumentFile[] r9 = r9.listFiles()
                java.lang.String r3 = "sourceFile.listFiles()"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r3)
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L93:
                if (r3 >= r1) goto Lb3
                r9 = r4[r3]
                N4.x r5 = r8.f7321h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r6)
                java.util.zip.ZipOutputStream r6 = r8.f7319f
                android.content.Context r7 = r8.f7320g
                r8.f7314a = r4
                r8.f7315b = r3
                r8.f7316c = r1
                r8.f7317d = r2
                java.lang.Object r9 = N4.x.a(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb1
                return r0
            Lb1:
                int r3 = r3 + r2
                goto L93
            Lb3:
                L5.I r9 = L5.I.f6474a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7322a;

        /* renamed from: b, reason: collision with root package name */
        int f7323b;

        /* renamed from: c, reason: collision with root package name */
        int f7324c;

        /* renamed from: d, reason: collision with root package name */
        int f7325d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f7326e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7327f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f7328g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7329h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, String str, ZipOutputStream zipOutputStream, x xVar, P5.d dVar) {
            super(2, dVar);
            this.f7326e = file;
            this.f7327f = str;
            this.f7328g = zipOutputStream;
            this.f7329h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f7326e, this.f7327f, this.f7328g, this.f7329h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00b0 -> B:5:0x00b3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f7325d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f7324c
                int r3 = r8.f7323b
                java.lang.Object r4 = r8.f7322a
                java.io.File[] r4 = (java.io.File[]) r4
                L5.t.b(r9)
                goto Lb3
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                L5.t.b(r9)
                java.io.File r9 = r8.f7326e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L69
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                java.lang.String r0 = r8.f7327f
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f7328g
                r0.putNextEntry(r9)
                java.io.FileInputStream r9 = new java.io.FileInputStream
                java.io.File r0 = r8.f7326e
                r9.<init>(r0)
                N4.x r0 = r8.f7329h
                java.util.zip.ZipOutputStream r2 = r8.f7328g
            L43:
                byte[] r3 = N4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                int r3 = r9.read(r3)     // Catch: java.lang.Throwable -> L55
                if (r3 <= 0) goto L57
                byte[] r4 = N4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                r2.write(r4, r1, r3)     // Catch: java.lang.Throwable -> L55
                goto L43
            L55:
                r0 = move-exception
                goto L63
            L57:
                L5.I r0 = L5.I.f6474a     // Catch: java.lang.Throwable -> L55
                r0 = 0
                V5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f7328g
                r9.closeEntry()
                goto Lb5
            L63:
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r1 = move-exception
                V5.b.a(r9, r0)
                throw r1
            L69:
                java.io.File r9 = r8.f7326e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb5
                java.io.File r9 = r8.f7326e
                java.io.File[] r9 = r9.listFiles()
                if (r9 == 0) goto Lb5
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L7d:
                if (r3 >= r1) goto Lb5
                r9 = r4[r3]
                N4.x r5 = r8.f7329h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r8.f7327f
                r6.append(r7)
                r7 = 47
                r6.append(r7)
                java.lang.String r7 = r9.getName()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.util.zip.ZipOutputStream r7 = r8.f7328g
                r8.f7322a = r4
                r8.f7323b = r3
                r8.f7324c = r1
                r8.f7325d = r2
                java.lang.Object r9 = N4.x.b(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                int r3 = r3 + r2
                goto L7d
            Lb5:
                L5.I r9 = L5.I.f6474a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7330a;

        /* renamed from: b, reason: collision with root package name */
        Object f7331b;

        /* renamed from: c, reason: collision with root package name */
        Object f7332c;

        /* renamed from: d, reason: collision with root package name */
        int f7333d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f7334e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f7335f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x f7336g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ J4.c f7337h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7338a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7339b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f7340c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f7339b = cVar;
                this.f7340c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7339b, this.f7340c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7338a == 0) {
                    L5.t.b(obj);
                    this.f7339b.b(String.valueOf(this.f7340c.size()));
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7341a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7342b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f7343c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f7344d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f7345e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.c cVar, x xVar, ArrayList arrayList, String str, P5.d dVar) {
                super(2, dVar);
                this.f7342b = cVar;
                this.f7343c = xVar;
                this.f7344d = arrayList;
                this.f7345e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7342b, this.f7343c, this.f7344d, this.f7345e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7341a == 0) {
                    L5.t.b(obj);
                    this.f7342b.c((this.f7343c.f7313b * 100) / this.f7344d.size(), this.f7345e);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.x$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0159c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7346a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7347b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f7348c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0159c(J4.c cVar, File file, P5.d dVar) {
                super(2, dVar);
                this.f7347b = cVar;
                this.f7348c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0159c(this.f7347b, this.f7348c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0159c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7346a == 0) {
                    L5.t.b(obj);
                    J4.c cVar = this.f7347b;
                    String name = this.f7348c.getName();
                    AbstractC3159y.h(name, "destinationZip.name");
                    cVar.a(name);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, ArrayList arrayList, x xVar, J4.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f7334e = file;
            this.f7335f = arrayList;
            this.f7336g = xVar;
            this.f7337h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f7334e, this.f7335f, this.f7336g, this.f7337h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00fe -> B:14:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7349a;

        /* renamed from: b, reason: collision with root package name */
        Object f7350b;

        /* renamed from: c, reason: collision with root package name */
        Object f7351c;

        /* renamed from: d, reason: collision with root package name */
        int f7352d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f7353e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7354f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f7355g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7356h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ J4.c f7357i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7358a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7359b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f7360c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f7359b = cVar;
                this.f7360c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7359b, this.f7360c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7358a == 0) {
                    L5.t.b(obj);
                    this.f7359b.b(String.valueOf(this.f7360c.size()));
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7362b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.c cVar, P5.d dVar) {
                super(2, dVar);
                this.f7362b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7362b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7361a == 0) {
                    L5.t.b(obj);
                    this.f7362b.onError("FileNotFoundException");
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7363a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7364b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f7365c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f7366d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f7367e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.c cVar, x xVar, ArrayList arrayList, String str, P5.d dVar) {
                super(2, dVar);
                this.f7364b = cVar;
                this.f7365c = xVar;
                this.f7366d = arrayList;
                this.f7367e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7364b, this.f7365c, this.f7366d, this.f7367e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7363a == 0) {
                    L5.t.b(obj);
                    this.f7364b.c((this.f7365c.f7313b * 100) / this.f7366d.size(), this.f7367e);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.x$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0160d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7368a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7369b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f7370c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0160d(J4.c cVar, DocumentFile documentFile, P5.d dVar) {
                super(2, dVar);
                this.f7369b = cVar;
                this.f7370c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0160d(this.f7369b, this.f7370c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0160d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7368a == 0) {
                    L5.t.b(obj);
                    J4.c cVar = this.f7369b;
                    String name = this.f7370c.getName();
                    AbstractC3159y.f(name);
                    cVar.a(name);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, DocumentFile documentFile, ArrayList arrayList, x xVar, J4.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f7353e = context;
            this.f7354f = documentFile;
            this.f7355g = arrayList;
            this.f7356h = xVar;
            this.f7357i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f7353e, this.f7354f, this.f7355g, this.f7356h, this.f7357i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(1:(1:(3:8|9|10)(2:12|13))(4:14|15|16|(2:18|(1:20)(6:21|22|(1:24)|15|16|(6:25|(1:27)|28|(1:30)|9|10)(0)))(0)))(6:31|22|(0)|15|16|(0)(0)))(5:32|33|34|16|(0)(0)))(1:35))(2:44|(1:46))|36|37|(4:39|34|16|(0)(0))|33|34|16|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        
            r2 = i6.C2812b0.c();
            r9 = new N4.x.d.b(r19.f7357i, null);
            r19.f7352d = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        
            if (i6.AbstractC2825i.g(r2, r9, r19) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0113 -> B:15:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7371a;

        /* renamed from: b, reason: collision with root package name */
        Object f7372b;

        /* renamed from: c, reason: collision with root package name */
        Object f7373c;

        /* renamed from: d, reason: collision with root package name */
        Object f7374d;

        /* renamed from: e, reason: collision with root package name */
        Object f7375e;

        /* renamed from: f, reason: collision with root package name */
        Object f7376f;

        /* renamed from: g, reason: collision with root package name */
        long f7377g;

        /* renamed from: h, reason: collision with root package name */
        int f7378h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f7379i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f7380j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ x f7381k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ J4.e f7382l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7383a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7384b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7384b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7384b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7383a == 0) {
                    L5.t.b(obj);
                    this.f7384b.c();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7385a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7386b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7387c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7386b = eVar;
                this.f7387c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7386b, this.f7387c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7385a == 0) {
                    L5.t.b(obj);
                    this.f7386b.d(this.f7387c.f33746a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7389b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7390c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7389b = eVar;
                this.f7390c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7389b, this.f7390c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7388a == 0) {
                    L5.t.b(obj);
                    this.f7389b.b(this.f7390c.f33745a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, File file, x xVar, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7379i = str;
            this.f7380j = file;
            this.f7381k = xVar;
            this.f7382l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f7379i, this.f7380j, this.f7381k, this.f7382l, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00fc A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0157 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0169 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TRY_LEAVE, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipInputStream] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0136 -> B:19:0x013b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0145 -> B:20:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ca -> B:31:0x015c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:21:0x00ee). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7391a;

        /* renamed from: b, reason: collision with root package name */
        Object f7392b;

        /* renamed from: c, reason: collision with root package name */
        Object f7393c;

        /* renamed from: d, reason: collision with root package name */
        Object f7394d;

        /* renamed from: e, reason: collision with root package name */
        Object f7395e;

        /* renamed from: f, reason: collision with root package name */
        Object f7396f;

        /* renamed from: g, reason: collision with root package name */
        Object f7397g;

        /* renamed from: h, reason: collision with root package name */
        int f7398h;

        /* renamed from: i, reason: collision with root package name */
        long f7399i;

        /* renamed from: j, reason: collision with root package name */
        int f7400j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ File f7401k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f7402l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f7403m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J4.e f7404n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7406b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7406b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7406b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7405a == 0) {
                    L5.t.b(obj);
                    this.f7406b.c();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7407a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7408b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7408b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7408b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7407a == 0) {
                    L5.t.b(obj);
                    this.f7408b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7409a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7410b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7410b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7410b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7409a == 0) {
                    L5.t.b(obj);
                    this.f7410b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7412b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7413c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7412b = eVar;
                this.f7413c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f7412b, this.f7413c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7411a == 0) {
                    L5.t.b(obj);
                    this.f7412b.d(this.f7413c.f33746a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7414a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7415b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7416c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7415b = eVar;
                this.f7416c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f7415b, this.f7416c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7414a == 0) {
                    L5.t.b(obj);
                    this.f7415b.b(this.f7416c.f33745a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, Uri uri, Context context, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7401k = file;
            this.f7402l = uri;
            this.f7403m = context;
            this.f7404n = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f7401k, this.f7402l, this.f7403m, this.f7404n, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15, types: [androidx.documentfile.provider.DocumentFile] */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v19, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0243 -> B:15:0x0245). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x024c -> B:16:0x024f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01db -> B:27:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01df -> B:17:0x01f9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7417a;

        /* renamed from: b, reason: collision with root package name */
        Object f7418b;

        /* renamed from: c, reason: collision with root package name */
        Object f7419c;

        /* renamed from: d, reason: collision with root package name */
        Object f7420d;

        /* renamed from: e, reason: collision with root package name */
        Object f7421e;

        /* renamed from: f, reason: collision with root package name */
        Object f7422f;

        /* renamed from: g, reason: collision with root package name */
        long f7423g;

        /* renamed from: h, reason: collision with root package name */
        int f7424h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f7425i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f7426j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7427k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ x f7428l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J4.e f7429m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7430a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7431b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7431b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7431b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7430a == 0) {
                    L5.t.b(obj);
                    this.f7431b.c();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7432a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7433b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7434c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7433b = eVar;
                this.f7434c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7433b, this.f7434c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7432a == 0) {
                    L5.t.b(obj);
                    this.f7433b.d(this.f7434c.f33746a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7436b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7437c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7436b = eVar;
                this.f7437c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7436b, this.f7437c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7435a == 0) {
                    L5.t.b(obj);
                    this.f7436b.b(this.f7437c.f33745a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Context context, DocumentFile documentFile, x xVar, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7425i = str;
            this.f7426j = context;
            this.f7427k = documentFile;
            this.f7428l = xVar;
            this.f7429m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f7425i, this.f7426j, this.f7427k, this.f7428l, this.f7429m, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00fa -> B:13:0x0124). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0121 -> B:14:0x0125). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:23:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:15:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7438a;

        /* renamed from: b, reason: collision with root package name */
        Object f7439b;

        /* renamed from: c, reason: collision with root package name */
        Object f7440c;

        /* renamed from: d, reason: collision with root package name */
        Object f7441d;

        /* renamed from: e, reason: collision with root package name */
        Object f7442e;

        /* renamed from: f, reason: collision with root package name */
        Object f7443f;

        /* renamed from: g, reason: collision with root package name */
        Object f7444g;

        /* renamed from: h, reason: collision with root package name */
        long f7445h;

        /* renamed from: i, reason: collision with root package name */
        int f7446i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f7447j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7448k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f7449l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J4.e f7450m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7451a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7452b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7452b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7452b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7451a == 0) {
                    L5.t.b(obj);
                    this.f7452b.c();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7453a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7454b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7454b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7454b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7453a == 0) {
                    L5.t.b(obj);
                    this.f7454b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7455a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7456b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7456b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7456b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7455a == 0) {
                    L5.t.b(obj);
                    this.f7456b.a();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7458b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7459c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7458b = eVar;
                this.f7459c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f7458b, this.f7459c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7457a == 0) {
                    L5.t.b(obj);
                    this.f7458b.d(this.f7459c.f33746a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7460a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7461b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7462c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7461b = eVar;
                this.f7462c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f7461b, this.f7462c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7460a == 0) {
                    L5.t.b(obj);
                    this.f7461b.b(this.f7462c.f33745a);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, DocumentFile documentFile, Uri uri, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7447j = context;
            this.f7448k = documentFile;
            this.f7449l = uri;
            this.f7450m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f7447j, this.f7448k, this.f7449l, this.f7450m, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0319  */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x02f1 -> B:15:0x02f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x02f5 -> B:16:0x02f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0296 -> B:27:0x030c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x029a -> B:17:0x02ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 835
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(documentFile, zipOutputStream, context, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(File file, String str, ZipOutputStream zipOutputStream, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(file, str, zipOutputStream, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object h(ArrayList arrayList, DocumentFile documentFile, J4.c cVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(context, documentFile, arrayList, this, cVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object i(ArrayList arrayList, File file, J4.c cVar, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(file, arrayList, this, cVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object j(DocumentFile documentFile, Uri uri, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new h(context, documentFile, uri, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object k(DocumentFile documentFile, String str, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(str, context, documentFile, this, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object l(File file, Uri uri, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(file, uri, context, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final Object m(File file, String str, J4.e eVar, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(str, file, this, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
