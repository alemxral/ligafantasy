package e4;

import M5.AbstractC1246t;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: e4.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2614i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f30688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.i0$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f30689a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f30691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f30692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ UriHandler f30693e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e4.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0735a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f30694a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AnnotatedString f30695b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UriHandler f30696c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0735a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler) {
                super(1);
                this.f30694a = mutableState;
                this.f30695b = annotatedString;
                this.f30696c = uriHandler;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5584invokek4lQ0M(((Offset) obj).m2745unboximpl());
                return L5.I.f6474a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5584invokek4lQ0M(long j8) {
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f30694a.getValue();
                if (textLayoutResult != null) {
                    AnnotatedString annotatedString = this.f30695b;
                    UriHandler uriHandler = this.f30696c;
                    int m4664getOffsetForPositionk4lQ0M = textLayoutResult.m4664getOffsetForPositionk4lQ0M(j8);
                    AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1246t.o0(annotatedString.getStringAnnotations(m4664getOffsetForPositionk4lQ0M, m4664getOffsetForPositionk4lQ0M));
                    if (range != null && AbstractC3159y.d(range.getTag(), "URL")) {
                        uriHandler.openUri((String) range.getItem());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler, P5.d dVar) {
            super(2, dVar);
            this.f30691c = mutableState;
            this.f30692d = annotatedString;
            this.f30693e = uriHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f30691c, this.f30692d, this.f30693e, dVar);
            aVar.f30690b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(PointerInputScope pointerInputScope, P5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f30689a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f30690b;
                C0735a c0735a = new C0735a(this.f30691c, this.f30692d, this.f30693e);
                this.f30689a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, c0735a, this, 7, null) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.i0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f30697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState) {
            super(1);
            this.f30697a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return L5.I.f6474a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3159y.i(it, "it");
            this.f30697a.setValue(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.i0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f30699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f30701d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30702e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f30703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Modifier modifier, long j8, TextStyle textStyle, int i8, int i9) {
            super(2);
            this.f30698a = str;
            this.f30699b = modifier;
            this.f30700c = j8;
            this.f30701d = textStyle;
            this.f30702e = i8;
            this.f30703f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2614i0.a(this.f30698a, this.f30699b, this.f30700c, this.f30701d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30702e | 1), this.f30703f);
        }
    }

    static {
        Pattern compile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        AbstractC3159y.h(compile, "compile(...)");
        f30688a = compile;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144 A[LOOP:0: B:61:0x013e->B:63:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r36, androidx.compose.ui.Modifier r37, long r38, androidx.compose.ui.text.TextStyle r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC2614i0.a(java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List b(String str) {
        Matcher matcher = f30688a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end();
            String substring = str.substring(start, end);
            AbstractC3159y.h(substring, "substring(...)");
            if (!g6.n.C(substring, "http://", false, 2, null) && !g6.n.C(substring, "https://", false, 2, null)) {
                substring = "https://" + substring;
            }
            arrayList.add(new C2631r0(substring, start, end));
        }
        return arrayList;
    }
}
