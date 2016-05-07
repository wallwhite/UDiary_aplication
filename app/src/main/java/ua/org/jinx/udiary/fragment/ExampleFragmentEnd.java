package ua.org.jinx.udiary.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.org.jinx.udiary.R;

public class ExampleFragmentEnd extends AbstractTabFragment {
    private static final int LAYOUT_TASK1 = R.layout.fragment_done;



    public static ExampleFragmentEnd getInstance(Context context)
    {
        Bundle args = new Bundle();
        ExampleFragmentEnd fragmentEnd = new ExampleFragmentEnd();
        fragmentEnd.setArguments(args);
        fragmentEnd.setContext(context);
        fragmentEnd.setLayoutTitle(context.getString(R.string.tabs_end));
        return fragmentEnd;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT_TASK1 , container , false);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
