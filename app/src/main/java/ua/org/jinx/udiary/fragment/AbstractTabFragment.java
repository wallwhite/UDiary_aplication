package ua.org.jinx.udiary.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractTabFragment extends Fragment{
    private  String LAYOUT_TITLE;
    protected View view;
    protected Context context;

    public String getLAYOUT_TITLE() {
        return LAYOUT_TITLE;
    }

    public void setLayoutTitle(String LAYOUT_TITLE) {
        this.LAYOUT_TITLE = LAYOUT_TITLE;
    }
}
