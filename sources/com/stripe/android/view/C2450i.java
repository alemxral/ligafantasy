package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import b3.C1867b;
import j2.AbstractC3053E;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2450i extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final S0 f27719a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27720b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f27721c;

    /* renamed from: d, reason: collision with root package name */
    private C1867b f27722d;

    /* renamed from: e, reason: collision with root package name */
    private int f27723e;

    /* renamed from: com.stripe.android.view.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final G2.g f27724a;

        /* renamed from: b, reason: collision with root package name */
        private final S0 f27725b;

        /* renamed from: c, reason: collision with root package name */
        private final Resources f27726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G2.g viewBinding, S0 themeConfig) {
            super(viewBinding.getRoot());
            AbstractC3159y.i(viewBinding, "viewBinding");
            AbstractC3159y.i(themeConfig, "themeConfig");
            this.f27724a = viewBinding;
            this.f27725b = themeConfig;
            Resources resources = this.itemView.getResources();
            AbstractC3159y.h(resources, "getResources(...)");
            this.f27726c = resources;
        }

        public final void a(boolean z8) {
            int i8;
            this.f27724a.f3116d.setTextColor(this.f27725b.c(z8));
            ImageViewCompat.setImageTintList(this.f27724a.f3114b, ColorStateList.valueOf(this.f27725b.d(z8)));
            AppCompatImageView checkIcon = this.f27724a.f3114b;
            AbstractC3159y.h(checkIcon, "checkIcon");
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            checkIcon.setVisibility(i8);
        }

        public final void b(r bank, boolean z8) {
            String string;
            AbstractC3159y.i(bank, "bank");
            AppCompatTextView appCompatTextView = this.f27724a.f3116d;
            if (z8) {
                string = bank.b();
            } else {
                string = this.f27726c.getString(AbstractC3053E.f32885p0, bank.b());
            }
            appCompatTextView.setText(string);
            Integer a8 = bank.a();
            if (a8 != null) {
                this.f27724a.f3115c.setImageResource(a8.intValue());
            }
        }
    }

    public C2450i(S0 themeConfig, List items, Function1 itemSelectedCallback) {
        AbstractC3159y.i(themeConfig, "themeConfig");
        AbstractC3159y.i(items, "items");
        AbstractC3159y.i(itemSelectedCallback, "itemSelectedCallback");
        this.f27719a = themeConfig;
        this.f27720b = items;
        this.f27721c = itemSelectedCallback;
        this.f27723e = -1;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2450i this$0, RecyclerView.ViewHolder holder, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(holder, "$holder");
        this$0.f(holder.getBindingAdapterPosition());
    }

    public final int b() {
        return this.f27723e;
    }

    public final void c(int i8) {
        notifyItemChanged(i8);
    }

    public final void e(C1867b c1867b) {
        this.f27722d = c1867b;
    }

    public final void f(int i8) {
        int i9 = this.f27723e;
        if (i8 != i9) {
            if (i9 != -1) {
                notifyItemChanged(i9);
            }
            notifyItemChanged(i8);
            this.f27721c.invoke(Integer.valueOf(i8));
        }
        this.f27723e = i8;
    }

    public final void g(int i8) {
        f(i8);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27720b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i8) {
        boolean z8;
        AbstractC3159y.i(holder, "holder");
        r rVar = (r) this.f27720b.get(i8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2450i.d(C2450i.this, holder, view);
            }
        });
        a aVar = (a) holder;
        boolean z9 = true;
        if (i8 == this.f27723e) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.a(z8);
        C1867b c1867b = this.f27722d;
        if (c1867b != null) {
            z9 = c1867b.b(rVar);
        }
        aVar.b(rVar, z9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        G2.g c8 = G2.g.c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC3159y.h(c8, "inflate(...)");
        return new a(c8, this.f27719a);
    }
}
