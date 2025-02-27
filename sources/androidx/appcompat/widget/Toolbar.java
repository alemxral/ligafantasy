package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    private static final String TAG = "Toolbar";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    MenuBuilder.Callback mMenuBuilderCallback;
    final MenuHostHelper mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static class Api33Impl {
        private Api33Impl() {
        }

        @Nullable
        @DoNotInline
        static OnBackInvokedDispatcher findOnBackInvokedDispatcher(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        static OnBackInvokedCallback newOnBackInvokedCallback(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.T
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        static void tryRegisterOnBackInvokedCallback(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        static void tryUnregisterOnBackInvokedCallback(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ExpandedActionViewMenuPresenter implements MenuPresenter {
        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;

        ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.mCurrentExpandedItem = null;
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = menuItemImpl.getActionView();
            this.mCurrentExpandedItem = menuItemImpl;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.gravity = (toolbar4.mButtonGravity & 112) | GravityCompat.START;
                generateDefaultLayoutParams.mViewType = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public MenuView getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.mMenu;
            if (menuBuilder2 != null && (menuItemImpl = this.mCurrentExpandedItem) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.mMenu = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z8) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(MenuPresenter.Callback callback) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean z8) {
            if (this.mCurrentExpandedItem != null) {
                MenuBuilder menuBuilder = this.mMenu;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.mMenu.getItem(i8) == this.mCurrentExpandedItem) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
            }
        }
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<Toolbar> {
        private int mCollapseContentDescriptionId;
        private int mCollapseIconId;
        private int mContentInsetEndId;
        private int mContentInsetEndWithActionsId;
        private int mContentInsetLeftId;
        private int mContentInsetRightId;
        private int mContentInsetStartId;
        private int mContentInsetStartWithNavigationId;
        private int mLogoDescriptionId;
        private int mLogoId;
        private int mMenuId;
        private int mNavigationContentDescriptionId;
        private int mNavigationIconId;
        private int mPopupThemeId;
        private boolean mPropertiesMapped = false;
        private int mSubtitleId;
        private int mTitleId;
        private int mTitleMarginBottomId;
        private int mTitleMarginEndId;
        private int mTitleMarginStartId;
        private int mTitleMarginTopId;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            int mapObject;
            int mapObject2;
            int mapInt;
            int mapInt2;
            int mapInt3;
            int mapInt4;
            int mapInt5;
            int mapInt6;
            int mapObject3;
            int mapObject4;
            int mapObject5;
            int mapObject6;
            int mapObject7;
            int mapResourceId;
            int mapObject8;
            int mapObject9;
            int mapInt7;
            int mapInt8;
            int mapInt9;
            int mapInt10;
            mapObject = propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
            this.mCollapseContentDescriptionId = mapObject;
            mapObject2 = propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
            this.mCollapseIconId = mapObject2;
            mapInt = propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
            this.mContentInsetEndId = mapInt;
            mapInt2 = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
            this.mContentInsetEndWithActionsId = mapInt2;
            mapInt3 = propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
            this.mContentInsetLeftId = mapInt3;
            mapInt4 = propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
            this.mContentInsetRightId = mapInt4;
            mapInt5 = propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
            this.mContentInsetStartId = mapInt5;
            mapInt6 = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
            this.mContentInsetStartWithNavigationId = mapInt6;
            mapObject3 = propertyMapper.mapObject("logo", R.attr.logo);
            this.mLogoId = mapObject3;
            mapObject4 = propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
            this.mLogoDescriptionId = mapObject4;
            mapObject5 = propertyMapper.mapObject("menu", R.attr.menu);
            this.mMenuId = mapObject5;
            mapObject6 = propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
            this.mNavigationContentDescriptionId = mapObject6;
            mapObject7 = propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
            this.mNavigationIconId = mapObject7;
            mapResourceId = propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
            this.mPopupThemeId = mapResourceId;
            mapObject8 = propertyMapper.mapObject("subtitle", R.attr.subtitle);
            this.mSubtitleId = mapObject8;
            mapObject9 = propertyMapper.mapObject(CampaignEx.JSON_KEY_TITLE, R.attr.title);
            this.mTitleId = mapObject9;
            mapInt7 = propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
            this.mTitleMarginBottomId = mapInt7;
            mapInt8 = propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
            this.mTitleMarginEndId = mapInt8;
            mapInt9 = propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
            this.mTitleMarginStartId = mapInt9;
            mapInt10 = propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
            this.mTitleMarginTopId = mapInt10;
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(@NonNull Toolbar toolbar, @NonNull PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mCollapseContentDescriptionId, toolbar.getCollapseContentDescription());
                propertyReader.readObject(this.mCollapseIconId, toolbar.getCollapseIcon());
                propertyReader.readInt(this.mContentInsetEndId, toolbar.getContentInsetEnd());
                propertyReader.readInt(this.mContentInsetEndWithActionsId, toolbar.getContentInsetEndWithActions());
                propertyReader.readInt(this.mContentInsetLeftId, toolbar.getContentInsetLeft());
                propertyReader.readInt(this.mContentInsetRightId, toolbar.getContentInsetRight());
                propertyReader.readInt(this.mContentInsetStartId, toolbar.getContentInsetStart());
                propertyReader.readInt(this.mContentInsetStartWithNavigationId, toolbar.getContentInsetStartWithNavigation());
                propertyReader.readObject(this.mLogoId, toolbar.getLogo());
                propertyReader.readObject(this.mLogoDescriptionId, toolbar.getLogoDescription());
                propertyReader.readObject(this.mMenuId, toolbar.getMenu());
                propertyReader.readObject(this.mNavigationContentDescriptionId, toolbar.getNavigationContentDescription());
                propertyReader.readObject(this.mNavigationIconId, toolbar.getNavigationIcon());
                propertyReader.readResourceId(this.mPopupThemeId, toolbar.getPopupTheme());
                propertyReader.readObject(this.mSubtitleId, toolbar.getSubtitle());
                propertyReader.readObject(this.mTitleId, toolbar.getTitle());
                propertyReader.readInt(this.mTitleMarginBottomId, toolbar.getTitleMarginBottom());
                propertyReader.readInt(this.mTitleMarginEndId, toolbar.getTitleMarginEnd());
                propertyReader.readInt(this.mTitleMarginStartId, toolbar.getTitleMarginStart());
                propertyReader.readInt(this.mTitleMarginTopId, toolbar.getTitleMarginTop());
                return;
            }
            throw AbstractC1586e.a();
        }
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        int expandedMenuItemId;
        boolean isOverflowOpen;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i8) {
        boolean z8;
        if (getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i8, getLayoutDirection());
        list.clear();
        if (z8) {
            for (int i9 = childCount - 1; i9 >= 0; i9--) {
                View childAt = getChildAt(i9);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z8) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.mViewType = 1;
        if (z8 && this.mExpandedActionView != null) {
            view.setLayoutParams(layoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, layoutParams);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new RtlSpacingHelper();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                    MenuBuilder.Callback callback = Toolbar.this.mMenuBuilderCallback;
                    if (callback != null && callback.onMenuItemSelected(menuBuilder, menuItem)) {
                        return true;
                    }
                    return false;
                }

                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
                    if (!Toolbar.this.mMenuView.isOverflowMenuShowing()) {
                        Toolbar.this.mMenuHostHelper.onPrepareMenu(menuBuilder);
                    }
                    MenuBuilder.Callback callback = Toolbar.this.mMenuBuilderCallback;
                    if (callback != null) {
                        callback.onMenuModeChange(menuBuilder);
                    }
                }
            });
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.END;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.START;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i8) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i8, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    private int getChildTop(View view, int i8) {
        int i9;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i8 > 0) {
            i9 = (measuredHeight - i8) / 2;
        } else {
            i9 = 0;
        }
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity != 48) {
            if (childVerticalGravity != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (i10 < i11) {
                    i10 = i11;
                } else {
                    int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i12 < i13) {
                        i10 = Math.max(0, i10 - (i13 - i12));
                    }
                }
                return paddingTop + i10;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i9;
        }
        return getPaddingTop() - i9;
    }

    private int getChildVerticalGravity(int i8) {
        int i9 = i8 & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            return this.mGravity & 112;
        }
        return i9;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i8 = 0; i8 < menu.size(); i8++) {
            arrayList.add(menu.getItem(i8));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i8 = iArr[0];
        int i9 = iArr[1];
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            View view = list.get(i10);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i8;
            int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i9;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, i13);
            int max3 = Math.max(0, -i12);
            int max4 = Math.max(0, -i13);
            i11 += max + view.getMeasuredWidth() + max2;
            i10++;
            i9 = max4;
            i8 = max3;
        }
        return i11;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() != this && !this.mHiddenViews.contains(view)) {
            return false;
        }
        return true;
    }

    private int layoutChildLeft(View view, int i8, int[] iArr, int i9) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int childTop = getChildTop(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int layoutChildRight(View view, int i8, int[] iArr, int i9) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int childTop = getChildTop(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + max + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i8, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.isOverflowReserved()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    public void collapseActionView() {
        MenuItemImpl menuItemImpl;
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter == null) {
            menuItemImpl = null;
        } else {
            menuItemImpl = expandedActionViewMenuPresenter.mCurrentExpandedItem;
        }
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.START;
            generateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getEnd();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.mContentInsetEndWithActions;
        if (i8 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i8;
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getLeft();
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getRight();
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getStart();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.mContentInsetStartWithNavigation;
        if (i8 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i8;
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder peekMenu;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && (peekMenu = actionMenuView.peekMenu()) != null && peekMenu.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    @Nullable
    @VisibleForTesting
    View getNavButtonView() {
        return this.mNavButtonView;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @Nullable
    @VisibleForTesting
    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @Nullable
    @VisibleForTesting
    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && expandedActionViewMenuPresenter.mCurrentExpandedItem != null) {
            return true;
        }
        return false;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.hideOverflowMenu()) {
            return true;
        }
        return false;
    }

    public void inflateMenu(@MenuRes int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.isOverflowMenuShowPending()) {
            return true;
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.isOverflowMenuShowing()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i8 = 0; i8 < lineCount; i8++) {
            if (layout.getEllipsisCount(i8) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr = this.mTempMargins;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i17 = 0;
        int i18 = !isLayoutRtl ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i8, 0, i9, 0, this.mMaxButtonHeight);
            i10 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i11 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i12 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i8, 0, i9, 0, this.mMaxButtonHeight);
            i10 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i11 = Math.max(i11, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i12 = View.combineMeasuredStates(i12, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i10);
        iArr[isLayoutRtl ? 1 : 0] = Math.max(0, currentContentInsetStart - i10);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i8, max, i9, 0, this.mMaxButtonHeight);
            i13 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i11 = Math.max(i11, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i12 = View.combineMeasuredStates(i12, this.mMenuView.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i13);
        iArr[i18] = Math.max(0, currentContentInsetEnd - i13);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i8, max2, i9, 0, iArr);
            i11 = Math.max(i11, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i12 = View.combineMeasuredStates(i12, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i8, max2, i9, 0, iArr);
            i11 = Math.max(i11, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i12 = View.combineMeasuredStates(i12, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i8, max2, i9, 0, iArr);
                i11 = Math.max(i11, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i20 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i21 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i8, max2 + i21, i9, i20, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i16 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i14 = View.combineMeasuredStates(i12, this.mTitleTextView.getMeasuredState());
            i15 = measuredWidth;
        } else {
            i14 = i12;
            i15 = 0;
            i16 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i15 = Math.max(i15, measureChildCollapseMargins(this.mSubtitleTextView, i8, max2 + i21, i9, i16 + i20, iArr));
            i16 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i14 = View.combineMeasuredStates(i14, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i11, i16);
        int paddingLeft = max2 + i15 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, i14 << 16);
        if (!shouldCollapse()) {
            i17 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuBuilder menuBuilder;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            menuBuilder = actionMenuView.peekMenu();
        } else {
            menuBuilder = null;
        }
        int i8 = savedState.expandedMenuItemId;
        if (i8 != 0 && this.mExpandedMenuPresenter != null && menuBuilder != null && (findItem = menuBuilder.findItem(i8)) != null) {
            findItem.expandActionView();
        }
        if (savedState.isOverflowOpen) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        ensureContentInsets();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        rtlSpacingHelper.setDirection(z8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.mCurrentExpandedItem) != null) {
            savedState.expandedMenuItemId = menuItemImpl.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.mBackInvokedCallbackEnabled != z8) {
            this.mBackInvokedCallbackEnabled = z8;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@StringRes int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseIcon(@DrawableRes int i8) {
        setCollapseIcon(AppCompatResources.getDrawable(getContext(), i8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z8) {
        this.mCollapsible = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i8, int i9) {
        ensureContentInsets();
        this.mContentInsets.setAbsolute(i8, i9);
    }

    public void setContentInsetsRelative(int i8, int i9) {
        ensureContentInsets();
        this.mContentInsets.setRelative(i8, i9);
    }

    public void setLogo(@DrawableRes int i8) {
        setLogo(AppCompatResources.getDrawable(getContext(), i8));
    }

    public void setLogoDescription(@StringRes int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setMenu(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        MenuBuilder peekMenu = this.mMenuView.peekMenu();
        if (peekMenu == menuBuilder) {
            return;
        }
        if (peekMenu != null) {
            peekMenu.removeMenuPresenter(this.mOuterActionMenuPresenter);
            peekMenu.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.setExpandedActionViewsExclusive(true);
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    public void setNavigationContentDescription(@StringRes int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationIcon(@DrawableRes int i8) {
        setNavigationIcon(AppCompatResources.getDrawable(getContext(), i8));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i8) {
        if (this.mPopupTheme != i8) {
            this.mPopupTheme = i8;
            if (i8 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(@StringRes int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i8) {
        this.mSubtitleTextAppearance = i8;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitle(@StringRes int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitleMargin(int i8, int i9, int i10, int i11) {
        this.mTitleMarginStart = i8;
        this.mTitleMarginTop = i9;
        this.mTitleMarginEnd = i10;
        this.mTitleMarginBottom = i11;
        requestLayout();
    }

    public void setTitleMarginBottom(int i8) {
        this.mTitleMarginBottom = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.mTitleMarginEnd = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.mTitleMarginStart = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.mTitleMarginTop = i8;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i8) {
        this.mTitleTextAppearance = i8;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void setTitleTextColor(@ColorInt int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.showOverflowMenu()) {
            return true;
        }
        return false;
    }

    void updateBackInvokedCallbackState() {
        boolean z8;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = Api33Impl.findOnBackInvokedDispatcher(this);
            if (hasExpandedActionView() && findOnBackInvokedDispatcher != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = Api33Impl.newOnBackInvokedCallback(new Runnable() { // from class: androidx.appcompat.widget.Q
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.collapseActionView();
                        }
                    });
                }
                Api33Impl.tryRegisterOnBackInvokedCallback(findOnBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = findOnBackInvokedDispatcher;
                return;
            }
            if (!z8 && (onBackInvokedDispatcher = this.mBackInvokedDispatcher) != null) {
                Api33Impl.tryUnregisterOnBackInvokedCallback(onBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        void copyMarginsFromCompat(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i8, int i9, int i10) {
            super(i8, i9);
            this.mViewType = 0;
            this.gravity = i10;
        }

        public LayoutParams(int i8) {
            this(-2, -1, i8);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.setTooltipText(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.mSubtitleTextAppearance;
                if (i8 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.mTitleTextAppearance;
                if (i8 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.appcompat.widget.S
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (Toolbar.this.mMenuHostHelper.onMenuItemSelected(menuItem)) {
                    return true;
                }
                OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.mOnMenuItemClickListener;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, i8, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = obtainStyledAttributes.getInteger(R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = obtainStyledAttributes.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMargin, 0);
        int i9 = R.styleable.Toolbar_titleMargins;
        dimensionPixelOffset = obtainStyledAttributes.hasValue(i9) ? obtainStyledAttributes.getDimensionPixelOffset(i9, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.setAbsolute(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.mContentInsets.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = obtainStyledAttributes.getText(R.styleable.Toolbar_collapseContentDescription);
        CharSequence text = obtainStyledAttributes.getText(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = obtainStyledAttributes.getText(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(R.styleable.Toolbar_popupTheme, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = obtainStyledAttributes.getText(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = obtainStyledAttributes.getText(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        int i10 = R.styleable.Toolbar_titleTextColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            setTitleTextColor(obtainStyledAttributes.getColorStateList(i10));
        }
        int i11 = R.styleable.Toolbar_subtitleTextColor;
        if (obtainStyledAttributes.hasValue(i11)) {
            setSubtitleTextColor(obtainStyledAttributes.getColorStateList(i11));
        }
        int i12 = R.styleable.Toolbar_menu;
        if (obtainStyledAttributes.hasValue(i12)) {
            inflateMenu(obtainStyledAttributes.getResourceId(i12, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
