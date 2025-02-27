package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class Key {
    public static final String ALPHA = "alpha";
    public static final String CURVEFIT = "curveFit";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String MOTIONPROGRESS = "motionProgress";
    public static final String PIVOT_X = "transformPivotX";
    public static final String PIVOT_Y = "transformPivotY";
    public static final String PROGRESS = "progress";
    public static final String ROTATION = "rotation";
    public static final String ROTATION_X = "rotationX";
    public static final String ROTATION_Y = "rotationY";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITIONEASING = "transitionEasing";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static final String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_VARIES_BY = "waveVariesBy";
    HashMap<String, ConstraintAttribute> mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    String mTargetString;
    protected int mType;

    public Key() {
        int i8 = UNSET;
        this.mFramePosition = i8;
        this.mTargetId = i8;
        this.mTargetString = null;
    }

    public abstract void addValues(HashMap<String, ViewSpline> hashMap);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract Key mo5441clone();

    public Key copy(Key key) {
        this.mFramePosition = key.mFramePosition;
        this.mTargetId = key.mTargetId;
        this.mTargetString = key.mTargetString;
        this.mType = key.mType;
        this.mCustomConstraints = key.mCustomConstraints;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        return this.mFramePosition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void load(Context context, AttributeSet attributeSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matches(String str) {
        String str2 = this.mTargetString;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void setFramePosition(int i8) {
        this.mFramePosition = i8;
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }

    public abstract void setValue(String str, Object obj);

    public Key setViewId(int i8) {
        this.mTargetId = i8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean toBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float toFloat(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int toInt(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }
}
