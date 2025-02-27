package androidx.compose.ui;

import androidx.compose.runtime.ComposableTargetMarker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@ComposableTargetMarker(description = "UI Composable")
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface UiComposable {
}
