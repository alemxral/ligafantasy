package L6;

import P6.C1279e;
import P6.C1282h;
import P6.InterfaceC1281g;
import P6.L;
import P6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f6539a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f6540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6541a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1281g f6542b;

        /* renamed from: c, reason: collision with root package name */
        private final int f6543c;

        /* renamed from: d, reason: collision with root package name */
        private int f6544d;

        /* renamed from: e, reason: collision with root package name */
        c[] f6545e;

        /* renamed from: f, reason: collision with root package name */
        int f6546f;

        /* renamed from: g, reason: collision with root package name */
        int f6547g;

        /* renamed from: h, reason: collision with root package name */
        int f6548h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8, Z z8) {
            this(i8, i8, z8);
        }

        private void a() {
            int i8 = this.f6544d;
            int i9 = this.f6548h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f6545e, (Object) null);
            this.f6546f = this.f6545e.length - 1;
            this.f6547g = 0;
            this.f6548h = 0;
        }

        private int c(int i8) {
            return this.f6546f + 1 + i8;
        }

        private int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f6545e.length;
                while (true) {
                    length--;
                    i9 = this.f6546f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f6545e[length].f6538c;
                    i8 -= i11;
                    this.f6548h -= i11;
                    this.f6547g--;
                    i10++;
                }
                c[] cVarArr = this.f6545e;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f6547g);
                this.f6546f += i10;
            }
            return i10;
        }

        private C1282h f(int i8) {
            if (h(i8)) {
                return d.f6539a[i8].f6536a;
            }
            int c8 = c(i8 - d.f6539a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f6545e;
                if (c8 < cVarArr.length) {
                    return cVarArr[c8].f6536a;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void g(int i8, c cVar) {
            this.f6541a.add(cVar);
            int i9 = cVar.f6538c;
            if (i8 != -1) {
                i9 -= this.f6545e[c(i8)].f6538c;
            }
            int i10 = this.f6544d;
            if (i9 > i10) {
                b();
                return;
            }
            int d8 = d((this.f6548h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f6547g + 1;
                c[] cVarArr = this.f6545e;
                if (i11 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f6546f = this.f6545e.length - 1;
                    this.f6545e = cVarArr2;
                }
                int i12 = this.f6546f;
                this.f6546f = i12 - 1;
                this.f6545e[i12] = cVar;
                this.f6547g++;
            } else {
                this.f6545e[i8 + c(i8) + d8] = cVar;
            }
            this.f6548h += i9;
        }

        private boolean h(int i8) {
            if (i8 >= 0 && i8 <= d.f6539a.length - 1) {
                return true;
            }
            return false;
        }

        private int i() {
            return this.f6542b.readByte() & 255;
        }

        private void l(int i8) {
            if (h(i8)) {
                this.f6541a.add(d.f6539a[i8]);
                return;
            }
            int c8 = c(i8 - d.f6539a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f6545e;
                if (c8 < cVarArr.length) {
                    this.f6541a.add(cVarArr[c8]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void n(int i8) {
            g(-1, new c(f(i8), j()));
        }

        private void o() {
            g(-1, new c(d.a(j()), j()));
        }

        private void p(int i8) {
            this.f6541a.add(new c(f(i8), j()));
        }

        private void q() {
            this.f6541a.add(new c(d.a(j()), j()));
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.f6541a);
            this.f6541a.clear();
            return arrayList;
        }

        C1282h j() {
            boolean z8;
            int i8 = i();
            if ((i8 & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            int m8 = m(i8, 127);
            if (z8) {
                return C1282h.y(k.f().c(this.f6542b.readByteArray(m8)));
            }
            return this.f6542b.readByteString(m8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k() {
            while (!this.f6542b.exhausted()) {
                byte readByte = this.f6542b.readByte();
                int i8 = readByte & 255;
                if (i8 != 128) {
                    if ((readByte & 128) == 128) {
                        l(m(i8, 127) - 1);
                    } else if (i8 == 64) {
                        o();
                    } else if ((readByte & 64) == 64) {
                        n(m(i8, 63) - 1);
                    } else if ((readByte & 32) == 32) {
                        int m8 = m(i8, 31);
                        this.f6544d = m8;
                        if (m8 >= 0 && m8 <= this.f6543c) {
                            a();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.f6544d);
                        }
                    } else if (i8 != 16 && i8 != 0) {
                        p(m(i8, 15) - 1);
                    } else {
                        q();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        int m(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) != 0) {
                    i9 += (i12 & 127) << i11;
                    i11 += 7;
                } else {
                    return i9 + (i12 << i11);
                }
            }
        }

        a(int i8, int i9, Z z8) {
            this.f6541a = new ArrayList();
            this.f6545e = new c[8];
            this.f6546f = r0.length - 1;
            this.f6547g = 0;
            this.f6548h = 0;
            this.f6543c = i8;
            this.f6544d = i9;
            this.f6542b = L.d(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C1279e f6549a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6550b;

        /* renamed from: c, reason: collision with root package name */
        private int f6551c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6552d;

        /* renamed from: e, reason: collision with root package name */
        int f6553e;

        /* renamed from: f, reason: collision with root package name */
        int f6554f;

        /* renamed from: g, reason: collision with root package name */
        c[] f6555g;

        /* renamed from: h, reason: collision with root package name */
        int f6556h;

        /* renamed from: i, reason: collision with root package name */
        int f6557i;

        /* renamed from: j, reason: collision with root package name */
        int f6558j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C1279e c1279e) {
            this(4096, true, c1279e);
        }

        private void a() {
            int i8 = this.f6554f;
            int i9 = this.f6558j;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    c(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f6555g, (Object) null);
            this.f6556h = this.f6555g.length - 1;
            this.f6557i = 0;
            this.f6558j = 0;
        }

        private int c(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f6555g.length;
                while (true) {
                    length--;
                    i9 = this.f6556h;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f6555g[length].f6538c;
                    i8 -= i11;
                    this.f6558j -= i11;
                    this.f6557i--;
                    i10++;
                }
                c[] cVarArr = this.f6555g;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f6557i);
                c[] cVarArr2 = this.f6555g;
                int i12 = this.f6556h;
                Arrays.fill(cVarArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.f6556h += i10;
            }
            return i10;
        }

        private void d(c cVar) {
            int i8 = cVar.f6538c;
            int i9 = this.f6554f;
            if (i8 > i9) {
                b();
                return;
            }
            c((this.f6558j + i8) - i9);
            int i10 = this.f6557i + 1;
            c[] cVarArr = this.f6555g;
            if (i10 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f6556h = this.f6555g.length - 1;
                this.f6555g = cVarArr2;
            }
            int i11 = this.f6556h;
            this.f6556h = i11 - 1;
            this.f6555g[i11] = cVar;
            this.f6557i++;
            this.f6558j += i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(int i8) {
            this.f6553e = i8;
            int min = Math.min(i8, 16384);
            int i9 = this.f6554f;
            if (i9 == min) {
                return;
            }
            if (min < i9) {
                this.f6551c = Math.min(this.f6551c, min);
            }
            this.f6552d = true;
            this.f6554f = min;
            a();
        }

        void f(C1282h c1282h) {
            if (this.f6550b && k.f().e(c1282h) < c1282h.F()) {
                C1279e c1279e = new C1279e();
                k.f().d(c1282h, c1279e);
                C1282h t8 = c1279e.t();
                h(t8.F(), 127, 128);
                this.f6549a.G(t8);
                return;
            }
            h(c1282h.F(), 127, 0);
            this.f6549a.G(c1282h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(java.util.List r14) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: L6.d.b.g(java.util.List):void");
        }

        void h(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f6549a.writeByte(i8 | i10);
                return;
            }
            this.f6549a.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f6549a.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.f6549a.writeByte(i11);
        }

        b(int i8, boolean z8, C1279e c1279e) {
            this.f6551c = Integer.MAX_VALUE;
            this.f6555g = new c[8];
            this.f6556h = r0.length - 1;
            this.f6557i = 0;
            this.f6558j = 0;
            this.f6553e = i8;
            this.f6554f = i8;
            this.f6550b = z8;
            this.f6549a = c1279e;
        }
    }

    static {
        c cVar = new c(c.f6535i, "");
        C1282h c1282h = c.f6532f;
        c cVar2 = new c(c1282h, ShareTarget.METHOD_GET);
        c cVar3 = new c(c1282h, ShareTarget.METHOD_POST);
        C1282h c1282h2 = c.f6533g;
        c cVar4 = new c(c1282h2, "/");
        c cVar5 = new c(c1282h2, "/index.html");
        C1282h c1282h3 = c.f6534h;
        c cVar6 = new c(c1282h3, "http");
        c cVar7 = new c(c1282h3, "https");
        C1282h c1282h4 = c.f6531e;
        f6539a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(c1282h4, "200"), new c(c1282h4, "204"), new c(c1282h4, "206"), new c(c1282h4, "304"), new c(c1282h4, "400"), new c(c1282h4, "404"), new c(c1282h4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f6540b = b();
    }

    static C1282h a(C1282h c1282h) {
        int F8 = c1282h.F();
        for (int i8 = 0; i8 < F8; i8++) {
            byte h8 = c1282h.h(i8);
            if (h8 >= 65 && h8 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1282h.M());
            }
        }
        return c1282h;
    }

    private static Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f6539a.length);
        int i8 = 0;
        while (true) {
            c[] cVarArr = f6539a;
            if (i8 < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i8].f6536a)) {
                    linkedHashMap.put(cVarArr[i8].f6536a, Integer.valueOf(i8));
                }
                i8++;
            } else {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
