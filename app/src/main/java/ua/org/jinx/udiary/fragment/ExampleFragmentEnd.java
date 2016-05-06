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
    private static final int LAYOUT_TASK = R.layout.fragment_example;




    public void setContext(Context context) {
        this.context = context;
    }



    public static ExampleFragment getInstance(Context context)
    {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setLayoutTitle(context.getString(R.string.tabs_end));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT_TASK , container , false);

        return view;
    }


}
