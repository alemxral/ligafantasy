package R4;

import E4.h;
import E4.j;
import N4.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.RecyclerView;
import g6.n;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final J4.g f8738a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f8739b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f8740c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f8741d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f8742e;

    /* renamed from: f, reason: collision with root package name */
    private final CheckBox f8743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView, J4.g listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f8738a = listener;
        View findViewById = itemView.findViewById(E4.e.f2153s);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_icon_file_item)");
        this.f8739b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(E4.e.f2026B1);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_name_file_item)");
        TextView textView = (TextView) findViewById2;
        this.f8740c = textView;
        View findViewById3 = itemView.findViewById(E4.e.f2043H0);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_date_file_item)");
        TextView textView2 = (TextView) findViewById3;
        this.f8741d = textView2;
        View findViewById4 = itemView.findViewById(E4.e.f2074R1);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_size_file_item)");
        TextView textView3 = (TextView) findViewById4;
        this.f8742e = textView3;
        View findViewById5 = itemView.findViewById(E4.e.f2123i);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.cb_checked_file_item)");
        this.f8743f = (CheckBox) findViewById5;
        j.a aVar = j.f2272g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e this$0, Object file, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f8738a.a(file, absoluteAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(e this$0, Object file, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f8738a.b(file, absoluteAdapterPosition);
            return true;
        }
        return true;
    }

    public final void c(final Object file, boolean z8, boolean z9) {
        long j8;
        String str;
        String str2;
        boolean z10;
        Drawable drawable;
        AbstractC3159y.i(file, "file");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: R4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.d(e.this, file, view);
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: R4.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean e8;
                e8 = e.e(e.this, file, view);
                return e8;
            }
        });
        if (file instanceof File) {
            File file2 = (File) file;
            str = file2.getName();
            str2 = new N4.e().g(file2.lastModified());
            z10 = file2.isDirectory();
            j8 = file2.length();
        } else if (file instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) file;
            str = documentFile.getName();
            str2 = new N4.e().g(documentFile.lastModified());
            z10 = documentFile.isDirectory();
            j8 = documentFile.length();
        } else {
            j8 = 0;
            str = null;
            str2 = null;
            z10 = false;
        }
        if (str != null) {
            this.f8740c.setText(str);
            if (z10) {
                this.f8742e.setText(j.f2272g.g().getString(h.f2256p, new N4.e().b(file)));
                drawable = AppCompatResources.getDrawable(this.f8740c.getContext(), E4.d.f2004d);
            } else {
                this.f8742e.setText(new N4.g().c(j8));
                if (n.r(str, ".apk", false, 2, null)) {
                    t tVar = t.f7257a;
                    if (tVar.a().get(str) != null) {
                        drawable = (Drawable) tVar.a().get(str);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f8740c.getContext(), E4.d.f2001a);
                    }
                } else if (!n.r(str, ".xapk", false, 2, null) && !n.r(str, ".apks", false, 2, null)) {
                    if (n.r(str, ".zip", false, 2, null)) {
                        drawable = AppCompatResources.getDrawable(this.f8740c.getContext(), E4.d.f2018r);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f8740c.getContext(), E4.d.f2003c);
                    }
                } else {
                    drawable = AppCompatResources.getDrawable(this.f8740c.getContext(), E4.d.f2017q);
                }
            }
            this.f8739b.setImageDrawable(drawable);
        }
        if (str2 != null) {
            this.f8741d.setText(str2);
        }
        if (z8) {
            this.f8743f.setVisibility(0);
            this.f8742e.setVisibility(4);
            this.f8743f.setChecked(z9);
        } else {
            this.f8743f.setVisibility(8);
            this.f8742e.setVisibility(0);
        }
    }
}
