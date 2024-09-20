package o3;

import L5.InterfaceC1223g;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.InterfaceC3153s;

/* loaded from: classes4.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36364a = a.f36365a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36365a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0838a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f36366a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f36367b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0838a(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f36366a = appCompatActivity;
                this.f36367b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3528b invoke() {
                return new C3528b(new FinancialConnectionsSheetForDataLauncher(this.f36366a, new b(this.f36367b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f36368a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f36369b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f36368a = appCompatActivity;
                this.f36369b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3528b invoke() {
                return new C3528b(new FinancialConnectionsSheetForInstantDebitsLauncher(this.f36368a, this.f36369b));
            }
        }

        private a() {
        }

        public static /* synthetic */ c b(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new C0838a(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C3527a.f36362a;
            }
            return aVar.a(appCompatActivity, function1, function0, dVar);
        }

        public static /* synthetic */ c d(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new b(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C3527a.f36362a;
            }
            return aVar.c(appCompatActivity, function1, function0, dVar);
        }

        public final c a(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(onComplete, "onComplete");
            AbstractC3159y.i(provider, "provider");
            AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }

        public final c c(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(onComplete, "onComplete");
            AbstractC3159y.i(provider, "provider");
            AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements FinancialConnectionsSheetResultCallback, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f36370a;

        b(Function1 function) {
            AbstractC3159y.i(function, "function");
            this.f36370a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof FinancialConnectionsSheetResultCallback) || !(obj instanceof InterfaceC3153s)) {
                return false;
            }
            return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return this.f36370a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a(String str, String str2, String str3);
}
