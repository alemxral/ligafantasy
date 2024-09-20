package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class Q extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.v f36634a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36635b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36636c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36637d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36638e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36639f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f36640g;

    /* renamed from: h, reason: collision with root package name */
    private Context f36641h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(View itemView, W4.v vVar) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        this.f36634a = vVar;
        View findViewById = itemView.findViewById(R.id.tv_title);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_title)");
        this.f36635b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_msg);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_msg)");
        this.f36636c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_action_01);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_action_01)");
        this.f36637d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_action_02);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_action_02)");
        this.f36638e = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_date);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_date)");
        this.f36639f = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.iv_delete_notification);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.iv_delete_notification)");
        this.f36640g = (ImageView) findViewById6;
        Context context = itemView.getContext();
        AbstractC3159y.h(context, "itemView.context");
        this.f36641h = context;
        this.f36637d.setOnClickListener(new View.OnClickListener() { // from class: o5.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.d(Q.this, view);
            }
        });
        this.f36638e.setOnClickListener(new View.OnClickListener() { // from class: o5.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.e(Q.this, view);
            }
        });
        this.f36640g.setOnClickListener(new View.OnClickListener() { // from class: o5.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.f(Q.this, view);
            }
        });
        TextView textView = this.f36635b;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        this.f36636c.setTypeface(aVar.u());
        this.f36639f.setTypeface(aVar.u());
        this.f36637d.setTypeface(aVar.t());
        this.f36638e.setTypeface(aVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Q this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36634a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36634a.c(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Q this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36634a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36634a.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Q this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36634a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36634a.b(bindingAdapterPosition);
        }
    }

    private final String g(String str) {
        switch (str.hashCode()) {
            case -1569440520:
                if (str.equals("positive_apps")) {
                    String string = this.f36641h.getString(R.string.title_positive_apps);
                    AbstractC3159y.h(string, "context.getString(R.string.title_positive_apps)");
                    return string;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    String string2 = this.f36641h.getString(R.string.option_button_delete);
                    AbstractC3159y.h(string2, "context.getString(R.string.option_button_delete)");
                    return string2;
                }
                break;
            case -504325460:
                if (str.equals("open_app")) {
                    String string3 = this.f36641h.getString(R.string.open);
                    AbstractC3159y.h(string3, "context.getString(R.string.open)");
                    return string3;
                }
                break;
            case -262767644:
                if (str.equals("upcoming_release")) {
                    String string4 = this.f36641h.getString(R.string.action_app_details_settings);
                    AbstractC3159y.h(string4, "context.getString(R.stri…ion_app_details_settings)");
                    return string4;
                }
                break;
            case -234430262:
                if (str.equals("updates")) {
                    String string5 = this.f36641h.getString(R.string.updates);
                    AbstractC3159y.h(string5, "context.getString(R.string.updates)");
                    return string5;
                }
                break;
            case 212443764:
                if (str.equals("no_action")) {
                    return "";
                }
                break;
            case 1085191854:
                if (str.equals("update_uptodown")) {
                    String string6 = this.f36641h.getString(R.string.action_update);
                    AbstractC3159y.h(string6, "context.getString(R.string.action_update)");
                    return string6;
                }
                break;
            case 1117687366:
                if (str.equals("preregister")) {
                    String string7 = this.f36641h.getString(R.string.action_app_details_settings);
                    AbstractC3159y.h(string7, "context.getString(R.stri…ion_app_details_settings)");
                    return string7;
                }
                break;
            case 1312704747:
                if (str.equals("downloads")) {
                    String string8 = this.f36641h.getString(R.string.downloads_title);
                    AbstractC3159y.h(string8, "context.getString(R.string.downloads_title)");
                    return string8;
                }
                break;
            case 1957569947:
                if (str.equals("install")) {
                    String string9 = this.f36641h.getString(R.string.option_button_install);
                    AbstractC3159y.h(string9, "context.getString(R.string.option_button_install)");
                    return string9;
                }
                break;
        }
        throw new Exception("NotificationRegistryViewHolder, Unsupported action: " + str);
    }

    public final void h(X4.y notificationRegistry) {
        AbstractC3159y.i(notificationRegistry, "notificationRegistry");
        this.f36635b.setText(notificationRegistry.f());
        this.f36636c.setText(notificationRegistry.d());
        String e8 = notificationRegistry.e();
        AbstractC3159y.f(e8);
        Date date = new Date(Long.parseLong(e8));
        this.f36639f.setText(DateFormat.getDateTimeInstance().format(Long.valueOf(date.getTime())));
        String a8 = notificationRegistry.a();
        this.f36637d.setVisibility(8);
        this.f36638e.setVisibility(8);
        if (a8 != null && !g6.n.H(a8, "no_action", false, 2, null)) {
            List s02 = g6.n.s0(a8, new String[]{";"}, false, 0, 6, null);
            int size = s02.size();
            if (size != 1) {
                if (size == 2) {
                    this.f36637d.setText(g((String) s02.get(0)));
                    this.f36638e.setText(g((String) s02.get(1)));
                    this.f36637d.setVisibility(0);
                    this.f36638e.setVisibility(0);
                    return;
                }
                return;
            }
            this.f36637d.setText(g((String) s02.get(0)));
            this.f36637d.setVisibility(0);
        }
    }
}
