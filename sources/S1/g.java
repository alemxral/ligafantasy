package S1;

import j$.util.DesugarTimeZone;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: d, reason: collision with root package name */
    public static TimeZone f8954d;

    /* renamed from: a, reason: collision with root package name */
    static TreeMap f8951a = new TreeMap(new a());

    /* renamed from: b, reason: collision with root package name */
    static TreeMap f8952b = new TreeMap(new a());

    /* renamed from: c, reason: collision with root package name */
    private static HashSet f8953c = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    static TreeMap f8955e = new TreeMap();

    /* loaded from: classes4.dex */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        f8953c.add("à");
        f8953c.add("at");
        f8953c.add("MEZ");
        f8953c.add("Uhr");
        f8953c.add(com.mbridge.msdk.c.h.f18004a);
        f8953c.add("pm");
        f8953c.add("PM");
        f8953c.add("am");
        f8953c.add("AM");
        f8953c.add("min");
        f8953c.add("um");
        f8953c.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            f8955e.put(str, DesugarTimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i8 = 0; i8 < months.length; i8++) {
                    if (months[i8].length() != 0) {
                        d(f8951a, months[i8], Integer.valueOf(i8));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i9 = 0; i9 < shortMonths.length; i9++) {
                    String str2 = shortMonths[i9];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        d(f8951a, shortMonths[i9], Integer.valueOf(i9));
                        d(f8951a, shortMonths[i9].replace(".", ""), Integer.valueOf(i9));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i10 = 0; i10 < weekdays.length; i10++) {
                    String str3 = weekdays[i10];
                    if (str3.length() != 0) {
                        d(f8952b, str3, Integer.valueOf(i10));
                        d(f8952b, str3.replace(".", ""), Integer.valueOf(i10));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i11 = 0; i11 < shortWeekdays.length; i11++) {
                    String str4 = shortWeekdays[i11];
                    if (str4.length() != 0) {
                        d(f8952b, str4, Integer.valueOf(i11));
                        d(f8952b, str4.replace(".", ""), Integer.valueOf(i11));
                    }
                }
            }
        }
    }

    private static Date a(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return b(stringTokenizer, calendar, str);
    }

    private static Date b(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        calendar.set(11, Integer.parseInt(k(stringTokenizer, str, calendar)));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k8 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k8 == null) {
            return calendar.getTime();
        }
        calendar.set(12, Integer.parseInt(k8));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k9 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k9 == null) {
            return calendar.getTime();
        }
        calendar.set(13, Integer.parseInt(k9));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String k10 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (k10 == null) {
            return calendar.getTime();
        }
        String k11 = k(stringTokenizer, k10, calendar);
        if (k11.length() == 4 && Character.isDigit(k11.charAt(0))) {
            calendar.set(1, h(k11));
        }
        return calendar.getTime();
    }

    public static Date c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() == 4 && Character.isDigit(nextToken.charAt(0))) {
                return g(stringTokenizer, nextToken);
            }
            if (f8952b.containsKey(nextToken)) {
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                nextToken = stringTokenizer.nextToken();
            }
            if (f8951a.containsKey(nextToken)) {
                return f(stringTokenizer, nextToken);
            }
            if (!Character.isDigit(nextToken.charAt(0))) {
                return null;
            }
            return e(stringTokenizer, nextToken);
        }
        throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
    }

    private static void d(TreeMap treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    private static Date e(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i8 = i();
        i8.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        i8.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        i8.set(1, h(stringTokenizer.nextToken()));
        return a(stringTokenizer, i8, null);
    }

    private static Date f(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i8 = i();
        Integer num = (Integer) f8951a.get(str);
        if (num != null) {
            i8.set(2, num.intValue());
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            i8.set(5, Integer.parseInt(stringTokenizer.nextToken()));
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            String nextToken = stringTokenizer.nextToken();
            if (Character.isLetter(nextToken.charAt(0))) {
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                nextToken = stringTokenizer.nextToken();
            }
            if (nextToken.length() == 4) {
                i8.set(1, h(nextToken));
            } else if (nextToken.length() == 2) {
                return b(stringTokenizer, i8, nextToken);
            }
            return a(stringTokenizer, i8, null);
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static Date g(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar i8 = i();
        i8.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return i8.getTime();
        }
        i8.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return i8.getTime();
        }
        String nextToken = stringTokenizer.nextToken();
        if (Character.isDigit(nextToken.charAt(0))) {
            if (nextToken.length() == 5 && nextToken.charAt(2) == 'T') {
                i8.set(5, Integer.parseInt(nextToken.substring(0, 2)));
                return a(stringTokenizer, i8, nextToken.substring(3));
            }
            i8.set(5, Integer.parseInt(nextToken));
            return a(stringTokenizer, i8, null);
        }
        return i8.getTime();
    }

    private static int h(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt < 100) {
            if (parseInt > 30) {
                return parseInt + 2000;
            }
            return parseInt + 1900;
        }
        return parseInt;
    }

    private static GregorianCalendar i() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = f8954d;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    private static Integer j(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = (Integer) f8951a.get(str);
        if (num != null) {
            return num;
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static String k(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = (TimeZone) f8955e.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else if (f8953c.contains(str)) {
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                return str;
            }
        }
    }
}
