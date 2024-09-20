package D5;

import D5.f;
import L5.I;
import L5.t;
import X5.n;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.J0;

/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f1852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f1853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1854c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f1855a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f1856b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, f fVar, P5.d dVar) {
            super(2, dVar);
            this.f1855a = bitmap;
            this.f1856b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f1855a, this.f1856b, dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new a(this.f1855a, this.f1856b, (P5.d) obj2).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            t.b(obj);
            Bitmap bitmap = this.f1855a;
            if (bitmap != null) {
                f fVar = this.f1856b;
                ImageView imageView = fVar.f1842b;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                ImageView imageView2 = fVar.f1842b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
            f fVar2 = this.f1856b;
            f.a aVar = f.f1839l;
            fVar2.getClass();
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(fVar2.f1841a);
            ImageView imageView3 = fVar2.f1842b;
            if (imageView3 != null && imageView3.getVisibility() == 0) {
                ImageView imageView4 = fVar2.f1842b;
                if (imageView4 != null) {
                    Button button = fVar2.f1843c;
                    if (button != null) {
                        constraintSet.connect(button.getId(), 4, imageView4.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f1841a);
                }
            } else {
                TextView textView = fVar2.f1847g;
                if (textView != null) {
                    Button button2 = fVar2.f1843c;
                    if (button2 != null) {
                        constraintSet.connect(button2.getId(), 4, textView.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f1841a);
                }
            }
            return I.f6474a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Bitmap bitmap, f fVar, P5.d dVar) {
        super(2, dVar);
        this.f1853b = bitmap;
        this.f1854c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new g(this.f1853b, this.f1854c, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new g(this.f1853b, this.f1854c, (P5.d) obj2).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f1852a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            J0 G8 = C2812b0.c().G();
            a aVar = new a(this.f1853b, this.f1854c, null);
            this.f1852a = 1;
            if (AbstractC2825i.g(G8, aVar, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
