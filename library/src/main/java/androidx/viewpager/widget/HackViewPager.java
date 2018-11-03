package androidx.viewpager.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class HackViewPager extends ViewPager {
    public HackViewPager(@NonNull Context context) {
        super(context);
    }
    
    public HackViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    
    public void setCurrentItem(int item, boolean smoothScroll, int velocity) {
        setCurrentItemInternal(item, smoothScroll, false, velocity);
    }
}
