package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import b3.C1860E;
import b3.M;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class Source implements v2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f23996a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f23997b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23998c;

    /* renamed from: d, reason: collision with root package name */
    private final CodeVerification f23999d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f24000e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24001f;

    /* renamed from: g, reason: collision with root package name */
    private final Flow f24002g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f24003h;

    /* renamed from: i, reason: collision with root package name */
    private final d f24004i;

    /* renamed from: j, reason: collision with root package name */
    private final e f24005j;

    /* renamed from: k, reason: collision with root package name */
    private final Redirect f24006k;

    /* renamed from: l, reason: collision with root package name */
    private final Status f24007l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f24008m;

    /* renamed from: n, reason: collision with root package name */
    private final SourceTypeModel f24009n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24010o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24011p;

    /* renamed from: q, reason: collision with root package name */
    private final Usage f24012q;

    /* renamed from: r, reason: collision with root package name */
    private final M f24013r;

    /* renamed from: s, reason: collision with root package name */
    private final c f24014s;

    /* renamed from: t, reason: collision with root package name */
    private final C1860E f24015t;

    /* renamed from: u, reason: collision with root package name */
    private final String f24016u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f23994v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f23995w = 8;
    public static final Parcelable.Creator<Source> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class CodeVerification implements v2.f {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f24017a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f24018b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24019b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f24020c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f24021d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f24022e = new Status("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ Status[] f24023f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24024g;

            /* renamed from: a, reason: collision with root package name */
            private final String f24025a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final Status a(String str) {
                    Object obj;
                    Iterator<E> it = Status.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((Status) obj).f24025a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (Status) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                Status[] a8 = a();
                f24023f = a8;
                f24024g = R5.b.a(a8);
                f24019b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f24025a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f24020c, f24021d, f24022e};
            }

            public static R5.a c() {
                return f24024g;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f24023f.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24025a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CodeVerification createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CodeVerification[] newArray(int i8) {
                return new CodeVerification[i8];
            }
        }

        public CodeVerification(int i8, Status status) {
            this.f24017a = i8;
            this.f24018b = status;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) obj;
            return this.f24017a == codeVerification.f24017a && this.f24018b == codeVerification.f24018b;
        }

        public int hashCode() {
            int i8 = this.f24017a * 31;
            Status status = this.f24018b;
            return i8 + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.f24017a + ", status=" + this.f24018b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f24017a);
            Status status = this.f24018b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Flow {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24026b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flow f24027c = new Flow("Redirect", 0, "redirect");

        /* renamed from: d, reason: collision with root package name */
        public static final Flow f24028d = new Flow("Receiver", 1, "receiver");

        /* renamed from: e, reason: collision with root package name */
        public static final Flow f24029e = new Flow("CodeVerification", 2, "code_verification");

        /* renamed from: f, reason: collision with root package name */
        public static final Flow f24030f = new Flow("None", 3, "none");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ Flow[] f24031g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24032h;

        /* renamed from: a, reason: collision with root package name */
        private final String f24033a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Flow a(String str) {
                Object obj;
                Iterator<E> it = Flow.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Flow) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Flow) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Flow[] a8 = a();
            f24031g = a8;
            f24032h = R5.b.a(a8);
            f24026b = new a(null);
        }

        private Flow(String str, int i8, String str2) {
            this.f24033a = str2;
        }

        private static final /* synthetic */ Flow[] a() {
            return new Flow[]{f24027c, f24028d, f24029e, f24030f};
        }

        public static R5.a c() {
            return f24032h;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f24031g.clone();
        }

        public final String b() {
            return this.f24033a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24033a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Redirect implements v2.f {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24034a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f24035b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24036c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24037b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f24038c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f24039d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f24040e = new Status("NotRequired", 2, "not_required");

            /* renamed from: f, reason: collision with root package name */
            public static final Status f24041f = new Status("Failed", 3, "failed");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ Status[] f24042g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24043h;

            /* renamed from: a, reason: collision with root package name */
            private final String f24044a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final Status a(String str) {
                    Object obj;
                    Iterator<E> it = Status.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((Status) obj).f24044a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (Status) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                Status[] a8 = a();
                f24042g = a8;
                f24043h = R5.b.a(a8);
                f24037b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f24044a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f24038c, f24039d, f24040e, f24041f};
            }

            public static R5.a c() {
                return f24043h;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f24042g.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24044a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Redirect createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Redirect[] newArray(int i8) {
                return new Redirect[i8];
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.f24034a = str;
            this.f24035b = status;
            this.f24036c = str2;
        }

        public final String b() {
            return this.f24036c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return AbstractC3159y.d(this.f24034a, redirect.f24034a) && this.f24035b == redirect.f24035b && AbstractC3159y.d(this.f24036c, redirect.f24036c);
        }

        public int hashCode() {
            String str = this.f24034a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.f24035b;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.f24036c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.f24034a + ", status=" + this.f24035b + ", url=" + this.f24036c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24034a);
            Status status = this.f24035b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.f24036c);
        }

        public final String x() {
            return this.f24034a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24045b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f24046c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f24047d = new Status("Chargeable", 1, "chargeable");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f24048e = new Status("Consumed", 2, "consumed");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f24049f = new Status("Failed", 3, "failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f24050g = new Status("Pending", 4, "pending");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f24051h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24052i;

        /* renamed from: a, reason: collision with root package name */
        private final String f24053a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Status) obj).f24053a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f24051h = a8;
            f24052i = R5.b.a(a8);
            f24045b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f24053a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f24046c, f24047d, f24048e, f24049f, f24050g};
        }

        public static R5.a c() {
            return f24052i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f24051h.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24053a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24054b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f24055c = new Usage("Reusable", 0, "reusable");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f24056d = new Usage("SingleUse", 1, "single_use");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f24057e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24058f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24059a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Usage a(String str) {
                Object obj;
                Iterator<E> it = Usage.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Usage) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Usage) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Usage[] a8 = a();
            f24057e = a8;
            f24058f = R5.b.a(a8);
            f24054b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f24059a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f24055c, f24056d};
        }

        public static R5.a c() {
            return f24058f;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f24057e.clone();
        }

        public final String b() {
            return this.f24059a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24059a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final String a(String str) {
            String str2;
            if (str == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -284840886:
                    str.equals(EnvironmentCompat.MEDIA_UNKNOWN);
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return str2;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Source createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Status status;
            LinkedHashMap linkedHashMap;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Flow valueOf4 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i8 = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            d createFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            e createFromParcel3 = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            Redirect createFromParcel4 = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status valueOf5 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                status = valueOf5;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i8 != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i8++;
                    readInt = readInt;
                    valueOf5 = valueOf5;
                }
                status = valueOf5;
                linkedHashMap = linkedHashMap2;
            }
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : M.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C1860E.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Source[] newArray(int i8) {
            return new Source[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24060a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24061b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24062c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24063d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24064e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24065f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24066g;

        /* renamed from: h, reason: collision with root package name */
        private final String f24067h;

        /* renamed from: i, reason: collision with root package name */
        private final String f24068i;

        /* renamed from: j, reason: collision with root package name */
        private final String f24069j;

        /* renamed from: k, reason: collision with root package name */
        private final String f24070k;

        /* renamed from: l, reason: collision with root package name */
        private final String f24071l;

        /* renamed from: m, reason: collision with root package name */
        private final String f24072m;

        /* renamed from: n, reason: collision with root package name */
        private final String f24073n;

        /* renamed from: o, reason: collision with root package name */
        private final String f24074o;

        /* renamed from: p, reason: collision with root package name */
        private final String f24075p;

        /* renamed from: q, reason: collision with root package name */
        private final Set f24076q;

        /* renamed from: r, reason: collision with root package name */
        private final Set f24077r;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashSet.add(parcel.readString());
                    i8++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    linkedHashSet2.add(parcel.readString());
                    i9++;
                    readInt2 = readInt2;
                }
                return new c(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set paymentMethodCategories, Set customPaymentMethods) {
            AbstractC3159y.i(paymentMethodCategories, "paymentMethodCategories");
            AbstractC3159y.i(customPaymentMethods, "customPaymentMethods");
            this.f24060a = str;
            this.f24061b = str2;
            this.f24062c = str3;
            this.f24063d = str4;
            this.f24064e = str5;
            this.f24065f = str6;
            this.f24066g = str7;
            this.f24067h = str8;
            this.f24068i = str9;
            this.f24069j = str10;
            this.f24070k = str11;
            this.f24071l = str12;
            this.f24072m = str13;
            this.f24073n = str14;
            this.f24074o = str15;
            this.f24075p = str16;
            this.f24076q = paymentMethodCategories;
            this.f24077r = customPaymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f24060a, cVar.f24060a) && AbstractC3159y.d(this.f24061b, cVar.f24061b) && AbstractC3159y.d(this.f24062c, cVar.f24062c) && AbstractC3159y.d(this.f24063d, cVar.f24063d) && AbstractC3159y.d(this.f24064e, cVar.f24064e) && AbstractC3159y.d(this.f24065f, cVar.f24065f) && AbstractC3159y.d(this.f24066g, cVar.f24066g) && AbstractC3159y.d(this.f24067h, cVar.f24067h) && AbstractC3159y.d(this.f24068i, cVar.f24068i) && AbstractC3159y.d(this.f24069j, cVar.f24069j) && AbstractC3159y.d(this.f24070k, cVar.f24070k) && AbstractC3159y.d(this.f24071l, cVar.f24071l) && AbstractC3159y.d(this.f24072m, cVar.f24072m) && AbstractC3159y.d(this.f24073n, cVar.f24073n) && AbstractC3159y.d(this.f24074o, cVar.f24074o) && AbstractC3159y.d(this.f24075p, cVar.f24075p) && AbstractC3159y.d(this.f24076q, cVar.f24076q) && AbstractC3159y.d(this.f24077r, cVar.f24077r);
        }

        public int hashCode() {
            String str = this.f24060a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24061b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24062c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24063d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24064e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24065f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f24066g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f24067h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f24068i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f24069j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f24070k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f24071l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f24072m;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f24073n;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f24074o;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f24075p;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.f24076q.hashCode()) * 31) + this.f24077r.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.f24060a + ", lastName=" + this.f24061b + ", purchaseCountry=" + this.f24062c + ", clientToken=" + this.f24063d + ", payNowAssetUrlsDescriptive=" + this.f24064e + ", payNowAssetUrlsStandard=" + this.f24065f + ", payNowName=" + this.f24066g + ", payNowRedirectUrl=" + this.f24067h + ", payLaterAssetUrlsDescriptive=" + this.f24068i + ", payLaterAssetUrlsStandard=" + this.f24069j + ", payLaterName=" + this.f24070k + ", payLaterRedirectUrl=" + this.f24071l + ", payOverTimeAssetUrlsDescriptive=" + this.f24072m + ", payOverTimeAssetUrlsStandard=" + this.f24073n + ", payOverTimeName=" + this.f24074o + ", payOverTimeRedirectUrl=" + this.f24075p + ", paymentMethodCategories=" + this.f24076q + ", customPaymentMethods=" + this.f24077r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24060a);
            out.writeString(this.f24061b);
            out.writeString(this.f24062c);
            out.writeString(this.f24063d);
            out.writeString(this.f24064e);
            out.writeString(this.f24065f);
            out.writeString(this.f24066g);
            out.writeString(this.f24067h);
            out.writeString(this.f24068i);
            out.writeString(this.f24069j);
            out.writeString(this.f24070k);
            out.writeString(this.f24071l);
            out.writeString(this.f24072m);
            out.writeString(this.f24073n);
            out.writeString(this.f24074o);
            out.writeString(this.f24075p);
            Set set = this.f24076q;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            Set set2 = this.f24077r;
            out.writeInt(set2.size());
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                out.writeString((String) it2.next());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements v2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24078a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24079b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24080c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24081d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f24082e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24083f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24084g;

        /* renamed from: h, reason: collision with root package name */
        private final String f24085h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? com.stripe.android.model.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a aVar, String str, String str2, String str3, com.stripe.android.model.a aVar2, String str4, String str5, String str6) {
            this.f24078a = aVar;
            this.f24079b = str;
            this.f24080c = str2;
            this.f24081d = str3;
            this.f24082e = aVar2;
            this.f24083f = str4;
            this.f24084g = str5;
            this.f24085h = str6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f24078a, dVar.f24078a) && AbstractC3159y.d(this.f24079b, dVar.f24079b) && AbstractC3159y.d(this.f24080c, dVar.f24080c) && AbstractC3159y.d(this.f24081d, dVar.f24081d) && AbstractC3159y.d(this.f24082e, dVar.f24082e) && AbstractC3159y.d(this.f24083f, dVar.f24083f) && AbstractC3159y.d(this.f24084g, dVar.f24084g) && AbstractC3159y.d(this.f24085h, dVar.f24085h);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f24078a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f24079b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24080c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24081d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            com.stripe.android.model.a aVar2 = this.f24082e;
            int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str4 = this.f24083f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24084g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24085h;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.f24078a + ", email=" + this.f24079b + ", name=" + this.f24080c + ", phone=" + this.f24081d + ", verifiedAddress=" + this.f24082e + ", verifiedEmail=" + this.f24083f + ", verifiedName=" + this.f24084g + ", verifiedPhone=" + this.f24085h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f24078a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24079b);
            out.writeString(this.f24080c);
            out.writeString(this.f24081d);
            com.stripe.android.model.a aVar2 = this.f24082e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f24083f);
            out.writeString(this.f24084g);
            out.writeString(this.f24085h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24086a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24087b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24088c;

        /* renamed from: d, reason: collision with root package name */
        private final long f24089d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(String str, long j8, long j9, long j10) {
            this.f24086a = str;
            this.f24087b = j8;
            this.f24088c = j9;
            this.f24089d = j10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f24086a, eVar.f24086a) && this.f24087b == eVar.f24087b && this.f24088c == eVar.f24088c && this.f24089d == eVar.f24089d;
        }

        public int hashCode() {
            String str = this.f24086a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + androidx.collection.a.a(this.f24087b)) * 31) + androidx.collection.a.a(this.f24088c)) * 31) + androidx.collection.a.a(this.f24089d);
        }

        public String toString() {
            return "Receiver(address=" + this.f24086a + ", amountCharged=" + this.f24087b + ", amountReceived=" + this.f24088c + ", amountReturned=" + this.f24089d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24086a);
            out.writeLong(this.f24087b);
            out.writeLong(this.f24088c);
            out.writeLong(this.f24089d);
        }
    }

    public Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, M m8, c cVar, C1860E c1860e, String str4) {
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(typeRaw, "typeRaw");
        this.f23996a = str;
        this.f23997b = l8;
        this.f23998c = str2;
        this.f23999d = codeVerification;
        this.f24000e = l9;
        this.f24001f = str3;
        this.f24002g = flow;
        this.f24003h = bool;
        this.f24004i = dVar;
        this.f24005j = eVar;
        this.f24006k = redirect;
        this.f24007l = status;
        this.f24008m = map;
        this.f24009n = sourceTypeModel;
        this.f24010o = type;
        this.f24011p = typeRaw;
        this.f24012q = usage;
        this.f24013r = m8;
        this.f24014s = cVar;
        this.f24015t = c1860e;
        this.f24016u = str4;
    }

    public final Flow b() {
        return this.f24002g;
    }

    public final Redirect c() {
        return this.f24006k;
    }

    public final String d() {
        return this.f23998c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SourceTypeModel e() {
        return this.f24009n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return AbstractC3159y.d(this.f23996a, source.f23996a) && AbstractC3159y.d(this.f23997b, source.f23997b) && AbstractC3159y.d(this.f23998c, source.f23998c) && AbstractC3159y.d(this.f23999d, source.f23999d) && AbstractC3159y.d(this.f24000e, source.f24000e) && AbstractC3159y.d(this.f24001f, source.f24001f) && this.f24002g == source.f24002g && AbstractC3159y.d(this.f24003h, source.f24003h) && AbstractC3159y.d(this.f24004i, source.f24004i) && AbstractC3159y.d(this.f24005j, source.f24005j) && AbstractC3159y.d(this.f24006k, source.f24006k) && this.f24007l == source.f24007l && AbstractC3159y.d(this.f24008m, source.f24008m) && AbstractC3159y.d(this.f24009n, source.f24009n) && AbstractC3159y.d(this.f24010o, source.f24010o) && AbstractC3159y.d(this.f24011p, source.f24011p) && this.f24012q == source.f24012q && AbstractC3159y.d(this.f24013r, source.f24013r) && AbstractC3159y.d(this.f24014s, source.f24014s) && AbstractC3159y.d(this.f24015t, source.f24015t) && AbstractC3159y.d(this.f24016u, source.f24016u);
    }

    public String getId() {
        return this.f23996a;
    }

    public int hashCode() {
        String str = this.f23996a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f23997b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.f23998c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.f23999d;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l9 = this.f24000e;
        int hashCode5 = (hashCode4 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str3 = this.f24001f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.f24002g;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.f24003h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.f24004i;
        int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f24005j;
        int hashCode10 = (hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Redirect redirect = this.f24006k;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.f24007l;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map map = this.f24008m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.f24009n;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.f24010o.hashCode()) * 31) + this.f24011p.hashCode()) * 31;
        Usage usage = this.f24012q;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        M m8 = this.f24013r;
        int hashCode16 = (hashCode15 + (m8 == null ? 0 : m8.hashCode())) * 31;
        c cVar = this.f24014s;
        int hashCode17 = (hashCode16 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C1860E c1860e = this.f24015t;
        int hashCode18 = (hashCode17 + (c1860e == null ? 0 : c1860e.hashCode())) * 31;
        String str4 = this.f24016u;
        return hashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.f23996a + ", amount=" + this.f23997b + ", clientSecret=" + this.f23998c + ", codeVerification=" + this.f23999d + ", created=" + this.f24000e + ", currency=" + this.f24001f + ", flow=" + this.f24002g + ", isLiveMode=" + this.f24003h + ", owner=" + this.f24004i + ", receiver=" + this.f24005j + ", redirect=" + this.f24006k + ", status=" + this.f24007l + ", sourceTypeData=" + this.f24008m + ", sourceTypeModel=" + this.f24009n + ", type=" + this.f24010o + ", typeRaw=" + this.f24011p + ", usage=" + this.f24012q + ", _weChat=" + this.f24013r + ", _klarna=" + this.f24014s + ", sourceOrder=" + this.f24015t + ", statementDescriptor=" + this.f24016u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f23996a);
        Long l8 = this.f23997b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f23998c);
        CodeVerification codeVerification = this.f23999d;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i8);
        }
        Long l9 = this.f24000e;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
        out.writeString(this.f24001f);
        Flow flow = this.f24002g;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.f24003h;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d dVar = this.f24004i;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        e eVar = this.f24005j;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Redirect redirect = this.f24006k;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i8);
        }
        Status status = this.f24007l;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map map = this.f24008m;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        out.writeParcelable(this.f24009n, i8);
        out.writeString(this.f24010o);
        out.writeString(this.f24011p);
        Usage usage = this.f24012q;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        M m8 = this.f24013r;
        if (m8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            m8.writeToParcel(out, i8);
        }
        c cVar = this.f24014s;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C1860E c1860e = this.f24015t;
        if (c1860e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1860e.writeToParcel(out, i8);
        }
        out.writeString(this.f24016u);
    }

    public /* synthetic */ Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, M m8, c cVar, C1860E c1860e, String str6, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? null : l8, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : codeVerification, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? null : flow, (i8 & 128) != 0 ? null : bool, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : eVar, (i8 & 1024) != 0 ? null : redirect, (i8 & 2048) != 0 ? null : status, (i8 & 4096) != 0 ? null : map, (i8 & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i8) != 0 ? null : usage, (131072 & i8) != 0 ? null : m8, (262144 & i8) != 0 ? null : cVar, (524288 & i8) != 0 ? null : c1860e, (i8 & 1048576) != 0 ? null : str6);
    }
}
