package androidx.compose.foundation.interaction;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import i6.M;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends l implements n {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, d dVar) {
        super(2, dVar);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final ArrayList arrayList = new ArrayList();
            InterfaceC3358f interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1.1
                @Override // l6.InterfaceC3359g
                public final Object emit(Interaction interaction, d dVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(kotlin.coroutines.jvm.internal.b.a(!arrayList.isEmpty()));
                    return I.f6474a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
