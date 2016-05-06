package ua.org.jinx.udiary;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import ua.org.jinx.udiary.adapter.TabsFragmentAdapter;

public class TasksActivity extends AppCompatActivity {

    private Toolbar toolbar;
    ViewPager viewPager;
    private TabLayout tablayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefoult);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        initTabs();
        initToolbar();


        tablayout = (TabLayout) findViewById(R.id.tablayout_task);

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_all);

        assert toolbar != null;
        toolbar.setTitle(R.string.tasks);

}

    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.viewPagerTask);
        TabsFragmentAdapter adapter = new TabsFragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tablayout = (TabLayout) findViewById(R.id.tablayout_task);
        tablayout.setupWithViewPager(viewPager);
    }
}
