package ua.org.jinx.udiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_home;
    private Toolbar toolbar;
    private DrawerLayout drawerlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppDefoult);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initNavigationView();
        initToolbar();


    }

    private void initToolbar() {
     toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener()
        {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);

        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerlayout, toolbar, R.string.open_text, R.string.close_text);
        drawerlayout.setDrawerListener(toggle);
        //drawerlayout.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                drawerlayout.closeDrawers();
                switch (menuItem.getItemId()) {

                    case R.id.navigation_menu_item_diary:
                        break;
                    case R.id.navigation_menu_item_teachers:
                        Intent intentTeacher = new Intent(Home.this,TeachersActivity.class);
                        startActivity(intentTeacher);
                        break;
                    case R.id.navigation_menu_item_tasks:
                        Intent intentTask = new Intent(Home.this,TasksActivity.class);
                        startActivity(intentTask);
                        break;
                    case R.id.navigation_menu_item_settings:


                        break;


                }

                return true;
            }

        });

    }

}
