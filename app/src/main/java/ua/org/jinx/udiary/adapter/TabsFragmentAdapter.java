package ua.org.jinx.udiary.adapter;



import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ua.org.jinx.udiary.R;
import ua.org.jinx.udiary.fragment.AbstractTabFragment;
import ua.org.jinx.udiary.fragment.ExampleFragment;
import ua.org.jinx.udiary.fragment.ExampleFragmentEnd;


public class TabsFragmentAdapter extends FragmentPagerAdapter {

   private Map<Integer , AbstractTabFragment> tabs;
    private Context context;
    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getLAYOUT_TITLE();
    }

    @Override
    public Fragment getItem(int position) {



        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, ExampleFragment.getInstance(context));
        tabs.put(1, ExampleFragmentEnd.getInstance(context));
    }
}
