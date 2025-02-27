package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@RequiresApi(16)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Upsert {
    Class<?> entity() default Object.class;
}
